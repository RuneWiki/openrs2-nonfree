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

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private static int anInt864;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private static int anInt874;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
	private static boolean aBoolean215;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private static int anInt892;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private static int anInt894;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
	private static boolean aBoolean218;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private static int anInt896;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private static int anInt924;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	public static int anInt928;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private static int anInt929;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private static int anInt930;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private static int anInt939;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private static int anInt947;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private static int anInt964;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Lclient!MDBQGDOL;")
	public static Class1_Sub1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private static int anInt981;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Z")
	private static boolean aBoolean240;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private static int anInt1010;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	public static int anInt1011;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private static int anInt1024;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private static int anInt922 = 18485;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private static int anInt927 = 10;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Z")
	private static boolean aBoolean227 = true;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "B")
	private static byte aByte37 = 2;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[I")
	private static int[] anIntArray251 = new int[99];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private static int anInt975;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Ljava/lang/String;")
	private static String aString23;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private static int anInt989;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private static int anInt990;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
	public static final int[] anIntArray275;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Lclient!CWXRTTYV;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!CWXRTTYV;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!CWXRTTYV;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!CWXRTTYV;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!UUIGNTAD;")
	private Class38 aClass38_2;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_4;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_5;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_6;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_7;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_8;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_9;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_10;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_11;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_12;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_13;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_14;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_8;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!UUQNASSN;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_15;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_16;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_17;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_18;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_19;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_20;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_21;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_22;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_23;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!YIKMTKBL;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Lclient!RYDUASDW;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_10;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array5;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_24;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_25;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_26;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!IUZTBIWV;")
	private Class17 aClass17_27;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "Lclient!TCDQXHKB;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1077;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1078;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private int anInt1080;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1081;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	private int anInt1086;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_11;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_12;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1089;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "Lclient!UCDUMMGN;")
	private Class36_Sub1 aClass36_Sub1_1;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "nk", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_13;

	@OriginalMember(owner = "client!client", name = "ok", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_14;

	@OriginalMember(owner = "client!client", name = "pk", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_15;

	@OriginalMember(owner = "client!client", name = "qk", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_16;

	@OriginalMember(owner = "client!client", name = "rk", descriptor = "Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_17;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[500];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt859 = -1;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt860 = -1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
	private int[] anIntArray212 = new int[9];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt862 = -794;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "B")
	private byte aByte26 = -97;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array4 = new Class1_Sub1_Sub2_Sub4[20];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "B")
	private byte aByte27 = 9;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array5 = new Class1_Sub1_Sub2_Sub4[32];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt871 = -1;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!CMGGUSPR;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(new byte[5000], anInt972);

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[Lclient!IGOBKPZP;")
	private Class1_Sub1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub1_Sub3_Sub1Array1 = new Class1_Sub1_Sub1_Sub3_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	private int[] anIntArray213 = new int[16384];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt875 = -648;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[I")
	private int[] anIntArray214 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt878 = 50;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
	private int[] anIntArray215 = new int[this.anInt878];

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
	private int[] anIntArray216 = new int[this.anInt878];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
	private int[] anIntArray217 = new int[this.anInt878];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
	private int[] anIntArray218 = new int[this.anInt878];

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
	private int[] anIntArray219 = new int[this.anInt878];

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[I")
	private int[] anIntArray220 = new int[this.anInt878];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[I")
	private int[] anIntArray221 = new int[this.anInt878];

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[this.anInt878];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "B")
	private byte aByte28 = 2;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt882 = 1;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "B")
	private byte aByte29 = 25;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "B")
	private byte aByte30 = -98;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
	private volatile boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[I")
	private int[] anIntArray222 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray223 = new int[151];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt885 = 3353893;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt886 = 936;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array6 = new Class1_Sub1_Sub2_Sub4[32];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[I")
	private int[] anIntArray224 = new int[Class9.anInt108];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt893 = 5063219;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "B")
	private byte aByte31 = -98;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private int[] anIntArray225 = new int[50];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Lclient!CMGGUSPR;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = Class1_Sub1_Sub3.method43();

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private int[] anIntArray226 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt902 = 95;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "B")
	private byte aByte32 = -123;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!WCVCMGLX;")
	private Class41 aClass41_10 = new Class41(-388);

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt903 = 2048;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt904 = 2047;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[Lclient!MDBQGDOL;")
	private Class1_Sub1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub1_Sub3_Sub2Array1 = new Class1_Sub1_Sub1_Sub3_Sub2[this.anInt903];

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray227 = new int[this.anInt903];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray228 = new int[this.anInt903];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[Lclient!CMGGUSPR;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt903];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt908 = 78;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "B")
	private byte aByte33 = 67;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
	private int[] anIntArray229 = new int[5];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt919 = -1;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt921 = 2;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
	public int[] anIntArray232 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
	private int[] anIntArray233 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
	private int[] anIntArray234 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private int[] anIntArray235 = new int[500];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray236 = new int[500];

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	private int[] anIntArray237 = new int[500];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray238 = new int[500];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "B")
	private byte aByte34 = 0;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[I")
	private int[] anIntArray239 = new int[Class9.anInt108];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[I")
	private int[] anIntArray240 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private int[] anIntArray241 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!CMGGUSPR;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = Class1_Sub1_Sub3.method43();

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
	private int[] anIntArray242 = new int[256];

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
	private int[] anIntArray243 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray244 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	private int[] anIntArray245 = new int[50];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt942 = 2;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[Lclient!VLOWRGUJ;")
	private Class40[] aClass40Array1 = new Class40[4];

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[I")
	private final int[] anIntArray246 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!CMGGUSPR;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9 = Class1_Sub1_Sub3.method43();

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
	private int[] anIntArray247 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "B")
	private byte aByte35 = -57;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
	private int[] anIntArray248 = new int[5];

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt948 = -1;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt949 = 1;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "B")
	private byte aByte36 = 6;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt960 = -1;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt961 = -1;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt962 = -1;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!WJQTPVDG;")
	private Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt976 = 2301979;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray252 = new int[7];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt977 = -12929;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt982 = 128;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array7 = new Class1_Sub1_Sub2_Sub4[1000];

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt987 = 7;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt991 = 5200;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray254 = new int[200];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray255 = new int[100];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!WCVCMGLX;")
	private Class41 aClass41_11 = new Class41(-388);

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
	private int[] anIntArray256 = new int[100];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt1004 = 5;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt1005 = 3;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt1007 = -1;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt1009 = 1;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray257 = new int[Class9.anInt108];

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt1012 = -1;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[5];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1015 = -1;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "[Lclient!OCPHNIUN;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray258 = new int[5];

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array8 = new Class1_Sub1_Sub2_Sub4[100];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1020 = 859;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1025 = -571;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
	private volatile boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
	private volatile boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "B")
	private byte aByte38 = 73;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1028 = 7759444;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1030 = 31203;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1032 = 2;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1033 = -1;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
	private int[] anIntArray270 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array9 = new Class1_Sub1_Sub2_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray271 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
	private int[] anIntArray272 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private boolean aBoolean255 = true;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "B")
	private byte aByte39 = 2;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private final int anInt1047 = 100;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
	private int[] anIntArray273 = new int[100];

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "B")
	private byte aByte40 = 0;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[Lclient!TPIBHECB;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array10 = new Class1_Sub1_Sub2_Sub4[8];

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "[I")
	private int[] anIntArray274 = new int[33];

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray276 = new int[5];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "Lclient!WCVCMGLX;")
	private Class41 aClass41_12 = new Class41(-388);

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1070 = -685;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1071 = -1;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1075 = 47958;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private int anInt1082 = 424;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private int anInt1083 = -34531;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
	private int anInt1084 = -39880;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1085 = -1;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1087 = 8496;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "[Lclient!JJRYTWDH;")
	public Class20[] aClass20Array1 = new Class20[5];

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1088 = -236;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
	private int anInt1090 = -1;

	@OriginalMember(owner = "client!client", name = "sk", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!client", name = "tk", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "uk", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "vk", descriptor = "[[[Lclient!WCVCMGLX;")
	private Class41[][][] aClass41ArrayArrayArray1 = new Class41[4][104][104];

	@OriginalMember(owner = "client!client", name = "wk", descriptor = "I")
	private int anInt1091 = -1;

	static {
		@Pc(277) int local277 = 0;
		@Pc(279) int local279;
		for (local279 = 0; local279 < 99; local279++) {
			@Pc(284) int local284 = local279 + 1;
			@Pc(297) int local297 = (int) ((double) local284 + Math.pow(2.0D, (double) local284 / 7.0D) * 300.0D);
			local277 += local297;
			anIntArray251[local279] = local277 / 4;
		}
		anInt972 = 536;
		anInt975 = -39668;
		aString23 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray253 = new int[32];
		local277 = 2;
		for (local279 = 0; local279 < 32; local279++) {
			anIntArray253[local279] = local277 - 1;
			local277 += local277;
		}
		anInt989 = 123;
		anInt990 = -370;
		anIntArray275 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private static String method595(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("83078, " + arg0 + ", " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 359);
			if (arg0.length == 5) {
				anInt927 = Integer.parseInt(arg0[0]);
				anInt928 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method710();
				} else if (arg0[2].equals("highmem")) {
					method723();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean227 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean227 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1094 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method574();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)Ljava/lang/String;")
	private static String method642(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(18) int local18 = local4.length() - 3; local18 > 0; local18 -= 3) {
				local4 = local4.substring(0, local18) + "," + local4.substring(local18);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("74524, " + 6 + ", " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private static void method710() {
		try {
			Class35.aBoolean134 = true;
			Class1_Sub1_Sub2_Sub2.aBoolean110 = true;
			aBoolean228 = true;
			Class16.aBoolean66 = true;
			Class48.aBoolean192 = true;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("81107, " + -14359 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BII)Ljava/lang/String;")
	private static String method717(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (aByte37 == 2) {
				@Pc(4) boolean local4 = false;
			} else {
				anInt975 = 398;
			}
			@Pc(12) int local12 = arg2 - arg1;
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
			signlink.reporterror("86973, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(B)V")
	private static void method723() {
		try {
			Class35.aBoolean134 = false;
			Class1_Sub1_Sub2_Sub2.aBoolean110 = false;
			aBoolean228 = false;
			Class16.aBoolean66 = false;
			Class48.aBoolean192 = false;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("70832, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method587(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1101 = arg0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("46178, " + 47889 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)Z")
	private boolean method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass35_1.method426(this.anInt1027, arg0, arg2, arg1);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class48 local43 = Class48.method567(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt804;
					local54 = local43.anInt807;
				} else {
					local51 = local43.anInt807;
					local54 = local43.anInt804;
				}
				@Pc(65) int local65 = local43.anInt797;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], arg0, 2, local54, local51, arg2, 0, local65, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
			} else {
				this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], arg0, 2, 0, 0, arg2, local31, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], local25 + 1, false);
			}
			this.anInt1055 = super.anInt853;
			this.aBoolean213 &= true;
			this.anInt1056 = super.anInt854;
			this.anInt1058 = 2;
			this.anInt1057 = 0;
			return true;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("45482, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;")
	private String method589() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("22966, " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method590() {
		try {
			if (this.anInt867 == 2) {
				this.method679(190, (this.anInt910 - this.anInt999 << 7) + this.anInt913, (this.anInt911 - this.anInt1000 << 7) + this.anInt914, this.anInt912 * 2);
				if (this.anInt859 > -1 && anInt1011 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub4Array6[0].method473(this.anInt859 - 12, this.aByte39, this.anInt860 - 28);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("58701, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method591(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = Class4.aClass4Array1[arg0].anInt16;
			if (local6 != 0) {
				@Pc(14) int local14 = this.anIntArray232[arg0];
				if (local6 == 1) {
					if (local14 == 1) {
						Class1_Sub1_Sub2_Sub2.method344(0.9D);
					}
					if (local14 == 2) {
						Class1_Sub1_Sub2_Sub2.method344(0.8D);
					}
					if (local14 == 3) {
						Class1_Sub1_Sub2_Sub2.method344(0.7D);
					}
					if (local14 == 4) {
						Class1_Sub1_Sub2_Sub2.method344(0.6D);
					}
					Class23.aClass15_3.method184();
					this.aBoolean259 = true;
				}
				if (local6 == 3) {
					@Pc(62) boolean local62 = this.aBoolean223;
					if (local14 == 0) {
						this.method708(0, this.aBoolean223);
						this.aBoolean223 = true;
					}
					if (local14 == 1) {
						this.method708(-400, this.aBoolean223);
						this.aBoolean223 = true;
					}
					if (local14 == 2) {
						this.method708(-800, this.aBoolean223);
						this.aBoolean223 = true;
					}
					if (local14 == 3) {
						this.method708(-1200, this.aBoolean223);
						this.aBoolean223 = true;
					}
					if (local14 == 4) {
						this.aBoolean223 = false;
					}
					if (this.aBoolean223 != local62 && !aBoolean228) {
						if (this.aBoolean223) {
							this.anInt1046 = this.anInt960;
							this.aBoolean255 = true;
							this.aClass36_Sub1_1.method507(2, this.anInt1046);
						} else {
							this.method705();
						}
						this.anInt996 = 0;
					}
				}
				if (local6 == 4) {
					if (local14 == 0) {
						this.aBoolean239 = true;
						this.method587(0);
					}
					if (local14 == 1) {
						this.aBoolean239 = true;
						this.method587(-400);
					}
					if (local14 == 2) {
						this.aBoolean239 = true;
						this.method587(-800);
					}
					if (local14 == 3) {
						this.aBoolean239 = true;
						this.method587(-1200);
					}
					if (local14 == 4) {
						this.aBoolean239 = false;
					}
				}
				if (local6 == 5) {
					this.anInt943 = local14;
				}
				if (local6 == 6) {
					this.anInt1003 = local14;
				}
				if (local6 == 8) {
					this.anInt954 = local14;
					this.aBoolean256 = true;
				}
				if (local6 == 9) {
					this.anInt1045 = local14;
				}
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("85402, " + -49 + ", " + arg0 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method592() {
		try {
			if (aBoolean228 && this.anInt944 == 2 && Class16.anInt299 != this.anInt1027) {
				this.method608(null, "Loading - please wait.");
				this.anInt944 = 1;
				this.aLong33 = System.currentTimeMillis();
			}
			if (this.anInt944 == 1) {
				@Pc(39) int local39 = this.method593(this.aBoolean232);
				if (local39 != 0 && System.currentTimeMillis() - this.aLong33 > 360000L) {
					signlink.reporterror(this.aString24 + " glcfb " + this.aLong29 + "," + local39 + "," + aBoolean228 + "," + this.aClass20Array1[0] + "," + this.aClass36_Sub1_1.method497() + "," + this.anInt1027 + "," + this.anInt970 + "," + this.anInt971);
					this.aLong33 = System.currentTimeMillis();
				}
			}
			if (this.anInt944 == 2 && this.anInt1027 != this.anInt1012) {
				this.anInt1012 = this.anInt1027;
				this.method662(this.anInt1027);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("50974, " + 44331 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)I")
	private int method593(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray268[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray269[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray6[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray267[local41] >> 8) * 64 - this.anInt999;
					@Pc(74) int local74 = (this.anIntArray267[local41] & 0xFF) * 64 - this.anInt1000;
					if (this.aBoolean249) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class16.method212(local74, local48, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean231) {
				return -4;
			} else {
				this.anInt944 = 2;
				if (arg0) {
					this.aBoolean232 = !this.aBoolean232;
				}
				Class16.anInt299 = this.anInt1027;
				this.method609();
				this.aClass1_Sub1_Sub3_9.method44(55, this.anInt902);
				return 0;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("49654, " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CMGGUSPR;BI)V")
	private void method594(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method66(8);
			@Pc(20) int local20;
			if (local6 < this.anInt905) {
				for (local20 = local6; local20 < this.anInt905; local20++) {
					this.anIntArray234[this.anInt923++] = this.anIntArray227[local20];
				}
			}
			if (local6 > this.anInt905) {
				signlink.reporterror(this.aString24 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt905 = 0;
			for (local20 = 0; local20 < local6; local20++) {
				@Pc(72) int local72 = this.anIntArray227[local20];
				@Pc(77) Class1_Sub1_Sub1_Sub3_Sub2 local77 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local72];
				@Pc(82) int local82 = arg0.method66(1);
				if (local82 == 0) {
					this.anIntArray227[this.anInt905++] = local72;
					local77.anInt429 = anInt1011;
				} else {
					@Pc(105) int local105 = arg0.method66(2);
					if (local105 == 0) {
						this.anIntArray227[this.anInt905++] = local72;
						local77.anInt429 = anInt1011;
						this.anIntArray228[this.anInt906++] = local72;
					} else {
						@Pc(156) int local156;
						@Pc(166) int local166;
						if (local105 == 1) {
							this.anIntArray227[this.anInt905++] = local72;
							local77.anInt429 = anInt1011;
							local156 = arg0.method66(3);
							local77.method262(local156, false, 796);
							local166 = arg0.method66(1);
							if (local166 == 1) {
								this.anIntArray228[this.anInt906++] = local72;
							}
						} else if (local105 == 2) {
							this.anIntArray227[this.anInt905++] = local72;
							local77.anInt429 = anInt1011;
							local156 = arg0.method66(3);
							local77.method262(local156, true, 796);
							local166 = arg0.method66(3);
							local77.method262(local166, true, 796);
							@Pc(224) int local224 = arg0.method66(1);
							if (local224 == 1) {
								this.anIntArray228[this.anInt906++] = local72;
							}
						} else if (local105 == 3) {
							this.anIntArray234[this.anInt923++] = local72;
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("23771, " + arg0 + ", " + -75 + ", " + arg1 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method596() {
		try {
			this.aClass17_25.method229();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt883 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub3_4.aByteArray12;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray170;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub4_10.method477(this.anInt983, 33, this.anIntArray274, 256, this.anIntArray270, 25, 33, 0, 0, 25);
				this.aClass17_26.method229();
				Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
			} else {
				@Pc(67) int local67 = this.anInt983 + this.anInt941 & 0x7FF;
				@Pc(74) int local74 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 / 32;
				this.aClass1_Sub1_Sub2_Sub4_7.method477(local67, 146, this.anIntArray223, this.anInt1008 + 256, this.anIntArray244, local18, 151, 5, 25, local74);
				this.aClass1_Sub1_Sub2_Sub4_10.method477(this.anInt983, 33, this.anIntArray274, 256, this.anIntArray270, 25, 33, 0, 0, 25);
				for (local20 = 0; local20 < this.anInt925; local20++) {
					local74 = this.anIntArray240[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 / 32;
					local18 = this.anIntArray241[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 / 32;
					this.method703(local74, local18, this.aClass1_Sub1_Sub2_Sub4Array7[local20]);
				}
				@Pc(169) int local169;
				for (@Pc(165) int local165 = 0; local165 < 104; local165++) {
					for (local169 = 0; local169 < 104; local169++) {
						@Pc(181) Class41 local181 = this.aClass41ArrayArrayArray1[this.anInt1027][local165][local169];
						if (local181 != null) {
							local74 = local165 * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 / 32;
							local18 = local169 * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 / 32;
							this.method703(local74, local18, this.aClass1_Sub1_Sub2_Sub4_13);
						}
					}
				}
				for (local169 = 0; local169 < this.anInt873; local169++) {
					@Pc(232) Class1_Sub1_Sub1_Sub3_Sub1 local232 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray213[local169]];
					if (local232 != null && local232.method264()) {
						@Pc(241) Class37 local241 = local232.aClass37_1;
						if (local241.anIntArray172 != null) {
							local241 = local241.method481();
						}
						if (local241 != null && local241.aBoolean152 && local241.aBoolean149) {
							local74 = local232.anInt424 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 / 32;
							local18 = local232.anInt425 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 / 32;
							this.method703(local74, local18, this.aClass1_Sub1_Sub2_Sub4_14);
						}
					}
				}
				@Pc(300) Class1_Sub1_Sub1_Sub3_Sub2 local300;
				for (@Pc(290) int local290 = 0; local290 < this.anInt905; local290++) {
					local300 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray227[local290]];
					if (local300 != null && local300.method264()) {
						local74 = local300.anInt424 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 / 32;
						local18 = local300.anInt425 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 / 32;
						@Pc(328) boolean local328 = false;
						@Pc(332) long local332 = Class49.method568(local300.aString7);
						for (@Pc(334) int local334 = 0; local334 < this.anInt1072; local334++) {
							if (local332 == this.aLongArray3[local334] && this.anIntArray254[local334] != 0) {
								local328 = true;
								break;
							}
						}
						@Pc(359) boolean local359 = false;
						if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt447 != 0 && local300.anInt447 != 0 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt447 == local300.anInt447) {
							local359 = true;
						}
						if (local328) {
							this.method703(local74, local18, this.aClass1_Sub1_Sub2_Sub4_16);
						} else if (local359) {
							this.method703(local74, local18, this.aClass1_Sub1_Sub2_Sub4_17);
						} else {
							this.method703(local74, local18, this.aClass1_Sub1_Sub2_Sub4_15);
						}
					}
				}
				if (this.anInt867 != 0 && anInt1011 % 20 < 10) {
					if (this.anInt867 == 1 && this.anInt918 >= 0 && this.anInt918 < this.aClass1_Sub1_Sub1_Sub3_Sub1Array1.length) {
						@Pc(437) Class1_Sub1_Sub1_Sub3_Sub1 local437 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anInt918];
						if (local437 != null) {
							local74 = local437.anInt424 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 / 32;
							local18 = local437.anInt425 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 / 32;
							this.method637(local18, this.aClass1_Sub1_Sub2_Sub4_6, local74);
						}
					}
					if (this.anInt867 == 2) {
						local74 = (this.anInt910 - this.anInt999) * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 / 32;
						local18 = (this.anInt911 - this.anInt1000) * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 / 32;
						this.method637(local18, this.aClass1_Sub1_Sub2_Sub4_6, local74);
					}
					if (this.anInt867 == 10 && this.anInt868 >= 0 && this.anInt868 < this.aClass1_Sub1_Sub1_Sub3_Sub2Array1.length) {
						local300 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anInt868];
						if (local300 != null) {
							local74 = local300.anInt424 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 / 32;
							local18 = local300.anInt425 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 / 32;
							this.method637(local18, this.aClass1_Sub1_Sub2_Sub4_6, local74);
						}
					}
				}
				if (this.anInt935 != 0) {
					local74 = this.anInt935 * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 / 32;
					local18 = this.anInt936 * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 / 32;
					this.method703(local74, local18, this.aClass1_Sub1_Sub2_Sub4_5);
				}
				Class1_Sub1_Sub2.method461(3, 97, 3, 16777215, 78);
				this.aClass17_26.method229();
				Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
			}
		} catch (@Pc(605) RuntimeException local605) {
			signlink.reporterror("46176, " + -32 + ", " + local605.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method583() {
		try {
			this.aBoolean259 = true;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("67759, " + false + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt927 = Integer.parseInt(this.getParameter("nodeid"));
		anInt928 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method710();
		} else {
			method723();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean227 = false;
		} else {
			aBoolean227 = true;
		}
		this.method575();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method597() {
		try {
			for (@Pc(4) Class1_Sub2 local4 = (Class1_Sub2) this.aClass41_11.method534(); local4 != null; local4 = (Class1_Sub2) this.aClass41_11.method536()) {
				if (local4.anInt180 == -1) {
					local4.anInt179 = 0;
					this.method628(local4);
				} else {
					local4.method552();
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("71395, " + 936 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method598() {
		try {
			if (this.anInt944 == 2) {
				for (@Pc(21) Class1_Sub2 local21 = (Class1_Sub2) this.aClass41_11.method534(); local21 != null; local21 = (Class1_Sub2) this.aClass41_11.method536()) {
					if (local21.anInt180 > 0) {
						local21.anInt180--;
					}
					if (local21.anInt180 != 0) {
						if (local21.anInt179 > 0) {
							local21.anInt179--;
						}
						if (local21.anInt179 == 0 && local21.anInt189 >= 1 && local21.anInt190 >= 1 && local21.anInt189 <= 102 && local21.anInt190 <= 102 && (local21.anInt184 < 0 || Class16.method226(local21.anInt186, local21.anInt184))) {
							this.method634(local21.anInt184, local21.anInt185, local21.anInt186, local21.anInt188, local21.anInt189, local21.anInt190, local21.anInt187);
							local21.anInt179 = -1;
							if (local21.anInt184 == local21.anInt181 && local21.anInt181 == -1) {
								local21.method552();
							} else if (local21.anInt184 == local21.anInt181 && local21.anInt185 == local21.anInt182 && local21.anInt186 == local21.anInt183) {
								local21.method552();
							}
						}
					} else if (local21.anInt181 < 0 || Class16.method226(local21.anInt183, local21.anInt181)) {
						this.method634(local21.anInt181, local21.anInt182, local21.anInt183, local21.anInt188, local21.anInt189, local21.anInt190, local21.anInt187);
						local21.method552();
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("90314, " + 39457 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!CMGGUSPR;)V")
	private void method599(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method65();
			@Pc(14) int local14 = arg1.method66(1);
			if (local14 != 0) {
				@Pc(22) int local22 = arg1.method66(2);
				if (local22 == 0) {
					this.anIntArray228[this.anInt906++] = this.anInt904;
				} else {
					@Pc(45) int local45;
					@Pc(55) int local55;
					if (local22 == 1) {
						local45 = arg1.method66(3);
						aClass1_Sub1_Sub1_Sub3_Sub2_1.method262(local45, false, 796);
						local55 = arg1.method66(1);
						if (local55 == 1) {
							this.anIntArray228[this.anInt906++] = this.anInt904;
						}
					} else {
						@Pc(99) int local99;
						if (local22 == 2) {
							local45 = arg1.method66(3);
							aClass1_Sub1_Sub1_Sub3_Sub2_1.method262(local45, true, 796);
							local55 = arg1.method66(3);
							aClass1_Sub1_Sub1_Sub3_Sub2_1.method262(local55, true, 796);
							local99 = arg1.method66(1);
							if (local99 == 1) {
								this.anIntArray228[this.anInt906++] = this.anInt904;
							}
						} else if (local22 == 3) {
							this.anInt1027 = arg1.method66(2);
							local45 = arg1.method66(1);
							if (local45 == 1) {
								this.anIntArray228[this.anInt906++] = this.anInt904;
							}
							local55 = arg1.method66(7);
							local99 = arg1.method66(1);
							@Pc(159) int local159 = arg1.method66(7);
							aClass1_Sub1_Sub1_Sub3_Sub2_1.method265(local99 == 1, local55, local159);
						}
					}
				}
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("75508, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!WJQTPVDG;I)I")
	private int method600(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1) {
		try {
			if (this.anInt991 != 5200) {
				return this.anInt946;
			} else if (arg1.anIntArrayArray21 == null || arg0 >= arg1.anIntArrayArray21.length) {
				return -2;
			} else {
				try {
					@Pc(23) int[] local23 = arg1.anIntArrayArray21[arg0];
					@Pc(25) int local25 = 0;
					@Pc(27) int local27 = 0;
					@Pc(29) byte local29 = 0;
					while (true) {
						@Pc(34) int local34 = local23[local27++];
						@Pc(36) int local36 = 0;
						@Pc(38) byte local38 = 0;
						if (local34 == 0) {
							return local25;
						}
						if (local34 == 1) {
							local36 = this.anIntArray239[local23[local27++]];
						}
						if (local34 == 2) {
							local36 = this.anIntArray257[local23[local27++]];
						}
						if (local34 == 3) {
							local36 = this.anIntArray224[local23[local27++]];
						}
						@Pc(84) Class44 local84;
						@Pc(89) int local89;
						@Pc(102) int local102;
						if (local34 == 4) {
							local84 = Class44.method544(local23[local27++]);
							local89 = local23[local27++];
							if (local89 >= 0 && local89 < Class23.anInt362 && (!Class23.method248(local89).aBoolean76 || aBoolean227)) {
								for (local102 = 0; local102 < local84.anIntArray192.length; local102++) {
									if (local84.anIntArray192[local102] == local89 + 1) {
										local36 += local84.anIntArray193[local102];
									}
								}
							}
						}
						if (local34 == 5) {
							local36 = this.anIntArray232[local23[local27++]];
						}
						if (local34 == 6) {
							local36 = anIntArray251[this.anIntArray257[local23[local27++]] - 1];
						}
						if (local34 == 7) {
							local36 = this.anIntArray232[local23[local27++]] * 100 / 46875;
						}
						if (local34 == 8) {
							local36 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt450;
						}
						@Pc(177) int local177;
						if (local34 == 9) {
							for (local177 = 0; local177 < Class9.anInt108; local177++) {
								if (Class9.aBooleanArray3[local177]) {
									local36 += this.anIntArray257[local177];
								}
							}
						}
						if (local34 == 10) {
							local84 = Class44.method544(local23[local27++]);
							local89 = local23[local27++] + 1;
							if (local89 >= 0 && local89 < Class23.anInt362 && (!Class23.method248(local89).aBoolean76 || aBoolean227)) {
								for (local102 = 0; local102 < local84.anIntArray192.length; local102++) {
									if (local84.anIntArray192[local102] == local89) {
										local36 = 999999999;
										break;
									}
								}
							}
						}
						if (local34 == 11) {
							local36 = this.anInt863;
						}
						if (local34 == 12) {
							local36 = this.anInt973;
						}
						if (local34 == 13) {
							local177 = this.anIntArray232[local23[local27++]];
							local89 = local23[local27++];
							local36 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
						}
						if (local34 == 14) {
							local177 = local23[local27++];
							@Pc(291) Class30 local291 = Class30.aClass30Array1[local177];
							local102 = local291.anInt576;
							@Pc(297) int local297 = local291.anInt577;
							@Pc(300) int local300 = local291.anInt578;
							@Pc(306) int local306 = anIntArray253[local300 - local297];
							local36 = this.anIntArray232[local102] >> local297 & local306;
						}
						if (local34 == 15) {
							local38 = 1;
						}
						if (local34 == 16) {
							local38 = 2;
						}
						if (local34 == 17) {
							local38 = 3;
						}
						if (local34 == 18) {
							local36 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 >> 7) + this.anInt999;
						}
						if (local34 == 19) {
							local36 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 >> 7) + this.anInt1000;
						}
						if (local34 == 20) {
							local36 = local23[local27++];
						}
						if (local38 == 0) {
							if (local29 == 0) {
								local25 += local36;
							}
							if (local29 == 1) {
								local25 -= local36;
							}
							if (local29 == 2 && local36 != 0) {
								local25 /= local36;
							}
							if (local29 == 3) {
								local25 *= local36;
							}
							local29 = 0;
						} else {
							local29 = local38;
						}
					}
				} catch (@Pc(399) Exception local399) {
					return -1;
				}
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("60719, " + arg0 + ", " + arg1 + ", " + 5200 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WJQTPVDG;Z)Z")
	private boolean method601(@OriginalArg(0) Class44 arg0) {
		try {
			if (arg0.anIntArray189 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < arg0.anIntArray189.length; local11++) {
				@Pc(19) int local19 = this.method600(local11, arg0);
				@Pc(24) int local24 = arg0.anIntArray191[local11];
				if (arg0.anIntArray189[local11] == 2) {
					if (local19 >= local24) {
						return false;
					}
				} else if (arg0.anIntArray189[local11] == 3) {
					if (local19 <= local24) {
						return false;
					}
				} else if (arg0.anIntArray189[local11] == 4) {
					if (local19 == local24) {
						return false;
					}
				} else if (local19 != local24) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("99338, " + arg0 + ", " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method602() {
		try {
			this.anInt870++;
			this.method702(true);
			this.method650(true);
			this.method702(false);
			this.method650(false);
			this.method670();
			this.method605();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean226) {
				local35 = this.anInt982;
				if (this.anInt861 / 256 > local35) {
					local35 = this.anInt861 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray248[4] + 128 > local35) {
					local35 = this.anIntArray248[4] + 128;
				}
				local74 = this.anInt983 + this.anInt881 & 0x7FF;
				this.method613(this.anInt1021, local35 * 3 + 600, local35, this.method611(aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425, this.anInt1027, aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424) - 50, this.anInt1022, local74);
			}
			if (this.aBoolean226) {
				local35 = this.method713();
			} else {
				local35 = this.method712();
			}
			local74 = this.anInt887;
			@Pc(118) int local118 = this.anInt888;
			@Pc(121) int local121 = this.anInt889;
			@Pc(124) int local124 = this.anInt890;
			@Pc(127) int local127 = this.anInt891;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray12[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray229[local129] * 2 + 1) - (double) this.anIntArray229[local129] + Math.sin((double) this.anIntArray258[local129] * ((double) this.anIntArray233[local129] / 100.0D)) * (double) this.anIntArray248[local129]);
					if (local129 == 0) {
						this.anInt887 += local176;
					}
					if (local129 == 1) {
						this.anInt888 += local176;
					}
					if (local129 == 2) {
						this.anInt889 += local176;
					}
					if (local129 == 3) {
						this.anInt891 = this.anInt891 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt890 += local176;
						if (this.anInt890 < 128) {
							this.anInt890 = 128;
						}
						if (this.anInt890 > 383) {
							this.anInt890 = 383;
						}
					}
				}
			}
			local176 = Class1_Sub1_Sub2_Sub2.anInt506;
			Class1_Sub1_Sub1_Sub2.aBoolean47 = true;
			Class1_Sub1_Sub1_Sub2.anInt149 = 0;
			Class1_Sub1_Sub1_Sub2.anInt147 = super.anInt847 - 4;
			Class1_Sub1_Sub1_Sub2.anInt148 = super.anInt848 - 4;
			Class1_Sub1_Sub2.method459();
			this.aClass35_1.method435(this.anInt890, this.anInt887, this.anInt889, local35, this.anInt888, this.anInt891);
			this.aClass35_1.method410(993);
			this.method720();
			this.method590();
			this.method646(local176);
			this.method669((byte) 4);
			this.aClass17_26.method230(4, 4, super.aGraphics2);
			this.anInt887 = local74;
			this.anInt888 = local118;
			this.anInt889 = local121;
			this.anInt890 = local124;
			this.anInt891 = local127;
		} catch (@Pc(319) RuntimeException local319) {
			signlink.reporterror("63593, " + 20489 + ", " + local319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)V")
	private void method603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
				if (this.aStringArray13[local5] != null) {
					@Pc(17) int local17 = this.anIntArray256[local5];
					@Pc(28) int local28 = this.anInt879 + 70 + 4 - local3 * 14;
					if (local28 < -20) {
						break;
					}
					@Pc(36) String local36 = this.aStringArray12[local5];
					if (local36 != null && local36.startsWith("@cr1@")) {
						local36 = local36.substring(5);
					}
					if (local36 != null && local36.startsWith("@cr2@")) {
						local36 = local36.substring(5);
					}
					if (local17 == 0) {
						local3++;
					}
					if ((local17 == 1 || local17 == 2) && (local17 == 1 || this.anInt926 == 0 || this.anInt926 == 1 && this.method667(local36))) {
						if (arg1 > local28 - 14 && arg1 <= local28 && !local36.equals(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString7)) {
							if (this.anInt1081 >= 1) {
								this.aStringArray8[this.anInt986] = "Report abuse @whi@" + local36;
								this.anIntArray237[this.anInt986] = 641;
								this.anInt986++;
							}
							this.aStringArray8[this.anInt986] = "Add ignore @whi@" + local36;
							this.anIntArray237[this.anInt986] = 895;
							this.anInt986++;
							this.aStringArray8[this.anInt986] = "Add friend @whi@" + local36;
							this.anIntArray237[this.anInt986] = 166;
							this.anInt986++;
						}
						local3++;
					}
					if ((local17 == 3 || local17 == 7) && this.anInt954 == 0 && (local17 == 7 || this.anInt1050 == 0 || this.anInt1050 == 1 && this.method667(local36))) {
						if (arg1 > local28 - 14 && arg1 <= local28) {
							if (this.anInt1081 >= 1) {
								this.aStringArray8[this.anInt986] = "Report abuse @whi@" + local36;
								this.anIntArray237[this.anInt986] = 641;
								this.anInt986++;
							}
							this.aStringArray8[this.anInt986] = "Add ignore @whi@" + local36;
							this.anIntArray237[this.anInt986] = 895;
							this.anInt986++;
							this.aStringArray8[this.anInt986] = "Add friend @whi@" + local36;
							this.anIntArray237[this.anInt986] = 166;
							this.anInt986++;
						}
						local3++;
					}
					if (local17 == 4 && (this.anInt895 == 0 || this.anInt895 == 1 && this.method667(local36))) {
						if (arg1 > local28 - 14 && arg1 <= local28) {
							this.aStringArray8[this.anInt986] = "Accept trade @whi@" + local36;
							this.anIntArray237[this.anInt986] = 57;
							this.anInt986++;
						}
						local3++;
					}
					if ((local17 == 5 || local17 == 6) && this.anInt954 == 0 && this.anInt1050 < 2) {
						local3++;
					}
					if (local17 == 8 && (this.anInt895 == 0 || this.anInt895 == 1 && this.method667(local36))) {
						if (arg1 > local28 - 14 && arg1 <= local28) {
							this.aStringArray8[this.anInt986] = "Accept challenge @whi@" + local36;
							this.anIntArray237[this.anInt986] = 894;
							this.anInt986++;
						}
						local3++;
					}
				}
			}
		} catch (@Pc(411) RuntimeException local411) {
			signlink.reporterror("17353, " + 111 + ", " + arg0 + ", " + arg1 + ", " + local411.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MDBQGDOL;IBI)V")
	private void method604(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != aClass1_Sub1_Sub1_Sub3_Sub2_1 && this.anInt986 < 400) {
				@Pc(35) String local35;
				if (arg1.anInt448 == 0) {
					local35 = arg1.aString7 + method717((byte) 2, arg1.anInt450, aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt450) + " (level-" + arg1.anInt450 + ")";
				} else {
					local35 = arg1.aString7 + " (skill-" + arg1.anInt448 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt931 == 1) {
					this.aStringArray8[this.anInt986] = "Use " + this.aString18 + " with @whi@" + local35;
					this.anIntArray237[this.anInt986] = 508;
					this.anIntArray238[this.anInt986] = arg2;
					this.anIntArray235[this.anInt986] = arg4;
					this.anIntArray236[this.anInt986] = arg0;
					this.anInt986++;
				} else if (this.anInt950 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray14[local165] != null) {
							this.aStringArray8[this.anInt986] = this.aStringArray14[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray14[local165].equalsIgnoreCase("attack")) {
								if (arg1.anInt450 > aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt450) {
									local192 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt447 != 0 && arg1.anInt447 != 0) {
									if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt447 == arg1.anInt447) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray11[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray237[this.anInt986] = local192 + 870;
							}
							if (local165 == 1) {
								this.anIntArray237[this.anInt986] = local192 + 992;
							}
							if (local165 == 2) {
								this.anIntArray237[this.anInt986] = local192 + 913;
							}
							if (local165 == 3) {
								this.anIntArray237[this.anInt986] = local192 + 155;
							}
							if (local165 == 4) {
								this.anIntArray237[this.anInt986] = local192 + 946;
							}
							this.anIntArray238[this.anInt986] = arg2;
							this.anIntArray235[this.anInt986] = arg4;
							this.anIntArray236[this.anInt986] = arg0;
							this.anInt986++;
						}
					}
				} else if ((this.anInt952 & 0x8) == 8) {
					this.aStringArray8[this.anInt986] = this.aString21 + " @whi@" + local35;
					this.anIntArray237[this.anInt986] = 306;
					this.anIntArray238[this.anInt986] = arg2;
					this.anIntArray235[this.anInt986] = arg4;
					this.anIntArray236[this.anInt986] = arg0;
					this.anInt986++;
				}
				for (local165 = 0; local165 < this.anInt986; local165++) {
					if (this.anIntArray237[local165] == 158) {
						this.aStringArray8[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
				@Pc(346) boolean local346 = false;
			}
		} catch (@Pc(354) RuntimeException local354) {
			signlink.reporterror("24452, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local354.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method605() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub6 local6 = (Class1_Sub1_Sub1_Sub6) this.aClass41_10.method534(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub6) this.aClass41_10.method536()) {
				if (local6.anInt786 != this.anInt1027 || local6.aBoolean187) {
					local6.method552();
				} else if (anInt1011 >= local6.anInt785) {
					local6.method556(this.anInt917);
					if (local6.aBoolean187) {
						local6.method552();
					} else {
						this.aClass35_1.method407(local6, local6.anInt786, local6.anInt788, false, local6.anInt787, 0, -1, 60, local6.anInt789);
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("71068, " + false + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method606() {
		try {
			Class48.aClass15_8.method184();
			Class48.aClass15_9.method184();
			Class37.aClass15_5.method184();
			Class23.aClass15_2.method184();
			Class23.aClass15_3.method184();
			Class1_Sub1_Sub1_Sub3_Sub2.aClass15_4.method184();
			Class18.aClass15_1.method184();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("97110, " + -417 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method607() {
		try {
			try {
				if (this.aClass39_1 != null) {
					this.aClass39_1.method513();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass39_1 = null;
			this.aBoolean213 = false;
			this.anInt865 = 0;
			this.aString24 = "";
			this.aString25 = "";
			this.method606();
			this.aClass35_1.method396();
			for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
				this.aClass40Array1[local35].method519();
			}
			System.gc();
			this.method705();
			this.anInt960 = -1;
			this.anInt1046 = -1;
			this.anInt996 = 0;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("85694, " + 24238 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method608(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(17) int local17;
			if (this.aClass17_26 != null) {
				this.aClass17_26.method229();
				Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
				local17 = 151;
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass1_Sub1_Sub2_Sub1_3.method107(0, 257, local17, arg1);
				this.aClass1_Sub1_Sub2_Sub1_3.method107(16777215, 256, local17 - 1, arg1);
				local17 += 15;
				if (arg0 != null) {
					this.aClass1_Sub1_Sub2_Sub1_3.method107(0, 257, local17, arg0);
					this.aClass1_Sub1_Sub2_Sub1_3.method107(16777215, 256, local17 - 1, arg0);
				}
				this.aClass17_26.method230(4, 4, super.aGraphics2);
			} else if (super.aClass17_2 != null) {
				super.aClass17_2.method229();
				Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray266;
				local17 = 251;
				Class1_Sub1_Sub2.method461(300, 233, 50, 0, 221);
				Class1_Sub1_Sub2.method462(50, 300, 16777215, 233, this.anInt1020, 221);
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass1_Sub1_Sub2_Sub1_3.method107(0, 383, local17, arg1);
				this.aClass1_Sub1_Sub2_Sub1_3.method107(16777215, 382, local17 - 1, arg1);
				local17 += 15;
				if (arg0 != null) {
					this.aClass1_Sub1_Sub2_Sub1_3.method107(0, 383, local17, arg0);
					this.aClass1_Sub1_Sub2_Sub1_3.method107(16777215, 382, local17 - 1, arg0);
				}
				super.aClass17_2.method230(0, 0, super.aGraphics2);
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("92273, " + arg0 + ", " + 1912 + ", " + arg1 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method609() {
		try {
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(44) int local44;
			@Pc(48) int local48;
			@Pc(97) int local97;
			@Pc(111) int local111;
			@Pc(123) int local123;
			@Pc(182) int local182;
			try {
				this.anInt1012 = -1;
				this.aClass41_10.method538();
				this.aClass41_12.method538();
				Class1_Sub1_Sub2_Sub2.method338();
				this.method606();
				this.aClass35_1.method396();
				System.gc();
				for (local27 = 0; local27 < 4; local27++) {
					this.aClass40Array1[local27].method519();
				}
				for (local40 = 0; local40 < 4; local40++) {
					for (local44 = 0; local44 < 104; local44++) {
						for (local48 = 0; local48 < 104; local48++) {
							this.aByteArrayArrayArray8[local40][local44][local48] = 0;
						}
					}
				}
				@Pc(82) Class16 local82 = new Class16(104, this.aByteArrayArrayArray8, this.anIntArrayArrayArray8, 948, 104);
				local48 = this.aByteArrayArray5.length;
				this.aClass1_Sub1_Sub3_9.method44(21, this.anInt902);
				@Pc(245) int local245;
				@Pc(233) int local233;
				if (!this.aBoolean249) {
					@Pc(128) byte[] local128;
					for (local97 = 0; local97 < local48; local97++) {
						local111 = (this.anIntArray267[local97] >> 8) * 64 - this.anInt999;
						local123 = (this.anIntArray267[local97] & 0xFF) * 64 - this.anInt1000;
						local128 = this.aByteArrayArray5[local97];
						if (local128 != null) {
							local82.method222(this.aClass40Array1, local111, local123, (this.anInt970 - 6) * 8, local128, (this.anInt971 - 6) * 8);
						}
					}
					for (local111 = 0; local111 < local48; local111++) {
						local123 = (this.anIntArray267[local111] >> 8) * 64 - this.anInt999;
						local182 = (this.anIntArray267[local111] & 0xFF) * 64 - this.anInt1000;
						@Pc(187) byte[] local187 = this.aByteArrayArray5[local111];
						if (local187 == null && this.anInt971 < 800) {
							local82.method223(64, 64, local123, local182);
						}
					}
					this.aClass1_Sub1_Sub3_9.method44(21, this.anInt902);
					for (local123 = 0; local123 < local48; local123++) {
						local128 = this.aByteArrayArray6[local123];
						if (local128 != null) {
							local233 = (this.anIntArray267[local123] >> 8) * 64 - this.anInt999;
							local245 = (this.anIntArray267[local123] & 0xFF) * 64 - this.anInt1000;
							local82.method218(local233, local245, this.aClass35_1, this.aClass40Array1, local128);
						}
					}
				}
				if (this.aBoolean249) {
					local97 = 0;
					label254: while (true) {
						@Pc(300) int local300;
						@Pc(306) int local306;
						@Pc(312) int local312;
						@Pc(322) int local322;
						@Pc(324) int local324;
						if (local97 >= 4) {
							for (local111 = 0; local111 < 13; local111++) {
								for (local123 = 0; local123 < 13; local123++) {
									local182 = this.anIntArrayArrayArray7[0][local111][local123];
									if (local182 == -1) {
										local82.method223(8, 8, local111 * 8, local123 * 8);
									}
								}
							}
							this.aClass1_Sub1_Sub3_9.method44(21, this.anInt902);
							local123 = 0;
							while (true) {
								if (local123 >= 4) {
									break label254;
								}
								for (local182 = 0; local182 < 13; local182++) {
									for (local233 = 0; local233 < 13; local233++) {
										local245 = this.anIntArrayArrayArray7[local123][local182][local233];
										if (local245 != -1) {
											local300 = local245 >> 24 & 0x3;
											local306 = local245 >> 1 & 0x3;
											local312 = local245 >> 14 & 0x3FF;
											local322 = local245 >> 3 & 0x7FF;
											local324 = (local312 / 8 << 8) + local322 / 8;
											for (@Pc(504) int local504 = 0; local504 < this.anIntArray267.length; local504++) {
												if (this.anIntArray267[local504] == local324 && this.aByteArrayArray6[local504] != null) {
													local82.method216(local300, local123, (local312 & 0x7) * 8, local233 * 8, this.aClass35_1, (local322 & 0x7) * 8, this.aClass40Array1, local182 * 8, this.aByteArrayArray6[local504], local306);
													break;
												}
											}
										}
									}
								}
								local123++;
							}
						}
						for (local111 = 0; local111 < 13; local111++) {
							for (local123 = 0; local123 < 13; local123++) {
								@Pc(276) boolean local276 = false;
								local233 = this.anIntArrayArrayArray7[local97][local111][local123];
								if (local233 != -1) {
									local245 = local233 >> 24 & 0x3;
									local300 = local233 >> 1 & 0x3;
									local306 = local233 >> 14 & 0x3FF;
									local312 = local233 >> 3 & 0x7FF;
									local322 = (local306 / 8 << 8) + local312 / 8;
									for (local324 = 0; local324 < this.anIntArray267.length; local324++) {
										if (this.anIntArray267[local324] == local322 && this.aByteArrayArray5[local324] != null) {
											local82.method221(local111 * 8, this.aClass40Array1, (local312 & 0x7) * 8, local300, this.aByteArrayArray5[local324], (local306 & 0x7) * 8, local97, local245, local123 * 8);
											local276 = true;
											break;
										}
									}
								}
								if (!local276) {
									local82.method224(local123 * 8, local97, local111 * 8);
								}
							}
						}
						local97++;
					}
				}
				this.aClass1_Sub1_Sub3_9.method44(21, this.anInt902);
				local82.method211(this.aClass40Array1, this.aClass35_1);
				if (this.aClass17_26 != null) {
					this.aClass17_26.method229();
					Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
				}
				this.aClass1_Sub1_Sub3_9.method44(21, this.anInt902);
				local97 = Class16.anInt304;
				if (local97 > this.anInt1027) {
					local97 = this.anInt1027;
				}
				if (local97 < this.anInt1027 - 1) {
					local97 = this.anInt1027 - 1;
				}
				if (aBoolean228) {
					this.aClass35_1.method397(Class16.anInt304);
				} else {
					this.aClass35_1.method397(0);
				}
				for (local111 = 0; local111 < 104; local111++) {
					for (local123 = 0; local123 < 104; local123++) {
						this.method695(local111, local123);
					}
				}
				this.method597();
			} catch (@Pc(655) Exception local655) {
			}
			Class48.aClass15_8.method184();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub1_Sub3_9.method44(0, this.anInt902);
				this.aClass1_Sub1_Sub3_9.method49(1057001181);
			}
			if (aBoolean228 && signlink.aRandomAccessFile3 != null) {
				local27 = this.aClass36_Sub1_1.method509(0);
				for (local40 = 0; local40 < local27; local40++) {
					local44 = this.aClass36_Sub1_1.method502(local40);
					if ((local44 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub2.method142(local40);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub2.method339();
			this.aClass36_Sub1_1.method490(this.anInt946);
			local27 = (this.anInt970 - 6) / 8 - 1;
			local40 = (this.anInt970 + 6) / 8 + 1;
			local44 = (this.anInt971 - 6) / 8 - 1;
			local48 = (this.anInt971 + 6) / 8 + 1;
			if (this.aBoolean241) {
				local27 = 49;
				local40 = 50;
				local44 = 49;
				local48 = 50;
			}
			for (local97 = local27; local97 <= local40; local97++) {
				for (local111 = local44; local111 <= local48; local111++) {
					if (local97 == local27 || local97 == local40 || local111 == local44 || local111 == local48) {
						local123 = this.aClass36_Sub1_1.method505(local97, 0, local111);
						if (local123 != -1) {
							this.aClass36_Sub1_1.method508(local123, 3);
						}
						local182 = this.aClass36_Sub1_1.method505(local97, 1, local111);
						if (local182 != -1) {
							this.aClass36_Sub1_1.method508(local182, 3);
						}
					}
				}
			}
		} catch (@Pc(821) RuntimeException local821) {
			signlink.reporterror("70295, " + 0 + ", " + local821.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method610(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < 0 && arg0 != 0L) {
				if (this.anInt1089 >= 100) {
					this.method664("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(26) String local26 = Class49.method572(Class49.method569(arg0));
					for (@Pc(28) int local28 = 0; local28 < this.anInt1089; local28++) {
						if (this.aLongArray4[local28] == arg0) {
							this.method664("", local26 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(58) int local58 = 0; local58 < this.anInt1072; local58++) {
						if (this.aLongArray3[local58] == arg0) {
							this.method664("", "Please remove " + local26 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray4[this.anInt1089++] = arg0;
					this.aBoolean245 = true;
					this.aClass1_Sub1_Sub3_9.method44(43, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method51(arg0);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("70956, " + arg0 + ", " + arg1 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(25) int local25 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local25 = arg1 + 1;
			}
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(49) int local49 = arg0 & 0x7F;
			@Pc(77) int local77 = this.anIntArrayArrayArray8[local25][local3][local7] * (128 - local45) + this.anIntArrayArrayArray8[local25][local3 + 1][local7] * local45 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray8[local25][local3][local7 + 1] * (128 - local45) + this.anIntArrayArrayArray8[local25][local3 + 1][local7 + 1] * local45 >> 7;
			return local77 * (128 - local49) + local109 * local49 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("86856, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method612() {
		try {
			@Pc(8) int local8;
			if (this.anInt958 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt958 > 768) {
						this.anIntArray259[local8] = this.method656(1024 - this.anInt958, this.anIntArray261[local8], this.anIntArray260[local8]);
					} else if (this.anInt958 > 256) {
						this.anIntArray259[local8] = this.anIntArray261[local8];
					} else {
						this.anIntArray259[local8] = this.method656(256 - this.anInt958, this.anIntArray260[local8], this.anIntArray261[local8]);
					}
				}
			} else if (this.anInt959 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt959 > 768) {
						this.anIntArray259[local8] = this.method656(1024 - this.anInt959, this.anIntArray262[local8], this.anIntArray260[local8]);
					} else if (this.anInt959 > 256) {
						this.anIntArray259[local8] = this.anIntArray262[local8];
					} else {
						this.anIntArray259[local8] = this.method656(256 - this.anInt959, this.anIntArray260[local8], this.anIntArray262[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray259[local8] = this.anIntArray260[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass17_18.anIntArray114[local8] = this.aClass1_Sub1_Sub2_Sub4_11.anIntArray171[local8];
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
				local198 = this.anIntArray242[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray249[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray259[local220];
						local239 = this.aClass17_18.anIntArray114[local183];
						this.aClass17_18.anIntArray114[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass17_18.method230(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass17_19.anIntArray114[local198] = this.aClass1_Sub1_Sub2_Sub4_12.anIntArray171[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray242[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray249[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(369) int local369 = 256 - local228;
						local228 = this.anIntArray259[local228];
						@Pc(380) int local380 = this.aClass17_19.anIntArray114[local183];
						this.aClass17_19.anIntArray114[local183++] = ((local228 & 0xFF00FF) * local239 + (local380 & 0xFF00FF) * local369 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local380 & 0xFF00) * local369 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass17_19.method230(637, 0, super.aGraphics2);
		} catch (@Pc(452) RuntimeException local452) {
			signlink.reporterror("34330, " + false + ", " + local452.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBI)V")
	private void method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg2 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg5 & 0x7FF;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = arg1;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(41) int local41;
			if (local5 != 0) {
				local27 = Class1_Sub1_Sub1_Sub2.anIntArray60[local5];
				local31 = Class1_Sub1_Sub1_Sub2.anIntArray61[local5];
				local41 = local31 * 0 - arg1 * local27 >> 16;
				local21 = local27 * 0 + arg1 * local31 >> 16;
				local19 = local41;
			}
			if (local11 != 0) {
				local27 = Class1_Sub1_Sub1_Sub2.anIntArray60[local11];
				local31 = Class1_Sub1_Sub1_Sub2.anIntArray61[local11];
				local41 = local21 * local27 + local31 * 0 >> 16;
				local21 = local21 * local31 - local27 * 0 >> 16;
				local17 = local41;
			}
			this.anInt887 = arg0 - local17;
			this.anInt888 = arg3 - local19;
			this.anInt889 = arg4 - local21;
			this.anInt890 = arg2;
			this.anInt891 = arg5;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("79935, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 101 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method614(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString30 = "";
				this.aString31 = "Connecting to server...";
				this.method673(true);
			}
			this.aClass39_1 = new Class39(-634, this, this.method617(anInt928 + 43594));
			@Pc(30) long local30 = Class49.method568(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_9.anInt78 = 0;
			this.aClass1_Sub1_Sub3_9.method45(14);
			this.aClass1_Sub1_Sub3_9.method45(local37);
			this.aClass39_1.method517(this.aClass1_Sub1_Sub3_9.aByteArray8, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass39_1.method514();
			}
			@Pc(74) int local74 = this.aClass39_1.method514();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass39_1.method516(this.aClass1_Sub1_Sub3_8.aByteArray8, 0, 8);
				this.aClass1_Sub1_Sub3_8.anInt78 = 0;
				this.aLong29 = this.aClass1_Sub1_Sub3_8.method61();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass1_Sub1_Sub3_9.anInt78 = 0;
				this.aClass1_Sub1_Sub3_9.method45(10);
				this.aClass1_Sub1_Sub3_9.method49(local99[0]);
				this.aClass1_Sub1_Sub3_9.method49(local99[1]);
				this.aClass1_Sub1_Sub3_9.method49(local99[2]);
				this.aClass1_Sub1_Sub3_9.method49(local99[3]);
				this.aClass1_Sub1_Sub3_9.method49(signlink.anInt1093);
				this.aClass1_Sub1_Sub3_9.method52(arg0);
				this.aClass1_Sub1_Sub3_9.method52(arg1);
				this.aClass1_Sub1_Sub3_9.method70(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_7.anInt78 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_7.method45(18);
				} else {
					this.aClass1_Sub1_Sub3_7.method45(16);
				}
				this.aClass1_Sub1_Sub3_7.method45(this.aClass1_Sub1_Sub3_9.anInt78 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_7.method45(255);
				this.aClass1_Sub1_Sub3_7.method46(359);
				this.aClass1_Sub1_Sub3_7.method45(aBoolean228 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub3_7.method49(this.anIntArray212[local225]);
				}
				this.aClass1_Sub1_Sub3_7.method53(this.aClass1_Sub1_Sub3_9.aByteArray8, this.aClass1_Sub1_Sub3_9.anInt78);
				this.aClass1_Sub1_Sub3_9.aClass32_1 = new Class32(false, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass32_2 = new Class32(false, local99);
				this.aClass39_1.method517(this.aClass1_Sub1_Sub3_7.aByteArray8, this.aClass1_Sub1_Sub3_7.anInt78);
				local74 = this.aClass39_1.method514();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method614(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt1081 = this.aClass39_1.method514();
					aBoolean240 = this.aClass39_1.method514() == 1;
					this.aLong32 = 0L;
					this.anInt1064 = 0;
					this.aClass47_1.anInt794 = 0;
					super.aBoolean211 = true;
					this.aBoolean236 = true;
					this.aBoolean213 = true;
					this.aClass1_Sub1_Sub3_9.anInt78 = 0;
					this.aClass1_Sub1_Sub3_8.anInt78 = 0;
					this.anInt1077 = -1;
					this.anInt955 = -1;
					this.anInt956 = -1;
					this.anInt957 = -1;
					this.anInt1076 = 0;
					this.anInt1078 = 0;
					this.anInt1019 = 0;
					this.anInt1080 = 0;
					this.anInt867 = 0;
					this.anInt986 = 0;
					this.aBoolean242 = false;
					super.anInt845 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray13[local389] = null;
					}
					this.anInt931 = 0;
					this.anInt950 = 0;
					this.anInt944 = 0;
					this.anInt988 = 0;
					this.anInt920 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1031 = (int) (Math.random() * 110.0D) - 55;
					this.anInt881 = (int) (Math.random() * 80.0D) - 40;
					this.anInt941 = (int) (Math.random() * 120.0D) - 60;
					this.anInt1008 = (int) (Math.random() * 30.0D) - 20;
					this.anInt983 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt883 = 0;
					this.anInt1012 = -1;
					this.anInt935 = 0;
					this.anInt936 = 0;
					this.anInt905 = 0;
					this.anInt873 = 0;
					for (local225 = 0; local225 < this.anInt903; local225++) {
						this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local225] = null;
						this.aClass1_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local259] = null;
					}
					aClass1_Sub1_Sub1_Sub3_Sub2_1 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anInt904] = new Class1_Sub1_Sub1_Sub3_Sub2();
					this.aClass41_12.method538();
					this.aClass41_10.method538();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass41ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass41_11 = new Class41(-388);
					this.anInt1073 = 0;
					this.anInt1072 = 0;
					this.method707(this.anInt962);
					this.anInt962 = -1;
					this.method707(this.anInt1091);
					this.anInt1091 = -1;
					this.method707(this.anInt1007);
					this.anInt1007 = -1;
					this.method707(this.anInt1090);
					this.anInt1090 = -1;
					this.method707(this.anInt1085);
					this.anInt1085 = -1;
					this.method707(this.anInt1071);
					this.anInt1071 = -1;
					this.method707(this.anInt948);
					this.anInt948 = -1;
					this.aBoolean247 = false;
					this.anInt1005 = 3;
					this.anInt938 = 0;
					this.aBoolean242 = false;
					this.aBoolean243 = false;
					this.aString17 = null;
					this.anInt1029 = 0;
					this.anInt1015 = -1;
					this.aBoolean260 = true;
					this.method682((byte) 8);
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray276[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray14[local538] = null;
						this.aBooleanArray11[local538] = false;
					}
					anInt930 = 0;
					anInt1010 = 0;
					anInt929 = 0;
					anInt864 = 0;
					anInt964 = 0;
					this.method655();
				} else if (local74 == 3) {
					this.aString30 = "";
					this.aString31 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString30 = "Your account has been disabled.";
					this.aString31 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString30 = "Your account is already logged in.";
					this.aString31 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString30 = "RuneScape has been updated!";
					this.aString31 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString30 = "This world is full.";
					this.aString31 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString30 = "Unable to connect.";
					this.aString31 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString30 = "Login limit exceeded.";
					this.aString31 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString30 = "Unable to connect.";
					this.aString31 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString30 = "Login server rejected session.";
					this.aString31 = "Please try again.";
				} else if (local74 == 12) {
					this.aString30 = "You need a members account to login to this world.";
					this.aString31 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString30 = "Could not complete login.";
					this.aString31 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString30 = "The server is being updated.";
					this.aString31 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean213 = true;
					this.aClass1_Sub1_Sub3_9.anInt78 = 0;
					this.aClass1_Sub1_Sub3_8.anInt78 = 0;
					this.anInt1077 = -1;
					this.anInt955 = -1;
					this.anInt956 = -1;
					this.anInt957 = -1;
					this.anInt1076 = 0;
					this.anInt1078 = 0;
					this.anInt1019 = 0;
					this.anInt986 = 0;
					this.aBoolean242 = false;
					this.aLong33 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString30 = "Login attempts exceeded.";
					this.aString31 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString30 = "You are standing in a members-only area.";
					this.aString31 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString30 = "Invalid loginserver requested";
					this.aString31 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass39_1.method514();
					for (@Pc(917) int local917 = local389 + 3; local917 >= 0; local917--) {
						this.aString30 = "You have only just left another world";
						this.aString31 = "Your profile will be transferred in: " + local917;
						this.method673(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(939) Exception local939) {
						}
					}
					this.method614(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString30 = "Malformed login packet.";
					this.aString31 = "Please try again.";
				} else if (local74 == 23) {
					this.aString30 = "This computers address has been blocked";
					this.aString31 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString30 = "Unexpected server response";
					this.aString31 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString30 = "No response from server";
					this.aString31 = "Please try using a different world.";
				} else if (this.anInt1017 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(981) Exception local981) {
					}
					this.anInt1017++;
					this.method614(arg0, arg1, arg2);
				} else {
					this.aString30 = "No response from loginserver";
					this.aString31 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1024) IOException local1024) {
			this.aString30 = "";
			this.aString31 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method615() {
		try {
			if (super.aClass17_2 == null) {
				this.method698(this.aByte30);
				this.aClass17_15 = null;
				this.aClass17_16 = null;
				this.aClass17_17 = null;
				this.aClass17_18 = null;
				this.aClass17_19 = null;
				this.aClass17_20 = null;
				this.aClass17_21 = null;
				this.aClass17_22 = null;
				this.aClass17_23 = null;
				this.aClass17_27 = null;
				this.aClass17_25 = null;
				this.aClass17_24 = null;
				this.aClass17_26 = null;
				this.aClass17_3 = null;
				this.aClass17_4 = null;
				this.aClass17_5 = null;
				super.aClass17_2 = new Class17(this.method584(), 765, (byte) 0, 503);
				this.aBoolean259 = true;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("33824, " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method616(@OriginalArg(0) int arg0) {
		try {
			this.aClass17_24.method229();
			Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray264;
			if (arg0 != 7) {
				this.anInt1077 = this.aClass1_Sub1_Sub3_8.method55();
			}
			this.aClass1_Sub1_Sub2_Sub3_3.method371(0, this.aByte39, 0);
			if (this.anInt1071 != -1) {
				this.method665(0, Class44.method544(this.anInt1071), 0, 0);
			} else if (this.anIntArray243[this.anInt1005] != -1) {
				this.method665(0, Class44.method544(this.anIntArray243[this.anInt1005]), 0, 0);
			}
			if (this.aBoolean242 && this.anInt965 == 1) {
				this.method689();
			}
			this.aClass17_24.method230(553, 205, super.aGraphics2);
			this.aClass17_26.method229();
			Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("70947, " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Ljava/net/Socket;")
	public Socket method617(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method618() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray249[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray249[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray250[local54] = (this.anIntArray249[local54 - 1] + this.anIntArray249[local54 + 1] + this.anIntArray249[local54 - 128] + this.anIntArray249[local54 + 128]) / 4;
				}
			}
			this.anInt1049 += 128;
			if (this.anInt1049 > this.anIntArray230.length) {
				this.anInt1049 -= this.anIntArray230.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method647(this.aClass1_Sub1_Sub2_Sub3Array5[local48]);
			}
			@Pc(175) int local175;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local175 = local54 + (local48 << 7);
					@Pc(198) int local198 = this.anIntArray250[local175 + 128] - this.anIntArray230[local175 + this.anInt1049 & this.anIntArray230.length - 1] / 5;
					if (local198 < 0) {
						local198 = 0;
					}
					this.anIntArray249[local175] = local198;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray242[local54] = this.anIntArray242[local54 + 1];
			}
			this.anIntArray242[255] = (int) (Math.sin((double) anInt1011 / 14.0D) * 16.0D + Math.sin((double) anInt1011 / 15.0D) * 14.0D + Math.sin((double) anInt1011 / 16.0D) * 12.0D);
			if (this.anInt958 > 0) {
				this.anInt958 -= 4;
			}
			if (this.anInt959 > 0) {
				this.anInt959 -= 4;
			}
			if (this.anInt958 == 0 && this.anInt959 == 0) {
				local175 = (int) (Math.random() * 2000.0D);
				if (local175 == 0) {
					this.anInt958 = 1024;
				}
				if (local175 == 1) {
					this.anInt959 = 1024;
					return;
				}
			}
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("65326, " + 44 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method619() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt873; local1++) {
				@Pc(8) int local8 = this.anIntArray213[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub3_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local8];
				if (local13 != null) {
					this.method620(local13.aClass37_1.aByte17, local13);
				}
			}
			if (this.aByte26 != -97) {
				this.anInt1077 = this.aClass1_Sub1_Sub3_8.method55();
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("92517, " + -97 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!SDXDPBJK;)V")
	private void method620(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub3 arg1) {
		try {
			if (arg1.anInt424 < 128 || arg1.anInt425 < 128 || arg1.anInt424 >= 13184 || arg1.anInt425 >= 13184) {
				arg1.anInt419 = -1;
				arg1.anInt398 = -1;
				arg1.anInt408 = 0;
				arg1.anInt409 = 0;
				arg1.anInt424 = arg1.anIntArray127[0] * 128 + arg1.anInt427 * 64;
				arg1.anInt425 = arg1.anIntArray128[0] * 128 + arg1.anInt427 * 64;
				arg1.method266();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub3_Sub2_1 && (arg1.anInt424 < 1536 || arg1.anInt425 < 1536 || arg1.anInt424 >= 11776 || arg1.anInt425 >= 11776)) {
				arg1.anInt419 = -1;
				arg1.anInt398 = -1;
				arg1.anInt408 = 0;
				arg1.anInt409 = 0;
				arg1.anInt424 = arg1.anIntArray127[0] * 128 + arg1.anInt427 * 64;
				arg1.anInt425 = arg1.anIntArray128[0] * 128 + arg1.anInt427 * 64;
				arg1.method266();
			}
			if (arg1.anInt408 > anInt1011) {
				this.method621(arg1);
			} else if (arg1.anInt409 >= anInt1011) {
				this.method622(728, arg1);
			} else {
				this.method623(this.aBoolean246, arg1);
			}
			this.method624(arg1);
			this.aBoolean213 &= true;
			this.method625(arg1);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("55674, " + true + ", " + arg0 + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!SDXDPBJK;)V")
	private void method621(@OriginalArg(1) Class1_Sub1_Sub1_Sub3 arg0) {
		try {
			this.anInt1076 += 0;
			@Pc(10) int local10 = arg0.anInt408 - anInt1011;
			@Pc(20) int local20 = arg0.anInt404 * 128 + arg0.anInt427 * 64;
			@Pc(30) int local30 = arg0.anInt406 * 128 + arg0.anInt427 * 64;
			arg0.anInt424 += (local20 - arg0.anInt424) / local10;
			arg0.anInt425 += (local30 - arg0.anInt425) / local10;
			arg0.anInt413 = 0;
			if (arg0.anInt410 == 0) {
				arg0.anInt403 = 1024;
			}
			if (arg0.anInt410 == 1) {
				arg0.anInt403 = 1536;
			}
			if (arg0.anInt410 == 2) {
				arg0.anInt403 = 0;
			}
			if (arg0.anInt410 == 3) {
				arg0.anInt403 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("90088, " + 0 + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!SDXDPBJK;)V")
	private void method622(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub3 arg1) {
		try {
			if (arg1.anInt409 == anInt1011 || arg1.anInt419 == -1 || arg1.anInt422 != 0 || arg1.anInt421 + 1 > Class46.aClass46Array1[arg1.anInt419].method550(arg1.anInt420)) {
				@Pc(29) int local29 = arg1.anInt409 - arg1.anInt408;
				@Pc(34) int local34 = anInt1011 - arg1.anInt408;
				@Pc(44) int local44 = arg1.anInt404 * 128 + arg1.anInt427 * 64;
				@Pc(54) int local54 = arg1.anInt406 * 128 + arg1.anInt427 * 64;
				@Pc(64) int local64 = arg1.anInt405 * 128 + arg1.anInt427 * 64;
				@Pc(74) int local74 = arg1.anInt407 * 128 + arg1.anInt427 * 64;
				arg1.anInt424 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg1.anInt425 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg1.anInt413 = 0;
			if (arg1.anInt410 == 0) {
				arg1.anInt403 = 1024;
			}
			if (arg1.anInt410 == 1) {
				arg1.anInt403 = 1536;
			}
			if (arg1.anInt410 == 2) {
				arg1.anInt403 = 0;
			}
			if (arg1.anInt410 == 3) {
				arg1.anInt403 = 512;
			}
			arg1.anInt426 = arg1.anInt403;
			@Pc(138) boolean local138 = false;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("53256, " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!SDXDPBJK;)V")
	private void method623(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub3 arg1) {
		try {
			if (!arg0) {
				this.aClass1_Sub1_Sub3_9.method45(80);
			}
			arg1.anInt416 = arg1.anInt411;
			if (arg1.anInt428 == 0) {
				arg1.anInt413 = 0;
			} else {
				if (arg1.anInt419 != -1 && arg1.anInt422 == 0) {
					@Pc(30) Class46 local30 = Class46.aClass46Array1[arg1.anInt419];
					if (arg1.anInt438 > 0 && local30.anInt777 == 0) {
						arg1.anInt413++;
						return;
					}
					if (arg1.anInt438 <= 0 && local30.anInt778 == 0) {
						arg1.anInt413++;
						return;
					}
				}
				@Pc(59) int local59 = arg1.anInt424;
				@Pc(62) int local62 = arg1.anInt425;
				@Pc(77) int local77 = arg1.anIntArray127[arg1.anInt428 - 1] * 128 + arg1.anInt427 * 64;
				@Pc(92) int local92 = arg1.anIntArray128[arg1.anInt428 - 1] * 128 + arg1.anInt427 * 64;
				if (local77 - local59 <= 256 && local77 - local59 >= -256 && local92 - local62 <= 256 && local92 - local62 >= -256) {
					if (local59 < local77) {
						if (local62 < local92) {
							arg1.anInt403 = 1280;
						} else if (local62 > local92) {
							arg1.anInt403 = 1792;
						} else {
							arg1.anInt403 = 1536;
						}
					} else if (local59 > local77) {
						if (local62 < local92) {
							arg1.anInt403 = 768;
						} else if (local62 > local92) {
							arg1.anInt403 = 256;
						} else {
							arg1.anInt403 = 512;
						}
					} else if (local62 < local92) {
						arg1.anInt403 = 1024;
					} else {
						arg1.anInt403 = 0;
					}
					@Pc(186) int local186 = arg1.anInt403 - arg1.anInt426 & 0x7FF;
					if (local186 > 1024) {
						local186 -= 2048;
					}
					@Pc(193) int local193 = arg1.anInt394;
					if (local186 >= -256 && local186 <= 256) {
						local193 = arg1.anInt393;
					} else if (local186 >= 256 && local186 < 768) {
						local193 = arg1.anInt396;
					} else if (local186 >= -768 && local186 <= -256) {
						local193 = arg1.anInt395;
					}
					if (local193 == -1) {
						local193 = arg1.anInt393;
					}
					arg1.anInt416 = local193;
					@Pc(235) int local235 = 4;
					if (arg1.anInt426 != arg1.anInt403 && arg1.anInt414 == -1 && arg1.anInt434 != 0) {
						local235 = 2;
					}
					if (arg1.anInt428 > 2) {
						local235 = 6;
					}
					if (arg1.anInt428 > 3) {
						local235 = 8;
					}
					if (arg1.anInt413 > 0 && arg1.anInt428 > 1) {
						local235 = 8;
						arg1.anInt413--;
					}
					if (arg1.aBooleanArray8[arg1.anInt428 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg1.anInt416 == arg1.anInt393 && arg1.anInt437 != -1) {
						arg1.anInt416 = arg1.anInt437;
					}
					if (local59 < local77) {
						arg1.anInt424 += local235;
						if (arg1.anInt424 > local77) {
							arg1.anInt424 = local77;
						}
					} else if (local59 > local77) {
						arg1.anInt424 -= local235;
						if (arg1.anInt424 < local77) {
							arg1.anInt424 = local77;
						}
					}
					if (local62 < local92) {
						arg1.anInt425 += local235;
						if (arg1.anInt425 > local92) {
							arg1.anInt425 = local92;
						}
					} else if (local62 > local92) {
						arg1.anInt425 -= local235;
						if (arg1.anInt425 < local92) {
							arg1.anInt425 = local92;
						}
					}
					if (arg1.anInt424 == local77 && arg1.anInt425 == local92) {
						arg1.anInt428--;
						if (arg1.anInt438 > 0) {
							arg1.anInt438--;
							return;
						}
					}
				} else {
					arg1.anInt424 = local77;
					arg1.anInt425 = local92;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("401, " + arg0 + ", " + arg1 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!SDXDPBJK;)V")
	private void method624(@OriginalArg(1) Class1_Sub1_Sub1_Sub3 arg0) {
		try {
			if (arg0.anInt434 != 0) {
				@Pc(30) int local30;
				@Pc(36) int local36;
				if (arg0.anInt414 != -1 && arg0.anInt414 < 32768) {
					@Pc(22) Class1_Sub1_Sub1_Sub3_Sub1 local22 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[arg0.anInt414];
					if (local22 != null) {
						local30 = arg0.anInt424 - local22.anInt424;
						local36 = arg0.anInt425 - local22.anInt425;
						if (local30 != 0 || local36 != 0) {
							arg0.anInt403 = (int) (Math.atan2((double) local30, (double) local36) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(61) int local61;
				if (arg0.anInt414 >= 32768) {
					local61 = arg0.anInt414 - 32768;
					if (local61 == this.anInt871) {
						local61 = this.anInt904;
					}
					@Pc(73) Class1_Sub1_Sub1_Sub3_Sub2 local73 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local61];
					if (local73 != null) {
						local36 = arg0.anInt424 - local73.anInt424;
						@Pc(87) int local87 = arg0.anInt425 - local73.anInt425;
						if (local36 != 0 || local87 != 0) {
							arg0.anInt403 = (int) (Math.atan2((double) local36, (double) local87) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt435 != 0 || arg0.anInt436 != 0) && (arg0.anInt428 == 0 || arg0.anInt413 > 0)) {
					local61 = arg0.anInt424 - (arg0.anInt435 - this.anInt999 - this.anInt999) * 64;
					local30 = arg0.anInt425 - (arg0.anInt436 - this.anInt1000 - this.anInt1000) * 64;
					if (local61 != 0 || local30 != 0) {
						arg0.anInt403 = (int) (Math.atan2((double) local61, (double) local30) * 325.949D) & 0x7FF;
					}
					arg0.anInt435 = 0;
					arg0.anInt436 = 0;
				}
				local61 = arg0.anInt403 - arg0.anInt426 & 0x7FF;
				if (local61 != 0) {
					if (local61 < arg0.anInt434 || local61 > 2048 - arg0.anInt434) {
						arg0.anInt426 = arg0.anInt403;
					} else if (local61 > 1024) {
						arg0.anInt426 -= arg0.anInt434;
					} else {
						arg0.anInt426 += arg0.anInt434;
					}
					arg0.anInt426 &= 0x7FF;
					if (arg0.anInt416 == arg0.anInt411 && arg0.anInt426 != arg0.anInt403) {
						if (arg0.anInt412 != -1) {
							arg0.anInt416 = arg0.anInt412;
							return;
						}
						arg0.anInt416 = arg0.anInt393;
						return;
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("81927, " + -599 + ", " + arg0 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SDXDPBJK;B)V")
	private void method625(@OriginalArg(0) Class1_Sub1_Sub1_Sub3 arg0) {
		try {
			arg0.aBoolean87 = false;
			@Pc(19) Class46 local19;
			if (arg0.anInt416 != -1) {
				local19 = Class46.aClass46Array1[arg0.anInt416];
				arg0.anInt418++;
				if (arg0.anInt417 < local19.anInt771 && arg0.anInt418 > local19.method550(arg0.anInt417)) {
					arg0.anInt418 = 0;
					arg0.anInt417++;
				}
				if (arg0.anInt417 >= local19.anInt771) {
					arg0.anInt418 = 0;
					arg0.anInt417 = 0;
				}
			}
			if (arg0.anInt398 != -1 && anInt1011 >= arg0.anInt401) {
				if (arg0.anInt399 < 0) {
					arg0.anInt399 = 0;
				}
				local19 = Class18.aClass18Array1[arg0.anInt398].aClass46_2;
				arg0.anInt400++;
				while (arg0.anInt399 < local19.anInt771 && arg0.anInt400 > local19.method550(arg0.anInt399)) {
					arg0.anInt400 -= local19.method550(arg0.anInt399);
					arg0.anInt399++;
				}
				if (arg0.anInt399 >= local19.anInt771 && (arg0.anInt399 < 0 || arg0.anInt399 >= local19.anInt771)) {
					arg0.anInt398 = -1;
				}
			}
			if (arg0.anInt419 != -1 && arg0.anInt422 <= 1) {
				local19 = Class46.aClass46Array1[arg0.anInt419];
				if (local19.anInt777 == 1 && arg0.anInt438 > 0 && arg0.anInt408 <= anInt1011 && arg0.anInt409 < anInt1011) {
					arg0.anInt422 = 1;
					return;
				}
			}
			if (arg0.anInt419 != -1 && arg0.anInt422 == 0) {
				local19 = Class46.aClass46Array1[arg0.anInt419];
				arg0.anInt421++;
				while (arg0.anInt420 < local19.anInt771 && arg0.anInt421 > local19.method550(arg0.anInt420)) {
					arg0.anInt421 -= local19.method550(arg0.anInt420);
					arg0.anInt420++;
				}
				if (arg0.anInt420 >= local19.anInt771) {
					arg0.anInt420 -= local19.anInt772;
					arg0.anInt423++;
					if (arg0.anInt423 >= local19.anInt776) {
						arg0.anInt419 = -1;
					}
					if (arg0.anInt420 < 0 || arg0.anInt420 >= local19.anInt771) {
						arg0.anInt419 = -1;
					}
				}
				arg0.aBoolean87 = local19.aBoolean183;
			}
			if (arg0.anInt422 > 0) {
				arg0.anInt422--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("22493, " + arg0 + ", " + -30 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method626() {
		try {
			if (this.anInt1090 == -1 || this.anInt944 != 2 && super.aClass17_2 == null) {
				if (this.aBoolean259) {
					this.method655();
					this.aBoolean259 = false;
					this.aClass17_6.method230(0, 4, super.aGraphics2);
					this.aClass17_7.method230(0, 357, super.aGraphics2);
					this.aClass17_8.method230(722, 4, super.aGraphics2);
					this.aClass17_9.method230(743, 205, super.aGraphics2);
					this.aClass17_10.method230(0, 0, super.aGraphics2);
					this.aClass17_11.method230(516, 4, super.aGraphics2);
					this.aClass17_12.method230(516, 205, super.aGraphics2);
					this.aClass17_13.method230(496, 357, super.aGraphics2);
					this.aClass17_14.method230(0, 338, super.aGraphics2);
					this.aBoolean245 = true;
					this.aBoolean256 = true;
					this.aBoolean219 = true;
					this.aBoolean229 = true;
					if (this.anInt944 != 2) {
						this.aClass17_26.method230(4, 4, super.aGraphics2);
						this.aClass17_25.method230(550, 4, super.aGraphics2);
					}
				}
				if (this.anInt944 == 2) {
					this.method602();
				}
				if (this.aBoolean242 && this.anInt965 == 1) {
					this.aBoolean245 = true;
				}
				@Pc(277) boolean local277;
				if (this.anInt1071 != -1) {
					local277 = this.method632(this.anInt917, this.anInt1071);
					if (local277) {
						this.aBoolean245 = true;
					}
				}
				if (this.anInt1054 == 2) {
					this.aBoolean245 = true;
				}
				if (this.anInt1061 == 2) {
					this.aBoolean245 = true;
				}
				if (this.aBoolean245) {
					this.method616(this.anInt987);
					this.aBoolean245 = false;
				}
				@Pc(363) int local363;
				if (this.anInt1091 == -1 && this.anInt938 == 0) {
					this.aClass44_1.anInt738 = this.anInt908 - this.anInt879 - 77;
					if (super.anInt847 > 448 && super.anInt847 < 560 && super.anInt848 > 332) {
						this.method719(0, 77, super.anInt848 - 357, super.anInt847 - 17, 463, this.aClass44_1, this.anInt908, -1);
					}
					local363 = this.anInt908 - this.aClass44_1.anInt738 - 77;
					if (local363 < 0) {
						local363 = 0;
					}
					if (local363 > this.anInt908 - 77) {
						local363 = this.anInt908 - 77;
					}
					if (this.anInt879 != local363) {
						this.anInt879 = local363;
						this.aBoolean256 = true;
					}
					anInt939++;
					if (anInt939 > 73) {
						anInt939 = 0;
						this.aClass1_Sub1_Sub3_9.method44(252, this.anInt902);
					}
				}
				if (this.anInt1091 == -1 && this.anInt938 == 3) {
					local363 = this.anInt997 * 14 + 7;
					this.aClass44_1.anInt738 = this.anInt998;
					if (super.anInt847 > 448 && super.anInt847 < 560 && super.anInt848 > 332) {
						this.method719(0, 77, super.anInt848 - 357, super.anInt847 - 17, 463, this.aClass44_1, local363, -1);
					}
					@Pc(457) int local457 = this.aClass44_1.anInt738;
					if (local457 < 0) {
						local457 = 0;
					}
					if (local457 > local363 - 77) {
						local457 = local363 - 77;
					}
					if (this.anInt998 != local457) {
						this.anInt998 = local457;
						this.aBoolean256 = true;
					}
				}
				if (this.anInt1091 != -1) {
					local277 = this.method632(this.anInt917, this.anInt1091);
					if (local277) {
						this.aBoolean256 = true;
					}
				}
				if (this.anInt1054 == 3) {
					this.aBoolean256 = true;
				}
				if (this.anInt1061 == 3) {
					this.aBoolean256 = true;
				}
				if (this.aString17 != null) {
					this.aBoolean256 = true;
				}
				if (this.aBoolean242 && this.anInt965 == 2) {
					this.aBoolean256 = true;
				}
				if (this.aBoolean256) {
					this.method691();
					this.aBoolean256 = false;
				}
				if (this.anInt944 == 2) {
					this.method596();
					this.aClass17_25.method230(550, 4, super.aGraphics2);
					anInt924++;
					if (anInt924 > 95) {
						anInt924 = 0;
						this.aClass1_Sub1_Sub3_9.method44(233, this.anInt902);
					}
				}
				if (this.anInt1015 != -1) {
					this.aBoolean219 = true;
				}
				if (this.aBoolean219) {
					if (this.anInt1015 != -1 && this.anInt1015 == this.anInt1005) {
						this.anInt1015 = -1;
						this.aClass1_Sub1_Sub3_9.method44(156, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method45(this.anInt1005);
					}
					this.aBoolean219 = false;
					this.aClass17_5.method229();
					this.aClass1_Sub1_Sub2_Sub3_15.method371(0, this.aByte39, 0);
					if (this.anInt1071 == -1) {
						if (this.anIntArray243[this.anInt1005] != -1) {
							if (this.anInt1005 == 0) {
								this.aClass1_Sub1_Sub2_Sub3_6.method371(22, this.aByte39, 10);
							}
							if (this.anInt1005 == 1) {
								this.aClass1_Sub1_Sub2_Sub3_7.method371(54, this.aByte39, 8);
							}
							if (this.anInt1005 == 2) {
								this.aClass1_Sub1_Sub2_Sub3_7.method371(82, this.aByte39, 8);
							}
							if (this.anInt1005 == 3) {
								this.aClass1_Sub1_Sub2_Sub3_8.method371(110, this.aByte39, 8);
							}
							if (this.anInt1005 == 4) {
								this.aClass1_Sub1_Sub2_Sub3_10.method371(153, this.aByte39, 8);
							}
							if (this.anInt1005 == 5) {
								this.aClass1_Sub1_Sub2_Sub3_10.method371(181, this.aByte39, 8);
							}
							if (this.anInt1005 == 6) {
								this.aClass1_Sub1_Sub2_Sub3_9.method371(209, this.aByte39, 9);
							}
						}
						if (this.anIntArray243[0] != -1 && (this.anInt1015 != 0 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[0].method371(29, this.aByte39, 13);
						}
						if (this.anIntArray243[1] != -1 && (this.anInt1015 != 1 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[1].method371(53, this.aByte39, 11);
						}
						if (this.anIntArray243[2] != -1 && (this.anInt1015 != 2 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[2].method371(82, this.aByte39, 11);
						}
						if (this.anIntArray243[3] != -1 && (this.anInt1015 != 3 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[3].method371(115, this.aByte39, 12);
						}
						if (this.anIntArray243[4] != -1 && (this.anInt1015 != 4 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[4].method371(153, this.aByte39, 13);
						}
						if (this.anIntArray243[5] != -1 && (this.anInt1015 != 5 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[5].method371(180, this.aByte39, 11);
						}
						if (this.anIntArray243[6] != -1 && (this.anInt1015 != 6 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[6].method371(208, this.aByte39, 13);
						}
					}
					this.aClass17_5.method230(516, 160, super.aGraphics2);
					this.aClass17_4.method229();
					this.aClass1_Sub1_Sub2_Sub3_14.method371(0, this.aByte39, 0);
					if (this.anInt1071 == -1) {
						if (this.anIntArray243[this.anInt1005] != -1) {
							if (this.anInt1005 == 7) {
								this.aClass1_Sub1_Sub2_Sub3_16.method371(42, this.aByte39, 0);
							}
							if (this.anInt1005 == 8) {
								this.aClass1_Sub1_Sub2_Sub3_17.method371(74, this.aByte39, 0);
							}
							if (this.anInt1005 == 9) {
								this.aClass1_Sub1_Sub2_Sub3_17.method371(102, this.aByte39, 0);
							}
							if (this.anInt1005 == 10) {
								this.aClass1_Sub1_Sub2_Sub3_18.method371(130, this.aByte39, 1);
							}
							if (this.anInt1005 == 11) {
								this.aClass1_Sub1_Sub2_Sub3_20.method371(173, this.aByte39, 0);
							}
							if (this.anInt1005 == 12) {
								this.aClass1_Sub1_Sub2_Sub3_20.method371(201, this.aByte39, 0);
							}
							if (this.anInt1005 == 13) {
								this.aClass1_Sub1_Sub2_Sub3_19.method371(229, this.aByte39, 0);
							}
						}
						if (this.anIntArray243[8] != -1 && (this.anInt1015 != 8 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[7].method371(74, this.aByte39, 2);
						}
						if (this.anIntArray243[9] != -1 && (this.anInt1015 != 9 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[8].method371(102, this.aByte39, 3);
						}
						if (this.anIntArray243[10] != -1 && (this.anInt1015 != 10 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[9].method371(137, this.aByte39, 4);
						}
						if (this.anIntArray243[11] != -1 && (this.anInt1015 != 11 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[10].method371(174, this.aByte39, 2);
						}
						if (this.anIntArray243[12] != -1 && (this.anInt1015 != 12 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[11].method371(201, this.aByte39, 2);
						}
						if (this.anIntArray243[13] != -1 && (this.anInt1015 != 13 || anInt1011 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub3Array3[12].method371(226, this.aByte39, 2);
						}
					}
					this.aClass17_4.method230(496, 466, super.aGraphics2);
					this.aClass17_26.method229();
					Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
				}
				if (this.aBoolean229) {
					this.aBoolean229 = false;
					this.aClass17_3.method229();
					this.aClass1_Sub1_Sub2_Sub3_13.method371(0, this.aByte39, 0);
					this.aClass1_Sub1_Sub2_Sub1_3.method108(28, 16777215, true, 55, "Public chat");
					if (this.anInt926 == 0) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 65280, true, 55, "On");
					}
					if (this.anInt926 == 1) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 16776960, true, 55, "Friends");
					}
					if (this.anInt926 == 2) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 16711680, true, 55, "Off");
					}
					if (this.anInt926 == 3) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 65535, true, 55, "Hide");
					}
					this.aClass1_Sub1_Sub2_Sub1_3.method108(28, 16777215, true, 184, "Private chat");
					if (this.anInt1050 == 0) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 65280, true, 184, "On");
					}
					if (this.anInt1050 == 1) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 16776960, true, 184, "Friends");
					}
					if (this.anInt1050 == 2) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 16711680, true, 184, "Off");
					}
					this.aClass1_Sub1_Sub2_Sub1_3.method108(28, 16777215, true, 324, "Trade/compete");
					if (this.anInt895 == 0) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 65280, true, 324, "On");
					}
					if (this.anInt895 == 1) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 16776960, true, 324, "Friends");
					}
					if (this.anInt895 == 2) {
						this.aClass1_Sub1_Sub2_Sub1_3.method108(41, 16711680, true, 324, "Off");
					}
					this.aClass1_Sub1_Sub2_Sub1_3.method108(33, 16777215, true, 458, "Report abuse");
					this.aClass17_3.method230(0, 453, super.aGraphics2);
					this.aClass17_26.method229();
					Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
				}
				this.anInt917 = 0;
				this.aBoolean213 &= true;
			} else {
				if (this.anInt944 == 2) {
					this.method632(this.anInt917, this.anInt1090);
					if (this.anInt1085 != -1) {
						this.method632(this.anInt917, this.anInt1085);
					}
					this.anInt917 = 0;
					this.method615();
					super.aClass17_2.method229();
					Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray266;
					Class1_Sub1_Sub2.method459();
					this.aBoolean259 = true;
					@Pc(56) Class44 local56 = Class44.method544(this.anInt1090);
					if (local56.anInt744 == 512 && local56.anInt747 == 334 && local56.anInt734 == 0) {
						local56.anInt744 = 765;
						local56.anInt747 = 503;
					}
					this.method665(0, local56, 0, 0);
					if (this.anInt1085 != -1) {
						local56 = Class44.method544(this.anInt1085);
						if (local56.anInt744 == 512 && local56.anInt747 == 334 && local56.anInt734 == 0) {
							local56.anInt744 = 765;
							local56.anInt747 = 503;
						}
						this.method665(0, local56, 0, 0);
					}
					if (this.aBoolean242) {
						this.method689();
					} else {
						this.method711((byte) 8);
						this.method697();
					}
				}
				super.aClass17_2.method230(0, 0, super.aGraphics2);
			}
		} catch (@Pc(1339) RuntimeException local1339) {
			signlink.reporterror("87757, " + true + ", " + local1339.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method627() {
		try {
			@Pc(15) int local15;
			@Pc(22) int local22;
			if (this.anInt865 == 0) {
				local15 = super.anInt843 / 2 - 80;
				local22 = super.anInt844 / 2 + 20;
				local22 += 20;
				if (super.anInt852 == 1 && super.anInt853 >= local15 - 75 && super.anInt853 <= local15 + 75 && super.anInt854 >= local22 - 20 && super.anInt854 <= local22 + 20) {
					this.anInt865 = 3;
					this.anInt898 = 0;
				}
				local15 = super.anInt843 / 2 + 80;
				if (super.anInt852 == 1 && super.anInt853 >= local15 - 75 && super.anInt853 <= local15 + 75 && super.anInt854 >= local22 - 20 && super.anInt854 <= local22 + 20) {
					this.aString30 = "";
					this.aString31 = "Enter your username & password.";
					this.anInt865 = 2;
					this.anInt898 = 0;
				}
			} else if (this.anInt865 == 2) {
				local15 = super.anInt844 / 2 - 40;
				local15 += 30;
				local15 += 25;
				if (super.anInt852 == 1 && super.anInt854 >= local15 - 15 && super.anInt854 < local15) {
					this.anInt898 = 0;
				}
				local15 += 15;
				if (super.anInt852 == 1 && super.anInt854 >= local15 - 15 && super.anInt854 < local15) {
					this.anInt898 = 1;
				}
				local15 += 15;
				local22 = super.anInt843 / 2 - 80;
				@Pc(168) int local168 = super.anInt844 / 2 + 50;
				@Pc(169) int local169 = local168 + 20;
				if (super.anInt852 == 1 && super.anInt853 >= local22 - 75 && super.anInt853 <= local22 + 75 && super.anInt854 >= local169 - 20 && super.anInt854 <= local169 + 20) {
					this.anInt1017 = 0;
					this.method614(this.aString24, this.aString25, false);
					if (this.aBoolean213) {
						return;
					}
				}
				local22 = super.anInt843 / 2 + 80;
				if (super.anInt852 == 1 && super.anInt853 >= local22 - 75 && super.anInt853 <= local22 + 75 && super.anInt854 >= local169 - 20 && super.anInt854 <= local169 + 20) {
					this.anInt865 = 0;
					this.aString24 = "";
					this.aString25 = "";
				}
				while (true) {
					while (true) {
						@Pc(259) int local259 = this.method578();
						if (local259 == -1) {
							return;
						}
						@Pc(264) boolean local264 = false;
						for (@Pc(266) int local266 = 0; local266 < aString23.length(); local266++) {
							if (local259 == aString23.charAt(local266)) {
								local264 = true;
								break;
							}
						}
						if (this.anInt898 == 0) {
							if (local259 == 8 && this.aString24.length() > 0) {
								this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt898 = 1;
							}
							if (local264) {
								this.aString24 = this.aString24 + (char) local259;
							}
							if (this.aString24.length() > 12) {
								this.aString24 = this.aString24.substring(0, 12);
							}
						} else if (this.anInt898 == 1) {
							if (local259 == 8 && this.aString25.length() > 0) {
								this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt898 = 0;
							}
							if (local264) {
								this.aString25 = this.aString25 + (char) local259;
							}
							if (this.aString25.length() > 20) {
								this.aString25 = this.aString25.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt865 == 3) {
				local15 = super.anInt843 / 2;
				local22 = super.anInt844 / 2 + 50;
				@Pc(423) int local423 = local22 + 20;
				if (super.anInt852 == 1 && super.anInt853 >= local15 - 75 && super.anInt853 <= local15 + 75 && super.anInt854 >= local423 - 20 && super.anInt854 <= local423 + 20) {
					this.anInt865 = 0;
					return;
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("62769, " + false + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!HAWWMNZR;)V")
	private void method628(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt188 == 0) {
				local1 = this.aClass35_1.method422(arg0.anInt187, arg0.anInt189, arg0.anInt190);
			}
			if (arg0.anInt188 == 1) {
				local1 = this.aClass35_1.method423(arg0.anInt189, arg0.anInt187, arg0.anInt190);
			}
			if (arg0.anInt188 == 2) {
				local1 = this.aClass35_1.method424(arg0.anInt187, arg0.anInt189, arg0.anInt190);
			}
			if (arg0.anInt188 == 3) {
				local1 = this.aClass35_1.method425(arg0.anInt187, arg0.anInt189, arg0.anInt190);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass35_1.method426(arg0.anInt187, arg0.anInt189, arg0.anInt190, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt181 = local3;
			arg0.anInt183 = local5;
			arg0.anInt182 = local7;
			if (this.anInt1084 == -39880) {
				;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("37118, " + -39880 + ", " + arg0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Z")
	private boolean method629() {
		try {
			if (this.aClass39_1 == null) {
				return false;
			}
			@Pc(1114) String local1114;
			@Pc(214) int local214;
			try {
				@Pc(16) int local16 = this.aClass39_1.method515();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt1077 == -1) {
					this.aClass39_1.method516(this.aClass1_Sub1_Sub3_8.aByteArray8, 0, 1);
					this.anInt1077 = this.aClass1_Sub1_Sub3_8.aByteArray8[0] & 0xFF;
					if (this.aClass32_2 != null) {
						this.anInt1077 = this.anInt1077 - this.aClass32_2.method389() & 0xFF;
					}
					this.anInt1076 = Class34.anIntArray154[this.anInt1077];
					local16--;
				}
				if (this.anInt1076 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass39_1.method516(this.aClass1_Sub1_Sub3_8.aByteArray8, 0, 1);
					this.anInt1076 = this.aClass1_Sub1_Sub3_8.aByteArray8[0] & 0xFF;
					local16--;
				}
				if (this.anInt1076 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass39_1.method516(this.aClass1_Sub1_Sub3_8.aByteArray8, 0, 2);
					this.aClass1_Sub1_Sub3_8.anInt78 = 0;
					this.anInt1076 = this.aClass1_Sub1_Sub3_8.method57();
					local16 -= 2;
				}
				if (local16 < this.anInt1076) {
					return false;
				}
				this.aClass1_Sub1_Sub3_8.anInt78 = 0;
				this.aClass39_1.method516(this.aClass1_Sub1_Sub3_8.aByteArray8, 0, this.anInt1076);
				this.anInt1078 = 0;
				this.anInt957 = this.anInt956;
				this.anInt956 = this.anInt955;
				this.anInt955 = this.anInt1077;
				@Pc(161) int local161;
				if (this.anInt1077 == 169) {
					local161 = this.aClass1_Sub1_Sub3_8.method82();
					@Pc(166) byte local166 = this.aClass1_Sub1_Sub3_8.method76();
					this.anIntArray214[local161] = local166;
					if (this.anIntArray232[local161] != local166) {
						this.anIntArray232[local161] = local166;
						this.method591(local161);
						this.aBoolean245 = true;
						if (this.anInt962 != -1) {
							this.aBoolean256 = true;
						}
					}
					this.anInt1077 = -1;
					return true;
				}
				@Pc(217) Class44 local217;
				if (this.anInt1077 == 86) {
					local161 = this.aClass1_Sub1_Sub3_8.method58();
					local214 = this.aClass1_Sub1_Sub3_8.method83();
					local217 = Class44.method544(local214);
					if (local217.anInt760 != local161 || local161 == -1) {
						local217.anInt760 = local161;
						local217.anInt737 = 0;
						local217.anInt759 = 0;
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 79) {
					if (this.anInt1005 == 12) {
						this.aBoolean245 = true;
					}
					this.anInt863 = this.aClass1_Sub1_Sub3_8.method55();
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 248) {
					this.aBoolean226 = true;
					this.anInt1065 = this.aClass1_Sub1_Sub3_8.method55();
					this.anInt1066 = this.aClass1_Sub1_Sub3_8.method55();
					this.anInt1067 = this.aClass1_Sub1_Sub3_8.method57();
					this.anInt1068 = this.aClass1_Sub1_Sub3_8.method55();
					this.anInt1069 = this.aClass1_Sub1_Sub3_8.method55();
					if (this.anInt1069 >= 100) {
						this.anInt887 = this.anInt1065 * 128 + 64;
						this.anInt889 = this.anInt1066 * 128 + 64;
						this.anInt888 = this.method611(this.anInt889, this.anInt1027, this.anInt887) - this.anInt1067;
					}
					this.anInt1077 = -1;
					return true;
				}
				@Pc(350) int local350;
				@Pc(354) int local354;
				@Pc(358) int local358;
				@Pc(344) Class44 local344;
				if (this.anInt1077 == 117) {
					this.aBoolean245 = true;
					local161 = this.aClass1_Sub1_Sub3_8.method57();
					local344 = Class44.method544(local161);
					while (this.aClass1_Sub1_Sub3_8.anInt78 < this.anInt1076) {
						local350 = this.aClass1_Sub1_Sub3_8.method69();
						local354 = this.aClass1_Sub1_Sub3_8.method57();
						local358 = this.aClass1_Sub1_Sub3_8.method55();
						if (local358 == 255) {
							local358 = this.aClass1_Sub1_Sub3_8.method60();
						}
						if (local350 >= 0 && local350 < local344.anIntArray192.length) {
							local344.anIntArray192[local350] = local354;
							local344.anIntArray193[local350] = local358;
						}
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 252) {
					local161 = this.aClass1_Sub1_Sub3_8.method84();
					local214 = this.aClass1_Sub1_Sub3_8.method84();
					local350 = local214 >> 10 & 0x1F;
					local354 = local214 >> 5 & 0x1F;
					local358 = local214 & 0x1F;
					Class44.method544(local161).anInt729 = (local350 << 19) + (local354 << 11) + (local358 << 3);
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 89) {
					@Pc(456) boolean local456 = this.aClass1_Sub1_Sub3_8.method73() == 1;
					local214 = this.aClass1_Sub1_Sub3_8.method83();
					Class44.method544(local214).aBoolean173 = local456;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 94) {
					this.anInt1073 = this.aClass1_Sub1_Sub3_8.method55();
					this.aBoolean245 = true;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 200) {
					local161 = this.aClass1_Sub1_Sub3_8.method82();
					local214 = this.aClass1_Sub1_Sub3_8.method83();
					this.method668(local161);
					if (local214 != -1) {
						this.method668(local214);
					}
					if (this.anInt1007 != -1) {
						this.method707(this.anInt1007);
						this.anInt1007 = -1;
					}
					if (this.anInt1071 != -1) {
						this.method707(this.anInt1071);
						this.anInt1071 = -1;
					}
					if (this.anInt1091 != -1) {
						this.method707(this.anInt1091);
						this.anInt1091 = -1;
					}
					if (this.anInt1090 != local161) {
						this.method707(this.anInt1090);
						this.anInt1090 = local161;
					}
					if (this.anInt1085 != local161) {
						this.method707(this.anInt1085);
						this.anInt1085 = local214;
					}
					this.anInt938 = 0;
					this.aBoolean247 = false;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 173) {
					local161 = this.aClass1_Sub1_Sub3_8.method57();
					if (local161 == 65535) {
						local161 = -1;
					}
					if (local161 != this.anInt960 && this.aBoolean223 && !aBoolean228 && this.anInt996 == 0) {
						this.anInt1046 = local161;
						this.aBoolean255 = true;
						this.aClass36_Sub1_1.method507(2, this.anInt1046);
					}
					this.anInt960 = local161;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 43) {
					local161 = this.aClass1_Sub1_Sub3_8.method82();
					local214 = this.aClass1_Sub1_Sub3_8.method86();
					if (this.aBoolean223 && !aBoolean228) {
						this.anInt1046 = local161;
						this.aBoolean255 = false;
						this.aClass36_Sub1_1.method507(2, this.anInt1046);
						this.anInt996 = local214;
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 112) {
					this.anInt1037 = this.aClass1_Sub1_Sub3_8.method75();
					this.anInt1038 = this.aClass1_Sub1_Sub3_8.method75();
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 119) {
					local161 = this.aClass1_Sub1_Sub3_8.method84();
					this.method668(local161);
					if (this.anInt1091 != -1) {
						this.method707(this.anInt1091);
						this.anInt1091 = -1;
						this.aBoolean256 = true;
					}
					if (this.anInt1090 != -1) {
						this.method707(this.anInt1090);
						this.anInt1090 = -1;
						this.aBoolean259 = true;
					}
					if (this.anInt1085 != -1) {
						this.method707(this.anInt1085);
						this.anInt1085 = -1;
					}
					if (this.anInt1007 != -1) {
						this.method707(this.anInt1007);
						this.anInt1007 = -1;
					}
					if (this.anInt1071 != local161) {
						this.method707(this.anInt1071);
						this.anInt1071 = local161;
					}
					if (this.anInt938 != 0) {
						this.anInt938 = 0;
						this.aBoolean256 = true;
					}
					this.aBoolean245 = true;
					this.aBoolean219 = true;
					this.aBoolean247 = false;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 109) {
					this.aBoolean245 = true;
					local161 = this.aClass1_Sub1_Sub3_8.method88();
					local214 = this.aClass1_Sub1_Sub3_8.method73();
					local350 = this.aClass1_Sub1_Sub3_8.method75();
					this.anIntArray224[local350] = local161;
					this.anIntArray239[local350] = local214;
					this.anIntArray257[local350] = 1;
					for (local354 = 0; local354 < 98; local354++) {
						if (local161 >= anIntArray251[local354]) {
							this.anIntArray257[local350] = local354 + 2;
						}
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 121) {
					for (local161 = 0; local161 < this.anIntArray232.length; local161++) {
						if (this.anIntArray232[local161] != this.anIntArray214[local161]) {
							this.anIntArray232[local161] = this.anIntArray214[local161];
							this.method591(local161);
							this.aBoolean245 = true;
						}
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 251) {
					this.anInt1019 = this.aClass1_Sub1_Sub3_8.method57() * 30;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 188) {
					this.method693(this.aClass1_Sub1_Sub3_8, this.anInt1076);
					this.aBoolean231 = false;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 253) {
					this.anInt1005 = this.aClass1_Sub1_Sub3_8.method55();
					this.aBoolean245 = true;
					this.aBoolean219 = true;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 29) {
					local161 = this.aClass1_Sub1_Sub3_8.method89(anInt975);
					local214 = this.aClass1_Sub1_Sub3_8.method83();
					this.anIntArray214[local214] = local161;
					if (this.anIntArray232[local214] != local161) {
						this.anIntArray232[local214] = local161;
						this.method591(local214);
						this.aBoolean245 = true;
						if (this.anInt962 != -1) {
							this.aBoolean256 = true;
						}
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 48) {
					this.anInt883 = this.aClass1_Sub1_Sub3_8.method55();
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 33) {
					if (this.anInt1071 != -1) {
						this.method707(this.anInt1071);
						this.anInt1071 = -1;
						this.aBoolean245 = true;
						this.aBoolean219 = true;
					}
					if (this.anInt1091 != -1) {
						this.method707(this.anInt1091);
						this.anInt1091 = -1;
						this.aBoolean256 = true;
					}
					if (this.anInt1090 != -1) {
						this.method707(this.anInt1090);
						this.anInt1090 = -1;
						this.aBoolean259 = true;
					}
					if (this.anInt1085 != -1) {
						this.method707(this.anInt1085);
						this.anInt1085 = -1;
					}
					if (this.anInt1007 != -1) {
						this.method707(this.anInt1007);
						this.anInt1007 = -1;
					}
					if (this.anInt938 != 0) {
						this.anInt938 = 0;
						this.aBoolean256 = true;
					}
					this.aBoolean247 = false;
					this.anInt1077 = -1;
					return true;
				}
				@Pc(1132) int local1132;
				@Pc(1130) boolean local1130;
				@Pc(1265) String local1265;
				if (this.anInt1077 == 62) {
					local1114 = this.aClass1_Sub1_Sub3_8.method62();
					@Pc(1128) long local1128;
					@Pc(1125) String local1125;
					if (local1114.endsWith(":tradereq:")) {
						local1125 = local1114.substring(0, local1114.indexOf(":"));
						local1128 = Class49.method568(local1125);
						local1130 = false;
						for (local1132 = 0; local1132 < this.anInt1089; local1132++) {
							if (this.aLongArray4[local1132] == local1128) {
								local1130 = true;
								break;
							}
						}
						if (!local1130 && this.anInt1035 == 0) {
							this.method664(local1125, "wishes to trade with you.", 4);
						}
					} else if (local1114.endsWith(":duelreq:")) {
						local1125 = local1114.substring(0, local1114.indexOf(":"));
						local1128 = Class49.method568(local1125);
						local1130 = false;
						for (local1132 = 0; local1132 < this.anInt1089; local1132++) {
							if (this.aLongArray4[local1132] == local1128) {
								local1130 = true;
								break;
							}
						}
						if (!local1130 && this.anInt1035 == 0) {
							this.method664(local1125, "wishes to duel with you.", 8);
						}
					} else if (local1114.endsWith(":chalreq:")) {
						local1125 = local1114.substring(0, local1114.indexOf(":"));
						local1128 = Class49.method568(local1125);
						local1130 = false;
						for (local1132 = 0; local1132 < this.anInt1089; local1132++) {
							if (this.aLongArray4[local1132] == local1128) {
								local1130 = true;
								break;
							}
						}
						if (!local1130 && this.anInt1035 == 0) {
							local1265 = local1114.substring(local1114.indexOf(":") + 1, local1114.length() - 9);
							this.method664(local1125, local1265, 8);
						}
					} else {
						this.method664("", local1114, 0);
					}
					this.anInt1077 = -1;
					return true;
				}
				@Pc(1407) int local1407;
				@Pc(1440) int local1440;
				@Pc(1293) long local1293;
				if (this.anInt1077 == 234) {
					local1293 = this.aClass1_Sub1_Sub3_8.method61();
					local350 = this.aClass1_Sub1_Sub3_8.method55();
					@Pc(1303) String local1303 = Class49.method572(Class49.method569(local1293));
					for (local358 = 0; local358 < this.anInt1072; local358++) {
						if (local1293 == this.aLongArray3[local358]) {
							if (this.anIntArray254[local358] != local350) {
								this.anIntArray254[local358] = local350;
								this.aBoolean245 = true;
								if (local350 > 0) {
									this.method664("", local1303 + " has logged in.", 5);
								}
								if (local350 == 0) {
									this.method664("", local1303 + " has logged out.", 5);
								}
							}
							local1303 = null;
							break;
						}
					}
					if (local1303 != null && this.anInt1072 < 200) {
						this.aLongArray3[this.anInt1072] = local1293;
						this.aStringArray10[this.anInt1072] = local1303;
						this.anIntArray254[this.anInt1072] = local350;
						this.anInt1072++;
						this.aBoolean245 = true;
					}
					@Pc(1401) boolean local1401 = false;
					while (!local1401) {
						local1401 = true;
						for (local1407 = 0; local1407 < this.anInt1072 - 1; local1407++) {
							if (this.anIntArray254[local1407] != anInt927 && this.anIntArray254[local1407 + 1] == anInt927 || this.anIntArray254[local1407] == 0 && this.anIntArray254[local1407 + 1] != 0) {
								local1440 = this.anIntArray254[local1407];
								this.anIntArray254[local1407] = this.anIntArray254[local1407 + 1];
								this.anIntArray254[local1407 + 1] = local1440;
								@Pc(1462) String local1462 = this.aStringArray10[local1407];
								this.aStringArray10[local1407] = this.aStringArray10[local1407 + 1];
								this.aStringArray10[local1407 + 1] = local1462;
								@Pc(1484) long local1484 = this.aLongArray3[local1407];
								this.aLongArray3[local1407] = this.aLongArray3[local1407 + 1];
								this.aLongArray3[local1407 + 1] = local1484;
								this.aBoolean245 = true;
								local1401 = false;
							}
						}
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 162) {
					this.aBoolean226 = false;
					for (local161 = 0; local161 < 5; local161++) {
						this.aBooleanArray12[local161] = false;
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 153) {
					local161 = this.aClass1_Sub1_Sub3_8.method85(this.aByte36);
					if (local161 != this.anInt962) {
						this.method707(this.anInt962);
						this.anInt962 = local161;
					}
					this.aBoolean256 = true;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 84) {
					this.anInt1089 = this.anInt1076 / 8;
					for (local161 = 0; local161 < this.anInt1089; local161++) {
						this.aLongArray4[local161] = this.aClass1_Sub1_Sub3_8.method61();
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 134) {
					this.anInt1015 = this.aClass1_Sub1_Sub3_8.method73();
					if (this.anInt1015 == this.anInt1005) {
						if (this.anInt1015 == 3) {
							this.anInt1005 = 1;
						} else {
							this.anInt1005 = 3;
						}
						this.aBoolean245 = true;
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 220) {
					local161 = this.aClass1_Sub1_Sub3_8.method83();
					local214 = this.aClass1_Sub1_Sub3_8.method82();
					Class44.method544(local161).anInt748 = 1;
					Class44.method544(local161).anInt749 = local214;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 238) {
					this.method607();
					this.anInt1077 = -1;
					return false;
				}
				if (this.anInt1077 == 244) {
					local161 = this.aClass1_Sub1_Sub3_8.method85(this.aByte36);
					local214 = this.aClass1_Sub1_Sub3_8.method82();
					local350 = this.aClass1_Sub1_Sub3_8.method85(this.aByte36);
					@Pc(1705) Class44 local1705 = Class44.method544(local214);
					local1705.anInt752 = local350;
					local1705.anInt727 = local161;
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 41) {
					this.anInt1037 = this.aClass1_Sub1_Sub3_8.method74((byte) 7);
					this.anInt1038 = this.aClass1_Sub1_Sub3_8.method75();
					for (local161 = this.anInt1037; local161 < this.anInt1037 + 8; local161++) {
						for (local214 = this.anInt1038; local214 < this.anInt1038 + 8; local214++) {
							if (this.aClass41ArrayArrayArray1[this.anInt1027][local161][local214] != null) {
								this.aClass41ArrayArrayArray1[this.anInt1027][local161][local214] = null;
								this.method695(local161, local214);
							}
						}
					}
					for (@Pc(1785) Class1_Sub2 local1785 = (Class1_Sub2) this.aClass41_11.method534(); local1785 != null; local1785 = (Class1_Sub2) this.aClass41_11.method536()) {
						if (local1785.anInt189 >= this.anInt1037 && local1785.anInt189 < this.anInt1037 + 8 && local1785.anInt190 >= this.anInt1038 && local1785.anInt190 < this.anInt1038 + 8 && local1785.anInt187 == this.anInt1027) {
							local1785.anInt180 = 0;
						}
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 57) {
					local1293 = this.aClass1_Sub1_Sub3_8.method61();
					local350 = this.aClass1_Sub1_Sub3_8.method60();
					local354 = this.aClass1_Sub1_Sub3_8.method55();
					local1130 = false;
					for (local1132 = 0; local1132 < 100; local1132++) {
						if (this.anIntArray273[local1132] == local350) {
							local1130 = true;
							break;
						}
					}
					if (local354 <= 1) {
						for (local1407 = 0; local1407 < this.anInt1089; local1407++) {
							if (this.aLongArray4[local1407] == local1293) {
								local1130 = true;
								break;
							}
						}
					}
					if (!local1130 && this.anInt1035 == 0) {
						try {
							this.anIntArray273[this.anInt901] = local350;
							this.anInt901 = (this.anInt901 + 1) % 100;
							local1265 = Class33.method392(this.anInt1076 - 13, this.aClass1_Sub1_Sub3_8, this.aBoolean230);
							if (local354 != 3) {
								local1265 = Class25.method280(local1265);
							}
							if (local354 == 2 || local354 == 3) {
								this.method664("@cr2@" + Class49.method572(Class49.method569(local1293)), local1265, 7);
							} else if (local354 == 1) {
								this.method664("@cr1@" + Class49.method572(Class49.method569(local1293)), local1265, 7);
							} else {
								this.method664(Class49.method572(Class49.method569(local1293)), local1265, 3);
							}
						} catch (@Pc(1985) Exception local1985) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 167) {
					this.anInt1014 = this.aClass1_Sub1_Sub3_8.method82();
					this.anInt995 = this.aClass1_Sub1_Sub3_8.method84();
					this.aClass1_Sub1_Sub3_8.method83();
					this.anInt980 = this.aClass1_Sub1_Sub3_8.method83();
					this.anInt858 = this.aClass1_Sub1_Sub3_8.method82();
					this.aClass1_Sub1_Sub3_8.method75();
					this.anInt1086 = this.aClass1_Sub1_Sub3_8.method57();
					this.anInt940 = this.aClass1_Sub1_Sub3_8.method57();
					this.anInt876 = this.aClass1_Sub1_Sub3_8.method89(anInt975);
					this.anInt1039 = this.aClass1_Sub1_Sub3_8.method83();
					this.anInt872 = this.aClass1_Sub1_Sub3_8.method82();
					signlink.dnslookup(Class49.method571(this.anInt876));
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 == 32) {
					local1114 = this.aClass1_Sub1_Sub3_8.method62();
					local214 = this.aClass1_Sub1_Sub3_8.method74((byte) 7);
					local350 = this.aClass1_Sub1_Sub3_8.method73();
					if (local350 >= 1 && local350 <= 5) {
						if (local1114.equalsIgnoreCase("null")) {
							local1114 = null;
						}
						this.aStringArray14[local350 - 1] = local1114;
						this.aBooleanArray11[local350 - 1] = local214 == 0;
					}
					this.anInt1077 = -1;
					return true;
				}
				if (this.anInt1077 != 221 && this.anInt1077 != 141) {
					if (this.anInt1077 == 160) {
						this.anInt867 = this.aClass1_Sub1_Sub3_8.method55();
						if (this.anInt867 == 1) {
							this.anInt918 = this.aClass1_Sub1_Sub3_8.method57();
						}
						if (this.anInt867 >= 2 && this.anInt867 <= 6) {
							if (this.anInt867 == 2) {
								this.anInt913 = 64;
								this.anInt914 = 64;
							}
							if (this.anInt867 == 3) {
								this.anInt913 = 0;
								this.anInt914 = 64;
							}
							if (this.anInt867 == 4) {
								this.anInt913 = 128;
								this.anInt914 = 64;
							}
							if (this.anInt867 == 5) {
								this.anInt913 = 64;
								this.anInt914 = 0;
							}
							if (this.anInt867 == 6) {
								this.anInt913 = 64;
								this.anInt914 = 128;
							}
							this.anInt867 = 2;
							this.anInt910 = this.aClass1_Sub1_Sub3_8.method57();
							this.anInt911 = this.aClass1_Sub1_Sub3_8.method57();
							this.anInt912 = this.aClass1_Sub1_Sub3_8.method55();
						}
						if (this.anInt867 == 10) {
							this.anInt868 = this.aClass1_Sub1_Sub3_8.method57();
						}
						this.anInt1077 = -1;
						return true;
					}
					if (this.anInt1077 == 177) {
						this.anInt926 = this.aClass1_Sub1_Sub3_8.method55();
						this.anInt1050 = this.aClass1_Sub1_Sub3_8.method55();
						this.anInt895 = this.aClass1_Sub1_Sub3_8.method55();
						this.aBoolean229 = true;
						this.aBoolean256 = true;
						this.anInt1077 = -1;
						return true;
					}
					if (this.anInt1077 == 209) {
						local161 = this.aClass1_Sub1_Sub3_8.method74((byte) 7);
						local214 = this.aClass1_Sub1_Sub3_8.method83();
						if (local214 == 65535) {
							local214 = -1;
						}
						if (this.anIntArray243[local161] != local214) {
							this.method707(this.anIntArray243[local161]);
							this.anIntArray243[local161] = local214;
						}
						this.aBoolean245 = true;
						this.aBoolean219 = true;
						this.anInt1077 = -1;
						return true;
					}
					if (this.anInt1077 == 23) {
						this.anInt871 = this.aClass1_Sub1_Sub3_8.method57();
						this.anInt869 = this.aClass1_Sub1_Sub3_8.method55();
						this.anInt1077 = -1;
						return true;
					}
					if (this.anInt1077 != 151) {
						if (this.anInt1077 == 54) {
							local161 = this.aClass1_Sub1_Sub3_8.method82();
							local344 = Class44.method544(local161);
							for (local350 = 0; local350 < local344.anIntArray192.length; local350++) {
								local344.anIntArray192[local350] = -1;
								local344.anIntArray192[local350] = 0;
							}
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 126 || this.anInt1077 == 110 || this.anInt1077 == 193 || this.anInt1077 == 132 || this.anInt1077 == 102 || this.anInt1077 == 85 || this.anInt1077 == 118 || this.anInt1077 == 142 || this.anInt1077 == 80 || this.anInt1077 == 203 || this.anInt1077 == 38) {
							this.method661(this.anInt1077, this.aClass1_Sub1_Sub3_8, 751);
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 186) {
							this.aBoolean243 = false;
							this.anInt938 = 2;
							this.aString22 = "";
							this.aBoolean256 = true;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 88) {
							local161 = this.aClass1_Sub1_Sub3_8.method84();
							this.method668(local161);
							if (this.anInt1071 != -1) {
								this.method707(this.anInt1071);
								this.anInt1071 = -1;
								this.aBoolean245 = true;
								this.aBoolean219 = true;
							}
							if (this.anInt1091 != -1) {
								this.method707(this.anInt1091);
								this.anInt1091 = -1;
								this.aBoolean256 = true;
							}
							if (this.anInt1090 != -1) {
								this.method707(this.anInt1090);
								this.anInt1090 = -1;
								this.aBoolean259 = true;
							}
							if (this.anInt1085 != -1) {
								this.method707(this.anInt1085);
								this.anInt1085 = -1;
							}
							if (this.anInt1007 != local161) {
								this.method707(this.anInt1007);
								this.anInt1007 = local161;
							}
							if (this.anInt938 != 0) {
								this.anInt938 = 0;
								this.aBoolean256 = true;
							}
							this.aBoolean247 = false;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 93) {
							local161 = this.aClass1_Sub1_Sub3_8.method85(this.aByte36);
							if (local161 >= 0) {
								this.method668(local161);
							}
							if (local161 != this.anInt948) {
								this.method707(this.anInt948);
								this.anInt948 = local161;
							}
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 166) {
							local161 = this.aClass1_Sub1_Sub3_8.method57();
							local214 = this.aClass1_Sub1_Sub3_8.method83();
							local350 = this.aClass1_Sub1_Sub3_8.method84();
							if (local161 == 65535) {
								Class44.method544(local214).anInt748 = 0;
								this.anInt1077 = -1;
								return true;
							}
							@Pc(3521) Class23 local3521 = Class23.method248(local161);
							Class44.method544(local214).anInt748 = 4;
							Class44.method544(local214).anInt749 = local161;
							Class44.method544(local214).anInt725 = local3521.anInt361;
							Class44.method544(local214).anInt726 = local3521.anInt383;
							Class44.method544(local214).anInt724 = local3521.anInt366 * 100 / local350;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 14) {
							this.aBoolean245 = true;
							local161 = this.aClass1_Sub1_Sub3_8.method57();
							local344 = Class44.method544(local161);
							local350 = this.aClass1_Sub1_Sub3_8.method57();
							for (local354 = 0; local354 < local350; local354++) {
								local344.anIntArray192[local354] = this.aClass1_Sub1_Sub3_8.method84();
								local358 = this.aClass1_Sub1_Sub3_8.method74((byte) 7);
								if (local358 == 255) {
									local358 = this.aClass1_Sub1_Sub3_8.method60();
								}
								local344.anIntArray193[local354] = local358;
							}
							for (local358 = local350; local358 < local344.anIntArray192.length; local358++) {
								local344.anIntArray192[local358] = 0;
								local344.anIntArray193[local358] = 0;
							}
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 24) {
							this.aBoolean243 = false;
							this.anInt938 = 1;
							this.aString22 = "";
							this.aBoolean256 = true;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 133) {
							local1114 = this.aClass1_Sub1_Sub3_8.method62();
							local214 = this.aClass1_Sub1_Sub3_8.method84();
							Class44.method544(local214).aString12 = local1114;
							@Pc(3675) int local3675 = this.anIntArray243[this.anInt1005];
							if (Class44.method544(local214).anInt750 == local3675) {
								this.aBoolean245 = true;
							}
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 156) {
							local161 = this.aClass1_Sub1_Sub3_8.method57();
							local214 = this.aClass1_Sub1_Sub3_8.method84();
							local217 = Class44.method544(local214);
							if (local217 != null && local217.anInt734 == 0) {
								if (local161 < 0) {
									local161 = 0;
								}
								if (local161 > local217.anInt740 - local217.anInt747) {
									local161 = local217.anInt740 - local217.anInt747;
								}
								local217.anInt738 = local161;
							}
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 2) {
							this.anInt935 = 0;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 68) {
							this.method701(591, this.aClass1_Sub1_Sub3_8, this.anInt1076);
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 96) {
							local161 = this.aClass1_Sub1_Sub3_8.method57();
							local214 = this.aClass1_Sub1_Sub3_8.method55();
							local350 = this.aClass1_Sub1_Sub3_8.method57();
							if (local350 == 65535) {
								if (this.anInt988 < 50) {
									this.anIntArray225[this.anInt988] = (short) local161;
									this.anIntArray245[this.anInt988] = local214;
									this.anIntArray247[this.anInt988] = 0;
									this.anInt988++;
								}
							} else if (this.aBoolean239 && !aBoolean228 && this.anInt988 < 50) {
								this.anIntArray225[this.anInt988] = local161;
								this.anIntArray245[this.anInt988] = local214;
								this.anIntArray247[this.anInt988] = local350 + Class3.anIntArray1[local161];
								this.anInt988++;
							}
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 185) {
							local161 = this.aClass1_Sub1_Sub3_8.method84();
							local214 = this.aClass1_Sub1_Sub3_8.method84();
							Class44.method544(local161).anInt748 = 2;
							Class44.method544(local161).anInt749 = local214;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 95) {
							local161 = this.aClass1_Sub1_Sub3_8.method82();
							Class44.method544(local161).anInt748 = 3;
							if (aClass1_Sub1_Sub1_Sub3_Sub2_1.aClass37_2 == null) {
								Class44.method544(local161).anInt749 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray129[0] << 25) + (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray129[4] << 20) + (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray130[0] << 15) + (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray130[8] << 10) + (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray130[11] << 5) + aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray130[1];
							} else {
								Class44.method544(local161).anInt749 = (int) (aClass1_Sub1_Sub1_Sub3_Sub2_1.aClass37_2.aLong24 + 305419896L);
							}
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 165) {
							local161 = this.aClass1_Sub1_Sub3_8.method84();
							local214 = this.aClass1_Sub1_Sub3_8.method84();
							local350 = this.aClass1_Sub1_Sub3_8.method83();
							Class44.method544(local214).anInt731 = (local161 << 16) + local350;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 25) {
							local161 = this.aClass1_Sub1_Sub3_8.method55();
							local214 = this.aClass1_Sub1_Sub3_8.method55();
							local350 = this.aClass1_Sub1_Sub3_8.method55();
							local354 = this.aClass1_Sub1_Sub3_8.method55();
							this.aBooleanArray12[local161] = true;
							this.anIntArray229[local161] = local214;
							this.anIntArray248[local161] = local350;
							this.anIntArray233[local161] = local354;
							this.anIntArray258[local161] = 0;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 240) {
							local161 = this.aClass1_Sub1_Sub3_8.method84();
							local214 = this.aClass1_Sub1_Sub3_8.method57();
							if (this.anInt1091 != -1) {
								this.method707(this.anInt1091);
								this.anInt1091 = -1;
								this.aBoolean256 = true;
							}
							if (this.anInt1090 != -1) {
								this.method707(this.anInt1090);
								this.anInt1090 = -1;
								this.aBoolean259 = true;
							}
							if (this.anInt1085 != -1) {
								this.method707(this.anInt1085);
								this.anInt1085 = -1;
							}
							if (this.anInt1007 != local161) {
								this.method707(this.anInt1007);
								this.anInt1007 = local161;
							}
							if (this.anInt1071 != local214) {
								this.method707(this.anInt1071);
								this.anInt1071 = local214;
							}
							if (this.anInt938 != 0) {
								this.anInt938 = 0;
								this.aBoolean256 = true;
							}
							this.aBoolean245 = true;
							this.aBoolean219 = true;
							this.aBoolean247 = false;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 226) {
							local161 = this.aClass1_Sub1_Sub3_8.method82();
							this.method668(local161);
							if (this.anInt1071 != -1) {
								this.method707(this.anInt1071);
								this.anInt1071 = -1;
								this.aBoolean245 = true;
								this.aBoolean219 = true;
							}
							if (this.anInt1090 != -1) {
								this.method707(this.anInt1090);
								this.anInt1090 = -1;
								this.aBoolean259 = true;
							}
							if (this.anInt1085 != -1) {
								this.method707(this.anInt1085);
								this.anInt1085 = -1;
							}
							if (this.anInt1007 != -1) {
								this.method707(this.anInt1007);
								this.anInt1007 = -1;
							}
							if (this.anInt1091 != local161) {
								this.method707(this.anInt1091);
								this.anInt1091 = local161;
							}
							this.aBoolean247 = false;
							this.aBoolean256 = true;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 18) {
							this.anInt1029 = this.aClass1_Sub1_Sub3_8.method55();
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 219) {
							for (local161 = 0; local161 < this.aClass1_Sub1_Sub1_Sub3_Sub2Array1.length; local161++) {
								if (this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local161] != null) {
									this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local161].anInt419 = -1;
								}
							}
							for (local214 = 0; local214 < this.aClass1_Sub1_Sub1_Sub3_Sub1Array1.length; local214++) {
								if (this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local214] != null) {
									this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local214].anInt419 = -1;
								}
							}
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 13) {
							local161 = this.aClass1_Sub1_Sub3_8.method57();
							local214 = this.aClass1_Sub1_Sub3_8.method83();
							local350 = this.aClass1_Sub1_Sub3_8.method84();
							local354 = this.aClass1_Sub1_Sub3_8.method83();
							Class44.method544(local214).anInt725 = local350;
							Class44.method544(local214).anInt726 = local354;
							Class44.method544(local214).anInt724 = local161;
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 241) {
							if (this.anInt1005 == 12) {
								this.aBoolean245 = true;
							}
							this.anInt973 = this.aClass1_Sub1_Sub3_8.method58();
							this.anInt1077 = -1;
							return true;
						}
						if (this.anInt1077 == 137) {
							this.aBoolean226 = true;
							this.anInt1040 = this.aClass1_Sub1_Sub3_8.method55();
							this.anInt1041 = this.aClass1_Sub1_Sub3_8.method55();
							this.anInt1042 = this.aClass1_Sub1_Sub3_8.method57();
							this.anInt1043 = this.aClass1_Sub1_Sub3_8.method55();
							this.anInt1044 = this.aClass1_Sub1_Sub3_8.method55();
							if (this.anInt1044 >= 100) {
								local161 = this.anInt1040 * 128 + 64;
								local214 = this.anInt1041 * 128 + 64;
								local350 = this.method611(local214, this.anInt1027, local161) - this.anInt1042;
								local354 = local161 - this.anInt887;
								local358 = local350 - this.anInt888;
								local1132 = local214 - this.anInt889;
								local1407 = (int) Math.sqrt((double) (local354 * local354 + local1132 * local1132));
								this.anInt890 = (int) (Math.atan2((double) local358, (double) local1407) * 325.949D) & 0x7FF;
								this.anInt891 = (int) (Math.atan2((double) local354, (double) local1132) * -325.949D) & 0x7FF;
								if (this.anInt890 < 128) {
									this.anInt890 = 128;
								}
								if (this.anInt890 > 383) {
									this.anInt890 = 383;
								}
							}
							this.anInt1077 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt1077 + "," + this.anInt1076 + " - " + this.anInt956 + "," + this.anInt957);
						this.method607();
						return true;
					}
					this.anInt1038 = this.aClass1_Sub1_Sub3_8.method73();
					this.anInt1037 = this.aClass1_Sub1_Sub3_8.method75();
					while (this.aClass1_Sub1_Sub3_8.anInt78 < this.anInt1076) {
						local161 = this.aClass1_Sub1_Sub3_8.method55();
						this.method661(local161, this.aClass1_Sub1_Sub3_8, 751);
					}
					this.anInt1077 = -1;
					return true;
				}
				local161 = this.anInt970;
				local214 = this.anInt971;
				if (this.anInt1077 == 221) {
					local161 = this.aClass1_Sub1_Sub3_8.method83();
					local214 = this.aClass1_Sub1_Sub3_8.method83();
					this.aBoolean249 = false;
				}
				if (this.anInt1077 == 141) {
					this.aClass1_Sub1_Sub3_8.method65();
					local350 = 0;
					while (true) {
						if (local350 >= 4) {
							this.aClass1_Sub1_Sub3_8.method67(502);
							local161 = this.aClass1_Sub1_Sub3_8.method84();
							local214 = this.aClass1_Sub1_Sub3_8.method84();
							this.aBoolean249 = true;
							break;
						}
						for (local354 = 0; local354 < 13; local354++) {
							for (local358 = 0; local358 < 13; local358++) {
								local1132 = this.aClass1_Sub1_Sub3_8.method66(1);
								if (local1132 == 1) {
									this.anIntArrayArrayArray7[local350][local354][local358] = this.aClass1_Sub1_Sub3_8.method66(26);
								} else {
									this.anIntArrayArrayArray7[local350][local354][local358] = -1;
								}
							}
						}
						local350++;
					}
				}
				if (this.anInt970 == local161 && this.anInt971 == local214 && this.anInt944 == 2) {
					this.anInt1077 = -1;
					return true;
				}
				this.anInt970 = local161;
				this.anInt971 = local214;
				this.anInt999 = (this.anInt970 - 6) * 8;
				this.anInt1000 = (this.anInt971 - 6) * 8;
				this.aBoolean241 = false;
				if ((this.anInt970 / 8 == 48 || this.anInt970 / 8 == 49) && this.anInt971 / 8 == 48) {
					this.aBoolean241 = true;
				}
				if (this.anInt970 / 8 == 48 && this.anInt971 / 8 == 148) {
					this.aBoolean241 = true;
				}
				this.anInt944 = 1;
				this.aLong33 = System.currentTimeMillis();
				this.method608(null, "Loading - please wait.");
				if (this.anInt1077 == 221) {
					local350 = 0;
					local354 = (this.anInt970 - 6) / 8;
					label1212: while (true) {
						if (local354 > (this.anInt970 + 6) / 8) {
							this.aByteArrayArray5 = new byte[local350][];
							this.aByteArrayArray6 = new byte[local350][];
							this.anIntArray267 = new int[local350];
							this.anIntArray268 = new int[local350];
							this.anIntArray269 = new int[local350];
							local350 = 0;
							local358 = (this.anInt970 - 6) / 8;
							while (true) {
								if (local358 > (this.anInt970 + 6) / 8) {
									break label1212;
								}
								for (local1132 = (this.anInt971 - 6) / 8; local1132 <= (this.anInt971 + 6) / 8; local1132++) {
									this.anIntArray267[local350] = (local358 << 8) + local1132;
									if (this.aBoolean241 && (local1132 == 49 || local1132 == 149 || local1132 == 147 || local358 == 50 || local358 == 49 && local1132 == 47)) {
										this.anIntArray268[local350] = -1;
										this.anIntArray269[local350] = -1;
										local350++;
									} else {
										local1407 = this.anIntArray268[local350] = this.aClass36_Sub1_1.method505(local358, 0, local1132);
										if (local1407 != -1) {
											this.aClass36_Sub1_1.method507(3, local1407);
										}
										local1440 = this.anIntArray269[local350] = this.aClass36_Sub1_1.method505(local358, 1, local1132);
										if (local1440 != -1) {
											this.aClass36_Sub1_1.method507(3, local1440);
										}
										local350++;
									}
								}
								local358++;
							}
						}
						for (local358 = (this.anInt971 - 6) / 8; local358 <= (this.anInt971 + 6) / 8; local358++) {
							local350++;
						}
						local354++;
					}
				}
				if (this.anInt1077 == 141) {
					local350 = 0;
					@Pc(2520) int[] local2520 = new int[676];
					local358 = 0;
					label1173: while (true) {
						@Pc(2550) int local2550;
						@Pc(2556) int local2556;
						@Pc(2566) int local2566;
						if (local358 >= 4) {
							this.aByteArrayArray5 = new byte[local350][];
							this.aByteArrayArray6 = new byte[local350][];
							this.anIntArray267 = new int[local350];
							this.anIntArray268 = new int[local350];
							this.anIntArray269 = new int[local350];
							local1132 = 0;
							while (true) {
								if (local1132 >= local350) {
									break label1173;
								}
								local1407 = this.anIntArray267[local1132] = local2520[local1132];
								local1440 = local1407 >> 8 & 0xFF;
								local2550 = local1407 & 0xFF;
								local2556 = this.anIntArray268[local1132] = this.aClass36_Sub1_1.method505(local1440, 0, local2550);
								if (local2556 != -1) {
									this.aClass36_Sub1_1.method507(3, local2556);
								}
								local2566 = this.anIntArray269[local1132] = this.aClass36_Sub1_1.method505(local1440, 1, local2550);
								if (local2566 != -1) {
									this.aClass36_Sub1_1.method507(3, local2566);
								}
								local1132++;
							}
						}
						for (local1132 = 0; local1132 < 13; local1132++) {
							for (local1407 = 0; local1407 < 13; local1407++) {
								local1440 = this.anIntArrayArrayArray7[local358][local1132][local1407];
								if (local1440 != -1) {
									local2550 = local1440 >> 14 & 0x3FF;
									local2556 = local1440 >> 3 & 0x7FF;
									local2566 = (local2550 / 8 << 8) + local2556 / 8;
									for (@Pc(2568) int local2568 = 0; local2568 < local350; local2568++) {
										if (local2520[local2568] == local2566) {
											local2566 = -1;
											break;
										}
									}
									if (local2566 != -1) {
										local2520[local350++] = local2566;
									}
								}
							}
						}
						local358++;
					}
				}
				local350 = this.anInt999 - this.anInt1001;
				local354 = this.anInt1000 - this.anInt1002;
				this.anInt1001 = this.anInt999;
				this.anInt1002 = this.anInt1000;
				for (local358 = 0; local358 < 16384; local358++) {
					@Pc(2721) Class1_Sub1_Sub1_Sub3_Sub1 local2721 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local358];
					if (local2721 != null) {
						for (local1407 = 0; local1407 < 10; local1407++) {
							local2721.anIntArray127[local1407] -= local350;
							local2721.anIntArray128[local1407] -= local354;
						}
						local2721.anInt424 -= local350 * 128;
						local2721.anInt425 -= local354 * 128;
					}
				}
				for (local1132 = 0; local1132 < this.anInt903; local1132++) {
					@Pc(2776) Class1_Sub1_Sub1_Sub3_Sub2 local2776 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local1132];
					if (local2776 != null) {
						for (local1440 = 0; local1440 < 10; local1440++) {
							local2776.anIntArray127[local1440] -= local350;
							local2776.anIntArray128[local1440] -= local354;
						}
						local2776.anInt424 -= local350 * 128;
						local2776.anInt425 -= local354 * 128;
					}
				}
				this.aBoolean231 = true;
				@Pc(2828) byte local2828 = 0;
				@Pc(2830) byte local2830 = 104;
				@Pc(2832) byte local2832 = 1;
				if (local350 < 0) {
					local2828 = 103;
					local2830 = -1;
					local2832 = -1;
				}
				@Pc(2842) byte local2842 = 0;
				@Pc(2844) byte local2844 = 104;
				@Pc(2846) byte local2846 = 1;
				if (local354 < 0) {
					local2842 = 103;
					local2844 = -1;
					local2846 = -1;
				}
				for (@Pc(2856) int local2856 = local2828; local2856 != local2830; local2856 += local2832) {
					for (@Pc(2860) int local2860 = local2842; local2860 != local2844; local2860 += local2846) {
						@Pc(2866) int local2866 = local2856 + local350;
						@Pc(2870) int local2870 = local2860 + local354;
						for (@Pc(2872) int local2872 = 0; local2872 < 4; local2872++) {
							if (local2866 >= 0 && local2870 >= 0 && local2866 < 104 && local2870 < 104) {
								this.aClass41ArrayArrayArray1[local2872][local2856][local2860] = this.aClass41ArrayArrayArray1[local2872][local2866][local2870];
							} else {
								this.aClass41ArrayArrayArray1[local2872][local2856][local2860] = null;
							}
						}
					}
				}
				for (@Pc(2934) Class1_Sub2 local2934 = (Class1_Sub2) this.aClass41_11.method534(); local2934 != null; local2934 = (Class1_Sub2) this.aClass41_11.method536()) {
					local2934.anInt189 -= local350;
					local2934.anInt190 -= local354;
					if (local2934.anInt189 < 0 || local2934.anInt190 < 0 || local2934.anInt189 >= 104 || local2934.anInt190 >= 104) {
						local2934.method552();
					}
				}
				if (this.anInt935 != 0) {
					this.anInt935 -= local350;
					this.anInt936 -= local354;
				}
				this.aBoolean226 = false;
				this.anInt1077 = -1;
				return true;
			} catch (@Pc(4513) IOException local4513) {
				this.method690();
			} catch (@Pc(4518) Exception local4518) {
				local1114 = "T2 - " + this.anInt1077 + "," + this.anInt956 + "," + this.anInt957 + " - " + this.anInt1076 + "," + (this.anInt999 + aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0]) + "," + (this.anInt1000 + aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0]) + " - ";
				for (local214 = 0; local214 < this.anInt1076 && local214 < 50; local214++) {
					local1114 = local1114 + this.aClass1_Sub1_Sub3_8.aByteArray8[local214] + ",";
				}
				signlink.reporterror(local1114);
				this.method607();
			}
			return true;
		} catch (@Pc(4599) RuntimeException local4599) {
			signlink.reporterror("59336, " + false + ", " + local4599.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MDBQGDOL;Lclient!CMGGUSPR;ZI)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3) {
				@Pc(12) int local12;
				@Pc(16) int local16;
				if ((arg0 & 0x4) != 0) {
					local12 = arg2.method75();
					local16 = arg2.method75();
					arg1.method263(anInt1011, (byte) 5, local16, local12);
					arg1.anInt431 = anInt1011 + 300;
					arg1.anInt432 = arg2.method74((byte) 7);
					arg1.anInt433 = arg2.method74((byte) 7);
				}
				if ((arg0 & 0x8) != 0) {
					arg1.anInt414 = arg2.method57();
					if (arg1.anInt414 == 65535) {
						arg1.anInt414 = -1;
					}
				}
				if ((arg0 & 0x40) != 0) {
					local12 = arg2.method75();
					@Pc(63) byte[] local63 = new byte[local12];
					@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3(local63, anInt972);
					arg2.method91(local12, local63, 137);
					this.aClass1_Sub1_Sub3Array1[arg4] = local69;
					arg1.method269(local69);
				}
				if ((arg0 & 0x200) != 0) {
					arg1.anInt398 = arg2.method82();
					local12 = arg2.method89(anInt975);
					arg1.anInt402 = local12 >> 16;
					arg1.anInt401 = anInt1011 + (local12 & 0xFFFF);
					arg1.anInt399 = 0;
					arg1.anInt400 = 0;
					if (arg1.anInt401 > anInt1011) {
						arg1.anInt399 = -1;
					}
					if (arg1.anInt398 == 65535) {
						arg1.anInt398 = -1;
					}
				}
				if ((arg0 & 0x2) != 0) {
					arg1.anInt435 = arg2.method84();
					arg1.anInt436 = arg2.method57();
				}
				if ((arg0 & 0x400) != 0) {
					arg1.anInt404 = arg2.method55();
					arg1.anInt406 = arg2.method55();
					arg1.anInt405 = arg2.method74((byte) 7);
					arg1.anInt407 = arg2.method74((byte) 7);
					arg1.anInt408 = arg2.method83() + anInt1011;
					arg1.anInt409 = arg2.method83() + anInt1011;
					arg1.anInt410 = arg2.method74((byte) 7);
					arg1.method266();
				}
				@Pc(202) int local202;
				if ((arg0 & 0x80) != 0) {
					local12 = arg2.method84();
					local16 = arg2.method73();
					local202 = arg2.method73();
					@Pc(205) int local205 = arg2.anInt78;
					if (arg1.aString7 != null && arg1.aBoolean90) {
						@Pc(215) long local215 = Class49.method568(arg1.aString7);
						@Pc(217) boolean local217 = false;
						if (local16 <= 1) {
							for (@Pc(222) int local222 = 0; local222 < this.anInt1089; local222++) {
								if (this.aLongArray4[local222] == local215) {
									local217 = true;
									break;
								}
							}
						}
						if (!local217 && this.anInt1035 == 0) {
							try {
								this.aClass1_Sub1_Sub3_6.anInt78 = 0;
								arg2.method64(this.aClass1_Sub1_Sub3_6.aByteArray8, local202);
								this.aClass1_Sub1_Sub3_6.anInt78 = 0;
								@Pc(268) String local268 = Class33.method392(local202, this.aClass1_Sub1_Sub3_6, this.aBoolean230);
								@Pc(272) String local272 = Class25.method280(local268);
								arg1.aString6 = local272;
								arg1.anInt392 = local12 >> 8;
								arg1.anInt415 = local12 & 0xFF;
								arg1.anInt397 = 150;
								if (local16 == 2 || local16 == 3) {
									this.method664("@cr2@" + arg1.aString7, local272, 1);
								} else if (local16 == 1) {
									this.method664("@cr1@" + arg1.aString7, local272, 1);
								} else {
									this.method664(arg1.aString7, local272, 2);
								}
							} catch (@Pc(336) Exception local336) {
								signlink.reporterror("cde2");
							}
						}
					}
					arg2.anInt78 = local205 + local202;
				}
				if ((arg0 & 0x10) != 0) {
					arg1.aString6 = arg2.method62();
					if (arg1.aString6.charAt(0) == '~') {
						arg1.aString6 = arg1.aString6.substring(1);
						this.method664(arg1.aString7, arg1.aString6, 2);
					} else if (arg1 == aClass1_Sub1_Sub1_Sub3_Sub2_1) {
						this.method664(arg1.aString7, arg1.aString6, 2);
					}
					arg1.anInt392 = 0;
					arg1.anInt415 = 0;
					arg1.anInt397 = 150;
				}
				if ((arg0 & 0x20) != 0) {
					local12 = arg2.method82();
					if (local12 == 65535) {
						local12 = -1;
					}
					local16 = arg2.method74((byte) 7);
					if (local12 == arg1.anInt419 && local12 != -1) {
						local202 = Class46.aClass46Array1[local12].anInt779;
						if (local202 == 1) {
							arg1.anInt420 = 0;
							arg1.anInt421 = 0;
							arg1.anInt422 = local16;
							arg1.anInt423 = 0;
						}
						if (local202 == 2) {
							arg1.anInt423 = 0;
						}
					} else if (local12 == -1 || arg1.anInt419 == -1 || Class46.aClass46Array1[local12].anInt773 >= Class46.aClass46Array1[arg1.anInt419].anInt773) {
						arg1.anInt419 = local12;
						arg1.anInt420 = 0;
						arg1.anInt421 = 0;
						arg1.anInt422 = local16;
						arg1.anInt423 = 0;
						arg1.anInt438 = arg1.anInt428;
					}
				}
				if ((arg0 & 0x100) != 0) {
					local12 = arg2.method73();
					local16 = arg2.method73();
					arg1.method263(anInt1011, (byte) 5, local16, local12);
					arg1.anInt431 = anInt1011 + 300;
					arg1.anInt432 = arg2.method75();
					arg1.anInt433 = arg2.method55();
				}
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("89999, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method631() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(this.aClass38_2, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(this.aClass38_2, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array5 = new Class1_Sub1_Sub2_Sub3[12];
			for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
				this.aClass1_Sub1_Sub2_Sub3Array5[local33] = new Class1_Sub1_Sub2_Sub3(this.aClass38_2, "runes", local33);
			}
			this.aClass1_Sub1_Sub2_Sub4_11 = new Class1_Sub1_Sub2_Sub4(128, 265);
			this.aClass1_Sub1_Sub2_Sub4_12 = new Class1_Sub1_Sub2_Sub4(128, 265);
			for (@Pc(66) int local66 = 0; local66 < 33920; local66++) {
				this.aClass1_Sub1_Sub2_Sub4_11.anIntArray171[local66] = this.aClass17_18.anIntArray114[local66];
			}
			for (@Pc(84) int local84 = 0; local84 < 33920; local84++) {
				this.aClass1_Sub1_Sub2_Sub4_12.anIntArray171[local84] = this.aClass17_19.anIntArray114[local84];
			}
			this.anIntArray260 = new int[256];
			for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
				this.anIntArray260[local106] = local106 * 262144;
			}
			for (@Pc(121) int local121 = 0; local121 < 64; local121++) {
				this.anIntArray260[local121 + 64] = local121 * 1024 + 16711680;
			}
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray260[local140 + 128] = local140 * 4 + 16776960;
			}
			for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
				this.anIntArray260[local159 + 192] = 16777215;
			}
			this.anIntArray261 = new int[256];
			for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
				this.anIntArray261[local178] = local178 * 1024;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray261[local193 + 64] = local193 * 4 + 65280;
			}
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray261[local212 + 128] = local212 * 262144 + 65535;
			}
			for (@Pc(231) int local231 = 0; local231 < 64; local231++) {
				this.anIntArray261[local231 + 192] = 16777215;
			}
			this.anIntArray262 = new int[256];
			for (@Pc(250) int local250 = 0; local250 < 64; local250++) {
				this.anIntArray262[local250] = local250 * 4;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray262[local265 + 64] = local265 * 262144 + 255;
			}
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray262[local284 + 128] = local284 * 1024 + 16711935;
			}
			for (@Pc(303) int local303 = 0; local303 < 64; local303++) {
				this.anIntArray262[local303 + 192] = 16777215;
			}
			this.anIntArray259 = new int[256];
			this.anIntArray230 = new int[32768];
			this.anIntArray231 = new int[32768];
			this.method647(null);
			this.anIntArray249 = new int[32768];
			this.anIntArray250 = new int[32768];
			this.method586("Connecting to fileserver", 10);
			if (!this.aBoolean251) {
				this.aBoolean252 = true;
				this.aBoolean251 = true;
				this.method585(this, 2);
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("63813, " + -19609 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
	private boolean method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) boolean local10 = false;
			@Pc(13) Class44 local13 = Class44.method544(arg1);
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray195.length && local13.anIntArray195[local15] != -1; local15++) {
				@Pc(29) Class44 local29 = Class44.method544(local13.anIntArray195[local15]);
				if (local29.anInt734 == 0) {
					local10 |= this.method632(arg0, local29.anInt758);
				}
				@Pc(63) int local63;
				if (local29.anInt734 == 6 && (local29.anInt760 != -1 || local29.anInt761 != -1)) {
					@Pc(58) boolean local58 = this.method601(local29);
					if (local58) {
						local63 = local29.anInt761;
					} else {
						local63 = local29.anInt760;
					}
					if (local63 != -1) {
						@Pc(75) Class46 local75 = Class46.aClass46Array1[local63];
						local29.anInt759 += arg0;
						while (local29.anInt759 > local75.method550(local29.anInt737)) {
							local29.anInt759 -= local75.method550(local29.anInt737) + 1;
							local29.anInt737++;
							if (local29.anInt737 >= local75.anInt771) {
								local29.anInt737 -= local75.anInt772;
								if (local29.anInt737 < 0 || local29.anInt737 >= local75.anInt771) {
									local29.anInt737 = 0;
								}
							}
							local10 = true;
						}
					}
				}
				if (local29.anInt734 == 6 && local29.anInt731 != 0) {
					@Pc(146) int local146 = local29.anInt731 >> 16;
					local63 = local29.anInt731 << 16 >> 16;
					@Pc(157) int local157 = local146 * arg0;
					local63 *= arg0;
					local29.anInt725 = local29.anInt725 + local157 & 0x7FF;
					local29.anInt726 = local29.anInt726 + local63 & 0x7FF;
					local10 = true;
				}
			}
			return local10;
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("41165, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WJQTPVDG;I)Z")
	private boolean method633(@OriginalArg(0) Class44 arg0) {
		try {
			@Pc(12) int local12 = arg0.anInt730;
			if (this.anInt1073 == 2) {
				if (local12 == 201) {
					this.aBoolean256 = true;
					this.anInt938 = 0;
					this.aBoolean243 = true;
					this.aString20 = "";
					this.anInt945 = 1;
					this.aString19 = "Enter name of friend to add to list";
				}
				if (local12 == 202) {
					this.aBoolean256 = true;
					this.anInt938 = 0;
					this.aBoolean243 = true;
					this.aString20 = "";
					this.anInt945 = 2;
					this.aString19 = "Enter name of friend to delete from list";
				}
			}
			if (local12 == 205) {
				this.anInt1080 = 250;
				return true;
			}
			if (local12 == 501) {
				this.aBoolean256 = true;
				this.anInt938 = 0;
				this.aBoolean243 = true;
				this.aString20 = "";
				this.anInt945 = 4;
				this.aString19 = "Enter name of player to add to list";
			}
			if (local12 == 502) {
				this.aBoolean256 = true;
				this.anInt938 = 0;
				this.aBoolean243 = true;
				this.aString20 = "";
				this.anInt945 = 5;
				this.aString19 = "Enter name of player to delete from list";
			}
			@Pc(120) int local120;
			@Pc(124) int local124;
			@Pc(129) int local129;
			if (local12 >= 300 && local12 <= 313) {
				local120 = (local12 - 300) / 2;
				local124 = local12 & 0x1;
				local129 = this.anIntArray252[local120];
				if (local129 != -1) {
					while (true) {
						if (local124 == 0) {
							local129--;
							if (local129 < 0) {
								local129 = Class6.anInt66 - 1;
							}
						}
						if (local124 == 1) {
							local129++;
							if (local129 >= Class6.anInt66) {
								local129 = 0;
							}
						}
						if (!Class6.aClass6Array1[local129].aBoolean21 && Class6.aClass6Array1[local129].anInt67 == local120 + (this.aBoolean260 ? 0 : 7)) {
							this.anIntArray252[local120] = local129;
							this.aBoolean234 = true;
							break;
						}
					}
				}
			}
			if (local12 >= 314 && local12 <= 323) {
				local120 = (local12 - 314) / 2;
				local124 = local12 & 0x1;
				local129 = this.anIntArray276[local120];
				if (local124 == 0) {
					local129--;
					if (local129 < 0) {
						local129 = anIntArrayArray22[local120].length - 1;
					}
				}
				if (local124 == 1) {
					local129++;
					if (local129 >= anIntArrayArray22[local120].length) {
						local129 = 0;
					}
				}
				this.anIntArray276[local120] = local129;
				this.aBoolean234 = true;
			}
			if (local12 == 324 && !this.aBoolean260) {
				this.aBoolean260 = true;
				this.method682((byte) 8);
			}
			if (local12 == 325 && this.aBoolean260) {
				this.aBoolean260 = false;
				this.method682((byte) 8);
			}
			if (local12 == 326) {
				this.aClass1_Sub1_Sub3_9.method44(124, this.anInt902);
				this.aClass1_Sub1_Sub3_9.method45(this.aBoolean260 ? 0 : 1);
				for (local120 = 0; local120 < 7; local120++) {
					this.aClass1_Sub1_Sub3_9.method45(this.anIntArray252[local120]);
				}
				for (local124 = 0; local124 < 5; local124++) {
					this.aClass1_Sub1_Sub3_9.method45(this.anIntArray276[local124]);
				}
				return true;
			}
			if (local12 == 620) {
				this.aBoolean212 = !this.aBoolean212;
			}
			if (local12 >= 601 && local12 <= 613) {
				this.method644(this.aByte27);
				if (this.aString26.length() > 0) {
					this.aClass1_Sub1_Sub3_9.method44(207, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method51(Class49.method568(this.aString26));
					this.aClass1_Sub1_Sub3_9.method45(local12 - 601);
					this.aClass1_Sub1_Sub3_9.method45(this.aBoolean212 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("38703, " + arg0 + ", " + 3 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4 >= 1 && arg5 >= 1 && arg4 <= 102 && arg5 <= 102) {
				if (aBoolean228 && arg6 != this.anInt1027) {
					return;
				}
				@Pc(24) int local24 = 0;
				if (arg3 == 0) {
					local24 = this.aClass35_1.method422(arg6, arg4, arg5);
				}
				if (arg3 == 1) {
					local24 = this.aClass35_1.method423(arg4, arg6, arg5);
				}
				if (arg3 == 2) {
					local24 = this.aClass35_1.method424(arg6, arg4, arg5);
				}
				if (arg3 == 3) {
					local24 = this.aClass35_1.method425(arg6, arg4, arg5);
				}
				@Pc(80) int local80;
				if (local24 != 0) {
					local80 = this.aClass35_1.method426(arg6, arg4, arg5, local24);
					@Pc(86) int local86 = local24 >> 14 & 0x7FFF;
					@Pc(90) int local90 = local80 & 0x1F;
					@Pc(94) int local94 = local80 >> 6;
					@Pc(106) Class48 local106;
					if (arg3 == 0) {
						this.aClass35_1.method413(arg4, arg6, arg5);
						local106 = Class48.method567(local86);
						if (local106.aBoolean193) {
							this.aClass40Array1[arg6].method524(local90, local106.aBoolean190, arg5, local94, arg4);
						}
					}
					if (arg3 == 1) {
						this.aClass35_1.method414(arg4, arg5, arg6);
					}
					if (arg3 == 2) {
						this.aClass35_1.method415(757, arg6, arg5, arg4);
						local106 = Class48.method567(local86);
						if (arg4 + local106.anInt804 > 103 || arg5 + local106.anInt804 > 103 || arg4 + local106.anInt807 > 103 || arg5 + local106.anInt807 > 103) {
							return;
						}
						if (local106.aBoolean193) {
							this.aClass40Array1[arg6].method525(arg4, arg5, local94, local106.aBoolean190, local106.anInt807, local106.anInt804);
						}
					}
					if (arg3 == 3) {
						this.aClass35_1.method416(arg4, arg6, arg5);
						local106 = Class48.method567(local86);
						if (local106.aBoolean193 && local106.aBoolean198) {
							this.aClass40Array1[arg6].method527(arg5, arg4);
						}
					}
				}
				if (arg0 >= 0) {
					local80 = arg6;
					if (arg6 < 3 && (this.aByteArrayArrayArray8[1][arg4][arg5] & 0x2) == 2) {
						local80 = arg6 + 1;
					}
					Class16.method208(arg5, this.anIntArrayArrayArray8, local80, this.aClass35_1, arg4, arg2, this.aClass40Array1[arg6], arg6, arg0, arg1);
					return;
				}
			}
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("33582, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method635(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(17) int local17 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 + this.anInt920;
				@Pc(23) int local23 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 + this.anInt1031;
				if (this.anInt1021 - local17 < -500 || this.anInt1021 - local17 > 500 || this.anInt1022 - local23 < -500 || this.anInt1022 - local23 > 500) {
					this.anInt1021 = local17;
					this.anInt1022 = local23;
				}
				if (this.anInt1021 != local17) {
					this.anInt1021 += (local17 - this.anInt1021) / 16;
				}
				if (this.anInt1022 != local23) {
					this.anInt1022 += (local23 - this.anInt1022) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt984 += (-this.anInt984 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt984 += (24 - this.anInt984) / 2;
				} else {
					this.anInt984 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt985 += (12 - this.anInt985) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt985 += (-this.anInt985 - 12) / 2;
				} else {
					this.anInt985 /= 2;
				}
				this.anInt983 = this.anInt983 + this.anInt984 / 2 & 0x7FF;
				this.anInt982 += this.anInt985 / 2;
				if (this.anInt982 < 128) {
					this.anInt982 = 128;
				}
				if (this.anInt982 > 383) {
					this.anInt982 = 383;
				}
				@Pc(210) int local210 = this.anInt1021 >> 7;
				@Pc(215) int local215 = this.anInt1022 >> 7;
				@Pc(225) int local225 = this.method611(this.anInt1022, this.anInt1027, this.anInt1021);
				@Pc(227) int local227 = 0;
				@Pc(243) int local243;
				if (local210 > 3 && local215 > 3 && local210 < 100 && local215 < 100) {
					for (local243 = local210 - 4; local243 <= local210 + 4; local243++) {
						for (@Pc(249) int local249 = local215 - 4; local249 <= local215 + 4; local249++) {
							@Pc(254) int local254 = this.anInt1027;
							if (local254 < 3 && (this.aByteArrayArrayArray8[1][local243][local249] & 0x2) == 2) {
								local254++;
							}
							@Pc(281) int local281 = local225 - this.anIntArrayArrayArray8[local254][local243][local249];
							if (local281 > local227) {
								local227 = local281;
							}
						}
					}
				}
				local243 = local227 * 192;
				if (local243 > 98048) {
					local243 = 98048;
				}
				if (local243 < 32768) {
					local243 = 32768;
				}
				if (local243 > this.anInt861) {
					this.anInt861 += (local243 - this.anInt861) / 24;
				} else if (local243 < this.anInt861) {
					this.anInt861 += (local243 - this.anInt861) / 80;
				}
			} catch (@Pc(345) Exception local345) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 + "," + aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 + "," + this.anInt1021 + "," + this.anInt1022 + "," + this.anInt970 + "," + this.anInt971 + "," + this.anInt999 + "," + this.anInt1000);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("99057, " + arg0 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method636(@OriginalArg(0) byte arg0) {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub1_4.method109("Choose Option");
			@Pc(12) boolean local12 = false;
			@Pc(32) int local32;
			for (@Pc(21) int local21 = 0; local21 < this.anInt986; local21++) {
				local32 = this.aClass1_Sub1_Sub2_Sub1_4.method109(this.aStringArray8[local21]);
				if (local32 > local7) {
					local7 = local32;
				}
			}
			local7 += 8;
			local32 = this.anInt986 * 15 + 21;
			@Pc(75) int local75;
			@Pc(93) int local93;
			if (super.anInt853 > 4 && super.anInt854 > 4 && super.anInt853 < 516 && super.anInt854 < 338) {
				local75 = super.anInt853 - local7 / 2 - 4;
				if (local75 + local7 > 512) {
					local75 = 512 - local7;
				}
				if (local75 < 0) {
					local75 = 0;
				}
				local93 = super.anInt854 - 4;
				if (local93 + local32 > 334) {
					local93 = 334 - local32;
				}
				if (local93 < 0) {
					local93 = 0;
				}
				this.aBoolean242 = true;
				this.anInt965 = 0;
				this.anInt966 = local75;
				this.anInt967 = local93;
				this.anInt968 = local7;
				this.anInt969 = this.anInt986 * 15 + 22;
			}
			if (super.anInt853 > 553 && super.anInt854 > 205 && super.anInt853 < 743 && super.anInt854 < 466) {
				local75 = super.anInt853 - local7 / 2 - 553;
				if (local75 < 0) {
					local75 = 0;
				} else if (local75 + local7 > 190) {
					local75 = 190 - local7;
				}
				local93 = super.anInt854 - 205;
				if (local93 < 0) {
					local93 = 0;
				} else if (local93 + local32 > 261) {
					local93 = 261 - local32;
				}
				this.aBoolean242 = true;
				this.anInt965 = 1;
				this.anInt966 = local75;
				this.anInt967 = local93;
				this.anInt968 = local7;
				this.anInt969 = this.anInt986 * 15 + 22;
			}
			if (super.anInt853 > 17 && super.anInt854 > 357 && super.anInt853 < 496 && super.anInt854 < 453) {
				local75 = super.anInt853 - local7 / 2 - 17;
				if (local75 < 0) {
					local75 = 0;
				} else if (local75 + local7 > 479) {
					local75 = 479 - local7;
				}
				local93 = super.anInt854 - 357;
				if (local93 < 0) {
					local93 = 0;
				} else if (local93 + local32 > 96) {
					local93 = 96 - local32;
				}
				this.aBoolean242 = true;
				this.anInt965 = 2;
				this.anInt966 = local75;
				this.anInt967 = local93;
				this.anInt968 = local7;
				this.anInt969 = this.anInt986 * 15 + 22;
			}
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("32710, " + arg0 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!TPIBHECB;II)V")
	private void method637(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub4 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(29) int local29 = this.anInt983 + this.anInt941 & 0x7FF;
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub2.anIntArray60[local29];
				@Pc(37) int local37 = Class1_Sub1_Sub1_Sub2.anIntArray61[local29];
				@Pc(46) int local46 = local33 * 256 / (this.anInt1008 + 256);
				@Pc(55) int local55 = local37 * 256 / (this.anInt1008 + 256);
				@Pc(65) int local65 = arg0 * local46 + arg2 * local55 >> 16;
				@Pc(75) int local75 = arg0 * local55 - arg2 * local46 >> 16;
				@Pc(81) double local81 = Math.atan2((double) local65, (double) local75);
				@Pc(87) int local87 = (int) (Math.sin(local81) * 63.0D);
				@Pc(93) int local93 = (int) (Math.cos(local81) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub4_4.method478(this.anInt1087, local81, 83 - local93 - 20, local87 + 94 + 4 - 10);
			} else {
				this.method703(arg2, arg0, arg1);
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("96057, " + arg0 + ", " + arg1 + ", " + -42058 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method638(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1089; local8++) {
					if (this.aLongArray4[local8] == arg1) {
						this.anInt1089--;
						this.aBoolean245 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1089; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_9.method44(151, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method51(arg1);
						break;
					}
				}
				@Pc(67) boolean local67 = false;
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("77498, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BZ)V")
	private void method639(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.aBoolean223) {
				signlink.anInt1099 = arg2 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("93429, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass35_1.method422(arg4, arg2, arg0);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass35_1.method426(arg4, arg2, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg3;
				if (local8 > 0) {
					local30 = arg1;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub4_7.anIntArray171;
				local52 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class48 local61 = Class48.method567(local58);
				if (local61.anInt809 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array2[local61.anInt809];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt804 * 4 - local71.anInt522) / 2;
						@Pc(93) int local93 = (local61.anInt807 * 4 - local71.anInt523) / 2;
						local71.method371(arg2 * 4 + local83 + 48, this.aByte39, (104 - arg0 - local61.anInt807) * 4 + local93 + 48);
					}
				}
			}
			local8 = this.aClass35_1.method424(arg4, arg2, arg0);
			if (local8 != 0) {
				local18 = this.aClass35_1.method426(arg4, arg2, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(448) Class48 local448 = Class48.method567(local30);
				@Pc(480) int local480;
				if (local448.anInt809 != -1) {
					@Pc(458) Class1_Sub1_Sub2_Sub3 local458 = this.aClass1_Sub1_Sub2_Sub3Array2[local448.anInt809];
					if (local458 != null) {
						local58 = (local448.anInt804 * 4 - local458.anInt522) / 2;
						local480 = (local448.anInt807 * 4 - local458.anInt523) / 2;
						local458.method371(arg2 * 4 + local58 + 48, this.aByte39, (104 - arg0 - local448.anInt807) * 4 + local480 + 48);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(518) int[] local518 = this.aClass1_Sub1_Sub2_Sub4_7.anIntArray171;
					local480 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
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
			local8 = this.aClass35_1.method425(arg4, arg2, arg0);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(624) Class48 local624 = Class48.method567(local18);
				if (local624.anInt809 != -1) {
					@Pc(634) Class1_Sub1_Sub2_Sub3 local634 = this.aClass1_Sub1_Sub2_Sub3Array2[local624.anInt809];
					if (local634 != null) {
						local30 = (local624.anInt804 * 4 - local634.anInt522) / 2;
						@Pc(656) int local656 = (local624.anInt807 * 4 - local634.anInt523) / 2;
						local634.method371(arg2 * 4 + local30 + 48, this.aByte39, (104 - arg0 - local624.anInt807) * 4 + local656 + 48);
						return;
					}
				}
			}
		} catch (@Pc(681) RuntimeException local681) {
			signlink.reporterror("25533, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + arg3 + ", " + arg4 + ", " + local681.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method641() {
		try {
			if (this.anInt954 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub1 local6 = this.aClass1_Sub1_Sub2_Sub1_3;
				@Pc(8) int local8 = 0;
				if (this.anInt1019 != 0) {
					local8 = 1;
				}
				for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
					if (this.aStringArray13[local20] != null) {
						@Pc(32) int local32 = this.anIntArray256[local20];
						@Pc(37) String local37 = this.aStringArray12[local20];
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
						if ((local32 == 3 || local32 == 7) && (local32 == 7 || this.anInt1050 == 0 || this.anInt1050 == 1 && this.method667(local37))) {
							local90 = 329 - local8 * 13;
							local6.method111(4, 0, "From", local90);
							local6.method111(4, 65535, "From", local90 - 1);
							@Pc(115) int local115 = local6.method109("From ") + 4;
							if (local39 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array4[0].method371(local115, this.aByte39, local90 - 12);
								local115 += 14;
							}
							if (local39 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array4[1].method371(local115, this.aByte39, local90 - 12);
								local115 += 14;
							}
							local6.method111(local115, 0, local37 + ": " + this.aStringArray13[local20], local90);
							local6.method111(local115, 65535, local37 + ": " + this.aStringArray13[local20], local90 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local32 == 5 && this.anInt1050 < 2) {
							local90 = 329 - local8 * 13;
							local6.method111(4, 0, this.aStringArray13[local20], local90);
							local6.method111(4, 65535, this.aStringArray13[local20], local90 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local32 == 6 && this.anInt1050 < 2) {
							local90 = 329 - local8 * 13;
							local6.method111(4, 0, "To " + local37 + ": " + this.aStringArray13[local20], local90);
							local6.method111(4, 65535, "To " + local37 + ": " + this.aStringArray13[local20], local90 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("79538, " + false + ", " + local296.toString());
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
				return new URL("http://127.0.0.1:" + (anInt928 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	private boolean method643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray24[local7][local11] = 0;
					this.anIntArrayArray25[local7][local11] = 99999999;
				}
			}
			local11 = arg8;
			@Pc(45) int local45 = arg0;
			this.anIntArrayArray24[arg8][arg0] = 99;
			this.anIntArrayArray25[arg8][arg0] = 0;
			@Pc(61) byte local61 = 0;
			@Pc(63) int local63 = 0;
			this.anIntArray271[0] = arg8;
			@Pc(72) int local72 = local61 + 1;
			this.anIntArray272[0] = arg0;
			@Pc(76) boolean local76 = false;
			@Pc(80) int local80 = this.anIntArray271.length;
			@Pc(87) int[][] local87 = this.aClass40Array1[this.anInt1027].anIntArrayArray19;
			@Pc(198) int local198;
			while (local63 != local72) {
				local11 = this.anIntArray271[local63];
				local45 = this.anIntArray272[local63];
				local63 = (local63 + 1) % local80;
				if (local11 == arg1 && local45 == arg5) {
					local76 = true;
					break;
				}
				if (arg9 != 0) {
					if ((arg9 < 5 || arg9 == 10) && this.aClass40Array1[this.anInt1027].method528(local45, local11, arg5, arg9 - 1, arg6, arg1)) {
						local76 = true;
						break;
					}
					if (arg9 < 10 && this.aClass40Array1[this.anInt1027].method529(arg9 - 1, arg6, arg5, local11, local45, arg1)) {
						local76 = true;
						break;
					}
				}
				if (arg4 != 0 && arg3 != 0 && this.aClass40Array1[this.anInt1027].method530(arg1, arg3, local11, arg5, arg4, local45, arg7)) {
					local76 = true;
					break;
				}
				local198 = this.anIntArrayArray25[local11][local45] + 1;
				if (local11 > 0 && this.anIntArrayArray24[local11 - 1][local45] == 0 && (local87[local11 - 1][local45] & 0x1280108) == 0) {
					this.anIntArray271[local72] = local11 - 1;
					this.anIntArray272[local72] = local45;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 - 1][local45] = 2;
					this.anIntArrayArray25[local11 - 1][local45] = local198;
				}
				if (local11 < 103 && this.anIntArrayArray24[local11 + 1][local45] == 0 && (local87[local11 + 1][local45] & 0x1280180) == 0) {
					this.anIntArray271[local72] = local11 + 1;
					this.anIntArray272[local72] = local45;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 + 1][local45] = 8;
					this.anIntArrayArray25[local11 + 1][local45] = local198;
				}
				if (local45 > 0 && this.anIntArrayArray24[local11][local45 - 1] == 0 && (local87[local11][local45 - 1] & 0x1280102) == 0) {
					this.anIntArray271[local72] = local11;
					this.anIntArray272[local72] = local45 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11][local45 - 1] = 1;
					this.anIntArrayArray25[local11][local45 - 1] = local198;
				}
				if (local45 < 103 && this.anIntArrayArray24[local11][local45 + 1] == 0 && (local87[local11][local45 + 1] & 0x1280120) == 0) {
					this.anIntArray271[local72] = local11;
					this.anIntArray272[local72] = local45 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11][local45 + 1] = 4;
					this.anIntArrayArray25[local11][local45 + 1] = local198;
				}
				if (local11 > 0 && local45 > 0 && this.anIntArrayArray24[local11 - 1][local45 - 1] == 0 && (local87[local11 - 1][local45 - 1] & 0x128010E) == 0 && (local87[local11 - 1][local45] & 0x1280108) == 0 && (local87[local11][local45 - 1] & 0x1280102) == 0) {
					this.anIntArray271[local72] = local11 - 1;
					this.anIntArray272[local72] = local45 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 - 1][local45 - 1] = 3;
					this.anIntArrayArray25[local11 - 1][local45 - 1] = local198;
				}
				if (local11 < 103 && local45 > 0 && this.anIntArrayArray24[local11 + 1][local45 - 1] == 0 && (local87[local11 + 1][local45 - 1] & 0x1280183) == 0 && (local87[local11 + 1][local45] & 0x1280180) == 0 && (local87[local11][local45 - 1] & 0x1280102) == 0) {
					this.anIntArray271[local72] = local11 + 1;
					this.anIntArray272[local72] = local45 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 + 1][local45 - 1] = 9;
					this.anIntArrayArray25[local11 + 1][local45 - 1] = local198;
				}
				if (local11 > 0 && local45 < 103 && this.anIntArrayArray24[local11 - 1][local45 + 1] == 0 && (local87[local11 - 1][local45 + 1] & 0x1280138) == 0 && (local87[local11 - 1][local45] & 0x1280108) == 0 && (local87[local11][local45 + 1] & 0x1280120) == 0) {
					this.anIntArray271[local72] = local11 - 1;
					this.anIntArray272[local72] = local45 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 - 1][local45 + 1] = 6;
					this.anIntArrayArray25[local11 - 1][local45 + 1] = local198;
				}
				if (local11 < 103 && local45 < 103 && this.anIntArrayArray24[local11 + 1][local45 + 1] == 0 && (local87[local11 + 1][local45 + 1] & 0x12801E0) == 0 && (local87[local11 + 1][local45] & 0x1280180) == 0 && (local87[local11][local45 + 1] & 0x1280120) == 0) {
					this.anIntArray271[local72] = local11 + 1;
					this.anIntArray272[local72] = local45 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 + 1][local45 + 1] = 12;
					this.anIntArrayArray25[local11 + 1][local45 + 1] = local198;
				}
			}
			this.anInt1013 = 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local76) {
				if (arg10) {
					local198 = 100;
					for (local814 = 1; local814 < 2; local814++) {
						for (local820 = arg1 - local814; local820 <= arg1 + local814; local820++) {
							for (local826 = arg5 - local814; local826 <= arg5 + local814; local826++) {
								if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray25[local820][local826] < local198) {
									local198 = this.anIntArrayArray25[local820][local826];
									local11 = local820;
									local45 = local826;
									this.anInt1013 = 1;
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
			@Pc(887) byte local887 = 0;
			this.anIntArray271[0] = local11;
			local63 = local887 + 1;
			this.anIntArray272[0] = local45;
			local198 = local814 = this.anIntArrayArray24[local11][local45];
			while (local11 != arg8 || local45 != arg0) {
				if (local198 != local814) {
					local814 = local198;
					this.anIntArray271[local63] = local11;
					this.anIntArray272[local63++] = local45;
				}
				if ((local198 & 0x2) != 0) {
					local11++;
				} else if ((local198 & 0x8) != 0) {
					local11--;
				}
				if ((local198 & 0x1) != 0) {
					local45++;
				} else if ((local198 & 0x4) != 0) {
					local45--;
				}
				local198 = this.anIntArrayArray24[local11][local45];
			}
			if (local63 > 0) {
				local80 = local63;
				if (local63 > 25) {
					local80 = 25;
				}
				local63--;
				local820 = this.anIntArray271[local63];
				local826 = this.anIntArray272[local63];
				if (arg2 == 0) {
					this.aClass1_Sub1_Sub3_9.method44(184, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method45(local80 + local80 + 3);
				}
				if (arg2 == 1) {
					this.aClass1_Sub1_Sub3_9.method44(62, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method45(local80 + local80 + 3 + 14);
				}
				if (arg2 == 2) {
					this.aClass1_Sub1_Sub3_9.method44(146, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method45(local80 + local80 + 3);
				}
				this.aClass1_Sub1_Sub3_9.method71(super.anIntArray210[5] == 1 ? 1 : 0, this.aByte38);
				this.aClass1_Sub1_Sub3_9.method46(local826 + this.anInt1000);
				this.aClass1_Sub1_Sub3_9.method79(local820 + this.anInt999);
				this.anInt935 = this.anIntArray271[0];
				this.anInt936 = this.anIntArray272[0];
				for (@Pc(1077) int local1077 = 1; local1077 < local80; local1077++) {
					local63--;
					this.aClass1_Sub1_Sub3_9.method45(this.anIntArray271[local63] - local820);
					this.aClass1_Sub1_Sub3_9.method72(this.anIntArray272[local63] - local826);
				}
				return true;
			} else if (arg2 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1113) RuntimeException local1113) {
			signlink.reporterror("54943, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -20821 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method644(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_Sub1_Sub3_9.method44(25, this.anInt902);
			if (arg0 != 9) {
				this.anInt1088 = this.aClass32_2.method389();
			}
			if (this.anInt1071 != -1) {
				this.method707(this.anInt1071);
				this.anInt1071 = -1;
				this.aBoolean245 = true;
				this.aBoolean247 = false;
				this.aBoolean219 = true;
			}
			if (this.anInt1091 != -1) {
				this.method707(this.anInt1091);
				this.anInt1091 = -1;
				this.aBoolean256 = true;
				this.aBoolean247 = false;
			}
			if (this.anInt1090 != -1) {
				this.method707(this.anInt1090);
				this.anInt1090 = -1;
				this.aBoolean259 = true;
			}
			if (this.anInt1085 != -1) {
				this.method707(this.anInt1085);
				this.anInt1085 = -1;
			}
			if (this.anInt1007 != -1) {
				this.method707(this.anInt1007);
				this.anInt1007 = -1;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("24050, " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method645() {
		try {
			if (this.anInt883 == 0 && super.anInt852 == 1) {
				@Pc(19) int local19 = super.anInt853 - 25 - 550;
				@Pc(26) int local26 = super.anInt854 - 5 - 4;
				if (local19 >= 0 && local26 >= 0 && local19 < 146 && local26 < 151) {
					local19 -= 73;
					local26 -= 75;
					@Pc(46) int local46 = this.anInt983 + this.anInt941 & 0x7FF;
					@Pc(50) int local50 = Class1_Sub1_Sub2_Sub2.anIntArray138[local46];
					@Pc(54) int local54 = Class1_Sub1_Sub2_Sub2.anIntArray139[local46];
					@Pc(63) int local63 = local50 * (this.anInt1008 + 256) >> 8;
					@Pc(72) int local72 = local54 * (this.anInt1008 + 256) >> 8;
					@Pc(82) int local82 = local26 * local63 + local19 * local72 >> 11;
					@Pc(92) int local92 = local26 * local72 - local19 * local63 >> 11;
					@Pc(99) int local99 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 + local82 >> 7;
					@Pc(106) int local106 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 - local92 >> 7;
					@Pc(127) boolean local127 = this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local99, 1, 0, 0, local106, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, true);
					if (local127) {
						this.aClass1_Sub1_Sub3_9.method45(local19);
						this.aClass1_Sub1_Sub3_9.method45(local26);
						this.aClass1_Sub1_Sub3_9.method46(this.anInt983);
						this.aClass1_Sub1_Sub3_9.method45(57);
						this.aClass1_Sub1_Sub3_9.method45(this.anInt941);
						this.aClass1_Sub1_Sub3_9.method45(this.anInt1008);
						this.aClass1_Sub1_Sub3_9.method45(89);
						this.aClass1_Sub1_Sub3_9.method46(aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424);
						this.aClass1_Sub1_Sub3_9.method46(aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425);
						this.aClass1_Sub1_Sub3_9.method45(this.anInt1013);
						this.aClass1_Sub1_Sub3_9.method45(63);
						return;
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("53003, " + -51 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(BI)V")
	private void method646(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean228) {
				for (@Pc(9) int local9 = 0; local9 < this.anIntArray222.length; local9++) {
					@Pc(16) int local16 = this.anIntArray222[local9];
					if (Class1_Sub1_Sub2_Sub2.anIntArray142[local16] >= arg0) {
						@Pc(25) Class1_Sub1_Sub2_Sub3 local25 = Class1_Sub1_Sub2_Sub2.aClass1_Sub1_Sub2_Sub3Array1[local16];
						@Pc(33) int local33 = local25.anInt522 * local25.anInt523 - 1;
						@Pc(41) int local41 = local25.anInt522 * this.anInt917 * 2;
						@Pc(44) byte[] local44 = local25.aByteArray12;
						@Pc(47) byte[] local47 = this.aByteArray21;
						for (@Pc(49) int local49 = 0; local49 <= local33; local49++) {
							local47[local49] = local44[local49 - local41 & local33];
						}
						local25.aByteArray12 = local47;
						this.aByteArray21 = local44;
						Class1_Sub1_Sub2_Sub2.method342(local16, this.aBoolean222);
					}
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("23909, " + -105 + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OCPHNIUN;I)V")
	private void method647(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray230.length; local5++) {
				this.anIntArray230[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray230[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray231[local60] = (this.anIntArray230[local60 - 1] + this.anIntArray230[local60 + 1] + this.anIntArray230[local60 - 128] + this.anIntArray230[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray230;
				this.anIntArray230 = this.anIntArray231;
				this.anIntArray231 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt523; local52++) {
					for (local60 = 0; local60 < arg0.anInt522; local60++) {
						if (arg0.aByteArray12[local48++] != 0) {
							@Pc(148) int local148 = local60 + arg0.anInt524 + 16;
							@Pc(155) int local155 = local52 + arg0.anInt525 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray230[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("47338, " + arg0 + ", " + -37776 + ", " + local178.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!CMGGUSPR;)V")
	private void method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < this.anInt906; local5++) {
				@Pc(12) int local12 = this.anIntArray228[local5];
				@Pc(17) Class1_Sub1_Sub1_Sub3_Sub2 local17 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local12];
				@Pc(20) int local20 = arg2.method55();
				if ((local20 & 0x1) != 0) {
					local20 += arg2.method55() << 8;
				}
				this.method630(local20, local17, arg2, this.aBoolean238, local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("85295, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method649() {
		try {
			this.anInt1035 = 0;
			@Pc(20) int local20 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 >> 7) + this.anInt999;
			@Pc(28) int local28 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 >> 7) + this.anInt1000;
			if (local20 >= 3053 && local20 <= 3156 && local28 >= 3056 && local28 <= 3136) {
				this.anInt1035 = 1;
			}
			if (local20 >= 3072 && local20 <= 3118 && local28 >= 9492 && local28 <= 9535) {
				this.anInt1035 = 1;
			}
			if (this.anInt1035 == 1 && local20 >= 3139 && local20 <= 3199 && local28 >= 3008 && local28 <= 3062) {
				this.anInt1035 = 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("33858, " + -113 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method650(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt873; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub3_Sub1 local11 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray213[local1]];
				@Pc(20) int local20 = (this.anIntArray213[local1] << 14) + 536870912;
				if (local11 != null && local11.method264() && local11.aClass37_1.aBoolean150 == arg0 && local11.aClass37_1.method485()) {
					@Pc(41) int local41 = local11.anInt424 >> 7;
					@Pc(46) int local46 = local11.anInt425 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt427 == 1 && (local11.anInt424 & 0x7F) == 64 && (local11.anInt425 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local41][local46] == this.anInt870) {
								continue;
							}
							this.anIntArrayArray23[local41][local46] = this.anInt870;
						}
						if (!local11.aClass37_1.aBoolean149) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass35_1.method407(local11, this.anInt1027, local11.anInt425, local11.aBoolean87, local11.anInt424, local11.anInt426, local20, (local11.anInt427 - 1) * 64 + 60, this.method611(local11.anInt425, this.anInt1027, local11.anInt424));
					}
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("46789, " + arg0 + ", " + -1170 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method651() {
		try {
			@Pc(7) byte[] local7 = this.aClass38_2.method512("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub4 local13 = new Class1_Sub1_Sub2_Sub4(local7, this);
			this.aClass17_18.method229();
			local13.method471(0, 0);
			this.aClass17_19.method229();
			local13.method471(0, -637);
			this.aClass17_15.method229();
			local13.method471(0, -128);
			this.aClass17_16.method229();
			local13.method471(-371, -202);
			this.aClass17_17.method229();
			local13.method471(-171, -202);
			this.aClass17_20.method229();
			local13.method471(-265, 0);
			this.aClass17_21.method229();
			local13.method471(-265, -562);
			this.aClass17_22.method229();
			local13.method471(-171, -128);
			this.aClass17_23.method229();
			local13.method471(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt666];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt667; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt666; local104++) {
					local98[local104] = local13.anIntArray171[local13.anInt666 + local13.anInt666 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt666; local130++) {
					local13.anIntArray171[local130 + local13.anInt666 * local100] = local98[local130];
				}
			}
			this.aClass17_18.method229();
			local13.method471(0, 382);
			this.aClass17_19.method229();
			local13.method471(0, -255);
			this.aClass17_15.method229();
			local13.method471(0, 254);
			this.aClass17_16.method229();
			local13.method471(-371, 180);
			this.aClass17_17.method229();
			local13.method471(-171, 180);
			this.aClass17_20.method229();
			local13.method471(-265, 382);
			this.aClass17_21.method229();
			local13.method471(-265, -180);
			this.aClass17_22.method229();
			local13.method471(-171, 254);
			this.aClass17_23.method229();
			local13.method471(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub4(this.aClass38_2, "logo", 0);
			this.aClass17_15.method229();
			local13.method473(382 - local13.anInt666 / 2 - 128, this.aByte39, 18);
			System.gc();
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("65710, " + 0 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray235[arg0];
				@Pc(14) int local14 = this.anIntArray236[arg0];
				@Pc(19) int local19 = this.anIntArray237[arg0];
				@Pc(24) int local24 = this.anIntArray238[arg0];
				@Pc(28) boolean local28 = false;
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt938 != 0 && local19 != 1117) {
					this.anInt938 = 0;
					this.aBoolean256 = true;
				}
				if (local19 == 343) {
					this.aClass1_Sub1_Sub3_9.method44(196, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method46(local24);
					this.aClass1_Sub1_Sub3_9.method80(local14);
					this.aClass1_Sub1_Sub3_9.method80(local9);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 787) {
					this.method588(local9, local24, local14);
					this.aClass1_Sub1_Sub3_9.method44(186, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method80(local24 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_9.method80(local9 + this.anInt999);
					this.aClass1_Sub1_Sub3_9.method80(local14 + this.anInt1000);
				}
				@Pc(146) Class1_Sub1_Sub1_Sub3_Sub2 local146;
				if (local19 == 913) {
					local146 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local24];
					if (local146 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local146.anIntArray127[0], 2, 1, 1, local146.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(224, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method80(local24);
					}
				}
				@Pc(208) Class1_Sub1_Sub1_Sub3_Sub1 local208;
				if (local19 == 642) {
					local208 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local24];
					if (local208 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local208.anIntArray127[0], 2, 1, 1, local208.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						anInt964 += local24;
						if (anInt964 >= 58) {
							this.aClass1_Sub1_Sub3_9.method44(220, this.anInt902);
							this.aClass1_Sub1_Sub3_9.method46(38397);
							anInt964 = 0;
						}
						this.aClass1_Sub1_Sub3_9.method44(190, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method81(local24);
					}
				}
				@Pc(305) boolean local305;
				if (local19 == 233) {
					local305 = this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 0, 0, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
					if (!local305) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 1, 1, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
					}
					this.anInt1055 = super.anInt853;
					this.anInt1056 = super.anInt854;
					this.anInt1058 = 2;
					this.anInt1057 = 0;
					this.aClass1_Sub1_Sub3_9.method44(242, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method81(local24);
					this.aClass1_Sub1_Sub3_9.method79(local14 + this.anInt1000);
					this.aClass1_Sub1_Sub3_9.method79(local9 + this.anInt999);
				}
				if (local19 == 48) {
					this.method644(this.aByte27);
				}
				@Pc(397) int local397;
				@Pc(408) long local408;
				@Pc(393) String local393;
				if (local19 == 166 || local19 == 895 || local19 == 804 || local19 == 510) {
					local393 = this.aStringArray8[arg0];
					local397 = local393.indexOf("@whi@");
					if (local397 != -1) {
						local408 = Class49.method568(local393.substring(local397 + 5).trim());
						if (local19 == 166) {
							this.method674(local408);
						}
						if (local19 == 895) {
							this.method610(local408, this.anInt1088);
						}
						if (local19 == 804) {
							this.method688(local408, 814);
						}
						if (local19 == 510) {
							this.method638(975, local408);
						}
					}
				}
				if (local19 == 1237) {
					this.method588(local9, local24, local14);
					this.aClass1_Sub1_Sub3_9.method44(154, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method79(local24 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_9.method46(local9 + this.anInt999);
					this.aClass1_Sub1_Sub3_9.method46(local14 + this.anInt1000);
				}
				@Pc(507) String local507;
				if (local19 == 1986) {
					local208 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local24];
					if (local208 != null) {
						@Pc(489) Class37 local489 = local208.aClass37_1;
						if (local489.anIntArray172 != null) {
							local489 = local489.method481();
						}
						if (local489 != null) {
							if (local489.aByteArray14 == null) {
								local507 = "It's a " + local489.aString9 + ".";
							} else {
								local507 = new String(local489.aByteArray14);
							}
							this.method664("", local507, 0);
						}
					}
				}
				if (local19 == 555) {
					local305 = this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 0, 0, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
					if (!local305) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 1, 1, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
					}
					this.anInt1055 = super.anInt853;
					this.anInt1056 = super.anInt854;
					this.anInt1058 = 2;
					this.anInt1057 = 0;
					this.aClass1_Sub1_Sub3_9.method44(59, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method81(local14 + this.anInt1000);
					this.aClass1_Sub1_Sub3_9.method81(local24);
					this.aClass1_Sub1_Sub3_9.method80(this.anInt951);
					this.aClass1_Sub1_Sub3_9.method46(local9 + this.anInt999);
				}
				if (local19 == 794) {
					this.aClass1_Sub1_Sub3_9.method44(225, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method80(local9);
					this.aClass1_Sub1_Sub3_9.method46(local14);
					this.aClass1_Sub1_Sub3_9.method80(local24);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 295) {
					local208 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local24];
					if (local208 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local208.anIntArray127[0], 2, 1, 1, local208.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(117, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method79(local24);
					}
				}
				if (local19 == 992) {
					local146 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local24];
					if (local146 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local146.anIntArray127[0], 2, 1, 1, local146.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(81, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method79(local24);
					}
				}
				if (local19 == 22) {
					local208 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local24];
					if (local208 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local208.anIntArray127[0], 2, 1, 1, local208.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(99, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method79(local24);
					}
				}
				if (local19 == 825) {
					local305 = this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 0, 0, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
					if (!local305) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 1, 1, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
					}
					this.anInt1055 = super.anInt853;
					this.anInt1056 = super.anInt854;
					this.anInt1058 = 2;
					this.anInt1057 = 0;
					this.aClass1_Sub1_Sub3_9.method44(80, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method81(this.anInt934);
					this.aClass1_Sub1_Sub3_9.method46(local14 + this.anInt1000);
					this.aClass1_Sub1_Sub3_9.method79(local24);
					this.aClass1_Sub1_Sub3_9.method80(this.anInt933);
					this.aClass1_Sub1_Sub3_9.method46(local9 + this.anInt999);
					this.aClass1_Sub1_Sub3_9.method80(this.anInt932);
				}
				if (local19 == 830) {
					local208 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local24];
					if (local208 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local208.anIntArray127[0], 2, 1, 1, local208.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(243, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method46(local24);
					}
				}
				if (local19 == 529) {
					this.aClass1_Sub1_Sub3_9.method44(39, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method81(local9);
					this.aClass1_Sub1_Sub3_9.method80(local14);
					this.aClass1_Sub1_Sub3_9.method81(local24);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 898) {
					local208 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local24];
					if (local208 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local208.anIntArray127[0], 2, 1, 1, local208.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(67, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method81(local24);
						this.aClass1_Sub1_Sub3_9.method79(this.anInt951);
					}
				}
				@Pc(1161) Class44 local1161;
				if (local19 == 551) {
					this.aClass1_Sub1_Sub3_9.method44(90, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method46(local14);
					local1161 = Class44.method544(local14);
					if (local1161.anIntArrayArray21 != null && local1161.anIntArrayArray21[0][0] == 5) {
						local397 = local1161.anIntArrayArray21[0][1];
						if (this.anIntArray232[local397] != local1161.anIntArray191[0]) {
							this.anIntArray232[local397] = local1161.anIntArray191[0];
							this.method591(local397);
							this.aBoolean245 = true;
						}
					}
				}
				if (local19 == 158) {
					if (this.aBoolean242) {
						this.aClass35_1.method434(local14 - 4, this.aByte35, local9 - 4);
					} else {
						this.aClass35_1.method434(super.anInt854 - 4, this.aByte35, super.anInt853 - 4);
					}
				}
				if (local19 == 62) {
					this.aClass1_Sub1_Sub3_9.method44(141, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method46(local9);
					this.aClass1_Sub1_Sub3_9.method79(local14);
					this.aClass1_Sub1_Sub3_9.method81(local24);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 585) {
					local1161 = Class44.method544(local14);
					@Pc(1296) boolean local1296 = true;
					if (local1161.anInt730 > 0) {
						local1296 = this.method633(local1161);
					}
					if (local1296) {
						this.aClass1_Sub1_Sub3_9.method44(90, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method46(local14);
					}
				}
				if (local19 == 679) {
					local305 = this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 0, 0, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
					if (!local305) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 1, 1, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
					}
					this.anInt1055 = super.anInt853;
					this.anInt1056 = super.anInt854;
					this.anInt1058 = 2;
					this.anInt1057 = 0;
					this.aClass1_Sub1_Sub3_9.method44(78, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method81(local24);
					this.aClass1_Sub1_Sub3_9.method79(local9 + this.anInt999);
					this.aClass1_Sub1_Sub3_9.method80(local14 + this.anInt1000);
				}
				if (local19 == 594 && !this.aBoolean247) {
					this.aClass1_Sub1_Sub3_9.method44(237, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method46(local14);
					this.aBoolean247 = true;
				}
				if (local19 == 652) {
					this.aClass1_Sub1_Sub3_9.method44(83, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method80(local9);
					this.aClass1_Sub1_Sub3_9.method79(this.anInt934);
					this.aClass1_Sub1_Sub3_9.method80(local14);
					this.aClass1_Sub1_Sub3_9.method81(this.anInt933);
					this.aClass1_Sub1_Sub3_9.method80(local24);
					this.aClass1_Sub1_Sub3_9.method79(this.anInt932);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 791 && this.method588(local9, local24, local14)) {
					this.aClass1_Sub1_Sub3_9.method44(38, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method46(local14 + this.anInt1000);
					this.aClass1_Sub1_Sub3_9.method81(local9 + this.anInt999);
					this.aClass1_Sub1_Sub3_9.method79(this.anInt934);
					this.aClass1_Sub1_Sub3_9.method79(this.anInt932);
					this.aClass1_Sub1_Sub3_9.method80(this.anInt933);
					this.aClass1_Sub1_Sub3_9.method81(local24 >> 14 & 0x7FFF);
				}
				if (local19 == 352) {
					this.aClass1_Sub1_Sub3_9.method44(65, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method46(local24);
					this.aClass1_Sub1_Sub3_9.method79(local14);
					this.aClass1_Sub1_Sub3_9.method80(local9);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 683) {
					local208 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local24];
					if (local208 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local208.anIntArray127[0], 2, 1, 1, local208.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(231, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method80(this.anInt932);
						this.aClass1_Sub1_Sub3_9.method80(this.anInt934);
						this.aClass1_Sub1_Sub3_9.method79(this.anInt933);
						this.aClass1_Sub1_Sub3_9.method80(local24);
					}
				}
				if (local19 == 508) {
					local146 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local24];
					if (local146 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local146.anIntArray127[0], 2, 1, 1, local146.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(111, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method80(local24);
						this.aClass1_Sub1_Sub3_9.method46(this.anInt934);
						this.aClass1_Sub1_Sub3_9.method79(this.anInt933);
						this.aClass1_Sub1_Sub3_9.method46(this.anInt932);
					}
				}
				if (local19 == 399) {
					this.aClass1_Sub1_Sub3_9.method44(20, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method80(local9);
					this.aClass1_Sub1_Sub3_9.method80(local14);
					this.aClass1_Sub1_Sub3_9.method81(this.anInt951);
					this.aClass1_Sub1_Sub3_9.method79(local24);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				@Pc(1856) String local1856;
				@Pc(1830) Class23 local1830;
				if (local19 == 1934) {
					local1830 = Class23.method248(local24);
					@Pc(1833) Class44 local1833 = Class44.method544(local14);
					if (local1833 != null && local1833.anIntArray193[local9] >= 100000) {
						local1856 = local1833.anIntArray193[local9] + " x " + local1830.aString5;
					} else if (local1830.aByteArray11 == null) {
						local1856 = "It's a " + local1830.aString5 + ".";
					} else {
						local1856 = new String(local1830.aByteArray11);
					}
					this.method664("", local1856, 0);
				}
				if (local19 == 350) {
					this.method588(local9, local24, local14);
					this.aClass1_Sub1_Sub3_9.method44(60, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method46(local24 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_9.method46(local14 + this.anInt1000);
					this.aClass1_Sub1_Sub3_9.method79(local9 + this.anInt999);
				}
				if (local19 == 387 && this.method588(local9, local24, local14)) {
					this.aClass1_Sub1_Sub3_9.method44(71, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method79(local24 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_9.method46(this.anInt951);
					this.aClass1_Sub1_Sub3_9.method46(local14 + this.anInt1000);
					this.aClass1_Sub1_Sub3_9.method80(local9 + this.anInt999);
				}
				if (local19 == 946) {
					local146 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local24];
					if (local146 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local146.anIntArray127[0], 2, 1, 1, local146.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(42, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method81(local24);
					}
				}
				if (local19 == 899) {
					this.aClass1_Sub1_Sub3_9.method44(90, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method46(local14);
					local1161 = Class44.method544(local14);
					if (local1161.anIntArrayArray21 != null && local1161.anIntArrayArray21[0][0] == 5) {
						local397 = local1161.anIntArrayArray21[0][1];
						this.anIntArray232[local397] = 1 - this.anIntArray232[local397];
						this.method591(local397);
						this.aBoolean245 = true;
					}
				}
				if (local19 == 887) {
					if ((local9 & 0x3) == 0) {
						anInt864++;
					}
					if (anInt864 >= 135) {
						this.aClass1_Sub1_Sub3_9.method44(213, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method45(76);
						anInt864 = 0;
					}
					this.aClass1_Sub1_Sub3_9.method44(45, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method81(local9);
					this.aClass1_Sub1_Sub3_9.method80(local14);
					this.aClass1_Sub1_Sub3_9.method80(local24);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 1642) {
					@Pc(2169) int local2169 = local24 >> 14 & 0x7FFF;
					@Pc(2172) Class48 local2172 = Class48.method567(local2169);
					if (local2172.aByteArray20 == null) {
						local507 = "It's a " + local2172.aString16 + ".";
					} else {
						local507 = new String(local2172.aByteArray20);
					}
					this.method664("", local507, 0);
				}
				@Pc(2236) int local2236;
				if (local19 == 57 || local19 == 894) {
					local393 = this.aStringArray8[arg0];
					local397 = local393.indexOf("@whi@");
					if (local397 != -1) {
						local393 = local393.substring(local397 + 5).trim();
						local507 = Class49.method572(Class49.method569(Class49.method568(local393)));
						@Pc(2234) boolean local2234 = false;
						for (local2236 = 0; local2236 < this.anInt905; local2236++) {
							@Pc(2246) Class1_Sub1_Sub1_Sub3_Sub2 local2246 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray227[local2236]];
							if (local2246 != null && local2246.aString7 != null && local2246.aString7.equalsIgnoreCase(local507)) {
								this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local2246.anIntArray127[0], 2, 1, 1, local2246.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
								if (local19 == 57) {
									this.aClass1_Sub1_Sub3_9.method44(9, this.anInt902);
									this.aClass1_Sub1_Sub3_9.method80(this.anIntArray227[local2236]);
								}
								if (local19 == 894) {
									anInt1010 += local24;
									if (anInt1010 >= 53) {
										this.aClass1_Sub1_Sub3_9.method44(148, this.anInt902);
										anInt1010 = 0;
									}
									this.aClass1_Sub1_Sub3_9.method44(185, this.anInt902);
									this.aClass1_Sub1_Sub3_9.method79(this.anIntArray227[local2236]);
								}
								local2234 = true;
								break;
							}
						}
						if (!local2234) {
							this.method664("", "Unable to find " + local507, 0);
						}
					}
				}
				if (local19 == 1186) {
					local1830 = Class23.method248(local24);
					if (local1830.aByteArray11 == null) {
						local1856 = "It's a " + local1830.aString5 + ".";
					} else {
						local1856 = new String(local1830.aByteArray11);
					}
					this.method664("", local1856, 0);
				}
				if (local19 == 875) {
					this.aClass1_Sub1_Sub3_9.method44(44, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method79(local24);
					this.aClass1_Sub1_Sub3_9.method79(local9);
					this.aClass1_Sub1_Sub3_9.method46(local14);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 814) {
					this.method588(local9, local24, local14);
					this.aClass1_Sub1_Sub3_9.method44(129, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method80(local9 + this.anInt999);
					this.aClass1_Sub1_Sub3_9.method81(local24 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_9.method79(local14 + this.anInt1000);
				}
				if (local19 == 56) {
					this.aClass1_Sub1_Sub3_9.method44(12, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method81(local9);
					this.aClass1_Sub1_Sub3_9.method79(local14);
					this.aClass1_Sub1_Sub3_9.method81(local24);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 66) {
					this.aClass1_Sub1_Sub3_9.method44(17, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method79(local9);
					this.aClass1_Sub1_Sub3_9.method80(local24);
					this.aClass1_Sub1_Sub3_9.method46(local14);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class44.method544(local14).anInt750 == this.anInt1007) {
						this.anInt1054 = 1;
					}
					if (Class44.method544(local14).anInt750 == this.anInt1091) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 870) {
					local146 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local24];
					if (local146 != null) {
						this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local146.anIntArray127[0], 2, 1, 1, local146.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						anInt1010 += local24;
						if (anInt1010 >= 53) {
							this.aClass1_Sub1_Sub3_9.method44(148, this.anInt902);
							anInt1010 = 0;
						}
						this.aClass1_Sub1_Sub3_9.method44(185, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method79(local24);
					}
				}
				if (local19 == 407) {
					local1161 = Class44.method544(local14);
					this.anInt950 = 1;
					this.anInt951 = local14;
					this.anInt952 = local1161.anInt735;
					this.anInt931 = 0;
					this.aBoolean245 = true;
					local1856 = local1161.aString13;
					if (local1856.indexOf(" ") != -1) {
						local1856 = local1856.substring(0, local1856.indexOf(" "));
					}
					local507 = local1161.aString13;
					if (local507.indexOf(" ") != -1) {
						local507 = local507.substring(local507.indexOf(" ") + 1);
					}
					this.aString21 = local1856 + " " + local1161.aString11 + " " + local507;
					if (this.anInt952 == 16) {
						this.aBoolean245 = true;
						this.anInt1005 = 3;
						this.aBoolean219 = true;
					}
				} else {
					if (local19 == 306) {
						local146 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local24];
						if (local146 != null) {
							this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local146.anIntArray127[0], 2, 1, 1, local146.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
							this.anInt1055 = super.anInt853;
							this.anInt1056 = super.anInt854;
							this.anInt1058 = 2;
							this.anInt1057 = 0;
							this.aClass1_Sub1_Sub3_9.method44(19, this.anInt902);
							this.aClass1_Sub1_Sub3_9.method80(this.anInt951);
							this.aClass1_Sub1_Sub3_9.method80(local24);
						}
					}
					if (local19 == 174) {
						local305 = this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 0, 0, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						if (!local305) {
							this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 1, 1, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						}
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						anInt929++;
						if (anInt929 >= 129) {
							this.aClass1_Sub1_Sub3_9.method44(217, this.anInt902);
							this.aClass1_Sub1_Sub3_9.method45(71);
							anInt929 = 0;
						}
						this.aClass1_Sub1_Sub3_9.method44(168, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method80(local9 + this.anInt999);
						this.aClass1_Sub1_Sub3_9.method81(local24);
						this.aClass1_Sub1_Sub3_9.method81(local14 + this.anInt1000);
					}
					if (local19 == 16) {
						this.aClass1_Sub1_Sub3_9.method44(94, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method80(local24);
						this.aClass1_Sub1_Sub3_9.method46(local14);
						this.aClass1_Sub1_Sub3_9.method79(local9);
						this.anInt1051 = 0;
						this.anInt1052 = local14;
						this.anInt1053 = local9;
						this.anInt1054 = 2;
						if (Class44.method544(local14).anInt750 == this.anInt1007) {
							this.anInt1054 = 1;
						}
						if (Class44.method544(local14).anInt750 == this.anInt1091) {
							this.anInt1054 = 3;
						}
					}
					if (local19 == 641) {
						local393 = this.aStringArray8[arg0];
						local397 = local393.indexOf("@whi@");
						if (local397 != -1) {
							if (this.anInt1007 == -1) {
								this.method644(this.aByte27);
								this.aString26 = local393.substring(local397 + 5).trim();
								this.aBoolean212 = false;
								this.anInt961 = this.anInt1007 = Class44.anInt733;
							} else {
								this.method664("", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}
					if (local19 == 138) {
						local305 = this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 0, 0, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						if (!local305) {
							this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 1, 1, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						}
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						this.aClass1_Sub1_Sub3_9.method44(14, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method46(local14 + this.anInt1000);
						this.aClass1_Sub1_Sub3_9.method80(local24);
						this.aClass1_Sub1_Sub3_9.method79(local9 + this.anInt999);
					}
					if (local19 == 375) {
						local305 = this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 0, 0, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						if (!local305) {
							this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local9, 2, 1, 1, local14, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
						}
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 2;
						this.anInt1057 = 0;
						anInt930++;
						if (anInt930 >= 68) {
							this.aClass1_Sub1_Sub3_9.method44(76, this.anInt902);
							this.aClass1_Sub1_Sub3_9.method48(13221022);
							anInt930 = 0;
						}
						this.aClass1_Sub1_Sub3_9.method44(64, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method79(local9 + this.anInt999);
						this.aClass1_Sub1_Sub3_9.method80(local24);
						this.aClass1_Sub1_Sub3_9.method46(local14 + this.anInt1000);
					}
					if (local19 == 847) {
						local393 = this.aStringArray8[arg0];
						local397 = local393.indexOf("@whi@");
						if (local397 != -1) {
							local408 = Class49.method568(local393.substring(local397 + 5).trim());
							local2236 = -1;
							for (@Pc(3247) int local3247 = 0; local3247 < this.anInt1072; local3247++) {
								if (this.aLongArray3[local3247] == local408) {
									local2236 = local3247;
									break;
								}
							}
							if (local2236 != -1 && this.anIntArray254[local2236] > 0) {
								this.aBoolean256 = true;
								this.anInt938 = 0;
								this.aBoolean243 = true;
								this.aString20 = "";
								this.anInt945 = 3;
								this.aLong31 = this.aLongArray3[local2236];
								this.aString19 = "Enter message to send to " + this.aStringArray10[local2236];
							}
						}
					}
					if (local19 == 179) {
						this.anInt931 = 1;
						this.anInt932 = local9;
						this.anInt933 = local14;
						this.anInt934 = local24;
						this.aString18 = String.valueOf(Class23.method248(local24).aString5);
						this.anInt950 = 0;
						this.aBoolean245 = true;
					} else {
						if (local19 == 850) {
							this.method707(this.anInt962);
							this.anInt962 = -1;
							this.aBoolean256 = true;
						}
						if (local19 == 758) {
							this.method588(local9, local24, local14);
							this.aClass1_Sub1_Sub3_9.method44(77, this.anInt902);
							this.aClass1_Sub1_Sub3_9.method81(local9 + this.anInt999);
							this.aClass1_Sub1_Sub3_9.method81(local14 + this.anInt1000);
							this.aClass1_Sub1_Sub3_9.method80(local24 >> 14 & 0x7FFF);
						}
						if (local19 == 488) {
							local208 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local24];
							if (local208 != null) {
								this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local208.anIntArray127[0], 2, 1, 1, local208.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
								this.anInt1055 = super.anInt853;
								this.anInt1056 = super.anInt854;
								this.anInt1058 = 2;
								this.anInt1057 = 0;
								this.aClass1_Sub1_Sub3_9.method44(181, this.anInt902);
								this.aClass1_Sub1_Sub3_9.method81(local24);
							}
						}
						if (local19 == 155) {
							local146 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local24];
							if (local146 != null) {
								this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local146.anIntArray127[0], 2, 1, 1, local146.anIntArray128[0], 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, false);
								this.anInt1055 = super.anInt853;
								this.anInt1056 = super.anInt854;
								this.anInt1058 = 2;
								this.anInt1057 = 0;
								this.aClass1_Sub1_Sub3_9.method44(9, this.anInt902);
								this.aClass1_Sub1_Sub3_9.method80(local24);
							}
						}
						this.anInt931 = 0;
						this.anInt950 = 0;
						this.aBoolean245 = true;
					}
				}
			}
		} catch (@Pc(3524) RuntimeException local3524) {
			signlink.reporterror("90687, " + arg0 + ", " + arg1 + ", " + local3524.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!WJQTPVDG;I)V")
	private void method653(@OriginalArg(0) Class44 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt730;
			@Pc(65) int local65;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local65 = this.anInt1072;
					if (this.anInt1073 != 2) {
						local65 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local65) {
						arg0.aString12 = "";
						arg0.anInt742 = 0;
					} else {
						if (this.anIntArray254[local4] == 0) {
							arg0.aString12 = "@red@Offline";
						} else if (this.anIntArray254[local4] < 200) {
							if (this.anIntArray254[local4] == anInt927) {
								arg0.aString12 = "@gre@World" + (this.anIntArray254[local4] - 9);
							} else {
								arg0.aString12 = "@yel@World" + (this.anIntArray254[local4] - 9);
							}
						} else if (this.anIntArray254[local4] == anInt927) {
							arg0.aString12 = "@gre@Classic" + (this.anIntArray254[local4] - 219);
						} else {
							arg0.aString12 = "@yel@Classic" + (this.anIntArray254[local4] - 219);
						}
						arg0.anInt742 = 1;
					}
				} else if (local4 == 203) {
					local65 = this.anInt1072;
					if (this.anInt1073 != 2) {
						local65 = 0;
					}
					arg0.anInt740 = local65 * 15 + 20;
					if (arg0.anInt740 <= arg0.anInt747) {
						arg0.anInt740 = arg0.anInt747 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt1073 == 0) {
						arg0.aString12 = "Loading ignore list";
						arg0.anInt742 = 0;
					} else if (local4 == 1 && this.anInt1073 == 0) {
						arg0.aString12 = "Please wait...";
						arg0.anInt742 = 0;
					} else {
						local65 = this.anInt1089;
						if (this.anInt1073 == 0) {
							local65 = 0;
						}
						if (local4 >= local65) {
							arg0.aString12 = "";
							arg0.anInt742 = 0;
						} else {
							arg0.aString12 = Class49.method572(Class49.method569(this.aLongArray4[local4]));
							arg0.anInt742 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt740 = this.anInt1089 * 15 + 20;
					if (arg0.anInt740 <= arg0.anInt747) {
						arg0.anInt740 = arg0.anInt747 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt725 = 150;
					arg0.anInt726 = (int) (Math.sin((double) anInt1011 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean234) {
						for (local65 = 0; local65 < 7; local65++) {
							@Pc(378) int local378 = this.anIntArray252[local65];
							if (local378 >= 0 && !Class6.aClass6Array1[local378].method37()) {
								return;
							}
						}
						this.aBoolean234 = false;
						@Pc(397) Class1_Sub1_Sub1_Sub2[] local397 = new Class1_Sub1_Sub1_Sub2[7];
						@Pc(399) int local399 = 0;
						for (@Pc(401) int local401 = 0; local401 < 7; local401++) {
							@Pc(408) int local408 = this.anIntArray252[local401];
							if (local408 >= 0) {
								local397[local399++] = Class6.aClass6Array1[local408].method38();
							}
						}
						@Pc(431) Class1_Sub1_Sub1_Sub2 local431 = new Class1_Sub1_Sub1_Sub2(local397, local399, this.aBoolean217);
						for (@Pc(433) int local433 = 0; local433 < 5; local433++) {
							if (this.anIntArray276[local433] != 0) {
								local431.method157(anIntArrayArray22[local433][0], anIntArrayArray22[local433][this.anIntArray276[local433]]);
								if (local433 == 1) {
									local431.method157(anIntArray275[0], anIntArray275[this.anIntArray276[local433]]);
								}
							}
						}
						local431.method150();
						local431.method151(Class46.aClass46Array1[aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt411].anIntArray198[0]);
						local431.method160(64, 850, -30, -50, -30, true);
						arg0.anInt748 = 5;
						arg0.anInt749 = 0;
						Class44.method545(local431);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub4_8 == null) {
						this.aClass1_Sub1_Sub2_Sub4_8 = arg0.aClass1_Sub1_Sub2_Sub4_1;
						this.aClass1_Sub1_Sub2_Sub4_9 = arg0.aClass1_Sub1_Sub2_Sub4_2;
					}
					if (this.aBoolean260) {
						arg0.aClass1_Sub1_Sub2_Sub4_1 = this.aClass1_Sub1_Sub2_Sub4_9;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub4_1 = this.aClass1_Sub1_Sub2_Sub4_8;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub4_8 == null) {
						this.aClass1_Sub1_Sub2_Sub4_8 = arg0.aClass1_Sub1_Sub2_Sub4_1;
						this.aClass1_Sub1_Sub2_Sub4_9 = arg0.aClass1_Sub1_Sub2_Sub4_2;
					}
					if (this.aBoolean260) {
						arg0.aClass1_Sub1_Sub2_Sub4_1 = this.aClass1_Sub1_Sub2_Sub4_8;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub4_1 = this.aClass1_Sub1_Sub2_Sub4_9;
					}
				} else if (local4 == 600) {
					arg0.aString12 = this.aString26;
					if (anInt1011 % 20 < 10) {
						arg0.aString12 = arg0.aString12 + "|";
					} else {
						arg0.aString12 = arg0.aString12 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt1081 < 1) {
							arg0.aString12 = "";
						} else if (this.aBoolean212) {
							arg0.anInt729 = 16711680;
							arg0.aString12 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt729 = 16777215;
							arg0.aString12 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(638) String local638;
					if (local4 == 660) {
						local65 = this.anInt995 - this.anInt858;
						if (local65 <= 0) {
							local638 = "earlier today";
						} else if (local65 == 1) {
							local638 = "yesterday";
						} else {
							local638 = local65 + " days ago";
						}
						arg0.aString12 = "You last logged in @red@" + local638 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt940 == 0) {
							arg0.aString12 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt940 <= this.anInt995) {
							arg0.aString12 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method654(this.anInt940);
						} else {
							local65 = this.anInt995 + 14 - this.anInt940;
							if (local65 <= 0) {
								local638 = "Earlier today";
							} else if (local65 == 1) {
								local638 = "Yesterday";
							} else {
								local638 = local65 + " days ago";
							}
							arg0.aString12 = local638 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method654(this.anInt940) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(756) String local756;
						if (this.anInt872 == 0) {
							local756 = "@yel@0 unread messages";
						} else if (this.anInt872 == 1) {
							local756 = "@gre@1 unread message";
						} else {
							local756 = "@gre@" + this.anInt872 + " unread messages";
						}
						arg0.aString12 = "You have " + local756 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt1014 > 0 && this.anInt1014 <= this.anInt995 + 10) {
							arg0.aString12 = "Last password change:\\n@gre@" + this.method654(this.anInt1014);
						} else {
							arg0.aString12 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt1086 > 2 && !aBoolean227) {
							arg0.aString12 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt1086 > 2) {
							arg0.aString12 = "\\n\\nYou have @gre@" + this.anInt1086 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt1086 > 0) {
							arg0.aString12 = "You have @gre@" + this.anInt1086 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString12 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt1086 > 2 && !aBoolean227) {
							arg0.aString12 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt1086 > 0) {
							arg0.aString12 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString12 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt940 > this.anInt995) {
							arg0.aString12 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString12 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt1073 == 0) {
				arg0.aString12 = "Loading friend list";
				arg0.anInt742 = 0;
			} else if (local4 == 1 && this.anInt1073 == 1) {
				arg0.aString12 = "Connecting to friendserver";
				arg0.anInt742 = 0;
			} else if (local4 == 2 && this.anInt1073 != 2) {
				arg0.aString12 = "Please wait...";
				arg0.anInt742 = 0;
			} else {
				local65 = this.anInt1072;
				if (this.anInt1073 != 2) {
					local65 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local65) {
					arg0.aString12 = "";
					arg0.anInt742 = 0;
				} else {
					arg0.aString12 = this.aStringArray10[local4];
					arg0.anInt742 = 1;
				}
			}
		} catch (@Pc(913) RuntimeException local913) {
			signlink.reporterror("86434, " + arg0 + ", " + -859 + ", " + local913.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private String method654(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt995 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(26) int local26 = local16.get(5);
			@Pc(38) int local38 = local16.get(2);
			@Pc(42) int local42 = local16.get(1);
			@Pc(93) String[] local93 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local26 + "-" + local93[local38] + "-" + local42;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("61150, " + arg0 + ", " + 122 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method655() {
		try {
			if (this.aClass17_27 == null) {
				this.method698(this.aByte30);
				super.aClass17_2 = null;
				this.aClass17_15 = null;
				this.aClass17_16 = null;
				this.aClass17_17 = null;
				this.aClass17_18 = null;
				this.aClass17_19 = null;
				this.aClass17_20 = null;
				this.aClass17_21 = null;
				this.aClass17_22 = null;
				this.aClass17_23 = null;
				this.aClass17_27 = new Class17(this.method584(), 479, (byte) 0, 96);
				this.aClass17_25 = new Class17(this.method584(), 172, (byte) 0, 156);
				Class1_Sub1_Sub2.method459();
				this.aClass1_Sub1_Sub2_Sub3_4.method371(0, this.aByte39, 0);
				this.aClass17_24 = new Class17(this.method584(), 190, (byte) 0, 261);
				this.aClass17_26 = new Class17(this.method584(), 512, (byte) 0, 334);
				Class1_Sub1_Sub2.method459();
				this.aClass17_3 = new Class17(this.method584(), 496, (byte) 0, 50);
				this.aClass17_4 = new Class17(this.method584(), 269, (byte) 0, 37);
				this.aClass17_5 = new Class17(this.method584(), 249, (byte) 0, 45);
				this.aBoolean259 = true;
				this.aClass17_26.method229();
				Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("17155, " + -618 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
	private int method656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) int local11 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local11 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local11 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("886, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private String method657(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("96020, " + 32 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CMGGUSPR;ZI)V")
	private void method658(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method65();
			@Pc(9) int local9 = arg0.method66(8);
			@Pc(15) int local15;
			if (local9 < this.anInt873) {
				for (local15 = local9; local15 < this.anInt873; local15++) {
					this.anIntArray234[this.anInt923++] = this.anIntArray213[local15];
				}
			}
			if (local9 > this.anInt873) {
				signlink.reporterror(this.aString24 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt873 = 0;
			this.aBoolean213 &= true;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(73) int local73 = this.anIntArray213[local15];
				@Pc(78) Class1_Sub1_Sub1_Sub3_Sub1 local78 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local73];
				@Pc(83) int local83 = arg0.method66(1);
				if (local83 == 0) {
					this.anIntArray213[this.anInt873++] = local73;
					local78.anInt429 = anInt1011;
				} else {
					@Pc(106) int local106 = arg0.method66(2);
					if (local106 == 0) {
						this.anIntArray213[this.anInt873++] = local73;
						local78.anInt429 = anInt1011;
						this.anIntArray228[this.anInt906++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray213[this.anInt873++] = local73;
							local78.anInt429 = anInt1011;
							local157 = arg0.method66(3);
							local78.method262(local157, false, 796);
							local167 = arg0.method66(1);
							if (local167 == 1) {
								this.anIntArray228[this.anInt906++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray213[this.anInt873++] = local73;
							local78.anInt429 = anInt1011;
							local157 = arg0.method66(3);
							local78.method262(local157, true, 796);
							local167 = arg0.method66(3);
							local78.method262(local167, true, 796);
							@Pc(225) int local225 = arg0.method66(1);
							if (local225 == 1) {
								this.anIntArray228[this.anInt906++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray234[this.anInt923++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("74391, " + arg0 + ", " + true + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method659(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method660() {
		try {
			@Pc(6) int local6 = this.anInt1065 * 128 + 64;
			@Pc(13) int local13 = this.anInt1066 * 128 + 64;
			@Pc(24) int local24 = this.method611(local13, this.anInt1027, local6) - this.anInt1067;
			if (this.anInt887 < local6) {
				this.anInt887 += this.anInt1068 + (local6 - this.anInt887) * this.anInt1069 / 1000;
				if (this.anInt887 > local6) {
					this.anInt887 = local6;
				}
			}
			if (this.anInt887 > local6) {
				this.anInt887 -= this.anInt1068 + (this.anInt887 - local6) * this.anInt1069 / 1000;
				if (this.anInt887 < local6) {
					this.anInt887 = local6;
				}
			}
			if (this.anInt888 < local24) {
				this.anInt888 += this.anInt1068 + (local24 - this.anInt888) * this.anInt1069 / 1000;
				if (this.anInt888 > local24) {
					this.anInt888 = local24;
				}
			}
			if (this.anInt888 > local24) {
				this.anInt888 -= this.anInt1068 + (this.anInt888 - local24) * this.anInt1069 / 1000;
				if (this.anInt888 < local24) {
					this.anInt888 = local24;
				}
			}
			if (this.anInt889 < local13) {
				this.anInt889 += this.anInt1068 + (local13 - this.anInt889) * this.anInt1069 / 1000;
				if (this.anInt889 > local13) {
					this.anInt889 = local13;
				}
			}
			if (this.anInt889 > local13) {
				this.anInt889 -= this.anInt1068 + (this.anInt889 - local13) * this.anInt1069 / 1000;
				if (this.anInt889 < local13) {
					this.anInt889 = local13;
				}
			}
			local6 = this.anInt1040 * 128 + 64;
			local13 = this.anInt1041 * 128 + 64;
			local24 = this.method611(local13, this.anInt1027, local6) - this.anInt1042;
			@Pc(222) int local222 = local6 - this.anInt887;
			@Pc(227) int local227 = local24 - this.anInt888;
			@Pc(232) int local232 = local13 - this.anInt889;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(265) int local265 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt890 < local254) {
				this.anInt890 += this.anInt1043 + (local254 - this.anInt890) * this.anInt1044 / 1000;
				if (this.anInt890 > local254) {
					this.anInt890 = local254;
				}
			}
			if (this.anInt890 > local254) {
				this.anInt890 -= this.anInt1043 + (this.anInt890 - local254) * this.anInt1044 / 1000;
				if (this.anInt890 < local254) {
					this.anInt890 = local254;
				}
			}
			@Pc(342) int local342 = local265 - this.anInt891;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt891 += this.anInt1043 + local342 * this.anInt1044 / 1000;
				this.anInt891 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt891 -= this.anInt1043 + -local342 * this.anInt1044 / 1000;
				this.anInt891 &= 0x7FF;
			}
			@Pc(400) int local400 = local265 - this.anInt891;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt891 = local265;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("88922, " + -963 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!CMGGUSPR;I)V")
	private void method661(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(12) int local12;
			@Pc(16) int local16;
			@Pc(19) int local19;
			@Pc(28) int local28;
			@Pc(35) int local35;
			@Pc(39) int local39;
			if (arg0 == 132) {
				local12 = arg1.method84();
				local16 = arg1.method82();
				local19 = arg1.method55();
				local28 = this.anInt1037 + (local19 >> 4 & 0x7);
				local35 = this.anInt1038 + (local19 & 0x7);
				local39 = arg1.method83();
				if (local28 >= 0 && local35 >= 0 && local28 < 104 && local35 < 104 && local12 != this.anInt871) {
					@Pc(57) Class1_Sub1_Sub1_Sub4 local57 = new Class1_Sub1_Sub1_Sub4();
					local57.anInt565 = local16;
					local57.anInt566 = local39;
					if (this.aClass41ArrayArrayArray1[this.anInt1027][local28][local35] == null) {
						this.aClass41ArrayArrayArray1[this.anInt1027][local28][local35] = new Class41(-388);
					}
					this.aClass41ArrayArrayArray1[this.anInt1027][local28][local35].method531(local57);
					this.method695(local28, local35);
				}
			} else {
				@Pc(140) int local140;
				@Pc(145) int local145;
				@Pc(150) int local150;
				@Pc(153) int local153;
				@Pc(159) int local159;
				@Pc(162) int local162;
				@Pc(156) int local156;
				if (arg0 == 85) {
					local12 = arg1.method55();
					local16 = this.anInt1037 + (local12 >> 4 & 0x7);
					local19 = this.anInt1038 + (local12 & 0x7);
					local28 = local16 + arg1.method56();
					local35 = local19 + arg1.method56();
					local39 = arg1.method58();
					local140 = arg1.method57();
					local145 = arg1.method55() * 4;
					local150 = arg1.method55() * 4;
					local153 = arg1.method57();
					local156 = arg1.method57();
					local159 = arg1.method55();
					local162 = arg1.method55();
					if (local16 >= 0 && local19 >= 0 && local16 < 104 && local19 < 104 && local28 >= 0 && local35 >= 0 && local28 < 104 && local35 < 104 && local140 != 65535) {
						local16 = local16 * 128 + 64;
						local19 = local19 * 128 + 64;
						local28 = local28 * 128 + 64;
						local35 = local35 * 128 + 64;
						@Pc(239) Class1_Sub1_Sub1_Sub5 local239 = new Class1_Sub1_Sub1_Sub5(this.method611(local19, this.anInt1027, local16) - local145, this.anInt1027, local156 + anInt1011, local140, local19, local162, local16, this.anInt880, local159, local150, local39, local153 + anInt1011);
						local239.method451(local28, local35, this.method611(local35, this.anInt1027, local28) - local150, local153 + anInt1011);
						this.aClass41_12.method531(local239);
					}
				} else {
					@Pc(383) int local383;
					if (arg0 == 80) {
						local12 = arg1.method83();
						local16 = arg1.method74((byte) 7);
						local19 = this.anInt1037 + (local16 >> 4 & 0x7);
						local28 = this.anInt1038 + (local16 & 0x7);
						local35 = arg1.method74((byte) 7);
						local39 = local35 >> 2;
						local140 = local35 & 0x3;
						local145 = this.anIntArray246[local39];
						if (local19 >= 0 && local28 >= 0 && local19 < 103 && local28 < 103) {
							local150 = this.anIntArrayArrayArray8[this.anInt1027][local19][local28];
							local153 = this.anIntArrayArrayArray8[this.anInt1027][local19 + 1][local28];
							local156 = this.anIntArrayArrayArray8[this.anInt1027][local19 + 1][local28 + 1];
							local159 = this.anIntArrayArrayArray8[this.anInt1027][local19][local28 + 1];
							if (local145 == 0) {
								@Pc(374) Class45 local374 = this.aClass35_1.method418(local28, this.anInt1027, local19);
								if (local374 != null) {
									local383 = local374.anInt767 >> 14 & 0x7FFF;
									if (local39 == 2) {
										local374.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub1(local150, local140 + 4, local156, local153, false, 2, local383, local159, local12, false);
										local374.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub1(local150, local140 + 1 & 0x3, local156, local153, false, 2, local383, local159, local12, false);
									} else {
										local374.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub1(local150, local140, local156, local153, false, local39, local383, local159, local12, false);
									}
								}
							}
							if (local145 == 1) {
								@Pc(451) Class27 local451 = this.aClass35_1.method419(local28, this.anInt1027, local19);
								if (local451 != null) {
									local451.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1_Sub1(local150, 0, local156, local153, false, 4, local451.anInt549 >> 14 & 0x7FFF, local159, local12, false);
								}
							}
							if (local145 == 2) {
								@Pc(485) Class19 local485 = this.aClass35_1.method420(this.anInt1027, local28, local19);
								if (local39 == 11) {
									local39 = 10;
								}
								if (local485 != null) {
									local485.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub1(local150, local140, local156, local153, false, local39, local485.anInt333 >> 14 & 0x7FFF, local159, local12, false);
								}
							}
							if (local145 == 3) {
								@Pc(524) Class43 local524 = this.aClass35_1.method421(local28, this.anInt1027, local19);
								if (local524 != null) {
									local524.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub1(local150, local140, local156, local153, false, 22, local524.anInt722 >> 14 & 0x7FFF, local159, local12, false);
								}
							}
						}
					} else if (arg0 == 38) {
						local12 = arg1.method55();
						local16 = this.anInt1037 + (local12 >> 4 & 0x7);
						local19 = this.anInt1038 + (local12 & 0x7);
						local28 = arg1.method84();
						local35 = arg1.method73();
						local39 = local35 >> 2;
						local140 = local35 & 0x3;
						local145 = this.anIntArray246[local39];
						if (local16 >= 0 && local19 >= 0 && local16 < 104 && local19 < 104) {
							this.method725(local28, local19, local145, local140, local16, this.anInt1027, -1, local39, 0);
						}
					} else {
						if (arg0 == 126) {
							local12 = arg1.method55();
							local16 = this.anInt1037 + (local12 >> 4 & 0x7);
							local19 = this.anInt1038 + (local12 & 0x7);
							local28 = arg1.method57();
							local35 = arg1.method55();
							local39 = local35 >> 4 & 0xF;
							local140 = local35 & 0x7;
							if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0] >= local16 - local39 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0] <= local16 + local39 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0] >= local19 - local39 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0] <= local19 + local39 && this.aBoolean239 && !aBoolean228 && this.anInt988 < 50) {
								this.anIntArray225[this.anInt988] = local28;
								this.anIntArray245[this.anInt988] = local140;
								this.anIntArray247[this.anInt988] = Class3.anIntArray1[local28];
								this.anInt988++;
							}
						}
						@Pc(762) Class1_Sub1_Sub1_Sub4 local762;
						if (arg0 == 142) {
							local12 = arg1.method83();
							local16 = arg1.method57();
							local19 = arg1.method55();
							local28 = this.anInt1037 + (local19 >> 4 & 0x7);
							local35 = this.anInt1038 + (local19 & 0x7);
							if (local28 >= 0 && local35 >= 0 && local28 < 104 && local35 < 104) {
								local762 = new Class1_Sub1_Sub1_Sub4();
								local762.anInt565 = local16;
								local762.anInt566 = local12;
								if (this.aClass41ArrayArrayArray1[this.anInt1027][local28][local35] == null) {
									this.aClass41ArrayArrayArray1[this.anInt1027][local28][local35] = new Class41(-388);
								}
								this.aClass41ArrayArrayArray1[this.anInt1027][local28][local35].method531(local762);
								this.method695(local28, local35);
							}
						} else if (arg0 == 102) {
							local12 = arg1.method55();
							local16 = this.anInt1037 + (local12 >> 4 & 0x7);
							local19 = this.anInt1038 + (local12 & 0x7);
							local28 = arg1.method57();
							local35 = arg1.method55();
							local39 = arg1.method57();
							if (local16 >= 0 && local19 >= 0 && local16 < 104 && local19 < 104) {
								local16 = local16 * 128 + 64;
								local19 = local19 * 128 + 64;
								@Pc(881) Class1_Sub1_Sub1_Sub6 local881 = new Class1_Sub1_Sub1_Sub6((byte) -24, this.method611(local19, this.anInt1027, local16) - local35, local28, anInt1011, this.anInt1027, local39, local19, local16);
								this.aClass41_10.method531(local881);
							}
						} else if (arg0 == 110) {
							local12 = arg1.method55();
							local16 = this.anInt1037 + (local12 >> 4 & 0x7);
							local19 = this.anInt1038 + (local12 & 0x7);
							local28 = arg1.method57();
							local35 = arg1.method57();
							local39 = arg1.method57();
							if (local16 >= 0 && local19 >= 0 && local16 < 104 && local19 < 104) {
								@Pc(937) Class41 local937 = this.aClass41ArrayArrayArray1[this.anInt1027][local16][local19];
								if (local937 != null) {
									for (@Pc(943) Class1_Sub1_Sub1_Sub4 local943 = (Class1_Sub1_Sub1_Sub4) local937.method534(); local943 != null; local943 = (Class1_Sub1_Sub1_Sub4) local937.method536()) {
										if (local943.anInt565 == (local28 & 0x7FFF) && local943.anInt566 == local35) {
											local943.anInt566 = local39;
											break;
										}
									}
									this.method695(local16, local19);
								}
							}
						} else {
							if (arg0 == 193) {
								local12 = arg1.method74((byte) 7);
								local16 = this.anInt1037 + (local12 >> 4 & 0x7);
								local19 = this.anInt1038 + (local12 & 0x7);
								local28 = arg1.method84();
								@Pc(1004) byte local1004 = arg1.method78(this.aByte28);
								@Pc(1007) byte local1007 = arg1.method56();
								@Pc(1011) byte local1011 = arg1.method77();
								local145 = arg1.method57();
								local150 = arg1.method82();
								local153 = arg1.method82();
								@Pc(1026) byte local1026 = arg1.method77();
								local159 = arg1.method55();
								local162 = local159 >> 2;
								local383 = local159 & 0x3;
								@Pc(1042) int local1042 = this.anIntArray246[local162];
								@Pc(1048) Class1_Sub1_Sub1_Sub3_Sub2 local1048;
								if (local150 == this.anInt871) {
									local1048 = aClass1_Sub1_Sub1_Sub3_Sub2_1;
								} else {
									local1048 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local150];
								}
								if (local1048 != null) {
									@Pc(1060) Class48 local1060 = Class48.method567(local28);
									@Pc(1070) int local1070 = this.anIntArrayArrayArray8[this.anInt1027][local16][local19];
									@Pc(1082) int local1082 = this.anIntArrayArrayArray8[this.anInt1027][local16 + 1][local19];
									@Pc(1096) int local1096 = this.anIntArrayArrayArray8[this.anInt1027][local16 + 1][local19 + 1];
									@Pc(1108) int local1108 = this.anIntArrayArrayArray8[this.anInt1027][local16][local19 + 1];
									@Pc(1118) Class1_Sub1_Sub1_Sub2 local1118 = local1060.method558(local162, local383, local1070, local1082, local1096, local1108, -1);
									if (local1118 != null) {
										this.method725(-1, local19, local1042, 0, local16, this.anInt1027, local153 + 1, 0, local145 + 1);
										local1048.anInt439 = local145 + anInt1011;
										local1048.anInt440 = local153 + anInt1011;
										local1048.aClass1_Sub1_Sub1_Sub2_2 = local1118;
										@Pc(1153) int local1153 = local1060.anInt804;
										@Pc(1156) int local1156 = local1060.anInt807;
										if (local383 == 1 || local383 == 3) {
											local1153 = local1060.anInt807;
											local1156 = local1060.anInt804;
										}
										local1048.anInt451 = local16 * 128 + local1153 * 64;
										local1048.anInt453 = local19 * 128 + local1156 * 64;
										local1048.anInt452 = this.method611(local1048.anInt453, this.anInt1027, local1048.anInt451);
										@Pc(1202) byte local1202;
										if (local1026 > local1011) {
											local1202 = local1026;
											local1026 = local1011;
											local1011 = local1202;
										}
										if (local1004 > local1007) {
											local1202 = local1004;
											local1004 = local1007;
											local1007 = local1202;
										}
										local1048.anInt443 = local16 + local1026;
										local1048.anInt445 = local16 + local1011;
										local1048.anInt444 = local19 + local1004;
										local1048.anInt446 = local19 + local1007;
									}
								}
							}
							if (arg0 == 118) {
								local12 = arg1.method83();
								local16 = arg1.method55();
								local19 = this.anInt1037 + (local16 >> 4 & 0x7);
								local28 = this.anInt1038 + (local16 & 0x7);
								if (local19 >= 0 && local28 >= 0 && local19 < 104 && local28 < 104) {
									@Pc(1281) Class41 local1281 = this.aClass41ArrayArrayArray1[this.anInt1027][local19][local28];
									if (local1281 != null) {
										for (local762 = (Class1_Sub1_Sub1_Sub4) local1281.method534(); local762 != null; local762 = (Class1_Sub1_Sub1_Sub4) local1281.method536()) {
											if (local762.anInt565 == (local12 & 0x7FFF)) {
												local762.method552();
												break;
											}
										}
										if (local1281.method534() == null) {
											this.aClass41ArrayArrayArray1[this.anInt1027][local19][local28] = null;
										}
										this.method695(local19, local28);
									}
								}
							} else if (arg0 == 203) {
								local12 = arg1.method74((byte) 7);
								local16 = this.anInt1037 + (local12 >> 4 & 0x7);
								local19 = this.anInt1038 + (local12 & 0x7);
								local28 = arg1.method55();
								local35 = local28 >> 2;
								local39 = local28 & 0x3;
								local140 = this.anIntArray246[local35];
								if (local16 >= 0 && local19 >= 0 && local16 < 104 && local19 < 104) {
									this.method725(-1, local19, local140, local39, local16, this.anInt1027, -1, local35, 0);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1388) RuntimeException local1388) {
			signlink.reporterror("74609, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(BI)V")
	private void method662(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub4_7.anIntArray171;
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
						this.aClass35_1.method431(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass35_1.method431(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			anInt894++;
			if (anInt894 > 117) {
				anInt894 = 0;
				this.aClass1_Sub1_Sub3_9.method44(241, this.anInt902);
				this.aClass1_Sub1_Sub3_9.method48(7589952);
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub4_7.method468((byte) 4);
			@Pc(165) int local165;
			for (@Pc(161) int local161 = 1; local161 < 103; local161++) {
				for (local165 = 1; local165 < 103; local165++) {
					if ((this.aByteArrayArrayArray8[arg0][local165][local161] & 0x18) == 0) {
						this.method640(local161, local36, local165, local34, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local165][local161] & 0x8) != 0) {
						this.method640(local161, local36, local165, local34, arg0 + 1);
					}
				}
			}
			if (this.aClass17_26 != null) {
				this.aClass17_26.method229();
				Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
			}
			this.anInt925 = 0;
			@Pc(239) int local239;
			for (local165 = 0; local165 < 104; local165++) {
				for (local239 = 0; local239 < 104; local239++) {
					@Pc(249) int local249 = this.aClass35_1.method425(this.anInt1027, local165, local239);
					if (local249 != 0) {
						local249 = local249 >> 14 & 0x7FFF;
						@Pc(261) int local261 = Class48.method567(local249).anInt814;
						if (local261 >= 0) {
							@Pc(265) int local265 = local165;
							@Pc(267) int local267 = local239;
							if (local261 != 22 && local261 != 29 && local261 != 34 && local261 != 36 && local261 != 46 && local261 != 47 && local261 != 48) {
								@Pc(299) int[][] local299 = this.aClass40Array1[this.anInt1027].anIntArrayArray19;
								for (@Pc(301) int local301 = 0; local301 < 10; local301++) {
									@Pc(308) int local308 = (int) (Math.random() * 4.0D);
									if (local308 == 0 && local265 > 0 && local265 > local165 - 3 && (local299[local265 - 1][local267] & 0x1280108) == 0) {
										local265--;
									}
									if (local308 == 1 && local265 < 103 && local265 < local165 + 3 && (local299[local265 + 1][local267] & 0x1280180) == 0) {
										local265++;
									}
									if (local308 == 2 && local267 > 0 && local267 > local239 - 3 && (local299[local265][local267 - 1] & 0x1280102) == 0) {
										local267--;
									}
									if (local308 == 3 && local267 < 103 && local267 < local239 + 3 && (local299[local265][local267 + 1] & 0x1280120) == 0) {
										local267++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub4Array7[this.anInt925] = this.aClass1_Sub1_Sub2_Sub4Array8[local261];
							this.anIntArray240[this.anInt925] = local265;
							this.anIntArray241[this.anInt925] = local267;
							this.anInt925++;
						}
					}
				}
			}
			if (this.aByte32 != -123) {
				anInt896 = 46;
			}
			anInt947++;
			if (anInt947 > 1985) {
				anInt947 = 0;
				this.aClass1_Sub1_Sub3_9.method44(222, this.anInt902);
				this.aClass1_Sub1_Sub3_9.method45(0);
				local239 = this.aClass1_Sub1_Sub3_9.anInt78;
				this.aClass1_Sub1_Sub3_9.method46(23056);
				this.aClass1_Sub1_Sub3_9.method46(58648);
				this.aClass1_Sub1_Sub3_9.method46((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_9.method45(237);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_9.method45(161);
				}
				this.aClass1_Sub1_Sub3_9.method46(8273);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_9.method46(62228);
				}
				this.aClass1_Sub1_Sub3_9.method46(35150);
				this.aClass1_Sub1_Sub3_9.method46((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_9.method46(4025);
				}
				this.aClass1_Sub1_Sub3_9.method54(this.aClass1_Sub1_Sub3_9.anInt78 - local239);
			}
		} catch (@Pc(537) RuntimeException local537) {
			signlink.reporterror("76274, " + -123 + ", " + arg0 + ", " + local537.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method663(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt997 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(20) String[] local20 = new String[100];
				@Pc(22) int local22 = 0;
				while (true) {
					@Pc(26) int local26 = local12.indexOf(" ");
					if (local26 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local20[local22++] = local12.toLowerCase();
						}
						this.anInt997 = 0;
						label49: for (local26 = 0; local26 < Class23.anInt362; local26++) {
							@Pc(75) Class23 local75 = Class23.method248(local26);
							if (local75.anInt350 == -1 && local75.aString5 != null) {
								@Pc(86) String local86 = local75.aString5.toLowerCase();
								for (@Pc(88) int local88 = 0; local88 < local22; local88++) {
									if (local86.indexOf(local20[local88]) == -1) {
										continue label49;
									}
								}
								this.aStringArray11[this.anInt997] = local86;
								this.anIntArray255[this.anInt997] = local26;
								this.anInt997++;
								if (this.anInt997 >= this.aStringArray11.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(35) String local35 = local12.substring(0, local26).trim();
					if (local35.length() > 0) {
						local20[local22++] = local35.toLowerCase();
					}
					local12 = local12.substring(local26 + 1);
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("19620, " + 25258 + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	private void method664(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 0 && this.anInt962 != -1) {
				this.aString17 = arg1;
				super.anInt852 = 0;
			}
			if (this.anInt1091 == -1) {
				this.aBoolean256 = true;
			}
			for (@Pc(27) int local27 = 99; local27 > 0; local27--) {
				this.anIntArray256[local27] = this.anIntArray256[local27 - 1];
				this.aStringArray12[local27] = this.aStringArray12[local27 - 1];
				this.aStringArray13[local27] = this.aStringArray13[local27 - 1];
			}
			this.anIntArray256[0] = arg2;
			this.aStringArray12[0] = arg0;
			this.aStringArray13[0] = arg1;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("32974, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!WJQTPVDG;IBI)V")
	private void method665(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1.anInt734 == 0 && arg1.anIntArray195 != null && (!arg1.aBoolean173 || this.anInt1048 == arg1.anInt758 || this.anInt994 == arg1.anInt758 || this.anInt915 == arg1.anInt758)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt657;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt655;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt658;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt656;
				Class1_Sub1_Sub2.method458(arg0, arg0 + arg1.anInt747, arg2 + arg1.anInt744, arg2);
				@Pc(51) int local51 = arg1.anIntArray195.length;
				for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
					@Pc(70) int local70 = arg1.anIntArray194[local61] + arg2;
					@Pc(79) int local79 = arg1.anIntArray197[local61] + arg0 - arg3;
					@Pc(85) Class44 local85 = Class44.method544(arg1.anIntArray195[local61]);
					@Pc(90) int local90 = local70 + local85.anInt752;
					@Pc(95) int local95 = local79 + local85.anInt727;
					if (local85.anInt730 > 0) {
						this.method653(local85);
					}
					if (local85.anInt734 == 0) {
						if (local85.anInt738 > local85.anInt740 - local85.anInt747) {
							local85.anInt738 = local85.anInt740 - local85.anInt747;
						}
						if (local85.anInt738 < 0) {
							local85.anInt738 = 0;
						}
						this.method665(local95, local85, local90, local85.anInt738);
						if (local85.anInt740 > local85.anInt747) {
							this.method694(local95, local90 + local85.anInt744, local85.anInt738, local85.anInt747, local85.anInt740);
						}
					} else if (local85.anInt734 != 1) {
						@Pc(167) int local167;
						@Pc(171) int local171;
						@Pc(182) int local182;
						@Pc(217) int local217;
						@Pc(224) int local224;
						@Pc(249) int local249;
						@Pc(165) int local165;
						@Pc(215) int local215;
						if (local85.anInt734 == 2) {
							local165 = 0;
							for (local167 = 0; local167 < local85.anInt747; local167++) {
								for (local171 = 0; local171 < local85.anInt744; local171++) {
									local182 = local90 + local171 * (local85.anInt743 + 32);
									@Pc(191) int local191 = local95 + local167 * (local85.anInt746 + 32);
									if (local165 < 20) {
										local182 += local85.anIntArray190[local165];
										local191 += local85.anIntArray196[local165];
									}
									if (local85.anIntArray192[local165] > 0) {
										local215 = 0;
										local217 = 0;
										local224 = local85.anIntArray192[local165] - 1;
										if (local182 > Class1_Sub1_Sub2.anInt657 - 32 && local182 < Class1_Sub1_Sub2.anInt658 && local191 > Class1_Sub1_Sub2.anInt655 - 32 && local191 < Class1_Sub1_Sub2.anInt656 || this.anInt1061 != 0 && this.anInt1060 == local165) {
											local249 = 0;
											if (this.anInt931 == 1 && this.anInt932 == local165 && this.anInt933 == local85.anInt758) {
												local249 = 16777215;
											}
											@Pc(274) Class1_Sub1_Sub2_Sub4 local274 = Class23.method254(local249, local224, local85.anIntArray193[local165], this.anInt862);
											if (local274 != null) {
												@Pc(353) int local353;
												if (this.anInt1061 != 0 && this.anInt1060 == local165 && this.anInt1059 == local85.anInt758) {
													local215 = super.anInt847 - this.anInt1062;
													local217 = super.anInt848 - this.anInt1063;
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (local217 < 5 && local217 > -5) {
														local217 = 0;
													}
													if (this.anInt907 < 5) {
														local215 = 0;
														local217 = 0;
													}
													local274.method475(local182 + local215, local191 + local217);
													if (local191 + local217 < Class1_Sub1_Sub2.anInt655 && arg1.anInt738 > 0) {
														local353 = this.anInt917 * (Class1_Sub1_Sub2.anInt655 - local191 - local217) / 3;
														if (local353 > this.anInt917 * 10) {
															local353 = this.anInt917 * 10;
														}
														if (local353 > arg1.anInt738) {
															local353 = arg1.anInt738;
														}
														arg1.anInt738 -= local353;
														this.anInt1063 += local353;
													}
													if (local191 + local217 + 32 > Class1_Sub1_Sub2.anInt656 && arg1.anInt738 < arg1.anInt740 - arg1.anInt747) {
														local353 = this.anInt917 * (local191 + local217 + 32 - Class1_Sub1_Sub2.anInt656) / 3;
														if (local353 > this.anInt917 * 10) {
															local353 = this.anInt917 * 10;
														}
														if (local353 > arg1.anInt740 - arg1.anInt747 - arg1.anInt738) {
															local353 = arg1.anInt740 - arg1.anInt747 - arg1.anInt738;
														}
														arg1.anInt738 += local353;
														this.anInt1063 -= local353;
													}
												} else if (this.anInt1054 != 0 && this.anInt1053 == local165 && this.anInt1052 == local85.anInt758) {
													local274.method475(local182, local191);
												} else {
													local274.method473(local182, this.aByte39, local191);
												}
												if (local274.anInt670 == 33 || local85.anIntArray193[local165] != 1) {
													local353 = local85.anIntArray193[local165];
													this.aClass1_Sub1_Sub2_Sub1_2.method111(local182 + local215 + 1, 0, method595(local353), local191 + local217 + 10);
													this.aClass1_Sub1_Sub2_Sub1_2.method111(local182 + local215, 16776960, method595(local353), local191 + local217 + 9);
												}
											}
										}
									} else if (local85.aClass1_Sub1_Sub2_Sub4Array2 != null && local165 < 20) {
										@Pc(543) Class1_Sub1_Sub2_Sub4 local543 = local85.aClass1_Sub1_Sub2_Sub4Array2[local165];
										if (local543 != null) {
											local543.method473(local182, this.aByte39, local191);
										}
									}
									local165++;
								}
							}
						} else if (local85.anInt734 == 3) {
							@Pc(570) boolean local570 = false;
							if (this.anInt915 == local85.anInt758 || this.anInt994 == local85.anInt758 || this.anInt1048 == local85.anInt758) {
								local570 = true;
							}
							if (this.method601(local85)) {
								local165 = local85.anInt755;
								if (local570 && local85.anInt732 != 0) {
									local165 = local85.anInt732;
								}
							} else {
								local165 = local85.anInt729;
								if (local570 && local85.anInt723 != 0) {
									local165 = local85.anInt723;
								}
							}
							if (local85.aByte20 == 0) {
								if (local85.aBoolean174) {
									Class1_Sub1_Sub2.method461(local85.anInt744, local90, local85.anInt747, local165, local95);
								} else {
									Class1_Sub1_Sub2.method462(local85.anInt747, local85.anInt744, local165, local90, this.anInt1020, local95);
								}
							} else if (local85.aBoolean174) {
								Class1_Sub1_Sub2.method460(256 - (local85.aByte20 & 0xFF), local85.anInt744, local95, local85.anInt747, local90, local165);
							} else {
								Class1_Sub1_Sub2.method463(local85.anInt744, local95, local85.anInt747, local165, local90, 256 - (local85.aByte20 & 0xFF));
							}
						} else {
							@Pc(689) Class1_Sub1_Sub2_Sub1 local689;
							@Pc(966) String local966;
							if (local85.anInt734 == 4) {
								local689 = local85.aClass1_Sub1_Sub2_Sub1_1;
								@Pc(692) String local692 = local85.aString12;
								@Pc(694) boolean local694 = false;
								if (this.anInt915 == local85.anInt758 || this.anInt994 == local85.anInt758 || this.anInt1048 == local85.anInt758) {
									local694 = true;
								}
								if (this.method601(local85)) {
									local167 = local85.anInt755;
									if (local694 && local85.anInt732 != 0) {
										local167 = local85.anInt732;
									}
									if (local85.aString15.length() > 0) {
										local692 = local85.aString15;
									}
								} else {
									local167 = local85.anInt729;
									if (local694 && local85.anInt723 != 0) {
										local167 = local85.anInt723;
									}
								}
								if (local85.anInt742 == 6 && this.aBoolean247) {
									local692 = "Please wait...";
									local167 = local85.anInt729;
								}
								if (Class1_Sub1_Sub2.anInt653 == 479) {
									if (local167 == 16776960) {
										local167 = 255;
									}
									if (local167 == 49152) {
										local167 = 16777215;
									}
								}
								local215 = local95 + local689.anInt102;
								while (local692.length() > 0) {
									if (local692.indexOf("%") != -1) {
										label390: while (true) {
											local217 = local692.indexOf("%1");
											if (local217 == -1) {
												while (true) {
													local217 = local692.indexOf("%2");
													if (local217 == -1) {
														while (true) {
															local217 = local692.indexOf("%3");
															if (local217 == -1) {
																while (true) {
																	local217 = local692.indexOf("%4");
																	if (local217 == -1) {
																		while (true) {
																			local217 = local692.indexOf("%5");
																			if (local217 == -1) {
																				break label390;
																			}
																			local692 = local692.substring(0, local217) + this.method657(this.method600(4, local85)) + local692.substring(local217 + 2);
																		}
																	}
																	local692 = local692.substring(0, local217) + this.method657(this.method600(3, local85)) + local692.substring(local217 + 2);
																}
															}
															local692 = local692.substring(0, local217) + this.method657(this.method600(2, local85)) + local692.substring(local217 + 2);
														}
													}
													local692 = local692.substring(0, local217) + this.method657(this.method600(1, local85)) + local692.substring(local217 + 2);
												}
											}
											local692 = local692.substring(0, local217) + this.method657(this.method600(0, local85)) + local692.substring(local217 + 2);
										}
									}
									local217 = local692.indexOf("\\n");
									if (local217 == -1) {
										local966 = local692;
										local692 = "";
									} else {
										local966 = local692.substring(0, local217);
										local692 = local692.substring(local217 + 2);
									}
									if (local85.aBoolean178) {
										local689.method108(local215, local167, local85.aBoolean172, local90 + local85.anInt744 / 2, local966);
									} else {
										local689.method115(local90, local215, local85.aBoolean172, local966, local167);
									}
									local215 += local689.anInt102;
								}
							} else if (local85.anInt734 == 5) {
								@Pc(1028) Class1_Sub1_Sub2_Sub4 local1028;
								if (this.method601(local85)) {
									local1028 = local85.aClass1_Sub1_Sub2_Sub4_2;
								} else {
									local1028 = local85.aClass1_Sub1_Sub2_Sub4_1;
								}
								if (local1028 != null) {
									local1028.method473(local90, this.aByte39, local95);
								}
							} else if (local85.anInt734 == 6) {
								local165 = Class1_Sub1_Sub2_Sub2.anInt502;
								local167 = Class1_Sub1_Sub2_Sub2.anInt503;
								Class1_Sub1_Sub2_Sub2.anInt502 = local90 + local85.anInt744 / 2;
								Class1_Sub1_Sub2_Sub2.anInt503 = local95 + local85.anInt747 / 2;
								local171 = Class1_Sub1_Sub2_Sub2.anIntArray138[local85.anInt725] * local85.anInt724 >> 16;
								local182 = Class1_Sub1_Sub2_Sub2.anIntArray139[local85.anInt725] * local85.anInt724 >> 16;
								@Pc(1090) boolean local1090 = this.method601(local85);
								if (local1090) {
									local215 = local85.anInt761;
								} else {
									local215 = local85.anInt760;
								}
								@Pc(1110) Class1_Sub1_Sub1_Sub2 local1110;
								if (local215 == -1) {
									local1110 = local85.method539(-1, local1090, -1);
								} else {
									@Pc(1116) Class46 local1116 = Class46.aClass46Array1[local215];
									local1110 = local85.method539(local1116.anIntArray199[local85.anInt737], local1090, local1116.anIntArray198[local85.anInt737]);
								}
								if (local1110 != null) {
									local1110.method164(local85.anInt726, 0, local85.anInt725, 0, local171, local182);
								}
								Class1_Sub1_Sub2_Sub2.anInt502 = local165;
								Class1_Sub1_Sub2_Sub2.anInt503 = local167;
							} else {
								if (local85.anInt734 == 7) {
									local689 = local85.aClass1_Sub1_Sub2_Sub1_1;
									local167 = 0;
									for (local171 = 0; local171 < local85.anInt747; local171++) {
										for (local182 = 0; local182 < local85.anInt744; local182++) {
											if (local85.anIntArray192[local167] > 0) {
												@Pc(1180) Class23 local1180 = Class23.method248(local85.anIntArray192[local167] - 1);
												@Pc(1184) String local1184 = String.valueOf(local1180.aString5);
												if (local1180.aBoolean72 || local85.anIntArray193[local167] != 1) {
													local1184 = local1184 + " x" + method642(local85.anIntArray193[local167]);
												}
												local217 = local90 + local182 * (local85.anInt743 + 115);
												local224 = local95 + local171 * (local85.anInt746 + 12);
												if (local85.aBoolean178) {
													local689.method108(local224, local85.anInt729, local85.aBoolean172, local217 + local85.anInt744 / 2, local1184);
												} else {
													local689.method115(local217, local224, local85.aBoolean172, local1184, local85.anInt729);
												}
											}
											local167++;
										}
									}
								}
								if (local85.anInt734 == 8 && (this.anInt884 == local85.anInt758 || this.anInt866 == local85.anInt758 || this.anInt900 == local85.anInt758) && this.anInt1016 == 100) {
									local165 = 0;
									local167 = 0;
									@Pc(1298) Class1_Sub1_Sub2_Sub1 local1298 = this.aClass1_Sub1_Sub2_Sub1_3;
									@Pc(1301) String local1301 = local85.aString12;
									while (local1301.length() > 0) {
										local215 = local1301.indexOf("\\n");
										if (local215 == -1) {
											local966 = local1301;
											local1301 = "";
										} else {
											local966 = local1301.substring(0, local215);
											local1301 = local1301.substring(local215 + 2);
										}
										local217 = local1298.method109(local966);
										if (local217 > local165) {
											local165 = local217;
										}
										local167 += local1298.anInt102 + 1;
									}
									local165 += 6;
									local167 += 7;
									local215 = local90 + local85.anInt744 - local165 - 5;
									local217 = local95 + local85.anInt747 + 5;
									if (local215 < local90 + 5) {
										local215 = local90 + 5;
									}
									if (local215 + local165 > arg2 + arg1.anInt744) {
										local215 = arg2 + arg1.anInt744 - local165;
									}
									if (local217 + local167 > arg0 + arg1.anInt747) {
										local217 = arg0 + arg1.anInt747 - local167;
									}
									Class1_Sub1_Sub2.method461(local165, local215, local167, 16777120, local217);
									Class1_Sub1_Sub2.method462(local167, local165, 0, local215, this.anInt1020, local217);
									local1301 = local85.aString12;
									local224 = local217 + local1298.anInt102 + 2;
									while (local1301.length() > 0) {
										local249 = local1301.indexOf("\\n");
										if (local249 == -1) {
											local966 = local1301;
											local1301 = "";
										} else {
											local966 = local1301.substring(0, local249);
											local1301 = local1301.substring(local249 + 2);
										}
										local1298.method115(local215 + 3, local224, false, local966, 0);
										local224 += local1298.anInt102 + 1;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method458(local31, local35, local33, local29);
			}
		} catch (@Pc(1487) RuntimeException local1487) {
			signlink.reporterror("89689, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -88 + ", " + arg3 + ", " + local1487.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method666() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt974);
			if (this.aClass36_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass36_Sub1_1.anInt701);
			}
			System.out.println("loop-cycle:" + anInt1011);
			System.out.println("draw-cycle:" + anInt892);
			System.out.println("ptype:" + this.anInt1077);
			System.out.println("psize:" + this.anInt1076);
			if (this.aClass39_1 != null) {
				this.aClass39_1.method518(302);
			}
			super.aBoolean209 = true;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("38957, " + 302 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method584() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("52043, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method667(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt1072; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray10[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString7);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("81089, " + arg0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(BI)V")
	private void method668(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) Class44 local10 = Class44.method544(arg0);
			for (@Pc(12) int local12 = 0; local12 < local10.anIntArray195.length && local10.anIntArray195[local12] != -1; local12++) {
				@Pc(26) Class44 local26 = Class44.method544(local10.anIntArray195[local12]);
				if (local26.anInt734 == 1) {
					this.method668(local26.anInt758);
				}
				local26.anInt737 = 0;
				local26.anInt759 = 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("28508, " + -11 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method669(@OriginalArg(0) byte arg0) {
		try {
			this.method641();
			if (this.anInt1058 == 1) {
				this.aClass1_Sub1_Sub2_Sub4Array10[this.anInt1057 / 100].method473(this.anInt1055 - 8 - 4, this.aByte39, this.anInt1056 - 8 - 4);
			}
			if (this.anInt1058 == 2) {
				this.aClass1_Sub1_Sub2_Sub4Array10[this.anInt1057 / 100 + 4].method473(this.anInt1055 - 8 - 4, this.aByte39, this.anInt1056 - 8 - 4);
			}
			if (this.anInt948 != -1) {
				this.method632(this.anInt917, this.anInt948);
				this.method665(0, Class44.method544(this.anInt948), 0, 0);
			}
			if (this.anInt1007 != -1) {
				this.method632(this.anInt917, this.anInt1007);
				this.method665(0, Class44.method544(this.anInt1007), 0, 0);
			}
			this.method649();
			@Pc(108) boolean local108 = false;
			if (!this.aBoolean242) {
				this.method711((byte) 8);
				this.method697();
			} else if (this.anInt965 == 0) {
				this.method689();
			}
			if (this.anInt1029 == 1) {
				this.aClass1_Sub1_Sub2_Sub4_3.method473(472, this.aByte39, 296);
			}
			@Pc(183) int local183;
			if (aBoolean215) {
				@Pc(149) byte local149 = 20;
				@Pc(151) int local151 = 16776960;
				if (super.anInt842 < 30 && aBoolean228) {
					local151 = 16711680;
				}
				if (super.anInt842 < 20 && !aBoolean228) {
					local151 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub1_3.method106(local151, 20, "Fps:" + super.anInt842);
				local183 = local149 + 15;
				@Pc(185) Runtime local185 = Runtime.getRuntime();
				@Pc(194) int local194 = (int) ((local185.totalMemory() - local185.freeMemory()) / 1024L);
				if (local194 > 33554432 && aBoolean228) {
				}
				if (local194 > 67108864 && !aBoolean228) {
				}
				this.aClass1_Sub1_Sub2_Sub1_3.method106(16776960, 35, "Mem:" + local194 + "k");
				local183 += 15;
			}
			if (this.anInt1019 != 0) {
				@Pc(235) int local235 = this.anInt1019 / 50;
				local183 = local235 / 60;
				@Pc(243) int local243 = local235 % 60;
				if (local243 < 10) {
					this.aClass1_Sub1_Sub2_Sub1_3.method111(4, 16776960, "System update in: " + local183 + ":0" + local243, 329);
				} else {
					this.aClass1_Sub1_Sub2_Sub1_3.method111(4, 16776960, "System update in: " + local183 + ":" + local243, 329);
				}
				anInt981++;
				if (anInt981 > 188) {
					anInt981 = 0;
					this.aClass1_Sub1_Sub3_9.method44(175, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method48(10814849);
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("71258, " + arg0 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method670() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) this.aClass41_12.method534(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub5) this.aClass41_12.method536()) {
				if (local6.anInt636 != this.anInt1027 || anInt1011 > local6.anInt647) {
					local6.method552();
				} else if (anInt1011 >= local6.anInt646) {
					if (local6.anInt635 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub3_Sub1 local36 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local6.anInt635 - 1];
						if (local36 != null && local36.anInt424 >= 0 && local36.anInt424 < 13312 && local36.anInt425 >= 0 && local36.anInt425 < 13312) {
							local6.method451(local36.anInt424, local36.anInt425, this.method611(local36.anInt425, local6.anInt636, local36.anInt424) - local6.anInt645, anInt1011);
						}
					}
					if (local6.anInt635 < 0) {
						@Pc(81) int local81 = -local6.anInt635 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub3_Sub2 local87;
						if (local81 == this.anInt871) {
							local87 = aClass1_Sub1_Sub1_Sub3_Sub2_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local81];
						}
						if (local87 != null && local87.anInt424 >= 0 && local87.anInt424 < 13312 && local87.anInt425 >= 0 && local87.anInt425 < 13312) {
							local6.method451(local87.anInt424, local87.anInt425, this.method611(local87.anInt425, local6.anInt636, local87.anInt424) - local6.anInt645, anInt1011);
						}
					}
					local6.method452(this.anInt917);
					this.aClass35_1.method407(local6, this.anInt1027, (int) local6.aDouble6, false, (int) local6.aDouble5, local6.anInt639, -1, 60, (int) local6.aDouble7);
				}
			}
			anInt874++;
			if (this.aByte33 != 67) {
				this.anInt1020 = -77;
			}
			if (anInt874 > 1712) {
				anInt874 = 0;
				this.aClass1_Sub1_Sub3_9.method44(23, this.anInt902);
				this.aClass1_Sub1_Sub3_9.method45(0);
				@Pc(195) int local195 = this.aClass1_Sub1_Sub3_9.anInt78;
				this.aClass1_Sub1_Sub3_9.method45((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_9.method46(9019);
				this.aClass1_Sub1_Sub3_9.method46(61258);
				this.aClass1_Sub1_Sub3_9.method45(42);
				this.aClass1_Sub1_Sub3_9.method45((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_9.method45((int) (Math.random() * 256.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_9.method45(188);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_9.method45(170);
				}
				this.aClass1_Sub1_Sub3_9.method45((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_9.method45((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_9.method54(this.aClass1_Sub1_Sub3_9.anInt78 - local195);
			}
		} catch (@Pc(271) RuntimeException local271) {
			signlink.reporterror("37876, " + 67 + ", " + local271.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method580() {
		try {
			if (!this.aBoolean224 && !this.aBoolean244 && !this.aBoolean248) {
				anInt1011++;
				if (this.aBoolean213) {
					this.method724();
				} else {
					this.method627();
				}
				this.method699();
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("7723, " + true + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method671() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray212[8] = 0;
			@Pc(10) int local10 = 0;
			while (this.anIntArray212[8] == 0) {
				@Pc(22) String local22 = "Unknown problem";
				this.method586("Connecting to web server", 20);
				try {
					@Pc(44) DataInputStream local44 = this.method696("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 359);
					@Pc(51) Class1_Sub1_Sub3 local51 = new Class1_Sub1_Sub3(new byte[40], anInt972);
					local44.readFully(local51.aByteArray8, 0, 40);
					local44.close();
					for (@Pc(61) int local61 = 0; local61 < 9; local61++) {
						this.anIntArray212[local61] = local51.method60();
					}
					@Pc(76) int local76 = local51.method60();
					@Pc(78) int local78 = 1234;
					for (@Pc(80) int local80 = 0; local80 < 9; local80++) {
						local78 = (local78 << 1) + this.anIntArray212[local80];
					}
					if (local76 != local78) {
						local22 = "checksum problem";
						this.anIntArray212[8] = 0;
					}
				} catch (@Pc(107) EOFException local107) {
					local22 = "EOF problem";
					this.anIntArray212[8] = 0;
				} catch (@Pc(116) IOException local116) {
					local22 = "connection problem";
					this.anIntArray212[8] = 0;
				} catch (@Pc(125) Exception local125) {
					local22 = "logic problem";
					this.anIntArray212[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray212[8] == 0) {
					local10++;
					for (@Pc(143) int local143 = local3; local143 > 0; local143--) {
						if (local10 >= 10) {
							this.method586("Game updated - please reload page", 10);
							local143 = 10;
						} else {
							this.method586(local22 + " - Will retry in " + local143 + " secs.", 10);
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
					this.aBoolean233 = !this.aBoolean233;
				}
			}
		} catch (@Pc(205) RuntimeException local205) {
			signlink.reporterror("21504, " + -454 + ", " + local205.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method672(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass17_15 == null) {
				super.aClass17_2 = null;
				this.aClass17_27 = null;
				this.aClass17_25 = null;
				this.aClass17_24 = null;
				this.aClass17_26 = null;
				this.aClass17_3 = null;
				this.aClass17_4 = null;
				this.aClass17_5 = null;
				this.aClass17_18 = new Class17(this.method584(), 128, (byte) 0, 265);
				Class1_Sub1_Sub2.method459();
				this.aClass17_19 = new Class17(this.method584(), 128, (byte) 0, 265);
				Class1_Sub1_Sub2.method459();
				this.aClass17_15 = new Class17(this.method584(), 509, (byte) 0, 171);
				Class1_Sub1_Sub2.method459();
				this.aClass17_16 = new Class17(this.method584(), 360, (byte) 0, 132);
				Class1_Sub1_Sub2.method459();
				this.aClass17_17 = new Class17(this.method584(), 360, (byte) 0, 200);
				Class1_Sub1_Sub2.method459();
				this.aClass17_20 = new Class17(this.method584(), 202, (byte) 0, 238);
				Class1_Sub1_Sub2.method459();
				if (arg0 >= 0) {
					this.method579();
				}
				this.aClass17_21 = new Class17(this.method584(), 203, (byte) 0, 238);
				Class1_Sub1_Sub2.method459();
				this.aClass17_22 = new Class17(this.method584(), 74, (byte) 0, 94);
				Class1_Sub1_Sub2.method459();
				this.aClass17_23 = new Class17(this.method584(), 75, (byte) 0, 94);
				Class1_Sub1_Sub2.method459();
				if (this.aClass38_2 != null) {
					this.method651();
					this.method631();
				}
				this.aBoolean259 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("69870, " + arg0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method673(@OriginalArg(0) boolean arg0) {
		try {
			this.method672(this.anInt875);
			this.aClass17_17.method229();
			this.aClass1_Sub1_Sub2_Sub3_1.method371(0, this.aByte39, 0);
			@Pc(54) byte local54;
			@Pc(66) int local66;
			if (this.anInt865 == 0) {
				this.aClass1_Sub1_Sub2_Sub1_2.method108(180, 7711145, true, 180, this.aClass36_Sub1_1.aString10);
				local54 = 80;
				this.aClass1_Sub1_Sub2_Sub1_4.method108(80, 16776960, true, 180, "Welcome to RuneScape");
				local66 = local54 + 30;
				this.aClass1_Sub1_Sub2_Sub3_2.method371(27, this.aByte39, 100);
				this.aClass1_Sub1_Sub2_Sub1_4.method108(125, 16777215, true, 100, "New User");
				this.aClass1_Sub1_Sub2_Sub3_2.method371(187, this.aByte39, 100);
				this.aClass1_Sub1_Sub2_Sub1_4.method108(125, 16777215, true, 260, "Existing User");
			}
			if (this.anInt865 == 2) {
				local54 = 60;
				if (this.aString30.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub1_4.method108(45, 16776960, true, 180, this.aString30);
					this.aClass1_Sub1_Sub2_Sub1_4.method108(60, 16776960, true, 180, this.aString31);
					local66 = local54 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub1_4.method108(53, 16776960, true, 180, this.aString31);
					local66 = local54 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub1_4.method115(90, 90, true, "Username: " + this.aString24 + (this.anInt898 == 0 & anInt1011 % 40 < 20 ? "@yel@|" : ""), 16777215);
				local66 += 15;
				this.aClass1_Sub1_Sub2_Sub1_4.method115(92, 105, true, "Password: " + Class49.method573(this.aString25) + (this.anInt898 == 1 & anInt1011 % 40 < 20 ? "@yel@|" : ""), 16777215);
				local66 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_2.method371(27, this.aByte39, 130);
					this.aClass1_Sub1_Sub2_Sub1_4.method108(155, 16777215, true, 100, "Login");
					this.aClass1_Sub1_Sub2_Sub3_2.method371(187, this.aByte39, 130);
					this.aClass1_Sub1_Sub2_Sub1_4.method108(155, 16777215, true, 260, "Cancel");
				}
			}
			if (this.anInt865 == 3) {
				this.aClass1_Sub1_Sub2_Sub1_4.method108(40, 16776960, true, 180, "Create a free account");
				local54 = 65;
				this.aClass1_Sub1_Sub2_Sub1_4.method108(65, 16777215, true, 180, "To create a new account you need to");
				local66 = local54 + 15;
				this.aClass1_Sub1_Sub2_Sub1_4.method108(80, 16777215, true, 180, "go back to the main RuneScape webpage");
				local66 += 15;
				this.aClass1_Sub1_Sub2_Sub1_4.method108(95, 16777215, true, 180, "and choose the 'create account'");
				local66 += 15;
				this.aClass1_Sub1_Sub2_Sub1_4.method108(110, 16777215, true, 180, "button near the top of that page.");
				local66 += 15;
				this.aClass1_Sub1_Sub2_Sub3_2.method371(107, this.aByte39, 130);
				this.aClass1_Sub1_Sub2_Sub1_4.method108(155, 16777215, true, 180, "Cancel");
			}
			this.aClass17_17.method230(202, 171, super.aGraphics2);
			if (this.aBoolean259) {
				this.aBoolean259 = false;
				this.aClass17_15.method230(128, 0, super.aGraphics2);
				this.aClass17_16.method230(202, 371, super.aGraphics2);
				this.aClass17_20.method230(0, 265, super.aGraphics2);
				this.aClass17_21.method230(562, 265, super.aGraphics2);
				this.aClass17_22.method230(128, 171, super.aGraphics2);
				this.aClass17_23.method230(562, 171, super.aGraphics2);
			}
		} catch (@Pc(504) RuntimeException local504) {
			signlink.reporterror("72943, " + arg0 + ", " + 0 + ", " + local504.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method674(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1072 >= 100 && this.anInt869 != 1) {
					this.method664("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt1072 >= 200) {
					this.method664("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(38) String local38 = Class49.method572(Class49.method569(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1072; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method664("", local38 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt1089; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method664("", "Please remove " + local38 + " from your ignore list first", 0);
							return;
						}
					}
					this.anInt1076 += 0;
					if (!local38.equals(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString7)) {
						this.aStringArray10[this.anInt1072] = local38;
						this.aLongArray3[this.anInt1072] = arg0;
						this.anIntArray254[this.anInt1072] = 0;
						this.anInt1072++;
						this.aBoolean245 = true;
						this.aClass1_Sub1_Sub3_9.method44(221, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method51(arg0);
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("46913, " + arg0 + ", " + 0 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!WJQTPVDG;III)V")
	private void method675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class44 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (1 == this.anInt949 && (arg4.anInt734 == 0 && arg4.anIntArray195 != null && !arg4.aBoolean173 && (arg0 >= arg1 && arg5 >= arg2 && arg0 <= arg1 + arg4.anInt744 && arg5 <= arg2 + arg4.anInt747))) {
				@Pc(39) int local39 = arg4.anIntArray195.length;
				for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
					@Pc(50) int local50 = arg4.anIntArray194[local41] + arg1;
					@Pc(59) int local59 = arg4.anIntArray197[local41] + arg2 - arg3;
					@Pc(65) Class44 local65 = Class44.method544(arg4.anIntArray195[local41]);
					@Pc(70) int local70 = local50 + local65.anInt752;
					@Pc(75) int local75 = local59 + local65.anInt727;
					if ((local65.anInt757 >= 0 || local65.anInt723 != 0) && arg0 >= local70 && arg5 >= local75 && arg0 < local70 + local65.anInt744 && arg5 < local75 + local65.anInt747) {
						if (local65.anInt757 >= 0) {
							this.anInt963 = local65.anInt757;
						} else {
							this.anInt963 = local65.anInt758;
						}
					}
					if (local65.anInt734 == 8 && arg0 >= local70 && arg5 >= local75 && arg0 < local70 + local65.anInt744 && arg5 < local75 + local65.anInt747) {
						this.anInt1006 = local65.anInt758;
					}
					if (local65.anInt734 == 0) {
						this.method675(arg0, local70, local75, local65.anInt738, local65, arg5, arg6);
						if (local65.anInt740 > local65.anInt747) {
							this.method719(local75, local65.anInt747, arg5, arg0, local70 + local65.anInt744, local65, local65.anInt740, arg6);
						}
					} else {
						if (local65.anInt742 == 1 && arg0 >= local70 && arg5 >= local75 && arg0 < local70 + local65.anInt744 && arg5 < local75 + local65.anInt747) {
							@Pc(199) boolean local199 = false;
							if (local65.anInt730 != 0) {
								local199 = this.method721(this.aBoolean214, local65);
							}
							if (!local199) {
								this.aStringArray8[this.anInt986] = local65.aString14;
								this.anIntArray237[this.anInt986] = 585;
								this.anIntArray236[this.anInt986] = local65.anInt758;
								this.anInt986++;
							}
						}
						if (local65.anInt742 == 2 && this.anInt950 == 0 && arg0 >= local70 && arg5 >= local75 && arg0 < local70 + local65.anInt744 && arg5 < local75 + local65.anInt747) {
							@Pc(264) String local264 = local65.aString13;
							if (local264.indexOf(" ") != -1) {
								local264 = local264.substring(0, local264.indexOf(" "));
							}
							this.aStringArray8[this.anInt986] = local264 + " @gre@" + local65.aString11;
							this.anIntArray237[this.anInt986] = 407;
							this.anIntArray236[this.anInt986] = local65.anInt758;
							this.anInt986++;
						}
						if (local65.anInt742 == 3 && arg0 >= local70 && arg5 >= local75 && arg0 < local70 + local65.anInt744 && arg5 < local75 + local65.anInt747) {
							this.aStringArray8[this.anInt986] = "Close";
							if (arg6 == 3) {
								this.anIntArray237[this.anInt986] = 850;
							} else {
								this.anIntArray237[this.anInt986] = 48;
							}
							this.anIntArray236[this.anInt986] = local65.anInt758;
							this.anInt986++;
						}
						if (local65.anInt742 == 4 && arg0 >= local70 && arg5 >= local75 && arg0 < local70 + local65.anInt744 && arg5 < local75 + local65.anInt747) {
							this.aStringArray8[this.anInt986] = local65.aString14;
							this.anIntArray237[this.anInt986] = 899;
							this.anIntArray236[this.anInt986] = local65.anInt758;
							this.anInt986++;
						}
						if (local65.anInt742 == 5 && arg0 >= local70 && arg5 >= local75 && arg0 < local70 + local65.anInt744 && arg5 < local75 + local65.anInt747) {
							this.aStringArray8[this.anInt986] = local65.aString14;
							this.anIntArray237[this.anInt986] = 551;
							this.anIntArray236[this.anInt986] = local65.anInt758;
							this.anInt986++;
						}
						if (local65.anInt742 == 6 && !this.aBoolean247 && arg0 >= local70 && arg5 >= local75 && arg0 < local70 + local65.anInt744 && arg5 < local75 + local65.anInt747) {
							this.aStringArray8[this.anInt986] = local65.aString14;
							this.anIntArray237[this.anInt986] = 594;
							this.anIntArray236[this.anInt986] = local65.anInt758;
							this.anInt986++;
						}
						if (local65.anInt734 == 2) {
							@Pc(523) int local523 = 0;
							for (@Pc(525) int local525 = 0; local525 < local65.anInt747; local525++) {
								for (@Pc(529) int local529 = 0; local529 < local65.anInt744; local529++) {
									@Pc(540) int local540 = local70 + local529 * (local65.anInt743 + 32);
									@Pc(549) int local549 = local75 + local525 * (local65.anInt746 + 32);
									if (local523 < 20) {
										local540 += local65.anIntArray190[local523];
										local549 += local65.anIntArray196[local523];
									}
									if (arg0 >= local540 && arg5 >= local549 && arg0 < local540 + 32 && arg5 < local549 + 32) {
										this.anInt978 = local523;
										this.anInt979 = local65.anInt758;
										if (local65.anIntArray192[local523] > 0) {
											@Pc(602) Class23 local602 = Class23.method248(local65.anIntArray192[local523] - 1);
											if (this.anInt931 == 1 && local65.aBoolean177) {
												if (local65.anInt758 != this.anInt933 || local523 != this.anInt932) {
													this.aStringArray8[this.anInt986] = "Use " + this.aString18 + " with @lre@" + local602.aString5;
													this.anIntArray237[this.anInt986] = 652;
													this.anIntArray238[this.anInt986] = local602.anInt351;
													this.anIntArray235[this.anInt986] = local523;
													this.anIntArray236[this.anInt986] = local65.anInt758;
													this.anInt986++;
												}
											} else if (this.anInt950 != 1 || !local65.aBoolean177) {
												@Pc(739) int local739;
												if (local65.aBoolean177) {
													for (local739 = 4; local739 >= 3; local739--) {
														if (local602.aStringArray3 != null && local602.aStringArray3[local739] != null) {
															this.aStringArray8[this.anInt986] = local602.aStringArray3[local739] + " @lre@" + local602.aString5;
															if (local739 == 3) {
																this.anIntArray237[this.anInt986] = 66;
															}
															if (local739 == 4) {
																this.anIntArray237[this.anInt986] = 529;
															}
															this.anIntArray238[this.anInt986] = local602.anInt351;
															this.anIntArray235[this.anInt986] = local523;
															this.anIntArray236[this.anInt986] = local65.anInt758;
															this.anInt986++;
														} else if (local739 == 4) {
															this.aStringArray8[this.anInt986] = "Drop @lre@" + local602.aString5;
															this.anIntArray237[this.anInt986] = 529;
															this.anIntArray238[this.anInt986] = local602.anInt351;
															this.anIntArray235[this.anInt986] = local523;
															this.anIntArray236[this.anInt986] = local65.anInt758;
															this.anInt986++;
														}
													}
												}
												if (local65.aBoolean180) {
													this.aStringArray8[this.anInt986] = "Use @lre@" + local602.aString5;
													this.anIntArray237[this.anInt986] = 179;
													this.anIntArray238[this.anInt986] = local602.anInt351;
													this.anIntArray235[this.anInt986] = local523;
													this.anIntArray236[this.anInt986] = local65.anInt758;
													this.anInt986++;
												}
												if (local65.aBoolean177 && local602.aStringArray3 != null) {
													for (local739 = 2; local739 >= 0; local739--) {
														if (local602.aStringArray3[local739] != null) {
															this.aStringArray8[this.anInt986] = local602.aStringArray3[local739] + " @lre@" + local602.aString5;
															if (local739 == 0) {
																this.anIntArray237[this.anInt986] = 343;
															}
															if (local739 == 1) {
																this.anIntArray237[this.anInt986] = 875;
															}
															if (local739 == 2) {
																this.anIntArray237[this.anInt986] = 794;
															}
															this.anIntArray238[this.anInt986] = local602.anInt351;
															this.anIntArray235[this.anInt986] = local523;
															this.anIntArray236[this.anInt986] = local65.anInt758;
															this.anInt986++;
														}
													}
												}
												if (local65.aStringArray6 != null) {
													for (local739 = 4; local739 >= 0; local739--) {
														if (local65.aStringArray6[local739] != null) {
															this.aStringArray8[this.anInt986] = local65.aStringArray6[local739] + " @lre@" + local602.aString5;
															if (local739 == 0) {
																this.anIntArray237[this.anInt986] = 62;
															}
															if (local739 == 1) {
																this.anIntArray237[this.anInt986] = 352;
															}
															if (local739 == 2) {
																this.anIntArray237[this.anInt986] = 16;
															}
															if (local739 == 3) {
																this.anIntArray237[this.anInt986] = 887;
															}
															if (local739 == 4) {
																this.anIntArray237[this.anInt986] = 56;
															}
															this.anIntArray238[this.anInt986] = local602.anInt351;
															this.anIntArray235[this.anInt986] = local523;
															this.anIntArray236[this.anInt986] = local65.anInt758;
															this.anInt986++;
														}
													}
												}
												this.aStringArray8[this.anInt986] = "Examine @lre@" + local602.aString5;
												this.anIntArray237[this.anInt986] = 1934;
												this.anIntArray238[this.anInt986] = local602.anInt351;
												this.anIntArray235[this.anInt986] = local523;
												this.anIntArray236[this.anInt986] = local65.anInt758;
												this.anInt986++;
											} else if ((this.anInt952 & 0x10) == 16) {
												this.aStringArray8[this.anInt986] = this.aString21 + " @lre@" + local602.aString5;
												this.anIntArray237[this.anInt986] = 399;
												this.anIntArray238[this.anInt986] = local602.anInt351;
												this.anIntArray235[this.anInt986] = local523;
												this.anIntArray236[this.anInt986] = local65.anInt758;
												this.anInt986++;
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
			signlink.reporterror("36184, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 1 + ", " + local1169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!CMGGUSPR;BI)V")
	private void method676(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == 0) {
				while (arg0.anInt79 + 10 < arg2 * 8) {
					@Pc(15) int local15 = arg0.method66(11);
					if (local15 == 2047) {
						break;
					}
					if (this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local15] == null) {
						this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local15] = new Class1_Sub1_Sub1_Sub3_Sub2();
						if (this.aClass1_Sub1_Sub3Array1[local15] != null) {
							this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local15].method269(this.aClass1_Sub1_Sub3Array1[local15]);
						}
					}
					this.anIntArray227[this.anInt905++] = local15;
					@Pc(61) Class1_Sub1_Sub1_Sub3_Sub2 local61 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local15];
					local61.anInt429 = anInt1011;
					@Pc(69) int local69 = arg0.method66(1);
					if (local69 == 1) {
						this.anIntArray228[this.anInt906++] = local15;
					}
					@Pc(88) int local88 = arg0.method66(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(97) int local97 = arg0.method66(1);
					@Pc(102) int local102 = arg0.method66(5);
					if (local102 > 15) {
						local102 -= 32;
					}
					local61.method265(local97 == 1, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0] + local102, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0] + local88);
				}
				arg0.method67(502);
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("92100, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method677() {
		try {
			if (super.anInt852 == 1) {
				if (super.anInt853 >= 539 && super.anInt853 <= 573 && super.anInt854 >= 169 && super.anInt854 < 205 && this.anIntArray243[0] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 0;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 569 && super.anInt853 <= 599 && super.anInt854 >= 168 && super.anInt854 < 205 && this.anIntArray243[1] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 1;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 597 && super.anInt853 <= 627 && super.anInt854 >= 168 && super.anInt854 < 205 && this.anIntArray243[2] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 2;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 625 && super.anInt853 <= 669 && super.anInt854 >= 168 && super.anInt854 < 203 && this.anIntArray243[3] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 3;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 666 && super.anInt853 <= 696 && super.anInt854 >= 168 && super.anInt854 < 205 && this.anIntArray243[4] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 4;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 694 && super.anInt853 <= 724 && super.anInt854 >= 168 && super.anInt854 < 205 && this.anIntArray243[5] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 5;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 722 && super.anInt853 <= 756 && super.anInt854 >= 169 && super.anInt854 < 205 && this.anIntArray243[6] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 6;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 540 && super.anInt853 <= 574 && super.anInt854 >= 466 && super.anInt854 < 502 && this.anIntArray243[7] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 7;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 572 && super.anInt853 <= 602 && super.anInt854 >= 466 && super.anInt854 < 503 && this.anIntArray243[8] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 8;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 599 && super.anInt853 <= 629 && super.anInt854 >= 466 && super.anInt854 < 503 && this.anIntArray243[9] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 9;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 627 && super.anInt853 <= 671 && super.anInt854 >= 467 && super.anInt854 < 502 && this.anIntArray243[10] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 10;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 669 && super.anInt853 <= 699 && super.anInt854 >= 466 && super.anInt854 < 503 && this.anIntArray243[11] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 11;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 696 && super.anInt853 <= 726 && super.anInt854 >= 466 && super.anInt854 < 503 && this.anIntArray243[12] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 12;
					this.aBoolean219 = true;
				}
				if (super.anInt853 >= 724 && super.anInt853 <= 758 && super.anInt854 >= 466 && super.anInt854 < 502 && this.anIntArray243[13] != -1) {
					this.aBoolean245 = true;
					this.anInt1005 = 13;
					this.aBoolean219 = true;
					return;
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("93259, " + -342 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SDXDPBJK;II)V")
	private void method678(@OriginalArg(0) Class1_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.method679(190, arg0.anInt424, arg0.anInt425, arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("94541, " + arg0 + ", " + arg1 + ", " + 19311 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method611(arg2, this.anInt1027, arg1) - arg3;
				@Pc(32) boolean local32 = false;
				@Pc(37) int local37 = arg1 - this.anInt887;
				@Pc(42) int local42 = local28 - this.anInt888;
				@Pc(47) int local47 = arg2 - this.anInt889;
				@Pc(52) int local52 = Class1_Sub1_Sub1_Sub2.anIntArray60[this.anInt890];
				@Pc(57) int local57 = Class1_Sub1_Sub1_Sub2.anIntArray61[this.anInt890];
				@Pc(62) int local62 = Class1_Sub1_Sub1_Sub2.anIntArray60[this.anInt891];
				@Pc(67) int local67 = Class1_Sub1_Sub1_Sub2.anIntArray61[this.anInt891];
				@Pc(77) int local77 = local47 * local62 + local37 * local67 >> 16;
				@Pc(87) int local87 = local47 * local67 - local37 * local62 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local42 * local57 - local87 * local52 >> 16;
				@Pc(109) int local109 = local42 * local52 + local87 * local57 >> 16;
				if (local109 >= 50) {
					this.anInt859 = Class1_Sub1_Sub2_Sub2.anInt502 + (local89 << 9) / local109;
					this.anInt860 = Class1_Sub1_Sub2_Sub2.anInt503 + (local99 << 9) / local109;
				} else {
					this.anInt859 = -1;
					this.anInt860 = -1;
				}
			} else {
				this.anInt859 = -1;
				this.anInt860 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("80038, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIILjava/lang/String;Ljava/lang/String;)Lclient!UUIGNTAD;")
	private Class38 method680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(8) byte[] local8 = null;
			@Pc(10) int local10 = 5;
			try {
				if (this.aClass20Array1[0] != null) {
					local8 = this.aClass20Array1[0].method235(arg0);
				}
			} catch (@Pc(25) Exception local25) {
			}
			@Pc(39) int local39;
			if (local8 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local8);
				local39 = (int) this.aCRC32_2.getValue();
				if (local39 != arg2) {
					local8 = null;
				}
			}
			if (local8 != null) {
				return new Class38(0, local8);
			}
			local39 = 0;
			while (local8 == null) {
				@Pc(60) String local60 = "Unknown error";
				this.method586("Requesting " + arg3, arg1);
				@Pc(75) int local75;
				try {
					local75 = 0;
					@Pc(86) DataInputStream local86 = this.method696(arg4 + arg2);
					@Pc(89) byte[] local89 = new byte[6];
					local86.readFully(local89, 0, 6);
					@Pc(100) Class1_Sub1_Sub3 local100 = new Class1_Sub1_Sub3(local89, anInt972);
					local100.anInt78 = 3;
					@Pc(108) int local108 = local100.method59() + 6;
					@Pc(110) int local110 = 6;
					local8 = new byte[local108];
					for (@Pc(115) int local115 = 0; local115 < 6; local115++) {
						local8[local115] = local89[local115];
					}
					@Pc(133) int local133;
					while (local110 < local108) {
						local133 = local108 - local110;
						if (local133 > 1000) {
							local133 = 1000;
						}
						@Pc(144) int local144 = local86.read(local8, local110, local133);
						if (local144 < 0) {
							(new StringBuffer("Length error: ")).append(local110).append("/").append(local108).toString();
							throw new IOException("EOF");
						}
						local110 += local144;
						@Pc(173) int local173 = local110 * 100 / local108;
						if (local173 != local75) {
							this.method586("Loading " + arg3 + " - " + local173 + "%", arg1);
						}
						local75 = local173;
					}
					local86.close();
					try {
						if (this.aClass20Array1[0] != null) {
							this.aClass20Array1[0].method236(arg0, local8, local8.length);
						}
					} catch (@Pc(218) Exception local218) {
						this.aClass20Array1[0] = null;
					}
					if (local8 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local8);
						local133 = (int) this.aCRC32_2.getValue();
						if (local133 != arg2) {
							local8 = null;
							local39++;
							local60 = "Checksum error: " + local133;
						}
					}
				} catch (@Pc(253) IOException local253) {
					if (local60.equals("Unknown error")) {
						local60 = "Connection error";
					}
					local8 = null;
				} catch (@Pc(263) NullPointerException local263) {
					local60 = "Null error";
					local8 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(272) ArrayIndexOutOfBoundsException local272) {
					local60 = "Bounds error";
					local8 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(281) Exception local281) {
					local60 = "Unexpected error";
					local8 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local8 == null) {
					for (local75 = local10; local75 > 0; local75--) {
						if (local39 >= 3) {
							this.method586("Game updated - please reload page", arg1);
							local75 = 10;
						} else {
							this.method586(local60 + " - Retrying in " + local75, arg1);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(325) Exception local325) {
						}
					}
					local10 *= 2;
					if (local10 > 60) {
						local10 = 60;
					}
					this.aBoolean233 = !this.aBoolean233;
				}
			}
			return new Class38(0, local8);
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("69732, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)Z")
	private boolean method681() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("58052, " + 9 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method682(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.aBoolean234 = true;
			for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
				this.anIntArray252[local16] = -1;
				for (@Pc(25) int local25 = 0; local25 < Class6.anInt66; local25++) {
					if (!Class6.aClass6Array1[local25].aBoolean21 && Class6.aClass6Array1[local25].anInt67 == local16 + (this.aBoolean260 ? 0 : 7)) {
						this.anIntArray252[local16] = local25;
						break;
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("19013, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method683() {
		try {
			this.aBoolean216 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean251) {
					this.anInt974++;
					this.method618();
					this.method618();
					this.method612();
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
			this.aBoolean216 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("5955, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
	private boolean method684(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt1030 != 31203) {
				this.anInt1077 = -1;
			}
			if (arg0 < 0) {
				return false;
			}
			@Pc(15) int local15 = this.anIntArray237[arg0];
			if (local15 >= 2000) {
				local15 -= 2000;
			}
			return local15 == 166;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("35565, " + arg0 + ", " + 31203 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method685() {
		try {
			if (super.anInt852 == 1) {
				if (super.anInt853 >= 6 && super.anInt853 <= 106 && super.anInt854 >= 467 && super.anInt854 <= 499) {
					this.anInt926 = (this.anInt926 + 1) % 4;
					this.aBoolean229 = true;
					this.aBoolean256 = true;
					this.aClass1_Sub1_Sub3_9.method44(205, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method45(this.anInt926);
					this.aClass1_Sub1_Sub3_9.method45(this.anInt1050);
					this.aClass1_Sub1_Sub3_9.method45(this.anInt895);
				}
				if (super.anInt853 >= 135 && super.anInt853 <= 235 && super.anInt854 >= 467 && super.anInt854 <= 499) {
					this.anInt1050 = (this.anInt1050 + 1) % 3;
					this.aBoolean229 = true;
					this.aBoolean256 = true;
					this.aClass1_Sub1_Sub3_9.method44(205, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method45(this.anInt926);
					this.aClass1_Sub1_Sub3_9.method45(this.anInt1050);
					this.aClass1_Sub1_Sub3_9.method45(this.anInt895);
				}
				if (super.anInt853 >= 273 && super.anInt853 <= 373 && super.anInt854 >= 467 && super.anInt854 <= 499) {
					this.anInt895 = (this.anInt895 + 1) % 3;
					this.aBoolean229 = true;
					this.aBoolean256 = true;
					this.aClass1_Sub1_Sub3_9.method44(205, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method45(this.anInt926);
					this.aClass1_Sub1_Sub3_9.method45(this.anInt1050);
					this.aClass1_Sub1_Sub3_9.method45(this.anInt895);
				}
				if (super.anInt853 >= 412 && super.anInt853 <= 512 && super.anInt854 >= 467 && super.anInt854 <= 499) {
					if (this.anInt1007 == -1) {
						this.method644(this.aByte27);
						this.aString26 = "";
						this.aBoolean212 = false;
						this.anInt961 = this.anInt1007 = Class44.anInt733;
						return;
					}
					this.method664("", "Please close the interface you have open before using 'report abuse'", 0);
					return;
				}
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("50542, " + -551 + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method686() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt905; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt904;
				} else {
					local11 = this.anIntArray227[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub3_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null) {
					this.method620(1, local23);
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("67065, " + 122 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method687() {
		try {
			if (this.anInt1061 == 0) {
				@Pc(6) int local6 = super.anInt852;
				if (this.anInt1075 != 47958) {
					this.anInt1077 = -1;
				}
				if (this.anInt950 == 1 && super.anInt853 >= 516 && super.anInt854 >= 160 && super.anInt853 <= 765 && super.anInt854 <= 205) {
					local6 = 0;
				}
				@Pc(44) int local44;
				@Pc(47) int local47;
				@Pc(123) int local123;
				if (this.aBoolean242) {
					if (local6 != 1) {
						local44 = super.anInt847;
						local47 = super.anInt848;
						if (this.anInt965 == 0) {
							local44 -= 4;
							local47 -= 4;
						}
						if (this.anInt965 == 1) {
							local44 -= 553;
							local47 -= 205;
						}
						if (this.anInt965 == 2) {
							local44 -= 17;
							local47 -= 357;
						}
						if (local44 < this.anInt966 - 10 || local44 > this.anInt966 + this.anInt968 + 10 || local47 < this.anInt967 - 10 || local47 > this.anInt967 + this.anInt969 + 10) {
							this.aBoolean242 = false;
							if (this.anInt965 == 1) {
								this.aBoolean245 = true;
							}
							if (this.anInt965 == 2) {
								this.aBoolean256 = true;
							}
						}
					}
					if (local6 == 1) {
						local44 = this.anInt966;
						local47 = this.anInt967;
						local123 = this.anInt968;
						@Pc(126) int local126 = super.anInt853;
						@Pc(129) int local129 = super.anInt854;
						if (this.anInt965 == 0) {
							local126 -= 4;
							local129 -= 4;
						}
						if (this.anInt965 == 1) {
							local126 -= 553;
							local129 -= 205;
						}
						if (this.anInt965 == 2) {
							local126 -= 17;
							local129 -= 357;
						}
						@Pc(148) int local148 = -1;
						for (@Pc(150) int local150 = 0; local150 < this.anInt986; local150++) {
							@Pc(165) int local165 = local47 + (this.anInt986 - 1 - local150) * 15 + 31;
							if (local126 > local44 && local126 < local44 + local123 && local129 > local165 - 13 && local129 < local165 + 3) {
								local148 = local150;
							}
						}
						if (local148 != -1) {
							this.method652(local148, 254);
						}
						this.aBoolean242 = false;
						if (this.anInt965 == 1) {
							this.aBoolean245 = true;
						}
						if (this.anInt965 == 2) {
							this.aBoolean256 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt986 > 0) {
						local44 = this.anIntArray237[this.anInt986 - 1];
						if (local44 == 62 || local44 == 352 || local44 == 16 || local44 == 887 || local44 == 56 || local44 == 343 || local44 == 875 || local44 == 794 || local44 == 66 || local44 == 529 || local44 == 179 || local44 == 1934) {
							local47 = this.anIntArray235[this.anInt986 - 1];
							local123 = this.anIntArray236[this.anInt986 - 1];
							@Pc(284) Class44 local284 = Class44.method544(local123);
							if (local284.aBoolean179 || local284.aBoolean171) {
								this.aBoolean253 = false;
								this.anInt907 = 0;
								this.anInt1059 = local123;
								this.anInt1060 = local47;
								this.anInt1061 = 2;
								this.anInt1062 = super.anInt853;
								this.anInt1063 = super.anInt854;
								if (Class44.method544(local123).anInt750 == this.anInt1007) {
									this.anInt1061 = 1;
								}
								if (Class44.method544(local123).anInt750 == this.anInt1091) {
									this.anInt1061 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt943 == 1 || this.method684(this.anInt986 - 1)) && this.anInt986 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt986 > 0) {
						this.method652(this.anInt986 - 1, 254);
					}
					if (local6 != 2 || this.anInt986 <= 0) {
						return;
					}
					this.method636((byte) 3);
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("83780, " + 47958 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(JI)V")
	private void method688(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1072; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt1072--;
						this.aBoolean245 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1072; local28++) {
							this.aStringArray10[local28] = this.aStringArray10[local28 + 1];
							this.anIntArray254[local28] = this.anIntArray254[local28 + 1];
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_9.method44(167, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method51(arg0);
						break;
					}
				}
				@Pc(87) boolean local87 = false;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("41554, " + arg0 + ", " + arg1 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method689() {
		try {
			@Pc(2) int local2 = this.anInt966;
			@Pc(5) int local5 = this.anInt967;
			@Pc(8) int local8 = this.anInt968;
			@Pc(11) int local11 = this.anInt969;
			Class1_Sub1_Sub2.method461(local8, local2, local11, 6116423, local5);
			Class1_Sub1_Sub2.method461(local8 - 2, local2 + 1, 16, 0, local5 + 1);
			Class1_Sub1_Sub2.method462(local11 - 19, local8 - 2, 0, local2 + 1, this.anInt1020, local5 + 18);
			this.aClass1_Sub1_Sub2_Sub1_4.method111(local2 + 3, 6116423, "Choose Option", local5 + 14);
			@Pc(69) int local69 = super.anInt847;
			@Pc(72) int local72 = super.anInt848;
			if (this.anInt965 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt965 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt965 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt986; local91++) {
				@Pc(106) int local106 = local5 + (this.anInt986 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local2 && local69 < local2 + local8 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub1_4.method115(local2 + 3, local106, true, this.aStringArray8[local91], local108);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("53541, " + false + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method690() {
		try {
			if (this.anInt1080 > 0) {
				this.method607();
			} else {
				this.method608("Please wait - attempting to reestablish", "Connection lost");
				this.anInt883 = 0;
				this.anInt935 = 0;
				@Pc(20) Class39 local20 = this.aClass39_1;
				this.aBoolean213 = false;
				this.anInt1017 = 0;
				this.method614(this.aString24, this.aString25, true);
				if (!this.aBoolean213) {
					this.method607();
				}
				try {
					local20.method513();
				} catch (@Pc(48) Exception local48) {
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("67572, " + 545 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method691() {
		try {
			this.aClass17_27.method229();
			Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray263;
			this.anInt1076 += 0;
			this.aClass1_Sub1_Sub2_Sub3_5.method371(0, this.aByte39, 0);
			if (this.aBoolean243) {
				this.aClass1_Sub1_Sub2_Sub1_4.method107(0, 239, 40, this.aString19);
				this.aClass1_Sub1_Sub2_Sub1_4.method107(128, 239, 60, this.aString20 + "*");
			} else if (this.anInt938 == 1) {
				this.aClass1_Sub1_Sub2_Sub1_4.method107(0, 239, 40, "Enter amount:");
				this.aClass1_Sub1_Sub2_Sub1_4.method107(128, 239, 60, this.aString22 + "*");
			} else if (this.anInt938 == 2) {
				this.aClass1_Sub1_Sub2_Sub1_4.method107(0, 239, 40, "Enter name:");
				this.aClass1_Sub1_Sub2_Sub1_4.method107(128, 239, 60, this.aString22 + "*");
			} else {
				@Pc(132) Class1_Sub1_Sub2_Sub1 local132;
				@Pc(140) int local140;
				@Pc(151) int local151;
				if (this.anInt938 == 3) {
					if (this.aString22 != this.aString27) {
						this.method663(this.aString22);
						this.aString27 = this.aString22;
					}
					local132 = this.aClass1_Sub1_Sub2_Sub1_3;
					Class1_Sub1_Sub2.method458(0, 77, 463, 0);
					for (local140 = 0; local140 < this.anInt997; local140++) {
						local151 = local140 * 14 + 18 - this.anInt998;
						if (local151 > 0 && local151 < 110) {
							local132.method107(0, 239, local151, this.aStringArray11[local140]);
						}
					}
					Class1_Sub1_Sub2.method457();
					if (this.anInt997 > 5) {
						this.method694(0, 463, this.anInt998, 77, this.anInt997 * 14 + 7);
					}
					if (this.aString22.length() == 0) {
						this.aClass1_Sub1_Sub2_Sub1_4.method107(255, 239, 40, "Enter object name");
					} else if (this.anInt997 == 0) {
						this.aClass1_Sub1_Sub2_Sub1_4.method107(0, 239, 40, "No matching objects found, please shorten search");
					}
					local132.method107(0, 239, 90, this.aString22 + "*");
					Class1_Sub1_Sub2.method464(479, 0, 0, 77);
				} else if (this.aString17 != null) {
					this.aClass1_Sub1_Sub2_Sub1_4.method107(0, 239, 40, this.aString17);
					this.aClass1_Sub1_Sub2_Sub1_4.method107(128, 239, 60, "Click to continue");
				} else if (this.anInt1091 != -1) {
					this.method665(0, Class44.method544(this.anInt1091), 0, 0);
				} else if (this.anInt962 == -1) {
					local132 = this.aClass1_Sub1_Sub2_Sub1_3;
					local140 = 0;
					Class1_Sub1_Sub2.method458(0, 77, 463, 0);
					for (local151 = 0; local151 < 100; local151++) {
						if (this.aStringArray13[local151] != null) {
							@Pc(316) int local316 = this.anIntArray256[local151];
							@Pc(325) int local325 = this.anInt879 + 70 - local140 * 14;
							@Pc(330) String local330 = this.aStringArray12[local151];
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
									local132.method111(4, 0, this.aStringArray13[local151], local325);
								}
								local140++;
							}
							@Pc(402) int local402;
							if ((local316 == 1 || local316 == 2) && (local316 == 1 || this.anInt926 == 0 || this.anInt926 == 1 && this.method667(local330))) {
								if (local325 > 0 && local325 < 110) {
									local402 = 4;
									if (local332 == 1) {
										this.aClass1_Sub1_Sub2_Sub3Array4[0].method371(4, this.aByte39, local325 - 12);
										local402 += 14;
									}
									if (local332 == 2) {
										this.aClass1_Sub1_Sub2_Sub3Array4[1].method371(local402, this.aByte39, local325 - 12);
										local402 += 14;
									}
									local132.method111(local402, 0, local330 + ":", local325);
									local402 += local132.method109(local330) + 8;
									local132.method111(local402, 255, this.aStringArray13[local151], local325);
								}
								local140++;
							}
							if ((local316 == 3 || local316 == 7) && this.anInt954 == 0 && (local316 == 7 || this.anInt1050 == 0 || this.anInt1050 == 1 && this.method667(local330))) {
								if (local325 > 0 && local325 < 110) {
									local132.method111(4, 0, "From", local325);
									local402 = local132.method109("From ") + 4;
									if (local332 == 1) {
										this.aClass1_Sub1_Sub2_Sub3Array4[0].method371(local402, this.aByte39, local325 - 12);
										local402 += 14;
									}
									if (local332 == 2) {
										this.aClass1_Sub1_Sub2_Sub3Array4[1].method371(local402, this.aByte39, local325 - 12);
										local402 += 14;
									}
									local132.method111(local402, 0, local330 + ":", local325);
									local402 += local132.method109(local330) + 8;
									local132.method111(local402, 8388608, this.aStringArray13[local151], local325);
								}
								local140++;
							}
							if (local316 == 4 && (this.anInt895 == 0 || this.anInt895 == 1 && this.method667(local330))) {
								if (local325 > 0 && local325 < 110) {
									local132.method111(4, 8388736, local330 + " " + this.aStringArray13[local151], local325);
								}
								local140++;
							}
							if (local316 == 5 && this.anInt954 == 0 && this.anInt1050 < 2) {
								if (local325 > 0 && local325 < 110) {
									local132.method111(4, 8388608, this.aStringArray13[local151], local325);
								}
								local140++;
							}
							if (local316 == 6 && this.anInt954 == 0 && this.anInt1050 < 2) {
								if (local325 > 0 && local325 < 110) {
									local132.method111(4, 0, "To " + local330 + ":", local325);
									local132.method111(local132.method109("To " + local330) + 12, 8388608, this.aStringArray13[local151], local325);
								}
								local140++;
							}
							if (local316 == 8 && (this.anInt895 == 0 || this.anInt895 == 1 && this.method667(local330))) {
								if (local325 > 0 && local325 < 110) {
									local132.method111(4, 8270336, local330 + " " + this.aStringArray13[local151], local325);
								}
								local140++;
							}
						}
					}
					Class1_Sub1_Sub2.method457();
					this.anInt908 = local140 * 14 + 7;
					if (this.anInt908 < 78) {
						this.anInt908 = 78;
					}
					this.method694(0, 463, this.anInt908 - this.anInt879 - 77, 77, this.anInt908);
					@Pc(776) String local776;
					if (aClass1_Sub1_Sub1_Sub3_Sub2_1 == null || aClass1_Sub1_Sub1_Sub3_Sub2_1.aString7 == null) {
						local776 = Class49.method572(this.aString24);
					} else {
						local776 = aClass1_Sub1_Sub1_Sub3_Sub2_1.aString7;
					}
					local132.method111(4, 0, local776 + ":", 90);
					local132.method111(local132.method109(local776 + ": ") + 6, 255, this.aString28 + "*", 90);
					Class1_Sub1_Sub2.method464(479, 0, 0, 77);
				} else {
					this.method665(0, Class44.method544(this.anInt962), 0, 0);
				}
			}
			if (this.aBoolean242 && this.anInt965 == 2) {
				this.method689();
			}
			this.aClass17_27.method230(17, 357, super.aGraphics2);
			this.aClass17_26.method229();
			Class1_Sub1_Sub2_Sub2.anIntArray140 = this.anIntArray265;
		} catch (@Pc(857) RuntimeException local857) {
			signlink.reporterror("74388, " + 0 + ", " + local857.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!TQRZOVPP;II)V")
	private void method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.anInt986 < 400) {
				if (arg2.anIntArray172 != null) {
					arg2 = arg2.method481();
				}
				if (arg2 != null && arg2.aBoolean149) {
					@Pc(23) String local23 = arg2.aString9;
					if (arg2.anInt689 != 0) {
						local23 = local23 + method717((byte) 2, arg2.anInt689, aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt450) + " (level-" + arg2.anInt689 + ")";
					}
					if (this.anInt931 == 1) {
						this.aStringArray8[this.anInt986] = "Use " + this.aString18 + " with @yel@" + local23;
						this.anIntArray237[this.anInt986] = 683;
						this.anIntArray238[this.anInt986] = arg3;
						this.anIntArray235[this.anInt986] = arg1;
						this.anIntArray236[this.anInt986] = arg0;
						this.anInt986++;
					} else if (this.anInt950 != 1) {
						@Pc(168) int local168;
						if (arg2.aStringArray5 != null) {
							for (local168 = 4; local168 >= 0; local168--) {
								if (arg2.aStringArray5[local168] != null && !arg2.aStringArray5[local168].equalsIgnoreCase("attack")) {
									this.aStringArray8[this.anInt986] = arg2.aStringArray5[local168] + " @yel@" + local23;
									if (local168 == 0) {
										this.anIntArray237[this.anInt986] = 488;
									}
									if (local168 == 1) {
										this.anIntArray237[this.anInt986] = 642;
									}
									if (local168 == 2) {
										this.anIntArray237[this.anInt986] = 830;
									}
									if (local168 == 3) {
										this.anIntArray237[this.anInt986] = 22;
									}
									if (local168 == 4) {
										this.anIntArray237[this.anInt986] = 295;
									}
									this.anIntArray238[this.anInt986] = arg3;
									this.anIntArray235[this.anInt986] = arg1;
									this.anIntArray236[this.anInt986] = arg0;
									this.anInt986++;
								}
							}
						}
						if (arg2.aStringArray5 != null) {
							for (local168 = 4; local168 >= 0; local168--) {
								if (arg2.aStringArray5[local168] != null && arg2.aStringArray5[local168].equalsIgnoreCase("attack")) {
									@Pc(292) short local292 = 0;
									if (arg2.anInt689 > aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt450) {
										local292 = 2000;
									}
									this.aStringArray8[this.anInt986] = arg2.aStringArray5[local168] + " @yel@" + local23;
									if (local168 == 0) {
										this.anIntArray237[this.anInt986] = local292 + 488;
									}
									if (local168 == 1) {
										this.anIntArray237[this.anInt986] = local292 + 642;
									}
									if (local168 == 2) {
										this.anIntArray237[this.anInt986] = local292 + 830;
									}
									if (local168 == 3) {
										this.anIntArray237[this.anInt986] = local292 + 22;
									}
									if (local168 == 4) {
										this.anIntArray237[this.anInt986] = local292 + 295;
									}
									this.anIntArray238[this.anInt986] = arg3;
									this.anIntArray235[this.anInt986] = arg1;
									this.anIntArray236[this.anInt986] = arg0;
									this.anInt986++;
								}
							}
						}
						this.aStringArray8[this.anInt986] = "Examine @yel@" + local23;
						this.anIntArray237[this.anInt986] = 1986;
						this.anIntArray238[this.anInt986] = arg3;
						this.anIntArray235[this.anInt986] = arg1;
						this.anIntArray236[this.anInt986] = arg0;
						this.anInt986++;
					} else if ((this.anInt952 & 0x2) == 2) {
						this.aStringArray8[this.anInt986] = this.aString21 + " @yel@" + local23;
						this.anIntArray237[this.anInt986] = 898;
						this.anIntArray238[this.anInt986] = arg3;
						this.anIntArray235[this.anInt986] = arg1;
						this.anIntArray236[this.anInt986] = arg0;
						this.anInt986++;
						return;
					}
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("35950, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 440 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!CMGGUSPR;BI)V")
	private void method693(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt923 = 0;
			this.anInt906 = 0;
			if (this.aByte34 == 0) {
				this.method599(arg1, arg0);
				this.method594(arg0, arg1);
				this.method676(arg0, this.aByte40, arg1);
				this.method648(424, arg1, arg0);
				@Pc(46) int local46;
				for (@Pc(39) int local39 = 0; local39 < this.anInt923; local39++) {
					local46 = this.anIntArray234[local39];
					if (this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local46].anInt429 != anInt1011) {
						this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local46] = null;
					}
				}
				if (arg0.anInt78 != arg1) {
					signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt78 + " psize:" + arg1);
					throw new RuntimeException("eek");
				}
				for (local46 = 0; local46 < this.anInt905; local46++) {
					if (this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray227[local46]] == null) {
						signlink.reporterror(this.aString24 + " null entry in pl list - pos:" + local46 + " size:" + this.anInt905);
						throw new RuntimeException("eek");
					}
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("74827, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method582(@OriginalArg(0) int arg0) {
		try {
			if (this.aBoolean224 || this.aBoolean244 || this.aBoolean248) {
				this.method718();
			} else {
				anInt892++;
				if (this.aBoolean213) {
					this.method626();
				} else {
					this.method673(false);
				}
				this.anInt909 = 0;
				if (arg0 != 8607) {
					this.method579();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("68442, " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
	private void method694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_11.method371(arg1, this.aByte39, arg0);
			this.aClass1_Sub1_Sub2_Sub3_12.method371(arg1, this.aByte39, arg0 + arg3 - 16);
			Class1_Sub1_Sub2.method461(16, arg1, arg3 - 32, this.anInt976, arg0 + 16);
			@Pc(43) int local43 = (arg3 - 32) * arg3 / arg4;
			if (local43 < 8) {
				local43 = 8;
			}
			@Pc(60) int local60 = (arg3 - local43 - 32) * arg2 / (arg4 - arg3);
			Class1_Sub1_Sub2.method461(16, arg1, local43, this.anInt893, arg0 + local60 + 16);
			Class1_Sub1_Sub2.method466(local43, this.anInt1083, arg1, arg0 + local60 + 16, this.anInt1028);
			Class1_Sub1_Sub2.method466(local43, this.anInt1083, arg1 + 1, arg0 + 16 + local60, this.anInt1028);
			Class1_Sub1_Sub2.method464(16, arg1, this.anInt1028, arg0 + local60 + 16);
			Class1_Sub1_Sub2.method464(16, arg1, this.anInt1028, arg0 + local60 + 17);
			Class1_Sub1_Sub2.method466(local43, this.anInt1083, arg1 + 15, arg0 + 16 + local60, this.anInt885);
			Class1_Sub1_Sub2.method466(local43 - 1, this.anInt1083, arg1 + 14, arg0 + 17 + local60, this.anInt885);
			Class1_Sub1_Sub2.method464(16, arg1, this.anInt885, arg0 + local60 + local43 + 15);
			Class1_Sub1_Sub2.method464(15, arg1 + 1, this.anInt885, arg0 + local60 + local43 + 14);
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("92339, " + 17 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class41 local9 = this.aClass41ArrayArrayArray1[this.anInt1027][arg0][arg1];
		if (local9 == null) {
			this.aClass35_1.method417(this.anInt1027, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub4 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub4 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub4) local9.method534(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub4) local9.method536()) {
			@Pc(32) Class23 local32 = Class23.method248(local27.anInt565);
			@Pc(35) int local35 = local32.anInt377;
			if (local32.aBoolean72) {
				local35 *= local27.anInt566 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method532(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub4 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub4 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub4) local9.method534(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub4) local9.method536()) {
			if (local27.anInt565 != local23.anInt565 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt565 != local23.anInt565 && local27.anInt565 != local65.anInt565 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass35_1.method403(local65, arg0, this.method611(arg1 * 128 + 64, this.anInt1027, arg0 * 128 + 64), this.anInt1027, local23, local110, local67, arg1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	@Override
	protected void method586(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt1026 = arg1;
			this.aString29 = arg0;
			this.method672(this.anInt875);
			if (this.aClass38_2 == null) {
				super.method586(arg0, arg1);
			} else {
				this.aClass17_17.method229();
				this.aClass1_Sub1_Sub2_Sub1_4.method107(16777215, 180, 54, "RuneScape is loading - please wait...");
				Class1_Sub1_Sub2.method462(34, 304, 9179409, 28, this.anInt1020, 62);
				Class1_Sub1_Sub2.method462(32, 302, 0, 29, this.anInt1020, 63);
				Class1_Sub1_Sub2.method461(arg1 * 3, 30, 30, 9179409, 64);
				Class1_Sub1_Sub2.method461(300 - arg1 * 3, arg1 * 3 + 30, 30, 0, 64);
				this.aClass1_Sub1_Sub2_Sub1_4.method107(16777215, 180, 85, arg0);
				this.aClass17_17.method230(202, 171, super.aGraphics2);
				if (this.aBoolean259) {
					this.aBoolean259 = false;
					if (!this.aBoolean251) {
						this.aClass17_18.method230(0, 0, super.aGraphics2);
						this.aClass17_19.method230(637, 0, super.aGraphics2);
					}
					this.aClass17_15.method230(128, 0, super.aGraphics2);
					this.aClass17_16.method230(202, 371, super.aGraphics2);
					this.aClass17_20.method230(0, 265, super.aGraphics2);
					this.aClass17_21.method230(562, 265, super.aGraphics2);
					this.aClass17_22.method230(128, 171, super.aGraphics2);
					this.aClass17_23.method230(562, 171, super.aGraphics2);
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("54388, " + arg0 + ", " + arg1 + ", " + false + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method696(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean233) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method617(43595);
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

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method697() {
		try {
			if (this.anInt986 >= 2 || this.anInt931 != 0 || this.anInt950 != 0) {
				@Pc(41) String local41;
				if (this.anInt931 == 1 && this.anInt986 < 2) {
					local41 = "Use " + this.aString18 + " with...";
				} else if (this.anInt950 == 1 && this.anInt986 < 2) {
					local41 = this.aString21 + "...";
				} else {
					local41 = this.aStringArray8[this.anInt986 - 1];
				}
				if (this.anInt986 > 2) {
					local41 = local41 + "@whi@ / " + (this.anInt986 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub1_4.method116(15, local41, anInt1011 / 1000, 4, 16777215);
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("28333, " + 6374 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method698(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean251 = false;
			while (this.aBoolean216) {
				this.aBoolean251 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3Array5 = null;
			this.anIntArray259 = null;
			this.anIntArray260 = null;
			this.anIntArray261 = null;
			this.anIntArray262 = null;
			this.anIntArray230 = null;
			this.anIntArray231 = null;
			this.anIntArray249 = null;
			this.anIntArray250 = null;
			this.aClass1_Sub1_Sub2_Sub4_11 = null;
			this.aClass1_Sub1_Sub2_Sub4_12 = null;
			if (arg0 != this.aByte31) {
				this.aClass41ArrayArrayArray1 = null;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("94283, " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method699() {
		try {
			while (true) {
				@Pc(10) Class1_Sub1_Sub4 local10 = this.aClass36_Sub1_1.method503();
				if (local10 == null) {
					return;
				}
				if (local10.anInt194 == 0) {
					Class1_Sub1_Sub1_Sub2.method141(local10.aByteArray9, local10.anInt192);
					if ((this.aClass36_Sub1_1.method502(local10.anInt192) & 0x62) != 0) {
						this.aBoolean245 = true;
						if (this.anInt1091 != -1 || this.anInt962 != -1) {
							this.aBoolean256 = true;
						}
					}
				}
				if (local10.anInt194 == 1 && local10.aByteArray9 != null) {
					Class31.method385(local10.aByteArray9);
				}
				if (local10.anInt194 == 2 && local10.anInt192 == this.anInt1046 && local10.aByteArray9 != null) {
					this.method639(574, local10.aByteArray9, this.aBoolean255);
				}
				if (local10.anInt194 == 3 && this.anInt944 == 1) {
					for (@Pc(85) int local85 = 0; local85 < this.aByteArrayArray5.length; local85++) {
						if (this.anIntArray268[local85] == local10.anInt192) {
							this.aByteArrayArray5[local85] = local10.aByteArray9;
							if (local10.aByteArray9 == null) {
								this.anIntArray268[local85] = -1;
							}
							break;
						}
						if (this.anIntArray269[local85] == local10.anInt192) {
							this.aByteArrayArray6[local85] = local10.aByteArray9;
							if (local10.aByteArray9 == null) {
								this.anIntArray269[local85] = -1;
							}
							break;
						}
					}
				}
				if (local10.anInt194 == 93 && this.aClass36_Sub1_1.method510(local10.anInt192)) {
					Class16.method227(new Class1_Sub1_Sub3(local10.aByteArray9, anInt972), this.aClass36_Sub1_1);
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("7114, " + 0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method700() {
		try {
			if (this.anInt954 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt1019 != 0) {
					local5 = 1;
				}
				for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
					if (this.aStringArray13[local18] != null) {
						@Pc(30) int local30 = this.anIntArray256[local18];
						@Pc(35) String local35 = this.aStringArray12[local18];
						if (local35 != null && local35.startsWith("@cr1@")) {
							local35 = local35.substring(5);
						}
						if (local35 != null && local35.startsWith("@cr2@")) {
							local35 = local35.substring(5);
						}
						if ((local30 == 3 || local30 == 7) && (local30 == 7 || this.anInt1050 == 0 || this.anInt1050 == 1 && this.method667(local35))) {
							@Pc(88) int local88 = 329 - local5 * 13;
							if (super.anInt847 > 4 && super.anInt848 - 4 > local88 - 10 && super.anInt848 - 4 <= local88 + 3) {
								@Pc(127) int local127 = this.aClass1_Sub1_Sub2_Sub1_3.method109("From:  " + local35 + this.aStringArray13[local18]) + 25;
								if (local127 > 450) {
									local127 = 450;
								}
								if (super.anInt847 < local127 + 4) {
									if (this.anInt1081 >= 1) {
										this.aStringArray8[this.anInt986] = "Report abuse @whi@" + local35;
										this.anIntArray237[this.anInt986] = 2641;
										this.anInt986++;
									}
									this.aStringArray8[this.anInt986] = "Add ignore @whi@" + local35;
									this.anIntArray237[this.anInt986] = 2895;
									this.anInt986++;
									this.aStringArray8[this.anInt986] = "Add friend @whi@" + local35;
									this.anIntArray237[this.anInt986] = 2166;
									this.anInt986++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local30 == 5 || local30 == 6) && this.anInt1050 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("7177, " + -81 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!CMGGUSPR;I)V")
	private void method701(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt923 = 0;
			this.anInt906 = 0;
			this.method658(arg1, arg2);
			@Pc(16) boolean local16 = false;
			this.method716(this.anInt1004, arg2, arg1);
			this.method722(arg2, arg1, this.aByte29);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt923; local30++) {
				local37 = this.anIntArray234[local30];
				if (this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local37].anInt429 != anInt1011) {
					this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local37].aClass37_1 = null;
					this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local37] = null;
				}
			}
			if (arg1.anInt78 != arg2) {
				signlink.reporterror(this.aString24 + " size mismatch in getnpcpos - pos:" + arg1.anInt78 + " psize:" + arg2);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt873; local37++) {
				if (this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray213[local37]] == null) {
					signlink.reporterror(this.aString24 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt873);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("43372, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method702(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 >> 7 == this.anInt935 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 >> 7 == this.anInt936) {
				this.anInt935 = 0;
			}
			@Pc(21) int local21 = this.anInt905;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(34) int local34 = 0; local34 < local21; local34++) {
				@Pc(40) Class1_Sub1_Sub1_Sub3_Sub2 local40;
				@Pc(45) int local45;
				if (arg0) {
					local40 = aClass1_Sub1_Sub1_Sub3_Sub2_1;
					local45 = this.anInt904 << 14;
				} else {
					local40 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray227[local34]];
					local45 = this.anIntArray227[local34] << 14;
				}
				if (local40 != null && local40.method264()) {
					local40.aBoolean89 = false;
					if ((aBoolean228 && this.anInt905 > 50 || this.anInt905 > 200) && !arg0 && local40.anInt416 == local40.anInt411) {
						local40.aBoolean89 = true;
					}
					@Pc(96) int local96 = local40.anInt424 >> 7;
					@Pc(101) int local101 = local40.anInt425 >> 7;
					if (local96 >= 0 && local96 < 104 && local101 >= 0 && local101 < 104) {
						if (local40.aClass1_Sub1_Sub1_Sub2_2 == null || anInt1011 < local40.anInt439 || anInt1011 >= local40.anInt440) {
							if ((local40.anInt424 & 0x7F) == 64 && (local40.anInt425 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local96][local101] == this.anInt870) {
									continue;
								}
								this.anIntArrayArray23[local96][local101] = this.anInt870;
							}
							local40.anInt449 = this.method611(local40.anInt425, this.anInt1027, local40.anInt424);
							this.aClass35_1.method407(local40, this.anInt1027, local40.anInt425, local40.aBoolean87, local40.anInt424, local40.anInt426, local45, 60, local40.anInt449);
						} else {
							local40.aBoolean89 = false;
							local40.anInt449 = this.method611(local40.anInt425, this.anInt1027, local40.anInt424);
							this.aClass35_1.method408(local40.anInt424, local40.anInt425, local40.anInt446, local40.anInt449, this.anInt1027, local45, local40.anInt445, local40.anInt444, local40.anInt443, local40.anInt426, local40);
						}
					}
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("41815, " + arg0 + ", " + 6 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!TPIBHECB;B)V")
	private void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub4 arg2) {
		try {
			@Pc(7) int local7 = this.anInt983 + this.anInt941 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg1 * arg1;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub2.anIntArray60[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub2.anIntArray61[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt1008 + 256);
				@Pc(54) int local54 = local27 * 256 / (this.anInt1008 + 256);
				@Pc(64) int local64 = arg1 * local36 + arg0 * local54 >> 16;
				@Pc(74) int local74 = arg1 * local54 - arg0 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method479(local64 + 94 + 4 - arg2.anInt670 / 2, 83 - local74 - arg2.anInt671 / 2 - 4, this.aClass1_Sub1_Sub2_Sub3_4);
				} else {
					arg2.method473(local64 + 94 + 4 - arg2.anInt670 / 2, this.aByte39, 83 - local74 - arg2.anInt671 / 2 - 4);
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("20653, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)V")
	private void method704(@OriginalArg(0) byte arg0) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt905; local3++) {
				if (local3 == -1) {
					local11 = this.anInt904;
				} else {
					local11 = this.anIntArray227[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub3_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null && local23.anInt397 > 0) {
					local23.anInt397--;
					if (local23.anInt397 == 0) {
						local23.aString6 = null;
					}
				}
			}
			@Pc(50) boolean local50 = false;
			for (local11 = 0; local11 < this.anInt873; local11++) {
				@Pc(66) int local66 = this.anIntArray213[local11];
				@Pc(71) Class1_Sub1_Sub1_Sub3_Sub1 local71 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local66];
				if (local71 != null && local71.anInt397 > 0) {
					local71.anInt397--;
					if (local71.anInt397 == 0) {
						local71.aString6 = null;
					}
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("90798, " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(B)V")
	private void method705() {
		try {
			signlink.aBoolean261 = false;
			signlink.anInt1099 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("62589, " + -108 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method706() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt988; local3++) {
				if (this.anIntArray247[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray225[local3] != this.anInt1033 || this.anIntArray245[local3] != this.anInt919) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class3.method14(this.anIntArray225[local3], this.anIntArray245[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt78 / 22) > this.aLong30 + (long) (this.anInt916 / 22)) {
								this.anInt916 = local45.anInt78;
								this.aLong30 = System.currentTimeMillis();
								if (this.method715(local45.anInt78, local45.aByteArray8)) {
									this.anInt1033 = this.anIntArray225[local3];
									this.anInt919 = this.anIntArray245[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method681()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
						if (signlink.reporterror) {
							this.aClass1_Sub1_Sub3_9.method44(49, this.anInt902);
							this.aClass1_Sub1_Sub3_9.method46(this.anIntArray225[local3] & 0x7FFF);
						} else {
							this.aClass1_Sub1_Sub3_9.method44(49, this.anInt902);
							this.aClass1_Sub1_Sub3_9.method46(-1);
						}
					}
					if (local12 && this.anIntArray247[local3] != -5) {
						this.anIntArray247[local3] = -5;
					} else {
						this.anInt988--;
						for (@Pc(140) int local140 = local3; local140 < this.anInt988; local140++) {
							this.anIntArray225[local140] = this.anIntArray225[local140 + 1];
							this.anIntArray245[local140] = this.anIntArray245[local140 + 1];
							this.anIntArray247[local140] = this.anIntArray247[local140 + 1];
						}
						local3--;
					}
				} else {
					@Pc(192) int local192 = this.anIntArray247[local3]--;
				}
			}
			if (this.anInt996 > 0) {
				this.anInt996 -= 20;
				if (this.anInt996 < 0) {
					this.anInt996 = 0;
				}
				if (this.anInt996 == 0 && this.aBoolean223 && !aBoolean228) {
					this.anInt1046 = this.anInt960;
					this.aBoolean255 = true;
					this.aClass36_Sub1_1.method507(2, this.anInt1046);
					return;
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("47894, " + -177 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method707(@OriginalArg(0) int arg0) {
		try {
			Class44.method548(arg0);
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("99493, " + arg0 + ", " + 45 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZB)V")
	private void method708(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			signlink.anInt1098 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("63235, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method709() {
		try {
			if (this.anInt931 == 0 && this.anInt950 == 0) {
				this.aStringArray8[this.anInt986] = "Walk here";
				this.anIntArray237[this.anInt986] = 158;
				this.anIntArray235[this.anInt986] = super.anInt847;
				this.anIntArray236[this.anInt986] = super.anInt848;
				this.anInt986++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub2.anInt149; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub2.anIntArray59[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass35_1.method426(this.anInt1027, local53, local59, local49) >= 0) {
						@Pc(91) Class48 local91 = Class48.method567(local71);
						if (local91.anIntArray206 != null) {
							local91 = local91.method565(825);
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt931 == 1) {
							this.aStringArray8[this.anInt986] = "Use " + this.aString18 + " with @cya@" + local91.aString16;
							this.anIntArray237[this.anInt986] = 791;
							this.anIntArray238[this.anInt986] = local49;
							this.anIntArray235[this.anInt986] = local53;
							this.anIntArray236[this.anInt986] = local59;
							this.anInt986++;
						} else if (this.anInt950 != 1) {
							if (local91.aStringArray7 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray7[local218] != null) {
										this.aStringArray8[this.anInt986] = local91.aStringArray7[local218] + " @cya@" + local91.aString16;
										if (local218 == 0) {
											this.anIntArray237[this.anInt986] = 787;
										}
										if (local218 == 1) {
											this.anIntArray237[this.anInt986] = 350;
										}
										if (local218 == 2) {
											this.anIntArray237[this.anInt986] = 814;
										}
										if (local218 == 3) {
											this.anIntArray237[this.anInt986] = 758;
										}
										if (local218 == 4) {
											this.anIntArray237[this.anInt986] = 1237;
										}
										this.anIntArray238[this.anInt986] = local49;
										this.anIntArray235[this.anInt986] = local53;
										this.anIntArray236[this.anInt986] = local59;
										this.anInt986++;
									}
								}
							}
							this.aStringArray8[this.anInt986] = "Examine @cya@" + local91.aString16;
							this.anIntArray237[this.anInt986] = 1642;
							this.anIntArray238[this.anInt986] = local91.anInt812 << 14;
							this.anIntArray235[this.anInt986] = local53;
							this.anIntArray236[this.anInt986] = local59;
							this.anInt986++;
						} else if ((this.anInt952 & 0x4) == 4) {
							this.aStringArray8[this.anInt986] = this.aString21 + " @cya@" + local91.aString16;
							this.anIntArray237[this.anInt986] = 387;
							this.anIntArray238[this.anInt986] = local49;
							this.anIntArray235[this.anInt986] = local53;
							this.anIntArray236[this.anInt986] = local59;
							this.anInt986++;
						}
					}
					@Pc(398) Class1_Sub1_Sub1_Sub3_Sub1 local398;
					@Pc(446) Class1_Sub1_Sub1_Sub3_Sub2 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class1_Sub1_Sub1_Sub3_Sub1 local369 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local71];
						if (local369.aClass37_1.aByte17 == 1 && (local369.anInt424 & 0x7F) == 64 && (local369.anInt425 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt873; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray213[local218]];
								if (local398 != null && local398 != local369 && local398.aClass37_1.aByte17 == 1 && local398.anInt424 == local369.anInt424 && local398.anInt425 == local369.anInt425) {
									this.method692(local59, local53, local398.aClass37_1, this.anIntArray213[local218]);
								}
							}
							for (local436 = 0; local436 < this.anInt905; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray227[local436]];
								if (local446 != null && local446.anInt424 == local369.anInt424 && local446.anInt425 == local369.anInt425) {
									this.method604(local59, local446, this.anIntArray227[local436], (byte) 1, local53);
								}
							}
						}
						this.method692(local59, local53, local369.aClass37_1, local71);
					}
					if (local65 == 0) {
						@Pc(488) Class1_Sub1_Sub1_Sub3_Sub2 local488 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local71];
						if ((local488.anInt424 & 0x7F) == 64 && (local488.anInt425 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt873; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray213[local218]];
								if (local398 != null && local398.aClass37_1.aByte17 == 1 && local398.anInt424 == local488.anInt424 && local398.anInt425 == local488.anInt425) {
									this.method692(local59, local53, local398.aClass37_1, this.anIntArray213[local218]);
								}
							}
							for (local436 = 0; local436 < this.anInt905; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray227[local436]];
								if (local446 != null && local446 != local488 && local446.anInt424 == local488.anInt424 && local446.anInt425 == local488.anInt425) {
									this.method604(local59, local446, this.anIntArray227[local436], (byte) 1, local53);
								}
							}
						}
						this.method604(local59, local488, local71, (byte) 1, local53);
					}
					if (local65 == 3) {
						@Pc(607) Class41 local607 = this.aClass41ArrayArrayArray1[this.anInt1027][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class1_Sub1_Sub1_Sub4 local614 = (Class1_Sub1_Sub1_Sub4) local607.method535(); local614 != null; local614 = (Class1_Sub1_Sub1_Sub4) local607.method537()) {
								@Pc(620) Class23 local620 = Class23.method248(local614.anInt565);
								if (this.anInt931 == 1) {
									this.aStringArray8[this.anInt986] = "Use " + this.aString18 + " with @lre@" + local620.aString5;
									this.anIntArray237[this.anInt986] = 825;
									this.anIntArray238[this.anInt986] = local614.anInt565;
									this.anIntArray235[this.anInt986] = local53;
									this.anIntArray236[this.anInt986] = local59;
									this.anInt986++;
								} else if (this.anInt950 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray2 != null && local620.aStringArray2[local737] != null) {
											this.aStringArray8[this.anInt986] = local620.aStringArray2[local737] + " @lre@" + local620.aString5;
											if (local737 == 0) {
												this.anIntArray237[this.anInt986] = 233;
											}
											if (local737 == 1) {
												this.anIntArray237[this.anInt986] = 174;
											}
											if (local737 == 2) {
												this.anIntArray237[this.anInt986] = 375;
											}
											if (local737 == 3) {
												this.anIntArray237[this.anInt986] = 679;
											}
											if (local737 == 4) {
												this.anIntArray237[this.anInt986] = 138;
											}
											this.anIntArray238[this.anInt986] = local614.anInt565;
											this.anIntArray235[this.anInt986] = local53;
											this.anIntArray236[this.anInt986] = local59;
											this.anInt986++;
										} else if (local737 == 2) {
											this.aStringArray8[this.anInt986] = "Take @lre@" + local620.aString5;
											this.anIntArray237[this.anInt986] = 375;
											this.anIntArray238[this.anInt986] = local614.anInt565;
											this.anIntArray235[this.anInt986] = local53;
											this.anIntArray236[this.anInt986] = local59;
											this.anInt986++;
										}
									}
									this.aStringArray8[this.anInt986] = "Examine @lre@" + local620.aString5;
									this.anIntArray237[this.anInt986] = 1186;
									this.anIntArray238[this.anInt986] = local614.anInt565;
									this.anIntArray235[this.anInt986] = local53;
									this.anIntArray236[this.anInt986] = local59;
									this.anInt986++;
								} else if ((this.anInt952 & 0x1) == 1) {
									this.aStringArray8[this.anInt986] = this.aString21 + " @lre@" + local620.aString5;
									this.anIntArray237[this.anInt986] = 555;
									this.anIntArray238[this.anInt986] = local614.anInt565;
									this.anIntArray235[this.anInt986] = local53;
									this.anIntArray236[this.anInt986] = local59;
									this.anInt986++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("26095, " + 17893 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(B)V")
	private void method711(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt1061 == 0) {
				this.aStringArray8[0] = "Cancel";
				this.anIntArray237[0] = 1117;
				this.anInt986 = 1;
				if (this.anInt1090 == -1) {
					this.method700();
					this.anInt963 = 0;
					this.anInt1006 = 0;
					@Pc(75) boolean local75 = false;
					if (super.anInt847 > 4 && super.anInt848 > 4 && super.anInt847 < 516 && super.anInt848 < 338) {
						if (this.anInt1007 == -1) {
							this.method709();
						} else {
							this.method675(super.anInt847, 4, 4, 0, Class44.method544(this.anInt1007), super.anInt848, 0);
						}
					}
					if (this.anInt963 != this.anInt1048) {
						this.anInt1048 = this.anInt963;
					}
					if (this.anInt1006 != this.anInt900) {
						this.anInt900 = this.anInt1006;
					}
					this.anInt963 = 0;
					this.anInt1006 = 0;
					if (super.anInt847 > 553 && super.anInt848 > 205 && super.anInt847 < 743 && super.anInt848 < 466) {
						if (this.anInt1071 != -1) {
							this.method675(super.anInt847, 553, 205, 0, Class44.method544(this.anInt1071), super.anInt848, 1);
						} else if (this.anIntArray243[this.anInt1005] != -1) {
							this.method675(super.anInt847, 553, 205, 0, Class44.method544(this.anIntArray243[this.anInt1005]), super.anInt848, 1);
						}
					}
					if (this.anInt963 != this.anInt994) {
						this.aBoolean245 = true;
						this.anInt994 = this.anInt963;
					}
					if (this.anInt1006 != this.anInt866) {
						this.aBoolean245 = true;
						this.anInt866 = this.anInt1006;
					}
					this.anInt963 = 0;
					this.anInt1006 = 0;
					if (super.anInt847 > 17 && super.anInt848 > 357 && super.anInt847 < 496 && super.anInt848 < 453) {
						if (this.anInt1091 != -1) {
							this.method675(super.anInt847, 17, 357, 0, Class44.method544(this.anInt1091), super.anInt848, 2);
						} else if (this.anInt962 != -1) {
							this.method675(super.anInt847, 17, 357, 0, Class44.method544(this.anInt962), super.anInt848, 3);
						} else if (super.anInt848 < 434 && super.anInt847 < 426 && this.anInt938 == 0) {
							this.method603(super.anInt847 - 17, super.anInt848 - 357);
						}
					}
					if ((this.anInt1091 != -1 || this.anInt962 != -1) && this.anInt963 != this.anInt915) {
						this.aBoolean256 = true;
						this.anInt915 = this.anInt963;
					}
					if ((this.anInt1091 != -1 || this.anInt962 != -1) && this.anInt1006 != this.anInt884) {
						this.aBoolean256 = true;
						this.anInt884 = this.anInt1006;
					}
					@Pc(354) boolean local354 = false;
					while (!local354) {
						local354 = true;
						for (@Pc(360) int local360 = 0; local360 < this.anInt986 - 1; local360++) {
							if (this.anIntArray237[local360] < 1000 && this.anIntArray237[local360 + 1] > 1000) {
								@Pc(381) String local381 = this.aStringArray8[local360];
								this.aStringArray8[local360] = this.aStringArray8[local360 + 1];
								this.aStringArray8[local360 + 1] = local381;
								@Pc(403) int local403 = this.anIntArray237[local360];
								this.anIntArray237[local360] = this.anIntArray237[local360 + 1];
								this.anIntArray237[local360 + 1] = local403;
								@Pc(425) int local425 = this.anIntArray235[local360];
								this.anIntArray235[local360] = this.anIntArray235[local360 + 1];
								this.anIntArray235[local360 + 1] = local425;
								@Pc(447) int local447 = this.anIntArray236[local360];
								this.anIntArray236[local360] = this.anIntArray236[local360 + 1];
								this.anIntArray236[local360 + 1] = local447;
								@Pc(469) int local469 = this.anIntArray238[local360];
								this.anIntArray238[local360] = this.anIntArray238[local360 + 1];
								this.anIntArray238[local360 + 1] = local469;
								local354 = false;
							}
						}
					}
				} else {
					this.anInt963 = 0;
					this.anInt1006 = 0;
					this.method675(super.anInt847, 0, 0, 0, Class44.method544(this.anInt1090), super.anInt848, 0);
					if (this.anInt963 != this.anInt1048) {
						this.anInt1048 = this.anInt963;
					}
					if (this.anInt1006 != this.anInt900) {
						this.anInt900 = this.anInt1006;
					}
				}
			}
		} catch (@Pc(499) RuntimeException local499) {
			signlink.reporterror("96654, " + arg0 + ", " + local499.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(B)I")
	private int method712() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt890 < 310) {
				anInt1024++;
				if (anInt1024 > 154) {
					anInt1024 = 0;
					this.aClass1_Sub1_Sub3_9.method44(48, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method46(14668);
				}
				@Pc(36) int local36 = this.anInt887 >> 7;
				@Pc(41) int local41 = this.anInt889 >> 7;
				@Pc(46) int local46 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 >> 7;
				@Pc(51) int local51 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt1027][local36][local41] & 0x4) != 0) {
					local3 = this.anInt1027;
				}
				@Pc(73) int local73;
				if (local46 > local36) {
					local73 = local46 - local36;
				} else {
					local73 = local36 - local46;
				}
				@Pc(86) int local86;
				if (local51 > local41) {
					local86 = local51 - local41;
				} else {
					local86 = local41 - local51;
				}
				@Pc(101) int local101;
				@Pc(103) int local103;
				if (local73 > local86) {
					local101 = local86 * 65536 / local73;
					local103 = 32768;
					while (local36 != local46) {
						if (local36 < local46) {
							local36++;
						} else if (local36 > local46) {
							local36--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1027][local36][local41] & 0x4) != 0) {
							local3 = this.anInt1027;
						}
						local103 += local101;
						if (local103 >= 65536) {
							local103 -= 65536;
							if (local41 < local51) {
								local41++;
							} else if (local41 > local51) {
								local41--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1027][local36][local41] & 0x4) != 0) {
								local3 = this.anInt1027;
							}
						}
					}
				} else {
					local101 = local73 * 65536 / local86;
					local103 = 32768;
					while (local41 != local51) {
						if (local41 < local51) {
							local41++;
						} else if (local41 > local51) {
							local41--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1027][local36][local41] & 0x4) != 0) {
							local3 = this.anInt1027;
						}
						local103 += local101;
						if (local103 >= 65536) {
							local103 -= 65536;
							if (local36 < local46) {
								local36++;
							} else if (local36 > local46) {
								local36--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1027][local36][local41] & 0x4) != 0) {
								local3 = this.anInt1027;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt1027][aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt424 >> 7][aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt425 >> 7] & 0x4) != 0) {
				local3 = this.anInt1027;
			}
			return local3;
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("38105, " + 2 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)I")
	private int method713() {
		try {
			@Pc(9) int local9 = this.method611(this.anInt889, this.anInt1027, this.anInt887);
			return local9 - this.anInt888 >= 800 || (this.aByteArrayArrayArray8[this.anInt1027][this.anInt887 >> 7][this.anInt889 >> 7] & 0x4) == 0 ? 3 : this.anInt1027;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("57458, " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method581() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass17_20 = null;
			this.aClass17_21 = null;
			this.aClass17_22 = null;
			this.aClass17_23 = null;
			this.aClass17_24 = null;
			this.aClass17_25 = null;
			this.aClass17_26 = null;
			this.aClass17_27 = null;
			this.aClass17_6 = null;
			this.aClass17_7 = null;
			this.aClass17_8 = null;
			this.aClass17_9 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass35_1 = null;
			this.aClass40Array1 = null;
			this.aClass17_3 = null;
			this.aClass17_4 = null;
			this.aClass17_5 = null;
			this.aClass1_Sub1_Sub2_Sub4_7 = null;
			this.aClass41ArrayArrayArray1 = null;
			this.aClass41_11 = null;
			this.aClass1_Sub1_Sub2_Sub4_13 = null;
			this.aClass1_Sub1_Sub2_Sub4_14 = null;
			this.aClass1_Sub1_Sub2_Sub4_15 = null;
			this.aClass1_Sub1_Sub2_Sub4_16 = null;
			this.aClass1_Sub1_Sub2_Sub4_17 = null;
			this.aClass41_12 = null;
			this.aClass41_10 = null;
			this.aByteArray21 = null;
			this.anIntArrayArray24 = null;
			this.anIntArrayArray25 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.aClass17_18 = null;
			this.aClass17_19 = null;
			this.aClass17_15 = null;
			this.aClass17_16 = null;
			this.aClass17_17 = null;
			if (this.aClass36_Sub1_1 != null) {
				this.aClass36_Sub1_1.method498();
			}
			this.aClass36_Sub1_1 = null;
			this.aClass17_10 = null;
			this.aClass17_11 = null;
			this.aClass17_12 = null;
			this.aClass17_13 = null;
			this.aClass17_14 = null;
			if (this.aClass47_1 != null) {
				this.aClass47_1.aBoolean189 = false;
			}
			this.aClass47_1 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.aClass1_Sub1_Sub3_9 = null;
			this.aClass1_Sub1_Sub3_7 = null;
			this.aClass1_Sub1_Sub3_8 = null;
			this.method705();
			this.aClass1_Sub1_Sub3_6 = null;
			this.anIntArray235 = null;
			this.anIntArray236 = null;
			this.anIntArray237 = null;
			this.anIntArray238 = null;
			this.aStringArray8 = null;
			this.aClass1_Sub1_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray227 = null;
			this.anIntArray228 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray234 = null;
			this.aClass1_Sub1_Sub2_Sub4_10 = null;
			this.aClass1_Sub1_Sub2_Sub4Array4 = null;
			this.aClass1_Sub1_Sub2_Sub4Array5 = null;
			this.aClass1_Sub1_Sub2_Sub4Array9 = null;
			this.aClass1_Sub1_Sub2_Sub4Array6 = null;
			this.aClass1_Sub1_Sub2_Sub4Array10 = null;
			this.aClass1_Sub1_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray213 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aStringArray10 = null;
			this.aLongArray3 = null;
			this.anIntArray254 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.aClass1_Sub1_Sub2_Sub4Array7 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub4Array8 = null;
			try {
				if (this.aClass39_1 != null) {
					this.aClass39_1.method513();
				}
			} catch (@Pc(287) Exception local287) {
			}
			this.aClass39_1 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray232 = null;
			this.anIntArray267 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray268 = null;
			this.anIntArray269 = null;
			this.aClass1_Sub1_Sub2_Sub4_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.method698(this.aByte30);
			Class48.method562();
			Class37.method482();
			Class23.method256();
			Class44.method541();
			Class14.aClass14Array1 = null;
			Class6.aClass6Array1 = null;
			Class24.aClass24Array1 = null;
			Class46.aClass46Array1 = null;
			Class18.aClass18Array1 = null;
			Class18.aClass15_1 = null;
			Class4.aClass4Array1 = null;
			super.aClass17_2 = null;
			Class1_Sub1_Sub1_Sub3_Sub2.aClass15_4 = null;
			Class1_Sub1_Sub2_Sub2.method335();
			Class35.method395();
			Class1_Sub1_Sub1_Sub2.method139();
			Class31.method386();
			System.gc();
		} catch (@Pc(380) RuntimeException local380) {
			signlink.reporterror("48262, " + 154 + ", " + local380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method714() {
		try {
			while (true) {
				@Pc(9) int local9 = this.method578();
				if (local9 == -1) {
					return;
				}
				if (this.anInt1007 != -1 && this.anInt1007 == this.anInt961) {
					if (local9 == 8 && this.aString26.length() > 0) {
						this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
					}
					if ((local9 >= 97 && local9 <= 122 || local9 >= 65 && local9 <= 90 || local9 >= 48 && local9 <= 57 || local9 == 32) && this.aString26.length() < 12) {
						this.aString26 = this.aString26 + (char) local9;
					}
				} else {
					@Pc(190) int local190;
					if (this.aBoolean243) {
						if (local9 >= 32 && local9 <= 122 && this.aString20.length() < 80) {
							this.aString20 = this.aString20 + (char) local9;
							this.aBoolean256 = true;
						}
						if (local9 == 8 && this.aString20.length() > 0) {
							this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
							this.aBoolean256 = true;
						}
						if (local9 == 13 || local9 == 10) {
							this.aBoolean243 = false;
							this.aBoolean256 = true;
							@Pc(149) long local149;
							if (this.anInt945 == 1) {
								local149 = Class49.method568(this.aString20);
								this.method674(local149);
							}
							if (this.anInt945 == 2 && this.anInt1072 > 0) {
								local149 = Class49.method568(this.aString20);
								this.method688(local149, 814);
							}
							if (this.anInt945 == 3 && this.aString20.length() > 0) {
								this.aClass1_Sub1_Sub3_9.method44(7, this.anInt902);
								this.aClass1_Sub1_Sub3_9.method45(0);
								local190 = this.aClass1_Sub1_Sub3_9.anInt78;
								this.aClass1_Sub1_Sub3_9.method51(this.aLong31);
								Class33.method393(this.aClass1_Sub1_Sub3_9, this.aString20);
								this.aClass1_Sub1_Sub3_9.method54(this.aClass1_Sub1_Sub3_9.anInt78 - local190);
								this.aString20 = Class33.method394(this.aString20);
								this.aString20 = Class25.method280(this.aString20);
								this.method664(Class49.method572(Class49.method569(this.aLong31)), this.aString20, 6);
								if (this.anInt1050 == 2) {
									this.anInt1050 = 1;
									this.aBoolean229 = true;
									this.aClass1_Sub1_Sub3_9.method44(205, this.anInt902);
									this.aClass1_Sub1_Sub3_9.method45(this.anInt926);
									this.aClass1_Sub1_Sub3_9.method45(this.anInt1050);
									this.aClass1_Sub1_Sub3_9.method45(this.anInt895);
								}
							}
							if (this.anInt945 == 4 && this.anInt1089 < 100) {
								local149 = Class49.method568(this.aString20);
								this.method610(local149, this.anInt1088);
							}
							if (this.anInt945 == 5 && this.anInt1089 > 0) {
								local149 = Class49.method568(this.aString20);
								this.method638(975, local149);
							}
						}
					} else if (this.anInt938 == 1) {
						if (local9 >= 48 && local9 <= 57 && this.aString22.length() < 10) {
							this.aString22 = this.aString22 + (char) local9;
							this.aBoolean256 = true;
						}
						if (local9 == 8 && this.aString22.length() > 0) {
							this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							this.aBoolean256 = true;
						}
						if (local9 == 13 || local9 == 10) {
							if (this.aString22.length() > 0) {
								local190 = 0;
								try {
									local190 = Integer.parseInt(this.aString22);
								} catch (@Pc(369) Exception local369) {
								}
								this.aClass1_Sub1_Sub3_9.method44(114, this.anInt902);
								this.aClass1_Sub1_Sub3_9.method49(local190);
							}
							this.anInt938 = 0;
							this.aBoolean256 = true;
						}
					} else if (this.anInt938 == 2) {
						if (local9 >= 32 && local9 <= 122 && this.aString22.length() < 12) {
							this.aString22 = this.aString22 + (char) local9;
							this.aBoolean256 = true;
						}
						if (local9 == 8 && this.aString22.length() > 0) {
							this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							this.aBoolean256 = true;
						}
						if (local9 == 13 || local9 == 10) {
							if (this.aString22.length() > 0) {
								this.aClass1_Sub1_Sub3_9.method44(97, this.anInt902);
								this.aClass1_Sub1_Sub3_9.method51(Class49.method568(this.aString22));
							}
							this.anInt938 = 0;
							this.aBoolean256 = true;
						}
					} else if (this.anInt938 == 3) {
						if (local9 >= 32 && local9 <= 122 && this.aString22.length() < 40) {
							this.aString22 = this.aString22 + (char) local9;
							this.aBoolean256 = true;
						}
						if (local9 == 8 && this.aString22.length() > 0) {
							this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							this.aBoolean256 = true;
						}
					} else if (this.anInt1091 == -1 && this.anInt1090 == -1) {
						if (local9 >= 32 && local9 <= 122 && this.aString28.length() < 80) {
							this.aString28 = this.aString28 + (char) local9;
							this.aBoolean256 = true;
						}
						if (local9 == 8 && this.aString28.length() > 0) {
							this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							this.aBoolean256 = true;
						}
						if ((local9 == 13 || local9 == 10) && this.aString28.length() > 0) {
							if (this.anInt1081 == 2) {
								if (this.aString28.equals("::clientdrop")) {
									this.method690();
								}
								if (this.aString28.equals("::lag")) {
									this.method666();
								}
								if (this.aString28.equals("::prefetchmusic")) {
									for (local190 = 0; local190 < this.aClass36_Sub1_1.method509(2); local190++) {
										this.aClass36_Sub1_1.method494((byte) 1, local190, 2);
									}
								}
								if (this.aString28.equals("::fpson")) {
									aBoolean215 = true;
								}
								if (this.aString28.equals("::fpsoff")) {
									aBoolean215 = false;
								}
								if (this.aString28.equals("::noclip")) {
									for (local190 = 0; local190 < 4; local190++) {
										for (@Pc(656) int local656 = 1; local656 < 103; local656++) {
											for (@Pc(660) int local660 = 1; local660 < 103; local660++) {
												this.aClass40Array1[local190].anIntArrayArray19[local656][local660] = 0;
											}
										}
									}
								}
							}
							if (this.aString28.startsWith("::")) {
								this.aClass1_Sub1_Sub3_9.method44(28, this.anInt902);
								this.aClass1_Sub1_Sub3_9.method45(this.aString28.length() - 1);
								this.aClass1_Sub1_Sub3_9.method52(this.aString28.substring(2));
							} else {
								@Pc(716) String local716 = this.aString28.toLowerCase();
								@Pc(718) byte local718 = 0;
								if (local716.startsWith("yellow:")) {
									local718 = 0;
									this.aString28 = this.aString28.substring(7);
								} else if (local716.startsWith("red:")) {
									local718 = 1;
									this.aString28 = this.aString28.substring(4);
								} else if (local716.startsWith("green:")) {
									local718 = 2;
									this.aString28 = this.aString28.substring(6);
								} else if (local716.startsWith("cyan:")) {
									local718 = 3;
									this.aString28 = this.aString28.substring(5);
								} else if (local716.startsWith("purple:")) {
									local718 = 4;
									this.aString28 = this.aString28.substring(7);
								} else if (local716.startsWith("white:")) {
									local718 = 5;
									this.aString28 = this.aString28.substring(6);
								} else if (local716.startsWith("flash1:")) {
									local718 = 6;
									this.aString28 = this.aString28.substring(7);
								} else if (local716.startsWith("flash2:")) {
									local718 = 7;
									this.aString28 = this.aString28.substring(7);
								} else if (local716.startsWith("flash3:")) {
									local718 = 8;
									this.aString28 = this.aString28.substring(7);
								} else if (local716.startsWith("glow1:")) {
									local718 = 9;
									this.aString28 = this.aString28.substring(6);
								} else if (local716.startsWith("glow2:")) {
									local718 = 10;
									this.aString28 = this.aString28.substring(6);
								} else if (local716.startsWith("glow3:")) {
									local718 = 11;
									this.aString28 = this.aString28.substring(6);
								}
								local716 = this.aString28.toLowerCase();
								@Pc(890) byte local890 = 0;
								if (local716.startsWith("wave:")) {
									local890 = 1;
									this.aString28 = this.aString28.substring(5);
								} else if (local716.startsWith("wave2:")) {
									local890 = 2;
									this.aString28 = this.aString28.substring(6);
								} else if (local716.startsWith("shake:")) {
									local890 = 3;
									this.aString28 = this.aString28.substring(6);
								} else if (local716.startsWith("scroll:")) {
									local890 = 4;
									this.aString28 = this.aString28.substring(7);
								} else if (local716.startsWith("slide:")) {
									local890 = 5;
									this.aString28 = this.aString28.substring(6);
								}
								this.aClass1_Sub1_Sub3_9.method44(219, this.anInt902);
								this.aClass1_Sub1_Sub3_9.method45(0);
								@Pc(972) int local972 = this.aClass1_Sub1_Sub3_9.anInt78;
								this.aClass1_Sub1_Sub3_9.method45(local718);
								this.aClass1_Sub1_Sub3_6.anInt78 = 0;
								Class33.method393(this.aClass1_Sub1_Sub3_6, this.aString28);
								this.aClass1_Sub1_Sub3_9.method90(this.aClass1_Sub1_Sub3_6.anInt78, this.aClass1_Sub1_Sub3_6.aByteArray8);
								this.aClass1_Sub1_Sub3_9.method45(local890);
								this.aClass1_Sub1_Sub3_9.method54(this.aClass1_Sub1_Sub3_9.anInt78 - local972);
								this.aString28 = Class33.method394(this.aString28);
								this.aString28 = Class25.method280(this.aString28);
								aClass1_Sub1_Sub1_Sub3_Sub2_1.aString6 = this.aString28;
								aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt392 = local718;
								aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt415 = local890;
								aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt397 = 150;
								if (this.anInt1081 == 2) {
									this.method664("@cr2@" + aClass1_Sub1_Sub1_Sub3_Sub2_1.aString7, aClass1_Sub1_Sub1_Sub3_Sub2_1.aString6, 2);
								} else if (this.anInt1081 == 1) {
									this.method664("@cr1@" + aClass1_Sub1_Sub1_Sub3_Sub2_1.aString7, aClass1_Sub1_Sub1_Sub3_Sub2_1.aString6, 2);
								} else {
									this.method664(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString7, aClass1_Sub1_Sub1_Sub3_Sub2_1.aString6, 2);
								}
								if (this.anInt926 == 2) {
									this.anInt926 = 3;
									this.aBoolean229 = true;
									this.aClass1_Sub1_Sub3_9.method44(205, this.anInt902);
									this.aClass1_Sub1_Sub3_9.method45(this.anInt926);
									this.aClass1_Sub1_Sub3_9.method45(this.anInt1050);
									this.aClass1_Sub1_Sub3_9.method45(this.anInt895);
								}
							}
							this.aString28 = "";
							this.aBoolean256 = true;
						}
					}
				}
			}
		} catch (@Pc(1124) RuntimeException local1124) {
			signlink.reporterror("50108, " + -571 + ", " + local1124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I[BZ)Z")
	private boolean method715(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("46398, " + arg0 + ", " + arg1 + ", " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!CMGGUSPR;)V")
	private void method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			while (true) {
				if (arg2.anInt79 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg2.method66(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local12] = new Class1_Sub1_Sub1_Sub3_Sub1();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub3_Sub1 local32 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local12];
						this.anIntArray213[this.anInt873++] = local12;
						local32.anInt429 = anInt1011;
						@Pc(51) int local51 = arg2.method66(5);
						if (local51 > 15) {
							local51 -= 32;
						}
						local32.aClass37_1 = Class37.method483(arg2.method66(13));
						@Pc(67) int local67 = arg2.method66(5);
						if (local67 > 15) {
							local67 -= 32;
						}
						@Pc(76) int local76 = arg2.method66(1);
						if (local76 == 1) {
							this.anIntArray228[this.anInt906++] = local12;
						}
						@Pc(95) int local95 = arg2.method66(1);
						local32.anInt427 = local32.aClass37_1.aByte17;
						local32.anInt434 = local32.aClass37_1.anInt673;
						local32.anInt393 = local32.aClass37_1.anInt676;
						local32.anInt394 = local32.aClass37_1.anInt685;
						local32.anInt395 = local32.aClass37_1.anInt677;
						local32.anInt396 = local32.aClass37_1.anInt686;
						local32.anInt411 = local32.aClass37_1.anInt691;
						local32.method265(local95 == 1, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0] + local51, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0] + local67);
						continue;
					}
				}
				arg2.method67(502);
				if (arg0 != 5) {
					this.anInt1077 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("78740, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method718() {
		try {
			@Pc(4) Graphics local4 = this.method584().getGraphics();
			this.anInt1076 += 0;
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method577((byte) 5);
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean244) {
				this.aBoolean251 = false;
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
			if (this.aBoolean248) {
				this.aBoolean251 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean224) {
				this.aBoolean251 = false;
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
			signlink.reporterror("64143, " + 0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!WJQTPVDG;IIZ)V")
	private void method719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class44 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (this.aBoolean258) {
				this.anInt897 = 32;
			} else {
				this.anInt897 = 0;
			}
			this.aBoolean258 = false;
			if (arg3 >= arg4 && arg3 < arg4 + 16 && arg2 >= arg0 && arg2 < arg0 + 16) {
				arg5.anInt738 -= this.anInt909 * 4;
				if (arg7 == 1) {
					this.aBoolean245 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean256 = true;
				}
			} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg2 >= arg0 + arg1 - 16 && arg2 < arg0 + arg1) {
				arg5.anInt738 += this.anInt909 * 4;
				if (arg7 == 1) {
					this.aBoolean245 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean256 = true;
				}
			} else if (arg3 >= arg4 - this.anInt897 && arg3 < arg4 + this.anInt897 + 16 && arg2 >= arg0 + 16 && arg2 < arg0 + arg1 - 16 && this.anInt909 > 0) {
				@Pc(139) int local139 = (arg1 - 32) * arg1 / arg6;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(154) int local154 = arg2 - arg0 - local139 / 2 - 16;
				@Pc(160) int local160 = arg1 - local139 - 32;
				arg5.anInt738 = (arg6 - arg1) * local154 / local160;
				if (arg7 == 1) {
					this.aBoolean245 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean256 = true;
				}
				this.aBoolean258 = true;
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("9459, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method720() {
		try {
			this.anInt877 = 0;
			@Pc(76) int local76;
			for (@Pc(12) int local12 = -1; local12 < this.anInt905 + this.anInt873; local12++) {
				@Pc(19) Class1_Sub1_Sub1_Sub3 local19;
				if (local12 == -1) {
					local19 = aClass1_Sub1_Sub1_Sub3_Sub2_1;
				} else if (local12 < this.anInt905) {
					local19 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray227[local12]];
				} else {
					local19 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray213[local12 - this.anInt905]];
				}
				if (local19 != null && local19.method264()) {
					@Pc(60) Class37 local60;
					if (local19 instanceof Class1_Sub1_Sub1_Sub3_Sub1) {
						local60 = ((Class1_Sub1_Sub1_Sub3_Sub1) local19).aClass37_1;
						if (local60.anIntArray172 != null) {
							local60 = local60.method481();
						}
						if (local60 == null) {
							continue;
						}
					}
					if (local12 >= this.anInt905) {
						local60 = ((Class1_Sub1_Sub1_Sub3_Sub1) local19).aClass37_1;
						if (local60.anInt678 >= 0 && local60.anInt678 < this.aClass1_Sub1_Sub2_Sub4Array9.length) {
							this.method678(local19, local19.anInt430 + 15);
							if (this.anInt859 > -1) {
								this.aClass1_Sub1_Sub2_Sub4Array9[local60.anInt678].method473(this.anInt859 - 12, this.aByte39, this.anInt860 - 30);
							}
						}
						if (this.anInt867 == 1 && this.anInt918 == this.anIntArray213[local12 - this.anInt905] && anInt1011 % 20 < 10) {
							this.method678(local19, local19.anInt430 + 15);
							if (this.anInt859 > -1) {
								this.aClass1_Sub1_Sub2_Sub4Array6[0].method473(this.anInt859 - 12, this.aByte39, this.anInt860 - 28);
							}
						}
					} else {
						local76 = 30;
						@Pc(79) Class1_Sub1_Sub1_Sub3_Sub2 local79 = (Class1_Sub1_Sub1_Sub3_Sub2) local19;
						if (local79.anInt454 != -1 || local79.anInt455 != -1) {
							this.method678(local19, local19.anInt430 + 15);
							if (this.anInt859 > -1) {
								if (local79.anInt454 != -1) {
									this.aClass1_Sub1_Sub2_Sub4Array5[local79.anInt454].method473(this.anInt859 - 12, this.aByte39, this.anInt860 - 30);
									local76 += 25;
								}
								if (local79.anInt455 != -1) {
									this.aClass1_Sub1_Sub2_Sub4Array9[local79.anInt455].method473(this.anInt859 - 12, this.aByte39, this.anInt860 - local76);
									local76 += 25;
								}
							}
						}
						if (local12 >= 0 && this.anInt867 == 10 && this.anInt868 == this.anIntArray227[local12]) {
							this.method678(local19, local19.anInt430 + 15);
							if (this.anInt859 > -1) {
								this.aClass1_Sub1_Sub2_Sub4Array6[1].method473(this.anInt859 - 12, this.aByte39, this.anInt860 - local76);
							}
						}
					}
					if (local19.aString6 != null && (local12 >= this.anInt905 || this.anInt926 == 0 || this.anInt926 == 3 || this.anInt926 == 1 && this.method667(((Class1_Sub1_Sub1_Sub3_Sub2) local19).aString7))) {
						this.method678(local19, local19.anInt430);
						if (this.anInt859 > -1 && this.anInt877 < this.anInt878) {
							this.anIntArray218[this.anInt877] = this.aClass1_Sub1_Sub2_Sub1_4.method110(local19.aString6) / 2;
							this.anIntArray217[this.anInt877] = this.aClass1_Sub1_Sub2_Sub1_4.anInt102;
							this.anIntArray215[this.anInt877] = this.anInt859;
							this.anIntArray216[this.anInt877] = this.anInt860;
							this.anIntArray219[this.anInt877] = local19.anInt392;
							this.anIntArray220[this.anInt877] = local19.anInt415;
							this.anIntArray221[this.anInt877] = local19.anInt397;
							this.aStringArray9[this.anInt877++] = local19.aString6;
							if (this.anInt1003 == 0 && local19.anInt415 >= 1 && local19.anInt415 <= 3) {
								this.anIntArray217[this.anInt877] += 10;
								this.anIntArray216[this.anInt877] += 5;
							}
							if (this.anInt1003 == 0 && local19.anInt415 == 4) {
								this.anIntArray218[this.anInt877] = 60;
							}
							if (this.anInt1003 == 0 && local19.anInt415 == 5) {
								this.anIntArray217[this.anInt877] += 5;
							}
						}
					}
					if (local19.anInt431 > anInt1011) {
						this.method678(local19, local19.anInt430 + 15);
						if (this.anInt859 > -1) {
							local76 = local19.anInt432 * 30 / local19.anInt433;
							if (local76 > 30) {
								local76 = 30;
							}
							Class1_Sub1_Sub2.method461(local76, this.anInt859 - 15, 5, 65280, this.anInt860 - 3);
							Class1_Sub1_Sub2.method461(30 - local76, this.anInt859 - 15 + local76, 5, 16711680, this.anInt860 - 3);
						}
					}
					for (local76 = 0; local76 < 4; local76++) {
						if (local19.anIntArray126[local76] > anInt1011) {
							this.method678(local19, local19.anInt430 / 2);
							if (this.anInt859 > -1) {
								if (local76 == 1) {
									this.anInt860 -= 20;
								}
								if (local76 == 2) {
									this.anInt859 -= 15;
									this.anInt860 -= 10;
								}
								if (local76 == 3) {
									this.anInt859 += 15;
									this.anInt860 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub4Array4[local19.anIntArray125[local76]].method473(this.anInt859 - 12, this.aByte39, this.anInt860 - 12);
								this.aClass1_Sub1_Sub2_Sub1_2.method107(0, this.anInt859, this.anInt860 + 4, String.valueOf(local19.anIntArray124[local76]));
								this.aClass1_Sub1_Sub2_Sub1_2.method107(16777215, this.anInt859 - 1, this.anInt860 + 3, String.valueOf(local19.anIntArray124[local76]));
							}
						}
					}
				}
			}
			for (@Pc(622) int local622 = 0; local622 < this.anInt877; local622++) {
				local76 = this.anIntArray215[local622];
				@Pc(634) int local634 = this.anIntArray216[local622];
				@Pc(639) int local639 = this.anIntArray218[local622];
				@Pc(644) int local644 = this.anIntArray217[local622];
				@Pc(646) boolean local646 = true;
				while (local646) {
					local646 = false;
					for (@Pc(652) int local652 = 0; local652 < local622; local652++) {
						if (local634 + 2 > this.anIntArray216[local652] - this.anIntArray217[local652] && local634 - local644 < this.anIntArray216[local652] + 2 && local76 - local639 < this.anIntArray215[local652] + this.anIntArray218[local652] && local76 + local639 > this.anIntArray215[local652] - this.anIntArray218[local652] && this.anIntArray216[local652] - this.anIntArray217[local652] < local634) {
							local634 = this.anIntArray216[local652] - this.anIntArray217[local652];
							local646 = true;
						}
					}
				}
				this.anInt859 = this.anIntArray215[local622];
				this.anInt860 = this.anIntArray216[local622] = local634;
				@Pc(751) String local751 = this.aStringArray9[local622];
				if (this.anInt1003 == 0) {
					@Pc(756) int local756 = 16776960;
					if (this.anIntArray219[local622] < 6) {
						local756 = this.anIntArray226[this.anIntArray219[local622]];
					}
					if (this.anIntArray219[local622] == 6) {
						local756 = this.anInt870 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray219[local622] == 7) {
						local756 = this.anInt870 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray219[local622] == 8) {
						local756 = this.anInt870 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(831) int local831;
					if (this.anIntArray219[local622] == 9) {
						local831 = 150 - this.anIntArray221[local622];
						if (local831 < 50) {
							local756 = local831 * 1280 + 16711680;
						} else if (local831 < 100) {
							local756 = 16776960 - (local831 - 50) * 327680;
						} else if (local831 < 150) {
							local756 = (local831 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray219[local622] == 10) {
						local831 = 150 - this.anIntArray221[local622];
						if (local831 < 50) {
							local756 = local831 * 5 + 16711680;
						} else if (local831 < 100) {
							local756 = 16711935 - (local831 - 50) * 327680;
						} else if (local831 < 150) {
							local756 = (local831 - 100) * 327680 + 255 - (local831 - 100) * 5;
						}
					}
					if (this.anIntArray219[local622] == 11) {
						local831 = 150 - this.anIntArray221[local622];
						if (local831 < 50) {
							local756 = 16777215 - local831 * 327685;
						} else if (local831 < 100) {
							local756 = (local831 - 50) * 327685 + 65280;
						} else if (local831 < 150) {
							local756 = 16777215 - (local831 - 100) * 327680;
						}
					}
					if (this.anIntArray220[local622] == 0) {
						this.aClass1_Sub1_Sub2_Sub1_4.method107(0, this.anInt859, this.anInt860 + 1, local751);
						this.aClass1_Sub1_Sub2_Sub1_4.method107(local756, this.anInt859, this.anInt860, local751);
					}
					if (this.anIntArray220[local622] == 1) {
						this.aClass1_Sub1_Sub2_Sub1_4.method112(this.anInt859, this.anInt870, 0, local751, this.anInt860 + 1);
						this.aClass1_Sub1_Sub2_Sub1_4.method112(this.anInt859, this.anInt870, local756, local751, this.anInt860);
					}
					if (this.anIntArray220[local622] == 2) {
						this.aClass1_Sub1_Sub2_Sub1_4.method113(this.anInt870, this.anInt859, 0, this.anInt860 + 1, local751);
						this.aClass1_Sub1_Sub2_Sub1_4.method113(this.anInt870, this.anInt859, local756, this.anInt860, local751);
					}
					if (this.anIntArray220[local622] == 3) {
						this.aClass1_Sub1_Sub2_Sub1_4.method114(0, this.anInt859, this.anInt860 + 1, this.anInt870, 150 - this.anIntArray221[local622], this.anInt977, local751);
						this.aClass1_Sub1_Sub2_Sub1_4.method114(local756, this.anInt859, this.anInt860, this.anInt870, 150 - this.anIntArray221[local622], this.anInt977, local751);
					}
					@Pc(1130) int local1130;
					if (this.anIntArray220[local622] == 4) {
						local831 = this.aClass1_Sub1_Sub2_Sub1_4.method110(local751);
						local1130 = (150 - this.anIntArray221[local622]) * (local831 + 100) / 150;
						Class1_Sub1_Sub2.method458(0, 334, this.anInt859 + 50, this.anInt859 - 50);
						this.aClass1_Sub1_Sub2_Sub1_4.method111(this.anInt859 + 50 - local1130, 0, local751, this.anInt860 + 1);
						this.aClass1_Sub1_Sub2_Sub1_4.method111(this.anInt859 + 50 - local1130, local756, local751, this.anInt860);
						Class1_Sub1_Sub2.method457();
					}
					if (this.anIntArray220[local622] == 5) {
						local831 = 150 - this.anIntArray221[local622];
						local1130 = 0;
						if (local831 < 25) {
							local1130 = local831 - 25;
						} else if (local831 > 125) {
							local1130 = local831 - 125;
						}
						Class1_Sub1_Sub2.method458(this.anInt860 - this.aClass1_Sub1_Sub2_Sub1_4.anInt102 - 1, this.anInt860 + 5, 512, 0);
						this.aClass1_Sub1_Sub2_Sub1_4.method107(0, this.anInt859, this.anInt860 + local1130 + 1, local751);
						this.aClass1_Sub1_Sub2_Sub1_4.method107(local756, this.anInt859, this.anInt860 + local1130, local751);
						Class1_Sub1_Sub2.method457();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub1_4.method107(0, this.anInt859, this.anInt860 + 1, local751);
					this.aClass1_Sub1_Sub2_Sub1_4.method107(16776960, this.anInt859, this.anInt860, local751);
				}
			}
		} catch (@Pc(1280) RuntimeException local1280) {
			signlink.reporterror("4114, " + false + ", " + local1280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method579() {
		this.method586("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt841 = 5;
		}
		if (aBoolean218) {
			this.aBoolean224 = true;
			return;
		}
		aBoolean218 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method589();
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
			this.aBoolean248 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				this.aClass20Array1[local101] = new Class20(signlink.aRandomAccessFileArray1[local101], 500000, signlink.aRandomAccessFile3, true, local101 + 1);
			}
		}
		try {
			this.method671();
			this.aClass38_2 = this.method680(1, 25, this.anIntArray212[1], "title screen", "title");
			this.aClass1_Sub1_Sub2_Sub1_2 = new Class1_Sub1_Sub2_Sub1(false, "p11_full", false, this.aClass38_2);
			this.aClass1_Sub1_Sub2_Sub1_3 = new Class1_Sub1_Sub2_Sub1(false, "p12_full", false, this.aClass38_2);
			this.aClass1_Sub1_Sub2_Sub1_4 = new Class1_Sub1_Sub2_Sub1(false, "b12_full", false, this.aClass38_2);
			this.aClass1_Sub1_Sub2_Sub1_5 = new Class1_Sub1_Sub2_Sub1(true, "q8_full", false, this.aClass38_2);
			this.method651();
			this.method631();
			@Pc(197) Class38 local197 = this.method680(2, 30, this.anIntArray212[2], "config", "config");
			@Pc(209) Class38 local209 = this.method680(3, 35, this.anIntArray212[3], "interface", "interface");
			@Pc(221) Class38 local221 = this.method680(4, 40, this.anIntArray212[4], "2d graphics", "media");
			@Pc(233) Class38 local233 = this.method680(6, 45, this.anIntArray212[6], "textures", "textures");
			@Pc(245) Class38 local245 = this.method680(7, 50, this.anIntArray212[7], "chat system", "wordenc");
			@Pc(257) Class38 local257 = this.method680(8, 55, this.anIntArray212[8], "sound effects", "sounds");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass35_1 = new Class35(anInt922, 104, this.anIntArrayArrayArray8, 104, 4);
			for (@Pc(282) int local282 = 0; local282 < 4; local282++) {
				this.aClass40Array1[local282] = new Class40(104, -266, 104);
			}
			this.aClass1_Sub1_Sub2_Sub4_7 = new Class1_Sub1_Sub2_Sub4(512, 512);
			@Pc(317) Class38 local317 = this.method680(5, 60, this.anIntArray212[5], "update list", "versionlist");
			this.method586("Connecting to update server", 60);
			this.aClass36_Sub1_1 = new Class36_Sub1();
			this.aClass36_Sub1_1.method499(local317, this);
			Class31.method384(this.aClass36_Sub1_1.method504((byte) 4));
			Class1_Sub1_Sub1_Sub2.method140(this.aClass36_Sub1_1.method509(0), this.aClass36_Sub1_1);
			if (!aBoolean228) {
				this.anInt1046 = 0;
				this.aBoolean255 = true;
				this.aClass36_Sub1_1.method507(2, this.anInt1046);
				while (this.aClass36_Sub1_1.method497() > 0) {
					this.method699();
					try {
						Thread.sleep(100L);
					} catch (@Pc(368) Exception local368) {
					}
					if (this.aClass36_Sub1_1.anInt697 > 3) {
						this.method659("ondemand");
						return;
					}
				}
			}
			this.method586("Requesting animations", 65);
			@Pc(392) int local392 = this.aClass36_Sub1_1.method509(1);
			for (@Pc(394) int local394 = 0; local394 < local392; local394++) {
				this.aClass36_Sub1_1.method507(1, local394);
			}
			@Pc(412) int local412;
			while (this.aClass36_Sub1_1.method497() > 0) {
				local412 = local392 - this.aClass36_Sub1_1.method497();
				if (local412 > 0) {
					this.method586("Loading animations - " + local412 * 100 / local392 + "%", 65);
				}
				this.method699();
				try {
					Thread.sleep(100L);
				} catch (@Pc(438) Exception local438) {
				}
				if (this.aClass36_Sub1_1.anInt697 > 3) {
					this.method659("ondemand");
					return;
				}
			}
			this.method586("Requesting models", 70);
			local392 = this.aClass36_Sub1_1.method509(0);
			@Pc(472) int local472;
			for (local412 = 0; local412 < local392; local412++) {
				local472 = this.aClass36_Sub1_1.method502(local412);
				if ((local472 & 0x1) != 0) {
					this.aClass36_Sub1_1.method507(0, local412);
				}
			}
			local392 = this.aClass36_Sub1_1.method497();
			while (this.aClass36_Sub1_1.method497() > 0) {
				local472 = local392 - this.aClass36_Sub1_1.method497();
				if (local472 > 0) {
					this.method586("Loading models - " + local472 * 100 / local392 + "%", 70);
				}
				this.method699();
				try {
					Thread.sleep(100L);
				} catch (@Pc(523) Exception local523) {
				}
			}
			if (this.aClass20Array1[0] != null) {
				this.method586("Requesting maps", 75);
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(47, 0, 48));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(47, 1, 48));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(48, 0, 48));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(48, 1, 48));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(49, 0, 48));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(49, 1, 48));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(47, 0, 47));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(47, 1, 47));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(48, 0, 47));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(48, 1, 47));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(48, 0, 148));
				this.aClass36_Sub1_1.method507(3, this.aClass36_Sub1_1.method505(48, 1, 148));
				local392 = this.aClass36_Sub1_1.method497();
				while (this.aClass36_Sub1_1.method497() > 0) {
					local472 = local392 - this.aClass36_Sub1_1.method497();
					if (local472 > 0) {
						this.method586("Loading maps - " + local472 * 100 / local392 + "%", 75);
					}
					this.method699();
					try {
						Thread.sleep(100L);
					} catch (@Pc(708) Exception local708) {
					}
				}
			}
			local392 = this.aClass36_Sub1_1.method509(0);
			@Pc(729) int local729;
			for (local472 = 0; local472 < local392; local472++) {
				local729 = this.aClass36_Sub1_1.method502(local472);
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
					this.aClass36_Sub1_1.method494(local731, local472, 0);
				}
			}
			this.aClass36_Sub1_1.method500(aBoolean227);
			if (!aBoolean228) {
				local392 = this.aClass36_Sub1_1.method509(2);
				for (local729 = 1; local729 < local392; local729++) {
					if (this.aClass36_Sub1_1.method493(local729)) {
						this.aClass36_Sub1_1.method494((byte) 1, local729, 2);
					}
				}
			}
			this.method586("Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local221, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local221, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local221, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local221, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local221, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local221, "backhmid1", 0);
			for (local729 = 0; local729 < 13; local729++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local729] = new Class1_Sub1_Sub2_Sub3(local221, "sideicons", local729);
			}
			this.aClass1_Sub1_Sub2_Sub4_10 = new Class1_Sub1_Sub2_Sub4(local221, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(local221, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub4_4.method470();
			for (@Pc(931) int local931 = 0; local931 < 72; local931++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local931] = new Class1_Sub1_Sub2_Sub3(local221, "mapscene", local931);
			}
			for (@Pc(949) int local949 = 0; local949 < 63; local949++) {
				this.aClass1_Sub1_Sub2_Sub4Array8[local949] = new Class1_Sub1_Sub2_Sub4(local221, "mapfunction", local949);
			}
			for (@Pc(967) int local967 = 0; local967 < 5; local967++) {
				this.aClass1_Sub1_Sub2_Sub4Array4[local967] = new Class1_Sub1_Sub2_Sub4(local221, "hitmarks", local967);
			}
			for (@Pc(985) int local985 = 0; local985 < 6; local985++) {
				this.aClass1_Sub1_Sub2_Sub4Array5[local985] = new Class1_Sub1_Sub2_Sub4(local221, "headicons_pk", local985);
			}
			for (@Pc(1003) int local1003 = 0; local1003 < 9; local1003++) {
				this.aClass1_Sub1_Sub2_Sub4Array9[local1003] = new Class1_Sub1_Sub2_Sub4(local221, "headicons_prayer", local1003);
			}
			for (@Pc(1021) int local1021 = 0; local1021 < 6; local1021++) {
				this.aClass1_Sub1_Sub2_Sub4Array6[local1021] = new Class1_Sub1_Sub2_Sub4(local221, "headicons_hint", local1021);
			}
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(local221, "overlay_multiway", 0);
			this.aClass1_Sub1_Sub2_Sub4_5 = new Class1_Sub1_Sub2_Sub4(local221, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub4_6 = new Class1_Sub1_Sub2_Sub4(local221, "mapmarker", 1);
			for (@Pc(1063) int local1063 = 0; local1063 < 8; local1063++) {
				this.aClass1_Sub1_Sub2_Sub4Array10[local1063] = new Class1_Sub1_Sub2_Sub4(local221, "cross", local1063);
			}
			this.aClass1_Sub1_Sub2_Sub4_13 = new Class1_Sub1_Sub2_Sub4(local221, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub4_14 = new Class1_Sub1_Sub2_Sub4(local221, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub4_15 = new Class1_Sub1_Sub2_Sub4(local221, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub4_16 = new Class1_Sub1_Sub2_Sub4(local221, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub4_17 = new Class1_Sub1_Sub2_Sub4(local221, "mapdots", 4);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local221, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local221, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local221, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_9.method368();
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_10.method368();
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method369((byte) 6);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method369((byte) 6);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local221, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_18.method369((byte) 6);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_19.method368();
			this.aClass1_Sub1_Sub2_Sub3_19.method369((byte) 6);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_20.method368();
			this.aClass1_Sub1_Sub2_Sub3_20.method369((byte) 6);
			for (@Pc(1253) int local1253 = 0; local1253 < 2; local1253++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local1253] = new Class1_Sub1_Sub2_Sub3(local221, "mod_icons", local1253);
			}
			@Pc(1276) Class1_Sub1_Sub2_Sub4 local1276 = new Class1_Sub1_Sub2_Sub4(local221, "backleft1", 0);
			this.aClass17_6 = new Class17(this.method584(), local1276.anInt666, (byte) 0, local1276.anInt667);
			local1276.method471(0, 0);
			@Pc(1301) Class1_Sub1_Sub2_Sub4 local1301 = new Class1_Sub1_Sub2_Sub4(local221, "backleft2", 0);
			this.aClass17_7 = new Class17(this.method584(), local1301.anInt666, (byte) 0, local1301.anInt667);
			local1301.method471(0, 0);
			@Pc(1326) Class1_Sub1_Sub2_Sub4 local1326 = new Class1_Sub1_Sub2_Sub4(local221, "backright1", 0);
			this.aClass17_8 = new Class17(this.method584(), local1326.anInt666, (byte) 0, local1326.anInt667);
			local1326.method471(0, 0);
			@Pc(1351) Class1_Sub1_Sub2_Sub4 local1351 = new Class1_Sub1_Sub2_Sub4(local221, "backright2", 0);
			this.aClass17_9 = new Class17(this.method584(), local1351.anInt666, (byte) 0, local1351.anInt667);
			local1351.method471(0, 0);
			@Pc(1376) Class1_Sub1_Sub2_Sub4 local1376 = new Class1_Sub1_Sub2_Sub4(local221, "backtop1", 0);
			this.aClass17_10 = new Class17(this.method584(), local1376.anInt666, (byte) 0, local1376.anInt667);
			local1376.method471(0, 0);
			@Pc(1401) Class1_Sub1_Sub2_Sub4 local1401 = new Class1_Sub1_Sub2_Sub4(local221, "backvmid1", 0);
			this.aClass17_11 = new Class17(this.method584(), local1401.anInt666, (byte) 0, local1401.anInt667);
			local1401.method471(0, 0);
			@Pc(1426) Class1_Sub1_Sub2_Sub4 local1426 = new Class1_Sub1_Sub2_Sub4(local221, "backvmid2", 0);
			this.aClass17_12 = new Class17(this.method584(), local1426.anInt666, (byte) 0, local1426.anInt667);
			local1426.method471(0, 0);
			@Pc(1451) Class1_Sub1_Sub2_Sub4 local1451 = new Class1_Sub1_Sub2_Sub4(local221, "backvmid3", 0);
			this.aClass17_13 = new Class17(this.method584(), local1451.anInt666, (byte) 0, local1451.anInt667);
			local1451.method471(0, 0);
			@Pc(1476) Class1_Sub1_Sub2_Sub4 local1476 = new Class1_Sub1_Sub2_Sub4(local221, "backhmid2", 0);
			this.aClass17_14 = new Class17(this.method584(), local1476.anInt666, (byte) 0, local1476.anInt667);
			local1476.method471(0, 0);
			@Pc(1501) int local1501 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1524) int local1524 = 0; local1524 < 100; local1524++) {
				if (this.aClass1_Sub1_Sub2_Sub4Array8[local1524] != null) {
					this.aClass1_Sub1_Sub2_Sub4Array8[local1524].method469(local1508 + local1522, local1501 + local1522, local1515 + local1522);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array2[local1524] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local1524].method370(local1508 + local1522, local1501 + local1522, local1515 + local1522);
				}
			}
			this.method586("Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub2.method340(local233);
			Class1_Sub1_Sub2_Sub2.method344(0.8D);
			Class1_Sub1_Sub2_Sub2.method339();
			this.method586("Unpacking config", 86);
			Class46.method549(local197);
			Class48.method564(local197);
			Class14.method178(local197);
			Class23.method250(local197);
			Class37.method487(local197);
			Class6.method35(local197);
			Class18.method232(local197);
			Class4.method19(local197);
			Class30.method382(local197);
			Class23.aBoolean73 = aBoolean227;
			if (!aBoolean228) {
				this.method586("Unpacking sounds", 90);
				@Pc(1627) byte[] local1627 = local257.method512("sounds.dat", null);
				@Pc(1633) Class1_Sub1_Sub3 local1633 = new Class1_Sub1_Sub3(local1627, anInt972);
				Class3.method13(local1633);
			}
			this.method586("Unpacking interfaces", 95);
			@Pc(1664) Class1_Sub1_Sub2_Sub1[] local1664 = new Class1_Sub1_Sub2_Sub1[] { this.aClass1_Sub1_Sub2_Sub1_2, this.aClass1_Sub1_Sub2_Sub1_3, this.aClass1_Sub1_Sub2_Sub1_4, this.aClass1_Sub1_Sub2_Sub1_5 };
			Class44.method543(local221, local209, local1664);
			this.method586("Preparing game engine", 100);
			@Pc(1680) int local1680;
			@Pc(1682) int local1682;
			@Pc(1684) int local1684;
			for (@Pc(1676) int local1676 = 0; local1676 < 33; local1676++) {
				local1680 = 999;
				local1682 = 0;
				for (local1684 = 0; local1684 < 34; local1684++) {
					if (this.aClass1_Sub1_Sub2_Sub3_4.aByteArray12[local1684 + local1676 * this.aClass1_Sub1_Sub2_Sub3_4.anInt522] == 0) {
						if (local1680 == 999) {
							local1680 = local1684;
						}
					} else if (local1680 != 999) {
						local1682 = local1684;
						break;
					}
				}
				this.anIntArray274[local1676] = local1680;
				this.anIntArray270[local1676] = local1682 - local1680;
			}
			@Pc(1742) int local1742;
			for (local1680 = 5; local1680 < 156; local1680++) {
				local1682 = 999;
				local1684 = 0;
				for (local1742 = 25; local1742 < 172; local1742++) {
					if (this.aClass1_Sub1_Sub2_Sub3_4.aByteArray12[local1742 + local1680 * this.aClass1_Sub1_Sub2_Sub3_4.anInt522] == 0 && (local1742 > 34 || local1680 > 34)) {
						if (local1682 == 999) {
							local1682 = local1742;
						}
					} else if (local1682 != 999) {
						local1684 = local1742;
						break;
					}
				}
				this.anIntArray223[local1680 - 5] = local1682 - 25;
				this.anIntArray244[local1680 - 5] = local1684 - local1682;
			}
			Class1_Sub1_Sub2_Sub2.method337(765, 503);
			this.anIntArray266 = Class1_Sub1_Sub2_Sub2.anIntArray140;
			Class1_Sub1_Sub2_Sub2.method337(479, 96);
			this.anIntArray263 = Class1_Sub1_Sub2_Sub2.anIntArray140;
			Class1_Sub1_Sub2_Sub2.method337(190, 261);
			this.anIntArray264 = Class1_Sub1_Sub2_Sub2.anIntArray140;
			Class1_Sub1_Sub2_Sub2.method337(512, 334);
			this.anIntArray265 = Class1_Sub1_Sub2_Sub2.anIntArray140;
			@Pc(1833) int[] local1833 = new int[9];
			for (local1684 = 0; local1684 < 9; local1684++) {
				local1742 = local1684 * 32 + 128 + 15;
				@Pc(1851) int local1851 = local1742 * 3 + 600;
				@Pc(1855) int local1855 = Class1_Sub1_Sub2_Sub2.anIntArray138[local1742];
				local1833[local1684] = local1851 * local1855 >> 16;
			}
			Class35.method432(anInt989, local1833);
			Class25.method270(local245);
			this.aClass47_1 = new Class47(anInt990, this);
			this.method585(this.aClass47_1, 10);
			Class1_Sub1_Sub1_Sub1.aClient1 = this;
			Class48.aClient5 = this;
			Class37.aClient2 = this;
		} catch (@Pc(1896) Exception local1896) {
			signlink.reporterror("loaderror " + this.aString29 + " " + this.anInt1026);
			this.aBoolean244 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!WJQTPVDG;)Z")
	private boolean method721(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class44 arg1) {
		try {
			if (arg0) {
				this.method579();
			}
			@Pc(8) int local8 = arg1.anInt730;
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
				this.aStringArray8[this.anInt986] = "Remove @whi@" + this.aStringArray10[local8];
				this.anIntArray237[this.anInt986] = 804;
				this.anInt986++;
				this.aStringArray8[this.anInt986] = "Message @whi@" + this.aStringArray10[local8];
				this.anIntArray237[this.anInt986] = 847;
				this.anInt986++;
				return true;
			} else if (local8 >= 401 && local8 <= 500) {
				this.aStringArray8[this.anInt986] = "Remove @whi@" + arg1.aString12;
				this.anIntArray237[this.anInt986] = 510;
				this.anInt986++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("44547, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!CMGGUSPR;B)V")
	private void method722(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) byte arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt906; local3++) {
				@Pc(10) int local10 = this.anIntArray228[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub3_Sub1 local15 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local10];
				@Pc(18) int local18 = arg1.method55();
				@Pc(26) int local26;
				@Pc(35) int local35;
				if ((local18 & 0x20) != 0) {
					local26 = arg1.method83();
					if (local26 == 65535) {
						local26 = -1;
					}
					local35 = arg1.method75();
					if (local26 == local15.anInt419 && local26 != -1) {
						@Pc(47) int local47 = Class46.aClass46Array1[local26].anInt779;
						if (local47 == 1) {
							local15.anInt420 = 0;
							local15.anInt421 = 0;
							local15.anInt422 = local35;
							local15.anInt423 = 0;
						}
						if (local47 == 2) {
							local15.anInt423 = 0;
						}
					} else if (local26 == -1 || local15.anInt419 == -1 || Class46.aClass46Array1[local26].anInt773 >= Class46.aClass46Array1[local15.anInt419].anInt773) {
						local15.anInt419 = local26;
						local15.anInt420 = 0;
						local15.anInt421 = 0;
						local15.anInt422 = local35;
						local15.anInt423 = 0;
						local15.anInt438 = local15.anInt428;
					}
				}
				if ((local18 & 0x1) != 0) {
					local26 = arg1.method55();
					local35 = arg1.method73();
					local15.method263(anInt1011, (byte) 5, local35, local26);
					local15.anInt431 = anInt1011 + 300;
					local15.anInt432 = arg1.method55();
					local15.anInt433 = arg1.method74((byte) 7);
				}
				if ((local18 & 0x8) != 0) {
					local15.aClass37_1 = Class37.method483(arg1.method57());
					local15.anInt427 = local15.aClass37_1.aByte17;
					local15.anInt434 = local15.aClass37_1.anInt673;
					local15.anInt393 = local15.aClass37_1.anInt676;
					local15.anInt394 = local15.aClass37_1.anInt685;
					local15.anInt395 = local15.aClass37_1.anInt677;
					local15.anInt396 = local15.aClass37_1.anInt686;
					local15.anInt411 = local15.aClass37_1.anInt691;
				}
				if ((local18 & 0x4) != 0) {
					local26 = arg1.method74((byte) 7);
					local35 = arg1.method74((byte) 7);
					local15.method263(anInt1011, (byte) 5, local35, local26);
					local15.anInt431 = anInt1011 + 300;
					local15.anInt432 = arg1.method75();
					local15.anInt433 = arg1.method73();
				}
				if ((local18 & 0x2) != 0) {
					local15.anInt398 = arg1.method57();
					local26 = arg1.method89(anInt975);
					local15.anInt402 = local26 >> 16;
					local15.anInt401 = anInt1011 + (local26 & 0xFFFF);
					local15.anInt399 = 0;
					local15.anInt400 = 0;
					if (local15.anInt401 > anInt1011) {
						local15.anInt399 = -1;
					}
					if (local15.anInt398 == 65535) {
						local15.anInt398 = -1;
					}
				}
				if ((local18 & 0x80) != 0) {
					local15.aString6 = arg1.method62();
					local15.anInt397 = 100;
				}
				if ((local18 & 0x40) != 0) {
					local15.anInt435 = arg1.method83();
					local15.anInt436 = arg1.method82();
				}
				if ((local18 & 0x10) != 0) {
					local15.anInt414 = arg1.method84();
					if (local15.anInt414 == 65535) {
						local15.anInt414 = -1;
					}
				}
			}
			if (arg2 != 25) {
				this.aBoolean230 = !this.aBoolean230;
			}
		} catch (@Pc(317) RuntimeException local317) {
			signlink.reporterror("98851, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local317.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method724() {
		try {
			if (this.anInt1019 > 1) {
				this.anInt1019--;
			}
			if (this.anInt1080 > 0) {
				this.anInt1080--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method629(); local22++) {
			}
			if (this.aBoolean213) {
				@Pc(41) Object local41 = this.aClass47_1.anObject1;
				@Pc(67) int local67;
				@Pc(69) int local69;
				@Pc(71) int local71;
				@Pc(104) int local104;
				synchronized (this.aClass47_1.anObject1) {
					if (!aBoolean240) {
						this.aClass47_1.anInt794 = 0;
					} else if (super.anInt852 != 0 || this.aClass47_1.anInt794 >= 40) {
						this.aClass1_Sub1_Sub3_9.method44(164, this.anInt902);
						this.aClass1_Sub1_Sub3_9.method45(0);
						local67 = this.aClass1_Sub1_Sub3_9.anInt78;
						local69 = 0;
						@Pc(87) int local87;
						for (local71 = 0; local71 < this.aClass47_1.anInt794 && local67 - this.aClass1_Sub1_Sub3_9.anInt78 < 240; local71++) {
							local69++;
							local87 = this.aClass47_1.anIntArray202[local71];
							if (local87 < 0) {
								local87 = 0;
							} else if (local87 > 502) {
								local87 = 502;
							}
							local104 = this.aClass47_1.anIntArray203[local71];
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 > 764) {
								local104 = 764;
							}
							@Pc(121) int local121 = local87 * 765 + local104;
							if (this.aClass47_1.anIntArray202[local71] == -1 && this.aClass47_1.anIntArray203[local71] == -1) {
								local104 = -1;
								local87 = -1;
								local121 = 524287;
							}
							if (local104 != this.anInt992 || local87 != this.anInt993) {
								@Pc(166) int local166 = local104 - this.anInt992;
								this.anInt992 = local104;
								@Pc(174) int local174 = local87 - this.anInt993;
								this.anInt993 = local87;
								if (this.anInt1064 < 8 && local166 >= -32 && local166 <= 31 && local174 >= -32 && local174 <= 31) {
									local166 += 32;
									local174 += 32;
									this.aClass1_Sub1_Sub3_9.method46((this.anInt1064 << 12) + (local166 << 6) + local174);
									this.anInt1064 = 0;
								} else if (this.anInt1064 < 8) {
									this.aClass1_Sub1_Sub3_9.method48((this.anInt1064 << 19) + local121 + 8388608);
									this.anInt1064 = 0;
								} else {
									this.aClass1_Sub1_Sub3_9.method49((this.anInt1064 << 19) + local121 - 1073741824);
									this.anInt1064 = 0;
								}
							} else if (this.anInt1064 < 2047) {
								this.anInt1064++;
							}
						}
						this.aClass1_Sub1_Sub3_9.method54(this.aClass1_Sub1_Sub3_9.anInt78 - local67);
						if (local69 >= this.aClass47_1.anInt794) {
							this.aClass47_1.anInt794 = 0;
						} else {
							this.aClass47_1.anInt794 -= local69;
							for (local87 = 0; local87 < this.aClass47_1.anInt794; local87++) {
								this.aClass47_1.anIntArray203[local87] = this.aClass47_1.anIntArray203[local87 + local69];
								this.aClass47_1.anIntArray202[local87] = this.aClass47_1.anIntArray202[local87 + local69];
							}
						}
					}
				}
				if (super.anInt852 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong32) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong32 = super.aLong28;
					local67 = super.anInt854;
					if (local67 < 0) {
						local67 = 0;
					} else if (local67 > 502) {
						local67 = 502;
					}
					local69 = super.anInt853;
					if (local69 < 0) {
						local69 = 0;
					} else if (local69 > 764) {
						local69 = 764;
					}
					local71 = local67 * 765 + local69;
					@Pc(382) byte local382 = 0;
					if (super.anInt852 == 2) {
						local382 = 1;
					}
					local104 = (int) local336;
					this.aClass1_Sub1_Sub3_9.method44(183, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method87((local104 << 20) + (local382 << 19) + local71);
				}
				if (this.anInt1023 > 0) {
					this.anInt1023--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean250 = true;
				}
				if (this.aBoolean250 && this.anInt1023 <= 0) {
					this.anInt1023 = 20;
					this.aBoolean250 = false;
					this.aClass1_Sub1_Sub3_9.method44(193, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method80(this.anInt982);
					this.aClass1_Sub1_Sub3_9.method79(this.anInt983);
				}
				if (super.aBoolean211 && !this.aBoolean236) {
					this.aBoolean236 = true;
					this.aClass1_Sub1_Sub3_9.method44(133, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method45(1);
				}
				if (!super.aBoolean211 && this.aBoolean236) {
					this.aBoolean236 = false;
					this.aClass1_Sub1_Sub3_9.method44(133, this.anInt902);
					this.aClass1_Sub1_Sub3_9.method45(0);
				}
				this.method592();
				this.method598();
				this.method706();
				this.anInt1078++;
				if (this.anInt1078 > 750) {
					this.method690();
				}
				this.method686();
				this.method619();
				this.method704((byte) 7);
				this.anInt917++;
				if (this.anInt1058 != 0) {
					this.anInt1057 += 20;
					if (this.anInt1057 >= 400) {
						this.anInt1058 = 0;
					}
				}
				if (this.anInt1054 != 0) {
					this.anInt1051++;
					if (this.anInt1051 >= 15) {
						if (this.anInt1054 == 2) {
							this.aBoolean245 = true;
						}
						if (this.anInt1054 == 3) {
							this.aBoolean256 = true;
						}
						this.anInt1054 = 0;
					}
				}
				if (this.anInt1061 != 0) {
					this.anInt907++;
					if (super.anInt847 > this.anInt1062 + 5 || super.anInt847 < this.anInt1062 - 5 || super.anInt848 > this.anInt1063 + 5 || super.anInt848 < this.anInt1063 - 5) {
						this.aBoolean253 = true;
					}
					if (super.anInt846 == 0) {
						if (this.anInt1061 == 2) {
							this.aBoolean245 = true;
						}
						if (this.anInt1061 == 3) {
							this.aBoolean256 = true;
						}
						this.anInt1061 = 0;
						if (this.aBoolean253 && this.anInt907 >= 5) {
							this.anInt979 = -1;
							this.method711((byte) 8);
							if (this.anInt979 == this.anInt1059 && this.anInt978 != this.anInt1060) {
								@Pc(688) Class44 local688 = Class44.method544(this.anInt1059);
								@Pc(690) byte local690 = 0;
								if (this.anInt1045 == 1 && local688.anInt730 == 206) {
									local690 = 1;
								}
								if (local688.anIntArray192[this.anInt978] <= 0) {
									local690 = 0;
								}
								if (local688.aBoolean171) {
									local67 = this.anInt1060;
									local69 = this.anInt978;
									local688.anIntArray192[local69] = local688.anIntArray192[local67];
									local688.anIntArray193[local69] = local688.anIntArray193[local67];
									local688.anIntArray192[local67] = -1;
									local688.anIntArray193[local67] = 0;
								} else if (local690 == 1) {
									local67 = this.anInt1060;
									local69 = this.anInt978;
									while (local67 != local69) {
										if (local67 > local69) {
											local688.method540(local67 - 1, local67, this.anInt1070);
											local67--;
										} else if (local67 < local69) {
											local688.method540(local67 + 1, local67, this.anInt1070);
											local67++;
										}
									}
								} else {
									local688.method540(this.anInt978, this.anInt1060, this.anInt1070);
								}
								this.aClass1_Sub1_Sub3_9.method44(135, this.anInt902);
								this.aClass1_Sub1_Sub3_9.method80(this.anInt1060);
								this.aClass1_Sub1_Sub3_9.method81(this.anInt978);
								this.aClass1_Sub1_Sub3_9.method46(this.anInt1059);
								this.aClass1_Sub1_Sub3_9.method71(local690, this.aByte38);
							}
						} else if ((this.anInt943 == 1 || this.method684(this.anInt986 - 1)) && this.anInt986 > 2) {
							this.method636((byte) 3);
						} else if (this.anInt986 > 0) {
							this.method652(this.anInt986 - 1, 254);
						}
						this.anInt1051 = 10;
						super.anInt852 = 0;
					}
				}
				@Pc(867) int local867;
				@Pc(869) int local869;
				if (Class35.anInt619 != -1) {
					local867 = Class35.anInt619;
					local869 = Class35.anInt620;
					@Pc(890) boolean local890 = this.method643(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray128[0], local867, 0, 0, 0, local869, 0, 0, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray127[0], 0, true);
					Class35.anInt619 = -1;
					if (local890) {
						this.anInt1055 = super.anInt853;
						this.anInt1056 = super.anInt854;
						this.anInt1058 = 1;
						this.anInt1057 = 0;
					}
				}
				if (super.anInt852 == 1 && this.aString17 != null) {
					this.aString17 = null;
					this.aBoolean256 = true;
					super.anInt852 = 0;
				}
				this.method687();
				if (this.anInt1090 == -1) {
					this.method645();
					this.method677();
					this.method685();
				}
				if (super.anInt846 == 1 || super.anInt852 == 1) {
					this.anInt909++;
				}
				if (this.anInt884 == 0 && this.anInt866 == 0 && this.anInt900 == 0) {
					if (this.anInt1016 > 0) {
						this.anInt1016--;
					}
				} else if (this.anInt1016 < 100) {
					this.anInt1016++;
					if (this.anInt1016 == 100) {
						if (this.anInt884 != 0) {
							this.aBoolean256 = true;
						}
						if (this.anInt866 != 0) {
							this.aBoolean245 = true;
						}
					}
				}
				if (this.anInt944 == 2) {
					this.method635((byte) 6);
				}
				if (this.anInt944 == 2 && this.aBoolean226) {
					this.method660();
				}
				for (local867 = 0; local867 < 5; local867++) {
					@Pc(1031) int local1031 = this.anIntArray258[local867]++;
				}
				this.method714();
				super.anInt845++;
				if (super.anInt845 > 4500) {
					this.anInt1080 = 250;
					super.anInt845 -= 500;
					this.aClass1_Sub1_Sub3_9.method44(47, this.anInt902);
				}
				this.anInt1018++;
				if (this.anInt1018 > 500) {
					this.anInt1018 = 0;
					local869 = (int) (Math.random() * 8.0D);
					if ((local869 & 0x1) == 1) {
						this.anInt920 += this.anInt921;
					}
					if ((local869 & 0x2) == 2) {
						this.anInt1031 += this.anInt1032;
					}
					if ((local869 & 0x4) == 4) {
						this.anInt881 += this.anInt882;
					}
				}
				if (this.anInt920 < -50) {
					this.anInt921 = 2;
				}
				if (this.anInt920 > 50) {
					this.anInt921 = -2;
				}
				if (this.anInt1031 < -55) {
					this.anInt1032 = 2;
				}
				if (this.anInt1031 > 55) {
					this.anInt1032 = -2;
				}
				if (this.anInt881 < -40) {
					this.anInt882 = 1;
				}
				if (this.anInt881 > 40) {
					this.anInt882 = -1;
				}
				this.anInt1074++;
				if (this.anInt1074 > 500) {
					this.anInt1074 = 0;
					local869 = (int) (Math.random() * 8.0D);
					if ((local869 & 0x1) == 1) {
						this.anInt941 += this.anInt942;
					}
					if ((local869 & 0x2) == 2) {
						this.anInt1008 += this.anInt1009;
					}
				}
				if (this.anInt941 < -60) {
					this.anInt942 = 2;
				}
				if (this.anInt941 > 60) {
					this.anInt942 = -2;
				}
				if (this.anInt1008 < -20) {
					this.anInt1009 = 1;
				}
				if (this.anInt1008 > 10) {
					this.anInt1009 = -1;
				}
				this.anInt1079++;
				if (this.anInt1079 > 50) {
					this.aClass1_Sub1_Sub3_9.method44(21, this.anInt902);
				}
				try {
					if (this.aClass39_1 != null && this.aClass1_Sub1_Sub3_9.anInt78 > 0) {
						this.aClass39_1.method517(this.aClass1_Sub1_Sub3_9.aByteArray8, this.aClass1_Sub1_Sub3_9.anInt78);
						this.aClass1_Sub1_Sub3_9.anInt78 = 0;
						this.anInt1079 = 0;
					}
				} catch (@Pc(1275) IOException local1275) {
					this.method690();
				} catch (@Pc(1280) Exception local1280) {
					this.method607();
				}
			}
		} catch (@Pc(1285) RuntimeException local1285) {
			signlink.reporterror("52800, " + false + ", " + local1285.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass41_11.method534();
			this.anInt1076 += 0;
			while (local6 != null) {
				if (local6.anInt187 == arg5 && local6.anInt189 == arg4 && local6.anInt190 == arg1 && local6.anInt188 == arg2) {
					local1 = local6;
					break;
				}
				local6 = (Class1_Sub2) this.aClass41_11.method536();
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt187 = arg5;
				local1.anInt188 = arg2;
				local1.anInt189 = arg4;
				local1.anInt190 = arg1;
				this.method628(local1);
				this.aClass41_11.method531(local1);
			}
			local1.anInt184 = arg0;
			local1.anInt186 = arg7;
			local1.anInt185 = arg3;
			local1.anInt179 = arg8;
			local1.anInt180 = arg6;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("47530, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean252) {
			this.method683();
		} else {
			super.run();
		}
	}
}
