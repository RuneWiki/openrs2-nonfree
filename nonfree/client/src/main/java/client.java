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

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Z")
	private static boolean aBoolean223;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private static int anInt849;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private static int anInt873;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Z")
	private static boolean aBoolean232;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!HHCKFJEO;")
	public static Class2_Sub1_Sub2_Sub1_Sub2 aClass2_Sub1_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	public static int anInt892;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private static int anInt894;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private static int anInt897;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private static int anInt900;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private static int anInt903;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Z")
	private static boolean aBoolean238;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private static int anInt904;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private static int anInt928;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private static int anInt938;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private static int anInt942;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private static int anInt943;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private static int anInt946;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private static int anInt956;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private static int anInt966;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	public static int anInt967;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private static int anInt982;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private static int anInt998;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private static int anInt1001;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private static int anInt1028;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private static int anInt837 = 662;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private static int anInt847 = 5;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Ljava/lang/String;")
	private static String aString20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Z")
	private static boolean aBoolean233 = true;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private static int anInt891 = 10;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private static boolean aBoolean235 = true;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "B")
	private static byte aByte52 = 8;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private static int[] anIntArray242 = new int[99];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[I")
	public static final int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "B")
	private static byte aByte54;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private static int anInt1014;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
	public static int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "B")
	private static byte aByte57;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private static int anInt1031;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!XSMXYXEY;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_5;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_7;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_9;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_10;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_11;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!MWSOISVX;")
	private Class26_Sub1 aClass26_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!FNOQZAYQ;")
	private Class8 aClass8_2;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Lclient!CNFMYDSL;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_12;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_13;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_14;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Ljava/lang/String;")
	private String aString19;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_6;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_7;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_8;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_9;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_15;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_16;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_17;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_18;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_19;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_20;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_21;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_22;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_23;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!OAGIEZRU;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_24;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_25;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_26;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Lclient!TRQPVNER;")
	private Class42 aClass42_27;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_10;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_11;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!EOVZRNPE;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!EOVZRNPE;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!EOVZRNPE;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!EOVZRNPE;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!GOLMSHHL;")
	private Class11 aClass11_2;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_13;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_14;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_15;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_16;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_17;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "[I")
	private int[] anIntArray212 = new int[33];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt819 = 50;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private int[] anIntArray213 = new int[this.anInt819];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
	private int[] anIntArray214 = new int[this.anInt819];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	private int[] anIntArray215 = new int[this.anInt819];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
	private int[] anIntArray216 = new int[this.anInt819];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
	private int[] anIntArray217 = new int[this.anInt819];

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray218 = new int[this.anInt819];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "[I")
	private int[] anIntArray219 = new int[this.anInt819];

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[this.anInt819];

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	private int[] anIntArray220 = new int[7];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "B")
	private byte aByte42 = 4;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "B")
	private byte aByte43 = 82;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array4 = new Class2_Sub1_Sub1_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt838 = -69;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt840 = -1;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array5 = new Class2_Sub1_Sub1_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt841 = 883;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt843 = 2;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
	private int[] anIntArray223 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
	private int[] anIntArray224 = new int[1000];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "B")
	private byte aByte44 = 7;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "[I")
	private int[] anIntArray229 = new int[5];

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt859 = -1;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt860 = -1;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt861 = -1;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
	private int[] anIntArray230 = new int[5];

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt862 = -441;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "B")
	private byte aByte45 = 81;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt864 = 128;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array2 = new Class2_Sub1_Sub1_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "B")
	private byte aByte46 = -86;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt868 = 5;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!DNRIFKTO;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_6 = Class2_Sub1_Sub4.method82();

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "[I")
	private int[] anIntArray231 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
	private boolean aBoolean228 = true;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt874 = 2301979;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!ZCVCEQHJ;")
	private Class48 aClass48_10 = new Class48(-489);

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "[I")
	private int[] anIntArray232 = new int[50];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt883 = -753;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Z")
	private volatile boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt884 = -1;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "B")
	private byte aByte47 = 5;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "B")
	private byte aByte48 = 7;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array6 = new Class2_Sub1_Sub1_Sub4[100];

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Lclient!ZCVCEQHJ;")
	private Class48 aClass48_11 = new Class48(-489);

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt887 = 119;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "B")
	private byte aByte49 = 6;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt888 = 29388;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt890 = 2;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Lclient!ZCVCEQHJ;")
	private Class48 aClass48_12 = new Class48(-489);

	@OriginalMember(owner = "client!client", name = "he", descriptor = "B")
	private byte aByte50 = -87;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "B")
	private byte aByte51 = 4;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!DNRIFKTO;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_7 = new Class2_Sub1_Sub4(new byte[5000], aBoolean259);

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "[Lclient!DLNPJUEQ;")
	private Class2_Sub1_Sub2_Sub1_Sub1[] aClass2_Sub1_Sub2_Sub1_Sub1Array1 = new Class2_Sub1_Sub2_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
	private int[] anIntArray236 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt902 = 78;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[Lclient!GYSQYVEV;")
	public Class12[] aClass12Array1 = new Class12[5];

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
	private int[] anIntArray237 = new int[5];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray238 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[500];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array3 = new Class2_Sub1_Sub1_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt912 = 1;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
	private int[] anIntArray239 = new int[Class4.anInt99];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt919 = -1;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[I")
	private int[] anIntArray240 = new int[256];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[I")
	private int[] anIntArray241 = new int[100];

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array7 = new Class2_Sub1_Sub1_Sub4[8];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt934 = 5063219;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Z")
	private boolean aBoolean244 = true;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "[Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array8 = new Class2_Sub1_Sub1_Sub4[1000];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt944 = 3;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array9 = new Class2_Sub1_Sub1_Sub4[32];

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[I")
	private int[] anIntArray243 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt957 = 3353893;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt958 = -242;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt961 = 7759444;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt963 = 7199;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
	private volatile boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
	private int[] anIntArray246 = new int[500];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray247 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray248 = new int[500];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray249 = new int[500];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Z")
	private volatile boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[I")
	private final int[] anIntArray254 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "[I")
	private int[] anIntArray255 = new int[5];

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt971 = 7;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private int[] anIntArray256 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Lclient!DNRIFKTO;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_8 = Class2_Sub1_Sub4.method82();

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean255 = true;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!LUAMUNXO;")
	private Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt975 = 2;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[I")
	private int[] anIntArray257 = new int[151];

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "B")
	private byte aByte53 = -37;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray258 = new int[200];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt987 = -30892;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private final int anInt989 = 100;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "[I")
	private int[] anIntArray259 = new int[100];

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt990 = -1;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
	private int[] anIntArray260 = new int[50];

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[I")
	private int[] anIntArray261 = new int[9];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!DNRIFKTO;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_9 = Class2_Sub1_Sub4.method82();

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "[I")
	private int[] anIntArray262 = new int[50];

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt997 = -1;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[[[Lclient!ZCVCEQHJ;")
	private Class48[][][] aClass48ArrayArrayArray1 = new Class48[4][104][104];

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt999 = 1;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1002 = -1;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "B")
	private byte aByte55 = 6;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1012 = -1;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Z")
	private boolean aBoolean261 = true;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray264 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray265 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "[I")
	private int[] anIntArray266 = new int[151];

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Z")
	private boolean aBoolean263 = true;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
	private int[] anIntArray267 = new int[33];

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private boolean aBoolean264 = true;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "[I")
	private int[] anIntArray268 = new int[Class4.anInt99];

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "[I")
	private int[] anIntArray269 = new int[Class4.anInt99];

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1016 = 1;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "B")
	private byte aByte56 = 1;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "[I")
	private int[] anIntArray270 = new int[5];

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1018 = 2048;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1019 = 2047;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[Lclient!HHCKFJEO;")
	private Class2_Sub1_Sub2_Sub1_Sub2[] aClass2_Sub1_Sub2_Sub1_Sub2Array1 = new Class2_Sub1_Sub2_Sub1_Sub2[this.anInt1018];

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[I")
	private int[] anIntArray272 = new int[this.anInt1018];

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
	private int[] anIntArray273 = new int[this.anInt1018];

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[Lclient!DNRIFKTO;")
	private Class2_Sub1_Sub4[] aClass2_Sub1_Sub4Array1 = new Class2_Sub1_Sub4[this.anInt1018];

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[Lclient!URWDWMOD;")
	private Class45[] aClass45Array1 = new Class45[4];

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[Lclient!PQKEJITK;")
	private Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array5 = new Class2_Sub1_Sub1_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1024 = -1;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Z")
	private boolean aBoolean266 = true;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1037 = -1;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1038 = -1;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "[I")
	public int[] anIntArray274 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "Z")
	private boolean aBoolean269 = true;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1039 = -31;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "B")
	private byte aByte58 = 5;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1040 = -1;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "[Lclient!XANVNPIN;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array10 = new Class2_Sub1_Sub1_Sub4[20];

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "I")
	private int anInt1041 = -1;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "Z")
	private boolean aBoolean271 = false;

	static {
		@Pc(283) int local283 = 0;
		@Pc(285) int local285;
		for (local285 = 0; local285 < 99; local285++) {
			@Pc(290) int local290 = local285 + 1;
			@Pc(303) int local303 = (int) ((double) local290 + Math.pow(2.0D, (double) local290 / 7.0D) * 300.0D);
			local283 += local303;
			anIntArray242[local285] = local283 / 4;
		}
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aBoolean259 = true;
		anIntArray263 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aByte54 = 127;
		anInt1014 = 7;
		anIntArray271 = new int[32];
		local283 = 2;
		for (local285 = 0; local285 < 32; local285++) {
			anIntArray271[local285] = local283 - 1;
			local283 += local283;
		}
		aByte57 = 2;
		anInt1031 = 30;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private static String method616(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			if (aByte57 != 2) {
				throw new NullPointerException();
			}
			@Pc(9) boolean local9 = false;
			for (@Pc(19) int local19 = local4.length() - 3; local19 > 0; local19 -= 3) {
				local4 = local4.substring(0, local19) + "," + local4.substring(local19);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("82481, " + arg0 + ", " + arg1 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 336);
			if (arg0.length == 5) {
				anInt891 = Integer.parseInt(arg0[0]);
				anInt892 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method649();
				} else if (arg0[2].equals("highmem")) {
					method642();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean235 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean235 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1046 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method573();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private static void method642() {
		try {
			Class47.aBoolean209 = false;
			Class2_Sub1_Sub1_Sub1.aBoolean9 = false;
			aBoolean236 = false;
			Class31.aBoolean129 = false;
			Class41.aBoolean178 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("54195, " + -42665 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private static void method649() {
		try {
			Class47.aBoolean209 = true;
			if (aByte54 != 127) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			Class2_Sub1_Sub1_Sub1.aBoolean9 = true;
			aBoolean236 = true;
			Class31.aBoolean129 = true;
			Class41.aBoolean178 = true;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("98210, " + 127 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) int local8 = arg0 - arg1;
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
			signlink.reporterror("76440, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private static String method705(@OriginalArg(0) int arg0) {
		try {
			if (anInt1014 != 7) {
				throw new NullPointerException();
			} else if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("57232, " + arg0 + ", " + 7 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method586() {
		try {
			@Pc(4) Graphics local4 = this.method583().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method576();
			@Pc(46) byte local46;
			@Pc(52) int local52;
			if (this.aBoolean249) {
				this.aBoolean252 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local46 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local52 = local46 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(61) int local61 = local52 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(78) int local78 = local61 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(84) int local84 = local78 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(90) int local90 = local84 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(96) int local96 = local90 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean229) {
				this.aBoolean252 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean241) {
				this.aBoolean252 = false;
				local4.setColor(Color.yellow);
				local46 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local52 = local46 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local52 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local52 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local52 += 30;
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("84418, " + 1 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt891 = Integer.parseInt(this.getParameter("nodeid"));
		anInt892 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method649();
		} else {
			method642();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean235 = false;
		} else {
			aBoolean235 = true;
		}
		this.method574(aBoolean233);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!LUAMUNXO;)Z")
	private boolean method587(@OriginalArg(1) Class21 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt401;
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
				this.aStringArray10[this.anInt1043] = "Remove @whi@" + this.aStringArray9[local4];
				this.anIntArray248[this.anInt1043] = 942;
				this.anInt1043++;
				this.aStringArray10[this.anInt1043] = "Message @whi@" + this.aStringArray9[local4];
				this.anIntArray248[this.anInt1043] = 765;
				this.anInt1043++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray10[this.anInt1043] = "Remove @whi@" + arg0.aString11;
				this.anIntArray248[this.anInt1043] = 156;
				this.anInt1043++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("59350, " + 2 + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!DNRIFKTO;)V")
	private void method588(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			this.aBoolean262 &= true;
			arg1.method104();
			@Pc(13) int local13 = arg1.method105(1);
			if (local13 != 0) {
				@Pc(21) int local21 = arg1.method105(2);
				if (local21 == 0) {
					this.anIntArray273[this.anInt1021++] = this.anInt1019;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg1.method105(3);
						aClass2_Sub1_Sub2_Sub1_Sub2_1.method198(local44, false);
						local54 = arg1.method105(1);
						if (local54 == 1) {
							this.anIntArray273[this.anInt1021++] = this.anInt1019;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg1.method105(3);
							aClass2_Sub1_Sub2_Sub1_Sub2_1.method198(local44, true);
							local54 = arg1.method105(3);
							aClass2_Sub1_Sub2_Sub1_Sub2_1.method198(local54, true);
							local98 = arg1.method105(1);
							if (local98 == 1) {
								this.anIntArray273[this.anInt1021++] = this.anInt1019;
							}
						} else if (local21 == 3) {
							local44 = arg1.method105(1);
							if (local44 == 1) {
								this.anIntArray273[this.anInt1021++] = this.anInt1019;
							}
							local54 = arg1.method105(7);
							local98 = arg1.method105(1);
							@Pc(152) int local152 = arg1.method105(7);
							this.anInt909 = arg1.method105(2);
							aClass2_Sub1_Sub2_Sub1_Sub2_1.method201(local54, local152, local98 == 1);
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("30978, " + true + ", " + arg0 + ", " + arg1 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method585(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			this.anInt941 = arg0;
			this.aString18 = arg1;
			this.method644((byte) 1);
			if (this.aClass8_2 == null) {
				super.method585(arg0, arg1);
			} else {
				this.aClass42_17.method420();
				this.aClass2_Sub1_Sub1_Sub2_4.method149(16777215, 180, "RuneScape is loading - please wait...", 54);
				Class2_Sub1_Sub1.method486(34, this.anInt883, 28, 9179409, 304, 62);
				Class2_Sub1_Sub1.method486(32, this.anInt883, 29, 0, 302, 63);
				Class2_Sub1_Sub1.method485(30, 9179409, 30, arg0 * 3, this.aBoolean270, 64);
				Class2_Sub1_Sub1.method485(30, 0, arg0 * 3 + 30, 300 - arg0 * 3, this.aBoolean270, 64);
				this.aClass2_Sub1_Sub1_Sub2_4.method149(16777215, 180, arg1, 85);
				this.aClass42_17.method421(202, 722, super.aGraphics2, 171);
				if (this.aBoolean246) {
					this.aBoolean246 = false;
					if (!this.aBoolean252) {
						this.aClass42_18.method421(0, 722, super.aGraphics2, 0);
						this.aClass42_19.method421(637, 722, super.aGraphics2, 0);
					}
					this.aClass42_15.method421(128, 722, super.aGraphics2, 0);
					this.aClass42_16.method421(202, 722, super.aGraphics2, 371);
					this.aClass42_20.method421(0, 722, super.aGraphics2, 265);
					this.aClass42_21.method421(562, 722, super.aGraphics2, 265);
					this.aClass42_22.method421(128, 722, super.aGraphics2, 171);
					this.aClass42_23.method421(562, 722, super.aGraphics2, 171);
				}
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("77157, " + arg0 + ", " + arg1 + ", " + -211 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method589(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray261[8] = 0;
			@Pc(10) int local10 = 0;
			@Pc(14) boolean local14 = false;
			while (this.anIntArray261[8] == 0) {
				@Pc(18) String local18 = "Unknown problem";
				this.method585(20, "Connecting to web server");
				try {
					@Pc(40) DataInputStream local40 = this.method716("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 336);
					@Pc(47) Class2_Sub1_Sub4 local47 = new Class2_Sub1_Sub4(new byte[40], aBoolean259);
					local40.readFully(local47.aByteArray2, 0, 40);
					local40.close();
					for (@Pc(57) int local57 = 0; local57 < 9; local57++) {
						this.anIntArray261[local57] = local47.method99();
					}
					@Pc(72) int local72 = local47.method99();
					@Pc(74) int local74 = 1234;
					for (@Pc(76) int local76 = 0; local76 < 9; local76++) {
						local74 = (local74 << 1) + this.anIntArray261[local76];
					}
					if (local72 != local74) {
						local18 = "checksum problem";
						this.anIntArray261[8] = 0;
					}
				} catch (@Pc(103) EOFException local103) {
					local18 = "EOF problem";
					this.anIntArray261[8] = 0;
				} catch (@Pc(112) IOException local112) {
					local18 = "connection problem";
					this.anIntArray261[8] = 0;
				} catch (@Pc(121) Exception local121) {
					local18 = "logic problem";
					this.anIntArray261[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray261[8] == 0) {
					local10++;
					for (@Pc(139) int local139 = local3; local139 > 0; local139--) {
						if (local10 >= 10) {
							this.method585(10, "Game updated - please reload page");
							local139 = 10;
						} else {
							this.method585(10, local18 + " - Will retry in " + local139 + " secs.");
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
					this.aBoolean225 = !this.aBoolean225;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("55920, " + arg0 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/net/Socket;")
	public Socket method590(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)Z")
	private boolean method591(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(12) boolean local12 = false;
			@Pc(25) int local25 = this.aClass47_1.method537(this.anInt909, arg1, arg3, arg2);
			if (local25 == -1) {
				return false;
			}
			@Pc(34) int local34 = local25 & 0x1F;
			@Pc(40) int local40 = local25 >> 6 & 0x3;
			if (local34 == 10 || local34 == 11 || local34 == 22) {
				@Pc(52) Class41 local52 = Class41.method410(local7);
				@Pc(60) int local60;
				@Pc(63) int local63;
				if (local40 == 0 || local40 == 2) {
					local60 = local52.anInt611;
					local63 = local52.anInt610;
				} else {
					local60 = local52.anInt610;
					local63 = local52.anInt611;
				}
				@Pc(74) int local74 = local52.anInt604;
				if (local40 != 0) {
					local74 = (local74 << local40 & 0xF) + (local74 >> 4 - local40);
				}
				this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], local60, false, arg1, 0, arg3, local63, local74, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
			} else {
				this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, false, arg1, local40, arg3, 0, 0, local34 + 1, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
			}
			this.anInt823 = super.anInt813;
			this.anInt824 = super.anInt814;
			this.anInt826 = 2;
			this.anInt825 = 0;
			return true;
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("39875, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method592(@OriginalArg(0) byte arg0) {
		try {
			@Pc(7) int local7 = this.aClass2_Sub1_Sub1_Sub2_4.method151("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt1043; local9++) {
				local20 = this.aClass2_Sub1_Sub1_Sub2_4.method151(this.aStringArray10[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			if (arg0 != -86) {
				this.aClass48ArrayArrayArray1 = null;
			}
			local7 += 8;
			local20 = this.anInt1043 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt813 > 4 && super.anInt814 > 4 && super.anInt813 < 516 && super.anInt814 < 338) {
				local69 = super.anInt813 - local7 / 2 - 4;
				if (local69 + local7 > 512) {
					local69 = 512 - local7;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt814 - 4;
				if (local87 + local20 > 334) {
					local87 = 334 - local20;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean248 = true;
				this.anInt1007 = 0;
				this.anInt1008 = local69;
				this.anInt1009 = local87;
				this.anInt1010 = local7;
				this.anInt1011 = this.anInt1043 * 15 + 22;
			}
			if (super.anInt813 > 553 && super.anInt814 > 205 && super.anInt813 < 743 && super.anInt814 < 466) {
				local69 = super.anInt813 - local7 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 190) {
					local69 = 190 - local7;
				}
				local87 = super.anInt814 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 261) {
					local87 = 261 - local20;
				}
				this.aBoolean248 = true;
				this.anInt1007 = 1;
				this.anInt1008 = local69;
				this.anInt1009 = local87;
				this.anInt1010 = local7;
				this.anInt1011 = this.anInt1043 * 15 + 22;
			}
			if (super.anInt813 > 17 && super.anInt814 > 357 && super.anInt813 < 496 && super.anInt814 < 453) {
				local69 = super.anInt813 - local7 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 479) {
					local69 = 479 - local7;
				}
				local87 = super.anInt814 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 96) {
					local87 = 96 - local20;
				}
				this.aBoolean248 = true;
				this.anInt1007 = 2;
				this.anInt1008 = local69;
				this.anInt1009 = local87;
				this.anInt1010 = local7;
				this.anInt1011 = this.anInt1043 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("87398, " + arg0 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!HHCKFJEO;ILclient!DNRIFKTO;II)V")
	private void method593(@OriginalArg(0) Class2_Sub1_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if ((arg3 & 0x80) != 0) {
				arg0.anInt260 = arg1.method120();
				if (arg0.anInt260 == 65535) {
					arg0.anInt260 = -1;
				}
			}
			if ((arg3 & 0x400) != 0) {
				arg0.anInt265 = arg1.method111();
				arg0.anInt267 = arg1.method113();
				arg0.anInt266 = arg1.method111();
				arg0.anInt268 = arg1.method111();
				arg0.anInt269 = arg1.method119(this.aByte58) + anInt967;
				arg0.anInt270 = arg1.method120() + anInt967;
				arg0.anInt271 = arg1.method94();
				arg0.method200((byte) 5);
			}
			@Pc(76) int local76;
			if ((arg3 & 0x10) != 0) {
				local76 = arg1.method112();
				@Pc(79) byte[] local79 = new byte[local76];
				@Pc(85) Class2_Sub1_Sub4 local85 = new Class2_Sub1_Sub4(local79, aBoolean259);
				arg1.method131(local76, local79);
				this.aClass2_Sub1_Sub4Array1[arg2] = local85;
				arg0.method205(local85);
			}
			@Pc(112) int local112;
			if ((arg3 & 0x100) != 0) {
				local76 = arg1.method112();
				local112 = arg1.method112();
				arg0.method202(local112, local76, anInt967);
				arg0.anInt244 = anInt967 + 300;
				arg0.anInt245 = arg1.method113();
				arg0.anInt246 = arg1.method94();
			}
			if ((arg3 & 0x40) != 0) {
				arg0.anInt275 = arg1.method120();
				arg0.anInt276 = arg1.method96();
			}
			if ((arg3 & 0x20) != 0) {
				local76 = arg1.method94();
				local112 = arg1.method113();
				arg0.method202(local112, local76, anInt967);
				arg0.anInt244 = anInt967 + 300;
				arg0.anInt245 = arg1.method94();
				arg0.anInt246 = arg1.method111();
			}
			@Pc(193) int local193;
			if ((arg3 & 0x1) != 0) {
				local76 = arg1.method119(this.aByte58);
				local112 = arg1.method111();
				local193 = arg1.method113();
				@Pc(196) int local196 = arg1.anInt166;
				if (arg0.aString6 != null && arg0.aBoolean74) {
					@Pc(206) long local206 = Class18.method206(arg0.aString6);
					@Pc(208) boolean local208 = false;
					if (local112 <= 1) {
						for (@Pc(213) int local213 = 0; local213 < this.anInt820; local213++) {
							if (this.aLongArray4[local213] == local206) {
								local208 = true;
								break;
							}
						}
					}
					if (!local208 && this.anInt882 == 0) {
						try {
							this.aClass2_Sub1_Sub4_7.anInt166 = 0;
							arg1.method131(local193, this.aClass2_Sub1_Sub4_7.aByteArray2);
							this.aClass2_Sub1_Sub4_7.anInt166 = 0;
							@Pc(258) String local258 = Class36.method360(local193, this.aClass2_Sub1_Sub4_7);
							@Pc(262) String local262 = Class44.method437(local258);
							arg0.aString5 = local262;
							arg0.anInt256 = local76 >> 8;
							arg0.anInt261 = local76 & 0xFF;
							arg0.anInt263 = 150;
							if (local112 == 2 || local112 == 3) {
								this.method690((byte) 3, 1, local262, "@cr2@" + arg0.aString6);
							} else if (local112 == 1) {
								this.method690((byte) 3, 1, local262, "@cr1@" + arg0.aString6);
							} else {
								this.method690((byte) 3, 2, local262, arg0.aString6);
							}
						} catch (@Pc(326) Exception local326) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt166 = local196 + local193;
			}
			if ((arg3 & 0x4) != 0) {
				local76 = arg1.method120();
				if (local76 == 65535) {
					local76 = -1;
				}
				local112 = arg1.method112();
				if (local76 == arg0.anInt277 && local76 != -1) {
					local193 = Class49.aClass49Array1[local76].anInt775;
					if (local193 == 1) {
						arg0.anInt278 = 0;
						arg0.anInt279 = 0;
						arg0.anInt280 = local112;
						arg0.anInt281 = 0;
					}
					if (local193 == 2) {
						arg0.anInt281 = 0;
					}
				} else if (local76 == -1 || arg0.anInt277 == -1 || Class49.aClass49Array1[local76].anInt769 >= Class49.aClass49Array1[arg0.anInt277].anInt769) {
					arg0.anInt277 = local76;
					arg0.anInt278 = 0;
					arg0.anInt279 = 0;
					arg0.anInt280 = local112;
					arg0.anInt281 = 0;
					arg0.anInt282 = arg0.anInt272;
				}
			}
			if ((arg3 & 0x2) != 0) {
				arg0.aString5 = arg1.method101();
				if (arg0.aString5.charAt(0) == '~') {
					arg0.aString5 = arg0.aString5.substring(1);
					this.method690((byte) 3, 2, arg0.aString5, arg0.aString6);
				} else if (arg0 == aClass2_Sub1_Sub2_Sub1_Sub2_1) {
					this.method690((byte) 3, 2, arg0.aString5, arg0.aString6);
				}
				arg0.anInt256 = 0;
				arg0.anInt261 = 0;
				arg0.anInt263 = 150;
			}
			if ((arg3 & 0x200) != 0) {
				arg0.anInt251 = arg1.method121();
				local76 = arg1.method129();
				arg0.anInt255 = local76 >> 16;
				arg0.anInt254 = anInt967 + (local76 & 0xFFFF);
				arg0.anInt252 = 0;
				arg0.anInt253 = 0;
				if (arg0.anInt254 > anInt967) {
					arg0.anInt252 = -1;
				}
				if (arg0.anInt251 == 65535) {
					arg0.anInt251 = -1;
					return;
				}
			}
		} catch (@Pc(519) RuntimeException local519) {
			signlink.reporterror("79526, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DNRIFKTO;II)V")
	private void method594(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			while (arg0.anInt167 + 10 < arg1 * 8) {
				@Pc(16) int local16 = arg0.method105(11);
				if (local16 == 2047) {
					break;
				}
				if (this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local16] == null) {
					this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local16] = new Class2_Sub1_Sub2_Sub1_Sub2();
					if (this.aClass2_Sub1_Sub4Array1[local16] != null) {
						this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local16].method205(this.aClass2_Sub1_Sub4Array1[local16]);
					}
				}
				this.anIntArray272[this.anInt1020++] = local16;
				@Pc(62) Class2_Sub1_Sub2_Sub1_Sub2 local62 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local16];
				local62.anInt262 = anInt967;
				@Pc(70) int local70 = arg0.method105(1);
				if (local70 == 1) {
					this.anIntArray273[this.anInt1021++] = local16;
				}
				@Pc(89) int local89 = arg0.method105(5);
				if (local89 > 15) {
					local89 -= 32;
				}
				@Pc(98) int local98 = arg0.method105(1);
				@Pc(103) int local103 = arg0.method105(5);
				if (local103 > 15) {
					local103 -= 32;
				}
				local62.method201(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0] + local103, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0] + local89, local98 == 1);
			}
			arg0.method106();
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("80200, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method595() {
		try {
			this.aClass42_25.method420();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt979 == 2) {
				@Pc(13) byte[] local13 = this.aClass2_Sub1_Sub1_Sub3_4.aByteArray13;
				@Pc(15) int[] local15 = Class2_Sub1_Sub1.anIntArray189;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass2_Sub1_Sub1_Sub4_11.method501(33, 25, 256, this.anInt865, 25, this.anIntArray267, this.anIntArray212, 0, 0, 33);
				this.aClass42_26.method420();
				Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
			} else {
				@Pc(67) int local67 = this.anInt865 + this.anInt974 & 0x7FF;
				@Pc(74) int local74 = aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 / 32 + 48;
				local18 = 464 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 / 32;
				this.aClass2_Sub1_Sub1_Sub4_10.method501(146, local18, this.anInt1015 + 256, local67, local74, this.anIntArray266, this.anIntArray257, 25, 5, 151);
				this.aClass2_Sub1_Sub1_Sub4_11.method501(33, 25, 256, this.anInt865, 25, this.anIntArray267, this.anIntArray212, 0, 0, 33);
				for (local20 = 0; local20 < this.anInt844; local20++) {
					local74 = this.anIntArray223[local20] * 4 + 2 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 / 32;
					local18 = this.anIntArray224[local20] * 4 + 2 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 / 32;
					this.method635(this.aClass2_Sub1_Sub1_Sub4Array8[local20], local18, local74);
				}
				@Pc(169) int local169;
				for (@Pc(165) int local165 = 0; local165 < 104; local165++) {
					for (local169 = 0; local169 < 104; local169++) {
						@Pc(181) Class48 local181 = this.aClass48ArrayArrayArray1[this.anInt909][local165][local169];
						if (local181 != null) {
							local74 = local165 * 4 + 2 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 / 32;
							local18 = local169 * 4 + 2 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 / 32;
							this.method635(this.aClass2_Sub1_Sub1_Sub4_5, local18, local74);
						}
					}
				}
				if (this.aByte43 == 82) {
					for (local169 = 0; local169 < this.anInt901; local169++) {
						@Pc(237) Class2_Sub1_Sub2_Sub1_Sub1 local237 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray236[local169]];
						if (local237 != null && local237.method199()) {
							@Pc(246) Class14 local246 = local237.aClass14_1;
							if (local246.anIntArray45 != null) {
								local246 = local246.method191();
							}
							if (local246 != null && local246.aBoolean59 && local246.aBoolean61) {
								local74 = local237.anInt285 / 32 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 / 32;
								local18 = local237.anInt286 / 32 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 / 32;
								this.method635(this.aClass2_Sub1_Sub1_Sub4_6, local18, local74);
							}
						}
					}
					@Pc(305) Class2_Sub1_Sub2_Sub1_Sub2 local305;
					for (@Pc(295) int local295 = 0; local295 < this.anInt1020; local295++) {
						local305 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray272[local295]];
						if (local305 != null && local305.method199()) {
							local74 = local305.anInt285 / 32 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 / 32;
							local18 = local305.anInt286 / 32 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 / 32;
							@Pc(333) boolean local333 = false;
							@Pc(337) long local337 = Class18.method206(local305.aString6);
							for (@Pc(339) int local339 = 0; local339 < this.anInt898; local339++) {
								if (local337 == this.aLongArray3[local339] && this.anIntArray258[local339] != 0) {
									local333 = true;
									break;
								}
							}
							@Pc(364) boolean local364 = false;
							if (aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt288 != 0 && local305.anInt288 != 0 && aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt288 == local305.anInt288) {
								local364 = true;
							}
							if (local333) {
								this.method635(this.aClass2_Sub1_Sub1_Sub4_8, local18, local74);
							} else if (local364) {
								this.method635(this.aClass2_Sub1_Sub1_Sub4_9, local18, local74);
							} else {
								this.method635(this.aClass2_Sub1_Sub1_Sub4_7, local18, local74);
							}
						}
					}
					if (this.anInt931 != 0 && anInt967 % 20 < 10) {
						if (this.anInt931 == 1 && this.anInt858 >= 0 && this.anInt858 < this.aClass2_Sub1_Sub2_Sub1_Sub1Array1.length) {
							@Pc(438) Class2_Sub1_Sub2_Sub1_Sub1 local438 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[this.anInt858];
							if (local438 != null) {
								local74 = local438.anInt285 / 32 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 / 32;
								local18 = local438.anInt286 / 32 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 / 32;
								this.method703(local18, local74, this.aClass2_Sub1_Sub1_Sub4_15);
							}
						}
						if (this.anInt931 == 2) {
							local74 = (this.anInt914 - this.anInt905) * 4 + 2 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 / 32;
							local18 = (this.anInt915 - this.anInt906) * 4 + 2 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 / 32;
							this.method703(local18, local74, this.aClass2_Sub1_Sub1_Sub4_15);
						}
						if (this.anInt931 == 10 && this.anInt870 >= 0 && this.anInt870 < this.aClass2_Sub1_Sub2_Sub1_Sub2Array1.length) {
							local305 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[this.anInt870];
							if (local305 != null) {
								local74 = local305.anInt285 / 32 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 / 32;
								local18 = local305.anInt286 / 32 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 / 32;
								this.method703(local18, local74, this.aClass2_Sub1_Sub1_Sub4_15);
							}
						}
					}
					if (this.anInt964 != 0) {
						local74 = this.anInt964 * 4 + 2 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 / 32;
						local18 = this.anInt965 * 4 + 2 - aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 / 32;
						this.method635(this.aClass2_Sub1_Sub1_Sub4_14, local18, local74);
					}
					Class2_Sub1_Sub1.method485(3, 16777215, 97, 3, this.aBoolean270, 78);
					this.aClass42_26.method420();
					Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
				}
			}
		} catch (@Pc(607) RuntimeException local607) {
			signlink.reporterror("13858, " + 82 + ", " + local607.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method596(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt992 == 0 && this.anInt852 == 0) {
				this.aStringArray10[this.anInt1043] = "Walk here";
				this.anIntArray248[this.anInt1043] = 579;
				this.anIntArray246[this.anInt1043] = super.anInt807;
				this.anIntArray247[this.anInt1043] = super.anInt808;
				this.anInt1043++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class2_Sub1_Sub2_Sub5.anInt603; local43++) {
				@Pc(49) int local49 = Class2_Sub1_Sub2_Sub5.anIntArray157[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass47_1.method537(this.anInt909, local53, local59, local49) >= 0) {
						@Pc(91) Class41 local91 = Class41.method410(local71);
						if (local91.anIntArray164 != null) {
							local91 = local91.method416();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt992 == 1) {
							this.aStringArray10[this.anInt1043] = "Use " + this.aString28 + " with @cya@" + local91.aString16;
							this.anIntArray248[this.anInt1043] = 748;
							this.anIntArray249[this.anInt1043] = local49;
							this.anIntArray246[this.anInt1043] = local53;
							this.anIntArray247[this.anInt1043] = local59;
							this.anInt1043++;
						} else if (this.anInt852 != 1) {
							if (local91.aStringArray6 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray6[local218] != null) {
										this.aStringArray10[this.anInt1043] = local91.aStringArray6[local218] + " @cya@" + local91.aString16;
										if (local218 == 0) {
											this.anIntArray248[this.anInt1043] = 633;
										}
										if (local218 == 1) {
											this.anIntArray248[this.anInt1043] = 33;
										}
										if (local218 == 2) {
											this.anIntArray248[this.anInt1043] = 76;
										}
										if (local218 == 3) {
											this.anIntArray248[this.anInt1043] = 800;
										}
										if (local218 == 4) {
											this.anIntArray248[this.anInt1043] = 1194;
										}
										this.anIntArray249[this.anInt1043] = local49;
										this.anIntArray246[this.anInt1043] = local53;
										this.anIntArray247[this.anInt1043] = local59;
										this.anInt1043++;
									}
								}
							}
							this.aStringArray10[this.anInt1043] = "Examine @cya@" + local91.aString16;
							this.anIntArray248[this.anInt1043] = 1704;
							this.anIntArray249[this.anInt1043] = local91.anInt608 << 14;
							this.anIntArray246[this.anInt1043] = local53;
							this.anIntArray247[this.anInt1043] = local59;
							this.anInt1043++;
						} else if ((this.anInt854 & 0x4) == 4) {
							this.aStringArray10[this.anInt1043] = this.aString17 + " @cya@" + local91.aString16;
							this.anIntArray248[this.anInt1043] = 212;
							this.anIntArray249[this.anInt1043] = local49;
							this.anIntArray246[this.anInt1043] = local53;
							this.anIntArray247[this.anInt1043] = local59;
							this.anInt1043++;
						}
					}
					@Pc(398) Class2_Sub1_Sub2_Sub1_Sub1 local398;
					@Pc(446) Class2_Sub1_Sub2_Sub1_Sub2 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class2_Sub1_Sub2_Sub1_Sub1 local369 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local71];
						if (local369.aClass14_1.aByte14 == 1 && (local369.anInt285 & 0x7F) == 64 && (local369.anInt286 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt901; local218++) {
								local398 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray236[local218]];
								if (local398 != null && local398 != local369 && local398.aClass14_1.aByte14 == 1 && local398.anInt285 == local369.anInt285 && local398.anInt286 == local369.anInt286) {
									this.method670(local53, local398.aClass14_1, this.anIntArray236[local218], local59);
								}
							}
							for (local436 = 0; local436 < this.anInt1020; local436++) {
								local446 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray272[local436]];
								if (local446 != null && local446.anInt285 == local369.anInt285 && local446.anInt286 == local369.anInt286) {
									this.method679(local53, local446, local59, this.anIntArray272[local436]);
								}
							}
						}
						this.method670(local53, local369.aClass14_1, local71, local59);
					}
					if (local65 == 0) {
						@Pc(488) Class2_Sub1_Sub2_Sub1_Sub2 local488 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local71];
						if ((local488.anInt285 & 0x7F) == 64 && (local488.anInt286 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt901; local218++) {
								local398 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray236[local218]];
								if (local398 != null && local398.aClass14_1.aByte14 == 1 && local398.anInt285 == local488.anInt285 && local398.anInt286 == local488.anInt286) {
									this.method670(local53, local398.aClass14_1, this.anIntArray236[local218], local59);
								}
							}
							for (local436 = 0; local436 < this.anInt1020; local436++) {
								local446 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray272[local436]];
								if (local446 != null && local446 != local488 && local446.anInt285 == local488.anInt285 && local446.anInt286 == local488.anInt286) {
									this.method679(local53, local446, local59, this.anIntArray272[local436]);
								}
							}
						}
						this.method679(local53, local488, local59, local71);
					}
					if (local65 == 3) {
						@Pc(607) Class48 local607 = this.aClass48ArrayArrayArray1[this.anInt909][local53][local59];
						if (local607 != null) {
							for (@Pc(615) Class2_Sub1_Sub2_Sub6 local615 = (Class2_Sub1_Sub2_Sub6) local607.method566(this.aBoolean264); local615 != null; local615 = (Class2_Sub1_Sub2_Sub6) local607.method568()) {
								@Pc(621) Class19 local621 = Class19.method221(local615.anInt762);
								if (this.anInt992 == 1) {
									this.aStringArray10[this.anInt1043] = "Use " + this.aString28 + " with @lre@" + local621.aString7;
									this.anIntArray248[this.anInt1043] = 341;
									this.anIntArray249[this.anInt1043] = local615.anInt762;
									this.anIntArray246[this.anInt1043] = local53;
									this.anIntArray247[this.anInt1043] = local59;
									this.anInt1043++;
								} else if (this.anInt852 != 1) {
									for (@Pc(738) int local738 = 4; local738 >= 0; local738--) {
										if (local621.aStringArray4 != null && local621.aStringArray4[local738] != null) {
											this.aStringArray10[this.anInt1043] = local621.aStringArray4[local738] + " @lre@" + local621.aString7;
											if (local738 == 0) {
												this.anIntArray248[this.anInt1043] = 862;
											}
											if (local738 == 1) {
												this.anIntArray248[this.anInt1043] = 784;
											}
											if (local738 == 2) {
												this.anIntArray248[this.anInt1043] = 647;
											}
											if (local738 == 3) {
												this.anIntArray248[this.anInt1043] = 58;
											}
											if (local738 == 4) {
												this.anIntArray248[this.anInt1043] = 321;
											}
											this.anIntArray249[this.anInt1043] = local615.anInt762;
											this.anIntArray246[this.anInt1043] = local53;
											this.anIntArray247[this.anInt1043] = local59;
											this.anInt1043++;
										} else if (local738 == 2) {
											this.aStringArray10[this.anInt1043] = "Take @lre@" + local621.aString7;
											this.anIntArray248[this.anInt1043] = 647;
											this.anIntArray249[this.anInt1043] = local615.anInt762;
											this.anIntArray246[this.anInt1043] = local53;
											this.anIntArray247[this.anInt1043] = local59;
											this.anInt1043++;
										}
									}
									this.aStringArray10[this.anInt1043] = "Examine @lre@" + local621.aString7;
									this.anIntArray248[this.anInt1043] = 1608;
									this.anIntArray249[this.anInt1043] = local615.anInt762;
									this.anIntArray246[this.anInt1043] = local53;
									this.anIntArray247[this.anInt1043] = local59;
									this.anInt1043++;
								} else if ((this.anInt854 & 0x1) == 1) {
									this.aStringArray10[this.anInt1043] = this.aString17 + " @lre@" + local621.aString7;
									this.anIntArray248[this.anInt1043] = 534;
									this.anIntArray249[this.anInt1043] = local615.anInt762;
									this.anIntArray246[this.anInt1043] = local53;
									this.anIntArray247[this.anInt1043] = local59;
									this.anInt1043++;
								}
							}
						}
					}
				}
			}
			@Pc(948) boolean local948 = false;
		} catch (@Pc(958) RuntimeException local958) {
			signlink.reporterror("34237, " + arg0 + ", " + local958.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method597() {
		try {
			this.aBoolean262 &= true;
			if (aBoolean236 && this.anInt1030 == 2 && Class31.anInt504 != this.anInt909) {
				if (this.aClass42_26 != null) {
					this.aClass42_26.method420();
					Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
					this.aClass2_Sub1_Sub1_Sub2_3.method149(0, 257, "Loading - please wait.", 151);
					this.aClass2_Sub1_Sub1_Sub2_3.method149(16777215, 256, "Loading - please wait.", 150);
					this.aClass42_26.method421(4, 722, super.aGraphics2, 4);
				} else if (super.aClass42_2 != null) {
					super.aClass42_2.method420();
					Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray253;
					this.aClass2_Sub1_Sub1_Sub2_3.method149(0, 383, "Loading - please wait.", 471);
					this.aClass2_Sub1_Sub1_Sub2_3.method149(16777215, 382, "Loading - please wait.", 470);
					super.aClass42_2.method421(0, 722, super.aGraphics2, 0);
				}
				this.anInt1030 = 1;
				this.aLong29 = System.currentTimeMillis();
			}
			if (this.anInt1030 == 1) {
				@Pc(99) int local99 = this.method598((byte) 7);
				if (local99 != 0 && System.currentTimeMillis() - this.aLong29 > 360000L) {
					signlink.reporterror(this.aString22 + " glcfb " + this.aLong30 + "," + local99 + "," + aBoolean236 + "," + this.aClass12Array1[0] + "," + this.aClass26_Sub1_1.method279() + "," + this.anInt909 + "," + this.anInt932 + "," + this.anInt933);
					this.aLong29 = System.currentTimeMillis();
				}
			}
			if (this.anInt1030 == 2 && this.anInt909 != this.anInt990) {
				this.anInt990 = this.anInt909;
				this.method680(this.anInt909);
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("96744, " + true + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
	private int method598(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray234[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray235[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			if (this.aByte48 != 7) {
				return 2;
			}
			@Pc(45) boolean local45 = false;
			for (@Pc(50) int local50 = 0; local50 < this.aByteArrayArray6.length; local50++) {
				@Pc(58) byte[] local58 = this.aByteArrayArray5[local50];
				if (local58 != null) {
					@Pc(72) int local72 = (this.anIntArray233[local50] >> 8) * 64 - this.anInt905;
					@Pc(84) int local84 = (this.anIntArray233[local50] & 0xFF) * 64 - this.anInt906;
					if (this.aBoolean268) {
						local72 = 10;
						local84 = 10;
					}
					local39 &= Class31.method311(local84, local58, this.anInt971, local72);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean227) {
				return -4;
			} else {
				this.anInt1030 = 2;
				Class31.anInt504 = this.anInt909;
				this.method628();
				this.aClass2_Sub1_Sub4_6.method83(226);
				return 0;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("32310, " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method599() {
		try {
			@Pc(19) int local19;
			if (this.anInt935 > 0) {
				for (local19 = 0; local19 < 256; local19++) {
					if (this.anInt935 > 768) {
						this.anIntArray225[local19] = this.method647(this.anIntArray227[local19], 1024 - this.anInt935, this.anIntArray226[local19]);
					} else if (this.anInt935 > 256) {
						this.anIntArray225[local19] = this.anIntArray227[local19];
					} else {
						this.anIntArray225[local19] = this.method647(this.anIntArray226[local19], 256 - this.anInt935, this.anIntArray227[local19]);
					}
				}
			} else if (this.anInt936 > 0) {
				for (local19 = 0; local19 < 256; local19++) {
					if (this.anInt936 > 768) {
						this.anIntArray225[local19] = this.method647(this.anIntArray228[local19], 1024 - this.anInt936, this.anIntArray226[local19]);
					} else if (this.anInt936 > 256) {
						this.anIntArray225[local19] = this.anIntArray228[local19];
					} else {
						this.anIntArray225[local19] = this.method647(this.anIntArray226[local19], 256 - this.anInt936, this.anIntArray228[local19]);
					}
				}
			} else {
				for (local19 = 0; local19 < 256; local19++) {
					this.anIntArray225[local19] = this.anIntArray226[local19];
				}
			}
			for (local19 = 0; local19 < 33920; local19++) {
				this.aClass42_18.anIntArray168[local19] = this.aClass2_Sub1_Sub1_Sub4_3.anIntArray190[local19];
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
				local209 = this.anIntArray240[local196] * (256 - local196) / 256;
				local213 = local209 + 22;
				if (local213 < 0) {
					local213 = 0;
				}
				local192 += local213;
				for (local223 = local213; local223 < 128; local223++) {
					local231 = this.anIntArray244[local192++];
					if (local231 == 0) {
						local194++;
					} else {
						local235 = local231;
						local239 = 256 - local231;
						local231 = this.anIntArray225[local231];
						local250 = this.aClass42_18.anIntArray168[local194];
						this.aClass42_18.anIntArray168[local194++] = ((local231 & 0xFF00FF) * local235 + (local250 & 0xFF00FF) * local239 & 0xFF00FF00) + ((local231 & 0xFF00) * local235 + (local250 & 0xFF00) * local239 & 0xFF0000) >> 8;
					}
				}
				local194 += local213;
			}
			this.aClass42_18.method421(0, 722, super.aGraphics2, 0);
			for (local209 = 0; local209 < 33920; local209++) {
				this.aClass42_19.anIntArray168[local209] = this.aClass2_Sub1_Sub1_Sub4_4.anIntArray190[local209];
			}
			local192 = 0;
			local194 = 1176;
			for (local213 = 1; local213 < 255; local213++) {
				local223 = this.anIntArray240[local213] * (256 - local213) / 256;
				local231 = 103 - local223;
				local194 += local223;
				for (local235 = 0; local235 < local231; local235++) {
					local239 = this.anIntArray244[local192++];
					if (local239 == 0) {
						local194++;
					} else {
						local250 = local239;
						@Pc(373) int local373 = 256 - local239;
						local239 = this.anIntArray225[local239];
						@Pc(384) int local384 = this.aClass42_19.anIntArray168[local194];
						this.aClass42_19.anIntArray168[local194++] = ((local239 & 0xFF00FF) * local250 + (local384 & 0xFF00FF) * local373 & 0xFF00FF00) + ((local239 & 0xFF00) * local250 + (local384 & 0xFF00) * local373 & 0xFF0000) >> 8;
					}
				}
				local192 += 128 - local231;
				local194 += 128 - local231 - local223;
			}
			this.aClass42_19.method421(637, 722, super.aGraphics2, 0);
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("25749, " + 9 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method600(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt996 != 0) {
					this.anInt996 = 0;
					this.aBoolean226 = true;
				}
				@Pc(18) int local18 = this.anIntArray246[arg0];
				@Pc(23) int local23 = this.anIntArray247[arg0];
				@Pc(28) int local28 = this.anIntArray248[arg0];
				@Pc(33) int local33 = this.anIntArray249[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(54) String local54;
				@Pc(58) int local58;
				@Pc(69) long local69;
				if (local28 == 723 || local28 == 64 || local28 == 942 || local28 == 156) {
					local54 = this.aStringArray10[arg0];
					local58 = local54.indexOf("@whi@");
					if (local58 != -1) {
						local69 = Class18.method206(local54.substring(local58 + 5).trim());
						if (local28 == 723) {
							this.method715(local69);
						}
						if (local28 == 64) {
							this.method675(local69);
						}
						if (local28 == 942) {
							this.method683(local69);
						}
						if (local28 == 156) {
							this.method629(local69);
						}
					}
				}
				@Pc(105) Class2_Sub1_Sub2_Sub1_Sub2 local105;
				if (local28 == 690) {
					local105 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local33];
					if (local105 != null) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local105.anIntArray51[0], 0, local105.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						this.aClass2_Sub1_Sub4_6.method83(69);
						this.aClass2_Sub1_Sub4_6.method116(local33);
						this.aClass2_Sub1_Sub4_6.method85(this.anInt853);
					}
				}
				if (local28 == 837) {
					local105 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local33];
					if (local105 != null) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local105.anIntArray51[0], 0, local105.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						this.aClass2_Sub1_Sub4_6.method83(25);
						this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
					}
				}
				@Pc(230) Class19 local230;
				@Pc(239) String local239;
				if (local28 == 1608) {
					local230 = Class19.method221(local33);
					if (local230.aByteArray6 == null) {
						local239 = "It's a " + local230.aString7 + ".";
					} else {
						local239 = new String(local230.aByteArray6);
					}
					this.method690((byte) 3, 0, local239, "");
				}
				if (local28 == 579) {
					if (this.aBoolean248) {
						this.aClass47_1.method545(local23 - 4, local18 - 4);
					} else {
						this.aClass47_1.method545(super.anInt814 - 4, super.anInt813 - 4);
					}
				}
				@Pc(312) boolean local312;
				if (local28 == 534) {
					local312 = this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, false, local18, 0, local23, 0, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
					if (!local312) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local18, 0, local23, 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
					}
					this.anInt823 = super.anInt813;
					this.anInt824 = super.anInt814;
					this.anInt826 = 2;
					this.anInt825 = 0;
					this.aClass2_Sub1_Sub4_6.method83(48);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local18 + this.anInt905);
					this.aClass2_Sub1_Sub4_6.method118(local23 + this.anInt906);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, this.anInt853);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
				}
				if (local28 == 777) {
					local105 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local33];
					if (local105 != null) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local105.anIntArray51[0], 0, local105.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						this.aClass2_Sub1_Sub4_6.method83(29);
						this.aClass2_Sub1_Sub4_6.method117((byte) 5, this.anInt995);
						this.aClass2_Sub1_Sub4_6.method118(local33);
						this.aClass2_Sub1_Sub4_6.method118(this.anInt994);
						this.aClass2_Sub1_Sub4_6.method85(this.anInt993);
					}
				}
				if (local28 == 433) {
					this.aClass2_Sub1_Sub4_6.method83(35);
					this.aClass2_Sub1_Sub4_6.method118(local33);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local18);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local23);
					this.anInt1003 = 0;
					this.anInt1004 = local23;
					this.anInt1005 = local18;
					this.anInt1006 = 2;
					if (Class21.method256(local23).anInt418 == this.anInt1040) {
						this.anInt1006 = 1;
					}
					if (Class21.method256(local23).anInt418 == this.anInt1038) {
						this.anInt1006 = 3;
					}
				}
				if (local28 == 1194) {
					this.method591((byte) 2, local18, local33, local23);
					this.aClass2_Sub1_Sub4_6.method83(24);
					this.aClass2_Sub1_Sub4_6.method118(local18 + this.anInt905);
					this.aClass2_Sub1_Sub4_6.method118(local33 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub4_6.method85(local23 + this.anInt906);
				}
				@Pc(572) String local572;
				if (local28 == 1704) {
					@Pc(560) int local560 = local33 >> 14 & 0x7FFF;
					@Pc(563) Class41 local563 = Class41.method410(local560);
					if (local563.aByteArray14 == null) {
						local572 = "It's a " + local563.aString16 + ".";
					} else {
						local572 = new String(local563.aByteArray14);
					}
					this.method690((byte) 3, 0, local572, "");
				}
				if (local28 == 212 && this.method591((byte) 2, local18, local33, local23)) {
					this.aClass2_Sub1_Sub4_6.method83(210);
					this.aClass2_Sub1_Sub4_6.method85(local23 + this.anInt906);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub4_6.method116(this.anInt853);
					this.aClass2_Sub1_Sub4_6.method116(local18 + this.anInt905);
				}
				if (local28 == 503) {
					this.aClass2_Sub1_Sub4_6.method83(182);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local23);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
					this.aClass2_Sub1_Sub4_6.method85(local18);
					this.anInt1003 = 0;
					this.anInt1004 = local23;
					this.anInt1005 = local18;
					this.anInt1006 = 2;
					if (Class21.method256(local23).anInt418 == this.anInt1040) {
						this.anInt1006 = 1;
					}
					if (Class21.method256(local23).anInt418 == this.anInt1038) {
						this.anInt1006 = 3;
					}
				}
				@Pc(694) Class21 local694;
				if (local28 == 236) {
					local694 = Class21.method256(local23);
					@Pc(696) boolean local696 = true;
					if (local694.anInt401 > 0) {
						local696 = this.method684(local694);
					}
					if (local696) {
						this.aClass2_Sub1_Sub4_6.method83(44);
						this.aClass2_Sub1_Sub4_6.method85(local23);
					}
				}
				if (local28 == 321) {
					local312 = this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, false, local18, 0, local23, 0, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
					if (!local312) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local18, 0, local23, 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
					}
					this.anInt823 = super.anInt813;
					this.anInt824 = super.anInt814;
					this.anInt826 = 2;
					this.anInt825 = 0;
					this.aClass2_Sub1_Sub4_6.method83(96);
					this.aClass2_Sub1_Sub4_6.method116(local33);
					this.aClass2_Sub1_Sub4_6.method116(local18 + this.anInt905);
					this.aClass2_Sub1_Sub4_6.method118(local23 + this.anInt906);
				}
				if (local28 == 591 && !this.aBoolean267) {
					this.aClass2_Sub1_Sub4_6.method83(179);
					this.aClass2_Sub1_Sub4_6.method85(local23);
					this.aBoolean267 = true;
				}
				if (local28 == 526) {
					this.aClass2_Sub1_Sub4_6.method83(247);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local18);
					this.aClass2_Sub1_Sub4_6.method118(this.anInt993);
					this.aClass2_Sub1_Sub4_6.method116(local23);
					this.aClass2_Sub1_Sub4_6.method118(this.anInt995);
					this.aClass2_Sub1_Sub4_6.method118(this.anInt994);
					this.aClass2_Sub1_Sub4_6.method118(local33);
					this.anInt1003 = 0;
					this.anInt1004 = local23;
					this.anInt1005 = local18;
					this.anInt1006 = 2;
					if (Class21.method256(local23).anInt418 == this.anInt1040) {
						this.anInt1006 = 1;
					}
					if (Class21.method256(local23).anInt418 == this.anInt1038) {
						this.anInt1006 = 3;
					}
				}
				if (local28 == 192) {
					this.aClass2_Sub1_Sub4_6.method83(44);
					this.aClass2_Sub1_Sub4_6.method85(local23);
					local694 = Class21.method256(local23);
					if (local694.anIntArrayArray6 != null && local694.anIntArrayArray6[0][0] == 5) {
						local58 = local694.anIntArrayArray6[0][1];
						if (this.anIntArray274[local58] != local694.anIntArray73[0]) {
							this.anIntArray274[local58] = local694.anIntArray73[0];
							this.method693(local58);
							this.aBoolean243 = true;
						}
					}
				}
				@Pc(956) Class2_Sub1_Sub2_Sub1_Sub1 local956;
				if (local28 == 988) {
					local956 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local33];
					if (local956 != null) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local956.anIntArray51[0], 0, local956.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						this.aClass2_Sub1_Sub4_6.method83(71);
						this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
					}
				}
				if (local28 == 33) {
					this.method591((byte) 2, local18, local33, local23);
					this.aClass2_Sub1_Sub4_6.method83(86);
					this.aClass2_Sub1_Sub4_6.method118(local33 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub4_6.method85(local23 + this.anInt906);
					this.aClass2_Sub1_Sub4_6.method85(local18 + this.anInt905);
				}
				if (local28 == 18) {
					if ((local23 & 0x3) == 0) {
						anInt998++;
					}
					if (anInt998 >= 125) {
						this.aClass2_Sub1_Sub4_6.method83(11);
						this.aClass2_Sub1_Sub4_6.method84(17);
						anInt998 = 0;
					}
					this.aClass2_Sub1_Sub4_6.method83(0);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local18);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local23);
					this.aClass2_Sub1_Sub4_6.method116(local33);
					this.anInt1003 = 0;
					this.anInt1004 = local23;
					this.anInt1005 = local18;
					this.anInt1006 = 2;
					if (Class21.method256(local23).anInt418 == this.anInt1040) {
						this.anInt1006 = 1;
					}
					if (Class21.method256(local23).anInt418 == this.anInt1038) {
						this.anInt1006 = 3;
					}
				}
				if (local28 == 871) {
					this.aClass2_Sub1_Sub4_6.method83(239);
					this.aClass2_Sub1_Sub4_6.method85(local18);
					this.aClass2_Sub1_Sub4_6.method118(local23);
					this.aClass2_Sub1_Sub4_6.method85(local33);
					this.anInt1003 = 0;
					this.anInt1004 = local23;
					this.anInt1005 = local18;
					this.anInt1006 = 2;
					if (Class21.method256(local23).anInt418 == this.anInt1040) {
						this.anInt1006 = 1;
					}
					if (Class21.method256(local23).anInt418 == this.anInt1038) {
						this.anInt1006 = 3;
					}
				}
				if (local28 == 567) {
					this.method689(this.anInt859);
					this.anInt859 = -1;
					this.aBoolean226 = true;
				}
				if (local28 == 862) {
					local312 = this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, false, local18, 0, local23, 0, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
					if (!local312) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local18, 0, local23, 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
					}
					this.anInt823 = super.anInt813;
					this.anInt824 = super.anInt814;
					this.anInt826 = 2;
					this.anInt825 = 0;
					this.aClass2_Sub1_Sub4_6.method83(74);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local23 + this.anInt906);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
					this.aClass2_Sub1_Sub4_6.method118(local18 + this.anInt905);
				}
				if (local28 == 20) {
					local105 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local33];
					if (local105 != null) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local105.anIntArray51[0], 0, local105.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						anInt943 += local33;
						if (anInt943 >= 114) {
							this.aClass2_Sub1_Sub4_6.method83(162);
							this.aClass2_Sub1_Sub4_6.method87(9118876);
							anInt943 = 0;
						}
						this.aClass2_Sub1_Sub4_6.method83(201);
						this.aClass2_Sub1_Sub4_6.method118(local33);
					}
				}
				if (local28 == 800) {
					this.method591((byte) 2, local18, local33, local23);
					this.aClass2_Sub1_Sub4_6.method83(119);
					this.aClass2_Sub1_Sub4_6.method116(local18 + this.anInt905);
					this.aClass2_Sub1_Sub4_6.method116(local33 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub4_6.method118(local23 + this.anInt906);
				}
				if (local28 == 359) {
					local956 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local33];
					if (local956 != null) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local956.anIntArray51[0], 0, local956.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						anInt903 += local33;
						if (anInt903 >= 132) {
							this.aClass2_Sub1_Sub4_6.method83(65);
							anInt903 = 0;
						}
						this.aClass2_Sub1_Sub4_6.method83(230);
						this.aClass2_Sub1_Sub4_6.method116(local33);
					}
				}
				if (local28 == 914) {
					this.aClass2_Sub1_Sub4_6.method83(127);
					this.aClass2_Sub1_Sub4_6.method118(local23);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
					this.aClass2_Sub1_Sub4_6.method116(local18);
					this.anInt1003 = 0;
					this.anInt1004 = local23;
					this.anInt1005 = local18;
					this.anInt1006 = 2;
					if (Class21.method256(local23).anInt418 == this.anInt1040) {
						this.anInt1006 = 1;
					}
					if (Class21.method256(local23).anInt418 == this.anInt1038) {
						this.anInt1006 = 3;
					}
				}
				if (local28 == 850) {
					local956 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local33];
					if (local956 != null) {
						this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local956.anIntArray51[0], 0, local956.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						this.aClass2_Sub1_Sub4_6.method83(134);
						this.aClass2_Sub1_Sub4_6.method118(local33);
						this.aClass2_Sub1_Sub4_6.method116(this.anInt995);
						this.aClass2_Sub1_Sub4_6.method118(this.anInt993);
						this.aClass2_Sub1_Sub4_6.method118(this.anInt994);
					}
				}
				if (local28 == 633) {
					this.method591((byte) 2, local18, local33, local23);
					this.aClass2_Sub1_Sub4_6.method83(84);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local18 + this.anInt905);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, local23 + this.anInt906);
				}
				if (local28 == 686) {
					local694 = Class21.method256(local23);
					this.anInt852 = 1;
					this.anInt853 = local23;
					this.anInt854 = local694.anInt428;
					this.anInt992 = 0;
					this.aBoolean243 = true;
					local239 = local694.aString12;
					if (local239.indexOf(" ") != -1) {
						local239 = local239.substring(0, local239.indexOf(" "));
					}
					local572 = local694.aString12;
					if (local572.indexOf(" ") != -1) {
						local572 = local572.substring(local572.indexOf(" ") + 1);
					}
					this.aString17 = local239 + " " + local694.aString8 + " " + local572;
					if (this.anInt854 == 16) {
						this.aBoolean243 = true;
						this.anInt944 = 3;
						this.aBoolean230 = true;
					}
				} else {
					if (local28 == 361) {
						local105 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local105 != null) {
							this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local105.anIntArray51[0], 0, local105.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
							this.anInt823 = super.anInt813;
							this.anInt824 = super.anInt814;
							this.anInt826 = 2;
							this.anInt825 = 0;
							this.aClass2_Sub1_Sub4_6.method83(60);
							this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
						}
					}
					if (local28 == 283) {
						local956 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local956 != null) {
							this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local956.anIntArray51[0], 0, local956.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
							this.anInt823 = super.anInt813;
							this.anInt824 = super.anInt814;
							this.anInt826 = 2;
							this.anInt825 = 0;
							this.aClass2_Sub1_Sub4_6.method83(40);
							this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
							this.aClass2_Sub1_Sub4_6.method118(this.anInt853);
						}
					}
					if (local28 == 784) {
						local312 = this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, false, local18, 0, local23, 0, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						if (!local312) {
							this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local18, 0, local23, 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						}
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						this.aClass2_Sub1_Sub4_6.method83(244);
						this.aClass2_Sub1_Sub4_6.method116(local33);
						this.aClass2_Sub1_Sub4_6.method117((byte) 5, local23 + this.anInt906);
						this.aClass2_Sub1_Sub4_6.method118(local18 + this.anInt905);
					}
					if (local28 == 341) {
						local312 = this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, false, local18, 0, local23, 0, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						if (!local312) {
							this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local18, 0, local23, 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						}
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						this.aClass2_Sub1_Sub4_6.method83(187);
						this.aClass2_Sub1_Sub4_6.method116(local23 + this.anInt906);
						this.aClass2_Sub1_Sub4_6.method118(this.anInt994);
						this.aClass2_Sub1_Sub4_6.method116(this.anInt995);
						this.aClass2_Sub1_Sub4_6.method85(this.anInt993);
						this.aClass2_Sub1_Sub4_6.method85(local33);
						this.aClass2_Sub1_Sub4_6.method118(local18 + this.anInt905);
					}
					if (local28 == 647) {
						local312 = this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, false, local18, 0, local23, 0, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						if (!local312) {
							this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local18, 0, local23, 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
						}
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 2;
						this.anInt825 = 0;
						this.aClass2_Sub1_Sub4_6.method83(66);
						this.aClass2_Sub1_Sub4_6.method85(local33);
						this.aClass2_Sub1_Sub4_6.method116(local23 + this.anInt906);
						this.aClass2_Sub1_Sub4_6.method118(local18 + this.anInt905);
					}
					if (local28 == 269) {
						local956 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local956 != null) {
							this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local956.anIntArray51[0], 0, local956.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
							this.anInt823 = super.anInt813;
							this.anInt824 = super.anInt814;
							this.anInt826 = 2;
							this.anInt825 = 0;
							this.aClass2_Sub1_Sub4_6.method83(107);
							this.aClass2_Sub1_Sub4_6.method85(local33);
						}
					}
					if (local28 == 76) {
						this.method591((byte) 2, local18, local33, local23);
						this.aClass2_Sub1_Sub4_6.method83(128);
						this.aClass2_Sub1_Sub4_6.method116(local23 + this.anInt906);
						this.aClass2_Sub1_Sub4_6.method116(local33 >> 14 & 0x7FFF);
						this.aClass2_Sub1_Sub4_6.method85(local18 + this.anInt905);
					}
					if (local28 == 959) {
						anInt938 += local23;
						if (anInt938 >= 132) {
							this.aClass2_Sub1_Sub4_6.method83(173);
							anInt938 = 0;
						}
						this.aClass2_Sub1_Sub4_6.method83(249);
						this.aClass2_Sub1_Sub4_6.method85(local33);
						this.aClass2_Sub1_Sub4_6.method116(local18);
						this.aClass2_Sub1_Sub4_6.method118(local23);
						this.anInt1003 = 0;
						this.anInt1004 = local23;
						this.anInt1005 = local18;
						this.anInt1006 = 2;
						if (Class21.method256(local23).anInt418 == this.anInt1040) {
							this.anInt1006 = 1;
						}
						if (Class21.method256(local23).anInt418 == this.anInt1038) {
							this.anInt1006 = 3;
						}
					}
					if (local28 == 137) {
						this.aClass2_Sub1_Sub4_6.method83(72);
						this.aClass2_Sub1_Sub4_6.method116(local33);
						this.aClass2_Sub1_Sub4_6.method118(local23);
						this.aClass2_Sub1_Sub4_6.method85(local18);
						this.anInt1003 = 0;
						this.anInt1004 = local23;
						this.anInt1005 = local18;
						this.anInt1006 = 2;
						if (Class21.method256(local23).anInt418 == this.anInt1040) {
							this.anInt1006 = 1;
						}
						if (Class21.method256(local23).anInt418 == this.anInt1038) {
							this.anInt1006 = 3;
						}
					}
					if (local28 == 601) {
						this.aClass2_Sub1_Sub4_6.method83(149);
						this.aClass2_Sub1_Sub4_6.method116(local33);
						this.aClass2_Sub1_Sub4_6.method85(local18);
						this.aClass2_Sub1_Sub4_6.method117((byte) 5, local23);
						this.anInt1003 = 0;
						this.anInt1004 = local23;
						this.anInt1005 = local18;
						this.anInt1006 = 2;
						if (Class21.method256(local23).anInt418 == this.anInt1040) {
							this.anInt1006 = 1;
						}
						if (Class21.method256(local23).anInt418 == this.anInt1038) {
							this.anInt1006 = 3;
						}
					}
					if (local28 == 562) {
						this.aClass2_Sub1_Sub4_6.method83(202);
						this.aClass2_Sub1_Sub4_6.method85(this.anInt853);
						this.aClass2_Sub1_Sub4_6.method116(local18);
						this.aClass2_Sub1_Sub4_6.method85(local23);
						this.aClass2_Sub1_Sub4_6.method116(local33);
						this.anInt1003 = 0;
						this.anInt1004 = local23;
						this.anInt1005 = local18;
						this.anInt1006 = 2;
						if (Class21.method256(local23).anInt418 == this.anInt1040) {
							this.anInt1006 = 1;
						}
						if (Class21.method256(local23).anInt418 == this.anInt1038) {
							this.anInt1006 = 3;
						}
					}
					if (local28 == 1675) {
						local230 = Class19.method221(local33);
						@Pc(2463) Class21 local2463 = Class21.method256(local23);
						if (local2463 != null && local2463.anIntArray74[local18] >= 100000) {
							local239 = local2463.anIntArray74[local18] + " x " + local230.aString7;
						} else if (local230.aByteArray6 == null) {
							local239 = "It's a " + local230.aString7 + ".";
						} else {
							local239 = new String(local230.aByteArray6);
						}
						this.method690((byte) 3, 0, local239, "");
					}
					if (local28 == 509) {
						this.aClass2_Sub1_Sub4_6.method83(44);
						this.aClass2_Sub1_Sub4_6.method85(local23);
						local694 = Class21.method256(local23);
						if (local694.anIntArrayArray6 != null && local694.anIntArrayArray6[0][0] == 5) {
							local58 = local694.anIntArrayArray6[0][1];
							this.anIntArray274[local58] = 1 - this.anIntArray274[local58];
							this.method693(local58);
							this.aBoolean243 = true;
						}
					}
					if (local28 == 407) {
						this.method706();
					}
					if (local28 == 711) {
						this.anInt992 = 1;
						this.anInt993 = local18;
						this.anInt994 = local23;
						this.anInt995 = local33;
						this.aString28 = Class19.method221(local33).aString7;
						this.anInt852 = 0;
						this.aBoolean243 = true;
					} else {
						@Pc(2624) int local2624;
						if (local28 == 765) {
							local54 = this.aStringArray10[arg0];
							local58 = local54.indexOf("@whi@");
							if (local58 != -1) {
								local69 = Class18.method206(local54.substring(local58 + 5).trim());
								local2624 = -1;
								for (@Pc(2626) int local2626 = 0; local2626 < this.anInt898; local2626++) {
									if (this.aLongArray3[local2626] == local69) {
										local2624 = local2626;
										break;
									}
								}
								if (local2624 != -1 && this.anIntArray258[local2624] > 0) {
									this.aBoolean226 = true;
									this.anInt996 = 0;
									this.aBoolean253 = true;
									this.aString25 = "";
									this.anInt1023 = 3;
									this.aLong33 = this.aLongArray3[local2624];
									this.aString29 = "Enter message to send to " + this.aStringArray9[local2624];
								}
							}
						}
						if (local28 == 511) {
							anInt894++;
							if (anInt894 >= 93) {
								this.aClass2_Sub1_Sub4_6.method83(3);
								this.aClass2_Sub1_Sub4_6.method87(12090599);
								anInt894 = 0;
							}
							this.aClass2_Sub1_Sub4_6.method83(28);
							this.aClass2_Sub1_Sub4_6.method117((byte) 5, local23);
							this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
							this.aClass2_Sub1_Sub4_6.method118(local18);
							this.anInt1003 = 0;
							this.anInt1004 = local23;
							this.anInt1005 = local18;
							this.anInt1006 = 2;
							if (Class21.method256(local23).anInt418 == this.anInt1040) {
								this.anInt1006 = 1;
							}
							if (Class21.method256(local23).anInt418 == this.anInt1038) {
								this.anInt1006 = 3;
							}
						}
						if (local28 == 111) {
							local956 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local33];
							if (local956 != null) {
								this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local956.anIntArray51[0], 0, local956.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
								this.anInt823 = super.anInt813;
								this.anInt824 = super.anInt814;
								this.anInt826 = 2;
								this.anInt825 = 0;
								anInt942 += local33;
								if (anInt942 >= 139) {
									this.aClass2_Sub1_Sub4_6.method83(203);
									this.aClass2_Sub1_Sub4_6.method87(11800411);
									anInt942 = 0;
								}
								this.aClass2_Sub1_Sub4_6.method83(229);
								this.aClass2_Sub1_Sub4_6.method116(local33);
							}
						}
						if (local28 == 446) {
							local105 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local33];
							if (local105 != null) {
								this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local105.anIntArray51[0], 0, local105.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
								this.anInt823 = super.anInt813;
								this.anInt824 = super.anInt814;
								this.anInt826 = 2;
								this.anInt825 = 0;
								this.aClass2_Sub1_Sub4_6.method83(41);
								this.aClass2_Sub1_Sub4_6.method118(local33);
							}
						}
						if (local28 == 164) {
							this.aClass2_Sub1_Sub4_6.method83(133);
							this.aClass2_Sub1_Sub4_6.method85(local18);
							this.aClass2_Sub1_Sub4_6.method117((byte) 5, local23);
							this.aClass2_Sub1_Sub4_6.method85(local33);
							this.anInt1003 = 0;
							this.anInt1004 = local23;
							this.anInt1005 = local18;
							this.anInt1006 = 2;
							if (Class21.method256(local23).anInt418 == this.anInt1040) {
								this.anInt1006 = 1;
							}
							if (Class21.method256(local23).anInt418 == this.anInt1038) {
								this.anInt1006 = 3;
							}
						}
						if (local28 == 208) {
							local54 = this.aStringArray10[arg0];
							local58 = local54.indexOf("@whi@");
							if (local58 != -1) {
								if (this.anInt1040 == -1) {
									this.method706();
									this.aString24 = local54.substring(local58 + 5).trim();
									this.aBoolean265 = false;
									this.anInt997 = this.anInt1040 = Class21.anInt434;
								} else {
									this.method690((byte) 3, 0, "Please close the interface you have open before using 'report abuse'", "");
								}
							}
						}
						if (local28 == 58) {
							local312 = this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, false, local18, 0, local23, 0, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
							if (!local312) {
								this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local18, 0, local23, 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
							}
							this.anInt823 = super.anInt813;
							this.anInt824 = super.anInt814;
							this.anInt826 = 2;
							this.anInt825 = 0;
							this.aClass2_Sub1_Sub4_6.method83(197);
							this.aClass2_Sub1_Sub4_6.method85(local33);
							this.aClass2_Sub1_Sub4_6.method117((byte) 5, local18 + this.anInt905);
							this.aClass2_Sub1_Sub4_6.method118(local23 + this.anInt906);
						}
						if (local28 == 625) {
							local956 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local33];
							if (local956 != null) {
								this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local956.anIntArray51[0], 0, local956.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
								this.anInt823 = super.anInt813;
								this.anInt824 = super.anInt814;
								this.anInt826 = 2;
								this.anInt825 = 0;
								anInt904 += local33;
								if (anInt904 >= 119) {
									this.aClass2_Sub1_Sub4_6.method83(196);
									this.aClass2_Sub1_Sub4_6.method84(12);
									anInt904 = 0;
								}
								this.aClass2_Sub1_Sub4_6.method83(223);
								this.aClass2_Sub1_Sub4_6.method117((byte) 5, local33);
							}
						}
						if (local28 == 1860) {
							local956 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local33];
							if (local956 != null) {
								@Pc(3172) Class14 local3172 = local956.aClass14_1;
								if (local3172.anIntArray45 != null) {
									local3172 = local3172.method191();
								}
								if (local3172 != null) {
									if (local3172.aByteArray5 == null) {
										local572 = "It's a " + local3172.aString4 + ".";
									} else {
										local572 = new String(local3172.aByteArray5);
									}
									this.method690((byte) 3, 0, local572, "");
								}
							}
						}
						if (local28 == 748 && this.method591((byte) 2, local18, local33, local23)) {
							this.aClass2_Sub1_Sub4_6.method83(126);
							this.aClass2_Sub1_Sub4_6.method116(local33 >> 14 & 0x7FFF);
							this.aClass2_Sub1_Sub4_6.method117((byte) 5, this.anInt994);
							this.aClass2_Sub1_Sub4_6.method117((byte) 5, this.anInt993);
							this.aClass2_Sub1_Sub4_6.method118(local18 + this.anInt905);
							this.aClass2_Sub1_Sub4_6.method116(local23 + this.anInt906);
							this.aClass2_Sub1_Sub4_6.method116(this.anInt995);
						}
						if (local28 == 65 || local28 == 426) {
							local54 = this.aStringArray10[arg0];
							local58 = local54.indexOf("@whi@");
							if (local58 != -1) {
								local54 = local54.substring(local58 + 5).trim();
								local572 = Class18.method210(Class18.method207(this.aBoolean255, Class18.method206(local54)));
								@Pc(3302) boolean local3302 = false;
								for (local2624 = 0; local2624 < this.anInt1020; local2624++) {
									@Pc(3314) Class2_Sub1_Sub2_Sub1_Sub2 local3314 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray272[local2624]];
									if (local3314 != null && local3314.aString6 != null && local3314.aString6.equalsIgnoreCase(local572)) {
										this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local3314.anIntArray51[0], 0, local3314.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
										if (local28 == 65) {
											anInt1028++;
											if (anInt1028 >= 95) {
												this.aClass2_Sub1_Sub4_6.method83(141);
												this.aClass2_Sub1_Sub4_6.method84(118);
												anInt1028 = 0;
											}
											this.aClass2_Sub1_Sub4_6.method83(209);
											this.aClass2_Sub1_Sub4_6.method85(this.anIntArray272[local2624]);
										}
										if (local28 == 426) {
											this.aClass2_Sub1_Sub4_6.method83(25);
											this.aClass2_Sub1_Sub4_6.method117((byte) 5, this.anIntArray272[local2624]);
										}
										local3302 = true;
										break;
									}
								}
								if (!local3302) {
									this.method690((byte) 3, 0, "Unable to find " + local572, "");
								}
							}
						}
						if (local28 == 349) {
							local105 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local33];
							if (local105 != null) {
								this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 1, false, local105.anIntArray51[0], 0, local105.anIntArray52[0], 1, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 2);
								this.anInt823 = super.anInt813;
								this.anInt824 = super.anInt814;
								this.anInt826 = 2;
								this.anInt825 = 0;
								anInt1028++;
								if (anInt1028 >= 95) {
									this.aClass2_Sub1_Sub4_6.method83(141);
									this.aClass2_Sub1_Sub4_6.method84(118);
									anInt1028 = 0;
								}
								this.aClass2_Sub1_Sub4_6.method83(209);
								this.aClass2_Sub1_Sub4_6.method85(local33);
							}
						}
						this.anInt992 = 0;
						this.anInt852 = 0;
						this.aBoolean243 = true;
					}
				}
			}
		} catch (@Pc(3517) RuntimeException local3517) {
			signlink.reporterror("51328, " + false + ", " + arg0 + ", " + local3517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method601(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aByte44 == 7) {
				@Pc(7) boolean local7 = false;
			} else {
				this.anInt832 = this.aClass2_Sub1_Sub4_9.method94();
			}
			@Pc(17) Class21 local17 = Class21.method256(arg1);
			for (@Pc(19) int local19 = 0; local19 < local17.anIntArray69.length && local17.anIntArray69[local19] != -1; local19++) {
				@Pc(33) Class21 local33 = Class21.method256(local17.anIntArray69[local19]);
				if (local33.anInt425 == 1) {
					this.method601((byte) 7, local33.anInt422);
				}
				local33.anInt421 = 0;
				local33.anInt404 = 0;
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("70648, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method602(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString26 = "";
				this.aString27 = "Connecting to server...";
				this.method627(true);
			}
			this.aClass32_1 = new Class32(this, (byte) 5, this.method590(anInt892 + 43594));
			@Pc(30) long local30 = Class18.method206(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass2_Sub1_Sub4_6.anInt166 = 0;
			this.aClass2_Sub1_Sub4_6.method84(14);
			this.aClass2_Sub1_Sub4_6.method84(local37);
			this.aClass32_1.method322(this.aClass2_Sub1_Sub4_6.aByteArray2, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass32_1.method319();
			}
			@Pc(74) int local74 = this.aClass32_1.method319();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass32_1.method321(this.aClass2_Sub1_Sub4_9.aByteArray2, 0, 8);
				this.aClass2_Sub1_Sub4_9.anInt166 = 0;
				this.aLong30 = this.aClass2_Sub1_Sub4_9.method100();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong30 >> 32), (int) this.aLong30 };
				this.aClass2_Sub1_Sub4_6.anInt166 = 0;
				this.aClass2_Sub1_Sub4_6.method84(10);
				this.aClass2_Sub1_Sub4_6.method88(local99[0]);
				this.aClass2_Sub1_Sub4_6.method88(local99[1]);
				this.aClass2_Sub1_Sub4_6.method88(local99[2]);
				this.aClass2_Sub1_Sub4_6.method88(local99[3]);
				this.aClass2_Sub1_Sub4_6.method88(signlink.anInt1045);
				this.aClass2_Sub1_Sub4_6.method91(arg0);
				this.aClass2_Sub1_Sub4_6.method91(arg1);
				this.aClass2_Sub1_Sub4_6.method109(aBigInteger1, aBigInteger2);
				this.aClass2_Sub1_Sub4_8.anInt166 = 0;
				if (arg2) {
					this.aClass2_Sub1_Sub4_8.method84(18);
				} else {
					this.aClass2_Sub1_Sub4_8.method84(16);
				}
				this.aClass2_Sub1_Sub4_8.method84(this.aClass2_Sub1_Sub4_6.anInt166 + 36 + 1 + 1 + 2);
				this.aClass2_Sub1_Sub4_8.method84(255);
				this.aClass2_Sub1_Sub4_8.method85(336);
				this.aClass2_Sub1_Sub4_8.method84(aBoolean236 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass2_Sub1_Sub4_8.method88(this.anIntArray261[local225]);
				}
				this.aClass2_Sub1_Sub4_8.method92(this.aClass2_Sub1_Sub4_6.anInt166, this.aClass2_Sub1_Sub4_6.aByteArray2);
				this.aClass2_Sub1_Sub4_6.aClass11_1 = new Class11(local99, 711);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass11_2 = new Class11(local99, 711);
				this.aClass32_1.method322(this.aClass2_Sub1_Sub4_8.aByteArray2, this.aClass2_Sub1_Sub4_8.anInt166);
				local74 = this.aClass32_1.method319();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method602(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt1027 = this.aClass32_1.method319();
					aBoolean232 = this.aClass32_1.method319() == 1;
					this.aLong32 = 0L;
					this.anInt875 = 0;
					this.aClass5_1.anInt100 = 0;
					super.aBoolean222 = true;
					this.aBoolean228 = true;
					this.aBoolean262 = true;
					this.aClass2_Sub1_Sub4_6.anInt166 = 0;
					this.aClass2_Sub1_Sub4_9.anInt166 = 0;
					this.anInt832 = -1;
					this.anInt920 = -1;
					this.anInt921 = -1;
					this.anInt922 = -1;
					this.anInt831 = 0;
					this.anInt833 = 0;
					this.anInt955 = 0;
					this.anInt835 = 0;
					this.anInt931 = 0;
					this.anInt1043 = 0;
					this.aBoolean248 = false;
					super.anInt805 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray12[local389] = null;
					}
					this.anInt992 = 0;
					this.anInt852 = 0;
					this.anInt1030 = 0;
					this.anInt1000 = 0;
					this.anInt889 = (int) (Math.random() * 100.0D) - 50;
					this.anInt842 = (int) (Math.random() * 110.0D) - 55;
					this.anInt911 = (int) (Math.random() * 80.0D) - 40;
					this.anInt974 = (int) (Math.random() * 120.0D) - 60;
					this.anInt1015 = (int) (Math.random() * 30.0D) - 20;
					this.anInt865 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt979 = 0;
					this.anInt990 = -1;
					this.anInt964 = 0;
					this.anInt965 = 0;
					this.anInt1020 = 0;
					this.anInt901 = 0;
					for (local225 = 0; local225 < this.anInt1018; local225++) {
						this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local225] = null;
						this.aClass2_Sub1_Sub4Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local259] = null;
					}
					aClass2_Sub1_Sub2_Sub1_Sub2_1 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[this.anInt1019] = new Class2_Sub1_Sub2_Sub1_Sub2();
					this.aClass48_11.method569();
					this.aClass48_12.method569();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass48ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass48_10 = new Class48(-489);
					this.anInt899 = 0;
					this.anInt898 = 0;
					this.method689(this.anInt859);
					this.anInt859 = -1;
					this.method689(this.anInt1038);
					this.anInt1038 = -1;
					this.method689(this.anInt1040);
					this.anInt1040 = -1;
					this.method689(this.anInt1037);
					this.anInt1037 = -1;
					this.method689(this.anInt919);
					this.anInt919 = -1;
					this.method689(this.anInt1002);
					this.anInt1002 = -1;
					this.aBoolean267 = false;
					this.anInt944 = 3;
					this.anInt996 = 0;
					this.aBoolean248 = false;
					this.aBoolean253 = false;
					this.aString19 = null;
					this.anInt962 = 0;
					this.anInt1024 = -1;
					this.aBoolean240 = true;
					this.method641();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray255[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray13[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt1028 = 0;
					anInt942 = 0;
					anInt903 = 0;
					anInt998 = 0;
					anInt938 = 0;
					anInt904 = 0;
					anInt894 = 0;
					anInt982 = 0;
					anInt943 = 0;
					this.method672();
				} else if (local74 == 3) {
					this.aString26 = "";
					this.aString27 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString26 = "Your account has been disabled.";
					this.aString27 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString26 = "Your account is already logged in.";
					this.aString27 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString26 = "RuneScape has been updated!";
					this.aString27 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString26 = "This world is full.";
					this.aString27 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString26 = "Unable to connect.";
					this.aString27 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString26 = "Login limit exceeded.";
					this.aString27 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString26 = "Unable to connect.";
					this.aString27 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString26 = "Login server rejected session.";
					this.aString27 = "Please try again.";
				} else if (local74 == 12) {
					this.aString26 = "You need a members account to login to this world.";
					this.aString27 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString26 = "Could not complete login.";
					this.aString27 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString26 = "The server is being updated.";
					this.aString27 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean262 = true;
					this.aClass2_Sub1_Sub4_6.anInt166 = 0;
					this.aClass2_Sub1_Sub4_9.anInt166 = 0;
					this.anInt832 = -1;
					this.anInt920 = -1;
					this.anInt921 = -1;
					this.anInt922 = -1;
					this.anInt831 = 0;
					this.anInt833 = 0;
					this.anInt955 = 0;
					this.anInt1043 = 0;
					this.aBoolean248 = false;
					this.aLong29 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString26 = "Login attempts exceeded.";
					this.aString27 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString26 = "You are standing in a members-only area.";
					this.aString27 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString26 = "Invalid loginserver requested";
					this.aString27 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass32_1.method319();
					for (@Pc(909) int local909 = local389 + 3; local909 >= 0; local909--) {
						this.aString26 = "You have only just left another world";
						this.aString27 = "Your profile will be transferred in: " + local909;
						this.method627(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(931) Exception local931) {
						}
					}
					this.method602(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString26 = "Malformed login packet.";
					this.aString27 = "Please try again.";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString26 = "Unexpected server response";
					this.aString27 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString26 = "No response from server";
					this.aString27 = "Please try using a different world.";
				} else if (this.anInt949 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(963) Exception local963) {
					}
					this.anInt949++;
					this.method602(arg0, arg1, arg2);
				} else {
					this.aString26 = "No response from loginserver";
					this.aString27 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1006) IOException local1006) {
			this.aString26 = "";
			this.aString27 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method603(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean236) {
				@Pc(22) Class2_Sub1_Sub1_Sub3 local22;
				@Pc(30) int local30;
				@Pc(38) int local38;
				@Pc(41) byte[] local41;
				@Pc(44) byte[] local44;
				@Pc(46) int local46;
				if (Class2_Sub1_Sub1_Sub1.anIntArray9[17] >= arg0) {
					local22 = Class2_Sub1_Sub1_Sub1.aClass2_Sub1_Sub1_Sub3Array1[17];
					local30 = local22.anInt547 * local22.anInt548 - 1;
					local38 = local22.anInt547 * this.anInt850 * 2;
					local41 = local22.aByteArray13;
					local44 = this.aByteArray21;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray13 = local44;
					this.aByteArray21 = local41;
					Class2_Sub1_Sub1_Sub1.method39(17);
				}
				if (Class2_Sub1_Sub1_Sub1.anIntArray9[24] >= arg0) {
					local22 = Class2_Sub1_Sub1_Sub1.aClass2_Sub1_Sub1_Sub3Array1[24];
					local30 = local22.anInt547 * local22.anInt548 - 1;
					local38 = local22.anInt547 * this.anInt850 * 2;
					local41 = local22.aByteArray13;
					local44 = this.aByteArray21;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray13 = local44;
					this.aByteArray21 = local41;
					Class2_Sub1_Sub1_Sub1.method39(24);
				}
				if (Class2_Sub1_Sub1_Sub1.anIntArray9[34] >= arg0) {
					local22 = Class2_Sub1_Sub1_Sub1.aClass2_Sub1_Sub1_Sub3Array1[34];
					local30 = local22.anInt547 * local22.anInt548 - 1;
					local38 = local22.anInt547 * this.anInt850 * 2;
					local41 = local22.aByteArray13;
					local44 = this.aByteArray21;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray13 = local44;
					this.aByteArray21 = local41;
					Class2_Sub1_Sub1_Sub1.method39(34);
					return;
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("93322, " + false + ", " + arg0 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method604() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt1020; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt1019;
				} else {
					local11 = this.anIntArray272[local3];
				}
				@Pc(23) Class2_Sub1_Sub2_Sub1_Sub2 local23 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method656(1, local23);
				}
			}
			anInt966++;
			if (anInt966 > 67) {
				anInt966 = 0;
				this.aClass2_Sub1_Sub4_6.method83(222);
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("88459, " + -242 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method605() {
		try {
			if (super.aClass42_2 == null) {
				this.method719();
				this.aClass42_15 = null;
				this.aClass42_16 = null;
				this.aClass42_17 = null;
				this.aClass42_18 = null;
				this.aClass42_19 = null;
				this.aClass42_20 = null;
				this.aClass42_21 = null;
				this.aClass42_22 = null;
				this.aClass42_23 = null;
				this.aClass42_27 = null;
				this.aBoolean262 &= true;
				this.aClass42_25 = null;
				this.aClass42_24 = null;
				this.aClass42_26 = null;
				this.aClass42_12 = null;
				this.aClass42_13 = null;
				this.aClass42_14 = null;
				super.aClass42_2 = new Class42(765, true, this.method583(), 503);
				this.aBoolean246 = true;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("50693, " + true + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method606() {
		try {
			try {
				if (this.aClass32_1 != null) {
					this.aClass32_1.method318();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass32_1 = null;
			this.aBoolean262 = false;
			this.anInt895 = 0;
			this.aString22 = "";
			this.aString23 = "";
			this.method638();
			if (this.aByte50 != -87) {
				this.aBoolean239 = !this.aBoolean239;
			}
			this.aClass47_1.method507();
			for (@Pc(43) int local43 = 0; local43 < 4; local43++) {
				this.aClass45Array1[local43].method465();
			}
			System.gc();
			this.method651();
			this.anInt884 = -1;
			this.anInt827 = -1;
			this.anInt1013 = 0;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("38035, " + -87 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIIIIIII)Z")
	private boolean method607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray22[local7][local11] = 99999999;
				}
			}
			local11 = arg9;
			@Pc(39) int local39 = arg0;
			this.anIntArrayArray25[arg9][arg0] = 99;
			this.anIntArrayArray22[arg9][arg0] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray264[0] = arg9;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray265[0] = arg0;
			@Pc(76) boolean local76 = false;
			@Pc(80) int local80 = this.anIntArray264.length;
			@Pc(87) int[][] local87 = this.aClass45Array1[this.anInt909].anIntArrayArray16;
			@Pc(198) int local198;
			while (local57 != local66) {
				local11 = this.anIntArray264[local57];
				local39 = this.anIntArray265[local57];
				local57 = (local57 + 1) % local80;
				if (local11 == arg3 && local39 == arg5) {
					local76 = true;
					break;
				}
				if (arg8 != 0) {
					if ((arg8 < 5 || arg8 == 10) && this.aClass45Array1[this.anInt909].method474(arg8 - 1, 907, local39, arg3, local11, arg5, arg4)) {
						local76 = true;
						break;
					}
					if (arg8 < 10 && this.aClass45Array1[this.anInt909].method475(arg8 - 1, arg3, local11, local39, arg4, arg5)) {
						local76 = true;
						break;
					}
				}
				if (arg1 != 0 && arg6 != 0 && this.aClass45Array1[this.anInt909].method476(local11, arg7, local39, arg3, arg5, arg1, arg6)) {
					local76 = true;
					break;
				}
				local198 = this.anIntArrayArray22[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local87[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray264[local66] = local11 - 1;
					this.anIntArray265[local66] = local39;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray22[local11 - 1][local39] = local198;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local87[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray264[local66] = local11 + 1;
					this.anIntArray265[local66] = local39;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray22[local11 + 1][local39] = local198;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local87[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray264[local66] = local11;
					this.anIntArray265[local66] = local39 - 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray22[local11][local39 - 1] = local198;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local87[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray264[local66] = local11;
					this.anIntArray265[local66] = local39 + 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray22[local11][local39 + 1] = local198;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local87[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local87[local11 - 1][local39] & 0x1280108) == 0 && (local87[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray264[local66] = local11 - 1;
					this.anIntArray265[local66] = local39 - 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = local198;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local87[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local87[local11 + 1][local39] & 0x1280180) == 0 && (local87[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray264[local66] = local11 + 1;
					this.anIntArray265[local66] = local39 - 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = local198;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local87[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local87[local11 - 1][local39] & 0x1280108) == 0 && (local87[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray264[local66] = local11 - 1;
					this.anIntArray265[local66] = local39 + 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = local198;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local87[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local87[local11 + 1][local39] & 0x1280180) == 0 && (local87[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray264[local66] = local11 + 1;
					this.anIntArray265[local66] = local39 + 1;
					local66 = (local66 + 1) % local80;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = local198;
				}
			}
			this.anInt973 = 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local76) {
				if (arg2) {
					local198 = 100;
					for (local814 = 1; local814 < 2; local814++) {
						for (local820 = arg3 - local814; local820 <= arg3 + local814; local820++) {
							for (local826 = arg5 - local814; local826 <= arg5 + local814; local826++) {
								if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray22[local820][local826] < local198) {
									local198 = this.anIntArrayArray22[local820][local826];
									local11 = local820;
									local39 = local826;
									this.anInt973 = 1;
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
			this.anIntArray264[0] = local11;
			local57 = local887 + 1;
			this.anIntArray265[0] = local39;
			local198 = local814 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg9 || local39 != arg0) {
				if (local198 != local814) {
					local814 = local198;
					this.anIntArray264[local57] = local11;
					this.anIntArray265[local57++] = local39;
				}
				if ((local198 & 0x2) != 0) {
					local11++;
				} else if ((local198 & 0x8) != 0) {
					local11--;
				}
				if ((local198 & 0x1) != 0) {
					local39++;
				} else if ((local198 & 0x4) != 0) {
					local39--;
				}
				local198 = this.anIntArrayArray25[local11][local39];
			}
			if (local57 > 0) {
				local80 = local57;
				if (local57 > 25) {
					local80 = 25;
				}
				local57--;
				local820 = this.anIntArray264[local57];
				local826 = this.anIntArray265[local57];
				anInt982++;
				if (anInt982 >= 101) {
					this.aClass2_Sub1_Sub4_6.method83(106);
					anInt982 = 0;
				}
				if (arg10 == 0) {
					this.aClass2_Sub1_Sub4_6.method83(225);
					this.aClass2_Sub1_Sub4_6.method84(local80 + local80 + 3);
				}
				if (arg10 == 1) {
					this.aClass2_Sub1_Sub4_6.method83(160);
					this.aClass2_Sub1_Sub4_6.method84(local80 + local80 + 3 + 14);
				}
				if (arg10 == 2) {
					this.aClass2_Sub1_Sub4_6.method83(234);
					this.aClass2_Sub1_Sub4_6.method84(local80 + local80 + 3);
				}
				this.aClass2_Sub1_Sub4_6.method116(local826 + this.anInt906);
				this.anInt964 = this.anIntArray264[0];
				this.anInt965 = this.anIntArray265[0];
				for (@Pc(1067) int local1067 = 1; local1067 < local80; local1067++) {
					local57--;
					this.aClass2_Sub1_Sub4_6.method110(this.anIntArray264[local57] - local820);
					this.aClass2_Sub1_Sub4_6.method110(this.anIntArray265[local57] - local826);
				}
				this.aClass2_Sub1_Sub4_6.method118(local820 + this.anInt905);
				this.aClass2_Sub1_Sub4_6.method84(super.anIntArray210[5] == 1 ? 1 : 0);
				return true;
			} else if (arg10 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1124) RuntimeException local1124) {
			signlink.reporterror("74804, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -36 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIB)Lclient!FNOQZAYQ;")
	private Class8 method608(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (this.aByte51 != 4) {
				aBoolean233 = !aBoolean233;
			}
			@Pc(13) byte[] local13 = null;
			@Pc(15) int local15 = 5;
			try {
				if (this.aClass12Array1[0] != null) {
					local13 = this.aClass12Array1[0].method178(arg4);
				}
			} catch (@Pc(30) Exception local30) {
			}
			@Pc(44) int local44;
			if (local13 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local13);
				local44 = (int) this.aCRC32_2.getValue();
				if (local44 != arg2) {
					local13 = null;
				}
			}
			if (local13 != null) {
				return new Class8(local13, 754);
			}
			local44 = 0;
			while (local13 == null) {
				@Pc(65) String local65 = "Unknown error";
				this.method585(arg3, "Requesting " + arg0);
				@Pc(80) int local80;
				try {
					local80 = 0;
					@Pc(91) DataInputStream local91 = this.method716(arg1 + arg2);
					@Pc(94) byte[] local94 = new byte[6];
					local91.readFully(local94, 0, 6);
					@Pc(105) Class2_Sub1_Sub4 local105 = new Class2_Sub1_Sub4(local94, aBoolean259);
					local105.anInt166 = 3;
					@Pc(113) int local113 = local105.method98() + 6;
					@Pc(115) int local115 = 6;
					local13 = new byte[local113];
					for (@Pc(120) int local120 = 0; local120 < 6; local120++) {
						local13[local120] = local94[local120];
					}
					@Pc(138) int local138;
					while (local115 < local113) {
						local138 = local113 - local115;
						if (local138 > 1000) {
							local138 = 1000;
						}
						@Pc(149) int local149 = local91.read(local13, local115, local138);
						if (local149 < 0) {
							(new StringBuffer("Length error: ")).append(local115).append("/").append(local113).toString();
							throw new IOException("EOF");
						}
						local115 += local149;
						@Pc(178) int local178 = local115 * 100 / local113;
						if (local178 != local80) {
							this.method585(arg3, "Loading " + arg0 + " - " + local178 + "%");
						}
						local80 = local178;
					}
					local91.close();
					try {
						if (this.aClass12Array1[0] != null) {
							this.aClass12Array1[0].method179(local13.length, local13, arg4);
						}
					} catch (@Pc(223) Exception local223) {
						this.aClass12Array1[0] = null;
					}
					if (local13 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local13);
						local138 = (int) this.aCRC32_2.getValue();
						if (local138 != arg2) {
							local13 = null;
							local44++;
							local65 = "Checksum error: " + local138;
						}
					}
				} catch (@Pc(258) IOException local258) {
					if (local65.equals("Unknown error")) {
						local65 = "Connection error";
					}
					local13 = null;
				} catch (@Pc(268) NullPointerException local268) {
					local65 = "Null error";
					local13 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(277) ArrayIndexOutOfBoundsException local277) {
					local65 = "Bounds error";
					local13 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(286) Exception local286) {
					local65 = "Unexpected error";
					local13 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local13 == null) {
					for (local80 = local15; local80 > 0; local80--) {
						if (local44 >= 3) {
							this.method585(arg3, "Game updated - please reload page");
							local80 = 10;
						} else {
							this.method585(arg3, local65 + " - Retrying in " + local80);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(330) Exception local330) {
						}
					}
					local15 *= 2;
					if (local15 > 60) {
						local15 = 60;
					}
					this.aBoolean225 = !this.aBoolean225;
				}
			}
			return new Class8(local13, 754);
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("16912, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 4 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method609(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt901; local1++) {
				@Pc(11) Class2_Sub1_Sub2_Sub1_Sub1 local11 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray236[local1]];
				@Pc(20) int local20 = (this.anIntArray236[local1] << 14) + 536870912;
				if (local11 != null && local11.method199() && local11.aClass14_1.aBoolean58 == arg1 && local11.aClass14_1.method186()) {
					@Pc(41) int local41 = local11.anInt285 >> 7;
					@Pc(46) int local46 = local11.anInt286 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt259 == 1 && (local11.anInt285 & 0x7F) == 64 && (local11.anInt286 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local41][local46] == this.anInt960) {
								continue;
							}
							this.anIntArrayArray24[local41][local46] = this.anInt960;
						}
						if (!local11.aClass14_1.aBoolean61) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass47_1.method518(local20, local11, local11.anInt286, local11.anInt287, this.method640(this.anInt909, local11.anInt285, local11.anInt286), (local11.anInt259 - 1) * 64 + 60, local11.anInt285, local11.aBoolean66, this.anInt909);
					}
				}
			}
			@Pc(140) boolean local140 = false;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("27510, " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LUAMUNXO;IIIIIII)V")
	private void method610(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg0.anInt425 == 0 && arg0.anIntArray69 != null && !arg0.aBoolean102 && (arg5 >= arg6 && arg2 >= arg1 && arg5 <= arg6 + arg0.anInt424 && arg2 <= arg1 + arg0.anInt436)) {
				@Pc(34) int local34 = arg0.anIntArray69.length;
				for (@Pc(41) int local41 = 0; local41 < local34; local41++) {
					@Pc(50) int local50 = arg0.anIntArray71[local41] + arg6;
					@Pc(59) int local59 = arg0.anIntArray72[local41] + arg1 - arg4;
					@Pc(65) Class21 local65 = Class21.method256(arg0.anIntArray69[local41]);
					@Pc(70) int local70 = local50 + local65.anInt432;
					@Pc(75) int local75 = local59 + local65.anInt415;
					if ((local65.anInt414 >= 0 || local65.anInt416 != 0) && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt424 && arg2 < local75 + local65.anInt436) {
						if (local65.anInt414 >= 0) {
							this.anInt886 = local65.anInt414;
						} else {
							this.anInt886 = local65.anInt422;
						}
					}
					if (local65.anInt425 == 8 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt424 && arg2 < local75 + local65.anInt436) {
						this.anInt836 = local65.anInt422;
					}
					if (local65.anInt425 == 0) {
						this.method610(local65, local75, arg2, arg3, local65.anInt419, arg5, local70);
						if (local65.anInt435 > local65.anInt436) {
							this.method636(arg5, local70 + local65.anInt424, local65.anInt435, arg2, arg3, local75, local65.anInt436, local65);
						}
					} else {
						if (local65.anInt413 == 1 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt424 && arg2 < local75 + local65.anInt436) {
							@Pc(199) boolean local199 = false;
							if (local65.anInt401 != 0) {
								local199 = this.method587(local65);
							}
							if (!local199) {
								this.aStringArray10[this.anInt1043] = local65.aString10;
								this.anIntArray248[this.anInt1043] = 236;
								this.anIntArray247[this.anInt1043] = local65.anInt422;
								this.anInt1043++;
							}
						}
						if (local65.anInt413 == 2 && this.anInt852 == 0 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt424 && arg2 < local75 + local65.anInt436) {
							@Pc(263) String local263 = local65.aString12;
							if (local263.indexOf(" ") != -1) {
								local263 = local263.substring(0, local263.indexOf(" "));
							}
							this.aStringArray10[this.anInt1043] = local263 + " @gre@" + local65.aString8;
							this.anIntArray248[this.anInt1043] = 686;
							this.anIntArray247[this.anInt1043] = local65.anInt422;
							this.anInt1043++;
						}
						if (local65.anInt413 == 3 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt424 && arg2 < local75 + local65.anInt436) {
							this.aStringArray10[this.anInt1043] = "Close";
							if (arg3 == 3) {
								this.anIntArray248[this.anInt1043] = 567;
							} else {
								this.anIntArray248[this.anInt1043] = 407;
							}
							this.anIntArray247[this.anInt1043] = local65.anInt422;
							this.anInt1043++;
						}
						if (local65.anInt413 == 4 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt424 && arg2 < local75 + local65.anInt436) {
							this.aStringArray10[this.anInt1043] = local65.aString10;
							this.anIntArray248[this.anInt1043] = 509;
							this.anIntArray247[this.anInt1043] = local65.anInt422;
							this.anInt1043++;
						}
						if (local65.anInt413 == 5 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt424 && arg2 < local75 + local65.anInt436) {
							this.aStringArray10[this.anInt1043] = local65.aString10;
							this.anIntArray248[this.anInt1043] = 192;
							this.anIntArray247[this.anInt1043] = local65.anInt422;
							this.anInt1043++;
						}
						if (local65.anInt413 == 6 && !this.aBoolean267 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt424 && arg2 < local75 + local65.anInt436) {
							this.aStringArray10[this.anInt1043] = local65.aString10;
							this.anIntArray248[this.anInt1043] = 591;
							this.anIntArray247[this.anInt1043] = local65.anInt422;
							this.anInt1043++;
						}
						if (local65.anInt425 == 2) {
							@Pc(522) int local522 = 0;
							for (@Pc(524) int local524 = 0; local524 < local65.anInt436; local524++) {
								for (@Pc(528) int local528 = 0; local528 < local65.anInt424; local528++) {
									@Pc(539) int local539 = local70 + local528 * (local65.anInt402 + 32);
									@Pc(548) int local548 = local75 + local524 * (local65.anInt429 + 32);
									if (local522 < 20) {
										local539 += local65.anIntArray70[local522];
										local548 += local65.anIntArray68[local522];
									}
									if (arg5 >= local539 && arg2 >= local548 && arg5 < local539 + 32 && arg2 < local548 + 32) {
										this.anInt977 = local522;
										this.anInt978 = local65.anInt422;
										if (local65.anIntArray66[local522] > 0) {
											@Pc(601) Class19 local601 = Class19.method221(local65.anIntArray66[local522] - 1);
											if (this.anInt992 == 1 && local65.aBoolean96) {
												if (local65.anInt422 != this.anInt994 || local522 != this.anInt993) {
													this.aStringArray10[this.anInt1043] = "Use " + this.aString28 + " with @lre@" + local601.aString7;
													this.anIntArray248[this.anInt1043] = 526;
													this.anIntArray249[this.anInt1043] = local601.anInt353;
													this.anIntArray246[this.anInt1043] = local522;
													this.anIntArray247[this.anInt1043] = local65.anInt422;
													this.anInt1043++;
												}
											} else if (this.anInt852 != 1 || !local65.aBoolean96) {
												@Pc(738) int local738;
												if (local65.aBoolean96) {
													for (local738 = 4; local738 >= 3; local738--) {
														if (local601.aStringArray3 != null && local601.aStringArray3[local738] != null) {
															this.aStringArray10[this.anInt1043] = local601.aStringArray3[local738] + " @lre@" + local601.aString7;
															if (local738 == 3) {
																this.anIntArray248[this.anInt1043] = 503;
															}
															if (local738 == 4) {
																this.anIntArray248[this.anInt1043] = 914;
															}
															this.anIntArray249[this.anInt1043] = local601.anInt353;
															this.anIntArray246[this.anInt1043] = local522;
															this.anIntArray247[this.anInt1043] = local65.anInt422;
															this.anInt1043++;
														} else if (local738 == 4) {
															this.aStringArray10[this.anInt1043] = "Drop @lre@" + local601.aString7;
															this.anIntArray248[this.anInt1043] = 914;
															this.anIntArray249[this.anInt1043] = local601.anInt353;
															this.anIntArray246[this.anInt1043] = local522;
															this.anIntArray247[this.anInt1043] = local65.anInt422;
															this.anInt1043++;
														}
													}
												}
												if (local65.aBoolean98) {
													this.aStringArray10[this.anInt1043] = "Use @lre@" + local601.aString7;
													this.anIntArray248[this.anInt1043] = 711;
													this.anIntArray249[this.anInt1043] = local601.anInt353;
													this.anIntArray246[this.anInt1043] = local522;
													this.anIntArray247[this.anInt1043] = local65.anInt422;
													this.anInt1043++;
												}
												if (local65.aBoolean96 && local601.aStringArray3 != null) {
													for (local738 = 2; local738 >= 0; local738--) {
														if (local601.aStringArray3[local738] != null) {
															this.aStringArray10[this.anInt1043] = local601.aStringArray3[local738] + " @lre@" + local601.aString7;
															if (local738 == 0) {
																this.anIntArray248[this.anInt1043] = 871;
															}
															if (local738 == 1) {
																this.anIntArray248[this.anInt1043] = 164;
															}
															if (local738 == 2) {
																this.anIntArray248[this.anInt1043] = 137;
															}
															this.anIntArray249[this.anInt1043] = local601.anInt353;
															this.anIntArray246[this.anInt1043] = local522;
															this.anIntArray247[this.anInt1043] = local65.anInt422;
															this.anInt1043++;
														}
													}
												}
												if (local65.aStringArray5 != null) {
													for (local738 = 4; local738 >= 0; local738--) {
														if (local65.aStringArray5[local738] != null) {
															this.aStringArray10[this.anInt1043] = local65.aStringArray5[local738] + " @lre@" + local601.aString7;
															if (local738 == 0) {
																this.anIntArray248[this.anInt1043] = 959;
															}
															if (local738 == 1) {
																this.anIntArray248[this.anInt1043] = 433;
															}
															if (local738 == 2) {
																this.anIntArray248[this.anInt1043] = 18;
															}
															if (local738 == 3) {
																this.anIntArray248[this.anInt1043] = 601;
															}
															if (local738 == 4) {
																this.anIntArray248[this.anInt1043] = 511;
															}
															this.anIntArray249[this.anInt1043] = local601.anInt353;
															this.anIntArray246[this.anInt1043] = local522;
															this.anIntArray247[this.anInt1043] = local65.anInt422;
															this.anInt1043++;
														}
													}
												}
												this.aStringArray10[this.anInt1043] = "Examine @lre@" + local601.aString7;
												this.anIntArray248[this.anInt1043] = 1675;
												this.anIntArray249[this.anInt1043] = local601.anInt353;
												this.anIntArray246[this.anInt1043] = local522;
												this.anIntArray247[this.anInt1043] = local65.anInt422;
												this.anInt1043++;
											} else if ((this.anInt854 & 0x10) == 16) {
												this.aStringArray10[this.anInt1043] = this.aString17 + " @lre@" + local601.aString7;
												this.anIntArray248[this.anInt1043] = 562;
												this.anIntArray249[this.anInt1043] = local601.anInt353;
												this.anIntArray246[this.anInt1043] = local522;
												this.anIntArray247[this.anInt1043] = local65.anInt422;
												this.anInt1043++;
											}
										}
									}
									local522++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1168) RuntimeException local1168) {
			signlink.reporterror("3442, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method611() {
		try {
			@Pc(6) int local6 = this.anInt876 * 128 + 64;
			@Pc(13) int local13 = this.anInt877 * 128 + 64;
			@Pc(24) int local24 = this.method640(this.anInt909, local6, local13) - this.anInt878;
			if (this.anInt923 < local6) {
				this.anInt923 += this.anInt879 + (local6 - this.anInt923) * this.anInt880 / 1000;
				if (this.anInt923 > local6) {
					this.anInt923 = local6;
				}
			}
			if (this.anInt923 > local6) {
				this.anInt923 -= this.anInt879 + (this.anInt923 - local6) * this.anInt880 / 1000;
				if (this.anInt923 < local6) {
					this.anInt923 = local6;
				}
			}
			if (this.anInt924 < local24) {
				this.anInt924 += this.anInt879 + (local24 - this.anInt924) * this.anInt880 / 1000;
				if (this.anInt924 > local24) {
					this.anInt924 = local24;
				}
			}
			if (this.anInt924 > local24) {
				this.anInt924 -= this.anInt879 + (this.anInt924 - local24) * this.anInt880 / 1000;
				if (this.anInt924 < local24) {
					this.anInt924 = local24;
				}
			}
			if (this.anInt925 < local13) {
				this.anInt925 += this.anInt879 + (local13 - this.anInt925) * this.anInt880 / 1000;
				if (this.anInt925 > local13) {
					this.anInt925 = local13;
				}
			}
			if (this.anInt925 > local13) {
				this.anInt925 -= this.anInt879 + (this.anInt925 - local13) * this.anInt880 / 1000;
				if (this.anInt925 < local13) {
					this.anInt925 = local13;
				}
			}
			anInt849++;
			if (anInt849 > 82) {
				anInt849 = 0;
				this.aClass2_Sub1_Sub4_6.method83(250);
			}
			local6 = this.anInt1032 * 128 + 64;
			local13 = this.anInt1033 * 128 + 64;
			local24 = this.method640(this.anInt909, local6, local13) - this.anInt1034;
			@Pc(243) int local243 = local6 - this.anInt923;
			@Pc(248) int local248 = local24 - this.anInt924;
			@Pc(253) int local253 = local13 - this.anInt925;
			@Pc(264) int local264 = (int) Math.sqrt((double) (local243 * local243 + local253 * local253));
			@Pc(275) int local275 = (int) (Math.atan2((double) local248, (double) local264) * 325.949D) & 0x7FF;
			@Pc(286) int local286 = (int) (Math.atan2((double) local243, (double) local253) * -325.949D) & 0x7FF;
			if (local275 < 128) {
				local275 = 128;
			}
			if (local275 > 383) {
				local275 = 383;
			}
			if (this.anInt926 < local275) {
				this.anInt926 += this.anInt1035 + (local275 - this.anInt926) * this.anInt1036 / 1000;
				if (this.anInt926 > local275) {
					this.anInt926 = local275;
				}
			}
			if (this.anInt926 > local275) {
				this.anInt926 -= this.anInt1035 + (this.anInt926 - local275) * this.anInt1036 / 1000;
				if (this.anInt926 < local275) {
					this.anInt926 = local275;
				}
			}
			@Pc(357) int local357 = local286 - this.anInt927;
			if (local357 > 1024) {
				local357 -= 2048;
			}
			if (local357 < -1024) {
				local357 += 2048;
			}
			if (local357 > 0) {
				this.anInt927 += this.anInt1035 + local357 * this.anInt1036 / 1000;
				this.anInt927 &= 0x7FF;
			}
			if (local357 < 0) {
				this.anInt927 -= this.anInt1035 + -local357 * this.anInt1036 / 1000;
				this.anInt927 &= 0x7FF;
			}
			@Pc(415) int local415 = local286 - this.anInt927;
			if (local415 > 1024) {
				local415 -= 2048;
			}
			if (local415 < -1024) {
				local415 += 2048;
			}
			if (local415 < 0 && local357 > 0 || local415 > 0 && local357 < 0) {
				this.anInt927 = local286;
			}
		} catch (@Pc(436) RuntimeException local436) {
			signlink.reporterror("25408, " + -919 + ", " + local436.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method612() {
		try {
			this.aClass42_24.method420();
			Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray251;
			this.aClass2_Sub1_Sub1_Sub3_3.method348(0, 0);
			if (this.anInt919 != -1) {
				this.method692(0, 0, Class21.method256(this.anInt919), 0);
			} else if (this.anIntArray243[this.anInt944] != -1) {
				this.method692(0, 0, Class21.method256(this.anIntArray243[this.anInt944]), 0);
			}
			if (this.aBoolean248 && this.anInt1007 == 1) {
				this.method618();
			}
			this.aClass42_24.method421(553, 722, super.aGraphics2, 205);
			this.aClass42_26.method420();
			Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("1416, " + 3 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LUAMUNXO;I)V")
	private void method613(@OriginalArg(0) Class21 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt401;
			@Pc(70) int local70;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local70 = this.anInt898;
					if (this.anInt899 != 2) {
						local70 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local70) {
						arg0.aString11 = "";
						arg0.anInt413 = 0;
					} else {
						if (this.anIntArray258[local4] == 0) {
							arg0.aString11 = "@red@Offline";
						} else if (this.anIntArray258[local4] < 200) {
							if (this.anIntArray258[local4] == anInt891) {
								arg0.aString11 = "@gre@World-" + (this.anIntArray258[local4] - 9);
							} else {
								arg0.aString11 = "@yel@World-" + (this.anIntArray258[local4] - 9);
							}
						} else if (this.anIntArray258[local4] == anInt891) {
							arg0.aString11 = "@gre@Classic" + (this.anIntArray258[local4] - 219);
						} else {
							arg0.aString11 = "@yel@Classic" + (this.anIntArray258[local4] - 219);
						}
						arg0.anInt413 = 1;
					}
				} else if (local4 == 203) {
					local70 = this.anInt898;
					if (this.anInt899 != 2) {
						local70 = 0;
					}
					arg0.anInt435 = local70 * 15 + 20;
					if (arg0.anInt435 <= arg0.anInt436) {
						arg0.anInt435 = arg0.anInt436 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt899 == 0) {
						arg0.aString11 = "Loading ignore list";
						arg0.anInt413 = 0;
					} else if (local4 == 1 && this.anInt899 == 0) {
						arg0.aString11 = "Please wait...";
						arg0.anInt413 = 0;
					} else {
						local70 = this.anInt820;
						if (this.anInt899 == 0) {
							local70 = 0;
						}
						if (local4 >= local70) {
							arg0.aString11 = "";
							arg0.anInt413 = 0;
						} else {
							arg0.aString11 = Class18.method210(Class18.method207(this.aBoolean255, this.aLongArray4[local4]));
							arg0.anInt413 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt435 = this.anInt820 * 15 + 20;
					if (arg0.anInt435 <= arg0.anInt436) {
						arg0.anInt435 = arg0.anInt436 + 1;
					}
				} else {
					@Pc(384) int local384;
					if (local4 == 327) {
						arg0.anInt406 = 150;
						arg0.anInt407 = (int) (Math.sin((double) anInt967 / 40.0D) * 256.0D) & 0x7FF;
						if (this.aBoolean245) {
							for (local70 = 0; local70 < 7; local70++) {
								local384 = this.anIntArray220[local70];
								if (local384 >= 0 && !Class6.aClass6Array1[local384].method66()) {
									return;
								}
							}
							this.aBoolean245 = false;
							@Pc(403) Class2_Sub1_Sub2_Sub5[] local403 = new Class2_Sub1_Sub2_Sub5[7];
							@Pc(405) int local405 = 0;
							for (@Pc(407) int local407 = 0; local407 < 7; local407++) {
								@Pc(414) int local414 = this.anIntArray220[local407];
								if (local414 >= 0) {
									local403[local405++] = Class6.aClass6Array1[local414].method67(40);
								}
							}
							@Pc(436) Class2_Sub1_Sub2_Sub5 local436 = new Class2_Sub1_Sub2_Sub5(local405, false, local403);
							for (@Pc(438) int local438 = 0; local438 < 5; local438++) {
								if (this.anIntArray255[local438] != 0) {
									local436.method398(anIntArrayArray23[local438][0], anIntArrayArray23[local438][this.anIntArray255[local438]]);
									if (local438 == 1) {
										local436.method398(anIntArray263[0], anIntArray263[this.anIntArray255[local438]]);
									}
								}
							}
							local436.method391();
							local436.method392(Class49.aClass49Array1[aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt257].anIntArray206[0]);
							local436.method401(64, 850, -30, -50, -30, true);
							arg0.anInt426 = 5;
							arg0.anInt427 = 0;
							Class21.method248(local436);
						}
					} else if (local4 == 324) {
						if (this.aClass2_Sub1_Sub1_Sub4_12 == null) {
							this.aClass2_Sub1_Sub1_Sub4_12 = arg0.aClass2_Sub1_Sub1_Sub4_2;
							this.aClass2_Sub1_Sub1_Sub4_13 = arg0.aClass2_Sub1_Sub1_Sub4_1;
						}
						if (this.aBoolean240) {
							arg0.aClass2_Sub1_Sub1_Sub4_2 = this.aClass2_Sub1_Sub1_Sub4_13;
						} else {
							arg0.aClass2_Sub1_Sub1_Sub4_2 = this.aClass2_Sub1_Sub1_Sub4_12;
						}
					} else if (local4 == 325) {
						if (this.aClass2_Sub1_Sub1_Sub4_12 == null) {
							this.aClass2_Sub1_Sub1_Sub4_12 = arg0.aClass2_Sub1_Sub1_Sub4_2;
							this.aClass2_Sub1_Sub1_Sub4_13 = arg0.aClass2_Sub1_Sub1_Sub4_1;
						}
						if (this.aBoolean240) {
							arg0.aClass2_Sub1_Sub1_Sub4_2 = this.aClass2_Sub1_Sub1_Sub4_12;
						} else {
							arg0.aClass2_Sub1_Sub1_Sub4_2 = this.aClass2_Sub1_Sub1_Sub4_13;
						}
					} else if (local4 == 600) {
						arg0.aString11 = this.aString24;
						if (anInt967 % 20 < 10) {
							arg0.aString11 = arg0.aString11 + "|";
						} else {
							arg0.aString11 = arg0.aString11 + " ";
						}
					} else {
						if (local4 == 620) {
							if (this.anInt1027 < 1) {
								arg0.aString11 = "";
							} else if (this.aBoolean265) {
								arg0.anInt412 = 16711680;
								arg0.aString11 = "Moderator option: Mute player for 48 hours: <ON>";
							} else {
								arg0.anInt412 = 16777215;
								arg0.aString11 = "Moderator option: Mute player for 48 hours: <OFF>";
							}
						}
						@Pc(646) String local646;
						if (local4 == 650 || local4 == 655) {
							local384 = this.anInt991 - this.anInt976;
							if (local384 <= 0) {
								local646 = "earlier today";
							} else if (local384 == 1) {
								local646 = "yesterday";
							} else {
								local646 = local384 + " days ago";
							}
							arg0.aString11 = "You last logged in " + local646 + " from: " + signlink.dns;
						}
						if (local4 == 651) {
							if (this.anInt828 == 0) {
								arg0.aString11 = "0 unread messages";
								arg0.anInt412 = 16776960;
							}
							if (this.anInt828 == 1) {
								arg0.aString11 = "1 unread message";
								arg0.anInt412 = 65280;
							}
							if (this.anInt828 > 1) {
								arg0.aString11 = this.anInt828 + " unread messages";
								arg0.anInt412 = 65280;
							}
						}
						if (local4 == 652) {
							if (this.anInt959 == 0) {
								arg0.aString11 = "You have not yet set any password recovery questions.";
							} else if (this.anInt959 > this.anInt991) {
								local384 = this.anInt991 + 14 - this.anInt959;
								if (local384 <= 0) {
									local646 = "Earlier today";
								} else if (local384 == 1) {
									local646 = "Yesterday";
								} else {
									local646 = local384 + " days ago";
								}
								arg0.aString11 = local646 + " you changed your recovery questions";
							} else if (this.anInt968 <= 0 || aBoolean235) {
								arg0.aString11 = "";
							} else {
								arg0.aString11 = "@yel@This is a non-members world: @whi@Since you are a member we";
							}
						}
						if (local4 == 653) {
							if (this.anInt959 == 0) {
								arg0.aString11 = "We strongly recommend you do so now to secure your account.";
							} else if (this.anInt959 > this.anInt991) {
								arg0.aString11 = "If you do not remember making this change then cancel it immediately";
							} else if (this.anInt968 <= 0 || aBoolean235) {
								arg0.aString11 = "";
							} else {
								arg0.aString11 = "@whi@recommend you use a members world instead. You may use";
							}
						}
						if (local4 == 654) {
							if (this.anInt959 == 0) {
								arg0.aString11 = "Do this from the 'account management' area on our front webpage";
							} else if (this.anInt959 > this.anInt991) {
								arg0.aString11 = "Do this from the 'account management' area on our front webpage";
							} else if (this.anInt968 <= 0 || aBoolean235) {
								arg0.aString11 = "";
							} else {
								arg0.aString11 = "@whi@this world but member benefits are unavailable whilst here.";
							}
						}
						@Pc(869) String local869;
						if (local4 == 660) {
							local70 = this.anInt991 - this.anInt976;
							if (local70 <= 0) {
								local869 = "earlier today";
							} else if (local70 == 1) {
								local869 = "yesterday";
							} else {
								local869 = local70 + " days ago";
							}
							arg0.aString11 = "You last logged in @red@" + local869 + "@bla@ from: @red@" + signlink.dns;
						}
						if (local4 == 661) {
							if (this.anInt959 == 0) {
								arg0.aString11 = "\\nYou have not yet set any recovery questions.\\nIt is @red@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @red@unable to recover your\\n@red@password@yel@ if you forget it, or it is stolen.";
							} else if (this.anInt959 <= this.anInt991) {
								arg0.aString11 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method614(this.anInt959);
							} else {
								local70 = this.anInt991 + 14 - this.anInt959;
								if (local70 <= 0) {
									local869 = "Earlier today";
								} else if (local70 == 1) {
									local869 = "Yesterday";
								} else {
									local869 = local70 + " days ago";
								}
								arg0.aString11 = local869 + " you requested@red@ new recovery\\n@red@questions.@yel@ The requested change will occur\\non: @red@" + this.method614(this.anInt959) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
							}
						}
						if (local4 == 662) {
							if (this.anInt828 == 0) {
								local646 = "@yel@0 unread messages";
							} else if (this.anInt828 == 1) {
								local646 = "@gre@1 unread message";
							} else {
								local646 = "@gre@" + this.anInt828 + " unread messages";
							}
							arg0.aString11 = "You have " + local646 + "\\nin your message centre.";
						}
						if (local4 == 663) {
							arg0.aString11 = "Last password change:\\n@gre@" + this.method614(this.anInt821);
						}
						if (local4 == 664) {
							if (this.anInt1026 == 0) {
								arg0.aString11 = "You have not yet set\\nany contact details.";
							}
							if (this.anInt1026 == 1) {
								arg0.aString11 = "Contact Details Last Set:\\n@gre@" + this.method614(this.anInt937);
							}
							if (this.anInt1026 == 2) {
								arg0.aString11 = "You need to set\\nnew contact details.";
							}
						}
						if (local4 == 665) {
							if (this.anInt968 > 2) {
								arg0.aString11 = "\\n\\nYou have @gre@" + this.anInt968 + "@yel@ days of\\nmember credit remaining.";
							} else if (this.anInt968 > 0) {
								arg0.aString11 = "You have @gre@" + this.anInt968 + "@yel@ days of\\nmember credit remaining.\\n\\n@red@Credit low! Renew now\\n@red@to avoid losing members.";
							} else {
								arg0.aString11 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
							}
						}
						if (local4 == 667) {
							if (this.anInt968 == 0) {
								arg0.aString11 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
							}
							if (this.anInt968 > 0) {
								arg0.aString11 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
							}
						}
						if (local4 == 668) {
							if (this.anInt959 > this.anInt991) {
								arg0.aString11 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'cancel recovery questions'.";
							} else {
								arg0.aString11 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
							}
						}
					}
				}
			} else if (local4 == 1 && this.anInt899 == 0) {
				arg0.aString11 = "Loading friend list";
				arg0.anInt413 = 0;
			} else if (local4 == 1 && this.anInt899 == 1) {
				arg0.aString11 = "Connecting to friendserver";
				arg0.anInt413 = 0;
			} else if (local4 == 2 && this.anInt899 != 2) {
				arg0.aString11 = "Please wait...";
				arg0.anInt413 = 0;
			} else {
				local70 = this.anInt898;
				if (this.anInt899 != 2) {
					local70 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local70) {
					arg0.aString11 = "";
					arg0.anInt413 = 0;
				} else {
					arg0.aString11 = this.aStringArray9[local4];
					arg0.anInt413 = 1;
				}
			}
		} catch (@Pc(1141) RuntimeException local1141) {
			signlink.reporterror("51992, " + arg0 + ", " + 5 + ", " + local1141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method614(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt991 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(35) int local35 = local16.get(5);
			@Pc(39) int local39 = local16.get(2);
			@Pc(43) int local43 = local16.get(1);
			@Pc(94) String[] local94 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local35 + "-" + local94[local39] + "-" + local43;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("66472, " + 591 + ", " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method615() {
		try {
			if (this.anInt952 == 0) {
				this.aStringArray10[0] = "Cancel";
				this.anIntArray248[0] = 1109;
				this.anInt1043 = 1;
				if (this.anInt1037 == -1) {
					this.method626();
					this.anInt886 = 0;
					this.anInt836 = 0;
					if (super.anInt807 > 4 && super.anInt808 > 4 && super.anInt807 < 516 && super.anInt808 < 338) {
						if (this.anInt1040 == -1) {
							this.method596((byte) 4);
						} else {
							this.method610(Class21.method256(this.anInt1040), 4, super.anInt808, 0, 0, super.anInt807, 4);
						}
					}
					if (this.anInt886 != this.anInt948) {
						this.anInt948 = this.anInt886;
					}
					if (this.anInt836 != this.anInt881) {
						this.anInt881 = this.anInt836;
					}
					this.anInt886 = 0;
					this.anInt836 = 0;
					if (super.anInt807 > 553 && super.anInt808 > 205 && super.anInt807 < 743 && super.anInt808 < 466) {
						if (this.anInt919 != -1) {
							this.method610(Class21.method256(this.anInt919), 205, super.anInt808, 1, 0, super.anInt807, 553);
						} else if (this.anIntArray243[this.anInt944] != -1) {
							this.method610(Class21.method256(this.anIntArray243[this.anInt944]), 205, super.anInt808, 1, 0, super.anInt807, 553);
						}
					}
					if (this.anInt886 != this.anInt863) {
						this.aBoolean243 = true;
						this.anInt863 = this.anInt886;
					}
					if (this.anInt836 != this.anInt845) {
						this.aBoolean243 = true;
						this.anInt845 = this.anInt836;
					}
					this.anInt886 = 0;
					this.anInt836 = 0;
					if (super.anInt807 > 17 && super.anInt808 > 357 && super.anInt807 < 496 && super.anInt808 < 453) {
						if (this.anInt1038 != -1) {
							this.method610(Class21.method256(this.anInt1038), 357, super.anInt808, 2, 0, super.anInt807, 17);
						} else if (this.anInt859 != -1) {
							this.method610(Class21.method256(this.anInt859), 357, super.anInt808, 3, 0, super.anInt807, 17);
						} else if (super.anInt808 < 434 && super.anInt807 < 426) {
							this.method710(super.anInt807 - 17, super.anInt808 - 357);
						}
					}
					if ((this.anInt1038 != -1 || this.anInt859 != -1) && this.anInt886 != this.anInt970) {
						this.aBoolean226 = true;
						this.anInt970 = this.anInt886;
					}
					if ((this.anInt1038 != -1 || this.anInt859 != -1) && this.anInt836 != this.anInt945) {
						this.aBoolean226 = true;
						this.anInt945 = this.anInt836;
					}
					@Pc(351) boolean local351 = false;
					while (!local351) {
						local351 = true;
						for (@Pc(357) int local357 = 0; local357 < this.anInt1043 - 1; local357++) {
							if (this.anIntArray248[local357] < 1000 && this.anIntArray248[local357 + 1] > 1000) {
								@Pc(378) String local378 = this.aStringArray10[local357];
								this.aStringArray10[local357] = this.aStringArray10[local357 + 1];
								this.aStringArray10[local357 + 1] = local378;
								@Pc(400) int local400 = this.anIntArray248[local357];
								this.anIntArray248[local357] = this.anIntArray248[local357 + 1];
								this.anIntArray248[local357 + 1] = local400;
								@Pc(422) int local422 = this.anIntArray246[local357];
								this.anIntArray246[local357] = this.anIntArray246[local357 + 1];
								this.anIntArray246[local357 + 1] = local422;
								@Pc(444) int local444 = this.anIntArray247[local357];
								this.anIntArray247[local357] = this.anIntArray247[local357 + 1];
								this.anIntArray247[local357 + 1] = local444;
								@Pc(466) int local466 = this.anIntArray249[local357];
								this.anIntArray249[local357] = this.anIntArray249[local357 + 1];
								this.anIntArray249[local357 + 1] = local466;
								local351 = false;
							}
						}
					}
				} else {
					this.anInt886 = 0;
					this.anInt836 = 0;
					this.method610(Class21.method256(this.anInt1037), 0, super.anInt808, 0, 0, super.anInt807, 0);
					if (this.anInt886 != this.anInt948) {
						this.anInt948 = this.anInt886;
					}
					if (this.anInt836 != this.anInt881) {
						this.anInt881 = this.anInt836;
					}
				}
			}
		} catch (@Pc(496) RuntimeException local496) {
			signlink.reporterror("65220, " + 25993 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method579() {
		try {
			if (!this.aBoolean241 && !this.aBoolean249 && !this.aBoolean229) {
				anInt967++;
				if (this.aBoolean262) {
					this.method673();
				} else {
					this.method717();
				}
				this.method722(988);
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("47469, " + -25033 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XQZVTAMW;I)V")
	private void method617(@OriginalArg(0) Class2_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt712 == 0) {
				local1 = this.aClass47_1.method533(arg0.anInt711, arg0.anInt713, arg0.anInt714);
			}
			if (arg0.anInt712 == 1) {
				local1 = this.aClass47_1.method534(arg0.anInt714, arg0.anInt711, this.aByte56, arg0.anInt713);
			}
			if (arg0.anInt712 == 2) {
				local1 = this.aClass47_1.method535(arg0.anInt711, arg0.anInt713, arg0.anInt714);
			}
			if (arg0.anInt712 == 3) {
				local1 = this.aClass47_1.method536(arg0.anInt711, arg0.anInt713, arg0.anInt714);
			}
			if (local1 != 0) {
				@Pc(87) int local87 = this.aClass47_1.method537(arg0.anInt711, arg0.anInt713, arg0.anInt714, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local87 & 0x1F;
				local7 = local87 >> 6;
			}
			arg0.anInt706 = local3;
			arg0.anInt708 = local5;
			arg0.anInt707 = local7;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("48889, " + arg0 + ", " + 5 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method581() {
		try {
			if (this.aBoolean241 || this.aBoolean249 || this.aBoolean229) {
				this.method586();
			} else {
				anInt956++;
				if (this.aBoolean262) {
					this.method662();
				} else {
					this.method627(false);
				}
				this.anInt839 = 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("69185, " + 91 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method618() {
		try {
			@Pc(2) int local2 = this.anInt1008;
			@Pc(5) int local5 = this.anInt1009;
			@Pc(8) int local8 = this.anInt1010;
			@Pc(11) int local11 = this.anInt1011;
			Class2_Sub1_Sub1.method485(local11, 6116423, local2, local8, this.aBoolean270, local5);
			Class2_Sub1_Sub1.method485(16, 0, local2 + 1, local8 - 2, this.aBoolean270, local5 + 1);
			Class2_Sub1_Sub1.method486(local11 - 19, this.anInt883, local2 + 1, 0, local8 - 2, local5 + 18);
			this.aClass2_Sub1_Sub1_Sub2_4.method153(local2 + 3, "Choose Option", 6116423, 988, local5 + 14);
			@Pc(73) int local73 = super.anInt807;
			@Pc(76) int local76 = super.anInt808;
			if (this.anInt1007 == 0) {
				local73 -= 4;
				local76 -= 4;
			}
			if (this.anInt1007 == 1) {
				local73 -= 553;
				local76 -= 205;
			}
			if (this.anInt1007 == 2) {
				local73 -= 17;
				local76 -= 357;
			}
			for (@Pc(95) int local95 = 0; local95 < this.anInt1043; local95++) {
				@Pc(110) int local110 = local5 + (this.anInt1043 - 1 - local95) * 15 + 31;
				@Pc(112) int local112 = 16777215;
				if (local73 > local2 && local73 < local2 + local8 && local76 > local110 - 13 && local76 < local110 + 3) {
					local112 = 16776960;
				}
				this.aClass2_Sub1_Sub1_Sub2_4.method157(local2 + 3, this.aStringArray10[local95], true, local110, local112);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("83648, " + 4 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method619(@OriginalArg(0) byte arg0) {
		try {
			this.aClass42_27.method420();
			Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray250;
			this.aClass2_Sub1_Sub1_Sub3_5.method348(0, 0);
			if (this.aBoolean253) {
				this.aClass2_Sub1_Sub1_Sub2_4.method149(0, 239, this.aString29, 40);
				this.aClass2_Sub1_Sub1_Sub2_4.method149(128, 239, this.aString25 + "*", 60);
			} else if (this.anInt996 == 1) {
				this.aClass2_Sub1_Sub1_Sub2_4.method149(0, 239, "Enter amount:", 40);
				this.aClass2_Sub1_Sub1_Sub2_4.method149(128, 239, this.aString21 + "*", 60);
			} else if (this.anInt996 == 2) {
				this.aClass2_Sub1_Sub1_Sub2_4.method149(0, 239, "Enter name:", 40);
				this.aClass2_Sub1_Sub1_Sub2_4.method149(128, 239, this.aString21 + "*", 60);
			} else if (this.aString19 != null) {
				this.aClass2_Sub1_Sub1_Sub2_4.method149(0, 239, this.aString19, 40);
				this.aClass2_Sub1_Sub1_Sub2_4.method149(128, 239, "Click to continue", 60);
			} else if (this.anInt1038 != -1) {
				this.method692(0, 0, Class21.method256(this.anInt1038), 0);
			} else if (this.anInt859 == -1) {
				@Pc(159) Class2_Sub1_Sub1_Sub2 local159 = this.aClass2_Sub1_Sub1_Sub2_3;
				@Pc(161) int local161 = 0;
				Class2_Sub1_Sub1.method482(0, 0, 77, 463);
				for (@Pc(169) int local169 = 0; local169 < 100; local169++) {
					if (this.aStringArray12[local169] != null) {
						@Pc(181) int local181 = this.anIntArray241[local169];
						@Pc(190) int local190 = this.anInt983 + 70 - local161 * 14;
						@Pc(195) String local195 = this.aStringArray11[local169];
						@Pc(197) byte local197 = 0;
						if (local195 != null && local195.startsWith("@cr1@")) {
							local195 = local195.substring(5);
							local197 = 1;
						}
						if (local195 != null && local195.startsWith("@cr2@")) {
							local195 = local195.substring(5);
							local197 = 2;
						}
						if (local181 == 0) {
							if (local190 > 0 && local190 < 110) {
								local159.method153(4, this.aStringArray12[local169], 0, 988, local190);
							}
							local161++;
						}
						@Pc(267) int local267;
						if ((local181 == 1 || local181 == 2) && (local181 == 1 || this.anInt1029 == 0 || this.anInt1029 == 1 && this.method653(local195, (byte) 4))) {
							if (local190 > 0 && local190 < 110) {
								local267 = 4;
								if (local197 == 1) {
									this.aClass2_Sub1_Sub1_Sub3Array3[0].method348(4, local190 - 12);
									local267 += 14;
								}
								if (local197 == 2) {
									this.aClass2_Sub1_Sub1_Sub3Array3[1].method348(local267, local190 - 12);
									local267 += 14;
								}
								local159.method153(local267, local195 + ":", 0, 988, local190);
								local267 += local159.method151(local195) + 8;
								local159.method153(local267, this.aStringArray12[local169], 255, 988, local190);
							}
							local161++;
						}
						if ((local181 == 3 || local181 == 7) && this.anInt929 == 0 && (local181 == 7 || this.anInt939 == 0 || this.anInt939 == 1 && this.method653(local195, (byte) 4))) {
							if (local190 > 0 && local190 < 110) {
								local159.method153(4, "From", 0, 988, local190);
								local267 = local159.method151("From ") + 4;
								if (local197 == 1) {
									this.aClass2_Sub1_Sub1_Sub3Array3[0].method348(local267, local190 - 12);
									local267 += 14;
								}
								if (local197 == 2) {
									this.aClass2_Sub1_Sub1_Sub3Array3[1].method348(local267, local190 - 12);
									local267 += 14;
								}
								local159.method153(local267, local195 + ":", 0, 988, local190);
								local267 += local159.method151(local195) + 8;
								local159.method153(local267, this.aStringArray12[local169], 8388608, 988, local190);
							}
							local161++;
						}
						if (local181 == 4 && (this.anInt969 == 0 || this.anInt969 == 1 && this.method653(local195, (byte) 4))) {
							if (local190 > 0 && local190 < 110) {
								local159.method153(4, local195 + " " + this.aStringArray12[local169], 8388736, 988, local190);
							}
							local161++;
						}
						if (local181 == 5 && this.anInt929 == 0 && this.anInt939 < 2) {
							if (local190 > 0 && local190 < 110) {
								local159.method153(4, this.aStringArray12[local169], 8388608, 988, local190);
							}
							local161++;
						}
						if (local181 == 6 && this.anInt929 == 0 && this.anInt939 < 2) {
							if (local190 > 0 && local190 < 110) {
								local159.method153(4, "To " + local195 + ":", 0, 988, local190);
								local159.method153(local159.method151("To " + local195) + 12, this.aStringArray12[local169], 8388608, 988, local190);
							}
							local161++;
						}
						if (local181 == 8 && (this.anInt969 == 0 || this.anInt969 == 1 && this.method653(local195, (byte) 4))) {
							if (local190 > 0 && local190 < 110) {
								local159.method153(4, local195 + " " + this.aStringArray12[local169], 8270336, 988, local190);
							}
							local161++;
						}
					}
				}
				Class2_Sub1_Sub1.method481();
				this.anInt902 = local161 * 14 + 7;
				if (this.anInt902 < 78) {
					this.anInt902 = 78;
				}
				this.method665(this.anInt902, this.anInt902 - this.anInt983 - 77, 0, 77, 463);
				@Pc(637) String local637;
				if (aClass2_Sub1_Sub2_Sub1_Sub2_1 == null || aClass2_Sub1_Sub2_Sub1_Sub2_1.aString6 == null) {
					local637 = Class18.method210(this.aString22);
				} else {
					local637 = aClass2_Sub1_Sub2_Sub1_Sub2_1.aString6;
				}
				local159.method153(4, local637 + ":", 0, 988, 90);
				local159.method153(local159.method151(local637 + ": ") + 6, this.aString30 + "*", 255, 988, 90);
				Class2_Sub1_Sub1.method488(77, 479, 0, 0, this.anInt893);
			} else {
				this.method692(0, 0, Class21.method256(this.anInt859), 0);
			}
			if (this.aBoolean248 && this.anInt1007 == 2) {
				this.method618();
			}
			this.aClass42_27.method421(17, 722, super.aGraphics2, 357);
			this.aClass42_26.method420();
			Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
			if (arg0 != this.aByte53) {
				this.aClass48ArrayArrayArray1 = null;
			}
		} catch (@Pc(726) RuntimeException local726) {
			signlink.reporterror("32427, " + arg0 + ", " + local726.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class48 local9 = this.aClass48ArrayArrayArray1[this.anInt909][arg0][arg1];
		if (local9 == null) {
			this.aClass47_1.method528(this.anInt909, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub2_Sub6 local23 = null;
		@Pc(27) Class2_Sub1_Sub2_Sub6 local27;
		for (local27 = (Class2_Sub1_Sub2_Sub6) local9.method565(); local27 != null; local27 = (Class2_Sub1_Sub2_Sub6) local9.method567()) {
			@Pc(32) Class19 local32 = Class19.method221(local27.anInt762);
			@Pc(35) int local35 = local32.anInt352;
			if (local32.aBoolean79) {
				local35 *= local27.anInt763 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method563(local23);
		@Pc(65) Class2_Sub1_Sub2_Sub6 local65 = null;
		@Pc(67) Class2_Sub1_Sub2_Sub6 local67 = null;
		for (local27 = (Class2_Sub1_Sub2_Sub6) local9.method565(); local27 != null; local27 = (Class2_Sub1_Sub2_Sub6) local9.method567()) {
			if (local27.anInt762 != local23.anInt762 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt762 != local23.anInt762 && local27.anInt762 != local65.anInt762 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass47_1.method514(arg0, local65, this.method640(this.anInt909, arg0 * 128 + 64, arg1 * 128 + 64), this.anInt909, local110, arg1, local67, local23);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!DNRIFKTO;II)V")
	private void method621(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt972 = 0;
			this.anInt1021 = 0;
			this.method652(arg0, arg1);
			this.method709(arg1, (byte) 1, arg0);
			this.method697(arg1, arg0);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt972; local29++) {
				local36 = this.anIntArray256[local29];
				if (this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local36].anInt262 != anInt967) {
					this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local36].aClass14_1 = null;
					this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local36] = null;
				}
			}
			if (arg0.anInt166 != arg1) {
				signlink.reporterror(this.aString22 + " size mismatch in getnpcpos - pos:" + arg0.anInt166 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt901; local36++) {
				if (this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray236[local36]] == null) {
					signlink.reporterror(this.aString22 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt901);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("11598, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PQKEJITK;Z)V")
	private void method622(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(7) int local7;
			if (arg1) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			for (local7 = 0; local7 < this.anIntArray221.length; local7++) {
				this.anIntArray221[local7] = 0;
			}
			@Pc(39) int local39;
			for (@Pc(29) int local29 = 0; local29 < 5000; local29++) {
				local39 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray221[local39] = (int) (Math.random() * 256.0D);
			}
			@Pc(57) int local57;
			@Pc(61) int local61;
			@Pc(69) int local69;
			for (local39 = 0; local39 < 20; local39++) {
				for (local57 = 1; local57 < 255; local57++) {
					for (local61 = 1; local61 < 127; local61++) {
						local69 = local61 + (local57 << 7);
						this.anIntArray222[local69] = (this.anIntArray221[local69 - 1] + this.anIntArray221[local69 + 1] + this.anIntArray221[local69 - 128] + this.anIntArray221[local69 + 128]) / 4;
					}
				}
				@Pc(115) int[] local115 = this.anIntArray221;
				this.anIntArray221 = this.anIntArray222;
				this.anIntArray222 = local115;
			}
			if (arg0 != null) {
				local57 = 0;
				for (local61 = 0; local61 < arg0.anInt548; local61++) {
					for (local69 = 0; local69 < arg0.anInt547; local69++) {
						if (arg0.aByteArray13[local57++] != 0) {
							@Pc(151) int local151 = local69 + arg0.anInt549 + 16;
							@Pc(158) int local158 = local61 + arg0.anInt550 + 16;
							@Pc(164) int local164 = local151 + (local158 << 7);
							this.anIntArray221[local164] = 0;
						}
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("40969, " + arg0 + ", " + arg1 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIII)V")
	private void method623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg1 >= 1 && arg5 >= 1 && arg1 <= 102 && arg5 <= 102) {
				if (aBoolean236 && arg4 != this.anInt909) {
					return;
				}
				@Pc(24) int local24 = 0;
				if (arg2 == 0) {
					local24 = this.aClass47_1.method533(arg4, arg1, arg5);
				}
				if (arg2 == 1) {
					local24 = this.aClass47_1.method534(arg5, arg4, this.aByte56, arg1);
				}
				if (arg2 == 2) {
					local24 = this.aClass47_1.method535(arg4, arg1, arg5);
				}
				if (arg2 == 3) {
					local24 = this.aClass47_1.method536(arg4, arg1, arg5);
				}
				@Pc(81) int local81;
				if (local24 != 0) {
					local81 = this.aClass47_1.method537(arg4, arg1, arg5, local24);
					@Pc(87) int local87 = local24 >> 14 & 0x7FFF;
					@Pc(91) int local91 = local81 & 0x1F;
					@Pc(95) int local95 = local81 >> 6;
					@Pc(108) Class41 local108;
					if (arg2 == 0) {
						this.aClass47_1.method524(arg1, arg4, this.anInt980, arg5);
						local108 = Class41.method410(local87);
						if (local108.aBoolean175) {
							this.aClass45Array1[arg4].method470(local108.aBoolean176, arg5, arg1, local95, local91);
						}
					}
					if (arg2 == 1) {
						this.aClass47_1.method525(arg4, arg5, arg1);
					}
					if (arg2 == 2) {
						this.aClass47_1.method526(arg1, arg4, arg5);
						local108 = Class41.method410(local87);
						if (arg1 + local108.anInt611 > 103 || arg5 + local108.anInt611 > 103 || arg1 + local108.anInt610 > 103 || arg5 + local108.anInt610 > 103) {
							return;
						}
						if (local108.aBoolean175) {
							this.aClass45Array1[arg4].method471(local108.anInt611, 166, arg5, local108.anInt610, local108.aBoolean176, local95, arg1);
						}
					}
					if (arg2 == 3) {
						this.aClass47_1.method527(arg5, arg1, arg4);
						local108 = Class41.method410(local87);
						if (local108.aBoolean175 && local108.aBoolean177) {
							this.aClass45Array1[arg4].method473(arg1, arg5);
						}
					}
				}
				if (arg6 >= 0) {
					local81 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray8[1][arg1][arg5] & 0x2) == 2) {
						local81 = arg4 + 1;
					}
					Class31.method304(arg3, arg4, arg5, arg6, arg1, local81, this.aClass45Array1[arg4], this.aClass47_1, arg0, this.anIntArrayArrayArray8);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("37077, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method624() {
		try {
			for (@Pc(13) Class2_Sub1_Sub2_Sub2 local13 = (Class2_Sub1_Sub2_Sub2) this.aClass48_11.method565(); local13 != null; local13 = (Class2_Sub1_Sub2_Sub2) this.aClass48_11.method567()) {
				if (local13.anInt384 != this.anInt909 || anInt967 > local13.anInt383) {
					local13.method558();
				} else if (anInt967 >= local13.anInt382) {
					if (local13.anInt387 > 0) {
						@Pc(43) Class2_Sub1_Sub2_Sub1_Sub1 local43 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local13.anInt387 - 1];
						if (local43 != null && local43.anInt285 >= 0 && local43.anInt285 < 13312 && local43.anInt286 >= 0 && local43.anInt286 < 13312) {
							local13.method243(anInt967, local43.anInt285, this.method640(local13.anInt384, local43.anInt285, local43.anInt286) - local13.anInt391, local43.anInt286);
						}
					}
					if (local13.anInt387 < 0) {
						@Pc(88) int local88 = -local13.anInt387 - 1;
						@Pc(94) Class2_Sub1_Sub2_Sub1_Sub2 local94;
						if (local88 == this.anInt1012) {
							local94 = aClass2_Sub1_Sub2_Sub1_Sub2_1;
						} else {
							local94 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local88];
						}
						if (local94 != null && local94.anInt285 >= 0 && local94.anInt285 < 13312 && local94.anInt286 >= 0 && local94.anInt286 < 13312) {
							local13.method243(anInt967, local94.anInt285, this.method640(local13.anInt384, local94.anInt285, local94.anInt286) - local13.anInt391, local94.anInt286);
						}
					}
					local13.method242(this.aBoolean266, this.anInt850);
					this.aClass47_1.method518(-1, local13, (int) local13.aDouble6, local13.anInt392, (int) local13.aDouble7, 60, (int) local13.aDouble5, false, this.anInt909);
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("8929, " + 0 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)Z")
	private boolean method625(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.aClass32_1 == null) {
				return false;
			}
			@Pc(1671) String local1671;
			@Pc(183) int local183;
			try {
				@Pc(14) int local14 = this.aClass32_1.method320();
				if (local14 == 0) {
					return false;
				}
				if (this.anInt832 == -1) {
					this.aClass32_1.method321(this.aClass2_Sub1_Sub4_9.aByteArray2, 0, 1);
					this.anInt832 = this.aClass2_Sub1_Sub4_9.aByteArray2[0] & 0xFF;
					if (this.aClass11_2 != null) {
						this.anInt832 = this.anInt832 - this.aClass11_2.method175() & 0xFF;
					}
					this.anInt831 = Class34.anIntArray117[this.anInt832];
					local14--;
				}
				if (this.anInt831 == -1) {
					if (local14 <= 0) {
						return false;
					}
					this.aClass32_1.method321(this.aClass2_Sub1_Sub4_9.aByteArray2, 0, 1);
					this.anInt831 = this.aClass2_Sub1_Sub4_9.aByteArray2[0] & 0xFF;
					local14--;
				}
				if (this.anInt831 == -2) {
					if (local14 <= 1) {
						return false;
					}
					this.aClass32_1.method321(this.aClass2_Sub1_Sub4_9.aByteArray2, 0, 2);
					this.aClass2_Sub1_Sub4_9.anInt166 = 0;
					this.anInt831 = this.aClass2_Sub1_Sub4_9.method96();
					local14 -= 2;
				}
				if (local14 < this.anInt831) {
					return false;
				}
				this.aClass2_Sub1_Sub4_9.anInt166 = 0;
				this.aClass32_1.method321(this.aClass2_Sub1_Sub4_9.aByteArray2, 0, this.anInt831);
				this.anInt833 = 0;
				this.anInt922 = this.anInt921;
				this.anInt921 = this.anInt920;
				this.anInt920 = this.anInt832;
				if (this.anInt832 == 161) {
					this.anInt896 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt1012 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					this.anInt832 = -1;
					return true;
				}
				@Pc(187) int local187;
				@Pc(179) int local179;
				if (this.anInt832 == 111) {
					local179 = this.aClass2_Sub1_Sub4_9.method96();
					local183 = this.aClass2_Sub1_Sub4_9.method94();
					local187 = this.aClass2_Sub1_Sub4_9.method96();
					if (this.aBoolean261 && !aBoolean236 && this.anInt1000 < 50) {
						this.anIntArray262[this.anInt1000] = local179;
						this.anIntArray260[this.anInt1000] = local183;
						this.anIntArray232[this.anInt1000] = local187 + Class24.anIntArray75[local179];
						this.anInt1000++;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 92) {
					this.aBoolean253 = false;
					this.anInt996 = 1;
					this.aString21 = "";
					this.aBoolean226 = true;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 244) {
					this.anInt1029 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt939 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt969 = this.aClass2_Sub1_Sub4_9.method94();
					this.aBoolean237 = true;
					this.aBoolean226 = true;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 23) {
					this.anInt821 = this.aClass2_Sub1_Sub4_9.method121();
					this.anInt988 = this.aClass2_Sub1_Sub4_9.method96();
					this.anInt976 = this.aClass2_Sub1_Sub4_9.method96();
					this.anInt959 = this.aClass2_Sub1_Sub4_9.method96();
					this.anInt1026 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt937 = this.aClass2_Sub1_Sub4_9.method96();
					this.anInt968 = this.aClass2_Sub1_Sub4_9.method96();
					this.anInt930 = this.aClass2_Sub1_Sub4_9.method99();
					this.anInt991 = this.aClass2_Sub1_Sub4_9.method96();
					this.anInt1017 = this.aClass2_Sub1_Sub4_9.method96();
					this.anInt828 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					if (this.anInt930 != 0 && this.anInt1040 == -1) {
						signlink.dnslookup(Class18.method209(this.anInt930));
						this.method706();
						@Pc(359) short local359 = 650;
						if (this.anInt959 > this.anInt991 || this.anInt959 == 0 || this.anInt968 > 0 && !aBoolean235) {
							local359 = 655;
						}
						this.aString24 = "";
						this.aBoolean265 = false;
						if (local359 == 650) {
							this.anInt1040 = Class21.anInt411;
						} else {
							this.anInt1040 = Class21.anInt431;
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 100) {
					local179 = this.aClass2_Sub1_Sub4_9.method123();
					local183 = this.aClass2_Sub1_Sub4_9.method124();
					local187 = this.aClass2_Sub1_Sub4_9.method120();
					@Pc(418) Class21 local418 = Class21.method256(local187);
					local418.anInt432 = local179;
					local418.anInt415 = local183;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 117) {
					local179 = this.aClass2_Sub1_Sub4_9.method128();
					local183 = this.aClass2_Sub1_Sub4_9.method96();
					this.anIntArray238[local183] = local179;
					if (this.anIntArray274[local183] != local179) {
						this.anIntArray274[local183] = local179;
						this.method693(local183);
						this.aBoolean243 = true;
						if (this.anInt859 != -1) {
							this.aBoolean226 = true;
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 123) {
					this.anInt979 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 133) {
					local179 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					local183 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					local187 = this.aClass2_Sub1_Sub4_9.method96();
					Class21.method256(local179).anInt423 = (local187 << 16) + local183;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 243) {
					local179 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					this.method601((byte) 7, local179);
					if (this.anInt919 != -1) {
						this.method689(this.anInt919);
						this.anInt919 = -1;
						this.aBoolean243 = true;
						this.aBoolean230 = true;
					}
					if (this.anInt1038 != -1) {
						this.method689(this.anInt1038);
						this.anInt1038 = -1;
						this.aBoolean226 = true;
					}
					if (this.anInt1037 != -1) {
						this.method689(this.anInt1037);
						this.anInt1037 = -1;
						this.aBoolean246 = true;
					}
					if (this.anInt1040 != local179) {
						this.method689(this.anInt1040);
						this.anInt1040 = local179;
					}
					if (this.anInt996 != 0) {
						this.anInt996 = 0;
						this.aBoolean226 = true;
					}
					this.aBoolean267 = false;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 102) {
					local179 = this.aClass2_Sub1_Sub4_9.method96();
					Class21.method256(local179).anInt426 = 3;
					if (aClass2_Sub1_Sub2_Sub1_Sub2_1.aClass14_2 == null) {
						Class21.method256(local179).anInt427 = (aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray56[0] << 25) + (aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray56[4] << 20) + (aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray57[0] << 15) + (aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray57[8] << 10) + (aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray57[11] << 5) + aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray57[1];
					} else {
						Class21.method256(local179).anInt427 = (int) (aClass2_Sub1_Sub2_Sub1_Sub2_1.aClass14_2.aLong11 + 305419896L);
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 93) {
					for (local179 = 0; local179 < this.aClass2_Sub1_Sub2_Sub1_Sub2Array1.length; local179++) {
						if (this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local179] != null) {
							this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local179].anInt277 = -1;
						}
					}
					for (local183 = 0; local183 < this.aClass2_Sub1_Sub2_Sub1_Sub1Array1.length; local183++) {
						if (this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local183] != null) {
							this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local183].anInt277 = -1;
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 106) {
					this.anInt1024 = this.aClass2_Sub1_Sub4_9.method94();
					if (this.anInt1024 == this.anInt944) {
						if (this.anInt1024 == 3) {
							this.anInt944 = 1;
						} else {
							this.anInt944 = 3;
						}
						this.aBoolean243 = true;
					}
					this.anInt832 = -1;
					return true;
				}
				@Pc(839) int local839;
				@Pc(849) int local849;
				@Pc(860) int local860;
				@Pc(844) int local844;
				if (this.anInt832 == 83) {
					this.aBoolean271 = true;
					this.anInt1032 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt1033 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt1034 = this.aClass2_Sub1_Sub4_9.method96();
					this.anInt1035 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt1036 = this.aClass2_Sub1_Sub4_9.method94();
					if (this.anInt1036 >= 100) {
						local179 = this.anInt1032 * 128 + 64;
						local183 = this.anInt1033 * 128 + 64;
						local187 = this.method640(this.anInt909, local179, local183) - this.anInt1034;
						local839 = local179 - this.anInt923;
						local844 = local187 - this.anInt924;
						local849 = local183 - this.anInt925;
						local860 = (int) Math.sqrt((double) (local839 * local839 + local849 * local849));
						this.anInt926 = (int) (Math.atan2((double) local844, (double) local860) * 325.949D) & 0x7FF;
						this.anInt927 = (int) (Math.atan2((double) local839, (double) local849) * -325.949D) & 0x7FF;
						if (this.anInt926 < 128) {
							this.anInt926 = 128;
						}
						if (this.anInt926 > 383) {
							this.anInt926 = 383;
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 151) {
					this.anInt899 = this.aClass2_Sub1_Sub4_9.method94();
					this.aBoolean243 = true;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 189) {
					local179 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					local183 = this.aClass2_Sub1_Sub4_9.method121();
					Class21.method256(local183).anInt426 = 1;
					Class21.method256(local183).anInt427 = local179;
					this.anInt832 = -1;
					return true;
				}
				@Pc(962) Class21 local962;
				if (this.anInt832 == 140) {
					this.aBoolean243 = true;
					local179 = this.aClass2_Sub1_Sub4_9.method96();
					local962 = Class21.method256(local179);
					local187 = this.aClass2_Sub1_Sub4_9.method96();
					for (local839 = 0; local839 < local187; local839++) {
						local844 = this.aClass2_Sub1_Sub4_9.method94();
						if (local844 == 255) {
							local844 = this.aClass2_Sub1_Sub4_9.method99();
						}
						local962.anIntArray66[local839] = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
						local962.anIntArray74[local839] = local844;
					}
					for (local844 = local187; local844 < local962.anIntArray66.length; local844++) {
						local962.anIntArray66[local844] = 0;
						local962.anIntArray74[local844] = 0;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 11) {
					local179 = this.aClass2_Sub1_Sub4_9.method121();
					local183 = this.aClass2_Sub1_Sub4_9.method96();
					local187 = local183 >> 10 & 0x1F;
					local839 = local183 >> 5 & 0x1F;
					local844 = local183 & 0x1F;
					Class21.method256(local179).anInt412 = (local187 << 19) + (local839 << 11) + (local844 << 3);
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 225) {
					this.aBoolean271 = false;
					for (local179 = 0; local179 < 5; local179++) {
						this.aBooleanArray11[local179] = false;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 53) {
					local179 = this.aClass2_Sub1_Sub4_9.method121();
					this.method601((byte) 7, local179);
					if (this.anInt1038 != -1) {
						this.method689(this.anInt1038);
						this.anInt1038 = -1;
						this.aBoolean226 = true;
					}
					if (this.anInt1037 != -1) {
						this.method689(this.anInt1037);
						this.anInt1037 = -1;
						this.aBoolean246 = true;
					}
					if (this.anInt1040 != -1) {
						this.method689(this.anInt1040);
						this.anInt1040 = -1;
					}
					if (this.anInt919 != local179) {
						this.method689(this.anInt919);
						this.anInt919 = local179;
					}
					if (this.anInt996 != 0) {
						this.anInt996 = 0;
						this.aBoolean226 = true;
					}
					this.aBoolean243 = true;
					this.aBoolean230 = true;
					this.aBoolean267 = false;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 202) {
					local179 = this.aClass2_Sub1_Sub4_9.method121();
					this.method601((byte) 7, local179);
					if (this.anInt1040 != -1) {
						this.method689(this.anInt1040);
						this.anInt1040 = -1;
					}
					if (this.anInt919 != -1) {
						this.method689(this.anInt919);
						this.anInt919 = -1;
					}
					if (this.anInt1038 != -1) {
						this.method689(this.anInt1038);
						this.anInt1038 = -1;
					}
					if (this.anInt1037 != local179) {
						this.method689(this.anInt1037);
						this.anInt1037 = local179;
					}
					this.anInt996 = 0;
					this.aBoolean267 = false;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 233) {
					local179 = this.aClass2_Sub1_Sub4_9.method124();
					if (local179 >= 0) {
						this.method601((byte) 7, local179);
					}
					if (local179 != this.anInt1002) {
						this.method689(this.anInt1002);
						this.anInt1002 = local179;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 192) {
					this.aBoolean253 = false;
					this.anInt996 = 2;
					this.aString21 = "";
					this.aBoolean226 = true;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 6) {
					@Pc(1326) boolean local1326 = this.aClass2_Sub1_Sub4_9.method113() == 1;
					local183 = this.aClass2_Sub1_Sub4_9.method96();
					Class21.method256(local183).aBoolean102 = local1326;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 128) {
					this.anInt962 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 209) {
					local179 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					@Pc(1367) byte local1367 = this.aClass2_Sub1_Sub4_9.method95();
					this.anIntArray238[local179] = local1367;
					if (this.anIntArray274[local179] != local1367) {
						this.anIntArray274[local179] = local1367;
						this.method693(local179);
						this.aBoolean243 = true;
						if (this.anInt859 != -1) {
							this.aBoolean226 = true;
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 13) {
					local179 = this.aClass2_Sub1_Sub4_9.method121();
					local962 = Class21.method256(local179);
					for (local187 = 0; local187 < local962.anIntArray66.length; local187++) {
						local962.anIntArray66[local187] = -1;
						local962.anIntArray66[local187] = 0;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 149) {
					this.aBoolean243 = true;
					local179 = this.aClass2_Sub1_Sub4_9.method127();
					local183 = this.aClass2_Sub1_Sub4_9.method113();
					local187 = this.aClass2_Sub1_Sub4_9.method94();
					this.anIntArray239[local187] = local179;
					this.anIntArray268[local187] = local183;
					this.anIntArray269[local187] = 1;
					for (local839 = 0; local839 < 98; local839++) {
						if (local179 >= anIntArray242[local839]) {
							this.anIntArray269[local187] = local839 + 2;
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 235) {
					this.method621(this.aClass2_Sub1_Sub4_9, this.anInt831);
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 166) {
					this.method606();
					this.anInt832 = -1;
					return false;
				}
				if (this.anInt832 == 223) {
					local179 = this.aClass2_Sub1_Sub4_9.method122();
					if (local179 != this.anInt859) {
						this.method689(this.anInt859);
						this.anInt859 = local179;
					}
					this.aBoolean226 = true;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 238) {
					local179 = this.aClass2_Sub1_Sub4_9.method96();
					local183 = this.aClass2_Sub1_Sub4_9.method96();
					Class21.method256(local179).anInt426 = 2;
					Class21.method256(local179).anInt427 = local183;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 147) {
					if (this.anInt919 != -1) {
						this.method689(this.anInt919);
						this.anInt919 = -1;
						this.aBoolean243 = true;
						this.aBoolean230 = true;
					}
					if (this.anInt1038 != -1) {
						this.method689(this.anInt1038);
						this.anInt1038 = -1;
						this.aBoolean226 = true;
					}
					if (this.anInt1037 != -1) {
						this.method689(this.anInt1037);
						this.anInt1037 = -1;
						this.aBoolean246 = true;
					}
					if (this.anInt1040 != -1) {
						this.method689(this.anInt1040);
						this.anInt1040 = -1;
					}
					if (this.anInt996 != 0) {
						this.anInt996 = 0;
						this.aBoolean226 = true;
					}
					this.aBoolean267 = false;
					this.anInt832 = -1;
					return true;
				}
				@Pc(1687) boolean local1687;
				@Pc(1682) String local1682;
				@Pc(1822) String local1822;
				if (this.anInt832 == 141) {
					local1671 = this.aClass2_Sub1_Sub4_9.method101();
					@Pc(1685) long local1685;
					if (local1671.endsWith(":tradereq:")) {
						local1682 = local1671.substring(0, local1671.indexOf(":"));
						local1685 = Class18.method206(local1682);
						local1687 = false;
						for (local849 = 0; local849 < this.anInt820; local849++) {
							if (this.aLongArray4[local849] == local1685) {
								local1687 = true;
								break;
							}
						}
						if (!local1687 && this.anInt882 == 0) {
							this.method690((byte) 3, 4, "wishes to trade with you.", local1682);
						}
					} else if (local1671.endsWith(":duelreq:")) {
						local1682 = local1671.substring(0, local1671.indexOf(":"));
						local1685 = Class18.method206(local1682);
						local1687 = false;
						for (local849 = 0; local849 < this.anInt820; local849++) {
							if (this.aLongArray4[local849] == local1685) {
								local1687 = true;
								break;
							}
						}
						if (!local1687 && this.anInt882 == 0) {
							this.method690((byte) 3, 8, "wishes to duel with you.", local1682);
						}
					} else if (local1671.endsWith(":chalreq:")) {
						local1682 = local1671.substring(0, local1671.indexOf(":"));
						local1685 = Class18.method206(local1682);
						local1687 = false;
						for (local849 = 0; local849 < this.anInt820; local849++) {
							if (this.aLongArray4[local849] == local1685) {
								local1687 = true;
								break;
							}
						}
						if (!local1687 && this.anInt882 == 0) {
							local1822 = local1671.substring(local1671.indexOf(":") + 1, local1671.length() - 9);
							this.method690((byte) 3, 8, local1822, local1682);
						}
					} else {
						this.method690((byte) 3, 0, local1671, "");
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 51) {
					local179 = this.aClass2_Sub1_Sub4_9.method121();
					this.method601((byte) 7, local179);
					if (this.anInt919 != -1) {
						this.method689(this.anInt919);
						this.anInt919 = -1;
						this.aBoolean243 = true;
						this.aBoolean230 = true;
					}
					if (this.anInt1037 != -1) {
						this.method689(this.anInt1037);
						this.anInt1037 = -1;
						this.aBoolean246 = true;
					}
					if (this.anInt1040 != -1) {
						this.method689(this.anInt1040);
						this.anInt1040 = -1;
					}
					if (this.anInt1038 != local179) {
						this.method689(this.anInt1038);
						this.anInt1038 = local179;
					}
					this.aBoolean267 = false;
					this.aBoolean226 = true;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 109) {
					local1671 = this.aClass2_Sub1_Sub4_9.method101();
					local183 = this.aClass2_Sub1_Sub4_9.method121();
					Class21.method256(local183).aString11 = local1671;
					@Pc(1947) int local1947 = this.anIntArray243[this.anInt944];
					if (Class21.method256(local183).anInt418 == local1947) {
						this.aBoolean243 = true;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 69) {
					this.method664(this.anInt831, this.aClass2_Sub1_Sub4_9);
					this.aBoolean227 = false;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 113) {
					this.anInt955 = this.aClass2_Sub1_Sub4_9.method121() * 30;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 241) {
					local179 = this.aClass2_Sub1_Sub4_9.method121();
					if (local179 == 65535) {
						local179 = -1;
					}
					if (local179 != this.anInt884 && this.aBoolean260 && !aBoolean236 && this.anInt1013 == 0) {
						this.anInt827 = local179;
						this.aBoolean224 = true;
						this.aClass26_Sub1_1.method270(2, this.anInt827);
					}
					this.anInt884 = local179;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 239) {
					local179 = this.aClass2_Sub1_Sub4_9.method120();
					local183 = this.aClass2_Sub1_Sub4_9.method125();
					if (this.aBoolean260 && !aBoolean236) {
						this.anInt827 = local179;
						this.aBoolean224 = false;
						this.aClass26_Sub1_1.method270(2, this.anInt827);
						this.anInt1013 = local183;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 108) {
					local179 = this.aClass2_Sub1_Sub4_9.method96();
					local183 = this.aClass2_Sub1_Sub4_9.method121();
					local187 = this.aClass2_Sub1_Sub4_9.method96();
					if (local183 == 65535) {
						Class21.method256(local179).anInt426 = 0;
						this.anInt832 = -1;
						return true;
					}
					@Pc(2109) Class19 local2109 = Class19.method221(local183);
					Class21.method256(local179).anInt426 = 4;
					Class21.method256(local179).anInt427 = local183;
					Class21.method256(local179).anInt406 = local2109.anInt334;
					Class21.method256(local179).anInt407 = local2109.anInt351;
					Class21.method256(local179).anInt405 = local2109.anInt335 * 100 / local187;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 72) {
					local179 = this.aClass2_Sub1_Sub4_9.method94();
					local183 = this.aClass2_Sub1_Sub4_9.method94();
					local187 = this.aClass2_Sub1_Sub4_9.method94();
					local839 = this.aClass2_Sub1_Sub4_9.method94();
					this.aBooleanArray11[local179] = true;
					this.anIntArray237[local179] = local183;
					this.anIntArray230[local179] = local187;
					this.anIntArray229[local179] = local839;
					this.anIntArray270[local179] = 0;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 26) {
					this.anInt820 = this.anInt831 / 8;
					for (local179 = 0; local179 < this.anInt820; local179++) {
						this.aLongArray4[local179] = this.aClass2_Sub1_Sub4_9.method100();
					}
					this.anInt832 = -1;
					return true;
				}
				@Pc(2240) Class21 local2240;
				if (this.anInt832 == 54) {
					local179 = this.aClass2_Sub1_Sub4_9.method121();
					local183 = this.aClass2_Sub1_Sub4_9.method122();
					local2240 = Class21.method256(local179);
					if (local2240.anInt398 != local183 || local183 == -1) {
						local2240.anInt398 = local183;
						local2240.anInt421 = 0;
						local2240.anInt404 = 0;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 29) {
					local179 = this.aClass2_Sub1_Sub4_9.method121();
					local183 = this.aClass2_Sub1_Sub4_9.method96();
					local2240 = Class21.method256(local179);
					if (local2240 != null && local2240.anInt425 == 0) {
						if (local183 < 0) {
							local183 = 0;
						}
						if (local183 > local2240.anInt435 - local2240.anInt436) {
							local183 = local2240.anInt435 - local2240.anInt436;
						}
						local2240.anInt419 = local183;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 175) {
					this.anInt964 = 0;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 75) {
					if (this.anInt944 == 12) {
						this.aBoolean243 = true;
					}
					this.anInt855 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt832 = -1;
					return true;
				}
				@Pc(2497) int local2497;
				@Pc(2349) long local2349;
				if (this.anInt832 == 245) {
					local2349 = this.aClass2_Sub1_Sub4_9.method100();
					local187 = this.aClass2_Sub1_Sub4_9.method94();
					@Pc(2360) String local2360 = Class18.method210(Class18.method207(this.aBoolean255, local2349));
					for (local844 = 0; local844 < this.anInt898; local844++) {
						if (local2349 == this.aLongArray3[local844]) {
							if (this.anIntArray258[local844] != local187) {
								this.anIntArray258[local844] = local187;
								this.aBoolean243 = true;
								if (local187 > 0) {
									this.method690((byte) 3, 5, local2360 + " has logged in.", "");
								}
								if (local187 == 0) {
									this.method690((byte) 3, 5, local2360 + " has logged out.", "");
								}
							}
							local2360 = null;
							break;
						}
					}
					if (local2360 != null && this.anInt898 < 200) {
						this.aLongArray3[this.anInt898] = local2349;
						this.aStringArray9[this.anInt898] = local2360;
						this.anIntArray258[this.anInt898] = local187;
						this.anInt898++;
						this.aBoolean243 = true;
					}
					@Pc(2458) boolean local2458 = false;
					while (!local2458) {
						local2458 = true;
						for (local860 = 0; local860 < this.anInt898 - 1; local860++) {
							if (this.anIntArray258[local860] != anInt891 && this.anIntArray258[local860 + 1] == anInt891 || this.anIntArray258[local860] == 0 && this.anIntArray258[local860 + 1] != 0) {
								local2497 = this.anIntArray258[local860];
								this.anIntArray258[local860] = this.anIntArray258[local860 + 1];
								this.anIntArray258[local860 + 1] = local2497;
								@Pc(2519) String local2519 = this.aStringArray9[local860];
								this.aStringArray9[local860] = this.aStringArray9[local860 + 1];
								this.aStringArray9[local860 + 1] = local2519;
								@Pc(2541) long local2541 = this.aLongArray3[local860];
								this.aLongArray3[local860] = this.aLongArray3[local860 + 1];
								this.aLongArray3[local860 + 1] = local2541;
								this.aBoolean243 = true;
								local2458 = false;
							}
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 15) {
					this.anInt829 = this.aClass2_Sub1_Sub4_9.method113();
					this.anInt830 = this.aClass2_Sub1_Sub4_9.method113();
					while (this.aClass2_Sub1_Sub4_9.anInt166 < this.anInt831) {
						local179 = this.aClass2_Sub1_Sub4_9.method94();
						this.method681(this.aClass2_Sub1_Sub4_9, local179);
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 217) {
					this.anInt829 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt830 = this.aClass2_Sub1_Sub4_9.method113();
					for (local179 = this.anInt829; local179 < this.anInt829 + 8; local179++) {
						for (local183 = this.anInt830; local183 < this.anInt830 + 8; local183++) {
							if (this.aClass48ArrayArrayArray1[this.anInt909][local179][local183] != null) {
								this.aClass48ArrayArrayArray1[this.anInt909][local179][local183] = null;
								this.method620(local179, local183);
							}
						}
					}
					for (@Pc(2684) Class2_Sub3 local2684 = (Class2_Sub3) this.aClass48_10.method565(); local2684 != null; local2684 = (Class2_Sub3) this.aClass48_10.method567()) {
						if (local2684.anInt713 >= this.anInt829 && local2684.anInt713 < this.anInt829 + 8 && local2684.anInt714 >= this.anInt830 && local2684.anInt714 < this.anInt830 + 8 && local2684.anInt711 == this.anInt909) {
							local2684.anInt709 = 0;
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 185 || this.anInt832 == 87 || this.anInt832 == 207 || this.anInt832 == 253 || this.anInt832 == 94 || this.anInt832 == 24 || this.anInt832 == 212 || this.anInt832 == 52 || this.anInt832 == 77 || this.anInt832 == 211 || this.anInt832 == 197) {
					this.method681(this.aClass2_Sub1_Sub4_9, this.anInt832);
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 130) {
					this.aBoolean271 = true;
					this.anInt876 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt877 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt878 = this.aClass2_Sub1_Sub4_9.method96();
					this.anInt879 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt880 = this.aClass2_Sub1_Sub4_9.method94();
					if (this.anInt880 >= 100) {
						this.anInt923 = this.anInt876 * 128 + 64;
						this.anInt925 = this.anInt877 * 128 + 64;
						this.anInt924 = this.method640(this.anInt909, this.anInt923, this.anInt925) - this.anInt878;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 38) {
					if (this.anInt944 == 12) {
						this.aBoolean243 = true;
					}
					this.anInt871 = this.aClass2_Sub1_Sub4_9.method97();
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 165 || this.anInt832 == 95) {
					local179 = this.anInt932;
					local183 = this.anInt933;
					if (this.anInt832 == 165) {
						local179 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
						local183 = this.aClass2_Sub1_Sub4_9.method121();
						this.aBoolean268 = false;
					}
					if (this.anInt832 == 95) {
						local179 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
						this.aClass2_Sub1_Sub4_9.method104();
						local187 = 0;
						while (true) {
							if (local187 >= 4) {
								this.aClass2_Sub1_Sub4_9.method106();
								local183 = this.aClass2_Sub1_Sub4_9.method96();
								this.aBoolean268 = true;
								break;
							}
							for (local839 = 0; local839 < 13; local839++) {
								for (local844 = 0; local844 < 13; local844++) {
									local849 = this.aClass2_Sub1_Sub4_9.method105(1);
									if (local849 == 1) {
										this.anIntArrayArrayArray7[local187][local839][local844] = this.aClass2_Sub1_Sub4_9.method105(26);
									} else {
										this.anIntArrayArrayArray7[local187][local839][local844] = -1;
									}
								}
							}
							local187++;
						}
					}
					if (this.anInt932 == local179 && this.anInt933 == local183 && this.anInt1030 == 2) {
						this.anInt832 = -1;
						return true;
					}
					this.anInt932 = local179;
					this.anInt933 = local183;
					this.anInt905 = (this.anInt932 - 6) * 8;
					this.anInt906 = (this.anInt933 - 6) * 8;
					this.aBoolean247 = false;
					if ((this.anInt932 / 8 == 48 || this.anInt932 / 8 == 49) && this.anInt933 / 8 == 48) {
						this.aBoolean247 = true;
					}
					if (this.anInt932 / 8 == 48 && this.anInt933 / 8 == 148) {
						this.aBoolean247 = true;
					}
					this.anInt1030 = 1;
					this.aLong29 = System.currentTimeMillis();
					if (this.aClass42_26 != null) {
						this.aClass42_26.method420();
						Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
						this.aClass2_Sub1_Sub1_Sub2_3.method149(0, 257, "Loading - please wait.", 151);
						this.aClass2_Sub1_Sub1_Sub2_3.method149(16777215, 256, "Loading - please wait.", 150);
						this.aClass42_26.method421(4, 722, super.aGraphics2, 4);
					} else if (super.aClass42_2 != null) {
						super.aClass42_2.method420();
						Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray253;
						this.aClass2_Sub1_Sub1_Sub2_3.method149(0, 383, "Loading - please wait.", 471);
						this.aClass2_Sub1_Sub1_Sub2_3.method149(16777215, 382, "Loading - please wait.", 470);
						super.aClass42_2.method421(0, 722, super.aGraphics2, 0);
					}
					if (this.anInt832 == 165) {
						local187 = 0;
						local839 = (this.anInt932 - 6) / 8;
						label1195: while (true) {
							if (local839 > (this.anInt932 + 6) / 8) {
								this.aByteArrayArray6 = new byte[local187][];
								this.aByteArrayArray5 = new byte[local187][];
								this.anIntArray233 = new int[local187];
								this.anIntArray234 = new int[local187];
								this.anIntArray235 = new int[local187];
								local187 = 0;
								local844 = (this.anInt932 - 6) / 8;
								while (true) {
									if (local844 > (this.anInt932 + 6) / 8) {
										break label1195;
									}
									for (local849 = (this.anInt933 - 6) / 8; local849 <= (this.anInt933 + 6) / 8; local849++) {
										this.anIntArray233[local187] = (local844 << 8) + local849;
										if (this.aBoolean247 && (local849 == 49 || local849 == 149 || local849 == 147 || local844 == 50 || local844 == 49 && local849 == 47)) {
											this.anIntArray234[local187] = -1;
											this.anIntArray235[local187] = -1;
											local187++;
										} else {
											local860 = this.anIntArray234[local187] = this.aClass26_Sub1_1.method282(local849, local844, 0);
											if (local860 != -1) {
												this.aClass26_Sub1_1.method270(3, local860);
											}
											local2497 = this.anIntArray235[local187] = this.aClass26_Sub1_1.method282(local849, local844, 1);
											if (local2497 != -1) {
												this.aClass26_Sub1_1.method270(3, local2497);
											}
											local187++;
										}
									}
									local844++;
								}
							}
							for (local844 = (this.anInt933 - 6) / 8; local844 <= (this.anInt933 + 6) / 8; local844++) {
								local187++;
							}
							local839++;
						}
					}
					if (this.anInt832 == 95) {
						local187 = 0;
						@Pc(3343) int[] local3343 = new int[676];
						local844 = 0;
						label1156: while (true) {
							@Pc(3373) int local3373;
							@Pc(3379) int local3379;
							@Pc(3389) int local3389;
							if (local844 >= 4) {
								this.aByteArrayArray6 = new byte[local187][];
								this.aByteArrayArray5 = new byte[local187][];
								this.anIntArray233 = new int[local187];
								this.anIntArray234 = new int[local187];
								this.anIntArray235 = new int[local187];
								local849 = 0;
								while (true) {
									if (local849 >= local187) {
										break label1156;
									}
									local860 = this.anIntArray233[local849] = local3343[local849];
									local2497 = local860 >> 8 & 0xFF;
									local3373 = local860 & 0xFF;
									local3379 = this.anIntArray234[local849] = this.aClass26_Sub1_1.method282(local3373, local2497, 0);
									if (local3379 != -1) {
										this.aClass26_Sub1_1.method270(3, local3379);
									}
									local3389 = this.anIntArray235[local849] = this.aClass26_Sub1_1.method282(local3373, local2497, 1);
									if (local3389 != -1) {
										this.aClass26_Sub1_1.method270(3, local3389);
									}
									local849++;
								}
							}
							for (local849 = 0; local849 < 13; local849++) {
								for (local860 = 0; local860 < 13; local860++) {
									local2497 = this.anIntArrayArrayArray7[local844][local849][local860];
									if (local2497 != -1) {
										local3373 = local2497 >> 14 & 0x3FF;
										local3379 = local2497 >> 3 & 0x7FF;
										local3389 = (local3373 / 8 << 8) + local3379 / 8;
										for (@Pc(3391) int local3391 = 0; local3391 < local187; local3391++) {
											if (local3343[local3391] == local3389) {
												local3389 = -1;
												break;
											}
										}
										if (local3389 != -1) {
											local3343[local187++] = local3389;
										}
									}
								}
							}
							local844++;
						}
					}
					local187 = this.anInt905 - this.anInt907;
					local839 = this.anInt906 - this.anInt908;
					this.anInt907 = this.anInt905;
					this.anInt908 = this.anInt906;
					for (local844 = 0; local844 < 16384; local844++) {
						@Pc(3544) Class2_Sub1_Sub2_Sub1_Sub1 local3544 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local844];
						if (local3544 != null) {
							for (local860 = 0; local860 < 10; local860++) {
								local3544.anIntArray51[local860] -= local187;
								local3544.anIntArray52[local860] -= local839;
							}
							local3544.anInt285 -= local187 * 128;
							local3544.anInt286 -= local839 * 128;
						}
					}
					for (local849 = 0; local849 < this.anInt1018; local849++) {
						@Pc(3599) Class2_Sub1_Sub2_Sub1_Sub2 local3599 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local849];
						if (local3599 != null) {
							for (local2497 = 0; local2497 < 10; local2497++) {
								local3599.anIntArray51[local2497] -= local187;
								local3599.anIntArray52[local2497] -= local839;
							}
							local3599.anInt285 -= local187 * 128;
							local3599.anInt286 -= local839 * 128;
						}
					}
					this.aBoolean227 = true;
					@Pc(3651) byte local3651 = 0;
					@Pc(3653) byte local3653 = 104;
					@Pc(3655) byte local3655 = 1;
					if (local187 < 0) {
						local3651 = 103;
						local3653 = -1;
						local3655 = -1;
					}
					@Pc(3665) byte local3665 = 0;
					@Pc(3667) byte local3667 = 104;
					@Pc(3669) byte local3669 = 1;
					if (local839 < 0) {
						local3665 = 103;
						local3667 = -1;
						local3669 = -1;
					}
					for (@Pc(3679) int local3679 = local3651; local3679 != local3653; local3679 += local3655) {
						for (@Pc(3683) int local3683 = local3665; local3683 != local3667; local3683 += local3669) {
							@Pc(3689) int local3689 = local3679 + local187;
							@Pc(3693) int local3693 = local3683 + local839;
							for (@Pc(3695) int local3695 = 0; local3695 < 4; local3695++) {
								if (local3689 >= 0 && local3693 >= 0 && local3689 < 104 && local3693 < 104) {
									this.aClass48ArrayArrayArray1[local3695][local3679][local3683] = this.aClass48ArrayArrayArray1[local3695][local3689][local3693];
								} else {
									this.aClass48ArrayArrayArray1[local3695][local3679][local3683] = null;
								}
							}
						}
					}
					for (@Pc(3757) Class2_Sub3 local3757 = (Class2_Sub3) this.aClass48_10.method565(); local3757 != null; local3757 = (Class2_Sub3) this.aClass48_10.method567()) {
						local3757.anInt713 -= local187;
						local3757.anInt714 -= local839;
						if (local3757.anInt713 < 0 || local3757.anInt714 < 0 || local3757.anInt713 >= 104 || local3757.anInt714 >= 104) {
							local3757.method558();
						}
					}
					if (this.anInt964 != 0) {
						this.anInt964 -= local187;
						this.anInt965 -= local839;
					}
					this.aBoolean271 = false;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 232) {
					local179 = this.aClass2_Sub1_Sub4_9.method120();
					local183 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					if (this.anInt1038 != -1) {
						this.method689(this.anInt1038);
						this.anInt1038 = -1;
						this.aBoolean226 = true;
					}
					if (this.anInt1037 != -1) {
						this.method689(this.anInt1037);
						this.anInt1037 = -1;
						this.aBoolean246 = true;
					}
					if (this.anInt1040 != local179) {
						this.method689(this.anInt1040);
						this.anInt1040 = local179;
					}
					if (this.anInt919 != local183) {
						this.method689(this.anInt919);
						this.anInt919 = local183;
					}
					if (this.anInt996 != 0) {
						this.anInt996 = 0;
						this.aBoolean226 = true;
					}
					this.aBoolean243 = true;
					this.aBoolean230 = true;
					this.aBoolean267 = false;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 213) {
					this.anInt829 = this.aClass2_Sub1_Sub4_9.method112();
					this.anInt830 = this.aClass2_Sub1_Sub4_9.method94();
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 169) {
					this.anInt931 = this.aClass2_Sub1_Sub4_9.method94();
					if (this.anInt931 == 1) {
						this.anInt858 = this.aClass2_Sub1_Sub4_9.method96();
					}
					if (this.anInt931 >= 2 && this.anInt931 <= 6) {
						if (this.anInt931 == 2) {
							this.anInt917 = 64;
							this.anInt918 = 64;
						}
						if (this.anInt931 == 3) {
							this.anInt917 = 0;
							this.anInt918 = 64;
						}
						if (this.anInt931 == 4) {
							this.anInt917 = 128;
							this.anInt918 = 64;
						}
						if (this.anInt931 == 5) {
							this.anInt917 = 64;
							this.anInt918 = 0;
						}
						if (this.anInt931 == 6) {
							this.anInt917 = 64;
							this.anInt918 = 128;
						}
						this.anInt931 = 2;
						this.anInt914 = this.aClass2_Sub1_Sub4_9.method96();
						this.anInt915 = this.aClass2_Sub1_Sub4_9.method96();
						this.anInt916 = this.aClass2_Sub1_Sub4_9.method94();
					}
					if (this.anInt931 == 10) {
						this.anInt870 = this.aClass2_Sub1_Sub4_9.method96();
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 249) {
					local179 = this.aClass2_Sub1_Sub4_9.method121();
					local183 = this.aClass2_Sub1_Sub4_9.method94();
					if (local179 == 65535) {
						local179 = -1;
					}
					if (this.anIntArray243[local183] != local179) {
						this.method689(this.anIntArray243[local183]);
						this.anIntArray243[local183] = local179;
					}
					this.aBoolean243 = true;
					this.aBoolean230 = true;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 33) {
					local179 = this.aClass2_Sub1_Sub4_9.method94();
					local1682 = this.aClass2_Sub1_Sub4_9.method101();
					local187 = this.aClass2_Sub1_Sub4_9.method112();
					if (local187 >= 1 && local187 <= 5) {
						if (local1682.equalsIgnoreCase("null")) {
							local1682 = null;
						}
						this.aStringArray13[local187 - 1] = local1682;
						this.aBooleanArray12[local187 - 1] = local179 == 0;
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 18) {
					local179 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					local183 = this.aClass2_Sub1_Sub4_9.method96();
					local187 = this.aClass2_Sub1_Sub4_9.method119(this.aByte58);
					local839 = this.aClass2_Sub1_Sub4_9.method121();
					Class21.method256(local187).anInt406 = local839;
					Class21.method256(local187).anInt407 = local179;
					Class21.method256(local187).anInt405 = local183;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 110) {
					this.anInt944 = this.aClass2_Sub1_Sub4_9.method112();
					this.aBoolean243 = true;
					this.aBoolean230 = true;
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 48) {
					for (local179 = 0; local179 < this.anIntArray274.length; local179++) {
						if (this.anIntArray274[local179] != this.anIntArray238[local179]) {
							this.anIntArray274[local179] = this.anIntArray238[local179];
							this.method693(local179);
							this.aBoolean243 = true;
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 67) {
					this.aBoolean243 = true;
					local179 = this.aClass2_Sub1_Sub4_9.method96();
					local962 = Class21.method256(local179);
					while (this.aClass2_Sub1_Sub4_9.anInt166 < this.anInt831) {
						local187 = this.aClass2_Sub1_Sub4_9.method108();
						local839 = this.aClass2_Sub1_Sub4_9.method96();
						local844 = this.aClass2_Sub1_Sub4_9.method94();
						if (local844 == 255) {
							local844 = this.aClass2_Sub1_Sub4_9.method99();
						}
						if (local187 >= 0 && local187 < local962.anIntArray66.length) {
							local962.anIntArray66[local187] = local839;
							local962.anIntArray74[local187] = local844;
						}
					}
					this.anInt832 = -1;
					return true;
				}
				if (this.anInt832 == 208) {
					local2349 = this.aClass2_Sub1_Sub4_9.method100();
					local187 = this.aClass2_Sub1_Sub4_9.method99();
					local839 = this.aClass2_Sub1_Sub4_9.method94();
					local1687 = false;
					for (local849 = 0; local849 < 100; local849++) {
						if (this.anIntArray259[local849] == local187) {
							local1687 = true;
							break;
						}
					}
					if (local839 <= 1) {
						for (local860 = 0; local860 < this.anInt820; local860++) {
							if (this.aLongArray4[local860] == local2349) {
								local1687 = true;
								break;
							}
						}
					}
					if (!local1687 && this.anInt882 == 0) {
						try {
							this.anIntArray259[this.anInt846] = local187;
							this.anInt846 = (this.anInt846 + 1) % 100;
							local1822 = Class36.method360(this.anInt831 - 13, this.aClass2_Sub1_Sub4_9);
							if (local839 != 3) {
								local1822 = Class44.method437(local1822);
							}
							if (local839 == 2 || local839 == 3) {
								this.method690((byte) 3, 7, local1822, "@cr2@" + Class18.method210(Class18.method207(this.aBoolean255, local2349)));
							} else if (local839 == 1) {
								this.method690((byte) 3, 7, local1822, "@cr1@" + Class18.method210(Class18.method207(this.aBoolean255, local2349)));
							} else {
								this.method690((byte) 3, 3, local1822, Class18.method210(Class18.method207(this.aBoolean255, local2349)));
							}
						} catch (@Pc(4461) Exception local4461) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt832 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt832 + "," + this.anInt831 + " - " + this.anInt921 + "," + this.anInt922);
				this.method606();
			} catch (@Pc(4498) IOException local4498) {
				this.method686();
			} catch (@Pc(4503) Exception local4503) {
				local1671 = "T2 - " + this.anInt832 + "," + this.anInt921 + "," + this.anInt922 + " - " + this.anInt831 + "," + (this.anInt905 + aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0]) + "," + (this.anInt906 + aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0]) + " - ";
				for (local183 = 0; local183 < this.anInt831 && local183 < 50; local183++) {
					local1671 = local1671 + this.aClass2_Sub1_Sub4_9.aByteArray2[local183] + ",";
				}
				signlink.reporterror(local1671);
				this.method606();
			}
			return true;
		} catch (@Pc(4584) RuntimeException local4584) {
			signlink.reporterror("40453, " + arg0 + ", " + local4584.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method626() {
		try {
			if (this.anInt929 != 0) {
				@Pc(10) int local10 = 0;
				if (this.anInt955 != 0) {
					local10 = 1;
				}
				for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
					if (this.aStringArray12[local17] != null) {
						@Pc(29) int local29 = this.anIntArray241[local17];
						@Pc(34) String local34 = this.aStringArray11[local17];
						if (local34 != null && local34.startsWith("@cr1@")) {
							local34 = local34.substring(5);
						}
						if (local34 != null && local34.startsWith("@cr2@")) {
							local34 = local34.substring(5);
						}
						if ((local29 == 3 || local29 == 7) && (local29 == 7 || this.anInt939 == 0 || this.anInt939 == 1 && this.method653(local34, (byte) 4))) {
							@Pc(87) int local87 = 329 - local10 * 13;
							if (super.anInt807 > 4 && super.anInt808 - 4 > local87 - 10 && super.anInt808 - 4 <= local87 + 3) {
								@Pc(126) int local126 = this.aClass2_Sub1_Sub1_Sub2_3.method151("From:  " + local34 + this.aStringArray12[local17]) + 25;
								if (local126 > 450) {
									local126 = 450;
								}
								if (super.anInt807 < local126 + 4) {
									if (this.anInt1027 >= 1) {
										this.aStringArray10[this.anInt1043] = "Report abuse @whi@" + local34;
										this.anIntArray248[this.anInt1043] = 2208;
										this.anInt1043++;
									}
									this.aStringArray10[this.anInt1043] = "Add ignore @whi@" + local34;
									this.anIntArray248[this.anInt1043] = 2064;
									this.anInt1043++;
									this.aStringArray10[this.anInt1043] = "Add friend @whi@" + local34;
									this.anIntArray248[this.anInt1043] = 2723;
									this.anInt1043++;
								}
							}
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if ((local29 == 5 || local29 == 6) && this.anInt939 < 2) {
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(239) RuntimeException local239) {
			signlink.reporterror("52279, " + -57 + ", " + local239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method627(@OriginalArg(0) boolean arg0) {
		try {
			this.method644((byte) 1);
			this.aClass42_17.method420();
			this.aClass2_Sub1_Sub1_Sub3_1.method348(0, 0);
			@Pc(47) byte local47;
			@Pc(59) int local59;
			if (this.anInt895 == 0) {
				this.aClass2_Sub1_Sub1_Sub2_2.method150(this.aClass26_Sub1_1.aString14, true, 180, 7711145, 180);
				local47 = 80;
				this.aClass2_Sub1_Sub1_Sub2_4.method150("Welcome to RuneScape", true, 80, 16776960, 180);
				local59 = local47 + 30;
				this.aClass2_Sub1_Sub1_Sub3_2.method348(27, 100);
				this.aClass2_Sub1_Sub1_Sub2_4.method150("New User", true, 125, 16777215, 100);
				this.aClass2_Sub1_Sub1_Sub3_2.method348(187, 100);
				this.aClass2_Sub1_Sub1_Sub2_4.method150("Existing User", true, 125, 16777215, 260);
			}
			if (this.anInt895 == 2) {
				local47 = 60;
				if (this.aString26.length() > 0) {
					this.aClass2_Sub1_Sub1_Sub2_4.method150(this.aString26, true, 45, 16776960, 180);
					this.aClass2_Sub1_Sub1_Sub2_4.method150(this.aString27, true, 60, 16776960, 180);
					local59 = local47 + 30;
				} else {
					this.aClass2_Sub1_Sub1_Sub2_4.method150(this.aString27, true, 53, 16776960, 180);
					local59 = local47 + 30;
				}
				this.aClass2_Sub1_Sub1_Sub2_4.method157(90, "Username: " + this.aString22 + (this.anInt1025 == 0 & anInt967 % 40 < 20 ? "@yel@|" : ""), true, 90, 16777215);
				local59 += 15;
				this.aClass2_Sub1_Sub1_Sub2_4.method157(92, "Password: " + Class18.method211(this.aString23) + (this.anInt1025 == 1 & anInt967 % 40 < 20 ? "@yel@|" : ""), true, 105, 16777215);
				local59 += 15;
				if (!arg0) {
					this.aClass2_Sub1_Sub1_Sub3_2.method348(27, 130);
					this.aClass2_Sub1_Sub1_Sub2_4.method150("Login", true, 155, 16777215, 100);
					this.aClass2_Sub1_Sub1_Sub3_2.method348(187, 130);
					this.aClass2_Sub1_Sub1_Sub2_4.method150("Cancel", true, 155, 16777215, 260);
				}
			}
			if (this.anInt895 == 3) {
				this.aClass2_Sub1_Sub1_Sub2_4.method150("Create a free account", true, 40, 16776960, 180);
				local47 = 65;
				this.aClass2_Sub1_Sub1_Sub2_4.method150("To create a new account you need to", true, 65, 16777215, 180);
				local59 = local47 + 15;
				this.aClass2_Sub1_Sub1_Sub2_4.method150("go back to the main RuneScape webpage", true, 80, 16777215, 180);
				local59 += 15;
				this.aClass2_Sub1_Sub1_Sub2_4.method150("and choose the red 'create account'", true, 95, 16777215, 180);
				local59 += 15;
				this.aClass2_Sub1_Sub1_Sub2_4.method150("button at the top right of that page.", true, 110, 16777215, 180);
				local59 += 15;
				this.aClass2_Sub1_Sub1_Sub3_2.method348(107, 130);
				this.aClass2_Sub1_Sub1_Sub2_4.method150("Cancel", true, 155, 16777215, 180);
			}
			this.aClass42_17.method421(202, 722, super.aGraphics2, 171);
			if (this.aBoolean246) {
				this.aBoolean246 = false;
				this.aClass42_15.method421(128, 722, super.aGraphics2, 0);
				this.aClass42_16.method421(202, 722, super.aGraphics2, 371);
				this.aClass42_20.method421(0, 722, super.aGraphics2, 265);
				this.aClass42_21.method421(562, 722, super.aGraphics2, 265);
				this.aClass42_22.method421(128, 722, super.aGraphics2, 171);
				this.aClass42_23.method421(562, 722, super.aGraphics2, 171);
			}
		} catch (@Pc(492) RuntimeException local492) {
			signlink.reporterror("70068, " + arg0 + ", " + 444 + ", " + local492.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method628() {
		try {
			@Pc(36) int local36;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(57) int local57;
			@Pc(105) int local105;
			@Pc(119) int local119;
			@Pc(131) int local131;
			@Pc(190) int local190;
			try {
				this.anInt990 = -1;
				this.aClass48_12.method569();
				this.aClass48_11.method569();
				anInt1001++;
				if (anInt1001 > 94) {
					anInt1001 = 0;
					this.aClass2_Sub1_Sub4_6.method83(129);
				}
				Class2_Sub1_Sub1_Sub1.method35();
				this.method638();
				this.aClass47_1.method507();
				System.gc();
				for (local36 = 0; local36 < 4; local36++) {
					this.aClass45Array1[local36].method465();
				}
				for (local49 = 0; local49 < 4; local49++) {
					for (local53 = 0; local53 < 104; local53++) {
						for (local57 = 0; local57 < 104; local57++) {
							this.aByteArrayArrayArray8[local49][local53][local57] = 0;
						}
					}
				}
				@Pc(91) Class31 local91 = new Class31(104, this.aByteArrayArrayArray8, (byte) 71, this.anIntArrayArrayArray8, 104);
				local57 = this.aByteArrayArray6.length;
				this.aClass2_Sub1_Sub4_6.method83(231);
				@Pc(252) int local252;
				@Pc(240) int local240;
				if (!this.aBoolean268) {
					@Pc(136) byte[] local136;
					for (local105 = 0; local105 < local57; local105++) {
						local119 = (this.anIntArray233[local105] >> 8) * 64 - this.anInt905;
						local131 = (this.anIntArray233[local105] & 0xFF) * 64 - this.anInt906;
						local136 = this.aByteArrayArray6[local105];
						if (local136 != null) {
							local91.method316(local131, (this.anInt933 - 6) * 8, local119, local136, (byte) 2, this.aClass45Array1, (this.anInt932 - 6) * 8);
						}
					}
					for (local119 = 0; local119 < local57; local119++) {
						local131 = (this.anIntArray233[local119] >> 8) * 64 - this.anInt905;
						local190 = (this.anIntArray233[local119] & 0xFF) * 64 - this.anInt906;
						@Pc(195) byte[] local195 = this.aByteArrayArray6[local119];
						if (local195 == null && this.anInt933 < 800) {
							local91.method299(64, 64, local190, local131);
						}
					}
					this.aClass2_Sub1_Sub4_6.method83(231);
					for (local131 = 0; local131 < local57; local131++) {
						local136 = this.aByteArrayArray5[local131];
						if (local136 != null) {
							local240 = (this.anIntArray233[local131] >> 8) * 64 - this.anInt905;
							local252 = (this.anIntArray233[local131] & 0xFF) * 64 - this.anInt906;
							local91.method312(local252, local240, local136, this.aClass47_1, this.aClass45Array1);
						}
					}
				}
				if (this.aBoolean268) {
					local105 = 0;
					label254: while (true) {
						@Pc(311) int local311;
						@Pc(317) int local317;
						@Pc(327) int local327;
						@Pc(329) int local329;
						if (local105 >= 4) {
							for (local119 = 0; local119 < 13; local119++) {
								for (local131 = 0; local131 < 13; local131++) {
									local190 = this.anIntArrayArrayArray7[0][local119][local131];
									if (local190 == -1) {
										local91.method299(8, 8, local131 * 8, local119 * 8);
									}
								}
							}
							this.aClass2_Sub1_Sub4_6.method83(231);
							local131 = 0;
							while (true) {
								if (local131 >= 4) {
									break label254;
								}
								for (local190 = 0; local190 < 13; local190++) {
									for (local240 = 0; local240 < 13; local240++) {
										local252 = this.anIntArrayArrayArray7[local131][local190][local240];
										if (local252 != -1) {
											local311 = local252 >> 24 & 0x3;
											local317 = local252 >> 1 & 0x3;
											local327 = local252 >> 14 & 0x3FF;
											local329 = local252 >> 3 & 0x7FF;
											@Pc(492) int local492 = (local327 / 8 << 8) + local329 / 8;
											for (@Pc(494) int local494 = 0; local494 < this.anIntArray233.length; local494++) {
												if (this.anIntArray233[local494] == local492 && this.aByteArrayArray5[local494] != null) {
													local91.method308((local329 & 0x7) * 8, local317, this.aClass45Array1, local311, local190 * 8, (local327 & 0x7) * 8, local240 * 8, this.aClass47_1, local131, this.aByteArrayArray5[local494]);
													break;
												}
											}
										}
									}
								}
								local131++;
							}
						}
						for (local119 = 0; local119 < 13; local119++) {
							for (local131 = 0; local131 < 13; local131++) {
								local190 = this.anIntArrayArrayArray7[local105][local119][local131];
								if (local190 != -1) {
									local240 = local190 >> 24 & 0x3;
									local252 = local190 >> 1 & 0x3;
									local311 = local190 >> 14 & 0x3FF;
									local317 = local190 >> 3 & 0x7FF;
									local327 = (local311 / 8 << 8) + local317 / 8;
									for (local329 = 0; local329 < this.anIntArray233.length; local329++) {
										if (this.anIntArray233[local329] == local327 && this.aByteArrayArray6[local329] != null) {
											local91.method313((local317 & 0x7) * 8, local131 * 8, local119 * 8, local240, this.aClass45Array1, local252, this.aByteArrayArray6[local329], (local311 & 0x7) * 8, local105);
											break;
										}
									}
								}
							}
						}
						local105++;
					}
				}
				this.aClass2_Sub1_Sub4_6.method83(231);
				local91.method314(this.aClass45Array1, this.aClass47_1);
				if (this.aClass42_26 != null) {
					this.aClass42_26.method420();
					Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
				}
				this.aClass2_Sub1_Sub4_6.method83(231);
				local105 = Class31.anInt506;
				if (local105 > this.anInt909) {
					local105 = this.anInt909;
				}
				if (local105 < this.anInt909 - 1) {
					local105 = this.anInt909 - 1;
				}
				if (aBoolean236) {
					this.aClass47_1.method508(Class31.anInt506, this.anInt1039);
				} else {
					this.aClass47_1.method508(0, this.anInt1039);
				}
				for (local119 = 0; local119 < 104; local119++) {
					for (local131 = 0; local131 < 104; local131++) {
						this.method620(local119, local131);
					}
				}
				this.method682();
			} catch (@Pc(645) Exception local645) {
			}
			Class41.aClass37_8.method365();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass2_Sub1_Sub4_6.method83(207);
				this.aClass2_Sub1_Sub4_6.method88(1057001181);
			}
			if (aBoolean236 && signlink.aRandomAccessFile3 != null) {
				local36 = this.aClass26_Sub1_1.method283(0);
				for (local49 = 0; local49 < local36; local49++) {
					local53 = this.aClass26_Sub1_1.method280(local49);
					if ((local53 & 0x79) == 0) {
						Class2_Sub1_Sub2_Sub5.method383(local49);
					}
				}
			}
			System.gc();
			Class2_Sub1_Sub1_Sub1.method36();
			this.aClass26_Sub1_1.method273();
			local36 = (this.anInt932 - 6) / 8 - 1;
			local49 = (this.anInt932 + 6) / 8 + 1;
			local53 = (this.anInt933 - 6) / 8 - 1;
			local57 = (this.anInt933 + 6) / 8 + 1;
			if (this.aBoolean247) {
				local36 = 49;
				local49 = 50;
				local53 = 49;
				local57 = 50;
			}
			for (local105 = local36; local105 <= local49; local105++) {
				for (local119 = local53; local119 <= local57; local119++) {
					if (local105 == local36 || local105 == local49 || local119 == local53 || local119 == local57) {
						local131 = this.aClass26_Sub1_1.method282(local119, local105, 0);
						if (local131 != -1) {
							this.aClass26_Sub1_1.method272(local131, 3);
						}
						local190 = this.aClass26_Sub1_1.method282(local119, local105, 1);
						if (local190 != -1) {
							this.aClass26_Sub1_1.method272(local190, 3);
						}
					}
				}
			}
		} catch (@Pc(819) RuntimeException local819) {
			signlink.reporterror("12107, " + false + ", " + local819.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method629(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(11) int local11 = 0; local11 < this.anInt820; local11++) {
					if (this.aLongArray4[local11] == arg0) {
						this.anInt820--;
						this.aBoolean243 = true;
						for (@Pc(31) int local31 = local11; local31 < this.anInt820; local31++) {
							this.aLongArray4[local31] = this.aLongArray4[local31 + 1];
						}
						this.aClass2_Sub1_Sub4_6.method83(46);
						this.aClass2_Sub1_Sub4_6.method90(arg0);
						return;
					}
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("10434, " + arg0 + ", " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method630() {
		try {
			this.method663(this.anInt887);
			if (this.anInt826 == 1) {
				this.aClass2_Sub1_Sub1_Sub4Array7[this.anInt825 / 100].method497(this.anInt823 - 8 - 4, this.anInt824 - 8 - 4);
			}
			if (this.anInt826 == 2) {
				this.aClass2_Sub1_Sub1_Sub4Array7[this.anInt825 / 100 + 4].method497(this.anInt823 - 8 - 4, this.anInt824 - 8 - 4);
			}
			if (this.anInt1002 != -1) {
				this.method720(this.anInt850, this.anInt1002);
				this.method692(0, 0, Class21.method256(this.anInt1002), 0);
			}
			if (this.anInt1040 != -1) {
				this.method720(this.anInt850, this.anInt1040);
				this.method692(0, 0, Class21.method256(this.anInt1040), 0);
			}
			this.method667();
			if (!this.aBoolean248) {
				this.method615();
				this.method688(739);
			} else if (this.anInt1007 == 0) {
				this.method618();
			}
			if (this.anInt962 == 1) {
				this.aClass2_Sub1_Sub1_Sub4_17.method497(472, 296);
			}
			@Pc(166) int local166;
			if (aBoolean223) {
				@Pc(141) byte local141 = 20;
				@Pc(143) int local143 = 16776960;
				if (super.anInt802 < 15) {
					local143 = 16711680;
				}
				this.aClass2_Sub1_Sub1_Sub2_3.method148(local143, 20, this.anInt848, "Fps:" + super.anInt802);
				local166 = local141 + 15;
				@Pc(168) Runtime local168 = Runtime.getRuntime();
				@Pc(177) int local177 = (int) ((local168.totalMemory() - local168.freeMemory()) / 1024L);
				if (local177 > 33554432 && aBoolean236) {
				}
				if (local177 > 67108864 && !aBoolean236) {
				}
				this.aClass2_Sub1_Sub1_Sub2_3.method148(16776960, 35, this.anInt848, "Mem:" + local177 + "k");
				local166 += 15;
			}
			if (this.anInt955 != 0) {
				@Pc(219) int local219 = this.anInt955 / 50;
				local166 = local219 / 60;
				@Pc(227) int local227 = local219 % 60;
				if (local227 < 10) {
					this.aClass2_Sub1_Sub1_Sub2_3.method153(4, "System update in: " + local166 + ":0" + local227, 16776960, 988, 329);
				} else {
					this.aClass2_Sub1_Sub1_Sub2_3.method153(4, "System update in: " + local166 + ":" + local227, 16776960, 988, 329);
				}
				anInt928++;
				if (anInt928 > 65) {
					anInt928 = 0;
					this.aClass2_Sub1_Sub4_6.method83(116);
					return;
				}
			}
		} catch (@Pc(284) RuntimeException local284) {
			signlink.reporterror("81260, " + 23067 + ", " + local284.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method631() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt947);
			if (this.aClass26_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass26_Sub1_1.anInt474);
			}
			System.out.println("loop-cycle:" + anInt967);
			System.out.println("draw-cycle:" + anInt956);
			System.out.println("ptype:" + this.anInt832);
			System.out.println("psize:" + this.anInt831);
			if (this.aClass32_1 != null) {
				this.aClass32_1.method323();
			}
			super.aBoolean220 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("28245, " + false + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method583() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("33361, " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method632() {
		try {
			this.aClass2_Sub1_Sub1_Sub3_1 = new Class2_Sub1_Sub1_Sub3(this.aClass8_2, "titlebox", 0);
			this.aClass2_Sub1_Sub1_Sub3_2 = new Class2_Sub1_Sub1_Sub3(this.aClass8_2, "titlebutton", 0);
			this.aClass2_Sub1_Sub1_Sub3Array4 = new Class2_Sub1_Sub1_Sub3[12];
			@Pc(30) int local30 = 0;
			try {
				local30 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(37) Exception local37) {
			}
			@Pc(41) int local41;
			if (local30 == 0) {
				for (local41 = 0; local41 < 12; local41++) {
					this.aClass2_Sub1_Sub1_Sub3Array4[local41] = new Class2_Sub1_Sub1_Sub3(this.aClass8_2, "runes", local41);
				}
			} else {
				for (local41 = 0; local41 < 12; local41++) {
					this.aClass2_Sub1_Sub1_Sub3Array4[local41] = new Class2_Sub1_Sub1_Sub3(this.aClass8_2, "runes", (local41 & 0x3) + 12);
				}
			}
			this.aClass2_Sub1_Sub1_Sub4_3 = new Class2_Sub1_Sub1_Sub4(128, 265);
			this.aClass2_Sub1_Sub1_Sub4_4 = new Class2_Sub1_Sub1_Sub4(128, 265);
			for (local41 = 0; local41 < 33920; local41++) {
				this.aClass2_Sub1_Sub1_Sub4_3.anIntArray190[local41] = this.aClass42_18.anIntArray168[local41];
			}
			for (@Pc(117) int local117 = 0; local117 < 33920; local117++) {
				this.aClass2_Sub1_Sub1_Sub4_4.anIntArray190[local117] = this.aClass42_19.anIntArray168[local117];
			}
			this.anIntArray226 = new int[256];
			for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
				this.anIntArray226[local139] = local139 * 262144;
			}
			for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
				this.anIntArray226[local154 + 64] = local154 * 1024 + 16711680;
			}
			for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
				this.anIntArray226[local173 + 128] = local173 * 4 + 16776960;
			}
			for (@Pc(192) int local192 = 0; local192 < 64; local192++) {
				this.anIntArray226[local192 + 192] = 16777215;
			}
			this.anIntArray227 = new int[256];
			for (@Pc(211) int local211 = 0; local211 < 64; local211++) {
				this.anIntArray227[local211] = local211 * 1024;
			}
			for (@Pc(226) int local226 = 0; local226 < 64; local226++) {
				this.anIntArray227[local226 + 64] = local226 * 4 + 65280;
			}
			for (@Pc(245) int local245 = 0; local245 < 64; local245++) {
				this.anIntArray227[local245 + 128] = local245 * 262144 + 65535;
			}
			for (@Pc(264) int local264 = 0; local264 < 64; local264++) {
				this.anIntArray227[local264 + 192] = 16777215;
			}
			this.anIntArray228 = new int[256];
			for (@Pc(283) int local283 = 0; local283 < 64; local283++) {
				this.anIntArray228[local283] = local283 * 4;
			}
			for (@Pc(298) int local298 = 0; local298 < 64; local298++) {
				this.anIntArray228[local298 + 64] = local298 * 262144 + 255;
			}
			for (@Pc(317) int local317 = 0; local317 < 64; local317++) {
				this.anIntArray228[local317 + 128] = local317 * 1024 + 16711935;
			}
			for (@Pc(336) int local336 = 0; local336 < 64; local336++) {
				this.anIntArray228[local336 + 192] = 16777215;
			}
			this.anIntArray225 = new int[256];
			this.anIntArray221 = new int[32768];
			this.anIntArray222 = new int[32768];
			this.method622(null, this.aBoolean254);
			this.anIntArray244 = new int[32768];
			this.anIntArray245 = new int[32768];
			this.method585(10, "Connecting to fileserver");
			if (!this.aBoolean252) {
				this.aBoolean231 = true;
				this.aBoolean252 = true;
				this.method584(this, 2);
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("86779, " + false + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ZI)V")
	private void method633(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 >> 7 == this.anInt964 && aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 >> 7 == this.anInt965) {
				this.anInt964 = 0;
			}
			@Pc(21) int local21 = this.anInt1020;
			@Pc(25) boolean local25 = false;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < local21; local31++) {
				@Pc(37) Class2_Sub1_Sub2_Sub1_Sub2 local37;
				@Pc(42) int local42;
				if (arg0) {
					local37 = aClass2_Sub1_Sub2_Sub1_Sub2_1;
					local42 = this.anInt1019 << 14;
				} else {
					local37 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray272[local31]];
					local42 = this.anIntArray272[local31] << 14;
				}
				if (local37 != null && local37.method199()) {
					local37.aBoolean71 = false;
					if ((aBoolean236 && this.anInt1020 > 50 || this.anInt1020 > 200) && !arg0 && local37.anInt241 == local37.anInt257) {
						local37.aBoolean71 = true;
					}
					@Pc(93) int local93 = local37.anInt285 >> 7;
					@Pc(98) int local98 = local37.anInt286 >> 7;
					if (local93 >= 0 && local93 < 104 && local98 >= 0 && local98 < 104) {
						if (local37.aClass2_Sub1_Sub2_Sub5_1 == null || anInt967 < local37.anInt300 || anInt967 >= local37.anInt301) {
							if ((local37.anInt285 & 0x7F) == 64 && (local37.anInt286 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local93][local98] == this.anInt960) {
									continue;
								}
								this.anIntArrayArray24[local93][local98] = this.anInt960;
							}
							local37.anInt294 = this.method640(this.anInt909, local37.anInt285, local37.anInt286);
							this.aClass47_1.method518(local42, local37, local37.anInt286, local37.anInt287, local37.anInt294, 60, local37.anInt285, local37.aBoolean66, this.anInt909);
						} else {
							local37.aBoolean71 = false;
							local37.anInt294 = this.method640(this.anInt909, local37.anInt285, local37.anInt286);
							this.aClass47_1.method519(this.anInt909, local37.anInt294, local37.anInt296, local37.anInt285, local37.anInt297, local37.anInt298, local37, local37.anInt287, local37.anInt286, local42, local37.anInt299);
						}
					}
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("700, " + arg0 + ", " + arg1 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class2_Sub3 local1 = null;
			@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) this.aClass48_10.method565();
			@Pc(10) boolean local10 = false;
			while (local6 != null) {
				if (local6.anInt711 == arg3 && local6.anInt713 == arg0 && local6.anInt714 == arg4 && local6.anInt712 == arg2) {
					local1 = local6;
					break;
				}
				local6 = (Class2_Sub3) this.aClass48_10.method567();
			}
			if (local1 == null) {
				local1 = new Class2_Sub3();
				local1.anInt711 = arg3;
				local1.anInt712 = arg2;
				local1.anInt713 = arg0;
				local1.anInt714 = arg4;
				this.method617(local1);
				this.aClass48_10.method562(local1);
			}
			local1.anInt715 = arg9;
			local1.anInt717 = arg6;
			local1.anInt716 = arg5;
			local1.anInt710 = arg1;
			local1.anInt709 = arg8;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("99597, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!XANVNPIN;II)V")
	private void method635(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt865 + this.anInt974 & 0x7FF;
			@Pc(15) int local15 = arg2 * arg2 + arg1 * arg1;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class2_Sub1_Sub2_Sub5.anIntArray158[local7];
				@Pc(27) int local27 = Class2_Sub1_Sub2_Sub5.anIntArray159[local7];
				@Pc(41) int local41 = local23 * 256 / (this.anInt1015 + 256);
				@Pc(50) int local50 = local27 * 256 / (this.anInt1015 + 256);
				@Pc(60) int local60 = arg1 * local41 + arg2 * local50 >> 16;
				@Pc(70) int local70 = arg1 * local50 - arg2 * local41 >> 16;
				if (local15 > 2500) {
					arg0.method503(this.aClass2_Sub1_Sub1_Sub3_4, 83 - local70 - arg0.anInt705 / 2 - 4, local60 + 94 - arg0.anInt704 / 2 + 4);
				} else {
					arg0.method497(local60 + 94 + 4 - arg0.anInt704 / 2, 83 - local70 - arg0.anInt705 / 2 - 4);
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("65654, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIILclient!LUAMUNXO;)V")
	private void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class21 arg7) {
		try {
			if (this.aBoolean258) {
				this.anInt822 = 32;
			} else {
				this.anInt822 = 0;
			}
			this.aBoolean258 = false;
			if (arg0 >= arg1 && arg0 < arg1 + 16 && arg3 >= arg5 && arg3 < arg5 + 16) {
				arg7.anInt419 -= this.anInt839 * 4;
				if (arg4 == 1) {
					this.aBoolean243 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean226 = true;
				}
			} else if (arg0 >= arg1 && arg0 < arg1 + 16 && arg3 >= arg5 + arg6 - 16 && arg3 < arg5 + arg6) {
				arg7.anInt419 += this.anInt839 * 4;
				if (arg4 == 1) {
					this.aBoolean243 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean226 = true;
				}
			} else if (arg0 >= arg1 - this.anInt822 && arg0 < arg1 + this.anInt822 + 16 && arg3 >= arg5 + 16 && arg3 < arg5 + arg6 - 16 && this.anInt839 > 0) {
				@Pc(139) int local139 = (arg6 - 32) * arg6 / arg2;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(154) int local154 = arg3 - arg5 - local139 / 2 - 16;
				@Pc(160) int local160 = arg6 - local139 - 32;
				arg7.anInt419 = (arg2 - arg6) * local154 / local160;
				if (arg4 == 1) {
					this.aBoolean243 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean226 = true;
				}
				this.aBoolean258 = true;
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("5461, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIZ)V")
	private void method637(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt1050 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("14416, " + false + ", " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method638() {
		try {
			Class41.aClass37_8.method365();
			Class41.aClass37_9.method365();
			Class14.aClass37_1.method365();
			Class19.aClass37_4.method365();
			Class19.aClass37_3.method365();
			Class2_Sub1_Sub2_Sub1_Sub2.aClass37_2.method365();
			this.aBoolean262 &= true;
			Class27.aClass37_7.method365();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("89337, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method580() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass32_1 != null) {
					this.aClass32_1.method318();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass32_1 = null;
			this.method651();
			if (this.aClass5_1 != null) {
				this.aClass5_1.aBoolean20 = false;
			}
			this.aClass5_1 = null;
			this.aClass26_Sub1_1.method271();
			this.aClass26_Sub1_1 = null;
			this.aClass2_Sub1_Sub4_7 = null;
			this.aClass2_Sub1_Sub4_6 = null;
			this.aClass2_Sub1_Sub4_8 = null;
			this.aClass2_Sub1_Sub4_9 = null;
			this.anIntArray233 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray234 = null;
			this.anIntArray235 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass47_1 = null;
			this.aClass45Array1 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray22 = null;
			this.anIntArray264 = null;
			this.anIntArray265 = null;
			this.aByteArray21 = null;
			this.aClass42_24 = null;
			this.aClass42_25 = null;
			this.aClass42_26 = null;
			this.aClass42_27 = null;
			this.aClass42_12 = null;
			this.aClass42_13 = null;
			this.aClass42_14 = null;
			this.aClass42_3 = null;
			this.aClass42_4 = null;
			this.aClass42_5 = null;
			this.aClass42_6 = null;
			this.aClass42_7 = null;
			this.aClass42_8 = null;
			this.aClass42_9 = null;
			this.aClass42_10 = null;
			this.aClass42_11 = null;
			this.aClass2_Sub1_Sub1_Sub3_3 = null;
			this.aClass2_Sub1_Sub1_Sub3_4 = null;
			this.aClass2_Sub1_Sub1_Sub3_5 = null;
			this.aClass2_Sub1_Sub1_Sub3_6 = null;
			this.aClass2_Sub1_Sub1_Sub3_7 = null;
			this.aClass2_Sub1_Sub1_Sub3_8 = null;
			this.aClass2_Sub1_Sub1_Sub3Array2 = null;
			this.aClass2_Sub1_Sub1_Sub3_16 = null;
			this.aClass2_Sub1_Sub1_Sub3_17 = null;
			this.aClass2_Sub1_Sub1_Sub3_18 = null;
			this.aClass2_Sub1_Sub1_Sub3_19 = null;
			this.aClass2_Sub1_Sub1_Sub3_20 = null;
			this.aClass2_Sub1_Sub1_Sub3_11 = null;
			this.aClass2_Sub1_Sub1_Sub3_12 = null;
			this.aClass2_Sub1_Sub1_Sub3_13 = null;
			this.aClass2_Sub1_Sub1_Sub3_14 = null;
			this.aClass2_Sub1_Sub1_Sub3_15 = null;
			this.aClass2_Sub1_Sub1_Sub4_11 = null;
			this.aClass2_Sub1_Sub1_Sub4Array10 = null;
			this.aClass2_Sub1_Sub1_Sub4Array5 = null;
			this.aClass2_Sub1_Sub1_Sub4Array9 = null;
			this.aClass2_Sub1_Sub1_Sub4Array4 = null;
			this.aClass2_Sub1_Sub1_Sub4Array7 = null;
			this.aClass2_Sub1_Sub1_Sub4_17 = null;
			this.aClass2_Sub1_Sub1_Sub4_5 = null;
			this.aClass2_Sub1_Sub1_Sub4_6 = null;
			this.aClass2_Sub1_Sub1_Sub4_7 = null;
			this.aClass2_Sub1_Sub1_Sub4_8 = null;
			this.aClass2_Sub1_Sub1_Sub4_9 = null;
			this.aClass2_Sub1_Sub1_Sub3Array5 = null;
			this.aClass2_Sub1_Sub1_Sub4Array6 = null;
			this.anIntArrayArray24 = null;
			this.aClass2_Sub1_Sub2_Sub1_Sub2Array1 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.aClass2_Sub1_Sub4Array1 = null;
			this.anIntArray256 = null;
			this.aClass2_Sub1_Sub2_Sub1_Sub1Array1 = null;
			this.anIntArray236 = null;
			this.aClass48ArrayArrayArray1 = null;
			this.aClass48_10 = null;
			this.aClass48_11 = null;
			this.aClass48_12 = null;
			this.anIntArray246 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			this.anIntArray249 = null;
			this.aStringArray10 = null;
			this.anIntArray274 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.aClass2_Sub1_Sub1_Sub4Array8 = null;
			this.aClass2_Sub1_Sub1_Sub4_10 = null;
			this.aStringArray9 = null;
			this.aLongArray3 = null;
			this.anIntArray258 = null;
			this.aClass42_18 = null;
			this.aClass42_19 = null;
			this.aClass42_15 = null;
			this.aClass42_16 = null;
			this.aClass42_17 = null;
			this.aClass42_20 = null;
			this.aClass42_21 = null;
			this.aClass42_22 = null;
			this.aClass42_23 = null;
			this.method719();
			Class41.method414();
			Class14.method193();
			Class19.method216();
			Class21.method249();
			Class13.aClass13Array1 = null;
			Class6.aClass6Array1 = null;
			Class23.aClass23Array1 = null;
			Class49.aClass49Array1 = null;
			Class27.aClass27Array1 = null;
			Class27.aClass37_7 = null;
			Class40.aClass40Array1 = null;
			super.aClass42_2 = null;
			Class2_Sub1_Sub2_Sub1_Sub2.aClass37_2 = null;
			Class2_Sub1_Sub1_Sub1.method32();
			Class47.method506();
			Class2_Sub1_Sub2_Sub5.method380();
			Class29.method294();
			System.gc();
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("64130, " + false + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method639() {
		try {
			this.anInt831 += 0;
			@Pc(17) int local17;
			for (@Pc(9) int local9 = -1; local9 < this.anInt1020; local9++) {
				if (local9 == -1) {
					local17 = this.anInt1019;
				} else {
					local17 = this.anIntArray272[local9];
				}
				@Pc(29) Class2_Sub1_Sub2_Sub1_Sub2 local29 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local17];
				if (local29 != null && local29.anInt263 > 0) {
					local29.anInt263--;
					if (local29.anInt263 == 0) {
						local29.aString5 = null;
					}
				}
			}
			for (local17 = 0; local17 < this.anInt901; local17++) {
				@Pc(60) int local60 = this.anIntArray236[local17];
				@Pc(65) Class2_Sub1_Sub2_Sub1_Sub1 local65 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local60];
				if (local65 != null && local65.anInt263 > 0) {
					local65.anInt263--;
					if (local65.anInt263 == 0) {
						local65.aString5 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("5591, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
	private int method640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			@Pc(73) int local73 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			this.aBoolean262 &= true;
			@Pc(111) int local111 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local111 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("98175, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method641() {
		try {
			this.aBoolean245 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray220[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class6.anInt106; local15++) {
					if (!Class6.aClass6Array1[local15].aBoolean24 && Class6.aClass6Array1[local15].anInt107 == local6 + (this.aBoolean240 ? 0 : 7)) {
						this.anIntArray220[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("69114, " + false + ", " + local54.toString());
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

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private String method643(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("74743, " + 298 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method644(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass42_15 == null) {
				super.aClass42_2 = null;
				this.aClass42_27 = null;
				@Pc(16) boolean local16 = false;
				this.aClass42_25 = null;
				this.aClass42_24 = null;
				this.aClass42_26 = null;
				this.aClass42_12 = null;
				this.aClass42_13 = null;
				this.aClass42_14 = null;
				this.aClass42_18 = new Class42(128, true, this.method583(), 265);
				Class2_Sub1_Sub1.method483();
				this.aClass42_19 = new Class42(128, true, this.method583(), 265);
				Class2_Sub1_Sub1.method483();
				this.aClass42_15 = new Class42(509, true, this.method583(), 171);
				Class2_Sub1_Sub1.method483();
				this.aClass42_16 = new Class42(360, true, this.method583(), 132);
				Class2_Sub1_Sub1.method483();
				this.aClass42_17 = new Class42(360, true, this.method583(), 200);
				Class2_Sub1_Sub1.method483();
				this.aClass42_20 = new Class42(202, true, this.method583(), 238);
				Class2_Sub1_Sub1.method483();
				this.aClass42_21 = new Class42(203, true, this.method583(), 238);
				Class2_Sub1_Sub1.method483();
				this.aClass42_22 = new Class42(74, true, this.method583(), 94);
				Class2_Sub1_Sub1.method483();
				this.aClass42_23 = new Class42(75, true, this.method583(), 94);
				Class2_Sub1_Sub1.method483();
				if (this.aClass8_2 != null) {
					this.method712();
					this.method632();
				}
				this.aBoolean246 = true;
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("60253, " + arg0 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			this.aBoolean246 = true;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("95888, " + -789 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method645() {
		try {
			if (-30892 == this.anInt987 && super.anInt812 == 1) {
				if (super.anInt813 >= 539 && super.anInt813 <= 573 && super.anInt814 >= 169 && super.anInt814 < 205 && this.anIntArray243[0] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 0;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 569 && super.anInt813 <= 599 && super.anInt814 >= 168 && super.anInt814 < 205 && this.anIntArray243[1] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 1;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 597 && super.anInt813 <= 627 && super.anInt814 >= 168 && super.anInt814 < 205 && this.anIntArray243[2] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 2;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 625 && super.anInt813 <= 669 && super.anInt814 >= 168 && super.anInt814 < 203 && this.anIntArray243[3] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 3;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 666 && super.anInt813 <= 696 && super.anInt814 >= 168 && super.anInt814 < 205 && this.anIntArray243[4] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 4;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 694 && super.anInt813 <= 724 && super.anInt814 >= 168 && super.anInt814 < 205 && this.anIntArray243[5] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 5;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 722 && super.anInt813 <= 756 && super.anInt814 >= 169 && super.anInt814 < 205 && this.anIntArray243[6] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 6;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 540 && super.anInt813 <= 574 && super.anInt814 >= 466 && super.anInt814 < 502 && this.anIntArray243[7] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 7;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 572 && super.anInt813 <= 602 && super.anInt814 >= 466 && super.anInt814 < 503 && this.anIntArray243[8] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 8;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 599 && super.anInt813 <= 629 && super.anInt814 >= 466 && super.anInt814 < 503 && this.anIntArray243[9] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 9;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 627 && super.anInt813 <= 671 && super.anInt814 >= 467 && super.anInt814 < 502 && this.anIntArray243[10] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 10;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 669 && super.anInt813 <= 699 && super.anInt814 >= 466 && super.anInt814 < 503 && this.anIntArray243[11] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 11;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 696 && super.anInt813 <= 726 && super.anInt814 >= 466 && super.anInt814 < 503 && this.anIntArray243[12] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 12;
					this.aBoolean230 = true;
				}
				if (super.anInt813 >= 724 && super.anInt813 <= 758 && super.anInt814 >= 466 && super.anInt814 < 502 && this.anIntArray243[13] != -1) {
					this.aBoolean243 = true;
					this.anInt944 = 13;
					this.aBoolean230 = true;
					return;
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("89319, " + -30892 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LUAMUNXO;B)Z")
	private boolean method646(@OriginalArg(0) Class21 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg0.anIntArray67 == null) {
				return false;
			}
			for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray67.length; local19++) {
				@Pc(27) int local27 = this.method721(local19, arg0);
				@Pc(32) int local32 = arg0.anIntArray73[local19];
				if (arg0.anIntArray67[local19] == 2) {
					if (local27 >= local32) {
						return false;
					}
				} else if (arg0.anIntArray67[local19] == 3) {
					if (local27 <= local32) {
						return false;
					}
				} else if (arg0.anIntArray67[local19] == 4) {
					if (local27 == local32) {
						return false;
					}
				} else if (local27 != local32) {
					return false;
				}
			}
			return true;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("353, " + arg0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("22870, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method578() {
		this.method585(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt801 = 5;
		}
		if (aBoolean238) {
			this.aBoolean241 = true;
			return;
		}
		aBoolean238 = true;
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
			this.aBoolean229 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(89) int local89 = 0; local89 < 5; local89++) {
				this.aClass12Array1[local89] = new Class12(local89 + 1, 500000, signlink.aRandomAccessFileArray1[local89], 0, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method589(879);
			this.aClass8_2 = this.method608("title screen", "title", this.anIntArray261[1], 25, 1);
			this.aClass2_Sub1_Sub1_Sub2_2 = new Class2_Sub1_Sub1_Sub2("p11_full", false, false, this.aClass8_2);
			this.aClass2_Sub1_Sub1_Sub2_3 = new Class2_Sub1_Sub1_Sub2("p12_full", false, false, this.aClass8_2);
			this.aClass2_Sub1_Sub1_Sub2_4 = new Class2_Sub1_Sub1_Sub2("b12_full", false, false, this.aClass8_2);
			this.aClass2_Sub1_Sub1_Sub2_5 = new Class2_Sub1_Sub1_Sub2("q8_full", false, true, this.aClass8_2);
			this.method712();
			this.method632();
			@Pc(185) Class8 local185 = this.method608("config", "config", this.anIntArray261[2], 30, 2);
			@Pc(197) Class8 local197 = this.method608("interface", "interface", this.anIntArray261[3], 35, 3);
			@Pc(209) Class8 local209 = this.method608("2d graphics", "media", this.anIntArray261[4], 40, 4);
			@Pc(221) Class8 local221 = this.method608("textures", "textures", this.anIntArray261[6], 45, 6);
			@Pc(233) Class8 local233 = this.method608("chat system", "wordenc", this.anIntArray261[7], 50, 7);
			@Pc(245) Class8 local245 = this.method608("sound effects", "sounds", this.anIntArray261[8], 55, 8);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass47_1 = new Class47(false, 104, 4, this.anIntArrayArrayArray8, 104);
			for (@Pc(270) int local270 = 0; local270 < 4; local270++) {
				this.aClass45Array1[local270] = new Class45(true, 104, 104);
			}
			this.aClass2_Sub1_Sub1_Sub4_10 = new Class2_Sub1_Sub1_Sub4(512, 512);
			@Pc(305) Class8 local305 = this.method608("update list", "versionlist", this.anIntArray261[5], 60, 5);
			this.method585(60, "Connecting to update server");
			this.aClass26_Sub1_1 = new Class26_Sub1();
			this.aClass26_Sub1_1.method288(local305, this);
			Class29.method292(this.aClass26_Sub1_1.method277());
			Class2_Sub1_Sub2_Sub5.method381(this.aClass26_Sub1_1.method283(0), this.aClass26_Sub1_1);
			if (!aBoolean236) {
				this.anInt827 = 0;
				try {
					this.anInt827 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(346) Exception local346) {
				}
				this.aBoolean224 = true;
				this.aClass26_Sub1_1.method270(2, this.anInt827);
				while (this.aClass26_Sub1_1.method279() > 0) {
					this.method722(988);
					try {
						Thread.sleep(100L);
					} catch (@Pc(364) Exception local364) {
					}
					if (this.aClass26_Sub1_1.anInt473 > 3) {
						this.method699("ondemand");
						return;
					}
				}
			}
			this.method585(65, "Requesting animations");
			@Pc(388) int local388 = this.aClass26_Sub1_1.method283(1);
			for (@Pc(390) int local390 = 0; local390 < local388; local390++) {
				this.aClass26_Sub1_1.method270(1, local390);
			}
			@Pc(409) int local409;
			while (this.aClass26_Sub1_1.method279() > 0) {
				local409 = local388 - this.aClass26_Sub1_1.method279();
				if (local409 > 0) {
					this.method585(65, "Loading animations - " + local409 * 100 / local388 + "%");
				}
				this.method722(988);
				try {
					Thread.sleep(100L);
				} catch (@Pc(435) Exception local435) {
				}
				if (this.aClass26_Sub1_1.anInt473 > 3) {
					this.method699("ondemand");
					return;
				}
			}
			this.method585(70, "Requesting models");
			local388 = this.aClass26_Sub1_1.method283(0);
			@Pc(469) int local469;
			for (local409 = 0; local409 < local388; local409++) {
				local469 = this.aClass26_Sub1_1.method280(local409);
				if ((local469 & 0x1) != 0) {
					this.aClass26_Sub1_1.method270(0, local409);
				}
			}
			local388 = this.aClass26_Sub1_1.method279();
			while (this.aClass26_Sub1_1.method279() > 0) {
				local469 = local388 - this.aClass26_Sub1_1.method279();
				if (local469 > 0) {
					this.method585(70, "Loading models - " + local469 * 100 / local388 + "%");
				}
				this.method722(988);
				try {
					Thread.sleep(100L);
				} catch (@Pc(520) Exception local520) {
				}
			}
			if (this.aClass12Array1[0] != null) {
				this.method585(75, "Requesting maps");
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(48, 47, 0));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(48, 47, 1));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(48, 48, 0));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(48, 48, 1));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(48, 49, 0));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(48, 49, 1));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(47, 47, 0));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(47, 47, 1));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(47, 48, 0));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(47, 48, 1));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(148, 48, 0));
				this.aClass26_Sub1_1.method270(3, this.aClass26_Sub1_1.method282(148, 48, 1));
				local388 = this.aClass26_Sub1_1.method279();
				while (this.aClass26_Sub1_1.method279() > 0) {
					local469 = local388 - this.aClass26_Sub1_1.method279();
					if (local469 > 0) {
						this.method585(75, "Loading maps - " + local469 * 100 / local388 + "%");
					}
					this.method722(988);
					try {
						Thread.sleep(100L);
					} catch (@Pc(705) Exception local705) {
					}
				}
			}
			local388 = this.aClass26_Sub1_1.method283(0);
			@Pc(726) int local726;
			for (local469 = 0; local469 < local388; local469++) {
				local726 = this.aClass26_Sub1_1.method280(local469);
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
					this.aClass26_Sub1_1.method274(0, local728, 212, local469);
				}
			}
			this.aClass26_Sub1_1.method276(aBoolean235);
			if (!aBoolean236) {
				local388 = this.aClass26_Sub1_1.method283(2);
				for (local726 = 1; local726 < local388; local726++) {
					if (this.aClass26_Sub1_1.method281(local726, aByte52)) {
						this.aClass26_Sub1_1.method274(2, (byte) 1, 212, local726);
					}
				}
			}
			this.method585(80, "Unpacking media");
			this.aClass2_Sub1_Sub1_Sub3_3 = new Class2_Sub1_Sub1_Sub3(local209, "invback", 0);
			this.aClass2_Sub1_Sub1_Sub3_5 = new Class2_Sub1_Sub1_Sub3(local209, "chatback", 0);
			this.aClass2_Sub1_Sub1_Sub3_4 = new Class2_Sub1_Sub1_Sub3(local209, "mapback", 0);
			this.aClass2_Sub1_Sub1_Sub3_6 = new Class2_Sub1_Sub1_Sub3(local209, "backbase1", 0);
			this.aClass2_Sub1_Sub1_Sub3_7 = new Class2_Sub1_Sub1_Sub3(local209, "backbase2", 0);
			this.aClass2_Sub1_Sub1_Sub3_8 = new Class2_Sub1_Sub1_Sub3(local209, "backhmid1", 0);
			for (local726 = 0; local726 < 13; local726++) {
				this.aClass2_Sub1_Sub1_Sub3Array2[local726] = new Class2_Sub1_Sub1_Sub3(local209, "sideicons", local726);
			}
			this.aClass2_Sub1_Sub1_Sub4_11 = new Class2_Sub1_Sub1_Sub4(local209, "compass", 0);
			this.aClass2_Sub1_Sub1_Sub4_16 = new Class2_Sub1_Sub1_Sub4(local209, "mapedge", 0);
			this.aClass2_Sub1_Sub1_Sub4_16.method494(353);
			for (@Pc(928) int local928 = 0; local928 < 72; local928++) {
				this.aClass2_Sub1_Sub1_Sub3Array5[local928] = new Class2_Sub1_Sub1_Sub3(local209, "mapscene", local928);
			}
			for (@Pc(946) int local946 = 0; local946 < 63; local946++) {
				this.aClass2_Sub1_Sub1_Sub4Array6[local946] = new Class2_Sub1_Sub1_Sub4(local209, "mapfunction", local946);
			}
			for (@Pc(964) int local964 = 0; local964 < 5; local964++) {
				this.aClass2_Sub1_Sub1_Sub4Array10[local964] = new Class2_Sub1_Sub1_Sub4(local209, "hitmarks", local964);
			}
			for (@Pc(982) int local982 = 0; local982 < 6; local982++) {
				this.aClass2_Sub1_Sub1_Sub4Array5[local982] = new Class2_Sub1_Sub1_Sub4(local209, "headicons_pk", local982);
			}
			for (@Pc(1000) int local1000 = 0; local1000 < 9; local1000++) {
				this.aClass2_Sub1_Sub1_Sub4Array9[local1000] = new Class2_Sub1_Sub1_Sub4(local209, "headicons_prayer", local1000);
			}
			for (@Pc(1018) int local1018 = 0; local1018 < 6; local1018++) {
				this.aClass2_Sub1_Sub1_Sub4Array4[local1018] = new Class2_Sub1_Sub1_Sub4(local209, "headicons_hint", local1018);
			}
			this.aClass2_Sub1_Sub1_Sub4_17 = new Class2_Sub1_Sub1_Sub4(local209, "overlay_multiway", 0);
			this.aClass2_Sub1_Sub1_Sub4_14 = new Class2_Sub1_Sub1_Sub4(local209, "mapmarker", 0);
			this.aClass2_Sub1_Sub1_Sub4_15 = new Class2_Sub1_Sub1_Sub4(local209, "mapmarker", 1);
			for (@Pc(1060) int local1060 = 0; local1060 < 8; local1060++) {
				this.aClass2_Sub1_Sub1_Sub4Array7[local1060] = new Class2_Sub1_Sub1_Sub4(local209, "cross", local1060);
			}
			this.aClass2_Sub1_Sub1_Sub4_5 = new Class2_Sub1_Sub1_Sub4(local209, "mapdots", 0);
			this.aClass2_Sub1_Sub1_Sub4_6 = new Class2_Sub1_Sub1_Sub4(local209, "mapdots", 1);
			this.aClass2_Sub1_Sub1_Sub4_7 = new Class2_Sub1_Sub1_Sub4(local209, "mapdots", 2);
			this.aClass2_Sub1_Sub1_Sub4_8 = new Class2_Sub1_Sub1_Sub4(local209, "mapdots", 3);
			this.aClass2_Sub1_Sub1_Sub4_9 = new Class2_Sub1_Sub1_Sub4(local209, "mapdots", 4);
			this.aClass2_Sub1_Sub1_Sub3_9 = new Class2_Sub1_Sub1_Sub3(local209, "scrollbar", 0);
			this.aClass2_Sub1_Sub1_Sub3_10 = new Class2_Sub1_Sub1_Sub3(local209, "scrollbar", 1);
			this.aClass2_Sub1_Sub1_Sub3_16 = new Class2_Sub1_Sub1_Sub3(local209, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub3_17 = new Class2_Sub1_Sub1_Sub3(local209, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub3_18 = new Class2_Sub1_Sub1_Sub3(local209, "redstone3", 0);
			this.aClass2_Sub1_Sub1_Sub3_19 = new Class2_Sub1_Sub1_Sub3(local209, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub3_19.method345(929);
			this.aClass2_Sub1_Sub1_Sub3_20 = new Class2_Sub1_Sub1_Sub3(local209, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub3_20.method345(929);
			this.aClass2_Sub1_Sub1_Sub3_11 = new Class2_Sub1_Sub1_Sub3(local209, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub3_11.method346();
			this.aClass2_Sub1_Sub1_Sub3_12 = new Class2_Sub1_Sub1_Sub3(local209, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub3_12.method346();
			this.aClass2_Sub1_Sub1_Sub3_13 = new Class2_Sub1_Sub1_Sub3(local209, "redstone3", 0);
			this.aClass2_Sub1_Sub1_Sub3_13.method346();
			this.aClass2_Sub1_Sub1_Sub3_14 = new Class2_Sub1_Sub1_Sub3(local209, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub3_14.method345(929);
			this.aClass2_Sub1_Sub1_Sub3_14.method346();
			this.aClass2_Sub1_Sub1_Sub3_15 = new Class2_Sub1_Sub1_Sub3(local209, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub3_15.method345(929);
			this.aClass2_Sub1_Sub1_Sub3_15.method346();
			for (@Pc(1250) int local1250 = 0; local1250 < 2; local1250++) {
				this.aClass2_Sub1_Sub1_Sub3Array3[local1250] = new Class2_Sub1_Sub1_Sub3(local209, "mod_icons", local1250);
			}
			@Pc(1273) Class2_Sub1_Sub1_Sub4 local1273 = new Class2_Sub1_Sub1_Sub4(local209, "backleft1", 0);
			this.aClass42_3 = new Class42(local1273.anInt700, true, this.method583(), local1273.anInt701);
			local1273.method495(0, 0);
			@Pc(1298) Class2_Sub1_Sub1_Sub4 local1298 = new Class2_Sub1_Sub1_Sub4(local209, "backleft2", 0);
			this.aClass42_4 = new Class42(local1298.anInt700, true, this.method583(), local1298.anInt701);
			local1298.method495(0, 0);
			@Pc(1323) Class2_Sub1_Sub1_Sub4 local1323 = new Class2_Sub1_Sub1_Sub4(local209, "backright1", 0);
			this.aClass42_5 = new Class42(local1323.anInt700, true, this.method583(), local1323.anInt701);
			local1323.method495(0, 0);
			@Pc(1348) Class2_Sub1_Sub1_Sub4 local1348 = new Class2_Sub1_Sub1_Sub4(local209, "backright2", 0);
			this.aClass42_6 = new Class42(local1348.anInt700, true, this.method583(), local1348.anInt701);
			local1348.method495(0, 0);
			@Pc(1373) Class2_Sub1_Sub1_Sub4 local1373 = new Class2_Sub1_Sub1_Sub4(local209, "backtop1", 0);
			this.aClass42_7 = new Class42(local1373.anInt700, true, this.method583(), local1373.anInt701);
			local1373.method495(0, 0);
			@Pc(1398) Class2_Sub1_Sub1_Sub4 local1398 = new Class2_Sub1_Sub1_Sub4(local209, "backvmid1", 0);
			this.aClass42_8 = new Class42(local1398.anInt700, true, this.method583(), local1398.anInt701);
			local1398.method495(0, 0);
			@Pc(1423) Class2_Sub1_Sub1_Sub4 local1423 = new Class2_Sub1_Sub1_Sub4(local209, "backvmid2", 0);
			this.aClass42_9 = new Class42(local1423.anInt700, true, this.method583(), local1423.anInt701);
			local1423.method495(0, 0);
			@Pc(1448) Class2_Sub1_Sub1_Sub4 local1448 = new Class2_Sub1_Sub1_Sub4(local209, "backvmid3", 0);
			this.aClass42_10 = new Class42(local1448.anInt700, true, this.method583(), local1448.anInt701);
			local1448.method495(0, 0);
			@Pc(1473) Class2_Sub1_Sub1_Sub4 local1473 = new Class2_Sub1_Sub1_Sub4(local209, "backhmid2", 0);
			this.aClass42_11 = new Class42(local1473.anInt700, true, this.method583(), local1473.anInt701);
			local1473.method495(0, 0);
			@Pc(1498) int local1498 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1505) int local1505 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1512) int local1512 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1519) int local1519 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1521) int local1521 = 0; local1521 < 100; local1521++) {
				if (this.aClass2_Sub1_Sub1_Sub4Array6[local1521] != null) {
					this.aClass2_Sub1_Sub1_Sub4Array6[local1521].method493(local1498 + local1519, local1512 + local1519, local1505 + local1519);
				}
				if (this.aClass2_Sub1_Sub1_Sub3Array5[local1521] != null) {
					this.aClass2_Sub1_Sub1_Sub3Array5[local1521].method347(local1498 + local1519, local1512 + local1519, local1505 + local1519);
				}
			}
			this.method585(83, "Unpacking textures");
			Class2_Sub1_Sub1_Sub1.method37(local221);
			Class2_Sub1_Sub1_Sub1.method41(0.8D);
			Class2_Sub1_Sub1_Sub1.method36();
			this.method585(86, "Unpacking config");
			Class49.method570(local185, anInt837);
			Class41.method412(local185);
			Class13.method182(local185, anInt837);
			Class19.method218(local185);
			Class14.method190(local185);
			Class6.method64(local185, anInt837);
			Class27.method289(local185, anInt837);
			Class40.method374(local185, anInt837);
			Class22.method258(local185, anInt837);
			Class19.aBoolean81 = aBoolean235;
			if (!aBoolean236) {
				this.method585(90, "Unpacking sounds");
				@Pc(1624) byte[] local1624 = local245.method165("sounds.dat", null);
				@Pc(1630) Class2_Sub1_Sub4 local1630 = new Class2_Sub1_Sub4(local1624, aBoolean259);
				Class24.method260(local1630, anInt837);
			}
			this.method585(95, "Unpacking interfaces");
			@Pc(1661) Class2_Sub1_Sub1_Sub2[] local1661 = new Class2_Sub1_Sub1_Sub2[] { this.aClass2_Sub1_Sub1_Sub2_2, this.aClass2_Sub1_Sub1_Sub2_3, this.aClass2_Sub1_Sub1_Sub2_4, this.aClass2_Sub1_Sub1_Sub2_5 };
			Class21.method255(local197, local1661, local209);
			this.method585(100, "Preparing game engine");
			@Pc(1677) int local1677;
			@Pc(1679) int local1679;
			@Pc(1681) int local1681;
			for (@Pc(1673) int local1673 = 0; local1673 < 33; local1673++) {
				local1677 = 999;
				local1679 = 0;
				for (local1681 = 0; local1681 < 34; local1681++) {
					if (this.aClass2_Sub1_Sub1_Sub3_4.aByteArray13[local1681 + local1673 * this.aClass2_Sub1_Sub1_Sub3_4.anInt547] == 0) {
						if (local1677 == 999) {
							local1677 = local1681;
						}
					} else if (local1677 != 999) {
						local1679 = local1681;
						break;
					}
				}
				this.anIntArray212[local1673] = local1677;
				this.anIntArray267[local1673] = local1679 - local1677;
			}
			@Pc(1739) int local1739;
			for (local1677 = 5; local1677 < 156; local1677++) {
				local1679 = 999;
				local1681 = 0;
				for (local1739 = 25; local1739 < 172; local1739++) {
					if (this.aClass2_Sub1_Sub1_Sub3_4.aByteArray13[local1739 + local1677 * this.aClass2_Sub1_Sub1_Sub3_4.anInt547] == 0 && (local1739 > 34 || local1677 > 34)) {
						if (local1679 == 999) {
							local1679 = local1739;
						}
					} else if (local1679 != 999) {
						local1681 = local1739;
						break;
					}
				}
				this.anIntArray257[local1677 - 5] = local1679 - 25;
				this.anIntArray266[local1677 - 5] = local1681 - local1679;
			}
			Class2_Sub1_Sub1_Sub1.method34(765, 503);
			this.anIntArray253 = Class2_Sub1_Sub1_Sub1.anIntArray7;
			Class2_Sub1_Sub1_Sub1.method34(479, 96);
			this.anIntArray250 = Class2_Sub1_Sub1_Sub1.anIntArray7;
			Class2_Sub1_Sub1_Sub1.method34(190, 261);
			this.anIntArray251 = Class2_Sub1_Sub1_Sub1.anIntArray7;
			Class2_Sub1_Sub1_Sub1.method34(512, 334);
			this.anIntArray252 = Class2_Sub1_Sub1_Sub1.anIntArray7;
			@Pc(1830) int[] local1830 = new int[9];
			for (local1681 = 0; local1681 < 9; local1681++) {
				local1739 = local1681 * 32 + 128 + 15;
				@Pc(1848) int local1848 = local1739 * 3 + 600;
				@Pc(1852) int local1852 = Class2_Sub1_Sub1_Sub1.anIntArray5[local1739];
				local1830[local1681] = local1848 * local1852 >> 16;
			}
			Class47.method543(local1830);
			Class44.method427(local233);
			this.aClass5_1 = new Class5(anInt1031, this);
			this.method584(this.aClass5_1, 10);
			Class2_Sub1_Sub2_Sub3.aClient4 = this;
			Class41.aClient5 = this;
			Class14.aClient2 = this;
		} catch (@Pc(1893) Exception local1893) {
			signlink.reporterror("loaderror " + this.aString18 + " " + this.anInt941);
			this.aBoolean249 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method648() {
		try {
			this.aBoolean250 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean252) {
					this.anInt947++;
					this.method687();
					this.method687();
					this.method599();
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
			this.aBoolean250 = false;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("47052, " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DNRIFKTO;B)V")
	private void method650(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.aByte49 == 6) {
				@Pc(7) boolean local7 = false;
				for (@Pc(11) int local11 = 0; local11 < this.anInt1021; local11++) {
					@Pc(19) int local19 = this.anIntArray273[local11];
					@Pc(24) Class2_Sub1_Sub2_Sub1_Sub2 local24 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local19];
					@Pc(27) int local27 = arg1.method94();
					if ((local27 & 0x8) != 0) {
						local27 += arg1.method94() << 8;
					}
					this.method593(local24, arg1, local19, local27);
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("94940, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method651() {
		try {
			signlink.aBoolean272 = false;
			this.anInt831 += 0;
			signlink.anInt1051 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("77462, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DNRIFKTO;IZ)V")
	private void method652(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean262 &= true;
			arg0.method104();
			@Pc(15) int local15 = arg0.method105(8);
			@Pc(21) int local21;
			if (local15 < this.anInt901) {
				for (local21 = local15; local21 < this.anInt901; local21++) {
					this.anIntArray256[this.anInt972++] = this.anIntArray236[local21];
				}
			}
			if (local15 > this.anInt901) {
				signlink.reporterror(this.aString22 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt901 = 0;
			for (local21 = 0; local21 < local15; local21++) {
				@Pc(73) int local73 = this.anIntArray236[local21];
				@Pc(78) Class2_Sub1_Sub2_Sub1_Sub1 local78 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local73];
				@Pc(83) int local83 = arg0.method105(1);
				if (local83 == 0) {
					this.anIntArray236[this.anInt901++] = local73;
					local78.anInt262 = anInt967;
				} else {
					@Pc(106) int local106 = arg0.method105(2);
					if (local106 == 0) {
						this.anIntArray236[this.anInt901++] = local73;
						local78.anInt262 = anInt967;
						this.anIntArray273[this.anInt1021++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray236[this.anInt901++] = local73;
							local78.anInt262 = anInt967;
							local157 = arg0.method105(3);
							local78.method198(local157, false);
							local167 = arg0.method105(1);
							if (local167 == 1) {
								this.anIntArray273[this.anInt1021++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray236[this.anInt901++] = local73;
							local78.anInt262 = anInt967;
							local157 = arg0.method105(3);
							local78.method198(local157, true);
							local167 = arg0.method105(3);
							local78.method198(local167, true);
							@Pc(225) int local225 = arg0.method105(1);
							if (local225 == 1) {
								this.anIntArray273[this.anInt1021++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray256[this.anInt972++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("25470, " + arg0 + ", " + arg1 + ", " + true + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method653(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg0 == null) {
				return false;
			}
			for (@Pc(16) int local16 = 0; local16 < this.anInt898; local16++) {
				if (arg0.equalsIgnoreCase(this.aStringArray9[local16])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass2_Sub1_Sub2_Sub1_Sub2_1.aString6);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("99240, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method654() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt1000; local3++) {
				if (this.anIntArray232[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray262[local3] != this.anInt1041 || this.anIntArray260[local3] != this.anInt840) {
							@Pc(45) Class2_Sub1_Sub4 local45 = Class24.method261(this.anIntArray262[local3], this.anIntArray260[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt166 / 22) > this.aLong31 + (long) (this.anInt1022 / 22)) {
								this.anInt1022 = local45.anInt166;
								this.aLong31 = System.currentTimeMillis();
								if (this.method669(local45.aByteArray2, local45.anInt166)) {
									this.anInt1041 = this.anIntArray262[local3];
									this.anInt840 = this.anIntArray260[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method666((byte) 2)) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray232[local3] != -5) {
						this.anIntArray232[local3] = -5;
					} else {
						this.anInt1000--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt1000; local111++) {
							this.anIntArray262[local111] = this.anIntArray262[local111 + 1];
							this.anIntArray260[local111] = this.anIntArray260[local111 + 1];
							this.anIntArray232[local111] = this.anIntArray232[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray232[local3]--;
				}
			}
			if (this.anInt1013 > 0) {
				this.anInt1013 -= 20;
				if (this.anInt1013 < 0) {
					this.anInt1013 = 0;
				}
				if (this.anInt1013 == 0 && this.aBoolean260 && !aBoolean236) {
					this.anInt827 = this.anInt884;
					this.aBoolean224 = true;
					this.aClass26_Sub1_1.method270(2, this.anInt827);
					return;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("39470, " + -17887 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method655() {
		try {
			anInt897++;
			this.aBoolean262 &= true;
			if (anInt897 > 191) {
				anInt897 = 0;
				this.aClass2_Sub1_Sub4_6.method83(123);
				this.aClass2_Sub1_Sub4_6.method88(0);
			}
			for (@Pc(25) int local25 = 0; local25 < this.anInt901; local25++) {
				@Pc(32) int local32 = this.anIntArray236[local25];
				@Pc(37) Class2_Sub1_Sub2_Sub1_Sub1 local37 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local32];
				if (local37 != null) {
					this.method656(local37.aClass14_1.aByte14, local37);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("24446, " + true + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!BTOCNVPA;)V")
	private void method656(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub1 arg1) {
		try {
			if (arg1.anInt285 < 128 || arg1.anInt286 < 128 || arg1.anInt285 >= 13184 || arg1.anInt286 >= 13184) {
				arg1.anInt277 = -1;
				arg1.anInt251 = -1;
				arg1.anInt269 = 0;
				arg1.anInt270 = 0;
				arg1.anInt285 = arg1.anIntArray51[0] * 128 + arg1.anInt259 * 64;
				arg1.anInt286 = arg1.anIntArray52[0] * 128 + arg1.anInt259 * 64;
				arg1.method200((byte) 5);
			}
			if (arg1 == aClass2_Sub1_Sub2_Sub1_Sub2_1 && (arg1.anInt285 < 1536 || arg1.anInt286 < 1536 || arg1.anInt285 >= 11776 || arg1.anInt286 >= 11776)) {
				arg1.anInt277 = -1;
				arg1.anInt251 = -1;
				arg1.anInt269 = 0;
				arg1.anInt270 = 0;
				arg1.anInt285 = arg1.anIntArray51[0] * 128 + arg1.anInt259 * 64;
				arg1.anInt286 = arg1.anIntArray52[0] * 128 + arg1.anInt259 * 64;
				arg1.method200((byte) 5);
			}
			if (arg1.anInt269 > anInt967) {
				this.method657(arg1);
			} else if (arg1.anInt270 >= anInt967) {
				this.method658(arg1);
			} else {
				this.method659(arg1);
			}
			this.method660(arg1);
			this.method661(arg1);
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("16260, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BTOCNVPA;)V")
	private void method657(@OriginalArg(1) Class2_Sub1_Sub2_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt269 - anInt967;
			@Pc(14) int local14 = arg0.anInt265 * 128 + arg0.anInt259 * 64;
			@Pc(24) int local24 = arg0.anInt267 * 128 + arg0.anInt259 * 64;
			arg0.anInt285 += (local14 - arg0.anInt285) / local4;
			arg0.anInt286 += (local24 - arg0.anInt286) / local4;
			arg0.anInt284 = 0;
			if (arg0.anInt271 == 0) {
				arg0.anInt264 = 1024;
			}
			if (arg0.anInt271 == 1) {
				arg0.anInt264 = 1536;
			}
			if (arg0.anInt271 == 2) {
				arg0.anInt264 = 0;
			}
			if (arg0.anInt271 == 3) {
				arg0.anInt264 = 512;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("11915, " + 0 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!BTOCNVPA;)V")
	private void method658(@OriginalArg(1) Class2_Sub1_Sub2_Sub1 arg0) {
		try {
			if (arg0.anInt270 == anInt967 || arg0.anInt277 == -1 || arg0.anInt280 != 0 || arg0.anInt279 + 1 > Class49.aClass49Array1[arg0.anInt277].method571(arg0.anInt278)) {
				@Pc(29) int local29 = arg0.anInt270 - arg0.anInt269;
				@Pc(34) int local34 = anInt967 - arg0.anInt269;
				@Pc(44) int local44 = arg0.anInt265 * 128 + arg0.anInt259 * 64;
				@Pc(54) int local54 = arg0.anInt267 * 128 + arg0.anInt259 * 64;
				@Pc(64) int local64 = arg0.anInt266 * 128 + arg0.anInt259 * 64;
				@Pc(74) int local74 = arg0.anInt268 * 128 + arg0.anInt259 * 64;
				arg0.anInt285 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt286 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt284 = 0;
			if (arg0.anInt271 == 0) {
				arg0.anInt264 = 1024;
			}
			if (arg0.anInt271 == 1) {
				arg0.anInt264 = 1536;
			}
			if (arg0.anInt271 == 2) {
				arg0.anInt264 = 0;
			}
			if (arg0.anInt271 == 3) {
				arg0.anInt264 = 512;
			}
			arg0.anInt287 = arg0.anInt264;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("8382, " + true + ", " + arg0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BTOCNVPA;I)V")
	private void method659(@OriginalArg(0) Class2_Sub1_Sub2_Sub1 arg0) {
		try {
			arg0.anInt241 = arg0.anInt257;
			if (arg0.anInt272 == 0) {
				arg0.anInt284 = 0;
			} else {
				if (arg0.anInt277 != -1 && arg0.anInt280 == 0) {
					@Pc(24) Class49 local24 = Class49.aClass49Array1[arg0.anInt277];
					if (arg0.anInt282 > 0 && local24.anInt773 == 0) {
						arg0.anInt284++;
						return;
					}
					if (arg0.anInt282 <= 0 && local24.anInt774 == 0) {
						arg0.anInt284++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt285;
				@Pc(56) int local56 = arg0.anInt286;
				@Pc(81) int local81 = arg0.anIntArray51[arg0.anInt272 - 1] * 128 + arg0.anInt259 * 64;
				@Pc(96) int local96 = arg0.anIntArray52[arg0.anInt272 - 1] * 128 + arg0.anInt259 * 64;
				if (local81 - local53 <= 256 && local81 - local53 >= -256 && local96 - local56 <= 256 && local96 - local56 >= -256) {
					if (local53 < local81) {
						if (local56 < local96) {
							arg0.anInt264 = 1280;
						} else if (local56 > local96) {
							arg0.anInt264 = 1792;
						} else {
							arg0.anInt264 = 1536;
						}
					} else if (local53 > local81) {
						if (local56 < local96) {
							arg0.anInt264 = 768;
						} else if (local56 > local96) {
							arg0.anInt264 = 256;
						} else {
							arg0.anInt264 = 512;
						}
					} else if (local56 < local96) {
						arg0.anInt264 = 1024;
					} else {
						arg0.anInt264 = 0;
					}
					@Pc(190) int local190 = arg0.anInt264 - arg0.anInt287 & 0x7FF;
					if (local190 > 1024) {
						local190 -= 2048;
					}
					@Pc(197) int local197 = arg0.anInt248;
					if (local190 >= -256 && local190 <= 256) {
						local197 = arg0.anInt247;
					} else if (local190 >= 256 && local190 < 768) {
						local197 = arg0.anInt250;
					} else if (local190 >= -768 && local190 <= -256) {
						local197 = arg0.anInt249;
					}
					if (local197 == -1) {
						local197 = arg0.anInt247;
					}
					arg0.anInt241 = local197;
					@Pc(239) int local239 = 4;
					if (arg0.anInt287 != arg0.anInt264 && arg0.anInt260 == -1 && arg0.anInt274 != 0) {
						local239 = 2;
					}
					if (arg0.anInt272 > 2) {
						local239 = 6;
					}
					if (arg0.anInt272 > 3) {
						local239 = 8;
					}
					if (arg0.anInt284 > 0 && arg0.anInt272 > 1) {
						local239 = 8;
						arg0.anInt284--;
					}
					if (arg0.aBooleanArray5[arg0.anInt272 - 1]) {
						local239 <<= 0x1;
					}
					if (local239 >= 8 && arg0.anInt241 == arg0.anInt247 && arg0.anInt283 != -1) {
						arg0.anInt241 = arg0.anInt283;
					}
					if (local53 < local81) {
						arg0.anInt285 += local239;
						if (arg0.anInt285 > local81) {
							arg0.anInt285 = local81;
						}
					} else if (local53 > local81) {
						arg0.anInt285 -= local239;
						if (arg0.anInt285 < local81) {
							arg0.anInt285 = local81;
						}
					}
					if (local56 < local96) {
						arg0.anInt286 += local239;
						if (arg0.anInt286 > local96) {
							arg0.anInt286 = local96;
						}
					} else if (local56 > local96) {
						arg0.anInt286 -= local239;
						if (arg0.anInt286 < local96) {
							arg0.anInt286 = local96;
						}
					}
					if (arg0.anInt285 == local81 && arg0.anInt286 == local96) {
						arg0.anInt272--;
						if (arg0.anInt282 > 0) {
							arg0.anInt282--;
							return;
						}
					}
				} else {
					arg0.anInt285 = local81;
					arg0.anInt286 = local96;
				}
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("73676, " + arg0 + ", " + 0 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!BTOCNVPA;)V")
	private void method660(@OriginalArg(1) Class2_Sub1_Sub2_Sub1 arg0) {
		try {
			if (arg0.anInt274 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt260 != -1 && arg0.anInt260 < 32768) {
					@Pc(26) Class2_Sub1_Sub2_Sub1_Sub1 local26 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[arg0.anInt260];
					if (local26 != null) {
						local34 = arg0.anInt285 - local26.anInt285;
						local40 = arg0.anInt286 - local26.anInt286;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt264 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt260 >= 32768) {
					local65 = arg0.anInt260 - 32768;
					if (local65 == this.anInt1012) {
						local65 = this.anInt1019;
					}
					@Pc(77) Class2_Sub1_Sub2_Sub1_Sub2 local77 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt285 - local77.anInt285;
						@Pc(91) int local91 = arg0.anInt286 - local77.anInt286;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt264 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt275 != 0 || arg0.anInt276 != 0) && (arg0.anInt272 == 0 || arg0.anInt284 > 0)) {
					local65 = arg0.anInt285 - (arg0.anInt275 - this.anInt905 - this.anInt905) * 64;
					local34 = arg0.anInt286 - (arg0.anInt276 - this.anInt906 - this.anInt906) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt264 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt275 = 0;
					arg0.anInt276 = 0;
				}
				local65 = arg0.anInt264 - arg0.anInt287 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt274 || local65 > 2048 - arg0.anInt274) {
						arg0.anInt287 = arg0.anInt264;
					} else if (local65 > 1024) {
						arg0.anInt287 -= arg0.anInt274;
					} else {
						arg0.anInt287 += arg0.anInt274;
					}
					arg0.anInt287 &= 0x7FF;
					if (arg0.anInt241 == arg0.anInt257 && arg0.anInt287 != arg0.anInt264) {
						if (arg0.anInt258 != -1) {
							arg0.anInt241 = arg0.anInt258;
							return;
						}
						arg0.anInt241 = arg0.anInt247;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("21233, " + -355 + ", " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!BTOCNVPA;)V")
	private void method661(@OriginalArg(1) Class2_Sub1_Sub2_Sub1 arg0) {
		try {
			if (this.aByte47 != 5) {
				this.anInt958 = -425;
			}
			arg0.aBoolean66 = false;
			@Pc(20) Class49 local20;
			if (arg0.anInt241 != -1) {
				local20 = Class49.aClass49Array1[arg0.anInt241];
				arg0.anInt243++;
				if (arg0.anInt242 < local20.anInt767 && arg0.anInt243 > local20.method571(arg0.anInt242)) {
					arg0.anInt243 = 0;
					arg0.anInt242++;
				}
				if (arg0.anInt242 >= local20.anInt767) {
					arg0.anInt243 = 0;
					arg0.anInt242 = 0;
				}
			}
			if (arg0.anInt251 != -1 && anInt967 >= arg0.anInt254) {
				if (arg0.anInt252 < 0) {
					arg0.anInt252 = 0;
				}
				local20 = Class27.aClass27Array1[arg0.anInt251].aClass49_1;
				arg0.anInt253++;
				while (arg0.anInt252 < local20.anInt767 && arg0.anInt253 > local20.method571(arg0.anInt252)) {
					arg0.anInt253 -= local20.method571(arg0.anInt252);
					arg0.anInt252++;
				}
				if (arg0.anInt252 >= local20.anInt767 && (arg0.anInt252 < 0 || arg0.anInt252 >= local20.anInt767)) {
					arg0.anInt251 = -1;
				}
			}
			if (arg0.anInt277 != -1 && arg0.anInt280 <= 1) {
				local20 = Class49.aClass49Array1[arg0.anInt277];
				if (local20.anInt773 == 1 && arg0.anInt282 > 0 && arg0.anInt269 <= anInt967 && arg0.anInt270 < anInt967) {
					arg0.anInt280 = 1;
					return;
				}
			}
			if (arg0.anInt277 != -1 && arg0.anInt280 == 0) {
				local20 = Class49.aClass49Array1[arg0.anInt277];
				arg0.anInt279++;
				while (arg0.anInt278 < local20.anInt767 && arg0.anInt279 > local20.method571(arg0.anInt278)) {
					arg0.anInt279 -= local20.method571(arg0.anInt278);
					arg0.anInt278++;
				}
				if (arg0.anInt278 >= local20.anInt767) {
					arg0.anInt278 -= local20.anInt768;
					arg0.anInt281++;
					if (arg0.anInt281 >= local20.anInt772) {
						arg0.anInt277 = -1;
					}
					if (arg0.anInt278 < 0 || arg0.anInt278 >= local20.anInt767) {
						arg0.anInt277 = -1;
					}
				}
				arg0.aBoolean66 = local20.aBoolean217;
			}
			if (arg0.anInt280 > 0) {
				arg0.anInt280--;
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("43366, " + 5 + ", " + arg0 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method662() {
		try {
			if (this.anInt1037 == -1) {
				if (this.aBoolean246) {
					this.method672();
					this.aBoolean246 = false;
					this.aClass42_3.method421(0, 722, super.aGraphics2, 4);
					this.aClass42_4.method421(0, 722, super.aGraphics2, 357);
					this.aClass42_5.method421(722, 722, super.aGraphics2, 4);
					this.aClass42_6.method421(743, 722, super.aGraphics2, 205);
					this.aClass42_7.method421(0, 722, super.aGraphics2, 0);
					this.aClass42_8.method421(516, 722, super.aGraphics2, 4);
					this.aClass42_9.method421(516, 722, super.aGraphics2, 205);
					this.aClass42_10.method421(496, 722, super.aGraphics2, 357);
					this.aClass42_11.method421(0, 722, super.aGraphics2, 338);
					this.aBoolean243 = true;
					this.aBoolean226 = true;
					this.aBoolean230 = true;
					this.aBoolean237 = true;
					if (this.anInt1030 != 2) {
						this.aClass42_26.method421(4, 722, super.aGraphics2, 4);
						this.aClass42_25.method421(550, 722, super.aGraphics2, 4);
					}
				}
				if (this.anInt1030 == 2) {
					this.method676();
				}
				if (this.aBoolean248 && this.anInt1007 == 1) {
					this.aBoolean243 = true;
				}
				@Pc(227) boolean local227;
				if (this.anInt919 != -1) {
					local227 = this.method720(this.anInt850, this.anInt919);
					if (local227) {
						this.aBoolean243 = true;
					}
				}
				if (this.anInt1006 == 2) {
					this.aBoolean243 = true;
				}
				if (this.anInt952 == 2) {
					this.aBoolean243 = true;
				}
				if (this.aBoolean243) {
					this.method612();
					this.aBoolean243 = false;
				}
				if (this.anInt1038 == -1) {
					this.aClass21_1.anInt419 = this.anInt902 - this.anInt983 - 77;
					if (super.anInt807 > 448 && super.anInt807 < 560 && super.anInt808 > 332) {
						this.method636(super.anInt807 - 17, 463, this.anInt902, super.anInt808 - 357, -1, 0, 77, this.aClass21_1);
					}
					@Pc(309) int local309 = this.anInt902 - this.aClass21_1.anInt419 - 77;
					if (local309 < 0) {
						local309 = 0;
					}
					if (local309 > this.anInt902 - 77) {
						local309 = this.anInt902 - 77;
					}
					if (this.anInt983 != local309) {
						this.anInt983 = local309;
						this.aBoolean226 = true;
					}
				}
				if (this.anInt1038 != -1) {
					local227 = this.method720(this.anInt850, this.anInt1038);
					if (local227) {
						this.aBoolean226 = true;
					}
				}
				if (this.anInt1006 == 3) {
					this.aBoolean226 = true;
				}
				if (this.anInt952 == 3) {
					this.aBoolean226 = true;
				}
				if (this.aString19 != null) {
					this.aBoolean226 = true;
				}
				if (this.aBoolean248 && this.anInt1007 == 2) {
					this.aBoolean226 = true;
				}
				if (this.aBoolean226) {
					this.method619(this.aByte53);
					this.aBoolean226 = false;
				}
				if (this.anInt1030 == 2) {
					this.method595();
					this.aClass42_25.method421(550, 722, super.aGraphics2, 4);
				}
				if (this.anInt1024 != -1) {
					this.aBoolean230 = true;
				}
				if (this.aBoolean230) {
					if (this.anInt1024 != -1 && this.anInt1024 == this.anInt944) {
						this.anInt1024 = -1;
						this.aClass2_Sub1_Sub4_6.method83(64);
						this.aClass2_Sub1_Sub4_6.method84(this.anInt944);
					}
					this.aBoolean230 = false;
					this.aClass42_14.method420();
					this.aClass2_Sub1_Sub1_Sub3_8.method348(0, 0);
					if (this.anInt919 == -1) {
						if (this.anIntArray243[this.anInt944] != -1) {
							if (this.anInt944 == 0) {
								this.aClass2_Sub1_Sub1_Sub3_16.method348(22, 10);
							}
							if (this.anInt944 == 1) {
								this.aClass2_Sub1_Sub1_Sub3_17.method348(54, 8);
							}
							if (this.anInt944 == 2) {
								this.aClass2_Sub1_Sub1_Sub3_17.method348(82, 8);
							}
							if (this.anInt944 == 3) {
								this.aClass2_Sub1_Sub1_Sub3_18.method348(110, 8);
							}
							if (this.anInt944 == 4) {
								this.aClass2_Sub1_Sub1_Sub3_20.method348(153, 8);
							}
							if (this.anInt944 == 5) {
								this.aClass2_Sub1_Sub1_Sub3_20.method348(181, 8);
							}
							if (this.anInt944 == 6) {
								this.aClass2_Sub1_Sub1_Sub3_19.method348(209, 9);
							}
						}
						if (this.anIntArray243[0] != -1 && (this.anInt1024 != 0 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[0].method348(29, 13);
						}
						if (this.anIntArray243[1] != -1 && (this.anInt1024 != 1 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[1].method348(53, 11);
						}
						if (this.anIntArray243[2] != -1 && (this.anInt1024 != 2 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[2].method348(82, 11);
						}
						if (this.anIntArray243[3] != -1 && (this.anInt1024 != 3 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[3].method348(115, 12);
						}
						if (this.anIntArray243[4] != -1 && (this.anInt1024 != 4 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[4].method348(153, 13);
						}
						if (this.anIntArray243[5] != -1 && (this.anInt1024 != 5 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[5].method348(180, 11);
						}
						if (this.anIntArray243[6] != -1 && (this.anInt1024 != 6 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[6].method348(208, 13);
						}
					}
					this.aClass42_14.method421(516, 722, super.aGraphics2, 160);
					this.aClass42_13.method420();
					this.aClass2_Sub1_Sub1_Sub3_7.method348(0, 0);
					if (this.anInt919 == -1) {
						if (this.anIntArray243[this.anInt944] != -1) {
							if (this.anInt944 == 7) {
								this.aClass2_Sub1_Sub1_Sub3_11.method348(42, 0);
							}
							if (this.anInt944 == 8) {
								this.aClass2_Sub1_Sub1_Sub3_12.method348(74, 0);
							}
							if (this.anInt944 == 9) {
								this.aClass2_Sub1_Sub1_Sub3_12.method348(102, 0);
							}
							if (this.anInt944 == 10) {
								this.aClass2_Sub1_Sub1_Sub3_13.method348(130, 1);
							}
							if (this.anInt944 == 11) {
								this.aClass2_Sub1_Sub1_Sub3_15.method348(173, 0);
							}
							if (this.anInt944 == 12) {
								this.aClass2_Sub1_Sub1_Sub3_15.method348(201, 0);
							}
							if (this.anInt944 == 13) {
								this.aClass2_Sub1_Sub1_Sub3_14.method348(229, 0);
							}
						}
						if (this.anIntArray243[8] != -1 && (this.anInt1024 != 8 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[7].method348(74, 2);
						}
						if (this.anIntArray243[9] != -1 && (this.anInt1024 != 9 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[8].method348(102, 3);
						}
						if (this.anIntArray243[10] != -1 && (this.anInt1024 != 10 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[9].method348(137, 4);
						}
						if (this.anIntArray243[11] != -1 && (this.anInt1024 != 11 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[10].method348(174, 2);
						}
						if (this.anIntArray243[12] != -1 && (this.anInt1024 != 12 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[11].method348(201, 2);
						}
						if (this.anIntArray243[13] != -1 && (this.anInt1024 != 13 || anInt967 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub3Array2[12].method348(226, 2);
						}
					}
					this.aClass42_13.method421(496, 722, super.aGraphics2, 466);
					this.aClass42_26.method420();
					Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
				}
				if (this.aBoolean237) {
					this.aBoolean237 = false;
					this.aClass42_12.method420();
					this.aClass2_Sub1_Sub1_Sub3_6.method348(0, 0);
					this.aClass2_Sub1_Sub1_Sub2_3.method150("Public chat", true, 28, 16777215, 55);
					if (this.anInt1029 == 0) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("On", true, 41, 65280, 55);
					}
					if (this.anInt1029 == 1) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("Friends", true, 41, 16776960, 55);
					}
					if (this.anInt1029 == 2) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("Off", true, 41, 16711680, 55);
					}
					if (this.anInt1029 == 3) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("Hide", true, 41, 65535, 55);
					}
					this.aClass2_Sub1_Sub1_Sub2_3.method150("Private chat", true, 28, 16777215, 184);
					if (this.anInt939 == 0) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("On", true, 41, 65280, 184);
					}
					if (this.anInt939 == 1) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("Friends", true, 41, 16776960, 184);
					}
					if (this.anInt939 == 2) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("Off", true, 41, 16711680, 184);
					}
					this.aClass2_Sub1_Sub1_Sub2_3.method150("Trade/compete", true, 28, 16777215, 324);
					if (this.anInt969 == 0) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("On", true, 41, 65280, 324);
					}
					if (this.anInt969 == 1) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("Friends", true, 41, 16776960, 324);
					}
					if (this.anInt969 == 2) {
						this.aClass2_Sub1_Sub1_Sub2_3.method150("Off", true, 41, 16711680, 324);
					}
					this.aClass2_Sub1_Sub1_Sub2_3.method150("Report abuse", true, 33, 16777215, 458);
					this.aClass42_12.method421(0, 722, super.aGraphics2, 453);
					this.aClass42_26.method420();
					Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
				}
				this.anInt850 = 0;
			} else {
				this.method720(this.anInt850, this.anInt1037);
				this.anInt850 = 0;
				this.method605();
				super.aClass42_2.method420();
				Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray253;
				Class2_Sub1_Sub1.method483();
				this.aBoolean246 = true;
				@Pc(38) Class21 local38 = Class21.method256(this.anInt1037);
				if (local38.anInt424 == 512 && local38.anInt436 == 334 && local38.anInt425 == 0) {
					local38.anInt424 = 765;
					local38.anInt436 = 503;
				}
				this.method692(0, 0, local38, 0);
				if (this.aBoolean248) {
					this.method618();
				} else {
					this.method615();
					this.method688(739);
				}
				super.aClass42_2.method421(0, 722, super.aGraphics2, 0);
			}
		} catch (@Pc(1142) RuntimeException local1142) {
			signlink.reporterror("28349, " + false + ", " + local1142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method663(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt929 != 0) {
				@Pc(6) Class2_Sub1_Sub1_Sub2 local6 = this.aClass2_Sub1_Sub1_Sub2_3;
				@Pc(8) int local8 = 0;
				if (this.anInt955 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray12[local15] != null) {
						@Pc(27) int local27 = this.anIntArray241[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt939 == 0 || this.anInt939 == 1 && this.method653(local32, (byte) 4))) {
							local85 = 329 - local8 * 13;
							local6.method153(4, "From", 0, 988, local85);
							local6.method153(4, "From", 65535, 988, local85 - 1);
							@Pc(110) int local110 = local6.method151("From ") + 4;
							if (local34 == 1) {
								this.aClass2_Sub1_Sub1_Sub3Array3[0].method348(local110, local85 - 12);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass2_Sub1_Sub1_Sub3Array3[1].method348(local110, local85 - 12);
								local110 += 14;
							}
							local6.method153(local110, local32 + ": " + this.aStringArray12[local15], 0, 988, local85);
							local6.method153(local110, local32 + ": " + this.aStringArray12[local15], 65535, 988, local85 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt939 < 2) {
							local85 = 329 - local8 * 13;
							local6.method153(4, this.aStringArray12[local15], 0, 988, local85);
							local6.method153(4, this.aStringArray12[local15], 65535, 988, local85 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt939 < 2) {
							local85 = 329 - local8 * 13;
							local6.method153(4, "To " + local32 + ": " + this.aStringArray12[local15], 0, 988, local85);
							local6.method153(4, "To " + local32 + ": " + this.aStringArray12[local15], 65535, 988, local85 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				@Pc(291) int local291 = 46 / arg0;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("93659, " + arg0 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DNRIFKTO;I)V")
	private void method664(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1) {
		try {
			this.anInt972 = 0;
			this.anInt1021 = 0;
			this.method588(arg0, arg1);
			this.method694(arg0, arg1);
			this.method594(arg1, arg0, 687);
			this.method650(arg0, arg1, (byte) 6);
			@Pc(39) int local39;
			for (@Pc(32) int local32 = 0; local32 < this.anInt972; local32++) {
				local39 = this.anIntArray256[local32];
				if (this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local39].anInt262 != anInt967) {
					this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local39] = null;
				}
			}
			if (arg1.anInt166 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt166 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local39 = 0; local39 < this.anInt1020; local39++) {
				if (this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray272[local39]] == null) {
					signlink.reporterror(this.aString22 + " null entry in pl list - pos:" + local39 + " size:" + this.anInt1020);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("43902, " + arg0 + ", " + arg1 + ", " + -672 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass2_Sub1_Sub1_Sub3_9.method348(arg4, arg2);
			this.aClass2_Sub1_Sub1_Sub3_10.method348(arg4, arg2 + arg3 - 16);
			Class2_Sub1_Sub1.method485(arg3 - 32, this.anInt874, arg4, 16, this.aBoolean270, arg2 + 16);
			@Pc(43) int local43 = (arg3 - 32) * arg3 / arg0;
			if (local43 < 8) {
				local43 = 8;
			}
			@Pc(60) int local60 = (arg3 - local43 - 32) * arg1 / (arg0 - arg3);
			Class2_Sub1_Sub1.method485(local43, this.anInt934, arg4, 16, this.aBoolean270, arg2 + local60 + 16);
			Class2_Sub1_Sub1.method490(this.anInt961, arg4, local43, arg2 + local60 + 16);
			Class2_Sub1_Sub1.method490(this.anInt961, arg4 + 1, local43, arg2 + local60 + 16);
			Class2_Sub1_Sub1.method488(arg2 + local60 + 16, 16, arg4, this.anInt961, this.anInt893);
			Class2_Sub1_Sub1.method488(arg2 + local60 + 17, 16, arg4, this.anInt961, this.anInt893);
			Class2_Sub1_Sub1.method490(this.anInt957, arg4 + 15, local43, arg2 + local60 + 16);
			Class2_Sub1_Sub1.method490(this.anInt957, arg4 + 14, local43 - 1, arg2 + local60 + 17);
			Class2_Sub1_Sub1.method488(arg2 + local60 + local43 + 15, 16, arg4, this.anInt957, this.anInt893);
			Class2_Sub1_Sub1.method488(arg2 + local60 + local43 + 14, 15, arg4 + 1, this.anInt957, this.anInt893);
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("51167, " + arg0 + ", " + -471 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)Z")
	private boolean method666(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return signlink.wavereplay();
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("62192, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method667() {
		try {
			this.anInt831 += 0;
			this.anInt882 = 0;
			@Pc(16) int local16 = (aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 >> 7) + this.anInt905;
			@Pc(24) int local24 = (aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 >> 7) + this.anInt906;
			if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
				this.anInt882 = 1;
			}
			if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
				this.anInt882 = 1;
			}
			if (this.anInt882 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
				this.anInt882 = 0;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("10567, " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method668() {
		try {
			for (@Pc(16) Class2_Sub1_Sub2_Sub4 local16 = (Class2_Sub1_Sub2_Sub4) this.aClass48_12.method565(); local16 != null; local16 = (Class2_Sub1_Sub2_Sub4) this.aClass48_12.method567()) {
				if (local16.anInt558 != this.anInt909 || local16.aBoolean148) {
					local16.method558();
				} else if (anInt967 >= local16.anInt555) {
					local16.method354(this.anInt850);
					if (local16.aBoolean148) {
						local16.method558();
					} else {
						this.aClass47_1.method518(-1, local16, local16.anInt560, 0, local16.anInt561, 60, local16.anInt559, false, local16.anInt558);
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("73158, " + 5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method669(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.anInt999 != 1) {
				this.aClass48ArrayArrayArray1 = null;
			}
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("12129, " + arg0 + ", " + 1 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!HEKJNUPL;IIB)V")
	private void method670(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.anInt1043 < 400) {
				if (arg1.anIntArray45 != null) {
					arg1 = arg1.method191();
				}
				if (arg1 != null && arg1.aBoolean61) {
					@Pc(27) String local27 = arg1.aString4;
					if (arg1.anInt230 != 0) {
						local27 = local27 + method702(aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt302, arg1.anInt230) + " (level-" + arg1.anInt230 + ")";
					}
					if (this.anInt992 == 1) {
						this.aStringArray10[this.anInt1043] = "Use " + this.aString28 + " with @yel@" + local27;
						this.anIntArray248[this.anInt1043] = 850;
						this.anIntArray249[this.anInt1043] = arg2;
						this.anIntArray246[this.anInt1043] = arg0;
						this.anIntArray247[this.anInt1043] = arg3;
						this.anInt1043++;
					} else if (this.anInt852 != 1) {
						@Pc(165) int local165;
						if (arg1.aStringArray2 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg1.aStringArray2[local165] != null && !arg1.aStringArray2[local165].equalsIgnoreCase("attack")) {
									this.aStringArray10[this.anInt1043] = arg1.aStringArray2[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray248[this.anInt1043] = 111;
									}
									if (local165 == 1) {
										this.anIntArray248[this.anInt1043] = 269;
									}
									if (local165 == 2) {
										this.anIntArray248[this.anInt1043] = 625;
									}
									if (local165 == 3) {
										this.anIntArray248[this.anInt1043] = 988;
									}
									if (local165 == 4) {
										this.anIntArray248[this.anInt1043] = 359;
									}
									this.anIntArray249[this.anInt1043] = arg2;
									this.anIntArray246[this.anInt1043] = arg0;
									this.anIntArray247[this.anInt1043] = arg3;
									this.anInt1043++;
								}
							}
						}
						if (arg1.aStringArray2 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg1.aStringArray2[local165] != null && arg1.aStringArray2[local165].equalsIgnoreCase("attack")) {
									@Pc(289) short local289 = 0;
									if (arg1.anInt230 > aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt302) {
										local289 = 2000;
									}
									this.aStringArray10[this.anInt1043] = arg1.aStringArray2[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray248[this.anInt1043] = local289 + 111;
									}
									if (local165 == 1) {
										this.anIntArray248[this.anInt1043] = local289 + 269;
									}
									if (local165 == 2) {
										this.anIntArray248[this.anInt1043] = local289 + 625;
									}
									if (local165 == 3) {
										this.anIntArray248[this.anInt1043] = local289 + 988;
									}
									if (local165 == 4) {
										this.anIntArray248[this.anInt1043] = local289 + 359;
									}
									this.anIntArray249[this.anInt1043] = arg2;
									this.anIntArray246[this.anInt1043] = arg0;
									this.anIntArray247[this.anInt1043] = arg3;
									this.anInt1043++;
								}
							}
						}
						this.aStringArray10[this.anInt1043] = "Examine @yel@" + local27;
						this.anIntArray248[this.anInt1043] = 1860;
						this.anIntArray249[this.anInt1043] = arg2;
						this.anIntArray246[this.anInt1043] = arg0;
						this.anIntArray247[this.anInt1043] = arg3;
						this.anInt1043++;
					} else if ((this.anInt854 & 0x2) == 2) {
						this.aStringArray10[this.anInt1043] = this.aString17 + " @yel@" + local27;
						this.anIntArray248[this.anInt1043] = 283;
						this.anIntArray249[this.anInt1043] = arg2;
						this.anIntArray246[this.anInt1043] = arg0;
						this.anIntArray247[this.anInt1043] = arg3;
						this.anInt1043++;
						return;
					}
				}
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("96701, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 72 + ", " + local439.toString());
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
				return new URL("http://127.0.0.1:" + (anInt892 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg1 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg4;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class2_Sub1_Sub2_Sub5.anIntArray158[local5];
				local27 = Class2_Sub1_Sub2_Sub5.anIntArray159[local5];
				local37 = local27 * 0 - arg4 * local23 >> 16;
				local17 = local23 * 0 + arg4 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class2_Sub1_Sub2_Sub5.anIntArray158[local11];
				local27 = Class2_Sub1_Sub2_Sub5.anIntArray159[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt923 = arg2 - local13;
			this.anInt924 = arg0 - local15;
			if (this.anInt888 != 29388) {
				this.anInt888 = 276;
			}
			this.anInt925 = arg3 - local17;
			this.anInt926 = arg5;
			this.anInt927 = arg1;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("79737, " + arg0 + ", " + 29388 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method672() {
		try {
			if (this.aClass42_27 == null) {
				this.method719();
				super.aClass42_2 = null;
				this.aClass42_15 = null;
				this.aClass42_16 = null;
				this.aClass42_17 = null;
				this.aClass42_18 = null;
				this.aClass42_19 = null;
				this.aClass42_20 = null;
				this.aClass42_21 = null;
				this.aClass42_22 = null;
				this.aClass42_23 = null;
				this.aClass42_27 = new Class42(479, true, this.method583(), 96);
				this.aClass42_25 = new Class42(172, true, this.method583(), 156);
				Class2_Sub1_Sub1.method483();
				this.aClass2_Sub1_Sub1_Sub3_4.method348(0, 0);
				this.aClass42_24 = new Class42(190, true, this.method583(), 261);
				this.aClass42_26 = new Class42(512, true, this.method583(), 334);
				Class2_Sub1_Sub1.method483();
				this.aBoolean262 &= true;
				this.aClass42_12 = new Class42(496, true, this.method583(), 50);
				this.aClass42_13 = new Class42(269, true, this.method583(), 37);
				this.aClass42_14 = new Class42(249, true, this.method583(), 45);
				this.aBoolean246 = true;
				this.aClass42_26.method420();
				Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("46995, " + true + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method673() {
		try {
			if (this.anInt955 > 1) {
				this.anInt955--;
			}
			if (this.anInt835 > 0) {
				this.anInt835--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method625(208); local22++) {
			}
			if (this.aBoolean262) {
				@Pc(41) Object local41 = this.aClass5_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass5_1.anObject1) {
					if (!aBoolean232) {
						this.aClass5_1.anInt100 = 0;
					} else if (super.anInt812 != 0 || this.aClass5_1.anInt100 >= 40) {
						this.aClass2_Sub1_Sub4_6.method83(147);
						this.aClass2_Sub1_Sub4_6.method84(0);
						local66 = this.aClass2_Sub1_Sub4_6.anInt166;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass5_1.anInt100 && local66 - this.aClass2_Sub1_Sub4_6.anInt166 < 240; local70++) {
							local68++;
							local86 = this.aClass5_1.anIntArray17[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass5_1.anIntArray16[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass5_1.anIntArray17[local70] == -1 && this.aClass5_1.anIntArray16[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt856 || local86 != this.anInt857) {
								@Pc(165) int local165 = local103 - this.anInt856;
								this.anInt856 = local103;
								@Pc(173) int local173 = local86 - this.anInt857;
								this.anInt857 = local86;
								if (this.anInt875 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass2_Sub1_Sub4_6.method85((this.anInt875 << 12) + (local165 << 6) + local173);
									this.anInt875 = 0;
								} else if (this.anInt875 < 8) {
									this.aClass2_Sub1_Sub4_6.method87((this.anInt875 << 19) + local120 + 8388608);
									this.anInt875 = 0;
								} else {
									this.aClass2_Sub1_Sub4_6.method88((this.anInt875 << 19) + local120 - 1073741824);
									this.anInt875 = 0;
								}
							} else if (this.anInt875 < 2047) {
								this.anInt875++;
							}
						}
						this.aClass2_Sub1_Sub4_6.method93(this.aClass2_Sub1_Sub4_6.anInt166 - local66);
						if (local68 >= this.aClass5_1.anInt100) {
							this.aClass5_1.anInt100 = 0;
						} else {
							this.aClass5_1.anInt100 -= local68;
							for (local86 = 0; local86 < this.aClass5_1.anInt100; local86++) {
								this.aClass5_1.anIntArray16[local86] = this.aClass5_1.anIntArray16[local86 + local68];
								this.aClass5_1.anIntArray17[local86] = this.aClass5_1.anIntArray17[local86 + local68];
							}
						}
					}
				}
				if (super.anInt812 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong32) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong32 = super.aLong28;
					local66 = super.anInt814;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt813;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt812 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass2_Sub1_Sub4_6.method83(144);
					this.aClass2_Sub1_Sub4_6.method126((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt986 > 0) {
					this.anInt986--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean257 = true;
				}
				if (this.aBoolean257 && this.anInt986 <= 0) {
					this.anInt986 = 20;
					this.aBoolean257 = false;
					this.aClass2_Sub1_Sub4_6.method83(232);
					this.aClass2_Sub1_Sub4_6.method117((byte) 5, this.anInt865);
					this.aClass2_Sub1_Sub4_6.method116(this.anInt864);
				}
				if (super.aBoolean222 && !this.aBoolean228) {
					this.aBoolean228 = true;
					this.aClass2_Sub1_Sub4_6.method83(199);
					this.aClass2_Sub1_Sub4_6.method84(1);
				}
				if (!super.aBoolean222 && this.aBoolean228) {
					this.aBoolean228 = false;
					this.aClass2_Sub1_Sub4_6.method83(199);
					this.aClass2_Sub1_Sub4_6.method84(0);
				}
				this.method597();
				this.method701();
				this.method654();
				anInt946++;
				if (anInt946 > 110) {
					anInt946 = 0;
					this.aClass2_Sub1_Sub4_6.method83(140);
					this.aClass2_Sub1_Sub4_6.method85(46885);
				}
				this.anInt833++;
				if (this.anInt833 > 750) {
					this.method686();
				}
				this.method604();
				this.method655();
				this.method639();
				this.anInt850++;
				if (this.anInt826 != 0) {
					this.anInt825 += 20;
					if (this.anInt825 >= 400) {
						this.anInt826 = 0;
					}
				}
				if (this.anInt1006 != 0) {
					this.anInt1003++;
					if (this.anInt1003 >= 15) {
						if (this.anInt1006 == 2) {
							this.aBoolean243 = true;
						}
						if (this.anInt1006 == 3) {
							this.aBoolean226 = true;
						}
						this.anInt1006 = 0;
					}
				}
				if (this.anInt952 != 0) {
					this.anInt885++;
					if (super.anInt807 > this.anInt953 + 5 || super.anInt807 < this.anInt953 - 5 || super.anInt808 > this.anInt954 + 5 || super.anInt808 < this.anInt954 - 5) {
						this.aBoolean242 = true;
					}
					if (super.anInt806 == 0) {
						if (this.anInt952 == 2) {
							this.aBoolean243 = true;
						}
						if (this.anInt952 == 3) {
							this.aBoolean226 = true;
						}
						this.anInt952 = 0;
						if (this.aBoolean242 && this.anInt885 >= 5) {
							this.anInt978 = -1;
							this.method615();
							if (this.anInt978 == this.anInt950 && this.anInt977 != this.anInt951) {
								@Pc(702) Class21 local702 = Class21.method256(this.anInt950);
								@Pc(704) byte local704 = 0;
								if (this.anInt1042 == 1 && local702.anInt401 == 206) {
									local704 = 1;
								}
								if (local702.anIntArray66[this.anInt977] <= 0) {
									local704 = 0;
								}
								if (local702.aBoolean101) {
									local66 = this.anInt951;
									local68 = this.anInt977;
									local702.anIntArray66[local68] = local702.anIntArray66[local66];
									local702.anIntArray74[local68] = local702.anIntArray74[local66];
									local702.anIntArray66[local66] = -1;
									local702.anIntArray74[local66] = 0;
								} else if (local704 == 1) {
									local66 = this.anInt951;
									local68 = this.anInt977;
									while (local66 != local68) {
										if (local66 > local68) {
											local702.method257(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local702.method257(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local702.method257(this.anInt977, this.anInt951);
								}
								this.aClass2_Sub1_Sub4_6.method83(205);
								this.aClass2_Sub1_Sub4_6.method116(this.anInt950);
								this.aClass2_Sub1_Sub4_6.method84(local704);
								this.aClass2_Sub1_Sub4_6.method85(this.anInt951);
								this.aClass2_Sub1_Sub4_6.method85(this.anInt977);
							}
						} else if ((this.anInt910 == 1 || this.method685((byte) 9, this.anInt1043 - 1)) && this.anInt1043 > 2) {
							this.method592(this.aByte46);
						} else if (this.anInt1043 > 0) {
							this.method600(this.anInt1043 - 1);
						}
						this.anInt1003 = 10;
						super.anInt812 = 0;
					}
				}
				@Pc(876) int local876;
				@Pc(878) int local878;
				if (Class47.anInt749 != -1) {
					local876 = Class47.anInt749;
					local878 = Class47.anInt750;
					@Pc(899) boolean local899 = this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, true, local876, 0, local878, 0, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 0);
					Class47.anInt749 = -1;
					if (local899) {
						this.anInt823 = super.anInt813;
						this.anInt824 = super.anInt814;
						this.anInt826 = 1;
						this.anInt825 = 0;
					}
				}
				if (super.anInt812 == 1 && this.aString19 != null) {
					this.aString19 = null;
					this.aBoolean226 = true;
					super.anInt812 = 0;
				}
				this.method695();
				if (this.anInt1037 == -1) {
					this.method714();
					this.method645();
					this.method698();
				}
				if (super.anInt806 == 1 || super.anInt812 == 1) {
					this.anInt839++;
				}
				if (this.anInt1030 == 2) {
					this.method704();
				}
				if (this.anInt1030 == 2 && this.aBoolean271) {
					this.method611();
				}
				for (local876 = 0; local876 < 5; local876++) {
					@Pc(989) int local989 = this.anIntArray270[local876]++;
				}
				this.method700();
				super.anInt805++;
				if (super.anInt805 > 4500) {
					this.anInt835 = 250;
					super.anInt805 -= 500;
					this.aClass2_Sub1_Sub4_6.method83(136);
				}
				this.anInt981++;
				if (this.anInt981 > 500) {
					this.anInt981 = 0;
					local878 = (int) (Math.random() * 8.0D);
					if ((local878 & 0x1) == 1) {
						this.anInt889 += this.anInt890;
					}
					if ((local878 & 0x2) == 2) {
						this.anInt842 += this.anInt843;
					}
					if ((local878 & 0x4) == 4) {
						this.anInt911 += this.anInt912;
					}
				}
				if (this.anInt889 < -50) {
					this.anInt890 = 2;
				}
				if (this.anInt889 > 50) {
					this.anInt890 = -2;
				}
				if (this.anInt842 < -55) {
					this.anInt843 = 2;
				}
				if (this.anInt842 > 55) {
					this.anInt843 = -2;
				}
				if (this.anInt911 < -40) {
					this.anInt912 = 1;
				}
				if (this.anInt911 > 40) {
					this.anInt912 = -1;
				}
				this.anInt940++;
				if (this.anInt940 > 500) {
					this.anInt940 = 0;
					local878 = (int) (Math.random() * 8.0D);
					if ((local878 & 0x1) == 1) {
						this.anInt974 += this.anInt975;
					}
					if ((local878 & 0x2) == 2) {
						this.anInt1015 += this.anInt1016;
					}
				}
				if (this.anInt974 < -60) {
					this.anInt975 = 2;
				}
				if (this.anInt974 > 60) {
					this.anInt975 = -2;
				}
				if (this.anInt1015 < -20) {
					this.anInt1016 = 1;
				}
				if (this.anInt1015 > 10) {
					this.anInt1016 = -1;
				}
				this.anInt834++;
				if (this.anInt834 > 50) {
					this.aClass2_Sub1_Sub4_6.method83(231);
				}
				try {
					if (this.aClass32_1 != null && this.aClass2_Sub1_Sub4_6.anInt166 > 0) {
						this.aClass32_1.method322(this.aClass2_Sub1_Sub4_6.aByteArray2, this.aClass2_Sub1_Sub4_6.anInt166);
						this.aClass2_Sub1_Sub4_6.anInt166 = 0;
						this.anInt834 = 0;
					}
				} catch (@Pc(1241) IOException local1241) {
					this.method686();
				} catch (@Pc(1246) Exception local1246) {
					this.method606();
				}
			}
		} catch (@Pc(1251) RuntimeException local1251) {
			signlink.reporterror("42849, " + 883 + ", " + local1251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method674(@OriginalArg(0) int arg0) {
		try {
			this.anInt818 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt1020 + this.anInt901; local6++) {
				@Pc(13) Class2_Sub1_Sub2_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass2_Sub1_Sub2_Sub1_Sub2_1;
				} else if (local6 < this.anInt1020) {
					local13 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray272[local6]];
				} else {
					local13 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray236[local6 - this.anInt1020]];
				}
				if (local13 != null && local13.method199()) {
					@Pc(54) Class14 local54;
					if (local13 instanceof Class2_Sub1_Sub2_Sub1_Sub1) {
						local54 = ((Class2_Sub1_Sub2_Sub1_Sub1) local13).aClass14_1;
						if (local54.anIntArray45 != null) {
							local54 = local54.method191();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt1020) {
						local54 = ((Class2_Sub1_Sub2_Sub1_Sub1) local13).aClass14_1;
						if (local54.anInt233 >= 0 && local54.anInt233 < this.aClass2_Sub1_Sub1_Sub4Array9.length) {
							this.method677(local13, local13.anInt273 + 15);
							if (this.anInt860 > -1) {
								this.aClass2_Sub1_Sub1_Sub4Array9[local54.anInt233].method497(this.anInt860 - 12, this.anInt861 - 30);
							}
						}
						if (this.anInt931 == 1 && this.anInt858 == this.anIntArray236[local6 - this.anInt1020] && anInt967 % 20 < 10) {
							this.method677(local13, local13.anInt273 + 15);
							if (this.anInt860 > -1) {
								this.aClass2_Sub1_Sub1_Sub4Array4[0].method497(this.anInt860 - 12, this.anInt861 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class2_Sub1_Sub2_Sub1_Sub2 local73 = (Class2_Sub1_Sub2_Sub1_Sub2) local13;
						if (local73.anInt293 != -1 || local73.anInt289 != -1) {
							this.method677(local13, local13.anInt273 + 15);
							if (this.anInt860 > -1) {
								if (local73.anInt293 != -1) {
									this.aClass2_Sub1_Sub1_Sub4Array5[local73.anInt293].method497(this.anInt860 - 12, this.anInt861 - 30);
									local70 += 25;
								}
								if (local73.anInt289 != -1) {
									this.aClass2_Sub1_Sub1_Sub4Array9[local73.anInt289].method497(this.anInt860 - 12, this.anInt861 - local70);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt931 == 10 && this.anInt870 == this.anIntArray272[local6]) {
							this.method677(local13, local13.anInt273 + 15);
							if (this.anInt860 > -1) {
								this.aClass2_Sub1_Sub1_Sub4Array4[1].method497(this.anInt860 - 12, this.anInt861 - local70);
							}
						}
					}
					if (local13.aString5 != null && (local6 >= this.anInt1020 || this.anInt1029 == 0 || this.anInt1029 == 3 || this.anInt1029 == 1 && this.method653(((Class2_Sub1_Sub2_Sub1_Sub2) local13).aString6, (byte) 4))) {
						this.method677(local13, local13.anInt273);
						if (this.anInt860 > -1 && this.anInt818 < this.anInt819) {
							this.anIntArray216[this.anInt818] = this.aClass2_Sub1_Sub1_Sub2_4.method152(local13.aString5) / 2;
							this.anIntArray215[this.anInt818] = this.aClass2_Sub1_Sub1_Sub2_4.anInt188;
							this.anIntArray213[this.anInt818] = this.anInt860;
							this.anIntArray214[this.anInt818] = this.anInt861;
							this.anIntArray217[this.anInt818] = local13.anInt256;
							this.anIntArray218[this.anInt818] = local13.anInt261;
							this.anIntArray219[this.anInt818] = local13.anInt263;
							this.aStringArray8[this.anInt818++] = local13.aString5;
							if (this.anInt913 == 0 && local13.anInt261 >= 1 && local13.anInt261 <= 3) {
								this.anIntArray215[this.anInt818] += 10;
								this.anIntArray214[this.anInt818] += 5;
							}
							if (this.anInt913 == 0 && local13.anInt261 == 4) {
								this.anIntArray216[this.anInt818] = 60;
							}
							if (this.anInt913 == 0 && local13.anInt261 == 5) {
								this.anIntArray215[this.anInt818] += 5;
							}
						}
					}
					if (local13.anInt244 > anInt967) {
						this.method677(local13, local13.anInt273 + 15);
						if (this.anInt860 > -1) {
							local70 = local13.anInt245 * 30 / local13.anInt246;
							if (local70 > 30) {
								local70 = 30;
							}
							Class2_Sub1_Sub1.method485(5, 65280, this.anInt860 - 15, local70, this.aBoolean270, this.anInt861 - 3);
							Class2_Sub1_Sub1.method485(5, 16711680, this.anInt860 + local70 - 15, 30 - local70, this.aBoolean270, this.anInt861 - 3);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray55[local70] > anInt967) {
							this.method677(local13, local13.anInt273 / 2);
							if (this.anInt860 > -1) {
								if (local70 == 1) {
									this.anInt861 -= 20;
								}
								if (local70 == 2) {
									this.anInt860 -= 15;
									this.anInt861 -= 10;
								}
								if (local70 == 3) {
									this.anInt860 += 15;
									this.anInt861 -= 10;
								}
								this.aClass2_Sub1_Sub1_Sub4Array10[local13.anIntArray54[local70]].method497(this.anInt860 - 12, this.anInt861 - 12);
								this.aClass2_Sub1_Sub1_Sub2_2.method149(0, this.anInt860, String.valueOf(local13.anIntArray53[local70]), this.anInt861 + 4);
								this.aClass2_Sub1_Sub1_Sub2_2.method149(16777215, this.anInt860 - 1, String.valueOf(local13.anIntArray53[local70]), this.anInt861 + 3);
							}
						}
					}
				}
			}
			if (arg0 != this.anInt868) {
				this.aClass48ArrayArrayArray1 = null;
			}
			for (@Pc(619) int local619 = 0; local619 < this.anInt818; local619++) {
				local70 = this.anIntArray213[local619];
				@Pc(631) int local631 = this.anIntArray214[local619];
				@Pc(636) int local636 = this.anIntArray216[local619];
				@Pc(641) int local641 = this.anIntArray215[local619];
				@Pc(643) boolean local643 = true;
				while (local643) {
					local643 = false;
					for (@Pc(649) int local649 = 0; local649 < local619; local649++) {
						if (local631 + 2 > this.anIntArray214[local649] - this.anIntArray215[local649] && local631 - local641 < this.anIntArray214[local649] + 2 && local70 - local636 < this.anIntArray213[local649] + this.anIntArray216[local649] && local70 + local636 > this.anIntArray213[local649] - this.anIntArray216[local649] && this.anIntArray214[local649] - this.anIntArray215[local649] < local631) {
							local631 = this.anIntArray214[local649] - this.anIntArray215[local649];
							local643 = true;
						}
					}
				}
				this.anInt860 = this.anIntArray213[local619];
				this.anInt861 = this.anIntArray214[local619] = local631;
				@Pc(748) String local748 = this.aStringArray8[local619];
				if (this.anInt913 == 0) {
					@Pc(753) int local753 = 16776960;
					if (this.anIntArray217[local619] < 6) {
						local753 = this.anIntArray231[this.anIntArray217[local619]];
					}
					if (this.anIntArray217[local619] == 6) {
						local753 = this.anInt960 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray217[local619] == 7) {
						local753 = this.anInt960 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray217[local619] == 8) {
						local753 = this.anInt960 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(828) int local828;
					if (this.anIntArray217[local619] == 9) {
						local828 = 150 - this.anIntArray219[local619];
						if (local828 < 50) {
							local753 = local828 * 1280 + 16711680;
						} else if (local828 < 100) {
							local753 = 16776960 - (local828 - 50) * 327680;
						} else if (local828 < 150) {
							local753 = (local828 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray217[local619] == 10) {
						local828 = 150 - this.anIntArray219[local619];
						if (local828 < 50) {
							local753 = local828 * 5 + 16711680;
						} else if (local828 < 100) {
							local753 = 16711935 - (local828 - 50) * 327680;
						} else if (local828 < 150) {
							local753 = (local828 - 100) * 327680 + 255 - (local828 - 100) * 5;
						}
					}
					if (this.anIntArray217[local619] == 11) {
						local828 = 150 - this.anIntArray219[local619];
						if (local828 < 50) {
							local753 = 16777215 - local828 * 327685;
						} else if (local828 < 100) {
							local753 = (local828 - 50) * 327685 + 65280;
						} else if (local828 < 150) {
							local753 = 16777215 - (local828 - 100) * 327680;
						}
					}
					if (this.anIntArray218[local619] == 0) {
						this.aClass2_Sub1_Sub1_Sub2_4.method149(0, this.anInt860, local748, this.anInt861 + 1);
						this.aClass2_Sub1_Sub1_Sub2_4.method149(local753, this.anInt860, local748, this.anInt861);
					}
					if (this.anIntArray218[local619] == 1) {
						this.aClass2_Sub1_Sub1_Sub2_4.method154(0, local748, this.anInt861 + 1, this.anInt860, this.anInt960);
						this.aClass2_Sub1_Sub1_Sub2_4.method154(local753, local748, this.anInt861, this.anInt860, this.anInt960);
					}
					if (this.anIntArray218[local619] == 2) {
						this.aClass2_Sub1_Sub1_Sub2_4.method155(this.anInt861 + 1, this.aByte45, local748, this.anInt860, this.anInt960, 0);
						this.aClass2_Sub1_Sub1_Sub2_4.method155(this.anInt861, this.aByte45, local748, this.anInt860, this.anInt960, local753);
					}
					if (this.anIntArray218[local619] == 3) {
						this.aClass2_Sub1_Sub1_Sub2_4.method156(this.anInt861 + 1, this.anInt860, 0, 150 - this.anIntArray219[local619], local748, this.anInt960);
						this.aClass2_Sub1_Sub1_Sub2_4.method156(this.anInt861, this.anInt860, local753, 150 - this.anIntArray219[local619], local748, this.anInt960);
					}
					@Pc(1127) int local1127;
					if (this.anIntArray218[local619] == 4) {
						local828 = this.aClass2_Sub1_Sub1_Sub2_4.method152(local748);
						local1127 = (150 - this.anIntArray219[local619]) * (local828 + 100) / 150;
						Class2_Sub1_Sub1.method482(this.anInt860 - 50, 0, 334, this.anInt860 + 50);
						this.aClass2_Sub1_Sub1_Sub2_4.method153(this.anInt860 + 50 - local1127, local748, 0, 988, this.anInt861 + 1);
						this.aClass2_Sub1_Sub1_Sub2_4.method153(this.anInt860 + 50 - local1127, local748, local753, 988, this.anInt861);
						Class2_Sub1_Sub1.method481();
					}
					if (this.anIntArray218[local619] == 5) {
						local828 = 150 - this.anIntArray219[local619];
						local1127 = 0;
						if (local828 < 25) {
							local1127 = local828 - 25;
						} else if (local828 > 125) {
							local1127 = local828 - 125;
						}
						Class2_Sub1_Sub1.method482(0, this.anInt861 - this.aClass2_Sub1_Sub1_Sub2_4.anInt188 - 1, this.anInt861 + 5, 512);
						this.aClass2_Sub1_Sub1_Sub2_4.method149(0, this.anInt860, local748, this.anInt861 + local1127 + 1);
						this.aClass2_Sub1_Sub1_Sub2_4.method149(local753, this.anInt860, local748, this.anInt861 + local1127);
						Class2_Sub1_Sub1.method481();
					}
				} else {
					this.aClass2_Sub1_Sub1_Sub2_4.method149(0, this.anInt860, local748, this.anInt861 + 1);
					this.aClass2_Sub1_Sub1_Sub2_4.method149(16776960, this.anInt860, local748, this.anInt861);
				}
			}
		} catch (@Pc(1277) RuntimeException local1277) {
			signlink.reporterror("98848, " + arg0 + ", " + local1277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method675(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt820 >= 100) {
					this.method690((byte) 3, 0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					@Pc(24) String local24 = Class18.method210(Class18.method207(this.aBoolean255, arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt820; local26++) {
						if (this.aLongArray4[local26] == arg0) {
							this.method690((byte) 3, 0, local24 + " is already on your ignore list", "");
							return;
						}
					}
					for (@Pc(61) int local61 = 0; local61 < this.anInt898; local61++) {
						if (this.aLongArray3[local61] == arg0) {
							this.method690((byte) 3, 0, "Please remove " + local24 + " from your friend list first", "");
							return;
						}
					}
					this.aLongArray4[this.anInt820++] = arg0;
					this.aBoolean243 = true;
					this.aClass2_Sub1_Sub4_6.method83(85);
					this.aClass2_Sub1_Sub4_6.method90(arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("73552, " + arg0 + ", " + 9 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method676() {
		try {
			this.anInt960++;
			this.method633(true, 305);
			this.method609(496, true);
			this.method633(false, 305);
			this.method609(496, false);
			this.method624();
			this.method668();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean271) {
				local35 = this.anInt864;
				if (this.anInt872 / 256 > local35) {
					local35 = this.anInt872 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray230[4] + 128 > local35) {
					local35 = this.anIntArray230[4] + 128;
				}
				local74 = this.anInt865 + this.anInt911 & 0x7FF;
				this.method671(this.method640(this.anInt909, aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285, aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286) - 50, local74, this.anInt984, this.anInt985, local35 * 3 + 600, local35);
			}
			if (this.aBoolean271) {
				local35 = this.method708();
			} else {
				local35 = this.method707();
			}
			local74 = this.anInt923;
			@Pc(118) int local118 = this.anInt924;
			@Pc(121) int local121 = this.anInt925;
			@Pc(124) int local124 = this.anInt926;
			@Pc(127) int local127 = this.anInt927;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray11[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray237[local129] * 2 + 1) - (double) this.anIntArray237[local129] + Math.sin((double) this.anIntArray270[local129] * ((double) this.anIntArray229[local129] / 100.0D)) * (double) this.anIntArray230[local129]);
					if (local129 == 0) {
						this.anInt923 += local176;
					}
					if (local129 == 1) {
						this.anInt924 += local176;
					}
					if (local129 == 2) {
						this.anInt925 += local176;
					}
					if (local129 == 3) {
						this.anInt927 = this.anInt927 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt926 += local176;
						if (this.anInt926 < 128) {
							this.anInt926 = 128;
						}
						if (this.anInt926 > 383) {
							this.anInt926 = 383;
						}
					}
				}
			}
			local176 = Class2_Sub1_Sub1_Sub1.anInt47;
			Class2_Sub1_Sub2_Sub5.aBoolean166 = true;
			Class2_Sub1_Sub2_Sub5.anInt603 = 0;
			Class2_Sub1_Sub2_Sub5.anInt601 = super.anInt807 - 4;
			Class2_Sub1_Sub2_Sub5.anInt602 = super.anInt808 - 4;
			Class2_Sub1_Sub1.method483();
			this.aClass47_1.method546(this.anInt924, this.anInt923, this.anInt926, local35, this.anInt925, this.anInt927);
			this.aClass47_1.method521();
			this.method674(anInt847);
			this.method691();
			this.method603(local176);
			this.method630();
			this.aClass42_26.method421(4, 722, super.aGraphics2, 4);
			this.anInt923 = local74;
			this.anInt924 = local118;
			this.anInt925 = local121;
			this.anInt926 = local124;
			this.anInt927 = local127;
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("12162, " + -23669 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BTOCNVPA;ZI)V")
	private void method677(@OriginalArg(0) Class2_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method678(arg1, arg0.anInt285, arg0.anInt286);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("42954, " + arg0 + ", " + false + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)V")
	private void method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method640(this.anInt909, arg1, arg2) - arg0;
				@Pc(39) int local39 = arg1 - this.anInt923;
				@Pc(44) int local44 = local28 - this.anInt924;
				@Pc(49) int local49 = arg2 - this.anInt925;
				@Pc(54) int local54 = Class2_Sub1_Sub2_Sub5.anIntArray158[this.anInt926];
				@Pc(59) int local59 = Class2_Sub1_Sub2_Sub5.anIntArray159[this.anInt926];
				@Pc(64) int local64 = Class2_Sub1_Sub2_Sub5.anIntArray158[this.anInt927];
				@Pc(69) int local69 = Class2_Sub1_Sub2_Sub5.anIntArray159[this.anInt927];
				@Pc(79) int local79 = local49 * local64 + local39 * local69 >> 16;
				@Pc(89) int local89 = local49 * local69 - local39 * local64 >> 16;
				@Pc(91) int local91 = local79;
				@Pc(101) int local101 = local44 * local59 - local89 * local54 >> 16;
				@Pc(111) int local111 = local44 * local54 + local89 * local59 >> 16;
				if (local111 >= 50) {
					this.anInt860 = Class2_Sub1_Sub1_Sub1.anInt43 + (local91 << 9) / local111;
					this.anInt861 = Class2_Sub1_Sub1_Sub1.anInt44 + (local101 << 9) / local111;
				} else {
					this.anInt860 = -1;
					this.anInt861 = -1;
				}
			} else {
				this.anInt860 = -1;
				this.anInt861 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("45821, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!HHCKFJEO;IBI)V")
	private void method679(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != aClass2_Sub1_Sub2_Sub1_Sub2_1 && this.anInt1043 < 400) {
				@Pc(35) String local35;
				if (arg1.anInt295 == 0) {
					local35 = arg1.aString6 + method702(aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt302, arg1.anInt302) + " (level-" + arg1.anInt302 + ")";
				} else {
					local35 = arg1.aString6 + " (skill-" + arg1.anInt295 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt992 == 1) {
					this.aStringArray10[this.anInt1043] = "Use " + this.aString28 + " with @whi@" + local35;
					this.anIntArray248[this.anInt1043] = 777;
					this.anIntArray249[this.anInt1043] = arg3;
					this.anIntArray246[this.anInt1043] = arg0;
					this.anIntArray247[this.anInt1043] = arg2;
					this.anInt1043++;
				} else if (this.anInt852 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray13[local165] != null) {
							this.aStringArray10[this.anInt1043] = this.aStringArray13[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray13[local165].equalsIgnoreCase("attack")) {
								if (arg1.anInt302 > aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt302) {
									local192 = 2000;
								}
								if (aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt288 != 0 && arg1.anInt288 != 0) {
									if (aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt288 == arg1.anInt288) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray12[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray248[this.anInt1043] = local192 + 837;
							}
							if (local165 == 1) {
								this.anIntArray248[this.anInt1043] = local192 + 446;
							}
							if (local165 == 2) {
								this.anIntArray248[this.anInt1043] = local192 + 361;
							}
							if (local165 == 3) {
								this.anIntArray248[this.anInt1043] = local192 + 349;
							}
							if (local165 == 4) {
								this.anIntArray248[this.anInt1043] = local192 + 20;
							}
							this.anIntArray249[this.anInt1043] = arg3;
							this.anIntArray246[this.anInt1043] = arg0;
							this.anIntArray247[this.anInt1043] = arg2;
							this.anInt1043++;
						}
					}
				} else if ((this.anInt854 & 0x8) == 8) {
					this.aStringArray10[this.anInt1043] = this.aString17 + " @whi@" + local35;
					this.anIntArray248[this.anInt1043] = 690;
					this.anIntArray249[this.anInt1043] = arg3;
					this.anIntArray246[this.anInt1043] = arg0;
					this.anIntArray247[this.anInt1043] = arg2;
					this.anInt1043++;
				}
				for (local165 = 0; local165 < this.anInt1043; local165++) {
					if (this.anIntArray248[local165] == 579) {
						this.aStringArray10[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("19725, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 38 + ", " + arg3 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method680(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass2_Sub1_Sub1_Sub4_10.anIntArray190;
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
						this.aClass47_1.method542(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass47_1.method542(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass2_Sub1_Sub1_Sub4_10.method492();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method713(local146, local142, local36, local34, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method713(local146, local142, local36, local34, arg0 + 1);
					}
				}
			}
			if (this.aClass42_26 != null) {
				this.aClass42_26.method420();
				Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
			}
			anInt900++;
			if (anInt900 > 82) {
				anInt900 = 0;
				this.aClass2_Sub1_Sub4_6.method83(155);
			}
			this.anInt844 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(234) int local234 = 0; local234 < 104; local234++) {
					@Pc(244) int local244 = this.aClass47_1.method536(this.anInt909, local146, local234);
					if (local244 != 0) {
						local244 = local244 >> 14 & 0x7FFF;
						@Pc(256) int local256 = Class41.method410(local244).anInt614;
						if (local256 >= 0) {
							@Pc(260) int local260 = local146;
							@Pc(262) int local262 = local234;
							if (local256 != 22 && local256 != 29 && local256 != 34 && local256 != 36 && local256 != 46 && local256 != 47 && local256 != 48) {
								@Pc(294) int[][] local294 = this.aClass45Array1[this.anInt909].anIntArrayArray16;
								for (@Pc(296) int local296 = 0; local296 < 10; local296++) {
									@Pc(303) int local303 = (int) (Math.random() * 4.0D);
									if (local303 == 0 && local260 > 0 && local260 > local146 - 3 && (local294[local260 - 1][local262] & 0x1280108) == 0) {
										local260--;
									}
									if (local303 == 1 && local260 < 103 && local260 < local146 + 3 && (local294[local260 + 1][local262] & 0x1280180) == 0) {
										local260++;
									}
									if (local303 == 2 && local262 > 0 && local262 > local234 - 3 && (local294[local260][local262 - 1] & 0x1280102) == 0) {
										local262--;
									}
									if (local303 == 3 && local262 < 103 && local262 < local234 + 3 && (local294[local260][local262 + 1] & 0x1280120) == 0) {
										local262++;
									}
								}
							}
							this.aClass2_Sub1_Sub1_Sub4Array8[this.anInt844] = this.aClass2_Sub1_Sub1_Sub4Array6[local256];
							this.anIntArray223[this.anInt844] = local260;
							this.anIntArray224[this.anInt844] = local262;
							this.anInt844++;
						}
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("63913, " + 15 + ", " + arg0 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!DNRIFKTO;IZ)V")
	private void method681(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(13) int local13;
			@Pc(22) int local22;
			@Pc(29) int local29;
			@Pc(34) int local34;
			@Pc(39) int local39;
			@Pc(42) int local42;
			@Pc(45) int local45;
			@Pc(50) int local50;
			@Pc(55) int local55;
			@Pc(58) int local58;
			@Pc(61) int local61;
			@Pc(64) int local64;
			@Pc(67) int local67;
			if (arg1 == 24) {
				local13 = arg0.method94();
				local22 = this.anInt829 + (local13 >> 4 & 0x7);
				local29 = this.anInt830 + (local13 & 0x7);
				local34 = local22 + arg0.method95();
				local39 = local29 + arg0.method95();
				local42 = arg0.method97();
				local45 = arg0.method96();
				local50 = arg0.method94() * 4;
				local55 = arg0.method94() * 4;
				local58 = arg0.method96();
				local61 = arg0.method96();
				local64 = arg0.method94();
				local67 = arg0.method94();
				if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local34 >= 0 && local39 >= 0 && local34 < 104 && local39 < 104 && local45 != 65535) {
					local22 = local22 * 128 + 64;
					local29 = local29 * 128 + 64;
					local34 = local34 * 128 + 64;
					local39 = local39 * 128 + 64;
					@Pc(143) Class2_Sub1_Sub2_Sub2 local143 = new Class2_Sub1_Sub2_Sub2(local58 + anInt967, local55, local42, local29, local67, this.anInt909, local64, local61 + anInt967, local22, this.method640(this.anInt909, local22, local29) - local50, local45, 142);
					local143.method243(local58 + anInt967, local34, this.method640(this.anInt909, local34, local39) - local55, local39);
					this.aClass48_11.method562(local143);
				}
			} else if (arg1 == 211) {
				local13 = arg0.method112();
				local22 = this.anInt829 + (local13 >> 4 & 0x7);
				local29 = this.anInt830 + (local13 & 0x7);
				local34 = arg0.method112();
				local39 = local34 >> 2;
				local42 = local34 & 0x3;
				local45 = this.anIntArray254[local39];
				if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
					this.method634(local22, 0, local45, this.anInt909, local29, local42, local39, 786, -1, -1);
				}
			} else if (arg1 == 253) {
				local13 = arg0.method121();
				local22 = arg0.method94();
				local29 = this.anInt829 + (local22 >> 4 & 0x7);
				local34 = this.anInt830 + (local22 & 0x7);
				local39 = arg0.method119(this.aByte58);
				local42 = arg0.method121();
				if (local29 >= 0 && local34 >= 0 && local29 < 104 && local34 < 104 && local39 != this.anInt1012) {
					@Pc(282) Class2_Sub1_Sub2_Sub6 local282 = new Class2_Sub1_Sub2_Sub6();
					local282.anInt762 = local13;
					local282.anInt763 = local42;
					if (this.aClass48ArrayArrayArray1[this.anInt909][local29][local34] == null) {
						this.aClass48ArrayArrayArray1[this.anInt909][local29][local34] = new Class48(-489);
					}
					this.aClass48ArrayArrayArray1[this.anInt909][local29][local34].method562(local282);
					this.method620(local29, local34);
				}
			} else if (arg1 == 77) {
				local13 = arg0.method120();
				local22 = arg0.method113();
				local29 = this.anInt829 + (local22 >> 4 & 0x7);
				local34 = this.anInt830 + (local22 & 0x7);
				local39 = arg0.method94();
				local42 = local39 >> 2;
				local45 = local39 & 0x3;
				local50 = this.anIntArray254[local42];
				if (local29 >= 0 && local34 >= 0 && local29 < 103 && local34 < 103) {
					local55 = this.anIntArrayArrayArray8[this.anInt909][local29][local34];
					local58 = this.anIntArrayArrayArray8[this.anInt909][local29 + 1][local34];
					local61 = this.anIntArrayArrayArray8[this.anInt909][local29 + 1][local34 + 1];
					local64 = this.anIntArrayArrayArray8[this.anInt909][local29][local34 + 1];
					if (local50 == 0) {
						@Pc(440) Class1 local440 = this.aClass47_1.method529(this.anInt963, local34, this.anInt909, local29);
						if (local440 != null) {
							@Pc(449) int local449 = local440.anInt6 >> 14 & 0x7FFF;
							if (local42 == 2) {
								local440.aClass2_Sub1_Sub2_1 = new Class2_Sub1_Sub2_Sub3(0, local55, local58, local13, local45 + 4, local61, local449, local64, false, 2);
								local440.aClass2_Sub1_Sub2_2 = new Class2_Sub1_Sub2_Sub3(0, local55, local58, local13, local45 + 1 & 0x3, local61, local449, local64, false, 2);
							} else {
								local440.aClass2_Sub1_Sub2_1 = new Class2_Sub1_Sub2_Sub3(0, local55, local58, local13, local45, local61, local449, local64, false, local42);
							}
						}
					}
					if (local50 == 1) {
						@Pc(517) Class3 local517 = this.aClass47_1.method530(local34, local29, this.anInt909);
						if (local517 != null) {
							local517.aClass2_Sub1_Sub2_3 = new Class2_Sub1_Sub2_Sub3(0, local55, local58, local13, 0, local61, local517.anInt12 >> 14 & 0x7FFF, local64, false, 4);
						}
					}
					if (local50 == 2) {
						@Pc(551) Class15 local551 = this.aClass47_1.method531(local34, this.anInt909, local29);
						if (local42 == 11) {
							local42 = 10;
						}
						if (local551 != null) {
							local551.aClass2_Sub1_Sub2_4 = new Class2_Sub1_Sub2_Sub3(0, local55, local58, local13, local45, local61, local551.anInt316 >> 14 & 0x7FFF, local64, false, local42);
						}
					}
					if (local50 == 3) {
						@Pc(590) Class33 local590 = this.aClass47_1.method532(local29, this.anInt909, local34);
						if (local590 != null) {
							local590.aClass2_Sub1_Sub2_8 = new Class2_Sub1_Sub2_Sub3(0, local55, local58, local13, local45, local61, local590.anInt517 >> 14 & 0x7FFF, local64, false, 22);
						}
					}
				}
			} else {
				@Pc(659) Class2_Sub1_Sub2_Sub6 local659;
				if (arg1 == 52) {
					local13 = arg0.method121();
					local22 = arg0.method119(this.aByte58);
					local29 = arg0.method113();
					local34 = this.anInt829 + (local29 >> 4 & 0x7);
					local39 = this.anInt830 + (local29 & 0x7);
					if (local34 >= 0 && local39 >= 0 && local34 < 104 && local39 < 104) {
						local659 = new Class2_Sub1_Sub2_Sub6();
						local659.anInt762 = local13;
						local659.anInt763 = local22;
						if (this.aClass48ArrayArrayArray1[this.anInt909][local34][local39] == null) {
							this.aClass48ArrayArrayArray1[this.anInt909][local34][local39] = new Class48(-489);
						}
						this.aClass48ArrayArrayArray1[this.anInt909][local34][local39].method562(local659);
						this.method620(local34, local39);
					}
				} else if (arg1 == 197) {
					local13 = arg0.method96();
					local22 = arg0.method94();
					local29 = this.anInt829 + (local22 >> 4 & 0x7);
					local34 = this.anInt830 + (local22 & 0x7);
					local39 = arg0.method94();
					local42 = local39 >> 2;
					local45 = local39 & 0x3;
					local50 = this.anIntArray254[local42];
					if (local29 >= 0 && local34 >= 0 && local29 < 104 && local34 < 104) {
						this.method634(local29, 0, local50, this.anInt909, local34, local45, local42, 786, -1, local13);
					}
				} else {
					if (arg1 == 185) {
						local13 = arg0.method94();
						local22 = this.anInt829 + (local13 >> 4 & 0x7);
						local29 = this.anInt830 + (local13 & 0x7);
						local34 = arg0.method96();
						local39 = arg0.method94();
						local42 = local39 >> 4 & 0xF;
						local45 = local39 & 0x7;
						if (aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0] >= local22 - local42 && aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0] <= local22 + local42 && aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0] >= local29 - local42 && aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0] <= local29 + local42 && this.aBoolean261 && !aBoolean236 && this.anInt1000 < 50) {
							this.anIntArray262[this.anInt1000] = local34;
							this.anIntArray260[this.anInt1000] = local45;
							this.anIntArray232[this.anInt1000] = Class24.anIntArray75[local34];
							this.anInt1000++;
						}
					}
					if (arg1 == 87) {
						local13 = arg0.method94();
						local22 = this.anInt829 + (local13 >> 4 & 0x7);
						local29 = this.anInt830 + (local13 & 0x7);
						local34 = arg0.method96();
						local39 = arg0.method96();
						local42 = arg0.method96();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							@Pc(925) Class48 local925 = this.aClass48ArrayArrayArray1[this.anInt909][local22][local29];
							if (local925 != null) {
								for (@Pc(931) Class2_Sub1_Sub2_Sub6 local931 = (Class2_Sub1_Sub2_Sub6) local925.method565(); local931 != null; local931 = (Class2_Sub1_Sub2_Sub6) local925.method567()) {
									if (local931.anInt762 == (local34 & 0x7FFF) && local931.anInt763 == local39) {
										local931.anInt763 = local42;
										break;
									}
								}
								this.method620(local22, local29);
							}
						}
					} else if (arg1 == 94) {
						local13 = arg0.method94();
						local22 = this.anInt829 + (local13 >> 4 & 0x7);
						local29 = this.anInt830 + (local13 & 0x7);
						local34 = arg0.method96();
						local39 = arg0.method94();
						local42 = arg0.method96();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							local22 = local22 * 128 + 64;
							local29 = local29 * 128 + 64;
							@Pc(1034) Class2_Sub1_Sub2_Sub4 local1034 = new Class2_Sub1_Sub2_Sub4(false, local34, local42, this.method640(this.anInt909, local22, local29) - local39, local29, this.anInt909, local22, anInt967);
							this.aClass48_12.method562(local1034);
						}
					} else {
						if (arg1 == 207) {
							local13 = arg0.method120();
							local22 = arg0.method119(this.aByte58);
							@Pc(1055) byte local1055 = arg0.method115();
							@Pc(1059) byte local1059 = arg0.method114();
							local39 = arg0.method96();
							local42 = arg0.method113();
							local45 = this.anInt829 + (local42 >> 4 & 0x7);
							local50 = this.anInt830 + (local42 & 0x7);
							local55 = arg0.method96();
							local58 = arg0.method94();
							local61 = local58 >> 2;
							local64 = local58 & 0x3;
							local67 = this.anIntArray254[local61];
							@Pc(1104) byte local1104 = arg0.method95();
							@Pc(1108) byte local1108 = arg0.method114();
							@Pc(1114) Class2_Sub1_Sub2_Sub1_Sub2 local1114;
							if (local39 == this.anInt1012) {
								local1114 = aClass2_Sub1_Sub2_Sub1_Sub2_1;
							} else {
								local1114 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local39];
							}
							if (local1114 != null) {
								@Pc(1126) Class41 local1126 = Class41.method410(local22);
								@Pc(1136) int local1136 = this.anIntArrayArrayArray8[this.anInt909][local45][local50];
								@Pc(1148) int local1148 = this.anIntArrayArrayArray8[this.anInt909][local45 + 1][local50];
								@Pc(1162) int local1162 = this.anIntArrayArrayArray8[this.anInt909][local45 + 1][local50 + 1];
								@Pc(1174) int local1174 = this.anIntArrayArrayArray8[this.anInt909][local45][local50 + 1];
								@Pc(1184) Class2_Sub1_Sub2_Sub5 local1184 = local1126.method411(local61, local64, local1136, local1148, local1162, local1174, -1);
								if (local1184 != null) {
									this.method634(local45, local55 + 1, local67, this.anInt909, local50, 0, 0, 786, local13 + 1, -1);
									local1114.anInt300 = local55 + anInt967;
									local1114.anInt301 = local13 + anInt967;
									local1114.aClass2_Sub1_Sub2_Sub5_1 = local1184;
									@Pc(1219) int local1219 = local1126.anInt611;
									@Pc(1222) int local1222 = local1126.anInt610;
									if (local64 == 1 || local64 == 3) {
										local1219 = local1126.anInt610;
										local1222 = local1126.anInt611;
									}
									local1114.anInt290 = local45 * 128 + local1219 * 64;
									local1114.anInt292 = local50 * 128 + local1222 * 64;
									local1114.anInt291 = this.method640(this.anInt909, local1114.anInt290, local1114.anInt292);
									@Pc(1268) byte local1268;
									if (local1108 > local1104) {
										local1268 = local1108;
										local1108 = local1104;
										local1104 = local1268;
									}
									if (local1059 > local1055) {
										local1268 = local1059;
										local1059 = local1055;
										local1055 = local1268;
									}
									local1114.anInt296 = local45 + local1108;
									local1114.anInt298 = local45 + local1104;
									local1114.anInt297 = local50 + local1059;
									local1114.anInt299 = local50 + local1055;
								}
							}
						}
						if (arg1 == 212) {
							local13 = arg0.method111();
							local22 = this.anInt829 + (local13 >> 4 & 0x7);
							local29 = this.anInt830 + (local13 & 0x7);
							local34 = arg0.method119(this.aByte58);
							if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
								@Pc(1349) Class48 local1349 = this.aClass48ArrayArrayArray1[this.anInt909][local22][local29];
								if (local1349 != null) {
									for (local659 = (Class2_Sub1_Sub2_Sub6) local1349.method565(); local659 != null; local659 = (Class2_Sub1_Sub2_Sub6) local1349.method567()) {
										if (local659.anInt762 == (local34 & 0x7FFF)) {
											local659.method558();
											break;
										}
									}
									if (local1349.method565() == null) {
										this.aClass48ArrayArrayArray1[this.anInt909][local22][local29] = null;
									}
									this.method620(local22, local29);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1393) RuntimeException local1393) {
			signlink.reporterror("79454, " + arg0 + ", " + arg1 + ", " + true + ", " + local1393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method682() {
		try {
			for (@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) this.aClass48_10.method565(); local6 != null; local6 = (Class2_Sub3) this.aClass48_10.method567()) {
				if (local6.anInt709 == -1) {
					local6.anInt710 = 0;
					this.method617(local6);
				} else {
					local6.method558();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("57502, " + 750 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method683(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(16) int local16 = 0; local16 < this.anInt898; local16++) {
					if (this.aLongArray3[local16] == arg0) {
						this.anInt898--;
						this.aBoolean243 = true;
						for (@Pc(36) int local36 = local16; local36 < this.anInt898; local36++) {
							this.aStringArray9[local36] = this.aStringArray9[local36 + 1];
							this.anIntArray258[local36] = this.anIntArray258[local36 + 1];
							this.aLongArray3[local36] = this.aLongArray3[local36 + 1];
						}
						this.aClass2_Sub1_Sub4_6.method83(188);
						this.aClass2_Sub1_Sub4_6.method90(arg0);
						return;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("46518, " + arg0 + ", " + 37 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!LUAMUNXO;I)Z")
	private boolean method684(@OriginalArg(0) Class21 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt401;
			if (this.anInt899 == 2) {
				if (local4 == 201) {
					this.aBoolean226 = true;
					this.anInt996 = 0;
					this.aBoolean253 = true;
					this.aString25 = "";
					this.anInt1023 = 1;
					this.aString29 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean226 = true;
					this.anInt996 = 0;
					this.aBoolean253 = true;
					this.aString25 = "";
					this.anInt1023 = 2;
					this.aString29 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt835 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean226 = true;
				this.anInt996 = 0;
				this.aBoolean253 = true;
				this.aString25 = "";
				this.anInt1023 = 4;
				this.aString29 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean226 = true;
				this.anInt996 = 0;
				this.aBoolean253 = true;
				this.aString25 = "";
				this.anInt1023 = 5;
				this.aString29 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray220[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class6.anInt106 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class6.anInt106) {
								local127 = 0;
							}
						}
						if (!Class6.aClass6Array1[local127].aBoolean24 && Class6.aClass6Array1[local127].anInt107 == local118 + (this.aBoolean240 ? 0 : 7)) {
							this.anIntArray220[local118] = local127;
							this.aBoolean245 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray255[local118];
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
				this.anIntArray255[local118] = local127;
				this.aBoolean245 = true;
			}
			if (local4 == 324 && !this.aBoolean240) {
				this.aBoolean240 = true;
				this.method641();
			}
			if (local4 == 325 && this.aBoolean240) {
				this.aBoolean240 = false;
				this.method641();
			}
			if (local4 == 326) {
				this.aClass2_Sub1_Sub4_6.method83(154);
				this.aClass2_Sub1_Sub4_6.method84(this.aBoolean240 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass2_Sub1_Sub4_6.method84(this.anIntArray220[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass2_Sub1_Sub4_6.method84(this.anIntArray255[local122]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean265 = !this.aBoolean265;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method706();
				if (this.aString24.length() > 0) {
					this.aClass2_Sub1_Sub4_6.method83(192);
					this.aClass2_Sub1_Sub4_6.method90(Class18.method206(this.aString24));
					this.aClass2_Sub1_Sub4_6.method84(local4 - 601);
					this.aClass2_Sub1_Sub4_6.method84(this.aBoolean265 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("11440, " + arg0 + ", " + -13938 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)Z")
	private boolean method685(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg1 < 0) {
				return false;
			}
			@Pc(18) int local18 = this.anIntArray248[arg1];
			if (local18 >= 2000) {
				local18 -= 2000;
			}
			return local18 == 723;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("33208, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method686() {
		try {
			if (this.anInt835 > 0) {
				this.method606();
			} else {
				if (this.aClass42_26 != null) {
					this.aClass42_26.method420();
					Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray252;
					this.aClass2_Sub1_Sub1_Sub2_3.method149(0, 257, "Connection lost", 144);
					this.aClass2_Sub1_Sub1_Sub2_3.method149(16777215, 256, "Connection lost", 143);
					this.aClass2_Sub1_Sub1_Sub2_3.method149(0, 257, "Please wait - attempting to reestablish", 159);
					this.aClass2_Sub1_Sub1_Sub2_3.method149(16777215, 256, "Please wait - attempting to reestablish", 158);
					this.aClass42_26.method421(4, 722, super.aGraphics2, 4);
				} else if (super.aClass42_2 != null) {
					super.aClass42_2.method420();
					Class2_Sub1_Sub1_Sub1.anIntArray7 = this.anIntArray253;
					this.aClass2_Sub1_Sub1_Sub2_3.method149(0, 383, "Connection lost", 464);
					this.aClass2_Sub1_Sub1_Sub2_3.method149(16777215, 382, "Connection lost", 463);
					this.aClass2_Sub1_Sub1_Sub2_3.method149(0, 383, "Please wait - attempting to reestablish", 479);
					this.aClass2_Sub1_Sub1_Sub2_3.method149(16777215, 382, "Please wait - attempting to reestablish", 478);
					super.aClass42_2.method421(0, 722, super.aGraphics2, 0);
				}
				this.anInt979 = 0;
				this.anInt964 = 0;
				@Pc(125) Class32 local125 = this.aClass32_1;
				this.aBoolean262 = false;
				this.anInt949 = 0;
				this.method602(this.aString22, this.aString23, true);
				if (!this.aBoolean262) {
					this.method606();
				}
				try {
					local125.method318();
				} catch (@Pc(148) Exception local148) {
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("9180, " + 43947 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method687() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray244[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray244[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray245[local54] = (this.anIntArray244[local54 - 1] + this.anIntArray244[local54 + 1] + this.anIntArray244[local54 - 128] + this.anIntArray244[local54 + 128]) / 4;
				}
			}
			this.anInt869 += 128;
			if (this.anInt869 > this.anIntArray221.length) {
				this.anInt869 -= this.anIntArray221.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method622(this.aClass2_Sub1_Sub1_Sub3Array4[local48], this.aBoolean254);
			}
			@Pc(167) int local167;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local167 = local54 + (local48 << 7);
					@Pc(190) int local190 = this.anIntArray245[local167 + 128] - this.anIntArray221[local167 + this.anInt869 & this.anIntArray221.length - 1] / 5;
					if (local190 < 0) {
						local190 = 0;
					}
					this.anIntArray244[local167] = local190;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray240[local54] = this.anIntArray240[local54 + 1];
			}
			this.anIntArray240[255] = (int) (Math.sin((double) anInt967 / 14.0D) * 16.0D + Math.sin((double) anInt967 / 15.0D) * 14.0D + Math.sin((double) anInt967 / 16.0D) * 12.0D);
			if (this.anInt935 > 0) {
				this.anInt935 -= 4;
			}
			if (this.anInt936 > 0) {
				this.anInt936 -= 4;
			}
			if (this.anInt935 == 0 && this.anInt936 == 0) {
				local167 = (int) (Math.random() * 2000.0D);
				if (local167 == 0) {
					this.anInt935 = 1024;
				}
				if (local167 == 1) {
					this.anInt936 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("56562, " + true + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method688(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt1043 >= 2 || this.anInt992 != 0 || this.anInt852 != 0) {
				@Pc(35) String local35;
				if (this.anInt992 == 1 && this.anInt1043 < 2) {
					local35 = "Use " + this.aString28 + " with...";
				} else if (this.anInt852 == 1 && this.anInt1043 < 2) {
					local35 = this.aString17 + "...";
				} else {
					local35 = this.aStringArray10[this.anInt1043 - 1];
				}
				if (this.anInt1043 > 2) {
					local35 = local35 + "@whi@ / " + (this.anInt1043 - 2) + " more options";
				}
				this.aClass2_Sub1_Sub1_Sub2_4.method158(4, local35, 15, anInt967 / 1000, 16777215);
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("65651, " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method689(@OriginalArg(1) int arg0) {
		try {
			Class21.method252(arg0);
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("68817, " + -10386 + ", " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V")
	private void method690(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		try {
			if (arg1 == 0 && this.anInt859 != -1) {
				this.aString19 = arg2;
				super.anInt812 = 0;
			}
			if (this.anInt1038 == -1) {
				this.aBoolean226 = true;
			}
			for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
				this.anIntArray241[local22] = this.anIntArray241[local22 - 1];
				this.aStringArray11[local22] = this.aStringArray11[local22 - 1];
				this.aStringArray12[local22] = this.aStringArray12[local22 - 1];
			}
			@Pc(62) boolean local62 = false;
			this.anIntArray241[0] = arg1;
			this.aStringArray11[0] = arg3;
			this.aStringArray12[0] = arg2;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("91164, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method691() {
		try {
			if (this.anInt931 == 2) {
				this.method678(this.anInt916 * 2, (this.anInt914 - this.anInt905 << 7) + this.anInt917, (this.anInt915 - this.anInt906 << 7) + this.anInt918);
				if (this.anInt860 > -1 && anInt967 % 20 < 10) {
					this.aClass2_Sub1_Sub1_Sub4Array4[0].method497(this.anInt860 - 12, this.anInt861 - 28);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("81378, " + false + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!LUAMUNXO;I)V")
	private void method692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class21 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt425 == 0 && arg2.anIntArray69 != null && (!arg2.aBoolean102 || this.anInt948 == arg2.anInt422 || this.anInt863 == arg2.anInt422 || this.anInt970 == arg2.anInt422)) {
				@Pc(29) int local29 = Class2_Sub1_Sub1.anInt692;
				@Pc(31) int local31 = Class2_Sub1_Sub1.anInt690;
				@Pc(33) int local33 = Class2_Sub1_Sub1.anInt693;
				@Pc(35) int local35 = Class2_Sub1_Sub1.anInt691;
				Class2_Sub1_Sub1.method482(arg3, arg0, arg0 + arg2.anInt436, arg3 + arg2.anInt424);
				@Pc(51) int local51 = arg2.anIntArray69.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg2.anIntArray71[local53] + arg3;
					@Pc(71) int local71 = arg2.anIntArray72[local53] + arg0 - arg1;
					@Pc(77) Class21 local77 = Class21.method256(arg2.anIntArray69[local53]);
					@Pc(82) int local82 = local62 + local77.anInt432;
					@Pc(87) int local87 = local71 + local77.anInt415;
					if (local77.anInt401 > 0) {
						this.method613(local77);
					}
					if (local77.anInt425 == 0) {
						if (local77.anInt419 > local77.anInt435 - local77.anInt436) {
							local77.anInt419 = local77.anInt435 - local77.anInt436;
						}
						if (local77.anInt419 < 0) {
							local77.anInt419 = 0;
						}
						this.method692(local87, local77.anInt419, local77, local82);
						if (local77.anInt435 > local77.anInt436) {
							this.method665(local77.anInt435, local77.anInt419, local87, local77.anInt436, local82 + local77.anInt424);
						}
					} else if (local77.anInt425 != 1) {
						@Pc(159) int local159;
						@Pc(163) int local163;
						@Pc(174) int local174;
						@Pc(209) int local209;
						@Pc(216) int local216;
						@Pc(241) int local241;
						@Pc(157) int local157;
						@Pc(207) int local207;
						if (local77.anInt425 == 2) {
							local157 = 0;
							for (local159 = 0; local159 < local77.anInt436; local159++) {
								for (local163 = 0; local163 < local77.anInt424; local163++) {
									local174 = local82 + local163 * (local77.anInt402 + 32);
									@Pc(183) int local183 = local87 + local159 * (local77.anInt429 + 32);
									if (local157 < 20) {
										local174 += local77.anIntArray70[local157];
										local183 += local77.anIntArray68[local157];
									}
									if (local77.anIntArray66[local157] > 0) {
										local207 = 0;
										local209 = 0;
										local216 = local77.anIntArray66[local157] - 1;
										if (local174 > Class2_Sub1_Sub1.anInt692 - 32 && local174 < Class2_Sub1_Sub1.anInt693 && local183 > Class2_Sub1_Sub1.anInt690 - 32 && local183 < Class2_Sub1_Sub1.anInt691 || this.anInt952 != 0 && this.anInt951 == local157) {
											local241 = 0;
											if (this.anInt992 == 1 && this.anInt993 == local157 && this.anInt994 == local77.anInt422) {
												local241 = 16777215;
											}
											@Pc(265) Class2_Sub1_Sub1_Sub4 local265 = Class19.method223(local241, local216, local77.anIntArray74[local157]);
											if (local265 != null) {
												@Pc(344) int local344;
												if (this.anInt952 != 0 && this.anInt951 == local157 && this.anInt950 == local77.anInt422) {
													local207 = super.anInt807 - this.anInt953;
													local209 = super.anInt808 - this.anInt954;
													if (local207 < 5 && local207 > -5) {
														local207 = 0;
													}
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (this.anInt885 < 5) {
														local207 = 0;
														local209 = 0;
													}
													local265.method499(local174 + local207, local183 + local209);
													if (local183 + local209 < Class2_Sub1_Sub1.anInt690 && arg2.anInt419 > 0) {
														local344 = this.anInt850 * (Class2_Sub1_Sub1.anInt690 - local183 - local209) / 3;
														if (local344 > this.anInt850 * 10) {
															local344 = this.anInt850 * 10;
														}
														if (local344 > arg2.anInt419) {
															local344 = arg2.anInt419;
														}
														arg2.anInt419 -= local344;
														this.anInt954 += local344;
													}
													if (local183 + local209 + 32 > Class2_Sub1_Sub1.anInt691 && arg2.anInt419 < arg2.anInt435 - arg2.anInt436) {
														local344 = this.anInt850 * (local183 + local209 + 32 - Class2_Sub1_Sub1.anInt691) / 3;
														if (local344 > this.anInt850 * 10) {
															local344 = this.anInt850 * 10;
														}
														if (local344 > arg2.anInt435 - arg2.anInt436 - arg2.anInt419) {
															local344 = arg2.anInt435 - arg2.anInt436 - arg2.anInt419;
														}
														arg2.anInt419 += local344;
														this.anInt954 -= local344;
													}
												} else if (this.anInt1006 != 0 && this.anInt1005 == local157 && this.anInt1004 == local77.anInt422) {
													local265.method499(local174, local183);
												} else {
													local265.method497(local174, local183);
												}
												if (local265.anInt704 == 33 || local77.anIntArray74[local157] != 1) {
													local344 = local77.anIntArray74[local157];
													this.aClass2_Sub1_Sub1_Sub2_2.method153(local174 + local207 + 1, method705(local344), 0, 988, local183 + local209 + 10);
													this.aClass2_Sub1_Sub1_Sub2_2.method153(local174 + local207, method705(local344), 16776960, 988, local183 + local209 + 9);
												}
											}
										}
									} else if (local77.aClass2_Sub1_Sub1_Sub4Array2 != null && local157 < 20) {
										@Pc(533) Class2_Sub1_Sub1_Sub4 local533 = local77.aClass2_Sub1_Sub1_Sub4Array2[local157];
										if (local533 != null) {
											local533.method497(local174, local183);
										}
									}
									local157++;
								}
							}
						} else if (local77.anInt425 == 3) {
							@Pc(558) boolean local558 = false;
							if (this.anInt970 == local77.anInt422 || this.anInt863 == local77.anInt422 || this.anInt948 == local77.anInt422) {
								local558 = true;
							}
							if (this.method646(local77, (byte) 5)) {
								local157 = local77.anInt433;
								if (local558 && local77.anInt430 != 0) {
									local157 = local77.anInt430;
								}
							} else {
								local157 = local77.anInt412;
								if (local558 && local77.anInt416 != 0) {
									local157 = local77.anInt416;
								}
							}
							if (local77.aByte20 == 0) {
								if (local77.aBoolean94) {
									Class2_Sub1_Sub1.method485(local77.anInt436, local157, local82, local77.anInt424, this.aBoolean270, local87);
								} else {
									Class2_Sub1_Sub1.method486(local77.anInt436, this.anInt883, local82, local157, local77.anInt424, local87);
								}
							} else if (local77.aBoolean94) {
								Class2_Sub1_Sub1.method484(local77.anInt424, 256 - (local77.aByte20 & 0xFF), local77.anInt436, local82, local157, local87);
							} else {
								Class2_Sub1_Sub1.method487(local77.anInt424, local82, local87, 256 - (local77.aByte20 & 0xFF), local157, local77.anInt436);
							}
						} else {
							@Pc(678) Class2_Sub1_Sub1_Sub2 local678;
							@Pc(955) String local955;
							if (local77.anInt425 == 4) {
								local678 = local77.aClass2_Sub1_Sub1_Sub2_1;
								@Pc(681) String local681 = local77.aString11;
								@Pc(683) boolean local683 = false;
								if (this.anInt970 == local77.anInt422 || this.anInt863 == local77.anInt422 || this.anInt948 == local77.anInt422) {
									local683 = true;
								}
								if (this.method646(local77, (byte) 5)) {
									local159 = local77.anInt433;
									if (local683 && local77.anInt430 != 0) {
										local159 = local77.anInt430;
									}
									if (local77.aString9.length() > 0) {
										local681 = local77.aString9;
									}
								} else {
									local159 = local77.anInt412;
									if (local683 && local77.anInt416 != 0) {
										local159 = local77.anInt416;
									}
								}
								if (local77.anInt413 == 6 && this.aBoolean267) {
									local681 = "Please wait...";
									local159 = local77.anInt412;
								}
								if (Class2_Sub1_Sub1.anInt688 == 479) {
									if (local159 == 16776960) {
										local159 = 255;
									}
									if (local159 == 49152) {
										local159 = 16777215;
									}
								}
								local207 = local87 + local678.anInt188;
								while (local681.length() > 0) {
									if (local681.indexOf("%") != -1) {
										label383: while (true) {
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
																				break label383;
																			}
																			local681 = local681.substring(0, local209) + this.method643(this.method721(4, local77)) + local681.substring(local209 + 2);
																		}
																	}
																	local681 = local681.substring(0, local209) + this.method643(this.method721(3, local77)) + local681.substring(local209 + 2);
																}
															}
															local681 = local681.substring(0, local209) + this.method643(this.method721(2, local77)) + local681.substring(local209 + 2);
														}
													}
													local681 = local681.substring(0, local209) + this.method643(this.method721(1, local77)) + local681.substring(local209 + 2);
												}
											}
											local681 = local681.substring(0, local209) + this.method643(this.method721(0, local77)) + local681.substring(local209 + 2);
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
									if (local77.aBoolean99) {
										local678.method150(local955, local77.aBoolean100, local207, local159, local82 + local77.anInt424 / 2);
									} else {
										local678.method157(local82, local955, local77.aBoolean100, local207, local159);
									}
									local207 += local678.anInt188;
								}
							} else if (local77.anInt425 == 5) {
								@Pc(1016) Class2_Sub1_Sub1_Sub4 local1016;
								if (this.method646(local77, (byte) 5)) {
									local1016 = local77.aClass2_Sub1_Sub1_Sub4_1;
								} else {
									local1016 = local77.aClass2_Sub1_Sub1_Sub4_2;
								}
								if (local1016 != null) {
									local1016.method497(local82, local87);
								}
							} else if (local77.anInt425 == 6) {
								local157 = Class2_Sub1_Sub1_Sub1.anInt43;
								local159 = Class2_Sub1_Sub1_Sub1.anInt44;
								Class2_Sub1_Sub1_Sub1.anInt43 = local82 + local77.anInt424 / 2;
								Class2_Sub1_Sub1_Sub1.anInt44 = local87 + local77.anInt436 / 2;
								local163 = Class2_Sub1_Sub1_Sub1.anIntArray5[local77.anInt406] * local77.anInt405 >> 16;
								local174 = Class2_Sub1_Sub1_Sub1.anIntArray6[local77.anInt406] * local77.anInt405 >> 16;
								@Pc(1077) boolean local1077 = this.method646(local77, (byte) 5);
								if (local1077) {
									local207 = local77.anInt399;
								} else {
									local207 = local77.anInt398;
								}
								@Pc(1098) Class2_Sub1_Sub2_Sub5 local1098;
								if (local207 == -1) {
									local1098 = local77.method254(this.aBoolean269, -1, local1077, -1);
								} else {
									@Pc(1104) Class49 local1104 = Class49.aClass49Array1[local207];
									local1098 = local77.method254(this.aBoolean269, local1104.anIntArray206[local77.anInt421], local1077, local1104.anIntArray207[local77.anInt421]);
								}
								if (local1098 != null) {
									local1098.method404(local77.anInt407, 0, local77.anInt406, 0, local163, local174);
								}
								Class2_Sub1_Sub1_Sub1.anInt43 = local157;
								Class2_Sub1_Sub1_Sub1.anInt44 = local159;
							} else {
								if (local77.anInt425 == 7) {
									local678 = local77.aClass2_Sub1_Sub1_Sub2_1;
									local159 = 0;
									for (local163 = 0; local163 < local77.anInt436; local163++) {
										for (local174 = 0; local174 < local77.anInt424; local174++) {
											if (local77.anIntArray66[local159] > 0) {
												@Pc(1169) Class19 local1169 = Class19.method221(local77.anIntArray66[local159] - 1);
												@Pc(1172) String local1172 = local1169.aString7;
												if (local1169.aBoolean79 || local77.anIntArray74[local159] != 1) {
													local1172 = local1172 + " x" + method616(local77.anIntArray74[local159], (byte) 2);
												}
												local209 = local82 + local174 * (local77.anInt402 + 115);
												local216 = local87 + local163 * (local77.anInt429 + 12);
												if (local77.aBoolean99) {
													local678.method150(local1172, local77.aBoolean100, local216, local77.anInt412, local209 + local77.anInt424 / 2);
												} else {
													local678.method157(local209, local1172, local77.aBoolean100, local216, local77.anInt412);
												}
											}
											local159++;
										}
									}
								}
								if (local77.anInt425 == 8 && (this.anInt945 == local77.anInt422 || this.anInt845 == local77.anInt422 || this.anInt881 == local77.anInt422)) {
									local157 = 0;
									local159 = 0;
									@Pc(1282) Class2_Sub1_Sub1_Sub2 local1282 = this.aClass2_Sub1_Sub1_Sub2_3;
									@Pc(1285) String local1285 = local77.aString11;
									while (local1285.length() > 0) {
										local207 = local1285.indexOf("\\n");
										if (local207 == -1) {
											local955 = local1285;
											local1285 = "";
										} else {
											local955 = local1285.substring(0, local207);
											local1285 = local1285.substring(local207 + 2);
										}
										local209 = local1282.method151(local955);
										if (local209 > local157) {
											local157 = local209;
										}
										local159 += local1282.anInt188 + 1;
									}
									local157 += 6;
									local159 += 7;
									local207 = local82 + local77.anInt424 - local157 - 5;
									local209 = local87 + local77.anInt436 + 5;
									if (local207 < local82 + 5) {
										local207 = local82 + 5;
									}
									if (local207 + local157 > arg3 + arg2.anInt424) {
										local207 = arg3 + arg2.anInt424 - local157;
									}
									Class2_Sub1_Sub1.method485(local159, 16777120, local207, local157, this.aBoolean270, local209);
									Class2_Sub1_Sub1.method486(local159, this.anInt883, local207, 0, local157, local209);
									local1285 = local77.aString11;
									local216 = local209 + local1282.anInt188 + 2;
									while (local1285.length() > 0) {
										local241 = local1285.indexOf("\\n");
										if (local241 == -1) {
											local955 = local1285;
											local1285 = "";
										} else {
											local955 = local1285.substring(0, local241);
											local1285 = local1285.substring(local241 + 2);
										}
										local1282.method157(local207 + 3, local955, false, local216, 0);
										local216 += local1282.anInt188 + 1;
									}
								}
							}
						}
					}
				}
				Class2_Sub1_Sub1.method482(local29, local31, local35, local33);
			}
		} catch (@Pc(1468) RuntimeException local1468) {
			signlink.reporterror("23765, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1468.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(BI)V")
	private void method693(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class40.aClass40Array1[arg0].anInt576;
			if (local4 != 0) {
				@Pc(16) int local16 = this.anIntArray274[arg0];
				if (local4 == 1) {
					if (local16 == 1) {
						Class2_Sub1_Sub1_Sub1.method41(0.9D);
					}
					if (local16 == 2) {
						Class2_Sub1_Sub1_Sub1.method41(0.8D);
					}
					if (local16 == 3) {
						Class2_Sub1_Sub1_Sub1.method41(0.7D);
					}
					if (local16 == 4) {
						Class2_Sub1_Sub1_Sub1.method41(0.6D);
					}
					Class19.aClass37_3.method365();
					this.aBoolean246 = true;
				}
				if (local4 == 3) {
					@Pc(54) boolean local54 = this.aBoolean260;
					if (local16 == 0) {
						this.method637(0, this.aBoolean260);
						this.aBoolean260 = true;
					}
					if (local16 == 1) {
						this.method637(-400, this.aBoolean260);
						this.aBoolean260 = true;
					}
					if (local16 == 2) {
						this.method637(-800, this.aBoolean260);
						this.aBoolean260 = true;
					}
					if (local16 == 3) {
						this.method637(-1200, this.aBoolean260);
						this.aBoolean260 = true;
					}
					if (local16 == 4) {
						this.aBoolean260 = false;
					}
					if (this.aBoolean260 != local54 && !aBoolean236) {
						if (this.aBoolean260) {
							this.anInt827 = this.anInt884;
							this.aBoolean224 = true;
							this.aClass26_Sub1_1.method270(2, this.anInt827);
						} else {
							this.method651();
						}
						this.anInt1013 = 0;
					}
				}
				if (local4 == 4) {
					if (local16 == 0) {
						this.aBoolean261 = true;
						this.method696(0);
					}
					if (local16 == 1) {
						this.aBoolean261 = true;
						this.method696(-400);
					}
					if (local16 == 2) {
						this.aBoolean261 = true;
						this.method696(-800);
					}
					if (local16 == 3) {
						this.aBoolean261 = true;
						this.method696(-1200);
					}
					if (local16 == 4) {
						this.aBoolean261 = false;
					}
				}
				if (local4 == 5) {
					this.anInt910 = local16;
				}
				if (local4 == 6) {
					this.anInt913 = local16;
				}
				if (local4 == 8) {
					this.anInt929 = local16;
					this.aBoolean226 = true;
				}
				if (local4 == 9) {
					this.anInt1042 = local16;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("51643, " + 77 + ", " + arg0 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!DNRIFKTO;)V")
	private void method694(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			@Pc(6) int local6 = arg1.method105(8);
			@Pc(12) int local12;
			if (local6 < this.anInt1020) {
				for (local12 = local6; local12 < this.anInt1020; local12++) {
					this.anIntArray256[this.anInt972++] = this.anIntArray272[local12];
				}
			}
			if (local6 > this.anInt1020) {
				signlink.reporterror(this.aString22 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt1020 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(74) int local74 = this.anIntArray272[local12];
				@Pc(79) Class2_Sub1_Sub2_Sub1_Sub2 local79 = this.aClass2_Sub1_Sub2_Sub1_Sub2Array1[local74];
				@Pc(84) int local84 = arg1.method105(1);
				if (local84 == 0) {
					this.anIntArray272[this.anInt1020++] = local74;
					local79.anInt262 = anInt967;
				} else {
					@Pc(107) int local107 = arg1.method105(2);
					if (local107 == 0) {
						this.anIntArray272[this.anInt1020++] = local74;
						local79.anInt262 = anInt967;
						this.anIntArray273[this.anInt1021++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(168) int local168;
						if (local107 == 1) {
							this.anIntArray272[this.anInt1020++] = local74;
							local79.anInt262 = anInt967;
							local158 = arg1.method105(3);
							local79.method198(local158, false);
							local168 = arg1.method105(1);
							if (local168 == 1) {
								this.anIntArray273[this.anInt1021++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray272[this.anInt1020++] = local74;
							local79.anInt262 = anInt967;
							local158 = arg1.method105(3);
							local79.method198(local158, true);
							local168 = arg1.method105(3);
							local79.method198(local168, true);
							@Pc(226) int local226 = arg1.method105(1);
							if (local226 == 1) {
								this.anIntArray273[this.anInt1021++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray256[this.anInt972++] = local74;
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("30758, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method695() {
		try {
			if (this.anInt952 == 0) {
				@Pc(6) int local6 = super.anInt812;
				if (this.anInt852 == 1 && super.anInt813 >= 516 && super.anInt814 >= 160 && super.anInt813 <= 765 && super.anInt814 <= 205) {
					local6 = 0;
				}
				@Pc(40) int local40;
				@Pc(43) int local43;
				@Pc(119) int local119;
				if (this.aBoolean248) {
					if (local6 != 1) {
						local40 = super.anInt807;
						local43 = super.anInt808;
						if (this.anInt1007 == 0) {
							local40 -= 4;
							local43 -= 4;
						}
						if (this.anInt1007 == 1) {
							local40 -= 553;
							local43 -= 205;
						}
						if (this.anInt1007 == 2) {
							local40 -= 17;
							local43 -= 357;
						}
						if (local40 < this.anInt1008 - 10 || local40 > this.anInt1008 + this.anInt1010 + 10 || local43 < this.anInt1009 - 10 || local43 > this.anInt1009 + this.anInt1011 + 10) {
							this.aBoolean248 = false;
							if (this.anInt1007 == 1) {
								this.aBoolean243 = true;
							}
							if (this.anInt1007 == 2) {
								this.aBoolean226 = true;
							}
						}
					}
					if (local6 == 1) {
						local40 = this.anInt1008;
						local43 = this.anInt1009;
						local119 = this.anInt1010;
						@Pc(122) int local122 = super.anInt813;
						@Pc(125) int local125 = super.anInt814;
						if (this.anInt1007 == 0) {
							local122 -= 4;
							local125 -= 4;
						}
						if (this.anInt1007 == 1) {
							local122 -= 553;
							local125 -= 205;
						}
						if (this.anInt1007 == 2) {
							local122 -= 17;
							local125 -= 357;
						}
						@Pc(144) int local144 = -1;
						for (@Pc(146) int local146 = 0; local146 < this.anInt1043; local146++) {
							@Pc(161) int local161 = local43 + (this.anInt1043 - 1 - local146) * 15 + 31;
							if (local122 > local40 && local122 < local40 + local119 && local125 > local161 - 13 && local125 < local161 + 3) {
								local144 = local146;
							}
						}
						if (local144 != -1) {
							this.method600(local144);
						}
						this.aBoolean248 = false;
						if (this.anInt1007 == 1) {
							this.aBoolean243 = true;
						}
						if (this.anInt1007 == 2) {
							this.aBoolean226 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt1043 > 0) {
						local40 = this.anIntArray248[this.anInt1043 - 1];
						if (local40 == 959 || local40 == 433 || local40 == 18 || local40 == 601 || local40 == 511 || local40 == 871 || local40 == 164 || local40 == 137 || local40 == 503 || local40 == 914 || local40 == 711 || local40 == 1675) {
							local43 = this.anIntArray246[this.anInt1043 - 1];
							local119 = this.anIntArray247[this.anInt1043 - 1];
							@Pc(280) Class21 local280 = Class21.method256(local119);
							if (local280.aBoolean104 || local280.aBoolean101) {
								this.aBoolean242 = false;
								this.anInt885 = 0;
								this.anInt950 = local119;
								this.anInt951 = local43;
								this.anInt952 = 2;
								this.anInt953 = super.anInt813;
								this.anInt954 = super.anInt814;
								if (Class21.method256(local119).anInt418 == this.anInt1040) {
									this.anInt952 = 1;
								}
								if (Class21.method256(local119).anInt418 == this.anInt1038) {
									this.anInt952 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt910 == 1 || this.method685((byte) 9, this.anInt1043 - 1)) && this.anInt1043 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt1043 > 0) {
						this.method600(this.anInt1043 - 1);
					}
					if (local6 != 2 || this.anInt1043 <= 0) {
						return;
					}
					this.method592(this.aByte46);
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("58955, " + false + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method696(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1053 = arg0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("36197, " + -69 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!DNRIFKTO;)V")
	private void method697(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt1021; local3++) {
				@Pc(10) int local10 = this.anIntArray273[local3];
				@Pc(15) Class2_Sub1_Sub2_Sub1_Sub1 local15 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local10];
				@Pc(18) int local18 = arg1.method94();
				if ((local18 & 0x8) != 0) {
					local15.anInt275 = arg1.method96();
					local15.anInt276 = arg1.method119(this.aByte58);
				}
				@Pc(40) int local40;
				@Pc(44) int local44;
				if ((local18 & 0x1) != 0) {
					local40 = arg1.method111();
					local44 = arg1.method111();
					local15.method202(local44, local40, anInt967);
					local15.anInt244 = anInt967 + 300;
					local15.anInt245 = arg1.method112();
					local15.anInt246 = arg1.method112();
				}
				if ((local18 & 0x10) != 0) {
					local15.aClass14_1 = Class14.method192(arg1.method119(this.aByte58));
					local15.anInt259 = local15.aClass14_1.aByte14;
					local15.anInt274 = local15.aClass14_1.anInt222;
					local15.anInt247 = local15.aClass14_1.anInt228;
					local15.anInt248 = local15.aClass14_1.anInt224;
					local15.anInt249 = local15.aClass14_1.anInt225;
					local15.anInt250 = local15.aClass14_1.anInt236;
					local15.anInt257 = local15.aClass14_1.anInt234;
				}
				if ((local18 & 0x2) != 0) {
					local15.anInt251 = arg1.method121();
					local40 = arg1.method129();
					local15.anInt255 = local40 >> 16;
					local15.anInt254 = anInt967 + (local40 & 0xFFFF);
					local15.anInt252 = 0;
					local15.anInt253 = 0;
					if (local15.anInt254 > anInt967) {
						local15.anInt252 = -1;
					}
					if (local15.anInt251 == 65535) {
						local15.anInt251 = -1;
					}
				}
				if ((local18 & 0x80) != 0) {
					local40 = arg1.method113();
					local44 = arg1.method94();
					local15.method202(local44, local40, anInt967);
					local15.anInt244 = anInt967 + 300;
					local15.anInt245 = arg1.method111();
					local15.anInt246 = arg1.method112();
				}
				if ((local18 & 0x20) != 0) {
					local15.aString5 = arg1.method101();
					local15.anInt263 = 100;
				}
				if ((local18 & 0x4) != 0) {
					local15.anInt260 = arg1.method96();
					if (local15.anInt260 == 65535) {
						local15.anInt260 = -1;
					}
				}
				if ((local18 & 0x40) != 0) {
					local40 = arg1.method120();
					if (local40 == 65535) {
						local40 = -1;
					}
					local44 = arg1.method111();
					if (local40 == local15.anInt277 && local40 != -1) {
						@Pc(243) int local243 = Class49.aClass49Array1[local40].anInt775;
						if (local243 == 1) {
							local15.anInt278 = 0;
							local15.anInt279 = 0;
							local15.anInt280 = local44;
							local15.anInt281 = 0;
						}
						if (local243 == 2) {
							local15.anInt281 = 0;
						}
					} else if (local40 == -1 || local15.anInt277 == -1 || Class49.aClass49Array1[local40].anInt769 >= Class49.aClass49Array1[local15.anInt277].anInt769) {
						local15.anInt277 = local40;
						local15.anInt278 = 0;
						local15.anInt279 = 0;
						local15.anInt280 = local44;
						local15.anInt281 = 0;
						local15.anInt282 = local15.anInt272;
					}
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("69236, " + arg0 + ", " + -441 + ", " + arg1 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method698() {
		try {
			if (this.aByte55 != 6) {
				this.aClass48ArrayArrayArray1 = null;
			}
			if (super.anInt812 == 1) {
				if (super.anInt813 >= 6 && super.anInt813 <= 106 && super.anInt814 >= 467 && super.anInt814 <= 499) {
					this.anInt1029 = (this.anInt1029 + 1) % 4;
					this.aBoolean237 = true;
					this.aBoolean226 = true;
					this.aClass2_Sub1_Sub4_6.method83(235);
					this.aClass2_Sub1_Sub4_6.method84(this.anInt1029);
					this.aClass2_Sub1_Sub4_6.method84(this.anInt939);
					this.aClass2_Sub1_Sub4_6.method84(this.anInt969);
				}
				if (super.anInt813 >= 135 && super.anInt813 <= 235 && super.anInt814 >= 467 && super.anInt814 <= 499) {
					this.anInt939 = (this.anInt939 + 1) % 3;
					this.aBoolean237 = true;
					this.aBoolean226 = true;
					this.aClass2_Sub1_Sub4_6.method83(235);
					this.aClass2_Sub1_Sub4_6.method84(this.anInt1029);
					this.aClass2_Sub1_Sub4_6.method84(this.anInt939);
					this.aClass2_Sub1_Sub4_6.method84(this.anInt969);
				}
				if (super.anInt813 >= 273 && super.anInt813 <= 373 && super.anInt814 >= 467 && super.anInt814 <= 499) {
					this.anInt969 = (this.anInt969 + 1) % 3;
					this.aBoolean237 = true;
					this.aBoolean226 = true;
					this.aClass2_Sub1_Sub4_6.method83(235);
					this.aClass2_Sub1_Sub4_6.method84(this.anInt1029);
					this.aClass2_Sub1_Sub4_6.method84(this.anInt939);
					this.aClass2_Sub1_Sub4_6.method84(this.anInt969);
				}
				if (super.anInt813 >= 412 && super.anInt813 <= 512 && super.anInt814 >= 467 && super.anInt814 <= 499) {
					if (this.anInt1040 == -1) {
						this.method706();
						this.aString24 = "";
						this.aBoolean265 = false;
						this.anInt997 = this.anInt1040 = Class21.anInt434;
						return;
					}
					this.method690((byte) 3, 0, "Please close the interface you have open before using 'report abuse'", "");
					return;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("97325, " + 6 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method699(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method700() {
		try {
			anInt873++;
			@Pc(29) int local29;
			if (anInt873 > 1849) {
				anInt873 = 0;
				this.aClass2_Sub1_Sub4_6.method83(131);
				this.aClass2_Sub1_Sub4_6.method84(0);
				local29 = this.aClass2_Sub1_Sub4_6.anInt166;
				this.aClass2_Sub1_Sub4_6.method85(2104);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass2_Sub1_Sub4_6.method84(178);
				}
				this.aClass2_Sub1_Sub4_6.method84(92);
				this.aClass2_Sub1_Sub4_6.method85(12175);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass2_Sub1_Sub4_6.method84(56);
				}
				this.aClass2_Sub1_Sub4_6.method84(255);
				this.aClass2_Sub1_Sub4_6.method85(19906);
				this.aClass2_Sub1_Sub4_6.method85(49688);
				this.aClass2_Sub1_Sub4_6.method85(30019);
				this.aClass2_Sub1_Sub4_6.method84(185);
				this.aClass2_Sub1_Sub4_6.method93(this.aClass2_Sub1_Sub4_6.anInt166 - local29);
			}
			while (true) {
				do {
					while (true) {
						local29 = this.method577();
						if (local29 == -1) {
							return;
						}
						if (this.anInt1040 != -1 && this.anInt1040 == this.anInt997) {
							if (local29 == 8 && this.aString24.length() > 0) {
								this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
							}
							break;
						}
						@Pc(272) int local272;
						if (this.aBoolean253) {
							if (local29 >= 32 && local29 <= 122 && this.aString25.length() < 80) {
								this.aString25 = this.aString25 + (char) local29;
								this.aBoolean226 = true;
							}
							if (local29 == 8 && this.aString25.length() > 0) {
								this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
								this.aBoolean226 = true;
							}
							if (local29 == 13 || local29 == 10) {
								this.aBoolean253 = false;
								this.aBoolean226 = true;
								@Pc(232) long local232;
								if (this.anInt1023 == 1) {
									local232 = Class18.method206(this.aString25);
									this.method715(local232);
								}
								if (this.anInt1023 == 2 && this.anInt898 > 0) {
									local232 = Class18.method206(this.aString25);
									this.method683(local232);
								}
								if (this.anInt1023 == 3 && this.aString25.length() > 0) {
									this.aClass2_Sub1_Sub4_6.method83(191);
									this.aClass2_Sub1_Sub4_6.method84(0);
									local272 = this.aClass2_Sub1_Sub4_6.anInt166;
									this.aClass2_Sub1_Sub4_6.method90(this.aLong33);
									Class36.method361(this.aString25, this.aClass2_Sub1_Sub4_6);
									this.aClass2_Sub1_Sub4_6.method93(this.aClass2_Sub1_Sub4_6.anInt166 - local272);
									this.aString25 = Class36.method362(this.aString25);
									this.aString25 = Class44.method437(this.aString25);
									this.method690((byte) 3, 6, this.aString25, Class18.method210(Class18.method207(this.aBoolean255, this.aLong33)));
									if (this.anInt939 == 2) {
										this.anInt939 = 1;
										this.aBoolean237 = true;
										this.aClass2_Sub1_Sub4_6.method83(235);
										this.aClass2_Sub1_Sub4_6.method84(this.anInt1029);
										this.aClass2_Sub1_Sub4_6.method84(this.anInt939);
										this.aClass2_Sub1_Sub4_6.method84(this.anInt969);
									}
								}
								if (this.anInt1023 == 4 && this.anInt820 < 100) {
									local232 = Class18.method206(this.aString25);
									this.method675(local232);
								}
								if (this.anInt1023 == 5 && this.anInt820 > 0) {
									local232 = Class18.method206(this.aString25);
									this.method629(local232);
								}
							}
						} else if (this.anInt996 == 1) {
							if (local29 >= 48 && local29 <= 57 && this.aString21.length() < 10) {
								this.aString21 = this.aString21 + (char) local29;
								this.aBoolean226 = true;
							}
							if (local29 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
								this.aBoolean226 = true;
							}
							if (local29 == 13 || local29 == 10) {
								if (this.aString21.length() > 0) {
									local272 = 0;
									try {
										local272 = Integer.parseInt(this.aString21);
									} catch (@Pc(450) Exception local450) {
									}
									this.aClass2_Sub1_Sub4_6.method83(102);
									this.aClass2_Sub1_Sub4_6.method88(local272);
								}
								this.anInt996 = 0;
								this.aBoolean226 = true;
							}
						} else if (this.anInt996 == 2) {
							if (local29 >= 32 && local29 <= 122 && this.aString21.length() < 12) {
								this.aString21 = this.aString21 + (char) local29;
								this.aBoolean226 = true;
							}
							if (local29 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
								this.aBoolean226 = true;
							}
							if (local29 == 13 || local29 == 10) {
								if (this.aString21.length() > 0) {
									this.aClass2_Sub1_Sub4_6.method83(236);
									this.aClass2_Sub1_Sub4_6.method90(Class18.method206(this.aString21));
								}
								this.anInt996 = 0;
								this.aBoolean226 = true;
							}
						} else if (this.anInt1038 == -1) {
							if (local29 >= 32 && local29 <= 122 && this.aString30.length() < 80) {
								this.aString30 = this.aString30 + (char) local29;
								this.aBoolean226 = true;
							}
							if (local29 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
								this.aBoolean226 = true;
							}
							if ((local29 == 13 || local29 == 10) && this.aString30.length() > 0) {
								if (this.anInt1027 == 2) {
									if (this.aString30.equals("::clientdrop")) {
										this.method686();
									}
									if (this.aString30.equals("::lag")) {
										this.method631();
									}
									if (this.aString30.equals("::prefetchmusic")) {
										for (local272 = 0; local272 < this.aClass26_Sub1_1.method283(2); local272++) {
											this.aClass26_Sub1_1.method274(2, (byte) 1, 212, local272);
										}
									}
									if (this.aString30.equals("::fpson")) {
										aBoolean223 = true;
									}
									if (this.aString30.equals("::fpsoff")) {
										aBoolean223 = false;
									}
									if (this.aString30.equals("::noclip")) {
										for (local272 = 0; local272 < 4; local272++) {
											for (@Pc(678) int local678 = 1; local678 < 103; local678++) {
												for (@Pc(682) int local682 = 1; local682 < 103; local682++) {
													this.aClass45Array1[local272].anIntArrayArray16[local678][local682] = 0;
												}
											}
										}
									}
								}
								if (this.aString30.startsWith("::")) {
									this.aClass2_Sub1_Sub4_6.method83(255);
									this.aClass2_Sub1_Sub4_6.method84(this.aString30.length() - 1);
									this.aClass2_Sub1_Sub4_6.method91(this.aString30.substring(2));
								} else {
									@Pc(737) String local737 = this.aString30.toLowerCase();
									@Pc(739) byte local739 = 0;
									if (local737.startsWith("yellow:")) {
										local739 = 0;
										this.aString30 = this.aString30.substring(7);
									} else if (local737.startsWith("red:")) {
										local739 = 1;
										this.aString30 = this.aString30.substring(4);
									} else if (local737.startsWith("green:")) {
										local739 = 2;
										this.aString30 = this.aString30.substring(6);
									} else if (local737.startsWith("cyan:")) {
										local739 = 3;
										this.aString30 = this.aString30.substring(5);
									} else if (local737.startsWith("purple:")) {
										local739 = 4;
										this.aString30 = this.aString30.substring(7);
									} else if (local737.startsWith("white:")) {
										local739 = 5;
										this.aString30 = this.aString30.substring(6);
									} else if (local737.startsWith("flash1:")) {
										local739 = 6;
										this.aString30 = this.aString30.substring(7);
									} else if (local737.startsWith("flash2:")) {
										local739 = 7;
										this.aString30 = this.aString30.substring(7);
									} else if (local737.startsWith("flash3:")) {
										local739 = 8;
										this.aString30 = this.aString30.substring(7);
									} else if (local737.startsWith("glow1:")) {
										local739 = 9;
										this.aString30 = this.aString30.substring(6);
									} else if (local737.startsWith("glow2:")) {
										local739 = 10;
										this.aString30 = this.aString30.substring(6);
									} else if (local737.startsWith("glow3:")) {
										local739 = 11;
										this.aString30 = this.aString30.substring(6);
									}
									local737 = this.aString30.toLowerCase();
									@Pc(911) byte local911 = 0;
									if (local737.startsWith("wave:")) {
										local911 = 1;
										this.aString30 = this.aString30.substring(5);
									} else if (local737.startsWith("wave2:")) {
										local911 = 2;
										this.aString30 = this.aString30.substring(6);
									} else if (local737.startsWith("shake:")) {
										local911 = 3;
										this.aString30 = this.aString30.substring(6);
									} else if (local737.startsWith("scroll:")) {
										local911 = 4;
										this.aString30 = this.aString30.substring(7);
									} else if (local737.startsWith("slide:")) {
										local911 = 5;
										this.aString30 = this.aString30.substring(6);
									}
									this.aClass2_Sub1_Sub4_6.method83(115);
									this.aClass2_Sub1_Sub4_6.method84(0);
									@Pc(992) int local992 = this.aClass2_Sub1_Sub4_6.anInt166;
									this.aClass2_Sub1_Sub4_6.method110(local739);
									this.aClass2_Sub1_Sub4_7.anInt166 = 0;
									Class36.method361(this.aString30, this.aClass2_Sub1_Sub4_7);
									this.aClass2_Sub1_Sub4_6.method130(this.aClass2_Sub1_Sub4_7.anInt166, this.aClass2_Sub1_Sub4_7.aByteArray2, 368);
									this.aClass2_Sub1_Sub4_6.method110(local911);
									this.aClass2_Sub1_Sub4_6.method93(this.aClass2_Sub1_Sub4_6.anInt166 - local992);
									this.aString30 = Class36.method362(this.aString30);
									this.aString30 = Class44.method437(this.aString30);
									aClass2_Sub1_Sub2_Sub1_Sub2_1.aString5 = this.aString30;
									aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt256 = local739;
									aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt261 = local911;
									aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt263 = 150;
									if (this.anInt1027 == 2) {
										this.method690((byte) 3, 2, aClass2_Sub1_Sub2_Sub1_Sub2_1.aString5, "@cr2@" + aClass2_Sub1_Sub2_Sub1_Sub2_1.aString6);
									} else if (this.anInt1027 == 1) {
										this.method690((byte) 3, 2, aClass2_Sub1_Sub2_Sub1_Sub2_1.aString5, "@cr1@" + aClass2_Sub1_Sub2_Sub1_Sub2_1.aString6);
									} else {
										this.method690((byte) 3, 2, aClass2_Sub1_Sub2_Sub1_Sub2_1.aString5, aClass2_Sub1_Sub2_Sub1_Sub2_1.aString6);
									}
									if (this.anInt1029 == 2) {
										this.anInt1029 = 3;
										this.aBoolean237 = true;
										this.aClass2_Sub1_Sub4_6.method83(235);
										this.aClass2_Sub1_Sub4_6.method84(this.anInt1029);
										this.aClass2_Sub1_Sub4_6.method84(this.anInt939);
										this.aClass2_Sub1_Sub4_6.method84(this.anInt969);
									}
								}
								this.aString30 = "";
								this.aBoolean226 = true;
							}
						}
					}
				} while ((local29 < 97 || local29 > 122) && (local29 < 65 || local29 > 90) && (local29 < 48 || local29 > 57) && local29 != 32);
				if (this.aString24.length() < 12) {
					this.aString24 = this.aString24 + (char) local29;
				}
			}
		} catch (@Pc(1145) RuntimeException local1145) {
			signlink.reporterror("82311, " + 4 + ", " + local1145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method701() {
		try {
			if (this.anInt1030 == 2) {
				for (@Pc(15) Class2_Sub3 local15 = (Class2_Sub3) this.aClass48_10.method565(); local15 != null; local15 = (Class2_Sub3) this.aClass48_10.method567()) {
					if (local15.anInt709 > 0) {
						local15.anInt709--;
					}
					if (local15.anInt709 != 0) {
						if (local15.anInt710 > 0) {
							local15.anInt710--;
						}
						if (local15.anInt710 == 0 && local15.anInt713 >= 1 && local15.anInt714 >= 1 && local15.anInt713 <= 102 && local15.anInt714 <= 102 && (local15.anInt715 < 0 || Class31.method310(local15.anInt717, local15.anInt715))) {
							this.method623(local15.anInt717, local15.anInt713, local15.anInt712, local15.anInt716, local15.anInt711, local15.anInt714, local15.anInt715);
							local15.anInt710 = -1;
							if (local15.anInt715 == local15.anInt706 && local15.anInt706 == -1) {
								local15.method558();
							} else if (local15.anInt715 == local15.anInt706 && local15.anInt716 == local15.anInt707 && local15.anInt717 == local15.anInt708) {
								local15.method558();
							}
						}
					} else if (local15.anInt706 < 0 || Class31.method310(local15.anInt708, local15.anInt706)) {
						this.method623(local15.anInt708, local15.anInt713, local15.anInt712, local15.anInt707, local15.anInt711, local15.anInt714, local15.anInt706);
						local15.method558();
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("23582, " + 72 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!XANVNPIN;B)V")
	private void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub1_Sub4 arg2) {
		try {
			@Pc(11) int local11 = arg1 * arg1 + arg0 * arg0;
			if (local11 > 4225 && local11 < 90000) {
				@Pc(25) int local25 = this.anInt865 + this.anInt974 & 0x7FF;
				@Pc(29) int local29 = Class2_Sub1_Sub2_Sub5.anIntArray158[local25];
				@Pc(33) int local33 = Class2_Sub1_Sub2_Sub5.anIntArray159[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt1015 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt1015 + 256);
				@Pc(61) int local61 = arg0 * local42 + arg1 * local51 >> 16;
				@Pc(71) int local71 = arg0 * local51 - arg1 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass2_Sub1_Sub1_Sub4_16.method502(local83 + 94 + 4 - 10, 83 - local89 - 20, local77);
			} else {
				this.method635(arg2, arg0, arg1);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("3137, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -59 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)V")
	private void method704() {
		try {
			if (this.aByte42 == 4) {
				try {
					@Pc(12) int local12 = aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 + this.anInt889;
					@Pc(18) int local18 = aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 + this.anInt842;
					if (this.anInt984 - local12 < -500 || this.anInt984 - local12 > 500 || this.anInt985 - local18 < -500 || this.anInt985 - local18 > 500) {
						this.anInt984 = local12;
						this.anInt985 = local18;
					}
					if (this.anInt984 != local12) {
						this.anInt984 += (local12 - this.anInt984) / 16;
					}
					if (this.anInt985 != local18) {
						this.anInt985 += (local18 - this.anInt985) / 16;
					}
					if (super.anIntArray210[1] == 1) {
						this.anInt866 += (-this.anInt866 - 24) / 2;
					} else if (super.anIntArray210[2] == 1) {
						this.anInt866 += (24 - this.anInt866) / 2;
					} else {
						this.anInt866 /= 2;
					}
					if (super.anIntArray210[3] == 1) {
						this.anInt867 += (12 - this.anInt867) / 2;
					} else if (super.anIntArray210[4] == 1) {
						this.anInt867 += (-this.anInt867 - 12) / 2;
					} else {
						this.anInt867 /= 2;
					}
					this.anInt865 = this.anInt865 + this.anInt866 / 2 & 0x7FF;
					this.anInt864 += this.anInt867 / 2;
					if (this.anInt864 < 128) {
						this.anInt864 = 128;
					}
					if (this.anInt864 > 383) {
						this.anInt864 = 383;
					}
					@Pc(205) int local205 = this.anInt984 >> 7;
					@Pc(210) int local210 = this.anInt985 >> 7;
					@Pc(220) int local220 = this.method640(this.anInt909, this.anInt984, this.anInt985);
					@Pc(222) int local222 = 0;
					@Pc(238) int local238;
					if (local205 > 3 && local210 > 3 && local205 < 100 && local210 < 100) {
						for (local238 = local205 - 4; local238 <= local205 + 4; local238++) {
							for (@Pc(244) int local244 = local210 - 4; local244 <= local210 + 4; local244++) {
								@Pc(249) int local249 = this.anInt909;
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
					if (local238 > this.anInt872) {
						this.anInt872 += (local238 - this.anInt872) / 24;
					} else if (local238 < this.anInt872) {
						this.anInt872 += (local238 - this.anInt872) / 80;
					}
				} catch (@Pc(340) Exception local340) {
					signlink.reporterror("glfc_ex " + aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 + "," + aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 + "," + this.anInt984 + "," + this.anInt985 + "," + this.anInt932 + "," + this.anInt933 + "," + this.anInt905 + "," + this.anInt906);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(390) RuntimeException local390) {
			signlink.reporterror("54307, " + 4 + ", " + local390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method706() {
		try {
			this.aClass2_Sub1_Sub4_6.method83(36);
			if (this.anInt919 != -1) {
				this.method689(this.anInt919);
				this.anInt919 = -1;
				this.aBoolean243 = true;
				this.aBoolean267 = false;
				this.aBoolean230 = true;
			}
			if (this.anInt1038 != -1) {
				this.method689(this.anInt1038);
				this.anInt1038 = -1;
				this.aBoolean226 = true;
				this.aBoolean267 = false;
			}
			if (this.anInt1037 != -1) {
				this.method689(this.anInt1037);
				this.anInt1037 = -1;
				this.aBoolean246 = true;
			}
			if (this.anInt1040 != -1) {
				this.method689(this.anInt1040);
				this.anInt1040 = -1;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("83298, " + -21279 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)I")
	private int method707() {
		try {
			@Pc(8) int local8 = 3;
			if (this.anInt926 < 310) {
				@Pc(17) int local17 = this.anInt923 >> 7;
				@Pc(22) int local22 = this.anInt925 >> 7;
				@Pc(27) int local27 = aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 >> 7;
				@Pc(32) int local32 = aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt909][local17][local22] & 0x4) != 0) {
					local8 = this.anInt909;
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
						if ((this.aByteArrayArrayArray8[this.anInt909][local17][local22] & 0x4) != 0) {
							local8 = this.anInt909;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt909][local17][local22] & 0x4) != 0) {
								local8 = this.anInt909;
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
						if ((this.aByteArrayArrayArray8[this.anInt909][local17][local22] & 0x4) != 0) {
							local8 = this.anInt909;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt909][local17][local22] & 0x4) != 0) {
								local8 = this.anInt909;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt909][aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 >> 7][aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 >> 7] & 0x4) != 0) {
				local8 = this.anInt909;
			}
			return local8;
		} catch (@Pc(249) RuntimeException local249) {
			signlink.reporterror("12223, " + 17835 + ", " + local249.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(B)I")
	private int method708() {
		try {
			@Pc(15) int local15 = this.method640(this.anInt909, this.anInt923, this.anInt925);
			return local15 - this.anInt924 >= 800 || (this.aByteArrayArrayArray8[this.anInt909][this.anInt923 >> 7][this.anInt925 >> 7] & 0x4) == 0 ? 3 : this.anInt909;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("29901, " + 46 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!DNRIFKTO;)V")
	private void method709(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class2_Sub1_Sub4 arg2) {
		try {
			while (true) {
				if (arg2.anInt167 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg2.method105(14);
					if (local12 != 16383) {
						if (this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local12] == null) {
							this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local12] = new Class2_Sub1_Sub2_Sub1_Sub1();
						}
						@Pc(32) Class2_Sub1_Sub2_Sub1_Sub1 local32 = this.aClass2_Sub1_Sub2_Sub1_Sub1Array1[local12];
						this.anIntArray236[this.anInt901++] = local12;
						local32.anInt262 = anInt967;
						@Pc(51) int local51 = arg2.method105(5);
						if (local51 > 15) {
							local51 -= 32;
						}
						@Pc(60) int local60 = arg2.method105(1);
						if (local60 == 1) {
							this.anIntArray273[this.anInt1021++] = local12;
						}
						@Pc(79) int local79 = arg2.method105(1);
						@Pc(84) int local84 = arg2.method105(5);
						if (local84 > 15) {
							local84 -= 32;
						}
						local32.aClass14_1 = Class14.method192(arg2.method105(12));
						local32.anInt259 = local32.aClass14_1.aByte14;
						local32.anInt274 = local32.aClass14_1.anInt222;
						local32.anInt247 = local32.aClass14_1.anInt228;
						local32.anInt248 = local32.aClass14_1.anInt224;
						local32.anInt249 = local32.aClass14_1.anInt225;
						local32.anInt250 = local32.aClass14_1.anInt236;
						local32.anInt257 = local32.aClass14_1.anInt234;
						local32.method201(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0] + local84, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0] + local51, local79 == 1);
						continue;
					}
				}
				arg2.method106();
				@Pc(161) boolean local161 = false;
				return;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("13815, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray12[local3] != null) {
					@Pc(15) int local15 = this.anIntArray241[local3];
					@Pc(26) int local26 = this.anInt983 + 70 + 4 - local1 * 14;
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
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt1029 == 0 || this.anInt1029 == 1 && this.method653(local34, (byte) 4))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass2_Sub1_Sub2_Sub1_Sub2_1.aString6)) {
							if (this.anInt1027 >= 1) {
								this.aStringArray10[this.anInt1043] = "Report abuse @whi@" + local34;
								this.anIntArray248[this.anInt1043] = 208;
								this.anInt1043++;
							}
							this.aStringArray10[this.anInt1043] = "Add ignore @whi@" + local34;
							this.anIntArray248[this.anInt1043] = 64;
							this.anInt1043++;
							this.aStringArray10[this.anInt1043] = "Add friend @whi@" + local34;
							this.anIntArray248[this.anInt1043] = 723;
							this.anInt1043++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt929 == 0 && (local15 == 7 || this.anInt939 == 0 || this.anInt939 == 1 && this.method653(local34, (byte) 4))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt1027 >= 1) {
								this.aStringArray10[this.anInt1043] = "Report abuse @whi@" + local34;
								this.anIntArray248[this.anInt1043] = 208;
								this.anInt1043++;
							}
							this.aStringArray10[this.anInt1043] = "Add ignore @whi@" + local34;
							this.anIntArray248[this.anInt1043] = 64;
							this.anInt1043++;
							this.aStringArray10[this.anInt1043] = "Add friend @whi@" + local34;
							this.anIntArray248[this.anInt1043] = 723;
							this.anInt1043++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt969 == 0 || this.anInt969 == 1 && this.method653(local34, (byte) 4))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt1043] = "Accept trade @whi@" + local34;
							this.anIntArray248[this.anInt1043] = 65;
							this.anInt1043++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt929 == 0 && this.anInt939 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt969 == 0 || this.anInt969 == 1 && this.method653(local34, (byte) 4))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt1043] = "Accept challenge @whi@" + local34;
							this.anIntArray248[this.anInt1043] = 426;
							this.anInt1043++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("6465, " + arg0 + ", " + arg1 + ", " + false + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)Ljava/lang/String;")
	private String method711() {
		try {
			this.anInt831 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("14637, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method712() {
		try {
			@Pc(10) byte[] local10 = this.aClass8_2.method165("title.dat", null);
			@Pc(16) Class2_Sub1_Sub1_Sub4 local16 = new Class2_Sub1_Sub1_Sub4(local10, this);
			this.aClass42_18.method420();
			local16.method495(0, 0);
			this.aClass42_19.method420();
			local16.method495(-637, 0);
			this.aClass42_15.method420();
			local16.method495(-128, 0);
			this.aClass42_16.method420();
			local16.method495(-202, -371);
			this.aClass42_17.method420();
			local16.method495(-202, -171);
			this.aClass42_20.method420();
			local16.method495(0, -265);
			this.aClass42_21.method420();
			local16.method495(-562, -265);
			this.aClass42_22.method420();
			local16.method495(-128, -171);
			this.aClass42_23.method420();
			local16.method495(-562, -171);
			@Pc(101) int[] local101 = new int[local16.anInt700];
			for (@Pc(103) int local103 = 0; local103 < local16.anInt701; local103++) {
				for (@Pc(107) int local107 = 0; local107 < local16.anInt700; local107++) {
					local101[local107] = local16.anIntArray190[local16.anInt700 + local16.anInt700 * local103 - local107 - 1];
				}
				for (@Pc(133) int local133 = 0; local133 < local16.anInt700; local133++) {
					local16.anIntArray190[local133 + local16.anInt700 * local103] = local101[local133];
				}
			}
			this.aClass42_18.method420();
			local16.method495(382, 0);
			this.aClass42_19.method420();
			local16.method495(-255, 0);
			this.aClass42_15.method420();
			local16.method495(254, 0);
			this.aClass42_16.method420();
			local16.method495(180, -371);
			this.aClass42_17.method420();
			local16.method495(180, -171);
			this.aClass42_20.method420();
			local16.method495(382, -265);
			this.aClass42_21.method420();
			local16.method495(-180, -265);
			this.aClass42_22.method420();
			local16.method495(254, -171);
			this.aClass42_23.method420();
			local16.method495(-180, -171);
			local16 = new Class2_Sub1_Sub1_Sub4(this.aClass8_2, "logo", 0);
			this.aClass42_15.method420();
			local16.method497(382 - local16.anInt700 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(271) RuntimeException local271) {
			signlink.reporterror("68997, " + false + ", " + local271.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass47_1.method533(arg4, arg0, arg1);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass47_1.method537(arg4, arg0, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg3;
				if (local8 > 0) {
					local30 = arg2;
				}
				@Pc(38) int[] local38 = this.aClass2_Sub1_Sub1_Sub4_10.anIntArray190;
				local52 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class41 local61 = Class41.method410(local58);
				if (local61.anInt619 == -1) {
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
					@Pc(71) Class2_Sub1_Sub1_Sub3 local71 = this.aClass2_Sub1_Sub1_Sub3Array5[local61.anInt619];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt611 * 4 - local71.anInt547) / 2;
						@Pc(93) int local93 = (local61.anInt610 * 4 - local71.anInt548) / 2;
						local71.method348(arg0 * 4 + local83 + 48, (104 - arg1 - local61.anInt610) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass47_1.method535(arg4, arg0, arg1);
			if (local8 != 0) {
				local18 = this.aClass47_1.method537(arg4, arg0, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class41 local447 = Class41.method410(local30);
				@Pc(479) int local479;
				if (local447.anInt619 != -1) {
					@Pc(457) Class2_Sub1_Sub1_Sub3 local457 = this.aClass2_Sub1_Sub1_Sub3Array5[local447.anInt619];
					if (local457 != null) {
						local58 = (local447.anInt611 * 4 - local457.anInt547) / 2;
						local479 = (local447.anInt610 * 4 - local457.anInt548) / 2;
						local457.method348(arg0 * 4 + local58 + 48, (104 - arg1 - local447.anInt610) * 4 + 48 + local479);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass2_Sub1_Sub1_Sub4_10.anIntArray190;
					local479 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local516[local479 + 1536] = local52;
						local516[local479 + 1024 + 1] = local52;
						local516[local479 + 512 + 2] = local52;
						local516[local479 + 3] = local52;
					} else {
						local516[local479] = local52;
						local516[local479 + 512 + 1] = local52;
						local516[local479 + 1024 + 2] = local52;
						local516[local479 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass47_1.method536(arg4, arg0, arg1);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(625) Class41 local625 = Class41.method410(local18);
				if (local625.anInt619 != -1) {
					@Pc(635) Class2_Sub1_Sub1_Sub3 local635 = this.aClass2_Sub1_Sub1_Sub3Array5[local625.anInt619];
					if (local635 != null) {
						local30 = (local625.anInt611 * 4 - local635.anInt547) / 2;
						@Pc(657) int local657 = (local625.anInt610 * 4 - local635.anInt548) / 2;
						local635.method348(arg0 * 4 + local30 + 48, (104 - arg1 - local625.anInt610) * 4 + 48 + local657);
						return;
					}
				}
			}
		} catch (@Pc(681) RuntimeException local681) {
			signlink.reporterror("33010, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local681.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean231) {
			this.method648();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method714() {
		try {
			if (this.anInt979 == 0 && super.anInt812 == 1) {
				@Pc(21) int local21 = super.anInt813 - 25 - 550;
				@Pc(28) int local28 = super.anInt814 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt865 + this.anInt974 & 0x7FF;
					@Pc(52) int local52 = Class2_Sub1_Sub1_Sub1.anIntArray5[local48];
					@Pc(56) int local56 = Class2_Sub1_Sub1_Sub1.anIntArray6[local48];
					@Pc(65) int local65 = local52 * (this.anInt1015 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt1015 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 + local84 >> 7;
					@Pc(108) int local108 = aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 - local94 >> 7;
					@Pc(129) boolean local129 = this.method607(aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray52[0], 0, true, local101, 0, local108, 0, 0, 0, aClass2_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0], 1);
					if (local129) {
						this.aClass2_Sub1_Sub4_6.method84(local21);
						this.aClass2_Sub1_Sub4_6.method84(local28);
						this.aClass2_Sub1_Sub4_6.method85(this.anInt865);
						this.aClass2_Sub1_Sub4_6.method84(57);
						this.aClass2_Sub1_Sub4_6.method84(this.anInt974);
						this.aClass2_Sub1_Sub4_6.method84(this.anInt1015);
						this.aClass2_Sub1_Sub4_6.method84(89);
						this.aClass2_Sub1_Sub4_6.method85(aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285);
						this.aClass2_Sub1_Sub4_6.method85(aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286);
						this.aClass2_Sub1_Sub4_6.method84(this.anInt973);
						this.aClass2_Sub1_Sub4_6.method84(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("90971, " + 45696 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method715(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt898 >= 100 && this.anInt896 != 1) {
					this.method690((byte) 3, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.anInt898 >= 200) {
					this.method690((byte) 3, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					@Pc(39) String local39 = Class18.method210(Class18.method207(this.aBoolean255, arg0));
					for (@Pc(41) int local41 = 0; local41 < this.anInt898; local41++) {
						if (this.aLongArray3[local41] == arg0) {
							this.method690((byte) 3, 0, local39 + " is already on your friend list", "");
							return;
						}
					}
					for (@Pc(71) int local71 = 0; local71 < this.anInt820; local71++) {
						if (this.aLongArray4[local71] == arg0) {
							this.method690((byte) 3, 0, "Please remove " + local39 + " from your ignore list first", "");
							return;
						}
					}
					if (!local39.equals(aClass2_Sub1_Sub2_Sub1_Sub2_1.aString6)) {
						this.aStringArray9[this.anInt898] = local39;
						this.aLongArray3[this.anInt898] = arg0;
						this.anIntArray258[this.anInt898] = 0;
						this.anInt898++;
						this.aBoolean243 = true;
						this.aClass2_Sub1_Sub4_6.method83(70);
						this.aClass2_Sub1_Sub4_6.method90(arg0);
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("58067, " + false + ", " + arg0 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method716(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean225) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method590(43595);
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

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(B)V")
	private void method717() {
		try {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (this.anInt895 == 0) {
				local21 = super.anInt803 / 2 - 80;
				local28 = super.anInt804 / 2 + 20;
				local28 += 20;
				if (super.anInt812 == 1 && super.anInt813 >= local21 - 75 && super.anInt813 <= local21 + 75 && super.anInt814 >= local28 - 20 && super.anInt814 <= local28 + 20) {
					this.anInt895 = 3;
					this.anInt1025 = 0;
				}
				local21 = super.anInt803 / 2 + 80;
				if (super.anInt812 == 1 && super.anInt813 >= local21 - 75 && super.anInt813 <= local21 + 75 && super.anInt814 >= local28 - 20 && super.anInt814 <= local28 + 20) {
					this.aString26 = "";
					this.aString27 = "Enter your username & password.";
					this.anInt895 = 2;
					this.anInt1025 = 0;
				}
			} else if (this.anInt895 == 2) {
				local21 = super.anInt804 / 2 - 40;
				local21 += 30;
				local21 += 25;
				if (super.anInt812 == 1 && super.anInt814 >= local21 - 15 && super.anInt814 < local21) {
					this.anInt1025 = 0;
				}
				local21 += 15;
				if (super.anInt812 == 1 && super.anInt814 >= local21 - 15 && super.anInt814 < local21) {
					this.anInt1025 = 1;
				}
				local21 += 15;
				local28 = super.anInt803 / 2 - 80;
				@Pc(174) int local174 = super.anInt804 / 2 + 50;
				@Pc(175) int local175 = local174 + 20;
				if (super.anInt812 == 1 && super.anInt813 >= local28 - 75 && super.anInt813 <= local28 + 75 && super.anInt814 >= local175 - 20 && super.anInt814 <= local175 + 20) {
					this.anInt949 = 0;
					this.method602(this.aString22, this.aString23, false);
					if (this.aBoolean262) {
						return;
					}
				}
				local28 = super.anInt803 / 2 + 80;
				if (super.anInt812 == 1 && super.anInt813 >= local28 - 75 && super.anInt813 <= local28 + 75 && super.anInt814 >= local175 - 20 && super.anInt814 <= local175 + 20) {
					this.anInt895 = 0;
					this.aString22 = "";
					this.aString23 = "";
				}
				while (true) {
					while (true) {
						@Pc(265) int local265 = this.method577();
						if (local265 == -1) {
							return;
						}
						@Pc(270) boolean local270 = false;
						for (@Pc(272) int local272 = 0; local272 < aString20.length(); local272++) {
							if (local265 == aString20.charAt(local272)) {
								local270 = true;
								break;
							}
						}
						if (this.anInt1025 == 0) {
							if (local265 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt1025 = 1;
							}
							if (local270) {
								this.aString22 = this.aString22 + (char) local265;
							}
							if (this.aString22.length() > 12) {
								this.aString22 = this.aString22.substring(0, 12);
							}
						} else if (this.anInt1025 == 1) {
							if (local265 == 8 && this.aString23.length() > 0) {
								this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							}
							if (local265 == 9 || local265 == 10 || local265 == 13) {
								this.anInt1025 = 0;
							}
							if (local270) {
								this.aString23 = this.aString23 + (char) local265;
							}
							if (this.aString23.length() > 20) {
								this.aString23 = this.aString23.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt895 == 3) {
				local21 = super.anInt803 / 2;
				local28 = super.anInt804 / 2 + 50;
				@Pc(429) int local429 = local28 + 20;
				if (super.anInt812 == 1 && super.anInt813 >= local21 - 75 && super.anInt813 <= local21 + 75 && super.anInt814 >= local429 - 20 && super.anInt814 <= local429 + 20) {
					this.anInt895 = 0;
					return;
				}
			}
		} catch (@Pc(462) RuntimeException local462) {
			signlink.reporterror("35160, " + 73 + ", " + local462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)V")
	private void method718(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (this.aBoolean260) {
				signlink.anInt1051 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("34590, " + arg0 + ", " + 157 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method719() {
		try {
			this.aBoolean252 = false;
			while (this.aBoolean250) {
				this.aBoolean252 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass2_Sub1_Sub1_Sub3_1 = null;
			this.aClass2_Sub1_Sub1_Sub3_2 = null;
			this.aClass2_Sub1_Sub1_Sub3Array4 = null;
			this.anIntArray225 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.anIntArray228 = null;
			this.anIntArray221 = null;
			this.anIntArray222 = null;
			this.anIntArray244 = null;
			this.anIntArray245 = null;
			this.aClass2_Sub1_Sub1_Sub4_3 = null;
			this.aClass2_Sub1_Sub1_Sub4_4 = null;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("38424, " + 0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
	private boolean method720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(15) Class21 local15 = Class21.method256(arg1);
			for (@Pc(17) int local17 = 0; local17 < local15.anIntArray69.length && local15.anIntArray69[local17] != -1; local17++) {
				@Pc(31) Class21 local31 = Class21.method256(local15.anIntArray69[local17]);
				if (local31.anInt425 == 1) {
					local3 |= this.method720(arg0, local31.anInt422);
				}
				@Pc(66) int local66;
				if (local31.anInt425 == 6 && (local31.anInt398 != -1 || local31.anInt399 != -1)) {
					@Pc(61) boolean local61 = this.method646(local31, (byte) 5);
					if (local61) {
						local66 = local31.anInt399;
					} else {
						local66 = local31.anInt398;
					}
					if (local66 != -1) {
						@Pc(78) Class49 local78 = Class49.aClass49Array1[local66];
						local31.anInt404 += arg0;
						while (local31.anInt404 > local78.method571(local31.anInt421)) {
							local31.anInt404 -= local78.method571(local31.anInt421) + 1;
							local31.anInt421++;
							if (local31.anInt421 >= local78.anInt767) {
								local31.anInt421 -= local78.anInt768;
								if (local31.anInt421 < 0 || local31.anInt421 >= local78.anInt767) {
									local31.anInt421 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local31.anInt425 == 6 && local31.anInt423 != 0) {
					@Pc(149) int local149 = local31.anInt423 >> 16;
					local66 = local31.anInt423 << 16 >> 16;
					@Pc(160) int local160 = local149 * arg0;
					local66 *= arg0;
					local31.anInt406 = local31.anInt406 + local160 & 0x7FF;
					local31.anInt407 = local31.anInt407 + local66 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("56364, " + arg0 + ", " + arg1 + ", " + -5 + ", " + local191.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!LUAMUNXO;I)I")
	private int method721(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
		try {
			if (arg1.anIntArrayArray6 == null || arg0 >= arg1.anIntArrayArray6.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg1.anIntArrayArray6[arg0];
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
						local35 = this.anIntArray268[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray269[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray239[local22[local26++]];
					}
					@Pc(83) Class21 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local33 == 4) {
						local83 = Class21.method256(local22[local26++]);
						local88 = local22[local26++];
						if (local88 >= 0 && local88 < Class19.anInt355 && (!Class19.method221(local88).aBoolean80 || aBoolean235)) {
							for (local101 = 0; local101 < local83.anIntArray66.length; local101++) {
								if (local83.anIntArray66[local101] == local88 + 1) {
									local35 += local83.anIntArray74[local101];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray274[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray242[this.anIntArray269[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray274[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt302;
					}
					@Pc(176) int local176;
					if (local33 == 9) {
						for (local176 = 0; local176 < Class4.anInt99; local176++) {
							if (Class4.aBooleanArray3[local176]) {
								local35 += this.anIntArray269[local176];
							}
						}
					}
					if (local33 == 10) {
						local83 = Class21.method256(local22[local26++]);
						local88 = local22[local26++] + 1;
						if (local88 >= 0 && local88 < Class19.anInt355 && (!Class19.method221(local88).aBoolean80 || aBoolean235)) {
							for (local101 = 0; local101 < local83.anIntArray66.length; local101++) {
								if (local83.anIntArray66[local101] == local88) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt855;
					}
					if (local33 == 12) {
						local35 = this.anInt871;
					}
					if (local33 == 13) {
						local176 = this.anIntArray274[local22[local26++]];
						local88 = local22[local26++];
						local35 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local176 = local22[local26++];
						@Pc(290) Class22 local290 = Class22.aClass22Array1[local176];
						local101 = local290.anInt438;
						@Pc(296) int local296 = local290.anInt439;
						@Pc(299) int local299 = local290.anInt440;
						@Pc(305) int local305 = anIntArray271[local299 - local296];
						local35 = this.anIntArray274[local101] >> local296 & local305;
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
						local35 = (aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt285 >> 7) + this.anInt905;
					}
					if (local33 == 19) {
						local35 = (aClass2_Sub1_Sub2_Sub1_Sub2_1.anInt286 >> 7) + this.anInt906;
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
			signlink.reporterror("59949, " + arg0 + ", " + arg1 + ", " + -140 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method722(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(9) Class2_Sub1_Sub3 local9 = this.aClass26_Sub1_1.method275();
				if (local9 == null) {
					return;
				}
				if (local9.anInt104 == 0) {
					Class2_Sub1_Sub2_Sub5.method382(local9.anInt103, local9.aByteArray1);
					if ((this.aClass26_Sub1_1.method280(local9.anInt103) & 0x62) != 0) {
						this.aBoolean243 = true;
						if (this.anInt1038 != -1 || this.anInt859 != -1) {
							this.aBoolean226 = true;
						}
					}
				}
				if (local9.anInt104 == 1 && local9.aByteArray1 != null) {
					Class29.method293(local9.aByteArray1);
				}
				if (local9.anInt104 == 2 && local9.anInt103 == this.anInt827 && local9.aByteArray1 != null) {
					this.method718(this.aBoolean224, local9.aByteArray1);
				}
				if (local9.anInt104 == 3 && this.anInt1030 == 1) {
					for (@Pc(84) int local84 = 0; local84 < this.aByteArrayArray6.length; local84++) {
						if (this.anIntArray234[local84] == local9.anInt103) {
							this.aByteArrayArray6[local84] = local9.aByteArray1;
							if (local9.aByteArray1 == null) {
								this.anIntArray234[local84] = -1;
							}
							break;
						}
						if (this.anIntArray235[local84] == local9.anInt103) {
							this.aByteArrayArray5[local84] = local9.aByteArray1;
							if (local9.aByteArray1 == null) {
								this.anIntArray235[local84] = -1;
							}
							break;
						}
					}
				}
				if (local9.anInt104 == 93 && this.aClass26_Sub1_1.method269(local9.anInt103)) {
					Class31.method297(new Class2_Sub1_Sub4(local9.aByteArray1, aBoolean259), this.aClass26_Sub1_1);
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("42305, " + arg0 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}
