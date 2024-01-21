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

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private static int anInt824;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private static int anInt828;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private static int anInt833;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private static int anInt850;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private static int anInt873;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private static int anInt889;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Z")
	private static boolean aBoolean241;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private static int anInt904;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private static boolean aBoolean245;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private static int anInt917;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!MVRUIIXW;")
	public static Class2_Sub1_Sub3_Sub2_Sub2 aClass2_Sub1_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
	private static boolean aBoolean248;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	public static int anInt943;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private static int anInt951;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private static int anInt980;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private static int anInt991;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	public static int anInt1002;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
	private static boolean aBoolean264;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private static int anInt1005;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Z")
	private static boolean aBoolean266;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private static boolean aBoolean269;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Ljava/lang/String;")
	private static String aString19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private static int anInt926 = -1814;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "[I")
	public static int[] anIntArray247 = new int[32];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private static int[] anIntArray268;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private static int anInt1001;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Z")
	private static boolean aBoolean263;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
	public static final int[] anIntArray274;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!OLIDOILN;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_6;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_7;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_8;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3[] aClass2_Sub1_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_7;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_8;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_9;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_10;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_11;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!EDIBXOXE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!EDIBXOXE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!EDIBXOXE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!EDIBXOXE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_9;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_10;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!NZNLPNYM;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_11;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_12;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_13;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_12;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_13;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_14;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_15;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_16;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_17;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_18;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_19;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_20;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_21;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_22;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_23;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_24;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_25;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_26;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!PRSDKOTZ;")
	private Class32 aClass32_27;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_14;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_15;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_16;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_17;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!NERZSWTZ;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!FXNTEMPE;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!QJAHKUCY;")
	private Class9_Sub1 aClass9_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "Lclient!YJCKMNKP;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	private int[] anIntArray212 = new int[5];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
	private int[] anIntArray220 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private final int anInt826 = 100;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray221 = new int[100];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt827 = 6;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "B")
	private byte aByte28 = -118;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt829 = -1;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt830 = -712;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt832 = 78;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt839 = 687;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
	private int[] anIntArray222 = new int[Class4.anInt72];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private volatile boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt841 = -1;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt843 = 2;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array4 = new Class2_Sub1_Sub2_Sub1[8];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array5 = new Class2_Sub1_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
	private final int[] anIntArray223 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
	private int[] anIntArray224 = new int[50];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Z")
	private boolean aBoolean228 = true;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray225 = new int[Class4.anInt72];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3[] aClass2_Sub1_Sub2_Sub3Array3 = new Class2_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
	private int[] anIntArray226 = new int[4000];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
	private int[] anIntArray227 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt860 = -1;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	public int[] anIntArray228 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "B")
	private byte aByte29 = -26;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private int[] anIntArray229 = new int[33];

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[500];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
	private int[] anIntArray230 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt870 = 5063219;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean235 = true;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray231 = new int[151];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt875 = 8;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt877 = -112;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
	private int[] anIntArray232 = new int[100];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt879 = -23021;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt880 = 37900;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
	private int[] anIntArray233 = new int[5];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt881 = 7;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array6 = new Class2_Sub1_Sub2_Sub1[20];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "B")
	private byte aByte30 = 8;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Z")
	public boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
	private int[] anIntArray234 = new int[151];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!RSWRPCHR;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_6 = new Class2_Sub1_Sub4(new byte[5000], -46859);

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[Lclient!ITIWVLHR;")
	private Class2_Sub1_Sub3_Sub2_Sub1[] aClass2_Sub1_Sub3_Sub2_Sub1Array1 = new Class2_Sub1_Sub3_Sub2_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray235 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	private int[] anIntArray236 = new int[7];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray237 = new int[500];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray238 = new int[500];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray239 = new int[500];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray240 = new int[500];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[I")
	private int[] anIntArray241 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
	private int[] anIntArray242 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt897 = -1;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "[I")
	private int[] anIntArray243 = new int[33];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray244 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Lclient!RSWRPCHR;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_7 = Class2_Sub1_Sub4.method328();

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt903 = -1;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
	private int[] anIntArray245 = new int[9];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt905 = 7;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!EZXKBAZY;")
	private Class12 aClass12_10 = new Class12(false);

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt910 = 7759444;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt912 = 128;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Lclient!RSWRPCHR;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_8 = Class2_Sub1_Sub4.method328();

	@OriginalMember(owner = "client!client", name = "af", descriptor = "B")
	private byte aByte31 = 21;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt918 = 5;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt919 = 3353893;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!EZXKBAZY;")
	private Class12 aClass12_11 = new Class12(false);

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!IGMZHLWJ;")
	private Class15 aClass15_1 = new Class15();

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Z")
	private boolean aBoolean249 = true;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	private int[] anIntArray246 = new int[Class4.anInt72];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt924 = 5;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array7 = new Class2_Sub1_Sub2_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt927 = -1;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array8 = new Class2_Sub1_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt928 = 37900;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "[I")
	private int[] anIntArray248 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "[Lclient!YXBFJZDP;")
	public Class47[] aClass47Array1 = new Class47[5];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
	private int[] anIntArray249 = new int[50];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt936 = -1;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt938 = 2048;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt939 = 2047;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[Lclient!MVRUIIXW;")
	private Class2_Sub1_Sub3_Sub2_Sub2[] aClass2_Sub1_Sub3_Sub2_Sub2Array1 = new Class2_Sub1_Sub3_Sub2_Sub2[this.anInt938];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray250 = new int[this.anInt938];

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[I")
	private int[] anIntArray251 = new int[this.anInt938];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[Lclient!RSWRPCHR;")
	private Class2_Sub1_Sub4[] aClass2_Sub1_Sub4Array1 = new Class2_Sub1_Sub4[this.anInt938];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt942 = -1;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
	private int[] anIntArray254 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3[] aClass2_Sub1_Sub2_Sub3Array4 = new Class2_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Z")
	private boolean aBoolean252 = true;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
	private int[] anIntArray255 = new int[5];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt956 = 2;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt958 = -1;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt959 = -1;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt962 = 3;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt963 = -1;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt967 = 50;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray256 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray257 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray258 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray259 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[I")
	private int[] anIntArray260 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	private int[] anIntArray261 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[I")
	private int[] anIntArray262 = new int[this.anInt967];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[this.anInt967];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
	private int[] anIntArray263 = new int[5];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
	private int[] anIntArray264 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt985 = 1;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
	private int[] anIntArray265 = new int[5];

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!EZXKBAZY;")
	private Class12 aClass12_12 = new Class12(false);

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt993 = 6;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array9 = new Class2_Sub1_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Lclient!RSWRPCHR;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_9 = Class2_Sub1_Sub4.method328();

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
	private volatile boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "[I")
	private int[] anIntArray273 = new int[100];

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt999 = 7;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "B")
	private byte aByte32 = 36;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[Lclient!AIRMECOM;")
	private Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array10 = new Class2_Sub1_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Z")
	private boolean aBoolean265 = true;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[Lclient!OJMMOVXV;")
	private Class2_Sub1_Sub2_Sub3[] aClass2_Sub1_Sub2_Sub3Array5 = new Class2_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1019 = 1;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
	private int[] anIntArray275 = new int[200];

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
	private int[] anIntArray276 = new int[256];

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1030 = 443;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[[[Lclient!EZXKBAZY;")
	private Class12[][][] aClass12ArrayArrayArray1 = new Class12[4][104][104];

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1031 = -1;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1032 = -1;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1033 = -1;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1037 = 7;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "[Lclient!KQTHKTBC;")
	private Class21[] aClass21Array1 = new Class21[4];

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private int anInt1046 = 2;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "Z")
	private volatile boolean aBoolean271 = false;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
	private int anInt1047 = -1;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1048 = 2301979;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1049 = -1;

	static {
		@Pc(278) int local278 = 2;
		@Pc(280) int local280;
		for (local280 = 0; local280 < 32; local280++) {
			anIntArray247[local280] = local278 - 1;
			local278 += local278;
		}
		anIntArray268 = new int[99];
		local278 = 0;
		for (local280 = 0; local280 < 99; local280++) {
			@Pc(307) int local307 = local280 + 1;
			@Pc(320) int local320 = (int) ((double) local307 + Math.pow(2.0D, (double) local307 / 7.0D) * 300.0D);
			local278 += local320;
			anIntArray268[local280] = local278 / 4;
		}
		anInt1001 = 10;
		aBoolean263 = true;
		anIntArray274 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private static void method621() {
		try {
			Class46.aBoolean212 = true;
			Class2_Sub1_Sub2_Sub4.aBoolean197 = true;
			aBoolean264 = true;
			Class43.aBoolean189 = true;
			Class41.aBoolean171 = true;
			if (anInt926 == -1814) {
				;
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("97010, " + -1814 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method626(@OriginalArg(1) int arg0) {
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
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("14591, " + -926 + ", " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private static void method644() {
		try {
			Class46.aBoolean212 = false;
			Class2_Sub1_Sub2_Sub4.aBoolean197 = false;
			aBoolean264 = false;
			Class43.aBoolean189 = false;
			Class41.aBoolean171 = false;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("48918, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZII)Ljava/lang/String;")
	private static String method662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = arg0 - arg1;
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
			signlink.reporterror("98204, " + false + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	private static String method674(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("47542, " + true + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 360);
			if (arg0.length == 5) {
				anInt1001 = Integer.parseInt(arg0[0]);
				anInt1002 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method621();
				} else if (arg0[2].equals("highmem")) {
					method644();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean263 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean263 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1052 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method576();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method589(@OriginalArg(1) int arg0) {
		try {
			Class15.method128(arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("97784, " + 6 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(8) int local8 = arg0 >> 7;
			@Pc(12) int local12 = arg2 >> 7;
			if (local8 < 0 || local12 < 0 || local8 > 103 || local12 > 103) {
				return 0;
			}
			@Pc(26) int local26 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local8][local12] & 0x2) == 2) {
				local26 = arg1 + 1;
			}
			@Pc(46) int local46 = arg0 & 0x7F;
			@Pc(50) int local50 = arg2 & 0x7F;
			@Pc(78) int local78 = this.anIntArrayArrayArray8[local26][local8][local12] * (128 - local46) + this.anIntArrayArrayArray8[local26][local8 + 1][local12] * local46 >> 7;
			@Pc(110) int local110 = this.anIntArrayArrayArray8[local26][local8][local12 + 1] * (128 - local46) + this.anIntArrayArrayArray8[local26][local8 + 1][local12 + 1] * local46 >> 7;
			return local78 * (128 - local50) + local110 * local50 >> 7;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("66853, " + -531 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)I")
	private int method591() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt1023 < 310) {
				@Pc(17) int local17 = this.anInt1020 >> 7;
				@Pc(22) int local22 = this.anInt1022 >> 7;
				@Pc(27) int local27 = aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 >> 7;
				@Pc(32) int local32 = aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt925][local17][local22] & 0x4) != 0) {
					local3 = this.anInt925;
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
						if ((this.aByteArrayArrayArray8[this.anInt925][local17][local22] & 0x4) != 0) {
							local3 = this.anInt925;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt925][local17][local22] & 0x4) != 0) {
								local3 = this.anInt925;
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
						if ((this.aByteArrayArrayArray8[this.anInt925][local17][local22] & 0x4) != 0) {
							local3 = this.anInt925;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt925][local17][local22] & 0x4) != 0) {
								local3 = this.anInt925;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt925][aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 >> 7][aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 >> 7] & 0x4) != 0) {
				local3 = this.anInt925;
			}
			return local3;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("7676, " + 0 + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)I")
	private int method592() {
		try {
			@Pc(18) int local18 = this.method590(this.anInt1020, this.anInt925, this.anInt1022);
			return local18 - this.anInt1021 >= 800 || (this.aByteArrayArrayArray8[this.anInt925][this.anInt1020 >> 7][this.anInt1022 >> 7] & 0x4) == 0 ? 3 : this.anInt925;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("68274, " + 8 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method593() {
		try {
			if (super.aClass32_2 == null) {
				this.method616(this.anInt1012);
				this.aClass32_3 = null;
				this.aClass32_4 = null;
				this.aClass32_5 = null;
				this.aClass32_6 = null;
				this.aClass32_7 = null;
				this.aClass32_8 = null;
				this.aClass32_9 = null;
				this.aClass32_10 = null;
				this.aClass32_11 = null;
				this.aClass32_27 = null;
				this.aClass32_25 = null;
				this.aClass32_24 = null;
				this.aClass32_26 = null;
				this.aClass32_21 = null;
				this.aClass32_22 = null;
				this.aClass32_23 = null;
				super.aClass32_2 = new Class32(3, 503, 765, this.method586());
				this.aBoolean234 = true;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("77101, " + 10571 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean261) {
			this.method668();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!RSWRPCHR;)V")
	private void method594(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			this.anInt972 = 0;
			this.anInt941 = 0;
			this.method724(arg1, arg0);
			this.method669(arg1, 391, arg0);
			this.method659(arg0, arg1);
			this.method687(607, arg1, arg0);
			@Pc(46) int local46;
			for (@Pc(39) int local39 = 0; local39 < this.anInt972; local39++) {
				local46 = this.anIntArray264[local39];
				if (this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local46].anInt398 != anInt943) {
					this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local46] = null;
				}
			}
			if (arg1.anInt556 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt556 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local46 = 0; local46 < this.anInt940; local46++) {
				if (this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[this.anIntArray250[local46]] == null) {
					signlink.reporterror(this.aString29 + " null entry in pl list - pos:" + local46 + " size:" + this.anInt940);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("40416, " + arg0 + ", " + -16194 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method595() {
		try {
			this.aClass32_24.method296();
			Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray217;
			this.aClass2_Sub1_Sub2_Sub3_4.method277(0, 0);
			if (this.anInt1033 != -1) {
				this.method704(0, Class15.method120(this.anInt1033), 0, 0);
			} else if (this.anIntArray248[this.anInt962] != -1) {
				this.method704(0, Class15.method120(this.anIntArray248[this.anInt962]), 0, 0);
			}
			if (this.aBoolean260 && this.anInt865 == 1) {
				this.method649();
			}
			this.aClass32_24.method297(553, 205, super.aGraphics2);
			this.aClass32_26.method296();
			Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("82286, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass46_1.method543(arg1, arg2, arg3);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass46_1.method547(arg1, arg2, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg4;
				if (local8 > 0) {
					local30 = arg0;
				}
				@Pc(38) int[] local38 = this.aClass2_Sub1_Sub2_Sub1_17.anIntArray3;
				local52 = arg2 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class41 local61 = Class41.method403(local58);
				if (local61.anInt647 == -1) {
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
					@Pc(71) Class2_Sub1_Sub2_Sub3 local71 = this.aClass2_Sub1_Sub2_Sub3Array4[local61.anInt647];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt663 * 4 - local71.anInt474) / 2;
						@Pc(93) int local93 = (local61.anInt646 * 4 - local71.anInt475) / 2;
						local71.method277(arg2 * 4 + local83 + 48, (104 - arg3 - local61.anInt646) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass46_1.method545(arg1, arg2, arg3);
			if (local8 != 0) {
				local18 = this.aClass46_1.method547(arg1, arg2, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class41 local447 = Class41.method403(local30);
				@Pc(479) int local479;
				if (local447.anInt647 != -1) {
					@Pc(457) Class2_Sub1_Sub2_Sub3 local457 = this.aClass2_Sub1_Sub2_Sub3Array4[local447.anInt647];
					if (local457 != null) {
						local58 = (local447.anInt663 * 4 - local457.anInt474) / 2;
						local479 = (local447.anInt646 * 4 - local457.anInt475) / 2;
						local457.method277(arg2 * 4 + local58 + 48, (104 - arg3 - local447.anInt646) * 4 + 48 + local479);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass2_Sub1_Sub2_Sub1_17.anIntArray3;
					local479 = arg2 * 4 + (103 - arg3) * 512 * 4 + 24624;
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
			local8 = this.aClass46_1.method546(arg1, arg2, arg3);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(618) Class41 local618 = Class41.method403(local18);
				if (local618.anInt647 != -1) {
					@Pc(628) Class2_Sub1_Sub2_Sub3 local628 = this.aClass2_Sub1_Sub2_Sub3Array4[local618.anInt647];
					if (local628 != null) {
						local30 = (local618.anInt663 * 4 - local628.anInt474) / 2;
						@Pc(650) int local650 = (local618.anInt646 * 4 - local628.anInt475) / 2;
						local628.method277(arg2 * 4 + local30 + 48, (104 - arg3 - local618.anInt646) * 4 + 48 + local650);
						return;
					}
				}
			}
		} catch (@Pc(674) RuntimeException local674) {
			signlink.reporterror("2807, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3 + ", " + local674.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method597(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean231) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method673(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ZJNNOVLJ;I)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg1) {
		try {
			this.method599(arg0, arg1.anInt386, arg1.anInt385);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("27589, " + arg0 + ", " + arg1 + ", " + -15540 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
				@Pc(34) int local34 = this.method590(arg2, this.anInt925, arg1) - arg0;
				@Pc(39) int local39 = arg2 - this.anInt1020;
				@Pc(44) int local44 = local34 - this.anInt1021;
				@Pc(49) int local49 = arg1 - this.anInt1022;
				@Pc(54) int local54 = Class2_Sub1_Sub3_Sub5.anIntArray171[this.anInt1023];
				@Pc(59) int local59 = Class2_Sub1_Sub3_Sub5.anIntArray172[this.anInt1023];
				@Pc(64) int local64 = Class2_Sub1_Sub3_Sub5.anIntArray171[this.anInt1024];
				@Pc(69) int local69 = Class2_Sub1_Sub3_Sub5.anIntArray172[this.anInt1024];
				@Pc(79) int local79 = local49 * local64 + local39 * local69 >> 16;
				@Pc(89) int local89 = local49 * local69 - local39 * local64 >> 16;
				@Pc(91) int local91 = local79;
				@Pc(101) int local101 = local44 * local59 - local89 * local54 >> 16;
				@Pc(111) int local111 = local44 * local54 + local89 * local59 >> 16;
				if (local111 >= 50) {
					this.anInt1031 = Class2_Sub1_Sub2_Sub4.anInt721 + (local91 << 9) / local111;
					this.anInt1032 = Class2_Sub1_Sub2_Sub4.anInt722 + (local101 << 9) / local111;
				} else {
					this.anInt1031 = -1;
					this.anInt1032 = -1;
				}
			} else {
				this.anInt1031 = -1;
				this.anInt1032 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("24151, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -627 + ", " + local143.toString());
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
				return new URL("http://127.0.0.1:" + (anInt1002 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method585() {
		try {
			this.aBoolean234 = true;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("68742, " + false + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Z")
	private boolean method600(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(16) int local16 = this.anIntArray239[arg0];
			if (local16 >= 2000) {
				local16 -= 2000;
			}
			return local16 == 954;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("53111, " + 0 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method601(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				this.anInt920 = -175;
			}
			if (aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 >> 7 == this.anInt986 && aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 >> 7 == this.anInt987) {
				this.anInt986 = 0;
			}
			@Pc(28) int local28 = this.anInt940;
			if (arg0) {
				local28 = 1;
			}
			for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
				@Pc(40) Class2_Sub1_Sub3_Sub2_Sub2 local40;
				@Pc(45) int local45;
				if (arg0) {
					local40 = aClass2_Sub1_Sub3_Sub2_Sub2_1;
					local45 = this.anInt939 << 14;
				} else {
					local40 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[this.anIntArray250[local34]];
					local45 = this.anIntArray250[local34] << 14;
				}
				if (local40 != null && local40.method249()) {
					local40.aBoolean104 = false;
					if ((aBoolean264 && this.anInt940 > 50 || this.anInt940 > 200) && !arg0 && local40.anInt407 == local40.anInt391) {
						local40.aBoolean104 = true;
					}
					@Pc(96) int local96 = local40.anInt385 >> 7;
					@Pc(101) int local101 = local40.anInt386 >> 7;
					if (local96 >= 0 && local96 < 104 && local101 >= 0 && local101 < 104) {
						if (local40.aClass2_Sub1_Sub3_Sub5_1 == null || anInt943 < local40.anInt439 || anInt943 >= local40.anInt440) {
							if ((local40.anInt385 & 0x7F) == 64 && (local40.anInt386 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local96][local101] == this.anInt862) {
									continue;
								}
								this.anIntArrayArray22[local96][local101] = this.anInt862;
							}
							local40.anInt441 = this.method590(local40.anInt385, this.anInt925, local40.anInt386);
							this.aClass46_1.method528(local40, local40.aBoolean103, local40.anInt386, local40.anInt387, local40.anInt441, local45, this.anInt925, 60, local40.anInt385);
						} else {
							local40.aBoolean104 = false;
							local40.anInt441 = this.method590(local40.anInt385, this.anInt925, local40.anInt386);
							this.aClass46_1.method529(local40, local40.anInt431, local40.anInt387, local40.anInt430, local45, local40.anInt441, local40.anInt385, local40.anInt386, this.anInt925, local40.anInt432, local40.anInt433);
						}
					}
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("21335, " + arg0 + ", " + arg1 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method602() {
		try {
			@Pc(7) int local7 = this.aClass2_Sub1_Sub2_Sub2_4.method87("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt822; local9++) {
				local20 = this.aClass2_Sub1_Sub2_Sub2_4.method87(this.aStringArray8[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt822 * 15 + 21;
			@Pc(71) int local71;
			@Pc(89) int local89;
			if (super.anInt817 > 4 && super.anInt818 > 4 && super.anInt817 < 516 && super.anInt818 < 338) {
				local71 = super.anInt817 - local7 / 2 - 4;
				if (local71 + local7 > 512) {
					local71 = 512 - local7;
				}
				if (local71 < 0) {
					local71 = 0;
				}
				local89 = super.anInt818 - 4;
				if (local89 + local20 > 334) {
					local89 = 334 - local20;
				}
				if (local89 < 0) {
					local89 = 0;
				}
				this.aBoolean260 = true;
				this.anInt865 = 0;
				this.anInt866 = local71;
				this.anInt867 = local89;
				this.anInt868 = local7;
				this.anInt869 = this.anInt822 * 15 + 22;
			}
			if (super.anInt817 > 553 && super.anInt818 > 205 && super.anInt817 < 743 && super.anInt818 < 466) {
				local71 = super.anInt817 - local7 / 2 - 553;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 190) {
					local71 = 190 - local7;
				}
				local89 = super.anInt818 - 205;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 261) {
					local89 = 261 - local20;
				}
				this.aBoolean260 = true;
				this.anInt865 = 1;
				this.anInt866 = local71;
				this.anInt867 = local89;
				this.anInt868 = local7;
				this.anInt869 = this.anInt822 * 15 + 22;
			}
			if (super.anInt817 > 17 && super.anInt818 > 357 && super.anInt817 < 496 && super.anInt818 < 453) {
				local71 = super.anInt817 - local7 / 2 - 17;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 479) {
					local71 = 479 - local7;
				}
				local89 = super.anInt818 - 357;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 96) {
					local89 = 96 - local20;
				}
				this.aBoolean260 = true;
				this.anInt865 = 2;
				this.anInt866 = local71;
				this.anInt867 = local89;
				this.anInt868 = local7;
				this.anInt869 = this.anInt822 * 15 + 22;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("14828, " + -81 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MVRUIIXW;IBII)V")
	private void method603(@OriginalArg(0) Class2_Sub1_Sub3_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass2_Sub1_Sub3_Sub2_Sub2_1 && this.anInt822 < 400) {
				@Pc(42) String local42;
				if (arg0.anInt423 == 0) {
					local42 = arg0.aString11 + method662(aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt438, arg0.anInt438) + " (level-" + arg0.anInt438 + ")";
				} else {
					local42 = arg0.aString11 + " (skill-" + arg0.anInt423 + ")";
				}
				@Pc(172) int local172;
				if (this.anInt945 == 1) {
					this.aStringArray8[this.anInt822] = "Use " + this.aString23 + " with @whi@" + local42;
					this.anIntArray239[this.anInt822] = 189;
					this.anIntArray240[this.anInt822] = arg1;
					this.anIntArray237[this.anInt822] = arg3;
					this.anIntArray238[this.anInt822] = arg2;
					this.anInt822++;
				} else if (this.anInt932 != 1) {
					for (local172 = 4; local172 >= 0; local172--) {
						if (this.aStringArray13[local172] != null) {
							this.aStringArray8[this.anInt822] = this.aStringArray13[local172] + " @whi@" + local42;
							@Pc(199) short local199 = 0;
							if (this.aStringArray13[local172].equalsIgnoreCase("attack")) {
								if (arg0.anInt438 > aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt438) {
									local199 = 2000;
								}
								if (aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt437 != 0 && arg0.anInt437 != 0) {
									if (aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt437 == arg0.anInt437) {
										local199 = 2000;
									} else {
										local199 = 0;
									}
								}
							} else if (this.aBooleanArray11[local172]) {
								local199 = 2000;
							}
							if (local172 == 0) {
								this.anIntArray239[this.anInt822] = local199 + 173;
							}
							if (local172 == 1) {
								this.anIntArray239[this.anInt822] = local199 + 99;
							}
							if (local172 == 2) {
								this.anIntArray239[this.anInt822] = local199 + 117;
							}
							if (local172 == 3) {
								this.anIntArray239[this.anInt822] = local199 + 485;
							}
							if (local172 == 4) {
								this.anIntArray239[this.anInt822] = local199 + 929;
							}
							this.anIntArray240[this.anInt822] = arg1;
							this.anIntArray237[this.anInt822] = arg3;
							this.anIntArray238[this.anInt822] = arg2;
							this.anInt822++;
						}
					}
				} else if ((this.anInt934 & 0x8) == 8) {
					this.aStringArray8[this.anInt822] = this.aString22 + " @whi@" + local42;
					this.anIntArray239[this.anInt822] = 943;
					this.anIntArray240[this.anInt822] = arg1;
					this.anIntArray237[this.anInt822] = arg3;
					this.anIntArray238[this.anInt822] = arg2;
					this.anInt822++;
				}
				for (local172 = 0; local172 < this.anInt822; local172++) {
					if (this.anIntArray239[local172] == 14) {
						this.aStringArray8[local172] = "Walk here @whi@" + local42;
						return;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("39625, " + arg0 + ", " + arg1 + ", " + 31 + ", " + arg2 + ", " + arg3 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method604(@OriginalArg(0) int arg0) {
		try {
			@Pc(23) int local23;
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(44) int local44;
			@Pc(93) int local93;
			@Pc(107) int local107;
			@Pc(119) int local119;
			@Pc(178) int local178;
			try {
				this.anInt958 = -1;
				this.aClass12_12.method115();
				this.aClass12_11.method115();
				Class2_Sub1_Sub2_Sub4.method488();
				this.method680(this.anInt1030);
				this.aClass46_1.method517(156);
				System.gc();
				for (local23 = 0; local23 < 4; local23++) {
					this.aClass21Array1[local23].method209();
				}
				for (local36 = 0; local36 < 4; local36++) {
					for (local40 = 0; local40 < 104; local40++) {
						for (local44 = 0; local44 < 104; local44++) {
							this.aByteArrayArrayArray8[local36][local40][local44] = 0;
						}
					}
				}
				@Pc(78) Class43 local78 = new Class43(this.aByteArrayArrayArray8, 104, 379, 104, this.anIntArrayArrayArray8);
				local44 = this.aByteArrayArray6.length;
				this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 157);
				@Pc(241) int local241;
				@Pc(229) int local229;
				if (!this.aBoolean247) {
					@Pc(124) byte[] local124;
					for (local93 = 0; local93 < local44; local93++) {
						local107 = (this.anIntArray213[local93] >> 8) * 64 - this.anInt1026;
						local119 = (this.anIntArray213[local93] & 0xFF) * 64 - this.anInt1027;
						local124 = this.aByteArrayArray6[local93];
						if (local124 != null) {
							local78.method470(local119, local124, this.aClass21Array1, local107, (this.anInt1008 - 6) * 8, (this.anInt1007 - 6) * 8);
						}
					}
					for (local107 = 0; local107 < local44; local107++) {
						local119 = (this.anIntArray213[local107] >> 8) * 64 - this.anInt1026;
						local178 = (this.anIntArray213[local107] & 0xFF) * 64 - this.anInt1027;
						@Pc(183) byte[] local183 = this.aByteArrayArray6[local107];
						if (local183 == null && this.anInt1008 < 800) {
							local78.method453(local119, local178, 64, 64);
						}
					}
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 157);
					for (local119 = 0; local119 < local44; local119++) {
						local124 = this.aByteArrayArray5[local119];
						if (local124 != null) {
							local229 = (this.anIntArray213[local119] >> 8) * 64 - this.anInt1026;
							local241 = (this.anIntArray213[local119] & 0xFF) * 64 - this.anInt1027;
							local78.method462(local229, local241, this.aClass21Array1, this.aClass46_1, local124);
						}
					}
				}
				if (this.aBoolean247) {
					local93 = 0;
					label254: while (true) {
						@Pc(296) int local296;
						@Pc(302) int local302;
						@Pc(308) int local308;
						@Pc(318) int local318;
						@Pc(320) int local320;
						if (local93 >= 4) {
							for (local107 = 0; local107 < 13; local107++) {
								for (local119 = 0; local119 < 13; local119++) {
									local178 = this.anIntArrayArrayArray7[0][local107][local119];
									if (local178 == -1) {
										local78.method453(local107 * 8, local119 * 8, 8, 8);
									}
								}
							}
							this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 157);
							local119 = 0;
							while (true) {
								if (local119 >= 4) {
									break label254;
								}
								for (local178 = 0; local178 < 13; local178++) {
									for (local229 = 0; local229 < 13; local229++) {
										local241 = this.anIntArrayArrayArray7[local119][local178][local229];
										if (local241 != -1) {
											local296 = local241 >> 24 & 0x3;
											local302 = local241 >> 1 & 0x3;
											local308 = local241 >> 14 & 0x3FF;
											local318 = local241 >> 3 & 0x7FF;
											local320 = (local308 / 8 << 8) + local318 / 8;
											for (@Pc(500) int local500 = 0; local500 < this.anIntArray213.length; local500++) {
												if (this.anIntArray213[local500] == local320 && this.aByteArrayArray5[local500] != null) {
													local78.method454(this.aByteArrayArray5[local500], local178 * 8, (local318 & 0x7) * 8, local119, this.aClass21Array1, local302, (local308 & 0x7) * 8, this.aClass46_1, local296, local229 * 8);
													break;
												}
											}
										}
									}
								}
								local119++;
							}
						}
						for (local107 = 0; local107 < 13; local107++) {
							for (local119 = 0; local119 < 13; local119++) {
								@Pc(272) boolean local272 = false;
								local229 = this.anIntArrayArrayArray7[local93][local107][local119];
								if (local229 != -1) {
									local241 = local229 >> 24 & 0x3;
									local296 = local229 >> 1 & 0x3;
									local302 = local229 >> 14 & 0x3FF;
									local308 = local229 >> 3 & 0x7FF;
									local318 = (local302 / 8 << 8) + local308 / 8;
									for (local320 = 0; local320 < this.anIntArray213.length; local320++) {
										if (this.anIntArray213[local320] == local318 && this.aByteArrayArray6[local320] != null) {
											local78.method459(local241, (local308 & 0x7) * 8, this.aClass21Array1, local107 * 8, local119 * 8, local296, local93, this.aByteArrayArray6[local320], (local302 & 0x7) * 8);
											local272 = true;
											break;
										}
									}
								}
								if (!local272) {
									local78.method458(local107 * 8, local119 * 8, local93);
								}
							}
						}
						local93++;
					}
				}
				this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 157);
				local78.method451(this.aClass46_1, this.aClass21Array1);
				if (this.aClass32_26 != null) {
					this.aClass32_26.method296();
					Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
				}
				this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 157);
				local93 = Class43.anInt698;
				if (local93 > this.anInt925) {
					local93 = this.anInt925;
				}
				if (local93 < this.anInt925 - 1) {
					local93 = this.anInt925 - 1;
				}
				if (aBoolean264) {
					this.aClass46_1.method518(Class43.anInt698);
				} else {
					this.aClass46_1.method518(0);
				}
				for (local107 = 0; local107 < 104; local107++) {
					for (local119 = 0; local119 < 104; local119++) {
						this.method646(local107, local119);
					}
				}
				this.method647((byte) 2);
			} catch (@Pc(651) Exception local651) {
			}
			Class41.aClass1_9.method3();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 30);
				this.aClass2_Sub1_Sub4_9.method334(1057001181);
			}
			if (aBoolean264 && signlink.aRandomAccessFile3 != null) {
				local23 = this.aClass9_Sub1_1.method306(0);
				for (local36 = 0; local36 < local23; local36++) {
					local40 = this.aClass9_Sub1_1.method310(local36);
					if ((local40 & 0x79) == 0) {
						Class2_Sub1_Sub3_Sub5.method422(local36);
					}
				}
			}
			System.gc();
			Class2_Sub1_Sub2_Sub4.method489();
			this.aClass9_Sub1_1.method305();
			local23 = (this.anInt1007 - 6) / 8 - 1;
			local36 = (this.anInt1007 + 6) / 8 + 1;
			local40 = (this.anInt1008 - 6) / 8 - 1;
			local44 = (this.anInt1008 + 6) / 8 + 1;
			@Pc(745) boolean local745 = false;
			if (this.aBoolean223) {
				local23 = 49;
				local36 = 50;
				local40 = 49;
				local44 = 50;
			}
			for (local93 = local23; local93 <= local36; local93++) {
				for (local107 = local40; local107 <= local44; local107++) {
					if (local93 == local23 || local93 == local36 || local107 == local40 || local107 == local44) {
						local119 = this.aClass9_Sub1_1.method311(local93, 0, local107);
						if (local119 != -1) {
							this.aClass9_Sub1_1.method319(local119, 3, 165);
						}
						local178 = this.aClass9_Sub1_1.method311(local93, 1, local107);
						if (local178 != -1) {
							this.aClass9_Sub1_1.method319(local178, 3, 165);
						}
					}
				}
			}
		} catch (@Pc(820) RuntimeException local820) {
			signlink.reporterror("27057, " + arg0 + ", " + local820.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method605() {
		try {
			this.anInt949 = 0;
			@Pc(10) int local10 = (aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 >> 7) + this.anInt1026;
			@Pc(18) int local18 = (aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 >> 7) + this.anInt1027;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt949 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt949 = 1;
			}
			if (this.anInt949 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt949 = 0;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("78175, " + false + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method606() {
		try {
			@Pc(8) int local8;
			if (this.anInt1003 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1003 > 768) {
						this.anIntArray269[local8] = this.method643(this.anIntArray271[local8], this.anIntArray270[local8], 1024 - this.anInt1003);
					} else if (this.anInt1003 > 256) {
						this.anIntArray269[local8] = this.anIntArray271[local8];
					} else {
						this.anIntArray269[local8] = this.method643(this.anIntArray270[local8], this.anIntArray271[local8], 256 - this.anInt1003);
					}
				}
			} else if (this.anInt1004 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1004 > 768) {
						this.anIntArray269[local8] = this.method643(this.anIntArray272[local8], this.anIntArray270[local8], 1024 - this.anInt1004);
					} else if (this.anInt1004 > 256) {
						this.anIntArray269[local8] = this.anIntArray272[local8];
					} else {
						this.anIntArray269[local8] = this.method643(this.anIntArray270[local8], this.anIntArray272[local8], 256 - this.anInt1004);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray269[local8] = this.anIntArray270[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass32_6.anIntArray108[local8] = this.aClass2_Sub1_Sub2_Sub1_14.anIntArray3[local8];
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
					local220 = this.anIntArray252[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray269[local220];
						local239 = this.aClass32_6.anIntArray108[local183];
						this.aClass32_6.anIntArray108[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass32_6.method297(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass32_7.anIntArray108[local198] = this.aClass2_Sub1_Sub2_Sub1_15.anIntArray3[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray276[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray252[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray269[local228];
						@Pc(373) int local373 = this.aClass32_7.anIntArray108[local183];
						this.aClass32_7.anIntArray108[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass32_7.method297(637, 0, super.aGraphics2);
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("11219, " + 1 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)V")
	private void method607(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg1 == 0 && this.anInt1047 != -1) {
				this.aString17 = arg2;
				super.anInt816 = 0;
			}
			if (this.anInt959 == -1) {
				this.aBoolean239 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray232[local20] = this.anIntArray232[local20 - 1];
				this.aStringArray9[local20] = this.aStringArray9[local20 - 1];
				this.aStringArray10[local20] = this.aStringArray10[local20 - 1];
			}
			this.anIntArray232[0] = arg1;
			if (arg3 != -118) {
				this.anInt877 = this.aClass25_2.method255();
			}
			this.aStringArray9[0] = arg0;
			this.aStringArray10[0] = arg2;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("38549, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!RSWRPCHR;I)V")
	private void method608(@OriginalArg(1) Class2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt941; local3++) {
				@Pc(10) int local10 = this.anIntArray251[local3];
				@Pc(15) Class2_Sub1_Sub3_Sub2_Sub1 local15 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local10];
				@Pc(18) int local18 = arg0.method340();
				@Pc(26) int local26;
				@Pc(30) int local30;
				if ((local18 & 0x10) != 0) {
					local26 = arg0.method359();
					local30 = arg0.method360(382);
					local15.method247(anInt943, local26, local30);
					local15.anInt395 = anInt943 + 300;
					local15.anInt396 = arg0.method359();
					local15.anInt397 = arg0.method360(382);
				}
				if ((local18 & 0x80) != 0) {
					local15.anInt404 = arg0.method368();
					local15.anInt405 = arg0.method366();
				}
				if ((local18 & 0x8) != 0) {
					local15.aClass10_1 = Class10.method105(arg0.method368());
					local15.anInt383 = local15.aClass10_1.aByte9;
					local15.anInt390 = local15.aClass10_1.anInt151;
					local15.anInt400 = local15.aClass10_1.anInt144;
					local15.anInt401 = local15.aClass10_1.anInt154;
					local15.anInt402 = local15.aClass10_1.anInt136;
					local15.anInt403 = local15.aClass10_1.anInt147;
					local15.anInt391 = local15.aClass10_1.anInt153;
				}
				if ((local18 & 0x40) != 0) {
					local26 = arg0.method340();
					local30 = arg0.method358();
					local15.method247(anInt943, local26, local30);
					local15.anInt395 = anInt943 + 300;
					local15.anInt396 = arg0.method358();
					local15.anInt397 = arg0.method340();
				}
				if ((local18 & 0x1) != 0) {
					local15.anInt411 = arg0.method366();
					local26 = arg0.method345();
					local15.anInt415 = local26 >> 16;
					local15.anInt414 = anInt943 + (local26 & 0xFFFF);
					local15.anInt412 = 0;
					local15.anInt413 = 0;
					if (local15.anInt414 > anInt943) {
						local15.anInt412 = -1;
					}
					if (local15.anInt411 == 65535) {
						local15.anInt411 = -1;
					}
				}
				if ((local18 & 0x20) != 0) {
					local15.anInt410 = arg0.method366();
					if (local15.anInt410 == 65535) {
						local15.anInt410 = -1;
					}
				}
				if ((local18 & 0x4) != 0) {
					local26 = arg0.method368();
					if (local26 == 65535) {
						local26 = -1;
					}
					local30 = arg0.method358();
					if (local26 == local15.anInt418 && local26 != -1) {
						@Pc(230) int local230 = Class23.aClass23Array1[local26].anInt366;
						if (local230 == 1) {
							local15.anInt419 = 0;
							local15.anInt420 = 0;
							local15.anInt421 = local30;
							local15.anInt422 = 0;
						}
						if (local230 == 2) {
							local15.anInt422 = 0;
						}
					} else if (local26 == -1 || local15.anInt418 == -1 || Class23.aClass23Array1[local26].anInt360 >= Class23.aClass23Array1[local15.anInt418].anInt360) {
						local15.anInt418 = local26;
						local15.anInt419 = 0;
						local15.anInt420 = 0;
						local15.anInt421 = local30;
						local15.anInt422 = 0;
						local15.anInt394 = local15.anInt393;
					}
				}
				if ((local18 & 0x2) != 0) {
					local15.aString10 = arg0.method347();
					local15.anInt399 = 100;
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("33605, " + 45509 + ", " + arg0 + ", " + arg1 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass2_Sub1_Sub2_Sub3_7.method277(arg3, arg1);
			this.aClass2_Sub1_Sub2_Sub3_8.method277(arg3, arg1 + arg4 - 16);
			Class2_Sub1_Sub2.method478(arg3, 16, arg4 - 32, arg1 + 16, this.anInt1048);
			@Pc(46) int local46 = (arg4 - 32) * arg4 / arg2;
			if (local46 < 8) {
				local46 = 8;
			}
			@Pc(63) int local63 = (arg4 - local46 - 32) * arg0 / (arg2 - arg4);
			Class2_Sub1_Sub2.method478(arg3, 16, local46, arg1 + local63 + 16, this.anInt870);
			Class2_Sub1_Sub2.method483(this.anInt910, arg1 + local63 + 16, arg3, local46);
			Class2_Sub1_Sub2.method483(this.anInt910, arg1 + local63 + 16, arg3 + 1, local46);
			Class2_Sub1_Sub2.method481(arg1 + local63 + 16, 160, this.anInt910, arg3, 16);
			Class2_Sub1_Sub2.method481(arg1 + local63 + 17, 160, this.anInt910, arg3, 16);
			Class2_Sub1_Sub2.method483(this.anInt919, arg1 + local63 + 16, arg3 + 15, local46);
			Class2_Sub1_Sub2.method483(this.anInt919, arg1 + local63 + 17, arg3 + 14, local46 - 1);
			Class2_Sub1_Sub2.method481(arg1 + local63 + local46 + 15, 160, this.anInt919, arg3, 16);
			Class2_Sub1_Sub2.method481(arg1 + local63 + local46 + 14, 160, this.anInt919, arg3 + 1, 15);
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("57287, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + arg4 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method610(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt891; local1++) {
				@Pc(11) Class2_Sub1_Sub3_Sub2_Sub1 local11 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[this.anIntArray235[local1]];
				@Pc(20) int local20 = (this.anIntArray235[local1] << 14) + 536870912;
				if (local11 != null && local11.method249() && local11.aClass10_1.aBoolean41 == arg0 && local11.aClass10_1.method103()) {
					@Pc(41) int local41 = local11.anInt385 >> 7;
					@Pc(46) int local46 = local11.anInt386 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt383 == 1 && (local11.anInt385 & 0x7F) == 64 && (local11.anInt386 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local41][local46] == this.anInt862) {
								continue;
							}
							this.anIntArrayArray22[local41][local46] = this.anInt862;
						}
						if (!local11.aClass10_1.aBoolean39) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass46_1.method528(local11, local11.aBoolean103, local11.anInt386, local11.anInt387, this.method590(local11.anInt385, this.anInt925, local11.anInt386), local20, this.anInt925, (local11.anInt383 - 1) * 64 + 60, local11.anInt385);
					}
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("80173, " + false + ", " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method611(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.anInt975 += 0;
			if (this.aBoolean265) {
				signlink.anInt1057 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("95009, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method612(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt966 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt940 + this.anInt891; local6++) {
				@Pc(13) Class2_Sub1_Sub3_Sub2 local13;
				if (local6 == -1) {
					local13 = aClass2_Sub1_Sub3_Sub2_Sub2_1;
				} else if (local6 < this.anInt940) {
					local13 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[this.anIntArray250[local6]];
				} else {
					local13 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[this.anIntArray235[local6 - this.anInt940]];
				}
				if (local13 != null && local13.method249()) {
					@Pc(54) Class10 local54;
					if (local13 instanceof Class2_Sub1_Sub3_Sub2_Sub1) {
						local54 = ((Class2_Sub1_Sub3_Sub2_Sub1) local13).aClass10_1;
						if (local54.anIntArray37 != null) {
							local54 = local54.method100();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt940) {
						local54 = ((Class2_Sub1_Sub3_Sub2_Sub1) local13).aClass10_1;
						if (local54.anInt138 >= 0 && local54.anInt138 < this.aClass2_Sub1_Sub2_Sub1Array9.length) {
							this.method598(local13.anInt406 + 15, local13);
							if (this.anInt1031 > -1) {
								this.aClass2_Sub1_Sub2_Sub1Array9[local54.anInt138].method42(this.anInt1031 - 12, this.anInt1032 - 30);
							}
						}
						if (this.anInt844 == 1 && this.anInt921 == this.anIntArray235[local6 - this.anInt940] && anInt943 % 20 < 10) {
							this.method598(local13.anInt406 + 15, local13);
							if (this.anInt1031 > -1) {
								this.aClass2_Sub1_Sub2_Sub1Array5[0].method42(this.anInt1031 - 12, this.anInt1032 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class2_Sub1_Sub3_Sub2_Sub2 local73 = (Class2_Sub1_Sub3_Sub2_Sub2) local13;
						if (local73.anInt435 != -1 || local73.anInt436 != -1) {
							this.method598(local13.anInt406 + 15, local13);
							if (this.anInt1031 > -1) {
								if (local73.anInt435 != -1) {
									this.aClass2_Sub1_Sub2_Sub1Array10[local73.anInt435].method42(this.anInt1031 - 12, this.anInt1032 - 30);
									local70 += 25;
								}
								if (local73.anInt436 != -1) {
									this.aClass2_Sub1_Sub2_Sub1Array9[local73.anInt436].method42(this.anInt1031 - 12, this.anInt1032 - local70);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt844 == 10 && this.anInt950 == this.anIntArray250[local6]) {
							this.method598(local13.anInt406 + 15, local13);
							if (this.anInt1031 > -1) {
								this.aClass2_Sub1_Sub2_Sub1Array5[1].method42(this.anInt1031 - 12, this.anInt1032 - local70);
							}
						}
					}
					if (local13.aString10 != null && (local6 >= this.anInt940 || this.anInt935 == 0 || this.anInt935 == 3 || this.anInt935 == 1 && this.method688(((Class2_Sub1_Sub3_Sub2_Sub2) local13).aString11, (byte) 1))) {
						this.method598(local13.anInt406, local13);
						if (this.anInt1031 > -1 && this.anInt966 < this.anInt967) {
							this.anIntArray259[this.anInt966] = this.aClass2_Sub1_Sub2_Sub2_4.method88(162, local13.aString10) / 2;
							this.anIntArray258[this.anInt966] = this.aClass2_Sub1_Sub2_Sub2_4.anInt132;
							this.anIntArray256[this.anInt966] = this.anInt1031;
							this.anIntArray257[this.anInt966] = this.anInt1032;
							this.anIntArray260[this.anInt966] = local13.anInt416;
							this.anIntArray261[this.anInt966] = local13.anInt388;
							this.anIntArray262[this.anInt966] = local13.anInt399;
							this.aStringArray12[this.anInt966++] = local13.aString10;
							if (this.anInt988 == 0 && local13.anInt388 >= 1 && local13.anInt388 <= 3) {
								this.anIntArray258[this.anInt966] += 10;
								this.anIntArray257[this.anInt966] += 5;
							}
							if (this.anInt988 == 0 && local13.anInt388 == 4) {
								this.anIntArray259[this.anInt966] = 60;
							}
							if (this.anInt988 == 0 && local13.anInt388 == 5) {
								this.anIntArray258[this.anInt966] += 5;
							}
						}
					}
					if (local13.anInt395 > anInt943) {
						this.method598(local13.anInt406 + 15, local13);
						if (this.anInt1031 > -1) {
							local70 = local13.anInt396 * 30 / local13.anInt397;
							if (local70 > 30) {
								local70 = 30;
							}
							Class2_Sub1_Sub2.method478(this.anInt1031 - 15, local70, 5, this.anInt1032 - 3, 65280);
							Class2_Sub1_Sub2.method478(this.anInt1031 + local70 - 15, 30 - local70, 5, this.anInt1032 - 3, 16711680);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray92[local70] > anInt943) {
							this.method598(local13.anInt406 / 2, local13);
							if (this.anInt1031 > -1) {
								if (local70 == 1) {
									this.anInt1032 -= 20;
								}
								if (local70 == 2) {
									this.anInt1031 -= 15;
									this.anInt1032 -= 10;
								}
								if (local70 == 3) {
									this.anInt1031 += 15;
									this.anInt1032 -= 10;
								}
								this.aClass2_Sub1_Sub2_Sub1Array6[local13.anIntArray91[local70]].method42(this.anInt1031 - 12, this.anInt1032 - 12);
								this.aClass2_Sub1_Sub2_Sub2_2.method85(0, this.anInt1031, this.anInt1032 + 4, String.valueOf(local13.anIntArray90[local70]));
								this.aClass2_Sub1_Sub2_Sub2_2.method85(16777215, this.anInt1031 - 1, this.anInt1032 + 3, String.valueOf(local13.anIntArray90[local70]));
							}
						}
					}
				}
			}
			for (@Pc(610) int local610 = 0; local610 < this.anInt966; local610++) {
				local70 = this.anIntArray256[local610];
				@Pc(622) int local622 = this.anIntArray257[local610];
				@Pc(627) int local627 = this.anIntArray259[local610];
				@Pc(632) int local632 = this.anIntArray258[local610];
				@Pc(634) boolean local634 = true;
				while (local634) {
					local634 = false;
					for (@Pc(640) int local640 = 0; local640 < local610; local640++) {
						if (local622 + 2 > this.anIntArray257[local640] - this.anIntArray258[local640] && local622 - local632 < this.anIntArray257[local640] + 2 && local70 - local627 < this.anIntArray256[local640] + this.anIntArray259[local640] && local70 + local627 > this.anIntArray256[local640] - this.anIntArray259[local640] && this.anIntArray257[local640] - this.anIntArray258[local640] < local622) {
							local622 = this.anIntArray257[local640] - this.anIntArray258[local640];
							local634 = true;
						}
					}
				}
				this.anInt1031 = this.anIntArray256[local610];
				this.anInt1032 = this.anIntArray257[local610] = local622;
				@Pc(739) String local739 = this.aStringArray12[local610];
				if (this.anInt988 == 0) {
					@Pc(744) int local744 = 16776960;
					if (this.anIntArray260[local610] < 6) {
						local744 = this.anIntArray254[this.anIntArray260[local610]];
					}
					if (this.anIntArray260[local610] == 6) {
						local744 = this.anInt862 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray260[local610] == 7) {
						local744 = this.anInt862 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray260[local610] == 8) {
						local744 = this.anInt862 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(819) int local819;
					if (this.anIntArray260[local610] == 9) {
						local819 = 150 - this.anIntArray262[local610];
						if (local819 < 50) {
							local744 = local819 * 1280 + 16711680;
						} else if (local819 < 100) {
							local744 = 16776960 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray260[local610] == 10) {
						local819 = 150 - this.anIntArray262[local610];
						if (local819 < 50) {
							local744 = local819 * 5 + 16711680;
						} else if (local819 < 100) {
							local744 = 16711935 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 327680 + 255 - (local819 - 100) * 5;
						}
					}
					if (this.anIntArray260[local610] == 11) {
						local819 = 150 - this.anIntArray262[local610];
						if (local819 < 50) {
							local744 = 16777215 - local819 * 327685;
						} else if (local819 < 100) {
							local744 = (local819 - 50) * 327685 + 65280;
						} else if (local819 < 150) {
							local744 = 16777215 - (local819 - 100) * 327680;
						}
					}
					if (this.anIntArray261[local610] == 0) {
						this.aClass2_Sub1_Sub2_Sub2_4.method85(0, this.anInt1031, this.anInt1032 + 1, local739);
						this.aClass2_Sub1_Sub2_Sub2_4.method85(local744, this.anInt1031, this.anInt1032, local739);
					}
					if (this.anIntArray261[local610] == 1) {
						this.aClass2_Sub1_Sub2_Sub2_4.method90(local739, this.anInt1032 + 1, 0, this.anInt862, this.aBoolean252, this.anInt1031);
						this.aClass2_Sub1_Sub2_Sub2_4.method90(local739, this.anInt1032, local744, this.anInt862, this.aBoolean252, this.anInt1031);
					}
					if (this.anIntArray261[local610] == 2) {
						this.aClass2_Sub1_Sub2_Sub2_4.method91(this.anInt862, local739, this.anInt1031, 0, this.anInt1032 + 1);
						this.aClass2_Sub1_Sub2_Sub2_4.method91(this.anInt862, local739, this.anInt1031, local744, this.anInt1032);
					}
					if (this.anIntArray261[local610] == 3) {
						this.aClass2_Sub1_Sub2_Sub2_4.method92(150 - this.anIntArray262[local610], this.anInt862, this.anInt1032 + 1, local739, 0, this.anInt1031);
						this.aClass2_Sub1_Sub2_Sub2_4.method92(150 - this.anIntArray262[local610], this.anInt862, this.anInt1032, local739, local744, this.anInt1031);
					}
					@Pc(1118) int local1118;
					if (this.anIntArray261[local610] == 4) {
						local819 = this.aClass2_Sub1_Sub2_Sub2_4.method88(162, local739);
						local1118 = (150 - this.anIntArray262[local610]) * (local819 + 100) / 150;
						Class2_Sub1_Sub2.method475(0, this.anInt1031 + 50, this.anInt1031 - 50, 334);
						this.aClass2_Sub1_Sub2_Sub2_4.method89(this.anInt1031 + 50 - local1118, 0, this.anInt1032 + 1, local739);
						this.aClass2_Sub1_Sub2_Sub2_4.method89(this.anInt1031 + 50 - local1118, local744, this.anInt1032, local739);
						Class2_Sub1_Sub2.method474();
					}
					if (this.anIntArray261[local610] == 5) {
						local819 = 150 - this.anIntArray262[local610];
						local1118 = 0;
						if (local819 < 25) {
							local1118 = local819 - 25;
						} else if (local819 > 125) {
							local1118 = local819 - 125;
						}
						Class2_Sub1_Sub2.method475(this.anInt1032 - this.aClass2_Sub1_Sub2_Sub2_4.anInt132 - 1, 512, 0, this.anInt1032 + 5);
						this.aClass2_Sub1_Sub2_Sub2_4.method85(0, this.anInt1031, this.anInt1032 + local1118 + 1, local739);
						this.aClass2_Sub1_Sub2_Sub2_4.method85(local744, this.anInt1031, this.anInt1032 + local1118, local739);
						Class2_Sub1_Sub2.method474();
					}
				} else {
					this.aClass2_Sub1_Sub2_Sub2_4.method85(0, this.anInt1031, this.anInt1032 + 1, local739);
					this.aClass2_Sub1_Sub2_Sub2_4.method85(16776960, this.anInt1031, this.anInt1032, local739);
				}
			}
			if (arg0) {
				this.anInt846 = this.aClass25_2.method255();
			}
		} catch (@Pc(1275) RuntimeException local1275) {
			signlink.reporterror("30297, " + arg0 + ", " + local1275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!EKQCVRVG;II)V")
	private void method613(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt822 < 400) {
				if (arg1.anIntArray37 != null) {
					arg1 = arg1.method100();
				}
				if (arg1 != null && arg1.aBoolean39) {
					@Pc(23) String local23 = arg1.aString1;
					if (arg1.anInt152 != 0) {
						local23 = local23 + method662(aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt438, arg1.anInt152) + " (level-" + arg1.anInt152 + ")";
					}
					if (this.anInt945 == 1) {
						this.aStringArray8[this.anInt822] = "Use " + this.aString23 + " with @yel@" + local23;
						this.anIntArray239[this.anInt822] = 442;
						this.anIntArray240[this.anInt822] = arg0;
						this.anIntArray237[this.anInt822] = arg2;
						this.anIntArray238[this.anInt822] = arg3;
						this.anInt822++;
					} else if (this.anInt932 != 1) {
						@Pc(167) int local167;
						if (arg1.aStringArray2 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray2[local167] != null && !arg1.aStringArray2[local167].equalsIgnoreCase("attack")) {
									this.aStringArray8[this.anInt822] = arg1.aStringArray2[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray239[this.anInt822] = 674;
									}
									if (local167 == 1) {
										this.anIntArray239[this.anInt822] = 823;
									}
									if (local167 == 2) {
										this.anIntArray239[this.anInt822] = 732;
									}
									if (local167 == 3) {
										this.anIntArray239[this.anInt822] = 248;
									}
									if (local167 == 4) {
										this.anIntArray239[this.anInt822] = 229;
									}
									this.anIntArray240[this.anInt822] = arg0;
									this.anIntArray237[this.anInt822] = arg2;
									this.anIntArray238[this.anInt822] = arg3;
									this.anInt822++;
								}
							}
						}
						if (arg1.aStringArray2 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray2[local167] != null && arg1.aStringArray2[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg1.anInt152 > aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt438) {
										local291 = 2000;
									}
									this.aStringArray8[this.anInt822] = arg1.aStringArray2[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray239[this.anInt822] = local291 + 674;
									}
									if (local167 == 1) {
										this.anIntArray239[this.anInt822] = local291 + 823;
									}
									if (local167 == 2) {
										this.anIntArray239[this.anInt822] = local291 + 732;
									}
									if (local167 == 3) {
										this.anIntArray239[this.anInt822] = local291 + 248;
									}
									if (local167 == 4) {
										this.anIntArray239[this.anInt822] = local291 + 229;
									}
									this.anIntArray240[this.anInt822] = arg0;
									this.anIntArray237[this.anInt822] = arg2;
									this.anIntArray238[this.anInt822] = arg3;
									this.anInt822++;
								}
							}
						}
						this.aStringArray8[this.anInt822] = "Examine @yel@" + local23;
						this.anIntArray239[this.anInt822] = 1987;
						this.anIntArray240[this.anInt822] = arg0;
						this.anIntArray237[this.anInt822] = arg2;
						this.anIntArray238[this.anInt822] = arg3;
						this.anInt822++;
					} else if ((this.anInt934 & 0x2) == 2) {
						this.aStringArray8[this.anInt822] = this.aString22 + " @yel@" + local23;
						this.anIntArray239[this.anInt822] = 507;
						this.anIntArray240[this.anInt822] = arg0;
						this.anIntArray237[this.anInt822] = arg2;
						this.anIntArray238[this.anInt822] = arg3;
						this.anInt822++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("91703, " + -693 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method614() {
		try {
			this.aBoolean238 &= true;
			if (this.anInt953 == 0 && super.anInt816 == 1) {
				@Pc(20) int local20 = super.anInt817 - 25 - 550;
				@Pc(27) int local27 = super.anInt818 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt913 + this.anInt842 & 0x7FF;
					@Pc(51) int local51 = Class2_Sub1_Sub2_Sub4.anIntArray187[local47];
					@Pc(55) int local55 = Class2_Sub1_Sub2_Sub4.anIntArray188[local47];
					@Pc(64) int local64 = local51 * (this.anInt984 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt984 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 + local83 >> 7;
					@Pc(107) int local107 = aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 - local93 >> 7;
					@Pc(128) boolean local128 = this.method642(0, 0, local100, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local107, true, 1, 0);
					if (local128) {
						this.aClass2_Sub1_Sub4_9.method330(local20);
						this.aClass2_Sub1_Sub4_9.method330(local27);
						this.aClass2_Sub1_Sub4_9.method331(this.anInt913);
						this.aClass2_Sub1_Sub4_9.method330(57);
						this.aClass2_Sub1_Sub4_9.method330(this.anInt842);
						this.aClass2_Sub1_Sub4_9.method330(this.anInt984);
						this.aClass2_Sub1_Sub4_9.method330(89);
						this.aClass2_Sub1_Sub4_9.method331(aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385);
						this.aClass2_Sub1_Sub4_9.method331(aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386);
						this.aClass2_Sub1_Sub4_9.method330(this.anInt896);
						this.aClass2_Sub1_Sub4_9.method330(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("31163, " + true + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;B)Lclient!FXNTEMPE;")
	private Class13 method615(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			if (this.aByte29 != -26) {
				this.method581();
			}
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass47Array1[0] != null) {
					local3 = this.aClass47Array1[0].method568(arg2);
				}
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(40) int local40;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local40 = (int) this.aCRC32_2.getValue();
				if (local40 != arg3) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class13(local3, (byte) 3);
			}
			local40 = 0;
			while (local3 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method588(arg0, "Requesting " + arg4, aBoolean222);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method597(arg1 + arg3);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class2_Sub1_Sub4 local101 = new Class2_Sub1_Sub4(local90, -46859);
					local101.anInt556 = 3;
					@Pc(109) int local109 = local101.method344() + 6;
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
							this.method588(arg0, "Loading " + arg4 + " - " + local174 + "%", aBoolean222);
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass47Array1[0] != null) {
							this.aClass47Array1[0].method569(local3, local3.length, arg2);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass47Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg3) {
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
							this.method588(arg0, "Game updated - please reload page", aBoolean222);
							local76 = 10;
						} else {
							this.method588(arg0, local61 + " - Retrying in " + local76, aBoolean222);
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
					this.aBoolean231 = !this.aBoolean231;
				}
			}
			return new Class13(local3, (byte) 3);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("5716, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -26 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method616(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean226 = false;
			while (this.aBoolean271) {
				this.aBoolean226 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass2_Sub1_Sub2_Sub3_9 = null;
			this.aClass2_Sub1_Sub2_Sub3_10 = null;
			this.aClass2_Sub1_Sub2_Sub3Array2 = null;
			if (arg0 != 0) {
				aBoolean254 = true;
			}
			this.anIntArray269 = null;
			this.anIntArray270 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.anIntArray266 = null;
			this.anIntArray267 = null;
			this.anIntArray252 = null;
			this.anIntArray253 = null;
			this.aClass2_Sub1_Sub2_Sub1_14 = null;
			this.aClass2_Sub1_Sub2_Sub1_15 = null;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("78809, " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method617(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass2_Sub1_Sub2_Sub1_17.anIntArray3;
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
						this.aClass46_1.method552(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass46_1.method552(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass2_Sub1_Sub2_Sub1_17.method37();
			@Pc(152) int local152;
			for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					if ((this.aByteArrayArrayArray8[arg0][local152][local148] & 0x18) == 0) {
						this.method596(local36, arg0, local152, local148, local34);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local152][local148] & 0x8) != 0) {
						this.method596(local36, arg0 + 1, local152, local148, local34);
					}
				}
			}
			if (this.aClass32_26 != null) {
				this.aClass32_26.method296();
				Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
			}
			anInt1005++;
			if (anInt1005 > 89) {
				anInt1005 = 0;
				this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 204);
			}
			this.anInt895 = 0;
			for (local152 = 0; local152 < 104; local152++) {
				for (@Pc(241) int local241 = 0; local241 < 104; local241++) {
					@Pc(251) int local251 = this.aClass46_1.method546(this.anInt925, local152, local241);
					if (local251 != 0) {
						local251 = local251 >> 14 & 0x7FFF;
						@Pc(263) int local263 = Class41.method403(local251).anInt657;
						if (local263 >= 0) {
							@Pc(267) int local267 = local152;
							@Pc(269) int local269 = local241;
							if (local263 != 22 && local263 != 29 && local263 != 34 && local263 != 36 && local263 != 46 && local263 != 47 && local263 != 48) {
								@Pc(301) int[][] local301 = this.aClass21Array1[this.anInt925].anIntArrayArray7;
								for (@Pc(303) int local303 = 0; local303 < 10; local303++) {
									@Pc(310) int local310 = (int) (Math.random() * 4.0D);
									if (local310 == 0 && local267 > 0 && local267 > local152 - 3 && (local301[local267 - 1][local269] & 0x1280108) == 0) {
										local267--;
									}
									if (local310 == 1 && local267 < 103 && local267 < local152 + 3 && (local301[local267 + 1][local269] & 0x1280180) == 0) {
										local267++;
									}
									if (local310 == 2 && local269 > 0 && local269 > local241 - 3 && (local301[local267][local269 - 1] & 0x1280102) == 0) {
										local269--;
									}
									if (local310 == 3 && local269 < 103 && local269 < local241 + 3 && (local301[local267][local269 + 1] & 0x1280120) == 0) {
										local269++;
									}
								}
							}
							this.aClass2_Sub1_Sub2_Sub1Array8[this.anInt895] = this.aClass2_Sub1_Sub2_Sub1Array7[local263];
							this.anIntArray241[this.anInt895] = local267;
							this.anIntArray242[this.anInt895] = local269;
							this.anInt895++;
						}
					}
				}
			}
		} catch (@Pc(440) RuntimeException local440) {
			signlink.reporterror("96276, " + arg0 + ", " + 72 + ", " + local440.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Z")
	private boolean method618() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("95632, " + 9 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method619() {
		try {
			if (this.anInt999 <= 7 && this.anInt999 >= 7) {
				while (true) {
					@Pc(14) Class2_Sub1_Sub1 local14 = this.aClass9_Sub1_1.method314();
					if (local14 == null) {
						return;
					}
					if (local14.anInt8 == 0) {
						Class2_Sub1_Sub3_Sub5.method421(local14.aByteArray1, local14.anInt7);
						if ((this.aClass9_Sub1_1.method310(local14.anInt7) & 0x62) != 0) {
							this.aBoolean251 = true;
							if (this.anInt959 != -1 || this.anInt1047 != -1) {
								this.aBoolean239 = true;
							}
						}
					}
					if (local14.anInt8 == 1 && local14.aByteArray1 != null) {
						Class31.method292(local14.aByteArray1);
					}
					if (local14.anInt8 == 2 && local14.anInt7 == this.anInt851 && local14.aByteArray1 != null) {
						this.method611(this.aBoolean228, local14.aByteArray1);
					}
					if (local14.anInt8 == 3 && this.anInt968 == 1) {
						for (@Pc(89) int local89 = 0; local89 < this.aByteArrayArray6.length; local89++) {
							if (this.anIntArray214[local89] == local14.anInt7) {
								this.aByteArrayArray6[local89] = local14.aByteArray1;
								if (local14.aByteArray1 == null) {
									this.anIntArray214[local89] = -1;
								}
								break;
							}
							if (this.anIntArray215[local89] == local14.anInt7) {
								this.aByteArrayArray5[local89] = local14.aByteArray1;
								if (local14.aByteArray1 == null) {
									this.anIntArray215[local89] = -1;
								}
								break;
							}
						}
					}
					if (local14.anInt8 == 93 && this.aClass9_Sub1_1.method304(local14.anInt7)) {
						Class43.method461(new Class2_Sub1_Sub4(local14.aByteArray1, -46859), this.aClass9_Sub1_1);
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("51370, " + 7 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method620() {
		try {
			try {
				@Pc(14) int local14 = aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 + this.anInt1045;
				@Pc(20) int local20 = aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 + this.anInt955;
				if (this.anInt853 - local14 < -500 || this.anInt853 - local14 > 500 || this.anInt854 - local20 < -500 || this.anInt854 - local20 > 500) {
					this.anInt853 = local14;
					this.anInt854 = local20;
				}
				if (this.anInt853 != local14) {
					this.anInt853 += (local14 - this.anInt853) / 16;
				}
				if (this.anInt854 != local20) {
					this.anInt854 += (local20 - this.anInt854) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt914 += (-this.anInt914 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt914 += (24 - this.anInt914) / 2;
				} else {
					this.anInt914 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt915 += (12 - this.anInt915) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt915 += (-this.anInt915 - 12) / 2;
				} else {
					this.anInt915 /= 2;
				}
				this.anInt913 = this.anInt913 + this.anInt914 / 2 & 0x7FF;
				this.anInt912 += this.anInt915 / 2;
				if (this.anInt912 < 128) {
					this.anInt912 = 128;
				}
				if (this.anInt912 > 383) {
					this.anInt912 = 383;
				}
				@Pc(207) int local207 = this.anInt853 >> 7;
				@Pc(212) int local212 = this.anInt854 >> 7;
				@Pc(222) int local222 = this.method590(this.anInt853, this.anInt925, this.anInt854);
				@Pc(224) int local224 = 0;
				@Pc(240) int local240;
				if (local207 > 3 && local212 > 3 && local207 < 100 && local212 < 100) {
					for (local240 = local207 - 4; local240 <= local207 + 4; local240++) {
						for (@Pc(246) int local246 = local212 - 4; local246 <= local212 + 4; local246++) {
							@Pc(251) int local251 = this.anInt925;
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
				if (local240 > this.anInt995) {
					this.anInt995 += (local240 - this.anInt995) / 24;
				} else if (local240 < this.anInt995) {
					this.anInt995 += (local240 - this.anInt995) / 80;
				}
			} catch (@Pc(342) Exception local342) {
				signlink.reporterror("glfc_ex " + aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 + "," + aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 + "," + this.anInt853 + "," + this.anInt854 + "," + this.anInt1007 + "," + this.anInt1008 + "," + this.anInt1026 + "," + this.anInt1027);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("96210, " + 0 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IGMZHLWJ;Z)Z")
	private boolean method622(@OriginalArg(0) Class15 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt204;
			if (this.anInt971 == 2) {
				if (local4 == 201) {
					this.aBoolean239 = true;
					this.anInt989 = 0;
					this.aBoolean262 = true;
					this.aString31 = "";
					this.anInt863 = 1;
					this.aString18 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean239 = true;
					this.anInt989 = 0;
					this.aBoolean262 = true;
					this.aString31 = "";
					this.anInt863 = 2;
					this.aString18 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt979 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean239 = true;
				this.anInt989 = 0;
				this.aBoolean262 = true;
				this.aString31 = "";
				this.anInt863 = 4;
				this.aString18 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean239 = true;
				this.anInt989 = 0;
				this.aBoolean262 = true;
				this.aString31 = "";
				this.anInt863 = 5;
				this.aString18 = "Enter name of player to delete from list";
			}
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(126) int local126;
			if (local4 >= 300 && local4 <= 313) {
				local117 = (local4 - 300) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray236[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = Class24.anInt372 - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= Class24.anInt372) {
								local126 = 0;
							}
						}
						if (!Class24.aClass24Array1[local126].aBoolean99 && Class24.aClass24Array1[local126].anInt373 == local117 + (this.aBoolean259 ? 0 : 7)) {
							this.anIntArray236[local117] = local126;
							this.aBoolean258 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local117 = (local4 - 314) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray212[local117];
				if (local121 == 0) {
					local126--;
					if (local126 < 0) {
						local126 = anIntArrayArray23[local117].length - 1;
					}
				}
				if (local121 == 1) {
					local126++;
					if (local126 >= anIntArrayArray23[local117].length) {
						local126 = 0;
					}
				}
				this.anIntArray212[local117] = local126;
				this.aBoolean258 = true;
			}
			if (local4 == 324 && !this.aBoolean259) {
				this.aBoolean259 = true;
				this.method718();
			}
			if (local4 == 325 && this.aBoolean259) {
				this.aBoolean259 = false;
				this.method718();
			}
			if (local4 == 326) {
				this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 95);
				this.aClass2_Sub1_Sub4_9.method330(this.aBoolean259 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.aClass2_Sub1_Sub4_9.method330(this.anIntArray236[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.aClass2_Sub1_Sub4_9.method330(this.anIntArray212[local121]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean250 = !this.aBoolean250;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method706();
				if (this.aString24.length() > 0) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 71);
					this.aClass2_Sub1_Sub4_9.method336(Class7.method53(this.aString24));
					this.aClass2_Sub1_Sub4_9.method330(local4 - 601);
					this.aClass2_Sub1_Sub4_9.method330(this.aBoolean250 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("90757, " + arg0 + ", " + false + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method623() {
		try {
			if (this.anInt900 == 0) {
				@Pc(13) int local13 = super.anInt816;
				if (this.anInt932 == 1 && super.anInt817 >= 516 && super.anInt818 >= 160 && super.anInt817 <= 765 && super.anInt818 <= 205) {
					local13 = 0;
				}
				@Pc(44) int local44;
				@Pc(47) int local47;
				@Pc(123) int local123;
				if (this.aBoolean260) {
					if (local13 != 1) {
						local44 = super.anInt811;
						local47 = super.anInt812;
						if (this.anInt865 == 0) {
							local44 -= 4;
							local47 -= 4;
						}
						if (this.anInt865 == 1) {
							local44 -= 553;
							local47 -= 205;
						}
						if (this.anInt865 == 2) {
							local44 -= 17;
							local47 -= 357;
						}
						if (local44 < this.anInt866 - 10 || local44 > this.anInt866 + this.anInt868 + 10 || local47 < this.anInt867 - 10 || local47 > this.anInt867 + this.anInt869 + 10) {
							this.aBoolean260 = false;
							if (this.anInt865 == 1) {
								this.aBoolean251 = true;
							}
							if (this.anInt865 == 2) {
								this.aBoolean239 = true;
							}
						}
					}
					if (local13 == 1) {
						local44 = this.anInt866;
						local47 = this.anInt867;
						local123 = this.anInt868;
						@Pc(126) int local126 = super.anInt817;
						@Pc(129) int local129 = super.anInt818;
						if (this.anInt865 == 0) {
							local126 -= 4;
							local129 -= 4;
						}
						if (this.anInt865 == 1) {
							local126 -= 553;
							local129 -= 205;
						}
						if (this.anInt865 == 2) {
							local126 -= 17;
							local129 -= 357;
						}
						@Pc(148) int local148 = -1;
						for (@Pc(150) int local150 = 0; local150 < this.anInt822; local150++) {
							@Pc(165) int local165 = local47 + (this.anInt822 - 1 - local150) * 15 + 31;
							if (local126 > local44 && local126 < local44 + local123 && local129 > local165 - 13 && local129 < local165 + 3) {
								local148 = local150;
							}
						}
						if (local148 != -1) {
							this.method645(local148);
						}
						this.aBoolean260 = false;
						if (this.anInt865 == 1) {
							this.aBoolean251 = true;
						}
						if (this.anInt865 == 2) {
							this.aBoolean239 = true;
							return;
						}
					}
				} else {
					if (local13 == 1 && this.anInt822 > 0) {
						local44 = this.anIntArray239[this.anInt822 - 1];
						if (local44 == 372 || local44 == 648 || local44 == 627 || local44 == 555 || local44 == 395 || local44 == 653 || local44 == 828 || local44 == 233 || local44 == 804 || local44 == 918 || local44 == 937 || local44 == 1624) {
							local47 = this.anIntArray237[this.anInt822 - 1];
							local123 = this.anIntArray238[this.anInt822 - 1];
							@Pc(284) Class15 local284 = Class15.method120(local123);
							if (local284.aBoolean61 || local284.aBoolean59) {
								this.aBoolean257 = false;
								this.anInt994 = 0;
								this.anInt898 = local123;
								this.anInt899 = local47;
								this.anInt900 = 2;
								this.anInt901 = super.anInt817;
								this.anInt902 = super.anInt818;
								if (Class15.method120(local123).anInt187 == this.anInt963) {
									this.anInt900 = 1;
								}
								if (Class15.method120(local123).anInt187 == this.anInt959) {
									this.anInt900 = 3;
								}
								return;
							}
						}
					}
					if (local13 == 1 && (this.anInt892 == 1 || this.method600(this.anInt822 - 1)) && this.anInt822 > 2) {
						local13 = 2;
					}
					if (local13 == 1 && this.anInt822 > 0) {
						this.method645(this.anInt822 - 1);
					}
					if (local13 != 2 || this.anInt822 <= 0) {
						return;
					}
					this.method602();
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("4481, " + 8322 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method624() {
		try {
			if (this.anInt968 == 2) {
				for (@Pc(19) Class2_Sub3 local19 = (Class2_Sub3) this.aClass12_10.method111(); local19 != null; local19 = (Class2_Sub3) this.aClass12_10.method113()) {
					if (local19.anInt605 > 0) {
						local19.anInt605--;
					}
					if (local19.anInt605 != 0) {
						if (local19.anInt613 > 0) {
							local19.anInt613--;
						}
						if (local19.anInt613 == 0 && local19.anInt608 >= 1 && local19.anInt609 >= 1 && local19.anInt608 <= 102 && local19.anInt609 <= 102 && (local19.anInt610 < 0 || Class43.method449(local19.anInt610, local19.anInt612))) {
							this.method665(local19.anInt607, local19.anInt606, local19.anInt611, local19.anInt610, local19.anInt612, local19.anInt608, local19.anInt609);
							local19.anInt613 = -1;
							if (local19.anInt610 == local19.anInt602 && local19.anInt602 == -1) {
								local19.method507();
							} else if (local19.anInt610 == local19.anInt602 && local19.anInt611 == local19.anInt603 && local19.anInt612 == local19.anInt604) {
								local19.method507();
							}
						}
					} else if (local19.anInt602 < 0 || Class43.method449(local19.anInt602, local19.anInt604)) {
						this.method665(local19.anInt607, local19.anInt606, local19.anInt603, local19.anInt602, local19.anInt604, local19.anInt608, local19.anInt609);
						local19.method507();
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("35216, " + 2 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Ljava/lang/String;")
	private String method625() {
		try {
			this.anInt975 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("83409, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!RSWRPCHR;)V")
	private void method627(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			while (true) {
				if (arg1.anInt557 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method351(14);
					if (local12 != 16383) {
						if (this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local12] == null) {
							this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local12] = new Class2_Sub1_Sub3_Sub2_Sub1();
						}
						@Pc(32) Class2_Sub1_Sub3_Sub2_Sub1 local32 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local12];
						this.anIntArray235[this.anInt891++] = local12;
						local32.anInt398 = anInt943;
						@Pc(51) int local51 = arg1.method351(5);
						if (local51 > 15) {
							local51 -= 32;
						}
						@Pc(60) int local60 = arg1.method351(5);
						if (local60 > 15) {
							local60 -= 32;
						}
						@Pc(69) int local69 = arg1.method351(1);
						@Pc(74) int local74 = arg1.method351(1);
						if (local74 == 1) {
							this.anIntArray251[this.anInt941++] = local12;
						}
						local32.aClass10_1 = Class10.method105(arg1.method351(13));
						local32.anInt383 = local32.aClass10_1.aByte9;
						local32.anInt390 = local32.aClass10_1.anInt151;
						local32.anInt400 = local32.aClass10_1.anInt144;
						local32.anInt401 = local32.aClass10_1.anInt154;
						local32.anInt402 = local32.aClass10_1.anInt136;
						local32.anInt403 = local32.aClass10_1.anInt147;
						local32.anInt391 = local32.aClass10_1.anInt153;
						local32.method251(local69 == 1, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0] + local51, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0] + local60);
						continue;
					}
				}
				arg1.method352();
				return;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("74783, " + -14872 + ", " + arg0 + ", " + arg1 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method628() {
		try {
			@Pc(15) int local15 = this.anInt834 * 128 + 64;
			@Pc(22) int local22 = this.anInt835 * 128 + 64;
			@Pc(33) int local33 = this.method590(local15, this.anInt925, local22) - this.anInt836;
			if (this.anInt1020 < local15) {
				this.anInt1020 += this.anInt837 + (local15 - this.anInt1020) * this.anInt838 / 1000;
				if (this.anInt1020 > local15) {
					this.anInt1020 = local15;
				}
			}
			if (this.anInt1020 > local15) {
				this.anInt1020 -= this.anInt837 + (this.anInt1020 - local15) * this.anInt838 / 1000;
				if (this.anInt1020 < local15) {
					this.anInt1020 = local15;
				}
			}
			if (this.anInt1021 < local33) {
				this.anInt1021 += this.anInt837 + (local33 - this.anInt1021) * this.anInt838 / 1000;
				if (this.anInt1021 > local33) {
					this.anInt1021 = local33;
				}
			}
			if (this.anInt1021 > local33) {
				this.anInt1021 -= this.anInt837 + (this.anInt1021 - local33) * this.anInt838 / 1000;
				if (this.anInt1021 < local33) {
					this.anInt1021 = local33;
				}
			}
			if (this.anInt1022 < local22) {
				this.anInt1022 += this.anInt837 + (local22 - this.anInt1022) * this.anInt838 / 1000;
				if (this.anInt1022 > local22) {
					this.anInt1022 = local22;
				}
			}
			if (this.anInt1022 > local22) {
				this.anInt1022 -= this.anInt837 + (this.anInt1022 - local22) * this.anInt838 / 1000;
				if (this.anInt1022 < local22) {
					this.anInt1022 = local22;
				}
			}
			local15 = this.anInt1013 * 128 + 64;
			local22 = this.anInt1014 * 128 + 64;
			local33 = this.method590(local15, this.anInt925, local22) - this.anInt1015;
			@Pc(231) int local231 = local15 - this.anInt1020;
			@Pc(236) int local236 = local33 - this.anInt1021;
			@Pc(241) int local241 = local22 - this.anInt1022;
			@Pc(252) int local252 = (int) Math.sqrt((double) (local231 * local231 + local241 * local241));
			@Pc(263) int local263 = (int) (Math.atan2((double) local236, (double) local252) * 325.949D) & 0x7FF;
			@Pc(274) int local274 = (int) (Math.atan2((double) local231, (double) local241) * -325.949D) & 0x7FF;
			if (local263 < 128) {
				local263 = 128;
			}
			if (local263 > 383) {
				local263 = 383;
			}
			if (this.anInt1023 < local263) {
				this.anInt1023 += this.anInt1016 + (local263 - this.anInt1023) * this.anInt1017 / 1000;
				if (this.anInt1023 > local263) {
					this.anInt1023 = local263;
				}
			}
			if (this.anInt1023 > local263) {
				this.anInt1023 -= this.anInt1016 + (this.anInt1023 - local263) * this.anInt1017 / 1000;
				if (this.anInt1023 < local263) {
					this.anInt1023 = local263;
				}
			}
			@Pc(345) int local345 = local274 - this.anInt1024;
			if (local345 > 1024) {
				local345 -= 2048;
			}
			if (local345 < -1024) {
				local345 += 2048;
			}
			if (local345 > 0) {
				this.anInt1024 += this.anInt1016 + local345 * this.anInt1017 / 1000;
				this.anInt1024 &= 0x7FF;
			}
			if (local345 < 0) {
				this.anInt1024 -= this.anInt1016 + -local345 * this.anInt1017 / 1000;
				this.anInt1024 &= 0x7FF;
			}
			@Pc(403) int local403 = local274 - this.anInt1024;
			if (local403 > 1024) {
				local403 -= 2048;
			}
			if (local403 < -1024) {
				local403 += 2048;
			}
			if (local403 < 0 && local345 > 0 || local403 > 0 && local345 < 0) {
				this.anInt1024 = local274;
			}
		} catch (@Pc(424) RuntimeException local424) {
			signlink.reporterror("26303, " + 7 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method629() {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anInt957; local12++) {
				if (this.anIntArray249[local12] <= 0) {
					@Pc(21) boolean local21 = false;
					try {
						if (this.anIntArray224[local12] != this.anInt841 || this.anIntArray244[local12] != this.anInt927) {
							@Pc(54) Class2_Sub1_Sub4 local54 = Class30.method286(this.anIntArray244[local12], this.anIntArray224[local12]);
							if (System.currentTimeMillis() + (long) (local54.anInt556 / 22) > this.aLong33 + (long) (this.anInt969 / 22)) {
								this.anInt969 = local54.anInt556;
								this.aLong33 = System.currentTimeMillis();
								if (this.method651(local54.anInt556, local54.aByteArray17)) {
									this.anInt841 = this.anIntArray224[local12];
									this.anInt927 = this.anIntArray244[local12];
								} else {
									local21 = true;
								}
							}
						} else if (!this.method618()) {
							local21 = true;
						}
					} catch (@Pc(104) Exception local104) {
						if (signlink.reporterror) {
							this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 149);
							this.aClass2_Sub1_Sub4_9.method331(this.anIntArray224[local12] & 0x7FFF);
						} else {
							this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 149);
							this.aClass2_Sub1_Sub4_9.method331(-1);
						}
					}
					if (local21 && this.anIntArray249[local12] != -5) {
						this.anIntArray249[local12] = -5;
					} else {
						this.anInt957--;
						for (@Pc(149) int local149 = local12; local149 < this.anInt957; local149++) {
							this.anIntArray224[local149] = this.anIntArray224[local149 + 1];
							this.anIntArray244[local149] = this.anIntArray244[local149 + 1];
							this.anIntArray249[local149] = this.anIntArray249[local149 + 1];
						}
						local12--;
					}
				} else {
					@Pc(201) int local201 = this.anIntArray249[local12]--;
				}
			}
			if (this.anInt840 > 0) {
				this.anInt840 -= 20;
				if (this.anInt840 < 0) {
					this.anInt840 = 0;
				}
				if (this.anInt840 == 0 && this.aBoolean265 && !aBoolean264) {
					this.anInt851 = this.anInt936;
					this.aBoolean228 = true;
					this.aClass9_Sub1_1.method316(2, this.anInt851);
					return;
				}
			}
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("6173, " + -608 + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method630() {
		try {
			this.aClass32_25.method296();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt953 == 2) {
				@Pc(13) byte[] local13 = this.aClass2_Sub1_Sub2_Sub3_5.aByteArray11;
				@Pc(15) int[] local15 = Class2_Sub1_Sub2.anIntArray184;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass2_Sub1_Sub2_Sub1_8.method46(this.anInt913, 0, 0, this.anIntArray243, 256, this.anIntArray229, 33, 25, 33, 25);
				this.aClass32_26.method296();
				Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
			} else {
				@Pc(67) int local67 = this.anInt913 + this.anInt842 & 0x7FF;
				@Pc(74) int local74 = aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 / 32 + 48;
				local18 = 464 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 / 32;
				this.aClass2_Sub1_Sub2_Sub1_17.method46(local67, 5, 25, this.anIntArray231, this.anInt984 + 256, this.anIntArray234, 151, local18, 146, local74);
				this.aClass2_Sub1_Sub2_Sub1_8.method46(this.anInt913, 0, 0, this.anIntArray243, 256, this.anIntArray229, 33, 25, 33, 25);
				for (local20 = 0; local20 < this.anInt895; local20++) {
					local74 = this.anIntArray241[local20] * 4 + 2 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 / 32;
					local18 = this.anIntArray242[local20] * 4 + 2 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 / 32;
					this.method709(local74, local18, this.aClass2_Sub1_Sub2_Sub1Array8[local20]);
				}
				@Pc(169) int local169;
				for (@Pc(165) int local165 = 0; local165 < 104; local165++) {
					for (local169 = 0; local169 < 104; local169++) {
						@Pc(181) Class12 local181 = this.aClass12ArrayArrayArray1[this.anInt925][local165][local169];
						if (local181 != null) {
							local74 = local165 * 4 + 2 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 / 32;
							local18 = local169 * 4 + 2 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 / 32;
							this.method709(local74, local18, this.aClass2_Sub1_Sub2_Sub1_3);
						}
					}
				}
				for (local169 = 0; local169 < this.anInt891; local169++) {
					@Pc(232) Class2_Sub1_Sub3_Sub2_Sub1 local232 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[this.anIntArray235[local169]];
					if (local232 != null && local232.method249()) {
						@Pc(241) Class10 local241 = local232.aClass10_1;
						if (local241.anIntArray37 != null) {
							local241 = local241.method100();
						}
						if (local241 != null && local241.aBoolean44 && local241.aBoolean39) {
							local74 = local232.anInt385 / 32 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 / 32;
							local18 = local232.anInt386 / 32 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 / 32;
							this.method709(local74, local18, this.aClass2_Sub1_Sub2_Sub1_4);
						}
					}
				}
				@Pc(300) Class2_Sub1_Sub3_Sub2_Sub2 local300;
				for (@Pc(290) int local290 = 0; local290 < this.anInt940; local290++) {
					local300 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[this.anIntArray250[local290]];
					if (local300 != null && local300.method249()) {
						local74 = local300.anInt385 / 32 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 / 32;
						local18 = local300.anInt386 / 32 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 / 32;
						@Pc(328) boolean local328 = false;
						@Pc(332) long local332 = Class7.method53(local300.aString11);
						for (@Pc(334) int local334 = 0; local334 < this.anInt970; local334++) {
							if (local332 == this.aLongArray3[local334] && this.anIntArray275[local334] != 0) {
								local328 = true;
								break;
							}
						}
						@Pc(359) boolean local359 = false;
						if (aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt437 != 0 && local300.anInt437 != 0 && aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt437 == local300.anInt437) {
							local359 = true;
						}
						if (local328) {
							this.method709(local74, local18, this.aClass2_Sub1_Sub2_Sub1_6);
						} else if (local359) {
							this.method709(local74, local18, this.aClass2_Sub1_Sub2_Sub1_7);
						} else {
							this.method709(local74, local18, this.aClass2_Sub1_Sub2_Sub1_5);
						}
					}
				}
				if (this.anInt844 != 0 && anInt943 % 20 < 10) {
					if (this.anInt844 == 1 && this.anInt921 >= 0 && this.anInt921 < this.aClass2_Sub1_Sub3_Sub2_Sub1Array1.length) {
						@Pc(433) Class2_Sub1_Sub3_Sub2_Sub1 local433 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[this.anInt921];
						if (local433 != null) {
							local74 = local433.anInt385 / 32 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 / 32;
							local18 = local433.anInt386 / 32 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 / 32;
							this.method648(local74, this.aClass2_Sub1_Sub2_Sub1_10, local18);
						}
					}
					if (this.anInt844 == 2) {
						local74 = (this.anInt883 - this.anInt1026) * 4 + 2 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 / 32;
						local18 = (this.anInt884 - this.anInt1027) * 4 + 2 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 / 32;
						this.method648(local74, this.aClass2_Sub1_Sub2_Sub1_10, local18);
					}
					if (this.anInt844 == 10 && this.anInt950 >= 0 && this.anInt950 < this.aClass2_Sub1_Sub3_Sub2_Sub2Array1.length) {
						local300 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[this.anInt950];
						if (local300 != null) {
							local74 = local300.anInt385 / 32 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 / 32;
							local18 = local300.anInt386 / 32 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 / 32;
							this.method648(local74, this.aClass2_Sub1_Sub2_Sub1_10, local18);
						}
					}
				}
				if (this.anInt986 != 0) {
					local74 = this.anInt986 * 4 + 2 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 / 32;
					local18 = this.anInt987 * 4 + 2 - aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 / 32;
					this.method709(local74, local18, this.aClass2_Sub1_Sub2_Sub1_9);
				}
				Class2_Sub1_Sub2.method478(97, 3, 3, 78, 16777215);
				this.aClass32_26.method296();
				Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
			}
		} catch (@Pc(612) RuntimeException local612) {
			signlink.reporterror("99038, " + -78 + ", " + local612.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method631(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt996 = 0;
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
						this.anInt996 = 0;
						label49: for (local26 = 0; local26 < Class34.anInt579; local26++) {
							@Pc(75) Class34 local75 = Class34.method385(local26);
							if (local75.anInt589 == -1 && local75.aString13 != null) {
								@Pc(86) String local86 = local75.aString13.toLowerCase();
								for (@Pc(88) int local88 = 0; local88 < local22; local88++) {
									if (local86.indexOf(local20[local88]) == -1) {
										continue label49;
									}
								}
								this.aStringArray14[this.anInt996] = local86;
								this.anIntArray273[this.anInt996] = local26;
								this.anInt996++;
								if (this.anInt996 >= this.aStringArray14.length) {
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
			signlink.reporterror("45768, " + false + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method632() {
		try {
			if (super.anInt816 == 1) {
				if (super.anInt817 >= 539 && super.anInt817 <= 573 && super.anInt818 >= 169 && super.anInt818 < 205 && this.anIntArray248[0] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 0;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 569 && super.anInt817 <= 599 && super.anInt818 >= 168 && super.anInt818 < 205 && this.anIntArray248[1] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 1;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 597 && super.anInt817 <= 627 && super.anInt818 >= 168 && super.anInt818 < 205 && this.anIntArray248[2] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 2;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 625 && super.anInt817 <= 669 && super.anInt818 >= 168 && super.anInt818 < 203 && this.anIntArray248[3] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 3;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 666 && super.anInt817 <= 696 && super.anInt818 >= 168 && super.anInt818 < 205 && this.anIntArray248[4] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 4;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 694 && super.anInt817 <= 724 && super.anInt818 >= 168 && super.anInt818 < 205 && this.anIntArray248[5] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 5;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 722 && super.anInt817 <= 756 && super.anInt818 >= 169 && super.anInt818 < 205 && this.anIntArray248[6] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 6;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 540 && super.anInt817 <= 574 && super.anInt818 >= 466 && super.anInt818 < 502 && this.anIntArray248[7] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 7;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 572 && super.anInt817 <= 602 && super.anInt818 >= 466 && super.anInt818 < 503 && this.anIntArray248[8] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 8;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 599 && super.anInt817 <= 629 && super.anInt818 >= 466 && super.anInt818 < 503 && this.anIntArray248[9] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 9;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 627 && super.anInt817 <= 671 && super.anInt818 >= 467 && super.anInt818 < 502 && this.anIntArray248[10] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 10;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 669 && super.anInt817 <= 699 && super.anInt818 >= 466 && super.anInt818 < 503 && this.anIntArray248[11] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 11;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 696 && super.anInt817 <= 726 && super.anInt818 >= 466 && super.anInt818 < 503 && this.anIntArray248[12] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 12;
					this.aBoolean255 = true;
				}
				if (super.anInt817 >= 724 && super.anInt817 <= 758 && super.anInt818 >= 466 && super.anInt818 < 502 && this.anIntArray248[13] != -1) {
					this.aBoolean251 = true;
					this.anInt962 = 13;
					this.aBoolean255 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("53290, " + 35473 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method633() {
		try {
			try {
				if (this.aClass28_1 != null) {
					this.aClass28_1.method279();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass28_1 = null;
			this.aBoolean238 = false;
			this.anInt1035 = 0;
			this.aString29 = "";
			this.aString30 = "";
			this.anInt975 += 0;
			this.method680(this.anInt1030);
			this.aClass46_1.method517(156);
			for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
				this.aClass21Array1[local38].method209();
			}
			System.gc();
			this.method636();
			this.anInt936 = -1;
			this.anInt851 = -1;
			this.anInt840 = 0;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("28934, " + 0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method634(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (!arg2) {
				this.aClass2_Sub1_Sub4_9.method330(142);
			}
			@Pc(17) int local17;
			if (this.aClass32_26 != null) {
				this.aClass32_26.method296();
				Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
				local17 = 151;
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass2_Sub1_Sub2_Sub2_3.method85(0, 257, local17, arg1);
				this.aClass2_Sub1_Sub2_Sub2_3.method85(16777215, 256, local17 - 1, arg1);
				local17 += 15;
				if (arg0 != null) {
					this.aClass2_Sub1_Sub2_Sub2_3.method85(0, 257, local17, arg0);
					this.aClass2_Sub1_Sub2_Sub2_3.method85(16777215, 256, local17 - 1, arg0);
				}
				this.aClass32_26.method297(4, 4, super.aGraphics2);
			} else if (super.aClass32_2 != null) {
				super.aClass32_2.method296();
				Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray219;
				local17 = 251;
				Class2_Sub1_Sub2.method478(233, 300, 50, 221, 0);
				Class2_Sub1_Sub2.method479(16777215, 300, 233, 50, 221);
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass2_Sub1_Sub2_Sub2_3.method85(0, 383, local17, arg1);
				this.aClass2_Sub1_Sub2_Sub2_3.method85(16777215, 382, local17 - 1, arg1);
				local17 += 15;
				if (arg0 != null) {
					this.aClass2_Sub1_Sub2_Sub2_3.method85(0, 383, local17, arg0);
					this.aClass2_Sub1_Sub2_Sub2_3.method85(16777215, 382, local17 - 1, arg0);
				}
				super.aClass32_2.method297(0, 0, super.aGraphics2);
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("41954, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IGMZHLWJ;)Z")
	private boolean method635(@OriginalArg(1) Class15 arg0) {
		try {
			if (this.anInt1037 != 7) {
				this.aBoolean252 = !this.aBoolean252;
			}
			@Pc(16) int local16 = arg0.anInt204;
			if (local16 >= 1 && local16 <= 200 || local16 >= 701 && local16 <= 900) {
				if (local16 >= 801) {
					local16 -= 701;
				} else if (local16 >= 701) {
					local16 -= 601;
				} else if (local16 >= 101) {
					local16 -= 101;
				} else {
					local16--;
				}
				this.aStringArray8[this.anInt822] = "Remove @whi@" + this.aStringArray11[local16];
				this.anIntArray239[this.anInt822] = 408;
				this.anInt822++;
				this.aStringArray8[this.anInt822] = "Message @whi@" + this.aStringArray11[local16];
				this.anIntArray239[this.anInt822] = 901;
				this.anInt822++;
				return true;
			} else if (local16 >= 401 && local16 <= 500) {
				this.aStringArray8[this.anInt822] = "Remove @whi@" + arg0.aString4;
				this.anIntArray239[this.anInt822] = 126;
				this.anInt822++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("121, " + 7 + ", " + arg0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method636() {
		try {
			signlink.aBoolean272 = false;
			signlink.anInt1057 = 0;
			signlink.midi = "stop";
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("94050, " + 6 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
	private boolean method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(20) int local20 = this.aClass46_1.method547(this.anInt925, arg0, arg1, arg2);
			if (local20 == -1) {
				return false;
			}
			@Pc(29) int local29 = local20 & 0x1F;
			@Pc(35) int local35 = local20 >> 6 & 0x3;
			if (local29 == 10 || local29 == 11 || local29 == 22) {
				@Pc(47) Class41 local47 = Class41.method403(local7);
				@Pc(55) int local55;
				@Pc(58) int local58;
				if (local35 == 0 || local35 == 2) {
					local55 = local47.anInt663;
					local58 = local47.anInt646;
				} else {
					local55 = local47.anInt646;
					local58 = local47.anInt663;
				}
				@Pc(69) int local69 = local47.anInt644;
				if (local35 != 0) {
					local69 = (local69 << local35 & 0xF) + (local69 >> 4 - local35);
				}
				this.method642(local69, local55, arg0, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, arg1, false, 2, local58);
			} else {
				this.method642(0, 0, arg0, local29 + 1, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], local35, arg1, false, 2, 0);
			}
			this.anInt1040 = super.anInt817;
			this.anInt1041 = super.anInt818;
			this.anInt1043 = 2;
			this.anInt1042 = 0;
			return true;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("82295, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method638() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray252[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray252[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray253[local54] = (this.anIntArray252[local54 - 1] + this.anIntArray252[local54 + 1] + this.anIntArray252[local54 - 128] + this.anIntArray252[local54 + 128]) / 4;
				}
			}
			this.anInt929 += 128;
			if (this.anInt929 > this.anIntArray266.length) {
				this.anInt929 -= this.anIntArray266.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method715(this.aClass2_Sub1_Sub2_Sub3Array2[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray253[local166 + 128] - this.anIntArray266[local166 + this.anInt929 & this.anIntArray266.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray252[local166] = local189;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray276[local54] = this.anIntArray276[local54 + 1];
			}
			this.anIntArray276[255] = (int) (Math.sin((double) anInt943 / 14.0D) * 16.0D + Math.sin((double) anInt943 / 15.0D) * 14.0D + Math.sin((double) anInt943 / 16.0D) * 12.0D);
			if (this.anInt1003 > 0) {
				this.anInt1003 -= 4;
			}
			if (this.anInt1004 > 0) {
				this.anInt1004 -= 4;
			}
			if (this.anInt1003 == 0 && this.anInt1004 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt1003 = 1024;
				}
				if (local166 == 1) {
					this.anInt1004 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("78568, " + 15371 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean268 || this.aBoolean246 || this.aBoolean240) {
				this.method653();
			} else {
				anInt833++;
				if (this.aBoolean238) {
					this.method703(this.anInt880);
				} else {
					this.method720(false);
				}
				this.anInt983 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("32618, " + 7 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IGMZHLWJ;B)V")
	private void method639(@OriginalArg(0) Class15 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt204;
			@Pc(69) int local69;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local69 = this.anInt970;
					if (this.anInt971 != 2) {
						local69 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local69) {
						arg0.aString4 = "";
						arg0.anInt172 = 0;
					} else {
						if (this.anIntArray275[local4] == 0) {
							arg0.aString4 = "@red@Offline";
						} else if (this.anIntArray275[local4] < 200) {
							if (this.anIntArray275[local4] == anInt1001) {
								arg0.aString4 = "@gre@World" + (this.anIntArray275[local4] - 9);
							} else {
								arg0.aString4 = "@yel@World" + (this.anIntArray275[local4] - 9);
							}
						} else if (this.anIntArray275[local4] == anInt1001) {
							arg0.aString4 = "@gre@Classic" + (this.anIntArray275[local4] - 219);
						} else {
							arg0.aString4 = "@yel@Classic" + (this.anIntArray275[local4] - 219);
						}
						arg0.anInt172 = 1;
					}
				} else if (local4 == 203) {
					local69 = this.anInt970;
					if (this.anInt971 != 2) {
						local69 = 0;
					}
					arg0.anInt173 = local69 * 15 + 20;
					if (arg0.anInt173 <= arg0.anInt199) {
						arg0.anInt173 = arg0.anInt199 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt971 == 0) {
						arg0.aString4 = "Loading ignore list";
						arg0.anInt172 = 0;
					} else if (local4 == 1 && this.anInt971 == 0) {
						arg0.aString4 = "Please wait...";
						arg0.anInt172 = 0;
					} else {
						local69 = this.anInt882;
						if (this.anInt971 == 0) {
							local69 = 0;
						}
						if (local4 >= local69) {
							arg0.aString4 = "";
							arg0.anInt172 = 0;
						} else {
							arg0.aString4 = Class7.method57(Class7.method54(this.aLongArray4[local4]));
							arg0.anInt172 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt173 = this.anInt882 * 15 + 20;
					if (arg0.anInt173 <= arg0.anInt199) {
						arg0.anInt173 = arg0.anInt199 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt184 = 150;
					arg0.anInt185 = (int) (Math.sin((double) anInt943 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean258) {
						for (local69 = 0; local69 < 7; local69++) {
							@Pc(382) int local382 = this.anIntArray236[local69];
							if (local382 >= 0 && !Class24.aClass24Array1[local382].method239(this.anInt918)) {
								return;
							}
						}
						this.aBoolean258 = false;
						@Pc(402) Class2_Sub1_Sub3_Sub5[] local402 = new Class2_Sub1_Sub3_Sub5[7];
						@Pc(404) int local404 = 0;
						for (@Pc(406) int local406 = 0; local406 < 7; local406++) {
							@Pc(413) int local413 = this.anIntArray236[local406];
							if (local413 >= 0) {
								local402[local404++] = Class24.aClass24Array1[local413].method240(this.aBoolean244);
							}
						}
						@Pc(437) Class2_Sub1_Sub3_Sub5 local437 = new Class2_Sub1_Sub3_Sub5(local402, local404, this.aBoolean224);
						for (@Pc(439) int local439 = 0; local439 < 5; local439++) {
							if (this.anIntArray212[local439] != 0) {
								local437.method437(anIntArrayArray23[local439][0], anIntArrayArray23[local439][this.anIntArray212[local439]]);
								if (local439 == 1) {
									local437.method437(anIntArray274[0], anIntArray274[this.anIntArray212[local439]]);
								}
							}
						}
						local437.method430();
						local437.method431(Class23.aClass23Array1[aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt391].anIntArray82[0]);
						local437.method440(64, 850, -30, -50, -30, true);
						arg0.anInt208 = 5;
						arg0.anInt209 = 0;
						Class15.method123(local437, (byte) 2);
					}
				} else if (local4 == 324) {
					if (this.aClass2_Sub1_Sub2_Sub1_12 == null) {
						this.aClass2_Sub1_Sub2_Sub1_12 = arg0.aClass2_Sub1_Sub2_Sub1_1;
						this.aClass2_Sub1_Sub2_Sub1_13 = arg0.aClass2_Sub1_Sub2_Sub1_2;
					}
					if (this.aBoolean259) {
						arg0.aClass2_Sub1_Sub2_Sub1_1 = this.aClass2_Sub1_Sub2_Sub1_13;
					} else {
						arg0.aClass2_Sub1_Sub2_Sub1_1 = this.aClass2_Sub1_Sub2_Sub1_12;
					}
				} else if (local4 == 325) {
					if (this.aClass2_Sub1_Sub2_Sub1_12 == null) {
						this.aClass2_Sub1_Sub2_Sub1_12 = arg0.aClass2_Sub1_Sub2_Sub1_1;
						this.aClass2_Sub1_Sub2_Sub1_13 = arg0.aClass2_Sub1_Sub2_Sub1_2;
					}
					if (this.aBoolean259) {
						arg0.aClass2_Sub1_Sub2_Sub1_1 = this.aClass2_Sub1_Sub2_Sub1_12;
					} else {
						arg0.aClass2_Sub1_Sub2_Sub1_1 = this.aClass2_Sub1_Sub2_Sub1_13;
					}
				} else if (local4 == 600) {
					arg0.aString4 = this.aString24;
					if (anInt943 % 20 < 10) {
						arg0.aString4 = arg0.aString4 + "|";
					} else {
						arg0.aString4 = arg0.aString4 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt1034 < 1) {
							arg0.aString4 = "";
						} else if (this.aBoolean250) {
							arg0.anInt177 = 16711680;
							arg0.aString4 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt177 = 16777215;
							arg0.aString4 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(644) String local644;
					if (local4 == 660) {
						local69 = this.anInt998 - this.anInt922;
						if (local69 <= 0) {
							local644 = "earlier today";
						} else if (local69 == 1) {
							local644 = "yesterday";
						} else {
							local644 = local69 + " days ago";
						}
						arg0.aString4 = "You last logged in @red@" + local644 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt861 == 0) {
							arg0.aString4 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt861 <= this.anInt998) {
							arg0.aString4 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method640(this.anInt861, (byte) 4);
						} else {
							local69 = this.anInt998 + 14 - this.anInt861;
							if (local69 <= 0) {
								local644 = "Earlier today";
							} else if (local69 == 1) {
								local644 = "Yesterday";
							} else {
								local644 = local69 + " days ago";
							}
							arg0.aString4 = local644 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method640(this.anInt861, (byte) 4) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(762) String local762;
						if (this.anInt888 == 0) {
							local762 = "@yel@0 unread messages";
						} else if (this.anInt888 == 1) {
							local762 = "@gre@1 unread message";
						} else {
							local762 = "@gre@" + this.anInt888 + " unread messages";
						}
						arg0.aString4 = "You have " + local762 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt823 > 0 && this.anInt823 <= this.anInt998 + 10) {
							arg0.aString4 = "Last password change:\\n@gre@" + this.method640(this.anInt823, (byte) 4);
						} else {
							arg0.aString4 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt990 > 2 && !aBoolean263) {
							arg0.aString4 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt990 > 2) {
							arg0.aString4 = "\\n\\nYou have @gre@" + this.anInt990 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt990 > 0) {
							arg0.aString4 = "You have @gre@" + this.anInt990 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString4 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt990 > 2 && !aBoolean263) {
							arg0.aString4 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt990 > 0) {
							arg0.aString4 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString4 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt861 > this.anInt998) {
							arg0.aString4 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString4 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt971 == 0) {
				arg0.aString4 = "Loading friend list";
				arg0.anInt172 = 0;
			} else if (local4 == 1 && this.anInt971 == 1) {
				arg0.aString4 = "Connecting to friendserver";
				arg0.anInt172 = 0;
			} else if (local4 == 2 && this.anInt971 != 2) {
				arg0.aString4 = "Please wait...";
				arg0.anInt172 = 0;
			} else {
				local69 = this.anInt970;
				if (this.anInt971 != 2) {
					local69 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local69) {
					arg0.aString4 = "";
					arg0.anInt172 = 0;
				} else {
					arg0.aString4 = this.aStringArray11[local4];
					arg0.anInt172 = 1;
				}
			}
		} catch (@Pc(919) RuntimeException local919) {
			signlink.reporterror("42333, " + arg0 + ", " + 106 + ", " + local919.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private String method640(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg0 > this.anInt998 + 10) {
				return "Unknown";
			}
			@Pc(30) long local30 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(32) Calendar local32 = Calendar.getInstance();
			local32.setTime(new Date(local30));
			@Pc(42) int local42 = local32.get(5);
			@Pc(46) int local46 = local32.get(2);
			@Pc(50) int local50 = local32.get(1);
			@Pc(101) String[] local101 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local42 + "-" + local101[local46] + "-" + local50;
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("14568, " + arg0 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method641(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt882; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt882--;
						this.aBoolean251 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt882; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 151);
						this.aClass2_Sub1_Sub4_9.method336(arg0);
						break;
					}
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("93612, " + 4 + ", " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIZII)Z")
	private boolean method642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray24[local7][local11] = 0;
					this.anIntArrayArray25[local7][local11] = 99999999;
				}
			}
			local11 = arg4;
			@Pc(39) int local39 = arg5;
			this.anInt975 += 0;
			this.anIntArrayArray24[arg4][arg5] = 99;
			this.anIntArrayArray25[arg4][arg5] = 0;
			@Pc(61) byte local61 = 0;
			@Pc(63) int local63 = 0;
			this.anIntArray226[0] = arg4;
			@Pc(72) int local72 = local61 + 1;
			this.anIntArray227[0] = arg5;
			@Pc(76) boolean local76 = false;
			@Pc(80) int local80 = this.anIntArray226.length;
			@Pc(87) int[][] local87 = this.aClass21Array1[this.anInt925].anIntArrayArray7;
			@Pc(198) int local198;
			while (local63 != local72) {
				local11 = this.anIntArray226[local63];
				local39 = this.anIntArray227[local63];
				local63 = (local63 + 1) % local80;
				if (local11 == arg2 && local39 == arg7) {
					local76 = true;
					break;
				}
				if (arg3 != 0) {
					if ((arg3 < 5 || arg3 == 10) && this.aClass21Array1[this.anInt925].method218(arg6, arg2, local11, arg7, arg3 - 1, local39)) {
						local76 = true;
						break;
					}
					if (arg3 < 10 && this.aClass21Array1[this.anInt925].method219(arg2, local11, arg7, arg6, arg3 - 1, local39)) {
						local76 = true;
						break;
					}
				}
				if (arg1 != 0 && arg10 != 0 && this.aClass21Array1[this.anInt925].method220(arg7, local11, arg1, arg10, local39, arg0, arg2)) {
					local76 = true;
					break;
				}
				local198 = this.anIntArrayArray25[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray24[local11 - 1][local39] == 0 && (local87[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray226[local72] = local11 - 1;
					this.anIntArray227[local72] = local39;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 - 1][local39] = 2;
					this.anIntArrayArray25[local11 - 1][local39] = local198;
				}
				if (local11 < 103 && this.anIntArrayArray24[local11 + 1][local39] == 0 && (local87[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray226[local72] = local11 + 1;
					this.anIntArray227[local72] = local39;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 + 1][local39] = 8;
					this.anIntArrayArray25[local11 + 1][local39] = local198;
				}
				if (local39 > 0 && this.anIntArrayArray24[local11][local39 - 1] == 0 && (local87[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray226[local72] = local11;
					this.anIntArray227[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11][local39 - 1] = 1;
					this.anIntArrayArray25[local11][local39 - 1] = local198;
				}
				if (local39 < 103 && this.anIntArrayArray24[local11][local39 + 1] == 0 && (local87[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray226[local72] = local11;
					this.anIntArray227[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11][local39 + 1] = 4;
					this.anIntArrayArray25[local11][local39 + 1] = local198;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray24[local11 - 1][local39 - 1] == 0 && (local87[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local87[local11 - 1][local39] & 0x1280108) == 0 && (local87[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray226[local72] = local11 - 1;
					this.anIntArray227[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = local198;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray24[local11 + 1][local39 - 1] == 0 && (local87[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local87[local11 + 1][local39] & 0x1280180) == 0 && (local87[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray226[local72] = local11 + 1;
					this.anIntArray227[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = local198;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray24[local11 - 1][local39 + 1] == 0 && (local87[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local87[local11 - 1][local39] & 0x1280108) == 0 && (local87[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray226[local72] = local11 - 1;
					this.anIntArray227[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = local198;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray24[local11 + 1][local39 + 1] == 0 && (local87[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local87[local11 + 1][local39] & 0x1280180) == 0 && (local87[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray226[local72] = local11 + 1;
					this.anIntArray227[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = local198;
				}
			}
			this.anInt896 = 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local76) {
				if (arg8) {
					local198 = 100;
					for (local814 = 1; local814 < 2; local814++) {
						for (local820 = arg2 - local814; local820 <= arg2 + local814; local820++) {
							for (local826 = arg7 - local814; local826 <= arg7 + local814; local826++) {
								if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray25[local820][local826] < local198) {
									local198 = this.anIntArrayArray25[local820][local826];
									local11 = local820;
									local39 = local826;
									this.anInt896 = 1;
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
			this.anIntArray226[0] = local11;
			local63 = local887 + 1;
			this.anIntArray227[0] = local39;
			local198 = local814 = this.anIntArrayArray24[local11][local39];
			while (local11 != arg4 || local39 != arg5) {
				if (local198 != local814) {
					local814 = local198;
					this.anIntArray226[local63] = local11;
					this.anIntArray227[local63++] = local39;
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
				local198 = this.anIntArrayArray24[local11][local39];
			}
			if (local63 > 0) {
				local80 = local63;
				if (local63 > 25) {
					local80 = 25;
				}
				local63--;
				local820 = this.anIntArray226[local63];
				local826 = this.anIntArray227[local63];
				if (arg9 == 0) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 165);
					this.aClass2_Sub1_Sub4_9.method330(local80 + local80 + 3);
				}
				if (arg9 == 1) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 46);
					this.aClass2_Sub1_Sub4_9.method330(local80 + local80 + 3 + 14);
				}
				if (arg9 == 2) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 197);
					this.aClass2_Sub1_Sub4_9.method330(local80 + local80 + 3);
				}
				this.anInt986 = this.anIntArray226[0];
				this.anInt987 = this.anIntArray227[0];
				for (@Pc(1048) int local1048 = 1; local1048 < local80; local1048++) {
					local63--;
					this.aClass2_Sub1_Sub4_9.method357(this.anIntArray226[local63] - local820);
					this.aClass2_Sub1_Sub4_9.method356(this.anIntArray227[local63] - local826);
				}
				this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local820 + this.anInt1026);
				this.aClass2_Sub1_Sub4_9.method356(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass2_Sub1_Sub4_9.method331(local826 + this.anInt1027);
				return true;
			} else if (arg9 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1113) RuntimeException local1113) {
			signlink.reporterror("29454, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			if (!this.aBoolean268 && !this.aBoolean246 && !this.aBoolean240) {
				anInt943++;
				if (this.anInt827 > 6 || this.anInt827 < 6) {
					for (@Pc(25) int local25 = 1; local25 > 0; local25++) {
					}
				}
				if (this.aBoolean238) {
					this.method678();
				} else {
					this.method707();
				}
				this.method619();
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("82522, " + 6 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)I")
	private int method643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) int local9 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local9 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local9 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("53588, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method645(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray237[arg0];
				@Pc(14) int local14 = this.anIntArray238[arg0];
				@Pc(19) int local19 = this.anIntArray239[arg0];
				@Pc(24) int local24 = this.anIntArray240[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt989 != 0 && local19 != 1843) {
					this.anInt989 = 0;
					this.aBoolean239 = true;
				}
				if (local19 == 627) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 27);
					this.aClass2_Sub1_Sub4_9.method364(local24);
					this.aClass2_Sub1_Sub4_9.method331(local14);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				@Pc(113) Class15 local113;
				@Pc(131) int local131;
				if (local19 == 50) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 187);
					this.aClass2_Sub1_Sub4_9.method331(local14);
					local113 = Class15.method120(local14);
					if (local113.anIntArrayArray6 != null && local113.anIntArrayArray6[0][0] == 5) {
						local131 = local113.anIntArrayArray6[0][1];
						this.anIntArray228[local131] = 1 - this.anIntArray228[local131];
						this.method683(local131);
						this.aBoolean251 = true;
					}
				}
				if (local19 == 682) {
					local113 = Class15.method120(local14);
					@Pc(156) boolean local156 = true;
					if (local113.anInt204 > 0) {
						local156 = this.method622(local113);
					}
					if (local156) {
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 187);
						this.aClass2_Sub1_Sub4_9.method331(local14);
					}
				}
				if (local19 == 233) {
					anInt917++;
					if (anInt917 >= 107) {
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 51);
						this.aClass2_Sub1_Sub4_9.method334(0);
						anInt917 = 0;
					}
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 100);
					this.aClass2_Sub1_Sub4_9.method331(local9);
					this.aClass2_Sub1_Sub4_9.method331(local24);
					this.aClass2_Sub1_Sub4_9.method331(local14);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				@Pc(278) String local278;
				@Pc(282) int local282;
				@Pc(257) String local257;
				if (local19 == 356 || local19 == 654) {
					local257 = this.aStringArray8[arg0];
					local131 = local257.indexOf("@whi@");
					if (local131 != -1) {
						local257 = local257.substring(local131 + 5).trim();
						local278 = Class7.method57(Class7.method54(Class7.method53(local257)));
						@Pc(280) boolean local280 = false;
						for (local282 = 0; local282 < this.anInt940; local282++) {
							@Pc(292) Class2_Sub1_Sub3_Sub2_Sub2 local292 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[this.anIntArray250[local282]];
							if (local292 != null && local292.aString11 != null && local292.aString11.equalsIgnoreCase(local278)) {
								this.method642(0, 1, local292.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local292.anIntArray94[0], false, 2, 1);
								if (local19 == 356) {
									this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 110);
									this.aClass2_Sub1_Sub4_9.method364(this.anIntArray250[local282]);
								}
								if (local19 == 654) {
									this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 161);
									this.aClass2_Sub1_Sub4_9.method331(this.anIntArray250[local282]);
								}
								local280 = true;
								break;
							}
						}
						if (!local280) {
							this.method607("", 0, "Unable to find " + local278, this.aByte28);
						}
					}
				}
				@Pc(394) Class2_Sub1_Sub3_Sub2_Sub1 local394;
				if (local19 == 823) {
					local394 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local24];
					if (local394 != null) {
						this.method642(0, 1, local394.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local394.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 172);
						this.aClass2_Sub1_Sub4_9.method331(local24);
					}
				}
				if (local19 == 40) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 11);
					this.aClass2_Sub1_Sub4_9.method364(local24);
					this.aClass2_Sub1_Sub4_9.method331(local9);
					this.aClass2_Sub1_Sub4_9.method363(this.anInt933);
					this.aClass2_Sub1_Sub4_9.method331(local14);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				if (local19 == 248) {
					local394 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local24];
					if (local394 != null) {
						this.method642(0, 1, local394.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local394.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 211);
						this.aClass2_Sub1_Sub4_9.method363(local24);
					}
				}
				@Pc(591) boolean local591;
				if (local19 == 617) {
					local591 = this.method642(0, 0, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 0);
					if (!local591) {
						this.method642(0, 1, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 1);
					}
					this.anInt1040 = super.anInt817;
					this.anInt1041 = super.anInt818;
					this.anInt1043 = 2;
					this.anInt1042 = 0;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 215);
					this.aClass2_Sub1_Sub4_9.method331(this.anInt933);
					this.aClass2_Sub1_Sub4_9.method331(local14 + this.anInt1027);
					this.aClass2_Sub1_Sub4_9.method363(local9 + this.anInt1026);
					this.aClass2_Sub1_Sub4_9.method363(local24);
				}
				if (local19 == 14) {
					if (this.aBoolean260) {
						this.aClass46_1.method555(local14 - 4, local9 - 4);
					} else {
						this.aClass46_1.method555(super.anInt818 - 4, super.anInt817 - 4);
					}
				}
				@Pc(695) Class34 local695;
				@Pc(704) String local704;
				if (local19 == 1684) {
					local695 = Class34.method385(local24);
					if (local695.aByteArray18 == null) {
						local704 = "It's a " + local695.aString13 + ".";
					} else {
						local704 = new String(local695.aByteArray18);
					}
					this.method607("", 0, local704, this.aByte28);
				}
				if (local19 == 186 && this.method637(local9, local14, local24)) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 10);
					this.aClass2_Sub1_Sub4_9.method364(this.anInt933);
					this.aClass2_Sub1_Sub4_9.method331(local24 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub4_9.method363(local9 + this.anInt1026);
					this.aClass2_Sub1_Sub4_9.method363(local14 + this.anInt1027);
				}
				if (local19 == 1987) {
					local394 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local24];
					if (local394 != null) {
						@Pc(783) Class10 local783 = local394.aClass10_1;
						if (local783.anIntArray37 != null) {
							local783 = local783.method100();
						}
						if (local783 != null) {
							if (local783.aByteArray9 == null) {
								local278 = "It's a " + local783.aString1 + ".";
							} else {
								local278 = new String(local783.aByteArray9);
							}
							this.method607("", 0, local278, this.aByte28);
						}
					}
				}
				if (local19 == 555) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 171);
					this.aClass2_Sub1_Sub4_9.method364(local9);
					this.aClass2_Sub1_Sub4_9.method364(local24);
					this.aClass2_Sub1_Sub4_9.method364(local14);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				if (local19 == 648) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 103);
					this.aClass2_Sub1_Sub4_9.method363(local14);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local24);
					this.aClass2_Sub1_Sub4_9.method363(local9);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				if (local19 == 442) {
					local394 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local24];
					if (local394 != null) {
						this.method642(0, 1, local394.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local394.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 108);
						this.aClass2_Sub1_Sub4_9.method331(this.anInt946);
						this.aClass2_Sub1_Sub4_9.method363(local24);
						this.aClass2_Sub1_Sub4_9.method331(this.anInt947);
						this.aClass2_Sub1_Sub4_9.method363(this.anInt948);
					}
				}
				if (local19 == 674) {
					local394 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local24];
					if (local394 != null) {
						this.method642(0, 1, local394.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local394.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 220);
						this.aClass2_Sub1_Sub4_9.method331(local24);
					}
				}
				if (local19 == 443) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 229);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, this.anInt947);
					this.aClass2_Sub1_Sub4_9.method363(local14);
					this.aClass2_Sub1_Sub4_9.method331(this.anInt946);
					this.aClass2_Sub1_Sub4_9.method331(local24);
					this.aClass2_Sub1_Sub4_9.method364(local9);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, this.anInt948);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				if (local19 == 134) {
					local591 = this.method642(0, 0, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 0);
					if (!local591) {
						this.method642(0, 1, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 1);
					}
					this.anInt1040 = super.anInt817;
					this.anInt1041 = super.anInt818;
					this.anInt1043 = 2;
					this.anInt1042 = 0;
					anInt828 += local24;
					if (anInt828 >= 60) {
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 123);
						anInt828 = 0;
					}
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 126);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9 + this.anInt1026);
					this.aClass2_Sub1_Sub4_9.method331(local14 + this.anInt1027);
					this.aClass2_Sub1_Sub4_9.method331(local24);
				}
				if (local19 == 1624) {
					local695 = Class34.method385(local24);
					@Pc(1248) Class15 local1248 = Class15.method120(local14);
					if (local1248 != null && local1248.anIntArray52[local9] >= 100000) {
						local704 = local1248.anIntArray52[local9] + " x " + local695.aString13;
					} else if (local695.aByteArray18 == null) {
						local704 = "It's a " + local695.aString13 + ".";
					} else {
						local704 = new String(local695.aByteArray18);
					}
					this.method607("", 0, local704, this.aByte28);
				}
				if (local19 == 1891) {
					@Pc(1311) int local1311 = local24 >> 14 & 0x7FFF;
					@Pc(1314) Class41 local1314 = Class41.method403(local1311);
					if (local1314.aByteArray19 == null) {
						local278 = "It's a " + local1314.aString14 + ".";
					} else {
						local278 = new String(local1314.aByteArray19);
					}
					this.method607("", 0, local278, this.aByte28);
				}
				if (local19 == 858) {
					local591 = this.method642(0, 0, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 0);
					if (!local591) {
						this.method642(0, 1, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 1);
					}
					this.anInt1040 = super.anInt817;
					this.anInt1041 = super.anInt818;
					this.anInt1043 = 2;
					this.anInt1042 = 0;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 122);
					this.aClass2_Sub1_Sub4_9.method364(local14 + this.anInt1027);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9 + this.anInt1026);
					this.aClass2_Sub1_Sub4_9.method363(local24);
				}
				if (local19 == 515) {
					this.method706();
				}
				if (local19 == 372) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 94);
					this.aClass2_Sub1_Sub4_9.method364(local9);
					this.aClass2_Sub1_Sub4_9.method363(local14);
					this.aClass2_Sub1_Sub4_9.method364(local24);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				@Pc(1499) Class2_Sub1_Sub3_Sub2_Sub2 local1499;
				if (local19 == 117) {
					local1499 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local24];
					if (local1499 != null) {
						this.method642(0, 1, local1499.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local1499.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 82);
						this.aClass2_Sub1_Sub4_9.method331(local24);
					}
				}
				if (local19 == 852) {
					local591 = this.method642(0, 0, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 0);
					if (!local591) {
						this.method642(0, 1, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 1);
					}
					this.anInt1040 = super.anInt817;
					this.anInt1041 = super.anInt818;
					this.anInt1043 = 2;
					this.anInt1042 = 0;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 179);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9 + this.anInt1026);
					this.aClass2_Sub1_Sub4_9.method331(local24);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local14 + this.anInt1027);
				}
				@Pc(1662) long local1662;
				if (local19 == 901) {
					local257 = this.aStringArray8[arg0];
					local131 = local257.indexOf("@whi@");
					if (local131 != -1) {
						local1662 = Class7.method53(local257.substring(local131 + 5).trim());
						local282 = -1;
						for (@Pc(1666) int local1666 = 0; local1666 < this.anInt970; local1666++) {
							if (this.aLongArray3[local1666] == local1662) {
								local282 = local1666;
								break;
							}
						}
						if (local282 != -1 && this.anIntArray275[local282] > 0) {
							this.aBoolean239 = true;
							this.anInt989 = 0;
							this.aBoolean262 = true;
							this.aString31 = "";
							this.anInt863 = 3;
							this.aLong30 = this.aLongArray3[local282];
							this.aString18 = "Enter message to send to " + this.aStringArray11[local282];
						}
					}
				}
				if (local19 == 944) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 187);
					this.aClass2_Sub1_Sub4_9.method331(local14);
					local113 = Class15.method120(local14);
					if (local113.anIntArrayArray6 != null && local113.anIntArrayArray6[0][0] == 5) {
						local131 = local113.anIntArrayArray6[0][1];
						if (this.anIntArray228[local131] != local113.anIntArray47[0]) {
							this.anIntArray228[local131] = local113.anIntArray47[0];
							this.method683(local131);
							this.aBoolean251 = true;
						}
					}
				}
				if (local19 == 1580) {
					this.method637(local9, local14, local24);
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 150);
					this.aClass2_Sub1_Sub4_9.method364(local14 + this.anInt1027);
					this.aClass2_Sub1_Sub4_9.method364(local24 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9 + this.anInt1026);
				}
				if (local19 == 732) {
					local394 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local24];
					if (local394 != null) {
						this.method642(0, 1, local394.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local394.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 55);
						this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local24);
					}
				}
				if (local19 == 943) {
					local1499 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local24];
					if (local1499 != null) {
						this.method642(0, 1, local1499.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local1499.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 28);
						this.aClass2_Sub1_Sub4_9.method331(this.anInt933);
						this.aClass2_Sub1_Sub4_9.method364(local24);
					}
				}
				if (local19 == 99) {
					local1499 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local24];
					if (local1499 != null) {
						this.method642(0, 1, local1499.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local1499.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 216);
						this.aClass2_Sub1_Sub4_9.method363(local24);
					}
				}
				if (local19 == 653) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 243);
					this.aClass2_Sub1_Sub4_9.method331(local24);
					this.aClass2_Sub1_Sub4_9.method331(local14);
					this.aClass2_Sub1_Sub4_9.method331(local9);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				if (local19 == 229) {
					local394 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local24];
					if (local394 != null) {
						this.method642(0, 1, local394.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local394.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 217);
						this.aClass2_Sub1_Sub4_9.method363(local24);
					}
				}
				if (local19 == 809) {
					if ((this.anInt1026 & 0x3) == 0) {
						anInt904++;
					}
					if (anInt904 >= 145) {
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 210);
						this.aClass2_Sub1_Sub4_9.method333(4181909);
						anInt904 = 0;
					}
					this.method637(local9, local14, local24);
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 198);
					this.aClass2_Sub1_Sub4_9.method364(local24 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub4_9.method363(local9 + this.anInt1026);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local14 + this.anInt1027);
				}
				if (local19 == 507) {
					local394 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local24];
					if (local394 != null) {
						this.method642(0, 1, local394.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local394.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 44);
						this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local24);
						this.aClass2_Sub1_Sub4_9.method363(this.anInt933);
					}
				}
				if (local19 == 189) {
					local1499 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local24];
					if (local1499 != null) {
						this.method642(0, 1, local1499.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local1499.anIntArray94[0], false, 2, 1);
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 1);
						this.aClass2_Sub1_Sub4_9.method363(local24);
						this.aClass2_Sub1_Sub4_9.method363(this.anInt946);
						this.aClass2_Sub1_Sub4_9.method365(aBoolean225, this.anInt948);
						this.aClass2_Sub1_Sub4_9.method331(this.anInt947);
					}
				}
				if (local19 == 741 && this.method637(local9, local14, local24)) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 213);
					this.aClass2_Sub1_Sub4_9.method331(this.anInt946);
					this.aClass2_Sub1_Sub4_9.method331(this.anInt947);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, this.anInt948);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9 + this.anInt1026);
					this.aClass2_Sub1_Sub4_9.method331(local14 + this.anInt1027);
					this.aClass2_Sub1_Sub4_9.method331(local24 >> 14 & 0x7FFF);
				}
				if (local19 == 804) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 223);
					this.aClass2_Sub1_Sub4_9.method331(local9);
					this.aClass2_Sub1_Sub4_9.method331(local24);
					this.aClass2_Sub1_Sub4_9.method363(local14);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				if (local19 == 828) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 196);
					this.aClass2_Sub1_Sub4_9.method363(local14);
					this.aClass2_Sub1_Sub4_9.method364(local9);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local24);
					this.anInt856 = 0;
					this.anInt857 = local14;
					this.anInt858 = local9;
					this.anInt859 = 2;
					if (Class15.method120(local14).anInt187 == this.anInt963) {
						this.anInt859 = 1;
					}
					if (Class15.method120(local14).anInt187 == this.anInt959) {
						this.anInt859 = 3;
					}
				}
				if (local19 == 35) {
					this.method637(local9, local14, local24);
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 131);
					this.aClass2_Sub1_Sub4_9.method363(local24 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9 + this.anInt1026);
					this.aClass2_Sub1_Sub4_9.method364(local14 + this.anInt1027);
				}
				if (local19 == 268) {
					local113 = Class15.method120(local14);
					this.anInt932 = 1;
					this.anInt933 = local14;
					this.anInt934 = local113.anInt181;
					this.anInt945 = 0;
					this.aBoolean251 = true;
					local704 = local113.aString6;
					if (local704.indexOf(" ") != -1) {
						local704 = local704.substring(0, local704.indexOf(" "));
					}
					local278 = local113.aString6;
					if (local278.indexOf(" ") != -1) {
						local278 = local278.substring(local278.indexOf(" ") + 1);
					}
					this.aString22 = local704 + " " + local113.aString5 + " " + local278;
					if (this.anInt934 == 16) {
						this.aBoolean251 = true;
						this.anInt962 = 3;
						this.aBoolean255 = true;
					}
				} else {
					if (local19 == 918) {
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 39);
						this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9);
						this.aClass2_Sub1_Sub4_9.method364(local14);
						this.aClass2_Sub1_Sub4_9.method364(local24);
						this.anInt856 = 0;
						this.anInt857 = local14;
						this.anInt858 = local9;
						this.anInt859 = 2;
						if (Class15.method120(local14).anInt187 == this.anInt963) {
							this.anInt859 = 1;
						}
						if (Class15.method120(local14).anInt187 == this.anInt959) {
							this.anInt859 = 3;
						}
					}
					if (local19 == 723) {
						this.method589(this.anInt1047);
						this.anInt1047 = -1;
						this.aBoolean239 = true;
					}
					if (local19 == 737 && !this.aBoolean237) {
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 72);
						this.aClass2_Sub1_Sub4_9.method331(local14);
						this.aBoolean237 = true;
					}
					if (local19 == 954 || local19 == 362 || local19 == 408 || local19 == 126) {
						local257 = this.aStringArray8[arg0];
						local131 = local257.indexOf("@whi@");
						if (local131 != -1) {
							local1662 = Class7.method53(local257.substring(local131 + 5).trim());
							if (local19 == 954) {
								this.method663(993, local1662);
							}
							if (local19 == 362) {
								this.method671(local1662);
							}
							if (local19 == 408) {
								this.method695(this.aBoolean256, local1662);
							}
							if (local19 == 126) {
								this.method641(local1662);
							}
						}
					}
					if (local19 == 485) {
						local1499 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local24];
						if (local1499 != null) {
							this.method642(0, 1, local1499.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local1499.anIntArray94[0], false, 2, 1);
							this.anInt1040 = super.anInt817;
							this.anInt1041 = super.anInt818;
							this.anInt1043 = 2;
							this.anInt1042 = 0;
							this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 110);
							this.aClass2_Sub1_Sub4_9.method364(local24);
						}
					}
					if (local19 == 419) {
						local591 = this.method642(0, 0, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 0);
						if (!local591) {
							this.method642(0, 1, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 1);
						}
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 205);
						this.aClass2_Sub1_Sub4_9.method363(local14 + this.anInt1027);
						this.aClass2_Sub1_Sub4_9.method364(this.anInt946);
						this.aClass2_Sub1_Sub4_9.method365(aBoolean225, this.anInt948);
						this.aClass2_Sub1_Sub4_9.method364(this.anInt947);
						this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local24);
						this.aClass2_Sub1_Sub4_9.method331(local9 + this.anInt1026);
					}
					if (local19 == 71) {
						this.method637(local9, local14, local24);
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 200);
						this.aClass2_Sub1_Sub4_9.method331(local14 + this.anInt1027);
						this.aClass2_Sub1_Sub4_9.method331(local9 + this.anInt1026);
						this.aClass2_Sub1_Sub4_9.method331(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 321) {
						anInt991++;
						if (anInt991 >= 64) {
							this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 234);
							this.aClass2_Sub1_Sub4_9.method331(42770);
							anInt991 = 0;
						}
						this.method637(local9, local14, local24);
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 115);
						this.aClass2_Sub1_Sub4_9.method363(local14 + this.anInt1027);
						this.aClass2_Sub1_Sub4_9.method364(local24 >> 14 & 0x7FFF);
						this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9 + this.anInt1026);
					}
					if (local19 == 499) {
						local591 = this.method642(0, 0, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 0);
						if (!local591) {
							this.method642(0, 1, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 1);
						}
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 2;
						this.anInt1042 = 0;
						anInt850++;
						if (anInt850 >= 77) {
							this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 203);
							this.aClass2_Sub1_Sub4_9.method333(4904866);
							anInt850 = 0;
						}
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 252);
						this.aClass2_Sub1_Sub4_9.method364(local9 + this.anInt1026);
						this.aClass2_Sub1_Sub4_9.method363(local14 + this.anInt1027);
						this.aClass2_Sub1_Sub4_9.method364(local24);
					}
					if (local19 == 937) {
						this.anInt945 = 1;
						this.anInt946 = local9;
						this.anInt947 = local14;
						this.anInt948 = local24;
						this.aString23 = String.valueOf(Class34.method385(local24).aString13);
						this.anInt932 = 0;
						this.aBoolean251 = true;
					} else {
						if (local19 == 929) {
							local1499 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local24];
							if (local1499 != null) {
								this.method642(0, 1, local1499.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local1499.anIntArray94[0], false, 2, 1);
								this.anInt1040 = super.anInt817;
								this.anInt1041 = super.anInt818;
								this.anInt1043 = 2;
								this.anInt1042 = 0;
								this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 148);
								this.aClass2_Sub1_Sub4_9.method331(local24);
							}
						}
						if (local19 == 173) {
							local1499 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local24];
							if (local1499 != null) {
								this.method642(0, 1, local1499.anIntArray93[0], 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local1499.anIntArray94[0], false, 2, 1);
								this.anInt1040 = super.anInt817;
								this.anInt1041 = super.anInt818;
								this.anInt1043 = 2;
								this.anInt1042 = 0;
								this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 161);
								this.aClass2_Sub1_Sub4_9.method331(local24);
							}
						}
						if (local19 == 416) {
							local591 = this.method642(0, 0, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 0);
							if (!local591) {
								this.method642(0, 1, local9, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local14, false, 2, 1);
							}
							this.anInt1040 = super.anInt817;
							this.anInt1041 = super.anInt818;
							this.anInt1043 = 2;
							this.anInt1042 = 0;
							anInt824 += local24;
							if (anInt824 >= 93) {
								this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 235);
								this.aClass2_Sub1_Sub4_9.method331(11880);
								anInt824 = 0;
							}
							this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 135);
							this.aClass2_Sub1_Sub4_9.method331(local24);
							this.aClass2_Sub1_Sub4_9.method331(local9 + this.anInt1026);
							this.aClass2_Sub1_Sub4_9.method363(local14 + this.anInt1027);
						}
						if (local19 == 395) {
							this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 224);
							this.aClass2_Sub1_Sub4_9.method363(local14);
							this.aClass2_Sub1_Sub4_9.method364(local24);
							this.aClass2_Sub1_Sub4_9.method365(aBoolean225, local9);
							this.anInt856 = 0;
							this.anInt857 = local14;
							this.anInt858 = local9;
							this.anInt859 = 2;
							if (Class15.method120(local14).anInt187 == this.anInt963) {
								this.anInt859 = 1;
							}
							if (Class15.method120(local14).anInt187 == this.anInt959) {
								this.anInt859 = 3;
							}
						}
						if (local19 == 505) {
							local257 = this.aStringArray8[arg0];
							local131 = local257.indexOf("@whi@");
							if (local131 != -1) {
								if (this.anInt963 == -1) {
									this.method706();
									this.aString24 = local257.substring(local131 + 5).trim();
									this.aBoolean250 = false;
									this.anInt829 = this.anInt963 = Class15.anInt207;
								} else {
									this.method607("", 0, "Please close the interface you have open before using 'report abuse'", this.aByte28);
								}
							}
						}
						this.anInt945 = 0;
						this.anInt932 = 0;
						this.aBoolean251 = true;
					}
				}
			}
		} catch (@Pc(3514) RuntimeException local3514) {
			signlink.reporterror("99636, " + -6869 + ", " + arg0 + ", " + local3514.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class12 local9 = this.aClass12ArrayArrayArray1[this.anInt925][arg0][arg1];
		if (local9 == null) {
			this.aClass46_1.method538(this.anInt925, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub3_Sub3 local23 = null;
		@Pc(27) Class2_Sub1_Sub3_Sub3 local27;
		for (local27 = (Class2_Sub1_Sub3_Sub3) local9.method111(); local27 != null; local27 = (Class2_Sub1_Sub3_Sub3) local9.method113()) {
			@Pc(32) Class34 local32 = Class34.method385(local27.anInt327);
			@Pc(35) int local35 = local32.anInt591;
			if (local32.aBoolean147) {
				local35 *= local27.anInt328 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method109(this.anInt993, local23);
		@Pc(66) Class2_Sub1_Sub3_Sub3 local66 = null;
		@Pc(68) Class2_Sub1_Sub3_Sub3 local68 = null;
		for (local27 = (Class2_Sub1_Sub3_Sub3) local9.method111(); local27 != null; local27 = (Class2_Sub1_Sub3_Sub3) local9.method113()) {
			if (local27.anInt327 != local23.anInt327 && local66 == null) {
				local66 = local27;
			}
			if (local27.anInt327 != local23.anInt327 && local27.anInt327 != local66.anInt327 && local68 == null) {
				local68 = local27;
			}
		}
		@Pc(111) int local111 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass46_1.method524(arg0, local66, local68, this.method590(arg0 * 128 + 64, this.anInt925, arg1 * 128 + 64), local23, this.anInt925, local111, arg1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method583() {
		try {
			this.aClass2_Sub1_Sub2_Sub3_16 = null;
			this.aClass2_Sub1_Sub2_Sub3_17 = null;
			this.aClass2_Sub1_Sub2_Sub3_18 = null;
			this.aClass2_Sub1_Sub2_Sub3_19 = null;
			this.aClass2_Sub1_Sub2_Sub3_20 = null;
			this.aClass2_Sub1_Sub2_Sub3Array3 = null;
			this.aClass2_Sub1_Sub2_Sub3_11 = null;
			this.aClass2_Sub1_Sub2_Sub3_12 = null;
			this.aClass2_Sub1_Sub2_Sub3_13 = null;
			this.aClass2_Sub1_Sub2_Sub3_14 = null;
			this.aClass2_Sub1_Sub2_Sub3_15 = null;
			this.aClass2_Sub1_Sub3_Sub2_Sub2Array1 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.aClass2_Sub1_Sub4Array1 = null;
			this.anIntArray264 = null;
			this.anIntArray213 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray214 = null;
			this.anIntArray215 = null;
			this.anIntArray241 = null;
			this.anIntArray242 = null;
			this.aClass2_Sub1_Sub2_Sub1Array8 = null;
			this.aClass2_Sub1_Sub4_9 = null;
			this.aClass2_Sub1_Sub4_7 = null;
			this.aClass2_Sub1_Sub4_8 = null;
			this.aClass32_8 = null;
			this.aClass32_9 = null;
			this.aClass32_10 = null;
			this.aClass32_11 = null;
			this.aClass32_12 = null;
			this.aClass32_13 = null;
			this.aClass32_14 = null;
			this.aClass32_15 = null;
			this.anIntArrayArray24 = null;
			this.anIntArrayArray25 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.aStringArray11 = null;
			this.aLongArray3 = null;
			this.anIntArray275 = null;
			this.aClass2_Sub1_Sub2_Sub3_4 = null;
			this.aClass2_Sub1_Sub2_Sub3_5 = null;
			this.aClass2_Sub1_Sub2_Sub3_6 = null;
			if (this.aClass26_1 != null) {
				this.aClass26_1.aBoolean111 = false;
			}
			this.aClass26_1 = null;
			this.aClass2_Sub1_Sub2_Sub1_3 = null;
			this.aClass2_Sub1_Sub2_Sub1_4 = null;
			this.aClass2_Sub1_Sub2_Sub1_5 = null;
			this.aClass2_Sub1_Sub2_Sub1_6 = null;
			this.aClass2_Sub1_Sub2_Sub1_7 = null;
			this.aClass2_Sub1_Sub2_Sub3_1 = null;
			this.aClass2_Sub1_Sub2_Sub3_2 = null;
			this.aClass2_Sub1_Sub2_Sub3_3 = null;
			this.anIntArray237 = null;
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.anIntArray240 = null;
			this.aStringArray8 = null;
			this.aByteArray21 = null;
			this.anIntArrayArray22 = null;
			this.aClass32_21 = null;
			this.aClass32_22 = null;
			this.aClass32_23 = null;
			this.aClass2_Sub1_Sub4_6 = null;
			this.aClass32_24 = null;
			this.aClass32_25 = null;
			this.aClass32_26 = null;
			this.aClass32_27 = null;
			this.aClass2_Sub1_Sub2_Sub1_16 = null;
			this.aClass32_16 = null;
			this.aClass32_17 = null;
			this.aClass32_18 = null;
			this.aClass32_19 = null;
			this.aClass32_20 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass46_1 = null;
			this.aClass21Array1 = null;
			this.aClass12ArrayArrayArray1 = null;
			this.aClass12_10 = null;
			this.aClass32_6 = null;
			this.aClass32_7 = null;
			this.aClass32_3 = null;
			this.aClass32_4 = null;
			this.aClass32_5 = null;
			this.aClass2_Sub1_Sub3_Sub2_Sub1Array1 = null;
			this.anIntArray235 = null;
			if (this.aClass9_Sub1_1 != null) {
				this.aClass9_Sub1_1.method312();
			}
			this.aClass9_Sub1_1 = null;
			this.aClass2_Sub1_Sub2_Sub1_8 = null;
			this.aClass2_Sub1_Sub2_Sub1Array6 = null;
			this.aClass2_Sub1_Sub2_Sub1Array10 = null;
			this.aClass2_Sub1_Sub2_Sub1Array9 = null;
			this.aClass2_Sub1_Sub2_Sub1Array5 = null;
			this.aClass2_Sub1_Sub2_Sub1Array4 = null;
			this.aClass2_Sub1_Sub2_Sub1_17 = null;
			try {
				if (this.aClass28_1 != null) {
					this.aClass28_1.method279();
				}
			} catch (@Pc(311) Exception local311) {
			}
			this.aClass28_1 = null;
			this.method636();
			this.anIntArray228 = null;
			this.aClass2_Sub1_Sub2_Sub3Array4 = null;
			this.aClass2_Sub1_Sub2_Sub1Array7 = null;
			this.aClass12_11 = null;
			this.aClass12_12 = null;
			this.method616(this.anInt1012);
			Class41.method412();
			Class10.method107();
			Class34.method382();
			Class15.method121();
			Class50.aClass50Array1 = null;
			Class24.aClass24Array1 = null;
			Class40.aClass40Array1 = null;
			Class23.aClass23Array1 = null;
			Class37.aClass37Array1 = null;
			Class37.aClass1_7 = null;
			Class42.aClass42Array1 = null;
			super.aClass32_2 = null;
			Class2_Sub1_Sub3_Sub2_Sub2.aClass1_4 = null;
			Class2_Sub1_Sub2_Sub4.method485();
			Class46.method516();
			Class2_Sub1_Sub3_Sub5.method419();
			Class31.method293();
			System.gc();
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("85743, " + false + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method647(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) this.aClass12_10.method111();
			@Pc(11) boolean local11 = false;
			while (local6 != null) {
				if (local6.anInt605 == -1) {
					local6.anInt613 = 0;
					this.method657(local6);
				} else {
					local6.method507();
				}
				local6 = (Class2_Sub3) this.aClass12_10.method113();
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("11990, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!AIRMECOM;I)V")
	private void method648(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(17) int local17 = arg0 * arg0 + arg2 * arg2;
			if (local17 > 4225 && local17 < 90000) {
				@Pc(31) int local31 = this.anInt913 + this.anInt842 & 0x7FF;
				@Pc(35) int local35 = Class2_Sub1_Sub3_Sub5.anIntArray171[local31];
				@Pc(39) int local39 = Class2_Sub1_Sub3_Sub5.anIntArray172[local31];
				@Pc(48) int local48 = local35 * 256 / (this.anInt984 + 256);
				@Pc(57) int local57 = local39 * 256 / (this.anInt984 + 256);
				@Pc(67) int local67 = arg2 * local48 + arg0 * local57 >> 16;
				@Pc(77) int local77 = arg2 * local57 - arg0 * local48 >> 16;
				@Pc(83) double local83 = Math.atan2((double) local67, (double) local77);
				@Pc(89) int local89 = (int) (Math.sin(local83) * 63.0D);
				@Pc(95) int local95 = (int) (Math.cos(local83) * 57.0D);
				this.aClass2_Sub1_Sub2_Sub1_11.method47(local83, 83 - local95 - 20, local89 + 94 + 4 - 10);
			} else {
				this.method709(arg0, arg2, arg1);
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("97272, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method649() {
		try {
			@Pc(2) int local2 = this.anInt866;
			@Pc(5) int local5 = this.anInt867;
			@Pc(8) int local8 = this.anInt868;
			@Pc(11) int local11 = this.anInt869;
			Class2_Sub1_Sub2.method478(local2, local8, local11, local5, 6116423);
			Class2_Sub1_Sub2.method478(local2 + 1, local8 - 2, 16, local5 + 1, 0);
			Class2_Sub1_Sub2.method479(0, local8 - 2, local2 + 1, local11 - 19, local5 + 18);
			this.aClass2_Sub1_Sub2_Sub2_4.method89(local2 + 3, 6116423, local5 + 14, "Choose Option");
			@Pc(63) int local63 = super.anInt811;
			@Pc(66) int local66 = super.anInt812;
			if (this.anInt865 == 0) {
				local63 -= 4;
				local66 -= 4;
			}
			if (this.anInt865 == 1) {
				local63 -= 553;
				local66 -= 205;
			}
			if (this.anInt865 == 2) {
				local63 -= 17;
				local66 -= 357;
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt822; local85++) {
				@Pc(100) int local100 = local5 + (this.anInt822 - 1 - local85) * 15 + 31;
				@Pc(102) int local102 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local100 - 13 && local66 < local100 + 3) {
					local102 = 16776960;
				}
				this.aClass2_Sub1_Sub2_Sub2_4.method93(local2 + 3, this.aStringArray8[local85], local102, true, local100);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("23299, " + -18010 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method650() {
		try {
			this.anInt862++;
			this.method601(true, this.anInt830);
			this.method610(true);
			this.method601(false, this.anInt830);
			this.method610(false);
			this.method679();
			this.method660();
			@Pc(37) int local37;
			@Pc(76) int local76;
			if (!this.aBoolean236) {
				local37 = this.anInt912;
				if (this.anInt995 / 256 > local37) {
					local37 = this.anInt995 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray263[4] + 128 > local37) {
					local37 = this.anIntArray263[4] + 128;
				}
				local76 = this.anInt913 + this.anInt1018 & 0x7FF;
				this.method672(local37, this.anInt854, local37 * 3 + 600, this.anInt853, this.method590(aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385, this.anInt925, aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386) - 50, local76);
				anInt873++;
				if (anInt873 > 154) {
					anInt873 = 0;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 146);
					this.aClass2_Sub1_Sub4_9.method334(0);
				}
			}
			if (this.aBoolean236) {
				local37 = this.method592();
			} else {
				local37 = this.method591();
			}
			local76 = this.anInt1020;
			@Pc(139) int local139 = this.anInt1021;
			@Pc(142) int local142 = this.anInt1022;
			@Pc(145) int local145 = this.anInt1023;
			@Pc(148) int local148 = this.anInt1024;
			@Pc(197) int local197;
			for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
				if (this.aBooleanArray12[local150]) {
					local197 = (int) (Math.random() * (double) (this.anIntArray233[local150] * 2 + 1) - (double) this.anIntArray233[local150] + Math.sin((double) this.anIntArray255[local150] * ((double) this.anIntArray265[local150] / 100.0D)) * (double) this.anIntArray263[local150]);
					if (local150 == 0) {
						this.anInt1020 += local197;
					}
					if (local150 == 1) {
						this.anInt1021 += local197;
					}
					if (local150 == 2) {
						this.anInt1022 += local197;
					}
					if (local150 == 3) {
						this.anInt1024 = this.anInt1024 + local197 & 0x7FF;
					}
					if (local150 == 4) {
						this.anInt1023 += local197;
						if (this.anInt1023 < 128) {
							this.anInt1023 = 128;
						}
						if (this.anInt1023 > 383) {
							this.anInt1023 = 383;
						}
					}
				}
			}
			local197 = Class2_Sub1_Sub2_Sub4.anInt725;
			Class2_Sub1_Sub3_Sub5.aBoolean185 = true;
			Class2_Sub1_Sub3_Sub5.anInt696 = 0;
			Class2_Sub1_Sub3_Sub5.anInt694 = super.anInt811 - 4;
			Class2_Sub1_Sub3_Sub5.anInt695 = super.anInt812 - 4;
			Class2_Sub1_Sub2.method476();
			this.aClass46_1.method556(this.anInt1020, this.anInt1023, this.anInt1021, this.anInt1022, this.anInt1024, local37);
			this.aClass46_1.method531();
			this.method612(this.aBoolean242);
			this.method670();
			this.method722(local197);
			this.method711();
			this.aClass32_26.method297(4, 4, super.aGraphics2);
			this.anInt1020 = local76;
			this.anInt1021 = local139;
			this.anInt1022 = local142;
			this.anInt1023 = local145;
			this.anInt1024 = local148;
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("96618, " + false + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)Z")
	private boolean method651(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			this.aBoolean238 &= true;
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("16113, " + true + ", " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method652(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass13_2.method117("title.dat", null);
			@Pc(13) Class2_Sub1_Sub2_Sub1 local13 = new Class2_Sub1_Sub2_Sub1(local7, this);
			this.aClass32_6.method296();
			local13.method40(0, 0);
			this.aClass32_7.method296();
			local13.method40(0, -637);
			this.aClass32_3.method296();
			local13.method40(0, -128);
			this.aClass32_4.method296();
			local13.method40(-371, -202);
			this.aClass32_5.method296();
			local13.method40(-171, -202);
			this.aClass32_8.method296();
			local13.method40(-265, 0);
			this.aClass32_9.method296();
			local13.method40(-265, -562);
			this.aClass32_10.method296();
			local13.method40(-171, -128);
			this.aClass32_11.method296();
			local13.method40(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt38];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt39; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt38; local104++) {
					local98[local104] = local13.anIntArray3[local13.anInt38 + local13.anInt38 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt38; local130++) {
					local13.anIntArray3[local130 + local13.anInt38 * local100] = local98[local130];
				}
			}
			this.aClass32_6.method296();
			local13.method40(0, 382);
			this.aClass32_7.method296();
			local13.method40(0, -255);
			this.aClass32_3.method296();
			local13.method40(0, 254);
			this.aClass32_4.method296();
			local13.method40(-371, 180);
			this.aClass32_5.method296();
			local13.method40(-171, 180);
			this.aClass32_8.method296();
			local13.method40(-265, 382);
			this.aClass32_9.method296();
			local13.method40(-265, -180);
			this.aClass32_10.method296();
			local13.method40(-171, 254);
			this.aClass32_11.method296();
			local13.method40(-171, -180);
			local13 = new Class2_Sub1_Sub2_Sub1(this.aClass13_2, "logo", 0);
			this.aClass32_3.method296();
			if (arg0) {
				this.aClass12ArrayArrayArray1 = null;
			}
			local13.method42(382 - local13.anInt38 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("51823, " + arg0 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method653() {
		try {
			@Pc(4) Graphics local4 = this.method586().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method579();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean246) {
				this.aBoolean226 = false;
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
			if (this.aBoolean240) {
				this.aBoolean226 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean268) {
				this.aBoolean226 = false;
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
			signlink.reporterror("40799, " + 6 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method654() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt940; local3++) {
				if (local3 == -1) {
					local11 = this.anInt939;
				} else {
					local11 = this.anIntArray250[local3];
				}
				@Pc(23) Class2_Sub1_Sub3_Sub2_Sub2 local23 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local11];
				if (local23 != null && local23.anInt399 > 0) {
					local23.anInt399--;
					if (local23.anInt399 == 0) {
						local23.aString10 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt891; local11++) {
				@Pc(60) int local60 = this.anIntArray235[local11];
				@Pc(65) Class2_Sub1_Sub3_Sub2_Sub1 local65 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local60];
				if (local65 != null && local65.anInt399 > 0) {
					local65.anInt399--;
					if (local65.anInt399 == 0) {
						local65.aString10 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("93046, " + 19400 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method655() {
		try {
			while (true) {
				@Pc(9) int local9 = this.method580();
				if (local9 == -1) {
					return;
				}
				if (this.anInt963 != -1 && this.anInt963 == this.anInt829) {
					if (local9 == 8 && this.aString24.length() > 0) {
						this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
					}
					if ((local9 >= 97 && local9 <= 122 || local9 >= 65 && local9 <= 90 || local9 >= 48 && local9 <= 57 || local9 == 32) && this.aString24.length() < 12) {
						this.aString24 = this.aString24 + (char) local9;
					}
				} else {
					@Pc(191) int local191;
					if (this.aBoolean262) {
						if (local9 >= 32 && local9 <= 122 && this.aString31.length() < 80) {
							this.aString31 = this.aString31 + (char) local9;
							this.aBoolean239 = true;
						}
						if (local9 == 8 && this.aString31.length() > 0) {
							this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
							this.aBoolean239 = true;
						}
						if (local9 == 13 || local9 == 10) {
							this.aBoolean262 = false;
							this.aBoolean239 = true;
							@Pc(149) long local149;
							if (this.anInt863 == 1) {
								local149 = Class7.method53(this.aString31);
								this.method663(993, local149);
							}
							if (this.anInt863 == 2 && this.anInt970 > 0) {
								local149 = Class7.method53(this.aString31);
								this.method695(this.aBoolean256, local149);
							}
							if (this.anInt863 == 3 && this.aString31.length() > 0) {
								this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 139);
								this.aClass2_Sub1_Sub4_9.method330(0);
								local191 = this.aClass2_Sub1_Sub4_9.anInt556;
								this.aClass2_Sub1_Sub4_9.method336(this.aLong30);
								Class6.method51(this.aClass2_Sub1_Sub4_9, this.aString31);
								this.aClass2_Sub1_Sub4_9.method339(this.aClass2_Sub1_Sub4_9.anInt556 - local191);
								this.aString31 = Class6.method52(this.aString31);
								this.aString31 = Class17.method162(this.aString31);
								this.method607(Class7.method57(Class7.method54(this.aLong30)), 6, this.aString31, this.aByte28);
								if (this.anInt848 == 2) {
									this.anInt848 = 1;
									this.aBoolean270 = true;
									this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 19);
									this.aClass2_Sub1_Sub4_9.method330(this.anInt935);
									this.aClass2_Sub1_Sub4_9.method330(this.anInt848);
									this.aClass2_Sub1_Sub4_9.method330(this.anInt890);
								}
							}
							if (this.anInt863 == 4 && this.anInt882 < 100) {
								local149 = Class7.method53(this.aString31);
								this.method671(local149);
							}
							if (this.anInt863 == 5 && this.anInt882 > 0) {
								local149 = Class7.method53(this.aString31);
								this.method641(local149);
							}
						}
					} else if (this.anInt989 == 1) {
						if (local9 >= 48 && local9 <= 57 && this.aString27.length() < 10) {
							this.aString27 = this.aString27 + (char) local9;
							this.aBoolean239 = true;
						}
						if (local9 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean239 = true;
						}
						if (local9 == 13 || local9 == 10) {
							if (this.aString27.length() > 0) {
								local191 = 0;
								try {
									local191 = Integer.parseInt(this.aString27);
								} catch (@Pc(370) Exception local370) {
								}
								this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 5);
								this.aClass2_Sub1_Sub4_9.method334(local191);
							}
							this.anInt989 = 0;
							this.aBoolean239 = true;
						}
					} else if (this.anInt989 == 2) {
						if (local9 >= 32 && local9 <= 122 && this.aString27.length() < 12) {
							this.aString27 = this.aString27 + (char) local9;
							this.aBoolean239 = true;
						}
						if (local9 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean239 = true;
						}
						if (local9 == 13 || local9 == 10) {
							if (this.aString27.length() > 0) {
								this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 137);
								this.aClass2_Sub1_Sub4_9.method336(Class7.method53(this.aString27));
							}
							this.anInt989 = 0;
							this.aBoolean239 = true;
						}
					} else if (this.anInt989 == 3) {
						if (local9 >= 32 && local9 <= 122 && this.aString27.length() < 40) {
							this.aString27 = this.aString27 + (char) local9;
							this.aBoolean239 = true;
						}
						if (local9 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean239 = true;
						}
					} else if (this.anInt959 == -1 && this.anInt897 == -1) {
						if (local9 >= 32 && local9 <= 122 && this.aString21.length() < 80) {
							this.aString21 = this.aString21 + (char) local9;
							this.aBoolean239 = true;
						}
						if (local9 == 8 && this.aString21.length() > 0) {
							this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							this.aBoolean239 = true;
						}
						if ((local9 == 13 || local9 == 10) && this.aString21.length() > 0) {
							if (this.anInt1034 == 2) {
								if (this.aString21.equals("::clientdrop")) {
									this.method658();
								}
								if (this.aString21.equals("::lag")) {
									this.method661();
								}
								if (this.aString21.equals("::prefetchmusic")) {
									for (local191 = 0; local191 < this.aClass9_Sub1_1.method306(2); local191++) {
										this.aClass9_Sub1_1.method307(local191, (byte) 1, 2);
									}
								}
								if (this.aString21.equals("::fpson")) {
									aBoolean266 = true;
								}
								if (this.aString21.equals("::fpsoff")) {
									aBoolean266 = false;
								}
								if (this.aString21.equals("::noclip")) {
									for (local191 = 0; local191 < 4; local191++) {
										for (@Pc(657) int local657 = 1; local657 < 103; local657++) {
											for (@Pc(661) int local661 = 1; local661 < 103; local661++) {
												this.aClass21Array1[local191].anIntArrayArray7[local657][local661] = 0;
											}
										}
									}
								}
							}
							if (this.aString21.startsWith("::")) {
								this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 12);
								this.aClass2_Sub1_Sub4_9.method330(this.aString21.length() - 1);
								this.aClass2_Sub1_Sub4_9.method337(this.aString21.substring(2));
							} else {
								@Pc(717) String local717 = this.aString21.toLowerCase();
								@Pc(719) byte local719 = 0;
								if (local717.startsWith("yellow:")) {
									local719 = 0;
									this.aString21 = this.aString21.substring(7);
								} else if (local717.startsWith("red:")) {
									local719 = 1;
									this.aString21 = this.aString21.substring(4);
								} else if (local717.startsWith("green:")) {
									local719 = 2;
									this.aString21 = this.aString21.substring(6);
								} else if (local717.startsWith("cyan:")) {
									local719 = 3;
									this.aString21 = this.aString21.substring(5);
								} else if (local717.startsWith("purple:")) {
									local719 = 4;
									this.aString21 = this.aString21.substring(7);
								} else if (local717.startsWith("white:")) {
									local719 = 5;
									this.aString21 = this.aString21.substring(6);
								} else if (local717.startsWith("flash1:")) {
									local719 = 6;
									this.aString21 = this.aString21.substring(7);
								} else if (local717.startsWith("flash2:")) {
									local719 = 7;
									this.aString21 = this.aString21.substring(7);
								} else if (local717.startsWith("flash3:")) {
									local719 = 8;
									this.aString21 = this.aString21.substring(7);
								} else if (local717.startsWith("glow1:")) {
									local719 = 9;
									this.aString21 = this.aString21.substring(6);
								} else if (local717.startsWith("glow2:")) {
									local719 = 10;
									this.aString21 = this.aString21.substring(6);
								} else if (local717.startsWith("glow3:")) {
									local719 = 11;
									this.aString21 = this.aString21.substring(6);
								}
								local717 = this.aString21.toLowerCase();
								@Pc(891) byte local891 = 0;
								if (local717.startsWith("wave:")) {
									local891 = 1;
									this.aString21 = this.aString21.substring(5);
								} else if (local717.startsWith("wave2:")) {
									local891 = 2;
									this.aString21 = this.aString21.substring(6);
								} else if (local717.startsWith("shake:")) {
									local891 = 3;
									this.aString21 = this.aString21.substring(6);
								} else if (local717.startsWith("scroll:")) {
									local891 = 4;
									this.aString21 = this.aString21.substring(7);
								} else if (local717.startsWith("slide:")) {
									local891 = 5;
									this.aString21 = this.aString21.substring(6);
								}
								this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 153);
								this.aClass2_Sub1_Sub4_9.method330(0);
								@Pc(973) int local973 = this.aClass2_Sub1_Sub4_9.anInt556;
								this.aClass2_Sub1_Sub4_9.method356(local891);
								this.aClass2_Sub1_Sub4_9.method357(local719);
								this.aClass2_Sub1_Sub4_6.anInt556 = 0;
								Class6.method51(this.aClass2_Sub1_Sub4_6, this.aString21);
								this.aClass2_Sub1_Sub4_9.method377(this.anInt846, this.aClass2_Sub1_Sub4_6.anInt556, this.aClass2_Sub1_Sub4_6.aByteArray17);
								this.aClass2_Sub1_Sub4_9.method339(this.aClass2_Sub1_Sub4_9.anInt556 - local973);
								this.aString21 = Class6.method52(this.aString21);
								this.aString21 = Class17.method162(this.aString21);
								aClass2_Sub1_Sub3_Sub2_Sub2_1.aString10 = this.aString21;
								aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt416 = local719;
								aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt388 = local891;
								aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt399 = 150;
								if (this.anInt1034 == 2) {
									this.method607("@cr2@" + aClass2_Sub1_Sub3_Sub2_Sub2_1.aString11, 2, aClass2_Sub1_Sub3_Sub2_Sub2_1.aString10, this.aByte28);
								} else if (this.anInt1034 == 1) {
									this.method607("@cr1@" + aClass2_Sub1_Sub3_Sub2_Sub2_1.aString11, 2, aClass2_Sub1_Sub3_Sub2_Sub2_1.aString10, this.aByte28);
								} else {
									this.method607(aClass2_Sub1_Sub3_Sub2_Sub2_1.aString11, 2, aClass2_Sub1_Sub3_Sub2_Sub2_1.aString10, this.aByte28);
								}
								if (this.anInt935 == 2) {
									this.anInt935 = 3;
									this.aBoolean270 = true;
									this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 19);
									this.aClass2_Sub1_Sub4_9.method330(this.anInt935);
									this.aClass2_Sub1_Sub4_9.method330(this.anInt848);
									this.aClass2_Sub1_Sub4_9.method330(this.anInt890);
								}
							}
							this.aString21 = "";
							this.aBoolean239 = true;
						}
					}
				}
			}
		} catch (@Pc(1131) RuntimeException local1131) {
			signlink.reporterror("13676, " + -932 + ", " + local1131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method656(@OriginalArg(0) byte arg0) {
		try {
			this.aClass2_Sub1_Sub2_Sub3_9 = new Class2_Sub1_Sub2_Sub3(this.aClass13_2, "titlebox", 0);
			this.aClass2_Sub1_Sub2_Sub3_10 = new Class2_Sub1_Sub2_Sub3(this.aClass13_2, "titlebutton", 0);
			this.aClass2_Sub1_Sub2_Sub3Array2 = new Class2_Sub1_Sub2_Sub3[12];
			@Pc(28) boolean local28 = false;
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				this.aClass2_Sub1_Sub2_Sub3Array2[local35] = new Class2_Sub1_Sub2_Sub3(this.aClass13_2, "runes", local35);
			}
			this.aClass2_Sub1_Sub2_Sub1_14 = new Class2_Sub1_Sub2_Sub1(128, 265);
			this.aClass2_Sub1_Sub2_Sub1_15 = new Class2_Sub1_Sub2_Sub1(128, 265);
			for (@Pc(68) int local68 = 0; local68 < 33920; local68++) {
				this.aClass2_Sub1_Sub2_Sub1_14.anIntArray3[local68] = this.aClass32_6.anIntArray108[local68];
			}
			for (@Pc(86) int local86 = 0; local86 < 33920; local86++) {
				this.aClass2_Sub1_Sub2_Sub1_15.anIntArray3[local86] = this.aClass32_7.anIntArray108[local86];
			}
			this.anIntArray270 = new int[256];
			for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
				this.anIntArray270[local108] = local108 * 262144;
			}
			for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
				this.anIntArray270[local123 + 64] = local123 * 1024 + 16711680;
			}
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				this.anIntArray270[local142 + 128] = local142 * 4 + 16776960;
			}
			for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
				this.anIntArray270[local161 + 192] = 16777215;
			}
			this.anIntArray271 = new int[256];
			for (@Pc(180) int local180 = 0; local180 < 64; local180++) {
				this.anIntArray271[local180] = local180 * 1024;
			}
			for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
				this.anIntArray271[local195 + 64] = local195 * 4 + 65280;
			}
			for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
				this.anIntArray271[local214 + 128] = local214 * 262144 + 65535;
			}
			for (@Pc(233) int local233 = 0; local233 < 64; local233++) {
				this.anIntArray271[local233 + 192] = 16777215;
			}
			this.anIntArray272 = new int[256];
			for (@Pc(252) int local252 = 0; local252 < 64; local252++) {
				this.anIntArray272[local252] = local252 * 4;
			}
			for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
				this.anIntArray272[local267 + 64] = local267 * 262144 + 255;
			}
			for (@Pc(286) int local286 = 0; local286 < 64; local286++) {
				this.anIntArray272[local286 + 128] = local286 * 1024 + 16711935;
			}
			for (@Pc(305) int local305 = 0; local305 < 64; local305++) {
				this.anIntArray272[local305 + 192] = 16777215;
			}
			this.anIntArray269 = new int[256];
			this.anIntArray266 = new int[32768];
			this.anIntArray267 = new int[32768];
			this.method715(null);
			this.anIntArray252 = new int[32768];
			this.anIntArray253 = new int[32768];
			this.method588(10, "Connecting to fileserver", aBoolean222);
			if (!this.aBoolean226) {
				this.aBoolean261 = true;
				this.aBoolean226 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("48059, " + arg0 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SYVEZPUN;I)V")
	private void method657(@OriginalArg(0) Class2_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt607 == 0) {
				local1 = this.aClass46_1.method543(arg0.anInt606, arg0.anInt608, arg0.anInt609);
			}
			if (arg0.anInt607 == 1) {
				local1 = this.aClass46_1.method544(arg0.anInt608, arg0.anInt606, arg0.anInt609);
			}
			if (arg0.anInt607 == 2) {
				local1 = this.aClass46_1.method545(arg0.anInt606, arg0.anInt608, arg0.anInt609);
			}
			if (arg0.anInt607 == 3) {
				local1 = this.aClass46_1.method546(arg0.anInt606, arg0.anInt608, arg0.anInt609);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass46_1.method547(arg0.anInt606, arg0.anInt608, arg0.anInt609, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt602 = local3;
			arg0.anInt604 = local5;
			arg0.anInt603 = local7;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("43907, " + arg0 + ", " + -824 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method658() {
		try {
			if (this.anInt979 > 0) {
				this.method633();
			} else {
				this.method634("Please wait - attempting to reestablish", "Connection lost", this.aBoolean249);
				this.anInt953 = 0;
				this.anInt986 = 0;
				@Pc(21) Class28 local21 = this.aClass28_1;
				this.aBoolean238 = false;
				this.anInt864 = 0;
				this.method727(this.aString29, this.aString30, true);
				if (!this.aBoolean238) {
					this.method633();
				}
				try {
					local21.method279();
				} catch (@Pc(47) Exception local47) {
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("33271, " + true + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!RSWRPCHR;)V")
	private void method659(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			while (true) {
				if (arg1.anInt557 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method351(11);
					if (local12 != 2047) {
						if (this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local12] == null) {
							this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local12] = new Class2_Sub1_Sub3_Sub2_Sub2();
							if (this.aClass2_Sub1_Sub4Array1[local12] != null) {
								this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local12].method254(this.aClass2_Sub1_Sub4Array1[local12], this.aBoolean235);
							}
						}
						this.anIntArray250[this.anInt940++] = local12;
						@Pc(59) Class2_Sub1_Sub3_Sub2_Sub2 local59 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local12];
						local59.anInt398 = anInt943;
						@Pc(67) int local67 = arg1.method351(1);
						@Pc(72) int local72 = arg1.method351(1);
						if (local72 == 1) {
							this.anIntArray251[this.anInt941++] = local12;
						}
						@Pc(91) int local91 = arg1.method351(5);
						if (local91 > 15) {
							local91 -= 32;
						}
						@Pc(100) int local100 = arg1.method351(5);
						if (local100 > 15) {
							local100 -= 32;
						}
						local59.method251(local67 == 1, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0] + local91, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0] + local100);
						continue;
					}
				}
				arg1.method352();
				return;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("7259, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method660() {
		try {
			for (@Pc(6) Class2_Sub1_Sub3_Sub6 local6 = (Class2_Sub1_Sub3_Sub6) this.aClass12_12.method111(); local6 != null; local6 = (Class2_Sub1_Sub3_Sub6) this.aClass12_12.method113()) {
				if (local6.anInt734 != this.anInt925 || local6.aBoolean206) {
					local6.method507();
				} else if (anInt943 >= local6.anInt731) {
					local6.method511(this.aBoolean233, this.anInt909);
					if (local6.aBoolean206) {
						local6.method507();
					} else {
						this.aClass46_1.method528(local6, false, local6.anInt736, 0, local6.anInt737, -1, local6.anInt734, 60, local6.anInt735);
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("66087, " + -253 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method661() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt876);
			if (this.aClass9_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass9_Sub1_1.anInt502);
			}
			System.out.println("loop-cycle:" + anInt943);
			System.out.println("draw-cycle:" + anInt833);
			System.out.println("ptype:" + this.anInt976);
			System.out.println("psize:" + this.anInt975);
			if (this.aClass28_1 != null) {
				this.aClass28_1.method284();
			}
			super.aBoolean219 = true;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("82695, " + false + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method586() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("34021, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method663(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				if (this.anInt970 >= 100 && this.anInt961 != 1) {
					this.method607("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", this.aByte28);
				} else if (this.anInt970 >= 200) {
					this.method607("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", this.aByte28);
				} else {
					@Pc(40) String local40 = Class7.method57(Class7.method54(arg1));
					@Pc(44) boolean local44 = false;
					for (@Pc(46) int local46 = 0; local46 < this.anInt970; local46++) {
						if (this.aLongArray3[local46] == arg1) {
							this.method607("", 0, local40 + " is already on your friend list", this.aByte28);
							return;
						}
					}
					for (@Pc(77) int local77 = 0; local77 < this.anInt882; local77++) {
						if (this.aLongArray4[local77] == arg1) {
							this.method607("", 0, "Please remove " + local40 + " from your ignore list first", this.aByte28);
							return;
						}
					}
					if (!local40.equals(aClass2_Sub1_Sub3_Sub2_Sub2_1.aString11)) {
						this.aStringArray11[this.anInt970] = local40;
						this.aLongArray3[this.anInt970] = arg1;
						this.anIntArray275[this.anInt970] = 0;
						this.anInt970++;
						this.aBoolean251 = true;
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 145);
						this.aClass2_Sub1_Sub4_9.method336(arg1);
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("2335, " + arg0 + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIILclient!IGMZHLWJ;I)V")
	private void method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class15 arg7, @OriginalArg(8) int arg8) {
		try {
			if (arg0 < 7 || arg0 > 7) {
				this.aBoolean235 = !this.aBoolean235;
			}
			if (this.aBoolean227) {
				this.anInt1000 = 32;
			} else {
				this.anInt1000 = 0;
			}
			this.aBoolean227 = false;
			if (arg1 >= arg3 && arg1 < arg3 + 16 && arg8 >= arg2 && arg8 < arg2 + 16) {
				arg7.anInt205 -= this.anInt983 * 4;
				if (arg5 == 1) {
					this.aBoolean251 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean239 = true;
				}
			} else if (arg1 >= arg3 && arg1 < arg3 + 16 && arg8 >= arg2 + arg6 - 16 && arg8 < arg2 + arg6) {
				arg7.anInt205 += this.anInt983 * 4;
				if (arg5 == 1) {
					this.aBoolean251 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean239 = true;
				}
			} else if (arg1 >= arg3 - this.anInt1000 && arg1 < arg3 + this.anInt1000 + 16 && arg8 >= arg2 + 16 && arg8 < arg2 + arg6 - 16 && this.anInt983 > 0) {
				@Pc(150) int local150 = (arg6 - 32) * arg6 / arg4;
				if (local150 < 8) {
					local150 = 8;
				}
				@Pc(165) int local165 = arg8 - arg2 - local150 / 2 - 16;
				@Pc(171) int local171 = arg6 - local150 - 32;
				arg7.anInt205 = (arg4 - arg6) * local165 / local171;
				if (arg5 == 1) {
					this.aBoolean251 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean239 = true;
				}
				this.aBoolean227 = true;
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("84161, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIIIII)V")
	private void method665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (this.aByte32 != 36) {
				this.anInt976 = this.aClass2_Sub1_Sub4_8.method340();
			}
			if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
				if (aBoolean264 && arg1 != this.anInt925) {
					return;
				}
				@Pc(29) int local29 = 0;
				if (arg0 == 0) {
					local29 = this.aClass46_1.method543(arg1, arg5, arg6);
				}
				if (arg0 == 1) {
					local29 = this.aClass46_1.method544(arg5, arg1, arg6);
				}
				if (arg0 == 2) {
					local29 = this.aClass46_1.method545(arg1, arg5, arg6);
				}
				if (arg0 == 3) {
					local29 = this.aClass46_1.method546(arg1, arg5, arg6);
				}
				@Pc(85) int local85;
				if (local29 != 0) {
					local85 = this.aClass46_1.method547(arg1, arg5, arg6, local29);
					@Pc(91) int local91 = local29 >> 14 & 0x7FFF;
					@Pc(95) int local95 = local85 & 0x1F;
					@Pc(99) int local99 = local85 >> 6;
					@Pc(111) Class41 local111;
					if (arg0 == 0) {
						this.aClass46_1.method534(arg6, arg5, arg1);
						local111 = Class41.method403(local91);
						if (local111.aBoolean161) {
							this.aClass21Array1[arg1].method214(local95, local111.aBoolean170, 77, arg6, arg5, local99);
						}
					}
					if (arg0 == 1) {
						this.aClass46_1.method535(arg6, arg5, arg1);
					}
					if (arg0 == 2) {
						this.aClass46_1.method536(arg5, arg6, arg1);
						local111 = Class41.method403(local91);
						if (arg5 + local111.anInt663 > 103 || arg6 + local111.anInt663 > 103 || arg5 + local111.anInt646 > 103 || arg6 + local111.anInt646 > 103) {
							return;
						}
						if (local111.aBoolean161) {
							this.aClass21Array1[arg1].method215(local111.aBoolean170, local111.anInt646, local99, arg6, arg5, local111.anInt663);
						}
					}
					if (arg0 == 3) {
						this.aClass46_1.method537(arg1, arg6, arg5);
						local111 = Class41.method403(local91);
						if (local111.aBoolean161 && local111.aBoolean159) {
							this.aClass21Array1[arg1].method217(arg6, arg5);
						}
					}
				}
				if (arg3 >= 0) {
					local85 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray8[1][arg5][arg6] & 0x2) == 2) {
						local85 = arg1 + 1;
					}
					Class43.method467(arg5, arg1, local85, this.anIntArrayArrayArray8, arg4, arg2, arg3, arg6, this.aClass46_1, this.aClass21Array1[arg1]);
					return;
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("99757, " + 36 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RSWRPCHR;II)V")
	private void method666(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt972 = 0;
			this.anInt941 = 0;
			this.method682(arg0, arg1);
			this.method627(arg1, arg0);
			this.method608(arg0, arg1);
			@Pc(38) int local38;
			for (@Pc(31) int local31 = 0; local31 < this.anInt972; local31++) {
				local38 = this.anIntArray264[local31];
				if (this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local38].anInt398 != anInt943) {
					this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local38].aClass10_1 = null;
					this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local38] = null;
				}
			}
			if (arg0.anInt556 != arg1) {
				signlink.reporterror(this.aString29 + " size mismatch in getnpcpos - pos:" + arg0.anInt556 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local38 = 0; local38 < this.anInt891; local38++) {
				if (this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[this.anIntArray235[local38]] == null) {
					signlink.reporterror(this.aString29 + " null entry in npc list - pos:" + local38 + " size:" + this.anInt891);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("7883, " + arg0 + ", " + -511 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method667(@OriginalArg(0) int arg0) {
		try {
			this.aClass32_27.method296();
			Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray216;
			this.aClass2_Sub1_Sub2_Sub3_6.method277(0, 0);
			if (this.aBoolean262) {
				this.aClass2_Sub1_Sub2_Sub2_4.method85(0, 239, 40, this.aString18);
				this.aClass2_Sub1_Sub2_Sub2_4.method85(128, 239, 60, this.aString31 + "*");
			} else if (this.anInt989 == 1) {
				this.aClass2_Sub1_Sub2_Sub2_4.method85(0, 239, 40, "Enter amount:");
				this.aClass2_Sub1_Sub2_Sub2_4.method85(128, 239, 60, this.aString27 + "*");
			} else if (this.anInt989 == 2) {
				this.aClass2_Sub1_Sub2_Sub2_4.method85(0, 239, 40, "Enter name:");
				this.aClass2_Sub1_Sub2_Sub2_4.method85(128, 239, 60, this.aString27 + "*");
			} else {
				@Pc(125) Class2_Sub1_Sub2_Sub2 local125;
				@Pc(133) int local133;
				@Pc(144) int local144;
				if (this.anInt989 == 3) {
					if (this.aString27 != this.aString28) {
						this.method631(this.aString27);
						this.aString28 = this.aString27;
					}
					local125 = this.aClass2_Sub1_Sub2_Sub2_3;
					Class2_Sub1_Sub2.method475(0, 463, 0, 77);
					for (local133 = 0; local133 < this.anInt996; local133++) {
						local144 = local133 * 14 + 18 - this.anInt997;
						if (local144 > 0 && local144 < 110) {
							local125.method85(0, 239, local144, this.aStringArray14[local133]);
						}
					}
					Class2_Sub1_Sub2.method474();
					if (this.anInt996 > 5) {
						this.method609(this.anInt997, 0, this.anInt996 * 14 + 7, 463, 77);
					}
					if (this.aString27.length() == 0) {
						this.aClass2_Sub1_Sub2_Sub2_4.method85(255, 239, 40, "Enter object name");
					} else if (this.anInt996 == 0) {
						this.aClass2_Sub1_Sub2_Sub2_4.method85(0, 239, 40, "No matching objects found, please shorten search");
					}
					local125.method85(0, 239, 90, this.aString27 + "*");
					Class2_Sub1_Sub2.method481(77, 160, 0, 0, 479);
				} else if (this.aString17 != null) {
					this.aClass2_Sub1_Sub2_Sub2_4.method85(0, 239, 40, this.aString17);
					this.aClass2_Sub1_Sub2_Sub2_4.method85(128, 239, 60, "Click to continue");
				} else if (this.anInt959 != -1) {
					this.method704(0, Class15.method120(this.anInt959), 0, 0);
				} else if (this.anInt1047 == -1) {
					local125 = this.aClass2_Sub1_Sub2_Sub2_3;
					local133 = 0;
					Class2_Sub1_Sub2.method475(0, 463, 0, 77);
					for (local144 = 0; local144 < 100; local144++) {
						if (this.aStringArray10[local144] != null) {
							@Pc(309) int local309 = this.anIntArray232[local144];
							@Pc(318) int local318 = this.anInt923 + 70 - local133 * 14;
							@Pc(323) String local323 = this.aStringArray9[local144];
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
									local125.method89(4, 0, local318, this.aStringArray10[local144]);
								}
								local133++;
							}
							@Pc(395) int local395;
							if ((local309 == 1 || local309 == 2) && (local309 == 1 || this.anInt935 == 0 || this.anInt935 == 1 && this.method688(local323, (byte) 1))) {
								if (local318 > 0 && local318 < 110) {
									local395 = 4;
									if (local325 == 1) {
										this.aClass2_Sub1_Sub2_Sub3Array5[0].method277(4, local318 - 12);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass2_Sub1_Sub2_Sub3Array5[1].method277(local395, local318 - 12);
										local395 += 14;
									}
									local125.method89(local395, 0, local318, local323 + ":");
									local395 += local125.method87(local323) + 8;
									local125.method89(local395, 255, local318, this.aStringArray10[local144]);
								}
								local133++;
							}
							if ((local309 == 3 || local309 == 7) && this.anInt992 == 0 && (local309 == 7 || this.anInt848 == 0 || this.anInt848 == 1 && this.method688(local323, (byte) 1))) {
								if (local318 > 0 && local318 < 110) {
									local125.method89(4, 0, local318, "From");
									local395 = local125.method87("From ") + 4;
									if (local325 == 1) {
										this.aClass2_Sub1_Sub2_Sub3Array5[0].method277(local395, local318 - 12);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass2_Sub1_Sub2_Sub3Array5[1].method277(local395, local318 - 12);
										local395 += 14;
									}
									local125.method89(local395, 0, local318, local323 + ":");
									local395 += local125.method87(local323) + 8;
									local125.method89(local395, 8388608, local318, this.aStringArray10[local144]);
								}
								local133++;
							}
							if (local309 == 4 && (this.anInt890 == 0 || this.anInt890 == 1 && this.method688(local323, (byte) 1))) {
								if (local318 > 0 && local318 < 110) {
									local125.method89(4, 8388736, local318, local323 + " " + this.aStringArray10[local144]);
								}
								local133++;
							}
							if (local309 == 5 && this.anInt992 == 0 && this.anInt848 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method89(4, 8388608, local318, this.aStringArray10[local144]);
								}
								local133++;
							}
							if (local309 == 6 && this.anInt992 == 0 && this.anInt848 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method89(4, 0, local318, "To " + local323 + ":");
									local125.method89(local125.method87("To " + local323) + 12, 8388608, local318, this.aStringArray10[local144]);
								}
								local133++;
							}
							if (local309 == 8 && (this.anInt890 == 0 || this.anInt890 == 1 && this.method688(local323, (byte) 1))) {
								if (local318 > 0 && local318 < 110) {
									local125.method89(4, 8270336, local318, local323 + " " + this.aStringArray10[local144]);
								}
								local133++;
							}
						}
					}
					Class2_Sub1_Sub2.method474();
					this.anInt832 = local133 * 14 + 7;
					if (this.anInt832 < 78) {
						this.anInt832 = 78;
					}
					this.method609(this.anInt832 - this.anInt923 - 77, 0, this.anInt832, 463, 77);
					@Pc(765) String local765;
					if (aClass2_Sub1_Sub3_Sub2_Sub2_1 == null || aClass2_Sub1_Sub3_Sub2_Sub2_1.aString11 == null) {
						local765 = Class7.method57(this.aString29);
					} else {
						local765 = aClass2_Sub1_Sub3_Sub2_Sub2_1.aString11;
					}
					local125.method89(4, 0, 90, local765 + ":");
					local125.method89(local125.method87(local765 + ": ") + 6, 255, 90, this.aString21 + "*");
					Class2_Sub1_Sub2.method481(77, 160, 0, 0, 479);
				} else {
					this.method704(0, Class15.method120(this.anInt1047), 0, 0);
				}
			}
			if (this.aBoolean260 && this.anInt865 == 2) {
				this.method649();
			}
			this.aClass32_27.method297(17, 357, super.aGraphics2);
			this.aClass32_26.method296();
			@Pc(845) boolean local845 = false;
			Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
		} catch (@Pc(850) RuntimeException local850) {
			signlink.reporterror("67808, " + arg0 + ", " + local850.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method668() {
		try {
			this.aBoolean271 = true;
			try {
				@Pc(11) long local11 = System.currentTimeMillis();
				@Pc(13) int local13 = 0;
				@Pc(15) int local15 = 20;
				while (this.aBoolean226) {
					this.anInt876++;
					this.method638();
					this.method638();
					this.method606();
					local13++;
					if (local13 > 10) {
						@Pc(38) long local38 = System.currentTimeMillis();
						@Pc(47) int local47 = (int) (local38 - local11) / 10 - local15;
						local15 = 40 - local47;
						if (local15 < 5) {
							local15 = 5;
						}
						local13 = 0;
						local11 = local38;
					}
					try {
						Thread.sleep((long) local15);
					} catch (@Pc(65) Exception local65) {
					}
				}
			} catch (@Pc(71) Exception local71) {
			}
			this.aBoolean271 = false;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("91156, " + false + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!RSWRPCHR;II)V")
	private void method669(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(10) int local10 = arg0.method351(8);
			@Pc(16) int local16;
			if (local10 < this.anInt940) {
				for (local16 = local10; local16 < this.anInt940; local16++) {
					this.anIntArray264[this.anInt972++] = this.anIntArray250[local16];
				}
			}
			if (local10 > this.anInt940) {
				signlink.reporterror(this.aString29 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt940 = 0;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(68) int local68 = this.anIntArray250[local16];
				@Pc(73) Class2_Sub1_Sub3_Sub2_Sub2 local73 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local68];
				@Pc(78) int local78 = arg0.method351(1);
				if (local78 == 0) {
					this.anIntArray250[this.anInt940++] = local68;
					local73.anInt398 = anInt943;
				} else {
					@Pc(101) int local101 = arg0.method351(2);
					if (local101 == 0) {
						this.anIntArray250[this.anInt940++] = local68;
						local73.anInt398 = anInt943;
						this.anIntArray251[this.anInt941++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray250[this.anInt940++] = local68;
							local73.anInt398 = anInt943;
							local152 = arg0.method351(3);
							local73.method250(false, local152);
							local162 = arg0.method351(1);
							if (local162 == 1) {
								this.anIntArray251[this.anInt941++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray250[this.anInt940++] = local68;
							local73.anInt398 = anInt943;
							local152 = arg0.method351(3);
							local73.method250(true, local152);
							local162 = arg0.method351(3);
							local73.method250(true, local162);
							@Pc(220) int local220 = arg0.method351(1);
							if (local220 == 1) {
								this.anIntArray251[this.anInt941++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray264[this.anInt972++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("69684, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method670() {
		try {
			if (this.anInt844 == 2) {
				this.method599(this.anInt885 * 2, (this.anInt884 - this.anInt1027 << 7) + this.anInt887, (this.anInt883 - this.anInt1026 << 7) + this.anInt886);
				if (this.anInt1031 > -1 && anInt943 % 20 < 10) {
					this.aClass2_Sub1_Sub2_Sub1Array5[0].method42(this.anInt1031 - 12, this.anInt1032 - 28);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("35023, " + 0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt1001 = Integer.parseInt(this.getParameter("nodeid"));
		anInt1002 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method621();
		} else {
			method644();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean263 = false;
		} else {
			aBoolean263 = true;
		}
		this.method577();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method671(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt882 >= 100) {
					this.method607("", 0, "Your ignore list is full. Max of 100 hit", this.aByte28);
				} else {
					@Pc(24) String local24 = Class7.method57(Class7.method54(arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt882; local26++) {
						if (this.aLongArray4[local26] == arg0) {
							this.method607("", 0, local24 + " is already on your ignore list", this.aByte28);
							return;
						}
					}
					for (@Pc(57) int local57 = 0; local57 < this.anInt970; local57++) {
						if (this.aLongArray3[local57] == arg0) {
							this.method607("", 0, "Please remove " + local24 + " from your friend list first", this.aByte28);
							return;
						}
					}
					this.aLongArray4[this.anInt882++] = arg0;
					this.aBoolean251 = true;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 112);
					this.aClass2_Sub1_Sub4_9.method336(arg0);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("57897, " + false + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg5 & 0x7FF;
			this.anInt975 += 0;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = arg2;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(43) int local43;
			if (local5 != 0) {
				local29 = Class2_Sub1_Sub3_Sub5.anIntArray171[local5];
				local33 = Class2_Sub1_Sub3_Sub5.anIntArray172[local5];
				local43 = local33 * 0 - arg2 * local29 >> 16;
				local23 = local29 * 0 + arg2 * local33 >> 16;
				local21 = local43;
			}
			if (local11 != 0) {
				local29 = Class2_Sub1_Sub3_Sub5.anIntArray171[local11];
				local33 = Class2_Sub1_Sub3_Sub5.anIntArray172[local11];
				local43 = local23 * local29 + local33 * 0 >> 16;
				local23 = local23 * local33 - local29 * 0 >> 16;
				local19 = local43;
			}
			this.anInt1020 = arg3 - local19;
			this.anInt1021 = arg4 - local21;
			this.anInt1022 = arg1 - local23;
			this.anInt1023 = arg0;
			this.anInt1024 = arg5;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("82026, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Ljava/net/Socket;")
	public Socket method673(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method675() {
		try {
			if (this.anInt822 >= 2 || this.anInt945 != 0 || this.anInt932 != 0) {
				@Pc(34) String local34;
				if (this.anInt945 == 1 && this.anInt822 < 2) {
					local34 = "Use " + this.aString23 + " with...";
				} else if (this.anInt932 == 1 && this.anInt822 < 2) {
					local34 = this.aString22 + "...";
				} else {
					local34 = this.aStringArray8[this.anInt822 - 1];
				}
				if (this.anInt822 > 2) {
					local34 = local34 + "@whi@ / " + (this.anInt822 - 2) + " more options";
				}
				this.aClass2_Sub1_Sub2_Sub2_4.method94(15, 4, 16777215, local34, anInt943 / 1000);
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("85252, " + true + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method676(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) Class15 local6 = Class15.method120(arg0);
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray54.length && local6.anIntArray54[local8] != -1; local8++) {
				@Pc(22) Class15 local22 = Class15.method120(local6.anIntArray54[local8]);
				if (local22.anInt206 == 1) {
					this.method676(local22.anInt200);
				}
				local22.anInt197 = 0;
				local22.anInt186 = 0;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("58059, " + arg0 + ", " + 12281 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method677() {
		try {
			if (this.aClass32_3 == null) {
				super.aClass32_2 = null;
				this.aClass32_27 = null;
				this.aClass32_25 = null;
				this.aClass32_24 = null;
				this.aClass32_26 = null;
				this.aClass32_21 = null;
				this.aClass32_22 = null;
				this.aClass32_23 = null;
				this.aClass32_6 = new Class32(3, 265, 128, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass32_7 = new Class32(3, 265, 128, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass32_3 = new Class32(3, 171, 509, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass32_4 = new Class32(3, 132, 360, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass32_5 = new Class32(3, 200, 360, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass32_8 = new Class32(3, 238, 202, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass32_9 = new Class32(3, 238, 203, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass32_10 = new Class32(3, 94, 74, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass32_11 = new Class32(3, 94, 75, this.method586());
				Class2_Sub1_Sub2.method476();
				if (this.aClass13_2 != null) {
					this.method652(aBoolean241);
					this.method656((byte) 7);
				}
				this.aBoolean234 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("63223, " + 5 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method678() {
		try {
			if (this.anInt852 > 1) {
				this.anInt852--;
			}
			if (this.anInt979 > 0) {
				this.anInt979--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method723(); local22++) {
			}
			if (this.aBoolean238) {
				@Pc(41) Object local41 = this.aClass26_1.anObject1;
				@Pc(67) int local67;
				@Pc(69) int local69;
				@Pc(71) int local71;
				@Pc(104) int local104;
				synchronized (this.aClass26_1.anObject1) {
					if (!aBoolean248) {
						this.aClass26_1.anInt447 = 0;
					} else if (super.anInt816 != 0 || this.aClass26_1.anInt447 >= 40) {
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 238);
						this.aClass2_Sub1_Sub4_9.method330(0);
						local67 = this.aClass2_Sub1_Sub4_9.anInt556;
						local69 = 0;
						@Pc(87) int local87;
						for (local71 = 0; local71 < this.aClass26_1.anInt447 && local67 - this.aClass2_Sub1_Sub4_9.anInt556 < 240; local71++) {
							local69++;
							local87 = this.aClass26_1.anIntArray99[local71];
							if (local87 < 0) {
								local87 = 0;
							} else if (local87 > 502) {
								local87 = 502;
							}
							local104 = this.aClass26_1.anIntArray100[local71];
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 > 764) {
								local104 = 764;
							}
							@Pc(121) int local121 = local87 * 765 + local104;
							if (this.aClass26_1.anIntArray99[local71] == -1 && this.aClass26_1.anIntArray100[local71] == -1) {
								local104 = -1;
								local87 = -1;
								local121 = 524287;
							}
							if (local104 != this.anInt930 || local87 != this.anInt931) {
								@Pc(166) int local166 = local104 - this.anInt930;
								this.anInt930 = local104;
								@Pc(174) int local174 = local87 - this.anInt931;
								this.anInt931 = local87;
								if (this.anInt1006 < 8 && local166 >= -32 && local166 <= 31 && local174 >= -32 && local174 <= 31) {
									local166 += 32;
									local174 += 32;
									this.aClass2_Sub1_Sub4_9.method331((this.anInt1006 << 12) + (local166 << 6) + local174);
									this.anInt1006 = 0;
								} else if (this.anInt1006 < 8) {
									this.aClass2_Sub1_Sub4_9.method333((this.anInt1006 << 19) + local121 + 8388608);
									this.anInt1006 = 0;
								} else {
									this.aClass2_Sub1_Sub4_9.method334((this.anInt1006 << 19) + local121 - 1073741824);
									this.anInt1006 = 0;
								}
							} else if (this.anInt1006 < 2047) {
								this.anInt1006++;
							}
						}
						this.aClass2_Sub1_Sub4_9.method339(this.aClass2_Sub1_Sub4_9.anInt556 - local67);
						if (local69 >= this.aClass26_1.anInt447) {
							this.aClass26_1.anInt447 = 0;
						} else {
							this.aClass26_1.anInt447 -= local69;
							for (local87 = 0; local87 < this.aClass26_1.anInt447; local87++) {
								this.aClass26_1.anIntArray100[local87] = this.aClass26_1.anIntArray100[local87 + local69];
								this.aClass26_1.anIntArray99[local87] = this.aClass26_1.anIntArray99[local87 + local69];
							}
						}
					}
				}
				if (super.anInt816 != 0) {
					@Pc(337) long local337 = (super.aLong28 - this.aLong29) / 50L;
					if (local337 > 4095L) {
						local337 = 4095L;
					}
					this.aLong29 = super.aLong28;
					local67 = super.anInt818;
					if (local67 < 0) {
						local67 = 0;
					} else if (local67 > 502) {
						local67 = 502;
					}
					local69 = super.anInt817;
					if (local69 < 0) {
						local69 = 0;
					} else if (local69 > 764) {
						local69 = 764;
					}
					local71 = local67 * 765 + local69;
					@Pc(383) byte local383 = 0;
					if (super.anInt816 == 2) {
						local383 = 1;
					}
					local104 = (int) local337;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 133);
					this.aClass2_Sub1_Sub4_9.method373((local104 << 20) + (local383 << 19) + local71);
				}
				if (this.anInt855 > 0) {
					this.anInt855--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean229 = true;
				}
				if (this.aBoolean229 && this.anInt855 <= 0) {
					this.anInt855 = 20;
					this.aBoolean229 = false;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 144);
					this.aClass2_Sub1_Sub4_9.method364(this.anInt912);
					this.aClass2_Sub1_Sub4_9.method364(this.anInt913);
				}
				if (super.aBoolean221 && !this.aBoolean232) {
					this.aBoolean232 = true;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 166);
					this.aClass2_Sub1_Sub4_9.method330(1);
				}
				if (!super.aBoolean221 && this.aBoolean232) {
					this.aBoolean232 = false;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 166);
					this.aClass2_Sub1_Sub4_9.method330(0);
				}
				this.method712();
				this.method624();
				this.method629();
				this.anInt977++;
				if (this.anInt977 > 750) {
					this.method658();
				}
				this.method692(this.anInt879);
				this.method696();
				this.method654();
				this.anInt909++;
				if (this.anInt1043 != 0) {
					this.anInt1042 += 20;
					if (this.anInt1042 >= 400) {
						this.anInt1043 = 0;
					}
				}
				if (this.anInt859 != 0) {
					this.anInt856++;
					if (this.anInt856 >= 15) {
						if (this.anInt859 == 2) {
							this.aBoolean251 = true;
						}
						if (this.anInt859 == 3) {
							this.aBoolean239 = true;
						}
						this.anInt859 = 0;
					}
				}
				if (this.anInt900 != 0) {
					this.anInt994++;
					if (super.anInt811 > this.anInt901 + 5 || super.anInt811 < this.anInt901 - 5 || super.anInt812 > this.anInt902 + 5 || super.anInt812 < this.anInt902 - 5) {
						this.aBoolean257 = true;
					}
					if (super.anInt810 == 0) {
						if (this.anInt900 == 2) {
							this.aBoolean251 = true;
						}
						if (this.anInt900 == 3) {
							this.aBoolean239 = true;
						}
						this.anInt900 = 0;
						if (this.aBoolean257 && this.anInt994 >= 5) {
							this.anInt974 = -1;
							this.method689();
							if (this.anInt974 == this.anInt898 && this.anInt973 != this.anInt899) {
								@Pc(690) Class15 local690 = Class15.method120(this.anInt898);
								@Pc(692) byte local692 = 0;
								if (this.anInt845 == 1 && local690.anInt204 == 206) {
									local692 = 1;
								}
								if (local690.anIntArray50[this.anInt973] <= 0) {
									local692 = 0;
								}
								if (local690.aBoolean59) {
									local67 = this.anInt899;
									local69 = this.anInt973;
									local690.anIntArray50[local69] = local690.anIntArray50[local67];
									local690.anIntArray52[local69] = local690.anIntArray52[local67];
									local690.anIntArray50[local67] = -1;
									local690.anIntArray52[local67] = 0;
								} else if (local692 == 1) {
									local67 = this.anInt899;
									local69 = this.anInt973;
									while (local67 != local69) {
										if (local67 > local69) {
											local690.method122(local67 - 1, local67);
											local67--;
										} else if (local67 < local69) {
											local690.method122(local67 + 1, local67);
											local67++;
										}
									}
								} else {
									local690.method122(this.anInt973, this.anInt899);
								}
								this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 214);
								this.aClass2_Sub1_Sub4_9.method365(aBoolean225, this.anInt898);
								this.aClass2_Sub1_Sub4_9.method365(aBoolean225, this.anInt899);
								this.aClass2_Sub1_Sub4_9.method357(local692);
								this.aClass2_Sub1_Sub4_9.method364(this.anInt973);
							}
						} else if ((this.anInt892 == 1 || this.method600(this.anInt822 - 1)) && this.anInt822 > 2) {
							this.method602();
						} else if (this.anInt822 > 0) {
							this.method645(this.anInt822 - 1);
						}
						this.anInt856 = 10;
						super.anInt816 = 0;
					}
				}
				@Pc(867) int local867;
				@Pc(869) int local869;
				if (Class46.anInt768 != -1) {
					local867 = Class46.anInt768;
					local869 = Class46.anInt769;
					@Pc(890) boolean local890 = this.method642(0, 0, local867, 0, aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0], aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0], 0, local869, true, 0, 0);
					Class46.anInt768 = -1;
					if (local890) {
						this.anInt1040 = super.anInt817;
						this.anInt1041 = super.anInt818;
						this.anInt1043 = 1;
						this.anInt1042 = 0;
					}
				}
				if (super.anInt816 == 1 && this.aString17 != null) {
					this.aString17 = null;
					this.aBoolean239 = true;
					super.anInt816 = 0;
				}
				this.method623();
				if (this.anInt897 == -1) {
					this.method614();
					this.method632();
					this.method719();
				}
				if (super.anInt810 == 1 || super.anInt816 == 1) {
					this.anInt983++;
				}
				if (this.anInt907 == 0 && this.anInt1039 == 0 && this.anInt831 == 0) {
					if (this.anInt825 > 0) {
						this.anInt825--;
					}
				} else if (this.anInt825 < 100) {
					this.anInt825++;
					if (this.anInt825 == 100) {
						if (this.anInt907 != 0) {
							this.aBoolean239 = true;
						}
						if (this.anInt1039 != 0) {
							this.aBoolean251 = true;
						}
					}
				}
				if (this.anInt968 == 2) {
					this.method620();
				}
				if (this.anInt968 == 2 && this.aBoolean236) {
					this.method628();
				}
				for (local867 = 0; local867 < 5; local867++) {
					@Pc(1034) int local1034 = this.anIntArray255[local867]++;
				}
				this.method655();
				super.anInt809++;
				if (super.anInt809 > 4500) {
					this.anInt979 = 250;
					super.anInt809 -= 500;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 88);
				}
				this.anInt847++;
				if (this.anInt847 > 500) {
					this.anInt847 = 0;
					local869 = (int) (Math.random() * 8.0D);
					if ((local869 & 0x1) == 1) {
						this.anInt1045 += this.anInt1046;
					}
					if ((local869 & 0x2) == 2) {
						this.anInt955 += this.anInt956;
					}
					if ((local869 & 0x4) == 4) {
						this.anInt1018 += this.anInt1019;
					}
				}
				if (this.anInt1045 < -50) {
					this.anInt1046 = 2;
				}
				if (this.anInt1045 > 50) {
					this.anInt1046 = -2;
				}
				if (this.anInt955 < -55) {
					this.anInt956 = 2;
				}
				if (this.anInt955 > 55) {
					this.anInt956 = -2;
				}
				if (this.anInt1018 < -40) {
					this.anInt1019 = 1;
				}
				if (this.anInt1018 > 40) {
					this.anInt1019 = -1;
				}
				this.anInt872++;
				if (this.anInt872 > 500) {
					this.anInt872 = 0;
					local869 = (int) (Math.random() * 8.0D);
					if ((local869 & 0x1) == 1) {
						this.anInt842 += this.anInt843;
					}
					if ((local869 & 0x2) == 2) {
						this.anInt984 += this.anInt985;
					}
				}
				if (this.anInt842 < -60) {
					this.anInt843 = 2;
				}
				if (this.anInt842 > 60) {
					this.anInt843 = -2;
				}
				if (this.anInt984 < -20) {
					this.anInt985 = 1;
				}
				if (this.anInt984 > 10) {
					this.anInt985 = -1;
				}
				anInt889++;
				if (anInt889 > 57) {
					anInt889 = 0;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 143);
				}
				this.anInt978++;
				if (this.anInt978 > 50) {
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 157);
				}
				try {
					if (this.aClass28_1 != null && this.aClass2_Sub1_Sub4_9.anInt556 > 0) {
						this.aClass28_1.method283(this.aClass2_Sub1_Sub4_9.anInt556, this.aClass2_Sub1_Sub4_9.aByteArray17, this.anInt924);
						this.aClass2_Sub1_Sub4_9.anInt556 = 0;
						this.anInt978 = 0;
					}
				} catch (@Pc(1294) IOException local1294) {
					this.method658();
				} catch (@Pc(1299) Exception local1299) {
					this.method633();
				}
			}
		} catch (@Pc(1304) RuntimeException local1304) {
			signlink.reporterror("91970, " + 4 + ", " + local1304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method679() {
		try {
			this.aBoolean238 &= true;
			for (@Pc(12) Class2_Sub1_Sub3_Sub1 local12 = (Class2_Sub1_Sub3_Sub1) this.aClass12_11.method111(); local12 != null; local12 = (Class2_Sub1_Sub3_Sub1) this.aClass12_11.method113()) {
				if (local12.anInt98 != this.anInt925 || anInt943 > local12.anInt91) {
					local12.method507();
				} else if (anInt943 >= local12.anInt90) {
					if (local12.anInt97 > 0) {
						@Pc(42) Class2_Sub1_Sub3_Sub2_Sub1 local42 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local12.anInt97 - 1];
						if (local42 != null && local42.anInt385 >= 0 && local42.anInt385 < 13312 && local42.anInt386 >= 0 && local42.anInt386 < 13312) {
							local12.method68(local42.anInt386, local42.anInt385, this.method590(local42.anInt385, local12.anInt98, local42.anInt386) - local12.anInt89, anInt943);
						}
					}
					if (local12.anInt97 < 0) {
						@Pc(87) int local87 = -local12.anInt97 - 1;
						@Pc(93) Class2_Sub1_Sub3_Sub2_Sub2 local93;
						if (local87 == this.anInt942) {
							local93 = aClass2_Sub1_Sub3_Sub2_Sub2_1;
						} else {
							local93 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local87];
						}
						if (local93 != null && local93.anInt385 >= 0 && local93.anInt385 < 13312 && local93.anInt386 >= 0 && local93.anInt386 < 13312) {
							local12.method68(local93.anInt386, local93.anInt385, this.method590(local93.anInt385, local12.anInt98, local93.anInt386) - local12.anInt89, anInt943);
						}
					}
					local12.method67(this.anInt909);
					this.aClass46_1.method528(local12, false, (int) local12.aDouble3, local12.anInt99, (int) local12.aDouble4, -1, this.anInt925, 60, (int) local12.aDouble2);
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("73877, " + true + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method680(@OriginalArg(0) int arg0) {
		try {
			Class41.aClass1_9.method3();
			Class41.aClass1_8.method3();
			Class10.aClass1_1.method3();
			Class34.aClass1_6.method3();
			@Pc(11) int local11 = 56 / arg0;
			Class34.aClass1_5.method3();
			Class2_Sub1_Sub3_Sub2_Sub2.aClass1_4.method3();
			Class37.aClass1_7.method3();
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("48764, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method681() {
		try {
			if (this.anInt992 != 0) {
				@Pc(8) Class2_Sub1_Sub2_Sub2 local8 = this.aClass2_Sub1_Sub2_Sub2_3;
				@Pc(10) int local10 = 0;
				if (this.anInt852 != 0) {
					local10 = 1;
				}
				for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
					if (this.aStringArray10[local17] != null) {
						@Pc(29) int local29 = this.anIntArray232[local17];
						@Pc(34) String local34 = this.aStringArray9[local17];
						@Pc(36) byte local36 = 0;
						if (local34 != null && local34.startsWith("@cr1@")) {
							local34 = local34.substring(5);
							local36 = 1;
						}
						if (local34 != null && local34.startsWith("@cr2@")) {
							local34 = local34.substring(5);
							local36 = 2;
						}
						@Pc(87) int local87;
						if ((local29 == 3 || local29 == 7) && (local29 == 7 || this.anInt848 == 0 || this.anInt848 == 1 && this.method688(local34, (byte) 1))) {
							local87 = 329 - local10 * 13;
							local8.method89(4, 0, local87, "From");
							local8.method89(4, 65535, local87 - 1, "From");
							@Pc(112) int local112 = local8.method87("From ") + 4;
							if (local36 == 1) {
								this.aClass2_Sub1_Sub2_Sub3Array5[0].method277(local112, local87 - 12);
								local112 += 14;
							}
							if (local36 == 2) {
								this.aClass2_Sub1_Sub2_Sub3Array5[1].method277(local112, local87 - 12);
								local112 += 14;
							}
							local8.method89(local112, 0, local87, local34 + ": " + this.aStringArray10[local17]);
							local8.method89(local112, 65535, local87 - 1, local34 + ": " + this.aStringArray10[local17]);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local29 == 5 && this.anInt848 < 2) {
							local87 = 329 - local10 * 13;
							local8.method89(4, 0, local87, this.aStringArray10[local17]);
							local8.method89(4, 65535, local87 - 1, this.aStringArray10[local17]);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local29 == 6 && this.anInt848 < 2) {
							local87 = 329 - local10 * 13;
							local8.method89(4, 0, local87, "To " + local34 + ": " + this.aStringArray10[local17]);
							local8.method89(4, 65535, local87 - 1, "To " + local34 + ": " + this.aStringArray10[local17]);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(301) RuntimeException local301) {
			signlink.reporterror("94269, " + 2 + ", " + local301.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!RSWRPCHR;I)V")
	private void method682(@OriginalArg(1) Class2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method350();
			@Pc(9) int local9 = arg0.method351(8);
			@Pc(19) int local19;
			if (local9 < this.anInt891) {
				for (local19 = local9; local19 < this.anInt891; local19++) {
					this.anIntArray264[this.anInt972++] = this.anIntArray235[local19];
				}
			}
			if (local9 > this.anInt891) {
				signlink.reporterror(this.aString29 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt891 = 0;
			for (local19 = 0; local19 < local9; local19++) {
				@Pc(71) int local71 = this.anIntArray235[local19];
				@Pc(76) Class2_Sub1_Sub3_Sub2_Sub1 local76 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local71];
				@Pc(81) int local81 = arg0.method351(1);
				if (local81 == 0) {
					this.anIntArray235[this.anInt891++] = local71;
					local76.anInt398 = anInt943;
				} else {
					@Pc(104) int local104 = arg0.method351(2);
					if (local104 == 0) {
						this.anIntArray235[this.anInt891++] = local71;
						local76.anInt398 = anInt943;
						this.anIntArray251[this.anInt941++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray235[this.anInt891++] = local71;
							local76.anInt398 = anInt943;
							local155 = arg0.method351(3);
							local76.method250(false, local155);
							local165 = arg0.method351(1);
							if (local165 == 1) {
								this.anIntArray251[this.anInt941++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray235[this.anInt891++] = local71;
							local76.anInt398 = anInt943;
							local155 = arg0.method351(3);
							local76.method250(true, local155);
							local165 = arg0.method351(3);
							local76.method250(true, local165);
							@Pc(223) int local223 = arg0.method351(1);
							if (local223 == 1) {
								this.anIntArray251[this.anInt941++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray264[this.anInt972++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("76004, " + false + ", " + arg0 + ", " + arg1 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
	private void method683(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class42.aClass42Array1[arg0].anInt669;
			if (local4 != 0) {
				@Pc(18) int local18 = this.anIntArray228[arg0];
				if (local4 == 1) {
					if (local18 == 1) {
						Class2_Sub1_Sub2_Sub4.method494(0.9D);
					}
					if (local18 == 2) {
						Class2_Sub1_Sub2_Sub4.method494(0.8D);
					}
					if (local18 == 3) {
						Class2_Sub1_Sub2_Sub4.method494(0.7D);
					}
					if (local18 == 4) {
						Class2_Sub1_Sub2_Sub4.method494(0.6D);
					}
					Class34.aClass1_5.method3();
					this.aBoolean234 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean265;
					if (local18 == 0) {
						this.method691(0, this.aBoolean265);
						this.aBoolean265 = true;
					}
					if (local18 == 1) {
						this.method691(-400, this.aBoolean265);
						this.aBoolean265 = true;
					}
					if (local18 == 2) {
						this.method691(-800, this.aBoolean265);
						this.aBoolean265 = true;
					}
					if (local18 == 3) {
						this.method691(-1200, this.aBoolean265);
						this.aBoolean265 = true;
					}
					if (local18 == 4) {
						this.aBoolean265 = false;
					}
					if (this.aBoolean265 != local56 && !aBoolean264) {
						if (this.aBoolean265) {
							this.anInt851 = this.anInt936;
							this.aBoolean228 = true;
							this.aClass9_Sub1_1.method316(2, this.anInt851);
						} else {
							this.method636();
						}
						this.anInt840 = 0;
					}
				}
				if (local4 == 4) {
					if (local18 == 0) {
						this.aBoolean230 = true;
						this.method705(0);
					}
					if (local18 == 1) {
						this.aBoolean230 = true;
						this.method705(-400);
					}
					if (local18 == 2) {
						this.aBoolean230 = true;
						this.method705(-800);
					}
					if (local18 == 3) {
						this.aBoolean230 = true;
						this.method705(-1200);
					}
					if (local18 == 4) {
						this.aBoolean230 = false;
					}
				}
				if (local4 == 5) {
					this.anInt892 = local18;
				}
				if (local4 == 6) {
					this.anInt988 = local18;
				}
				if (local4 == 8) {
					this.anInt992 = local18;
					this.aBoolean239 = true;
				}
				if (local4 == 9) {
					this.anInt845 = local18;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("51969, " + 4 + ", " + arg0 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!RSWRPCHR;)V")
	private void method684(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			@Pc(15) int local15;
			@Pc(24) int local24;
			@Pc(31) int local31;
			@Pc(34) int local34;
			@Pc(37) int local37;
			@Pc(43) int local43;
			@Pc(47) int local47;
			if (arg0 == 65) {
				local15 = arg1.method340();
				local24 = this.anInt964 + (local15 >> 4 & 0x7);
				local31 = this.anInt965 + (local15 & 0x7);
				local34 = arg1.method342();
				local37 = arg1.method340();
				local43 = local37 >> 4 & 0xF;
				local47 = local37 & 0x7;
				if (aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0] >= local24 - local43 && aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0] <= local24 + local43 && aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0] >= local31 - local43 && aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0] <= local31 + local43 && this.aBoolean230 && !aBoolean264 && this.anInt957 < 50) {
					this.anIntArray224[this.anInt957] = local34;
					this.anIntArray244[this.anInt957] = local47;
					this.anIntArray249[this.anInt957] = Class30.anIntArray103[local34];
					this.anInt957++;
				}
			}
			@Pc(157) int local157;
			@Pc(177) int local177;
			@Pc(189) int local189;
			@Pc(203) int local203;
			@Pc(215) int local215;
			@Pc(235) int local235;
			if (arg0 == 169) {
				local15 = arg1.method359();
				local24 = this.anInt964 + (local15 >> 4 & 0x7);
				local31 = this.anInt965 + (local15 & 0x7);
				local34 = arg1.method340();
				local37 = local34 >> 2;
				local43 = local34 & 0x3;
				local47 = this.anIntArray223[local37];
				local157 = arg1.method367(65);
				if (local24 >= 0 && local31 >= 0 && local24 < 103 && local31 < 103) {
					local177 = this.anIntArrayArrayArray8[this.anInt925][local24][local31];
					local189 = this.anIntArrayArrayArray8[this.anInt925][local24 + 1][local31];
					local203 = this.anIntArrayArrayArray8[this.anInt925][local24 + 1][local31 + 1];
					local215 = this.anIntArrayArrayArray8[this.anInt925][local24][local31 + 1];
					if (local47 == 0) {
						@Pc(226) Class49 local226 = this.aClass46_1.method539(local24, local31, this.anInt925);
						if (local226 != null) {
							local235 = local226.anInt791 >> 14 & 0x7FFF;
							if (local37 == 2) {
								local226.aClass2_Sub1_Sub3_7 = new Class2_Sub1_Sub3_Sub4(local203, local235, local43 + 4, 466, 2, local215, local189, local157, local177, false);
								local226.aClass2_Sub1_Sub3_8 = new Class2_Sub1_Sub3_Sub4(local203, local235, local43 + 1 & 0x3, 466, 2, local215, local189, local157, local177, false);
							} else {
								local226.aClass2_Sub1_Sub3_7 = new Class2_Sub1_Sub3_Sub4(local203, local235, local43, 466, local37, local215, local189, local157, local177, false);
							}
						}
					}
					if (local47 == 1) {
						@Pc(304) Class35 local304 = this.aClass46_1.method540(this.aByte30, local31, this.anInt925, local24);
						if (local304 != null) {
							local304.aClass2_Sub1_Sub3_2 = new Class2_Sub1_Sub3_Sub4(local203, local304.anInt599 >> 14 & 0x7FFF, 0, 466, 4, local215, local189, local157, local177, false);
						}
					}
					if (local47 == 2) {
						@Pc(338) Class27 local338 = this.aClass46_1.method541(local24, this.anInt925, local31);
						if (local37 == 11) {
							local37 = 10;
						}
						if (local338 != null) {
							local338.aClass2_Sub1_Sub3_1 = new Class2_Sub1_Sub3_Sub4(local203, local338.anInt459 >> 14 & 0x7FFF, local43, 466, local37, local215, local189, local157, local177, false);
						}
					}
					if (local47 == 3) {
						@Pc(378) Class39 local378 = this.aClass46_1.method542(local31, local24, this.anInt877, this.anInt925);
						if (local378 != null) {
							local378.aClass2_Sub1_Sub3_3 = new Class2_Sub1_Sub3_Sub4(local203, local378.anInt639 >> 14 & 0x7FFF, local43, 466, 22, local215, local189, local157, local177, false);
						}
					}
				}
			} else {
				@Pc(453) Class2_Sub1_Sub3_Sub3 local453;
				if (arg0 == 245) {
					local15 = arg1.method342();
					local24 = arg1.method360(382);
					local31 = this.anInt964 + (local24 >> 4 & 0x7);
					local34 = this.anInt965 + (local24 & 0x7);
					if (local31 >= 0 && local34 >= 0 && local31 < 104 && local34 < 104) {
						@Pc(447) Class12 local447 = this.aClass12ArrayArrayArray1[this.anInt925][local31][local34];
						if (local447 != null) {
							for (local453 = (Class2_Sub1_Sub3_Sub3) local447.method111(); local453 != null; local453 = (Class2_Sub1_Sub3_Sub3) local447.method113()) {
								if (local453.anInt327 == (local15 & 0x7FFF)) {
									local453.method507();
									break;
								}
							}
							if (local447.method111() == null) {
								this.aClass12ArrayArrayArray1[this.anInt925][local31][local34] = null;
							}
							this.method646(local31, local34);
						}
					}
				} else if (arg0 == 165) {
					local15 = arg1.method360(382);
					local24 = local15 >> 2;
					local31 = local15 & 0x3;
					local34 = this.anIntArray223[local24];
					local37 = arg1.method360(382);
					local43 = this.anInt964 + (local37 >> 4 & 0x7);
					local47 = this.anInt965 + (local37 & 0x7);
					if (local43 >= 0 && local47 >= 0 && local43 < 104 && local47 < 104) {
						this.method710(local34, -1, local47, this.anInt925, local31, this.aBoolean243, local24, local43, -1, 0);
					}
				} else {
					if (arg0 == 238) {
						local15 = arg1.method359();
						local24 = this.anInt964 + (local15 >> 4 & 0x7);
						local31 = this.anInt965 + (local15 & 0x7);
						local34 = arg1.method366();
						@Pc(586) byte local586 = arg1.method361();
						@Pc(590) byte local590 = arg1.method362();
						local47 = arg1.method367(65);
						local157 = arg1.method367(65);
						local177 = arg1.method358();
						local189 = local177 >> 2;
						local203 = local177 & 0x3;
						local215 = this.anIntArray223[local189];
						@Pc(619) byte local619 = arg1.method361();
						local235 = arg1.method368();
						@Pc(626) byte local626 = arg1.method341();
						@Pc(632) Class2_Sub1_Sub3_Sub2_Sub2 local632;
						if (local34 == this.anInt942) {
							local632 = aClass2_Sub1_Sub3_Sub2_Sub2_1;
						} else {
							local632 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local34];
						}
						if (local632 != null) {
							@Pc(644) Class41 local644 = Class41.method403(local235);
							@Pc(654) int local654 = this.anIntArrayArrayArray8[this.anInt925][local24][local31];
							@Pc(666) int local666 = this.anIntArrayArrayArray8[this.anInt925][local24 + 1][local31];
							@Pc(680) int local680 = this.anIntArrayArrayArray8[this.anInt925][local24 + 1][local31 + 1];
							@Pc(692) int local692 = this.anIntArrayArrayArray8[this.anInt925][local24][local31 + 1];
							@Pc(702) Class2_Sub1_Sub3_Sub5 local702 = local644.method410(local189, local203, local654, local666, local680, local692, -1);
							if (local702 != null) {
								this.method710(local215, -1, local31, this.anInt925, 0, this.aBoolean243, 0, local24, local47 + 1, local157 + 1);
								local632.anInt439 = local157 + anInt943;
								local632.anInt440 = local47 + anInt943;
								local632.aClass2_Sub1_Sub3_Sub5_1 = local702;
								@Pc(738) int local738 = local644.anInt663;
								@Pc(741) int local741 = local644.anInt646;
								if (local203 == 1 || local203 == 3) {
									local738 = local644.anInt646;
									local741 = local644.anInt663;
								}
								local632.anInt424 = local24 * 128 + local738 * 64;
								local632.anInt426 = local31 * 128 + local741 * 64;
								local632.anInt425 = this.method590(local632.anInt424, this.anInt925, local632.anInt426);
								@Pc(787) byte local787;
								if (local626 > local586) {
									local787 = local626;
									local626 = local586;
									local586 = local787;
								}
								if (local619 > local590) {
									local787 = local619;
									local619 = local590;
									local590 = local787;
								}
								local632.anInt430 = local24 + local626;
								local632.anInt432 = local24 + local586;
								local632.anInt431 = local31 + local619;
								local632.anInt433 = local31 + local590;
							}
						}
					}
					if (arg0 == 179) {
						local15 = arg1.method358();
						local24 = this.anInt964 + (local15 >> 4 & 0x7);
						local31 = this.anInt965 + (local15 & 0x7);
						local34 = arg1.method367(65);
						local37 = arg1.method368();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							local453 = new Class2_Sub1_Sub3_Sub3();
							local453.anInt327 = local37;
							local453.anInt328 = local34;
							if (this.aClass12ArrayArrayArray1[this.anInt925][local24][local31] == null) {
								this.aClass12ArrayArrayArray1[this.anInt925][local24][local31] = new Class12(false);
							}
							this.aClass12ArrayArrayArray1[this.anInt925][local24][local31].method108(local453);
							this.method646(local24, local31);
						}
					} else if (arg0 == 215) {
						local15 = arg1.method368();
						local24 = arg1.method359();
						local31 = local24 >> 2;
						local34 = local24 & 0x3;
						local37 = this.anIntArray223[local31];
						local43 = arg1.method360(382);
						local47 = this.anInt964 + (local43 >> 4 & 0x7);
						local157 = this.anInt965 + (local43 & 0x7);
						if (local47 >= 0 && local157 >= 0 && local47 < 104 && local157 < 104) {
							this.method710(local37, local15, local157, this.anInt925, local34, this.aBoolean243, local31, local47, -1, 0);
						}
					} else if (arg0 == 237) {
						local15 = arg1.method340();
						local24 = this.anInt964 + (local15 >> 4 & 0x7);
						local31 = this.anInt965 + (local15 & 0x7);
						local34 = local24 + arg1.method341();
						local37 = local31 + arg1.method341();
						local43 = arg1.method343();
						local47 = arg1.method342();
						local157 = arg1.method340() * 4;
						local177 = arg1.method340() * 4;
						local189 = arg1.method342();
						local203 = arg1.method342();
						local215 = arg1.method340();
						@Pc(1039) int local1039 = arg1.method340();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local34 >= 0 && local37 >= 0 && local34 < 104 && local37 < 104 && local47 != 65535) {
							local24 = local24 * 128 + 64;
							local31 = local31 * 128 + 64;
							local34 = local34 * 128 + 64;
							local37 = local37 * 128 + 64;
							@Pc(1116) Class2_Sub1_Sub3_Sub1 local1116 = new Class2_Sub1_Sub3_Sub1(local203 + anInt943, local1039, local189 + anInt943, this.anInt1044, local24, local31, local43, local177, this.anInt925, this.method590(local24, this.anInt925, local31) - local157, local215, local47);
							local1116.method68(local37, local34, this.method590(local34, this.anInt925, local37) - local177, local189 + anInt943);
							this.aClass12_11.method108(local1116);
						}
					} else if (arg0 == 48) {
						local15 = arg1.method340();
						local24 = this.anInt964 + (local15 >> 4 & 0x7);
						local31 = this.anInt965 + (local15 & 0x7);
						local34 = arg1.method342();
						local37 = arg1.method340();
						local43 = arg1.method342();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							local24 = local24 * 128 + 64;
							local31 = local31 * 128 + 64;
							@Pc(1212) Class2_Sub1_Sub3_Sub6 local1212 = new Class2_Sub1_Sub3_Sub6(local34, false, local31, local43, local24, this.method590(local24, this.anInt925, local31) - local37, this.anInt925, anInt943);
							this.aClass12_12.method108(local1212);
						}
					} else if (arg0 == 155) {
						local15 = arg1.method360(382);
						local24 = this.anInt964 + (local15 >> 4 & 0x7);
						local31 = this.anInt965 + (local15 & 0x7);
						local34 = arg1.method367(65);
						local37 = arg1.method367(65);
						local43 = arg1.method366();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local34 != this.anInt942) {
							@Pc(1270) Class2_Sub1_Sub3_Sub3 local1270 = new Class2_Sub1_Sub3_Sub3();
							local1270.anInt327 = local37;
							local1270.anInt328 = local43;
							if (this.aClass12ArrayArrayArray1[this.anInt925][local24][local31] == null) {
								this.aClass12ArrayArrayArray1[this.anInt925][local24][local31] = new Class12(false);
							}
							this.aClass12ArrayArrayArray1[this.anInt925][local24][local31].method108(local1270);
							this.method646(local24, local31);
						}
					} else if (arg0 == 189) {
						local15 = arg1.method340();
						local24 = this.anInt964 + (local15 >> 4 & 0x7);
						local31 = this.anInt965 + (local15 & 0x7);
						local34 = arg1.method342();
						local37 = arg1.method342();
						local43 = arg1.method342();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							@Pc(1366) Class12 local1366 = this.aClass12ArrayArrayArray1[this.anInt925][local24][local31];
							if (local1366 != null) {
								for (@Pc(1372) Class2_Sub1_Sub3_Sub3 local1372 = (Class2_Sub1_Sub3_Sub3) local1366.method111(); local1372 != null; local1372 = (Class2_Sub1_Sub3_Sub3) local1366.method113()) {
									if (local1372.anInt327 == (local34 & 0x7FFF) && local1372.anInt328 == local37) {
										local1372.anInt328 = local43;
										break;
									}
								}
								this.method646(local24, local31);
							}
						}
					}
				}
			}
		} catch (@Pc(1402) RuntimeException local1402) {
			signlink.reporterror("48762, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local1402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(II)Ljava/lang/String;")
	private String method685(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("93207, " + 8 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!RSWRPCHR;IZLclient!MVRUIIXW;)V")
	private void method686(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub1_Sub3_Sub2_Sub2 arg3) {
		try {
			if ((arg2 & 0x80) != 0) {
				arg3.anInt404 = arg1.method342();
				arg3.anInt405 = arg1.method366();
			}
			if ((arg2 & 0x4) != 0) {
				arg3.aString10 = arg1.method347();
				if (arg3.aString10.charAt(0) == '~') {
					arg3.aString10 = arg3.aString10.substring(1);
					this.method607(arg3.aString11, 2, arg3.aString10, this.aByte28);
				} else if (arg3 == aClass2_Sub1_Sub3_Sub2_Sub2_1) {
					this.method607(arg3.aString11, 2, arg3.aString10, this.aByte28);
				}
				arg3.anInt416 = 0;
				arg3.anInt388 = 0;
				arg3.anInt399 = 150;
			}
			if ((arg2 & 0x1) != 0) {
				arg3.anInt410 = arg1.method342();
				if (arg3.anInt410 == 65535) {
					arg3.anInt410 = -1;
				}
			}
			@Pc(93) int local93;
			@Pc(96) int local96;
			if ((arg2 & 0x8) != 0) {
				local93 = arg1.method340();
				local96 = arg1.method340();
				arg3.method247(anInt943, local93, local96);
				arg3.anInt395 = anInt943 + 300;
				arg3.anInt396 = arg1.method358();
				arg3.anInt397 = arg1.method360(382);
			}
			if ((arg2 & 0x400) != 0) {
				arg3.anInt376 = arg1.method358();
				arg3.anInt378 = arg1.method360(382);
				arg3.anInt377 = arg1.method358();
				arg3.anInt379 = arg1.method340();
				arg3.anInt380 = arg1.method368() + anInt943;
				arg3.anInt381 = arg1.method367(65) + anInt943;
				arg3.anInt382 = arg1.method358();
				arg3.method248();
			}
			if ((arg2 & 0x20) != 0) {
				local93 = arg1.method358();
				@Pc(173) byte[] local173 = new byte[local93];
				@Pc(179) Class2_Sub1_Sub4 local179 = new Class2_Sub1_Sub4(local173, -46859);
				arg1.method349(local173, local93);
				this.aClass2_Sub1_Sub4Array1[arg0] = local179;
				arg3.method254(local179, this.aBoolean235);
			}
			if ((arg2 & 0x100) != 0) {
				arg3.anInt411 = arg1.method366();
				local93 = arg1.method376();
				arg3.anInt415 = local93 >> 16;
				arg3.anInt414 = anInt943 + (local93 & 0xFFFF);
				arg3.anInt412 = 0;
				arg3.anInt413 = 0;
				if (arg3.anInt414 > anInt943) {
					arg3.anInt412 = -1;
				}
				if (arg3.anInt411 == 65535) {
					arg3.anInt411 = -1;
				}
			}
			if ((arg2 & 0x200) != 0) {
				local93 = arg1.method360(382);
				local96 = arg1.method360(382);
				arg3.method247(anInt943, local93, local96);
				arg3.anInt395 = anInt943 + 300;
				arg3.anInt396 = arg1.method360(382);
				arg3.anInt397 = arg1.method360(382);
			}
			@Pc(301) int local301;
			if ((arg2 & 0x2) != 0) {
				local93 = arg1.method342();
				if (local93 == 65535) {
					local93 = -1;
				}
				local96 = arg1.method360(382);
				if (local93 == arg3.anInt418 && local93 != -1) {
					local301 = Class23.aClass23Array1[local93].anInt366;
					if (local301 == 1) {
						arg3.anInt419 = 0;
						arg3.anInt420 = 0;
						arg3.anInt421 = local96;
						arg3.anInt422 = 0;
					}
					if (local301 == 2) {
						arg3.anInt422 = 0;
					}
				} else if (local93 == -1 || arg3.anInt418 == -1 || Class23.aClass23Array1[local93].anInt360 >= Class23.aClass23Array1[arg3.anInt418].anInt360) {
					arg3.anInt418 = local93;
					arg3.anInt419 = 0;
					arg3.anInt420 = 0;
					arg3.anInt421 = local96;
					arg3.anInt422 = 0;
					arg3.anInt394 = arg3.anInt393;
				}
			}
			if ((arg2 & 0x40) != 0) {
				local93 = arg1.method342();
				local96 = arg1.method358();
				local301 = arg1.method358();
				@Pc(378) int local378 = arg1.anInt556;
				if (arg3.aString11 != null && arg3.aBoolean108) {
					@Pc(388) long local388 = Class7.method53(arg3.aString11);
					@Pc(390) boolean local390 = false;
					if (local96 <= 1) {
						for (@Pc(395) int local395 = 0; local395 < this.anInt882; local395++) {
							if (this.aLongArray4[local395] == local388) {
								local390 = true;
								break;
							}
						}
					}
					if (!local390 && this.anInt949 == 0) {
						try {
							this.aClass2_Sub1_Sub4_6.anInt556 = 0;
							arg1.method378(this.aClass2_Sub1_Sub4_6.aByteArray17, local301);
							this.aClass2_Sub1_Sub4_6.anInt556 = 0;
							@Pc(440) String local440 = Class6.method50(this.aClass2_Sub1_Sub4_6, local301);
							@Pc(444) String local444 = Class17.method162(local440);
							arg3.aString10 = local444;
							arg3.anInt416 = local93 >> 8;
							arg3.anInt388 = local93 & 0xFF;
							arg3.anInt399 = 150;
							if (local96 == 2 || local96 == 3) {
								this.method607("@cr2@" + arg3.aString11, 1, local444, this.aByte28);
							} else if (local96 == 1) {
								this.method607("@cr1@" + arg3.aString11, 1, local444, this.aByte28);
							} else {
								this.method607(arg3.aString11, 2, local444, this.aByte28);
							}
						} catch (@Pc(511) Exception local511) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt556 = local378 + local301;
			}
		} catch (@Pc(521) RuntimeException local521) {
			signlink.reporterror("40395, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local521.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!RSWRPCHR;I)V")
	private void method687(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt941; local1++) {
				@Pc(8) int local8 = this.anIntArray251[local1];
				@Pc(13) Class2_Sub1_Sub3_Sub2_Sub2 local13 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method340();
				if ((local16 & 0x10) != 0) {
					local16 += arg1.method340() << 8;
				}
				this.method686(local8, arg1, local16, local13);
			}
			@Pc(43) boolean local43 = false;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("7294, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method688(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg0 == null) {
				return false;
			}
			for (@Pc(18) int local18 = 0; local18 < this.anInt970; local18++) {
				if (arg0.equalsIgnoreCase(this.aStringArray11[local18])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass2_Sub1_Sub3_Sub2_Sub2_1.aString11);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("43754, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method689() {
		try {
			if (this.anInt900 == 0) {
				this.aStringArray8[0] = "Cancel";
				this.anIntArray239[0] = 1843;
				this.anInt822 = 1;
				if (this.anInt897 == -1) {
					this.method721();
					this.anInt849 = 0;
					this.anInt952 = 0;
					if (super.anInt811 > 4 && super.anInt812 > 4 && super.anInt811 < 516 && super.anInt812 < 338) {
						if (this.anInt963 == -1) {
							this.method708();
						} else {
							this.method694(Class15.method120(this.anInt963), super.anInt811, 4, 0, super.anInt812, 4, 0);
						}
					}
					if (this.anInt849 != this.anInt944) {
						this.anInt944 = this.anInt849;
					}
					if (this.anInt952 != this.anInt831) {
						this.anInt831 = this.anInt952;
					}
					this.anInt849 = 0;
					this.anInt952 = 0;
					if (super.anInt811 > 553 && super.anInt812 > 205 && super.anInt811 < 743 && super.anInt812 < 466) {
						if (this.anInt1033 != -1) {
							this.method694(Class15.method120(this.anInt1033), super.anInt811, 553, 1, super.anInt812, 205, 0);
						} else if (this.anIntArray248[this.anInt962] != -1) {
							this.method694(Class15.method120(this.anIntArray248[this.anInt962]), super.anInt811, 553, 1, super.anInt812, 205, 0);
						}
					}
					if (this.anInt849 != this.anInt894) {
						this.aBoolean251 = true;
						this.anInt894 = this.anInt849;
					}
					if (this.anInt952 != this.anInt1039) {
						this.aBoolean251 = true;
						this.anInt1039 = this.anInt952;
					}
					this.anInt849 = 0;
					this.anInt952 = 0;
					if (super.anInt811 > 17 && super.anInt812 > 357 && super.anInt811 < 496 && super.anInt812 < 453) {
						if (this.anInt959 != -1) {
							this.method694(Class15.method120(this.anInt959), super.anInt811, 17, 2, super.anInt812, 357, 0);
						} else if (this.anInt1047 != -1) {
							this.method694(Class15.method120(this.anInt1047), super.anInt811, 17, 3, super.anInt812, 357, 0);
						} else if (super.anInt812 < 434 && super.anInt811 < 426 && this.anInt989 == 0) {
							this.method690(super.anInt812 - 357, super.anInt811 - 17);
						}
					}
					if ((this.anInt959 != -1 || this.anInt1047 != -1) && this.anInt849 != this.anInt937) {
						this.aBoolean239 = true;
						this.anInt937 = this.anInt849;
					}
					if ((this.anInt959 != -1 || this.anInt1047 != -1) && this.anInt952 != this.anInt907) {
						this.aBoolean239 = true;
						this.anInt907 = this.anInt952;
					}
					@Pc(352) boolean local352 = false;
					while (!local352) {
						local352 = true;
						for (@Pc(358) int local358 = 0; local358 < this.anInt822 - 1; local358++) {
							if (this.anIntArray239[local358] < 1000 && this.anIntArray239[local358 + 1] > 1000) {
								@Pc(379) String local379 = this.aStringArray8[local358];
								this.aStringArray8[local358] = this.aStringArray8[local358 + 1];
								this.aStringArray8[local358 + 1] = local379;
								@Pc(401) int local401 = this.anIntArray239[local358];
								this.anIntArray239[local358] = this.anIntArray239[local358 + 1];
								this.anIntArray239[local358 + 1] = local401;
								@Pc(423) int local423 = this.anIntArray237[local358];
								this.anIntArray237[local358] = this.anIntArray237[local358 + 1];
								this.anIntArray237[local358 + 1] = local423;
								@Pc(445) int local445 = this.anIntArray238[local358];
								this.anIntArray238[local358] = this.anIntArray238[local358 + 1];
								this.anIntArray238[local358 + 1] = local445;
								@Pc(467) int local467 = this.anIntArray240[local358];
								this.anIntArray240[local358] = this.anIntArray240[local358 + 1];
								this.anIntArray240[local358 + 1] = local467;
								local352 = false;
							}
						}
					}
				} else {
					this.anInt849 = 0;
					this.anInt952 = 0;
					this.method694(Class15.method120(this.anInt897), super.anInt811, 0, 0, super.anInt812, 0, 0);
					if (this.anInt849 != this.anInt944) {
						this.anInt944 = this.anInt849;
					}
					if (this.anInt952 != this.anInt831) {
						this.anInt831 = this.anInt952;
					}
				}
			}
		} catch (@Pc(497) RuntimeException local497) {
			signlink.reporterror("90563, " + 831 + ", " + local497.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) int local8 = 0;
			for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
				if (this.aStringArray10[local10] != null) {
					@Pc(22) int local22 = this.anIntArray232[local10];
					@Pc(33) int local33 = this.anInt923 + 70 + 4 - local8 * 14;
					if (local33 < -20) {
						break;
					}
					@Pc(41) String local41 = this.aStringArray9[local10];
					if (local41 != null && local41.startsWith("@cr1@")) {
						local41 = local41.substring(5);
					}
					if (local41 != null && local41.startsWith("@cr2@")) {
						local41 = local41.substring(5);
					}
					if (local22 == 0) {
						local8++;
					}
					if ((local22 == 1 || local22 == 2) && (local22 == 1 || this.anInt935 == 0 || this.anInt935 == 1 && this.method688(local41, (byte) 1))) {
						if (arg0 > local33 - 14 && arg0 <= local33 && !local41.equals(aClass2_Sub1_Sub3_Sub2_Sub2_1.aString11)) {
							if (this.anInt1034 >= 1) {
								this.aStringArray8[this.anInt822] = "Report abuse @whi@" + local41;
								this.anIntArray239[this.anInt822] = 505;
								this.anInt822++;
							}
							this.aStringArray8[this.anInt822] = "Add ignore @whi@" + local41;
							this.anIntArray239[this.anInt822] = 362;
							this.anInt822++;
							this.aStringArray8[this.anInt822] = "Add friend @whi@" + local41;
							this.anIntArray239[this.anInt822] = 954;
							this.anInt822++;
						}
						local8++;
					}
					if ((local22 == 3 || local22 == 7) && this.anInt992 == 0 && (local22 == 7 || this.anInt848 == 0 || this.anInt848 == 1 && this.method688(local41, (byte) 1))) {
						if (arg0 > local33 - 14 && arg0 <= local33) {
							if (this.anInt1034 >= 1) {
								this.aStringArray8[this.anInt822] = "Report abuse @whi@" + local41;
								this.anIntArray239[this.anInt822] = 505;
								this.anInt822++;
							}
							this.aStringArray8[this.anInt822] = "Add ignore @whi@" + local41;
							this.anIntArray239[this.anInt822] = 362;
							this.anInt822++;
							this.aStringArray8[this.anInt822] = "Add friend @whi@" + local41;
							this.anIntArray239[this.anInt822] = 954;
							this.anInt822++;
						}
						local8++;
					}
					if (local22 == 4 && (this.anInt890 == 0 || this.anInt890 == 1 && this.method688(local41, (byte) 1))) {
						if (arg0 > local33 - 14 && arg0 <= local33) {
							this.aStringArray8[this.anInt822] = "Accept trade @whi@" + local41;
							this.anIntArray239[this.anInt822] = 356;
							this.anInt822++;
						}
						local8++;
					}
					if ((local22 == 5 || local22 == 6) && this.anInt992 == 0 && this.anInt848 < 2) {
						local8++;
					}
					if (local22 == 8 && (this.anInt890 == 0 || this.anInt890 == 1 && this.method688(local41, (byte) 1))) {
						if (arg0 > local33 - 14 && arg0 <= local33) {
							this.aStringArray8[this.anInt822] = "Accept challenge @whi@" + local41;
							this.anIntArray239[this.anInt822] = 654;
							this.anInt822++;
						}
						local8++;
					}
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("19534, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIZ)V")
	private void method691(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt1056 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("63064, " + -12 + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method692(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt940; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt939;
				} else {
					local11 = this.anIntArray250[local3];
				}
				@Pc(23) Class2_Sub1_Sub3_Sub2_Sub2 local23 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local11];
				if (local23 != null) {
					this.method697(1, this.anInt920, local23);
				}
			}
			if (arg0 != -23021) {
				this.anInt1012 = this.aClass25_2.method255();
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("33803, " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method693() {
		try {
			if (this.aClass32_27 == null) {
				this.method616(this.anInt1012);
				super.aClass32_2 = null;
				this.aClass32_3 = null;
				this.aClass32_4 = null;
				this.aClass32_5 = null;
				this.aClass32_6 = null;
				this.aClass32_7 = null;
				this.aClass32_8 = null;
				this.aClass32_9 = null;
				this.aClass32_10 = null;
				this.aClass32_11 = null;
				this.aClass32_27 = new Class32(3, 96, 479, this.method586());
				this.aClass32_25 = new Class32(3, 156, 172, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass2_Sub1_Sub2_Sub3_5.method277(0, 0);
				this.aClass32_24 = new Class32(3, 261, 190, this.method586());
				this.aClass32_26 = new Class32(3, 334, 512, this.method586());
				Class2_Sub1_Sub2.method476();
				this.aClass32_21 = new Class32(3, 50, 496, this.method586());
				this.aClass32_22 = new Class32(3, 37, 269, this.method586());
				this.aClass32_23 = new Class32(3, 45, 249, this.method586());
				this.aBoolean234 = true;
				this.aClass32_26.method296();
				Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("48223, " + -873 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IGMZHLWJ;IIIBIII)V")
	private void method694(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg0.anInt206 == 0 && arg0.anIntArray54 != null && !arg0.aBoolean60 && (arg1 >= arg2 && arg4 >= arg5 && arg1 <= arg2 + arg0.anInt195 && arg4 <= arg5 + arg0.anInt199)) {
				@Pc(34) int local34 = arg0.anIntArray54.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg0.anIntArray55[local36] + arg2;
					@Pc(54) int local54 = arg0.anIntArray48[local36] + arg5 - arg6;
					@Pc(60) Class15 local60 = Class15.method120(arg0.anIntArray54[local36]);
					@Pc(65) int local65 = local45 + local60.anInt176;
					@Pc(70) int local70 = local54 + local60.anInt196;
					if ((local60.anInt192 >= 0 || local60.anInt193 != 0) && arg1 >= local65 && arg4 >= local70 && arg1 < local65 + local60.anInt195 && arg4 < local70 + local60.anInt199) {
						if (local60.anInt192 >= 0) {
							this.anInt849 = local60.anInt192;
						} else {
							this.anInt849 = local60.anInt200;
						}
					}
					if (local60.anInt206 == 8 && arg1 >= local65 && arg4 >= local70 && arg1 < local65 + local60.anInt195 && arg4 < local70 + local60.anInt199) {
						this.anInt952 = local60.anInt200;
					}
					if (local60.anInt206 == 0) {
						this.method694(local60, arg1, local65, arg3, arg4, local70, local60.anInt205);
						if (local60.anInt173 > local60.anInt199) {
							this.method664(this.anInt881, arg1, local70, local65 + local60.anInt195, local60.anInt173, arg3, local60.anInt199, local60, arg4);
						}
					} else {
						if (local60.anInt172 == 1 && arg1 >= local65 && arg4 >= local70 && arg1 < local65 + local60.anInt195 && arg4 < local70 + local60.anInt199) {
							@Pc(195) boolean local195 = false;
							if (local60.anInt204 != 0) {
								local195 = this.method635(local60);
							}
							if (!local195) {
								this.aStringArray8[this.anInt822] = local60.aString3;
								this.anIntArray239[this.anInt822] = 682;
								this.anIntArray238[this.anInt822] = local60.anInt200;
								this.anInt822++;
							}
						}
						if (local60.anInt172 == 2 && this.anInt932 == 0 && arg1 >= local65 && arg4 >= local70 && arg1 < local65 + local60.anInt195 && arg4 < local70 + local60.anInt199) {
							@Pc(259) String local259 = local60.aString6;
							if (local259.indexOf(" ") != -1) {
								local259 = local259.substring(0, local259.indexOf(" "));
							}
							this.aStringArray8[this.anInt822] = local259 + " @gre@" + local60.aString5;
							this.anIntArray239[this.anInt822] = 268;
							this.anIntArray238[this.anInt822] = local60.anInt200;
							this.anInt822++;
						}
						if (local60.anInt172 == 3 && arg1 >= local65 && arg4 >= local70 && arg1 < local65 + local60.anInt195 && arg4 < local70 + local60.anInt199) {
							this.aStringArray8[this.anInt822] = "Close";
							if (arg3 == 3) {
								this.anIntArray239[this.anInt822] = 723;
							} else {
								this.anIntArray239[this.anInt822] = 515;
							}
							this.anIntArray238[this.anInt822] = local60.anInt200;
							this.anInt822++;
						}
						if (local60.anInt172 == 4 && arg1 >= local65 && arg4 >= local70 && arg1 < local65 + local60.anInt195 && arg4 < local70 + local60.anInt199) {
							this.aStringArray8[this.anInt822] = local60.aString3;
							this.anIntArray239[this.anInt822] = 50;
							this.anIntArray238[this.anInt822] = local60.anInt200;
							this.anInt822++;
						}
						if (local60.anInt172 == 5 && arg1 >= local65 && arg4 >= local70 && arg1 < local65 + local60.anInt195 && arg4 < local70 + local60.anInt199) {
							this.aStringArray8[this.anInt822] = local60.aString3;
							this.anIntArray239[this.anInt822] = 944;
							this.anIntArray238[this.anInt822] = local60.anInt200;
							this.anInt822++;
						}
						if (local60.anInt172 == 6 && !this.aBoolean237 && arg1 >= local65 && arg4 >= local70 && arg1 < local65 + local60.anInt195 && arg4 < local70 + local60.anInt199) {
							this.aStringArray8[this.anInt822] = local60.aString3;
							this.anIntArray239[this.anInt822] = 737;
							this.anIntArray238[this.anInt822] = local60.anInt200;
							this.anInt822++;
						}
						if (local60.anInt206 == 2) {
							@Pc(518) int local518 = 0;
							for (@Pc(520) int local520 = 0; local520 < local60.anInt199; local520++) {
								for (@Pc(524) int local524 = 0; local524 < local60.anInt195; local524++) {
									@Pc(535) int local535 = local65 + local524 * (local60.anInt203 + 32);
									@Pc(544) int local544 = local70 + local520 * (local60.anInt179 + 32);
									if (local518 < 20) {
										local535 += local60.anIntArray51[local518];
										local544 += local60.anIntArray49[local518];
									}
									if (arg1 >= local535 && arg4 >= local544 && arg1 < local535 + 32 && arg4 < local544 + 32) {
										this.anInt973 = local518;
										this.anInt974 = local60.anInt200;
										if (local60.anIntArray50[local518] > 0) {
											@Pc(597) Class34 local597 = Class34.method385(local60.anIntArray50[local518] - 1);
											if (this.anInt945 == 1 && local60.aBoolean56) {
												if (local60.anInt200 != this.anInt947 || local518 != this.anInt946) {
													this.aStringArray8[this.anInt822] = "Use " + this.aString23 + " with @lre@" + local597.aString13;
													this.anIntArray239[this.anInt822] = 443;
													this.anIntArray240[this.anInt822] = local597.anInt568;
													this.anIntArray237[this.anInt822] = local518;
													this.anIntArray238[this.anInt822] = local60.anInt200;
													this.anInt822++;
												}
											} else if (this.anInt932 != 1 || !local60.aBoolean56) {
												@Pc(734) int local734;
												if (local60.aBoolean56) {
													for (local734 = 4; local734 >= 3; local734--) {
														if (local597.aStringArray5 != null && local597.aStringArray5[local734] != null) {
															this.aStringArray8[this.anInt822] = local597.aStringArray5[local734] + " @lre@" + local597.aString13;
															if (local734 == 3) {
																this.anIntArray239[this.anInt822] = 804;
															}
															if (local734 == 4) {
																this.anIntArray239[this.anInt822] = 918;
															}
															this.anIntArray240[this.anInt822] = local597.anInt568;
															this.anIntArray237[this.anInt822] = local518;
															this.anIntArray238[this.anInt822] = local60.anInt200;
															this.anInt822++;
														} else if (local734 == 4) {
															this.aStringArray8[this.anInt822] = "Drop @lre@" + local597.aString13;
															this.anIntArray239[this.anInt822] = 918;
															this.anIntArray240[this.anInt822] = local597.anInt568;
															this.anIntArray237[this.anInt822] = local518;
															this.anIntArray238[this.anInt822] = local60.anInt200;
															this.anInt822++;
														}
													}
												}
												if (local60.aBoolean64) {
													this.aStringArray8[this.anInt822] = "Use @lre@" + local597.aString13;
													this.anIntArray239[this.anInt822] = 937;
													this.anIntArray240[this.anInt822] = local597.anInt568;
													this.anIntArray237[this.anInt822] = local518;
													this.anIntArray238[this.anInt822] = local60.anInt200;
													this.anInt822++;
												}
												if (local60.aBoolean56 && local597.aStringArray5 != null) {
													for (local734 = 2; local734 >= 0; local734--) {
														if (local597.aStringArray5[local734] != null) {
															this.aStringArray8[this.anInt822] = local597.aStringArray5[local734] + " @lre@" + local597.aString13;
															if (local734 == 0) {
																this.anIntArray239[this.anInt822] = 653;
															}
															if (local734 == 1) {
																this.anIntArray239[this.anInt822] = 828;
															}
															if (local734 == 2) {
																this.anIntArray239[this.anInt822] = 233;
															}
															this.anIntArray240[this.anInt822] = local597.anInt568;
															this.anIntArray237[this.anInt822] = local518;
															this.anIntArray238[this.anInt822] = local60.anInt200;
															this.anInt822++;
														}
													}
												}
												if (local60.aStringArray3 != null) {
													for (local734 = 4; local734 >= 0; local734--) {
														if (local60.aStringArray3[local734] != null) {
															this.aStringArray8[this.anInt822] = local60.aStringArray3[local734] + " @lre@" + local597.aString13;
															if (local734 == 0) {
																this.anIntArray239[this.anInt822] = 372;
															}
															if (local734 == 1) {
																this.anIntArray239[this.anInt822] = 648;
															}
															if (local734 == 2) {
																this.anIntArray239[this.anInt822] = 627;
															}
															if (local734 == 3) {
																this.anIntArray239[this.anInt822] = 555;
															}
															if (local734 == 4) {
																this.anIntArray239[this.anInt822] = 395;
															}
															this.anIntArray240[this.anInt822] = local597.anInt568;
															this.anIntArray237[this.anInt822] = local518;
															this.anIntArray238[this.anInt822] = local60.anInt200;
															this.anInt822++;
														}
													}
												}
												this.aStringArray8[this.anInt822] = "Examine @lre@" + local597.aString13;
												this.anIntArray239[this.anInt822] = 1624;
												this.anIntArray240[this.anInt822] = local597.anInt568;
												this.anIntArray237[this.anInt822] = local518;
												this.anIntArray238[this.anInt822] = local60.anInt200;
												this.anInt822++;
											} else if ((this.anInt934 & 0x10) == 16) {
												this.aStringArray8[this.anInt822] = this.aString22 + " @lre@" + local597.aString13;
												this.anIntArray239[this.anInt822] = 40;
												this.anIntArray240[this.anInt822] = local597.anInt568;
												this.anIntArray237[this.anInt822] = local518;
												this.anIntArray238[this.anInt822] = local60.anInt200;
												this.anInt822++;
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
		} catch (@Pc(1172) RuntimeException local1172) {
			signlink.reporterror("85876, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -79 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
	private void method695(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0) {
				this.anInt976 = this.aClass2_Sub1_Sub4_8.method340();
			}
			if (arg1 != 0L) {
				for (@Pc(15) int local15 = 0; local15 < this.anInt970; local15++) {
					if (this.aLongArray3[local15] == arg1) {
						this.anInt970--;
						this.aBoolean251 = true;
						for (@Pc(35) int local35 = local15; local35 < this.anInt970; local35++) {
							this.aStringArray11[local35] = this.aStringArray11[local35 + 1];
							this.anIntArray275[local35] = this.anIntArray275[local35 + 1];
							this.aLongArray3[local35] = this.aLongArray3[local35 + 1];
						}
						this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 174);
						this.aClass2_Sub1_Sub4_9.method336(arg1);
						return;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("2665, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588(20, "Starting up", aBoolean222);
		if (signlink.sunjava) {
			super.anInt805 = 5;
		}
		if (aBoolean269) {
			this.aBoolean268 = true;
			return;
		}
		aBoolean269 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method625();
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
			this.aBoolean240 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass47Array1[local107] = new Class47(500000, local107 + 1, 637, signlink.aRandomAccessFileArray1[local107], signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method717(aBoolean245);
			this.aClass13_2 = this.method615(25, "title", 1, this.anIntArray245[1], "title screen");
			this.aClass2_Sub1_Sub2_Sub2_2 = new Class2_Sub1_Sub2_Sub2(this.aClass13_2, -20267, "p11_full", false);
			this.aClass2_Sub1_Sub2_Sub2_3 = new Class2_Sub1_Sub2_Sub2(this.aClass13_2, -20267, "p12_full", false);
			this.aClass2_Sub1_Sub2_Sub2_4 = new Class2_Sub1_Sub2_Sub2(this.aClass13_2, -20267, "b12_full", false);
			this.aClass2_Sub1_Sub2_Sub2_5 = new Class2_Sub1_Sub2_Sub2(this.aClass13_2, -20267, "q8_full", true);
			this.method652(aBoolean241);
			this.method656((byte) 7);
			@Pc(203) Class13 local203 = this.method615(30, "config", 2, this.anIntArray245[2], "config");
			@Pc(215) Class13 local215 = this.method615(35, "interface", 3, this.anIntArray245[3], "interface");
			@Pc(227) Class13 local227 = this.method615(40, "media", 4, this.anIntArray245[4], "2d graphics");
			@Pc(239) Class13 local239 = this.method615(45, "textures", 6, this.anIntArray245[6], "textures");
			@Pc(251) Class13 local251 = this.method615(50, "wordenc", 7, this.anIntArray245[7], "chat system");
			@Pc(263) Class13 local263 = this.method615(55, "sounds", 8, this.anIntArray245[8], "sound effects");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass46_1 = new Class46(4, this.anIntArrayArrayArray8, 104, 2311, 104);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass21Array1[local288] = new Class21(104, 104, true);
			}
			this.aClass2_Sub1_Sub2_Sub1_17 = new Class2_Sub1_Sub2_Sub1(512, 512);
			@Pc(323) Class13 local323 = this.method615(60, "versionlist", 5, this.anIntArray245[5], "update list");
			this.method588(60, "Connecting to update server", aBoolean222);
			this.aClass9_Sub1_1 = new Class9_Sub1();
			this.aClass9_Sub1_1.method303(local323, this);
			Class31.method291(this.aClass9_Sub1_1.method300());
			Class2_Sub1_Sub3_Sub5.method420(this.aClass9_Sub1_1.method306(0), this.aClass9_Sub1_1);
			if (!aBoolean264) {
				this.anInt851 = 0;
				this.aBoolean228 = true;
				this.aClass9_Sub1_1.method316(2, this.anInt851);
				while (this.aClass9_Sub1_1.method313() > 0) {
					this.method619();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass9_Sub1_1.anInt507 > 3) {
						this.method726("ondemand");
						return;
					}
				}
			}
			this.method588(65, "Requesting animations", aBoolean222);
			@Pc(398) int local398 = this.aClass9_Sub1_1.method306(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass9_Sub1_1.method316(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass9_Sub1_1.method313() > 0) {
				local419 = local398 - this.aClass9_Sub1_1.method313();
				if (local419 > 0) {
					this.method588(65, "Loading animations - " + local419 * 100 / local398 + "%", aBoolean222);
				}
				this.method619();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass9_Sub1_1.anInt507 > 3) {
					this.method726("ondemand");
					return;
				}
			}
			this.method588(70, "Requesting models", aBoolean222);
			local398 = this.aClass9_Sub1_1.method306(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass9_Sub1_1.method310(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass9_Sub1_1.method316(0, local419);
				}
			}
			local398 = this.aClass9_Sub1_1.method313();
			while (this.aClass9_Sub1_1.method313() > 0) {
				local479 = local398 - this.aClass9_Sub1_1.method313();
				if (local479 > 0) {
					this.method588(70, "Loading models - " + local479 * 100 / local398 + "%", aBoolean222);
				}
				this.method619();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass47Array1[0] != null) {
				this.method588(75, "Requesting maps", aBoolean222);
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(47, 0, 48));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(47, 1, 48));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(48, 0, 48));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(48, 1, 48));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(49, 0, 48));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(49, 1, 48));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(47, 0, 47));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(47, 1, 47));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(48, 0, 47));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(48, 1, 47));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(48, 0, 148));
				this.aClass9_Sub1_1.method316(3, this.aClass9_Sub1_1.method311(48, 1, 148));
				local398 = this.aClass9_Sub1_1.method313();
				while (this.aClass9_Sub1_1.method313() > 0) {
					local479 = local398 - this.aClass9_Sub1_1.method313();
					if (local479 > 0) {
						this.method588(75, "Loading maps - " + local479 * 100 / local398 + "%", aBoolean222);
					}
					this.method619();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass9_Sub1_1.method306(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass9_Sub1_1.method310(local479);
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
					this.aClass9_Sub1_1.method307(local479, local738, 0);
				}
			}
			this.aClass9_Sub1_1.method301(aBoolean263);
			if (!aBoolean264) {
				local398 = this.aClass9_Sub1_1.method306(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass9_Sub1_1.method318(local736)) {
						this.aClass9_Sub1_1.method307(local736, (byte) 1, 2);
					}
				}
			}
			this.method588(80, "Unpacking media", aBoolean222);
			this.aClass2_Sub1_Sub2_Sub3_4 = new Class2_Sub1_Sub2_Sub3(local227, "invback", 0);
			this.aClass2_Sub1_Sub2_Sub3_6 = new Class2_Sub1_Sub2_Sub3(local227, "chatback", 0);
			this.aClass2_Sub1_Sub2_Sub3_5 = new Class2_Sub1_Sub2_Sub3(local227, "mapback", 0);
			this.aClass2_Sub1_Sub2_Sub3_1 = new Class2_Sub1_Sub2_Sub3(local227, "backbase1", 0);
			this.aClass2_Sub1_Sub2_Sub3_2 = new Class2_Sub1_Sub2_Sub3(local227, "backbase2", 0);
			this.aClass2_Sub1_Sub2_Sub3_3 = new Class2_Sub1_Sub2_Sub3(local227, "backhmid1", 0);
			for (local736 = 0; local736 < 13; local736++) {
				this.aClass2_Sub1_Sub2_Sub3Array3[local736] = new Class2_Sub1_Sub2_Sub3(local227, "sideicons", local736);
			}
			this.aClass2_Sub1_Sub2_Sub1_8 = new Class2_Sub1_Sub2_Sub1(local227, "compass", 0);
			this.aClass2_Sub1_Sub2_Sub1_11 = new Class2_Sub1_Sub2_Sub1(local227, "mapedge", 0);
			this.aClass2_Sub1_Sub2_Sub1_11.method39();
			for (@Pc(938) int local938 = 0; local938 < 72; local938++) {
				this.aClass2_Sub1_Sub2_Sub3Array4[local938] = new Class2_Sub1_Sub2_Sub3(local227, "mapscene", local938);
			}
			for (@Pc(956) int local956 = 0; local956 < 63; local956++) {
				this.aClass2_Sub1_Sub2_Sub1Array7[local956] = new Class2_Sub1_Sub2_Sub1(local227, "mapfunction", local956);
			}
			for (@Pc(974) int local974 = 0; local974 < 5; local974++) {
				this.aClass2_Sub1_Sub2_Sub1Array6[local974] = new Class2_Sub1_Sub2_Sub1(local227, "hitmarks", local974);
			}
			for (@Pc(992) int local992 = 0; local992 < 6; local992++) {
				this.aClass2_Sub1_Sub2_Sub1Array10[local992] = new Class2_Sub1_Sub2_Sub1(local227, "headicons_pk", local992);
			}
			for (@Pc(1010) int local1010 = 0; local1010 < 9; local1010++) {
				this.aClass2_Sub1_Sub2_Sub1Array9[local1010] = new Class2_Sub1_Sub2_Sub1(local227, "headicons_prayer", local1010);
			}
			for (@Pc(1028) int local1028 = 0; local1028 < 6; local1028++) {
				this.aClass2_Sub1_Sub2_Sub1Array5[local1028] = new Class2_Sub1_Sub2_Sub1(local227, "headicons_hint", local1028);
			}
			this.aClass2_Sub1_Sub2_Sub1_16 = new Class2_Sub1_Sub2_Sub1(local227, "overlay_multiway", 0);
			this.aClass2_Sub1_Sub2_Sub1_9 = new Class2_Sub1_Sub2_Sub1(local227, "mapmarker", 0);
			this.aClass2_Sub1_Sub2_Sub1_10 = new Class2_Sub1_Sub2_Sub1(local227, "mapmarker", 1);
			for (@Pc(1070) int local1070 = 0; local1070 < 8; local1070++) {
				this.aClass2_Sub1_Sub2_Sub1Array4[local1070] = new Class2_Sub1_Sub2_Sub1(local227, "cross", local1070);
			}
			this.aClass2_Sub1_Sub2_Sub1_3 = new Class2_Sub1_Sub2_Sub1(local227, "mapdots", 0);
			this.aClass2_Sub1_Sub2_Sub1_4 = new Class2_Sub1_Sub2_Sub1(local227, "mapdots", 1);
			this.aClass2_Sub1_Sub2_Sub1_5 = new Class2_Sub1_Sub2_Sub1(local227, "mapdots", 2);
			this.aClass2_Sub1_Sub2_Sub1_6 = new Class2_Sub1_Sub2_Sub1(local227, "mapdots", 3);
			this.aClass2_Sub1_Sub2_Sub1_7 = new Class2_Sub1_Sub2_Sub1(local227, "mapdots", 4);
			this.aClass2_Sub1_Sub2_Sub3_7 = new Class2_Sub1_Sub2_Sub3(local227, "scrollbar", 0);
			this.aClass2_Sub1_Sub2_Sub3_8 = new Class2_Sub1_Sub2_Sub3(local227, "scrollbar", 1);
			this.aClass2_Sub1_Sub2_Sub3_16 = new Class2_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub2_Sub3_17 = new Class2_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub2_Sub3_18 = new Class2_Sub1_Sub2_Sub3(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub2_Sub3_19 = new Class2_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub2_Sub3_19.method274(aBoolean254);
			this.aClass2_Sub1_Sub2_Sub3_20 = new Class2_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub2_Sub3_20.method274(aBoolean254);
			this.aClass2_Sub1_Sub2_Sub3_11 = new Class2_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub2_Sub3_11.method275();
			this.aClass2_Sub1_Sub2_Sub3_12 = new Class2_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub2_Sub3_12.method275();
			this.aClass2_Sub1_Sub2_Sub3_13 = new Class2_Sub1_Sub2_Sub3(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub2_Sub3_13.method275();
			this.aClass2_Sub1_Sub2_Sub3_14 = new Class2_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub2_Sub3_14.method274(aBoolean254);
			this.aClass2_Sub1_Sub2_Sub3_14.method275();
			this.aClass2_Sub1_Sub2_Sub3_15 = new Class2_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub2_Sub3_15.method274(aBoolean254);
			this.aClass2_Sub1_Sub2_Sub3_15.method275();
			for (@Pc(1260) int local1260 = 0; local1260 < 2; local1260++) {
				this.aClass2_Sub1_Sub2_Sub3Array5[local1260] = new Class2_Sub1_Sub2_Sub3(local227, "mod_icons", local1260);
			}
			@Pc(1283) Class2_Sub1_Sub2_Sub1 local1283 = new Class2_Sub1_Sub2_Sub1(local227, "backleft1", 0);
			this.aClass32_12 = new Class32(3, local1283.anInt39, local1283.anInt38, this.method586());
			local1283.method40(0, 0);
			@Pc(1308) Class2_Sub1_Sub2_Sub1 local1308 = new Class2_Sub1_Sub2_Sub1(local227, "backleft2", 0);
			this.aClass32_13 = new Class32(3, local1308.anInt39, local1308.anInt38, this.method586());
			local1308.method40(0, 0);
			@Pc(1333) Class2_Sub1_Sub2_Sub1 local1333 = new Class2_Sub1_Sub2_Sub1(local227, "backright1", 0);
			this.aClass32_14 = new Class32(3, local1333.anInt39, local1333.anInt38, this.method586());
			local1333.method40(0, 0);
			@Pc(1358) Class2_Sub1_Sub2_Sub1 local1358 = new Class2_Sub1_Sub2_Sub1(local227, "backright2", 0);
			this.aClass32_15 = new Class32(3, local1358.anInt39, local1358.anInt38, this.method586());
			local1358.method40(0, 0);
			@Pc(1383) Class2_Sub1_Sub2_Sub1 local1383 = new Class2_Sub1_Sub2_Sub1(local227, "backtop1", 0);
			this.aClass32_16 = new Class32(3, local1383.anInt39, local1383.anInt38, this.method586());
			local1383.method40(0, 0);
			@Pc(1408) Class2_Sub1_Sub2_Sub1 local1408 = new Class2_Sub1_Sub2_Sub1(local227, "backvmid1", 0);
			this.aClass32_17 = new Class32(3, local1408.anInt39, local1408.anInt38, this.method586());
			local1408.method40(0, 0);
			@Pc(1433) Class2_Sub1_Sub2_Sub1 local1433 = new Class2_Sub1_Sub2_Sub1(local227, "backvmid2", 0);
			this.aClass32_18 = new Class32(3, local1433.anInt39, local1433.anInt38, this.method586());
			local1433.method40(0, 0);
			@Pc(1458) Class2_Sub1_Sub2_Sub1 local1458 = new Class2_Sub1_Sub2_Sub1(local227, "backvmid3", 0);
			this.aClass32_19 = new Class32(3, local1458.anInt39, local1458.anInt38, this.method586());
			local1458.method40(0, 0);
			@Pc(1483) Class2_Sub1_Sub2_Sub1 local1483 = new Class2_Sub1_Sub2_Sub1(local227, "backhmid2", 0);
			this.aClass32_20 = new Class32(3, local1483.anInt39, local1483.anInt38, this.method586());
			local1483.method40(0, 0);
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1529) int local1529 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1531) int local1531 = 0; local1531 < 100; local1531++) {
				if (this.aClass2_Sub1_Sub2_Sub1Array7[local1531] != null) {
					this.aClass2_Sub1_Sub2_Sub1Array7[local1531].method38(local1522 + local1529, local1515 + local1529, local1508 + local1529);
				}
				if (this.aClass2_Sub1_Sub2_Sub3Array4[local1531] != null) {
					this.aClass2_Sub1_Sub2_Sub3Array4[local1531].method276(local1522 + local1529, local1515 + local1529, local1508 + local1529);
				}
			}
			this.method588(83, "Unpacking textures", aBoolean222);
			Class2_Sub1_Sub2_Sub4.method490(local239);
			Class2_Sub1_Sub2_Sub4.method494(0.8D);
			Class2_Sub1_Sub2_Sub4.method489();
			this.method588(86, "Unpacking config", aBoolean222);
			Class23.method234(local203);
			Class41.method405(local203);
			Class50.method572(local203);
			Class34.method387(local203);
			Class10.method102(local203);
			Class24.method237(local203);
			Class37.method395(local203);
			Class42.method413(local203);
			Class18.method190(local203);
			Class34.aBoolean143 = aBoolean263;
			if (!aBoolean264) {
				this.method588(90, "Unpacking sounds", aBoolean222);
				@Pc(1634) byte[] local1634 = local263.method117("sounds.dat", null);
				@Pc(1640) Class2_Sub1_Sub4 local1640 = new Class2_Sub1_Sub4(local1634, -46859);
				Class30.method285(local1640);
			}
			this.method588(95, "Unpacking interfaces", aBoolean222);
			@Pc(1671) Class2_Sub1_Sub2_Sub2[] local1671 = new Class2_Sub1_Sub2_Sub2[] { this.aClass2_Sub1_Sub2_Sub2_2, this.aClass2_Sub1_Sub2_Sub2_3, this.aClass2_Sub1_Sub2_Sub2_4, this.aClass2_Sub1_Sub2_Sub2_5 };
			Class15.method127(local1671, local215, local227);
			this.method588(100, "Preparing game engine", aBoolean222);
			@Pc(1687) int local1687;
			@Pc(1689) int local1689;
			@Pc(1691) int local1691;
			for (@Pc(1683) int local1683 = 0; local1683 < 33; local1683++) {
				local1687 = 999;
				local1689 = 0;
				for (local1691 = 0; local1691 < 34; local1691++) {
					if (this.aClass2_Sub1_Sub2_Sub3_5.aByteArray11[local1691 + local1683 * this.aClass2_Sub1_Sub2_Sub3_5.anInt474] == 0) {
						if (local1687 == 999) {
							local1687 = local1691;
						}
					} else if (local1687 != 999) {
						local1689 = local1691;
						break;
					}
				}
				this.anIntArray229[local1683] = local1687;
				this.anIntArray243[local1683] = local1689 - local1687;
			}
			@Pc(1749) int local1749;
			for (local1687 = 5; local1687 < 156; local1687++) {
				local1689 = 999;
				local1691 = 0;
				for (local1749 = 25; local1749 < 172; local1749++) {
					if (this.aClass2_Sub1_Sub2_Sub3_5.aByteArray11[local1749 + local1687 * this.aClass2_Sub1_Sub2_Sub3_5.anInt474] == 0 && (local1749 > 34 || local1687 > 34)) {
						if (local1689 == 999) {
							local1689 = local1749;
						}
					} else if (local1689 != 999) {
						local1691 = local1749;
						break;
					}
				}
				this.anIntArray234[local1687 - 5] = local1689 - 25;
				this.anIntArray231[local1687 - 5] = local1691 - local1689;
			}
			Class2_Sub1_Sub2_Sub4.method487(765, 503);
			this.anIntArray219 = Class2_Sub1_Sub2_Sub4.anIntArray189;
			Class2_Sub1_Sub2_Sub4.method487(479, 96);
			this.anIntArray216 = Class2_Sub1_Sub2_Sub4.anIntArray189;
			Class2_Sub1_Sub2_Sub4.method487(190, 261);
			this.anIntArray217 = Class2_Sub1_Sub2_Sub4.anIntArray189;
			Class2_Sub1_Sub2_Sub4.method487(512, 334);
			this.anIntArray218 = Class2_Sub1_Sub2_Sub4.anIntArray189;
			@Pc(1840) int[] local1840 = new int[9];
			for (local1691 = 0; local1691 < 9; local1691++) {
				local1749 = local1691 * 32 + 128 + 15;
				@Pc(1858) int local1858 = local1749 * 3 + 600;
				@Pc(1862) int local1862 = Class2_Sub1_Sub2_Sub4.anIntArray187[local1749];
				local1840[local1691] = local1858 * local1862 >> 16;
			}
			Class46.method553(local1840);
			Class17.method152(local251);
			this.aClass26_1 = new Class26(this, (byte) 6);
			this.method587(this.aClass26_1, 10);
			Class2_Sub1_Sub3_Sub4.aClient4 = this;
			Class41.aClient5 = this;
			Class10.aClient1 = this;
		} catch (@Pc(1903) Exception local1903) {
			signlink.reporterror("loaderror " + this.aString20 + " " + this.anInt871);
			this.aBoolean246 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method696() {
		try {
			anInt951++;
			if (anInt951 > 82) {
				anInt951 = 0;
				this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 201);
			}
			for (@Pc(21) int local21 = 0; local21 < this.anInt891; local21++) {
				@Pc(28) int local28 = this.anIntArray235[local21];
				@Pc(33) Class2_Sub1_Sub3_Sub2_Sub1 local33 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local28];
				if (local33 != null) {
					this.method697(local33.aClass10_1.aByte9, this.anInt920, local33);
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("9338, " + -82 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ZJNNOVLJ;)V")
	private void method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub3_Sub2 arg2) {
		try {
			this.anInt975 += arg1;
			if (arg2.anInt385 < 128 || arg2.anInt386 < 128 || arg2.anInt385 >= 13184 || arg2.anInt386 >= 13184) {
				arg2.anInt418 = -1;
				arg2.anInt411 = -1;
				arg2.anInt380 = 0;
				arg2.anInt381 = 0;
				arg2.anInt385 = arg2.anIntArray93[0] * 128 + arg2.anInt383 * 64;
				arg2.anInt386 = arg2.anIntArray94[0] * 128 + arg2.anInt383 * 64;
				arg2.method248();
			}
			if (arg2 == aClass2_Sub1_Sub3_Sub2_Sub2_1 && (arg2.anInt385 < 1536 || arg2.anInt386 < 1536 || arg2.anInt385 >= 11776 || arg2.anInt386 >= 11776)) {
				arg2.anInt418 = -1;
				arg2.anInt411 = -1;
				arg2.anInt380 = 0;
				arg2.anInt381 = 0;
				arg2.anInt385 = arg2.anIntArray93[0] * 128 + arg2.anInt383 * 64;
				arg2.anInt386 = arg2.anIntArray94[0] * 128 + arg2.anInt383 * 64;
				arg2.method248();
			}
			if (arg2.anInt380 > anInt943) {
				this.method698(arg2);
			} else if (arg2.anInt381 >= anInt943) {
				this.method699(arg2);
			} else {
				this.method700(arg2);
			}
			this.method701(arg2);
			this.method702(arg2);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("36853, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZJNNOVLJ;I)V")
	private void method698(@OriginalArg(0) Class2_Sub1_Sub3_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt380 - anInt943;
			@Pc(14) int local14 = arg0.anInt376 * 128 + arg0.anInt383 * 64;
			@Pc(24) int local24 = arg0.anInt378 * 128 + arg0.anInt383 * 64;
			arg0.anInt385 += (local14 - arg0.anInt385) / local4;
			arg0.anInt386 += (local24 - arg0.anInt386) / local4;
			arg0.anInt384 = 0;
			if (arg0.anInt382 == 0) {
				arg0.anInt417 = 1024;
			}
			if (arg0.anInt382 == 1) {
				arg0.anInt417 = 1536;
			}
			if (arg0.anInt382 == 2) {
				arg0.anInt417 = 0;
			}
			if (arg0.anInt382 == 3) {
				arg0.anInt417 = 512;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("33767, " + arg0 + ", " + -824 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ZJNNOVLJ;I)V")
	private void method699(@OriginalArg(0) Class2_Sub1_Sub3_Sub2 arg0) {
		try {
			if (arg0.anInt381 == anInt943 || arg0.anInt418 == -1 || arg0.anInt421 != 0 || arg0.anInt420 + 1 > Class23.aClass23Array1[arg0.anInt418].method235(arg0.anInt419, this.anInt916)) {
				@Pc(30) int local30 = arg0.anInt381 - arg0.anInt380;
				@Pc(35) int local35 = anInt943 - arg0.anInt380;
				@Pc(45) int local45 = arg0.anInt376 * 128 + arg0.anInt383 * 64;
				@Pc(55) int local55 = arg0.anInt378 * 128 + arg0.anInt383 * 64;
				@Pc(65) int local65 = arg0.anInt377 * 128 + arg0.anInt383 * 64;
				@Pc(75) int local75 = arg0.anInt379 * 128 + arg0.anInt383 * 64;
				arg0.anInt385 = (local45 * (local30 - local35) + local65 * local35) / local30;
				arg0.anInt386 = (local55 * (local30 - local35) + local75 * local35) / local30;
			}
			arg0.anInt384 = 0;
			if (arg0.anInt382 == 0) {
				arg0.anInt417 = 1024;
			}
			if (arg0.anInt382 == 1) {
				arg0.anInt417 = 1536;
			}
			if (arg0.anInt382 == 2) {
				arg0.anInt417 = 0;
			}
			if (arg0.anInt382 == 3) {
				arg0.anInt417 = 512;
			}
			arg0.anInt387 = arg0.anInt417;
			this.anInt975 += 0;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("58669, " + arg0 + ", " + 0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ZJNNOVLJ;I)V")
	private void method700(@OriginalArg(0) Class2_Sub1_Sub3_Sub2 arg0) {
		try {
			arg0.anInt407 = arg0.anInt391;
			if (arg0.anInt393 == 0) {
				arg0.anInt384 = 0;
			} else {
				if (arg0.anInt418 != -1 && arg0.anInt421 == 0) {
					@Pc(24) Class23 local24 = Class23.aClass23Array1[arg0.anInt418];
					if (arg0.anInt394 > 0 && local24.anInt364 == 0) {
						arg0.anInt384++;
						return;
					}
					if (arg0.anInt394 <= 0 && local24.anInt365 == 0) {
						arg0.anInt384++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt385;
				@Pc(56) int local56 = arg0.anInt386;
				this.anInt975 += 0;
				@Pc(77) int local77 = arg0.anIntArray93[arg0.anInt393 - 1] * 128 + arg0.anInt383 * 64;
				@Pc(92) int local92 = arg0.anIntArray94[arg0.anInt393 - 1] * 128 + arg0.anInt383 * 64;
				if (local77 - local53 <= 256 && local77 - local53 >= -256 && local92 - local56 <= 256 && local92 - local56 >= -256) {
					if (local53 < local77) {
						if (local56 < local92) {
							arg0.anInt417 = 1280;
						} else if (local56 > local92) {
							arg0.anInt417 = 1792;
						} else {
							arg0.anInt417 = 1536;
						}
					} else if (local53 > local77) {
						if (local56 < local92) {
							arg0.anInt417 = 768;
						} else if (local56 > local92) {
							arg0.anInt417 = 256;
						} else {
							arg0.anInt417 = 512;
						}
					} else if (local56 < local92) {
						arg0.anInt417 = 1024;
					} else {
						arg0.anInt417 = 0;
					}
					@Pc(186) int local186 = arg0.anInt417 - arg0.anInt387 & 0x7FF;
					if (local186 > 1024) {
						local186 -= 2048;
					}
					@Pc(193) int local193 = arg0.anInt401;
					if (local186 >= -256 && local186 <= 256) {
						local193 = arg0.anInt400;
					} else if (local186 >= 256 && local186 < 768) {
						local193 = arg0.anInt403;
					} else if (local186 >= -768 && local186 <= -256) {
						local193 = arg0.anInt402;
					}
					if (local193 == -1) {
						local193 = arg0.anInt400;
					}
					arg0.anInt407 = local193;
					@Pc(235) int local235 = 4;
					if (arg0.anInt387 != arg0.anInt417 && arg0.anInt410 == -1 && arg0.anInt390 != 0) {
						local235 = 2;
					}
					if (arg0.anInt393 > 2) {
						local235 = 6;
					}
					if (arg0.anInt393 > 3) {
						local235 = 8;
					}
					if (arg0.anInt384 > 0 && arg0.anInt393 > 1) {
						local235 = 8;
						arg0.anInt384--;
					}
					if (arg0.aBooleanArray6[arg0.anInt393 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt407 == arg0.anInt400 && arg0.anInt389 != -1) {
						arg0.anInt407 = arg0.anInt389;
					}
					if (local53 < local77) {
						arg0.anInt385 += local235;
						if (arg0.anInt385 > local77) {
							arg0.anInt385 = local77;
						}
					} else if (local53 > local77) {
						arg0.anInt385 -= local235;
						if (arg0.anInt385 < local77) {
							arg0.anInt385 = local77;
						}
					}
					if (local56 < local92) {
						arg0.anInt386 += local235;
						if (arg0.anInt386 > local92) {
							arg0.anInt386 = local92;
						}
					} else if (local56 > local92) {
						arg0.anInt386 -= local235;
						if (arg0.anInt386 < local92) {
							arg0.anInt386 = local92;
						}
					}
					if (arg0.anInt385 == local77 && arg0.anInt386 == local92) {
						arg0.anInt393--;
						if (arg0.anInt394 > 0) {
							arg0.anInt394--;
							return;
						}
					}
				} else {
					arg0.anInt385 = local77;
					arg0.anInt386 = local92;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("37166, " + arg0 + ", " + 0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ZJNNOVLJ;)V")
	private void method701(@OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg0) {
		try {
			if (arg0.anInt390 != 0) {
				@Pc(31) int local31;
				@Pc(37) int local37;
				if (arg0.anInt410 != -1 && arg0.anInt410 < 32768) {
					@Pc(23) Class2_Sub1_Sub3_Sub2_Sub1 local23 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[arg0.anInt410];
					if (local23 != null) {
						local31 = arg0.anInt385 - local23.anInt385;
						local37 = arg0.anInt386 - local23.anInt386;
						if (local31 != 0 || local37 != 0) {
							arg0.anInt417 = (int) (Math.atan2((double) local31, (double) local37) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(62) int local62;
				if (arg0.anInt410 >= 32768) {
					local62 = arg0.anInt410 - 32768;
					if (local62 == this.anInt942) {
						local62 = this.anInt939;
					}
					@Pc(74) Class2_Sub1_Sub3_Sub2_Sub2 local74 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local62];
					if (local74 != null) {
						local37 = arg0.anInt385 - local74.anInt385;
						@Pc(88) int local88 = arg0.anInt386 - local74.anInt386;
						if (local37 != 0 || local88 != 0) {
							arg0.anInt417 = (int) (Math.atan2((double) local37, (double) local88) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt404 != 0 || arg0.anInt405 != 0) && (arg0.anInt393 == 0 || arg0.anInt384 > 0)) {
					local62 = arg0.anInt385 - (arg0.anInt404 - this.anInt1026 - this.anInt1026) * 64;
					local31 = arg0.anInt386 - (arg0.anInt405 - this.anInt1027 - this.anInt1027) * 64;
					if (local62 != 0 || local31 != 0) {
						arg0.anInt417 = (int) (Math.atan2((double) local62, (double) local31) * 325.949D) & 0x7FF;
					}
					arg0.anInt404 = 0;
					arg0.anInt405 = 0;
				}
				local62 = arg0.anInt417 - arg0.anInt387 & 0x7FF;
				if (local62 != 0) {
					if (local62 < arg0.anInt390 || local62 > 2048 - arg0.anInt390) {
						arg0.anInt387 = arg0.anInt417;
					} else if (local62 > 1024) {
						arg0.anInt387 -= arg0.anInt390;
					} else {
						arg0.anInt387 += arg0.anInt390;
					}
					arg0.anInt387 &= 0x7FF;
					if (arg0.anInt407 == arg0.anInt391 && arg0.anInt387 != arg0.anInt417) {
						if (arg0.anInt392 != -1) {
							arg0.anInt407 = arg0.anInt392;
							return;
						}
						arg0.anInt407 = arg0.anInt400;
						return;
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("66, " + -97 + ", " + arg0 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ZJNNOVLJ;)V")
	private void method702(@OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg0) {
		try {
			arg0.aBoolean103 = false;
			@Pc(20) Class23 local20;
			if (arg0.anInt407 != -1) {
				local20 = Class23.aClass23Array1[arg0.anInt407];
				arg0.anInt409++;
				if (arg0.anInt408 < local20.anInt358 && arg0.anInt409 > local20.method235(arg0.anInt408, this.anInt916)) {
					arg0.anInt409 = 0;
					arg0.anInt408++;
				}
				if (arg0.anInt408 >= local20.anInt358) {
					arg0.anInt409 = 0;
					arg0.anInt408 = 0;
				}
			}
			if (arg0.anInt411 != -1 && anInt943 >= arg0.anInt414) {
				if (arg0.anInt412 < 0) {
					arg0.anInt412 = 0;
				}
				local20 = Class37.aClass37Array1[arg0.anInt411].aClass23_2;
				arg0.anInt413++;
				while (arg0.anInt412 < local20.anInt358 && arg0.anInt413 > local20.method235(arg0.anInt412, this.anInt916)) {
					arg0.anInt413 -= local20.method235(arg0.anInt412, this.anInt916);
					arg0.anInt412++;
				}
				if (arg0.anInt412 >= local20.anInt358 && (arg0.anInt412 < 0 || arg0.anInt412 >= local20.anInt358)) {
					arg0.anInt411 = -1;
				}
			}
			if (arg0.anInt418 != -1 && arg0.anInt421 <= 1) {
				local20 = Class23.aClass23Array1[arg0.anInt418];
				if (local20.anInt364 == 1 && arg0.anInt394 > 0 && arg0.anInt380 <= anInt943 && arg0.anInt381 < anInt943) {
					arg0.anInt421 = 1;
					return;
				}
			}
			if (arg0.anInt418 != -1 && arg0.anInt421 == 0) {
				local20 = Class23.aClass23Array1[arg0.anInt418];
				arg0.anInt420++;
				while (arg0.anInt419 < local20.anInt358 && arg0.anInt420 > local20.method235(arg0.anInt419, this.anInt916)) {
					arg0.anInt420 -= local20.method235(arg0.anInt419, this.anInt916);
					arg0.anInt419++;
				}
				if (arg0.anInt419 >= local20.anInt358) {
					arg0.anInt419 -= local20.anInt359;
					arg0.anInt422++;
					if (arg0.anInt422 >= local20.anInt363) {
						arg0.anInt418 = -1;
					}
					if (arg0.anInt419 < 0 || arg0.anInt419 >= local20.anInt358) {
						arg0.anInt418 = -1;
					}
				}
				arg0.aBoolean103 = local20.aBoolean97;
			}
			if (arg0.anInt421 > 0) {
				arg0.anInt421--;
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("49202, " + -453 + ", " + arg0 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method703(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == this.anInt928) {
				if (this.anInt897 == -1 || this.anInt968 != 2 && super.aClass32_2 == null) {
					if (this.aBoolean234) {
						this.method693();
						this.aBoolean234 = false;
						this.aClass32_12.method297(0, 4, super.aGraphics2);
						this.aClass32_13.method297(0, 357, super.aGraphics2);
						this.aClass32_14.method297(722, 4, super.aGraphics2);
						this.aClass32_15.method297(743, 205, super.aGraphics2);
						this.aClass32_16.method297(0, 0, super.aGraphics2);
						this.aClass32_17.method297(516, 4, super.aGraphics2);
						this.aClass32_18.method297(516, 205, super.aGraphics2);
						this.aClass32_19.method297(496, 357, super.aGraphics2);
						this.aClass32_20.method297(0, 338, super.aGraphics2);
						this.aBoolean251 = true;
						this.aBoolean239 = true;
						this.aBoolean255 = true;
						this.aBoolean270 = true;
						if (this.anInt968 != 2) {
							this.aClass32_26.method297(4, 4, super.aGraphics2);
							this.aClass32_25.method297(550, 4, super.aGraphics2);
						}
					}
					if (this.anInt968 == 2) {
						this.method650();
					}
					if (this.aBoolean260 && this.anInt865 == 1) {
						this.aBoolean251 = true;
					}
					@Pc(282) boolean local282;
					if (this.anInt1033 != -1) {
						local282 = this.method725(this.anInt909, (byte) 5, this.anInt1033);
						if (local282) {
							this.aBoolean251 = true;
						}
					}
					if (this.anInt859 == 2) {
						this.aBoolean251 = true;
					}
					if (this.anInt900 == 2) {
						this.aBoolean251 = true;
					}
					if (this.aBoolean251) {
						this.method595();
						this.aBoolean251 = false;
					}
					@Pc(368) int local368;
					if (this.anInt959 == -1 && this.anInt989 == 0) {
						this.aClass15_1.anInt205 = this.anInt832 - this.anInt923 - 77;
						if (super.anInt811 > 448 && super.anInt811 < 560 && super.anInt812 > 332) {
							this.method664(this.anInt881, super.anInt811 - 17, 0, 463, this.anInt832, -1, 77, this.aClass15_1, super.anInt812 - 357);
						}
						local368 = this.anInt832 - this.aClass15_1.anInt205 - 77;
						if (local368 < 0) {
							local368 = 0;
						}
						if (local368 > this.anInt832 - 77) {
							local368 = this.anInt832 - 77;
						}
						if (this.anInt923 != local368) {
							this.anInt923 = local368;
							this.aBoolean239 = true;
						}
					}
					if (this.anInt959 == -1 && this.anInt989 == 3) {
						local368 = this.anInt996 * 14 + 7;
						this.aClass15_1.anInt205 = this.anInt997;
						if (super.anInt811 > 448 && super.anInt811 < 560 && super.anInt812 > 332) {
							this.method664(this.anInt881, super.anInt811 - 17, 0, 463, local368, -1, 77, this.aClass15_1, super.anInt812 - 357);
						}
						@Pc(448) int local448 = this.aClass15_1.anInt205;
						if (local448 < 0) {
							local448 = 0;
						}
						if (local448 > local368 - 77) {
							local448 = local368 - 77;
						}
						if (this.anInt997 != local448) {
							this.anInt997 = local448;
							this.aBoolean239 = true;
						}
					}
					if (this.anInt959 != -1) {
						local282 = this.method725(this.anInt909, (byte) 5, this.anInt959);
						if (local282) {
							this.aBoolean239 = true;
						}
					}
					if (this.anInt859 == 3) {
						this.aBoolean239 = true;
					}
					if (this.anInt900 == 3) {
						this.aBoolean239 = true;
					}
					if (this.aString17 != null) {
						this.aBoolean239 = true;
					}
					if (this.aBoolean260 && this.anInt865 == 2) {
						this.aBoolean239 = true;
					}
					if (this.aBoolean239) {
						this.method667(639);
						this.aBoolean239 = false;
					}
					if (this.anInt968 == 2) {
						this.method630();
						this.aClass32_25.method297(550, 4, super.aGraphics2);
					}
					if (this.anInt1049 != -1) {
						this.aBoolean255 = true;
					}
					if (this.aBoolean255) {
						if (this.anInt1049 != -1 && this.anInt1049 == this.anInt962) {
							this.anInt1049 = -1;
							this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 20);
							this.aClass2_Sub1_Sub4_9.method330(this.anInt962);
						}
						this.aBoolean255 = false;
						this.aClass32_23.method296();
						this.aClass2_Sub1_Sub2_Sub3_3.method277(0, 0);
						if (this.anInt1033 == -1) {
							if (this.anIntArray248[this.anInt962] != -1) {
								if (this.anInt962 == 0) {
									this.aClass2_Sub1_Sub2_Sub3_16.method277(22, 10);
								}
								if (this.anInt962 == 1) {
									this.aClass2_Sub1_Sub2_Sub3_17.method277(54, 8);
								}
								if (this.anInt962 == 2) {
									this.aClass2_Sub1_Sub2_Sub3_17.method277(82, 8);
								}
								if (this.anInt962 == 3) {
									this.aClass2_Sub1_Sub2_Sub3_18.method277(110, 8);
								}
								if (this.anInt962 == 4) {
									this.aClass2_Sub1_Sub2_Sub3_20.method277(153, 8);
								}
								if (this.anInt962 == 5) {
									this.aClass2_Sub1_Sub2_Sub3_20.method277(181, 8);
								}
								if (this.anInt962 == 6) {
									this.aClass2_Sub1_Sub2_Sub3_19.method277(209, 9);
								}
							}
							if (this.anIntArray248[0] != -1 && (this.anInt1049 != 0 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[0].method277(29, 13);
							}
							if (this.anIntArray248[1] != -1 && (this.anInt1049 != 1 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[1].method277(53, 11);
							}
							if (this.anIntArray248[2] != -1 && (this.anInt1049 != 2 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[2].method277(82, 11);
							}
							if (this.anIntArray248[3] != -1 && (this.anInt1049 != 3 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[3].method277(115, 12);
							}
							if (this.anIntArray248[4] != -1 && (this.anInt1049 != 4 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[4].method277(153, 13);
							}
							if (this.anIntArray248[5] != -1 && (this.anInt1049 != 5 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[5].method277(180, 11);
							}
							if (this.anIntArray248[6] != -1 && (this.anInt1049 != 6 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[6].method277(208, 13);
							}
						}
						this.aClass32_23.method297(516, 160, super.aGraphics2);
						this.aClass32_22.method296();
						this.aClass2_Sub1_Sub2_Sub3_2.method277(0, 0);
						if (this.anInt1033 == -1) {
							if (this.anIntArray248[this.anInt962] != -1) {
								if (this.anInt962 == 7) {
									this.aClass2_Sub1_Sub2_Sub3_11.method277(42, 0);
								}
								if (this.anInt962 == 8) {
									this.aClass2_Sub1_Sub2_Sub3_12.method277(74, 0);
								}
								if (this.anInt962 == 9) {
									this.aClass2_Sub1_Sub2_Sub3_12.method277(102, 0);
								}
								if (this.anInt962 == 10) {
									this.aClass2_Sub1_Sub2_Sub3_13.method277(130, 1);
								}
								if (this.anInt962 == 11) {
									this.aClass2_Sub1_Sub2_Sub3_15.method277(173, 0);
								}
								if (this.anInt962 == 12) {
									this.aClass2_Sub1_Sub2_Sub3_15.method277(201, 0);
								}
								if (this.anInt962 == 13) {
									this.aClass2_Sub1_Sub2_Sub3_14.method277(229, 0);
								}
							}
							if (this.anIntArray248[8] != -1 && (this.anInt1049 != 8 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[7].method277(74, 2);
							}
							if (this.anIntArray248[9] != -1 && (this.anInt1049 != 9 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[8].method277(102, 3);
							}
							if (this.anIntArray248[10] != -1 && (this.anInt1049 != 10 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[9].method277(137, 4);
							}
							if (this.anIntArray248[11] != -1 && (this.anInt1049 != 11 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[10].method277(174, 2);
							}
							if (this.anIntArray248[12] != -1 && (this.anInt1049 != 12 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[11].method277(201, 2);
							}
							if (this.anIntArray248[13] != -1 && (this.anInt1049 != 13 || anInt943 % 20 < 10)) {
								this.aClass2_Sub1_Sub2_Sub3Array3[12].method277(226, 2);
							}
						}
						this.aClass32_22.method297(496, 466, super.aGraphics2);
						this.aClass32_26.method296();
						Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
					}
					if (this.aBoolean270) {
						this.aBoolean270 = false;
						this.aClass32_21.method296();
						this.aClass2_Sub1_Sub2_Sub3_1.method277(0, 0);
						this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16777215, "Public chat", 28, 55);
						if (this.anInt935 == 0) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 65280, "On", 41, 55);
						}
						if (this.anInt935 == 1) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16776960, "Friends", 41, 55);
						}
						if (this.anInt935 == 2) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16711680, "Off", 41, 55);
						}
						if (this.anInt935 == 3) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 65535, "Hide", 41, 55);
						}
						this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16777215, "Private chat", 28, 184);
						if (this.anInt848 == 0) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 65280, "On", 41, 184);
						}
						if (this.anInt848 == 1) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16776960, "Friends", 41, 184);
						}
						if (this.anInt848 == 2) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16711680, "Off", 41, 184);
						}
						this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16777215, "Trade/compete", 28, 324);
						if (this.anInt890 == 0) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 65280, "On", 41, 324);
						}
						if (this.anInt890 == 1) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16776960, "Friends", 41, 324);
						}
						if (this.anInt890 == 2) {
							this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16711680, "Off", 41, 324);
						}
						this.aClass2_Sub1_Sub2_Sub2_3.method86(true, 16777215, "Report abuse", 33, 458);
						this.aClass32_21.method297(0, 453, super.aGraphics2);
						this.aClass32_26.method296();
						Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray218;
					}
					this.anInt909 = 0;
				} else {
					if (this.anInt968 == 2) {
						this.method725(this.anInt909, (byte) 5, this.anInt897);
						if (this.anInt860 != -1) {
							this.method725(this.anInt909, (byte) 5, this.anInt860);
						}
						this.anInt909 = 0;
						this.method593();
						super.aClass32_2.method296();
						Class2_Sub1_Sub2_Sub4.anIntArray189 = this.anIntArray219;
						Class2_Sub1_Sub2.method476();
						this.aBoolean234 = true;
						@Pc(61) Class15 local61 = Class15.method120(this.anInt897);
						if (local61.anInt195 == 512 && local61.anInt199 == 334 && local61.anInt206 == 0) {
							local61.anInt195 = 765;
							local61.anInt199 = 503;
						}
						this.method704(0, local61, 0, 0);
						if (this.anInt860 != -1) {
							local61 = Class15.method120(this.anInt860);
							if (local61.anInt195 == 512 && local61.anInt199 == 334 && local61.anInt206 == 0) {
								local61.anInt195 = 765;
								local61.anInt199 = 503;
							}
							this.method704(0, local61, 0, 0);
						}
						if (this.aBoolean260) {
							this.method649();
						} else {
							this.method689();
							this.method675();
						}
					}
					super.aClass32_2.method297(0, 0, super.aGraphics2);
				}
			}
		} catch (@Pc(1279) RuntimeException local1279) {
			signlink.reporterror("22791, " + arg0 + ", " + local1279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IGMZHLWJ;IIZ)V")
	private void method704(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.aBoolean238 &= true;
			if (arg1.anInt206 == 0 && arg1.anIntArray54 != null && (!arg1.aBoolean60 || this.anInt944 == arg1.anInt200 || this.anInt894 == arg1.anInt200 || this.anInt937 == arg1.anInt200)) {
				@Pc(35) int local35 = Class2_Sub1_Sub2.anInt714;
				@Pc(37) int local37 = Class2_Sub1_Sub2.anInt712;
				@Pc(39) int local39 = Class2_Sub1_Sub2.anInt715;
				@Pc(41) int local41 = Class2_Sub1_Sub2.anInt713;
				Class2_Sub1_Sub2.method475(arg2, arg0 + arg1.anInt195, arg0, arg2 + arg1.anInt199);
				@Pc(57) int local57 = arg1.anIntArray54.length;
				for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
					@Pc(68) int local68 = arg1.anIntArray55[local59] + arg0;
					@Pc(77) int local77 = arg1.anIntArray48[local59] + arg2 - arg3;
					@Pc(83) Class15 local83 = Class15.method120(arg1.anIntArray54[local59]);
					@Pc(88) int local88 = local68 + local83.anInt176;
					@Pc(93) int local93 = local77 + local83.anInt196;
					if (local83.anInt204 > 0) {
						this.method639(local83);
					}
					if (local83.anInt206 == 0) {
						if (local83.anInt205 > local83.anInt173 - local83.anInt199) {
							local83.anInt205 = local83.anInt173 - local83.anInt199;
						}
						if (local83.anInt205 < 0) {
							local83.anInt205 = 0;
						}
						this.method704(local88, local83, local93, local83.anInt205);
						if (local83.anInt173 > local83.anInt199) {
							this.method609(local83.anInt205, local93, local83.anInt173, local88 + local83.anInt195, local83.anInt199);
						}
					} else if (local83.anInt206 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(247) int local247;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local83.anInt206 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local83.anInt199; local165++) {
								for (local169 = 0; local169 < local83.anInt195; local169++) {
									local180 = local88 + local169 * (local83.anInt203 + 32);
									@Pc(189) int local189 = local93 + local165 * (local83.anInt179 + 32);
									if (local163 < 20) {
										local180 += local83.anIntArray51[local163];
										local189 += local83.anIntArray49[local163];
									}
									if (local83.anIntArray50[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local83.anIntArray50[local163] - 1;
										if (local180 > Class2_Sub1_Sub2.anInt714 - 32 && local180 < Class2_Sub1_Sub2.anInt715 && local189 > Class2_Sub1_Sub2.anInt712 - 32 && local189 < Class2_Sub1_Sub2.anInt713 || this.anInt900 != 0 && this.anInt899 == local163) {
											local247 = 0;
											if (this.anInt945 == 1 && this.anInt946 == local163 && this.anInt947 == local83.anInt200) {
												local247 = 16777215;
											}
											@Pc(271) Class2_Sub1_Sub2_Sub1 local271 = Class34.method388(local247, local83.anIntArray52[local163], local222);
											if (local271 != null) {
												@Pc(351) int local351;
												if (this.anInt900 != 0 && this.anInt899 == local163 && this.anInt898 == local83.anInt200) {
													local213 = super.anInt811 - this.anInt901;
													local215 = super.anInt812 - this.anInt902;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt994 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method44(this.anInt1025, local189 + local215, local180 + local213);
													if (local189 + local215 < Class2_Sub1_Sub2.anInt712 && arg1.anInt205 > 0) {
														local351 = this.anInt909 * (Class2_Sub1_Sub2.anInt712 - local189 - local215) / 3;
														if (local351 > this.anInt909 * 10) {
															local351 = this.anInt909 * 10;
														}
														if (local351 > arg1.anInt205) {
															local351 = arg1.anInt205;
														}
														arg1.anInt205 -= local351;
														this.anInt902 += local351;
													}
													if (local189 + local215 + 32 > Class2_Sub1_Sub2.anInt713 && arg1.anInt205 < arg1.anInt173 - arg1.anInt199) {
														local351 = this.anInt909 * (local189 + local215 + 32 - Class2_Sub1_Sub2.anInt713) / 3;
														if (local351 > this.anInt909 * 10) {
															local351 = this.anInt909 * 10;
														}
														if (local351 > arg1.anInt173 - arg1.anInt199 - arg1.anInt205) {
															local351 = arg1.anInt173 - arg1.anInt199 - arg1.anInt205;
														}
														arg1.anInt205 += local351;
														this.anInt902 -= local351;
													}
												} else if (this.anInt859 != 0 && this.anInt858 == local163 && this.anInt857 == local83.anInt200) {
													local271.method44(this.anInt1025, local189, local180);
												} else {
													local271.method42(local180, local189);
												}
												if (local271.anInt42 == 33 || local83.anIntArray52[local163] != 1) {
													local351 = local83.anIntArray52[local163];
													this.aClass2_Sub1_Sub2_Sub2_2.method89(local180 + local213 + 1, 0, local189 + local215 + 10, method674(local351));
													this.aClass2_Sub1_Sub2_Sub2_2.method89(local180 + local213, 16776960, local189 + local215 + 9, method674(local351));
												}
											}
										}
									} else if (local83.aClass2_Sub1_Sub2_Sub1Array1 != null && local163 < 20) {
										@Pc(541) Class2_Sub1_Sub2_Sub1 local541 = local83.aClass2_Sub1_Sub2_Sub1Array1[local163];
										if (local541 != null) {
											local541.method42(local180, local189);
										}
									}
									local163++;
								}
							}
						} else if (local83.anInt206 == 3) {
							@Pc(567) boolean local567 = false;
							if (this.anInt937 == local83.anInt200 || this.anInt894 == local83.anInt200 || this.anInt944 == local83.anInt200) {
								local567 = true;
							}
							if (this.method716(local83)) {
								local163 = local83.anInt198;
								if (local567 && local83.anInt178 != 0) {
									local163 = local83.anInt178;
								}
							} else {
								local163 = local83.anInt177;
								if (local567 && local83.anInt193 != 0) {
									local163 = local83.anInt193;
								}
							}
							if (local83.aByte11 == 0) {
								if (local83.aBoolean58) {
									Class2_Sub1_Sub2.method478(local88, local83.anInt195, local83.anInt199, local93, local163);
								} else {
									Class2_Sub1_Sub2.method479(local163, local83.anInt195, local88, local83.anInt199, local93);
								}
							} else if (local83.aBoolean58) {
								Class2_Sub1_Sub2.method477(local88, local83.anInt195, local163, local93, local83.anInt199, 256 - (local83.aByte11 & 0xFF));
							} else {
								Class2_Sub1_Sub2.method480(local83.anInt195, local163, local93, local83.anInt199, local88, 256 - (local83.aByte11 & 0xFF));
							}
						} else {
							@Pc(685) Class2_Sub1_Sub2_Sub2 local685;
							@Pc(962) String local962;
							if (local83.anInt206 == 4) {
								local685 = local83.aClass2_Sub1_Sub2_Sub2_1;
								@Pc(688) String local688 = local83.aString4;
								@Pc(690) boolean local690 = false;
								if (this.anInt937 == local83.anInt200 || this.anInt894 == local83.anInt200 || this.anInt944 == local83.anInt200) {
									local690 = true;
								}
								if (this.method716(local83)) {
									local165 = local83.anInt198;
									if (local690 && local83.anInt178 != 0) {
										local165 = local83.anInt178;
									}
									if (local83.aString2.length() > 0) {
										local688 = local83.aString2;
									}
								} else {
									local165 = local83.anInt177;
									if (local690 && local83.anInt193 != 0) {
										local165 = local83.anInt193;
									}
								}
								if (local83.anInt172 == 6 && this.aBoolean237) {
									local688 = "Please wait...";
									local165 = local83.anInt177;
								}
								if (Class2_Sub1_Sub2.anInt710 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local93 + local685.anInt132;
								while (local688.length() > 0) {
									if (local688.indexOf("%") != -1) {
										label390: while (true) {
											local215 = local688.indexOf("%1");
											if (local215 == -1) {
												while (true) {
													local215 = local688.indexOf("%2");
													if (local215 == -1) {
														while (true) {
															local215 = local688.indexOf("%3");
															if (local215 == -1) {
																while (true) {
																	local215 = local688.indexOf("%4");
																	if (local215 == -1) {
																		while (true) {
																			local215 = local688.indexOf("%5");
																			if (local215 == -1) {
																				break label390;
																			}
																			local688 = local688.substring(0, local215) + this.method685(this.method714(4, local83)) + local688.substring(local215 + 2);
																		}
																	}
																	local688 = local688.substring(0, local215) + this.method685(this.method714(3, local83)) + local688.substring(local215 + 2);
																}
															}
															local688 = local688.substring(0, local215) + this.method685(this.method714(2, local83)) + local688.substring(local215 + 2);
														}
													}
													local688 = local688.substring(0, local215) + this.method685(this.method714(1, local83)) + local688.substring(local215 + 2);
												}
											}
											local688 = local688.substring(0, local215) + this.method685(this.method714(0, local83)) + local688.substring(local215 + 2);
										}
									}
									local215 = local688.indexOf("\\n");
									if (local215 == -1) {
										local962 = local688;
										local688 = "";
									} else {
										local962 = local688.substring(0, local215);
										local688 = local688.substring(local215 + 2);
									}
									if (local83.aBoolean55) {
										local685.method86(local83.aBoolean57, local165, local962, local213, local88 + local83.anInt195 / 2);
									} else {
										local685.method93(local88, local962, local165, local83.aBoolean57, local213);
									}
									local213 += local685.anInt132;
								}
							} else if (local83.anInt206 == 5) {
								@Pc(1024) Class2_Sub1_Sub2_Sub1 local1024;
								if (this.method716(local83)) {
									local1024 = local83.aClass2_Sub1_Sub2_Sub1_2;
								} else {
									local1024 = local83.aClass2_Sub1_Sub2_Sub1_1;
								}
								if (local1024 != null) {
									local1024.method42(local88, local93);
								}
							} else if (local83.anInt206 == 6) {
								local163 = Class2_Sub1_Sub2_Sub4.anInt721;
								local165 = Class2_Sub1_Sub2_Sub4.anInt722;
								Class2_Sub1_Sub2_Sub4.anInt721 = local88 + local83.anInt195 / 2;
								Class2_Sub1_Sub2_Sub4.anInt722 = local93 + local83.anInt199 / 2;
								local169 = Class2_Sub1_Sub2_Sub4.anIntArray187[local83.anInt184] * local83.anInt183 >> 16;
								local180 = Class2_Sub1_Sub2_Sub4.anIntArray188[local83.anInt184] * local83.anInt183 >> 16;
								@Pc(1085) boolean local1085 = this.method716(local83);
								if (local1085) {
									local213 = local83.anInt190;
								} else {
									local213 = local83.anInt189;
								}
								@Pc(1105) Class2_Sub1_Sub3_Sub5 local1105;
								if (local213 == -1) {
									local1105 = local83.method125(-1, -1, local1085);
								} else {
									@Pc(1111) Class23 local1111 = Class23.aClass23Array1[local213];
									local1105 = local83.method125(local1111.anIntArray82[local83.anInt197], local1111.anIntArray83[local83.anInt197], local1085);
								}
								if (local1105 != null) {
									local1105.method444(local83.anInt185, 0, local83.anInt184, 0, local169, local180);
								}
								Class2_Sub1_Sub2_Sub4.anInt721 = local163;
								Class2_Sub1_Sub2_Sub4.anInt722 = local165;
							} else {
								if (local83.anInt206 == 7) {
									local685 = local83.aClass2_Sub1_Sub2_Sub2_1;
									local165 = 0;
									for (local169 = 0; local169 < local83.anInt199; local169++) {
										for (local180 = 0; local180 < local83.anInt195; local180++) {
											if (local83.anIntArray50[local165] > 0) {
												@Pc(1175) Class34 local1175 = Class34.method385(local83.anIntArray50[local165] - 1);
												@Pc(1179) String local1179 = String.valueOf(local1175.aString13);
												if (local1175.aBoolean147 || local83.anIntArray52[local165] != 1) {
													local1179 = local1179 + " x" + method626(local83.anIntArray52[local165]);
												}
												local215 = local88 + local180 * (local83.anInt203 + 115);
												local222 = local93 + local169 * (local83.anInt179 + 12);
												if (local83.aBoolean55) {
													local685.method86(local83.aBoolean57, local83.anInt177, local1179, local222, local215 + local83.anInt195 / 2);
												} else {
													local685.method93(local215, local1179, local83.anInt177, local83.aBoolean57, local222);
												}
											}
											local165++;
										}
									}
								}
								if (local83.anInt206 == 8 && (this.anInt907 == local83.anInt200 || this.anInt1039 == local83.anInt200 || this.anInt831 == local83.anInt200) && this.anInt825 == 100) {
									local163 = 0;
									local165 = 0;
									@Pc(1293) Class2_Sub1_Sub2_Sub2 local1293 = this.aClass2_Sub1_Sub2_Sub2_3;
									@Pc(1296) String local1296 = local83.aString4;
									while (local1296.length() > 0) {
										local213 = local1296.indexOf("\\n");
										if (local213 == -1) {
											local962 = local1296;
											local1296 = "";
										} else {
											local962 = local1296.substring(0, local213);
											local1296 = local1296.substring(local213 + 2);
										}
										local215 = local1293.method87(local962);
										if (local215 > local163) {
											local163 = local215;
										}
										local165 += local1293.anInt132 + 1;
									}
									local163 += 6;
									local165 += 7;
									local213 = local88 + local83.anInt195 - local163 - 5;
									local215 = local93 + local83.anInt199 + 5;
									if (local213 < local88 + 5) {
										local213 = local88 + 5;
									}
									if (local213 + local163 > arg0 + arg1.anInt195) {
										local213 = arg0 + arg1.anInt195 - local163;
									}
									if (local215 + local165 > arg2 + arg1.anInt199) {
										local215 = arg2 + arg1.anInt199 - local165;
									}
									Class2_Sub1_Sub2.method478(local213, local163, local165, local215, 16777120);
									Class2_Sub1_Sub2.method479(0, local163, local213, local165, local215);
									local1296 = local83.aString4;
									local222 = local215 + local1293.anInt132 + 2;
									while (local1296.length() > 0) {
										local247 = local1296.indexOf("\\n");
										if (local247 == -1) {
											local962 = local1296;
											local1296 = "";
										} else {
											local962 = local1296.substring(0, local247);
											local1296 = local1296.substring(local247 + 2);
										}
										local1293.method93(local213 + 3, local962, 0, false, local222);
										local222 += local1293.anInt132 + 1;
									}
								}
							}
						}
					}
				}
				Class2_Sub1_Sub2.method475(local37, local39, local35, local41);
			}
		} catch (@Pc(1481) RuntimeException local1481) {
			signlink.reporterror("85696, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local1481.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(II)V")
	private void method705(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1059 = arg0;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("3739, " + -646 + ", " + arg0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method706() {
		try {
			this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 169);
			if (this.aByte31 == 21) {
				if (this.anInt1033 != -1) {
					this.method589(this.anInt1033);
					this.anInt1033 = -1;
					this.aBoolean251 = true;
					this.aBoolean237 = false;
					this.aBoolean255 = true;
				}
				if (this.anInt959 != -1) {
					this.method589(this.anInt959);
					this.anInt959 = -1;
					this.aBoolean239 = true;
					this.aBoolean237 = false;
				}
				if (this.anInt897 != -1) {
					this.method589(this.anInt897);
					this.anInt897 = -1;
					this.aBoolean234 = true;
				}
				if (this.anInt860 != -1) {
					this.method589(this.anInt860);
					this.anInt860 = -1;
				}
				if (this.anInt963 != -1) {
					this.method589(this.anInt963);
					this.anInt963 = -1;
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("28701, " + 21 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	@Override
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg2) {
				this.method581();
			}
			this.anInt871 = arg0;
			this.aString20 = arg1;
			this.method677();
			if (this.aClass13_2 == null) {
				super.method588(arg0, arg1, aBoolean222);
			} else {
				this.aClass32_5.method296();
				this.aClass2_Sub1_Sub2_Sub2_4.method85(16777215, 180, 54, "RuneScape is loading - please wait...");
				Class2_Sub1_Sub2.method479(9179409, 304, 28, 34, 62);
				Class2_Sub1_Sub2.method479(0, 302, 29, 32, 63);
				Class2_Sub1_Sub2.method478(30, arg0 * 3, 30, 64, 9179409);
				Class2_Sub1_Sub2.method478(arg0 * 3 + 30, 300 - arg0 * 3, 30, 64, 0);
				this.aClass2_Sub1_Sub2_Sub2_4.method85(16777215, 180, 85, arg1);
				this.aClass32_5.method297(202, 171, super.aGraphics2);
				if (this.aBoolean234) {
					this.aBoolean234 = false;
					if (!this.aBoolean226) {
						this.aClass32_6.method297(0, 0, super.aGraphics2);
						this.aClass32_7.method297(637, 0, super.aGraphics2);
					}
					this.aClass32_3.method297(128, 0, super.aGraphics2);
					this.aClass32_4.method297(202, 371, super.aGraphics2);
					this.aClass32_8.method297(0, 265, super.aGraphics2);
					this.aClass32_9.method297(562, 265, super.aGraphics2);
					this.aClass32_10.method297(128, 171, super.aGraphics2);
					this.aClass32_11.method297(562, 171, super.aGraphics2);
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("70173, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method707() {
		try {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt1035 == 0) {
				local17 = super.anInt807 / 2 - 80;
				local24 = super.anInt808 / 2 + 20;
				local24 += 20;
				if (super.anInt816 == 1 && super.anInt817 >= local17 - 75 && super.anInt817 <= local17 + 75 && super.anInt818 >= local24 - 20 && super.anInt818 <= local24 + 20) {
					this.anInt1035 = 3;
					this.anInt954 = 0;
				}
				local17 = super.anInt807 / 2 + 80;
				if (super.anInt816 == 1 && super.anInt817 >= local17 - 75 && super.anInt817 <= local17 + 75 && super.anInt818 >= local24 - 20 && super.anInt818 <= local24 + 20) {
					this.aString25 = "";
					this.aString26 = "Enter your username & password.";
					this.anInt1035 = 2;
					this.anInt954 = 0;
				}
			} else if (this.anInt1035 == 2) {
				local17 = super.anInt808 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt816 == 1 && super.anInt818 >= local17 - 15 && super.anInt818 < local17) {
					this.anInt954 = 0;
				}
				local17 += 15;
				if (super.anInt816 == 1 && super.anInt818 >= local17 - 15 && super.anInt818 < local17) {
					this.anInt954 = 1;
				}
				local17 += 15;
				local24 = super.anInt807 / 2 - 80;
				@Pc(170) int local170 = super.anInt808 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt816 == 1 && super.anInt817 >= local24 - 75 && super.anInt817 <= local24 + 75 && super.anInt818 >= local171 - 20 && super.anInt818 <= local171 + 20) {
					this.anInt864 = 0;
					this.method727(this.aString29, this.aString30, false);
					if (this.aBoolean238) {
						return;
					}
				}
				local24 = super.anInt807 / 2 + 80;
				if (super.anInt816 == 1 && super.anInt817 >= local24 - 75 && super.anInt817 <= local24 + 75 && super.anInt818 >= local171 - 20 && super.anInt818 <= local171 + 20) {
					this.anInt1035 = 0;
					this.aString29 = "";
					this.aString30 = "";
				}
				while (true) {
					while (true) {
						@Pc(261) int local261 = this.method580();
						if (local261 == -1) {
							return;
						}
						@Pc(266) boolean local266 = false;
						for (@Pc(268) int local268 = 0; local268 < aString19.length(); local268++) {
							if (local261 == aString19.charAt(local268)) {
								local266 = true;
								break;
							}
						}
						if (this.anInt954 == 0) {
							if (local261 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt954 = 1;
							}
							if (local266) {
								this.aString29 = this.aString29 + (char) local261;
							}
							if (this.aString29.length() > 12) {
								this.aString29 = this.aString29.substring(0, 12);
							}
						} else if (this.anInt954 == 1) {
							if (local261 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt954 = 0;
							}
							if (local266) {
								this.aString30 = this.aString30 + (char) local261;
							}
							if (this.aString30.length() > 20) {
								this.aString30 = this.aString30.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1035 == 3) {
				local17 = super.anInt807 / 2;
				local24 = super.anInt808 / 2 + 50;
				@Pc(425) int local425 = local24 + 20;
				if (super.anInt816 == 1 && super.anInt817 >= local17 - 75 && super.anInt817 <= local17 + 75 && super.anInt818 >= local425 - 20 && super.anInt818 <= local425 + 20) {
					this.anInt1035 = 0;
					return;
				}
			}
		} catch (@Pc(458) RuntimeException local458) {
			signlink.reporterror("778, " + -694 + ", " + local458.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method708() {
		try {
			if (this.anInt945 == 0 && this.anInt932 == 0) {
				this.aStringArray8[this.anInt822] = "Walk here";
				this.anIntArray239[this.anInt822] = 14;
				this.anIntArray237[this.anInt822] = super.anInt811;
				this.anIntArray238[this.anInt822] = super.anInt812;
				this.anInt822++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class2_Sub1_Sub3_Sub5.anInt696; local43++) {
				@Pc(49) int local49 = Class2_Sub1_Sub3_Sub5.anIntArray170[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass46_1.method547(this.anInt925, local53, local59, local49) >= 0) {
						@Pc(91) Class41 local91 = Class41.method403(local71);
						if (local91.anIntArray127 != null) {
							local91 = local91.method408();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt945 == 1) {
							this.aStringArray8[this.anInt822] = "Use " + this.aString23 + " with @cya@" + local91.aString14;
							this.anIntArray239[this.anInt822] = 741;
							this.anIntArray240[this.anInt822] = local49;
							this.anIntArray237[this.anInt822] = local53;
							this.anIntArray238[this.anInt822] = local59;
							this.anInt822++;
						} else if (this.anInt932 != 1) {
							if (local91.aStringArray7 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray7[local218] != null) {
										this.aStringArray8[this.anInt822] = local91.aStringArray7[local218] + " @cya@" + local91.aString14;
										if (local218 == 0) {
											this.anIntArray239[this.anInt822] = 321;
										}
										if (local218 == 1) {
											this.anIntArray239[this.anInt822] = 809;
										}
										if (local218 == 2) {
											this.anIntArray239[this.anInt822] = 35;
										}
										if (local218 == 3) {
											this.anIntArray239[this.anInt822] = 71;
										}
										if (local218 == 4) {
											this.anIntArray239[this.anInt822] = 1580;
										}
										this.anIntArray240[this.anInt822] = local49;
										this.anIntArray237[this.anInt822] = local53;
										this.anIntArray238[this.anInt822] = local59;
										this.anInt822++;
									}
								}
							}
							this.aStringArray8[this.anInt822] = "Examine @cya@" + local91.aString14;
							this.anIntArray239[this.anInt822] = 1891;
							this.anIntArray240[this.anInt822] = local91.anInt660 << 14;
							this.anIntArray237[this.anInt822] = local53;
							this.anIntArray238[this.anInt822] = local59;
							this.anInt822++;
						} else if ((this.anInt934 & 0x4) == 4) {
							this.aStringArray8[this.anInt822] = this.aString22 + " @cya@" + local91.aString14;
							this.anIntArray239[this.anInt822] = 186;
							this.anIntArray240[this.anInt822] = local49;
							this.anIntArray237[this.anInt822] = local53;
							this.anIntArray238[this.anInt822] = local59;
							this.anInt822++;
						}
					}
					@Pc(398) Class2_Sub1_Sub3_Sub2_Sub1 local398;
					@Pc(446) Class2_Sub1_Sub3_Sub2_Sub2 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class2_Sub1_Sub3_Sub2_Sub1 local369 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local71];
						if (local369.aClass10_1.aByte9 == 1 && (local369.anInt385 & 0x7F) == 64 && (local369.anInt386 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt891; local218++) {
								local398 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[this.anIntArray235[local218]];
								if (local398 != null && local398 != local369 && local398.aClass10_1.aByte9 == 1 && local398.anInt385 == local369.anInt385 && local398.anInt386 == local369.anInt386) {
									this.method613(this.anIntArray235[local218], local398.aClass10_1, local53, local59);
								}
							}
							for (local436 = 0; local436 < this.anInt940; local436++) {
								local446 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[this.anIntArray250[local436]];
								if (local446 != null && local446.anInt385 == local369.anInt385 && local446.anInt386 == local369.anInt386) {
									this.method603(local446, this.anIntArray250[local436], local59, local53);
								}
							}
						}
						this.method613(local71, local369.aClass10_1, local53, local59);
					}
					if (local65 == 0) {
						@Pc(488) Class2_Sub1_Sub3_Sub2_Sub2 local488 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local71];
						if ((local488.anInt385 & 0x7F) == 64 && (local488.anInt386 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt891; local218++) {
								local398 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[this.anIntArray235[local218]];
								if (local398 != null && local398.aClass10_1.aByte9 == 1 && local398.anInt385 == local488.anInt385 && local398.anInt386 == local488.anInt386) {
									this.method613(this.anIntArray235[local218], local398.aClass10_1, local53, local59);
								}
							}
							for (local436 = 0; local436 < this.anInt940; local436++) {
								local446 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[this.anIntArray250[local436]];
								if (local446 != null && local446 != local488 && local446.anInt385 == local488.anInt385 && local446.anInt386 == local488.anInt386) {
									this.method603(local446, this.anIntArray250[local436], local59, local53);
								}
							}
						}
						this.method603(local488, local71, local59, local53);
					}
					if (local65 == 3) {
						@Pc(607) Class12 local607 = this.aClass12ArrayArrayArray1[this.anInt925][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class2_Sub1_Sub3_Sub3 local614 = (Class2_Sub1_Sub3_Sub3) local607.method112(); local614 != null; local614 = (Class2_Sub1_Sub3_Sub3) local607.method114()) {
								@Pc(620) Class34 local620 = Class34.method385(local614.anInt327);
								if (this.anInt945 == 1) {
									this.aStringArray8[this.anInt822] = "Use " + this.aString23 + " with @lre@" + local620.aString13;
									this.anIntArray239[this.anInt822] = 419;
									this.anIntArray240[this.anInt822] = local614.anInt327;
									this.anIntArray237[this.anInt822] = local53;
									this.anIntArray238[this.anInt822] = local59;
									this.anInt822++;
								} else if (this.anInt932 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray6 != null && local620.aStringArray6[local737] != null) {
											this.aStringArray8[this.anInt822] = local620.aStringArray6[local737] + " @lre@" + local620.aString13;
											if (local737 == 0) {
												this.anIntArray239[this.anInt822] = 416;
											}
											if (local737 == 1) {
												this.anIntArray239[this.anInt822] = 858;
											}
											if (local737 == 2) {
												this.anIntArray239[this.anInt822] = 134;
											}
											if (local737 == 3) {
												this.anIntArray239[this.anInt822] = 852;
											}
											if (local737 == 4) {
												this.anIntArray239[this.anInt822] = 499;
											}
											this.anIntArray240[this.anInt822] = local614.anInt327;
											this.anIntArray237[this.anInt822] = local53;
											this.anIntArray238[this.anInt822] = local59;
											this.anInt822++;
										} else if (local737 == 2) {
											this.aStringArray8[this.anInt822] = "Take @lre@" + local620.aString13;
											this.anIntArray239[this.anInt822] = 134;
											this.anIntArray240[this.anInt822] = local614.anInt327;
											this.anIntArray237[this.anInt822] = local53;
											this.anIntArray238[this.anInt822] = local59;
											this.anInt822++;
										}
									}
									this.aStringArray8[this.anInt822] = "Examine @lre@" + local620.aString13;
									this.anIntArray239[this.anInt822] = 1684;
									this.anIntArray240[this.anInt822] = local614.anInt327;
									this.anIntArray237[this.anInt822] = local53;
									this.anIntArray238[this.anInt822] = local59;
									this.anInt822++;
								} else if ((this.anInt934 & 0x1) == 1) {
									this.aStringArray8[this.anInt822] = this.aString22 + " @lre@" + local620.aString13;
									this.anIntArray239[this.anInt822] = 617;
									this.anIntArray240[this.anInt822] = local614.anInt327;
									this.anIntArray237[this.anInt822] = local53;
									this.anIntArray238[this.anInt822] = local59;
									this.anInt822++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("44382, " + 45 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILclient!AIRMECOM;)V")
	private void method709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub2_Sub1 arg2) {
		try {
			@Pc(7) int local7 = this.anInt913 + this.anInt842 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg1 * arg1;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class2_Sub1_Sub3_Sub5.anIntArray171[local7];
				@Pc(27) int local27 = Class2_Sub1_Sub3_Sub5.anIntArray172[local7];
				@Pc(40) int local40 = local23 * 256 / (this.anInt984 + 256);
				@Pc(49) int local49 = local27 * 256 / (this.anInt984 + 256);
				@Pc(59) int local59 = arg1 * local40 + arg0 * local49 >> 16;
				@Pc(69) int local69 = arg1 * local49 - arg0 * local40 >> 16;
				if (local15 > 2500) {
					arg2.method48(local59 + 94 + 4 - arg2.anInt42 / 2, 83 - local69 - arg2.anInt43 / 2 - 4, this.anInt905, this.aClass2_Sub1_Sub2_Sub3_5);
				} else {
					arg2.method42(local59 + 94 + 4 - arg2.anInt42 / 2, 83 - local69 - arg2.anInt43 / 2 - 4);
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("34453, " + 116 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIIII)V")
	private void method710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			if (arg5) {
				this.aClass12ArrayArrayArray1 = null;
			}
			@Pc(6) Class2_Sub3 local6 = null;
			for (@Pc(11) Class2_Sub3 local11 = (Class2_Sub3) this.aClass12_10.method111(); local11 != null; local11 = (Class2_Sub3) this.aClass12_10.method113()) {
				if (local11.anInt606 == arg3 && local11.anInt608 == arg7 && local11.anInt609 == arg2 && local11.anInt607 == arg0) {
					local6 = local11;
					break;
				}
			}
			if (local6 == null) {
				local6 = new Class2_Sub3();
				local6.anInt606 = arg3;
				local6.anInt607 = arg0;
				local6.anInt608 = arg7;
				local6.anInt609 = arg2;
				this.method657(local6);
				this.aClass12_10.method108(local6);
			}
			local6.anInt610 = arg1;
			local6.anInt612 = arg6;
			local6.anInt611 = arg4;
			local6.anInt613 = arg9;
			local6.anInt605 = arg8;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("47976, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method711() {
		try {
			this.method681();
			if (this.anInt1043 == 1) {
				this.aClass2_Sub1_Sub2_Sub1Array4[this.anInt1042 / 100].method42(this.anInt1040 - 8 - 4, this.anInt1041 - 8 - 4);
			}
			if (this.anInt1043 == 2) {
				this.aClass2_Sub1_Sub2_Sub1Array4[this.anInt1042 / 100 + 4].method42(this.anInt1040 - 8 - 4, this.anInt1041 - 8 - 4);
				anInt980++;
				if (anInt980 > 193) {
					anInt980 = 0;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 25);
					this.aClass2_Sub1_Sub4_9.method334(0);
				}
			}
			if (this.anInt903 != -1) {
				this.method725(this.anInt909, (byte) 5, this.anInt903);
				this.method704(0, Class15.method120(this.anInt903), 0, 0);
			}
			if (this.anInt963 != -1) {
				this.method725(this.anInt909, (byte) 5, this.anInt963);
				this.method704(0, Class15.method120(this.anInt963), 0, 0);
			}
			this.method605();
			if (!this.aBoolean260) {
				this.method689();
				this.method675();
			} else if (this.anInt865 == 0) {
				this.method649();
			}
			if (this.anInt874 == 1) {
				this.aClass2_Sub1_Sub2_Sub1_16.method42(472, 296);
			}
			@Pc(190) int local190;
			if (aBoolean266) {
				@Pc(156) byte local156 = 20;
				@Pc(158) int local158 = 16776960;
				if (super.anInt806 < 30 && aBoolean264) {
					local158 = 16711680;
				}
				if (super.anInt806 < 20 && !aBoolean264) {
					local158 = 16711680;
				}
				this.aClass2_Sub1_Sub2_Sub2_3.method84("Fps:" + super.anInt806, local158, 20);
				local190 = local156 + 15;
				@Pc(192) Runtime local192 = Runtime.getRuntime();
				@Pc(201) int local201 = (int) ((local192.totalMemory() - local192.freeMemory()) / 1024L);
				if (local201 > 33554432 && aBoolean264) {
				}
				if (local201 > 67108864 && !aBoolean264) {
				}
				this.aClass2_Sub1_Sub2_Sub2_3.method84("Mem:" + local201 + "k", 16776960, 35);
				local190 += 15;
			}
			if (this.anInt852 != 0) {
				@Pc(242) int local242 = this.anInt852 / 50;
				local190 = local242 / 60;
				@Pc(250) int local250 = local242 % 60;
				if (local250 < 10) {
					this.aClass2_Sub1_Sub2_Sub2_3.method89(4, 16776960, 329, "System update in: " + local190 + ":0" + local250);
				} else {
					this.aClass2_Sub1_Sub2_Sub2_3.method89(4, 16776960, 329, "System update in: " + local190 + ":" + local250);
				}
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("20125, " + -556 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method712() {
		try {
			if (aBoolean264 && this.anInt968 == 2 && Class43.anInt697 != this.anInt925) {
				this.method634(null, "Loading - please wait.", this.aBoolean249);
				this.anInt968 = 1;
				this.aLong32 = System.currentTimeMillis();
			}
			if (this.anInt968 == 1) {
				@Pc(37) int local37 = this.method713();
				if (local37 != 0 && System.currentTimeMillis() - this.aLong32 > 360000L) {
					signlink.reporterror(this.aString29 + " glcfb " + this.aLong31 + "," + local37 + "," + aBoolean264 + "," + this.aClass47Array1[0] + "," + this.aClass9_Sub1_1.method313() + "," + this.anInt925 + "," + this.anInt1007 + "," + this.anInt1008);
					this.aLong32 = System.currentTimeMillis();
				}
			}
			if (this.anInt968 == 2 && this.anInt925 != this.anInt958) {
				this.anInt958 = this.anInt925;
				this.method617(this.anInt925);
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("39980, " + -632 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)I")
	private int method713() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray214[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray215[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray6.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray213[local41] >> 8) * 64 - this.anInt1026;
					@Pc(74) int local74 = (this.anIntArray213[local41] & 0xFF) * 64 - this.anInt1027;
					if (this.aBoolean247) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class43.method456(local62, local48, local74);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean253) {
				return -4;
			} else {
				this.anInt968 = 2;
				Class43.anInt697 = this.anInt925;
				this.method604(196);
				this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 194);
				return 0;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("42781, " + -77 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!IGMZHLWJ;)I")
	private int method714(@OriginalArg(0) int arg0, @OriginalArg(2) Class15 arg1) {
		try {
			if (arg1.anIntArrayArray6 == null || arg0 >= arg1.anIntArrayArray6.length) {
				return -2;
			}
			try {
				@Pc(27) int[] local27 = arg1.anIntArrayArray6[arg0];
				@Pc(29) int local29 = 0;
				@Pc(31) int local31 = 0;
				@Pc(33) byte local33 = 0;
				while (true) {
					@Pc(38) int local38 = local27[local31++];
					@Pc(40) int local40 = 0;
					@Pc(42) byte local42 = 0;
					if (local38 == 0) {
						return local29;
					}
					if (local38 == 1) {
						local40 = this.anIntArray225[local27[local31++]];
					}
					if (local38 == 2) {
						local40 = this.anIntArray222[local27[local31++]];
					}
					if (local38 == 3) {
						local40 = this.anIntArray246[local27[local31++]];
					}
					@Pc(88) Class15 local88;
					@Pc(93) int local93;
					@Pc(106) int local106;
					if (local38 == 4) {
						local88 = Class15.method120(local27[local31++]);
						local93 = local27[local31++];
						if (local93 >= 0 && local93 < Class34.anInt579 && (!Class34.method385(local93).aBoolean141 || aBoolean263)) {
							for (local106 = 0; local106 < local88.anIntArray50.length; local106++) {
								if (local88.anIntArray50[local106] == local93 + 1) {
									local40 += local88.anIntArray52[local106];
								}
							}
						}
					}
					if (local38 == 5) {
						local40 = this.anIntArray228[local27[local31++]];
					}
					if (local38 == 6) {
						local40 = anIntArray268[this.anIntArray222[local27[local31++]] - 1];
					}
					if (local38 == 7) {
						local40 = this.anIntArray228[local27[local31++]] * 100 / 46875;
					}
					if (local38 == 8) {
						local40 = aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt438;
					}
					@Pc(181) int local181;
					if (local38 == 9) {
						for (local181 = 0; local181 < Class4.anInt72; local181++) {
							if (Class4.aBooleanArray3[local181]) {
								local40 += this.anIntArray222[local181];
							}
						}
					}
					if (local38 == 10) {
						local88 = Class15.method120(local27[local31++]);
						local93 = local27[local31++] + 1;
						if (local93 >= 0 && local93 < Class34.anInt579 && (!Class34.method385(local93).aBoolean141 || aBoolean263)) {
							for (local106 = 0; local106 < local88.anIntArray50.length; local106++) {
								if (local88.anIntArray50[local106] == local93) {
									local40 = 999999999;
									break;
								}
							}
						}
					}
					if (local38 == 11) {
						local40 = this.anInt1036;
					}
					if (local38 == 12) {
						local40 = this.anInt878;
					}
					if (local38 == 13) {
						local181 = this.anIntArray228[local27[local31++]];
						local93 = local27[local31++];
						local40 = (local181 & 0x1 << local93) == 0 ? 0 : 1;
					}
					if (local38 == 14) {
						local181 = local27[local31++];
						@Pc(295) Class18 local295 = Class18.aClass18Array1[local181];
						local106 = local295.anInt320;
						@Pc(301) int local301 = local295.anInt321;
						@Pc(304) int local304 = local295.anInt322;
						@Pc(310) int local310 = anIntArray247[local304 - local301];
						local40 = this.anIntArray228[local106] >> local301 & local310;
					}
					if (local38 == 15) {
						local42 = 1;
					}
					if (local38 == 16) {
						local42 = 2;
					}
					if (local38 == 17) {
						local42 = 3;
					}
					if (local38 == 18) {
						local40 = (aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt385 >> 7) + this.anInt1026;
					}
					if (local38 == 19) {
						local40 = (aClass2_Sub1_Sub3_Sub2_Sub2_1.anInt386 >> 7) + this.anInt1027;
					}
					if (local38 == 20) {
						local40 = local27[local31++];
					}
					if (local42 == 0) {
						if (local33 == 0) {
							local29 += local40;
						}
						if (local33 == 1) {
							local29 -= local40;
						}
						if (local33 == 2 && local40 != 0) {
							local29 /= local40;
						}
						if (local33 == 3) {
							local29 *= local40;
						}
						local33 = 0;
					} else {
						local33 = local42;
					}
				}
			} catch (@Pc(403) Exception local403) {
				return -1;
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("66145, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OJMMOVXV;)V")
	private void method715(@OriginalArg(1) Class2_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray266.length; local9++) {
				this.anIntArray266[local9] = 0;
			}
			@Pc(34) int local34;
			for (@Pc(24) int local24 = 0; local24 < 5000; local24++) {
				local34 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray266[local34] = (int) (Math.random() * 256.0D);
			}
			@Pc(52) int local52;
			@Pc(56) int local56;
			@Pc(64) int local64;
			for (local34 = 0; local34 < 20; local34++) {
				for (local52 = 1; local52 < 255; local52++) {
					for (local56 = 1; local56 < 127; local56++) {
						local64 = local56 + (local52 << 7);
						this.anIntArray267[local64] = (this.anIntArray266[local64 - 1] + this.anIntArray266[local64 + 1] + this.anIntArray266[local64 - 128] + this.anIntArray266[local64 + 128]) / 4;
					}
				}
				@Pc(110) int[] local110 = this.anIntArray266;
				this.anIntArray266 = this.anIntArray267;
				this.anIntArray267 = local110;
			}
			if (arg0 != null) {
				local52 = 0;
				for (local56 = 0; local56 < arg0.anInt475; local56++) {
					for (local64 = 0; local64 < arg0.anInt474; local64++) {
						if (arg0.aByteArray11[local52++] != 0) {
							@Pc(146) int local146 = local64 + arg0.anInt476 + 16;
							@Pc(153) int local153 = local56 + arg0.anInt477 + 16;
							@Pc(159) int local159 = local146 + (local153 << 7);
							this.anIntArray266[local159] = 0;
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("53972, " + -639 + ", " + arg0 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!IGMZHLWJ;)Z")
	private boolean method716(@OriginalArg(1) Class15 arg0) {
		try {
			if (arg0.anIntArray53 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray53.length; local12++) {
				@Pc(20) int local20 = this.method714(local12, arg0);
				@Pc(25) int local25 = arg0.anIntArray47[local12];
				if (arg0.anIntArray53[local12] == 2) {
					if (local20 >= local25) {
						return false;
					}
				} else if (arg0.anIntArray53[local12] == 3) {
					if (local20 <= local25) {
						return false;
					}
				} else if (arg0.anIntArray53[local12] == 4) {
					if (local20 == local25) {
						return false;
					}
				} else if (local20 != local25) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("82710, " + 0 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method717(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray245[8] = 0;
			@Pc(10) int local10 = 0;
			if (arg0) {
				this.anInt976 = -1;
			}
			while (this.anIntArray245[8] == 0) {
				@Pc(19) String local19 = "Unknown problem";
				this.method588(20, "Connecting to web server", aBoolean222);
				try {
					@Pc(41) DataInputStream local41 = this.method597("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 360);
					@Pc(48) Class2_Sub1_Sub4 local48 = new Class2_Sub1_Sub4(new byte[40], -46859);
					local41.readFully(local48.aByteArray17, 0, 40);
					local41.close();
					for (@Pc(58) int local58 = 0; local58 < 9; local58++) {
						this.anIntArray245[local58] = local48.method345();
					}
					@Pc(73) int local73 = local48.method345();
					@Pc(75) int local75 = 1234;
					for (@Pc(77) int local77 = 0; local77 < 9; local77++) {
						local75 = (local75 << 1) + this.anIntArray245[local77];
					}
					if (local73 != local75) {
						local19 = "checksum problem";
						this.anIntArray245[8] = 0;
					}
				} catch (@Pc(104) EOFException local104) {
					local19 = "EOF problem";
					this.anIntArray245[8] = 0;
				} catch (@Pc(113) IOException local113) {
					local19 = "connection problem";
					this.anIntArray245[8] = 0;
				} catch (@Pc(122) Exception local122) {
					local19 = "logic problem";
					this.anIntArray245[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray245[8] == 0) {
					local10++;
					for (@Pc(140) int local140 = local3; local140 > 0; local140--) {
						if (local10 >= 10) {
							this.method588(10, "Game updated - please reload page", aBoolean222);
							local140 = 10;
						} else {
							this.method588(10, local19 + " - Will retry in " + local140 + " secs.", aBoolean222);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(174) Exception local174) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean231 = !this.aBoolean231;
				}
			}
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("69389, " + arg0 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method718() {
		try {
			this.aBoolean258 = true;
			for (@Pc(9) int local9 = 0; local9 < 7; local9++) {
				this.anIntArray236[local9] = -1;
				for (@Pc(18) int local18 = 0; local18 < Class24.anInt372; local18++) {
					if (!Class24.aClass24Array1[local18].aBoolean99 && Class24.aClass24Array1[local18].anInt373 == local9 + (this.aBoolean259 ? 0 : 7)) {
						this.anIntArray236[local9] = local18;
						break;
					}
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("79804, " + false + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method719() {
		try {
			if (super.anInt816 == 1) {
				if (super.anInt817 >= 6 && super.anInt817 <= 106 && super.anInt818 >= 467 && super.anInt818 <= 499) {
					this.anInt935 = (this.anInt935 + 1) % 4;
					this.aBoolean270 = true;
					this.aBoolean239 = true;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 19);
					this.aClass2_Sub1_Sub4_9.method330(this.anInt935);
					this.aClass2_Sub1_Sub4_9.method330(this.anInt848);
					this.aClass2_Sub1_Sub4_9.method330(this.anInt890);
				}
				if (super.anInt817 >= 135 && super.anInt817 <= 235 && super.anInt818 >= 467 && super.anInt818 <= 499) {
					this.anInt848 = (this.anInt848 + 1) % 3;
					this.aBoolean270 = true;
					this.aBoolean239 = true;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 19);
					this.aClass2_Sub1_Sub4_9.method330(this.anInt935);
					this.aClass2_Sub1_Sub4_9.method330(this.anInt848);
					this.aClass2_Sub1_Sub4_9.method330(this.anInt890);
				}
				if (super.anInt817 >= 273 && super.anInt817 <= 373 && super.anInt818 >= 467 && super.anInt818 <= 499) {
					this.anInt890 = (this.anInt890 + 1) % 3;
					this.aBoolean270 = true;
					this.aBoolean239 = true;
					this.aClass2_Sub1_Sub4_9.method329(this.anInt875, 19);
					this.aClass2_Sub1_Sub4_9.method330(this.anInt935);
					this.aClass2_Sub1_Sub4_9.method330(this.anInt848);
					this.aClass2_Sub1_Sub4_9.method330(this.anInt890);
				}
				if (super.anInt817 >= 412 && super.anInt817 <= 512 && super.anInt818 >= 467 && super.anInt818 <= 499) {
					if (this.anInt963 == -1) {
						this.method706();
						this.aString24 = "";
						this.aBoolean250 = false;
						this.anInt829 = this.anInt963 = Class15.anInt207;
						return;
					}
					this.method607("", 0, "Please close the interface you have open before using 'report abuse'", this.aByte28);
					return;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("89090, " + 0 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZZ)V")
	private void method720(@OriginalArg(1) boolean arg0) {
		try {
			this.method677();
			this.aClass32_5.method296();
			this.aClass2_Sub1_Sub2_Sub3_9.method277(0, 0);
			@Pc(51) byte local51;
			@Pc(63) int local63;
			if (this.anInt1035 == 0) {
				this.aClass2_Sub1_Sub2_Sub2_2.method86(true, 7711145, this.aClass9_Sub1_1.aString12, 180, 180);
				local51 = 80;
				this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16776960, "Welcome to RuneScape", 80, 180);
				local63 = local51 + 30;
				this.aClass2_Sub1_Sub2_Sub3_10.method277(27, 100);
				this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16777215, "New User", 125, 100);
				this.aClass2_Sub1_Sub2_Sub3_10.method277(187, 100);
				this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16777215, "Existing User", 125, 260);
			}
			if (this.anInt1035 == 2) {
				local51 = 60;
				if (this.aString25.length() > 0) {
					this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16776960, this.aString25, 45, 180);
					this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16776960, this.aString26, 60, 180);
					local63 = local51 + 30;
				} else {
					this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16776960, this.aString26, 53, 180);
					local63 = local51 + 30;
				}
				this.aClass2_Sub1_Sub2_Sub2_4.method93(90, "Username: " + this.aString29 + (this.anInt954 == 0 & anInt943 % 40 < 20 ? "@yel@|" : ""), 16777215, true, 90);
				local63 += 15;
				this.aClass2_Sub1_Sub2_Sub2_4.method93(92, "Password: " + Class7.method58(this.aString30) + (this.anInt954 == 1 & anInt943 % 40 < 20 ? "@yel@|" : ""), 16777215, true, 105);
				local63 += 15;
				if (!arg0) {
					this.aClass2_Sub1_Sub2_Sub3_10.method277(27, 130);
					this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16777215, "Login", 155, 100);
					this.aClass2_Sub1_Sub2_Sub3_10.method277(187, 130);
					this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16777215, "Cancel", 155, 260);
				}
			}
			if (this.anInt1035 == 3) {
				this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16776960, "Create a free account", 40, 180);
				local51 = 65;
				this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16777215, "To create a new account you need to", 65, 180);
				local63 = local51 + 15;
				this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16777215, "go back to the main RuneScape webpage", 80, 180);
				local63 += 15;
				this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16777215, "and choose the 'create account'", 95, 180);
				local63 += 15;
				this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16777215, "button near the top of that page.", 110, 180);
				local63 += 15;
				this.aClass2_Sub1_Sub2_Sub3_10.method277(107, 130);
				this.aClass2_Sub1_Sub2_Sub2_4.method86(true, 16777215, "Cancel", 155, 180);
			}
			this.aClass32_5.method297(202, 171, super.aGraphics2);
			if (this.aBoolean234) {
				this.aBoolean234 = false;
				this.aClass32_3.method297(128, 0, super.aGraphics2);
				this.aClass32_4.method297(202, 371, super.aGraphics2);
				this.aClass32_8.method297(0, 265, super.aGraphics2);
				this.aClass32_9.method297(562, 265, super.aGraphics2);
				this.aClass32_10.method297(128, 171, super.aGraphics2);
				this.aClass32_11.method297(562, 171, super.aGraphics2);
			}
		} catch (@Pc(496) RuntimeException local496) {
			signlink.reporterror("21765, " + false + ", " + arg0 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method721() {
		try {
			if (this.anInt992 != 0) {
				@Pc(7) int local7 = 0;
				if (this.anInt852 != 0) {
					local7 = 1;
				}
				for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
					if (this.aStringArray10[local23] != null) {
						@Pc(35) int local35 = this.anIntArray232[local23];
						@Pc(40) String local40 = this.aStringArray9[local23];
						if (local40 != null && local40.startsWith("@cr1@")) {
							local40 = local40.substring(5);
						}
						if (local40 != null && local40.startsWith("@cr2@")) {
							local40 = local40.substring(5);
						}
						if ((local35 == 3 || local35 == 7) && (local35 == 7 || this.anInt848 == 0 || this.anInt848 == 1 && this.method688(local40, (byte) 1))) {
							@Pc(93) int local93 = 329 - local7 * 13;
							if (super.anInt811 > 4 && super.anInt812 - 4 > local93 - 10 && super.anInt812 - 4 <= local93 + 3) {
								@Pc(132) int local132 = this.aClass2_Sub1_Sub2_Sub2_3.method87("From:  " + local40 + this.aStringArray10[local23]) + 25;
								if (local132 > 450) {
									local132 = 450;
								}
								if (super.anInt811 < local132 + 4) {
									if (this.anInt1034 >= 1) {
										this.aStringArray8[this.anInt822] = "Report abuse @whi@" + local40;
										this.anIntArray239[this.anInt822] = 2505;
										this.anInt822++;
									}
									this.aStringArray8[this.anInt822] = "Add ignore @whi@" + local40;
									this.anIntArray239[this.anInt822] = 2362;
									this.anInt822++;
									this.aStringArray8[this.anInt822] = "Add friend @whi@" + local40;
									this.anIntArray239[this.anInt822] = 2954;
									this.anInt822++;
								}
							}
							local7++;
							if (local7 >= 5) {
								return;
							}
						}
						if ((local35 == 5 || local35 == 6) && this.anInt848 < 2) {
							local7++;
							if (local7 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("39137, " + -577 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method722(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean264) {
				for (@Pc(10) int local10 = 0; local10 < this.anIntArray220.length; local10++) {
					@Pc(17) int local17 = this.anIntArray220[local10];
					if (Class2_Sub1_Sub2_Sub4.anIntArray191[local17] >= arg0) {
						@Pc(26) Class2_Sub1_Sub2_Sub3 local26 = Class2_Sub1_Sub2_Sub4.aClass2_Sub1_Sub2_Sub3Array1[local17];
						@Pc(34) int local34 = local26.anInt474 * local26.anInt475 - 1;
						@Pc(42) int local42 = local26.anInt474 * this.anInt909 * 2;
						@Pc(45) byte[] local45 = local26.aByteArray11;
						@Pc(48) byte[] local48 = this.aByteArray21;
						for (@Pc(50) int local50 = 0; local50 <= local34; local50++) {
							local48[local50] = local45[local50 - local42 & local34];
						}
						local26.aByteArray11 = local48;
						this.aByteArray21 = local45;
						Class2_Sub1_Sub2_Sub4.method492(local17);
					}
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("47842, " + false + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)Z")
	private boolean method723() {
		try {
			if (this.aClass28_1 == null) {
				return false;
			}
			@Pc(782) String local782;
			@Pc(352) int local352;
			try {
				@Pc(16) int local16 = this.aClass28_1.method281();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt976 == -1) {
					this.aClass28_1.method282(this.aClass2_Sub1_Sub4_8.aByteArray17, 0, 1);
					this.anInt976 = this.aClass2_Sub1_Sub4_8.aByteArray17[0] & 0xFF;
					if (this.aClass25_2 != null) {
						this.anInt976 = this.anInt976 - this.aClass25_2.method255() & 0xFF;
					}
					this.anInt975 = Class14.anIntArray46[this.anInt976];
					local16--;
				}
				if (this.anInt975 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass28_1.method282(this.aClass2_Sub1_Sub4_8.aByteArray17, 0, 1);
					this.anInt975 = this.aClass2_Sub1_Sub4_8.aByteArray17[0] & 0xFF;
					local16--;
				}
				if (this.anInt975 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass28_1.method282(this.aClass2_Sub1_Sub4_8.aByteArray17, 0, 2);
					this.aClass2_Sub1_Sub4_8.anInt556 = 0;
					this.anInt975 = this.aClass2_Sub1_Sub4_8.method342();
					local16 -= 2;
				}
				if (local16 < this.anInt975) {
					return false;
				}
				this.aClass2_Sub1_Sub4_8.anInt556 = 0;
				this.aClass28_1.method282(this.aClass2_Sub1_Sub4_8.aByteArray17, 0, this.anInt975);
				this.anInt977 = 0;
				this.anInt1011 = this.anInt1010;
				this.anInt1010 = this.anInt1009;
				this.anInt1009 = this.anInt976;
				if (this.anInt976 != 65 && this.anInt976 != 189 && this.anInt976 != 238 && this.anInt976 != 155 && this.anInt976 != 48 && this.anInt976 != 237 && this.anInt976 != 245 && this.anInt976 != 179 && this.anInt976 != 169 && this.anInt976 != 165 && this.anInt976 != 215) {
					if (this.anInt976 == 130) {
						if (this.anInt1033 != -1) {
							this.method589(this.anInt1033);
							this.anInt1033 = -1;
							this.aBoolean251 = true;
							this.aBoolean255 = true;
						}
						if (this.anInt959 != -1) {
							this.method589(this.anInt959);
							this.anInt959 = -1;
							this.aBoolean239 = true;
						}
						if (this.anInt897 != -1) {
							this.method589(this.anInt897);
							this.anInt897 = -1;
							this.aBoolean234 = true;
						}
						if (this.anInt860 != -1) {
							this.method589(this.anInt860);
							this.anInt860 = -1;
						}
						if (this.anInt963 != -1) {
							this.method589(this.anInt963);
							this.anInt963 = -1;
						}
						if (this.anInt989 != 0) {
							this.anInt989 = 0;
							this.aBoolean239 = true;
						}
						this.aBoolean237 = false;
						this.anInt976 = -1;
						return true;
					}
					@Pc(322) int local322;
					if (this.anInt976 == 255) {
						this.anInt965 = this.aClass2_Sub1_Sub4_8.method360(382);
						this.anInt964 = this.aClass2_Sub1_Sub4_8.method340();
						while (this.aClass2_Sub1_Sub4_8.anInt556 < this.anInt975) {
							local322 = this.aClass2_Sub1_Sub4_8.method340();
							this.method684(local322, this.aClass2_Sub1_Sub4_8);
						}
						this.anInt976 = -1;
						return true;
					}
					if (this.anInt976 == 173) {
						local322 = this.aClass2_Sub1_Sub4_8.method368();
						local352 = this.aClass2_Sub1_Sub4_8.method342();
						Class15.method120(local322).anInt208 = 1;
						Class15.method120(local322).anInt209 = local352;
						this.anInt976 = -1;
						return true;
					}
					if (this.anInt976 == 11) {
						local322 = this.aClass2_Sub1_Sub4_8.method366();
						local352 = this.aClass2_Sub1_Sub4_8.method342();
						Class15.method120(local352).anInt208 = 2;
						Class15.method120(local352).anInt209 = local322;
						this.anInt976 = -1;
						return true;
					}
					if (this.anInt976 != 141) {
						if (this.anInt976 == 223) {
							this.anInt961 = this.aClass2_Sub1_Sub4_8.method358();
							this.anInt942 = this.aClass2_Sub1_Sub4_8.method366();
							this.anInt976 = -1;
							return true;
						}
						@Pc(457) int local457;
						@Pc(461) int local461;
						@Pc(451) Class15 local451;
						@Pc(465) int local465;
						if (this.anInt976 == 114) {
							this.aBoolean251 = true;
							local322 = this.aClass2_Sub1_Sub4_8.method342();
							local451 = Class15.method120(local322);
							while (this.aClass2_Sub1_Sub4_8.anInt556 < this.anInt975) {
								local457 = this.aClass2_Sub1_Sub4_8.method354();
								local461 = this.aClass2_Sub1_Sub4_8.method342();
								local465 = this.aClass2_Sub1_Sub4_8.method340();
								if (local465 == 255) {
									local465 = this.aClass2_Sub1_Sub4_8.method345();
								}
								if (local457 >= 0 && local457 < local451.anIntArray50.length) {
									local451.anIntArray50[local457] = local461;
									local451.anIntArray52[local457] = local465;
								}
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 185) {
							for (local322 = 0; local322 < this.aClass2_Sub1_Sub3_Sub2_Sub2Array1.length; local322++) {
								if (this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local322] != null) {
									this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local322].anInt418 = -1;
								}
							}
							for (local352 = 0; local352 < this.aClass2_Sub1_Sub3_Sub2_Sub1Array1.length; local352++) {
								if (this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local352] != null) {
									this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local352].anInt418 = -1;
								}
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 24) {
							this.aBoolean236 = true;
							this.anInt834 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt835 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt836 = this.aClass2_Sub1_Sub4_8.method342();
							this.anInt837 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt838 = this.aClass2_Sub1_Sub4_8.method340();
							if (this.anInt838 >= 100) {
								this.anInt1020 = this.anInt834 * 128 + 64;
								this.anInt1022 = this.anInt835 * 128 + 64;
								this.anInt1021 = this.method590(this.anInt1020, this.anInt925, this.anInt1022) - this.anInt836;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 242) {
							if (this.anInt962 == 12) {
								this.aBoolean251 = true;
							}
							this.anInt878 = this.aClass2_Sub1_Sub4_8.method343();
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 137) {
							local322 = this.aClass2_Sub1_Sub4_8.method366();
							if (local322 == 65535) {
								local322 = -1;
							}
							if (local322 != this.anInt936 && this.aBoolean265 && !aBoolean264 && this.anInt840 == 0) {
								this.anInt851 = local322;
								this.aBoolean228 = true;
								this.aClass9_Sub1_1.method316(2, this.anInt851);
							}
							this.anInt936 = local322;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 208) {
							local322 = this.aClass2_Sub1_Sub4_8.method372();
							local352 = this.aClass2_Sub1_Sub4_8.method342();
							if (this.aBoolean265 && !aBoolean264) {
								this.anInt851 = local352;
								this.aBoolean228 = false;
								this.aClass9_Sub1_1.method316(2, this.anInt851);
								this.anInt840 = local322;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 204) {
							local322 = this.aClass2_Sub1_Sub4_8.method368();
							local352 = this.aClass2_Sub1_Sub4_8.method340();
							if (local322 == 65535) {
								local322 = -1;
							}
							if (this.anIntArray248[local352] != local322) {
								this.method589(this.anIntArray248[local352]);
								this.anIntArray248[local352] = local322;
							}
							this.aBoolean251 = true;
							this.aBoolean255 = true;
							this.anInt976 = -1;
							return true;
						}
						@Pc(798) boolean local798;
						@Pc(800) int local800;
						@Pc(935) String local935;
						if (this.anInt976 == 254) {
							local782 = this.aClass2_Sub1_Sub4_8.method347();
							@Pc(796) long local796;
							@Pc(793) String local793;
							if (local782.endsWith(":tradereq:")) {
								local793 = local782.substring(0, local782.indexOf(":"));
								local796 = Class7.method53(local793);
								local798 = false;
								for (local800 = 0; local800 < this.anInt882; local800++) {
									if (this.aLongArray4[local800] == local796) {
										local798 = true;
										break;
									}
								}
								if (!local798 && this.anInt949 == 0) {
									this.method607(local793, 4, "wishes to trade with you.", this.aByte28);
								}
							} else if (local782.endsWith(":duelreq:")) {
								local793 = local782.substring(0, local782.indexOf(":"));
								local796 = Class7.method53(local793);
								local798 = false;
								for (local800 = 0; local800 < this.anInt882; local800++) {
									if (this.aLongArray4[local800] == local796) {
										local798 = true;
										break;
									}
								}
								if (!local798 && this.anInt949 == 0) {
									this.method607(local793, 8, "wishes to duel with you.", this.aByte28);
								}
							} else if (local782.endsWith(":chalreq:")) {
								local793 = local782.substring(0, local782.indexOf(":"));
								local796 = Class7.method53(local793);
								local798 = false;
								for (local800 = 0; local800 < this.anInt882; local800++) {
									if (this.aLongArray4[local800] == local796) {
										local798 = true;
										break;
									}
								}
								if (!local798 && this.anInt949 == 0) {
									local935 = local782.substring(local782.indexOf(":") + 1, local782.length() - 9);
									this.method607(local793, 8, local935, this.aByte28);
								}
							} else {
								this.method607("", 0, local782, this.aByte28);
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 53) {
							this.anInt852 = this.aClass2_Sub1_Sub4_8.method367(65) * 30;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 86) {
							this.method666(this.aClass2_Sub1_Sub4_8, this.anInt975);
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 196) {
							local322 = this.aClass2_Sub1_Sub4_8.method366();
							local352 = this.aClass2_Sub1_Sub4_8.method367(65);
							local457 = this.aClass2_Sub1_Sub4_8.method367(65);
							local461 = this.aClass2_Sub1_Sub4_8.method368();
							Class15.method120(local461).anInt184 = local457;
							Class15.method120(local461).anInt185 = local352;
							Class15.method120(local461).anInt183 = local322;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 181) {
							local322 = this.aClass2_Sub1_Sub4_8.method369();
							if (local322 >= 0) {
								this.method676(local322);
							}
							if (local322 != this.anInt903) {
								this.method589(this.anInt903);
								this.anInt903 = local322;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 56) {
							local322 = this.aClass2_Sub1_Sub4_8.method342();
							local352 = this.aClass2_Sub1_Sub4_8.method340();
							local457 = this.aClass2_Sub1_Sub4_8.method342();
							if (local457 == 65535) {
								if (this.anInt957 < 50) {
									this.anIntArray224[this.anInt957] = (short) local322;
									this.anIntArray244[this.anInt957] = local352;
									this.anIntArray249[this.anInt957] = 0;
									this.anInt957++;
								}
							} else if (this.aBoolean230 && !aBoolean264 && this.anInt957 < 50) {
								this.anIntArray224[this.anInt957] = local322;
								this.anIntArray244[this.anInt957] = local352;
								this.anIntArray249[this.anInt957] = local457 + Class30.anIntArray103[local322];
								this.anInt957++;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 190) {
							this.anInt953 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 180) {
							this.aBoolean251 = true;
							local322 = this.aClass2_Sub1_Sub4_8.method360(382);
							local352 = this.aClass2_Sub1_Sub4_8.method375((byte) 2);
							local457 = this.aClass2_Sub1_Sub4_8.method360(382);
							this.anIntArray246[local322] = local352;
							this.anIntArray225[local322] = local457;
							this.anIntArray222[local322] = 1;
							for (local461 = 0; local461 < 98; local461++) {
								if (local352 >= anIntArray268[local461]) {
									this.anIntArray222[local322] = local461 + 2;
								}
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 222) {
							local322 = this.aClass2_Sub1_Sub4_8.method340();
							local352 = this.aClass2_Sub1_Sub4_8.method340();
							local457 = this.aClass2_Sub1_Sub4_8.method340();
							local461 = this.aClass2_Sub1_Sub4_8.method340();
							this.aBooleanArray12[local322] = true;
							this.anIntArray233[local322] = local352;
							this.anIntArray263[local322] = local457;
							this.anIntArray265[local322] = local461;
							this.anIntArray255[local322] = 0;
							this.anInt976 = -1;
							return true;
						}
						@Pc(1621) int local1621;
						@Pc(1642) int local1642;
						if (this.anInt976 == 16 || this.anInt976 == 101) {
							local322 = this.anInt1007;
							local352 = this.anInt1008;
							if (this.anInt976 == 16) {
								local352 = this.aClass2_Sub1_Sub4_8.method342();
								local322 = this.aClass2_Sub1_Sub4_8.method368();
								this.aBoolean247 = false;
							}
							if (this.anInt976 == 101) {
								this.aClass2_Sub1_Sub4_8.method350();
								local457 = 0;
								while (true) {
									if (local457 >= 4) {
										this.aClass2_Sub1_Sub4_8.method352();
										local322 = this.aClass2_Sub1_Sub4_8.method366();
										local352 = this.aClass2_Sub1_Sub4_8.method366();
										this.aBoolean247 = true;
										break;
									}
									for (local461 = 0; local461 < 13; local461++) {
										for (local465 = 0; local465 < 13; local465++) {
											local800 = this.aClass2_Sub1_Sub4_8.method351(1);
											if (local800 == 1) {
												this.anIntArrayArrayArray7[local457][local461][local465] = this.aClass2_Sub1_Sub4_8.method351(26);
											} else {
												this.anIntArrayArrayArray7[local457][local461][local465] = -1;
											}
										}
									}
									local457++;
								}
							}
							if (this.anInt1007 == local322 && this.anInt1008 == local352 && this.anInt968 == 2) {
								this.anInt976 = -1;
								return true;
							}
							this.anInt1007 = local322;
							this.anInt1008 = local352;
							this.anInt1026 = (this.anInt1007 - 6) * 8;
							this.anInt1027 = (this.anInt1008 - 6) * 8;
							this.aBoolean223 = false;
							if ((this.anInt1007 / 8 == 48 || this.anInt1007 / 8 == 49) && this.anInt1008 / 8 == 48) {
								this.aBoolean223 = true;
							}
							if (this.anInt1007 / 8 == 48 && this.anInt1008 / 8 == 148) {
								this.aBoolean223 = true;
							}
							this.anInt968 = 1;
							this.aLong32 = System.currentTimeMillis();
							this.method634(null, "Loading - please wait.", this.aBoolean249);
							if (this.anInt976 == 16) {
								local457 = 0;
								local461 = (this.anInt1007 - 6) / 8;
								label1239: while (true) {
									if (local461 > (this.anInt1007 + 6) / 8) {
										this.aByteArrayArray6 = new byte[local457][];
										this.aByteArrayArray5 = new byte[local457][];
										this.anIntArray213 = new int[local457];
										this.anIntArray214 = new int[local457];
										this.anIntArray215 = new int[local457];
										local457 = 0;
										local465 = (this.anInt1007 - 6) / 8;
										while (true) {
											if (local465 > (this.anInt1007 + 6) / 8) {
												break label1239;
											}
											for (local800 = (this.anInt1008 - 6) / 8; local800 <= (this.anInt1008 + 6) / 8; local800++) {
												this.anIntArray213[local457] = (local465 << 8) + local800;
												if (this.aBoolean223 && (local800 == 49 || local800 == 149 || local800 == 147 || local465 == 50 || local465 == 49 && local800 == 47)) {
													this.anIntArray214[local457] = -1;
													this.anIntArray215[local457] = -1;
													local457++;
												} else {
													local1621 = this.anIntArray214[local457] = this.aClass9_Sub1_1.method311(local465, 0, local800);
													if (local1621 != -1) {
														this.aClass9_Sub1_1.method316(3, local1621);
													}
													local1642 = this.anIntArray215[local457] = this.aClass9_Sub1_1.method311(local465, 1, local800);
													if (local1642 != -1) {
														this.aClass9_Sub1_1.method316(3, local1642);
													}
													local457++;
												}
											}
											local465++;
										}
									}
									for (local465 = (this.anInt1008 - 6) / 8; local465 <= (this.anInt1008 + 6) / 8; local465++) {
										local457++;
									}
									local461++;
								}
							}
							if (this.anInt976 == 101) {
								local457 = 0;
								@Pc(1678) int[] local1678 = new int[676];
								local465 = 0;
								label1200: while (true) {
									@Pc(1724) int local1724;
									@Pc(1708) int local1708;
									@Pc(1714) int local1714;
									if (local465 >= 4) {
										this.aByteArrayArray6 = new byte[local457][];
										this.aByteArrayArray5 = new byte[local457][];
										this.anIntArray213 = new int[local457];
										this.anIntArray214 = new int[local457];
										this.anIntArray215 = new int[local457];
										local800 = 0;
										while (true) {
											if (local800 >= local457) {
												break label1200;
											}
											local1621 = this.anIntArray213[local800] = local1678[local800];
											local1642 = local1621 >> 8 & 0xFF;
											local1708 = local1621 & 0xFF;
											local1714 = this.anIntArray214[local800] = this.aClass9_Sub1_1.method311(local1642, 0, local1708);
											if (local1714 != -1) {
												this.aClass9_Sub1_1.method316(3, local1714);
											}
											local1724 = this.anIntArray215[local800] = this.aClass9_Sub1_1.method311(local1642, 1, local1708);
											if (local1724 != -1) {
												this.aClass9_Sub1_1.method316(3, local1724);
											}
											local800++;
										}
									}
									for (local800 = 0; local800 < 13; local800++) {
										for (local1621 = 0; local1621 < 13; local1621++) {
											local1642 = this.anIntArrayArrayArray7[local465][local800][local1621];
											if (local1642 != -1) {
												local1708 = local1642 >> 14 & 0x3FF;
												local1714 = local1642 >> 3 & 0x7FF;
												local1724 = (local1708 / 8 << 8) + local1714 / 8;
												for (@Pc(1726) int local1726 = 0; local1726 < local457; local1726++) {
													if (local1678[local1726] == local1724) {
														local1724 = -1;
														break;
													}
												}
												if (local1724 != -1) {
													local1678[local457++] = local1724;
												}
											}
										}
									}
									local465++;
								}
							}
							local457 = this.anInt1026 - this.anInt1028;
							local461 = this.anInt1027 - this.anInt1029;
							this.anInt1028 = this.anInt1026;
							this.anInt1029 = this.anInt1027;
							for (local465 = 0; local465 < 16384; local465++) {
								@Pc(1879) Class2_Sub1_Sub3_Sub2_Sub1 local1879 = this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local465];
								if (local1879 != null) {
									for (local1621 = 0; local1621 < 10; local1621++) {
										local1879.anIntArray93[local1621] -= local457;
										local1879.anIntArray94[local1621] -= local461;
									}
									local1879.anInt385 -= local457 * 128;
									local1879.anInt386 -= local461 * 128;
								}
							}
							for (local800 = 0; local800 < this.anInt938; local800++) {
								@Pc(1934) Class2_Sub1_Sub3_Sub2_Sub2 local1934 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local800];
								if (local1934 != null) {
									for (local1642 = 0; local1642 < 10; local1642++) {
										local1934.anIntArray93[local1642] -= local457;
										local1934.anIntArray94[local1642] -= local461;
									}
									local1934.anInt385 -= local457 * 128;
									local1934.anInt386 -= local461 * 128;
								}
							}
							this.aBoolean253 = true;
							@Pc(1986) byte local1986 = 0;
							@Pc(1988) byte local1988 = 104;
							@Pc(1990) byte local1990 = 1;
							if (local457 < 0) {
								local1986 = 103;
								local1988 = -1;
								local1990 = -1;
							}
							@Pc(2000) byte local2000 = 0;
							@Pc(2002) byte local2002 = 104;
							@Pc(2004) byte local2004 = 1;
							if (local461 < 0) {
								local2000 = 103;
								local2002 = -1;
								local2004 = -1;
							}
							for (@Pc(2014) int local2014 = local1986; local2014 != local1988; local2014 += local1990) {
								for (@Pc(2018) int local2018 = local2000; local2018 != local2002; local2018 += local2004) {
									@Pc(2024) int local2024 = local2014 + local457;
									@Pc(2028) int local2028 = local2018 + local461;
									for (@Pc(2030) int local2030 = 0; local2030 < 4; local2030++) {
										if (local2024 >= 0 && local2028 >= 0 && local2024 < 104 && local2028 < 104) {
											this.aClass12ArrayArrayArray1[local2030][local2014][local2018] = this.aClass12ArrayArrayArray1[local2030][local2024][local2028];
										} else {
											this.aClass12ArrayArrayArray1[local2030][local2014][local2018] = null;
										}
									}
								}
							}
							for (@Pc(2092) Class2_Sub3 local2092 = (Class2_Sub3) this.aClass12_10.method111(); local2092 != null; local2092 = (Class2_Sub3) this.aClass12_10.method113()) {
								local2092.anInt608 -= local457;
								local2092.anInt609 -= local461;
								if (local2092.anInt608 < 0 || local2092.anInt609 < 0 || local2092.anInt608 >= 104 || local2092.anInt609 >= 104) {
									local2092.method507();
								}
							}
							if (this.anInt986 != 0) {
								this.anInt986 -= local457;
								this.anInt987 -= local461;
							}
							this.aBoolean236 = false;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 103) {
							local322 = this.aClass2_Sub1_Sub4_8.method368();
							local352 = this.aClass2_Sub1_Sub4_8.method366();
							this.method676(local322);
							if (local352 != -1) {
								this.method676(local352);
							}
							if (this.anInt963 != -1) {
								this.method589(this.anInt963);
								this.anInt963 = -1;
							}
							if (this.anInt1033 != -1) {
								this.method589(this.anInt1033);
								this.anInt1033 = -1;
							}
							if (this.anInt959 != -1) {
								this.method589(this.anInt959);
								this.anInt959 = -1;
							}
							if (this.anInt897 != local322) {
								this.method589(this.anInt897);
								this.anInt897 = local322;
							}
							if (this.anInt860 != local322) {
								this.method589(this.anInt860);
								this.anInt860 = local352;
							}
							this.anInt989 = 0;
							this.aBoolean237 = false;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 142) {
							local322 = this.aClass2_Sub1_Sub4_8.method366();
							this.method676(local322);
							if (this.anInt1033 != -1) {
								this.method589(this.anInt1033);
								this.anInt1033 = -1;
								this.aBoolean251 = true;
								this.aBoolean255 = true;
							}
							if (this.anInt959 != -1) {
								this.method589(this.anInt959);
								this.anInt959 = -1;
								this.aBoolean239 = true;
							}
							if (this.anInt897 != -1) {
								this.method589(this.anInt897);
								this.anInt897 = -1;
								this.aBoolean234 = true;
							}
							if (this.anInt860 != -1) {
								this.method589(this.anInt860);
								this.anInt860 = -1;
							}
							if (this.anInt963 != local322) {
								this.method589(this.anInt963);
								this.anInt963 = local322;
							}
							if (this.anInt989 != 0) {
								this.anInt989 = 0;
								this.aBoolean239 = true;
							}
							this.aBoolean237 = false;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 252) {
							local322 = this.aClass2_Sub1_Sub4_8.method371();
							if (local322 != this.anInt1047) {
								this.method589(this.anInt1047);
								this.anInt1047 = local322;
							}
							this.aBoolean239 = true;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 55) {
							this.anInt888 = this.aClass2_Sub1_Sub4_8.method342();
							this.aClass2_Sub1_Sub4_8.method340();
							this.anInt908 = this.aClass2_Sub1_Sub4_8.method376();
							this.anInt990 = this.aClass2_Sub1_Sub4_8.method342();
							this.anInt1038 = this.aClass2_Sub1_Sub4_8.method366();
							this.aClass2_Sub1_Sub4_8.method342();
							this.anInt922 = this.aClass2_Sub1_Sub4_8.method366();
							this.anInt823 = this.aClass2_Sub1_Sub4_8.method367(65);
							this.anInt893 = this.aClass2_Sub1_Sub4_8.method342();
							this.anInt861 = this.aClass2_Sub1_Sub4_8.method366();
							this.anInt998 = this.aClass2_Sub1_Sub4_8.method368();
							signlink.dnslookup(Class7.method56(this.anInt908));
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 77) {
							local322 = this.aClass2_Sub1_Sub4_8.method367(65);
							@Pc(2466) byte local2466 = this.aClass2_Sub1_Sub4_8.method341();
							this.anIntArray230[local322] = local2466;
							if (this.anIntArray228[local322] != local2466) {
								this.anIntArray228[local322] = local2466;
								this.method683(local322);
								this.aBoolean251 = true;
								if (this.anInt1047 != -1) {
									this.aBoolean239 = true;
								}
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 248) {
							this.aBoolean262 = false;
							this.anInt989 = 2;
							this.aString27 = "";
							this.aBoolean239 = true;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 160) {
							this.anInt962 = this.aClass2_Sub1_Sub4_8.method340();
							this.aBoolean251 = true;
							this.aBoolean255 = true;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 123) {
							this.method633();
							this.anInt976 = -1;
							return false;
						}
						if (this.anInt976 == 228) {
							local322 = this.aClass2_Sub1_Sub4_8.method342();
							this.method676(local322);
							if (this.anInt959 != -1) {
								this.method589(this.anInt959);
								this.anInt959 = -1;
								this.aBoolean239 = true;
							}
							if (this.anInt897 != -1) {
								this.method589(this.anInt897);
								this.anInt897 = -1;
								this.aBoolean234 = true;
							}
							if (this.anInt860 != -1) {
								this.method589(this.anInt860);
								this.anInt860 = -1;
							}
							if (this.anInt963 != -1) {
								this.method589(this.anInt963);
								this.anInt963 = -1;
							}
							if (this.anInt1033 != local322) {
								this.method589(this.anInt1033);
								this.anInt1033 = local322;
							}
							if (this.anInt989 != 0) {
								this.anInt989 = 0;
								this.aBoolean239 = true;
							}
							this.aBoolean251 = true;
							this.aBoolean255 = true;
							this.aBoolean237 = false;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 124) {
							local322 = this.aClass2_Sub1_Sub4_8.method366();
							local352 = this.aClass2_Sub1_Sub4_8.method342();
							local457 = this.aClass2_Sub1_Sub4_8.method366();
							Class15.method120(local457).anInt180 = (local322 << 16) + local352;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 133) {
							local322 = this.aClass2_Sub1_Sub4_8.method368();
							local352 = this.aClass2_Sub1_Sub4_8.method375((byte) 2);
							this.anIntArray230[local322] = local352;
							if (this.anIntArray228[local322] != local352) {
								this.anIntArray228[local322] = local352;
								this.method683(local322);
								this.aBoolean251 = true;
								if (this.anInt1047 != -1) {
									this.aBoolean239 = true;
								}
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 186) {
							if (this.anInt962 == 12) {
								this.aBoolean251 = true;
							}
							this.anInt1036 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 199) {
							this.anInt882 = this.anInt975 / 8;
							for (local322 = 0; local322 < this.anInt882; local322++) {
								this.aLongArray4[local322] = this.aClass2_Sub1_Sub4_8.method346();
							}
							this.anInt976 = -1;
							return true;
						}
						@Pc(2797) long local2797;
						if (this.anInt976 == 49) {
							local2797 = this.aClass2_Sub1_Sub4_8.method346();
							local457 = this.aClass2_Sub1_Sub4_8.method340();
							@Pc(2807) String local2807 = Class7.method57(Class7.method54(local2797));
							for (local465 = 0; local465 < this.anInt970; local465++) {
								if (local2797 == this.aLongArray3[local465]) {
									if (this.anIntArray275[local465] != local457) {
										this.anIntArray275[local465] = local457;
										this.aBoolean251 = true;
										if (local457 > 0) {
											this.method607("", 5, local2807 + " has logged in.", this.aByte28);
										}
										if (local457 == 0) {
											this.method607("", 5, local2807 + " has logged out.", this.aByte28);
										}
									}
									local2807 = null;
									break;
								}
							}
							if (local2807 != null && this.anInt970 < 200) {
								this.aLongArray3[this.anInt970] = local2797;
								this.aStringArray11[this.anInt970] = local2807;
								this.anIntArray275[this.anInt970] = local457;
								this.anInt970++;
								this.aBoolean251 = true;
							}
							@Pc(2907) boolean local2907 = false;
							while (!local2907) {
								local2907 = true;
								for (local1621 = 0; local1621 < this.anInt970 - 1; local1621++) {
									if (this.anIntArray275[local1621] != anInt1001 && this.anIntArray275[local1621 + 1] == anInt1001 || this.anIntArray275[local1621] == 0 && this.anIntArray275[local1621 + 1] != 0) {
										local1642 = this.anIntArray275[local1621];
										this.anIntArray275[local1621] = this.anIntArray275[local1621 + 1];
										this.anIntArray275[local1621 + 1] = local1642;
										@Pc(2968) String local2968 = this.aStringArray11[local1621];
										this.aStringArray11[local1621] = this.aStringArray11[local1621 + 1];
										this.aStringArray11[local1621 + 1] = local2968;
										@Pc(2990) long local2990 = this.aLongArray3[local1621];
										this.aLongArray3[local1621] = this.aLongArray3[local1621 + 1];
										this.aLongArray3[local1621 + 1] = local2990;
										this.aBoolean251 = true;
										local2907 = false;
									}
								}
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 83) {
							local322 = this.aClass2_Sub1_Sub4_8.method367(65);
							local352 = this.aClass2_Sub1_Sub4_8.method368();
							local457 = this.aClass2_Sub1_Sub4_8.method368();
							if (local322 == 65535) {
								Class15.method120(local457).anInt208 = 0;
								this.anInt976 = -1;
								return true;
							}
							@Pc(3060) Class34 local3060 = Class34.method385(local322);
							Class15.method120(local457).anInt208 = 4;
							Class15.method120(local457).anInt209 = local322;
							Class15.method120(local457).anInt184 = local3060.anInt585;
							Class15.method120(local457).anInt185 = local3060.anInt581;
							Class15.method120(local457).anInt183 = local3060.anInt577 * 100 / local352;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 73) {
							local322 = this.aClass2_Sub1_Sub4_8.method370(this.anInt839);
							local352 = this.aClass2_Sub1_Sub4_8.method342();
							local457 = this.aClass2_Sub1_Sub4_8.method369();
							@Pc(3114) Class15 local3114 = Class15.method120(local352);
							local3114.anInt176 = local322;
							local3114.anInt196 = local457;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 52) {
							this.anInt1049 = this.aClass2_Sub1_Sub4_8.method360(382);
							if (this.anInt1049 == this.anInt962) {
								if (this.anInt1049 == 3) {
									this.anInt962 = 1;
								} else {
									this.anInt962 = 3;
								}
								this.aBoolean251 = true;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 231) {
							this.anInt935 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt848 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt890 = this.aClass2_Sub1_Sub4_8.method340();
							this.aBoolean270 = true;
							this.aBoolean239 = true;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 195) {
							this.anInt844 = this.aClass2_Sub1_Sub4_8.method340();
							if (this.anInt844 == 1) {
								this.anInt921 = this.aClass2_Sub1_Sub4_8.method342();
							}
							if (this.anInt844 >= 2 && this.anInt844 <= 6) {
								if (this.anInt844 == 2) {
									this.anInt886 = 64;
									this.anInt887 = 64;
								}
								if (this.anInt844 == 3) {
									this.anInt886 = 0;
									this.anInt887 = 64;
								}
								if (this.anInt844 == 4) {
									this.anInt886 = 128;
									this.anInt887 = 64;
								}
								if (this.anInt844 == 5) {
									this.anInt886 = 64;
									this.anInt887 = 0;
								}
								if (this.anInt844 == 6) {
									this.anInt886 = 64;
									this.anInt887 = 128;
								}
								this.anInt844 = 2;
								this.anInt883 = this.aClass2_Sub1_Sub4_8.method342();
								this.anInt884 = this.aClass2_Sub1_Sub4_8.method342();
								this.anInt885 = this.aClass2_Sub1_Sub4_8.method340();
							}
							if (this.anInt844 == 10) {
								this.anInt950 = this.aClass2_Sub1_Sub4_8.method342();
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 92) {
							local322 = this.aClass2_Sub1_Sub4_8.method366();
							local451 = Class15.method120(local322);
							for (local457 = 0; local457 < local451.anIntArray50.length; local457++) {
								local451.anIntArray50[local457] = -1;
								local451.anIntArray50[local457] = 0;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 115) {
							local322 = this.aClass2_Sub1_Sub4_8.method366();
							local352 = this.aClass2_Sub1_Sub4_8.method368();
							local457 = local322 >> 10 & 0x1F;
							local461 = local322 >> 5 & 0x1F;
							local465 = local322 & 0x1F;
							Class15.method120(local352).anInt177 = (local457 << 19) + (local461 << 11) + (local465 << 3);
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 211) {
							this.aBoolean236 = true;
							this.anInt1013 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt1014 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt1015 = this.aClass2_Sub1_Sub4_8.method342();
							this.anInt1016 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt1017 = this.aClass2_Sub1_Sub4_8.method340();
							if (this.anInt1017 >= 100) {
								local322 = this.anInt1013 * 128 + 64;
								local352 = this.anInt1014 * 128 + 64;
								local457 = this.method590(local322, this.anInt925, local352) - this.anInt1015;
								local461 = local322 - this.anInt1020;
								local465 = local457 - this.anInt1021;
								local800 = local352 - this.anInt1022;
								local1621 = (int) Math.sqrt((double) (local461 * local461 + local800 * local800));
								this.anInt1023 = (int) (Math.atan2((double) local465, (double) local1621) * 325.949D) & 0x7FF;
								this.anInt1024 = (int) (Math.atan2((double) local461, (double) local800) * -325.949D) & 0x7FF;
								if (this.anInt1023 < 128) {
									this.anInt1023 = 128;
								}
								if (this.anInt1023 > 383) {
									this.anInt1023 = 383;
								}
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 139) {
							this.anInt874 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 253) {
							this.anInt971 = this.aClass2_Sub1_Sub4_8.method340();
							this.aBoolean251 = true;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 164) {
							local782 = this.aClass2_Sub1_Sub4_8.method347();
							local352 = this.aClass2_Sub1_Sub4_8.method340();
							local457 = this.aClass2_Sub1_Sub4_8.method358();
							if (local352 >= 1 && local352 <= 5) {
								if (local782.equalsIgnoreCase("null")) {
									local782 = null;
								}
								this.aStringArray13[local352 - 1] = local782;
								this.aBooleanArray11[local352 - 1] = local457 == 0;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 235) {
							this.aBoolean251 = true;
							local322 = this.aClass2_Sub1_Sub4_8.method342();
							local451 = Class15.method120(local322);
							local457 = this.aClass2_Sub1_Sub4_8.method342();
							for (local461 = 0; local461 < local457; local461++) {
								local465 = this.aClass2_Sub1_Sub4_8.method358();
								if (local465 == 255) {
									local465 = this.aClass2_Sub1_Sub4_8.method374(159);
								}
								local451.anIntArray50[local461] = this.aClass2_Sub1_Sub4_8.method342();
								local451.anIntArray52[local461] = local465;
							}
							for (local465 = local457; local465 < local451.anIntArray50.length; local465++) {
								local451.anIntArray50[local465] = 0;
								local451.anIntArray52[local465] = 0;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 75) {
							this.anInt965 = this.aClass2_Sub1_Sub4_8.method340();
							this.anInt964 = this.aClass2_Sub1_Sub4_8.method360(382);
							for (local322 = this.anInt964; local322 < this.anInt964 + 8; local322++) {
								for (local352 = this.anInt965; local352 < this.anInt965 + 8; local352++) {
									if (this.aClass12ArrayArrayArray1[this.anInt925][local322][local352] != null) {
										this.aClass12ArrayArrayArray1[this.anInt925][local322][local352] = null;
										this.method646(local322, local352);
									}
								}
							}
							for (@Pc(3741) Class2_Sub3 local3741 = (Class2_Sub3) this.aClass12_10.method111(); local3741 != null; local3741 = (Class2_Sub3) this.aClass12_10.method113()) {
								if (local3741.anInt608 >= this.anInt964 && local3741.anInt608 < this.anInt964 + 8 && local3741.anInt609 >= this.anInt965 && local3741.anInt609 < this.anInt965 + 8 && local3741.anInt606 == this.anInt925) {
									local3741.anInt605 = 0;
								}
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 224) {
							this.method594(this.anInt975, this.aClass2_Sub1_Sub4_8);
							this.aBoolean253 = false;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 221) {
							local322 = this.aClass2_Sub1_Sub4_8.method367(65);
							Class15.method120(local322).anInt208 = 3;
							if (aClass2_Sub1_Sub3_Sub2_Sub2_1.aClass10_2 == null) {
								Class15.method120(local322).anInt209 = (aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray95[0] << 25) + (aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray95[4] << 20) + (aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray96[0] << 15) + (aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray96[8] << 10) + (aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray96[11] << 5) + aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray96[1];
							} else {
								Class15.method120(local322).anInt209 = (int) (aClass2_Sub1_Sub3_Sub2_Sub2_1.aClass10_2.aLong9 + 305419896L);
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 38) {
							this.aBoolean262 = false;
							this.anInt989 = 1;
							this.aString27 = "";
							this.aBoolean239 = true;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 176) {
							for (local322 = 0; local322 < this.anIntArray228.length; local322++) {
								if (this.anIntArray228[local322] != this.anIntArray230[local322]) {
									this.anIntArray228[local322] = this.anIntArray230[local322];
									this.method683(local322);
									this.aBoolean251 = true;
								}
							}
							this.anInt976 = -1;
							return true;
						}
						@Pc(3961) Class15 local3961;
						if (this.anInt976 == 168) {
							local322 = this.aClass2_Sub1_Sub4_8.method368();
							local352 = this.aClass2_Sub1_Sub4_8.method343();
							local3961 = Class15.method120(local322);
							if (local3961.anInt189 != local352 || local352 == -1) {
								local3961.anInt189 = local352;
								local3961.anInt197 = 0;
								local3961.anInt186 = 0;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 104) {
							local782 = this.aClass2_Sub1_Sub4_8.method347();
							local352 = this.aClass2_Sub1_Sub4_8.method366();
							Class15.method120(local352).aString4 = local782;
							@Pc(4007) int local4007 = this.anIntArray248[this.anInt962];
							if (Class15.method120(local352).anInt187 == local4007) {
								this.aBoolean251 = true;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 72) {
							local322 = this.aClass2_Sub1_Sub4_8.method367(65);
							this.method676(local322);
							if (this.anInt1033 != -1) {
								this.method589(this.anInt1033);
								this.anInt1033 = -1;
								this.aBoolean251 = true;
								this.aBoolean255 = true;
							}
							if (this.anInt897 != -1) {
								this.method589(this.anInt897);
								this.anInt897 = -1;
								this.aBoolean234 = true;
							}
							if (this.anInt860 != -1) {
								this.method589(this.anInt860);
								this.anInt860 = -1;
							}
							if (this.anInt963 != -1) {
								this.method589(this.anInt963);
								this.anInt963 = -1;
							}
							if (this.anInt959 != local322) {
								this.method589(this.anInt959);
								this.anInt959 = local322;
							}
							this.aBoolean237 = false;
							this.aBoolean239 = true;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 152) {
							local322 = this.aClass2_Sub1_Sub4_8.method367(65);
							@Pc(4127) boolean local4127 = this.aClass2_Sub1_Sub4_8.method340() == 1;
							Class15.method120(local322).aBoolean60 = local4127;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 17) {
							this.anInt964 = this.aClass2_Sub1_Sub4_8.method360(382);
							this.anInt965 = this.aClass2_Sub1_Sub4_8.method360(382);
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 125) {
							local322 = this.aClass2_Sub1_Sub4_8.method366();
							local352 = this.aClass2_Sub1_Sub4_8.method367(65);
							if (this.anInt959 != -1) {
								this.method589(this.anInt959);
								this.anInt959 = -1;
								this.aBoolean239 = true;
							}
							if (this.anInt897 != -1) {
								this.method589(this.anInt897);
								this.anInt897 = -1;
								this.aBoolean234 = true;
							}
							if (this.anInt860 != -1) {
								this.method589(this.anInt860);
								this.anInt860 = -1;
							}
							if (this.anInt963 != local352) {
								this.method589(this.anInt963);
								this.anInt963 = local352;
							}
							if (this.anInt1033 != local322) {
								this.method589(this.anInt1033);
								this.anInt1033 = local322;
							}
							if (this.anInt989 != 0) {
								this.anInt989 = 0;
								this.aBoolean239 = true;
							}
							this.aBoolean251 = true;
							this.aBoolean255 = true;
							this.aBoolean237 = false;
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 226) {
							local322 = this.aClass2_Sub1_Sub4_8.method342();
							local352 = this.aClass2_Sub1_Sub4_8.method368();
							local3961 = Class15.method120(local352);
							if (local3961 != null && local3961.anInt206 == 0) {
								if (local322 < 0) {
									local322 = 0;
								}
								if (local322 > local3961.anInt173 - local3961.anInt199) {
									local322 = local3961.anInt173 - local3961.anInt199;
								}
								local3961.anInt205 = local322;
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 134) {
							local2797 = this.aClass2_Sub1_Sub4_8.method346();
							local457 = this.aClass2_Sub1_Sub4_8.method345();
							local461 = this.aClass2_Sub1_Sub4_8.method340();
							local798 = false;
							for (local800 = 0; local800 < 100; local800++) {
								if (this.anIntArray221[local800] == local457) {
									local798 = true;
									break;
								}
							}
							if (local461 <= 1) {
								for (local1621 = 0; local1621 < this.anInt882; local1621++) {
									if (this.aLongArray4[local1621] == local2797) {
										local798 = true;
										break;
									}
								}
							}
							if (!local798 && this.anInt949 == 0) {
								try {
									this.anIntArray221[this.anInt960] = local457;
									this.anInt960 = (this.anInt960 + 1) % 100;
									local935 = Class6.method50(this.aClass2_Sub1_Sub4_8, this.anInt975 - 13);
									if (local461 != 3) {
										local935 = Class17.method162(local935);
									}
									if (local461 == 2 || local461 == 3) {
										this.method607("@cr2@" + Class7.method57(Class7.method54(local2797)), 7, local935, this.aByte28);
									} else if (local461 == 1) {
										this.method607("@cr1@" + Class7.method57(Class7.method54(local2797)), 7, local935, this.aByte28);
									} else {
										this.method607(Class7.method57(Class7.method54(local2797)), 3, local935, this.aByte28);
									}
								} catch (@Pc(4461) Exception local4461) {
									signlink.reporterror("cde1");
								}
							}
							this.anInt976 = -1;
							return true;
						}
						if (this.anInt976 == 40) {
							this.anInt986 = 0;
							this.anInt976 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt976 + "," + this.anInt975 + " - " + this.anInt1010 + "," + this.anInt1011);
						this.method633();
						return true;
					}
					this.aBoolean236 = false;
					for (local322 = 0; local322 < 5; local322++) {
						this.aBooleanArray12[local322] = false;
					}
					this.anInt976 = -1;
					return true;
				}
				this.method684(this.anInt976, this.aClass2_Sub1_Sub4_8);
				this.anInt976 = -1;
				return true;
			} catch (@Pc(4510) IOException local4510) {
				this.method658();
			} catch (@Pc(4515) Exception local4515) {
				local782 = "T2 - " + this.anInt976 + "," + this.anInt1010 + "," + this.anInt1011 + " - " + this.anInt975 + "," + (this.anInt1026 + aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray93[0]) + "," + (this.anInt1027 + aClass2_Sub1_Sub3_Sub2_Sub2_1.anIntArray94[0]) + " - ";
				for (local352 = 0; local352 < this.anInt975 && local352 < 50; local352++) {
					local782 = local782 + this.aClass2_Sub1_Sub4_8.aByteArray17[local352] + ",";
				}
				signlink.reporterror(local782);
				this.method633();
			}
			return true;
		} catch (@Pc(4596) RuntimeException local4596) {
			signlink.reporterror("13564, " + -341 + ", " + local4596.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RSWRPCHR;ZI)V")
	private void method724(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method350();
			@Pc(7) int local7 = arg0.method351(1);
			if (local7 != 0) {
				@Pc(18) int local18 = arg0.method351(2);
				if (local18 == 0) {
					this.anIntArray251[this.anInt941++] = this.anInt939;
				} else {
					@Pc(41) int local41;
					@Pc(51) int local51;
					if (local18 == 1) {
						local41 = arg0.method351(3);
						aClass2_Sub1_Sub3_Sub2_Sub2_1.method250(false, local41);
						local51 = arg0.method351(1);
						if (local51 == 1) {
							this.anIntArray251[this.anInt941++] = this.anInt939;
						}
					} else {
						@Pc(95) int local95;
						if (local18 == 2) {
							local41 = arg0.method351(3);
							aClass2_Sub1_Sub3_Sub2_Sub2_1.method250(true, local41);
							local51 = arg0.method351(3);
							aClass2_Sub1_Sub3_Sub2_Sub2_1.method250(true, local51);
							local95 = arg0.method351(1);
							if (local95 == 1) {
								this.anIntArray251[this.anInt941++] = this.anInt939;
							}
						} else if (local18 == 3) {
							local41 = arg0.method351(7);
							this.anInt925 = arg0.method351(2);
							local51 = arg0.method351(1);
							local95 = arg0.method351(1);
							if (local95 == 1) {
								this.anIntArray251[this.anInt941++] = this.anInt939;
							}
							@Pc(155) int local155 = arg0.method351(7);
							aClass2_Sub1_Sub3_Sub2_Sub2_1.method251(local51 == 1, local41, local155);
						}
					}
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("34744, " + arg0 + ", " + true + ", " + arg1 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
	private boolean method725(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class15 local6 = Class15.method120(arg2);
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray54.length && local6.anIntArray54[local8] != -1; local8++) {
				@Pc(22) Class15 local22 = Class15.method120(local6.anIntArray54[local8]);
				if (local22.anInt206 == 0) {
					local3 |= this.method725(arg0, (byte) 5, local22.anInt200);
				}
				@Pc(56) int local56;
				if (local22.anInt206 == 6 && (local22.anInt189 != -1 || local22.anInt190 != -1)) {
					@Pc(51) boolean local51 = this.method716(local22);
					if (local51) {
						local56 = local22.anInt190;
					} else {
						local56 = local22.anInt189;
					}
					if (local56 != -1) {
						@Pc(68) Class23 local68 = Class23.aClass23Array1[local56];
						local22.anInt186 += arg0;
						while (local22.anInt186 > local68.method235(local22.anInt197, this.anInt916)) {
							local22.anInt186 -= local68.method235(local22.anInt197, this.anInt916) + 1;
							local22.anInt197++;
							if (local22.anInt197 >= local68.anInt358) {
								local22.anInt197 -= local68.anInt359;
								if (local22.anInt197 < 0 || local22.anInt197 >= local68.anInt358) {
									local22.anInt197 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local22.anInt206 == 6 && local22.anInt180 != 0) {
					@Pc(141) int local141 = local22.anInt180 >> 16;
					local56 = local22.anInt180 << 16 >> 16;
					@Pc(152) int local152 = local141 * arg0;
					local56 *= arg0;
					local22.anInt184 = local22.anInt184 + local152 & 0x7FF;
					local22.anInt185 = local22.anInt185 + local56 & 0x7FF;
					local3 = true;
				}
			}
			@Pc(185) boolean local185 = false;
			return local3;
		} catch (@Pc(198) RuntimeException local198) {
			signlink.reporterror("65631, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local198.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method726(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method727(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString25 = "";
				this.aString26 = "Connecting to server...";
				this.method720(true);
			}
			this.aClass28_1 = new Class28(this, 0, this.method673(anInt1002 + 43594));
			@Pc(30) long local30 = Class7.method53(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass2_Sub1_Sub4_9.anInt556 = 0;
			this.aClass2_Sub1_Sub4_9.method330(14);
			this.aClass2_Sub1_Sub4_9.method330(local37);
			this.aClass28_1.method283(2, this.aClass2_Sub1_Sub4_9.aByteArray17, this.anInt924);
			for (@Pc(61) int local61 = 0; local61 < 8; local61++) {
				this.aClass28_1.method280();
			}
			@Pc(75) int local75 = this.aClass28_1.method280();
			@Pc(77) int local77 = local75;
			@Pc(226) int local226;
			@Pc(260) int local260;
			if (local75 == 0) {
				this.aClass28_1.method282(this.aClass2_Sub1_Sub4_8.aByteArray17, 0, 8);
				this.aClass2_Sub1_Sub4_8.anInt556 = 0;
				this.aLong31 = this.aClass2_Sub1_Sub4_8.method346();
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong31 >> 32), (int) this.aLong31 };
				this.aClass2_Sub1_Sub4_9.anInt556 = 0;
				this.aClass2_Sub1_Sub4_9.method330(10);
				this.aClass2_Sub1_Sub4_9.method334(local100[0]);
				this.aClass2_Sub1_Sub4_9.method334(local100[1]);
				this.aClass2_Sub1_Sub4_9.method334(local100[2]);
				this.aClass2_Sub1_Sub4_9.method334(local100[3]);
				this.aClass2_Sub1_Sub4_9.method334(signlink.anInt1051);
				this.aClass2_Sub1_Sub4_9.method337(arg0);
				this.aClass2_Sub1_Sub4_9.method337(arg1);
				this.aClass2_Sub1_Sub4_9.method355(aBigInteger2, aBigInteger1);
				this.aClass2_Sub1_Sub4_7.anInt556 = 0;
				if (arg2) {
					this.aClass2_Sub1_Sub4_7.method330(18);
				} else {
					this.aClass2_Sub1_Sub4_7.method330(16);
				}
				this.aClass2_Sub1_Sub4_7.method330(this.aClass2_Sub1_Sub4_9.anInt556 + 36 + 1 + 1 + 2);
				this.aClass2_Sub1_Sub4_7.method330(255);
				this.aClass2_Sub1_Sub4_7.method331(360);
				this.aClass2_Sub1_Sub4_7.method330(aBoolean264 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass2_Sub1_Sub4_7.method334(this.anIntArray245[local226]);
				}
				this.aClass2_Sub1_Sub4_7.method338(this.aClass2_Sub1_Sub4_9.anInt556, this.aClass2_Sub1_Sub4_9.aByteArray17);
				this.aClass2_Sub1_Sub4_9.aClass25_1 = new Class25(local100, false);
				for (local260 = 0; local260 < 4; local260++) {
					local100[local260] += 50;
				}
				this.aClass25_2 = new Class25(local100, false);
				this.aClass28_1.method283(this.aClass2_Sub1_Sub4_7.anInt556, this.aClass2_Sub1_Sub4_7.aByteArray17, this.anInt924);
				local75 = this.aClass28_1.method280();
			}
			if (local75 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(303) Exception local303) {
				}
				this.method727(arg0, arg1, arg2);
			} else {
				@Pc(391) int local391;
				if (local75 == 2) {
					this.anInt1034 = this.aClass28_1.method280();
					aBoolean248 = this.aClass28_1.method280() == 1;
					this.aLong29 = 0L;
					this.anInt1006 = 0;
					this.aClass26_1.anInt447 = 0;
					super.aBoolean221 = true;
					this.aBoolean232 = true;
					this.aBoolean238 = true;
					this.aClass2_Sub1_Sub4_9.anInt556 = 0;
					this.aClass2_Sub1_Sub4_8.anInt556 = 0;
					this.anInt976 = -1;
					this.anInt1009 = -1;
					this.anInt1010 = -1;
					this.anInt1011 = -1;
					this.anInt975 = 0;
					this.anInt977 = 0;
					this.anInt852 = 0;
					this.anInt979 = 0;
					this.anInt844 = 0;
					this.anInt822 = 0;
					this.aBoolean260 = false;
					super.anInt809 = 0;
					for (local391 = 0; local391 < 100; local391++) {
						this.aStringArray10[local391] = null;
					}
					this.anInt945 = 0;
					this.anInt932 = 0;
					this.anInt968 = 0;
					this.anInt957 = 0;
					this.anInt1045 = (int) (Math.random() * 100.0D) - 50;
					this.anInt955 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1018 = (int) (Math.random() * 80.0D) - 40;
					this.anInt842 = (int) (Math.random() * 120.0D) - 60;
					this.anInt984 = (int) (Math.random() * 30.0D) - 20;
					this.anInt913 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt953 = 0;
					this.anInt958 = -1;
					this.anInt986 = 0;
					this.anInt987 = 0;
					this.anInt940 = 0;
					this.anInt891 = 0;
					for (local226 = 0; local226 < this.anInt938; local226++) {
						this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local226] = null;
						this.aClass2_Sub1_Sub4Array1[local226] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local260] = null;
					}
					aClass2_Sub1_Sub3_Sub2_Sub2_1 = this.aClass2_Sub1_Sub3_Sub2_Sub2Array1[this.anInt939] = new Class2_Sub1_Sub3_Sub2_Sub2();
					this.aClass12_11.method115();
					this.aClass12_12.method115();
					@Pc(536) int local536;
					@Pc(540) int local540;
					for (@Pc(532) int local532 = 0; local532 < 4; local532++) {
						for (local536 = 0; local536 < 104; local536++) {
							for (local540 = 0; local540 < 104; local540++) {
								this.aClass12ArrayArrayArray1[local532][local536][local540] = null;
							}
						}
					}
					this.aClass12_10 = new Class12(false);
					this.anInt971 = 0;
					this.anInt970 = 0;
					this.method589(this.anInt1047);
					this.anInt1047 = -1;
					this.method589(this.anInt959);
					this.anInt959 = -1;
					this.method589(this.anInt963);
					this.anInt963 = -1;
					this.method589(this.anInt897);
					this.anInt897 = -1;
					this.method589(this.anInt860);
					this.anInt860 = -1;
					this.method589(this.anInt1033);
					this.anInt1033 = -1;
					this.method589(this.anInt903);
					this.anInt903 = -1;
					this.aBoolean237 = false;
					this.anInt962 = 3;
					this.anInt989 = 0;
					this.aBoolean260 = false;
					this.aBoolean262 = false;
					this.aString17 = null;
					this.anInt874 = 0;
					this.anInt1049 = -1;
					this.aBoolean259 = true;
					this.method718();
					for (local536 = 0; local536 < 5; local536++) {
						this.anIntArray212[local536] = 0;
					}
					for (local540 = 0; local540 < 5; local540++) {
						this.aStringArray13[local540] = null;
						this.aBooleanArray11[local540] = false;
					}
					anInt904 = 0;
					anInt850 = 0;
					anInt828 = 0;
					anInt917 = 0;
					anInt991 = 0;
					anInt824 = 0;
					this.method693();
				} else if (local75 == 3) {
					this.aString25 = "";
					this.aString26 = "Invalid username or password.";
				} else if (local75 == 4) {
					this.aString25 = "Your account has been disabled.";
					this.aString26 = "Please check your message-centre for details.";
				} else if (local75 == 5) {
					this.aString25 = "Your account is already logged in.";
					this.aString26 = "Try again in 60 secs...";
				} else if (local75 == 6) {
					this.aString25 = "RuneScape has been updated!";
					this.aString26 = "Please reload this page.";
				} else if (local75 == 7) {
					this.aString25 = "This world is full.";
					this.aString26 = "Please use a different world.";
				} else if (local75 == 8) {
					this.aString25 = "Unable to connect.";
					this.aString26 = "Login server offline.";
				} else if (local75 == 9) {
					this.aString25 = "Login limit exceeded.";
					this.aString26 = "Too many connections from your address.";
				} else if (local75 == 10) {
					this.aString25 = "Unable to connect.";
					this.aString26 = "Bad session id.";
				} else if (local75 == 11) {
					this.aString25 = "Login server rejected session.";
					this.aString26 = "Please try again.";
				} else if (local75 == 12) {
					this.aString25 = "You need a members account to login to this world.";
					this.aString26 = "Please subscribe, or use a different world.";
				} else if (local75 == 13) {
					this.aString25 = "Could not complete login.";
					this.aString26 = "Please try using a different world.";
				} else if (local75 == 14) {
					this.aString25 = "The server is being updated.";
					this.aString26 = "Please wait 1 minute and try again.";
				} else if (local75 == 15) {
					this.aBoolean238 = true;
					this.aClass2_Sub1_Sub4_9.anInt556 = 0;
					this.aClass2_Sub1_Sub4_8.anInt556 = 0;
					this.anInt976 = -1;
					this.anInt1009 = -1;
					this.anInt1010 = -1;
					this.anInt1011 = -1;
					this.anInt975 = 0;
					this.anInt977 = 0;
					this.anInt852 = 0;
					this.anInt822 = 0;
					this.aBoolean260 = false;
					this.aLong32 = System.currentTimeMillis();
				} else if (local75 == 16) {
					this.aString25 = "Login attempts exceeded.";
					this.aString26 = "Please wait 1 minute and try again.";
				} else if (local75 == 17) {
					this.aString25 = "You are standing in a members-only area.";
					this.aString26 = "To play on this world move to a free area first";
				} else if (local75 == 20) {
					this.aString25 = "Invalid loginserver requested";
					this.aString26 = "Please try using a different world.";
				} else if (local75 == 21) {
					local391 = this.aClass28_1.method280();
					for (@Pc(919) int local919 = local391 + 3; local919 >= 0; local919--) {
						this.aString25 = "You have only just left another world";
						this.aString26 = "Your profile will be transferred in: " + local919;
						this.method720(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(941) Exception local941) {
						}
					}
					this.method727(arg0, arg1, arg2);
				} else if (local75 == 22) {
					this.aString25 = "Malformed login packet.";
					this.aString26 = "Please try again.";
				} else if (local75 == 23) {
					this.aString25 = "This computers address has been blocked";
					this.aString26 = "as it was used to break our rules";
				} else if (local75 != -1) {
					System.out.println("response:" + local75);
					this.aString25 = "Unexpected server response";
					this.aString26 = "Please try using a different world.";
				} else if (local77 != 0) {
					this.aString25 = "No response from server";
					this.aString26 = "Please try using a different world.";
				} else if (this.anInt864 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(983) Exception local983) {
					}
					this.anInt864++;
					this.method727(arg0, arg1, arg2);
				} else {
					this.aString25 = "No response from loginserver";
					this.aString26 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1026) IOException local1026) {
			this.aString25 = "";
			this.aString26 = "Error connecting to server.";
		}
	}
}
