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

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private static int anInt842;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private static int anInt850;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private static boolean aBoolean205;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private static int anInt893;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private static int anInt896;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private static int anInt921;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private static int anInt934;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private static int anInt939;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
	private static boolean aBoolean225;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private static int anInt963;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private static int anInt993;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private static int anInt994;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private static int anInt1020;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private static int anInt1022;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!HDYGEGXY;")
	public static Class3_Sub1_Sub1_Sub4_Sub1 aClass3_Sub1_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	public static int anInt1032;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private static boolean aBoolean243;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Z")
	private static boolean aBoolean244;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	public static int anInt1050;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private static int anInt829 = -44493;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Ljava/lang/String;")
	private static String aString22 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
	private static int[] anIntArray242 = new int[99];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	public static final int[] anIntArray243;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Z")
	private static boolean aBoolean233;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private static int anInt1031;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
	private static boolean aBoolean242;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private static int anInt1051;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!VNVHYJAS;")
	private Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!LZVLFSBA;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!TEXKPKZX;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!YVLAOVKQ;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_5;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_7;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_9;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_10;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_11;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_12;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_13;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_14;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_15;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!INOFEYKQ;")
	private Class14 aClass14_2;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_8;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_9;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2[] aClass3_Sub1_Sub2_Sub2Array3;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!IPEHOOFG;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_16;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_17;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_18;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_15;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_18;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Lclient!GCURPWTI;")
	private Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!GCURPWTI;")
	private Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Lclient!GCURPWTI;")
	private Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Lclient!GCURPWTI;")
	private Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_19;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_20;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_10;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_11;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_12;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_13;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_14;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_15;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_16;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_17;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_19;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_20;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_21;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_22;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_23;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_24;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_25;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_26;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "Lclient!VOQVBLJN;")
	private Class42 aClass42_27;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt822 = -1;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt823 = 510;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2[] aClass3_Sub1_Sub2_Sub2Array2 = new Class3_Sub1_Sub2_Sub2[13];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt825 = 9;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt826 = -1;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	private int[] anIntArray212 = new int[100];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt828 = 5233;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array4 = new Class3_Sub1_Sub2_Sub4[1000];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt845 = -427;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Z")
	private volatile boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt851 = 897;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt854 = 2;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt856 = 368;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[Lclient!XGQETHKV;")
	public Class44[] aClass44Array1 = new Class44[5];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
	private int[] anIntArray217 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	private int[] anIntArray218 = new int[50];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt862 = -1;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt863 = 4;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[I")
	private int[] anIntArray219 = new int[Class29.anInt477];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt864 = 5063219;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array5 = new Class3_Sub1_Sub2_Sub4[32];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt872 = 2301979;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt874 = 1;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt882 = 7759444;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
	private int[] anIntArray220 = new int[151];

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	public int[] anIntArray221 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt883 = -53;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt889 = 3353893;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "B")
	private byte aByte27 = 8;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt892 = 6;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt895 = -1;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt897 = -1;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[500];

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt902 = -930;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray222 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt909 = -100;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt911 = -44493;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt912 = 78;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt914 = -1;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[I")
	private int[] anIntArray223 = new int[50];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt922 = 3;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Z")
	private volatile boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[Lclient!EAREBDMK;")
	private Class5[] aClass5Array1 = new Class5[4];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "B")
	private byte aByte28 = 1;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt926 = -556;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt932 = -1;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
	private int[] anIntArray226 = new int[500];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
	private int[] anIntArray227 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	private int[] anIntArray228 = new int[500];

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[I")
	private int[] anIntArray229 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt933 = -32879;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[I")
	private int[] anIntArray232 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "[I")
	private int[] anIntArray233 = new int[256];

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt936 = -4;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt937 = 44885;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[I")
	private int[] anIntArray234 = new int[200];

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[I")
	private int[] anIntArray235 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Lclient!NHEPCMLW;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_6 = Class3_Sub1_Sub3.method262(anInt1051);

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[[[Lclient!OCPYCLUF;")
	private Class27[][][] aClass27ArrayArrayArray1 = new Class27[4][104][104];

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt941 = -15455;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray239 = new int[5];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[5];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray240 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[I")
	private int[] anIntArray241 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt967 = 1;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Z")
	private boolean aBoolean229 = true;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array6 = new Class3_Sub1_Sub2_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt969 = 2;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt971 = -1;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[I")
	private int[] anIntArray244 = new int[5];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt979 = 128;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Lclient!OCPYCLUF;")
	private Class27 aClass27_10 = new Class27((byte) 118);

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array7 = new Class3_Sub1_Sub2_Sub4[100];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt986 = -1;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!NHEPCMLW;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_7 = new Class3_Sub1_Sub3((byte) -103, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[Lclient!ZLSEKGJR;")
	private Class3_Sub1_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub1_Sub4_Sub2Array1 = new Class3_Sub1_Sub1_Sub4_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
	private int[] anIntArray245 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[I")
	private int[] anIntArray246 = new int[7];

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt992 = -867;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray247 = new int[9];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt996 = 930;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	private final int[] anIntArray248 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt998 = -1;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!NHEPCMLW;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_8 = Class3_Sub1_Sub3.method262(anInt1051);

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt1004 = -1;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt1005 = -1;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt1006 = -359;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray249 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray250 = new int[5];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt1010 = 2048;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt1011 = 2047;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[Lclient!HDYGEGXY;")
	private Class3_Sub1_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub1_Sub4_Sub1Array1 = new Class3_Sub1_Sub1_Sub4_Sub1[this.anInt1010];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[I")
	private int[] anIntArray251 = new int[this.anInt1010];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
	private int[] anIntArray252 = new int[this.anInt1010];

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[Lclient!NHEPCMLW;")
	private Class3_Sub1_Sub3[] aClass3_Sub1_Sub3Array1 = new Class3_Sub1_Sub3[this.anInt1010];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1014 = 343;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "[Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array8 = new Class3_Sub1_Sub2_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!OCPYCLUF;")
	private Class27 aClass27_11 = new Class27((byte) 118);

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "[I")
	private int[] anIntArray253 = new int[Class29.anInt477];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	public boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2[] aClass3_Sub1_Sub2_Sub2Array4 = new Class3_Sub1_Sub2_Sub2[2];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
	private int[] anIntArray255 = new int[33];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!HZINZKXF;")
	private Class13 aClass13_1 = new Class13();

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1021 = -1;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!NHEPCMLW;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_9 = Class3_Sub1_Sub3.method262(anInt1051);

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Z")
	private volatile boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[I")
	private int[] anIntArray256 = new int[33];

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
	private int[] anIntArray257 = new int[50];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private final int anInt1024 = 100;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[I")
	private int[] anIntArray258 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "B")
	private byte aByte29 = -100;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "B")
	private byte aByte30 = 52;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "[I")
	private int[] anIntArray259 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1029 = 50;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
	private int[] anIntArray260 = new int[this.anInt1029];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
	private int[] anIntArray261 = new int[this.anInt1029];

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[I")
	private int[] anIntArray262 = new int[this.anInt1029];

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private int[] anIntArray263 = new int[this.anInt1029];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
	private int[] anIntArray264 = new int[this.anInt1029];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray265 = new int[this.anInt1029];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray266 = new int[this.anInt1029];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[this.anInt1029];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
	private int[] anIntArray267 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1033 = -1;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1035 = -1;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
	private int[] anIntArray268 = new int[1000];

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[I")
	private int[] anIntArray269 = new int[1000];

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1038 = -1;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "[I")
	private int[] anIntArray270 = new int[Class29.anInt477];

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1044 = 2;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1045 = 403;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array9 = new Class3_Sub1_Sub2_Sub4[20];

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
	private int[] anIntArray275 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1048 = -911;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Z")
	private boolean aBoolean245 = true;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "B")
	private byte aByte31 = 8;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "[Lclient!ZWUMKFUX;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array10 = new Class3_Sub1_Sub2_Sub4[8];

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "[Lclient!RZWMPYWU;")
	private Class3_Sub1_Sub2_Sub2[] aClass3_Sub1_Sub2_Sub2Array5 = new Class3_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "Lclient!OCPYCLUF;")
	private Class27 aClass27_12 = new Class27((byte) 118);

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1052 = -456;

	static {
		@Pc(278) int local278 = 0;
		@Pc(280) int local280;
		for (local280 = 0; local280 < 99; local280++) {
			@Pc(285) int local285 = local280 + 1;
			@Pc(298) int local298 = (int) ((double) local285 + 300.0D * Math.pow(2.0D, (double) local285 / 7.0D));
			local278 += local298;
			anIntArray242[local280] = local278 / 4;
		}
		anIntArray243 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBoolean233 = true;
		anIntArray254 = new int[32];
		local278 = 2;
		for (local280 = 0; local280 < 32; local280++) {
			anIntArray254[local280] = local278 - 1;
			local278 += local278;
		}
		anInt1031 = 10;
		aBoolean242 = true;
		anInt1051 = 389;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("66523, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private static String method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else if (arg1 < 10000000) {
				return arg1 / 1000 + "K";
			} else {
				return arg1 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("41682, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method605(@OriginalArg(1) int arg0) {
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
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("26767, " + -972 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private static void method620() {
		try {
			Class36.aBoolean149 = true;
			Class3_Sub1_Sub2_Sub3.aBoolean168 = true;
			aBoolean243 = true;
			Class8.aBoolean51 = true;
			Class26.aBoolean118 = true;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("30067, " + -39415 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 339);
			if (arg0.length == 5) {
				anInt1031 = Integer.parseInt(arg0[0]);
				anInt1032 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method620();
				} else if (arg0[2].equals("highmem")) {
					method699();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean242 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean242 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1056 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method574();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private static void method699() {
		try {
			Class36.aBoolean149 = false;
			Class3_Sub1_Sub2_Sub3.aBoolean168 = false;
			aBoolean243 = false;
			Class8.aBoolean51 = false;
			Class26.aBoolean118 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("93079, " + -105 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZIIIIIIZI)Z")
	private boolean method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray22[local7][local11] = 0;
					this.anIntArrayArray25[local7][local11] = 99999999;
				}
			}
			local11 = arg9;
			@Pc(39) int local39 = arg2;
			this.anIntArrayArray22[arg9][arg2] = 99;
			this.anIntArrayArray25[arg9][arg2] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray240[0] = arg9;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray241[0] = arg2;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray240.length;
			@Pc(81) int[][] local81 = this.aClass5Array1[this.anInt858].anIntArrayArray5;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray240[local57];
				local39 = this.anIntArray241[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg7 && local39 == arg1) {
					local70 = true;
					break;
				}
				if (arg0 != 0) {
					if ((arg0 < 5 || arg0 == 10) && this.aClass5Array1[this.anInt858].method73(local39, arg0 - 1, arg1, local11, arg5, arg7)) {
						local70 = true;
						break;
					}
					if (arg0 < 10 && this.aClass5Array1[this.anInt858].method74(arg5, arg7, arg0 - 1, local39, arg1, local11)) {
						local70 = true;
						break;
					}
				}
				if (arg8 != 0 && arg10 != 0 && this.aClass5Array1[this.anInt858].method75(arg4, arg7, arg8, local11, local39, arg1, arg10)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray25[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray22[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray240[local66] = local11 - 1;
					this.anIntArray241[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39] = 2;
					this.anIntArrayArray25[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray22[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray240[local66] = local11 + 1;
					this.anIntArray241[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39] = 8;
					this.anIntArrayArray25[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray22[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray240[local66] = local11;
					this.anIntArray241[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 - 1] = 1;
					this.anIntArrayArray25[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray22[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray240[local66] = local11;
					this.anIntArray241[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 + 1] = 4;
					this.anIntArrayArray25[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray22[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray240[local66] = local11 - 1;
					this.anIntArray241[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray22[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray240[local66] = local11 + 1;
					this.anIntArray241[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray22[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray240[local66] = local11 - 1;
					this.anIntArray241[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray22[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray240[local66] = local11 + 1;
					this.anIntArray241[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt915 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (arg3) {
					local192 = 100;
					for (local808 = 1; local808 < 2; local808++) {
						for (local814 = arg7 - local808; local814 <= arg7 + local808; local814++) {
							for (local820 = arg1 - local808; local820 <= arg1 + local808; local820++) {
								if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray25[local814][local820] < local192) {
									local192 = this.anIntArrayArray25[local814][local820];
									local11 = local814;
									local39 = local820;
									this.anInt915 = 1;
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
			this.anIntArray240[0] = local11;
			local57 = local881 + 1;
			this.anIntArray241[0] = local39;
			local192 = local808 = this.anIntArrayArray22[local11][local39];
			while (local11 != arg9 || local39 != arg2) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray240[local57] = local11;
					this.anIntArray241[local57++] = local39;
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
				local814 = this.anIntArray240[local57];
				local820 = this.anIntArray241[local57];
				if (arg6 == 0) {
					this.aClass3_Sub1_Sub3_8.method263(226);
					this.aClass3_Sub1_Sub3_8.method264(local74 + local74 + 3);
				}
				if (arg6 == 1) {
					this.aClass3_Sub1_Sub3_8.method263(114);
					this.aClass3_Sub1_Sub3_8.method264(local74 + local74 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass3_Sub1_Sub3_8.method263(143);
					this.aClass3_Sub1_Sub3_8.method264(local74 + local74 + 3);
				}
				this.aClass3_Sub1_Sub3_8.method299(local814 + this.anInt957, this.aBoolean211);
				this.aClass3_Sub1_Sub3_8.method299(local820 + this.anInt958, this.aBoolean211);
				this.aClass3_Sub1_Sub3_8.method291(super.anIntArray210[5] == 1 ? 1 : 0);
				this.anInt917 = this.anIntArray240[0];
				this.anInt918 = this.anIntArray241[0];
				for (@Pc(1074) int local1074 = 1; local1074 < local74; local1074++) {
					local57--;
					this.aClass3_Sub1_Sub3_8.method291(this.anIntArray240[local57] - local814);
					this.aClass3_Sub1_Sub3_8.method290(this.anIntArray241[local57] - local820, this.aByte29);
				}
				return true;
			} else if (arg6 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1112) RuntimeException local1112) {
			signlink.reporterror("94547, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + false + ", " + arg10 + ", " + local1112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method589() {
		try {
			if (this.anInt1053 >= 2 || this.anInt1039 != 0 || this.anInt899 != 0) {
				@Pc(37) String local37;
				if (this.anInt1039 == 1 && this.anInt1053 < 2) {
					local37 = "Use " + this.aString30 + " with...";
				} else if (this.anInt899 == 1 && this.anInt1053 < 2) {
					local37 = this.aString20 + "...";
				} else {
					local37 = this.aStringArray11[this.anInt1053 - 1];
				}
				if (this.anInt1053 > 2) {
					local37 = local37 + "@whi@ / " + (this.anInt1053 - 2) + " more options";
				}
				this.aClass3_Sub1_Sub2_Sub1_4.method129(15, anInt1050 / 1000, 16777215, 4, local37);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("35968, " + true + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method590() {
		try {
			@Pc(6) int local6 = this.anInt927 * 128 + 64;
			@Pc(13) int local13 = this.anInt928 * 128 + 64;
			@Pc(24) int local24 = this.method629(this.anInt858, local13, local6) - this.anInt929;
			if (this.anInt835 < local6) {
				this.anInt835 += this.anInt930 + (local6 - this.anInt835) * this.anInt931 / 1000;
				if (this.anInt835 > local6) {
					this.anInt835 = local6;
				}
			}
			if (this.anInt835 > local6) {
				this.anInt835 -= this.anInt930 + (this.anInt835 - local6) * this.anInt931 / 1000;
				if (this.anInt835 < local6) {
					this.anInt835 = local6;
				}
			}
			if (this.anInt836 < local24) {
				this.anInt836 += this.anInt930 + (local24 - this.anInt836) * this.anInt931 / 1000;
				if (this.anInt836 > local24) {
					this.anInt836 = local24;
				}
			}
			if (this.anInt836 > local24) {
				this.anInt836 -= this.anInt930 + (this.anInt836 - local24) * this.anInt931 / 1000;
				if (this.anInt836 < local24) {
					this.anInt836 = local24;
				}
			}
			if (this.anInt837 < local13) {
				this.anInt837 += this.anInt930 + (local13 - this.anInt837) * this.anInt931 / 1000;
				if (this.anInt837 > local13) {
					this.anInt837 = local13;
				}
			}
			if (this.anInt837 > local13) {
				this.anInt837 -= this.anInt930 + (this.anInt837 - local13) * this.anInt931 / 1000;
				if (this.anInt837 < local13) {
					this.anInt837 = local13;
				}
			}
			local6 = this.anInt876 * 128 + 64;
			local13 = this.anInt877 * 128 + 64;
			local24 = this.method629(this.anInt858, local13, local6) - this.anInt878;
			@Pc(228) int local228 = local6 - this.anInt835;
			@Pc(233) int local233 = local24 - this.anInt836;
			@Pc(238) int local238 = local13 - this.anInt837;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt838 < local260) {
				this.anInt838 += this.anInt879 + (local260 - this.anInt838) * this.anInt880 / 1000;
				if (this.anInt838 > local260) {
					this.anInt838 = local260;
				}
			}
			if (this.anInt838 > local260) {
				this.anInt838 -= this.anInt879 + (this.anInt838 - local260) * this.anInt880 / 1000;
				if (this.anInt838 < local260) {
					this.anInt838 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt839;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt839 += this.anInt879 + local342 * this.anInt880 / 1000;
				this.anInt839 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt839 -= this.anInt879 + -local342 * this.anInt880 / 1000;
				this.anInt839 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt839;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt839 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("28606, " + -48 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)I")
	private int method591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("29821, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method592(@OriginalArg(1) long arg0) {
		try {
			this.aBoolean237 &= true;
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt1030; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt1030--;
						this.aBoolean207 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt1030; local34++) {
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass3_Sub1_Sub3_8.method263(174);
						this.aClass3_Sub1_Sub3_8.method270(arg0);
						return;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("93914, " + true + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)V")
	private void method593(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			this.anInt884 += 0;
			if (this.aBoolean209) {
				signlink.anInt1061 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("20927, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIILclient!HZINZKXF;I)V")
	private void method595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt338 == 0 && arg2.anIntArray98 != null && (!arg2.aBoolean82 || this.anInt855 == arg2.anInt340 || this.anInt891 == arg2.anInt340 || this.anInt1008 == arg2.anInt340)) {
				@Pc(38) int local38 = Class3_Sub1_Sub2.anInt787;
				@Pc(40) int local40 = Class3_Sub1_Sub2.anInt785;
				@Pc(42) int local42 = Class3_Sub1_Sub2.anInt788;
				@Pc(44) int local44 = Class3_Sub1_Sub2.anInt786;
				Class3_Sub1_Sub2.method551(arg1, arg0 + arg2.anInt339, arg0, arg1 + arg2.anInt355);
				@Pc(60) int local60 = arg2.anIntArray98.length;
				for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
					@Pc(71) int local71 = arg2.anIntArray95[local62] + arg1;
					@Pc(80) int local80 = arg2.anIntArray92[local62] + arg0 - arg3;
					@Pc(86) Class13 local86 = Class13.method194(arg2.anIntArray98[local62]);
					@Pc(91) int local91 = local71 + local86.anInt372;
					@Pc(96) int local96 = local80 + local86.anInt367;
					if (local86.anInt371 > 0) {
						this.method716(this.aBoolean245, local86);
					}
					if (local86.anInt338 == 0) {
						if (local86.anInt344 > local86.anInt356 - local86.anInt339) {
							local86.anInt344 = local86.anInt356 - local86.anInt339;
						}
						if (local86.anInt344 < 0) {
							local86.anInt344 = 0;
						}
						this.method595(local96, local91, local86, local86.anInt344);
						if (local86.anInt356 > local86.anInt339) {
							this.method613(local86.anInt356, local91 + local86.anInt355, local96, local86.anInt344, local86.anInt339);
						}
					} else if (local86.anInt338 != 1) {
						@Pc(169) int local169;
						@Pc(173) int local173;
						@Pc(184) int local184;
						@Pc(219) int local219;
						@Pc(226) int local226;
						@Pc(251) int local251;
						@Pc(167) int local167;
						@Pc(217) int local217;
						if (local86.anInt338 == 2) {
							local167 = 0;
							for (local169 = 0; local169 < local86.anInt339; local169++) {
								for (local173 = 0; local173 < local86.anInt355; local173++) {
									local184 = local91 + local173 * (local86.anInt353 + 32);
									@Pc(193) int local193 = local96 + local169 * (local86.anInt337 + 32);
									if (local167 < 20) {
										local184 += local86.anIntArray94[local167];
										local193 += local86.anIntArray93[local167];
									}
									if (local86.anIntArray97[local167] > 0) {
										local217 = 0;
										local219 = 0;
										local226 = local86.anIntArray97[local167] - 1;
										if (local184 > Class3_Sub1_Sub2.anInt787 - 32 && local184 < Class3_Sub1_Sub2.anInt788 && local193 > Class3_Sub1_Sub2.anInt785 - 32 && local193 < Class3_Sub1_Sub2.anInt786 || this.anInt950 != 0 && this.anInt949 == local167) {
											local251 = 0;
											if (this.anInt1039 == 1 && this.anInt1040 == local167 && this.anInt1041 == local86.anInt340) {
												local251 = 16777215;
											}
											@Pc(275) Class3_Sub1_Sub2_Sub4 local275 = Class12.method181(local251, local226, local86.anIntArray96[local167]);
											if (local275 != null) {
												@Pc(354) int local354;
												if (this.anInt950 != 0 && this.anInt949 == local167 && this.anInt948 == local86.anInt340) {
													local217 = super.anInt808 - this.anInt951;
													local219 = super.anInt809 - this.anInt952;
													if (local217 < 5 && local217 > -5) {
														local217 = 0;
													}
													if (local219 < 5 && local219 > -5) {
														local219 = 0;
													}
													if (this.anInt924 < 5) {
														local217 = 0;
														local219 = 0;
													}
													local275.method568(local193 + local219, local184 + local217, 928);
													if (local193 + local219 < Class3_Sub1_Sub2.anInt785 && arg2.anInt344 > 0) {
														local354 = this.anInt953 * (Class3_Sub1_Sub2.anInt785 - local193 - local219) / 3;
														if (local354 > this.anInt953 * 10) {
															local354 = this.anInt953 * 10;
														}
														if (local354 > arg2.anInt344) {
															local354 = arg2.anInt344;
														}
														arg2.anInt344 -= local354;
														this.anInt952 += local354;
													}
													if (local193 + local219 + 32 > Class3_Sub1_Sub2.anInt786 && arg2.anInt344 < arg2.anInt356 - arg2.anInt339) {
														local354 = this.anInt953 * (local193 + local219 + 32 - Class3_Sub1_Sub2.anInt786) / 3;
														if (local354 > this.anInt953 * 10) {
															local354 = this.anInt953 * 10;
														}
														if (local354 > arg2.anInt356 - arg2.anInt339 - arg2.anInt344) {
															local354 = arg2.anInt356 - arg2.anInt339 - arg2.anInt344;
														}
														arg2.anInt344 += local354;
														this.anInt952 -= local354;
													}
												} else if (this.anInt849 != 0 && this.anInt848 == local167 && this.anInt847 == local86.anInt340) {
													local275.method568(local193, local184, 928);
												} else {
													local275.method566(local184, local193, (byte) 8);
												}
												if (local275.anInt797 == 33 || local86.anIntArray96[local167] != 1) {
													local354 = local86.anIntArray96[local167];
													this.aClass3_Sub1_Sub2_Sub1_2.method124(method594(202, local354), local184 + local217 + 1, local193 + 10 + local219, 0);
													this.aClass3_Sub1_Sub2_Sub1_2.method124(method594(202, local354), local184 + local217, local193 + 9 + local219, 16776960);
												}
											}
										}
									} else if (local86.aClass3_Sub1_Sub2_Sub4Array2 != null && local167 < 20) {
										@Pc(543) Class3_Sub1_Sub2_Sub4 local543 = local86.aClass3_Sub1_Sub2_Sub4Array2[local167];
										if (local543 != null) {
											local543.method566(local184, local193, (byte) 8);
										}
									}
									local167++;
								}
							}
						} else if (local86.anInt338 == 3) {
							@Pc(569) boolean local569 = false;
							if (this.anInt1008 == local86.anInt340 || this.anInt891 == local86.anInt340 || this.anInt855 == local86.anInt340) {
								local569 = true;
							}
							if (this.method674(local86)) {
								local167 = local86.anInt374;
								if (local569 && local86.anInt354 != 0) {
									local167 = local86.anInt354;
								}
							} else {
								local167 = local86.anInt358;
								if (local569 && local86.anInt351 != 0) {
									local167 = local86.anInt351;
								}
							}
							if (local86.aByte9 == 0) {
								if (local86.aBoolean91) {
									Class3_Sub1_Sub2.method554(local91, local167, local86.anInt339, local96, local86.anInt355);
								} else {
									Class3_Sub1_Sub2.method555(local167, local96, local86.anInt355, local86.anInt339, local91);
								}
							} else if (local86.aBoolean91) {
								Class3_Sub1_Sub2.method553(local86.anInt355, local96, local167, 256 - (local86.aByte9 & 0xFF), local86.anInt339, local91);
							} else {
								Class3_Sub1_Sub2.method556(local96, local91, 256 - (local86.aByte9 & 0xFF), local86.anInt339, local167, local86.anInt355);
							}
						} else {
							@Pc(687) Class3_Sub1_Sub2_Sub1 local687;
							@Pc(964) String local964;
							if (local86.anInt338 == 4) {
								local687 = local86.aClass3_Sub1_Sub2_Sub1_1;
								@Pc(690) String local690 = local86.aString7;
								@Pc(692) boolean local692 = false;
								if (this.anInt1008 == local86.anInt340 || this.anInt891 == local86.anInt340 || this.anInt855 == local86.anInt340) {
									local692 = true;
								}
								if (this.method674(local86)) {
									local169 = local86.anInt374;
									if (local692 && local86.anInt354 != 0) {
										local169 = local86.anInt354;
									}
									if (local86.aString8.length() > 0) {
										local690 = local86.aString8;
									}
								} else {
									local169 = local86.anInt358;
									if (local692 && local86.anInt351 != 0) {
										local169 = local86.anInt351;
									}
								}
								if (local86.anInt368 == 6 && this.aBoolean213) {
									local690 = "Please wait...";
									local169 = local86.anInt358;
								}
								if (Class3_Sub1_Sub2.anInt783 == 479) {
									if (local169 == 16776960) {
										local169 = 255;
									}
									if (local169 == 49152) {
										local169 = 16777215;
									}
								}
								local217 = local96 + local687.anInt172;
								while (local690.length() > 0) {
									if (local690.indexOf("%") != -1) {
										label386: while (true) {
											local219 = local690.indexOf("%1");
											if (local219 == -1) {
												while (true) {
													local219 = local690.indexOf("%2");
													if (local219 == -1) {
														while (true) {
															local219 = local690.indexOf("%3");
															if (local219 == -1) {
																while (true) {
																	local219 = local690.indexOf("%4");
																	if (local219 == -1) {
																		while (true) {
																			local219 = local690.indexOf("%5");
																			if (local219 == -1) {
																				break label386;
																			}
																			local690 = local690.substring(0, local219) + this.method687(this.method658(local86, 4)) + local690.substring(local219 + 2);
																		}
																	}
																	local690 = local690.substring(0, local219) + this.method687(this.method658(local86, 3)) + local690.substring(local219 + 2);
																}
															}
															local690 = local690.substring(0, local219) + this.method687(this.method658(local86, 2)) + local690.substring(local219 + 2);
														}
													}
													local690 = local690.substring(0, local219) + this.method687(this.method658(local86, 1)) + local690.substring(local219 + 2);
												}
											}
											local690 = local690.substring(0, local219) + this.method687(this.method658(local86, 0)) + local690.substring(local219 + 2);
										}
									}
									local219 = local690.indexOf("\\n");
									if (local219 == -1) {
										local964 = local690;
										local690 = "";
									} else {
										local964 = local690.substring(0, local219);
										local690 = local690.substring(local219 + 2);
									}
									if (local86.aBoolean86) {
										local687.method121(local169, local86.aBoolean90, local91 + local86.anInt355 / 2, local217, local964);
									} else {
										local687.method128(local217, local964, local86.aBoolean90, local169, local91);
									}
									local217 += local687.anInt172;
								}
							} else if (local86.anInt338 == 5) {
								@Pc(1026) Class3_Sub1_Sub2_Sub4 local1026;
								if (this.method674(local86)) {
									local1026 = local86.aClass3_Sub1_Sub2_Sub4_1;
								} else {
									local1026 = local86.aClass3_Sub1_Sub2_Sub4_2;
								}
								if (local1026 != null) {
									local1026.method566(local91, local96, (byte) 8);
								}
							} else if (local86.anInt338 == 6) {
								local167 = Class3_Sub1_Sub2_Sub3.anInt689;
								local169 = Class3_Sub1_Sub2_Sub3.anInt690;
								Class3_Sub1_Sub2_Sub3.anInt689 = local91 + local86.anInt355 / 2;
								Class3_Sub1_Sub2_Sub3.anInt690 = local96 + local86.anInt339 / 2;
								local173 = Class3_Sub1_Sub2_Sub3.anIntArray197[local86.anInt360] * local86.anInt359 >> 16;
								local184 = Class3_Sub1_Sub2_Sub3.anIntArray198[local86.anInt360] * local86.anInt359 >> 16;
								@Pc(1087) boolean local1087 = this.method674(local86);
								if (local1087) {
									local217 = local86.anInt349;
								} else {
									local217 = local86.anInt348;
								}
								@Pc(1107) Class3_Sub1_Sub1_Sub1 local1107;
								if (local217 == -1) {
									local1107 = local86.method195(426, -1, local1087, -1);
								} else {
									@Pc(1113) Class31 local1113 = Class31.aClass31Array1[local217];
									local1107 = local86.method195(426, local1113.anIntArray126[local86.anInt364], local1087, local1113.anIntArray127[local86.anInt364]);
								}
								if (local1107 != null) {
									local1107.method53(local86.anInt361, 0, local86.anInt360, 0, local173, local184);
								}
								Class3_Sub1_Sub2_Sub3.anInt689 = local167;
								Class3_Sub1_Sub2_Sub3.anInt690 = local169;
							} else {
								if (local86.anInt338 == 7) {
									local687 = local86.aClass3_Sub1_Sub2_Sub1_1;
									local169 = 0;
									for (local173 = 0; local173 < local86.anInt339; local173++) {
										for (local184 = 0; local184 < local86.anInt355; local184++) {
											if (local86.anIntArray97[local169] > 0) {
												@Pc(1177) Class12 local1177 = Class12.method179(local86.anIntArray97[local169] - 1);
												@Pc(1180) String local1180 = local1177.aString5;
												if (local1177.aBoolean81 || local86.anIntArray96[local169] != 1) {
													local1180 = local1180 + " x" + method605(local86.anIntArray96[local169]);
												}
												local219 = local91 + local184 * (local86.anInt353 + 115);
												local226 = local96 + local173 * (local86.anInt337 + 12);
												if (local86.aBoolean86) {
													local687.method121(local86.anInt358, local86.aBoolean90, local219 + local86.anInt355 / 2, local226, local1180);
												} else {
													local687.method128(local226, local1180, local86.aBoolean90, local86.anInt358, local219);
												}
											}
											local169++;
										}
									}
								}
								if (local86.anInt338 == 8 && (this.anInt938 == local86.anInt340 || this.anInt962 == local86.anInt340 || this.anInt1023 == local86.anInt340) && this.anInt995 == 100) {
									local167 = 0;
									local169 = 0;
									@Pc(1294) Class3_Sub1_Sub2_Sub1 local1294 = this.aClass3_Sub1_Sub2_Sub1_3;
									@Pc(1297) String local1297 = local86.aString7;
									while (local1297.length() > 0) {
										local217 = local1297.indexOf("\\n");
										if (local217 == -1) {
											local964 = local1297;
											local1297 = "";
										} else {
											local964 = local1297.substring(0, local217);
											local1297 = local1297.substring(local217 + 2);
										}
										local219 = local1294.method122(local964);
										if (local219 > local167) {
											local167 = local219;
										}
										local169 += local1294.anInt172 + 1;
									}
									local167 += 6;
									local169 += 7;
									local217 = local91 + local86.anInt355 - local167 - 5;
									local219 = local96 + local86.anInt339 + 5;
									if (local217 < local91 + 5) {
										local217 = local91 + 5;
									}
									if (local217 + local167 > arg1 + arg2.anInt355) {
										local217 = arg1 + arg2.anInt355 - local167;
									}
									Class3_Sub1_Sub2.method554(local217, 16777120, local169, local219, local167);
									Class3_Sub1_Sub2.method555(0, local219, local167, local169, local217);
									local1297 = local86.aString7;
									local226 = local219 + local1294.anInt172 + 2;
									while (local1297.length() > 0) {
										local251 = local1297.indexOf("\\n");
										if (local251 == -1) {
											local964 = local1297;
											local1297 = "";
										} else {
											local964 = local1297.substring(0, local251);
											local1297 = local1297.substring(local251 + 2);
										}
										local1294.method128(local226, local964, false, 0, local217 + 3);
										local226 += local1294.anInt172 + 1;
									}
								}
							}
						}
					}
				}
				Class3_Sub1_Sub2.method551(local38, local44, local40, local42);
			}
		} catch (@Pc(1467) RuntimeException local1467) {
			signlink.reporterror("87696, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1467.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method596(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 >> 7 == this.anInt917 && aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 >> 7 == this.anInt918) {
				this.anInt917 = 0;
			}
			@Pc(21) int local21 = this.anInt1012;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class3_Sub1_Sub1_Sub4_Sub1 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass3_Sub1_Sub1_Sub4_Sub1_1;
					local38 = this.anInt1011 << 14;
				} else {
					local33 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray251[local27]];
					local38 = this.anIntArray251[local27] << 14;
				}
				if (local33 != null && local33.method536(29)) {
					local33.aBoolean72 = false;
					if ((aBoolean243 && this.anInt1012 > 50 || this.anInt1012 > 200) && !arg0 && local33.anInt711 == local33.anInt752) {
						local33.aBoolean72 = true;
					}
					@Pc(89) int local89 = local33.anInt754 >> 7;
					@Pc(94) int local94 = local33.anInt755 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass3_Sub1_Sub1_Sub1_2 == null || anInt1050 < local33.anInt292 || anInt1050 >= local33.anInt293) {
							if ((local33.anInt754 & 0x7F) == 64 && (local33.anInt755 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local89][local94] == this.anInt945) {
									continue;
								}
								this.anIntArrayArray24[local89][local94] = this.anInt945;
							}
							local33.anInt296 = this.method629(this.anInt858, local33.anInt755, local33.anInt754);
							this.aClass36_1.method391(local33.anInt754, 60, local33, this.anInt858, local33.anInt756, local38, local33.anInt755, local33.anInt296, local33.aBoolean185);
						} else {
							local33.aBoolean72 = false;
							local33.anInt296 = this.method629(this.anInt858, local33.anInt755, local33.anInt754);
							this.aClass36_1.method392(local33.anInt755, local33.anInt303, local33.anInt754, local33.anInt756, local33.anInt296, local38, local33.anInt304, local33, local33.anInt305, local33.anInt302, this.anInt858);
						}
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("54478, " + 72 + ", " + arg0 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NHEPCMLW;IB)V")
	private void method597(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method284();
			@Pc(7) int local7 = arg0.method285(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg0.method285(2);
				if (local15 == 0) {
					this.anIntArray252[this.anInt1013++] = this.anInt1011;
				} else {
					@Pc(48) int local48;
					@Pc(58) int local58;
					if (local15 == 1) {
						local48 = arg0.method285(3);
						aClass3_Sub1_Sub1_Sub4_Sub1_1.method539(false, local48);
						local58 = arg0.method285(1);
						if (local58 == 1) {
							this.anIntArray252[this.anInt1013++] = this.anInt1011;
						}
					} else {
						@Pc(102) int local102;
						if (local15 == 2) {
							local48 = arg0.method285(3);
							aClass3_Sub1_Sub1_Sub4_Sub1_1.method539(true, local48);
							local58 = arg0.method285(3);
							aClass3_Sub1_Sub1_Sub4_Sub1_1.method539(true, local58);
							local102 = arg0.method285(1);
							if (local102 == 1) {
								this.anIntArray252[this.anInt1013++] = this.anInt1011;
							}
						} else if (local15 == 3) {
							local48 = arg0.method285(7);
							this.anInt858 = arg0.method285(2);
							local58 = arg0.method285(1);
							local102 = arg0.method285(1);
							if (local102 == 1) {
								this.anIntArray252[this.anInt1013++] = this.anInt1011;
							}
							@Pc(162) int local162 = arg0.method285(7);
							aClass3_Sub1_Sub1_Sub4_Sub1_1.method538(local48, local162, local58 == 1);
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("29763, " + arg0 + ", " + arg1 + ", " + 89 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ZWUMKFUX;)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub2_Sub4 arg2) {
		try {
			if (6 == this.anInt892) {
				@Pc(12) int local12 = arg1 * arg1 + arg0 * arg0;
				if (local12 > 4225 && local12 < 90000) {
					@Pc(26) int local26 = this.anInt980 + this.anInt968 & 0x7FF;
					@Pc(30) int local30 = Class3_Sub1_Sub1_Sub1.anIntArray42[local26];
					@Pc(34) int local34 = Class3_Sub1_Sub1_Sub1.anIntArray43[local26];
					@Pc(43) int local43 = local30 * 256 / (this.anInt966 + 256);
					@Pc(52) int local52 = local34 * 256 / (this.anInt966 + 256);
					@Pc(62) int local62 = arg0 * local43 + arg1 * local52 >> 16;
					@Pc(72) int local72 = arg0 * local52 - arg1 * local43 >> 16;
					@Pc(78) double local78 = Math.atan2((double) local62, (double) local72);
					@Pc(84) int local84 = (int) (Math.sin(local78) * 63.0D);
					@Pc(90) int local90 = (int) (Math.cos(local78) * 57.0D);
					this.aClass3_Sub1_Sub2_Sub4_9.method571(local78, local84 + 94 + 4 - 10, this.anInt823, 83 - local90 - 20);
				} else {
					this.method705(arg0, arg1, arg2);
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("91184, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!YCAXTCCQ;)V")
	private void method599(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3 arg1) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg1.anInt666 == 0) {
				local1 = this.aClass36_1.method406(arg1.anInt665, arg1.anInt667, arg1.anInt668);
			}
			if (arg1.anInt666 == 1) {
				local1 = this.aClass36_1.method407(arg1.anInt668, arg1.anInt665, arg1.anInt667);
			}
			if (arg1.anInt666 == 2) {
				local1 = this.aClass36_1.method408(arg1.anInt665, arg1.anInt667, arg1.anInt668);
			}
			if (arg1.anInt666 == 3) {
				local1 = this.aClass36_1.method409(arg1.anInt665, arg1.anInt667, arg1.anInt668);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass36_1.method410(arg1.anInt665, arg1.anInt667, arg1.anInt668, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg1.anInt662 = local3;
			arg1.anInt664 = local5;
			@Pc(100) boolean local100 = false;
			arg1.anInt663 = local7;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("8770, " + arg0 + ", " + arg1 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method600(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method601() {
		try {
			signlink.aBoolean246 = false;
			this.anInt884 += 0;
			signlink.anInt1061 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("3762, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method602() {
		try {
			for (@Pc(6) Class3_Sub3 local6 = (Class3_Sub3) this.aClass27_11.method327(); local6 != null; local6 = (Class3_Sub3) this.aClass27_11.method329(this.anInt1016)) {
				if (local6.anInt670 == -1) {
					local6.anInt669 = 0;
					this.method599(343, local6);
				} else {
					local6.method547();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("8881, " + false + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!NHEPCMLW;)V")
	private void method603(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub3 arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anInt1013; local12++) {
				@Pc(19) int local19 = this.anIntArray252[local12];
				@Pc(24) Class3_Sub1_Sub1_Sub4_Sub1 local24 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local19];
				@Pc(27) int local27 = arg1.method274();
				if ((local27 & 0x8) != 0) {
					local27 += arg1.method274() << 8;
				}
				this.method688(local19, local27, local24, arg1);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("99201, " + arg0 + ", " + true + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean217) {
			this.method652();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method604(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1063 = arg0;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("87195, " + arg0 + ", " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method606(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				if (this.anInt1030 >= 100) {
					this.method681("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(23) String local23 = Class38.method439(Class38.method436(arg1));
					for (@Pc(25) int local25 = 0; local25 < this.anInt1030; local25++) {
						if (this.aLongArray3[local25] == arg1) {
							this.method681("", local23 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt1046; local55++) {
						if (this.aLongArray4[local55] == arg1) {
							this.method681("", "Please remove " + local23 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt1030++] = arg1;
					this.aBoolean207 = true;
					this.aClass3_Sub1_Sub3_8.method263(39);
					@Pc(108) boolean local108 = false;
					this.aClass3_Sub1_Sub3_8.method270(arg1);
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("14447, " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method607() {
		try {
			@Pc(32) int local32;
			@Pc(115) int local115;
			@Pc(119) int local119;
			@Pc(123) int local123;
			@Pc(171) int local171;
			@Pc(185) int local185;
			@Pc(197) int local197;
			@Pc(256) int local256;
			try {
				this.anInt822 = -1;
				this.aClass27_10.method331();
				this.aClass27_12.method331();
				anInt1022++;
				if (anInt1022 > 1662) {
					anInt1022 = 0;
					this.aClass3_Sub1_Sub3_8.method263(251);
					this.aClass3_Sub1_Sub3_8.method264(0);
					local32 = this.aClass3_Sub1_Sub3_8.anInt441;
					this.aClass3_Sub1_Sub3_8.method265(35357);
					this.aClass3_Sub1_Sub3_8.method265(44205);
					this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
					this.aClass3_Sub1_Sub3_8.method264(195);
					this.aClass3_Sub1_Sub3_8.method264(135);
					this.aClass3_Sub1_Sub3_8.method265(22200);
					this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
					this.aClass3_Sub1_Sub3_8.method265(10016);
					this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
					this.aClass3_Sub1_Sub3_8.method264(206);
					this.aClass3_Sub1_Sub3_8.method273(this.aClass3_Sub1_Sub3_8.anInt441 - local32);
				}
				Class3_Sub1_Sub2_Sub3.method502();
				this.method624();
				this.aClass36_1.method380();
				System.gc();
				for (local32 = 0; local32 < 4; local32++) {
					this.aClass5Array1[local32].method64();
				}
				for (local115 = 0; local115 < 4; local115++) {
					for (local119 = 0; local119 < 104; local119++) {
						for (local123 = 0; local123 < 104; local123++) {
							this.aByteArrayArrayArray8[local115][local119][local123] = 0;
						}
					}
				}
				@Pc(157) Class8 local157 = new Class8(5, 104, this.anIntArrayArrayArray7, 104, this.aByteArrayArrayArray8);
				local123 = this.aByteArrayArray6.length;
				this.aClass3_Sub1_Sub3_8.method263(37);
				@Pc(318) int local318;
				@Pc(306) int local306;
				if (!this.aBoolean212) {
					@Pc(202) byte[] local202;
					for (local171 = 0; local171 < local123; local171++) {
						local185 = (this.anIntArray236[local171] >> 8) * 64 - this.anInt957;
						local197 = (this.anIntArray236[local171] & 0xFF) * 64 - this.anInt958;
						local202 = this.aByteArrayArray6[local171];
						if (local202 != null) {
							local157.method136((this.anInt820 - 6) * 8, local185, (this.anInt819 - 6) * 8, local197, this.aClass5Array1, local202);
						}
					}
					for (local185 = 0; local185 < local123; local185++) {
						local197 = (this.anIntArray236[local185] >> 8) * 64 - this.anInt957;
						local256 = (this.anIntArray236[local185] & 0xFF) * 64 - this.anInt958;
						@Pc(261) byte[] local261 = this.aByteArrayArray6[local185];
						if (local261 == null && this.anInt820 < 800) {
							local157.method138(64, local197, 64, local256);
						}
					}
					this.aClass3_Sub1_Sub3_8.method263(37);
					for (local197 = 0; local197 < local123; local197++) {
						local202 = this.aByteArrayArray5[local197];
						if (local202 != null) {
							local306 = (this.anIntArray236[local197] >> 8) * 64 - this.anInt957;
							local318 = (this.anIntArray236[local197] & 0xFF) * 64 - this.anInt958;
							local157.method150(this.aClass5Array1, local306, local202, local318, this.aClass36_1);
						}
					}
				}
				if (this.aBoolean212) {
					local171 = 0;
					label254: while (true) {
						@Pc(377) int local377;
						@Pc(383) int local383;
						@Pc(393) int local393;
						@Pc(395) int local395;
						if (local171 >= 4) {
							for (local185 = 0; local185 < 13; local185++) {
								for (local197 = 0; local197 < 13; local197++) {
									local256 = this.anIntArrayArrayArray8[0][local185][local197];
									if (local256 == -1) {
										local157.method138(8, local185 * 8, 8, local197 * 8);
									}
								}
							}
							this.aClass3_Sub1_Sub3_8.method263(37);
							local197 = 0;
							while (true) {
								if (local197 >= 4) {
									break label254;
								}
								for (local256 = 0; local256 < 13; local256++) {
									for (local306 = 0; local306 < 13; local306++) {
										local318 = this.anIntArrayArrayArray8[local197][local256][local306];
										if (local318 != -1) {
											local377 = local318 >> 24 & 0x3;
											local383 = local318 >> 1 & 0x3;
											local393 = local318 >> 14 & 0x3FF;
											local395 = local318 >> 3 & 0x7FF;
											@Pc(558) int local558 = (local393 / 8 << 8) + local395 / 8;
											for (@Pc(560) int local560 = 0; local560 < this.anIntArray236.length; local560++) {
												if (this.anIntArray236[local560] == local558 && this.aByteArrayArray5[local560] != null) {
													local157.method153((local395 & 0x7) * 8, this.aClass36_1, local377, this.aByteArrayArray5[local560], local383, (local393 & 0x7) * 8, local256 * 8, local306 * 8, this.aClass5Array1, local197, this.anInt933);
													break;
												}
											}
										}
									}
								}
								local197++;
							}
						}
						for (local185 = 0; local185 < 13; local185++) {
							for (local197 = 0; local197 < 13; local197++) {
								local256 = this.anIntArrayArrayArray8[local171][local185][local197];
								if (local256 != -1) {
									local306 = local256 >> 24 & 0x3;
									local318 = local256 >> 1 & 0x3;
									local377 = local256 >> 14 & 0x3FF;
									local383 = local256 >> 3 & 0x7FF;
									local393 = (local377 / 8 << 8) + local383 / 8;
									for (local395 = 0; local395 < this.anIntArray236.length; local395++) {
										if (this.anIntArray236[local395] == local393 && this.aByteArrayArray6[local395] != null) {
											local157.method137((local377 & 0x7) * 8, local197 * 8, this.aByteArrayArray6[local395], this.aClass5Array1, local185 * 8, local306, local171, (local383 & 0x7) * 8, local318);
											break;
										}
									}
								}
							}
						}
						local171++;
					}
				}
				this.aClass3_Sub1_Sub3_8.method263(37);
				local157.method155(this.aClass5Array1, this.aClass36_1);
				if (this.aClass42_14 != null) {
					this.aClass42_14.method467((byte) 6);
					Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
				}
				this.aClass3_Sub1_Sub3_8.method263(37);
				local171 = Class8.anInt181;
				if (local171 > this.anInt858) {
					local171 = this.anInt858;
				}
				if (local171 < this.anInt858 - 1) {
					local171 = this.anInt858 - 1;
				}
				if (aBoolean243) {
					this.aClass36_1.method381(Class8.anInt181);
				} else {
					this.aClass36_1.method381(0);
				}
				for (local185 = 0; local185 < 104; local185++) {
					for (local197 = 0; local197 < 104; local197++) {
						this.method694(local185, local197);
					}
				}
				this.method602();
			} catch (@Pc(710) Exception local710) {
			}
			Class26.aClass49_8.method544();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass3_Sub1_Sub3_8.method263(225);
				this.aClass3_Sub1_Sub3_8.method268(1057001181);
			}
			if (aBoolean243 && signlink.aRandomAccessFile3 != null) {
				local32 = this.aClass10_Sub1_1.method465(0);
				for (local115 = 0; local115 < local32; local115++) {
					local119 = this.aClass10_Sub1_1.method456(local115);
					if ((local119 & 0x79) == 0) {
						Class3_Sub1_Sub1_Sub1.method32(local115);
					}
				}
			}
			System.gc();
			Class3_Sub1_Sub2_Sub3.method503();
			this.aClass10_Sub1_1.method459();
			local32 = (this.anInt819 - 6) / 8 - 1;
			local115 = (this.anInt819 + 6) / 8 + 1;
			local119 = (this.anInt820 - 6) / 8 - 1;
			local123 = (this.anInt820 + 6) / 8 + 1;
			if (this.aBoolean236) {
				local32 = 49;
				local115 = 50;
				local119 = 49;
				local123 = 50;
			}
			for (local171 = local32; local171 <= local115; local171++) {
				for (local185 = local119; local185 <= local123; local185++) {
					if (local171 == local32 || local171 == local115 || local185 == local119 || local185 == local123) {
						local197 = this.aClass10_Sub1_1.method452(local171, local185, 0);
						if (local197 != -1) {
							this.aClass10_Sub1_1.method455(local197, 3);
						}
						local256 = this.aClass10_Sub1_1.method452(local171, local185, 1);
						if (local256 != -1) {
							this.aClass10_Sub1_1.method455(local256, 3);
						}
					}
				}
			}
		} catch (@Pc(881) RuntimeException local881) {
			signlink.reporterror("97329, " + 42 + ", " + local881.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg1 >= 1 && arg4 >= 1 && arg1 <= 102 && arg4 <= 102) {
				if (aBoolean243 && arg0 != this.anInt858) {
					return;
				}
				@Pc(30) int local30 = 0;
				if (arg5 == 0) {
					local30 = this.aClass36_1.method406(arg0, arg1, arg4);
				}
				if (arg5 == 1) {
					local30 = this.aClass36_1.method407(arg4, arg0, arg1);
				}
				if (arg5 == 2) {
					local30 = this.aClass36_1.method408(arg0, arg1, arg4);
				}
				if (arg5 == 3) {
					local30 = this.aClass36_1.method409(arg0, arg1, arg4);
				}
				@Pc(86) int local86;
				if (local30 != 0) {
					local86 = this.aClass36_1.method410(arg0, arg1, arg4, local30);
					@Pc(92) int local92 = local30 >> 14 & 0x7FFF;
					@Pc(96) int local96 = local86 & 0x1F;
					@Pc(100) int local100 = local86 >> 6;
					@Pc(112) Class26 local112;
					if (arg5 == 0) {
						this.aClass36_1.method397(arg4, arg0, arg1);
						local112 = Class26.method313(local92);
						if (local112.aBoolean119) {
							this.aClass5Array1[arg0].method69(local112.aBoolean127, local100, arg1, local96, arg4);
						}
					}
					if (arg5 == 1) {
						this.aClass36_1.method398(arg4, arg1, this.anInt996, arg0);
					}
					if (arg5 == 2) {
						this.aClass36_1.method399(arg1, arg4, arg0);
						local112 = Class26.method313(local92);
						if (arg1 + local112.anInt446 > 103 || arg4 + local112.anInt446 > 103 || arg1 + local112.anInt458 > 103 || arg4 + local112.anInt458 > 103) {
							return;
						}
						if (local112.aBoolean119) {
							this.aClass5Array1[arg0].method70(local100, arg1, local112.anInt446, local112.aBoolean127, local112.anInt458, arg4);
						}
					}
					if (arg5 == 3) {
						this.aClass36_1.method400(arg1, arg0, arg4);
						local112 = Class26.method313(local92);
						if (local112.aBoolean119 && local112.aBoolean123) {
							this.aClass5Array1[arg0].method72(arg4, arg1);
						}
					}
				}
				if (arg2 >= 0) {
					local86 = arg0;
					if (arg0 < 3 && (this.aByteArrayArrayArray8[1][arg1][arg4] & 0x2) == 2) {
						local86 = arg0 + 1;
					}
					Class8.method152(arg0, this.anIntArrayArrayArray7, arg2, arg4, arg3, local86, this.aClass36_1, arg6, this.aClass5Array1[arg0], arg1);
					return;
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("1042, " + arg0 + ", " + -210 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method609() {
		try {
			if (1 != this.aByte28) {
				this.anInt883 = -425;
			}
			for (@Pc(13) Class3_Sub1_Sub1_Sub5 local13 = (Class3_Sub1_Sub1_Sub5) this.aClass27_12.method327(); local13 != null; local13 = (Class3_Sub1_Sub1_Sub5) this.aClass27_12.method329(this.anInt1016)) {
				if (local13.anInt508 != this.anInt858 || anInt1050 > local13.anInt503) {
					local13.method547();
				} else if (anInt1050 >= local13.anInt502) {
					if (local13.anInt500 > 0) {
						@Pc(43) Class3_Sub1_Sub1_Sub4_Sub2 local43 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local13.anInt500 - 1];
						if (local43 != null && local43.anInt754 >= 0 && local43.anInt754 < 13312 && local43.anInt755 >= 0 && local43.anInt755 < 13312) {
							local13.method346(this.method629(local13.anInt508, local43.anInt755, local43.anInt754) - local13.anInt507, (byte) 6, local43.anInt754, local43.anInt755, anInt1050);
						}
					}
					if (local13.anInt500 < 0) {
						@Pc(88) int local88 = -local13.anInt500 - 1;
						@Pc(94) Class3_Sub1_Sub1_Sub4_Sub1 local94;
						if (local88 == this.anInt1035) {
							local94 = aClass3_Sub1_Sub1_Sub4_Sub1_1;
						} else {
							local94 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local88];
						}
						if (local94 != null && local94.anInt754 >= 0 && local94.anInt754 < 13312 && local94.anInt755 >= 0 && local94.anInt755 < 13312) {
							local13.method346(this.method629(local13.anInt508, local94.anInt755, local94.anInt754) - local13.anInt507, (byte) 6, local94.anInt754, local94.anInt755, anInt1050);
						}
					}
					local13.method347(this.anInt953);
					this.aClass36_1.method391((int) local13.aDouble6, 60, local13, this.anInt858, local13.anInt509, -1, (int) local13.aDouble7, (int) local13.aDouble8, false);
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("97630, " + 1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z")
	private boolean method610(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray228[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 918;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("80444, " + arg0 + ", " + -19 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!HZINZKXF;)Z")
	private boolean method611(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class13 arg1) {
		try {
			this.aBoolean237 &= arg0;
			@Pc(10) int local10 = arg1.anInt371;
			if (this.anInt1047 == 2) {
				if (local10 == 201) {
					this.aBoolean224 = true;
					this.anInt910 = 0;
					this.aBoolean232 = true;
					this.aString29 = "";
					this.anInt975 = 1;
					this.aString21 = "Enter name of friend to add to list";
				}
				if (local10 == 202) {
					this.aBoolean224 = true;
					this.anInt910 = 0;
					this.aBoolean232 = true;
					this.aString29 = "";
					this.anInt975 = 2;
					this.aString21 = "Enter name of friend to delete from list";
				}
			}
			if (local10 == 205) {
				this.anInt888 = 250;
				return true;
			}
			if (local10 == 501) {
				this.aBoolean224 = true;
				this.anInt910 = 0;
				this.aBoolean232 = true;
				this.aString29 = "";
				this.anInt975 = 4;
				this.aString21 = "Enter name of player to add to list";
			}
			if (local10 == 502) {
				this.aBoolean224 = true;
				this.anInt910 = 0;
				this.aBoolean232 = true;
				this.aString29 = "";
				this.anInt975 = 5;
				this.aString21 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local10 >= 300 && local10 <= 313) {
				local118 = (local10 - 300) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray246[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class34.anInt544 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class34.anInt544) {
								local127 = 0;
							}
						}
						if (!Class34.aClass34Array1[local127].aBoolean141 && Class34.aClass34Array1[local127].anInt545 == local118 + (this.aBoolean229 ? 0 : 7)) {
							this.anIntArray246[local118] = local127;
							this.aBoolean200 = true;
							break;
						}
					}
				}
			}
			if (local10 >= 314 && local10 <= 323) {
				local118 = (local10 - 314) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray232[local118];
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
				this.anIntArray232[local118] = local127;
				this.aBoolean200 = true;
			}
			if (local10 == 324 && !this.aBoolean229) {
				this.aBoolean229 = true;
				this.method696();
			}
			if (local10 == 325 && this.aBoolean229) {
				this.aBoolean229 = false;
				this.method696();
			}
			if (local10 == 326) {
				this.aClass3_Sub1_Sub3_8.method263(104);
				this.aClass3_Sub1_Sub3_8.method264(this.aBoolean229 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass3_Sub1_Sub3_8.method264(this.anIntArray246[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass3_Sub1_Sub3_8.method264(this.anIntArray232[local122]);
				}
				return true;
			}
			if (local10 == 620) {
				this.aBoolean228 = !this.aBoolean228;
			}
			if (local10 >= 601 && local10 <= 613) {
				this.method685();
				if (this.aString23.length() > 0) {
					this.aClass3_Sub1_Sub3_8.method263(96);
					this.aClass3_Sub1_Sub3_8.method270(Class38.method435(this.aString23));
					this.aClass3_Sub1_Sub3_8.method264(local10 - 601);
					this.aClass3_Sub1_Sub3_8.method264(this.aBoolean228 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("20401, " + arg0 + ", " + arg1 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!RZWMPYWU;)V")
	private void method612(@OriginalArg(0) byte arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub2 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray230.length; local15++) {
				this.anIntArray230[local15] = 0;
			}
			@Pc(40) int local40;
			for (@Pc(30) int local30 = 0; local30 < 5000; local30++) {
				local40 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray230[local40] = (int) (Math.random() * 256.0D);
			}
			@Pc(58) int local58;
			@Pc(62) int local62;
			@Pc(70) int local70;
			for (local40 = 0; local40 < 20; local40++) {
				for (local58 = 1; local58 < 255; local58++) {
					for (local62 = 1; local62 < 127; local62++) {
						local70 = local62 + (local58 << 7);
						this.anIntArray231[local70] = (this.anIntArray230[local70 - 1] + this.anIntArray230[local70 + 1] + this.anIntArray230[local70 - 128] + this.anIntArray230[local70 + 128]) / 4;
					}
				}
				@Pc(116) int[] local116 = this.anIntArray230;
				this.anIntArray230 = this.anIntArray231;
				this.anIntArray231 = local116;
			}
			if (arg1 != null) {
				local58 = 0;
				for (local62 = 0; local62 < arg1.anInt560; local62++) {
					for (local70 = 0; local70 < arg1.anInt559; local70++) {
						if (arg1.aByteArray13[local58++] != 0) {
							@Pc(152) int local152 = local70 + arg1.anInt561 + 16;
							@Pc(159) int local159 = local62 + arg1.anInt562 + 16;
							@Pc(165) int local165 = local152 + (local159 << 7);
							this.anIntArray230[local165] = 0;
						}
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("30190, " + arg0 + ", " + arg1 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method581() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass47_1 != null) {
					this.aClass47_1.method521();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass47_1 = null;
			this.method601();
			if (this.aClass23_1 != null) {
				this.aClass23_1.aBoolean100 = false;
			}
			this.aClass23_1 = null;
			this.aClass10_Sub1_1.method462();
			this.aClass10_Sub1_1 = null;
			this.aClass3_Sub1_Sub3_7 = null;
			this.aClass3_Sub1_Sub3_8 = null;
			this.aClass3_Sub1_Sub3_6 = null;
			this.aClass3_Sub1_Sub3_9 = null;
			this.anIntArray236 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray237 = null;
			this.anIntArray238 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass36_1 = null;
			this.aClass5Array1 = null;
			this.anIntArrayArray22 = null;
			this.anIntArrayArray25 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.aByteArray21 = null;
			this.aClass42_12 = null;
			this.aClass42_13 = null;
			this.aClass42_14 = null;
			this.aClass42_15 = null;
			this.aClass42_16 = null;
			this.aClass42_17 = null;
			this.aClass42_18 = null;
			this.aClass42_19 = null;
			this.aClass42_20 = null;
			this.aClass42_21 = null;
			this.aClass42_22 = null;
			this.aClass42_23 = null;
			this.aClass42_24 = null;
			this.aClass42_25 = null;
			this.aClass42_26 = null;
			this.aClass42_27 = null;
			this.aClass3_Sub1_Sub2_Sub2_11 = null;
			this.aClass3_Sub1_Sub2_Sub2_12 = null;
			this.aClass3_Sub1_Sub2_Sub2_13 = null;
			this.aClass3_Sub1_Sub2_Sub2_8 = null;
			this.aClass3_Sub1_Sub2_Sub2_9 = null;
			this.aClass3_Sub1_Sub2_Sub2_10 = null;
			this.aClass3_Sub1_Sub2_Sub2Array2 = null;
			this.aClass3_Sub1_Sub2_Sub2_14 = null;
			this.aClass3_Sub1_Sub2_Sub2_15 = null;
			this.aClass3_Sub1_Sub2_Sub2_16 = null;
			this.aClass3_Sub1_Sub2_Sub2_17 = null;
			this.aClass3_Sub1_Sub2_Sub2_18 = null;
			this.aClass3_Sub1_Sub2_Sub2_3 = null;
			this.aClass3_Sub1_Sub2_Sub2_4 = null;
			this.aClass3_Sub1_Sub2_Sub2_5 = null;
			this.aClass3_Sub1_Sub2_Sub2_6 = null;
			this.aClass3_Sub1_Sub2_Sub2_7 = null;
			this.aClass3_Sub1_Sub2_Sub4_10 = null;
			this.aClass3_Sub1_Sub2_Sub4Array9 = null;
			this.aClass3_Sub1_Sub2_Sub4Array6 = null;
			this.aClass3_Sub1_Sub2_Sub4Array5 = null;
			this.aClass3_Sub1_Sub2_Sub4Array8 = null;
			this.aClass3_Sub1_Sub2_Sub4Array10 = null;
			this.aClass3_Sub1_Sub2_Sub4_3 = null;
			this.aClass3_Sub1_Sub2_Sub4_13 = null;
			this.aClass3_Sub1_Sub2_Sub4_14 = null;
			this.aClass3_Sub1_Sub2_Sub4_15 = null;
			this.aClass3_Sub1_Sub2_Sub4_16 = null;
			this.aClass3_Sub1_Sub2_Sub4_17 = null;
			this.aClass3_Sub1_Sub2_Sub2Array5 = null;
			this.aClass3_Sub1_Sub2_Sub4Array7 = null;
			this.anIntArrayArray24 = null;
			this.aClass3_Sub1_Sub1_Sub4_Sub1Array1 = null;
			this.anIntArray251 = null;
			this.anIntArray252 = null;
			this.aClass3_Sub1_Sub3Array1 = null;
			this.anIntArray217 = null;
			this.aClass3_Sub1_Sub1_Sub4_Sub2Array1 = null;
			this.anIntArray245 = null;
			this.aClass27ArrayArrayArray1 = null;
			this.aClass27_11 = null;
			this.aClass27_12 = null;
			this.aClass27_10 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.anIntArray228 = null;
			this.anIntArray229 = null;
			this.aStringArray11 = null;
			this.anIntArray221 = null;
			this.anIntArray268 = null;
			this.anIntArray269 = null;
			this.aClass3_Sub1_Sub2_Sub4Array4 = null;
			this.aClass3_Sub1_Sub2_Sub4_6 = null;
			this.aStringArray10 = null;
			this.aLongArray4 = null;
			this.anIntArray234 = null;
			this.aClass42_6 = null;
			this.aClass42_7 = null;
			this.aClass42_3 = null;
			this.aClass42_4 = null;
			this.aClass42_5 = null;
			this.aClass42_8 = null;
			this.aClass42_9 = null;
			this.aClass42_10 = null;
			this.aClass42_11 = null;
			this.method654();
			Class26.method316();
			Class7.method89();
			Class12.method190();
			Class13.method196();
			Class39.aClass39Array1 = null;
			Class34.aClass34Array1 = null;
			Class9.aClass9Array1 = null;
			Class31.aClass31Array1 = null;
			Class6.aClass6Array1 = null;
			Class6.aClass49_1 = null;
			Class24.aClass24Array1 = null;
			super.aClass42_2 = null;
			Class3_Sub1_Sub1_Sub4_Sub1.aClass49_3 = null;
			Class3_Sub1_Sub2_Sub3.method499();
			Class36.method379();
			Class3_Sub1_Sub1_Sub1.method29();
			Class18.method208();
			System.gc();
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("69156, " + -21214 + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method586(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt821 = arg0;
			this.aString27 = arg1;
			this.method657();
			if (this.aClass14_2 == null) {
				super.method586(arg0, arg1);
			} else {
				this.aClass42_5.method467((byte) 6);
				this.aClass3_Sub1_Sub2_Sub1_4.method120(16777215, 180, "RuneScape is loading - please wait...", 54);
				Class3_Sub1_Sub2.method555(9179409, 62, 304, 34, 28);
				Class3_Sub1_Sub2.method555(0, 63, 302, 32, 29);
				Class3_Sub1_Sub2.method554(30, 9179409, 30, 64, arg0 * 3);
				Class3_Sub1_Sub2.method554(arg0 * 3 + 30, 0, 30, 64, 300 - arg0 * 3);
				this.aClass3_Sub1_Sub2_Sub1_4.method120(16777215, 180, arg1, 85);
				this.aClass42_5.method468(202, 171, super.aGraphics2);
				if (this.aBoolean221) {
					this.aBoolean221 = false;
					if (!this.aBoolean238) {
						this.aClass42_6.method468(0, 0, super.aGraphics2);
						this.aClass42_7.method468(637, 0, super.aGraphics2);
					}
					this.aClass42_3.method468(128, 0, super.aGraphics2);
					this.aClass42_4.method468(202, 371, super.aGraphics2);
					this.aClass42_8.method468(0, 265, super.aGraphics2);
					this.aClass42_9.method468(562, 265, super.aGraphics2);
					this.aClass42_10.method468(128, 171, super.aGraphics2);
					this.aClass42_11.method468(562, 171, super.aGraphics2);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("27767, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			this.aBoolean221 = true;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("47000, " + 9 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
	private void method613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass3_Sub1_Sub2_Sub2_1.method373(arg1, arg2);
			this.aClass3_Sub1_Sub2_Sub2_2.method373(arg1, arg2 + arg4 - 16);
			Class3_Sub1_Sub2.method554(arg1, this.anInt872, arg4 - 32, arg2 + 16, 16);
			@Pc(35) int local35 = (arg4 - 32) * arg4 / arg0;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg4 - local35 - 32) * arg3 / (arg0 - arg4);
			Class3_Sub1_Sub2.method554(arg1, this.anInt864, local35, arg2 + local52 + 16, 16);
			Class3_Sub1_Sub2.method559(this.anInt882, arg2 + local52 + 16, arg1, 834, local35);
			Class3_Sub1_Sub2.method559(this.anInt882, arg2 + local52 + 16, arg1 + 1, 834, local35);
			Class3_Sub1_Sub2.method557(arg2 + local52 + 16, this.anInt882, arg1, 16);
			Class3_Sub1_Sub2.method557(arg2 + local52 + 17, this.anInt882, arg1, 16);
			Class3_Sub1_Sub2.method559(this.anInt889, arg2 + local52 + 16, arg1 + 15, 834, local35);
			Class3_Sub1_Sub2.method559(this.anInt889, arg2 + local52 + 17, arg1 + 14, 834, local35 - 1);
			Class3_Sub1_Sub2.method557(arg2 + local52 + local35 + 15, this.anInt889, arg1, 16);
			Class3_Sub1_Sub2.method557(arg2 + local52 + local35 + 14, this.anInt889, arg1 + 1, 15);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("77054, " + 85 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method614(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt1039 == 0 && this.anInt899 == 0) {
				this.aStringArray11[this.anInt1053] = "Walk here";
				this.anIntArray228[this.anInt1053] = 872;
				this.anIntArray226[this.anInt1053] = super.anInt808;
				this.anIntArray227[this.anInt1053] = super.anInt809;
				this.anInt1053++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class3_Sub1_Sub1_Sub1.anInt76; local43++) {
				@Pc(49) int local49 = Class3_Sub1_Sub1_Sub1.anIntArray41[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass36_1.method410(this.anInt858, local53, local59, local49) >= 0) {
						@Pc(91) Class26 local91 = Class26.method313(local71);
						if (local91.anIntArray119 != null) {
							local91 = local91.method323();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt1039 == 1) {
							this.aStringArray11[this.anInt1053] = "Use " + this.aString30 + " with @cya@" + local91.aString12;
							this.anIntArray228[this.anInt1053] = 677;
							this.anIntArray229[this.anInt1053] = local49;
							this.anIntArray226[this.anInt1053] = local53;
							this.anIntArray227[this.anInt1053] = local59;
							this.anInt1053++;
						} else if (this.anInt899 != 1) {
							if (local91.aStringArray6 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray6[local218] != null) {
										this.aStringArray11[this.anInt1053] = local91.aStringArray6[local218] + " @cya@" + local91.aString12;
										if (local218 == 0) {
											this.anIntArray228[this.anInt1053] = 673;
										}
										if (local218 == 1) {
											this.anIntArray228[this.anInt1053] = 795;
										}
										if (local218 == 2) {
											this.anIntArray228[this.anInt1053] = 652;
										}
										if (local218 == 3) {
											this.anIntArray228[this.anInt1053] = 307;
										}
										if (local218 == 4) {
											this.anIntArray228[this.anInt1053] = 1238;
										}
										this.anIntArray229[this.anInt1053] = local49;
										this.anIntArray226[this.anInt1053] = local53;
										this.anIntArray227[this.anInt1053] = local59;
										this.anInt1053++;
									}
								}
							}
							this.aStringArray11[this.anInt1053] = "Examine @cya@" + local91.aString12;
							this.anIntArray228[this.anInt1053] = 1788;
							this.anIntArray229[this.anInt1053] = local91.anInt449 << 14;
							this.anIntArray226[this.anInt1053] = local53;
							this.anIntArray227[this.anInt1053] = local59;
							this.anInt1053++;
						} else if ((this.anInt901 & 0x4) == 4) {
							this.aStringArray11[this.anInt1053] = this.aString20 + " @cya@" + local91.aString12;
							this.anIntArray228[this.anInt1053] = 45;
							this.anIntArray229[this.anInt1053] = local49;
							this.anIntArray226[this.anInt1053] = local53;
							this.anIntArray227[this.anInt1053] = local59;
							this.anInt1053++;
						}
					}
					@Pc(398) Class3_Sub1_Sub1_Sub4_Sub2 local398;
					@Pc(446) Class3_Sub1_Sub1_Sub4_Sub1 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class3_Sub1_Sub1_Sub4_Sub2 local369 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local71];
						if (local369.aClass7_2.aByte2 == 1 && (local369.anInt754 & 0x7F) == 64 && (local369.anInt755 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt987; local218++) {
								local398 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray245[local218]];
								if (local398 != null && local398 != local369 && local398.aClass7_2.aByte2 == 1 && local398.anInt754 == local369.anInt754 && local398.anInt755 == local369.anInt755) {
									this.method686(this.anIntArray245[local218], local59, local398.aClass7_2, local53);
								}
							}
							for (local436 = 0; local436 < this.anInt1012; local436++) {
								local446 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray251[local436]];
								if (local446 != null && local446.anInt754 == local369.anInt754 && local446.anInt755 == local369.anInt755) {
									this.method710(this.anIntArray251[local436], local59, local446, local53);
								}
							}
						}
						this.method686(local71, local59, local369.aClass7_2, local53);
					}
					if (local65 == 0) {
						@Pc(488) Class3_Sub1_Sub1_Sub4_Sub1 local488 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local71];
						if ((local488.anInt754 & 0x7F) == 64 && (local488.anInt755 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt987; local218++) {
								local398 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray245[local218]];
								if (local398 != null && local398.aClass7_2.aByte2 == 1 && local398.anInt754 == local488.anInt754 && local398.anInt755 == local488.anInt755) {
									this.method686(this.anIntArray245[local218], local59, local398.aClass7_2, local53);
								}
							}
							for (local436 = 0; local436 < this.anInt1012; local436++) {
								local446 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray251[local436]];
								if (local446 != null && local446 != local488 && local446.anInt754 == local488.anInt754 && local446.anInt755 == local488.anInt755) {
									this.method710(this.anIntArray251[local436], local59, local446, local53);
								}
							}
						}
						this.method710(local71, local59, local488, local53);
					}
					if (local65 == 3) {
						@Pc(607) Class27 local607 = this.aClass27ArrayArrayArray1[this.anInt858][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class3_Sub1_Sub1_Sub3 local614 = (Class3_Sub1_Sub1_Sub3) local607.method328(); local614 != null; local614 = (Class3_Sub1_Sub1_Sub3) local607.method330()) {
								@Pc(620) Class12 local620 = Class12.method179(local614.anInt115);
								if (this.anInt1039 == 1) {
									this.aStringArray11[this.anInt1053] = "Use " + this.aString30 + " with @lre@" + local620.aString5;
									this.anIntArray228[this.anInt1053] = 800;
									this.anIntArray229[this.anInt1053] = local614.anInt115;
									this.anIntArray226[this.anInt1053] = local53;
									this.anIntArray227[this.anInt1053] = local59;
									this.anInt1053++;
								} else if (this.anInt899 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray3 != null && local620.aStringArray3[local737] != null) {
											this.aStringArray11[this.anInt1053] = local620.aStringArray3[local737] + " @lre@" + local620.aString5;
											if (local737 == 0) {
												this.anIntArray228[this.anInt1053] = 948;
											}
											if (local737 == 1) {
												this.anIntArray228[this.anInt1053] = 816;
											}
											if (local737 == 2) {
												this.anIntArray228[this.anInt1053] = 185;
											}
											if (local737 == 3) {
												this.anIntArray228[this.anInt1053] = 405;
											}
											if (local737 == 4) {
												this.anIntArray228[this.anInt1053] = 309;
											}
											this.anIntArray229[this.anInt1053] = local614.anInt115;
											this.anIntArray226[this.anInt1053] = local53;
											this.anIntArray227[this.anInt1053] = local59;
											this.anInt1053++;
										} else if (local737 == 2) {
											this.aStringArray11[this.anInt1053] = "Take @lre@" + local620.aString5;
											this.anIntArray228[this.anInt1053] = 185;
											this.anIntArray229[this.anInt1053] = local614.anInt115;
											this.anIntArray226[this.anInt1053] = local53;
											this.anIntArray227[this.anInt1053] = local59;
											this.anInt1053++;
										}
									}
									this.aStringArray11[this.anInt1053] = "Examine @lre@" + local620.aString5;
									this.anIntArray228[this.anInt1053] = 1249;
									this.anIntArray229[this.anInt1053] = local614.anInt115;
									this.anIntArray226[this.anInt1053] = local53;
									this.anIntArray227[this.anInt1053] = local59;
									this.anInt1053++;
								} else if ((this.anInt901 & 0x1) == 1) {
									this.aStringArray11[this.anInt1053] = this.aString20 + " @lre@" + local620.aString5;
									this.anIntArray228[this.anInt1053] = 807;
									this.anIntArray229[this.anInt1053] = local614.anInt115;
									this.anIntArray226[this.anInt1053] = local53;
									this.anIntArray227[this.anInt1053] = local59;
									this.anInt1053++;
								}
							}
						}
					}
				}
			}
			@Pc(946) boolean local946 = false;
		} catch (@Pc(948) RuntimeException local948) {
			signlink.reporterror("44847, " + arg0 + ", " + local948.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method615() {
		try {
			this.anInt884 += 0;
			try {
				@Pc(13) int local13 = aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 + this.anInt853;
				@Pc(19) int local19 = aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 + this.anInt1043;
				if (this.anInt988 - local13 < -500 || this.anInt988 - local13 > 500 || this.anInt989 - local19 < -500 || this.anInt989 - local19 > 500) {
					this.anInt988 = local13;
					this.anInt989 = local19;
				}
				if (this.anInt988 != local13) {
					this.anInt988 += (local13 - this.anInt988) / 16;
				}
				if (this.anInt989 != local19) {
					this.anInt989 += (local19 - this.anInt989) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt981 += (-this.anInt981 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt981 += (24 - this.anInt981) / 2;
				} else {
					this.anInt981 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt982 += (12 - this.anInt982) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt982 += (-this.anInt982 - 12) / 2;
				} else {
					this.anInt982 /= 2;
				}
				this.anInt980 = this.anInt980 + this.anInt981 / 2 & 0x7FF;
				this.anInt979 += this.anInt982 / 2;
				if (this.anInt979 < 128) {
					this.anInt979 = 128;
				}
				if (this.anInt979 > 383) {
					this.anInt979 = 383;
				}
				@Pc(206) int local206 = this.anInt988 >> 7;
				@Pc(211) int local211 = this.anInt989 >> 7;
				@Pc(221) int local221 = this.method629(this.anInt858, this.anInt989, this.anInt988);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt858;
							if (local250 < 3 && (this.aByteArrayArrayArray8[1][local239][local245] & 0x2) == 2) {
								local250++;
							}
							@Pc(277) int local277 = local221 - this.anIntArrayArrayArray7[local250][local239][local245];
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
				signlink.reporterror("glfc_ex " + aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 + "," + aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 + "," + this.anInt988 + "," + this.anInt989 + "," + this.anInt819 + "," + this.anInt820 + "," + this.anInt957 + "," + this.anInt958);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("36756, " + 0 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method616() {
		try {
			if (aBoolean243 && this.anInt946 == 2 && Class8.anInt178 != this.anInt858) {
				this.method719("Loading - please wait.", (String) null);
				this.anInt946 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt946 == 1) {
				@Pc(34) int local34 = this.method617();
				if (local34 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString18 + " glcfb " + this.aLong29 + "," + local34 + "," + aBoolean243 + "," + this.aClass44Array1[0] + "," + this.aClass10_Sub1_1.method461() + "," + this.anInt858 + "," + this.anInt819 + "," + this.anInt820);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt946 == 2 && this.anInt858 != this.anInt822) {
				this.anInt822 = this.anInt858;
				this.method722(this.anInt858);
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("69135, " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)I")
	private int method617() {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.aByteArrayArray6.length; local9++) {
				if (this.aByteArrayArray6[local9] == null && this.anIntArray237[local9] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local9] == null && this.anIntArray238[local9] != -1) {
					return -2;
				}
			}
			@Pc(45) boolean local45 = true;
			for (@Pc(47) int local47 = 0; local47 < this.aByteArrayArray6.length; local47++) {
				@Pc(54) byte[] local54 = this.aByteArrayArray5[local47];
				if (local54 != null) {
					@Pc(68) int local68 = (this.anIntArray236[local47] >> 8) * 64 - this.anInt957;
					@Pc(80) int local80 = (this.anIntArray236[local47] & 0xFF) * 64 - this.anInt958;
					if (this.aBoolean212) {
						local68 = 10;
						local80 = 10;
					}
					local45 &= Class8.method141(local80, local68, local54);
				}
			}
			if (!local45) {
				return -3;
			} else if (this.aBoolean227) {
				return -4;
			} else {
				this.anInt946 = 2;
				Class8.anInt178 = this.anInt858;
				this.method607();
				this.aClass3_Sub1_Sub3_8.method263(223);
				return 0;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("94058, " + 8 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method618() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt1012; local3++) {
				if (local3 == -1) {
					local11 = this.anInt1011;
				} else {
					local11 = this.anIntArray251[local3];
				}
				@Pc(23) Class3_Sub1_Sub1_Sub4_Sub1 local23 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local11];
				if (local23 != null) {
					this.method640(1, local23, this.aByte27);
				}
			}
			anInt994++;
			if (anInt994 > 1283) {
				anInt994 = 0;
				this.aClass3_Sub1_Sub3_8.method263(91);
				this.aClass3_Sub1_Sub3_8.method264(0);
				local11 = this.aClass3_Sub1_Sub3_8.anInt441;
				this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
				this.aClass3_Sub1_Sub3_8.method264(50);
				this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
				this.aClass3_Sub1_Sub3_8.method264((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
				this.aClass3_Sub1_Sub3_8.method264(101);
				this.aClass3_Sub1_Sub3_8.method264(204);
				this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
				this.aClass3_Sub1_Sub3_8.method264((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub3_8.method265(26268);
				this.aClass3_Sub1_Sub3_8.method273(this.aClass3_Sub1_Sub3_8.anInt441 - local11);
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("31205, " + 63 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method619() {
		try {
			if (super.aClass42_2 == null) {
				this.method654();
				this.aClass42_3 = null;
				this.aClass42_4 = null;
				this.aClass42_5 = null;
				this.aClass42_6 = null;
				this.aClass42_7 = null;
				this.aClass42_8 = null;
				this.aClass42_9 = null;
				this.aClass42_10 = null;
				this.aClass42_11 = null;
				this.aClass42_15 = null;
				this.aClass42_13 = null;
				this.aClass42_12 = null;
				this.aClass42_14 = null;
				this.aClass42_16 = null;
				this.aClass42_17 = null;
				this.aClass42_18 = null;
				super.aClass42_2 = new Class42(503, 5, 765, this.method584());
				this.aBoolean221 = true;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("67630, " + 7182 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method621(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 4) {
				this.aBoolean223 = !this.aBoolean223;
			}
			@Pc(22) int local22;
			for (@Pc(14) int local14 = -1; local14 < this.anInt1012; local14++) {
				if (local14 == -1) {
					local22 = this.anInt1011;
				} else {
					local22 = this.anIntArray251[local14];
				}
				@Pc(34) Class3_Sub1_Sub1_Sub4_Sub1 local34 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local22];
				if (local34 != null && local34.anInt719 > 0) {
					local34.anInt719--;
					if (local34.anInt719 == 0) {
						local34.aString16 = null;
					}
				}
			}
			for (local22 = 0; local22 < this.anInt987; local22++) {
				@Pc(65) int local65 = this.anIntArray245[local22];
				@Pc(70) Class3_Sub1_Sub1_Sub4_Sub2 local70 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local65];
				if (local70 != null && local70.anInt719 > 0) {
					local70.anInt719--;
					if (local70.anInt719 == 0) {
						local70.aString16 = null;
					}
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("63174, " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method622() {
		try {
			if (this.anInt970 != 0) {
				@Pc(12) int local12 = 0;
				if (this.anInt1003 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray9[local19] != null) {
						@Pc(31) int local31 = this.anIntArray212[local19];
						@Pc(36) String local36 = this.aStringArray8[local19];
						if (local36 != null && local36.startsWith("@cr1@")) {
							local36 = local36.substring(5);
						}
						if (local36 != null && local36.startsWith("@cr2@")) {
							local36 = local36.substring(5);
						}
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt913 == 0 || this.anInt913 == 1 && this.method689(local36))) {
							@Pc(89) int local89 = 329 - local12 * 13;
							if (super.anInt808 > 4 && super.anInt809 - 4 > local89 - 10 && super.anInt809 - 4 <= local89 + 3) {
								@Pc(128) int local128 = this.aClass3_Sub1_Sub2_Sub1_3.method122("From:  " + local36 + this.aStringArray9[local19]) + 25;
								if (local128 > 450) {
									local128 = 450;
								}
								if (super.anInt808 < local128 + 4) {
									if (this.anInt857 >= 1) {
										this.aStringArray11[this.anInt1053] = "Report abuse @whi@" + local36;
										this.anIntArray228[this.anInt1053] = 2345;
										this.anInt1053++;
									}
									this.aStringArray11[this.anInt1053] = "Add ignore @whi@" + local36;
									this.anIntArray228[this.anInt1053] = 2648;
									this.anInt1053++;
									this.aStringArray11[this.anInt1053] = "Add friend @whi@" + local36;
									this.anIntArray228[this.anInt1053] = 2918;
									this.anInt1053++;
								}
							}
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if ((local31 == 5 || local31 == 6) && this.anInt913 < 2) {
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("276, " + 10361 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(12) int local12 = this.aClass36_1.method406(arg4, arg5, arg0);
			@Pc(22) int local22;
			@Pc(28) int local28;
			@Pc(32) int local32;
			@Pc(34) int local34;
			@Pc(56) int local56;
			@Pc(62) int local62;
			if (local12 != 0) {
				local22 = this.aClass36_1.method410(arg4, arg5, arg0, local12);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = arg2;
				if (local12 > 0) {
					local34 = arg1;
				}
				@Pc(42) int[] local42 = this.aClass3_Sub1_Sub2_Sub4_6.anIntArray209;
				local56 = arg5 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local62 = local12 >> 14 & 0x7FFF;
				@Pc(65) Class26 local65 = Class26.method313(local62);
				if (local65.anInt459 == -1) {
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
					@Pc(75) Class3_Sub1_Sub2_Sub2 local75 = this.aClass3_Sub1_Sub2_Sub2Array5[local65.anInt459];
					if (local75 != null) {
						@Pc(87) int local87 = (local65.anInt446 * 4 - local75.anInt559) / 2;
						@Pc(97) int local97 = (local65.anInt458 * 4 - local75.anInt560) / 2;
						local75.method373(arg5 * 4 + local87 + 48, 48 + (104 - arg0 - local65.anInt458) * 4 + local97);
					}
				}
			}
			local12 = this.aClass36_1.method408(arg4, arg5, arg0);
			if (local12 != 0) {
				local22 = this.aClass36_1.method410(arg4, arg5, arg0, local12);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = local12 >> 14 & 0x7FFF;
				@Pc(451) Class26 local451 = Class26.method313(local34);
				@Pc(483) int local483;
				if (local451.anInt459 != -1) {
					@Pc(461) Class3_Sub1_Sub2_Sub2 local461 = this.aClass3_Sub1_Sub2_Sub2Array5[local451.anInt459];
					if (local461 != null) {
						local62 = (local451.anInt446 * 4 - local461.anInt559) / 2;
						local483 = (local451.anInt458 * 4 - local461.anInt560) / 2;
						local461.method373(arg5 * 4 + local62 + 48, 48 + (104 - arg0 - local451.anInt458) * 4 + local483);
					}
				} else if (local32 == 9) {
					local56 = 15658734;
					if (local12 > 0) {
						local56 = 15597568;
					}
					@Pc(520) int[] local520 = this.aClass3_Sub1_Sub2_Sub4_6.anIntArray209;
					local483 = arg5 * 4 + (103 - arg0) * 512 * 4 + 24624;
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
			local12 = this.aClass36_1.method409(arg4, arg5, arg0);
			if (local12 != 0) {
				local22 = local12 >> 14 & 0x7FFF;
				@Pc(615) Class26 local615 = Class26.method313(local22);
				if (local615.anInt459 != -1) {
					@Pc(625) Class3_Sub1_Sub2_Sub2 local625 = this.aClass3_Sub1_Sub2_Sub2Array5[local615.anInt459];
					if (local625 != null) {
						local34 = (local615.anInt446 * 4 - local625.anInt559) / 2;
						@Pc(647) int local647 = (local615.anInt458 * 4 - local625.anInt560) / 2;
						local625.method373(arg5 * 4 + local34 + 48, 48 + (104 - arg0 - local615.anInt458) * 4 + local647);
						return;
					}
				}
			}
		} catch (@Pc(671) RuntimeException local671) {
			signlink.reporterror("12878, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local671.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method624() {
		try {
			Class26.aClass49_8.method544();
			Class26.aClass49_9.method544();
			Class7.aClass49_2.method544();
			Class12.aClass49_4.method544();
			Class12.aClass49_5.method544();
			Class3_Sub1_Sub1_Sub4_Sub1.aClass49_3.method544();
			Class6.aClass49_1.method544();
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("6565, " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method580() {
		try {
			if (!this.aBoolean231 && !this.aBoolean218 && !this.aBoolean214) {
				anInt1050++;
				if (this.aBoolean237) {
					this.method664();
				} else {
					this.method647();
				}
				this.method721();
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("72889, " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)I")
	private int method625() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt838 < 310) {
				@Pc(17) int local17 = this.anInt835 >> 7;
				@Pc(22) int local22 = this.anInt837 >> 7;
				@Pc(27) int local27 = aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 >> 7;
				@Pc(32) int local32 = aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt858][local17][local22] & 0x4) != 0) {
					local3 = this.anInt858;
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
						if ((this.aByteArrayArrayArray8[this.anInt858][local17][local22] & 0x4) != 0) {
							local3 = this.anInt858;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt858][local17][local22] & 0x4) != 0) {
								local3 = this.anInt858;
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
						if ((this.aByteArrayArrayArray8[this.anInt858][local17][local22] & 0x4) != 0) {
							local3 = this.anInt858;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt858][local17][local22] & 0x4) != 0) {
								local3 = this.anInt858;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt858][aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 >> 7][aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 >> 7] & 0x4) != 0) {
				local3 = this.anInt858;
			}
			return local3;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("15601, " + true + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)I")
	private int method626() {
		try {
			this.aBoolean237 &= true;
			@Pc(15) int local15 = this.method629(this.anInt858, this.anInt837, this.anInt835);
			return local15 - this.anInt836 >= 800 || (this.aByteArrayArrayArray8[this.anInt858][this.anInt835 >> 7][this.anInt837 >> 7] & 0x4) == 0 ? 3 : this.anInt858;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("90320, " + true + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			if (this.aBoolean231 || this.aBoolean218 || this.aBoolean214) {
				this.method676();
			} else {
				anInt934++;
				if (this.aBoolean237) {
					this.method646();
				} else {
					this.method648(false);
				}
				this.anInt859 = 0;
				this.anInt884 += 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("99085, " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method627(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1046; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt1046--;
						this.aBoolean207 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1046; local28++) {
							this.aStringArray10[local28] = this.aStringArray10[local28 + 1];
							this.anIntArray234[local28] = this.anIntArray234[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass3_Sub1_Sub3_8.method263(202);
						this.aClass3_Sub1_Sub3_8.method270(arg0);
						break;
					}
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("94445, " + -33590 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method628(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			signlink.anInt1060 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("24577, " + arg0 + ", " + arg1 + ", " + -930 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 7;
			@Pc(11) int local11 = arg1 >> 7;
			if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
				return 0;
			}
			@Pc(25) int local25 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray8[1][local7][local11] & 0x2) == 2) {
				local25 = arg0 + 1;
			}
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(49) int local49 = arg1 & 0x7F;
			@Pc(77) int local77 = this.anIntArrayArrayArray7[local25][local7][local11] * (128 - local45) + this.anIntArrayArrayArray7[local25][local7 + 1][local11] * local45 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray7[local25][local7][local11 + 1] * (128 - local45) + this.anIntArrayArrayArray7[local25][local7 + 1][local11 + 1] * local45 >> 7;
			return local77 * (128 - local49) + local109 * local49 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("83081, " + arg0 + ", " + arg1 + ", " + -430 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method630(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt987; local1++) {
				@Pc(11) Class3_Sub1_Sub1_Sub4_Sub2 local11 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray245[local1]];
				@Pc(20) int local20 = (this.anIntArray245[local1] << 14) + 536870912;
				if (local11 != null && local11.method536(29) && local11.aClass7_2.aBoolean38 == arg0 && local11.aClass7_2.method88()) {
					@Pc(41) int local41 = local11.anInt754 >> 7;
					@Pc(46) int local46 = local11.anInt755 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt728 == 1 && (local11.anInt754 & 0x7F) == 64 && (local11.anInt755 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local41][local46] == this.anInt945) {
								continue;
							}
							this.anIntArrayArray24[local41][local46] = this.anInt945;
						}
						if (!local11.aClass7_2.aBoolean41) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass36_1.method391(local11.anInt754, (local11.anInt728 - 1) * 64 + 60, local11, this.anInt858, local11.anInt756, local20, local11.anInt755, this.method629(this.anInt858, local11.anInt755, local11.anInt754), local11.aBoolean185);
					}
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("22317, " + arg0 + ", " + -19874 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NHEPCMLW;I)V")
	private void method631(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			arg1.method284();
			@Pc(8) boolean local8 = false;
			@Pc(13) int local13 = arg1.method285(8);
			@Pc(19) int local19;
			if (local13 < this.anInt987) {
				for (local19 = local13; local19 < this.anInt987; local19++) {
					this.anIntArray217[this.anInt861++] = this.anIntArray245[local19];
				}
			}
			if (local13 > this.anInt987) {
				signlink.reporterror(this.aString18 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt987 = 0;
			for (local19 = 0; local19 < local13; local19++) {
				@Pc(71) int local71 = this.anIntArray245[local19];
				@Pc(76) Class3_Sub1_Sub1_Sub4_Sub2 local76 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local71];
				@Pc(81) int local81 = arg1.method285(1);
				if (local81 == 0) {
					this.anIntArray245[this.anInt987++] = local71;
					local76.anInt720 = anInt1050;
				} else {
					@Pc(104) int local104 = arg1.method285(2);
					if (local104 == 0) {
						this.anIntArray245[this.anInt987++] = local71;
						local76.anInt720 = anInt1050;
						this.anIntArray252[this.anInt1013++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray245[this.anInt987++] = local71;
							local76.anInt720 = anInt1050;
							local155 = arg1.method285(3);
							local76.method539(false, local155);
							local165 = arg1.method285(1);
							if (local165 == 1) {
								this.anIntArray252[this.anInt1013++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray245[this.anInt987++] = local71;
							local76.anInt720 = anInt1050;
							local155 = arg1.method285(3);
							local76.method539(true, local155);
							local165 = arg1.method285(3);
							local76.method539(true, local165);
							@Pc(223) int local223 = arg1.method285(1);
							if (local223 == 1) {
								this.anIntArray252[this.anInt1013++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray217[this.anInt861++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("88175, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method632(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt910 != 0) {
					this.anInt910 = 0;
					this.aBoolean224 = true;
				}
				@Pc(18) int local18 = this.anIntArray226[arg0];
				@Pc(23) int local23 = this.anIntArray227[arg0];
				@Pc(28) int local28 = this.anIntArray228[arg0];
				@Pc(33) int local33 = this.anIntArray229[arg0];
				this.aBoolean237 &= true;
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(51) Class3_Sub1_Sub1_Sub4_Sub1 local51;
				if (local28 == 996) {
					local51 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local33];
					if (local51 != null) {
						this.method588(0, local51.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local51.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
						this.anInt830 = super.anInt814;
						this.anInt831 = super.anInt815;
						this.anInt833 = 2;
						this.anInt832 = 0;
						this.aClass3_Sub1_Sub3_8.method263(21);
						this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
					}
				}
				if (local28 == 795) {
					this.method702(local18, local23, local33, 504);
					this.aClass3_Sub1_Sub3_8.method263(78);
					this.aClass3_Sub1_Sub3_8.method298(local33 >> 14 & 0x7FFF);
					this.aClass3_Sub1_Sub3_8.method265(local18 + this.anInt957);
					this.aClass3_Sub1_Sub3_8.method298(local23 + this.anInt958);
				}
				if (local28 == 87) {
					this.anInt1039 = 1;
					this.anInt1040 = local18;
					this.anInt1041 = local23;
					this.anInt1042 = local33;
					this.aString30 = Class12.method179(local33).aString5;
					this.anInt899 = 0;
					this.aBoolean207 = true;
				} else {
					@Pc(195) boolean local195;
					if (local28 == 816) {
						local195 = this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
						if (!local195) {
							this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
						}
						this.anInt830 = super.anInt814;
						this.anInt831 = super.anInt815;
						this.anInt833 = 2;
						this.anInt832 = 0;
						this.aClass3_Sub1_Sub3_8.method263(9);
						this.aClass3_Sub1_Sub3_8.method299(local33, this.aBoolean211);
						this.aClass3_Sub1_Sub3_8.method265(local18 + this.anInt957);
						this.aClass3_Sub1_Sub3_8.method265(local23 + this.anInt958);
					}
					if (local28 == 214 && !this.aBoolean213) {
						this.aClass3_Sub1_Sub3_8.method263(214);
						this.aClass3_Sub1_Sub3_8.method265(local23);
						this.aBoolean213 = true;
					}
					@Pc(308) int local308;
					@Pc(290) Class13 local290;
					if (local28 == 597) {
						this.aClass3_Sub1_Sub3_8.method263(80);
						this.aClass3_Sub1_Sub3_8.method265(local23);
						local290 = Class13.method194(local23);
						if (local290.anIntArrayArray7 != null && local290.anIntArrayArray7[0][0] == 5) {
							local308 = local290.anIntArrayArray7[0][1];
							if (this.anIntArray221[local308] != local290.anIntArray91[0]) {
								this.anIntArray221[local308] = local290.anIntArray91[0];
								this.method661(local308);
								this.aBoolean207 = true;
							}
						}
					}
					if (local28 == 1238) {
						this.method702(local18, local23, local33, 504);
						this.aClass3_Sub1_Sub3_8.method263(113);
						this.aClass3_Sub1_Sub3_8.method298(local33 >> 14 & 0x7FFF);
						this.aClass3_Sub1_Sub3_8.method297(local23 + this.anInt958, this.aBoolean203);
						this.aClass3_Sub1_Sub3_8.method299(local18 + this.anInt957, this.aBoolean211);
					}
					if (local28 == 623) {
						local290 = Class13.method194(local23);
						@Pc(382) boolean local382 = true;
						if (local290.anInt371 > 0) {
							local382 = this.method611(aBoolean233, local290);
						}
						if (local382) {
							this.aClass3_Sub1_Sub3_8.method263(80);
							this.aClass3_Sub1_Sub3_8.method265(local23);
						}
					}
					@Pc(426) String local426;
					@Pc(441) String local441;
					if (local28 == 943) {
						local290 = Class13.method194(local23);
						this.anInt899 = 1;
						this.anInt900 = local23;
						this.anInt901 = local290.anInt350;
						this.anInt1039 = 0;
						this.aBoolean207 = true;
						local426 = local290.aString9;
						if (local426.indexOf(" ") != -1) {
							local426 = local426.substring(0, local426.indexOf(" "));
						}
						local441 = local290.aString9;
						if (local441.indexOf(" ") != -1) {
							local441 = local441.substring(local441.indexOf(" ") + 1);
						}
						this.aString20 = local426 + " " + local290.aString6 + " " + local441;
						if (this.anInt901 == 16) {
							this.aBoolean207 = true;
							this.anInt922 = 3;
							this.aBoolean226 = true;
						}
					} else {
						@Pc(493) Class3_Sub1_Sub1_Sub4_Sub2 local493;
						if (local28 == 58) {
							local493 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local33];
							if (local493 != null) {
								this.method588(0, local493.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local493.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(231);
								this.aClass3_Sub1_Sub3_8.method265(this.anInt1040);
								this.aClass3_Sub1_Sub3_8.method297(this.anInt1042, this.aBoolean203);
								this.aClass3_Sub1_Sub3_8.method297(this.anInt1041, this.aBoolean203);
								this.aClass3_Sub1_Sub3_8.method298(local33);
							}
						}
						if (local28 == 807) {
							local195 = this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
							if (!local195) {
								this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
							}
							this.anInt830 = super.anInt814;
							this.anInt831 = super.anInt815;
							this.anInt833 = 2;
							this.anInt832 = 0;
							this.aClass3_Sub1_Sub3_8.method263(99);
							this.aClass3_Sub1_Sub3_8.method298(local18 + this.anInt957);
							this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method297(this.anInt900, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method265(local23 + this.anInt958);
						}
						if (local28 == 320) {
							this.aClass3_Sub1_Sub3_8.method263(165);
							this.aClass3_Sub1_Sub3_8.method299(local33, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method299(this.anInt1041, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method265(local23);
							this.aClass3_Sub1_Sub3_8.method298(local18);
							this.aClass3_Sub1_Sub3_8.method299(this.anInt1042, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method299(this.anInt1040, this.aBoolean211);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 478) {
							this.aClass3_Sub1_Sub3_8.method263(234);
							this.aClass3_Sub1_Sub3_8.method298(local23);
							this.aClass3_Sub1_Sub3_8.method298(local33);
							this.aClass3_Sub1_Sub3_8.method299(local18, this.aBoolean211);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						@Pc(793) Class12 local793;
						if (local28 == 1249) {
							local793 = Class12.method179(local33);
							if (local793.aByteArray2 == null) {
								local426 = "It's a " + local793.aString5 + ".";
							} else {
								local426 = new String(local793.aByteArray2);
							}
							this.method681("", local426, 0);
						}
						if (local28 == 641) {
							this.aClass3_Sub1_Sub3_8.method263(233);
							this.aClass3_Sub1_Sub3_8.method265(local18);
							this.aClass3_Sub1_Sub3_8.method265(local33);
							this.aClass3_Sub1_Sub3_8.method298(local23);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 461) {
							local51 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local33];
							if (local51 != null) {
								this.method588(0, local51.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local51.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(2);
								this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
							}
						}
						if (local28 == 546) {
							this.aClass3_Sub1_Sub3_8.method263(221);
							this.aClass3_Sub1_Sub3_8.method299(local23, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method299(local18, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 45 && this.method702(local18, local23, local33, 504)) {
							this.aClass3_Sub1_Sub3_8.method263(28);
							this.aClass3_Sub1_Sub3_8.method297(local33 >> 14 & 0x7FFF, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method297(local18 + this.anInt957, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method297(this.anInt900, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method298(local23 + this.anInt958);
						}
						if (local28 == 652) {
							this.method702(local18, local23, local33, 504);
							this.aClass3_Sub1_Sub3_8.method263(61);
							this.aClass3_Sub1_Sub3_8.method299(local23 + this.anInt958, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method265(local18 + this.anInt957);
							this.aClass3_Sub1_Sub3_8.method298(local33 >> 14 & 0x7FFF);
						}
						if (local28 == 691) {
							local493 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local33];
							if (local493 != null) {
								this.method588(0, local493.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local493.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								anInt1020 += local33;
								if (anInt1020 >= 109) {
									this.aClass3_Sub1_Sub3_8.method263(68);
									this.aClass3_Sub1_Sub3_8.method265(23936);
									anInt1020 = 0;
								}
								this.aClass3_Sub1_Sub3_8.method263(93);
								this.aClass3_Sub1_Sub3_8.method299(local33, this.aBoolean211);
							}
						}
						if (local28 == 48) {
							this.aClass3_Sub1_Sub3_8.method263(80);
							this.aClass3_Sub1_Sub3_8.method265(local23);
							local290 = Class13.method194(local23);
							if (local290.anIntArrayArray7 != null && local290.anIntArrayArray7[0][0] == 5) {
								local308 = local290.anIntArrayArray7[0][1];
								this.anIntArray221[local308] = 1 - this.anIntArray221[local308];
								this.method661(local308);
								this.aBoolean207 = true;
							}
						}
						@Pc(1232) long local1232;
						@Pc(1234) int local1234;
						@Pc(1217) String local1217;
						if (local28 == 503) {
							local1217 = this.aStringArray11[arg0];
							local308 = local1217.indexOf("@whi@");
							if (local308 != -1) {
								local1232 = Class38.method435(local1217.substring(local308 + 5).trim());
								local1234 = -1;
								for (@Pc(1236) int local1236 = 0; local1236 < this.anInt1046; local1236++) {
									if (this.aLongArray4[local1236] == local1232) {
										local1234 = local1236;
										break;
									}
								}
								if (local1234 != -1 && this.anIntArray234[local1234] > 0) {
									this.aBoolean224 = true;
									this.anInt910 = 0;
									this.aBoolean232 = true;
									this.aString29 = "";
									this.anInt975 = 3;
									this.aLong31 = this.aLongArray4[local1234];
									this.aString21 = "Enter message to send to " + this.aStringArray10[local1234];
								}
							}
						}
						if (local28 == 743) {
							local493 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local33];
							if (local493 != null) {
								this.method588(0, local493.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local493.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(108);
								this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
							}
						}
						if (local28 == 518) {
							local51 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local33];
							if (local51 != null) {
								this.method588(0, local51.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local51.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(152);
								this.aClass3_Sub1_Sub3_8.method298(local33);
							}
						}
						if (local28 == 307) {
							this.method702(local18, local23, local33, 504);
							this.aClass3_Sub1_Sub3_8.method263(176);
							this.aClass3_Sub1_Sub3_8.method297(local18 + this.anInt957, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method299(local33 >> 14 & 0x7FFF, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method265(local23 + this.anInt958);
						}
						if (local28 == 96) {
							anInt921++;
							if (anInt921 >= 124) {
								this.aClass3_Sub1_Sub3_8.method263(184);
								this.aClass3_Sub1_Sub3_8.method268(0);
								anInt921 = 0;
							}
							this.aClass3_Sub1_Sub3_8.method263(115);
							this.aClass3_Sub1_Sub3_8.method265(local18);
							this.aClass3_Sub1_Sub3_8.method298(local23);
							this.aClass3_Sub1_Sub3_8.method299(local33, this.aBoolean211);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 405) {
							local195 = this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
							if (!local195) {
								this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
							}
							this.anInt830 = super.anInt814;
							this.anInt831 = super.anInt815;
							this.anInt833 = 2;
							this.anInt832 = 0;
							this.aClass3_Sub1_Sub3_8.method263(117);
							this.aClass3_Sub1_Sub3_8.method298(local33);
							this.aClass3_Sub1_Sub3_8.method265(local23 + this.anInt958);
							this.aClass3_Sub1_Sub3_8.method297(local18 + this.anInt957, this.aBoolean203);
						}
						if (local28 == 129) {
							this.aClass3_Sub1_Sub3_8.method263(59);
							this.aClass3_Sub1_Sub3_8.method299(local23, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method299(local18, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method265(local33);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 504) {
							this.method685();
						}
						if (local28 == 905) {
							this.aClass3_Sub1_Sub3_8.method263(215);
							this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method265(local18);
							this.aClass3_Sub1_Sub3_8.method299(local23, this.aBoolean211);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 170) {
							this.aClass3_Sub1_Sub3_8.method263(164);
							this.aClass3_Sub1_Sub3_8.method298(local33);
							this.aClass3_Sub1_Sub3_8.method298(local23);
							this.aClass3_Sub1_Sub3_8.method298(local18);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 918 || local28 == 648 || local28 == 37 || local28 == 730) {
							local1217 = this.aStringArray11[arg0];
							local308 = local1217.indexOf("@whi@");
							if (local308 != -1) {
								local1232 = Class38.method435(local1217.substring(local308 + 5).trim());
								if (local28 == 918) {
									this.method660(local1232);
								}
								if (local28 == 648) {
									this.method606((byte) 8, local1232);
								}
								if (local28 == 37) {
									this.method627(local1232);
								}
								if (local28 == 730) {
									this.method592(local1232);
								}
							}
						}
						if (local28 == 309) {
							local195 = this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
							if (!local195) {
								this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
							}
							this.anInt830 = super.anInt814;
							this.anInt831 = super.anInt815;
							this.anInt833 = 2;
							this.anInt832 = 0;
							anInt993++;
							if (anInt993 >= 91) {
								this.aClass3_Sub1_Sub3_8.method263(162);
								anInt993 = 0;
							}
							this.aClass3_Sub1_Sub3_8.method263(171);
							this.aClass3_Sub1_Sub3_8.method299(local23 + this.anInt958, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method299(local33, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method265(local18 + this.anInt957);
						}
						if (local28 == 1788) {
							@Pc(1955) int local1955 = local33 >> 14 & 0x7FFF;
							@Pc(1958) Class26 local1958 = Class26.method313(local1955);
							if (local1958.aByteArray6 == null) {
								local441 = "It's a " + local1958.aString12 + ".";
							} else {
								local441 = new String(local1958.aByteArray6);
							}
							this.method681("", local441, 0);
						}
						if (local28 == 408) {
							local51 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local33];
							if (local51 != null) {
								this.method588(0, local51.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local51.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(187);
								this.aClass3_Sub1_Sub3_8.method299(local33, this.aBoolean211);
							}
						}
						if (local28 == 465) {
							local493 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local33];
							if (local493 != null) {
								this.method588(0, local493.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local493.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(54);
								this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
								this.aClass3_Sub1_Sub3_8.method265(this.anInt900);
							}
						}
						if (local28 == 355) {
							local51 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local33];
							if (local51 != null) {
								this.method588(0, local51.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local51.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(129);
								this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
							}
						}
						if (local28 == 940) {
							anInt842++;
							if (anInt842 >= 78) {
								this.aClass3_Sub1_Sub3_8.method263(17);
								anInt842 = 0;
							}
							this.aClass3_Sub1_Sub3_8.method263(70);
							this.aClass3_Sub1_Sub3_8.method265(local18);
							this.aClass3_Sub1_Sub3_8.method297(local23, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method265(local33);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 1187) {
							local793 = Class12.method179(local33);
							@Pc(2252) Class13 local2252 = Class13.method194(local23);
							if (local2252 != null && local2252.anIntArray96[local18] >= 100000) {
								local426 = local2252.anIntArray96[local18] + " x " + local793.aString5;
							} else if (local793.aByteArray2 == null) {
								local426 = "It's a " + local793.aString5 + ".";
							} else {
								local426 = new String(local793.aByteArray2);
							}
							this.method681("", local426, 0);
						}
						if (local28 == 916) {
							local493 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local33];
							if (local493 != null) {
								this.method588(0, local493.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local493.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(206);
								this.aClass3_Sub1_Sub3_8.method298(local33);
							}
						}
						if (local28 == 1117) {
							local493 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local33];
							if (local493 != null) {
								@Pc(2379) Class7 local2379 = local493.aClass7_2;
								if (local2379.anIntArray54 != null) {
									local2379 = local2379.method86();
								}
								if (local2379 != null) {
									if (local2379.aByteArray1 == null) {
										local441 = "It's a " + local2379.aString1 + ".";
									} else {
										local441 = new String(local2379.aByteArray1);
									}
									this.method681("", local441, 0);
								}
							}
						}
						if (local28 == 872) {
							if (this.aBoolean208) {
								this.aClass36_1.method418(local18 - 4, local23 - 4);
							} else {
								this.aClass36_1.method418(super.anInt814 - 4, super.anInt815 - 4);
							}
						}
						if (local28 == 800) {
							local195 = this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
							if (!local195) {
								this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
							}
							this.anInt830 = super.anInt814;
							this.anInt831 = super.anInt815;
							this.anInt833 = 2;
							this.anInt832 = 0;
							this.aClass3_Sub1_Sub3_8.method263(67);
							this.aClass3_Sub1_Sub3_8.method299(this.anInt1042, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method297(this.anInt1040, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method265(local23 + this.anInt958);
							this.aClass3_Sub1_Sub3_8.method297(local18 + this.anInt957, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method265(this.anInt1041);
							this.aClass3_Sub1_Sub3_8.method298(local33);
						}
						if (local28 == 677 && this.method702(local18, local23, local33, 504)) {
							this.aClass3_Sub1_Sub3_8.method263(190);
							this.aClass3_Sub1_Sub3_8.method299(local33 >> 14 & 0x7FFF, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method297(this.anInt1040, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method298(this.anInt1041);
							this.aClass3_Sub1_Sub3_8.method298(local18 + this.anInt957);
							this.aClass3_Sub1_Sub3_8.method298(this.anInt1042);
							this.aClass3_Sub1_Sub3_8.method297(local23 + this.anInt958, this.aBoolean203);
						}
						if (local28 == 185) {
							local195 = this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
							if (!local195) {
								this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
							}
							this.anInt830 = super.anInt814;
							this.anInt831 = super.anInt815;
							this.anInt833 = 2;
							this.anInt832 = 0;
							this.aClass3_Sub1_Sub3_8.method263(45);
							this.aClass3_Sub1_Sub3_8.method298(local23 + this.anInt958);
							this.aClass3_Sub1_Sub3_8.method298(local33);
							this.aClass3_Sub1_Sub3_8.method298(local18 + this.anInt957);
						}
						if (local28 == 249) {
							local493 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local33];
							if (local493 != null) {
								this.method588(0, local493.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local493.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(138);
								this.aClass3_Sub1_Sub3_8.method299(local33, this.aBoolean211);
							}
						}
						if (local28 == 124 || local28 == 475) {
							local1217 = this.aStringArray11[arg0];
							local308 = local1217.indexOf("@whi@");
							if (local308 != -1) {
								local1217 = local1217.substring(local308 + 5).trim();
								local441 = Class38.method439(Class38.method436(Class38.method435(local1217)));
								@Pc(2796) boolean local2796 = false;
								for (local1234 = 0; local1234 < this.anInt1012; local1234++) {
									@Pc(2808) Class3_Sub1_Sub1_Sub4_Sub1 local2808 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray251[local1234]];
									if (local2808 != null && local2808.aString4 != null && local2808.aString4.equalsIgnoreCase(local441)) {
										this.method588(0, local2808.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local2808.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
										if (local28 == 124) {
											this.aClass3_Sub1_Sub3_8.method263(21);
											this.aClass3_Sub1_Sub3_8.method297(this.anIntArray251[local1234], this.aBoolean203);
										}
										if (local28 == 475) {
											this.aClass3_Sub1_Sub3_8.method263(129);
											this.aClass3_Sub1_Sub3_8.method297(this.anIntArray251[local1234], this.aBoolean203);
										}
										local2796 = true;
										break;
									}
								}
								if (!local2796) {
									this.method681("", "Unable to find " + local441, 0);
								}
							}
						}
						if (local28 == 318) {
							local51 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local33];
							if (local51 != null) {
								this.method588(0, local51.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local51.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(199);
								this.aClass3_Sub1_Sub3_8.method265(this.anInt900);
								this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
							}
						}
						if (local28 == 265) {
							local51 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local33];
							if (local51 != null) {
								this.method588(0, local51.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local51.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(31);
								this.aClass3_Sub1_Sub3_8.method299(this.anInt1041, this.aBoolean211);
								this.aClass3_Sub1_Sub3_8.method299(local33, this.aBoolean211);
								this.aClass3_Sub1_Sub3_8.method299(this.anInt1042, this.aBoolean211);
								this.aClass3_Sub1_Sub3_8.method265(this.anInt1040);
							}
						}
						if (local28 == 107) {
							this.method695(this.anInt895);
							this.anInt895 = -1;
							this.aBoolean224 = true;
						}
						if (local28 == 948) {
							local195 = this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
							if (!local195) {
								this.method588(0, local23, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local18, 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
							}
							this.anInt830 = super.anInt814;
							this.anInt831 = super.anInt815;
							this.anInt833 = 2;
							this.anInt832 = 0;
							if ((this.anInt958 & 0x3) == 0) {
								anInt893++;
							}
							if (anInt893 >= 72) {
								this.aClass3_Sub1_Sub3_8.method263(245);
								this.aClass3_Sub1_Sub3_8.method268(0);
								anInt893 = 0;
							}
							this.aClass3_Sub1_Sub3_8.method263(79);
							this.aClass3_Sub1_Sub3_8.method297(local33, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method265(local23 + this.anInt958);
							this.aClass3_Sub1_Sub3_8.method299(local18 + this.anInt957, this.aBoolean211);
						}
						if (local28 == 460) {
							this.aClass3_Sub1_Sub3_8.method263(179);
							this.aClass3_Sub1_Sub3_8.method265(local18);
							this.aClass3_Sub1_Sub3_8.method298(local23);
							this.aClass3_Sub1_Sub3_8.method299(local33, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method298(this.anInt900);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 458) {
							local493 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local33];
							if (local493 != null) {
								this.method588(0, local493.anIntArray204[0], aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, 0, 2, local493.anIntArray203[0], 1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 1);
								this.anInt830 = super.anInt814;
								this.anInt831 = super.anInt815;
								this.anInt833 = 2;
								this.anInt832 = 0;
								this.aClass3_Sub1_Sub3_8.method263(153);
								this.aClass3_Sub1_Sub3_8.method265(local33);
							}
						}
						if (local28 == 133) {
							this.aClass3_Sub1_Sub3_8.method263(66);
							this.aClass3_Sub1_Sub3_8.method298(local18);
							this.aClass3_Sub1_Sub3_8.method265(local33);
							this.aClass3_Sub1_Sub3_8.method265(local23);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						if (local28 == 345) {
							local1217 = this.aStringArray11[arg0];
							local308 = local1217.indexOf("@whi@");
							if (local308 != -1) {
								if (this.anInt971 == -1) {
									this.method685();
									this.aString23 = local1217.substring(local308 + 5).trim();
									this.aBoolean228 = false;
									this.anInt1038 = this.anInt971 = Class13.anInt341;
								} else {
									this.method681("", "Please close the interface you have open before using 'report abuse'", 0);
								}
							}
						}
						if (local28 == 673) {
							this.method702(local18, local23, local33, 504);
							this.aClass3_Sub1_Sub3_8.method263(120);
							this.aClass3_Sub1_Sub3_8.method297(local23 + this.anInt958, this.aBoolean203);
							this.aClass3_Sub1_Sub3_8.method299(local33 >> 14 & 0x7FFF, this.aBoolean211);
							this.aClass3_Sub1_Sub3_8.method298(local18 + this.anInt957);
						}
						if (local28 == 513) {
							this.aClass3_Sub1_Sub3_8.method263(141);
							this.aClass3_Sub1_Sub3_8.method298(local33);
							this.aClass3_Sub1_Sub3_8.method298(local23);
							this.aClass3_Sub1_Sub3_8.method299(local18, this.aBoolean211);
							this.anInt846 = 0;
							this.anInt847 = local23;
							this.anInt848 = local18;
							this.anInt849 = 2;
							if (Class13.method194(local23).anInt357 == this.anInt971) {
								this.anInt849 = 1;
							}
							if (Class13.method194(local23).anInt357 == this.anInt986) {
								this.anInt849 = 3;
							}
						}
						this.anInt1039 = 0;
						this.anInt899 = 0;
						this.aBoolean207 = true;
					}
				}
			}
		} catch (@Pc(3499) RuntimeException local3499) {
			signlink.reporterror("40469, " + arg0 + ", " + true + ", " + local3499.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method633() {
		try {
			@Pc(7) byte[] local7 = this.aClass14_2.method202("title.dat", (byte[]) null);
			@Pc(13) Class3_Sub1_Sub2_Sub4 local13 = new Class3_Sub1_Sub2_Sub4(local7, this);
			this.aClass42_6.method467((byte) 6);
			local13.method564(0, 0);
			this.aClass42_7.method467((byte) 6);
			local13.method564(-637, 0);
			this.aClass42_3.method467((byte) 6);
			local13.method564(-128, 0);
			this.aClass42_4.method467((byte) 6);
			local13.method564(-202, -371);
			this.aClass42_5.method467((byte) 6);
			local13.method564(-202, -171);
			this.aClass42_8.method467((byte) 6);
			local13.method564(0, -265);
			this.aClass42_9.method467((byte) 6);
			local13.method564(-562, -265);
			this.aClass42_10.method467((byte) 6);
			local13.method564(-128, -171);
			this.aClass42_11.method467((byte) 6);
			local13.method564(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt793];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt794; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt793; local104++) {
					local98[local104] = local13.anIntArray209[local13.anInt793 + local13.anInt793 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt793; local130++) {
					local13.anIntArray209[local130 + local13.anInt793 * local100] = local98[local130];
				}
			}
			this.aClass42_6.method467((byte) 6);
			local13.method564(382, 0);
			this.aClass42_7.method467((byte) 6);
			local13.method564(-255, 0);
			this.aClass42_3.method467((byte) 6);
			local13.method564(254, 0);
			this.aClass42_4.method467((byte) 6);
			local13.method564(180, -371);
			this.aClass42_5.method467((byte) 6);
			local13.method564(180, -171);
			this.aClass42_8.method467((byte) 6);
			local13.method564(382, -265);
			this.aClass42_9.method467((byte) 6);
			local13.method564(-180, -265);
			this.aClass42_10.method467((byte) 6);
			local13.method564(254, -171);
			this.aClass42_11.method467((byte) 6);
			local13.method564(-180, -171);
			local13 = new Class3_Sub1_Sub2_Sub4(this.aClass14_2, "logo", 0);
			this.aClass42_3.method467((byte) 6);
			local13.method566(382 - local13.anInt793 / 2 - 128, 18, (byte) 8);
			System.gc();
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("97399, " + 30 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method634() {
		try {
			if (this.aClass42_15 == null) {
				this.method654();
				super.aClass42_2 = null;
				this.aClass42_3 = null;
				this.aClass42_4 = null;
				this.aClass42_5 = null;
				this.aClass42_6 = null;
				this.aClass42_7 = null;
				this.aClass42_8 = null;
				this.aClass42_9 = null;
				this.aClass42_10 = null;
				this.aClass42_11 = null;
				this.aClass42_15 = new Class42(96, 5, 479, this.method584());
				this.aClass42_13 = new Class42(156, 5, 172, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass3_Sub1_Sub2_Sub2_12.method373(0, 0);
				this.aClass42_12 = new Class42(261, 5, 190, this.method584());
				this.aClass42_14 = new Class42(334, 5, 512, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass42_16 = new Class42(50, 5, 496, this.method584());
				this.aClass42_17 = new Class42(37, 5, 269, this.method584());
				this.aClass42_18 = new Class42(45, 5, 249, this.method584());
				this.aBoolean221 = true;
				this.aClass42_14.method467((byte) 6);
				Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("94870, " + -21 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method635(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt888 > 0) {
				this.method718();
			} else {
				this.method719("Connection lost", "Please wait - attempting to reestablish");
				this.anInt935 = 0;
				this.anInt917 = 0;
				@Pc(21) boolean local21 = false;
				@Pc(24) Class47 local24 = this.aClass47_1;
				this.aBoolean237 = false;
				this.anInt978 = 0;
				this.method712(this.aString18, this.aString19, true);
				if (!this.aBoolean237) {
					this.method718();
				}
				try {
					local24.method521();
				} catch (@Pc(47) Exception local47) {
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("52531, " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!HZINZKXF;)Z")
	private boolean method636(@OriginalArg(1) Class13 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt371;
			if (local11 >= 1 && local11 <= 200 || !(local11 < 701 || local11 > 900)) {
				if (local11 >= 801) {
					local11 -= 701;
				} else if (local11 >= 701) {
					local11 -= 601;
				} else if (local11 >= 101) {
					local11 -= 101;
				} else {
					local11--;
				}
				this.aStringArray11[this.anInt1053] = "Remove @whi@" + this.aStringArray10[local11];
				this.anIntArray228[this.anInt1053] = 37;
				this.anInt1053++;
				this.aStringArray11[this.anInt1053] = "Message @whi@" + this.aStringArray10[local11];
				this.anIntArray228[this.anInt1053] = 503;
				this.anInt1053++;
				return true;
			} else if (local11 >= 401 && local11 <= 500) {
				this.aStringArray11[this.anInt1053] = "Remove @whi@" + arg0.aString7;
				this.anIntArray228[this.anInt1053] = 730;
				this.anInt1053++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("67879, " + 0 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method637() {
		try {
			this.aClass42_15.method467((byte) 6);
			Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray213;
			this.aClass3_Sub1_Sub2_Sub2_13.method373(0, 0);
			if (this.aBoolean232) {
				this.aClass3_Sub1_Sub2_Sub1_4.method120(0, 239, this.aString21, 40);
				this.aClass3_Sub1_Sub2_Sub1_4.method120(128, 239, this.aString29 + "*", 60);
			} else if (this.anInt910 == 1) {
				this.aClass3_Sub1_Sub2_Sub1_4.method120(0, 239, "Enter amount:", 40);
				this.aClass3_Sub1_Sub2_Sub1_4.method120(128, 239, this.aString17 + "*", 60);
			} else if (this.anInt910 == 2) {
				this.aClass3_Sub1_Sub2_Sub1_4.method120(0, 239, "Enter name:", 40);
				this.aClass3_Sub1_Sub2_Sub1_4.method120(128, 239, this.aString17 + "*", 60);
			} else if (this.aString28 != null) {
				this.aClass3_Sub1_Sub2_Sub1_4.method120(0, 239, this.aString28, 40);
				this.aClass3_Sub1_Sub2_Sub1_4.method120(128, 239, "Click to continue", 60);
			} else if (this.anInt986 != -1) {
				this.method595(0, 0, Class13.method194(this.anInt986), 0);
			} else if (this.anInt895 == -1) {
				@Pc(168) Class3_Sub1_Sub2_Sub1 local168 = this.aClass3_Sub1_Sub2_Sub1_3;
				@Pc(170) int local170 = 0;
				Class3_Sub1_Sub2.method551(0, 77, 0, 463);
				for (@Pc(178) int local178 = 0; local178 < 100; local178++) {
					if (this.aStringArray9[local178] != null) {
						@Pc(190) int local190 = this.anIntArray212[local178];
						@Pc(199) int local199 = this.anInt944 + 70 - local170 * 14;
						@Pc(204) String local204 = this.aStringArray8[local178];
						@Pc(206) byte local206 = 0;
						if (local204 != null && local204.startsWith("@cr1@")) {
							local204 = local204.substring(5);
							local206 = 1;
						}
						if (local204 != null && local204.startsWith("@cr2@")) {
							local204 = local204.substring(5);
							local206 = 2;
						}
						if (local190 == 0) {
							if (local199 > 0 && local199 < 110) {
								local168.method124(this.aStringArray9[local178], 4, local199, 0);
							}
							local170++;
						}
						@Pc(276) int local276;
						if ((local190 == 1 || local190 == 2) && (local190 == 1 || this.anInt925 == 0 || this.anInt925 == 1 && this.method689(local204))) {
							if (local199 > 0 && local199 < 110) {
								local276 = 4;
								if (local206 == 1) {
									this.aClass3_Sub1_Sub2_Sub2Array4[0].method373(4, local199 - 12);
									local276 += 14;
								}
								if (local206 == 2) {
									this.aClass3_Sub1_Sub2_Sub2Array4[1].method373(local276, local199 - 12);
									local276 += 14;
								}
								local168.method124(local204 + ":", local276, local199, 0);
								local276 += local168.method122(local204) + 8;
								local168.method124(this.aStringArray9[local178], local276, local199, 255);
							}
							local170++;
						}
						if ((local190 == 3 || local190 == 7) && this.anInt970 == 0 && (local190 == 7 || this.anInt913 == 0 || this.anInt913 == 1 && this.method689(local204))) {
							if (local199 > 0 && local199 < 110) {
								local168.method124("From", 4, local199, 0);
								local276 = local168.method122("From ") + 4;
								if (local206 == 1) {
									this.aClass3_Sub1_Sub2_Sub2Array4[0].method373(local276, local199 - 12);
									local276 += 14;
								}
								if (local206 == 2) {
									this.aClass3_Sub1_Sub2_Sub2Array4[1].method373(local276, local199 - 12);
									local276 += 14;
								}
								local168.method124(local204 + ":", local276, local199, 0);
								local276 += local168.method122(local204) + 8;
								local168.method124(this.aStringArray9[local178], local276, local199, 8388608);
							}
							local170++;
						}
						if (local190 == 4 && (this.anInt903 == 0 || this.anInt903 == 1 && this.method689(local204))) {
							if (local199 > 0 && local199 < 110) {
								local168.method124(local204 + " " + this.aStringArray9[local178], 4, local199, 8388736);
							}
							local170++;
						}
						if (local190 == 5 && this.anInt970 == 0 && this.anInt913 < 2) {
							if (local199 > 0 && local199 < 110) {
								local168.method124(this.aStringArray9[local178], 4, local199, 8388608);
							}
							local170++;
						}
						if (local190 == 6 && this.anInt970 == 0 && this.anInt913 < 2) {
							if (local199 > 0 && local199 < 110) {
								local168.method124("To " + local204 + ":", 4, local199, 0);
								local168.method124(this.aStringArray9[local178], local168.method122("To " + local204) + 12, local199, 8388608);
							}
							local170++;
						}
						if (local190 == 8 && (this.anInt903 == 0 || this.anInt903 == 1 && this.method689(local204))) {
							if (local199 > 0 && local199 < 110) {
								local168.method124(local204 + " " + this.aStringArray9[local178], 4, local199, 8270336);
							}
							local170++;
						}
					}
				}
				Class3_Sub1_Sub2.method550();
				this.anInt912 = local170 * 14 + 7;
				if (this.anInt912 < 78) {
					this.anInt912 = 78;
				}
				this.method613(this.anInt912, 463, 0, this.anInt912 - this.anInt944 - 77, 77);
				@Pc(646) String local646;
				if (aClass3_Sub1_Sub1_Sub4_Sub1_1 == null || aClass3_Sub1_Sub1_Sub4_Sub1_1.aString4 == null) {
					local646 = Class38.method439(this.aString18);
				} else {
					local646 = aClass3_Sub1_Sub1_Sub4_Sub1_1.aString4;
				}
				local168.method124(local646 + ":", 4, 90, 0);
				local168.method124(this.aString26 + "*", local168.method122(local646 + ": ") + 6, 90, 255);
				Class3_Sub1_Sub2.method557(77, 0, 0, 479);
			} else {
				this.method595(0, 0, Class13.method194(this.anInt895), 0);
			}
			if (this.aBoolean208 && this.anInt867 == 2) {
				this.method683();
			}
			this.aClass42_15.method468(17, 357, super.aGraphics2);
			this.aClass42_14.method467((byte) 6);
			Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
		} catch (@Pc(727) RuntimeException local727) {
			signlink.reporterror("54713, " + 44 + ", " + local727.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!HZINZKXF;II)V")
	private void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class13 arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean235) {
				this.anInt955 = 32;
			} else {
				this.anInt955 = 0;
			}
			this.aBoolean235 = false;
			if (arg0 >= arg3 && arg0 < arg3 + 16 && arg4 >= arg5 && arg4 < arg5 + 16) {
				arg6.anInt344 -= this.anInt859 * 4;
				if (arg1 == 1) {
					this.aBoolean207 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.aBoolean224 = true;
				}
			} else if (arg0 >= arg3 && arg0 < arg3 + 16 && arg4 >= arg5 + arg2 - 16 && arg4 < arg5 + arg2) {
				arg6.anInt344 += this.anInt859 * 4;
				if (arg1 == 1) {
					this.aBoolean207 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.aBoolean224 = true;
				}
			} else if (arg0 >= arg3 - this.anInt955 && arg0 < arg3 + this.anInt955 + 16 && arg4 >= arg5 + 16 && arg4 < arg5 + arg2 - 16 && this.anInt859 > 0) {
				@Pc(151) int local151 = (arg2 - 32) * arg2 / arg7;
				if (local151 < 8) {
					local151 = 8;
				}
				@Pc(166) int local166 = arg4 - arg5 - local151 / 2 - 16;
				@Pc(172) int local172 = arg2 - local151 - 32;
				arg6.anInt344 = (arg7 - arg2) * local166 / local172;
				if (arg1 == 1) {
					this.aBoolean207 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.aBoolean224 = true;
				}
				this.aBoolean235 = true;
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("95391, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 7 + ", " + arg7 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method639() {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt987; local7++) {
				@Pc(14) int local14 = this.anIntArray245[local7];
				@Pc(19) Class3_Sub1_Sub1_Sub4_Sub2 local19 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local14];
				if (local19 != null) {
					this.method640(local19.aClass7_2.aByte2, local19, this.aByte27);
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("35281, " + 792 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!XETERYIW;B)V")
	private void method640(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg2 == this.aByte31) {
				@Pc(7) boolean local7 = false;
				if (arg1.anInt754 < 128 || arg1.anInt755 < 128 || arg1.anInt754 >= 13184 || arg1.anInt755 >= 13184) {
					arg1.anInt743 = -1;
					arg1.anInt714 = -1;
					arg1.anInt733 = 0;
					arg1.anInt734 = 0;
					arg1.anInt754 = arg1.anIntArray203[0] * 128 + arg1.anInt728 * 64;
					arg1.anInt755 = arg1.anIntArray204[0] * 128 + arg1.anInt728 * 64;
					arg1.method540(this.anInt856);
				}
				if (arg1 == aClass3_Sub1_Sub1_Sub4_Sub1_1 && (arg1.anInt754 < 1536 || arg1.anInt755 < 1536 || arg1.anInt754 >= 11776 || arg1.anInt755 >= 11776)) {
					arg1.anInt743 = -1;
					arg1.anInt714 = -1;
					arg1.anInt733 = 0;
					arg1.anInt734 = 0;
					arg1.anInt754 = arg1.anIntArray203[0] * 128 + arg1.anInt728 * 64;
					arg1.anInt755 = arg1.anIntArray204[0] * 128 + arg1.anInt728 * 64;
					arg1.method540(this.anInt856);
				}
				if (arg1.anInt733 > anInt1050) {
					this.method641(this.anInt999, arg1);
				} else if (arg1.anInt734 >= anInt1050) {
					this.method642(arg1);
				} else {
					this.method643(arg1);
				}
				this.method644(arg1);
				this.method645(arg1);
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("80450, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!XETERYIW;)V")
	private void method641(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt733 - anInt1050;
			@Pc(14) int local14 = arg1.anInt729 * 128 + arg1.anInt728 * 64;
			@Pc(24) int local24 = arg1.anInt731 * 128 + arg1.anInt728 * 64;
			arg1.anInt754 += (local14 - arg1.anInt754) / local4;
			arg1.anInt755 += (local24 - arg1.anInt755) / local4;
			if (arg0 != 0) {
				this.anInt885 = -1;
			}
			arg1.anInt722 = 0;
			if (arg1.anInt735 == 0) {
				arg1.anInt737 = 1024;
			}
			if (arg1.anInt735 == 1) {
				arg1.anInt737 = 1536;
			}
			if (arg1.anInt735 == 2) {
				arg1.anInt737 = 0;
			}
			if (arg1.anInt735 == 3) {
				arg1.anInt737 = 512;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("35627, " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!XETERYIW;)V")
	private void method642(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0) {
		try {
			if (arg0.anInt734 == anInt1050 || arg0.anInt743 == -1 || arg0.anInt746 != 0 || arg0.anInt745 + 1 > Class31.aClass31Array1[arg0.anInt743].method340(arg0.anInt744, this.anInt825)) {
				@Pc(30) int local30 = arg0.anInt734 - arg0.anInt733;
				@Pc(35) int local35 = anInt1050 - arg0.anInt733;
				@Pc(45) int local45 = arg0.anInt729 * 128 + arg0.anInt728 * 64;
				@Pc(55) int local55 = arg0.anInt731 * 128 + arg0.anInt728 * 64;
				@Pc(65) int local65 = arg0.anInt730 * 128 + arg0.anInt728 * 64;
				@Pc(75) int local75 = arg0.anInt732 * 128 + arg0.anInt728 * 64;
				arg0.anInt754 = (local45 * (local30 - local35) + local65 * local35) / local30;
				arg0.anInt755 = (local55 * (local30 - local35) + local75 * local35) / local30;
			}
			arg0.anInt722 = 0;
			if (arg0.anInt735 == 0) {
				arg0.anInt737 = 1024;
			}
			if (arg0.anInt735 == 1) {
				arg0.anInt737 = 1536;
			}
			if (arg0.anInt735 == 2) {
				arg0.anInt737 = 0;
			}
			if (arg0.anInt735 == 3) {
				arg0.anInt737 = 512;
			}
			arg0.anInt756 = arg0.anInt737;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("80463, " + true + ", " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XETERYIW;B)V")
	private void method643(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0) {
		try {
			arg0.anInt711 = arg0.anInt752;
			if (arg0.anInt736 == 0) {
				arg0.anInt722 = 0;
			} else {
				if (arg0.anInt743 != -1 && arg0.anInt746 == 0) {
					@Pc(31) Class31 local31 = Class31.aClass31Array1[arg0.anInt743];
					if (arg0.anInt721 > 0 && local31.anInt487 == 0) {
						arg0.anInt722++;
						return;
					}
					if (arg0.anInt721 <= 0 && local31.anInt488 == 0) {
						arg0.anInt722++;
						return;
					}
				}
				@Pc(60) int local60 = arg0.anInt754;
				@Pc(63) int local63 = arg0.anInt755;
				@Pc(78) int local78 = arg0.anIntArray203[arg0.anInt736 - 1] * 128 + arg0.anInt728 * 64;
				@Pc(93) int local93 = arg0.anIntArray204[arg0.anInt736 - 1] * 128 + arg0.anInt728 * 64;
				if (local78 - local60 <= 256 && local78 - local60 >= -256 && local93 - local63 <= 256 && local93 - local63 >= -256) {
					if (local60 < local78) {
						if (local63 < local93) {
							arg0.anInt737 = 1280;
						} else if (local63 > local93) {
							arg0.anInt737 = 1792;
						} else {
							arg0.anInt737 = 1536;
						}
					} else if (local60 > local78) {
						if (local63 < local93) {
							arg0.anInt737 = 768;
						} else if (local63 > local93) {
							arg0.anInt737 = 256;
						} else {
							arg0.anInt737 = 512;
						}
					} else if (local63 < local93) {
						arg0.anInt737 = 1024;
					} else {
						arg0.anInt737 = 0;
					}
					@Pc(187) int local187 = arg0.anInt737 - arg0.anInt756 & 0x7FF;
					if (local187 > 1024) {
						local187 -= 2048;
					}
					@Pc(194) int local194 = arg0.anInt749;
					if (local187 >= -256 && local187 <= 256) {
						local194 = arg0.anInt748;
					} else if (local187 >= 256 && local187 < 768) {
						local194 = arg0.anInt751;
					} else if (local187 >= -768 && local187 <= -256) {
						local194 = arg0.anInt750;
					}
					if (local194 == -1) {
						local194 = arg0.anInt748;
					}
					arg0.anInt711 = local194;
					@Pc(236) int local236 = 4;
					if (arg0.anInt756 != arg0.anInt737 && arg0.anInt710 == -1 && arg0.anInt757 != 0) {
						local236 = 2;
					}
					if (arg0.anInt736 > 2) {
						local236 = 6;
					}
					if (arg0.anInt736 > 3) {
						local236 = 8;
					}
					if (arg0.anInt722 > 0 && arg0.anInt736 > 1) {
						local236 = 8;
						arg0.anInt722--;
					}
					if (arg0.aBooleanArray10[arg0.anInt736 - 1]) {
						local236 <<= 0x1;
					}
					if (local236 >= 8 && arg0.anInt711 == arg0.anInt748 && arg0.anInt738 != -1) {
						arg0.anInt711 = arg0.anInt738;
					}
					if (local60 < local78) {
						arg0.anInt754 += local236;
						if (arg0.anInt754 > local78) {
							arg0.anInt754 = local78;
						}
					} else if (local60 > local78) {
						arg0.anInt754 -= local236;
						if (arg0.anInt754 < local78) {
							arg0.anInt754 = local78;
						}
					}
					if (local63 < local93) {
						arg0.anInt755 += local236;
						if (arg0.anInt755 > local93) {
							arg0.anInt755 = local93;
						}
					} else if (local63 > local93) {
						arg0.anInt755 -= local236;
						if (arg0.anInt755 < local93) {
							arg0.anInt755 = local93;
						}
					}
					if (arg0.anInt754 == local78 && arg0.anInt755 == local93) {
						arg0.anInt736--;
						if (arg0.anInt721 > 0) {
							arg0.anInt721--;
							return;
						}
					}
				} else {
					arg0.anInt754 = local78;
					arg0.anInt755 = local93;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("95088, " + arg0 + ", " + -64 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!XETERYIW;)V")
	private void method644(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0) {
		try {
			if (arg0.anInt757 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt710 != -1 && arg0.anInt710 < 32768) {
					@Pc(26) Class3_Sub1_Sub1_Sub4_Sub2 local26 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[arg0.anInt710];
					if (local26 != null) {
						local34 = arg0.anInt754 - local26.anInt754;
						local40 = arg0.anInt755 - local26.anInt755;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt737 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt710 >= 32768) {
					local65 = arg0.anInt710 - 32768;
					if (local65 == this.anInt1035) {
						local65 = this.anInt1011;
					}
					@Pc(77) Class3_Sub1_Sub1_Sub4_Sub1 local77 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt754 - local77.anInt754;
						@Pc(91) int local91 = arg0.anInt755 - local77.anInt755;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt737 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt726 != 0 || arg0.anInt727 != 0) && (arg0.anInt736 == 0 || arg0.anInt722 > 0)) {
					local65 = arg0.anInt754 - (arg0.anInt726 - this.anInt957 - this.anInt957) * 64;
					local34 = arg0.anInt755 - (arg0.anInt727 - this.anInt958 - this.anInt958) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt737 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt726 = 0;
					arg0.anInt727 = 0;
				}
				local65 = arg0.anInt737 - arg0.anInt756 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt757 || local65 > 2048 - arg0.anInt757) {
						arg0.anInt756 = arg0.anInt737;
					} else if (local65 > 1024) {
						arg0.anInt756 -= arg0.anInt757;
					} else {
						arg0.anInt756 += arg0.anInt757;
					}
					arg0.anInt756 &= 0x7FF;
					if (arg0.anInt711 == arg0.anInt752 && arg0.anInt756 != arg0.anInt737) {
						if (arg0.anInt753 != -1) {
							arg0.anInt711 = arg0.anInt753;
							return;
						}
						arg0.anInt711 = arg0.anInt748;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("58834, " + true + ", " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!XETERYIW;)V")
	private void method645(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0) {
		try {
			arg0.aBoolean185 = false;
			@Pc(18) Class31 local18;
			if (arg0.anInt711 != -1) {
				local18 = Class31.aClass31Array1[arg0.anInt711];
				arg0.anInt713++;
				if (arg0.anInt712 < local18.anInt481 && arg0.anInt713 > local18.method340(arg0.anInt712, this.anInt825)) {
					arg0.anInt713 = 0;
					arg0.anInt712++;
				}
				if (arg0.anInt712 >= local18.anInt481) {
					arg0.anInt713 = 0;
					arg0.anInt712 = 0;
				}
			}
			if (arg0.anInt714 != -1 && anInt1050 >= arg0.anInt717) {
				if (arg0.anInt715 < 0) {
					arg0.anInt715 = 0;
				}
				local18 = Class6.aClass6Array1[arg0.anInt714].aClass31_2;
				arg0.anInt716++;
				while (arg0.anInt715 < local18.anInt481 && arg0.anInt716 > local18.method340(arg0.anInt715, this.anInt825)) {
					arg0.anInt716 -= local18.method340(arg0.anInt715, this.anInt825);
					arg0.anInt715++;
				}
				if (arg0.anInt715 >= local18.anInt481 && (arg0.anInt715 < 0 || arg0.anInt715 >= local18.anInt481)) {
					arg0.anInt714 = -1;
				}
			}
			if (arg0.anInt743 != -1 && arg0.anInt746 <= 1) {
				local18 = Class31.aClass31Array1[arg0.anInt743];
				if (local18.anInt487 == 1 && arg0.anInt721 > 0 && arg0.anInt733 <= anInt1050 && arg0.anInt734 < anInt1050) {
					arg0.anInt746 = 1;
					return;
				}
			}
			if (arg0.anInt743 != -1 && arg0.anInt746 == 0) {
				local18 = Class31.aClass31Array1[arg0.anInt743];
				arg0.anInt745++;
				while (arg0.anInt744 < local18.anInt481 && arg0.anInt745 > local18.method340(arg0.anInt744, this.anInt825)) {
					arg0.anInt745 -= local18.method340(arg0.anInt744, this.anInt825);
					arg0.anInt744++;
				}
				if (arg0.anInt744 >= local18.anInt481) {
					arg0.anInt744 -= local18.anInt482;
					arg0.anInt747++;
					if (arg0.anInt747 >= local18.anInt486) {
						arg0.anInt743 = -1;
					}
					if (arg0.anInt744 < 0 || arg0.anInt744 >= local18.anInt481) {
						arg0.anInt743 = -1;
					}
				}
				arg0.aBoolean185 = local18.aBoolean133;
			}
			if (arg0.anInt746 > 0) {
				arg0.anInt746--;
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("67485, " + -43 + ", " + arg0 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method646() {
		try {
			if (this.anInt914 == -1 || this.anInt946 != 2 && super.aClass42_2 == null) {
				if (this.aBoolean221) {
					this.method634();
					this.aBoolean221 = false;
					this.aClass42_19.method468(0, 4, super.aGraphics2);
					this.aClass42_20.method468(0, 357, super.aGraphics2);
					this.aClass42_21.method468(722, 4, super.aGraphics2);
					this.aClass42_22.method468(743, 205, super.aGraphics2);
					this.aClass42_23.method468(0, 0, super.aGraphics2);
					this.aClass42_24.method468(516, 4, super.aGraphics2);
					this.aClass42_25.method468(516, 205, super.aGraphics2);
					this.aClass42_26.method468(496, 357, super.aGraphics2);
					this.aClass42_27.method468(0, 338, super.aGraphics2);
					this.aBoolean207 = true;
					this.aBoolean224 = true;
					this.aBoolean226 = true;
					this.aBoolean241 = true;
					if (this.anInt946 != 2) {
						this.aClass42_14.method468(4, 4, super.aGraphics2);
						this.aClass42_13.method468(550, 4, super.aGraphics2);
					}
				}
				if (this.anInt946 == 2) {
					this.method692();
				}
				if (this.aBoolean208 && this.anInt867 == 1) {
					this.aBoolean207 = true;
				}
				@Pc(285) boolean local285;
				if (this.anInt1021 != -1) {
					local285 = this.method697(this.anInt1021, this.anInt953);
					if (local285) {
						this.aBoolean207 = true;
					}
				}
				if (this.anInt849 == 2) {
					this.aBoolean207 = true;
				}
				if (this.anInt950 == 2) {
					this.aBoolean207 = true;
				}
				if (this.aBoolean207) {
					this.method691();
					this.aBoolean207 = false;
				}
				if (this.anInt986 == -1) {
					this.aClass13_1.anInt344 = this.anInt912 - this.anInt944 - 77;
					if (super.anInt808 > 448 && super.anInt808 < 560 && super.anInt809 > 332) {
						this.method638(super.anInt808 - 17, -1, 77, 463, super.anInt809 - 357, 0, this.aClass13_1, this.anInt912);
					}
					@Pc(367) int local367 = this.anInt912 - this.aClass13_1.anInt344 - 77;
					if (local367 < 0) {
						local367 = 0;
					}
					if (local367 > this.anInt912 - 77) {
						local367 = this.anInt912 - 77;
					}
					if (this.anInt944 != local367) {
						this.anInt944 = local367;
						this.aBoolean224 = true;
					}
				}
				if (this.anInt986 != -1) {
					local285 = this.method697(this.anInt986, this.anInt953);
					if (local285) {
						this.aBoolean224 = true;
					}
				}
				if (this.anInt849 == 3) {
					this.aBoolean224 = true;
				}
				if (this.anInt950 == 3) {
					this.aBoolean224 = true;
				}
				if (this.aString28 != null) {
					this.aBoolean224 = true;
				}
				if (this.aBoolean208 && this.anInt867 == 2) {
					this.aBoolean224 = true;
				}
				if (this.aBoolean224) {
					this.method637();
					this.aBoolean224 = false;
				}
				if (this.anInt946 == 2) {
					this.method706((byte) 2);
					this.aClass42_13.method468(550, 4, super.aGraphics2);
				}
				if (this.anInt998 != -1) {
					this.aBoolean226 = true;
				}
				if (this.aBoolean226) {
					if (this.anInt998 != -1 && this.anInt998 == this.anInt922) {
						this.anInt998 = -1;
						this.aClass3_Sub1_Sub3_8.method263(121);
						this.aClass3_Sub1_Sub3_8.method264(this.anInt922);
					}
					this.aBoolean226 = false;
					this.aClass42_18.method467((byte) 6);
					this.aClass3_Sub1_Sub2_Sub2_10.method373(0, 0);
					if (this.anInt1021 == -1) {
						if (this.anIntArray235[this.anInt922] != -1) {
							if (this.anInt922 == 0) {
								this.aClass3_Sub1_Sub2_Sub2_14.method373(22, 10);
							}
							if (this.anInt922 == 1) {
								this.aClass3_Sub1_Sub2_Sub2_15.method373(54, 8);
							}
							if (this.anInt922 == 2) {
								this.aClass3_Sub1_Sub2_Sub2_15.method373(82, 8);
							}
							if (this.anInt922 == 3) {
								this.aClass3_Sub1_Sub2_Sub2_16.method373(110, 8);
							}
							if (this.anInt922 == 4) {
								this.aClass3_Sub1_Sub2_Sub2_18.method373(153, 8);
							}
							if (this.anInt922 == 5) {
								this.aClass3_Sub1_Sub2_Sub2_18.method373(181, 8);
							}
							if (this.anInt922 == 6) {
								this.aClass3_Sub1_Sub2_Sub2_17.method373(209, 9);
							}
						}
						if (this.anIntArray235[0] != -1 && (this.anInt998 != 0 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[0].method373(29, 13);
						}
						if (this.anIntArray235[1] != -1 && (this.anInt998 != 1 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[1].method373(53, 11);
						}
						if (this.anIntArray235[2] != -1 && (this.anInt998 != 2 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[2].method373(82, 11);
						}
						if (this.anIntArray235[3] != -1 && (this.anInt998 != 3 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[3].method373(115, 12);
						}
						if (this.anIntArray235[4] != -1 && (this.anInt998 != 4 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[4].method373(153, 13);
						}
						if (this.anIntArray235[5] != -1 && (this.anInt998 != 5 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[5].method373(180, 11);
						}
						if (this.anIntArray235[6] != -1 && (this.anInt998 != 6 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[6].method373(208, 13);
						}
					}
					this.aClass42_18.method468(516, 160, super.aGraphics2);
					anInt939++;
					if (anInt939 > 68) {
						anInt939 = 0;
						this.aClass3_Sub1_Sub3_8.method263(102);
					}
					this.aClass42_17.method467((byte) 6);
					this.aClass3_Sub1_Sub2_Sub2_9.method373(0, 0);
					if (this.anInt1021 == -1) {
						if (this.anIntArray235[this.anInt922] != -1) {
							if (this.anInt922 == 7) {
								this.aClass3_Sub1_Sub2_Sub2_3.method373(42, 0);
							}
							if (this.anInt922 == 8) {
								this.aClass3_Sub1_Sub2_Sub2_4.method373(74, 0);
							}
							if (this.anInt922 == 9) {
								this.aClass3_Sub1_Sub2_Sub2_4.method373(102, 0);
							}
							if (this.anInt922 == 10) {
								this.aClass3_Sub1_Sub2_Sub2_5.method373(130, 1);
							}
							if (this.anInt922 == 11) {
								this.aClass3_Sub1_Sub2_Sub2_7.method373(173, 0);
							}
							if (this.anInt922 == 12) {
								this.aClass3_Sub1_Sub2_Sub2_7.method373(201, 0);
							}
							if (this.anInt922 == 13) {
								this.aClass3_Sub1_Sub2_Sub2_6.method373(229, 0);
							}
						}
						if (this.anIntArray235[8] != -1 && (this.anInt998 != 8 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[7].method373(74, 2);
						}
						if (this.anIntArray235[9] != -1 && (this.anInt998 != 9 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[8].method373(102, 3);
						}
						if (this.anIntArray235[10] != -1 && (this.anInt998 != 10 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[9].method373(137, 4);
						}
						if (this.anIntArray235[11] != -1 && (this.anInt998 != 11 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[10].method373(174, 2);
						}
						if (this.anIntArray235[12] != -1 && (this.anInt998 != 12 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[11].method373(201, 2);
						}
						if (this.anIntArray235[13] != -1 && (this.anInt998 != 13 || anInt1050 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub2Array2[12].method373(226, 2);
						}
					}
					this.aClass42_17.method468(496, 466, super.aGraphics2);
					this.aClass42_14.method467((byte) 6);
					Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
				}
				if (this.aBoolean241) {
					this.aBoolean241 = false;
					this.aClass42_16.method467((byte) 6);
					this.aClass3_Sub1_Sub2_Sub2_8.method373(0, 0);
					this.aClass3_Sub1_Sub2_Sub1_3.method121(16777215, true, 55, 28, "Public chat");
					if (this.anInt925 == 0) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(65280, true, 55, 41, "On");
					}
					if (this.anInt925 == 1) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(16776960, true, 55, 41, "Friends");
					}
					if (this.anInt925 == 2) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(16711680, true, 55, 41, "Off");
					}
					if (this.anInt925 == 3) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(65535, true, 55, 41, "Hide");
					}
					this.aClass3_Sub1_Sub2_Sub1_3.method121(16777215, true, 184, 28, "Private chat");
					if (this.anInt913 == 0) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(65280, true, 184, 41, "On");
					}
					if (this.anInt913 == 1) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(16776960, true, 184, 41, "Friends");
					}
					if (this.anInt913 == 2) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(16711680, true, 184, 41, "Off");
					}
					this.aClass3_Sub1_Sub2_Sub1_3.method121(16777215, true, 324, 28, "Trade/compete");
					if (this.anInt903 == 0) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(65280, true, 324, 41, "On");
					}
					if (this.anInt903 == 1) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(16776960, true, 324, 41, "Friends");
					}
					if (this.anInt903 == 2) {
						this.aClass3_Sub1_Sub2_Sub1_3.method121(16711680, true, 324, 41, "Off");
					}
					this.aClass3_Sub1_Sub2_Sub1_3.method121(16777215, true, 458, 33, "Report abuse");
					this.aClass42_16.method468(0, 453, super.aGraphics2);
					this.aClass42_14.method467((byte) 6);
					Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
				}
				this.anInt953 = 0;
			} else {
				if (this.anInt946 == 2) {
					this.method697(this.anInt914, this.anInt953);
					if (this.anInt1033 != -1) {
						this.method697(this.anInt1033, this.anInt953);
					}
					this.anInt953 = 0;
					this.method619();
					super.aClass42_2.method467((byte) 6);
					Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray216;
					Class3_Sub1_Sub2.method552();
					this.aBoolean221 = true;
					@Pc(64) Class13 local64 = Class13.method194(this.anInt914);
					if (local64.anInt355 == 512 && local64.anInt339 == 334 && local64.anInt338 == 0) {
						local64.anInt355 = 765;
						local64.anInt339 = 503;
					}
					this.method595(0, 0, local64, 0);
					if (this.anInt1033 != -1) {
						local64 = Class13.method194(this.anInt1033);
						if (local64.anInt355 == 512 && local64.anInt339 == 334 && local64.anInt338 == 0) {
							local64.anInt355 = 765;
							local64.anInt339 = 503;
						}
						this.method595(0, 0, local64, 0);
					}
					if (this.aBoolean208) {
						this.method683();
					} else {
						this.method700();
						this.method589();
					}
				}
				super.aClass42_2.method468(0, 0, super.aGraphics2);
			}
		} catch (@Pc(1213) RuntimeException local1213) {
			signlink.reporterror("89278, " + 40439 + ", " + local1213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method647() {
		try {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (this.anInt991 == 0) {
				local21 = super.anInt804 / 2 - 80;
				local28 = super.anInt805 / 2 + 20;
				local28 += 20;
				if (super.anInt813 == 1 && super.anInt814 >= local21 - 75 && super.anInt814 <= local21 + 75 && super.anInt815 >= local28 - 20 && super.anInt815 <= local28 + 20) {
					this.anInt991 = 3;
					this.anInt865 = 0;
				}
				local21 = super.anInt804 / 2 + 80;
				if (super.anInt813 == 1 && super.anInt814 >= local21 - 75 && super.anInt814 <= local21 + 75 && super.anInt815 >= local28 - 20 && super.anInt815 <= local28 + 20) {
					this.aString24 = "";
					this.aString25 = "Enter your username & password.";
					this.anInt991 = 2;
					this.anInt865 = 0;
				}
			} else if (this.anInt991 == 2) {
				local21 = super.anInt805 / 2 - 40;
				local21 += 30;
				local21 += 25;
				if (super.anInt813 == 1 && super.anInt815 >= local21 - 15 && super.anInt815 < local21) {
					this.anInt865 = 0;
				}
				local21 += 15;
				if (super.anInt813 == 1 && super.anInt815 >= local21 - 15 && super.anInt815 < local21) {
					this.anInt865 = 1;
				}
				local21 += 15;
				local28 = super.anInt804 / 2 - 80;
				@Pc(174) int local174 = super.anInt805 / 2 + 50;
				@Pc(175) int local175 = local174 + 20;
				if (super.anInt813 == 1 && super.anInt814 >= local28 - 75 && super.anInt814 <= local28 + 75 && super.anInt815 >= local175 - 20 && super.anInt815 <= local175 + 20) {
					this.anInt978 = 0;
					this.method712(this.aString18, this.aString19, false);
					if (this.aBoolean237) {
						return;
					}
				}
				local28 = super.anInt804 / 2 + 80;
				if (super.anInt813 == 1 && super.anInt814 >= local28 - 75 && super.anInt814 <= local28 + 75 && super.anInt815 >= local175 - 20 && super.anInt815 <= local175 + 20) {
					this.anInt991 = 0;
					this.aString18 = "";
					this.aString19 = "";
				}
				while (true) {
					while (true) {
						@Pc(265) int local265 = this.method578();
						if (local265 == -1) {
							return;
						}
						@Pc(270) boolean local270 = false;
						for (@Pc(272) int local272 = 0; local272 < aString22.length(); local272++) {
							if (local265 == aString22.charAt(local272)) {
								local270 = true;
								break;
							}
						}
						if (this.anInt865 == 0) {
							if (local265 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt865 = 1;
							}
							if (local270) {
								this.aString18 = this.aString18 + (char) local265;
							}
							if (this.aString18.length() > 12) {
								this.aString18 = this.aString18.substring(0, 12);
							}
						} else if (this.anInt865 == 1) {
							if (local265 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt865 = 0;
							}
							if (local270) {
								this.aString19 = this.aString19 + (char) local265;
							}
							if (this.aString19.length() > 20) {
								this.aString19 = this.aString19.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt991 == 3) {
				local21 = super.anInt804 / 2;
				local28 = super.anInt805 / 2 + 50;
				@Pc(429) int local429 = local28 + 20;
				if (super.anInt813 == 1 && super.anInt814 >= local21 - 75 && super.anInt814 <= local21 + 75 && super.anInt815 >= local429 - 20 && super.anInt815 <= local429 + 20) {
					this.anInt991 = 0;
					return;
				}
			}
		} catch (@Pc(462) RuntimeException local462) {
			signlink.reporterror("39768, " + true + ", " + local462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method648(@OriginalArg(1) boolean arg0) {
		try {
			this.method657();
			this.aClass42_5.method467((byte) 6);
			this.aClass3_Sub1_Sub2_Sub2_19.method373(0, 0);
			@Pc(48) byte local48;
			@Pc(60) int local60;
			if (this.anInt991 == 0) {
				this.aClass3_Sub1_Sub2_Sub1_2.method121(7711145, true, 180, 180, this.aClass10_Sub1_1.aString15);
				local48 = 80;
				this.aClass3_Sub1_Sub2_Sub1_4.method121(16776960, true, 180, 80, "Welcome to RuneScape");
				local60 = local48 + 30;
				this.aClass3_Sub1_Sub2_Sub2_20.method373(27, 100);
				this.aClass3_Sub1_Sub2_Sub1_4.method121(16777215, true, 100, 125, "New User");
				this.aClass3_Sub1_Sub2_Sub2_20.method373(187, 100);
				this.aClass3_Sub1_Sub2_Sub1_4.method121(16777215, true, 260, 125, "Existing User");
			}
			if (this.anInt991 == 2) {
				local48 = 60;
				if (this.aString24.length() > 0) {
					this.aClass3_Sub1_Sub2_Sub1_4.method121(16776960, true, 180, 45, this.aString24);
					this.aClass3_Sub1_Sub2_Sub1_4.method121(16776960, true, 180, 60, this.aString25);
					local60 = local48 + 30;
				} else {
					this.aClass3_Sub1_Sub2_Sub1_4.method121(16776960, true, 180, 53, this.aString25);
					local60 = local48 + 30;
				}
				this.aClass3_Sub1_Sub2_Sub1_4.method128(90, "Username: " + this.aString18 + (this.anInt865 == 0 & anInt1050 % 40 < 20 ? "@yel@|" : ""), true, 16777215, 90);
				local60 += 15;
				this.aClass3_Sub1_Sub2_Sub1_4.method128(105, "Password: " + Class38.method440(this.aString19) + (this.anInt865 == 1 & anInt1050 % 40 < 20 ? "@yel@|" : ""), true, 16777215, 92);
				local60 += 15;
				if (!arg0) {
					this.aClass3_Sub1_Sub2_Sub2_20.method373(27, 130);
					this.aClass3_Sub1_Sub2_Sub1_4.method121(16777215, true, 100, 155, "Login");
					this.aClass3_Sub1_Sub2_Sub2_20.method373(187, 130);
					this.aClass3_Sub1_Sub2_Sub1_4.method121(16777215, true, 260, 155, "Cancel");
				}
			}
			if (this.anInt991 == 3) {
				this.aClass3_Sub1_Sub2_Sub1_4.method121(16776960, true, 180, 40, "Create a free account");
				local48 = 65;
				this.aClass3_Sub1_Sub2_Sub1_4.method121(16777215, true, 180, 65, "To create a new account you need to");
				local60 = local48 + 15;
				this.aClass3_Sub1_Sub2_Sub1_4.method121(16777215, true, 180, 80, "go back to the main RuneScape webpage");
				local60 += 15;
				this.aClass3_Sub1_Sub2_Sub1_4.method121(16777215, true, 180, 95, "and choose the red 'create account'");
				local60 += 15;
				this.aClass3_Sub1_Sub2_Sub1_4.method121(16777215, true, 180, 110, "button at the top right of that page.");
				local60 += 15;
				this.aClass3_Sub1_Sub2_Sub2_20.method373(107, 130);
				this.aClass3_Sub1_Sub2_Sub1_4.method121(16777215, true, 180, 155, "Cancel");
			}
			this.aClass42_5.method468(202, 171, super.aGraphics2);
			if (this.aBoolean221) {
				this.aBoolean221 = false;
				this.aClass42_3.method468(128, 0, super.aGraphics2);
				this.aClass42_4.method468(202, 371, super.aGraphics2);
				this.aClass42_8.method468(0, 265, super.aGraphics2);
				this.aClass42_9.method468(562, 265, super.aGraphics2);
				this.aClass42_10.method468(128, 171, super.aGraphics2);
				this.aClass42_11.method468(562, 171, super.aGraphics2);
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("17714, " + true + ", " + arg0 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NHEPCMLW;Z)V")
	private void method649(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			this.anInt861 = 0;
			this.anInt1013 = 0;
			this.method597(arg1, arg0);
			this.method655(arg1, arg0);
			this.method724(arg0, arg1);
			this.method603(arg0, arg1);
			@Pc(42) int local42;
			for (@Pc(35) int local35 = 0; local35 < this.anInt861; local35++) {
				local42 = this.anIntArray217[local35];
				if (this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local42].anInt720 != anInt1050) {
					this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local42] = null;
				}
			}
			if (arg1.anInt441 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt441 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local42 = 0; local42 < this.anInt1012; local42++) {
				if (this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray251[local42]] == null) {
					signlink.reporterror(this.aString18 + " null entry in pl list - pos:" + local42 + " size:" + this.anInt1012);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("6420, " + arg0 + ", " + arg1 + ", " + false + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;I)Lclient!INOFEYKQ;")
	private Class14 method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass44Array1[0] != null) {
					local3 = this.aClass44Array1[0].method478(arg1);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg0) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class14(this.aBoolean215, local3);
			}
			local34 = 0;
			if (arg2 != this.anInt911) {
				anInt1051 = -450;
			}
			while (local3 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method586(arg5, "Requesting " + arg3);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method662(arg4 + arg0);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class3_Sub1_Sub3 local102 = new Class3_Sub1_Sub3((byte) -103, local91);
					local102.anInt441 = 3;
					@Pc(110) int local110 = local102.method278() + 6;
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
							this.method586(arg5, "Loading " + arg3 + " - " + local175 + "%");
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass44Array1[0] != null) {
							this.aClass44Array1[0].method479(local3.length, local3, arg1);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass44Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local135 = (int) this.aCRC32_2.getValue();
						if (local135 != arg0) {
							local3 = null;
							local34++;
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
					for (local77 = local5; local77 > 0; local77--) {
						if (local34 >= 3) {
							this.method586(arg5, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.method586(arg5, local62 + " - Retrying in " + local77);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(327) Exception local327) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean219 = !this.aBoolean219;
				}
			}
			return new Class14(this.aBoolean215, local3);
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("60652, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local360.toString());
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

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method651(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				this.anInt885 = -1;
			}
			if (this.anInt946 == 2) {
				for (@Pc(15) Class3_Sub3 local15 = (Class3_Sub3) this.aClass27_11.method327(); local15 != null; local15 = (Class3_Sub3) this.aClass27_11.method329(this.anInt1016)) {
					if (local15.anInt670 > 0) {
						local15.anInt670--;
					}
					if (local15.anInt670 != 0) {
						if (local15.anInt669 > 0) {
							local15.anInt669--;
						}
						if (local15.anInt669 == 0 && local15.anInt667 >= 1 && local15.anInt668 >= 1 && local15.anInt667 <= 102 && local15.anInt668 <= 102 && (local15.anInt671 < 0 || Class8.method146(this.anInt941, local15.anInt673, local15.anInt671))) {
							this.method608(local15.anInt665, local15.anInt667, local15.anInt671, local15.anInt673, local15.anInt668, local15.anInt666, local15.anInt672);
							local15.anInt669 = -1;
							if (local15.anInt671 == local15.anInt662 && local15.anInt662 == -1) {
								local15.method547();
							} else if (local15.anInt671 == local15.anInt662 && local15.anInt672 == local15.anInt663 && local15.anInt673 == local15.anInt664) {
								local15.method547();
							}
						}
					} else if (local15.anInt662 < 0 || Class8.method146(this.anInt941, local15.anInt664, local15.anInt662)) {
						this.method608(local15.anInt665, local15.anInt667, local15.anInt662, local15.anInt664, local15.anInt668, local15.anInt666, local15.anInt663);
						local15.method547();
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("5713, " + arg0 + ", " + local161.toString());
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
				return new URL("http://127.0.0.1:" + (anInt1032 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method652() {
		try {
			this.aBoolean202 = true;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean238) {
					this.anInt1034++;
					this.method704();
					this.method704();
					this.method669();
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
			this.aBoolean202 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("43184, " + 7 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!NHEPCMLW;IB)V")
	private void method653(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt1013; local3++) {
				@Pc(10) int local10 = this.anIntArray252[local3];
				@Pc(15) Class3_Sub1_Sub1_Sub4_Sub2 local15 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local10];
				@Pc(18) int local18 = arg0.method274();
				@Pc(25) int local25;
				@Pc(35) int local35;
				if ((local18 & 0x10) != 0) {
					local25 = arg0.method276();
					if (local25 == 65535) {
						local25 = -1;
					}
					local35 = arg0.method294(this.anInt851);
					if (local25 == local15.anInt743 && local25 != -1) {
						@Pc(47) int local47 = Class31.aClass31Array1[local25].anInt489;
						if (local47 == 1) {
							local15.anInt744 = 0;
							local15.anInt745 = 0;
							local15.anInt746 = local35;
							local15.anInt747 = 0;
						}
						if (local47 == 2) {
							local15.anInt747 = 0;
						}
					} else if (local25 == -1 || local15.anInt743 == -1 || Class31.aClass31Array1[local25].anInt483 >= Class31.aClass31Array1[local15.anInt743].anInt483) {
						local15.anInt743 = local25;
						local15.anInt744 = 0;
						local15.anInt745 = 0;
						local15.anInt746 = local35;
						local15.anInt747 = 0;
						local15.anInt721 = local15.anInt736;
					}
				}
				if ((local18 & 0x4) != 0) {
					local25 = arg0.method294(this.anInt851);
					local35 = arg0.method292();
					local15.method537(local25, anInt1050, local35);
					local15.anInt740 = anInt1050 + 300;
					local15.anInt741 = arg0.method293();
					local15.anInt742 = arg0.method292();
				}
				if ((local18 & 0x80) != 0) {
					local25 = arg0.method293();
					local35 = arg0.method292();
					local15.method537(local25, anInt1050, local35);
					local15.anInt740 = anInt1050 + 300;
					local15.anInt741 = arg0.method294(this.anInt851);
					local15.anInt742 = arg0.method274();
				}
				if ((local18 & 0x40) != 0) {
					local15.aString16 = arg0.method281();
					local15.anInt719 = 100;
				}
				if ((local18 & 0x2) != 0) {
					local15.anInt710 = arg0.method276();
					if (local15.anInt710 == 65535) {
						local15.anInt710 = -1;
					}
				}
				if ((local18 & 0x8) != 0) {
					local15.anInt726 = arg0.method301();
					local15.anInt727 = arg0.method300();
				}
				if ((local18 & 0x1) != 0) {
					local15.aClass7_2 = Class7.method83(arg0.method302());
					local15.anInt728 = local15.aClass7_2.aByte2;
					local15.anInt757 = local15.aClass7_2.anInt134;
					local15.anInt748 = local15.aClass7_2.anInt127;
					local15.anInt749 = local15.aClass7_2.anInt138;
					local15.anInt750 = local15.aClass7_2.anInt126;
					local15.anInt751 = local15.aClass7_2.anInt132;
					local15.anInt752 = local15.aClass7_2.anInt143;
				}
				if ((local18 & 0x20) != 0) {
					local15.anInt714 = arg0.method301();
					local25 = arg0.method307();
					local15.anInt718 = local25 >> 16;
					local15.anInt717 = anInt1050 + (local25 & 0xFFFF);
					local15.anInt715 = 0;
					local15.anInt716 = 0;
					if (local15.anInt717 > anInt1050) {
						local15.anInt715 = -1;
					}
					if (local15.anInt714 == 65535) {
						local15.anInt714 = -1;
					}
				}
			}
			@Pc(313) boolean local313 = false;
		} catch (@Pc(319) RuntimeException local319) {
			signlink.reporterror("86177, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method654() {
		try {
			this.aBoolean238 = false;
			while (this.aBoolean202) {
				this.aBoolean238 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(22) Exception local22) {
				}
			}
			this.aClass3_Sub1_Sub2_Sub2_19 = null;
			this.aClass3_Sub1_Sub2_Sub2_20 = null;
			this.aClass3_Sub1_Sub2_Sub2Array3 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.anIntArray274 = null;
			this.anIntArray230 = null;
			this.anIntArray231 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.aClass3_Sub1_Sub2_Sub4_4 = null;
			this.aClass3_Sub1_Sub2_Sub4_5 = null;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("53150, " + -409 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!NHEPCMLW;I)V")
	private void method655(@OriginalArg(1) Class3_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method285(8);
			@Pc(18) int local18;
			if (local12 < this.anInt1012) {
				for (local18 = local12; local18 < this.anInt1012; local18++) {
					this.anIntArray217[this.anInt861++] = this.anIntArray251[local18];
				}
			}
			if (local12 > this.anInt1012) {
				signlink.reporterror(this.aString18 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt1012 = 0;
			for (local18 = 0; local18 < local12; local18++) {
				@Pc(70) int local70 = this.anIntArray251[local18];
				@Pc(75) Class3_Sub1_Sub1_Sub4_Sub1 local75 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local70];
				@Pc(80) int local80 = arg0.method285(1);
				if (local80 == 0) {
					this.anIntArray251[this.anInt1012++] = local70;
					local75.anInt720 = anInt1050;
				} else {
					@Pc(103) int local103 = arg0.method285(2);
					if (local103 == 0) {
						this.anIntArray251[this.anInt1012++] = local70;
						local75.anInt720 = anInt1050;
						this.anIntArray252[this.anInt1013++] = local70;
					} else {
						@Pc(154) int local154;
						@Pc(164) int local164;
						if (local103 == 1) {
							this.anIntArray251[this.anInt1012++] = local70;
							local75.anInt720 = anInt1050;
							local154 = arg0.method285(3);
							local75.method539(false, local154);
							local164 = arg0.method285(1);
							if (local164 == 1) {
								this.anIntArray252[this.anInt1013++] = local70;
							}
						} else if (local103 == 2) {
							this.anIntArray251[this.anInt1012++] = local70;
							local75.anInt720 = anInt1050;
							local154 = arg0.method285(3);
							local75.method539(true, local154);
							local164 = arg0.method285(3);
							local75.method539(true, local164);
							@Pc(222) int local222 = arg0.method285(1);
							if (local222 == 1) {
								this.anIntArray252[this.anInt1013++] = local70;
							}
						} else if (local103 == 3) {
							this.anIntArray217[this.anInt861++] = local70;
						}
					}
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("48888, " + false + ", " + arg0 + ", " + arg1 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method656(@OriginalArg(0) int arg0) {
		try {
			this.anInt1028 = 0;
			while (arg0 >= 0) {
				this.aClass27ArrayArrayArray1 = null;
			}
			@Pc(77) int local77;
			for (@Pc(13) int local13 = -1; local13 < this.anInt1012 + this.anInt987; local13++) {
				@Pc(20) Class3_Sub1_Sub1_Sub4 local20;
				if (local13 == -1) {
					local20 = aClass3_Sub1_Sub1_Sub4_Sub1_1;
				} else if (local13 < this.anInt1012) {
					local20 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray251[local13]];
				} else {
					local20 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray245[local13 - this.anInt1012]];
				}
				if (local20 != null && local20.method536(29)) {
					@Pc(61) Class7 local61;
					if (local20 instanceof Class3_Sub1_Sub1_Sub4_Sub2) {
						local61 = ((Class3_Sub1_Sub1_Sub4_Sub2) local20).aClass7_2;
						if (local61.anIntArray54 != null) {
							local61 = local61.method86();
						}
						if (local61 == null) {
							continue;
						}
					}
					if (local13 >= this.anInt1012) {
						local61 = ((Class3_Sub1_Sub1_Sub4_Sub2) local20).aClass7_2;
						if (local61.anInt141 >= 0 && local61.anInt141 < this.aClass3_Sub1_Sub2_Sub4Array5.length) {
							this.method665(local20, local20.anInt758 + 15);
							if (this.anInt1004 > -1) {
								this.aClass3_Sub1_Sub2_Sub4Array5[local61.anInt141].method566(this.anInt1004 - 12, this.anInt1005 - 30, (byte) 8);
							}
						}
						if (this.anInt1000 == 1 && this.anInt841 == this.anIntArray245[local13 - this.anInt1012] && anInt1050 % 20 < 10) {
							this.method665(local20, local20.anInt758 + 15);
							if (this.anInt1004 > -1) {
								this.aClass3_Sub1_Sub2_Sub4Array8[0].method566(this.anInt1004 - 12, this.anInt1005 - 28, (byte) 8);
							}
						}
					} else {
						local77 = 30;
						@Pc(80) Class3_Sub1_Sub1_Sub4_Sub1 local80 = (Class3_Sub1_Sub1_Sub4_Sub1) local20;
						if (local80.anInt301 != -1 || local80.anInt290 != -1) {
							this.method665(local20, local20.anInt758 + 15);
							if (this.anInt1004 > -1) {
								if (local80.anInt301 != -1) {
									this.aClass3_Sub1_Sub2_Sub4Array6[local80.anInt301].method566(this.anInt1004 - 12, this.anInt1005 - 30, (byte) 8);
									local77 += 25;
								}
								if (local80.anInt290 != -1) {
									this.aClass3_Sub1_Sub2_Sub4Array5[local80.anInt290].method566(this.anInt1004 - 12, this.anInt1005 - local77, (byte) 8);
									local77 += 25;
								}
							}
						}
						if (local13 >= 0 && this.anInt1000 == 10 && this.anInt866 == this.anIntArray251[local13]) {
							this.method665(local20, local20.anInt758 + 15);
							if (this.anInt1004 > -1) {
								this.aClass3_Sub1_Sub2_Sub4Array8[1].method566(this.anInt1004 - 12, this.anInt1005 - local77, (byte) 8);
							}
						}
					}
					if (local20.aString16 != null && (local13 >= this.anInt1012 || this.anInt925 == 0 || this.anInt925 == 3 || this.anInt925 == 1 && this.method689(((Class3_Sub1_Sub1_Sub4_Sub1) local20).aString4))) {
						this.method665(local20, local20.anInt758);
						if (this.anInt1004 > -1 && this.anInt1028 < this.anInt1029) {
							this.anIntArray263[this.anInt1028] = this.aClass3_Sub1_Sub2_Sub1_4.method123(local20.aString16) / 2;
							this.anIntArray262[this.anInt1028] = this.aClass3_Sub1_Sub2_Sub1_4.anInt172;
							this.anIntArray260[this.anInt1028] = this.anInt1004;
							this.anIntArray261[this.anInt1028] = this.anInt1005;
							this.anIntArray264[this.anInt1028] = local20.anInt725;
							this.anIntArray265[this.anInt1028] = local20.anInt739;
							this.anIntArray266[this.anInt1028] = local20.anInt719;
							this.aStringArray13[this.anInt1028++] = local20.aString16;
							if (this.anInt890 == 0 && local20.anInt739 >= 1 && local20.anInt739 <= 3) {
								this.anIntArray262[this.anInt1028] += 10;
								this.anIntArray261[this.anInt1028] += 5;
							}
							if (this.anInt890 == 0 && local20.anInt739 == 4) {
								this.anIntArray263[this.anInt1028] = 60;
							}
							if (this.anInt890 == 0 && local20.anInt739 == 5) {
								this.anIntArray262[this.anInt1028] += 5;
							}
						}
					}
					if (local20.anInt740 > anInt1050) {
						this.method665(local20, local20.anInt758 + 15);
						if (this.anInt1004 > -1) {
							local77 = local20.anInt741 * 30 / local20.anInt742;
							if (local77 > 30) {
								local77 = 30;
							}
							Class3_Sub1_Sub2.method554(this.anInt1004 - 15, 65280, 5, this.anInt1005 - 3, local77);
							Class3_Sub1_Sub2.method554(this.anInt1004 + local77 - 15, 16711680, 5, this.anInt1005 - 3, 30 - local77);
						}
					}
					for (local77 = 0; local77 < 4; local77++) {
						if (local20.anIntArray207[local77] > anInt1050) {
							this.method665(local20, local20.anInt758 / 2);
							if (this.anInt1004 > -1) {
								if (local77 == 1) {
									this.anInt1005 -= 20;
								}
								if (local77 == 2) {
									this.anInt1004 -= 15;
									this.anInt1005 -= 10;
								}
								if (local77 == 3) {
									this.anInt1004 += 15;
									this.anInt1005 -= 10;
								}
								this.aClass3_Sub1_Sub2_Sub4Array9[local20.anIntArray206[local77]].method566(this.anInt1004 - 12, this.anInt1005 - 12, (byte) 8);
								this.aClass3_Sub1_Sub2_Sub1_2.method120(0, this.anInt1004, String.valueOf(local20.anIntArray205[local77]), this.anInt1005 + 4);
								this.aClass3_Sub1_Sub2_Sub1_2.method120(16777215, this.anInt1004 - 1, String.valueOf(local20.anIntArray205[local77]), this.anInt1005 + 3);
							}
						}
					}
				}
			}
			for (@Pc(617) int local617 = 0; local617 < this.anInt1028; local617++) {
				local77 = this.anIntArray260[local617];
				@Pc(629) int local629 = this.anIntArray261[local617];
				@Pc(634) int local634 = this.anIntArray263[local617];
				@Pc(639) int local639 = this.anIntArray262[local617];
				@Pc(641) boolean local641 = true;
				while (local641) {
					local641 = false;
					for (@Pc(647) int local647 = 0; local647 < local617; local647++) {
						if (local629 + 2 > this.anIntArray261[local647] - this.anIntArray262[local647] && local629 - local639 < this.anIntArray261[local647] + 2 && local77 - local634 < this.anIntArray260[local647] + this.anIntArray263[local647] && local77 + local634 > this.anIntArray260[local647] - this.anIntArray263[local647] && this.anIntArray261[local647] - this.anIntArray262[local647] < local629) {
							local629 = this.anIntArray261[local647] - this.anIntArray262[local647];
							local641 = true;
						}
					}
				}
				this.anInt1004 = this.anIntArray260[local617];
				this.anInt1005 = this.anIntArray261[local617] = local629;
				@Pc(746) String local746 = this.aStringArray13[local617];
				if (this.anInt890 == 0) {
					@Pc(751) int local751 = 16776960;
					if (this.anIntArray264[local617] < 6) {
						local751 = this.anIntArray249[this.anIntArray264[local617]];
					}
					if (this.anIntArray264[local617] == 6) {
						local751 = this.anInt945 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray264[local617] == 7) {
						local751 = this.anInt945 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray264[local617] == 8) {
						local751 = this.anInt945 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(826) int local826;
					if (this.anIntArray264[local617] == 9) {
						local826 = 150 - this.anIntArray266[local617];
						if (local826 < 50) {
							local751 = 1280 * local826 + 16711680;
						} else if (local826 < 100) {
							local751 = 16776960 - 327680 * (local826 - 50);
						} else if (local826 < 150) {
							local751 = 5 * (local826 - 100) + 65280;
						}
					}
					if (this.anIntArray264[local617] == 10) {
						local826 = 150 - this.anIntArray266[local617];
						if (local826 < 50) {
							local751 = 5 * local826 + 16711680;
						} else if (local826 < 100) {
							local751 = 16711935 - 327680 * (local826 - 50);
						} else if (local826 < 150) {
							local751 = 327680 * (local826 - 100) + 255 - 5 * (local826 - 100);
						}
					}
					if (this.anIntArray264[local617] == 11) {
						local826 = 150 - this.anIntArray266[local617];
						if (local826 < 50) {
							local751 = 16777215 - 327685 * local826;
						} else if (local826 < 100) {
							local751 = 327685 * (local826 - 50) + 65280;
						} else if (local826 < 150) {
							local751 = 16777215 - 327680 * (local826 - 100);
						}
					}
					if (this.anIntArray265[local617] == 0) {
						this.aClass3_Sub1_Sub2_Sub1_4.method120(0, this.anInt1004, local746, this.anInt1005 + 1);
						this.aClass3_Sub1_Sub2_Sub1_4.method120(local751, this.anInt1004, local746, this.anInt1005);
					}
					if (this.anIntArray265[local617] == 1) {
						this.aClass3_Sub1_Sub2_Sub1_4.method125(this.anInt945, this.anInt1005 + 1, 0, this.anInt1004, local746);
						this.aClass3_Sub1_Sub2_Sub1_4.method125(this.anInt945, this.anInt1005, local751, this.anInt1004, local746);
					}
					if (this.anIntArray265[local617] == 2) {
						this.aClass3_Sub1_Sub2_Sub1_4.method126(local746, this.anInt1004, this.anInt1005 + 1, this.anInt945, 0);
						this.aClass3_Sub1_Sub2_Sub1_4.method126(local746, this.anInt1004, this.anInt1005, this.anInt945, local751);
					}
					if (this.anIntArray265[local617] == 3) {
						this.aClass3_Sub1_Sub2_Sub1_4.method127(150 - this.anIntArray266[local617], this.anInt945, this.anInt1004, 0, local746, this.anInt1005 + 1);
						this.aClass3_Sub1_Sub2_Sub1_4.method127(150 - this.anIntArray266[local617], this.anInt945, this.anInt1004, local751, local746, this.anInt1005);
					}
					@Pc(1123) int local1123;
					if (this.anIntArray265[local617] == 4) {
						local826 = this.aClass3_Sub1_Sub2_Sub1_4.method123(local746);
						local1123 = (150 - this.anIntArray266[local617]) * (local826 + 100) / 150;
						Class3_Sub1_Sub2.method551(this.anInt1004 - 50, 334, 0, this.anInt1004 + 50);
						this.aClass3_Sub1_Sub2_Sub1_4.method124(local746, this.anInt1004 + 50 - local1123, this.anInt1005 + 1, 0);
						this.aClass3_Sub1_Sub2_Sub1_4.method124(local746, this.anInt1004 + 50 - local1123, this.anInt1005, local751);
						Class3_Sub1_Sub2.method550();
					}
					if (this.anIntArray265[local617] == 5) {
						local826 = 150 - this.anIntArray266[local617];
						local1123 = 0;
						if (local826 < 25) {
							local1123 = local826 - 25;
						} else if (local826 > 125) {
							local1123 = local826 - 125;
						}
						Class3_Sub1_Sub2.method551(0, this.anInt1005 + 5, this.anInt1005 - this.aClass3_Sub1_Sub2_Sub1_4.anInt172 - 1, 512);
						this.aClass3_Sub1_Sub2_Sub1_4.method120(0, this.anInt1004, local746, this.anInt1005 + local1123 + 1);
						this.aClass3_Sub1_Sub2_Sub1_4.method120(local751, this.anInt1004, local746, this.anInt1005 + local1123);
						Class3_Sub1_Sub2.method550();
					}
				} else {
					this.aClass3_Sub1_Sub2_Sub1_4.method120(0, this.anInt1004, local746, this.anInt1005 + 1);
					this.aClass3_Sub1_Sub2_Sub1_4.method120(16776960, this.anInt1004, local746, this.anInt1005);
				}
			}
		} catch (@Pc(1273) RuntimeException local1273) {
			signlink.reporterror("19487, " + arg0 + ", " + local1273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method657() {
		try {
			if (this.aClass42_3 == null) {
				super.aClass42_2 = null;
				this.aClass42_15 = null;
				this.aClass42_13 = null;
				this.aClass42_12 = null;
				this.aClass42_14 = null;
				this.aClass42_16 = null;
				this.aClass42_17 = null;
				this.aClass42_18 = null;
				this.aClass42_6 = new Class42(265, 5, 128, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass42_7 = new Class42(265, 5, 128, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass42_3 = new Class42(171, 5, 509, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass42_4 = new Class42(132, 5, 360, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass42_5 = new Class42(200, 5, 360, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass42_8 = new Class42(238, 5, 202, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass42_9 = new Class42(238, 5, 203, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass42_10 = new Class42(94, 5, 74, this.method584());
				Class3_Sub1_Sub2.method552();
				this.aClass42_11 = new Class42(94, 5, 75, this.method584());
				Class3_Sub1_Sub2.method552();
				if (this.aClass14_2 != null) {
					this.method633();
					this.method715(669);
				}
				this.aBoolean221 = true;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("78582, " + 6 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!HZINZKXF;I)I")
	private int method658(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray7 == null || arg1 >= arg0.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg0.anIntArrayArray7[arg1];
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
						local35 = this.anIntArray253[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray270[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray219[local22[local26++]];
					}
					@Pc(83) Class13 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local33 == 4) {
						local83 = Class13.method194(local22[local26++]);
						local88 = local22[local26++];
						if (local88 >= 0 && local88 < Class12.anInt327 && (!Class12.method179(local88).aBoolean77 || aBoolean242)) {
							for (local101 = 0; local101 < local83.anIntArray97.length; local101++) {
								if (local83.anIntArray97[local101] == local88 + 1) {
									local35 += local83.anIntArray96[local101];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray221[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray242[this.anIntArray270[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray221[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt295;
					}
					@Pc(176) int local176;
					if (local33 == 9) {
						for (local176 = 0; local176 < Class29.anInt477; local176++) {
							if (Class29.aBooleanArray6[local176]) {
								local35 += this.anIntArray270[local176];
							}
						}
					}
					if (local33 == 10) {
						local83 = Class13.method194(local22[local26++]);
						local88 = local22[local26++] + 1;
						if (local88 >= 0 && local88 < Class12.anInt327 && (!Class12.method179(local88).aBoolean77 || aBoolean242)) {
							for (local101 = 0; local101 < local83.anIntArray97.length; local101++) {
								if (local83.anIntArray97[local101] == local88) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt827;
					}
					if (local33 == 12) {
						local35 = this.anInt976;
					}
					if (local33 == 13) {
						local176 = this.anIntArray221[local22[local26++]];
						local88 = local22[local26++];
						local35 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local176 = local22[local26++];
						@Pc(290) Class28 local290 = Class28.aClass28Array1[local176];
						local101 = local290.anInt472;
						@Pc(296) int local296 = local290.anInt473;
						@Pc(299) int local299 = local290.anInt474;
						@Pc(305) int local305 = anIntArray254[local299 - local296];
						local35 = this.anIntArray221[local101] >> local296 & local305;
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
						local35 = (aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 >> 7) + this.anInt957;
					}
					if (local33 == 19) {
						local35 = (aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 >> 7) + this.anInt958;
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
			signlink.reporterror("95342, " + 65 + ", " + arg0 + ", " + arg1 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!NHEPCMLW;I)V")
	private void method659(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt442 + 21 < arg0 * 8) {
					@Pc(21) int local21 = arg1.method285(14);
					if (local21 != 16383) {
						if (this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local21] == null) {
							this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local21] = new Class3_Sub1_Sub1_Sub4_Sub2();
						}
						@Pc(41) Class3_Sub1_Sub1_Sub4_Sub2 local41 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local21];
						this.anIntArray245[this.anInt987++] = local21;
						local41.anInt720 = anInt1050;
						@Pc(60) int local60 = arg1.method285(1);
						@Pc(65) int local65 = arg1.method285(5);
						if (local65 > 15) {
							local65 -= 32;
						}
						@Pc(74) int local74 = arg1.method285(1);
						if (local74 == 1) {
							this.anIntArray252[this.anInt1013++] = local21;
						}
						@Pc(93) int local93 = arg1.method285(5);
						if (local93 > 15) {
							local93 -= 32;
						}
						local41.aClass7_2 = Class7.method83(arg1.method285(12));
						local41.anInt728 = local41.aClass7_2.aByte2;
						local41.anInt757 = local41.aClass7_2.anInt134;
						local41.anInt748 = local41.aClass7_2.anInt127;
						local41.anInt749 = local41.aClass7_2.anInt138;
						local41.anInt750 = local41.aClass7_2.anInt126;
						local41.anInt751 = local41.aClass7_2.anInt132;
						local41.anInt752 = local41.aClass7_2.anInt143;
						local41.method538(aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0] + local93, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0] + local65, local60 == 1);
						continue;
					}
				}
				arg1.method286(this.anInt1052);
				return;
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("38781, " + arg0 + ", " + arg1 + ", " + -751 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
	private void method660(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1046 >= 100 && this.anInt843 != 1) {
					this.method681("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt1046 >= 200) {
					this.method681("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(38) String local38 = Class38.method439(Class38.method436(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1046; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method681("", local38 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt1030; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method681("", "Please remove " + local38 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local38.equals(aClass3_Sub1_Sub1_Sub4_Sub1_1.aString4)) {
						this.aStringArray10[this.anInt1046] = local38;
						this.aLongArray4[this.anInt1046] = arg0;
						this.anIntArray234[this.anInt1046] = 0;
						this.anInt1046++;
						this.aBoolean207 = true;
						this.aClass3_Sub1_Sub3_8.method263(240);
						this.aClass3_Sub1_Sub3_8.method270(arg0);
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("76934, " + false + ", " + arg0 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method661(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class24.aClass24Array1[arg0].anInt426;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray221[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class3_Sub1_Sub2_Sub3.method508(0.9D);
					}
					if (local12 == 2) {
						Class3_Sub1_Sub2_Sub3.method508(0.8D);
					}
					if (local12 == 3) {
						Class3_Sub1_Sub2_Sub3.method508(0.7D);
					}
					if (local12 == 4) {
						Class3_Sub1_Sub2_Sub3.method508(0.6D);
					}
					Class12.aClass49_5.method544();
					this.aBoolean221 = true;
				}
				if (local4 == 3) {
					@Pc(53) boolean local53 = this.aBoolean209;
					if (local12 == 0) {
						this.method628(0, this.aBoolean209);
						this.aBoolean209 = true;
					}
					if (local12 == 1) {
						this.method628(-400, this.aBoolean209);
						this.aBoolean209 = true;
					}
					if (local12 == 2) {
						this.method628(-800, this.aBoolean209);
						this.aBoolean209 = true;
					}
					if (local12 == 3) {
						this.method628(-1200, this.aBoolean209);
						this.aBoolean209 = true;
					}
					if (local12 == 4) {
						this.aBoolean209 = false;
					}
					if (this.aBoolean209 != local53 && !aBoolean243) {
						if (this.aBoolean209) {
							this.anInt898 = this.anInt897;
							this.aBoolean210 = true;
							this.aClass10_Sub1_1.method464(2, this.anInt898);
						} else {
							this.method601();
						}
						this.anInt974 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean220 = true;
						this.method604(0);
					}
					if (local12 == 1) {
						this.aBoolean220 = true;
						this.method604(-400);
					}
					if (local12 == 2) {
						this.aBoolean220 = true;
						this.method604(-800);
					}
					if (local12 == 3) {
						this.aBoolean220 = true;
						this.method604(-1200);
					}
					if (local12 == 4) {
						this.aBoolean220 = false;
					}
				}
				if (local4 == 5) {
					this.anInt834 = local12;
				}
				if (local4 == 6) {
					this.anInt890 = local12;
				}
				if (local4 == 8) {
					this.anInt970 = local12;
					this.aBoolean224 = true;
				}
				if (local4 == 9) {
					this.anInt1049 = local12;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("8564, " + true + ", " + arg0 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method662(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean219) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method713(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!HZINZKXF;IIII)V")
	private void method663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2.anInt338 == 0 && arg2.anIntArray98 != null && !arg2.aBoolean82 && (arg0 >= arg3 && arg4 >= arg1 && arg0 <= arg3 + arg2.anInt355 && arg4 <= arg1 + arg2.anInt339)) {
				@Pc(34) int local34 = arg2.anIntArray98.length;
				this.anInt884 += 0;
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg2.anIntArray95[local42] + arg3;
					@Pc(60) int local60 = arg2.anIntArray92[local42] + arg1 - arg5;
					@Pc(66) Class13 local66 = Class13.method194(arg2.anIntArray98[local42]);
					@Pc(71) int local71 = local51 + local66.anInt372;
					@Pc(76) int local76 = local60 + local66.anInt367;
					if ((local66.anInt375 >= 0 || local66.anInt351 != 0) && arg0 >= local71 && arg4 >= local76 && arg0 < local71 + local66.anInt355 && arg4 < local76 + local66.anInt339) {
						if (local66.anInt375 >= 0) {
							this.anInt1002 = local66.anInt375;
						} else {
							this.anInt1002 = local66.anInt340;
						}
					}
					if (local66.anInt338 == 8 && arg0 >= local71 && arg4 >= local76 && arg0 < local71 + local66.anInt355 && arg4 < local76 + local66.anInt339) {
						this.anInt997 = local66.anInt340;
					}
					if (local66.anInt338 == 0) {
						this.method663(arg0, local76, local66, local71, arg4, local66.anInt344, arg6);
						if (local66.anInt356 > local66.anInt339) {
							this.method638(arg0, arg6, local66.anInt339, local71 + local66.anInt355, arg4, local76, local66, local66.anInt356);
						}
					} else {
						if (local66.anInt368 == 1 && arg0 >= local71 && arg4 >= local76 && arg0 < local71 + local66.anInt355 && arg4 < local76 + local66.anInt339) {
							@Pc(200) boolean local200 = false;
							if (local66.anInt371 != 0) {
								local200 = this.method636(local66);
							}
							if (!local200) {
								this.aStringArray11[this.anInt1053] = local66.aString10;
								this.anIntArray228[this.anInt1053] = 623;
								this.anIntArray227[this.anInt1053] = local66.anInt340;
								this.anInt1053++;
							}
						}
						if (local66.anInt368 == 2 && this.anInt899 == 0 && arg0 >= local71 && arg4 >= local76 && arg0 < local71 + local66.anInt355 && arg4 < local76 + local66.anInt339) {
							@Pc(264) String local264 = local66.aString9;
							if (local264.indexOf(" ") != -1) {
								local264 = local264.substring(0, local264.indexOf(" "));
							}
							this.aStringArray11[this.anInt1053] = local264 + " @gre@" + local66.aString6;
							this.anIntArray228[this.anInt1053] = 943;
							this.anIntArray227[this.anInt1053] = local66.anInt340;
							this.anInt1053++;
						}
						if (local66.anInt368 == 3 && arg0 >= local71 && arg4 >= local76 && arg0 < local71 + local66.anInt355 && arg4 < local76 + local66.anInt339) {
							this.aStringArray11[this.anInt1053] = "Close";
							if (arg6 == 3) {
								this.anIntArray228[this.anInt1053] = 107;
							} else {
								this.anIntArray228[this.anInt1053] = 504;
							}
							this.anIntArray227[this.anInt1053] = local66.anInt340;
							this.anInt1053++;
						}
						if (local66.anInt368 == 4 && arg0 >= local71 && arg4 >= local76 && arg0 < local71 + local66.anInt355 && arg4 < local76 + local66.anInt339) {
							this.aStringArray11[this.anInt1053] = local66.aString10;
							this.anIntArray228[this.anInt1053] = 48;
							this.anIntArray227[this.anInt1053] = local66.anInt340;
							this.anInt1053++;
						}
						if (local66.anInt368 == 5 && arg0 >= local71 && arg4 >= local76 && arg0 < local71 + local66.anInt355 && arg4 < local76 + local66.anInt339) {
							this.aStringArray11[this.anInt1053] = local66.aString10;
							this.anIntArray228[this.anInt1053] = 597;
							this.anIntArray227[this.anInt1053] = local66.anInt340;
							this.anInt1053++;
						}
						if (local66.anInt368 == 6 && !this.aBoolean213 && arg0 >= local71 && arg4 >= local76 && arg0 < local71 + local66.anInt355 && arg4 < local76 + local66.anInt339) {
							this.aStringArray11[this.anInt1053] = local66.aString10;
							this.anIntArray228[this.anInt1053] = 214;
							this.anIntArray227[this.anInt1053] = local66.anInt340;
							this.anInt1053++;
						}
						if (local66.anInt338 == 2) {
							@Pc(523) int local523 = 0;
							for (@Pc(525) int local525 = 0; local525 < local66.anInt339; local525++) {
								for (@Pc(529) int local529 = 0; local529 < local66.anInt355; local529++) {
									@Pc(540) int local540 = local71 + local529 * (local66.anInt353 + 32);
									@Pc(549) int local549 = local76 + local525 * (local66.anInt337 + 32);
									if (local523 < 20) {
										local540 += local66.anIntArray94[local523];
										local549 += local66.anIntArray93[local523];
									}
									if (arg0 >= local540 && arg4 >= local549 && arg0 < local540 + 32 && arg4 < local549 + 32) {
										this.anInt984 = local523;
										this.anInt985 = local66.anInt340;
										if (local66.anIntArray97[local523] > 0) {
											@Pc(602) Class12 local602 = Class12.method179(local66.anIntArray97[local523] - 1);
											if (this.anInt1039 == 1 && local66.aBoolean85) {
												if (local66.anInt340 != this.anInt1041 || local523 != this.anInt1040) {
													this.aStringArray11[this.anInt1053] = "Use " + this.aString30 + " with @lre@" + local602.aString5;
													this.anIntArray228[this.anInt1053] = 320;
													this.anIntArray229[this.anInt1053] = local602.anInt325;
													this.anIntArray226[this.anInt1053] = local523;
													this.anIntArray227[this.anInt1053] = local66.anInt340;
													this.anInt1053++;
												}
											} else if (this.anInt899 != 1 || !local66.aBoolean85) {
												@Pc(739) int local739;
												if (local66.aBoolean85) {
													for (local739 = 4; local739 >= 3; local739--) {
														if (local602.aStringArray2 != null && local602.aStringArray2[local739] != null) {
															this.aStringArray11[this.anInt1053] = local602.aStringArray2[local739] + " @lre@" + local602.aString5;
															if (local739 == 3) {
																this.anIntArray228[this.anInt1053] = 478;
															}
															if (local739 == 4) {
																this.anIntArray228[this.anInt1053] = 170;
															}
															this.anIntArray229[this.anInt1053] = local602.anInt325;
															this.anIntArray226[this.anInt1053] = local523;
															this.anIntArray227[this.anInt1053] = local66.anInt340;
															this.anInt1053++;
														} else if (local739 == 4) {
															this.aStringArray11[this.anInt1053] = "Drop @lre@" + local602.aString5;
															this.anIntArray228[this.anInt1053] = 170;
															this.anIntArray229[this.anInt1053] = local602.anInt325;
															this.anIntArray226[this.anInt1053] = local523;
															this.anIntArray227[this.anInt1053] = local66.anInt340;
															this.anInt1053++;
														}
													}
												}
												if (local66.aBoolean88) {
													this.aStringArray11[this.anInt1053] = "Use @lre@" + local602.aString5;
													this.anIntArray228[this.anInt1053] = 87;
													this.anIntArray229[this.anInt1053] = local602.anInt325;
													this.anIntArray226[this.anInt1053] = local523;
													this.anIntArray227[this.anInt1053] = local66.anInt340;
													this.anInt1053++;
												}
												if (local66.aBoolean85 && local602.aStringArray2 != null) {
													for (local739 = 2; local739 >= 0; local739--) {
														if (local602.aStringArray2[local739] != null) {
															this.aStringArray11[this.anInt1053] = local602.aStringArray2[local739] + " @lre@" + local602.aString5;
															if (local739 == 0) {
																this.anIntArray228[this.anInt1053] = 641;
															}
															if (local739 == 1) {
																this.anIntArray228[this.anInt1053] = 546;
															}
															if (local739 == 2) {
																this.anIntArray228[this.anInt1053] = 129;
															}
															this.anIntArray229[this.anInt1053] = local602.anInt325;
															this.anIntArray226[this.anInt1053] = local523;
															this.anIntArray227[this.anInt1053] = local66.anInt340;
															this.anInt1053++;
														}
													}
												}
												if (local66.aStringArray4 != null) {
													for (local739 = 4; local739 >= 0; local739--) {
														if (local66.aStringArray4[local739] != null) {
															this.aStringArray11[this.anInt1053] = local66.aStringArray4[local739] + " @lre@" + local602.aString5;
															if (local739 == 0) {
																this.anIntArray228[this.anInt1053] = 940;
															}
															if (local739 == 1) {
																this.anIntArray228[this.anInt1053] = 905;
															}
															if (local739 == 2) {
																this.anIntArray228[this.anInt1053] = 96;
															}
															if (local739 == 3) {
																this.anIntArray228[this.anInt1053] = 513;
															}
															if (local739 == 4) {
																this.anIntArray228[this.anInt1053] = 133;
															}
															this.anIntArray229[this.anInt1053] = local602.anInt325;
															this.anIntArray226[this.anInt1053] = local523;
															this.anIntArray227[this.anInt1053] = local66.anInt340;
															this.anInt1053++;
														}
													}
												}
												this.aStringArray11[this.anInt1053] = "Examine @lre@" + local602.aString5;
												this.anIntArray228[this.anInt1053] = 1187;
												this.anIntArray229[this.anInt1053] = local602.anInt325;
												this.anIntArray226[this.anInt1053] = local523;
												this.anIntArray227[this.anInt1053] = local66.anInt340;
												this.anInt1053++;
											} else if ((this.anInt901 & 0x10) == 16) {
												this.aStringArray11[this.anInt1053] = this.aString20 + " @lre@" + local602.aString5;
												this.anIntArray228[this.anInt1053] = 460;
												this.anIntArray229[this.anInt1053] = local602.anInt325;
												this.anIntArray226[this.anInt1053] = local523;
												this.anIntArray227[this.anInt1053] = local66.anInt340;
												this.anInt1053++;
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
			signlink.reporterror("61420, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method664() {
		try {
			if (this.anInt1003 > 1) {
				this.anInt1003--;
			}
			if (this.anInt888 > 0) {
				this.anInt888--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method723(); local22++) {
			}
			if (this.aBoolean237) {
				@Pc(41) Object local41 = this.aClass23_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass23_1.anObject1) {
					if (!aBoolean244) {
						this.aClass23_1.anInt420 = 0;
					} else if (super.anInt813 != 0 || this.aClass23_1.anInt420 >= 40) {
						this.aClass3_Sub1_Sub3_8.method263(239);
						this.aClass3_Sub1_Sub3_8.method264(0);
						local66 = this.aClass3_Sub1_Sub3_8.anInt441;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass23_1.anInt420 && local66 - this.aClass3_Sub1_Sub3_8.anInt441 < 240; local70++) {
							local68++;
							local86 = this.aClass23_1.anIntArray113[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass23_1.anIntArray114[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass23_1.anIntArray113[local70] == -1 && this.aClass23_1.anIntArray114[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt942 || local86 != this.anInt943) {
								@Pc(165) int local165 = local103 - this.anInt942;
								this.anInt942 = local103;
								@Pc(173) int local173 = local86 - this.anInt943;
								this.anInt943 = local86;
								if (this.anInt844 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass3_Sub1_Sub3_8.method265((this.anInt844 << 12) + (local165 << 6) + local173);
									this.anInt844 = 0;
								} else if (this.anInt844 < 8) {
									this.aClass3_Sub1_Sub3_8.method267((this.anInt844 << 19) + local120 + 8388608);
									this.anInt844 = 0;
								} else {
									this.aClass3_Sub1_Sub3_8.method268((this.anInt844 << 19) + local120 - 1073741824);
									this.anInt844 = 0;
								}
							} else if (this.anInt844 < 2047) {
								this.anInt844++;
							}
						}
						this.aClass3_Sub1_Sub3_8.method273(this.aClass3_Sub1_Sub3_8.anInt441 - local66);
						if (local68 >= this.aClass23_1.anInt420) {
							this.aClass23_1.anInt420 = 0;
						} else {
							this.aClass23_1.anInt420 -= local68;
							for (local86 = 0; local86 < this.aClass23_1.anInt420; local86++) {
								this.aClass23_1.anIntArray114[local86] = this.aClass23_1.anIntArray114[local86 + local68];
								this.aClass23_1.anIntArray113[local86] = this.aClass23_1.anIntArray113[local86 + local68];
							}
						}
					}
				}
				if (super.anInt813 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong33) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong33 = super.aLong28;
					local66 = super.anInt815;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt814;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt813 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass3_Sub1_Sub3_8.method263(254);
					this.aClass3_Sub1_Sub3_8.method306((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt990 > 0) {
					this.anInt990--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean230 = true;
				}
				if (this.aBoolean230 && this.anInt990 <= 0) {
					this.anInt990 = 20;
					this.aBoolean230 = false;
					this.aClass3_Sub1_Sub3_8.method263(178);
					this.aClass3_Sub1_Sub3_8.method299(this.anInt980, this.aBoolean211);
					this.aClass3_Sub1_Sub3_8.method299(this.anInt979, this.aBoolean211);
				}
				if (super.aBoolean199 && !this.aBoolean240) {
					this.aBoolean240 = true;
					this.aClass3_Sub1_Sub3_8.method263(217);
					this.aClass3_Sub1_Sub3_8.method264(1);
				}
				if (!super.aBoolean199 && this.aBoolean240) {
					this.aBoolean240 = false;
					this.aClass3_Sub1_Sub3_8.method263(217);
					this.aClass3_Sub1_Sub3_8.method264(0);
				}
				this.method616();
				this.method651(this.anInt1048);
				this.method682();
				anInt963++;
				@Pc(548) int local548;
				if (anInt963 > 1013) {
					anInt963 = 0;
					this.aClass3_Sub1_Sub3_8.method263(144);
					this.aClass3_Sub1_Sub3_8.method264(0);
					local548 = this.aClass3_Sub1_Sub3_8.anInt441;
					this.aClass3_Sub1_Sub3_8.method264((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub3_8.method264(84);
					this.aClass3_Sub1_Sub3_8.method265(36060);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_8.method264(57);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_8.method264(112);
					}
					this.aClass3_Sub1_Sub3_8.method265(63934);
					this.aClass3_Sub1_Sub3_8.method264((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
					this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
					this.aClass3_Sub1_Sub3_8.method265(29666);
					this.aClass3_Sub1_Sub3_8.method273(this.aClass3_Sub1_Sub3_8.anInt441 - local548);
				}
				this.anInt886++;
				if (this.anInt886 > 750) {
					this.method635(324);
				}
				this.method618();
				this.method639();
				this.method621(this.anInt863);
				this.anInt953++;
				if (this.anInt833 != 0) {
					this.anInt832 += 20;
					if (this.anInt832 >= 400) {
						this.anInt833 = 0;
					}
				}
				if (this.anInt849 != 0) {
					this.anInt846++;
					if (this.anInt846 >= 15) {
						if (this.anInt849 == 2) {
							this.aBoolean207 = true;
						}
						if (this.anInt849 == 3) {
							this.aBoolean224 = true;
						}
						this.anInt849 = 0;
					}
				}
				if (this.anInt950 != 0) {
					this.anInt924++;
					if (super.anInt808 > this.anInt951 + 5 || super.anInt808 < this.anInt951 - 5 || super.anInt809 > this.anInt952 + 5 || super.anInt809 < this.anInt952 - 5) {
						this.aBoolean222 = true;
					}
					if (super.anInt807 == 0) {
						if (this.anInt950 == 2) {
							this.aBoolean207 = true;
						}
						if (this.anInt950 == 3) {
							this.aBoolean224 = true;
						}
						this.anInt950 = 0;
						if (this.aBoolean222 && this.anInt924 >= 5) {
							this.anInt985 = -1;
							this.method700();
							if (this.anInt985 == this.anInt948 && this.anInt984 != this.anInt949) {
								@Pc(781) Class13 local781 = Class13.method194(this.anInt948);
								@Pc(783) byte local783 = 0;
								if (this.anInt1049 == 1 && local781.anInt371 == 206) {
									local783 = 1;
								}
								if (local781.anIntArray97[this.anInt984] <= 0) {
									local783 = 0;
								}
								if (local781.aBoolean87) {
									local66 = this.anInt949;
									local68 = this.anInt984;
									local781.anIntArray97[local68] = local781.anIntArray97[local66];
									local781.anIntArray96[local68] = local781.anIntArray96[local66];
									local781.anIntArray97[local66] = -1;
									local781.anIntArray96[local66] = 0;
								} else if (local783 == 1) {
									local66 = this.anInt949;
									local68 = this.anInt984;
									while (local66 != local68) {
										if (local66 > local68) {
											local781.method197(local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local781.method197(local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local781.method197(this.anInt949, this.anInt984);
								}
								this.aClass3_Sub1_Sub3_8.method263(26);
								this.aClass3_Sub1_Sub3_8.method290(local783, this.aByte29);
								this.aClass3_Sub1_Sub3_8.method299(this.anInt948, this.aBoolean211);
								this.aClass3_Sub1_Sub3_8.method297(this.anInt984, this.aBoolean203);
								this.aClass3_Sub1_Sub3_8.method265(this.anInt949);
							}
						} else if ((this.anInt834 == 1 || this.method610(this.anInt1053 - 1)) && this.anInt1053 > 2) {
							this.method693();
						} else if (this.anInt1053 > 0) {
							this.method632(this.anInt1053 - 1);
						}
						this.anInt846 = 10;
						super.anInt813 = 0;
					}
				}
				@Pc(961) int local961;
				if (Class36.anInt597 != -1) {
					local548 = Class36.anInt597;
					local961 = Class36.anInt598;
					@Pc(982) boolean local982 = this.method588(0, local961, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], true, 0, 0, 0, local548, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
					Class36.anInt597 = -1;
					if (local982) {
						this.anInt830 = super.anInt814;
						this.anInt831 = super.anInt815;
						this.anInt833 = 1;
						this.anInt832 = 0;
					}
				}
				if (super.anInt813 == 1 && this.aString28 != null) {
					this.aString28 = null;
					this.aBoolean224 = true;
					super.anInt813 = 0;
				}
				this.method680(126);
				if (this.anInt914 == -1) {
					this.method684();
					this.method707();
					this.method673();
				}
				if (super.anInt807 == 1 || super.anInt813 == 1) {
					this.anInt859++;
				}
				if (this.anInt938 == 0 && this.anInt962 == 0 && this.anInt1023 == 0) {
					if (this.anInt995 > 0) {
						this.anInt995--;
					}
				} else if (this.anInt995 < 100) {
					this.anInt995++;
					if (this.anInt995 == 100) {
						if (this.anInt938 != 0) {
							this.aBoolean224 = true;
						}
						if (this.anInt962 != 0) {
							this.aBoolean207 = true;
						}
					}
				}
				if (this.anInt946 == 2) {
					this.method615();
				}
				if (this.anInt946 == 2 && this.aBoolean234) {
					this.method590();
				}
				for (local548 = 0; local548 < 5; local548++) {
					@Pc(1122) int local1122 = this.anIntArray250[local548]++;
				}
				this.method670();
				anInt896++;
				if (anInt896 > 1016) {
					anInt896 = 0;
					this.aClass3_Sub1_Sub3_8.method263(49);
					this.aClass3_Sub1_Sub3_8.method264(0);
					local961 = this.aClass3_Sub1_Sub3_8.anInt441;
					this.aClass3_Sub1_Sub3_8.method265(16080);
					this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_8.method264(254);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_8.method265(4084);
					}
					this.aClass3_Sub1_Sub3_8.method264(160);
					this.aClass3_Sub1_Sub3_8.method264(246);
					this.aClass3_Sub1_Sub3_8.method264(124);
					this.aClass3_Sub1_Sub3_8.method264((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub3_8.method265((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_8.method265(59156);
					}
					this.aClass3_Sub1_Sub3_8.method273(this.aClass3_Sub1_Sub3_8.anInt441 - local961);
				}
				super.anInt806++;
				if (super.anInt806 > 4500) {
					this.anInt888 = 250;
					super.anInt806 -= 500;
					this.aClass3_Sub1_Sub3_8.method263(195);
				}
				this.anInt919++;
				if (this.anInt919 > 500) {
					this.anInt919 = 0;
					local961 = (int) (Math.random() * 8.0D);
					if ((local961 & 0x1) == 1) {
						this.anInt853 += this.anInt854;
					}
					if ((local961 & 0x2) == 2) {
						this.anInt1043 += this.anInt1044;
					}
					if ((local961 & 0x4) == 4) {
						this.anInt873 += this.anInt874;
					}
				}
				if (this.anInt853 < -50) {
					this.anInt854 = 2;
				}
				if (this.anInt853 > 50) {
					this.anInt854 = -2;
				}
				if (this.anInt1043 < -55) {
					this.anInt1044 = 2;
				}
				if (this.anInt1043 > 55) {
					this.anInt1044 = -2;
				}
				if (this.anInt873 < -40) {
					this.anInt874 = 1;
				}
				if (this.anInt873 > 40) {
					this.anInt874 = -1;
				}
				this.anInt940++;
				if (this.anInt940 > 500) {
					this.anInt940 = 0;
					local961 = (int) (Math.random() * 8.0D);
					if ((local961 & 0x1) == 1) {
						this.anInt968 += this.anInt969;
					}
					if ((local961 & 0x2) == 2) {
						this.anInt966 += this.anInt967;
					}
				}
				if (this.anInt968 < -60) {
					this.anInt969 = 2;
				}
				if (this.anInt968 > 60) {
					this.anInt969 = -2;
				}
				if (this.anInt966 < -20) {
					this.anInt967 = 1;
				}
				if (this.anInt966 > 10) {
					this.anInt967 = -1;
				}
				this.anInt887++;
				if (this.anInt887 > 50) {
					this.aClass3_Sub1_Sub3_8.method263(37);
				}
				try {
					if (this.aClass47_1 != null && this.aClass3_Sub1_Sub3_8.anInt441 > 0) {
						this.aClass47_1.method525(this.aClass3_Sub1_Sub3_8.aByteArray5, this.aClass3_Sub1_Sub3_8.anInt441);
						this.aClass3_Sub1_Sub3_8.anInt441 = 0;
						this.anInt887 = 0;
					}
				} catch (@Pc(1459) IOException local1459) {
					this.method635(324);
				} catch (@Pc(1464) Exception local1464) {
					this.method718();
				}
			}
		} catch (@Pc(1469) RuntimeException local1469) {
			signlink.reporterror("25026, " + true + ", " + local1469.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XETERYIW;II)V")
	private void method665(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method666(arg0.anInt755, arg0.anInt754, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("72066, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)V")
	private void method666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method629(this.anInt858, arg0, arg1) - arg2;
				@Pc(33) int local33 = arg1 - this.anInt835;
				@Pc(38) int local38 = local28 - this.anInt836;
				this.aBoolean237 &= true;
				@Pc(49) int local49 = arg0 - this.anInt837;
				@Pc(54) int local54 = Class3_Sub1_Sub1_Sub1.anIntArray42[this.anInt838];
				@Pc(59) int local59 = Class3_Sub1_Sub1_Sub1.anIntArray43[this.anInt838];
				@Pc(64) int local64 = Class3_Sub1_Sub1_Sub1.anIntArray42[this.anInt839];
				@Pc(69) int local69 = Class3_Sub1_Sub1_Sub1.anIntArray43[this.anInt839];
				@Pc(79) int local79 = local49 * local64 + local33 * local69 >> 16;
				@Pc(89) int local89 = local49 * local69 - local33 * local64 >> 16;
				@Pc(91) int local91 = local79;
				@Pc(101) int local101 = local38 * local59 - local89 * local54 >> 16;
				@Pc(111) int local111 = local38 * local54 + local89 * local59 >> 16;
				if (local111 >= 50) {
					this.anInt1004 = Class3_Sub1_Sub2_Sub3.anInt689 + (local91 << 9) / local111;
					this.anInt1005 = Class3_Sub1_Sub2_Sub3.anInt690 + (local101 << 9) / local111;
				} else {
					this.anInt1004 = -1;
					this.anInt1005 = -1;
				}
			} else {
				this.anInt1004 = -1;
				this.anInt1005 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("96833, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method667() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1034);
			if (this.aClass10_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass10_Sub1_1.anInt647);
			}
			System.out.println("loop-cycle:" + anInt1050);
			System.out.println("draw-cycle:" + anInt934);
			System.out.println("ptype:" + this.anInt885);
			System.out.println("psize:" + this.anInt884);
			if (this.aClass47_1 != null) {
				this.aClass47_1.method526();
			}
			super.aBoolean197 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("49055, " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method584() {
		try {
			this.aBoolean237 &= true;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("72110, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method668() {
		try {
			this.method690();
			if (this.anInt833 == 1) {
				this.aClass3_Sub1_Sub2_Sub4Array10[this.anInt832 / 100].method566(this.anInt830 - 8 - 4, this.anInt831 - 8 - 4, (byte) 8);
			}
			if (this.anInt833 == 2) {
				this.aClass3_Sub1_Sub2_Sub4Array10[this.anInt832 / 100 + 4].method566(this.anInt830 - 8 - 4, this.anInt831 - 8 - 4, (byte) 8);
			}
			if (this.anInt826 != -1) {
				this.method697(this.anInt826, this.anInt953);
				this.method595(0, 0, Class13.method194(this.anInt826), 0);
			}
			if (this.anInt971 != -1) {
				this.method697(this.anInt971, this.anInt953);
				this.method595(0, 0, Class13.method194(this.anInt971), 0);
			}
			this.method698();
			if (!this.aBoolean208) {
				this.method700();
				this.method589();
			} else if (this.anInt867 == 0) {
				this.method683();
			}
			if (this.anInt881 == 1) {
				this.aClass3_Sub1_Sub2_Sub4_3.method566(472, 296, (byte) 8);
			}
			@Pc(173) int local173;
			if (aBoolean205) {
				@Pc(139) byte local139 = 20;
				@Pc(141) int local141 = 16776960;
				if (super.anInt803 < 30 && aBoolean243) {
					local141 = 16711680;
				}
				if (super.anInt803 < 20 && !aBoolean243) {
					local141 = 16711680;
				}
				this.aClass3_Sub1_Sub2_Sub1_3.method119(20, "Fps:" + super.anInt803, local141);
				local173 = local139 + 15;
				@Pc(175) Runtime local175 = Runtime.getRuntime();
				@Pc(184) int local184 = (int) ((local175.totalMemory() - local175.freeMemory()) / 1024L);
				if (local184 > 33554432 && aBoolean243) {
				}
				if (local184 > 67108864 && !aBoolean243) {
				}
				this.aClass3_Sub1_Sub2_Sub1_3.method119(35, "Mem:" + local184 + "k", 16776960);
				local173 += 15;
			}
			if (this.anInt1003 != 0) {
				@Pc(225) int local225 = this.anInt1003 / 50;
				local173 = local225 / 60;
				@Pc(233) int local233 = local225 % 60;
				if (local233 < 10) {
					this.aClass3_Sub1_Sub2_Sub1_3.method124("System update in: " + local173 + ":0" + local233, 4, 329, 16776960);
				} else {
					this.aClass3_Sub1_Sub2_Sub1_3.method124("System update in: " + local173 + ":" + local233, 4, 329, 16776960);
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("79979, " + -195 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method669() {
		try {
			@Pc(8) int local8;
			if (this.anInt964 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt964 > 768) {
						this.anIntArray271[local8] = this.method591(this.anIntArray273[local8], 1024 - this.anInt964, this.anIntArray272[local8]);
					} else if (this.anInt964 > 256) {
						this.anIntArray271[local8] = this.anIntArray273[local8];
					} else {
						this.anIntArray271[local8] = this.method591(this.anIntArray272[local8], 256 - this.anInt964, this.anIntArray273[local8]);
					}
				}
			} else if (this.anInt965 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt965 > 768) {
						this.anIntArray271[local8] = this.method591(this.anIntArray274[local8], 1024 - this.anInt965, this.anIntArray272[local8]);
					} else if (this.anInt965 > 256) {
						this.anIntArray271[local8] = this.anIntArray274[local8];
					} else {
						this.anIntArray271[local8] = this.method591(this.anIntArray272[local8], 256 - this.anInt965, this.anIntArray274[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray271[local8] = this.anIntArray272[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass42_6.anIntArray193[local8] = this.aClass3_Sub1_Sub2_Sub4_4.anIntArray209[local8];
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
				local198 = this.anIntArray233[local185] * (256 - local185) / 256;
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
						local220 = this.anIntArray271[local220];
						local239 = this.aClass42_6.anIntArray193[local183];
						this.aClass42_6.anIntArray193[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass42_6.method468(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass42_7.anIntArray193[local198] = this.aClass3_Sub1_Sub2_Sub4_5.anIntArray209[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray233[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray224[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(366) int local366 = 256 - local228;
						local228 = this.anIntArray271[local228];
						@Pc(377) int local377 = this.aClass42_7.anIntArray193[local183];
						this.aClass42_7.anIntArray193[local183++] = ((local228 & 0xFF00FF) * local239 + (local377 & 0xFF00FF) * local366 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local377 & 0xFF00) * local366 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass42_7.method468(637, 0, super.aGraphics2);
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("24381, " + 5429 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method670() {
		try {
			while (true) {
				@Pc(10) int local10 = this.method578();
				if (local10 == -1) {
					return;
				}
				if (this.anInt971 != -1 && this.anInt971 == this.anInt1038) {
					if (local10 == 8 && this.aString23.length() > 0) {
						this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
					}
					if ((local10 >= 97 && local10 <= 122 || local10 >= 65 && local10 <= 90 || local10 >= 48 && local10 <= 57 || local10 == 32) && this.aString23.length() < 12) {
						this.aString23 = this.aString23 + (char) local10;
					}
				} else {
					@Pc(190) int local190;
					if (this.aBoolean232) {
						if (local10 >= 32 && local10 <= 122 && this.aString29.length() < 80) {
							this.aString29 = this.aString29 + (char) local10;
							this.aBoolean224 = true;
						}
						if (local10 == 8 && this.aString29.length() > 0) {
							this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							this.aBoolean224 = true;
						}
						if (local10 == 13 || local10 == 10) {
							this.aBoolean232 = false;
							this.aBoolean224 = true;
							@Pc(150) long local150;
							if (this.anInt975 == 1) {
								local150 = Class38.method435(this.aString29);
								this.method660(local150);
							}
							if (this.anInt975 == 2 && this.anInt1046 > 0) {
								local150 = Class38.method435(this.aString29);
								this.method627(local150);
							}
							if (this.anInt975 == 3 && this.aString29.length() > 0) {
								this.aClass3_Sub1_Sub3_8.method263(201);
								this.aClass3_Sub1_Sub3_8.method264(0);
								local190 = this.aClass3_Sub1_Sub3_8.anInt441;
								this.aClass3_Sub1_Sub3_8.method270(this.aLong31);
								Class22.method256(this.aClass3_Sub1_Sub3_8, this.aString29);
								this.aClass3_Sub1_Sub3_8.method273(this.aClass3_Sub1_Sub3_8.anInt441 - local190);
								this.aString29 = Class22.method257(this.anInt983, this.aString29);
								this.aString29 = Class20.method227(this.anInt983, this.aString29);
								this.method681(Class38.method439(Class38.method436(this.aLong31)), this.aString29, 6);
								if (this.anInt913 == 2) {
									this.anInt913 = 1;
									this.aBoolean241 = true;
									this.aClass3_Sub1_Sub3_8.method263(100);
									this.aClass3_Sub1_Sub3_8.method264(this.anInt925);
									this.aClass3_Sub1_Sub3_8.method264(this.anInt913);
									this.aClass3_Sub1_Sub3_8.method264(this.anInt903);
								}
							}
							if (this.anInt975 == 4 && this.anInt1030 < 100) {
								local150 = Class38.method435(this.aString29);
								this.method606((byte) 8, local150);
							}
							if (this.anInt975 == 5 && this.anInt1030 > 0) {
								local150 = Class38.method435(this.aString29);
								this.method592(local150);
							}
						}
					} else if (this.anInt910 == 1) {
						if (local10 >= 48 && local10 <= 57 && this.aString17.length() < 10) {
							this.aString17 = this.aString17 + (char) local10;
							this.aBoolean224 = true;
						}
						if (local10 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean224 = true;
						}
						if (local10 == 13 || local10 == 10) {
							if (this.aString17.length() > 0) {
								local190 = 0;
								try {
									local190 = Integer.parseInt(this.aString17);
								} catch (@Pc(369) Exception local369) {
								}
								this.aClass3_Sub1_Sub3_8.method263(146);
								this.aClass3_Sub1_Sub3_8.method268(local190);
							}
							this.anInt910 = 0;
							this.aBoolean224 = true;
						}
					} else if (this.anInt910 == 2) {
						if (local10 >= 32 && local10 <= 122 && this.aString17.length() < 12) {
							this.aString17 = this.aString17 + (char) local10;
							this.aBoolean224 = true;
						}
						if (local10 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean224 = true;
						}
						if (local10 == 13 || local10 == 10) {
							if (this.aString17.length() > 0) {
								this.aClass3_Sub1_Sub3_8.method263(98);
								this.aClass3_Sub1_Sub3_8.method270(Class38.method435(this.aString17));
							}
							this.anInt910 = 0;
							this.aBoolean224 = true;
						}
					} else if (this.anInt986 == -1 && this.anInt914 == -1) {
						if (local10 >= 32 && local10 <= 122 && this.aString26.length() < 80) {
							this.aString26 = this.aString26 + (char) local10;
							this.aBoolean224 = true;
						}
						if (local10 == 8 && this.aString26.length() > 0) {
							this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							this.aBoolean224 = true;
						}
						if ((local10 == 13 || local10 == 10) && this.aString26.length() > 0) {
							if (this.anInt857 == 2) {
								if (this.aString26.equals("::clientdrop")) {
									this.method635(324);
								}
								if (this.aString26.equals("::lag")) {
									this.method667();
								}
								if (this.aString26.equals("::prefetchmusic")) {
									for (local190 = 0; local190 < this.aClass10_Sub1_1.method465(2); local190++) {
										this.aClass10_Sub1_1.method454(2, local190, (byte) 1);
									}
								}
								if (this.aString26.equals("::fpson")) {
									aBoolean205 = true;
								}
								if (this.aString26.equals("::fpsoff")) {
									aBoolean205 = false;
								}
								if (this.aString26.equals("::noclip")) {
									for (local190 = 0; local190 < 4; local190++) {
										for (@Pc(601) int local601 = 1; local601 < 103; local601++) {
											for (@Pc(605) int local605 = 1; local605 < 103; local605++) {
												this.aClass5Array1[local190].anIntArrayArray5[local601][local605] = 0;
											}
										}
									}
								}
							}
							if (this.aString26.startsWith("::")) {
								this.aClass3_Sub1_Sub3_8.method263(247);
								this.aClass3_Sub1_Sub3_8.method264(this.aString26.length() - 1);
								this.aClass3_Sub1_Sub3_8.method271(this.aString26.substring(2));
							} else {
								@Pc(660) String local660 = this.aString26.toLowerCase();
								@Pc(662) byte local662 = 0;
								if (local660.startsWith("yellow:")) {
									local662 = 0;
									this.aString26 = this.aString26.substring(7);
								} else if (local660.startsWith("red:")) {
									local662 = 1;
									this.aString26 = this.aString26.substring(4);
								} else if (local660.startsWith("green:")) {
									local662 = 2;
									this.aString26 = this.aString26.substring(6);
								} else if (local660.startsWith("cyan:")) {
									local662 = 3;
									this.aString26 = this.aString26.substring(5);
								} else if (local660.startsWith("purple:")) {
									local662 = 4;
									this.aString26 = this.aString26.substring(7);
								} else if (local660.startsWith("white:")) {
									local662 = 5;
									this.aString26 = this.aString26.substring(6);
								} else if (local660.startsWith("flash1:")) {
									local662 = 6;
									this.aString26 = this.aString26.substring(7);
								} else if (local660.startsWith("flash2:")) {
									local662 = 7;
									this.aString26 = this.aString26.substring(7);
								} else if (local660.startsWith("flash3:")) {
									local662 = 8;
									this.aString26 = this.aString26.substring(7);
								} else if (local660.startsWith("glow1:")) {
									local662 = 9;
									this.aString26 = this.aString26.substring(6);
								} else if (local660.startsWith("glow2:")) {
									local662 = 10;
									this.aString26 = this.aString26.substring(6);
								} else if (local660.startsWith("glow3:")) {
									local662 = 11;
									this.aString26 = this.aString26.substring(6);
								}
								local660 = this.aString26.toLowerCase();
								@Pc(834) byte local834 = 0;
								if (local660.startsWith("wave:")) {
									local834 = 1;
									this.aString26 = this.aString26.substring(5);
								} else if (local660.startsWith("wave2:")) {
									local834 = 2;
									this.aString26 = this.aString26.substring(6);
								} else if (local660.startsWith("shake:")) {
									local834 = 3;
									this.aString26 = this.aString26.substring(6);
								} else if (local660.startsWith("scroll:")) {
									local834 = 4;
									this.aString26 = this.aString26.substring(7);
								} else if (local660.startsWith("slide:")) {
									local834 = 5;
									this.aString26 = this.aString26.substring(6);
								}
								this.aClass3_Sub1_Sub3_8.method263(72);
								this.aClass3_Sub1_Sub3_8.method264(0);
								@Pc(915) int local915 = this.aClass3_Sub1_Sub3_8.anInt441;
								this.aClass3_Sub1_Sub3_8.method290(local834, this.aByte29);
								this.aClass3_Sub1_Sub3_8.method290(local662, this.aByte29);
								this.aClass3_Sub1_Sub3_7.anInt441 = 0;
								Class22.method256(this.aClass3_Sub1_Sub3_7, this.aString26);
								this.aClass3_Sub1_Sub3_8.method310(this.aClass3_Sub1_Sub3_7.anInt441, this.aClass3_Sub1_Sub3_7.aByteArray5);
								this.aClass3_Sub1_Sub3_8.method273(this.aClass3_Sub1_Sub3_8.anInt441 - local915);
								this.aString26 = Class22.method257(this.anInt983, this.aString26);
								this.aString26 = Class20.method227(this.anInt983, this.aString26);
								aClass3_Sub1_Sub1_Sub4_Sub1_1.aString16 = this.aString26;
								aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt725 = local662;
								aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt739 = local834;
								aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt719 = 150;
								if (this.anInt857 == 2) {
									this.method681("@cr2@" + aClass3_Sub1_Sub1_Sub4_Sub1_1.aString4, aClass3_Sub1_Sub1_Sub4_Sub1_1.aString16, 2);
								} else if (this.anInt857 == 1) {
									this.method681("@cr1@" + aClass3_Sub1_Sub1_Sub4_Sub1_1.aString4, aClass3_Sub1_Sub1_Sub4_Sub1_1.aString16, 2);
								} else {
									this.method681(aClass3_Sub1_Sub1_Sub4_Sub1_1.aString4, aClass3_Sub1_Sub1_Sub4_Sub1_1.aString16, 2);
								}
								if (this.anInt925 == 2) {
									this.anInt925 = 3;
									this.aBoolean241 = true;
									this.aClass3_Sub1_Sub3_8.method263(100);
									this.aClass3_Sub1_Sub3_8.method264(this.anInt925);
									this.aClass3_Sub1_Sub3_8.method264(this.anInt913);
									this.aClass3_Sub1_Sub3_8.method264(this.anInt903);
								}
							}
							this.aString26 = "";
							this.aBoolean224 = true;
						}
					}
				}
			}
		} catch (@Pc(1072) RuntimeException local1072) {
			signlink.reporterror("52388, " + -359 + ", " + local1072.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method671(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean243) {
				for (@Pc(12) int local12 = 0; local12 < this.anIntArray267.length; local12++) {
					@Pc(19) int local19 = this.anIntArray267[local12];
					if (Class3_Sub1_Sub2_Sub3.anIntArray201[local19] >= arg0) {
						@Pc(28) Class3_Sub1_Sub2_Sub2 local28 = Class3_Sub1_Sub2_Sub3.aClass3_Sub1_Sub2_Sub2Array1[local19];
						@Pc(36) int local36 = local28.anInt559 * local28.anInt560 - 1;
						@Pc(44) int local44 = local28.anInt559 * this.anInt953 * 2;
						@Pc(47) byte[] local47 = local28.aByteArray13;
						@Pc(50) byte[] local50 = this.aByteArray21;
						for (@Pc(52) int local52 = 0; local52 <= local36; local52++) {
							local50[local52] = local47[local52 - local44 & local36];
						}
						local28.aByteArray13 = local50;
						this.aByteArray21 = local47;
						Class3_Sub1_Sub2_Sub3.method506(local19);
					}
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("65538, " + 0 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBIIIII)V")
	private void method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class3_Sub3 local1 = null;
			for (@Pc(6) Class3_Sub3 local6 = (Class3_Sub3) this.aClass27_11.method327(); local6 != null; local6 = (Class3_Sub3) this.aClass27_11.method329(this.anInt1016)) {
				if (local6.anInt665 == arg1 && local6.anInt667 == arg6 && local6.anInt668 == arg0 && local6.anInt666 == arg3) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class3_Sub3();
				local1.anInt665 = arg1;
				local1.anInt666 = arg3;
				local1.anInt667 = arg6;
				local1.anInt668 = arg0;
				this.method599(343, local1);
				this.aClass27_11.method324(local1);
			}
			local1.anInt671 = arg2;
			local1.anInt673 = arg7;
			local1.anInt672 = arg4;
			local1.anInt669 = arg8;
			local1.anInt670 = arg5;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("15481, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -2 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method673() {
		try {
			if (super.anInt813 == 1) {
				if (super.anInt814 >= 6 && super.anInt814 <= 106 && super.anInt815 >= 467 && super.anInt815 <= 499) {
					this.anInt925 = (this.anInt925 + 1) % 4;
					this.aBoolean241 = true;
					this.aBoolean224 = true;
					this.aClass3_Sub1_Sub3_8.method263(100);
					this.aClass3_Sub1_Sub3_8.method264(this.anInt925);
					this.aClass3_Sub1_Sub3_8.method264(this.anInt913);
					this.aClass3_Sub1_Sub3_8.method264(this.anInt903);
				}
				if (super.anInt814 >= 135 && super.anInt814 <= 235 && super.anInt815 >= 467 && super.anInt815 <= 499) {
					this.anInt913 = (this.anInt913 + 1) % 3;
					this.aBoolean241 = true;
					this.aBoolean224 = true;
					this.aClass3_Sub1_Sub3_8.method263(100);
					this.aClass3_Sub1_Sub3_8.method264(this.anInt925);
					this.aClass3_Sub1_Sub3_8.method264(this.anInt913);
					this.aClass3_Sub1_Sub3_8.method264(this.anInt903);
				}
				if (super.anInt814 >= 273 && super.anInt814 <= 373 && super.anInt815 >= 467 && super.anInt815 <= 499) {
					this.anInt903 = (this.anInt903 + 1) % 3;
					this.aBoolean241 = true;
					this.aBoolean224 = true;
					this.aClass3_Sub1_Sub3_8.method263(100);
					this.aClass3_Sub1_Sub3_8.method264(this.anInt925);
					this.aClass3_Sub1_Sub3_8.method264(this.anInt913);
					this.aClass3_Sub1_Sub3_8.method264(this.anInt903);
				}
				if (super.anInt814 >= 412 && super.anInt814 <= 512 && super.anInt815 >= 467 && super.anInt815 <= 499) {
					if (this.anInt971 == -1) {
						this.method685();
						this.aString23 = "";
						this.aBoolean228 = false;
						this.anInt1038 = this.anInt971 = Class13.anInt341;
						return;
					}
					this.method681("", "Please close the interface you have open before using 'report abuse'", 0);
					return;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("7648, " + 0 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!HZINZKXF;B)Z")
	private boolean method674(@OriginalArg(0) Class13 arg0) {
		try {
			if (arg0.anIntArray99 == null) {
				return false;
			}
			for (@Pc(8) int local8 = 0; local8 < arg0.anIntArray99.length; local8++) {
				@Pc(16) int local16 = this.method658(arg0, local8);
				@Pc(21) int local21 = arg0.anIntArray91[local8];
				if (arg0.anIntArray99[local8] == 2) {
					if (local16 >= local21) {
						return false;
					}
				} else if (arg0.anIntArray99[local8] == 3) {
					if (local16 <= local21) {
						return false;
					}
				} else if (arg0.anIntArray99[local8] == 4) {
					if (local16 == local21) {
						return false;
					}
				} else if (local16 != local21) {
					return false;
				}
			}
			return true;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("76412, " + arg0 + ", " + 2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)Ljava/lang/String;")
	private String method675(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("40265, " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method676() {
		try {
			@Pc(4) Graphics local4 = this.method584().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method577(169);
			this.anInt884 += 0;
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean218) {
				this.aBoolean238 = false;
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
			if (this.aBoolean214) {
				this.aBoolean238 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean231) {
				this.aBoolean238 = false;
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
			signlink.reporterror("92509, " + 0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method677() {
		try {
			for (@Pc(6) Class3_Sub1_Sub1_Sub6 local6 = (Class3_Sub1_Sub1_Sub6) this.aClass27_10.method327(); local6 != null; local6 = (Class3_Sub1_Sub1_Sub6) this.aClass27_10.method329(this.anInt1016)) {
				if (local6.anInt700 != this.anInt858 || local6.aBoolean180) {
					local6.method547();
				} else if (anInt1050 >= local6.anInt707) {
					local6.method531(this.anInt953, 254);
					if (local6.aBoolean180) {
						local6.method547();
					} else {
						this.aClass36_1.method391(local6.anInt701, 60, local6, local6.anInt700, 0, -1, local6.anInt702, local6.anInt703, false);
					}
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("94915, " + 5 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt1031 = Integer.parseInt(this.getParameter("nodeid"));
		anInt1032 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method620();
		} else {
			method699();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean242 = false;
		} else {
			aBoolean242 = true;
		}
		this.method575();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)Z")
	private boolean method678() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("1833, " + 7 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BI)Z")
	private boolean method679(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 == null ? true : signlink.wavesave(arg1, arg2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("11342, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method680(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt950 == 0) {
				@Pc(6) int local6 = super.anInt813;
				@Pc(10) boolean local10 = false;
				if (this.anInt899 == 1 && super.anInt814 >= 516 && super.anInt815 >= 160 && super.anInt814 <= 765 && super.anInt815 <= 205) {
					local6 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean208) {
					if (local6 != 1) {
						local41 = super.anInt808;
						local44 = super.anInt809;
						if (this.anInt867 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt867 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt867 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt868 - 10 || local41 > this.anInt868 + this.anInt870 + 10 || local44 < this.anInt869 - 10 || local44 > this.anInt869 + this.anInt871 + 10) {
							this.aBoolean208 = false;
							if (this.anInt867 == 1) {
								this.aBoolean207 = true;
							}
							if (this.anInt867 == 2) {
								this.aBoolean224 = true;
							}
						}
					}
					if (local6 == 1) {
						local41 = this.anInt868;
						local44 = this.anInt869;
						local120 = this.anInt870;
						@Pc(123) int local123 = super.anInt814;
						@Pc(126) int local126 = super.anInt815;
						if (this.anInt867 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt867 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt867 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt1053; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt1053 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method632(local145);
						}
						this.aBoolean208 = false;
						if (this.anInt867 == 1) {
							this.aBoolean207 = true;
						}
						if (this.anInt867 == 2) {
							this.aBoolean224 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt1053 > 0) {
						local41 = this.anIntArray228[this.anInt1053 - 1];
						if (local41 == 940 || local41 == 905 || local41 == 96 || local41 == 513 || local41 == 133 || local41 == 641 || local41 == 546 || local41 == 129 || local41 == 478 || local41 == 170 || local41 == 87 || local41 == 1187) {
							local44 = this.anIntArray226[this.anInt1053 - 1];
							local120 = this.anIntArray227[this.anInt1053 - 1];
							@Pc(281) Class13 local281 = Class13.method194(local120);
							if (local281.aBoolean89 || local281.aBoolean87) {
								this.aBoolean222 = false;
								this.anInt924 = 0;
								this.anInt948 = local120;
								this.anInt949 = local44;
								this.anInt950 = 2;
								this.anInt951 = super.anInt814;
								this.anInt952 = super.anInt815;
								if (Class13.method194(local120).anInt357 == this.anInt971) {
									this.anInt950 = 1;
								}
								if (Class13.method194(local120).anInt357 == this.anInt986) {
									this.anInt950 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt834 == 1 || this.method610(this.anInt1053 - 1)) && this.anInt1053 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt1053 > 0) {
						this.method632(this.anInt1053 - 1);
					}
					if (local6 != 2 || this.anInt1053 <= 0) {
						return;
					}
					this.method693();
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("14422, " + arg0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	private void method681(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt895 != -1) {
				this.aString28 = arg1;
				super.anInt813 = 0;
			}
			if (this.anInt986 == -1) {
				this.aBoolean224 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray212[local20] = this.anIntArray212[local20 - 1];
				this.aStringArray8[local20] = this.aStringArray8[local20 - 1];
				this.aStringArray9[local20] = this.aStringArray9[local20 - 1];
			}
			this.anIntArray212[0] = arg2;
			this.aStringArray8[0] = arg0;
			this.aStringArray9[0] = arg1;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("64243, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method682() {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1007; local7++) {
				if (this.anIntArray223[local7] <= 0) {
					@Pc(16) boolean local16 = false;
					try {
						if (this.anIntArray218[local7] != this.anInt862 || this.anIntArray257[local7] != this.anInt932) {
							@Pc(49) Class3_Sub1_Sub3 local49 = Class19.method212(this.anIntArray257[local7], this.anIntArray218[local7]);
							if (System.currentTimeMillis() + (long) (local49.anInt441 / 22) > this.aLong32 + (long) (this.anInt860 / 22)) {
								this.anInt860 = local49.anInt441;
								this.aLong32 = System.currentTimeMillis();
								if (this.method679((byte) 6, local49.aByteArray5, local49.anInt441)) {
									this.anInt862 = this.anIntArray218[local7];
									this.anInt932 = this.anIntArray257[local7];
								} else {
									local16 = true;
								}
							}
						} else if (!this.method678()) {
							local16 = true;
						}
					} catch (@Pc(99) Exception local99) {
					}
					if (local16 && this.anIntArray223[local7] != -5) {
						this.anIntArray223[local7] = -5;
					} else {
						this.anInt1007--;
						for (@Pc(115) int local115 = local7; local115 < this.anInt1007; local115++) {
							this.anIntArray218[local115] = this.anIntArray218[local115 + 1];
							this.anIntArray257[local115] = this.anIntArray257[local115 + 1];
							this.anIntArray223[local115] = this.anIntArray223[local115 + 1];
						}
						local7--;
					}
				} else {
					@Pc(167) int local167 = this.anIntArray223[local7]--;
				}
			}
			if (this.anInt974 > 0) {
				this.anInt974 -= 20;
				if (this.anInt974 < 0) {
					this.anInt974 = 0;
				}
				if (this.anInt974 == 0 && this.aBoolean209 && !aBoolean243) {
					this.anInt898 = this.anInt897;
					this.aBoolean210 = true;
					this.aClass10_Sub1_1.method464(2, this.anInt898);
					return;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("69336, " + false + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method683() {
		try {
			@Pc(2) int local2 = this.anInt868;
			@Pc(5) int local5 = this.anInt869;
			@Pc(8) int local8 = this.anInt870;
			@Pc(11) int local11 = this.anInt871;
			Class3_Sub1_Sub2.method554(local2, 6116423, local11, local5, local8);
			this.aBoolean237 &= true;
			Class3_Sub1_Sub2.method554(local2 + 1, 0, 16, local5 + 1, local8 - 2);
			Class3_Sub1_Sub2.method555(0, local5 + 18, local8 - 2, local11 - 19, local2 + 1);
			this.aClass3_Sub1_Sub2_Sub1_4.method124("Choose Option", local2 + 3, local5 + 14, 6116423);
			@Pc(69) int local69 = super.anInt808;
			@Pc(72) int local72 = super.anInt809;
			if (this.anInt867 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt867 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt867 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt1053; local91++) {
				@Pc(106) int local106 = local5 + (this.anInt1053 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local2 && local69 < local2 + local8 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass3_Sub1_Sub2_Sub1_4.method128(local106, this.aStringArray11[local91], true, local108, local2 + 3);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("2795, " + true + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method684() {
		try {
			if (this.anInt935 == 0 && super.anInt813 == 1) {
				@Pc(25) int local25 = super.anInt814 - 25 - 550;
				@Pc(32) int local32 = super.anInt815 - 5 - 4;
				if (local25 >= 0 && local32 >= 0 && local25 < 146 && local32 < 151) {
					local25 -= 73;
					local32 -= 75;
					@Pc(52) int local52 = this.anInt980 + this.anInt968 & 0x7FF;
					@Pc(56) int local56 = Class3_Sub1_Sub2_Sub3.anIntArray197[local52];
					@Pc(60) int local60 = Class3_Sub1_Sub2_Sub3.anIntArray198[local52];
					@Pc(69) int local69 = local56 * (this.anInt966 + 256) >> 8;
					@Pc(78) int local78 = local60 * (this.anInt966 + 256) >> 8;
					@Pc(88) int local88 = local32 * local69 + local25 * local78 >> 11;
					@Pc(98) int local98 = local32 * local78 - local25 * local69 >> 11;
					@Pc(105) int local105 = aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 + local88 >> 7;
					@Pc(112) int local112 = aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 - local98 >> 7;
					@Pc(133) boolean local133 = this.method588(0, local112, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], true, 0, 0, 1, local105, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
					if (local133) {
						this.aClass3_Sub1_Sub3_8.method264(local25);
						this.aClass3_Sub1_Sub3_8.method264(local32);
						this.aClass3_Sub1_Sub3_8.method265(this.anInt980);
						this.aClass3_Sub1_Sub3_8.method264(57);
						this.aClass3_Sub1_Sub3_8.method264(this.anInt968);
						this.aClass3_Sub1_Sub3_8.method264(this.anInt966);
						this.aClass3_Sub1_Sub3_8.method264(89);
						this.aClass3_Sub1_Sub3_8.method265(aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754);
						this.aClass3_Sub1_Sub3_8.method265(aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755);
						this.aClass3_Sub1_Sub3_8.method264(this.anInt915);
						this.aClass3_Sub1_Sub3_8.method264(63);
						return;
					}
				}
			}
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("48675, " + -12166 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method685() {
		try {
			this.aBoolean237 &= true;
			this.aClass3_Sub1_Sub3_8.method263(241);
			if (this.anInt1021 != -1) {
				this.method695(this.anInt1021);
				this.anInt1021 = -1;
				this.aBoolean207 = true;
				this.aBoolean213 = false;
				this.aBoolean226 = true;
			}
			if (this.anInt986 != -1) {
				this.method695(this.anInt986);
				this.anInt986 = -1;
				this.aBoolean224 = true;
				this.aBoolean213 = false;
			}
			if (this.anInt914 != -1) {
				this.method695(this.anInt914);
				this.anInt914 = -1;
				this.aBoolean221 = true;
			}
			if (this.anInt1033 != -1) {
				this.method695(this.anInt1033);
				this.anInt1033 = -1;
			}
			if (this.anInt971 != -1) {
				this.method695(this.anInt971);
				this.anInt971 = -1;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("96789, " + true + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!GALAVQEJ;II)V")
	private void method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.anInt1053 < 400) {
				if (arg2.anIntArray54 != null) {
					arg2 = arg2.method86();
				}
				if (arg2 != null && arg2.aBoolean41) {
					@Pc(29) String local29 = arg2.aString1;
					if (arg2.anInt136 != 0) {
						local29 = local29 + method587(arg2.anInt136, aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt295) + " (level-" + arg2.anInt136 + ")";
					}
					if (this.anInt1039 == 1) {
						this.aStringArray11[this.anInt1053] = "Use " + this.aString30 + " with @yel@" + local29;
						this.anIntArray228[this.anInt1053] = 58;
						this.anIntArray229[this.anInt1053] = arg0;
						this.anIntArray226[this.anInt1053] = arg3;
						this.anIntArray227[this.anInt1053] = arg1;
						this.anInt1053++;
					} else if (this.anInt899 != 1) {
						@Pc(167) int local167;
						if (arg2.aStringArray1 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg2.aStringArray1[local167] != null && !arg2.aStringArray1[local167].equalsIgnoreCase("attack")) {
									this.aStringArray11[this.anInt1053] = arg2.aStringArray1[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray228[this.anInt1053] = 249;
									}
									if (local167 == 1) {
										this.anIntArray228[this.anInt1053] = 691;
									}
									if (local167 == 2) {
										this.anIntArray228[this.anInt1053] = 458;
									}
									if (local167 == 3) {
										this.anIntArray228[this.anInt1053] = 916;
									}
									if (local167 == 4) {
										this.anIntArray228[this.anInt1053] = 743;
									}
									this.anIntArray229[this.anInt1053] = arg0;
									this.anIntArray226[this.anInt1053] = arg3;
									this.anIntArray227[this.anInt1053] = arg1;
									this.anInt1053++;
								}
							}
						}
						if (arg2.aStringArray1 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg2.aStringArray1[local167] != null && arg2.aStringArray1[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg2.anInt136 > aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt295) {
										local291 = 2000;
									}
									this.aStringArray11[this.anInt1053] = arg2.aStringArray1[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray228[this.anInt1053] = local291 + 249;
									}
									if (local167 == 1) {
										this.anIntArray228[this.anInt1053] = local291 + 691;
									}
									if (local167 == 2) {
										this.anIntArray228[this.anInt1053] = local291 + 458;
									}
									if (local167 == 3) {
										this.anIntArray228[this.anInt1053] = local291 + 916;
									}
									if (local167 == 4) {
										this.anIntArray228[this.anInt1053] = local291 + 743;
									}
									this.anIntArray229[this.anInt1053] = arg0;
									this.anIntArray226[this.anInt1053] = arg3;
									this.anIntArray227[this.anInt1053] = arg1;
									this.anInt1053++;
								}
							}
						}
						this.aStringArray11[this.anInt1053] = "Examine @yel@" + local29;
						this.anIntArray228[this.anInt1053] = 1117;
						this.anIntArray229[this.anInt1053] = arg0;
						this.anIntArray226[this.anInt1053] = arg3;
						this.anIntArray227[this.anInt1053] = arg1;
						this.anInt1053++;
					} else if ((this.anInt901 & 0x2) == 2) {
						this.aStringArray11[this.anInt1053] = this.aString20 + " @yel@" + local29;
						this.anIntArray228[this.anInt1053] = 465;
						this.anIntArray229[this.anInt1053] = arg0;
						this.anIntArray226[this.anInt1053] = arg3;
						this.anIntArray227[this.anInt1053] = arg1;
						this.anInt1053++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("83004, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 8 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private String method687(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("70226, " + arg0 + ", " + -427 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!HDYGEGXY;Lclient!NHEPCMLW;)V")
	private void method688(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub1_Sub4_Sub1 arg2, @OriginalArg(4) Class3_Sub1_Sub3 arg3) {
		try {
			@Pc(13) int local13;
			@Pc(23) int local23;
			@Pc(35) int local35;
			if ((arg1 & 0x20) != 0) {
				local13 = arg3.method300();
				if (local13 == 65535) {
					local13 = -1;
				}
				local23 = arg3.method294(this.anInt851);
				if (local13 == arg2.anInt743 && local13 != -1) {
					local35 = Class31.aClass31Array1[local13].anInt489;
					if (local35 == 1) {
						arg2.anInt744 = 0;
						arg2.anInt745 = 0;
						arg2.anInt746 = local23;
						arg2.anInt747 = 0;
					}
					if (local35 == 2) {
						arg2.anInt747 = 0;
					}
				} else if (local13 == -1 || arg2.anInt743 == -1 || Class31.aClass31Array1[local13].anInt483 >= Class31.aClass31Array1[arg2.anInt743].anInt483) {
					arg2.anInt743 = local13;
					arg2.anInt744 = 0;
					arg2.anInt745 = 0;
					arg2.anInt746 = local23;
					arg2.anInt747 = 0;
					arg2.anInt721 = arg2.anInt736;
				}
			}
			if ((arg1 & 0x100) != 0) {
				arg2.anInt714 = arg3.method301();
				local13 = arg3.method309();
				arg2.anInt718 = local13 >> 16;
				arg2.anInt717 = anInt1050 + (local13 & 0xFFFF);
				arg2.anInt715 = 0;
				arg2.anInt716 = 0;
				if (arg2.anInt717 > anInt1050) {
					arg2.anInt715 = -1;
				}
				if (arg2.anInt714 == 65535) {
					arg2.anInt714 = -1;
				}
			}
			if ((arg1 & 0x2) != 0) {
				local13 = arg3.method274();
				local23 = arg3.method292();
				arg2.method537(local13, anInt1050, local23);
				arg2.anInt740 = anInt1050 + 300;
				arg2.anInt741 = arg3.method294(this.anInt851);
				arg2.anInt742 = arg3.method274();
			}
			if ((arg1 & 0x40) != 0) {
				arg2.anInt710 = arg3.method301();
				if (arg2.anInt710 == 65535) {
					arg2.anInt710 = -1;
				}
			}
			if ((arg1 & 0x400) != 0) {
				arg2.anInt729 = arg3.method294(this.anInt851);
				arg2.anInt731 = arg3.method294(this.anInt851);
				arg2.anInt730 = arg3.method294(this.anInt851);
				arg2.anInt732 = arg3.method274();
				arg2.anInt733 = arg3.method301() + anInt1050;
				arg2.anInt734 = arg3.method302() + anInt1050;
				arg2.anInt735 = arg3.method294(this.anInt851);
				arg2.method540(this.anInt856);
			}
			if ((arg1 & 0x4) != 0) {
				local13 = arg3.method302();
				local23 = arg3.method294(this.anInt851);
				local35 = arg3.method294(this.anInt851);
				@Pc(258) int local258 = arg3.anInt441;
				if (arg2.aString4 != null && arg2.aBoolean75) {
					@Pc(268) long local268 = Class38.method435(arg2.aString4);
					@Pc(270) boolean local270 = false;
					if (local23 <= 1) {
						for (@Pc(275) int local275 = 0; local275 < this.anInt1030; local275++) {
							if (this.aLongArray3[local275] == local268) {
								local270 = true;
								break;
							}
						}
					}
					if (!local270 && this.anInt947 == 0) {
						try {
							this.aClass3_Sub1_Sub3_7.anInt441 = 0;
							arg3.method312(local35, this.aClass3_Sub1_Sub3_7.aByteArray5);
							this.aClass3_Sub1_Sub3_7.anInt441 = 0;
							@Pc(320) String local320 = Class22.method255(local35, this.aClass3_Sub1_Sub3_7);
							@Pc(325) String local325 = Class20.method227(this.anInt983, local320);
							arg2.aString16 = local325;
							arg2.anInt725 = local13 >> 8;
							arg2.anInt739 = local13 & 0xFF;
							arg2.anInt719 = 150;
							if (local23 == 2 || local23 == 3) {
								this.method681("@cr2@" + arg2.aString4, local325, 1);
							} else if (local23 == 1) {
								this.method681("@cr1@" + arg2.aString4, local325, 1);
							} else {
								this.method681(arg2.aString4, local325, 2);
							}
						} catch (@Pc(389) Exception local389) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt441 = local258 + local35;
			}
			if ((arg1 & 0x10) != 0) {
				arg2.anInt726 = arg3.method276();
				arg2.anInt727 = arg3.method301();
			}
			if ((arg1 & 0x200) != 0) {
				local13 = arg3.method292();
				local23 = arg3.method292();
				arg2.method537(local13, anInt1050, local23);
				arg2.anInt740 = anInt1050 + 300;
				arg2.anInt741 = arg3.method293();
				arg2.anInt742 = arg3.method294(this.anInt851);
			}
			if ((arg1 & 0x80) != 0) {
				arg2.aString16 = arg3.method281();
				if (arg2.aString16.charAt(0) == '~') {
					arg2.aString16 = arg2.aString16.substring(1);
					this.method681(arg2.aString4, arg2.aString16, 2);
				} else if (arg2 == aClass3_Sub1_Sub1_Sub4_Sub1_1) {
					this.method681(arg2.aString4, arg2.aString16, 2);
				}
				arg2.anInt725 = 0;
				arg2.anInt739 = 0;
				arg2.anInt719 = 150;
			}
			if ((arg1 & 0x1) != 0) {
				local13 = arg3.method293();
				@Pc(505) byte[] local505 = new byte[local13];
				@Pc(511) Class3_Sub1_Sub3 local511 = new Class3_Sub1_Sub3((byte) -103, local505);
				arg3.method311(this.anInt937, local505, local13);
				this.aClass3_Sub1_Sub3Array1[arg0] = local511;
				arg2.method177(local511);
			}
		} catch (@Pc(529) RuntimeException local529) {
			signlink.reporterror("96152, " + arg0 + ", " + 952 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local529.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method689(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt1046; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray10[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass3_Sub1_Sub1_Sub4_Sub1_1.aString4);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("17048, " + -154 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method690() {
		try {
			if (this.anInt970 != 0) {
				@Pc(6) Class3_Sub1_Sub2_Sub1 local6 = this.aClass3_Sub1_Sub2_Sub1_3;
				@Pc(8) int local8 = 0;
				this.aBoolean237 &= true;
				if (this.anInt1003 != 0) {
					local8 = 1;
				}
				for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
					if (this.aStringArray9[local21] != null) {
						@Pc(33) int local33 = this.anIntArray212[local21];
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
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt913 == 0 || this.anInt913 == 1 && this.method689(local38))) {
							local91 = 329 - local8 * 13;
							local6.method124("From", 4, local91, 0);
							local6.method124("From", 4, local91 - 1, 65535);
							@Pc(116) int local116 = local6.method122("From ") + 4;
							if (local40 == 1) {
								this.aClass3_Sub1_Sub2_Sub2Array4[0].method373(local116, local91 - 12);
								local116 += 14;
							}
							if (local40 == 2) {
								this.aClass3_Sub1_Sub2_Sub2Array4[1].method373(local116, local91 - 12);
								local116 += 14;
							}
							local6.method124(local38 + ": " + this.aStringArray9[local21], local116, local91, 0);
							local6.method124(local38 + ": " + this.aStringArray9[local21], local116, local91 - 1, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt913 < 2) {
							local91 = 329 - local8 * 13;
							local6.method124(this.aStringArray9[local21], 4, local91, 0);
							local6.method124(this.aStringArray9[local21], 4, local91 - 1, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt913 < 2) {
							local91 = 329 - local8 * 13;
							local6.method124("To " + local38 + ": " + this.aStringArray9[local21], 4, local91, 0);
							local6.method124("To " + local38 + ": " + this.aStringArray9[local21], 4, local91 - 1, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("6388, " + true + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method579() {
		this.method586(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt802 = 5;
		}
		if (aBoolean225) {
			this.aBoolean231 = true;
			return;
		}
		aBoolean225 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method675((byte) 3);
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
			this.aBoolean214 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(89) int local89 = 0; local89 < 5; local89++) {
				this.aClass44Array1[local89] = new Class44(signlink.aRandomAccessFileArray1[local89], 40916, local89 + 1, signlink.aRandomAccessFile3, 500000);
			}
		}
		try {
			this.method720();
			this.aClass14_2 = this.method650(this.anIntArray247[1], 1, anInt829, "title screen", "title", 25);
			this.aClass3_Sub1_Sub2_Sub1_2 = new Class3_Sub1_Sub2_Sub1(this.aClass14_2, 38414, false, "p11_full");
			this.aClass3_Sub1_Sub2_Sub1_3 = new Class3_Sub1_Sub2_Sub1(this.aClass14_2, 38414, false, "p12_full");
			this.aClass3_Sub1_Sub2_Sub1_4 = new Class3_Sub1_Sub2_Sub1(this.aClass14_2, 38414, false, "b12_full");
			this.aClass3_Sub1_Sub2_Sub1_5 = new Class3_Sub1_Sub2_Sub1(this.aClass14_2, 38414, true, "q8_full");
			this.method633();
			this.method715(669);
			@Pc(185) Class14 local185 = this.method650(this.anIntArray247[2], 2, anInt829, "config", "config", 30);
			@Pc(197) Class14 local197 = this.method650(this.anIntArray247[3], 3, anInt829, "interface", "interface", 35);
			@Pc(209) Class14 local209 = this.method650(this.anIntArray247[4], 4, anInt829, "2d graphics", "media", 40);
			@Pc(221) Class14 local221 = this.method650(this.anIntArray247[6], 6, anInt829, "textures", "textures", 45);
			@Pc(233) Class14 local233 = this.method650(this.anIntArray247[7], 7, anInt829, "chat system", "wordenc", 50);
			@Pc(245) Class14 local245 = this.method650(this.anIntArray247[8], 8, anInt829, "sound effects", "sounds", 55);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass36_1 = new Class36(4, this.anIntArrayArrayArray7, 104, 104, -11783);
			for (@Pc(270) int local270 = 0; local270 < 4; local270++) {
				this.aClass5Array1[local270] = new Class5(104, (byte) 9, 104);
			}
			this.aClass3_Sub1_Sub2_Sub4_6 = new Class3_Sub1_Sub2_Sub4(512, 512);
			@Pc(305) Class14 local305 = this.method650(this.anIntArray247[5], 5, anInt829, "update list", "versionlist", 60);
			this.method586(60, "Connecting to update server");
			this.aClass10_Sub1_1 = new Class10_Sub1();
			this.aClass10_Sub1_1.method447(local305, this);
			Class18.method206(this.aClass10_Sub1_1.method448());
			Class3_Sub1_Sub1_Sub1.method30(this.aClass10_Sub1_1.method465(0), this.aClass10_Sub1_1);
			if (!aBoolean243) {
				this.anInt898 = 0;
				try {
					this.anInt898 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(346) Exception local346) {
				}
				this.aBoolean210 = true;
				this.aClass10_Sub1_1.method464(2, this.anInt898);
				while (this.aClass10_Sub1_1.method461() > 0) {
					this.method721();
					try {
						Thread.sleep(100L);
					} catch (@Pc(364) Exception local364) {
					}
					if (this.aClass10_Sub1_1.anInt642 > 3) {
						this.method600("ondemand");
						return;
					}
				}
			}
			this.method586(65, "Requesting animations");
			@Pc(388) int local388 = this.aClass10_Sub1_1.method465(1);
			for (@Pc(390) int local390 = 0; local390 < local388; local390++) {
				this.aClass10_Sub1_1.method464(1, local390);
			}
			@Pc(409) int local409;
			while (this.aClass10_Sub1_1.method461() > 0) {
				local409 = local388 - this.aClass10_Sub1_1.method461();
				if (local409 > 0) {
					this.method586(65, "Loading animations - " + local409 * 100 / local388 + "%");
				}
				this.method721();
				try {
					Thread.sleep(100L);
				} catch (@Pc(435) Exception local435) {
				}
				if (this.aClass10_Sub1_1.anInt642 > 3) {
					this.method600("ondemand");
					return;
				}
			}
			this.method586(70, "Requesting models");
			local388 = this.aClass10_Sub1_1.method465(0);
			@Pc(469) int local469;
			for (local409 = 0; local409 < local388; local409++) {
				local469 = this.aClass10_Sub1_1.method456(local409);
				if ((local469 & 0x1) != 0) {
					this.aClass10_Sub1_1.method464(0, local409);
				}
			}
			local388 = this.aClass10_Sub1_1.method461();
			while (this.aClass10_Sub1_1.method461() > 0) {
				local469 = local388 - this.aClass10_Sub1_1.method461();
				if (local469 > 0) {
					this.method586(70, "Loading models - " + local469 * 100 / local388 + "%");
				}
				this.method721();
				try {
					Thread.sleep(100L);
				} catch (@Pc(520) Exception local520) {
				}
			}
			if (this.aClass44Array1[0] != null) {
				this.method586(75, "Requesting maps");
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(47, 48, 0));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(47, 48, 1));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(48, 48, 0));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(48, 48, 1));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(49, 48, 0));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(49, 48, 1));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(47, 47, 0));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(47, 47, 1));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(48, 47, 0));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(48, 47, 1));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(48, 148, 0));
				this.aClass10_Sub1_1.method464(3, this.aClass10_Sub1_1.method452(48, 148, 1));
				local388 = this.aClass10_Sub1_1.method461();
				while (this.aClass10_Sub1_1.method461() > 0) {
					local469 = local388 - this.aClass10_Sub1_1.method461();
					if (local469 > 0) {
						this.method586(75, "Loading maps - " + local469 * 100 / local388 + "%");
					}
					this.method721();
					try {
						Thread.sleep(100L);
					} catch (@Pc(705) Exception local705) {
					}
				}
			}
			local388 = this.aClass10_Sub1_1.method465(0);
			@Pc(726) int local726;
			for (local469 = 0; local469 < local388; local469++) {
				local726 = this.aClass10_Sub1_1.method456(local469);
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
					this.aClass10_Sub1_1.method454(0, local469, local728);
				}
			}
			this.aClass10_Sub1_1.method449(aBoolean242);
			if (!aBoolean243) {
				local388 = this.aClass10_Sub1_1.method465(2);
				for (local726 = 1; local726 < local388; local726++) {
					if (this.aClass10_Sub1_1.method446(local726)) {
						this.aClass10_Sub1_1.method454(2, local726, (byte) 1);
					}
				}
			}
			this.method586(80, "Unpacking media");
			this.aClass3_Sub1_Sub2_Sub2_11 = new Class3_Sub1_Sub2_Sub2(local209, "invback", 0);
			this.aClass3_Sub1_Sub2_Sub2_13 = new Class3_Sub1_Sub2_Sub2(local209, "chatback", 0);
			this.aClass3_Sub1_Sub2_Sub2_12 = new Class3_Sub1_Sub2_Sub2(local209, "mapback", 0);
			this.aClass3_Sub1_Sub2_Sub2_8 = new Class3_Sub1_Sub2_Sub2(local209, "backbase1", 0);
			this.aClass3_Sub1_Sub2_Sub2_9 = new Class3_Sub1_Sub2_Sub2(local209, "backbase2", 0);
			this.aClass3_Sub1_Sub2_Sub2_10 = new Class3_Sub1_Sub2_Sub2(local209, "backhmid1", 0);
			for (local726 = 0; local726 < 13; local726++) {
				this.aClass3_Sub1_Sub2_Sub2Array2[local726] = new Class3_Sub1_Sub2_Sub2(local209, "sideicons", local726);
			}
			this.aClass3_Sub1_Sub2_Sub4_10 = new Class3_Sub1_Sub2_Sub4(local209, "compass", 0);
			this.aClass3_Sub1_Sub2_Sub4_9 = new Class3_Sub1_Sub2_Sub4(local209, "mapedge", 0);
			this.aClass3_Sub1_Sub2_Sub4_9.method563();
			for (@Pc(928) int local928 = 0; local928 < 72; local928++) {
				this.aClass3_Sub1_Sub2_Sub2Array5[local928] = new Class3_Sub1_Sub2_Sub2(local209, "mapscene", local928);
			}
			for (@Pc(946) int local946 = 0; local946 < 63; local946++) {
				this.aClass3_Sub1_Sub2_Sub4Array7[local946] = new Class3_Sub1_Sub2_Sub4(local209, "mapfunction", local946);
			}
			for (@Pc(964) int local964 = 0; local964 < 5; local964++) {
				this.aClass3_Sub1_Sub2_Sub4Array9[local964] = new Class3_Sub1_Sub2_Sub4(local209, "hitmarks", local964);
			}
			for (@Pc(982) int local982 = 0; local982 < 6; local982++) {
				this.aClass3_Sub1_Sub2_Sub4Array6[local982] = new Class3_Sub1_Sub2_Sub4(local209, "headicons_pk", local982);
			}
			for (@Pc(1000) int local1000 = 0; local1000 < 9; local1000++) {
				this.aClass3_Sub1_Sub2_Sub4Array5[local1000] = new Class3_Sub1_Sub2_Sub4(local209, "headicons_prayer", local1000);
			}
			for (@Pc(1018) int local1018 = 0; local1018 < 6; local1018++) {
				this.aClass3_Sub1_Sub2_Sub4Array8[local1018] = new Class3_Sub1_Sub2_Sub4(local209, "headicons_hint", local1018);
			}
			this.aClass3_Sub1_Sub2_Sub4_3 = new Class3_Sub1_Sub2_Sub4(local209, "overlay_multiway", 0);
			this.aClass3_Sub1_Sub2_Sub4_7 = new Class3_Sub1_Sub2_Sub4(local209, "mapmarker", 0);
			this.aClass3_Sub1_Sub2_Sub4_8 = new Class3_Sub1_Sub2_Sub4(local209, "mapmarker", 1);
			for (@Pc(1060) int local1060 = 0; local1060 < 8; local1060++) {
				this.aClass3_Sub1_Sub2_Sub4Array10[local1060] = new Class3_Sub1_Sub2_Sub4(local209, "cross", local1060);
			}
			this.aClass3_Sub1_Sub2_Sub4_13 = new Class3_Sub1_Sub2_Sub4(local209, "mapdots", 0);
			this.aClass3_Sub1_Sub2_Sub4_14 = new Class3_Sub1_Sub2_Sub4(local209, "mapdots", 1);
			this.aClass3_Sub1_Sub2_Sub4_15 = new Class3_Sub1_Sub2_Sub4(local209, "mapdots", 2);
			this.aClass3_Sub1_Sub2_Sub4_16 = new Class3_Sub1_Sub2_Sub4(local209, "mapdots", 3);
			this.aClass3_Sub1_Sub2_Sub4_17 = new Class3_Sub1_Sub2_Sub4(local209, "mapdots", 4);
			this.aClass3_Sub1_Sub2_Sub2_1 = new Class3_Sub1_Sub2_Sub2(local209, "scrollbar", 0);
			this.aClass3_Sub1_Sub2_Sub2_2 = new Class3_Sub1_Sub2_Sub2(local209, "scrollbar", 1);
			this.aClass3_Sub1_Sub2_Sub2_14 = new Class3_Sub1_Sub2_Sub2(local209, "redstone1", 0);
			this.aClass3_Sub1_Sub2_Sub2_15 = new Class3_Sub1_Sub2_Sub2(local209, "redstone2", 0);
			this.aClass3_Sub1_Sub2_Sub2_16 = new Class3_Sub1_Sub2_Sub2(local209, "redstone3", 0);
			this.aClass3_Sub1_Sub2_Sub2_17 = new Class3_Sub1_Sub2_Sub2(local209, "redstone1", 0);
			this.aClass3_Sub1_Sub2_Sub2_17.method370();
			this.aClass3_Sub1_Sub2_Sub2_18 = new Class3_Sub1_Sub2_Sub2(local209, "redstone2", 0);
			this.aClass3_Sub1_Sub2_Sub2_18.method370();
			this.aClass3_Sub1_Sub2_Sub2_3 = new Class3_Sub1_Sub2_Sub2(local209, "redstone1", 0);
			this.aClass3_Sub1_Sub2_Sub2_3.method371();
			this.aClass3_Sub1_Sub2_Sub2_4 = new Class3_Sub1_Sub2_Sub2(local209, "redstone2", 0);
			this.aClass3_Sub1_Sub2_Sub2_4.method371();
			this.aClass3_Sub1_Sub2_Sub2_5 = new Class3_Sub1_Sub2_Sub2(local209, "redstone3", 0);
			this.aClass3_Sub1_Sub2_Sub2_5.method371();
			this.aClass3_Sub1_Sub2_Sub2_6 = new Class3_Sub1_Sub2_Sub2(local209, "redstone1", 0);
			this.aClass3_Sub1_Sub2_Sub2_6.method370();
			this.aClass3_Sub1_Sub2_Sub2_6.method371();
			this.aClass3_Sub1_Sub2_Sub2_7 = new Class3_Sub1_Sub2_Sub2(local209, "redstone2", 0);
			this.aClass3_Sub1_Sub2_Sub2_7.method370();
			this.aClass3_Sub1_Sub2_Sub2_7.method371();
			for (@Pc(1250) int local1250 = 0; local1250 < 2; local1250++) {
				this.aClass3_Sub1_Sub2_Sub2Array4[local1250] = new Class3_Sub1_Sub2_Sub2(local209, "mod_icons", local1250);
			}
			@Pc(1273) Class3_Sub1_Sub2_Sub4 local1273 = new Class3_Sub1_Sub2_Sub4(local209, "backleft1", 0);
			this.aClass42_19 = new Class42(local1273.anInt794, 5, local1273.anInt793, this.method584());
			local1273.method564(0, 0);
			@Pc(1298) Class3_Sub1_Sub2_Sub4 local1298 = new Class3_Sub1_Sub2_Sub4(local209, "backleft2", 0);
			this.aClass42_20 = new Class42(local1298.anInt794, 5, local1298.anInt793, this.method584());
			local1298.method564(0, 0);
			@Pc(1323) Class3_Sub1_Sub2_Sub4 local1323 = new Class3_Sub1_Sub2_Sub4(local209, "backright1", 0);
			this.aClass42_21 = new Class42(local1323.anInt794, 5, local1323.anInt793, this.method584());
			local1323.method564(0, 0);
			@Pc(1348) Class3_Sub1_Sub2_Sub4 local1348 = new Class3_Sub1_Sub2_Sub4(local209, "backright2", 0);
			this.aClass42_22 = new Class42(local1348.anInt794, 5, local1348.anInt793, this.method584());
			local1348.method564(0, 0);
			@Pc(1373) Class3_Sub1_Sub2_Sub4 local1373 = new Class3_Sub1_Sub2_Sub4(local209, "backtop1", 0);
			this.aClass42_23 = new Class42(local1373.anInt794, 5, local1373.anInt793, this.method584());
			local1373.method564(0, 0);
			@Pc(1398) Class3_Sub1_Sub2_Sub4 local1398 = new Class3_Sub1_Sub2_Sub4(local209, "backvmid1", 0);
			this.aClass42_24 = new Class42(local1398.anInt794, 5, local1398.anInt793, this.method584());
			local1398.method564(0, 0);
			@Pc(1423) Class3_Sub1_Sub2_Sub4 local1423 = new Class3_Sub1_Sub2_Sub4(local209, "backvmid2", 0);
			this.aClass42_25 = new Class42(local1423.anInt794, 5, local1423.anInt793, this.method584());
			local1423.method564(0, 0);
			@Pc(1448) Class3_Sub1_Sub2_Sub4 local1448 = new Class3_Sub1_Sub2_Sub4(local209, "backvmid3", 0);
			this.aClass42_26 = new Class42(local1448.anInt794, 5, local1448.anInt793, this.method584());
			local1448.method564(0, 0);
			@Pc(1473) Class3_Sub1_Sub2_Sub4 local1473 = new Class3_Sub1_Sub2_Sub4(local209, "backhmid2", 0);
			this.aClass42_27 = new Class42(local1473.anInt794, 5, local1473.anInt793, this.method584());
			local1473.method564(0, 0);
			@Pc(1498) int local1498 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1505) int local1505 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1512) int local1512 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1519) int local1519 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1521) int local1521 = 0; local1521 < 100; local1521++) {
				if (this.aClass3_Sub1_Sub2_Sub4Array7[local1521] != null) {
					this.aClass3_Sub1_Sub2_Sub4Array7[local1521].method562(local1498 + local1519, local1512 + local1519, local1505 + local1519, (byte) 7);
				}
				if (this.aClass3_Sub1_Sub2_Sub2Array5[local1521] != null) {
					this.aClass3_Sub1_Sub2_Sub2Array5[local1521].method372(local1498 + local1519, local1512 + local1519, local1505 + local1519, (byte) 7);
				}
			}
			this.method586(83, "Unpacking textures");
			Class3_Sub1_Sub2_Sub3.method504(local221);
			Class3_Sub1_Sub2_Sub3.method508(0.8D);
			Class3_Sub1_Sub2_Sub3.method503();
			this.method586(86, "Unpacking config");
			Class31.method339(local185);
			Class26.method315(local185);
			Class39.method441(local185);
			Class12.method180(local185);
			Class7.method90(local185);
			Class34.method348(local185);
			Class6.method80(local185);
			Class24.method258(local185);
			Class28.method332(local185);
			Class12.aBoolean80 = aBoolean242;
			if (!aBoolean243) {
				this.method586(90, "Unpacking sounds");
				@Pc(1624) byte[] local1624 = local245.method202("sounds.dat", (byte[]) null);
				@Pc(1630) Class3_Sub1_Sub3 local1630 = new Class3_Sub1_Sub3((byte) -103, local1624);
				Class19.method211(local1630);
			}
			this.method586(95, "Unpacking interfaces");
			@Pc(1661) Class3_Sub1_Sub2_Sub1[] local1661 = new Class3_Sub1_Sub2_Sub1[] { this.aClass3_Sub1_Sub2_Sub1_2, this.aClass3_Sub1_Sub2_Sub1_3, this.aClass3_Sub1_Sub2_Sub1_4, this.aClass3_Sub1_Sub2_Sub1_5 };
			Class13.method199(local209, local1661, local197);
			this.method586(100, "Preparing game engine");
			@Pc(1677) int local1677;
			@Pc(1679) int local1679;
			@Pc(1681) int local1681;
			for (@Pc(1673) int local1673 = 0; local1673 < 33; local1673++) {
				local1677 = 999;
				local1679 = 0;
				for (local1681 = 0; local1681 < 34; local1681++) {
					if (this.aClass3_Sub1_Sub2_Sub2_12.aByteArray13[local1681 + local1673 * this.aClass3_Sub1_Sub2_Sub2_12.anInt559] == 0) {
						if (local1677 == 999) {
							local1677 = local1681;
						}
					} else if (local1677 != 999) {
						local1679 = local1681;
						break;
					}
				}
				this.anIntArray256[local1673] = local1677;
				this.anIntArray255[local1673] = local1679 - local1677;
			}
			@Pc(1739) int local1739;
			for (local1677 = 5; local1677 < 156; local1677++) {
				local1679 = 999;
				local1681 = 0;
				for (local1739 = 25; local1739 < 172; local1739++) {
					if (this.aClass3_Sub1_Sub2_Sub2_12.aByteArray13[local1739 + local1677 * this.aClass3_Sub1_Sub2_Sub2_12.anInt559] == 0 && (local1739 > 34 || local1677 > 34)) {
						if (local1679 == 999) {
							local1679 = local1739;
						}
					} else if (local1679 != 999) {
						local1681 = local1739;
						break;
					}
				}
				this.anIntArray222[local1677 - 5] = local1679 - 25;
				this.anIntArray220[local1677 - 5] = local1681 - local1679;
			}
			Class3_Sub1_Sub2_Sub3.method501(503, 765);
			this.anIntArray216 = Class3_Sub1_Sub2_Sub3.anIntArray199;
			Class3_Sub1_Sub2_Sub3.method501(96, 479);
			this.anIntArray213 = Class3_Sub1_Sub2_Sub3.anIntArray199;
			Class3_Sub1_Sub2_Sub3.method501(261, 190);
			this.anIntArray214 = Class3_Sub1_Sub2_Sub3.anIntArray199;
			Class3_Sub1_Sub2_Sub3.method501(334, 512);
			this.anIntArray215 = Class3_Sub1_Sub2_Sub3.anIntArray199;
			@Pc(1830) int[] local1830 = new int[9];
			for (local1681 = 0; local1681 < 9; local1681++) {
				local1739 = local1681 * 32 + 128 + 15;
				@Pc(1848) int local1848 = local1739 * 3 + 600;
				@Pc(1852) int local1852 = Class3_Sub1_Sub2_Sub3.anIntArray197[local1739];
				local1830[local1681] = local1848 * local1852 >> 16;
			}
			Class36.method416(local1830);
			Class20.method217(local233);
			this.aClass23_1 = new Class23((byte) 0, this);
			this.method585(this.aClass23_1, 10);
			Class3_Sub1_Sub1_Sub2.aClient1 = this;
			Class26.aClient4 = this;
			Class7.aClient2 = this;
		} catch (@Pc(1893) Exception local1893) {
			signlink.reporterror("loaderror " + this.aString27 + " " + this.anInt821);
			this.aBoolean218 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method691() {
		try {
			this.aClass42_12.method467((byte) 6);
			Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray214;
			this.aClass3_Sub1_Sub2_Sub2_11.method373(0, 0);
			if (this.anInt1021 != -1) {
				this.method595(0, 0, Class13.method194(this.anInt1021), 0);
			} else if (this.anIntArray235[this.anInt922] != -1) {
				this.method595(0, 0, Class13.method194(this.anIntArray235[this.anInt922]), 0);
			}
			if (this.aBoolean208 && this.anInt867 == 1) {
				this.method683();
			}
			this.aClass42_12.method468(553, 205, super.aGraphics2);
			this.aClass42_14.method467((byte) 6);
			Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("25664, " + 0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method692() {
		try {
			this.anInt945++;
			this.method596(true);
			this.method630(true);
			this.method596(false);
			this.method630(false);
			this.method609();
			this.method677();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean234) {
				local35 = this.anInt979;
				if (this.anInt894 / 256 > local35) {
					local35 = this.anInt894 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray239[4] + 128 > local35) {
					local35 = this.anIntArray239[4] + 128;
				}
				local74 = this.anInt980 + this.anInt873 & 0x7FF;
				this.method709(local35 * 3 + 600, this.anInt989, this.method629(this.anInt858, aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755, aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754) - 50, local74, local35, this.anInt988);
				anInt850++;
				if (anInt850 > 70) {
					anInt850 = 0;
					this.aClass3_Sub1_Sub3_8.method263(235);
				}
			}
			if (this.aBoolean234) {
				local35 = this.method626();
			} else {
				local35 = this.method625();
			}
			local74 = this.anInt835;
			@Pc(132) int local132 = this.anInt836;
			@Pc(135) int local135 = this.anInt837;
			@Pc(138) int local138 = this.anInt838;
			@Pc(141) int local141 = this.anInt839;
			@Pc(190) int local190;
			for (@Pc(143) int local143 = 0; local143 < 5; local143++) {
				if (this.aBooleanArray12[local143]) {
					local190 = (int) (Math.random() * (double) (this.anIntArray244[local143] * 2 + 1) - (double) this.anIntArray244[local143] + Math.sin((double) this.anIntArray250[local143] * ((double) this.anIntArray259[local143] / 100.0D)) * (double) this.anIntArray239[local143]);
					if (local143 == 0) {
						this.anInt835 += local190;
					}
					if (local143 == 1) {
						this.anInt836 += local190;
					}
					if (local143 == 2) {
						this.anInt837 += local190;
					}
					if (local143 == 3) {
						this.anInt839 = this.anInt839 + local190 & 0x7FF;
					}
					if (local143 == 4) {
						this.anInt838 += local190;
						if (this.anInt838 < 128) {
							this.anInt838 = 128;
						}
						if (this.anInt838 > 383) {
							this.anInt838 = 383;
						}
					}
				}
			}
			local190 = Class3_Sub1_Sub2_Sub3.anInt693;
			Class3_Sub1_Sub1_Sub1.aBoolean20 = true;
			Class3_Sub1_Sub1_Sub1.anInt76 = 0;
			Class3_Sub1_Sub1_Sub1.anInt74 = super.anInt808 - 4;
			Class3_Sub1_Sub1_Sub1.anInt75 = super.anInt809 - 4;
			Class3_Sub1_Sub2.method552();
			this.aClass36_1.method419(this.anInt839, this.anInt837, this.anInt838, this.anInt836, local35, this.anInt835);
			this.aClass36_1.method394(this.anInt992);
			this.method656(this.anInt883);
			this.method711((byte) 2);
			this.method671(local190);
			this.method668();
			this.aClass42_14.method468(4, 4, super.aGraphics2);
			this.anInt835 = local74;
			this.anInt836 = local132;
			this.anInt837 = local135;
			this.anInt838 = local138;
			this.anInt839 = local141;
		} catch (@Pc(338) RuntimeException local338) {
			signlink.reporterror("11750, " + 20 + ", " + local338.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method693() {
		try {
			@Pc(7) int local7 = this.aClass3_Sub1_Sub2_Sub1_4.method122("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt1053; local9++) {
				local20 = this.aClass3_Sub1_Sub2_Sub1_4.method122(this.aStringArray11[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = 15 * this.anInt1053 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt814 > 4 && super.anInt815 > 4 && super.anInt814 < 516 && super.anInt815 < 338) {
				local69 = super.anInt814 - local7 / 2 - 4;
				if (local69 + local7 > 512) {
					local69 = 512 - local7;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt815 - 4;
				if (local87 + local20 > 334) {
					local87 = 334 - local20;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean208 = true;
				this.anInt867 = 0;
				this.anInt868 = local69;
				this.anInt869 = local87;
				this.anInt870 = local7;
				this.anInt871 = 15 * this.anInt1053 + 22;
			}
			if (super.anInt814 > 553 && super.anInt815 > 205 && super.anInt814 < 743 && super.anInt815 < 466) {
				local69 = super.anInt814 - local7 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 190) {
					local69 = 190 - local7;
				}
				local87 = super.anInt815 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 261) {
					local87 = 261 - local20;
				}
				this.aBoolean208 = true;
				this.anInt867 = 1;
				this.anInt868 = local69;
				this.anInt869 = local87;
				this.anInt870 = local7;
				this.anInt871 = 15 * this.anInt1053 + 22;
			}
			if (super.anInt814 > 17 && super.anInt815 > 357 && super.anInt814 < 496 && super.anInt815 < 453) {
				local69 = super.anInt814 - local7 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 479) {
					local69 = 479 - local7;
				}
				local87 = super.anInt815 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 96) {
					local87 = 96 - local20;
				}
				this.aBoolean208 = true;
				this.anInt867 = 2;
				this.anInt868 = local69;
				this.anInt869 = local87;
				this.anInt870 = local7;
				this.anInt871 = 15 * this.anInt1053 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("56365, " + -1729 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class27 local9 = this.aClass27ArrayArrayArray1[this.anInt858][arg0][arg1];
		if (local9 == null) {
			this.aClass36_1.method401(this.anInt858, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class3_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class3_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class3_Sub1_Sub1_Sub3) local9.method327(); local27 != null; local27 = (Class3_Sub1_Sub1_Sub3) local9.method329(this.anInt1016)) {
			@Pc(32) Class12 local32 = Class12.method179(local27.anInt115);
			@Pc(35) int local35 = local32.anInt310;
			if (local32.aBoolean81) {
				local35 *= local27.anInt114 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method325(local23);
		@Pc(66) Class3_Sub1_Sub1_Sub3 local66 = null;
		@Pc(68) Class3_Sub1_Sub1_Sub3 local68 = null;
		for (local27 = (Class3_Sub1_Sub1_Sub3) local9.method327(); local27 != null; local27 = (Class3_Sub1_Sub1_Sub3) local9.method329(this.anInt1016)) {
			if (local27.anInt115 != local23.anInt115 && local66 == null) {
				local66 = local27;
			}
			if (local27.anInt115 != local23.anInt115 && local27.anInt115 != local66.anInt115 && local68 == null) {
				local68 = local27;
			}
		}
		@Pc(112) int local112 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass36_1.method387(local112, arg0, this.anInt858, this.method629(this.anInt858, arg1 * 128 + 64, arg0 * 128 + 64), local66, local68, local23, arg1);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method695(@OriginalArg(0) int arg0) {
		try {
			Class13.method192(arg0);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("95269, " + arg0 + ", " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method696() {
		try {
			this.aBoolean200 = true;
			for (@Pc(15) int local15 = 0; local15 < 7; local15++) {
				this.anIntArray246[local15] = -1;
				for (@Pc(24) int local24 = 0; local24 < Class34.anInt544; local24++) {
					if (!Class34.aClass34Array1[local24].aBoolean141 && Class34.aClass34Array1[local24].anInt545 == local15 + (this.aBoolean229 ? 0 : 7)) {
						this.anIntArray246[local15] = local24;
						break;
					}
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("95435, " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZI)Z")
	private boolean method697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) boolean local7 = false;
			@Pc(10) Class13 local10 = Class13.method194(arg0);
			for (@Pc(12) int local12 = 0; local12 < local10.anIntArray98.length && local10.anIntArray98[local12] != -1; local12++) {
				@Pc(26) Class13 local26 = Class13.method194(local10.anIntArray98[local12]);
				if (local26.anInt338 == 1) {
					local7 |= this.method697(local26.anInt340, arg1);
				}
				@Pc(61) int local61;
				if (local26.anInt338 == 6 && (local26.anInt348 != -1 || local26.anInt349 != -1)) {
					@Pc(56) boolean local56 = this.method674(local26);
					if (local56) {
						local61 = local26.anInt349;
					} else {
						local61 = local26.anInt348;
					}
					if (local61 != -1) {
						@Pc(73) Class31 local73 = Class31.aClass31Array1[local61];
						local26.anInt345 += arg1;
						while (local26.anInt345 > local73.method340(local26.anInt364, this.anInt825)) {
							local26.anInt345 -= local73.method340(local26.anInt364, this.anInt825) + 1;
							local26.anInt364++;
							if (local26.anInt364 >= local73.anInt481) {
								local26.anInt364 -= local73.anInt482;
								if (local26.anInt364 < 0 || local26.anInt364 >= local73.anInt481) {
									local26.anInt364 = 0;
								}
							}
							local7 = true;
						}
					}
				}
				if (local26.anInt338 == 6 && local26.anInt342 != 0) {
					@Pc(146) int local146 = local26.anInt342 >> 16;
					local61 = local26.anInt342 << 16 >> 16;
					@Pc(157) int local157 = local146 * arg1;
					local61 *= arg1;
					local26.anInt360 = local26.anInt360 + local157 & 0x7FF;
					local26.anInt361 = local26.anInt361 + local61 & 0x7FF;
					local7 = true;
				}
			}
			return local7;
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("26516, " + arg0 + ", " + false + ", " + arg1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method698() {
		try {
			this.anInt947 = 0;
			@Pc(10) int local10 = (aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 >> 7) + this.anInt957;
			@Pc(18) int local18 = (aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 >> 7) + this.anInt958;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt947 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt947 = 1;
			}
			if (this.anInt947 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt947 = 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("36956, " + -231 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method700() {
		try {
			if (this.anInt950 == 0) {
				this.aStringArray11[0] = "Cancel";
				this.anIntArray228[0] = 1400;
				this.anInt1053 = 1;
				if (this.anInt914 == -1) {
					this.method622();
					this.anInt1002 = 0;
					this.anInt997 = 0;
					if (super.anInt808 > 4 && super.anInt809 > 4 && super.anInt808 < 516 && super.anInt809 < 338) {
						if (this.anInt971 == -1) {
							this.method614(359);
						} else {
							this.method663(super.anInt808, 4, Class13.method194(this.anInt971), 4, super.anInt809, 0, 0);
						}
					}
					if (this.anInt1002 != this.anInt855) {
						this.anInt855 = this.anInt1002;
					}
					if (this.anInt997 != this.anInt1023) {
						this.anInt1023 = this.anInt997;
					}
					this.anInt1002 = 0;
					this.anInt997 = 0;
					if (super.anInt808 > 553 && super.anInt809 > 205 && super.anInt808 < 743 && super.anInt809 < 466) {
						if (this.anInt1021 != -1) {
							this.method663(super.anInt808, 205, Class13.method194(this.anInt1021), 553, super.anInt809, 0, 1);
						} else if (this.anIntArray235[this.anInt922] != -1) {
							this.method663(super.anInt808, 205, Class13.method194(this.anIntArray235[this.anInt922]), 553, super.anInt809, 0, 1);
						}
					}
					if (this.anInt1002 != this.anInt891) {
						this.aBoolean207 = true;
						this.anInt891 = this.anInt1002;
					}
					if (this.anInt997 != this.anInt962) {
						this.aBoolean207 = true;
						this.anInt962 = this.anInt997;
					}
					this.anInt1002 = 0;
					this.anInt997 = 0;
					if (super.anInt808 > 17 && super.anInt809 > 357 && super.anInt808 < 496 && super.anInt809 < 453) {
						if (this.anInt986 != -1) {
							this.method663(super.anInt808, 357, Class13.method194(this.anInt986), 17, super.anInt809, 0, 2);
						} else if (this.anInt895 != -1) {
							this.method663(super.anInt808, 357, Class13.method194(this.anInt895), 17, super.anInt809, 0, 3);
						} else if (super.anInt809 < 434 && super.anInt808 < 426) {
							this.method701(super.anInt809 - 357, super.anInt808 - 17);
						}
					}
					if ((this.anInt986 != -1 || this.anInt895 != -1) && this.anInt1002 != this.anInt1008) {
						this.aBoolean224 = true;
						this.anInt1008 = this.anInt1002;
					}
					if ((this.anInt986 != -1 || this.anInt895 != -1) && this.anInt997 != this.anInt938) {
						this.aBoolean224 = true;
						this.anInt938 = this.anInt997;
					}
					@Pc(347) boolean local347 = false;
					while (!local347) {
						local347 = true;
						for (@Pc(353) int local353 = 0; local353 < this.anInt1053 - 1; local353++) {
							if (this.anIntArray228[local353] < 1000 && this.anIntArray228[local353 + 1] > 1000) {
								@Pc(374) String local374 = this.aStringArray11[local353];
								this.aStringArray11[local353] = this.aStringArray11[local353 + 1];
								this.aStringArray11[local353 + 1] = local374;
								@Pc(396) int local396 = this.anIntArray228[local353];
								this.anIntArray228[local353] = this.anIntArray228[local353 + 1];
								this.anIntArray228[local353 + 1] = local396;
								@Pc(418) int local418 = this.anIntArray226[local353];
								this.anIntArray226[local353] = this.anIntArray226[local353 + 1];
								this.anIntArray226[local353 + 1] = local418;
								@Pc(440) int local440 = this.anIntArray227[local353];
								this.anIntArray227[local353] = this.anIntArray227[local353 + 1];
								this.anIntArray227[local353 + 1] = local440;
								@Pc(462) int local462 = this.anIntArray229[local353];
								this.anIntArray229[local353] = this.anIntArray229[local353 + 1];
								this.anIntArray229[local353 + 1] = local462;
								local347 = false;
							}
						}
					}
				} else {
					this.anInt1002 = 0;
					this.anInt997 = 0;
					this.method663(super.anInt808, 0, Class13.method194(this.anInt914), 0, super.anInt809, 0, 0);
					if (this.anInt1002 != this.anInt855) {
						this.anInt855 = this.anInt1002;
					}
					if (this.anInt997 != this.anInt1023) {
						this.anInt1023 = this.anInt997;
					}
				}
			}
		} catch (@Pc(492) RuntimeException local492) {
			signlink.reporterror("72822, " + -4 + ", " + local492.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (5233 == this.anInt828) {
				@Pc(6) int local6 = 0;
				for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
					if (this.aStringArray9[local8] != null) {
						@Pc(20) int local20 = this.anIntArray212[local8];
						@Pc(31) int local31 = this.anInt944 + 70 + 4 - local6 * 14;
						if (local31 < -20) {
							break;
						}
						@Pc(39) String local39 = this.aStringArray8[local8];
						if (local39 != null && local39.startsWith("@cr1@")) {
							local39 = local39.substring(5);
						}
						if (local39 != null && local39.startsWith("@cr2@")) {
							local39 = local39.substring(5);
						}
						if (local20 == 0) {
							local6++;
						}
						if ((local20 == 1 || local20 == 2) && (local20 == 1 || this.anInt925 == 0 || this.anInt925 == 1 && this.method689(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31 && !local39.equals(aClass3_Sub1_Sub1_Sub4_Sub1_1.aString4)) {
								if (this.anInt857 >= 1) {
									this.aStringArray11[this.anInt1053] = "Report abuse @whi@" + local39;
									this.anIntArray228[this.anInt1053] = 345;
									this.anInt1053++;
								}
								this.aStringArray11[this.anInt1053] = "Add ignore @whi@" + local39;
								this.anIntArray228[this.anInt1053] = 648;
								this.anInt1053++;
								this.aStringArray11[this.anInt1053] = "Add friend @whi@" + local39;
								this.anIntArray228[this.anInt1053] = 918;
								this.anInt1053++;
							}
							local6++;
						}
						if ((local20 == 3 || local20 == 7) && this.anInt970 == 0 && (local20 == 7 || this.anInt913 == 0 || this.anInt913 == 1 && this.method689(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31) {
								if (this.anInt857 >= 1) {
									this.aStringArray11[this.anInt1053] = "Report abuse @whi@" + local39;
									this.anIntArray228[this.anInt1053] = 345;
									this.anInt1053++;
								}
								this.aStringArray11[this.anInt1053] = "Add ignore @whi@" + local39;
								this.anIntArray228[this.anInt1053] = 648;
								this.anInt1053++;
								this.aStringArray11[this.anInt1053] = "Add friend @whi@" + local39;
								this.anIntArray228[this.anInt1053] = 918;
								this.anInt1053++;
							}
							local6++;
						}
						if (local20 == 4 && (this.anInt903 == 0 || this.anInt903 == 1 && this.method689(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31) {
								this.aStringArray11[this.anInt1053] = "Accept trade @whi@" + local39;
								this.anIntArray228[this.anInt1053] = 124;
								this.anInt1053++;
							}
							local6++;
						}
						if ((local20 == 5 || local20 == 6) && this.anInt970 == 0 && this.anInt913 < 2) {
							local6++;
						}
						if (local20 == 8 && (this.anInt903 == 0 || this.anInt903 == 1 && this.method689(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31) {
								this.aStringArray11[this.anInt1053] = "Accept challenge @whi@" + local39;
								this.anIntArray228[this.anInt1053] = 475;
								this.anInt1053++;
							}
							local6++;
						}
					}
				}
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("53221, " + arg0 + ", " + arg1 + ", " + 5233 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)Z")
	private boolean method702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass36_1.method410(this.anInt858, arg0, arg1, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			@Pc(35) boolean local35 = false;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(47) Class26 local47 = Class26.method313(local7);
				@Pc(55) int local55;
				@Pc(58) int local58;
				if (local31 == 0 || local31 == 2) {
					local55 = local47.anInt446;
					local58 = local47.anInt458;
				} else {
					local55 = local47.anInt458;
					local58 = local47.anInt446;
				}
				@Pc(69) int local69 = local47.anInt461;
				if (local31 != 0) {
					local69 = (local69 << local31 & 0xF) + (local69 >> 4 - local31);
				}
				this.method588(0, arg1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, local69, 0, 2, arg0, local55, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], local58);
			} else {
				this.method588(local25 + 1, arg1, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0], false, 0, local31, 2, arg0, 0, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0], 0);
			}
			this.anInt830 = super.anInt814;
			this.anInt831 = super.anInt815;
			this.anInt833 = 2;
			this.anInt832 = 0;
			return true;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("65517, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NHEPCMLW;II)V")
	private void method703(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(14) int local14;
			@Pc(18) int local18;
			@Pc(27) int local27;
			@Pc(34) int local34;
			@Pc(38) int local38;
			@Pc(42) int local42;
			@Pc(46) int local46;
			@Pc(51) int local51;
			@Pc(83) int local83;
			@Pc(97) int local97;
			@Pc(109) int local109;
			@Pc(129) int local129;
			@Pc(71) int local71;
			if (arg1 == 255) {
				local14 = arg0.method301();
				local18 = arg0.method292();
				local27 = this.anInt972 + (local18 >> 4 & 0x7);
				local34 = this.anInt973 + (local18 & 0x7);
				local38 = arg0.method292();
				local42 = local38 >> 2;
				local46 = local38 & 0x3;
				local51 = this.anIntArray248[local42];
				if (local27 >= 0 && local34 >= 0 && local27 < 103 && local34 < 103) {
					local71 = this.anIntArrayArrayArray7[this.anInt858][local27][local34];
					local83 = this.anIntArrayArrayArray7[this.anInt858][local27 + 1][local34];
					local97 = this.anIntArrayArrayArray7[this.anInt858][local27 + 1][local34 + 1];
					local109 = this.anIntArrayArrayArray7[this.anInt858][local27][local34 + 1];
					if (local51 == 0) {
						@Pc(120) Class50 local120 = this.aClass36_1.method402(this.anInt858, local34, local27);
						if (local120 != null) {
							local129 = local120.anInt779 >> 14 & 0x7FFF;
							if (local42 == 2) {
								local120.aClass3_Sub1_Sub1_7 = new Class3_Sub1_Sub1_Sub2(local71, local14, false, local109, local97, local46 + 4, 2, true, local83, local129);
								local120.aClass3_Sub1_Sub1_8 = new Class3_Sub1_Sub1_Sub2(local71, local14, false, local109, local97, local46 + 1 & 0x3, 2, true, local83, local129);
							} else {
								local120.aClass3_Sub1_Sub1_7 = new Class3_Sub1_Sub1_Sub2(local71, local14, false, local109, local97, local46, local42, true, local83, local129);
							}
						}
					}
					if (local51 == 1) {
						@Pc(197) Class16 local197 = this.aClass36_1.method403(this.anInt858, local27, local34);
						if (local197 != null) {
							local197.aClass3_Sub1_Sub1_1 = new Class3_Sub1_Sub1_Sub2(local71, local14, false, local109, local97, 0, 4, true, local83, local197.anInt388 >> 14 & 0x7FFF);
						}
					}
					if (local51 == 2) {
						@Pc(231) Class21 local231 = this.aClass36_1.method404(this.anInt858, local27, local34);
						if (local42 == 11) {
							local42 = 10;
						}
						if (local231 != null) {
							local231.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1_Sub2(local71, local14, false, local109, local97, local46, local42, true, local83, local231.anInt418 >> 14 & 0x7FFF);
						}
					}
					if (local51 == 3) {
						@Pc(270) Class25 local270 = this.aClass36_1.method405(local27, this.anInt858, local34);
						if (local270 != null) {
							local270.aClass3_Sub1_Sub1_3 = new Class3_Sub1_Sub1_Sub2(local71, local14, false, local109, local97, local46, 22, true, local83, local270.anInt433 >> 14 & 0x7FFF);
						}
					}
				}
			} else {
				@Pc(346) Class3_Sub1_Sub1_Sub3 local346;
				if (arg1 == 203) {
					local14 = arg0.method294(this.anInt851);
					local18 = this.anInt972 + (local14 >> 4 & 0x7);
					local27 = this.anInt973 + (local14 & 0x7);
					local34 = arg0.method276();
					if (local18 >= 0 && local27 >= 0 && local18 < 104 && local27 < 104) {
						@Pc(340) Class27 local340 = this.aClass27ArrayArrayArray1[this.anInt858][local18][local27];
						if (local340 != null) {
							for (local346 = (Class3_Sub1_Sub1_Sub3) local340.method327(); local346 != null; local346 = (Class3_Sub1_Sub1_Sub3) local340.method329(this.anInt1016)) {
								if (local346.anInt115 == (local34 & 0x7FFF)) {
									local346.method547();
									break;
								}
							}
							if (local340.method327() == null) {
								this.aClass27ArrayArrayArray1[this.anInt858][local18][local27] = null;
							}
							this.method694(local18, local27);
						}
					}
				} else {
					if (arg1 == 10) {
						local14 = arg0.method274();
						local18 = this.anInt972 + (local14 >> 4 & 0x7);
						local27 = this.anInt973 + (local14 & 0x7);
						local34 = arg0.method276();
						local38 = arg0.method274();
						local42 = local38 >> 4 & 0xF;
						local46 = local38 & 0x7;
						if (aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0] >= local18 - local42 && aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0] <= local18 + local42 && aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0] >= local27 - local42 && aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0] <= local27 + local42 && this.aBoolean220 && !aBoolean243 && this.anInt1007 < 50) {
							this.anIntArray218[this.anInt1007] = local34;
							this.anIntArray257[this.anInt1007] = local46;
							this.anIntArray223[this.anInt1007] = Class19.anIntArray110[local34];
							this.anInt1007++;
						}
					}
					if (arg1 == 150) {
						local14 = arg0.method300();
						local18 = arg0.method301();
						local27 = arg0.method274();
						local34 = this.anInt972 + (local27 >> 4 & 0x7);
						local38 = this.anInt973 + (local27 & 0x7);
						if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104) {
							local346 = new Class3_Sub1_Sub1_Sub3();
							local346.anInt115 = local18;
							local346.anInt114 = local14;
							if (this.aClass27ArrayArrayArray1[this.anInt858][local34][local38] == null) {
								this.aClass27ArrayArrayArray1[this.anInt858][local34][local38] = new Class27((byte) 118);
							}
							this.aClass27ArrayArrayArray1[this.anInt858][local34][local38].method324(local346);
							this.method694(local34, local38);
						}
					} else if (arg1 == 75) {
						local14 = arg0.method274();
						local18 = this.anInt972 + (local14 >> 4 & 0x7);
						local27 = this.anInt973 + (local14 & 0x7);
						local34 = arg0.method276();
						local38 = arg0.method274();
						local42 = arg0.method276();
						if (local18 >= 0 && local27 >= 0 && local18 < 104 && local27 < 104) {
							local18 = local18 * 128 + 64;
							local27 = local27 * 128 + 64;
							@Pc(652) Class3_Sub1_Sub1_Sub6 local652 = new Class3_Sub1_Sub1_Sub6(this.anInt858, local18, true, anInt1050, local34, this.method629(this.anInt858, local27, local18) - local38, local42, local27);
							this.aClass27_10.method324(local652);
						}
					} else if (arg1 == 42) {
						local14 = arg0.method274();
						local18 = this.anInt972 + (local14 >> 4 & 0x7);
						local27 = this.anInt973 + (local14 & 0x7);
						local34 = arg0.method276();
						local38 = arg0.method276();
						local42 = arg0.method276();
						if (local18 >= 0 && local27 >= 0 && local18 < 104 && local27 < 104) {
							@Pc(708) Class27 local708 = this.aClass27ArrayArrayArray1[this.anInt858][local18][local27];
							if (local708 != null) {
								for (@Pc(714) Class3_Sub1_Sub1_Sub3 local714 = (Class3_Sub1_Sub1_Sub3) local708.method327(); local714 != null; local714 = (Class3_Sub1_Sub1_Sub3) local708.method329(this.anInt1016)) {
									if (local714.anInt115 == (local34 & 0x7FFF) && local714.anInt114 == local38) {
										local714.anInt114 = local42;
										break;
									}
								}
								this.method694(local18, local27);
							}
						}
					} else {
						@Pc(797) int local797;
						if (arg1 == 200) {
							@Pc(750) byte local750 = arg0.method275();
							@Pc(754) byte local754 = arg0.method295(984);
							local27 = arg0.method292();
							local34 = local27 >> 2;
							local38 = local27 & 0x3;
							local42 = this.anIntArray248[local34];
							@Pc(775) byte local775 = arg0.method296();
							local51 = arg0.method276();
							@Pc(782) byte local782 = arg0.method295(984);
							local83 = arg0.method276();
							local97 = arg0.method301();
							local109 = arg0.method302();
							local797 = arg0.method293();
							local129 = this.anInt972 + (local797 >> 4 & 0x7);
							@Pc(813) int local813 = this.anInt973 + (local797 & 0x7);
							@Pc(819) Class3_Sub1_Sub1_Sub4_Sub1 local819;
							if (local83 == this.anInt1035) {
								local819 = aClass3_Sub1_Sub1_Sub4_Sub1_1;
							} else {
								local819 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local83];
							}
							if (local819 != null) {
								@Pc(831) Class26 local831 = Class26.method313(local97);
								@Pc(841) int local841 = this.anIntArrayArrayArray7[this.anInt858][local129][local813];
								@Pc(853) int local853 = this.anIntArrayArrayArray7[this.anInt858][local129 + 1][local813];
								@Pc(867) int local867 = this.anIntArrayArrayArray7[this.anInt858][local129 + 1][local813 + 1];
								@Pc(879) int local879 = this.anIntArrayArrayArray7[this.anInt858][local129][local813 + 1];
								@Pc(889) Class3_Sub1_Sub1_Sub1 local889 = local831.method321(local34, local38, local841, local853, local867, local879, -1);
								if (local889 != null) {
									this.method672(local813, this.anInt858, -1, local42, 0, local51 + 1, local129, 0, local109 + 1);
									local819.anInt292 = local109 + anInt1050;
									local819.anInt293 = local51 + anInt1050;
									local819.aClass3_Sub1_Sub1_Sub1_2 = local889;
									@Pc(924) int local924 = local831.anInt446;
									@Pc(927) int local927 = local831.anInt458;
									if (local38 == 1 || local38 == 3) {
										local924 = local831.anInt458;
										local927 = local831.anInt446;
									}
									local819.anInt297 = local129 * 128 + local924 * 64;
									local819.anInt299 = local813 * 128 + local927 * 64;
									local819.anInt298 = this.method629(this.anInt858, local819.anInt299, local819.anInt297);
									@Pc(973) byte local973;
									if (local782 > local754) {
										local973 = local782;
										local782 = local754;
										local754 = local973;
									}
									if (local775 > local750) {
										local973 = local775;
										local775 = local750;
										local750 = local973;
									}
									local819.anInt302 = local129 + local782;
									local819.anInt304 = local129 + local754;
									local819.anInt303 = local813 + local775;
									local819.anInt305 = local813 + local750;
								}
							}
						}
						if (arg1 == 238) {
							local14 = arg0.method274();
							local18 = this.anInt972 + (local14 >> 4 & 0x7);
							local27 = this.anInt973 + (local14 & 0x7);
							local34 = local18 + arg0.method275();
							local38 = local27 + arg0.method275();
							local42 = arg0.method277();
							local46 = arg0.method276();
							local51 = arg0.method274() * 4;
							local71 = arg0.method274() * 4;
							local83 = arg0.method276();
							local97 = arg0.method276();
							local109 = arg0.method274();
							local797 = arg0.method274();
							if (local18 >= 0 && local27 >= 0 && local18 < 104 && local27 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local46 != 65535) {
								local18 = local18 * 128 + 64;
								local27 = local27 * 128 + 64;
								local34 = local34 * 128 + 64;
								local38 = local38 * 128 + 64;
								@Pc(1142) Class3_Sub1_Sub1_Sub5 local1142 = new Class3_Sub1_Sub1_Sub5(local27, local18, local97 + anInt1050, local83 + anInt1050, local42, this.anInt858, 0, this.method629(this.anInt858, local27, local18) - local51, local46, local797, local71, local109);
								local1142.method346(this.method629(this.anInt858, local38, local34) - local71, (byte) 6, local34, local38, local83 + anInt1050);
								this.aClass27_12.method324(local1142);
							}
						} else if (arg1 == 241) {
							local14 = arg0.method293();
							local18 = this.anInt972 + (local14 >> 4 & 0x7);
							local27 = this.anInt973 + (local14 & 0x7);
							local34 = arg0.method301();
							local38 = arg0.method293();
							local42 = local38 >> 2;
							local46 = local38 & 0x3;
							local51 = this.anIntArray248[local42];
							if (local18 >= 0 && local27 >= 0 && local18 < 104 && local27 < 104) {
								this.method672(local27, this.anInt858, local34, local51, local46, -1, local18, local42, 0);
							}
						} else if (arg1 == 116) {
							local14 = arg0.method301();
							local18 = arg0.method302();
							local27 = arg0.method274();
							local34 = this.anInt972 + (local27 >> 4 & 0x7);
							local38 = this.anInt973 + (local27 & 0x7);
							local42 = arg0.method300();
							if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local14 != this.anInt1035) {
								@Pc(1284) Class3_Sub1_Sub1_Sub3 local1284 = new Class3_Sub1_Sub1_Sub3();
								local1284.anInt115 = local42;
								local1284.anInt114 = local18;
								if (this.aClass27ArrayArrayArray1[this.anInt858][local34][local38] == null) {
									this.aClass27ArrayArrayArray1[this.anInt858][local34][local38] = new Class27((byte) 118);
								}
								this.aClass27ArrayArrayArray1[this.anInt858][local34][local38].method324(local1284);
								this.method694(local34, local38);
							}
						} else if (arg1 == 2) {
							local14 = arg0.method294(this.anInt851);
							local18 = this.anInt972 + (local14 >> 4 & 0x7);
							local27 = this.anInt973 + (local14 & 0x7);
							local34 = arg0.method292();
							local38 = local34 >> 2;
							local42 = local34 & 0x3;
							local46 = this.anIntArray248[local38];
							if (local18 >= 0 && local27 >= 0 && local18 < 104 && local27 < 104) {
								this.method672(local27, this.anInt858, -1, local46, local42, -1, local18, local38, 0);
							}
						}
					}
				}
			}
		} catch (@Pc(1395) RuntimeException local1395) {
			signlink.reporterror("29132, " + arg0 + ", " + arg1 + ", " + 151 + ", " + local1395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method704() {
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
			this.anInt1015 += 128;
			if (this.anInt1015 > this.anIntArray230.length) {
				this.anInt1015 -= this.anIntArray230.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method612((byte) 2, this.aClass3_Sub1_Sub2_Sub2Array3[local48]);
			}
			@Pc(171) int local171;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local171 = local54 + (local48 << 7);
					@Pc(194) int local194 = this.anIntArray225[local171 + 128] - this.anIntArray230[local171 + this.anInt1015 & this.anIntArray230.length - 1] / 5;
					if (local194 < 0) {
						local194 = 0;
					}
					this.anIntArray224[local171] = local194;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray233[local54] = this.anIntArray233[local54 + 1];
			}
			this.anIntArray233[255] = (int) (Math.sin((double) anInt1050 / 14.0D) * 16.0D + Math.sin((double) anInt1050 / 15.0D) * 14.0D + Math.sin((double) anInt1050 / 16.0D) * 12.0D);
			if (this.anInt964 > 0) {
				this.anInt964 -= 4;
			}
			if (this.anInt965 > 0) {
				this.anInt965 -= 4;
			}
			if (this.anInt964 == 0 && this.anInt965 == 0) {
				local171 = (int) (Math.random() * 2000.0D);
				if (local171 == 0) {
					this.anInt964 = 1024;
				}
				if (local171 == 1) {
					this.anInt965 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("41821, " + -145 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLclient!ZWUMKFUX;)V")
	private void method705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub2_Sub4 arg2) {
		try {
			@Pc(7) int local7 = this.anInt980 + this.anInt968 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class3_Sub1_Sub1_Sub1.anIntArray42[local7];
				@Pc(27) int local27 = Class3_Sub1_Sub1_Sub1.anIntArray43[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt966 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt966 + 256);
				@Pc(55) int local55 = arg0 * local36 + arg1 * local45 >> 16;
				@Pc(65) int local65 = arg0 * local45 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method572(local55 + 94 + 4 - arg2.anInt797 / 2, this.aByte30, 83 - local65 - arg2.anInt798 / 2 - 4, this.aClass3_Sub1_Sub2_Sub2_12);
				} else {
					arg2.method566(local55 + 94 + 4 - arg2.anInt797 / 2, 83 - local65 - arg2.anInt798 / 2 - 4, (byte) 8);
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("37878, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method706(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.aClass42_13.method467((byte) 6);
			@Pc(32) int local32;
			@Pc(34) int local34;
			if (this.anInt935 == 2) {
				@Pc(27) byte[] local27 = this.aClass3_Sub1_Sub2_Sub2_12.aByteArray13;
				@Pc(29) int[] local29 = Class3_Sub1_Sub2.anIntArray208;
				local32 = local27.length;
				for (local34 = 0; local34 < local32; local34++) {
					if (local27[local34] == 0) {
						local29[local34] = 0;
					}
				}
				this.aClass3_Sub1_Sub2_Sub4_10.method570(33, 256, this.anInt980, 0, this.anIntArray256, 33, this.anIntArray255, 0, 25, 25);
				this.aClass42_14.method467((byte) 6);
				Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
			} else {
				@Pc(81) int local81 = this.anInt980 + this.anInt968 & 0x7FF;
				@Pc(88) int local88 = aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 / 32 + 48;
				local32 = 464 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 / 32;
				this.aClass3_Sub1_Sub2_Sub4_6.method570(146, this.anInt966 + 256, local81, 25, this.anIntArray222, 151, this.anIntArray220, 5, local32, local88);
				this.aClass3_Sub1_Sub2_Sub4_10.method570(33, 256, this.anInt980, 0, this.anIntArray256, 33, this.anIntArray255, 0, 25, 25);
				for (local34 = 0; local34 < this.anInt1037; local34++) {
					local88 = this.anIntArray268[local34] * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 / 32;
					local32 = this.anIntArray269[local34] * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 / 32;
					this.method705(local32, local88, this.aClass3_Sub1_Sub2_Sub4Array4[local34]);
				}
				@Pc(183) int local183;
				for (@Pc(179) int local179 = 0; local179 < 104; local179++) {
					for (local183 = 0; local183 < 104; local183++) {
						@Pc(195) Class27 local195 = this.aClass27ArrayArrayArray1[this.anInt858][local179][local183];
						if (local195 != null) {
							local88 = local179 * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 / 32;
							local32 = local183 * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 / 32;
							this.method705(local32, local88, this.aClass3_Sub1_Sub2_Sub4_13);
						}
					}
				}
				for (local183 = 0; local183 < this.anInt987; local183++) {
					@Pc(246) Class3_Sub1_Sub1_Sub4_Sub2 local246 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray245[local183]];
					if (local246 != null && local246.method536(29)) {
						@Pc(255) Class7 local255 = local246.aClass7_2;
						if (local255.anIntArray54 != null) {
							local255 = local255.method86();
						}
						if (local255 != null && local255.aBoolean39 && local255.aBoolean41) {
							local88 = local246.anInt754 / 32 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 / 32;
							local32 = local246.anInt755 / 32 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 / 32;
							this.method705(local32, local88, this.aClass3_Sub1_Sub2_Sub4_14);
						}
					}
				}
				@Pc(314) Class3_Sub1_Sub1_Sub4_Sub1 local314;
				for (@Pc(304) int local304 = 0; local304 < this.anInt1012; local304++) {
					local314 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray251[local304]];
					if (local314 != null && local314.method536(29)) {
						local88 = local314.anInt754 / 32 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 / 32;
						local32 = local314.anInt755 / 32 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 / 32;
						@Pc(342) boolean local342 = false;
						@Pc(346) long local346 = Class38.method435(local314.aString4);
						for (@Pc(348) int local348 = 0; local348 < this.anInt1046; local348++) {
							if (local346 == this.aLongArray4[local348] && this.anIntArray234[local348] != 0) {
								local342 = true;
								break;
							}
						}
						@Pc(373) boolean local373 = false;
						if (aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt300 != 0 && local314.anInt300 != 0 && aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt300 == local314.anInt300) {
							local373 = true;
						}
						if (local342) {
							this.method705(local32, local88, this.aClass3_Sub1_Sub2_Sub4_16);
						} else if (local373) {
							this.method705(local32, local88, this.aClass3_Sub1_Sub2_Sub4_17);
						} else {
							this.method705(local32, local88, this.aClass3_Sub1_Sub2_Sub4_15);
						}
					}
				}
				if (this.anInt1000 != 0 && anInt1050 % 20 < 10) {
					if (this.anInt1000 == 1 && this.anInt841 >= 0 && this.anInt841 < this.aClass3_Sub1_Sub1_Sub4_Sub2Array1.length) {
						@Pc(447) Class3_Sub1_Sub1_Sub4_Sub2 local447 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anInt841];
						if (local447 != null) {
							local88 = local447.anInt754 / 32 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 / 32;
							local32 = local447.anInt755 / 32 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 / 32;
							this.method598(local32, local88, this.aClass3_Sub1_Sub2_Sub4_8);
						}
					}
					if (this.anInt1000 == 2) {
						local88 = (this.anInt904 - this.anInt957) * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 / 32;
						local32 = (this.anInt905 - this.anInt958) * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 / 32;
						this.method598(local32, local88, this.aClass3_Sub1_Sub2_Sub4_8);
					}
					if (this.anInt1000 == 10 && this.anInt866 >= 0 && this.anInt866 < this.aClass3_Sub1_Sub1_Sub4_Sub1Array1.length) {
						local314 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anInt866];
						if (local314 != null) {
							local88 = local314.anInt754 / 32 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 / 32;
							local32 = local314.anInt755 / 32 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 / 32;
							this.method598(local32, local88, this.aClass3_Sub1_Sub2_Sub4_8);
						}
					}
				}
				if (this.anInt917 != 0) {
					local88 = this.anInt917 * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt754 / 32;
					local32 = this.anInt918 * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt755 / 32;
					this.method705(local32, local88, this.aClass3_Sub1_Sub2_Sub4_7);
				}
				Class3_Sub1_Sub2.method554(97, 16777215, 3, 78, 3);
				this.aClass42_14.method467((byte) 6);
				Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
			}
		} catch (@Pc(615) RuntimeException local615) {
			signlink.reporterror("45286, " + arg0 + ", " + local615.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method707() {
		try {
			if (super.anInt813 == 1) {
				if (super.anInt814 >= 539 && super.anInt814 <= 573 && super.anInt815 >= 169 && super.anInt815 < 205 && this.anIntArray235[0] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 0;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 569 && super.anInt814 <= 599 && super.anInt815 >= 168 && super.anInt815 < 205 && this.anIntArray235[1] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 1;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 597 && super.anInt814 <= 627 && super.anInt815 >= 168 && super.anInt815 < 205 && this.anIntArray235[2] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 2;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 625 && super.anInt814 <= 669 && super.anInt815 >= 168 && super.anInt815 < 203 && this.anIntArray235[3] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 3;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 666 && super.anInt814 <= 696 && super.anInt815 >= 168 && super.anInt815 < 205 && this.anIntArray235[4] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 4;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 694 && super.anInt814 <= 724 && super.anInt815 >= 168 && super.anInt815 < 205 && this.anIntArray235[5] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 5;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 722 && super.anInt814 <= 756 && super.anInt815 >= 169 && super.anInt815 < 205 && this.anIntArray235[6] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 6;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 540 && super.anInt814 <= 574 && super.anInt815 >= 466 && super.anInt815 < 502 && this.anIntArray235[7] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 7;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 572 && super.anInt814 <= 602 && super.anInt815 >= 466 && super.anInt815 < 503 && this.anIntArray235[8] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 8;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 599 && super.anInt814 <= 629 && super.anInt815 >= 466 && super.anInt815 < 503 && this.anIntArray235[9] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 9;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 627 && super.anInt814 <= 671 && super.anInt815 >= 467 && super.anInt815 < 502 && this.anIntArray235[10] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 10;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 669 && super.anInt814 <= 699 && super.anInt815 >= 466 && super.anInt815 < 503 && this.anIntArray235[11] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 11;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 696 && super.anInt814 <= 726 && super.anInt815 >= 466 && super.anInt815 < 503 && this.anIntArray235[12] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 12;
					this.aBoolean226 = true;
				}
				if (super.anInt814 >= 724 && super.anInt814 <= 758 && super.anInt815 >= 466 && super.anInt815 < 502 && this.anIntArray235[13] != -1) {
					this.aBoolean207 = true;
					this.anInt922 = 13;
					this.aBoolean226 = true;
					return;
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("71208, " + 1 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!NHEPCMLW;II)V")
	private void method708(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt861 = 0;
			this.anInt1013 = 0;
			this.method631(467, arg0, arg1);
			this.method659(arg1, arg0);
			this.method653(arg0, arg1, (byte) 2);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt861; local29++) {
				local36 = this.anIntArray217[local29];
				if (this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local36].anInt720 != anInt1050) {
					this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local36].aClass7_2 = null;
					this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local36] = null;
				}
			}
			if (arg0.anInt441 != arg1) {
				signlink.reporterror(this.aString18 + " size mismatch in getnpcpos - pos:" + arg0.anInt441 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt987; local36++) {
				if (this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray245[local36]] == null) {
					signlink.reporterror(this.aString18 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt987);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("94536, " + arg0 + ", " + -934 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg4 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = arg0;
			@Pc(26) int local26;
			@Pc(30) int local30;
			@Pc(40) int local40;
			if (local5 != 0) {
				local26 = Class3_Sub1_Sub1_Sub1.anIntArray42[local5];
				local30 = Class3_Sub1_Sub1_Sub1.anIntArray43[local5];
				local40 = 0 * local30 - arg0 * local26 >> 16;
				local20 = 0 * local26 + arg0 * local30 >> 16;
				local18 = local40;
			}
			if (local11 != 0) {
				local26 = Class3_Sub1_Sub1_Sub1.anIntArray42[local11];
				local30 = Class3_Sub1_Sub1_Sub1.anIntArray43[local11];
				local40 = local20 * local26 + 0 * local30 >> 16;
				local20 = local20 * local30 - 0 * local26 >> 16;
				local16 = local40;
			}
			this.anInt835 = arg5 - local16;
			this.anInt836 = arg2 - local18;
			this.anInt837 = arg1 - local20;
			this.anInt838 = arg4;
			this.anInt839 = arg3;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("60986, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -970 + ", " + arg4 + ", " + arg5 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!HDYGEGXY;I)V")
	private void method710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub1_Sub4_Sub1 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != aClass3_Sub1_Sub1_Sub4_Sub1_1 && this.anInt1053 < 400) {
				@Pc(35) String local35;
				if (arg2.anInt288 == 0) {
					local35 = arg2.aString4 + method587(arg2.anInt295, aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt295) + " (level-" + arg2.anInt295 + ")";
				} else {
					local35 = arg2.aString4 + " (skill-" + arg2.anInt288 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt1039 == 1) {
					this.aStringArray11[this.anInt1053] = "Use " + this.aString30 + " with @whi@" + local35;
					this.anIntArray228[this.anInt1053] = 265;
					this.anIntArray229[this.anInt1053] = arg0;
					this.anIntArray226[this.anInt1053] = arg3;
					this.anIntArray227[this.anInt1053] = arg1;
					this.anInt1053++;
				} else if (this.anInt899 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray12[local165] != null) {
							this.aStringArray11[this.anInt1053] = this.aStringArray12[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray12[local165].equalsIgnoreCase("attack")) {
								if (arg2.anInt295 > aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt295) {
									local192 = 2000;
								}
								if (aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt300 != 0 && arg2.anInt300 != 0) {
									if (aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt300 == arg2.anInt300) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray11[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray228[this.anInt1053] = local192 + 355;
							}
							if (local165 == 1) {
								this.anIntArray228[this.anInt1053] = local192 + 518;
							}
							if (local165 == 2) {
								this.anIntArray228[this.anInt1053] = local192 + 461;
							}
							if (local165 == 3) {
								this.anIntArray228[this.anInt1053] = local192 + 996;
							}
							if (local165 == 4) {
								this.anIntArray228[this.anInt1053] = local192 + 408;
							}
							this.anIntArray229[this.anInt1053] = arg0;
							this.anIntArray226[this.anInt1053] = arg3;
							this.anIntArray227[this.anInt1053] = arg1;
							this.anInt1053++;
						}
					}
				} else if ((this.anInt901 & 0x8) == 8) {
					this.aStringArray11[this.anInt1053] = this.aString20 + " @whi@" + local35;
					this.anIntArray228[this.anInt1053] = 318;
					this.anIntArray229[this.anInt1053] = arg0;
					this.anIntArray226[this.anInt1053] = arg3;
					this.anIntArray227[this.anInt1053] = arg1;
					this.anInt1053++;
				}
				for (local165 = 0; local165 < this.anInt1053; local165++) {
					if (this.anIntArray228[local165] == 872) {
						this.aStringArray11[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("39334, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method711(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt1000 == 2) {
				this.method666((this.anInt905 - this.anInt958 << 7) + this.anInt908, (this.anInt904 - this.anInt957 << 7) + this.anInt907, this.anInt906 * 2);
				@Pc(36) boolean local36 = false;
				if (this.anInt1004 > -1 && anInt1050 % 20 < 10) {
					this.aClass3_Sub1_Sub2_Sub4Array8[0].method566(this.anInt1004 - 12, this.anInt1005 - 28, (byte) 8);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("81252, " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method712(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString24 = "";
				this.aString25 = "Connecting to server...";
				this.method648(true);
			}
			this.aClass47_1 = new Class47(this, 0, this.method713(anInt1032 + 43594));
			@Pc(30) long local30 = Class38.method435(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass3_Sub1_Sub3_8.anInt441 = 0;
			this.aClass3_Sub1_Sub3_8.method264(14);
			this.aClass3_Sub1_Sub3_8.method264(local37);
			this.aClass47_1.method525(this.aClass3_Sub1_Sub3_8.aByteArray5, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass47_1.method522();
			}
			@Pc(74) int local74 = this.aClass47_1.method522();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(260) int local260;
			if (local74 == 0) {
				this.aClass47_1.method524(this.aClass3_Sub1_Sub3_9.aByteArray5, 0, 8);
				this.aClass3_Sub1_Sub3_9.anInt441 = 0;
				this.aLong29 = this.aClass3_Sub1_Sub3_9.method280();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass3_Sub1_Sub3_8.anInt441 = 0;
				this.aClass3_Sub1_Sub3_8.method264(10);
				this.aClass3_Sub1_Sub3_8.method268(local99[0]);
				this.aClass3_Sub1_Sub3_8.method268(local99[1]);
				this.aClass3_Sub1_Sub3_8.method268(local99[2]);
				this.aClass3_Sub1_Sub3_8.method268(local99[3]);
				this.aClass3_Sub1_Sub3_8.method268(signlink.anInt1055);
				this.aClass3_Sub1_Sub3_8.method271(arg0);
				this.aClass3_Sub1_Sub3_8.method271(arg1);
				this.aClass3_Sub1_Sub3_8.method289(aBigInteger2, aBigInteger1);
				this.aClass3_Sub1_Sub3_6.anInt441 = 0;
				if (arg2) {
					this.aClass3_Sub1_Sub3_6.method264(18);
				} else {
					this.aClass3_Sub1_Sub3_6.method264(16);
				}
				this.aClass3_Sub1_Sub3_6.method264(this.aClass3_Sub1_Sub3_8.anInt441 + 36 + 1 + 1 + 2);
				this.aClass3_Sub1_Sub3_6.method264(255);
				this.aClass3_Sub1_Sub3_6.method265(339);
				this.aClass3_Sub1_Sub3_6.method264(aBoolean243 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass3_Sub1_Sub3_6.method268(this.anIntArray247[local225]);
				}
				this.aClass3_Sub1_Sub3_6.method272(this.aClass3_Sub1_Sub3_8.anInt441, this.aClass3_Sub1_Sub3_8.aByteArray5);
				this.aClass3_Sub1_Sub3_8.aClass15_1 = new Class15(local99, this.aBoolean223);
				for (local260 = 0; local260 < 4; local260++) {
					local99[local260] += 50;
				}
				this.aClass15_2 = new Class15(local99, this.aBoolean223);
				this.aClass47_1.method525(this.aClass3_Sub1_Sub3_6.aByteArray5, this.aClass3_Sub1_Sub3_6.anInt441);
				local74 = this.aClass47_1.method522();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(303) Exception local303) {
				}
				this.method712(arg0, arg1, arg2);
			} else {
				@Pc(391) int local391;
				if (local74 == 2) {
					this.anInt857 = this.aClass47_1.method522();
					aBoolean244 = this.aClass47_1.method522() == 1;
					this.aLong33 = 0L;
					this.anInt844 = 0;
					this.aClass23_1.anInt420 = 0;
					super.aBoolean199 = true;
					this.aBoolean240 = true;
					this.aBoolean237 = true;
					this.aClass3_Sub1_Sub3_8.anInt441 = 0;
					this.aClass3_Sub1_Sub3_9.anInt441 = 0;
					this.anInt885 = -1;
					this.anInt1017 = -1;
					this.anInt1018 = -1;
					this.anInt1019 = -1;
					this.anInt884 = 0;
					this.anInt886 = 0;
					this.anInt1003 = 0;
					this.anInt888 = 0;
					this.anInt1000 = 0;
					this.anInt1053 = 0;
					this.aBoolean208 = false;
					super.anInt806 = 0;
					for (local391 = 0; local391 < 100; local391++) {
						this.aStringArray9[local391] = null;
					}
					this.anInt1039 = 0;
					this.anInt899 = 0;
					this.anInt946 = 0;
					this.anInt1007 = 0;
					this.anInt853 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1043 = (int) (Math.random() * 110.0D) - 55;
					this.anInt873 = (int) (Math.random() * 80.0D) - 40;
					this.anInt968 = (int) (Math.random() * 120.0D) - 60;
					this.anInt966 = (int) (Math.random() * 30.0D) - 20;
					this.anInt980 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt935 = 0;
					this.anInt822 = -1;
					this.anInt917 = 0;
					this.anInt918 = 0;
					this.anInt1012 = 0;
					this.anInt987 = 0;
					for (local225 = 0; local225 < this.anInt1010; local225++) {
						this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local225] = null;
						this.aClass3_Sub1_Sub3Array1[local225] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local260] = null;
					}
					aClass3_Sub1_Sub1_Sub4_Sub1_1 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anInt1011] = new Class3_Sub1_Sub1_Sub4_Sub1();
					this.aClass27_12.method331();
					this.aClass27_10.method331();
					@Pc(536) int local536;
					@Pc(540) int local540;
					for (@Pc(532) int local532 = 0; local532 < 4; local532++) {
						for (local536 = 0; local536 < 104; local536++) {
							for (local540 = 0; local540 < 104; local540++) {
								this.aClass27ArrayArrayArray1[local532][local536][local540] = null;
							}
						}
					}
					this.aClass27_11 = new Class27((byte) 118);
					this.anInt1047 = 0;
					this.anInt1046 = 0;
					this.method695(this.anInt895);
					this.anInt895 = -1;
					this.method695(this.anInt986);
					this.anInt986 = -1;
					this.method695(this.anInt971);
					this.anInt971 = -1;
					this.method695(this.anInt914);
					this.anInt914 = -1;
					this.method695(this.anInt1033);
					this.anInt1033 = -1;
					this.method695(this.anInt1021);
					this.anInt1021 = -1;
					this.method695(this.anInt826);
					this.anInt826 = -1;
					this.aBoolean213 = false;
					this.anInt922 = 3;
					this.anInt910 = 0;
					this.aBoolean208 = false;
					this.aBoolean232 = false;
					this.aString28 = null;
					this.anInt881 = 0;
					this.anInt998 = -1;
					this.aBoolean229 = true;
					this.method696();
					for (local536 = 0; local536 < 5; local536++) {
						this.anIntArray232[local536] = 0;
					}
					for (local540 = 0; local540 < 5; local540++) {
						this.aStringArray12[local540] = null;
						this.aBooleanArray11[local540] = false;
					}
					anInt893 = 0;
					anInt921 = 0;
					anInt842 = 0;
					anInt993 = 0;
					anInt1020 = 0;
					this.method634();
				} else if (local74 == 3) {
					this.aString24 = "";
					this.aString25 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString24 = "Your account has been disabled.";
					this.aString25 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString24 = "Your account is already logged in.";
					this.aString25 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString24 = "RuneScape has been updated!";
					this.aString25 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString24 = "This world is full.";
					this.aString25 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString24 = "Unable to connect.";
					this.aString25 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString24 = "Login limit exceeded.";
					this.aString25 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString24 = "Unable to connect.";
					this.aString25 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString24 = "Login server rejected session.";
					this.aString25 = "Please try again.";
				} else if (local74 == 12) {
					this.aString24 = "You need a members account to login to this world.";
					this.aString25 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString24 = "Could not complete login.";
					this.aString25 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString24 = "The server is being updated.";
					this.aString25 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean237 = true;
					this.aClass3_Sub1_Sub3_8.anInt441 = 0;
					this.aClass3_Sub1_Sub3_9.anInt441 = 0;
					this.anInt885 = -1;
					this.anInt1017 = -1;
					this.anInt1018 = -1;
					this.anInt1019 = -1;
					this.anInt884 = 0;
					this.anInt886 = 0;
					this.anInt1003 = 0;
					this.anInt1053 = 0;
					this.aBoolean208 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString24 = "Login attempts exceeded.";
					this.aString25 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString24 = "You are standing in a members-only area.";
					this.aString25 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString24 = "Invalid loginserver requested";
					this.aString25 = "Please try using a different world.";
				} else if (local74 == 21) {
					local391 = this.aClass47_1.method522();
					for (@Pc(919) int local919 = local391 + 3; local919 >= 0; local919--) {
						this.aString24 = "You have only just left another world";
						this.aString25 = "Your profile will be transferred in: " + local919;
						this.method648(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(941) Exception local941) {
						}
					}
					this.method712(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString24 = "Malformed login packet.";
					this.aString25 = "Please try again.";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString24 = "Unexpected server response";
					this.aString25 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString24 = "No response from server";
					this.aString25 = "Please try using a different world.";
				} else if (this.anInt978 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(973) Exception local973) {
					}
					this.anInt978++;
					this.method712(arg0, arg1, arg2);
				} else {
					this.aString24 = "No response from loginserver";
					this.aString25 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1016) IOException local1016) {
			this.aString24 = "";
			this.aString25 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)Ljava/net/Socket;")
	public Socket method713(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method714(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) Class13 local7 = Class13.method194(arg0);
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray98.length && local7.anIntArray98[local9] != -1; local9++) {
				@Pc(23) Class13 local23 = Class13.method194(local7.anIntArray98[local9]);
				if (local23.anInt338 == 1) {
					this.method714(local23.anInt340);
				}
				local23.anInt364 = 0;
				local23.anInt345 = 0;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("12623, " + arg0 + ", " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method715(@OriginalArg(0) int arg0) {
		try {
			this.aClass3_Sub1_Sub2_Sub2_19 = new Class3_Sub1_Sub2_Sub2(this.aClass14_2, "titlebox", 0);
			this.aClass3_Sub1_Sub2_Sub2_20 = new Class3_Sub1_Sub2_Sub2(this.aClass14_2, "titlebutton", 0);
			this.aClass3_Sub1_Sub2_Sub2Array3 = new Class3_Sub1_Sub2_Sub2[12];
			@Pc(25) int local25 = 0;
			@Pc(29) boolean local29 = false;
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(36) Exception local36) {
			}
			@Pc(40) int local40;
			if (local25 == 0) {
				for (local40 = 0; local40 < 12; local40++) {
					this.aClass3_Sub1_Sub2_Sub2Array3[local40] = new Class3_Sub1_Sub2_Sub2(this.aClass14_2, "runes", local40);
				}
			} else {
				for (local40 = 0; local40 < 12; local40++) {
					this.aClass3_Sub1_Sub2_Sub2Array3[local40] = new Class3_Sub1_Sub2_Sub2(this.aClass14_2, "runes", (local40 & 0x3) + 12);
				}
			}
			this.aClass3_Sub1_Sub2_Sub4_4 = new Class3_Sub1_Sub2_Sub4(128, 265);
			this.aClass3_Sub1_Sub2_Sub4_5 = new Class3_Sub1_Sub2_Sub4(128, 265);
			for (local40 = 0; local40 < 33920; local40++) {
				this.aClass3_Sub1_Sub2_Sub4_4.anIntArray209[local40] = this.aClass42_6.anIntArray193[local40];
			}
			for (@Pc(115) int local115 = 0; local115 < 33920; local115++) {
				this.aClass3_Sub1_Sub2_Sub4_5.anIntArray209[local115] = this.aClass42_7.anIntArray193[local115];
			}
			this.anIntArray272 = new int[256];
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				this.anIntArray272[local137] = local137 * 262144;
			}
			for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
				this.anIntArray272[local152 + 64] = 1024 * local152 + 16711680;
			}
			for (@Pc(171) int local171 = 0; local171 < 64; local171++) {
				this.anIntArray272[local171 + 128] = 4 * local171 + 16776960;
			}
			for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
				this.anIntArray272[local190 + 192] = 16777215;
			}
			this.anIntArray273 = new int[256];
			for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
				this.anIntArray273[local209] = local209 * 1024;
			}
			for (@Pc(224) int local224 = 0; local224 < 64; local224++) {
				this.anIntArray273[local224 + 64] = 4 * local224 + 65280;
			}
			for (@Pc(243) int local243 = 0; local243 < 64; local243++) {
				this.anIntArray273[local243 + 128] = 262144 * local243 + 65535;
			}
			for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
				this.anIntArray273[local262 + 192] = 16777215;
			}
			this.anIntArray274 = new int[256];
			for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
				this.anIntArray274[local281] = local281 * 4;
			}
			for (@Pc(296) int local296 = 0; local296 < 64; local296++) {
				this.anIntArray274[local296 + 64] = 262144 * local296 + 255;
			}
			for (@Pc(315) int local315 = 0; local315 < 64; local315++) {
				this.anIntArray274[local315 + 128] = 1024 * local315 + 16711935;
			}
			for (@Pc(334) int local334 = 0; local334 < 64; local334++) {
				this.anIntArray274[local334 + 192] = 16777215;
			}
			this.anIntArray271 = new int[256];
			this.anIntArray230 = new int[32768];
			this.anIntArray231 = new int[32768];
			this.method612((byte) 2, (Class3_Sub1_Sub2_Sub2) null);
			this.anIntArray224 = new int[32768];
			this.anIntArray225 = new int[32768];
			this.method586(10, "Connecting to fileserver");
			if (!this.aBoolean238) {
				this.aBoolean217 = true;
				this.aBoolean238 = true;
				this.method585(this, 2);
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("38407, " + arg0 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!HZINZKXF;)V")
	private void method716(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class13 arg1) {
		try {
			if (!arg0) {
				this.method579();
			}
			@Pc(8) int local8 = arg1.anInt371;
			@Pc(64) int local64;
			if ((local8 < 1 || local8 > 100) && (local8 < 701 || local8 > 800)) {
				if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
					local64 = this.anInt1046;
					if (this.anInt1047 != 2) {
						local64 = 0;
					}
					if (local8 > 800) {
						local8 -= 701;
					} else {
						local8 -= 101;
					}
					if (local8 >= local64) {
						arg1.aString7 = "";
						arg1.anInt368 = 0;
					} else {
						if (this.anIntArray234[local8] == 0) {
							arg1.aString7 = "@red@Offline";
						} else if (this.anIntArray234[local8] < 200) {
							if (this.anIntArray234[local8] == anInt1031) {
								arg1.aString7 = "@gre@World-" + (this.anIntArray234[local8] - 9);
							} else {
								arg1.aString7 = "@yel@World-" + (this.anIntArray234[local8] - 9);
							}
						} else if (this.anIntArray234[local8] == anInt1031) {
							arg1.aString7 = "@gre@Classic" + (this.anIntArray234[local8] - 219);
						} else {
							arg1.aString7 = "@yel@Classic" + (this.anIntArray234[local8] - 219);
						}
						arg1.anInt368 = 1;
					}
				} else if (local8 == 203) {
					local64 = this.anInt1046;
					if (this.anInt1047 != 2) {
						local64 = 0;
					}
					arg1.anInt356 = local64 * 15 + 20;
					if (arg1.anInt356 <= arg1.anInt339) {
						arg1.anInt356 = arg1.anInt339 + 1;
					}
				} else if (local8 >= 401 && local8 <= 500) {
					local8 -= 401;
					if (local8 == 0 && this.anInt1047 == 0) {
						arg1.aString7 = "Loading ignore list";
						arg1.anInt368 = 0;
					} else if (local8 == 1 && this.anInt1047 == 0) {
						arg1.aString7 = "Please wait...";
						arg1.anInt368 = 0;
					} else {
						local64 = this.anInt1030;
						if (this.anInt1047 == 0) {
							local64 = 0;
						}
						if (local8 >= local64) {
							arg1.aString7 = "";
							arg1.anInt368 = 0;
						} else {
							arg1.aString7 = Class38.method439(Class38.method436(this.aLongArray3[local8]));
							arg1.anInt368 = 1;
						}
					}
				} else if (local8 == 503) {
					arg1.anInt356 = this.anInt1030 * 15 + 20;
					if (arg1.anInt356 <= arg1.anInt339) {
						arg1.anInt356 = arg1.anInt339 + 1;
					}
				} else if (local8 == 327) {
					arg1.anInt360 = 150;
					arg1.anInt361 = (int) (Math.sin((double) anInt1050 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean200) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(377) int local377 = this.anIntArray246[local64];
							if (local377 >= 0 && !Class34.aClass34Array1[local377].method350()) {
								return;
							}
						}
						this.aBoolean200 = false;
						@Pc(396) Class3_Sub1_Sub1_Sub1[] local396 = new Class3_Sub1_Sub1_Sub1[7];
						@Pc(398) int local398 = 0;
						for (@Pc(400) int local400 = 0; local400 < 7; local400++) {
							@Pc(407) int local407 = this.anIntArray246[local400];
							if (local407 >= 0) {
								local396[local398++] = Class34.aClass34Array1[local407].method351(201);
							}
						}
						@Pc(429) Class3_Sub1_Sub1_Sub1 local429 = new Class3_Sub1_Sub1_Sub1(local398, -39808, local396);
						for (@Pc(431) int local431 = 0; local431 < 5; local431++) {
							if (this.anIntArray232[local431] != 0) {
								local429.method47(anIntArrayArray23[local431][0], anIntArrayArray23[local431][this.anIntArray232[local431]]);
								if (local431 == 1) {
									local429.method47(anIntArray243[0], anIntArray243[this.anIntArray232[local431]]);
								}
							}
						}
						local429.method40();
						local429.method41(Class31.aClass31Array1[aClass3_Sub1_Sub1_Sub4_Sub1_1.anInt752].anIntArray126[0]);
						local429.method50(64, 850, -30, -50, -30, true);
						arg1.anInt346 = 5;
						arg1.anInt347 = 0;
						Class13.method191(local429);
					}
				} else if (local8 == 324) {
					if (this.aClass3_Sub1_Sub2_Sub4_11 == null) {
						this.aClass3_Sub1_Sub2_Sub4_11 = arg1.aClass3_Sub1_Sub2_Sub4_2;
						this.aClass3_Sub1_Sub2_Sub4_12 = arg1.aClass3_Sub1_Sub2_Sub4_1;
					}
					if (this.aBoolean229) {
						arg1.aClass3_Sub1_Sub2_Sub4_2 = this.aClass3_Sub1_Sub2_Sub4_12;
					} else {
						arg1.aClass3_Sub1_Sub2_Sub4_2 = this.aClass3_Sub1_Sub2_Sub4_11;
					}
				} else if (local8 == 325) {
					if (this.aClass3_Sub1_Sub2_Sub4_11 == null) {
						this.aClass3_Sub1_Sub2_Sub4_11 = arg1.aClass3_Sub1_Sub2_Sub4_2;
						this.aClass3_Sub1_Sub2_Sub4_12 = arg1.aClass3_Sub1_Sub2_Sub4_1;
					}
					if (this.aBoolean229) {
						arg1.aClass3_Sub1_Sub2_Sub4_2 = this.aClass3_Sub1_Sub2_Sub4_11;
					} else {
						arg1.aClass3_Sub1_Sub2_Sub4_2 = this.aClass3_Sub1_Sub2_Sub4_12;
					}
				} else if (local8 == 600) {
					arg1.aString7 = this.aString23;
					if (anInt1050 % 20 < 10) {
						arg1.aString7 = arg1.aString7 + "|";
					} else {
						arg1.aString7 = arg1.aString7 + " ";
					}
				} else {
					if (local8 == 620) {
						if (this.anInt857 < 1) {
							arg1.aString7 = "";
						} else if (this.aBoolean228) {
							arg1.anInt358 = 16711680;
							arg1.aString7 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt358 = 16777215;
							arg1.aString7 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(636) String local636;
					if (local8 == 660) {
						local64 = this.anInt1026 - this.anInt956;
						if (local64 <= 0) {
							local636 = "earlier today";
						} else if (local64 == 1) {
							local636 = "yesterday";
						} else {
							local636 = local64 + " days ago";
						}
						arg1.aString7 = "You last logged in @red@" + local636 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local8 == 661) {
						if (this.anInt977 == 0) {
							arg1.aString7 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt977 <= this.anInt1026) {
							arg1.aString7 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method717(this.anInt977, 622);
						} else {
							local64 = this.anInt1026 + 14 - this.anInt977;
							if (local64 <= 0) {
								local636 = "Earlier today";
							} else if (local64 == 1) {
								local636 = "Yesterday";
							} else {
								local636 = local64 + " days ago";
							}
							arg1.aString7 = local636 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method717(this.anInt977, 622) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local8 == 662) {
						@Pc(754) String local754;
						if (this.anInt961 == 0) {
							local754 = "@yel@0 unread messages";
						} else if (this.anInt961 == 1) {
							local754 = "@gre@1 unread message";
						} else {
							local754 = "@gre@" + this.anInt961 + " unread messages";
						}
						arg1.aString7 = "You have " + local754 + "\\nin your message centre.";
					}
					if (local8 == 663) {
						if (this.anInt1036 > 0 && this.anInt1036 <= this.anInt1026 + 10) {
							arg1.aString7 = "Last password change:\\n@gre@" + this.method717(this.anInt1036, 622);
						} else {
							arg1.aString7 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local8 == 664) {
						if (this.anInt824 == 0) {
							arg1.aString7 = "You have not yet set\\nany contact details.";
						}
						if (this.anInt824 == 1) {
							arg1.aString7 = "Contact Details Last Set:\\n@gre@" + this.method717(this.anInt954, 622);
						}
						if (this.anInt824 == 2) {
							arg1.aString7 = "You need to set\\nnew contact details.";
						}
					}
					if (local8 == 665) {
						if (this.anInt916 > 2 && !aBoolean242) {
							arg1.aString7 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt916 > 2) {
							arg1.aString7 = "\\n\\nYou have @gre@" + this.anInt916 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt916 > 0) {
							arg1.aString7 = "You have @gre@" + this.anInt916 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg1.aString7 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local8 == 667) {
						if (this.anInt916 > 2 && !aBoolean242) {
							arg1.aString7 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt916 > 0) {
							arg1.aString7 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg1.aString7 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local8 == 668) {
						if (this.anInt977 > this.anInt1026) {
							arg1.aString7 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg1.aString7 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local8 == 1 && this.anInt1047 == 0) {
				arg1.aString7 = "Loading friend list";
				arg1.anInt368 = 0;
			} else if (local8 == 1 && this.anInt1047 == 1) {
				arg1.aString7 = "Connecting to friendserver";
				arg1.anInt368 = 0;
			} else if (local8 == 2 && this.anInt1047 != 2) {
				arg1.aString7 = "Please wait...";
				arg1.anInt368 = 0;
			} else {
				local64 = this.anInt1046;
				if (this.anInt1047 != 2) {
					local64 = 0;
				}
				if (local8 > 700) {
					local8 -= 601;
				} else {
					local8--;
				}
				if (local8 >= local64) {
					arg1.aString7 = "";
					arg1.anInt368 = 0;
				} else {
					arg1.aString7 = this.aStringArray10[local8];
					arg1.anInt368 = 1;
				}
			}
		} catch (@Pc(944) RuntimeException local944) {
			signlink.reporterror("63987, " + arg0 + ", " + arg1 + ", " + local944.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private String method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 > this.anInt1026 + 10) {
				return "Unknown";
			}
			@Pc(18) long local18 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(20) Calendar local20 = Calendar.getInstance();
			local20.setTime(new Date(local18));
			@Pc(30) int local30 = local20.get(5);
			@Pc(34) int local34 = local20.get(2);
			@Pc(38) int local38 = local20.get(1);
			@Pc(89) String[] local89 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local30 + "-" + local89[local34] + "-" + local38;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("79077, " + arg0 + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method718() {
		try {
			try {
				if (this.aClass47_1 != null) {
					this.aClass47_1.method521();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass47_1 = null;
			this.aBoolean237 = false;
			this.anInt991 = 0;
			this.aString18 = "";
			this.aString19 = "";
			this.method624();
			this.aClass36_1.method380();
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass5Array1[local36].method64();
			}
			System.gc();
			this.method601();
			this.anInt897 = -1;
			this.anInt898 = -1;
			this.anInt974 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("17409, " + -81 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	private void method719(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(15) int local15;
			if (this.aClass42_14 != null) {
				this.aClass42_14.method467((byte) 6);
				Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
				local15 = 151;
				if (arg1 != null) {
					local15 -= 7;
				}
				this.aClass3_Sub1_Sub2_Sub1_3.method120(0, 257, arg0, local15);
				this.aClass3_Sub1_Sub2_Sub1_3.method120(16777215, 256, arg0, local15 - 1);
				local15 += 15;
				if (arg1 != null) {
					this.aClass3_Sub1_Sub2_Sub1_3.method120(0, 257, arg1, local15);
					this.aClass3_Sub1_Sub2_Sub1_3.method120(16777215, 256, arg1, local15 - 1);
				}
				this.aClass42_14.method468(4, 4, super.aGraphics2);
			} else if (super.aClass42_2 != null) {
				super.aClass42_2.method467((byte) 6);
				Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray216;
				local15 = 251;
				Class3_Sub1_Sub2.method554(233, 0, 50, 221, 300);
				Class3_Sub1_Sub2.method555(16777215, 221, 300, 50, 233);
				if (arg1 != null) {
					local15 -= 7;
				}
				this.aClass3_Sub1_Sub2_Sub1_3.method120(0, 383, arg0, local15);
				this.aClass3_Sub1_Sub2_Sub1_3.method120(16777215, 382, arg0, local15 - 1);
				local15 += 15;
				if (arg1 != null) {
					this.aClass3_Sub1_Sub2_Sub1_3.method120(0, 383, arg1, local15);
					this.aClass3_Sub1_Sub2_Sub1_3.method120(16777215, 382, arg1, local15 - 1);
				}
				super.aClass42_2.method468(0, 0, super.aGraphics2);
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("20204, " + 873 + ", " + arg0 + ", " + arg1 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method720() {
		try {
			@Pc(6) int local6 = 5;
			this.anIntArray247[8] = 0;
			@Pc(13) int local13 = 0;
			while (this.anIntArray247[8] == 0) {
				@Pc(17) String local17 = "Unknown problem";
				this.method586(20, "Connecting to web server");
				try {
					@Pc(39) DataInputStream local39 = this.method662("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 339);
					@Pc(46) Class3_Sub1_Sub3 local46 = new Class3_Sub1_Sub3((byte) -103, new byte[40]);
					local39.readFully(local46.aByteArray5, 0, 40);
					local39.close();
					for (@Pc(56) int local56 = 0; local56 < 9; local56++) {
						this.anIntArray247[local56] = local46.method279();
					}
					@Pc(71) int local71 = local46.method279();
					@Pc(73) int local73 = 1234;
					for (@Pc(75) int local75 = 0; local75 < 9; local75++) {
						local73 = (local73 << 1) + this.anIntArray247[local75];
					}
					if (local71 != local73) {
						local17 = "checksum problem";
						this.anIntArray247[8] = 0;
					}
				} catch (@Pc(102) EOFException local102) {
					local17 = "EOF problem";
					this.anIntArray247[8] = 0;
				} catch (@Pc(111) IOException local111) {
					local17 = "connection problem";
					this.anIntArray247[8] = 0;
				} catch (@Pc(120) Exception local120) {
					local17 = "logic problem";
					this.anIntArray247[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray247[8] == 0) {
					local13++;
					for (@Pc(138) int local138 = local6; local138 > 0; local138--) {
						if (local13 >= 10) {
							this.method586(10, "Game updated - please reload page");
							local138 = 10;
						} else {
							this.method586(10, local17 + " - Will retry in " + local138 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(172) Exception local172) {
						}
					}
					local6 *= 2;
					if (local6 > 60) {
						local6 = 60;
					}
					this.aBoolean219 = !this.aBoolean219;
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("98202, " + true + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method721() {
		try {
			while (true) {
				@Pc(10) Class3_Sub1_Sub4 local10 = this.aClass10_Sub1_1.method458();
				if (local10 == null) {
					return;
				}
				if (local10.anInt771 == 0) {
					Class3_Sub1_Sub1_Sub1.method31(local10.anInt773, this.anInt909, local10.aByteArray20);
					if ((this.aClass10_Sub1_1.method456(local10.anInt773) & 0x62) != 0) {
						this.aBoolean207 = true;
						if (this.anInt986 != -1 || this.anInt895 != -1) {
							this.aBoolean224 = true;
						}
					}
				}
				if (local10.anInt771 == 1 && local10.aByteArray20 != null) {
					Class18.method207(local10.aByteArray20);
				}
				if (local10.anInt771 == 2 && local10.anInt773 == this.anInt898 && local10.aByteArray20 != null) {
					this.method593(local10.aByteArray20, this.aBoolean210);
				}
				if (local10.anInt771 == 3 && this.anInt946 == 1) {
					for (@Pc(86) int local86 = 0; local86 < this.aByteArrayArray6.length; local86++) {
						if (this.anIntArray237[local86] == local10.anInt773) {
							this.aByteArrayArray6[local86] = local10.aByteArray20;
							if (local10.aByteArray20 == null) {
								this.anIntArray237[local86] = -1;
							}
							break;
						}
						if (this.anIntArray238[local86] == local10.anInt773) {
							this.aByteArrayArray5[local86] = local10.aByteArray20;
							if (local10.aByteArray20 == null) {
								this.anIntArray238[local86] = -1;
							}
							break;
						}
					}
				}
				if (local10.anInt771 == 93 && this.aClass10_Sub1_1.method453(local10.anInt773, this.anInt1045)) {
					Class8.method147(new Class3_Sub1_Sub3((byte) -103, local10.aByteArray20), this.aClass10_Sub1_1);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("21038, " + 92 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
	private void method722(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass3_Sub1_Sub2_Sub4_6.anIntArray209;
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
						this.aClass36_1.method415(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass36_1.method415(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass3_Sub1_Sub2_Sub4_6.method561((byte) 6);
			@Pc(153) int local153;
			for (@Pc(149) int local149 = 1; local149 < 103; local149++) {
				for (local153 = 1; local153 < 103; local153++) {
					if ((this.aByteArrayArrayArray8[arg0][local153][local149] & 0x18) == 0) {
						this.method623(local149, local36, local34, 656, arg0, local153);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local153][local149] & 0x8) != 0) {
						this.method623(local149, local36, local34, 656, arg0 + 1, local153);
					}
				}
			}
			if (this.aClass42_14 != null) {
				this.aClass42_14.method467((byte) 6);
				Class3_Sub1_Sub2_Sub3.anIntArray199 = this.anIntArray215;
			}
			this.anInt1037 = 0;
			for (local153 = 0; local153 < 104; local153++) {
				for (@Pc(227) int local227 = 0; local227 < 104; local227++) {
					@Pc(237) int local237 = this.aClass36_1.method409(this.anInt858, local153, local227);
					if (local237 != 0) {
						local237 = local237 >> 14 & 0x7FFF;
						@Pc(249) int local249 = Class26.method313(local237).anInt464;
						if (local249 >= 0) {
							@Pc(253) int local253 = local153;
							@Pc(255) int local255 = local227;
							if (local249 != 22 && local249 != 29 && local249 != 34 && local249 != 36 && local249 != 46 && local249 != 47 && local249 != 48) {
								@Pc(287) int[][] local287 = this.aClass5Array1[this.anInt858].anIntArrayArray5;
								for (@Pc(289) int local289 = 0; local289 < 10; local289++) {
									@Pc(296) int local296 = (int) (Math.random() * 4.0D);
									if (local296 == 0 && local253 > 0 && local253 > local153 - 3 && (local287[local253 - 1][local255] & 0x1280108) == 0) {
										local253--;
									}
									if (local296 == 1 && local253 < 103 && local253 < local153 + 3 && (local287[local253 + 1][local255] & 0x1280180) == 0) {
										local253++;
									}
									if (local296 == 2 && local255 > 0 && local255 > local227 - 3 && (local287[local253][local255 - 1] & 0x1280102) == 0) {
										local255--;
									}
									if (local296 == 3 && local255 < 103 && local255 < local227 + 3 && (local287[local253][local255 + 1] & 0x1280120) == 0) {
										local255++;
									}
								}
							}
							this.aClass3_Sub1_Sub2_Sub4Array4[this.anInt1037] = this.aClass3_Sub1_Sub2_Sub4Array7[local249];
							this.anIntArray268[this.anInt1037] = local253;
							this.anIntArray269[this.anInt1037] = local255;
							this.anInt1037++;
						}
					}
				}
			}
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("53061, " + -556 + ", " + arg0 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)Z")
	private boolean method723() {
		try {
			if (this.aClass47_1 == null) {
				return false;
			}
			@Pc(1314) String local1314;
			@Pc(227) int local227;
			try {
				@Pc(17) int local17 = this.aClass47_1.method523();
				if (local17 == 0) {
					return false;
				}
				if (this.anInt885 == -1) {
					this.aClass47_1.method524(this.aClass3_Sub1_Sub3_9.aByteArray5, 0, 1);
					this.anInt885 = this.aClass3_Sub1_Sub3_9.aByteArray5[0] & 0xFF;
					if (this.aClass15_2 != null) {
						this.anInt885 = this.anInt885 - this.aClass15_2.method203() & 0xFF;
					}
					this.anInt884 = Class11.anIntArray85[this.anInt885];
					local17--;
				}
				if (this.anInt884 == -1) {
					if (local17 <= 0) {
						return false;
					}
					this.aClass47_1.method524(this.aClass3_Sub1_Sub3_9.aByteArray5, 0, 1);
					this.anInt884 = this.aClass3_Sub1_Sub3_9.aByteArray5[0] & 0xFF;
					local17--;
				}
				if (this.anInt884 == -2) {
					if (local17 <= 1) {
						return false;
					}
					this.aClass47_1.method524(this.aClass3_Sub1_Sub3_9.aByteArray5, 0, 2);
					this.aClass3_Sub1_Sub3_9.anInt441 = 0;
					this.anInt884 = this.aClass3_Sub1_Sub3_9.method276();
					local17 -= 2;
				}
				if (local17 < this.anInt884) {
					return false;
				}
				this.aClass3_Sub1_Sub3_9.anInt441 = 0;
				this.aClass47_1.method524(this.aClass3_Sub1_Sub3_9.aByteArray5, 0, this.anInt884);
				this.anInt886 = 0;
				this.anInt1019 = this.anInt1018;
				this.anInt1018 = this.anInt1017;
				this.anInt1017 = this.anInt885;
				if (this.anInt885 == 46) {
					if (this.anInt922 == 12) {
						this.aBoolean207 = true;
					}
					this.anInt976 = this.aClass3_Sub1_Sub3_9.method277();
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 38) {
					this.method649(this.anInt884, this.aClass3_Sub1_Sub3_9);
					this.aBoolean227 = false;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 221) {
					this.aBoolean232 = false;
					this.anInt910 = 2;
					this.aString17 = "";
					this.aBoolean224 = true;
					this.anInt885 = -1;
					return true;
				}
				@Pc(222) int local222;
				@Pc(230) Class13 local230;
				if (this.anInt885 == 59) {
					local222 = this.aClass3_Sub1_Sub3_9.method276();
					local227 = this.aClass3_Sub1_Sub3_9.method305();
					local230 = Class13.method194(local222);
					if (local230.anInt348 != local227 || local227 == -1) {
						local230.anInt348 = local227;
						local230.anInt364 = 0;
						local230.anInt345 = 0;
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 170) {
					local222 = this.aClass3_Sub1_Sub3_9.method300();
					local227 = this.aClass3_Sub1_Sub3_9.method302();
					Class13.method194(local222).anInt346 = 1;
					Class13.method194(local222).anInt347 = local227;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 111) {
					this.aBoolean234 = true;
					this.anInt927 = this.aClass3_Sub1_Sub3_9.method274();
					this.anInt928 = this.aClass3_Sub1_Sub3_9.method274();
					this.anInt929 = this.aClass3_Sub1_Sub3_9.method276();
					this.anInt930 = this.aClass3_Sub1_Sub3_9.method274();
					this.anInt931 = this.aClass3_Sub1_Sub3_9.method274();
					if (this.anInt931 >= 100) {
						this.anInt835 = this.anInt927 * 128 + 64;
						this.anInt837 = this.anInt928 * 128 + 64;
						this.anInt836 = this.method629(this.anInt858, this.anInt837, this.anInt835) - this.anInt929;
					}
					this.anInt885 = -1;
					return true;
				}
				@Pc(367) int local367;
				if (this.anInt885 == 67) {
					local222 = this.aClass3_Sub1_Sub3_9.method302();
					local227 = this.aClass3_Sub1_Sub3_9.method304();
					local367 = this.aClass3_Sub1_Sub3_9.method277();
					@Pc(370) Class13 local370 = Class13.method194(local222);
					local370.anInt372 = local367;
					local370.anInt367 = local227;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 193) {
					this.anInt843 = this.aClass3_Sub1_Sub3_9.method293();
					this.anInt1035 = this.aClass3_Sub1_Sub3_9.method276();
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 176) {
					this.anInt1047 = this.aClass3_Sub1_Sub3_9.method274();
					this.aBoolean207 = true;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 118) {
					for (local222 = 0; local222 < this.anIntArray221.length; local222++) {
						if (this.anIntArray221[local222] != this.anIntArray275[local222]) {
							this.anIntArray221[local222] = this.anIntArray275[local222];
							this.method661(local222);
							this.aBoolean207 = true;
						}
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 163) {
					local222 = this.aClass3_Sub1_Sub3_9.method302();
					@Pc(475) byte local475 = this.aClass3_Sub1_Sub3_9.method295(984);
					this.anIntArray275[local222] = local475;
					if (this.anIntArray221[local222] != local475) {
						this.anIntArray221[local222] = local475;
						this.method661(local222);
						this.aBoolean207 = true;
						if (this.anInt895 != -1) {
							this.aBoolean224 = true;
						}
					}
					this.anInt885 = -1;
					return true;
				}
				@Pc(527) int local527;
				@Pc(531) int local531;
				@Pc(552) int local552;
				@Pc(529) boolean local529;
				@Pc(598) String local598;
				@Pc(519) long local519;
				if (this.anInt885 == 119) {
					local519 = this.aClass3_Sub1_Sub3_9.method280();
					local367 = this.aClass3_Sub1_Sub3_9.method279();
					local527 = this.aClass3_Sub1_Sub3_9.method274();
					local529 = false;
					for (local531 = 0; local531 < 100; local531++) {
						if (this.anIntArray258[local531] == local367) {
							local529 = true;
							break;
						}
					}
					if (local527 <= 1) {
						for (local552 = 0; local552 < this.anInt1030; local552++) {
							if (this.aLongArray3[local552] == local519) {
								local529 = true;
								break;
							}
						}
					}
					if (!local529 && this.anInt947 == 0) {
						try {
							this.anIntArray258[this.anInt852] = local367;
							this.anInt852 = (this.anInt852 + 1) % 100;
							local598 = Class22.method255(this.anInt884 - 13, this.aClass3_Sub1_Sub3_9);
							if (local527 != 3) {
								local598 = Class20.method227(this.anInt983, local598);
							}
							if (local527 == 2 || local527 == 3) {
								this.method681("@cr2@" + Class38.method439(Class38.method436(local519)), local598, 7);
							} else if (local527 == 1) {
								this.method681("@cr1@" + Class38.method439(Class38.method436(local519)), local598, 7);
							} else {
								this.method681(Class38.method439(Class38.method436(local519)), local598, 3);
							}
						} catch (@Pc(663) Exception local663) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 41) {
					this.method708(this.aClass3_Sub1_Sub3_9, this.anInt884);
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 227) {
					this.anInt923 = this.aClass3_Sub1_Sub3_9.method307();
					this.anInt1036 = this.aClass3_Sub1_Sub3_9.method301();
					this.anInt1026 = this.aClass3_Sub1_Sub3_9.method301();
					this.anInt840 = this.aClass3_Sub1_Sub3_9.method300();
					this.anInt977 = this.aClass3_Sub1_Sub3_9.method300();
					this.anInt956 = this.aClass3_Sub1_Sub3_9.method300();
					this.anInt1027 = this.aClass3_Sub1_Sub3_9.method276();
					this.anInt824 = this.aClass3_Sub1_Sub3_9.method294(this.anInt851);
					this.anInt961 = this.aClass3_Sub1_Sub3_9.method302();
					this.anInt954 = this.aClass3_Sub1_Sub3_9.method302();
					this.anInt916 = this.aClass3_Sub1_Sub3_9.method276();
					signlink.dnslookup(Class38.method438(this.anInt923));
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 212) {
					local222 = this.aClass3_Sub1_Sub3_9.method276();
					this.method714(local222);
					if (this.anInt1021 != -1) {
						this.method695(this.anInt1021);
						this.anInt1021 = -1;
						this.aBoolean207 = true;
						this.aBoolean226 = true;
					}
					if (this.anInt914 != -1) {
						this.method695(this.anInt914);
						this.anInt914 = -1;
						this.aBoolean221 = true;
					}
					if (this.anInt1033 != -1) {
						this.method695(this.anInt1033);
						this.anInt1033 = -1;
					}
					if (this.anInt971 != -1) {
						this.method695(this.anInt971);
						this.anInt971 = -1;
					}
					if (this.anInt986 != local222) {
						this.method695(this.anInt986);
						this.anInt986 = local222;
					}
					this.aBoolean213 = false;
					this.aBoolean224 = true;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 28) {
					local222 = this.aClass3_Sub1_Sub3_9.method302();
					local227 = this.aClass3_Sub1_Sub3_9.method301();
					this.method714(local222);
					if (local227 != -1) {
						this.method714(local227);
					}
					if (this.anInt971 != -1) {
						this.method695(this.anInt971);
						this.anInt971 = -1;
					}
					if (this.anInt1021 != -1) {
						this.method695(this.anInt1021);
						this.anInt1021 = -1;
					}
					if (this.anInt986 != -1) {
						this.method695(this.anInt986);
						this.anInt986 = -1;
					}
					if (this.anInt914 != local222) {
						this.method695(this.anInt914);
						this.anInt914 = local222;
					}
					if (this.anInt1033 != local222) {
						this.method695(this.anInt1033);
						this.anInt1033 = local227;
					}
					this.anInt910 = 0;
					this.aBoolean213 = false;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 190) {
					local222 = this.aClass3_Sub1_Sub3_9.method305();
					if (local222 >= 0) {
						this.method714(local222);
					}
					if (local222 != this.anInt826) {
						this.method695(this.anInt826);
						this.anInt826 = local222;
					}
					this.anInt885 = -1;
					return true;
				}
				@Pc(1007) int local1007;
				@Pc(1142) int local1142;
				if (this.anInt885 == 23) {
					local519 = this.aClass3_Sub1_Sub3_9.method280();
					local367 = this.aClass3_Sub1_Sub3_9.method274();
					@Pc(1005) String local1005 = Class38.method439(Class38.method436(local519));
					for (local1007 = 0; local1007 < this.anInt1046; local1007++) {
						if (local519 == this.aLongArray4[local1007]) {
							if (this.anIntArray234[local1007] != local367) {
								this.anIntArray234[local1007] = local367;
								this.aBoolean207 = true;
								if (local367 > 0) {
									this.method681("", local1005 + " has logged in.", 5);
								}
								if (local367 == 0) {
									this.method681("", local1005 + " has logged out.", 5);
								}
							}
							local1005 = null;
							break;
						}
					}
					if (local1005 != null && this.anInt1046 < 200) {
						this.aLongArray4[this.anInt1046] = local519;
						this.aStringArray10[this.anInt1046] = local1005;
						this.anIntArray234[this.anInt1046] = local367;
						this.anInt1046++;
						this.aBoolean207 = true;
					}
					@Pc(1103) boolean local1103 = false;
					while (!local1103) {
						local1103 = true;
						for (local552 = 0; local552 < this.anInt1046 - 1; local552++) {
							if (this.anIntArray234[local552] != anInt1031 && this.anIntArray234[local552 + 1] == anInt1031 || this.anIntArray234[local552] == 0 && this.anIntArray234[local552 + 1] != 0) {
								local1142 = this.anIntArray234[local552];
								this.anIntArray234[local552] = this.anIntArray234[local552 + 1];
								this.anIntArray234[local552 + 1] = local1142;
								@Pc(1164) String local1164 = this.aStringArray10[local552];
								this.aStringArray10[local552] = this.aStringArray10[local552 + 1];
								this.aStringArray10[local552 + 1] = local1164;
								@Pc(1186) long local1186 = this.aLongArray4[local552];
								this.aLongArray4[local552] = this.aLongArray4[local552 + 1];
								this.aLongArray4[local552 + 1] = local1186;
								this.aBoolean207 = true;
								local1103 = false;
							}
						}
					}
					this.anInt885 = -1;
					return true;
				}
				@Pc(1236) Class13 local1236;
				if (this.anInt885 == 229) {
					this.aBoolean207 = true;
					local222 = this.aClass3_Sub1_Sub3_9.method276();
					local1236 = Class13.method194(local222);
					while (this.aClass3_Sub1_Sub3_9.anInt441 < this.anInt884) {
						local367 = this.aClass3_Sub1_Sub3_9.method288();
						local527 = this.aClass3_Sub1_Sub3_9.method276();
						local1007 = this.aClass3_Sub1_Sub3_9.method274();
						if (local1007 == 255) {
							local1007 = this.aClass3_Sub1_Sub3_9.method279();
						}
						if (local367 >= 0 && local367 < local1236.anIntArray97.length) {
							local1236.anIntArray97[local367] = local527;
							local1236.anIntArray96[local367] = local1007;
						}
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 216) {
					if (this.anInt922 == 12) {
						this.aBoolean207 = true;
					}
					this.anInt827 = this.aClass3_Sub1_Sub3_9.method274();
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 76) {
					local1314 = this.aClass3_Sub1_Sub3_9.method281();
					local227 = this.aClass3_Sub1_Sub3_9.method294(this.anInt851);
					local367 = this.aClass3_Sub1_Sub3_9.method274();
					if (local227 >= 1 && local227 <= 5) {
						if (local1314.equalsIgnoreCase("null")) {
							local1314 = null;
						}
						this.aStringArray12[local227 - 1] = local1314;
						this.aBooleanArray11[local227 - 1] = local367 == 0;
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 52) {
					local222 = this.aClass3_Sub1_Sub3_9.method274();
					local227 = this.aClass3_Sub1_Sub3_9.method274();
					local367 = this.aClass3_Sub1_Sub3_9.method274();
					local527 = this.aClass3_Sub1_Sub3_9.method274();
					this.aBooleanArray12[local222] = true;
					this.anIntArray244[local222] = local227;
					this.anIntArray239[local222] = local367;
					this.anIntArray259[local222] = local527;
					this.anIntArray250[local222] = 0;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 5) {
					local222 = this.aClass3_Sub1_Sub3_9.method302();
					Class13.method194(local222).anInt346 = 3;
					if (aClass3_Sub1_Sub1_Sub4_Sub1_1.aClass7_1 == null) {
						Class13.method194(local222).anInt347 = (aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray82[0] << 25) + (aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray82[4] << 20) + (aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray83[0] << 15) + (aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray83[8] << 10) + (aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray83[11] << 5) + aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray83[1];
					} else {
						Class13.method194(local222).anInt347 = (int) (aClass3_Sub1_Sub1_Sub4_Sub1_1.aClass7_1.aLong10 + 305419896L);
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 153) {
					this.anInt972 = this.aClass3_Sub1_Sub3_9.method294(this.anInt851);
					this.anInt973 = this.aClass3_Sub1_Sub3_9.method274();
					while (this.aClass3_Sub1_Sub3_9.anInt441 < this.anInt884) {
						local222 = this.aClass3_Sub1_Sub3_9.method274();
						this.method703(this.aClass3_Sub1_Sub3_9, local222);
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 11) {
					this.anInt998 = this.aClass3_Sub1_Sub3_9.method274();
					if (this.anInt998 == this.anInt922) {
						if (this.anInt998 == 3) {
							this.anInt922 = 1;
						} else {
							this.anInt922 = 3;
						}
						this.aBoolean207 = true;
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 162) {
					local222 = this.aClass3_Sub1_Sub3_9.method276();
					this.method714(local222);
					if (this.anInt1021 != -1) {
						this.method695(this.anInt1021);
						this.anInt1021 = -1;
						this.aBoolean207 = true;
						this.aBoolean226 = true;
					}
					if (this.anInt986 != -1) {
						this.method695(this.anInt986);
						this.anInt986 = -1;
						this.aBoolean224 = true;
					}
					if (this.anInt914 != -1) {
						this.method695(this.anInt914);
						this.anInt914 = -1;
						this.aBoolean221 = true;
					}
					if (this.anInt1033 != -1) {
						this.method695(this.anInt1033);
						this.anInt1033 = -1;
					}
					if (this.anInt971 != local222) {
						this.method695(this.anInt971);
						this.anInt971 = local222;
					}
					if (this.anInt910 != 0) {
						this.anInt910 = 0;
						this.aBoolean224 = true;
					}
					this.aBoolean213 = false;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 233) {
					this.aBoolean234 = false;
					for (local222 = 0; local222 < 5; local222++) {
						this.aBooleanArray12[local222] = false;
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 135) {
					this.anInt917 = 0;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 49) {
					local222 = this.aClass3_Sub1_Sub3_9.method302();
					local227 = this.aClass3_Sub1_Sub3_9.method276();
					if (this.anInt986 != -1) {
						this.method695(this.anInt986);
						this.anInt986 = -1;
						this.aBoolean224 = true;
					}
					if (this.anInt914 != -1) {
						this.method695(this.anInt914);
						this.anInt914 = -1;
						this.aBoolean221 = true;
					}
					if (this.anInt1033 != -1) {
						this.method695(this.anInt1033);
						this.anInt1033 = -1;
					}
					if (this.anInt971 != local227) {
						this.method695(this.anInt971);
						this.anInt971 = local227;
					}
					if (this.anInt1021 != local222) {
						this.method695(this.anInt1021);
						this.anInt1021 = local222;
					}
					if (this.anInt910 != 0) {
						this.anInt910 = 0;
						this.aBoolean224 = true;
					}
					this.aBoolean207 = true;
					this.aBoolean226 = true;
					this.aBoolean213 = false;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 102) {
					local222 = this.aClass3_Sub1_Sub3_9.method300();
					local1236 = Class13.method194(local222);
					for (local367 = 0; local367 < local1236.anIntArray97.length; local367++) {
						local1236.anIntArray97[local367] = -1;
						local1236.anIntArray97[local367] = 0;
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 240) {
					this.anInt973 = this.aClass3_Sub1_Sub3_9.method274();
					this.anInt972 = this.aClass3_Sub1_Sub3_9.method293();
					for (local222 = this.anInt972; local222 < this.anInt972 + 8; local222++) {
						for (local227 = this.anInt973; local227 < this.anInt973 + 8; local227++) {
							if (this.aClass27ArrayArrayArray1[this.anInt858][local222][local227] != null) {
								this.aClass27ArrayArrayArray1[this.anInt858][local222][local227] = null;
								this.method694(local222, local227);
							}
						}
					}
					for (@Pc(1901) Class3_Sub3 local1901 = (Class3_Sub3) this.aClass27_11.method327(); local1901 != null; local1901 = (Class3_Sub3) this.aClass27_11.method329(this.anInt1016)) {
						if (local1901.anInt667 >= this.anInt972 && local1901.anInt667 < this.anInt972 + 8 && local1901.anInt668 >= this.anInt973 && local1901.anInt668 < this.anInt973 + 8 && local1901.anInt665 == this.anInt858) {
							local1901.anInt670 = 0;
						}
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 151) {
					local1314 = this.aClass3_Sub1_Sub3_9.method281();
					@Pc(1971) long local1971;
					@Pc(1968) String local1968;
					if (local1314.endsWith(":tradereq:")) {
						local1968 = local1314.substring(0, local1314.indexOf(":"));
						local1971 = Class38.method435(local1968);
						local529 = false;
						for (local531 = 0; local531 < this.anInt1030; local531++) {
							if (this.aLongArray3[local531] == local1971) {
								local529 = true;
								break;
							}
						}
						if (!local529 && this.anInt947 == 0) {
							this.method681(local1968, "wishes to trade with you.", 4);
						}
					} else if (local1314.endsWith(":duelreq:")) {
						local1968 = local1314.substring(0, local1314.indexOf(":"));
						local1971 = Class38.method435(local1968);
						local529 = false;
						for (local531 = 0; local531 < this.anInt1030; local531++) {
							if (this.aLongArray3[local531] == local1971) {
								local529 = true;
								break;
							}
						}
						if (!local529 && this.anInt947 == 0) {
							this.method681(local1968, "wishes to duel with you.", 8);
						}
					} else if (local1314.endsWith(":chalreq:")) {
						local1968 = local1314.substring(0, local1314.indexOf(":"));
						local1971 = Class38.method435(local1968);
						local529 = false;
						for (local531 = 0; local531 < this.anInt1030; local531++) {
							if (this.aLongArray3[local531] == local1971) {
								local529 = true;
								break;
							}
						}
						if (!local529 && this.anInt947 == 0) {
							local598 = local1314.substring(local1314.indexOf(":") + 1, local1314.length() - 9);
							this.method681(local1968, local598, 8);
						}
					} else {
						this.method681("", local1314, 0);
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 33) {
					for (local222 = 0; local222 < this.aClass3_Sub1_Sub1_Sub4_Sub1Array1.length; local222++) {
						if (this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local222] != null) {
							this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local222].anInt743 = -1;
						}
					}
					for (local227 = 0; local227 < this.aClass3_Sub1_Sub1_Sub4_Sub2Array1.length; local227++) {
						if (this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local227] != null) {
							this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local227].anInt743 = -1;
						}
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 223) {
					this.aBoolean207 = true;
					local222 = this.aClass3_Sub1_Sub3_9.method276();
					local1236 = Class13.method194(local222);
					local367 = this.aClass3_Sub1_Sub3_9.method276();
					for (local527 = 0; local527 < local367; local527++) {
						local1236.anIntArray97[local527] = this.aClass3_Sub1_Sub3_9.method300();
						local1007 = this.aClass3_Sub1_Sub3_9.method293();
						if (local1007 == 255) {
							local1007 = this.aClass3_Sub1_Sub3_9.method279();
						}
						local1236.anIntArray96[local527] = local1007;
					}
					for (local1007 = local367; local1007 < local1236.anIntArray97.length; local1007++) {
						local1236.anIntArray97[local1007] = 0;
						local1236.anIntArray96[local1007] = 0;
					}
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 == 83) {
					local222 = this.aClass3_Sub1_Sub3_9.method300();
					this.method714(local222);
					if (this.anInt986 != -1) {
						this.method695(this.anInt986);
						this.anInt986 = -1;
						this.aBoolean224 = true;
					}
					if (this.anInt914 != -1) {
						this.method695(this.anInt914);
						this.anInt914 = -1;
						this.aBoolean221 = true;
					}
					if (this.anInt1033 != -1) {
						this.method695(this.anInt1033);
						this.anInt1033 = -1;
					}
					if (this.anInt971 != -1) {
						this.method695(this.anInt971);
						this.anInt971 = -1;
					}
					if (this.anInt1021 != local222) {
						this.method695(this.anInt1021);
						this.anInt1021 = local222;
					}
					if (this.anInt910 != 0) {
						this.anInt910 = 0;
						this.aBoolean224 = true;
					}
					this.aBoolean207 = true;
					this.aBoolean226 = true;
					this.aBoolean213 = false;
					this.anInt885 = -1;
					return true;
				}
				if (this.anInt885 != 9 && this.anInt885 != 99) {
					if (this.anInt885 == 60) {
						this.anInt973 = this.aClass3_Sub1_Sub3_9.method274();
						this.anInt972 = this.aClass3_Sub1_Sub3_9.method294(this.anInt851);
						this.anInt885 = -1;
						return true;
					}
					if (this.anInt885 == 93) {
						local222 = this.aClass3_Sub1_Sub3_9.method301();
						local227 = this.aClass3_Sub1_Sub3_9.method300();
						local230 = Class13.method194(local227);
						if (local230 != null && local230.anInt338 == 0) {
							if (local222 < 0) {
								local222 = 0;
							}
							if (local222 > local230.anInt356 - local230.anInt339) {
								local222 = local230.anInt356 - local230.anInt339;
							}
							local230.anInt344 = local222;
						}
						this.anInt885 = -1;
						return true;
					}
					if (this.anInt885 == 131) {
						this.anInt1000 = this.aClass3_Sub1_Sub3_9.method274();
						if (this.anInt1000 == 1) {
							this.anInt841 = this.aClass3_Sub1_Sub3_9.method276();
						}
						if (this.anInt1000 >= 2 && this.anInt1000 <= 6) {
							if (this.anInt1000 == 2) {
								this.anInt907 = 64;
								this.anInt908 = 64;
							}
							if (this.anInt1000 == 3) {
								this.anInt907 = 0;
								this.anInt908 = 64;
							}
							if (this.anInt1000 == 4) {
								this.anInt907 = 128;
								this.anInt908 = 64;
							}
							if (this.anInt1000 == 5) {
								this.anInt907 = 64;
								this.anInt908 = 0;
							}
							if (this.anInt1000 == 6) {
								this.anInt907 = 64;
								this.anInt908 = 128;
							}
							this.anInt1000 = 2;
							this.anInt904 = this.aClass3_Sub1_Sub3_9.method276();
							this.anInt905 = this.aClass3_Sub1_Sub3_9.method276();
							this.anInt906 = this.aClass3_Sub1_Sub3_9.method274();
						}
						if (this.anInt1000 == 10) {
							this.anInt866 = this.aClass3_Sub1_Sub3_9.method276();
						}
						this.anInt885 = -1;
						return true;
					}
					if (this.anInt885 == 175) {
						local1314 = this.aClass3_Sub1_Sub3_9.method281();
						local227 = this.aClass3_Sub1_Sub3_9.method300();
						Class13.method194(local227).aString7 = local1314;
						@Pc(3432) int local3432 = this.anIntArray235[this.anInt922];
						if (Class13.method194(local227).anInt357 == local3432) {
							this.aBoolean207 = true;
						}
						this.anInt885 = -1;
						return true;
					}
					if (this.anInt885 == 186) {
						this.aBoolean207 = true;
						local222 = this.aClass3_Sub1_Sub3_9.method294(this.anInt851);
						local227 = this.aClass3_Sub1_Sub3_9.method308();
						local367 = this.aClass3_Sub1_Sub3_9.method274();
						this.anIntArray219[local222] = local227;
						this.anIntArray253[local222] = local367;
						this.anIntArray270[local222] = 1;
						for (local527 = 0; local527 < 98; local527++) {
							if (local227 >= anIntArray242[local527]) {
								this.anIntArray270[local222] = local527 + 2;
							}
						}
						this.anInt885 = -1;
						return true;
					}
					if (this.anInt885 == 35) {
						this.anInt1003 = this.aClass3_Sub1_Sub3_9.method302() * 30;
						this.anInt885 = -1;
						return true;
					}
					if (this.anInt885 == 192) {
						this.aBoolean234 = true;
						this.anInt876 = this.aClass3_Sub1_Sub3_9.method274();
						this.anInt877 = this.aClass3_Sub1_Sub3_9.method274();
						this.anInt878 = this.aClass3_Sub1_Sub3_9.method276();
						this.anInt879 = this.aClass3_Sub1_Sub3_9.method274();
						this.anInt880 = this.aClass3_Sub1_Sub3_9.method274();
						if (this.anInt880 >= 100) {
							local222 = this.anInt876 * 128 + 64;
							local227 = this.anInt877 * 128 + 64;
							local367 = this.method629(this.anInt858, local227, local222) - this.anInt878;
							local527 = local222 - this.anInt835;
							local1007 = local367 - this.anInt836;
							local531 = local227 - this.anInt837;
							local552 = (int) Math.sqrt((double) (local527 * local527 + local531 * local531));
							this.anInt838 = (int) (Math.atan2((double) local1007, (double) local552) * 325.949D) & 0x7FF;
							this.anInt839 = (int) (Math.atan2((double) local527, (double) local531) * -325.949D) & 0x7FF;
							if (this.anInt838 < 128) {
								this.anInt838 = 128;
							}
							if (this.anInt838 > 383) {
								this.anInt838 = 383;
							}
						}
						this.anInt885 = -1;
						return true;
					}
					if (this.anInt885 != 10 && this.anInt885 != 42 && this.anInt885 != 200 && this.anInt885 != 116 && this.anInt885 != 75 && this.anInt885 != 238 && this.anInt885 != 203 && this.anInt885 != 150 && this.anInt885 != 255 && this.anInt885 != 2 && this.anInt885 != 241) {
						if (this.anInt885 == 132) {
							local222 = this.aClass3_Sub1_Sub3_9.method276();
							local227 = this.aClass3_Sub1_Sub3_9.method274();
							local367 = this.aClass3_Sub1_Sub3_9.method276();
							if (this.aBoolean220 && !aBoolean243 && this.anInt1007 < 50) {
								this.anIntArray218[this.anInt1007] = local222;
								this.anIntArray257[this.anInt1007] = local227;
								this.anIntArray223[this.anInt1007] = local367 + Class19.anIntArray110[local222];
								this.anInt1007++;
							}
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 97) {
							this.anInt922 = this.aClass3_Sub1_Sub3_9.method274();
							this.aBoolean207 = true;
							this.aBoolean226 = true;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 13) {
							local222 = this.aClass3_Sub1_Sub3_9.method303();
							if (local222 != this.anInt895) {
								this.method695(this.anInt895);
								this.anInt895 = local222;
							}
							this.aBoolean224 = true;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 107) {
							local222 = this.aClass3_Sub1_Sub3_9.method301();
							local227 = this.aClass3_Sub1_Sub3_9.method302();
							local367 = local227 >> 10 & 0x1F;
							local527 = local227 >> 5 & 0x1F;
							local1007 = local227 & 0x1F;
							Class13.method194(local222).anInt358 = (local367 << 19) + (local527 << 11) + (local1007 << 3);
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 195) {
							this.method718();
							this.anInt885 = -1;
							return false;
						}
						if (this.anInt885 == 204) {
							local222 = this.aClass3_Sub1_Sub3_9.method300();
							local227 = this.aClass3_Sub1_Sub3_9.method300();
							local367 = this.aClass3_Sub1_Sub3_9.method301();
							Class13.method194(local367).anInt342 = (local222 << 16) + local227;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 51) {
							@Pc(3920) boolean local3920 = this.aClass3_Sub1_Sub3_9.method293() == 1;
							local227 = this.aClass3_Sub1_Sub3_9.method301();
							Class13.method194(local227).aBoolean82 = local3920;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 149) {
							local222 = this.aClass3_Sub1_Sub3_9.method302();
							local227 = this.aClass3_Sub1_Sub3_9.method301();
							Class13.method194(local227).anInt346 = 2;
							Class13.method194(local227).anInt347 = local222;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 81) {
							local222 = this.aClass3_Sub1_Sub3_9.method301();
							if (local222 == 65535) {
								local222 = -1;
							}
							if (local222 != this.anInt897 && this.aBoolean209 && !aBoolean243 && this.anInt974 == 0) {
								this.anInt898 = local222;
								this.aBoolean210 = true;
								this.aClass10_Sub1_1.method464(2, this.anInt898);
							}
							this.anInt897 = local222;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 165) {
							local222 = this.aClass3_Sub1_Sub3_9.method278();
							local227 = this.aClass3_Sub1_Sub3_9.method276();
							if (this.aBoolean209 && !aBoolean243) {
								this.anInt898 = local227;
								this.aBoolean210 = false;
								this.aClass10_Sub1_1.method464(2, this.anInt898);
								this.anInt974 = local222;
							}
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 214) {
							local222 = this.aClass3_Sub1_Sub3_9.method301();
							local227 = this.aClass3_Sub1_Sub3_9.method276();
							local367 = this.aClass3_Sub1_Sub3_9.method301();
							if (local222 == 65535) {
								Class13.method194(local227).anInt346 = 0;
								this.anInt885 = -1;
								return true;
							}
							@Pc(4077) Class12 local4077 = Class12.method179(local222);
							Class13.method194(local227).anInt346 = 4;
							Class13.method194(local227).anInt347 = local222;
							Class13.method194(local227).anInt360 = local4077.anInt306;
							Class13.method194(local227).anInt361 = local4077.anInt314;
							Class13.method194(local227).anInt359 = local4077.anInt331 * 100 / local367;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 62) {
							this.anInt881 = this.aClass3_Sub1_Sub3_9.method274();
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 199) {
							local222 = this.aClass3_Sub1_Sub3_9.method274();
							local227 = this.aClass3_Sub1_Sub3_9.method300();
							if (local227 == 65535) {
								local227 = -1;
							}
							if (this.anIntArray235[local222] != local227) {
								this.method695(this.anIntArray235[local222]);
								this.anIntArray235[local222] = local227;
							}
							this.aBoolean207 = true;
							this.aBoolean226 = true;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 64) {
							this.aBoolean232 = false;
							this.anInt910 = 1;
							this.aString17 = "";
							this.aBoolean224 = true;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 245) {
							this.anInt935 = this.aClass3_Sub1_Sub3_9.method274();
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 1) {
							this.anInt925 = this.aClass3_Sub1_Sub3_9.method274();
							this.anInt913 = this.aClass3_Sub1_Sub3_9.method274();
							this.anInt903 = this.aClass3_Sub1_Sub3_9.method274();
							this.aBoolean241 = true;
							this.aBoolean224 = true;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 27) {
							local222 = this.aClass3_Sub1_Sub3_9.method302();
							local227 = this.aClass3_Sub1_Sub3_9.method301();
							local367 = this.aClass3_Sub1_Sub3_9.method301();
							local527 = this.aClass3_Sub1_Sub3_9.method302();
							Class13.method194(local527).anInt360 = local227;
							Class13.method194(local527).anInt361 = local367;
							Class13.method194(local527).anInt359 = local222;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 196) {
							this.anInt1030 = this.anInt884 / 8;
							for (local222 = 0; local222 < this.anInt1030; local222++) {
								this.aLongArray3[local222] = this.aClass3_Sub1_Sub3_9.method280();
							}
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 8) {
							if (this.anInt1021 != -1) {
								this.method695(this.anInt1021);
								this.anInt1021 = -1;
								this.aBoolean207 = true;
								this.aBoolean226 = true;
							}
							if (this.anInt986 != -1) {
								this.method695(this.anInt986);
								this.anInt986 = -1;
								this.aBoolean224 = true;
							}
							if (this.anInt914 != -1) {
								this.method695(this.anInt914);
								this.anInt914 = -1;
								this.aBoolean221 = true;
							}
							if (this.anInt1033 != -1) {
								this.method695(this.anInt1033);
								this.anInt1033 = -1;
							}
							if (this.anInt971 != -1) {
								this.method695(this.anInt971);
								this.anInt971 = -1;
							}
							if (this.anInt910 != 0) {
								this.anInt910 = 0;
								this.aBoolean224 = true;
							}
							this.aBoolean213 = false;
							this.anInt885 = -1;
							return true;
						}
						if (this.anInt885 == 56) {
							local222 = this.aClass3_Sub1_Sub3_9.method308();
							local227 = this.aClass3_Sub1_Sub3_9.method301();
							this.anIntArray275[local227] = local222;
							if (this.anIntArray221[local227] != local222) {
								this.anIntArray221[local227] = local222;
								this.method661(local227);
								this.aBoolean207 = true;
								if (this.anInt895 != -1) {
									this.aBoolean224 = true;
								}
							}
							this.anInt885 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt885 + "," + this.anInt884 + " - " + this.anInt1018 + "," + this.anInt1019);
						this.method718();
						return true;
					}
					this.method703(this.aClass3_Sub1_Sub3_9, this.anInt885);
					this.anInt885 = -1;
					return true;
				}
				local222 = this.anInt819;
				local227 = this.anInt820;
				if (this.anInt885 == 9) {
					local227 = this.aClass3_Sub1_Sub3_9.method300();
					local222 = this.aClass3_Sub1_Sub3_9.method301();
					this.aBoolean212 = false;
				}
				if (this.anInt885 == 99) {
					local227 = this.aClass3_Sub1_Sub3_9.method300();
					local222 = this.aClass3_Sub1_Sub3_9.method302();
					this.aClass3_Sub1_Sub3_9.method284();
					local367 = 0;
					while (true) {
						if (local367 >= 4) {
							this.aClass3_Sub1_Sub3_9.method286(this.anInt1052);
							this.aBoolean212 = true;
							break;
						}
						for (local527 = 0; local527 < 13; local527++) {
							for (local1007 = 0; local1007 < 13; local1007++) {
								local531 = this.aClass3_Sub1_Sub3_9.method285(1);
								if (local531 == 1) {
									this.anIntArrayArrayArray8[local367][local527][local1007] = this.aClass3_Sub1_Sub3_9.method285(26);
								} else {
									this.anIntArrayArrayArray8[local367][local527][local1007] = -1;
								}
							}
						}
						local367++;
					}
				}
				if (this.anInt819 == local222 && this.anInt820 == local227 && this.anInt946 == 2) {
					this.anInt885 = -1;
					return true;
				}
				this.anInt819 = local222;
				this.anInt820 = local227;
				this.anInt957 = (this.anInt819 - 6) * 8;
				this.anInt958 = (this.anInt820 - 6) * 8;
				this.aBoolean236 = false;
				if ((this.anInt819 / 8 == 48 || this.anInt819 / 8 == 49) && this.anInt820 / 8 == 48) {
					this.aBoolean236 = true;
				}
				if (this.anInt819 / 8 == 48 && this.anInt820 / 8 == 148) {
					this.aBoolean236 = true;
				}
				this.anInt946 = 1;
				this.aLong30 = System.currentTimeMillis();
				this.method719("Loading - please wait.", (String) null);
				if (this.anInt885 == 9) {
					local367 = 0;
					local527 = (this.anInt819 - 6) / 8;
					label1206: while (true) {
						if (local527 > (this.anInt819 + 6) / 8) {
							this.aByteArrayArray6 = new byte[local367][];
							this.aByteArrayArray5 = new byte[local367][];
							this.anIntArray236 = new int[local367];
							this.anIntArray237 = new int[local367];
							this.anIntArray238 = new int[local367];
							local367 = 0;
							local1007 = (this.anInt819 - 6) / 8;
							while (true) {
								if (local1007 > (this.anInt819 + 6) / 8) {
									break label1206;
								}
								for (local531 = (this.anInt820 - 6) / 8; local531 <= (this.anInt820 + 6) / 8; local531++) {
									this.anIntArray236[local367] = (local1007 << 8) + local531;
									if (this.aBoolean236 && (local531 == 49 || local531 == 149 || local531 == 147 || local1007 == 50 || local1007 == 49 && local531 == 47)) {
										this.anIntArray237[local367] = -1;
										this.anIntArray238[local367] = -1;
										local367++;
									} else {
										local552 = this.anIntArray237[local367] = this.aClass10_Sub1_1.method452(local1007, local531, 0);
										if (local552 != -1) {
											this.aClass10_Sub1_1.method464(3, local552);
										}
										local1142 = this.anIntArray238[local367] = this.aClass10_Sub1_1.method452(local1007, local531, 1);
										if (local1142 != -1) {
											this.aClass10_Sub1_1.method464(3, local1142);
										}
										local367++;
									}
								}
								local1007++;
							}
						}
						for (local1007 = (this.anInt820 - 6) / 8; local1007 <= (this.anInt820 + 6) / 8; local1007++) {
							local367++;
						}
						local527++;
					}
				}
				if (this.anInt885 == 99) {
					local367 = 0;
					@Pc(2755) int[] local2755 = new int[676];
					local1007 = 0;
					label1165: while (true) {
						@Pc(2785) int local2785;
						@Pc(2791) int local2791;
						@Pc(2801) int local2801;
						if (local1007 >= 4) {
							this.aByteArrayArray6 = new byte[local367][];
							this.aByteArrayArray5 = new byte[local367][];
							this.anIntArray236 = new int[local367];
							this.anIntArray237 = new int[local367];
							this.anIntArray238 = new int[local367];
							local531 = 0;
							while (true) {
								if (local531 >= local367) {
									break label1165;
								}
								local552 = this.anIntArray236[local531] = local2755[local531];
								local1142 = local552 >> 8 & 0xFF;
								local2785 = local552 & 0xFF;
								local2791 = this.anIntArray237[local531] = this.aClass10_Sub1_1.method452(local1142, local2785, 0);
								if (local2791 != -1) {
									this.aClass10_Sub1_1.method464(3, local2791);
								}
								local2801 = this.anIntArray238[local531] = this.aClass10_Sub1_1.method452(local1142, local2785, 1);
								if (local2801 != -1) {
									this.aClass10_Sub1_1.method464(3, local2801);
								}
								local531++;
							}
						}
						for (local531 = 0; local531 < 13; local531++) {
							for (local552 = 0; local552 < 13; local552++) {
								local1142 = this.anIntArrayArrayArray8[local1007][local531][local552];
								if (local1142 != -1) {
									local2785 = local1142 >> 14 & 0x3FF;
									local2791 = local1142 >> 3 & 0x7FF;
									local2801 = (local2785 / 8 << 8) + local2791 / 8;
									for (@Pc(2803) int local2803 = 0; local2803 < local367; local2803++) {
										if (local2755[local2803] == local2801) {
											local2801 = -1;
											break;
										}
									}
									if (local2801 != -1) {
										local2755[local367++] = local2801;
									}
								}
							}
						}
						local1007++;
					}
				}
				local367 = this.anInt957 - this.anInt959;
				local527 = this.anInt958 - this.anInt960;
				this.anInt959 = this.anInt957;
				this.anInt960 = this.anInt958;
				for (local1007 = 0; local1007 < 16384; local1007++) {
					@Pc(2956) Class3_Sub1_Sub1_Sub4_Sub2 local2956 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local1007];
					if (local2956 != null) {
						for (local552 = 0; local552 < 10; local552++) {
							local2956.anIntArray203[local552] -= local367;
							local2956.anIntArray204[local552] -= local527;
						}
						local2956.anInt754 -= local367 * 128;
						local2956.anInt755 -= local527 * 128;
					}
				}
				for (local531 = 0; local531 < this.anInt1010; local531++) {
					@Pc(3011) Class3_Sub1_Sub1_Sub4_Sub1 local3011 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local531];
					if (local3011 != null) {
						for (local1142 = 0; local1142 < 10; local1142++) {
							local3011.anIntArray203[local1142] -= local367;
							local3011.anIntArray204[local1142] -= local527;
						}
						local3011.anInt754 -= local367 * 128;
						local3011.anInt755 -= local527 * 128;
					}
				}
				this.aBoolean227 = true;
				@Pc(3063) byte local3063 = 0;
				@Pc(3065) byte local3065 = 104;
				@Pc(3067) byte local3067 = 1;
				if (local367 < 0) {
					local3063 = 103;
					local3065 = -1;
					local3067 = -1;
				}
				@Pc(3077) byte local3077 = 0;
				@Pc(3079) byte local3079 = 104;
				@Pc(3081) byte local3081 = 1;
				if (local527 < 0) {
					local3077 = 103;
					local3079 = -1;
					local3081 = -1;
				}
				for (@Pc(3091) int local3091 = local3063; local3091 != local3065; local3091 += local3067) {
					for (@Pc(3095) int local3095 = local3077; local3095 != local3079; local3095 += local3081) {
						@Pc(3101) int local3101 = local3091 + local367;
						@Pc(3105) int local3105 = local3095 + local527;
						for (@Pc(3107) int local3107 = 0; local3107 < 4; local3107++) {
							if (local3101 >= 0 && local3105 >= 0 && local3101 < 104 && local3105 < 104) {
								this.aClass27ArrayArrayArray1[local3107][local3091][local3095] = this.aClass27ArrayArrayArray1[local3107][local3101][local3105];
							} else {
								this.aClass27ArrayArrayArray1[local3107][local3091][local3095] = null;
							}
						}
					}
				}
				for (@Pc(3169) Class3_Sub3 local3169 = (Class3_Sub3) this.aClass27_11.method327(); local3169 != null; local3169 = (Class3_Sub3) this.aClass27_11.method329(this.anInt1016)) {
					local3169.anInt667 -= local367;
					local3169.anInt668 -= local527;
					if (local3169.anInt667 < 0 || local3169.anInt668 < 0 || local3169.anInt667 >= 104 || local3169.anInt668 >= 104) {
						local3169.method547();
					}
				}
				if (this.anInt917 != 0) {
					this.anInt917 -= local367;
					this.anInt918 -= local527;
				}
				this.aBoolean234 = false;
				this.anInt885 = -1;
				return true;
			} catch (@Pc(4479) IOException local4479) {
				this.method635(324);
			} catch (@Pc(4484) Exception local4484) {
				local1314 = "T2 - " + this.anInt885 + "," + this.anInt1018 + "," + this.anInt1019 + " - " + this.anInt884 + "," + (this.anInt957 + aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0]) + "," + (this.anInt958 + aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0]) + " - ";
				for (local227 = 0; local227 < this.anInt884 && local227 < 50; local227++) {
					local1314 = local1314 + this.aClass3_Sub1_Sub3_9.aByteArray5[local227] + ",";
				}
				signlink.reporterror(local1314);
				this.method718();
			}
			return true;
		} catch (@Pc(4565) RuntimeException local4565) {
			signlink.reporterror("69117, " + -549 + ", " + local4565.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!NHEPCMLW;Z)V")
	private void method724(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt442 + 10 < arg0 * 8) {
					@Pc(17) int local17 = arg1.method285(11);
					if (local17 != 2047) {
						if (this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local17] == null) {
							this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local17] = new Class3_Sub1_Sub1_Sub4_Sub1();
							if (this.aClass3_Sub1_Sub3Array1[local17] != null) {
								this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local17].method177(this.aClass3_Sub1_Sub3Array1[local17]);
							}
						}
						this.anIntArray251[this.anInt1012++] = local17;
						@Pc(63) Class3_Sub1_Sub1_Sub4_Sub1 local63 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local17];
						local63.anInt720 = anInt1050;
						@Pc(71) int local71 = arg1.method285(1);
						@Pc(76) int local76 = arg1.method285(5);
						if (local76 > 15) {
							local76 -= 32;
						}
						@Pc(85) int local85 = arg1.method285(5);
						if (local85 > 15) {
							local85 -= 32;
						}
						@Pc(94) int local94 = arg1.method285(1);
						if (local94 == 1) {
							this.anIntArray252[this.anInt1013++] = local17;
						}
						local63.method538(aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray203[0] + local85, aClass3_Sub1_Sub1_Sub4_Sub1_1.anIntArray204[0] + local76, local71 == 1);
						continue;
					}
				}
				arg1.method286(this.anInt1052);
				return;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("53551, " + arg0 + ", " + arg1 + ", " + true + ", " + local137.toString());
			throw new RuntimeException();
		}
	}
}
