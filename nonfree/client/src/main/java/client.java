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
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private static int anInt850;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	public static int anInt878;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
	private static boolean aBoolean197;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private static int anInt879;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private static int anInt894;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private static int anInt896;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private static int anInt904;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private static int anInt909;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private static int anInt910;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
	private static boolean aBoolean206;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Z")
	private static boolean aBoolean213;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private static int anInt965;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private static int anInt980;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private static int anInt996;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private static int anInt998;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private static int anInt1007;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private static int anInt1013;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private static int anInt1017;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Z")
	private static boolean aBoolean226;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private static int anInt1045;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!PASMQFXV;")
	public static Class8_Sub1_Sub2_Sub4_Sub1 aClass8_Sub1_Sub2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private static int anInt1048;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private static int anInt1051;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Z")
	private static boolean aBoolean232;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private static int anInt1060;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private static int anInt877 = 10;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
	private static boolean aBoolean196 = true;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Ljava/lang/String;")
	private static String aString21 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "B")
	private static byte aByte40 = 64;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
	public static final int[] anIntArray222 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private static int[] anIntArray227 = new int[99];

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[[I")
	public static final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private static int anInt1019;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private static int anInt1035;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "[I")
	public static int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_3;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_4;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_5;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!LNOSHUMO;")
	private Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!BPJMPIUS;")
	private Class5 aClass5_2;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!QLFNWQSF;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Ljava/lang/String;")
	private String aString19;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_10;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_6;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_7;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_8;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_9;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_6;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_7;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_8;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_11;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_12;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!LJVKCVYD;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Lclient!DBRMEPJQ;")
	private Class8_Sub1_Sub1_Sub2 aClass8_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!DBRMEPJQ;")
	private Class8_Sub1_Sub1_Sub2 aClass8_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!DBRMEPJQ;")
	private Class8_Sub1_Sub1_Sub2 aClass8_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Lclient!DBRMEPJQ;")
	private Class8_Sub1_Sub1_Sub2 aClass8_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Lclient!XRWUKRPO;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_10;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_11;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_12;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_13;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_14;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_15;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_16;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_17;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_18;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!WTODRXXL;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4[] aClass8_Sub1_Sub1_Sub4Array5;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_19;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_20;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_21;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_22;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_23;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_24;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_25;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_26;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!NUXCAHZM;")
	private Class29 aClass29_27;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_9;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_10;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_11;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_12;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_13;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_14;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_15;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_16;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_17;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_18;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_14;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_15;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_16;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_19;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4 aClass8_Sub1_Sub1_Sub4_20;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
	private int[] anIntArray212 = new int[5];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Z")
	private volatile boolean aBoolean192 = false;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt857 = 348;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray213 = new int[50];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "B")
	private byte aByte38 = 21;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt863 = 2;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt864 = -1;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	private int[] anIntArray214 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!GLMIQHJI;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_6 = Class8_Sub1_Sub3.method153();

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!VLLJSJTJ;")
	private Class37 aClass37_10 = new Class37((byte) 3);

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt870 = -1;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt871 = -558;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
	private int[] anIntArray215 = new int[151];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt884 = 3;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "B")
	private byte aByte39 = 4;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt890 = -16642;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4[] aClass8_Sub1_Sub1_Sub4Array2 = new Class8_Sub1_Sub1_Sub4[13];

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt891 = -1;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!GLMIQHJI;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_7 = Class8_Sub1_Sub3.method153();

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[I")
	private int[] anIntArray218 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt893 = 19571;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Z")
	private boolean aBoolean202 = true;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt903 = -1;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Z")
	private volatile boolean aBoolean203 = false;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt907 = -1;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt908 = -1;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt911 = 128;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private final int anInt915 = 100;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
	private int[] anIntArray221 = new int[100];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt917 = 2;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray223 = new int[1000];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray224 = new int[1000];

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray225 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Z")
	private volatile boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Lclient!GLMIQHJI;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_8 = Class8_Sub1_Sub3.method153();

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray226 = new int[200];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt935 = 1;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!VLLJSJTJ;")
	private Class37 aClass37_11 = new Class37((byte) 3);

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
	private int[] anIntArray228 = new int[Class46.anInt800];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "[Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3[] aClass8_Sub1_Sub1_Sub3Array4 = new Class8_Sub1_Sub1_Sub3[100];

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "[I")
	private int[] anIntArray229 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[I")
	private int[] anIntArray230 = new int[151];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt942 = 7759444;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
	private int[] anIntArray231 = new int[33];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt948 = 5063219;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt951 = -73;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt952 = 926;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3[] aClass8_Sub1_Sub1_Sub3Array5 = new Class8_Sub1_Sub1_Sub3[20];

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "B")
	private byte aByte41 = 2;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt959 = 2048;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt960 = 2047;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[Lclient!PASMQFXV;")
	private Class8_Sub1_Sub2_Sub4_Sub1[] aClass8_Sub1_Sub2_Sub4_Sub1Array1 = new Class8_Sub1_Sub2_Sub4_Sub1[this.anInt959];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[I")
	private int[] anIntArray232 = new int[this.anInt959];

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private int[] anIntArray233 = new int[this.anInt959];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[Lclient!GLMIQHJI;")
	private Class8_Sub1_Sub3[] aClass8_Sub1_Sub3Array1 = new Class8_Sub1_Sub3[this.anInt959];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[I")
	private int[] anIntArray234 = new int[Class46.anInt800];

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
	private int[] anIntArray235 = new int[33];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Lclient!VLLJSJTJ;")
	private Class37 aClass37_12 = new Class37((byte) 3);

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt964 = 78;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "B")
	private byte aByte42 = 6;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "[I")
	private int[] anIntArray236 = new int[5];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt975 = -1;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt976 = -1;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt977 = -1;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "B")
	private byte aByte43 = -86;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[I")
	private int[] anIntArray237 = new int[256];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt982 = 32009;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!GLMIQHJI;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_9 = new Class8_Sub1_Sub3(new byte[5000], -49015);

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[Lclient!QDXHSLSL;")
	private Class8_Sub1_Sub2_Sub4_Sub2[] aClass8_Sub1_Sub2_Sub4_Sub2Array1 = new Class8_Sub1_Sub2_Sub4_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "[I")
	private int[] anIntArray238 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4[] aClass8_Sub1_Sub1_Sub4Array3 = new Class8_Sub1_Sub1_Sub4[100];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "B")
	private byte aByte44 = 3;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt985 = -1;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[Lclient!EMCOJCFH;")
	private Class11[] aClass11Array1 = new Class11[4];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
	public boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[Lclient!VUMXQDFQ;")
	private Class8_Sub1_Sub1_Sub4[] aClass8_Sub1_Sub1_Sub4Array4 = new Class8_Sub1_Sub1_Sub4[2];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[I")
	private int[] anIntArray239 = new int[2000];

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt989 = 1;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private int[] anIntArray240 = new int[500];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray241 = new int[500];

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private int[] anIntArray242 = new int[500];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray243 = new int[500];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt990 = 504;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "B")
	private byte aByte45 = 6;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "B")
	private byte aByte46 = -50;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[I")
	private int[] anIntArray244 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
	private int[] anIntArray245 = new int[9];

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[I")
	public int[] anIntArray246 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt999 = -47865;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt1000 = -1;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt1008 = 5;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "B")
	private byte aByte47 = 68;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[I")
	private int[] anIntArray247 = new int[5];

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt1012 = 2;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray248 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt1018 = 3353893;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "B")
	private byte aByte48 = -13;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3[] aClass8_Sub1_Sub1_Sub3Array6 = new Class8_Sub1_Sub1_Sub3[20];

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1023 = -1;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[[[Lclient!VLLJSJTJ;")
	private Class37[][][] aClass37ArrayArrayArray1 = new Class37[4][104][104];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1033 = 2;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt1034 = 1;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "B")
	private byte aByte49 = 39;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "[I")
	private final int[] anIntArray250 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1043 = -1;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	private int[] anIntArray254 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1046 = 2;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1047 = 7;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[Lclient!VSBCWAVP;")
	public Class39[] aClass39Array1 = new Class39[5];

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[I")
	private int[] anIntArray255 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private int[] anIntArray256 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
	private int[] anIntArray257 = new int[50];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1057 = 2301979;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
	private int[] anIntArray258 = new int[Class46.anInt800];

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1058 = -1;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "B")
	private byte aByte50 = 116;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1061 = 68;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Lclient!USEDZXXV;")
	private Class36 aClass36_1 = new Class36();

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3[] aClass8_Sub1_Sub1_Sub3Array7 = new Class8_Sub1_Sub1_Sub3[1000];

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[Lclient!INVDQNJU;")
	private Class8_Sub1_Sub1_Sub3[] aClass8_Sub1_Sub1_Sub3Array8 = new Class8_Sub1_Sub1_Sub3[8];

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1064 = 9;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1066 = 50;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
	private int[] anIntArray262 = new int[this.anInt1066];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[I")
	private int[] anIntArray263 = new int[this.anInt1066];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private int[] anIntArray264 = new int[this.anInt1066];

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
	private int[] anIntArray265 = new int[this.anInt1066];

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
	private int[] anIntArray266 = new int[this.anInt1066];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
	private int[] anIntArray267 = new int[this.anInt1066];

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
	private int[] anIntArray268 = new int[this.anInt1066];

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[this.anInt1066];

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[500];

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[I")
	private int[] anIntArray269 = new int[7];

	static {
		@Pc(89) int local89 = 0;
		@Pc(91) int local91;
		for (local91 = 0; local91 < 99; local91++) {
			@Pc(96) int local96 = local91 + 1;
			@Pc(109) int local109 = (int) ((double) local96 + Math.pow(2.0D, (double) local96 / 7.0D) * 300.0D);
			local89 += local109;
			anIntArray227[local91] = local89 / 4;
		}
		anIntArrayArray25 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt1019 = 990;
		anInt1035 = -920;
		anIntArray249 = new int[32];
		local89 = 2;
		for (local91 = 0; local91 < 32; local91++) {
			anIntArray249[local91] = local89 - 1;
			local89 += local89;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private static void method590() {
		try {
			Class32.aBoolean130 = false;
			Class8_Sub1_Sub1_Sub1.aBoolean29 = false;
			aBoolean197 = false;
			Class43.aBoolean175 = false;
			Class33.aBoolean138 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("21193, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private static String method623(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("79667, " + arg0 + ", " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private static void method637() {
		try {
			Class32.aBoolean130 = true;
			Class8_Sub1_Sub1_Sub1.aBoolean29 = true;
			aBoolean197 = true;
			Class43.aBoolean175 = true;
			Class33.aBoolean138 = true;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("21908, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
	private static String method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7;
			if (arg0 < 2 || arg0 > 2) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			local7 = arg2 - arg1;
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
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("53822, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			@Pc(8) boolean local8 = false;
			for (@Pc(13) int local13 = local4.length() - 3; local13 > 0; local13 -= 3) {
				local4 = local4.substring(0, local13) + "," + local4.substring(local13);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("2569, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 308);
			if (arg0.length == 5) {
				anInt877 = Integer.parseInt(arg0[0]);
				anInt878 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method637();
				} else if (arg0[2].equals("highmem")) {
					method590();
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
				signlink.anInt1070 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method567(anInt1035);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt877 = Integer.parseInt(this.getParameter("nodeid"));
		anInt878 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method637();
		} else {
			method590();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean196 = false;
		} else {
			aBoolean196 = true;
		}
		this.method568(aByte40);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method580() {
		try {
			@Pc(6) int local6 = this.anInt1024 * 128 + 64;
			@Pc(13) int local13 = this.anInt1025 * 128 + 64;
			@Pc(24) int local24 = this.method667(local13, this.anInt1042, local6) - this.anInt1026;
			if (this.anInt872 < local6) {
				this.anInt872 += this.anInt1027 + (local6 - this.anInt872) * this.anInt1028 / 1000;
				if (this.anInt872 > local6) {
					this.anInt872 = local6;
				}
			}
			if (this.anInt872 > local6) {
				this.anInt872 -= this.anInt1027 + (this.anInt872 - local6) * this.anInt1028 / 1000;
				if (this.anInt872 < local6) {
					this.anInt872 = local6;
				}
			}
			if (this.anInt873 < local24) {
				this.anInt873 += this.anInt1027 + (local24 - this.anInt873) * this.anInt1028 / 1000;
				if (this.anInt873 > local24) {
					this.anInt873 = local24;
				}
			}
			if (this.anInt873 > local24) {
				this.anInt873 -= this.anInt1027 + (this.anInt873 - local24) * this.anInt1028 / 1000;
				if (this.anInt873 < local24) {
					this.anInt873 = local24;
				}
			}
			if (this.anInt874 < local13) {
				this.anInt874 += this.anInt1027 + (local13 - this.anInt874) * this.anInt1028 / 1000;
				if (this.anInt874 > local13) {
					this.anInt874 = local13;
				}
			}
			if (this.anInt874 > local13) {
				this.anInt874 -= this.anInt1027 + (this.anInt874 - local13) * this.anInt1028 / 1000;
				if (this.anInt874 < local13) {
					this.anInt874 = local13;
				}
			}
			local6 = this.anInt1037 * 128 + 64;
			local13 = this.anInt1038 * 128 + 64;
			local24 = this.method667(local13, this.anInt1042, local6) - this.anInt1039;
			@Pc(222) int local222 = local6 - this.anInt872;
			@Pc(227) int local227 = local24 - this.anInt873;
			@Pc(232) int local232 = local13 - this.anInt874;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(270) int local270 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt875 < local254) {
				this.anInt875 += this.anInt1040 + (local254 - this.anInt875) * this.anInt1041 / 1000;
				if (this.anInt875 > local254) {
					this.anInt875 = local254;
				}
			}
			if (this.anInt875 > local254) {
				this.anInt875 -= this.anInt1040 + (this.anInt875 - local254) * this.anInt1041 / 1000;
				if (this.anInt875 < local254) {
					this.anInt875 = local254;
				}
			}
			@Pc(341) int local341 = local270 - this.anInt876;
			if (local341 > 1024) {
				local341 -= 2048;
			}
			if (local341 < -1024) {
				local341 += 2048;
			}
			if (local341 > 0) {
				this.anInt876 += this.anInt1040 + local341 * this.anInt1041 / 1000;
				this.anInt876 &= 0x7FF;
			}
			if (local341 < 0) {
				this.anInt876 -= this.anInt1040 + -local341 * this.anInt1041 / 1000;
				this.anInt876 &= 0x7FF;
			}
			@Pc(399) int local399 = local270 - this.anInt876;
			if (local399 > 1024) {
				local399 -= 2048;
			}
			if (local399 < -1024) {
				local399 += 2048;
			}
			if (local399 < 0 && local341 > 0 || local399 > 0 && local341 < 0) {
				this.anInt876 = local270;
			}
		} catch (@Pc(420) RuntimeException local420) {
			signlink.reporterror("30260, " + false + ", " + local420.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method581(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt852 >= 100 && this.anInt1059 != 1) {
					this.method703("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else if (this.anInt852 >= 200) {
					this.method703("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else {
					@Pc(48) String local48 = Class48.method563(Class48.method560(arg0));
					for (@Pc(50) int local50 = 0; local50 < this.anInt852; local50++) {
						if (this.aLongArray4[local50] == arg0) {
							this.method703(local48 + " is already on your friend list", "", 0);
							return;
						}
					}
					for (@Pc(80) int local80 = 0; local80 < this.anInt859; local80++) {
						if (this.aLongArray3[local80] == arg0) {
							this.method703("Please remove " + local48 + " from your ignore list first", "", 0);
							return;
						}
					}
					if (!local48.equals(aClass8_Sub1_Sub2_Sub4_Sub1_1.aString8)) {
						this.aStringArray11[this.anInt852] = local48;
						this.aLongArray4[this.anInt852] = arg0;
						this.anIntArray226[this.anInt852] = 0;
						this.anInt852++;
						this.aBoolean218 = true;
						this.aClass8_Sub1_Sub3_6.method154(77);
						this.aClass8_Sub1_Sub3_6.method161(arg0);
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("42030, " + arg0 + ", " + true + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray9[local3] != null) {
					@Pc(15) int local15 = this.anIntArray218[local3];
					@Pc(26) int local26 = this.anInt854 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					@Pc(34) String local34 = this.aStringArray8[local3];
					if (local34 != null && local34.startsWith("@cr1@")) {
						local34 = local34.substring(5);
					}
					if (local34 != null && local34.startsWith("@cr2@")) {
						local34 = local34.substring(5);
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt1030 == 0 || this.anInt1030 == 1 && this.method604(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass8_Sub1_Sub2_Sub4_Sub1_1.aString8)) {
							if (this.anInt931 >= 1) {
								this.aStringArray13[this.anInt1029] = "Report abuse @whi@" + local34;
								this.anIntArray242[this.anInt1029] = 811;
								this.anInt1029++;
							}
							this.aStringArray13[this.anInt1029] = "Add ignore @whi@" + local34;
							this.anIntArray242[this.anInt1029] = 694;
							this.anInt1029++;
							this.aStringArray13[this.anInt1029] = "Add friend @whi@" + local34;
							this.anIntArray242[this.anInt1029] = 730;
							this.anInt1029++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt906 == 0 && (local15 == 7 || this.anInt953 == 0 || this.anInt953 == 1 && this.method604(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt931 >= 1) {
								this.aStringArray13[this.anInt1029] = "Report abuse @whi@" + local34;
								this.anIntArray242[this.anInt1029] = 811;
								this.anInt1029++;
							}
							this.aStringArray13[this.anInt1029] = "Add ignore @whi@" + local34;
							this.anIntArray242[this.anInt1029] = 694;
							this.anInt1029++;
							this.aStringArray13[this.anInt1029] = "Add friend @whi@" + local34;
							this.anIntArray242[this.anInt1029] = 730;
							this.anInt1029++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt897 == 0 || this.anInt897 == 1 && this.method604(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray13[this.anInt1029] = "Accept trade @whi@" + local34;
							this.anIntArray242[this.anInt1029] = 757;
							this.anInt1029++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt906 == 0 && this.anInt953 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt897 == 0 || this.anInt897 == 1 && this.method604(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray13[this.anInt1029] = "Accept challenge @whi@" + local34;
							this.anIntArray242[this.anInt1029] = 709;
							this.anInt1029++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("11626, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method583(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class3.aClass3Array1[arg0].anInt61;
			if (local4 != 0) {
				@Pc(23) int local23 = this.anIntArray246[arg0];
				if (local4 == 1) {
					if (local23 == 1) {
						Class8_Sub1_Sub1_Sub1.method78(0.9D);
					}
					if (local23 == 2) {
						Class8_Sub1_Sub1_Sub1.method78(0.8D);
					}
					if (local23 == 3) {
						Class8_Sub1_Sub1_Sub1.method78(0.7D);
					}
					if (local23 == 4) {
						Class8_Sub1_Sub1_Sub1.method78(0.6D);
					}
					Class2.aClass18_2.method209();
					this.aBoolean200 = true;
				}
				if (local4 == 3) {
					@Pc(61) boolean local61 = this.aBoolean227;
					if (local23 == 0) {
						this.method624(this.aBoolean227, (byte) 2, 0);
						this.aBoolean227 = true;
					}
					if (local23 == 1) {
						this.method624(this.aBoolean227, (byte) 2, -400);
						this.aBoolean227 = true;
					}
					if (local23 == 2) {
						this.method624(this.aBoolean227, (byte) 2, -800);
						this.aBoolean227 = true;
					}
					if (local23 == 3) {
						this.method624(this.aBoolean227, (byte) 2, -1200);
						this.aBoolean227 = true;
					}
					if (local23 == 4) {
						this.aBoolean227 = false;
					}
					if (this.aBoolean227 != local61 && !aBoolean197) {
						if (this.aBoolean227) {
							this.anInt921 = this.anInt864;
							this.aBoolean204 = true;
							this.aClass21_Sub1_1.method305(2, this.anInt921);
						} else {
							this.method657();
						}
						this.anInt886 = 0;
					}
				}
				if (local4 == 4) {
					if (local23 == 0) {
						this.aBoolean234 = true;
						this.method617(0);
					}
					if (local23 == 1) {
						this.aBoolean234 = true;
						this.method617(-400);
					}
					if (local23 == 2) {
						this.aBoolean234 = true;
						this.method617(-800);
					}
					if (local23 == 3) {
						this.aBoolean234 = true;
						this.method617(-1200);
					}
					if (local23 == 4) {
						this.aBoolean234 = false;
					}
				}
				if (local4 == 5) {
					this.anInt928 = local23;
				}
				if (local4 == 6) {
					this.anInt926 = local23;
				}
				if (local4 == 8) {
					this.anInt906 = local23;
					this.aBoolean230 = true;
				}
				if (local4 == 9) {
					this.anInt1063 = local23;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("28411, " + 2 + ", " + arg0 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean192) {
			this.method611();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method584() {
		try {
			@Pc(2) int local2 = this.anInt1002;
			@Pc(5) int local5 = this.anInt1003;
			@Pc(8) int local8 = this.anInt1004;
			@Pc(11) int local11 = this.anInt1005;
			Class8_Sub1_Sub1.method507(local8, local2, 6116423, local5, local11);
			Class8_Sub1_Sub1.method507(local8 - 2, local2 + 1, 0, local5 + 1, 16);
			Class8_Sub1_Sub1.method508(0, local11 - 19, local8 - 2, local5 + 18, local2 + 1);
			this.aClass8_Sub1_Sub1_Sub2_4.method105("Choose Option", 6116423, local2 + 3, local5 + 14);
			@Pc(63) int local63 = super.anInt839;
			@Pc(66) int local66 = super.anInt840;
			if (this.anInt1001 == 0) {
				local63 -= 4;
				local66 -= 4;
			}
			if (this.anInt1001 == 1) {
				local63 -= 553;
				local66 -= 205;
			}
			if (this.anInt1001 == 2) {
				local63 -= 17;
				local66 -= 357;
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt1029; local85++) {
				@Pc(100) int local100 = local5 + (this.anInt1029 - 1 - local85) * 15 + 31;
				@Pc(102) int local102 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local100 - 13 && local66 < local100 + 3) {
					local102 = 16776960;
				}
				this.aClass8_Sub1_Sub1_Sub2_4.method109(this.aStringArray13[local85], local100, true, local2 + 3, local102);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("35534, " + -46 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method585() {
		try {
			if (this.anInt1054 == 0) {
				this.aStringArray13[0] = "Cancel";
				this.anIntArray242[0] = 1545;
				this.anInt1029 = 1;
				this.method642();
				this.anInt855 = 0;
				if (super.anInt839 > 4 && super.anInt840 > 4 && super.anInt839 < 516 && super.anInt840 < 338) {
					if (this.anInt870 == -1) {
						this.method699();
					} else {
						this.method670(4, 0, 4, this.aBoolean195, Class36.aClass36Array1[this.anInt870], super.anInt839, super.anInt840);
					}
				}
				if (this.anInt855 != this.anInt883) {
					this.anInt883 = this.anInt855;
				}
				this.anInt855 = 0;
				if (super.anInt839 > 553 && super.anInt840 > 205 && super.anInt839 < 743 && super.anInt840 < 466) {
					if (this.anInt891 != -1) {
						this.method670(553, 0, 205, this.aBoolean195, Class36.aClass36Array1[this.anInt891], super.anInt839, super.anInt840);
					} else if (this.anIntArray229[this.anInt884] != -1) {
						this.method670(553, 0, 205, this.aBoolean195, Class36.aClass36Array1[this.anIntArray229[this.anInt884]], super.anInt839, super.anInt840);
					}
				}
				if (this.anInt855 != this.anInt902) {
					this.aBoolean218 = true;
					this.anInt902 = this.anInt855;
				}
				this.anInt855 = 0;
				if (super.anInt839 > 17 && super.anInt840 > 357 && super.anInt839 < 496 && super.anInt840 < 453) {
					if (this.anInt1043 != -1) {
						this.method670(17, 0, 357, this.aBoolean195, Class36.aClass36Array1[this.anInt1043], super.anInt839, super.anInt840);
					} else if (super.anInt840 < 434 && super.anInt839 < 426) {
						this.method582(super.anInt839 - 17, super.anInt840 - 357);
					}
				}
				if (this.anInt1043 != -1 && this.anInt855 != this.anInt995) {
					this.aBoolean230 = true;
					this.anInt995 = this.anInt855;
				}
				@Pc(234) boolean local234 = false;
				while (!local234) {
					local234 = true;
					for (@Pc(240) int local240 = 0; local240 < this.anInt1029 - 1; local240++) {
						if (this.anIntArray242[local240] < 1000 && this.anIntArray242[local240 + 1] > 1000) {
							@Pc(261) String local261 = this.aStringArray13[local240];
							this.aStringArray13[local240] = this.aStringArray13[local240 + 1];
							this.aStringArray13[local240 + 1] = local261;
							@Pc(283) int local283 = this.anIntArray242[local240];
							this.anIntArray242[local240] = this.anIntArray242[local240 + 1];
							this.anIntArray242[local240 + 1] = local283;
							@Pc(305) int local305 = this.anIntArray240[local240];
							this.anIntArray240[local240] = this.anIntArray240[local240 + 1];
							this.anIntArray240[local240 + 1] = local305;
							@Pc(327) int local327 = this.anIntArray241[local240];
							this.anIntArray241[local240] = this.anIntArray241[local240 + 1];
							this.anIntArray241[local240 + 1] = local327;
							@Pc(349) int local349 = this.anIntArray243[local240];
							this.anIntArray243[local240] = this.anIntArray243[local240 + 1];
							this.anIntArray243[local240 + 1] = local349;
							local234 = false;
						}
					}
				}
			}
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("71183, " + -790 + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method586(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(13) int local13 = 0; local13 < this.anInt852; local13++) {
					if (this.aLongArray4[local13] == arg0) {
						this.anInt852--;
						this.aBoolean218 = true;
						for (@Pc(33) int local33 = local13; local33 < this.anInt852; local33++) {
							this.aStringArray11[local33] = this.aStringArray11[local33 + 1];
							this.anIntArray226[local33] = this.anIntArray226[local33 + 1];
							this.aLongArray4[local33] = this.aLongArray4[local33 + 1];
						}
						this.aClass8_Sub1_Sub3_6.method154(54);
						this.aClass8_Sub1_Sub3_6.method161(arg0);
						return;
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("84038, " + 5 + ", " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method587() {
		try {
			while (true) {
				@Pc(8) int local8 = this.method571();
				if (local8 == -1) {
					return;
				}
				if (this.anInt870 != -1 && this.anInt870 == this.anInt1058) {
					if (local8 == 8 && this.aString28.length() > 0) {
						this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
					}
					if ((local8 >= 97 && local8 <= 122 || local8 >= 65 && local8 <= 90 || local8 >= 48 && local8 <= 57 || local8 == 32) && this.aString28.length() < 12) {
						this.aString28 = this.aString28 + (char) local8;
					}
				} else {
					@Pc(188) int local188;
					if (this.aBoolean214) {
						if (local8 >= 32 && local8 <= 122 && this.aString26.length() < 80) {
							this.aString26 = this.aString26 + (char) local8;
							this.aBoolean230 = true;
						}
						if (local8 == 8 && this.aString26.length() > 0) {
							this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							this.aBoolean230 = true;
						}
						if (local8 == 13 || local8 == 10) {
							this.aBoolean214 = false;
							this.aBoolean230 = true;
							@Pc(148) long local148;
							if (this.anInt889 == 1) {
								local148 = Class48.method559(this.aString26);
								this.method581(local148);
							}
							if (this.anInt889 == 2 && this.anInt852 > 0) {
								local148 = Class48.method559(this.aString26);
								this.method586(local148);
							}
							if (this.anInt889 == 3 && this.aString26.length() > 0) {
								this.aClass8_Sub1_Sub3_6.method154(242);
								this.aClass8_Sub1_Sub3_6.method155(0);
								local188 = this.aClass8_Sub1_Sub3_6.anInt253;
								this.aClass8_Sub1_Sub3_6.method161(this.aLong32);
								Class23.method283(this.aString26, this.aClass8_Sub1_Sub3_6);
								this.aClass8_Sub1_Sub3_6.method164(this.aClass8_Sub1_Sub3_6.anInt253 - local188);
								this.aString26 = Class23.method284(this.aString26, this.anInt951);
								this.aString26 = Class19.method220(this.aString26, this.anInt951);
								this.method703(this.aString26, Class48.method563(Class48.method560(this.aLong32)), 6);
								if (this.anInt953 == 2) {
									this.anInt953 = 1;
									this.aBoolean199 = true;
									this.aClass8_Sub1_Sub3_6.method154(52);
									this.aClass8_Sub1_Sub3_6.method155(this.anInt1030);
									this.aClass8_Sub1_Sub3_6.method155(this.anInt953);
									this.aClass8_Sub1_Sub3_6.method155(this.anInt897);
								}
							}
							if (this.anInt889 == 4 && this.anInt859 < 100) {
								local148 = Class48.method559(this.aString26);
								this.method711(local148);
							}
							if (this.anInt889 == 5 && this.anInt859 > 0) {
								local148 = Class48.method559(this.aString26);
								this.method702(local148, this.anInt1067);
							}
						}
					} else if (this.anInt963 == 1) {
						if (local8 >= 48 && local8 <= 57 && this.aString29.length() < 10) {
							this.aString29 = this.aString29 + (char) local8;
							this.aBoolean230 = true;
						}
						if (local8 == 8 && this.aString29.length() > 0) {
							this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							this.aBoolean230 = true;
						}
						if (local8 == 13 || local8 == 10) {
							if (this.aString29.length() > 0) {
								local188 = 0;
								try {
									local188 = Integer.parseInt(this.aString29);
								} catch (@Pc(368) Exception local368) {
								}
								this.aClass8_Sub1_Sub3_6.method154(183);
								this.aClass8_Sub1_Sub3_6.method159(local188);
							}
							this.anInt963 = 0;
							this.aBoolean230 = true;
						}
					} else if (this.anInt963 == 2) {
						if (local8 >= 32 && local8 <= 122 && this.aString29.length() < 12) {
							this.aString29 = this.aString29 + (char) local8;
							this.aBoolean230 = true;
						}
						if (local8 == 8 && this.aString29.length() > 0) {
							this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							this.aBoolean230 = true;
						}
						if (local8 == 13 || local8 == 10) {
							if (this.aString29.length() > 0) {
								this.aClass8_Sub1_Sub3_6.method154(49);
								this.aClass8_Sub1_Sub3_6.method161(Class48.method559(this.aString29));
							}
							this.anInt963 = 0;
							this.aBoolean230 = true;
						}
					} else if (this.anInt1043 == -1) {
						if (local8 >= 32 && local8 <= 122 && this.aString22.length() < 80) {
							this.aString22 = this.aString22 + (char) local8;
							this.aBoolean230 = true;
						}
						if (local8 == 8 && this.aString22.length() > 0) {
							this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							this.aBoolean230 = true;
						}
						if ((local8 == 13 || local8 == 10) && this.aString22.length() > 0) {
							if (this.anInt931 == 2) {
								if (this.aString22.equals("::clientdrop")) {
									this.method600();
								}
								if (this.aString22.equals("::lag")) {
									this.method682();
								}
								if (this.aString22.equals("::prefetchmusic")) {
									for (local188 = 0; local188 < this.aClass21_Sub1_1.method314(2); local188++) {
										this.aClass21_Sub1_1.method313(2, (byte) 1, local188);
									}
								}
								if (this.aString22.equals("::fpson")) {
									aBoolean226 = true;
								}
								if (this.aString22.equals("::fpsoff")) {
									aBoolean226 = false;
								}
								if (this.aString22.equals("::noclip")) {
									for (local188 = 0; local188 < 4; local188++) {
										for (@Pc(596) int local596 = 1; local596 < 103; local596++) {
											for (@Pc(600) int local600 = 1; local600 < 103; local600++) {
												this.aClass11Array1[local188].anIntArrayArray8[local596][local600] = 0;
											}
										}
									}
								}
							}
							if (this.aString22.startsWith("::")) {
								this.aClass8_Sub1_Sub3_6.method154(150);
								this.aClass8_Sub1_Sub3_6.method155(this.aString22.length() - 1);
								this.aClass8_Sub1_Sub3_6.method162(this.aString22.substring(2));
							} else {
								@Pc(655) String local655 = this.aString22.toLowerCase();
								@Pc(657) byte local657 = 0;
								if (local655.startsWith("yellow:")) {
									local657 = 0;
									this.aString22 = this.aString22.substring(7);
								} else if (local655.startsWith("red:")) {
									local657 = 1;
									this.aString22 = this.aString22.substring(4);
								} else if (local655.startsWith("green:")) {
									local657 = 2;
									this.aString22 = this.aString22.substring(6);
								} else if (local655.startsWith("cyan:")) {
									local657 = 3;
									this.aString22 = this.aString22.substring(5);
								} else if (local655.startsWith("purple:")) {
									local657 = 4;
									this.aString22 = this.aString22.substring(7);
								} else if (local655.startsWith("white:")) {
									local657 = 5;
									this.aString22 = this.aString22.substring(6);
								} else if (local655.startsWith("flash1:")) {
									local657 = 6;
									this.aString22 = this.aString22.substring(7);
								} else if (local655.startsWith("flash2:")) {
									local657 = 7;
									this.aString22 = this.aString22.substring(7);
								} else if (local655.startsWith("flash3:")) {
									local657 = 8;
									this.aString22 = this.aString22.substring(7);
								} else if (local655.startsWith("glow1:")) {
									local657 = 9;
									this.aString22 = this.aString22.substring(6);
								} else if (local655.startsWith("glow2:")) {
									local657 = 10;
									this.aString22 = this.aString22.substring(6);
								} else if (local655.startsWith("glow3:")) {
									local657 = 11;
									this.aString22 = this.aString22.substring(6);
								}
								local655 = this.aString22.toLowerCase();
								@Pc(829) byte local829 = 0;
								if (local655.startsWith("wave:")) {
									local829 = 1;
									this.aString22 = this.aString22.substring(5);
								} else if (local655.startsWith("wave2:")) {
									local829 = 2;
									this.aString22 = this.aString22.substring(6);
								} else if (local655.startsWith("shake:")) {
									local829 = 3;
									this.aString22 = this.aString22.substring(6);
								} else if (local655.startsWith("scroll:")) {
									local829 = 4;
									this.aString22 = this.aString22.substring(7);
								} else if (local655.startsWith("slide:")) {
									local829 = 5;
									this.aString22 = this.aString22.substring(6);
								}
								this.aClass8_Sub1_Sub3_6.method154(85);
								this.aClass8_Sub1_Sub3_6.method155(0);
								@Pc(910) int local910 = this.aClass8_Sub1_Sub3_6.anInt253;
								this.aClass8_Sub1_Sub3_6.method181(local657);
								this.aClass8_Sub1_Sub3_6.method183(local829);
								this.aClass8_Sub1_Sub3_9.anInt253 = 0;
								Class23.method283(this.aString22, this.aClass8_Sub1_Sub3_9);
								this.aClass8_Sub1_Sub3_6.method200(this.aClass8_Sub1_Sub3_9.aByteArray9, this.aClass8_Sub1_Sub3_9.anInt253, this.anInt1020);
								this.aClass8_Sub1_Sub3_6.method164(this.aClass8_Sub1_Sub3_6.anInt253 - local910);
								this.aString22 = Class23.method284(this.aString22, this.anInt951);
								this.aString22 = Class19.method220(this.aString22, this.anInt951);
								aClass8_Sub1_Sub2_Sub4_Sub1_1.aString9 = this.aString22;
								aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt549 = local657;
								aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt560 = local829;
								aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt545 = 150;
								if (this.anInt931 == 2) {
									this.method703(aClass8_Sub1_Sub2_Sub4_Sub1_1.aString9, "@cr2@" + aClass8_Sub1_Sub2_Sub4_Sub1_1.aString8, 2);
								} else if (this.anInt931 == 1) {
									this.method703(aClass8_Sub1_Sub2_Sub4_Sub1_1.aString9, "@cr1@" + aClass8_Sub1_Sub2_Sub4_Sub1_1.aString8, 2);
								} else {
									this.method703(aClass8_Sub1_Sub2_Sub4_Sub1_1.aString9, aClass8_Sub1_Sub2_Sub4_Sub1_1.aString8, 2);
								}
								if (this.anInt1030 == 2) {
									this.anInt1030 = 3;
									this.aBoolean199 = true;
									this.aClass8_Sub1_Sub3_6.method154(52);
									this.aClass8_Sub1_Sub3_6.method155(this.anInt1030);
									this.aClass8_Sub1_Sub3_6.method155(this.anInt953);
									this.aClass8_Sub1_Sub3_6.method155(this.anInt897);
								}
							}
							this.aString22 = "";
							this.aBoolean230 = true;
						}
					}
				}
			}
		} catch (@Pc(1066) RuntimeException local1066) {
			signlink.reporterror("76768, " + false + ", " + local1066.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)I")
	private int method588() {
		try {
			@Pc(12) int local12 = 3;
			if (this.anInt875 < 310) {
				@Pc(21) int local21 = this.anInt872 >> 7;
				@Pc(26) int local26 = this.anInt874 >> 7;
				@Pc(31) int local31 = aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 >> 7;
				@Pc(36) int local36 = aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt1042][local21][local26] & 0x4) != 0) {
					local12 = this.anInt1042;
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
						if ((this.aByteArrayArrayArray8[this.anInt1042][local21][local26] & 0x4) != 0) {
							local12 = this.anInt1042;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local26 < local36) {
								local26++;
							} else if (local26 > local36) {
								local26--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1042][local21][local26] & 0x4) != 0) {
								local12 = this.anInt1042;
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
						if ((this.aByteArrayArrayArray8[this.anInt1042][local21][local26] & 0x4) != 0) {
							local12 = this.anInt1042;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1042][local21][local26] & 0x4) != 0) {
								local12 = this.anInt1042;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt1042][aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 >> 7][aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 >> 7] & 0x4) != 0) {
				local12 = this.anInt1042;
			}
			return local12;
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("79652, " + true + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)I")
	private int method589() {
		try {
			@Pc(9) int local9 = this.method667(this.anInt874, this.anInt1042, this.anInt872);
			return local9 - this.anInt873 >= 800 || (this.aByteArrayArrayArray8[this.anInt1042][this.anInt872 >> 7][this.anInt874 >> 7] & 0x4) == 0 ? 3 : this.anInt1042;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("86406, " + true + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GLMIQHJI;IB)V")
	private void method591(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method176(8);
			@Pc(12) int local12;
			if (local6 < this.anInt961) {
				for (local12 = local6; local12 < this.anInt961; local12++) {
					this.anIntArray248[this.anInt1014++] = this.anIntArray232[local12];
				}
			}
			if (local6 > this.anInt961) {
				signlink.reporterror(this.aString17 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt961 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray232[local12];
				@Pc(69) Class8_Sub1_Sub2_Sub4_Sub1 local69 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local64];
				@Pc(74) int local74 = arg0.method176(1);
				if (local74 == 0) {
					this.anIntArray232[this.anInt961++] = local64;
					local69.anInt558 = anInt927;
				} else {
					@Pc(97) int local97 = arg0.method176(2);
					if (local97 == 0) {
						this.anIntArray232[this.anInt961++] = local64;
						local69.anInt558 = anInt927;
						this.anIntArray233[this.anInt962++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray232[this.anInt961++] = local64;
							local69.anInt558 = anInt927;
							local148 = arg0.method176(3);
							local69.method375(false, local148, 908);
							local158 = arg0.method176(1);
							if (local158 == 1) {
								this.anIntArray233[this.anInt962++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray232[this.anInt961++] = local64;
							local69.anInt558 = anInt927;
							local148 = arg0.method176(3);
							local69.method375(true, local148, 908);
							local158 = arg0.method176(3);
							local69.method375(true, local158, 908);
							@Pc(216) int local216 = arg0.method176(1);
							if (local216 == 1) {
								this.anIntArray233[this.anInt962++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray248[this.anInt1014++] = local64;
						}
					}
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("52162, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method592() {
		try {
			@Pc(7) byte[] local7 = this.aClass45_1.method553("title.dat", null);
			@Pc(13) Class8_Sub1_Sub1_Sub3 local13 = new Class8_Sub1_Sub1_Sub3(local7, this);
			this.aClass29_22.method339();
			local13.method265(0, 0);
			this.aClass29_23.method339();
			local13.method265(-637, 0);
			this.aClass29_19.method339();
			local13.method265(-128, 0);
			this.aClass29_20.method339();
			local13.method265(-202, -371);
			this.aClass29_21.method339();
			local13.method265(-202, -171);
			this.aClass29_24.method339();
			local13.method265(0, -265);
			this.aClass29_25.method339();
			local13.method265(-562, -265);
			this.aClass29_26.method339();
			local13.method265(-128, -171);
			this.aClass29_27.method339();
			local13.method265(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt310];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt311; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt310; local104++) {
					local98[local104] = local13.anIntArray49[local13.anInt310 + local13.anInt310 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt310; local130++) {
					local13.anIntArray49[local130 + local13.anInt310 * local100] = local98[local130];
				}
			}
			this.aClass29_22.method339();
			local13.method265(382, 0);
			this.aClass29_23.method339();
			local13.method265(-255, 0);
			this.aClass29_19.method339();
			local13.method265(254, 0);
			this.aClass29_20.method339();
			local13.method265(180, -371);
			this.aClass29_21.method339();
			local13.method265(180, -171);
			this.aClass29_24.method339();
			local13.method265(382, -265);
			this.aClass29_25.method339();
			local13.method265(-180, -265);
			this.aClass29_26.method339();
			local13.method265(254, -171);
			this.aClass29_27.method339();
			local13.method265(-180, -171);
			local13 = new Class8_Sub1_Sub1_Sub3(this.aClass45_1, "logo", 0);
			this.aClass29_19.method339();
			local13.method267(382 - local13.anInt310 / 2 - 128, 272, 18);
			System.gc();
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("87330, " + 6 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method593(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt963 != 0) {
					this.anInt963 = 0;
					this.aBoolean230 = true;
				}
				@Pc(18) int local18 = this.anIntArray240[arg0];
				@Pc(23) int local23 = this.anIntArray241[arg0];
				@Pc(28) int local28 = this.anIntArray242[arg0];
				@Pc(33) int local33 = this.anIntArray243[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(61) boolean local61;
				if (local28 == 750) {
					local61 = this.method596(0, 0, 0, 2, false, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
					if (!local61) {
						this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
					}
					this.anInt898 = super.anInt845;
					this.anInt899 = super.anInt846;
					this.anInt901 = 2;
					this.anInt900 = 0;
					this.aClass8_Sub1_Sub3_6.method154(5);
					this.aClass8_Sub1_Sub3_6.method156(local33);
					this.aClass8_Sub1_Sub3_6.method190(local23 + this.anInt945);
					this.aClass8_Sub1_Sub3_6.method156(local18 + this.anInt944);
				}
				if (local28 == 111) {
					anInt1013 += this.anInt944;
					if (anInt1013 >= 50) {
						this.aClass8_Sub1_Sub3_6.method154(163);
						this.aClass8_Sub1_Sub3_6.method158(7412244);
						anInt1013 = 0;
					}
					this.method613(local33, local23, local18);
					this.aClass8_Sub1_Sub3_6.method154(194);
					this.aClass8_Sub1_Sub3_6.method191(local33 >> 14 & 0x7FFF, (byte) 3);
					this.aClass8_Sub1_Sub3_6.method192(local18 + this.anInt944);
					this.aClass8_Sub1_Sub3_6.method191(local23 + this.anInt945, (byte) 3);
				}
				if (local28 == 294) {
					this.aClass8_Sub1_Sub3_6.method154(66);
					this.aClass8_Sub1_Sub3_6.method192(local23);
					this.aClass8_Sub1_Sub3_6.method190(this.anInt867);
					this.aClass8_Sub1_Sub3_6.method191(local18, (byte) 3);
					this.aClass8_Sub1_Sub3_6.method190(local33);
					this.anInt922 = 0;
					this.anInt923 = local23;
					this.anInt924 = local18;
					this.anInt925 = 2;
					if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
						this.anInt925 = 1;
					}
					if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
						this.anInt925 = 3;
					}
				}
				if (local28 == 610) {
					if (this.aBoolean216) {
						this.aClass32_1.method420(local23 - 4, local18 - 4);
					} else {
						this.aClass32_1.method420(super.anInt846 - 4, super.anInt845 - 4);
					}
				}
				@Pc(287) String local287;
				@Pc(278) Class2 local278;
				if (local28 == 1297) {
					local278 = Class2.method4(local33);
					if (local278.aByteArray1 == null) {
						local287 = "It's a " + local278.aString1 + ".";
					} else {
						local287 = new String(local278.aByteArray1);
					}
					this.method703(local287, "", 0);
				}
				@Pc(322) Class36 local322;
				@Pc(340) int local340;
				if (local28 == 137) {
					this.aClass8_Sub1_Sub3_6.method154(83);
					this.aClass8_Sub1_Sub3_6.method156(local23);
					local322 = Class36.aClass36Array1[local23];
					if (local322.anIntArrayArray14 != null && local322.anIntArrayArray14[0][0] == 5) {
						local340 = local322.anIntArrayArray14[0][1];
						if (this.anIntArray246[local340] != local322.anIntArray112[0]) {
							this.anIntArray246[local340] = local322.anIntArray112[0];
							this.method583(local340);
							this.aBoolean218 = true;
						}
					}
				}
				if (local28 == 806 && !this.aBoolean233) {
					this.aClass8_Sub1_Sub3_6.method154(105);
					this.aClass8_Sub1_Sub3_6.method156(local23);
					this.aBoolean233 = true;
				}
				if (local28 == 532) {
					anInt909 += local18;
					if (anInt909 >= 100) {
						this.aClass8_Sub1_Sub3_6.method154(58);
						this.aClass8_Sub1_Sub3_6.method156(10898);
						anInt909 = 0;
					}
					this.aClass8_Sub1_Sub3_6.method154(100);
					this.aClass8_Sub1_Sub3_6.method156(local18);
					this.aClass8_Sub1_Sub3_6.method156(local33);
					this.aClass8_Sub1_Sub3_6.method192(local23);
					this.anInt922 = 0;
					this.anInt923 = local23;
					this.anInt924 = local18;
					this.anInt925 = 2;
					if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
						this.anInt925 = 1;
					}
					if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
						this.anInt925 = 3;
					}
				}
				if (local28 == 630) {
					anInt904++;
					if (anInt904 >= 96) {
						this.aClass8_Sub1_Sub3_6.method154(139);
						this.aClass8_Sub1_Sub3_6.method155(169);
						anInt904 = 0;
					}
					this.aClass8_Sub1_Sub3_6.method154(239);
					this.aClass8_Sub1_Sub3_6.method192(local23);
					this.aClass8_Sub1_Sub3_6.method190(local18);
					this.aClass8_Sub1_Sub3_6.method192(local33);
					this.anInt922 = 0;
					this.anInt923 = local23;
					this.anInt924 = local18;
					this.anInt925 = 2;
					if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
						this.anInt925 = 1;
					}
					if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
						this.anInt925 = 3;
					}
				}
				@Pc(547) String local547;
				if (local28 == 1714) {
					@Pc(535) int local535 = local33 >> 14 & 0x7FFF;
					@Pc(538) Class33 local538 = Class33.method443(local535);
					if (local538.aByteArray16 == null) {
						local547 = "It's a " + local538.aString10 + ".";
					} else {
						local547 = new String(local538.aByteArray16);
					}
					this.method703(local547, "", 0);
				}
				@Pc(574) Class8_Sub1_Sub2_Sub4_Sub2 local574;
				if (local28 == 873) {
					local574 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local33];
					if (local574 != null) {
						this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local574.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local574.anIntArray81[0]);
						this.anInt898 = super.anInt845;
						this.anInt899 = super.anInt846;
						this.anInt901 = 2;
						this.anInt900 = 0;
						this.aClass8_Sub1_Sub3_6.method154(220);
						this.aClass8_Sub1_Sub3_6.method156(this.anInt867);
						this.aClass8_Sub1_Sub3_6.method156(local33);
					}
				}
				if (local28 == 959) {
					this.anInt970 = 1;
					this.anInt971 = local18;
					this.anInt972 = local23;
					this.anInt973 = local33;
					this.aString27 = Class2.method4(local33).aString1;
					this.anInt866 = 0;
					this.aBoolean218 = true;
				} else {
					@Pc(675) String local675;
					@Pc(690) long local690;
					if (local28 == 730 || local28 == 694 || local28 == 994 || local28 == 759) {
						local675 = this.aStringArray13[arg0];
						local340 = local675.indexOf("@whi@");
						if (local340 != -1) {
							local690 = Class48.method559(local675.substring(local340 + 5).trim());
							if (local28 == 730) {
								this.method581(local690);
							}
							if (local28 == 694) {
								this.method711(local690);
							}
							if (local28 == 994) {
								this.method586(local690);
							}
							if (local28 == 759) {
								this.method702(local690, this.anInt1067);
							}
						}
					}
					if (local28 == 482) {
						local322 = Class36.aClass36Array1[local23];
						this.anInt866 = 1;
						this.anInt867 = local23;
						this.anInt868 = local322.anInt676;
						this.anInt970 = 0;
						this.aBoolean218 = true;
						local287 = local322.aString11;
						if (local287.indexOf(" ") != -1) {
							local287 = local287.substring(0, local287.indexOf(" "));
						}
						local547 = local322.aString11;
						if (local547.indexOf(" ") != -1) {
							local547 = local547.substring(local547.indexOf(" ") + 1);
						}
						this.aString19 = local287 + " " + local322.aString12 + " " + local547;
						if (this.anInt868 == 16) {
							this.aBoolean218 = true;
							this.anInt884 = 3;
							this.aBoolean211 = true;
						}
					} else {
						if (local28 == 818) {
							local574 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local574 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local574.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local574.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(7);
								this.aClass8_Sub1_Sub3_6.method156(this.anInt972);
								this.aClass8_Sub1_Sub3_6.method190(this.anInt973);
								this.aClass8_Sub1_Sub3_6.method190(this.anInt971);
								this.aClass8_Sub1_Sub3_6.method191(local33, (byte) 3);
							}
						}
						@Pc(890) Class8_Sub1_Sub2_Sub4_Sub1 local890;
						if (local28 == 401) {
							local890 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local890 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local890.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local890.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(28);
								this.aClass8_Sub1_Sub3_6.method192(local33);
							}
						}
						if (local28 == 8) {
							this.aClass8_Sub1_Sub3_6.method154(72);
							this.aClass8_Sub1_Sub3_6.method192(local18);
							this.aClass8_Sub1_Sub3_6.method191(local33, (byte) 3);
							this.aClass8_Sub1_Sub3_6.method156(local23);
							this.anInt922 = 0;
							this.anInt923 = local23;
							this.anInt924 = local18;
							this.anInt925 = 2;
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
								this.anInt925 = 1;
							}
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
								this.anInt925 = 3;
							}
						}
						@Pc(1022) int local1022;
						if (local28 == 302) {
							local675 = this.aStringArray13[arg0];
							local340 = local675.indexOf("@whi@");
							if (local340 != -1) {
								local690 = Class48.method559(local675.substring(local340 + 5).trim());
								local1022 = -1;
								for (@Pc(1024) int local1024 = 0; local1024 < this.anInt852; local1024++) {
									if (this.aLongArray4[local1024] == local690) {
										local1022 = local1024;
										break;
									}
								}
								if (local1022 != -1 && this.anIntArray226[local1022] > 0) {
									this.aBoolean230 = true;
									this.anInt963 = 0;
									this.aBoolean214 = true;
									this.aString26 = "";
									this.anInt889 = 3;
									this.aLong32 = this.aLongArray4[local1022];
									this.aString30 = "Enter message to send to " + this.aStringArray11[local1022];
								}
							}
						}
						if (local28 == 915) {
							local890 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local890 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local890.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local890.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(75);
								this.aClass8_Sub1_Sub3_6.method190(local33);
							}
						}
						if (local28 == 51) {
							this.aClass8_Sub1_Sub3_6.method154(83);
							this.aClass8_Sub1_Sub3_6.method156(local23);
							local322 = Class36.aClass36Array1[local23];
							if (local322.anIntArrayArray14 != null && local322.anIntArrayArray14[0][0] == 5) {
								local340 = local322.anIntArrayArray14[0][1];
								this.anIntArray246[local340] = 1 - this.anIntArray246[local340];
								this.method583(local340);
								this.aBoolean218 = true;
							}
						}
						if (local28 == 708) {
							this.aClass8_Sub1_Sub3_6.method154(182);
							this.aClass8_Sub1_Sub3_6.method190(local23);
							this.aClass8_Sub1_Sub3_6.method156(local18);
							this.aClass8_Sub1_Sub3_6.method192(local33);
							this.anInt922 = 0;
							this.anInt923 = local23;
							this.anInt924 = local18;
							this.anInt925 = 2;
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
								this.anInt925 = 1;
							}
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
								this.anInt925 = 3;
							}
						}
						if (local28 == 751) {
							local890 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local890 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local890.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local890.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(98);
								this.aClass8_Sub1_Sub3_6.method156(this.anInt867);
								this.aClass8_Sub1_Sub3_6.method192(local33);
							}
						}
						if (local28 == 247) {
							local61 = this.method596(0, 0, 0, 2, false, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							if (!local61) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							}
							this.anInt898 = super.anInt845;
							this.anInt899 = super.anInt846;
							this.anInt901 = 2;
							this.anInt900 = 0;
							this.aClass8_Sub1_Sub3_6.method154(171);
							this.aClass8_Sub1_Sub3_6.method192(local23 + this.anInt945);
							this.aClass8_Sub1_Sub3_6.method192(local33);
							this.aClass8_Sub1_Sub3_6.method156(local18 + this.anInt944);
						}
						if (local28 == 236) {
							this.method688();
						}
						if (local28 == 1101) {
							local574 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local574 != null) {
								@Pc(1420) Class26 local1420 = local574.aClass26_2;
								if (local1420.anIntArray61 != null) {
									local1420 = local1420.method323();
								}
								if (local1420 != null) {
									if (local1420.aByteArray14 == null) {
										local547 = "It's a " + local1420.aString4 + ".";
									} else {
										local547 = new String(local1420.aByteArray14);
									}
									this.method703(local547, "", 0);
								}
							}
						}
						if (local28 == 516) {
							local61 = this.method596(0, 0, 0, 2, false, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							if (!local61) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							}
							this.anInt898 = super.anInt845;
							this.anInt899 = super.anInt846;
							this.anInt901 = 2;
							this.anInt900 = 0;
							this.aClass8_Sub1_Sub3_6.method154(184);
							this.aClass8_Sub1_Sub3_6.method192(local33);
							this.aClass8_Sub1_Sub3_6.method192(this.anInt867);
							this.aClass8_Sub1_Sub3_6.method191(local18 + this.anInt944, (byte) 3);
							this.aClass8_Sub1_Sub3_6.method156(local23 + this.anInt945);
						}
						if (local28 == 811) {
							local675 = this.aStringArray13[arg0];
							local340 = local675.indexOf("@whi@");
							if (local340 != -1) {
								if (this.anInt870 == -1) {
									this.method688();
									this.aString28 = local675.substring(local340 + 5).trim();
									this.aBoolean225 = false;
									for (@Pc(1584) int local1584 = 0; local1584 < Class36.aClass36Array1.length; local1584++) {
										if (Class36.aClass36Array1[local1584] != null && Class36.aClass36Array1[local1584].anInt681 == 600) {
											this.anInt1058 = this.anInt870 = Class36.aClass36Array1[local1584].anInt680;
											break;
										}
									}
								} else {
									this.method703("Please close the interface you have open before using 'report abuse'", "", 0);
								}
							}
						}
						if (local28 == 686) {
							this.method613(local33, local23, local18);
							this.aClass8_Sub1_Sub3_6.method154(168);
							this.aClass8_Sub1_Sub3_6.method156(local18 + this.anInt944);
							this.aClass8_Sub1_Sub3_6.method192(local33 >> 14 & 0x7FFF);
							this.aClass8_Sub1_Sub3_6.method192(local23 + this.anInt945);
						}
						if (local28 == 337) {
							local574 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local574 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local574.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local574.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(2);
								this.aClass8_Sub1_Sub3_6.method192(local33);
							}
						}
						if (local28 == 262 && this.method613(local33, local23, local18)) {
							this.aClass8_Sub1_Sub3_6.method154(204);
							this.aClass8_Sub1_Sub3_6.method190(local18 + this.anInt944);
							this.aClass8_Sub1_Sub3_6.method156(local23 + this.anInt945);
							this.aClass8_Sub1_Sub3_6.method156(this.anInt971);
							this.aClass8_Sub1_Sub3_6.method190(this.anInt973);
							this.aClass8_Sub1_Sub3_6.method192(this.anInt972);
							this.aClass8_Sub1_Sub3_6.method156(local33 >> 14 & 0x7FFF);
						}
						if (local28 == 903) {
							this.aClass8_Sub1_Sub3_6.method154(40);
							this.aClass8_Sub1_Sub3_6.method156(local33);
							this.aClass8_Sub1_Sub3_6.method191(local23, (byte) 3);
							this.aClass8_Sub1_Sub3_6.method190(local18);
							this.anInt922 = 0;
							this.anInt923 = local23;
							this.anInt924 = local18;
							this.anInt925 = 2;
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
								this.anInt925 = 1;
							}
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
								this.anInt925 = 3;
							}
						}
						if (local28 == 355) {
							this.aClass8_Sub1_Sub3_6.method154(109);
							this.aClass8_Sub1_Sub3_6.method191(local33, (byte) 3);
							this.aClass8_Sub1_Sub3_6.method190(local23);
							this.aClass8_Sub1_Sub3_6.method191(local18, (byte) 3);
							this.anInt922 = 0;
							this.anInt923 = local23;
							this.anInt924 = local18;
							this.anInt925 = 2;
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
								this.anInt925 = 1;
							}
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
								this.anInt925 = 3;
							}
						}
						if (local28 == 16 && this.method613(local33, local23, local18)) {
							this.aClass8_Sub1_Sub3_6.method154(170);
							this.aClass8_Sub1_Sub3_6.method191(local33 >> 14 & 0x7FFF, (byte) 3);
							this.aClass8_Sub1_Sub3_6.method190(this.anInt867);
							this.aClass8_Sub1_Sub3_6.method191(local18 + this.anInt944, (byte) 3);
							this.aClass8_Sub1_Sub3_6.method190(local23 + this.anInt945);
						}
						if (local28 == 448) {
							local890 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local890 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local890.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local890.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(248);
								this.aClass8_Sub1_Sub3_6.method191(this.anInt972, (byte) 3);
								this.aClass8_Sub1_Sub3_6.method192(this.anInt973);
								this.aClass8_Sub1_Sub3_6.method192(this.anInt971);
								this.aClass8_Sub1_Sub3_6.method191(local33, (byte) 3);
							}
						}
						if (local28 == 321) {
							local61 = this.method596(0, 0, 0, 2, false, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							if (!local61) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							}
							this.anInt898 = super.anInt845;
							this.anInt899 = super.anInt846;
							this.anInt901 = 2;
							this.anInt900 = 0;
							this.aClass8_Sub1_Sub3_6.method154(190);
							this.aClass8_Sub1_Sub3_6.method190(local18 + this.anInt944);
							this.aClass8_Sub1_Sub3_6.method190(local23 + this.anInt945);
							this.aClass8_Sub1_Sub3_6.method156(local33);
						}
						if (local28 == 677) {
							local574 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local574 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local574.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local574.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(207);
								this.aClass8_Sub1_Sub3_6.method192(local33);
							}
						}
						if (local28 == 331) {
							local574 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local574 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local574.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local574.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(94);
								this.aClass8_Sub1_Sub3_6.method191(local33, (byte) 3);
							}
						}
						if (local28 == 820) {
							local890 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local890 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local890.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local890.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(88);
								this.aClass8_Sub1_Sub3_6.method190(local33);
							}
						}
						if (local28 == 132) {
							this.aClass8_Sub1_Sub3_6.method154(195);
							this.aClass8_Sub1_Sub3_6.method190(local33);
							this.aClass8_Sub1_Sub3_6.method156(local23);
							this.aClass8_Sub1_Sub3_6.method190(local18);
							this.anInt922 = 0;
							this.anInt923 = local23;
							this.anInt924 = local18;
							this.anInt925 = 2;
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
								this.anInt925 = 1;
							}
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
								this.anInt925 = 3;
							}
						}
						if (local28 == 1463) {
							local278 = Class2.method4(local33);
							@Pc(2342) Class36 local2342 = Class36.aClass36Array1[local23];
							if (local2342 != null && local2342.anIntArray115[local18] >= 100000) {
								local287 = local2342.anIntArray115[local18] + " x " + local278.aString1;
							} else if (local278.aByteArray1 == null) {
								local287 = "It's a " + local278.aString1 + ".";
							} else {
								local287 = new String(local278.aByteArray1);
							}
							this.method703(local287, "", 0);
						}
						if (local28 == 30) {
							local574 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local574 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local574.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local574.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(251);
								this.aClass8_Sub1_Sub3_6.method192(local33);
							}
						}
						if (local28 == 992) {
							local61 = this.method596(0, 0, 0, 2, false, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							if (!local61) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							}
							this.anInt898 = super.anInt845;
							this.anInt899 = super.anInt846;
							this.anInt901 = 2;
							this.anInt900 = 0;
							this.aClass8_Sub1_Sub3_6.method154(15);
							this.aClass8_Sub1_Sub3_6.method191(this.anInt973, (byte) 3);
							this.aClass8_Sub1_Sub3_6.method192(this.anInt972);
							this.aClass8_Sub1_Sub3_6.method190(local23 + this.anInt945);
							this.aClass8_Sub1_Sub3_6.method190(local18 + this.anInt944);
							this.aClass8_Sub1_Sub3_6.method190(this.anInt971);
							this.aClass8_Sub1_Sub3_6.method190(local33);
						}
						if (local28 == 41) {
							local574 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local574 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local574.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local574.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(249);
								this.aClass8_Sub1_Sub3_6.method192(local33);
							}
						}
						if (local28 == 391) {
							this.method613(local33, local23, local18);
							this.aClass8_Sub1_Sub3_6.method154(107);
							this.aClass8_Sub1_Sub3_6.method156(local18 + this.anInt944);
							this.aClass8_Sub1_Sub3_6.method192(local33 >> 14 & 0x7FFF);
							this.aClass8_Sub1_Sub3_6.method156(local23 + this.anInt945);
						}
						if (local28 == 12) {
							local61 = this.method596(0, 0, 0, 2, false, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							if (!local61) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							}
							this.anInt898 = super.anInt845;
							this.anInt899 = super.anInt846;
							this.anInt901 = 2;
							this.anInt900 = 0;
							this.aClass8_Sub1_Sub3_6.method154(222);
							this.aClass8_Sub1_Sub3_6.method192(local18 + this.anInt944);
							this.aClass8_Sub1_Sub3_6.method156(local23 + this.anInt945);
							this.aClass8_Sub1_Sub3_6.method156(local33);
						}
						if (local28 == 416) {
							anInt1051++;
							if (anInt1051 >= 91) {
								this.aClass8_Sub1_Sub3_6.method154(210);
								this.aClass8_Sub1_Sub3_6.method155(234);
								anInt1051 = 0;
							}
							this.aClass8_Sub1_Sub3_6.method154(18);
							this.aClass8_Sub1_Sub3_6.method156(local33);
							this.aClass8_Sub1_Sub3_6.method156(local18);
							this.aClass8_Sub1_Sub3_6.method192(local23);
							this.anInt922 = 0;
							this.anInt923 = local23;
							this.anInt924 = local18;
							this.anInt925 = 2;
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
								this.anInt925 = 1;
							}
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
								this.anInt925 = 3;
							}
						}
						if (local28 == 766) {
							local890 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local890 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local890.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local890.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								if ((local33 & 0x3) == 0) {
									anInt998++;
								}
								if (anInt998 >= 79) {
									this.aClass8_Sub1_Sub3_6.method154(79);
									this.aClass8_Sub1_Sub3_6.method158(12768835);
									anInt998 = 0;
								}
								this.aClass8_Sub1_Sub3_6.method154(96);
								this.aClass8_Sub1_Sub3_6.method190(local33);
							}
						}
						if (local28 == 485) {
							this.aClass8_Sub1_Sub3_6.method154(84);
							this.aClass8_Sub1_Sub3_6.method156(local18);
							this.aClass8_Sub1_Sub3_6.method156(this.anInt973);
							this.aClass8_Sub1_Sub3_6.method192(this.anInt971);
							this.aClass8_Sub1_Sub3_6.method190(local23);
							this.aClass8_Sub1_Sub3_6.method156(local33);
							this.aClass8_Sub1_Sub3_6.method192(this.anInt972);
							this.anInt922 = 0;
							this.anInt923 = local23;
							this.anInt924 = local18;
							this.anInt925 = 2;
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
								this.anInt925 = 1;
							}
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
								this.anInt925 = 3;
							}
						}
						if (local28 == 612) {
							local322 = Class36.aClass36Array1[local23];
							@Pc(2978) boolean local2978 = true;
							if (local322.anInt681 > 0) {
								local2978 = this.method685(local322);
							}
							if (local2978) {
								this.aClass8_Sub1_Sub3_6.method154(83);
								this.aClass8_Sub1_Sub3_6.method156(local23);
							}
						}
						if (local28 == 757 || local28 == 709) {
							local675 = this.aStringArray13[arg0];
							local340 = local675.indexOf("@whi@");
							if (local340 != -1) {
								local675 = local675.substring(local340 + 5).trim();
								local547 = Class48.method563(Class48.method560(Class48.method559(local675)));
								@Pc(3031) boolean local3031 = false;
								for (local1022 = 0; local1022 < this.anInt961; local1022++) {
									@Pc(3043) Class8_Sub1_Sub2_Sub4_Sub1 local3043 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray232[local1022]];
									if (local3043 != null && local3043.aString8 != null && local3043.aString8.equalsIgnoreCase(local547)) {
										this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local3043.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local3043.anIntArray81[0]);
										if (local28 == 757) {
											if ((local33 & 0x3) == 0) {
												anInt998++;
											}
											if (anInt998 >= 79) {
												this.aClass8_Sub1_Sub3_6.method154(79);
												this.aClass8_Sub1_Sub3_6.method158(12768835);
												anInt998 = 0;
											}
											this.aClass8_Sub1_Sub3_6.method154(96);
											this.aClass8_Sub1_Sub3_6.method190(this.anIntArray232[local1022]);
										}
										if (local28 == 709) {
											this.aClass8_Sub1_Sub3_6.method154(123);
											this.aClass8_Sub1_Sub3_6.method156(this.anIntArray232[local1022]);
										}
										local3031 = true;
										break;
									}
								}
								if (!local3031) {
									this.method703("Unable to find " + local547, "", 0);
								}
							}
						}
						if (local28 == 10) {
							this.aClass8_Sub1_Sub3_6.method154(32);
							this.aClass8_Sub1_Sub3_6.method192(local18);
							this.aClass8_Sub1_Sub3_6.method156(local23);
							this.aClass8_Sub1_Sub3_6.method156(local33);
							this.anInt922 = 0;
							this.anInt923 = local23;
							this.anInt924 = local18;
							this.anInt925 = 2;
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
								this.anInt925 = 1;
							}
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
								this.anInt925 = 3;
							}
						}
						if (local28 == 237) {
							this.method613(local33, local23, local18);
							this.aClass8_Sub1_Sub3_6.method154(138);
							this.aClass8_Sub1_Sub3_6.method156(local33 >> 14 & 0x7FFF);
							this.aClass8_Sub1_Sub3_6.method191(local18 + this.anInt944, (byte) 3);
							this.aClass8_Sub1_Sub3_6.method190(local23 + this.anInt945);
						}
						if (local28 == 375) {
							this.aClass8_Sub1_Sub3_6.method154(216);
							this.aClass8_Sub1_Sub3_6.method156(local23);
							this.aClass8_Sub1_Sub3_6.method156(local33);
							this.aClass8_Sub1_Sub3_6.method191(local18, (byte) 3);
							this.anInt922 = 0;
							this.anInt923 = local23;
							this.anInt924 = local18;
							this.anInt925 = 2;
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt870) {
								this.anInt925 = 1;
							}
							if (Class36.aClass36Array1[local23].anInt680 == this.anInt1043) {
								this.anInt925 = 3;
							}
						}
						if (local28 == 801) {
							local61 = this.method596(0, 0, 0, 2, false, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							if (!local61) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local18, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local23);
							}
							this.anInt898 = super.anInt845;
							this.anInt899 = super.anInt846;
							this.anInt901 = 2;
							this.anInt900 = 0;
							this.aClass8_Sub1_Sub3_6.method154(6);
							this.aClass8_Sub1_Sub3_6.method156(local18 + this.anInt944);
							this.aClass8_Sub1_Sub3_6.method190(local33);
							this.aClass8_Sub1_Sub3_6.method191(local23 + this.anInt945, (byte) 3);
						}
						if (local28 == 1938) {
							anInt996++;
							if (anInt996 >= 134) {
								this.aClass8_Sub1_Sub3_6.method154(119);
								this.aClass8_Sub1_Sub3_6.method155(190);
								anInt996 = 0;
							}
							this.method613(local33, local23, local18);
							this.aClass8_Sub1_Sub3_6.method154(152);
							this.aClass8_Sub1_Sub3_6.method190(local18 + this.anInt944);
							this.aClass8_Sub1_Sub3_6.method191(local23 + this.anInt945, (byte) 3);
							this.aClass8_Sub1_Sub3_6.method191(local33 >> 14 & 0x7FFF, (byte) 3);
						}
						if (local28 == 380) {
							local890 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local890 != null) {
								this.method596(1, 0, 0, 2, false, 1, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local890.anIntArray80[0], aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local890.anIntArray81[0]);
								this.anInt898 = super.anInt845;
								this.anInt899 = super.anInt846;
								this.anInt901 = 2;
								this.anInt900 = 0;
								this.aClass8_Sub1_Sub3_6.method154(123);
								this.aClass8_Sub1_Sub3_6.method156(local33);
							}
						}
						this.anInt970 = 0;
						this.anInt866 = 0;
						this.aBoolean218 = true;
					}
				}
			}
		} catch (@Pc(3524) RuntimeException local3524) {
			signlink.reporterror("23980, " + arg0 + ", " + 13626 + ", " + local3524.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method594(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) Class8_Sub1_Sub2_Sub1 local6 = (Class8_Sub1_Sub2_Sub1) this.aClass37_11.method491();
			@Pc(11) boolean local11 = false;
			while (local6 != null) {
				if (local6.anInt230 != this.anInt1042 || local6.aBoolean49) {
					local6.method554();
				} else if (anInt927 >= local6.anInt228) {
					local6.method137(this.anInt856);
					if (local6.aBoolean49) {
						local6.method554();
					} else {
						this.aClass32_1.method393(local6.anInt230, false, -1, local6, local6.anInt232, local6.anInt231, 0, 60, local6.anInt233);
					}
				}
				local6 = (Class8_Sub1_Sub2_Sub1) this.aClass37_11.method493();
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("6377, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method595(@OriginalArg(1) boolean arg0) {
		try {
			this.method686();
			this.aClass29_21.method339();
			this.aClass8_Sub1_Sub1_Sub4_19.method519(0, 272, 0);
			@Pc(48) byte local48;
			@Pc(60) int local60;
			if (this.anInt984 == 0) {
				this.aClass8_Sub1_Sub1_Sub2_2.method102(180, 180, 7711145, this.aClass21_Sub1_1.aString3, true);
				local48 = 80;
				this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 80, 16776960, "Welcome to RuneScape", true);
				local60 = local48 + 30;
				this.aClass8_Sub1_Sub1_Sub4_20.method519(27, 272, 100);
				this.aClass8_Sub1_Sub1_Sub2_4.method102(100, 125, 16777215, "New User", true);
				this.aClass8_Sub1_Sub1_Sub4_20.method519(187, 272, 100);
				this.aClass8_Sub1_Sub1_Sub2_4.method102(260, 125, 16777215, "Existing User", true);
			}
			if (this.anInt984 == 2) {
				local48 = 60;
				if (this.aString23.length() > 0) {
					this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 45, 16776960, this.aString23, true);
					this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 60, 16776960, this.aString24, true);
					local60 = local48 + 30;
				} else {
					this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 53, 16776960, this.aString24, true);
					local60 = local48 + 30;
				}
				this.aClass8_Sub1_Sub1_Sub2_4.method109("Username: " + this.aString17 + (this.anInt1031 == 0 & anInt927 % 40 < 20 ? "@yel@|" : ""), 90, true, 90, 16777215);
				local60 += 15;
				this.aClass8_Sub1_Sub1_Sub2_4.method109("Password: " + Class48.method564(this.aString18) + (this.anInt1031 == 1 & anInt927 % 40 < 20 ? "@yel@|" : ""), 105, true, 92, 16777215);
				local60 += 15;
				if (!arg0) {
					this.aClass8_Sub1_Sub1_Sub4_20.method519(27, 272, 130);
					this.aClass8_Sub1_Sub1_Sub2_4.method102(100, 155, 16777215, "Login", true);
					this.aClass8_Sub1_Sub1_Sub4_20.method519(187, 272, 130);
					this.aClass8_Sub1_Sub1_Sub2_4.method102(260, 155, 16777215, "Cancel", true);
				}
			}
			if (this.anInt984 == 3) {
				this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 40, 16776960, "Create a free account", true);
				local48 = 65;
				this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 65, 16777215, "To create a new account you need to", true);
				local60 = local48 + 15;
				this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 80, 16777215, "go back to the main RuneScape webpage", true);
				local60 += 15;
				this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 95, 16777215, "and choose the red 'create account'", true);
				local60 += 15;
				this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 110, 16777215, "button at the top right of that page.", true);
				local60 += 15;
				this.aClass8_Sub1_Sub1_Sub4_20.method519(107, 272, 130);
				this.aClass8_Sub1_Sub1_Sub2_4.method102(180, 155, 16777215, "Cancel", true);
			}
			this.aClass29_21.method340(super.aGraphics2, 202, 171);
			if (this.aBoolean200) {
				this.aBoolean200 = false;
				this.aClass29_19.method340(super.aGraphics2, 128, 0);
				this.aClass29_20.method340(super.aGraphics2, 202, 371);
				this.aClass29_24.method340(super.aGraphics2, 0, 265);
				this.aClass29_25.method340(super.aGraphics2, 562, 265);
				this.aClass29_26.method340(super.aGraphics2, 128, 171);
				this.aClass29_27.method340(super.aGraphics2, 562, 171);
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("48191, " + 124 + ", " + arg0 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZBIIIIII)Z")
	private boolean method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray23[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			local11 = arg9;
			@Pc(39) int local39 = arg7;
			this.anIntArrayArray23[arg9][arg7] = 99;
			this.anIntArrayArray24[arg9][arg7] = 0;
			@Pc(60) byte local60 = 0;
			@Pc(62) int local62 = 0;
			this.anIntArray255[0] = arg9;
			@Pc(71) int local71 = local60 + 1;
			this.anIntArray256[0] = arg7;
			@Pc(75) boolean local75 = false;
			@Pc(79) int local79 = this.anIntArray255.length;
			@Pc(86) int[][] local86 = this.aClass11Array1[this.anInt1042].anIntArrayArray8;
			@Pc(197) int local197;
			while (local62 != local71) {
				local11 = this.anIntArray255[local62];
				local39 = this.anIntArray256[local62];
				local62 = (local62 + 1) % local79;
				if (local11 == arg8 && local39 == arg10) {
					local75 = true;
					break;
				}
				if (arg1 != 0) {
					if ((arg1 < 5 || arg1 == 10) && this.aClass11Array1[this.anInt1042].method126(arg10, local39, local11, arg8, arg2, arg1 - 1)) {
						local75 = true;
						break;
					}
					if (arg1 < 10 && this.aClass11Array1[this.anInt1042].method127(arg8, 635, local39, local11, arg1 - 1, arg2, arg10)) {
						local75 = true;
						break;
					}
				}
				if (arg5 != 0 && arg0 != 0 && this.aClass11Array1[this.anInt1042].method128(arg10, arg6, arg0, local11, arg5, local39, arg8)) {
					local75 = true;
					break;
				}
				local197 = this.anIntArrayArray24[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray23[local11 - 1][local39] == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray255[local71] = local11 - 1;
					this.anIntArray256[local71] = local39;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray23[local11 - 1][local39] = 2;
					this.anIntArrayArray24[local11 - 1][local39] = local197;
				}
				if (local11 < 103 && this.anIntArrayArray23[local11 + 1][local39] == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray255[local71] = local11 + 1;
					this.anIntArray256[local71] = local39;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray23[local11 + 1][local39] = 8;
					this.anIntArrayArray24[local11 + 1][local39] = local197;
				}
				if (local39 > 0 && this.anIntArrayArray23[local11][local39 - 1] == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray255[local71] = local11;
					this.anIntArray256[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray23[local11][local39 - 1] = 1;
					this.anIntArrayArray24[local11][local39 - 1] = local197;
				}
				if (local39 < 103 && this.anIntArrayArray23[local11][local39 + 1] == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray255[local71] = local11;
					this.anIntArray256[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray23[local11][local39 + 1] = 4;
					this.anIntArrayArray24[local11][local39 + 1] = local197;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray23[local11 - 1][local39 - 1] == 0 && (local86[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray255[local71] = local11 - 1;
					this.anIntArray256[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = local197;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray23[local11 + 1][local39 - 1] == 0 && (local86[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray255[local71] = local11 + 1;
					this.anIntArray256[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = local197;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray23[local11 - 1][local39 + 1] == 0 && (local86[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray255[local71] = local11 - 1;
					this.anIntArray256[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = local197;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray23[local11 + 1][local39 + 1] == 0 && (local86[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray255[local71] = local11 + 1;
					this.anIntArray256[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = local197;
				}
			}
			this.anInt1006 = 0;
			@Pc(813) int local813;
			@Pc(819) int local819;
			@Pc(825) int local825;
			if (!local75) {
				if (arg4) {
					local197 = 100;
					for (local813 = 1; local813 < 2; local813++) {
						for (local819 = arg8 - local813; local819 <= arg8 + local813; local819++) {
							for (local825 = arg10 - local813; local825 <= arg10 + local813; local825++) {
								if (local819 >= 0 && local825 >= 0 && local819 < 104 && local825 < 104 && this.anIntArrayArray24[local819][local825] < local197) {
									local197 = this.anIntArrayArray24[local819][local825];
									local11 = local819;
									local39 = local825;
									this.anInt1006 = 1;
									local75 = true;
								}
							}
						}
						if (local75) {
							break;
						}
					}
				}
				if (!local75) {
					return false;
				}
			}
			@Pc(886) byte local886 = 0;
			this.anIntArray255[0] = local11;
			local62 = local886 + 1;
			this.anIntArray256[0] = local39;
			local197 = local813 = this.anIntArrayArray23[local11][local39];
			while (local11 != arg9 || local39 != arg7) {
				if (local197 != local813) {
					local813 = local197;
					this.anIntArray255[local62] = local11;
					this.anIntArray256[local62++] = local39;
				}
				if ((local197 & 0x2) != 0) {
					local11++;
				} else if ((local197 & 0x8) != 0) {
					local11--;
				}
				if ((local197 & 0x1) != 0) {
					local39++;
				} else if ((local197 & 0x4) != 0) {
					local39--;
				}
				local197 = this.anIntArrayArray23[local11][local39];
			}
			if (local62 > 0) {
				local79 = local62;
				if (local62 > 25) {
					local79 = 25;
				}
				local62--;
				local819 = this.anIntArray255[local62];
				local825 = this.anIntArray256[local62];
				anInt1007++;
				if (anInt1007 >= 89) {
					this.aClass8_Sub1_Sub3_6.method154(135);
					this.aClass8_Sub1_Sub3_6.method159(0);
					anInt1007 = 0;
				}
				if (arg3 == 0) {
					this.aClass8_Sub1_Sub3_6.method154(19);
					this.aClass8_Sub1_Sub3_6.method155(local79 + local79 + 3);
				}
				if (arg3 == 1) {
					this.aClass8_Sub1_Sub3_6.method154(76);
					this.aClass8_Sub1_Sub3_6.method155(local79 + local79 + 3 + 14);
				}
				if (arg3 == 2) {
					this.aClass8_Sub1_Sub3_6.method154(233);
					this.aClass8_Sub1_Sub3_6.method155(local79 + local79 + 3);
				}
				this.aClass8_Sub1_Sub3_6.method182(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass8_Sub1_Sub3_6.method191(local819 + this.anInt944, (byte) 3);
				this.aClass8_Sub1_Sub3_6.method191(local825 + this.anInt945, (byte) 3);
				this.anInt1021 = this.anIntArray255[0];
				this.anInt1022 = this.anIntArray256[0];
				for (@Pc(1091) int local1091 = 1; local1091 < local79; local1091++) {
					local62--;
					this.aClass8_Sub1_Sub3_6.method155(this.anIntArray255[local62] - local819);
					this.aClass8_Sub1_Sub3_6.method181(this.anIntArray256[local62] - local825);
				}
				return true;
			} else if (arg3 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1127) RuntimeException local1127) {
			signlink.reporterror("72778, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 6 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIILclient!USEDZXXV;IIZI)V")
	private void method597(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		try {
			if (this.aBoolean209) {
				this.anInt1062 = 32;
			} else {
				this.anInt1062 = 0;
			}
			this.aBoolean209 = false;
			if (!arg1) {
				this.anInt951 = 197;
			}
			if (arg3 >= arg0 && arg3 < arg0 + 16 && arg8 >= arg2 && arg8 < arg2 + 16) {
				arg4.anInt683 -= this.anInt950 * 4;
				if (arg7) {
					this.aBoolean218 = true;
					return;
				}
			} else if (arg3 >= arg0 && arg3 < arg0 + 16 && arg8 >= arg2 + arg6 - 16 && arg8 < arg2 + arg6) {
				arg4.anInt683 += this.anInt950 * 4;
				if (arg7) {
					this.aBoolean218 = true;
					return;
				}
			} else if (arg3 >= arg0 - this.anInt1062 && arg3 < arg0 + this.anInt1062 + 16 && arg8 >= arg2 + 16 && arg8 < arg2 + arg6 - 16 && this.anInt950 > 0) {
				@Pc(121) int local121 = (arg6 - 32) * arg6 / arg5;
				if (local121 < 8) {
					local121 = 8;
				}
				@Pc(136) int local136 = arg8 - arg2 - local121 / 2 - 16;
				@Pc(142) int local142 = arg6 - local121 - 32;
				arg4.anInt683 = (arg5 - arg6) * local136 / local142;
				if (arg7) {
					this.aBoolean218 = true;
				}
				this.aBoolean209 = true;
			} else {
				return;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("2223, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method598() {
		try {
			while (true) {
				@Pc(14) Class8_Sub1_Sub4 local14 = this.aClass21_Sub1_1.method311();
				if (local14 == null) {
					return;
				}
				if (local14.anInt395 == 0) {
					Class8_Sub1_Sub2_Sub5.method461(local14.anInt397, local14.aByteArray15);
					if ((this.aClass21_Sub1_1.method298(local14.anInt397) & 0x62) != 0) {
						this.aBoolean218 = true;
						if (this.anInt1043 != -1) {
							this.aBoolean230 = true;
						}
					}
				}
				if (local14.anInt395 == 1 && local14.aByteArray15 != null) {
					Class35.method445(local14.aByteArray15);
				}
				if (local14.anInt395 == 2 && local14.anInt397 == this.anInt921 && local14.aByteArray15 != null) {
					this.method599(this.aBoolean204, this.aByte44, local14.aByteArray15);
				}
				if (local14.anInt395 == 3 && this.anInt895 == 1) {
					for (@Pc(86) int local86 = 0; local86 < this.aByteArrayArray5.length; local86++) {
						if (this.anIntArray260[local86] == local14.anInt397) {
							this.aByteArrayArray5[local86] = local14.aByteArray15;
							if (local14.aByteArray15 == null) {
								this.anIntArray260[local86] = -1;
							}
							break;
						}
						if (this.anIntArray261[local86] == local14.anInt397) {
							this.aByteArrayArray4[local86] = local14.aByteArray15;
							if (local14.aByteArray15 == null) {
								this.anIntArray261[local86] = -1;
							}
							break;
						}
					}
				}
				if (local14.anInt395 == 93 && this.aClass21_Sub1_1.method309(local14.anInt397)) {
					Class43.method536(this.aClass21_Sub1_1, this.anInt990, new Class8_Sub1_Sub3(local14.aByteArray15, -49015));
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("28362, " + 4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB[B)V")
	private void method599(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[] arg2) {
		try {
			if (arg1 != 3) {
				this.anInt917 = -357;
			}
			signlink.anInt1075 = arg0 ? 1 : 0;
			signlink.midisave(arg2, arg2.length);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("68913, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method600() {
		try {
			if (this.anInt958 > 0) {
				this.method626();
			} else {
				this.aClass29_8.method339();
				this.aClass8_Sub1_Sub1_Sub2_3.method101(144, 257, "Connection lost", 0);
				this.aClass8_Sub1_Sub1_Sub2_3.method101(143, 256, "Connection lost", 16777215);
				this.aClass8_Sub1_Sub1_Sub2_3.method101(159, 257, "Please wait - attempting to reestablish", 0);
				this.aClass8_Sub1_Sub1_Sub2_3.method101(158, 256, "Please wait - attempting to reestablish", 16777215);
				this.aClass29_8.method340(super.aGraphics2, 4, 4);
				this.anInt905 = 0;
				this.anInt1021 = 0;
				@Pc(64) Class25 local64 = this.aClass25_1;
				this.aBoolean219 = false;
				this.anInt966 = 0;
				this.method635(this.aString17, this.aString18, true);
				if (!this.aBoolean219) {
					this.method626();
				}
				try {
					local64.method290();
				} catch (@Pc(87) Exception local87) {
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("90509, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZII)V")
	private void method601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = arg2;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(41) int local41;
			if (local5 != 0) {
				local27 = Class8_Sub1_Sub2_Sub5.anIntArray153[local5];
				local31 = Class8_Sub1_Sub2_Sub5.anIntArray154[local5];
				local41 = local31 * 0 - arg2 * local27 >> 16;
				local21 = local27 * 0 + arg2 * local31 >> 16;
				local19 = local41;
			}
			if (local11 != 0) {
				local27 = Class8_Sub1_Sub2_Sub5.anIntArray153[local11];
				local31 = Class8_Sub1_Sub2_Sub5.anIntArray154[local11];
				local41 = local21 * local27 + local31 * 0 >> 16;
				local21 = local21 * local31 - local27 * 0 >> 16;
				local17 = local41;
			}
			this.anInt872 = arg1 - local17;
			this.anInt873 = arg4 - local19;
			this.anInt874 = arg0 - local21;
			this.anInt875 = arg5;
			this.anInt876 = arg3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("51323, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!GLMIQHJI;B)V")
	private void method602(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			while (arg1.anInt254 + 10 < arg0 * 8) {
				@Pc(28) int local28 = arg1.method176(11);
				if (local28 == 2047) {
					break;
				}
				if (this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local28] == null) {
					this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local28] = new Class8_Sub1_Sub2_Sub4_Sub1();
					if (this.aClass8_Sub1_Sub3Array1[local28] != null) {
						this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local28].method368(this.aClass8_Sub1_Sub3Array1[local28]);
					}
				}
				this.anIntArray232[this.anInt961++] = local28;
				@Pc(74) Class8_Sub1_Sub2_Sub4_Sub1 local74 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local28];
				local74.anInt558 = anInt927;
				@Pc(82) int local82 = arg1.method176(1);
				if (local82 == 1) {
					this.anIntArray233[this.anInt962++] = local28;
				}
				@Pc(101) int local101 = arg1.method176(5);
				if (local101 > 15) {
					local101 -= 32;
				}
				@Pc(110) int local110 = arg1.method176(1);
				@Pc(115) int local115 = arg1.method176(5);
				if (local115 > 15) {
					local115 -= 32;
				}
				local74.method377(aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0] + local115, local110 == 1, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0] + local101);
			}
			arg1.method177();
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("16776, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!GLMIQHJI;)V")
	private void method603(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt962; local6++) {
				@Pc(13) int local13 = this.anIntArray233[local6];
				@Pc(18) Class8_Sub1_Sub2_Sub4_Sub2 local18 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local13];
				@Pc(21) int local21 = arg1.method165();
				@Pc(28) int local28;
				@Pc(32) int local32;
				if ((local21 & 0x20) != 0) {
					local28 = arg1.method165();
					local32 = arg1.method185();
					local18.method379(local32, anInt927, 500, local28);
					local18.anInt583 = anInt927 + 300;
					local18.anInt584 = arg1.method185();
					local18.anInt585 = arg1.method185();
				}
				if ((local21 & 0x8) != 0) {
					local18.aString9 = arg1.method172();
					local18.anInt545 = 100;
				}
				if ((local21 & 0x1) != 0) {
					local18.anInt551 = arg1.method193();
					local28 = arg1.method199();
					local18.anInt555 = local28 >> 16;
					local18.anInt554 = anInt927 + (local28 & 0xFFFF);
					local18.anInt552 = 0;
					local18.anInt553 = 0;
					if (local18.anInt554 > anInt927) {
						local18.anInt552 = -1;
					}
					if (local18.anInt551 == 65535) {
						local18.anInt551 = -1;
					}
				}
				if ((local21 & 0x10) != 0) {
					local18.anInt542 = arg1.method167();
					local18.anInt543 = arg1.method194(this.anInt865);
				}
				if ((local21 & 0x2) != 0) {
					local18.aClass26_2 = Class26.method320(arg1.method195());
					local18.anInt586 = local18.aClass26_2.aByte19;
					local18.anInt557 = local18.aClass26_2.anInt372;
					local18.anInt572 = local18.aClass26_2.anInt364;
					local18.anInt573 = local18.aClass26_2.anInt378;
					local18.anInt574 = local18.aClass26_2.anInt380;
					local18.anInt575 = local18.aClass26_2.anInt369;
					local18.anInt546 = local18.aClass26_2.anInt376;
				}
				if ((local21 & 0x4) != 0) {
					local28 = arg1.method195();
					if (local28 == 65535) {
						local28 = -1;
					}
					local32 = arg1.method185();
					if (local28 == local18.anInt578 && local28 != -1) {
						@Pc(197) int local197 = Class40.aClass40Array1[local28].anInt761;
						if (local197 == 1) {
							local18.anInt579 = 0;
							local18.anInt580 = 0;
							local18.anInt581 = local32;
							local18.anInt582 = 0;
						}
						if (local197 == 2) {
							local18.anInt582 = 0;
						}
					} else if (local28 == -1 || local18.anInt578 == -1 || Class40.aClass40Array1[local28].anInt755 >= Class40.aClass40Array1[local18.anInt578].anInt755) {
						local18.anInt578 = local28;
						local18.anInt579 = 0;
						local18.anInt580 = 0;
						local18.anInt581 = local32;
						local18.anInt582 = 0;
						local18.anInt561 = local18.anInt550;
					}
				}
				if ((local21 & 0x40) != 0) {
					local18.anInt548 = arg1.method167();
					if (local18.anInt548 == 65535) {
						local18.anInt548 = -1;
					}
				}
				if ((local21 & 0x80) != 0) {
					local28 = arg1.method184();
					local32 = arg1.method186(535);
					local18.method379(local32, anInt927, 500, local28);
					local18.anInt583 = anInt927 + 300;
					local18.anInt584 = arg1.method165();
					local18.anInt585 = arg1.method184();
				}
			}
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("98345, " + false + ", " + arg0 + ", " + arg1 + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	private boolean method604(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt852; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray11[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass8_Sub1_Sub2_Sub4_Sub1_1.aString8);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("52017, " + arg0 + ", " + false + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)Z")
	private boolean method605() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("89677, " + true + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method606() {
		try {
			if (this.anInt1029 >= 2 || this.anInt970 != 0 || this.anInt866 != 0) {
				this.aBoolean219 &= true;
				@Pc(37) String local37;
				if (this.anInt970 == 1 && this.anInt1029 < 2) {
					local37 = "Use " + this.aString27 + " with...";
				} else if (this.anInt866 == 1 && this.anInt1029 < 2) {
					local37 = this.aString19 + "...";
				} else {
					local37 = this.aStringArray13[this.anInt1029 - 1];
				}
				if (this.anInt1029 > 2) {
					local37 = local37 + "@whi@ / " + (this.anInt1029 - 2) + " more options";
				}
				this.aClass8_Sub1_Sub1_Sub2_4.method110(anInt927 / 1000, 15, local37, this.aBoolean212, 4, 16777215);
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("26469, " + true + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!USEDZXXV;)V")
	private void method607(@OriginalArg(0) byte arg0, @OriginalArg(1) Class36 arg1) {
		try {
			if (this.aByte39 == 4) {
				@Pc(7) boolean local7 = false;
			} else {
				this.aClass8_Sub1_Sub3_6.method155(50);
			}
			@Pc(16) int local16 = arg1.anInt681;
			@Pc(72) int local72;
			if ((local16 < 1 || local16 > 100) && (local16 < 701 || local16 > 800)) {
				if (local16 >= 101 && local16 <= 200 || local16 >= 801 && local16 <= 900) {
					local72 = this.anInt852;
					if (this.anInt853 != 2) {
						local72 = 0;
					}
					if (local16 > 800) {
						local16 -= 701;
					} else {
						local16 -= 101;
					}
					if (local16 >= local72) {
						arg1.aString15 = "";
						arg1.anInt675 = 0;
					} else {
						if (this.anIntArray226[local16] == 0) {
							arg1.aString15 = "@red@Offline";
						} else if (this.anIntArray226[local16] == anInt877) {
							arg1.aString15 = "@gre@World-" + (this.anIntArray226[local16] - 9);
						} else {
							arg1.aString15 = "@yel@World-" + (this.anIntArray226[local16] - 9);
						}
						arg1.anInt675 = 1;
					}
				} else if (local16 == 203) {
					local72 = this.anInt852;
					if (this.anInt853 != 2) {
						local72 = 0;
					}
					arg1.anInt664 = local72 * 15 + 20;
					if (arg1.anInt664 <= arg1.anInt679) {
						arg1.anInt664 = arg1.anInt679 + 1;
					}
				} else if (local16 >= 401 && local16 <= 500) {
					local16 -= 401;
					if (local16 == 0 && this.anInt853 == 0) {
						arg1.aString15 = "Loading ignore list";
						arg1.anInt675 = 0;
					} else if (local16 == 1 && this.anInt853 == 0) {
						arg1.aString15 = "Please wait...";
						arg1.anInt675 = 0;
					} else {
						local72 = this.anInt859;
						if (this.anInt853 == 0) {
							local72 = 0;
						}
						if (local16 >= local72) {
							arg1.aString15 = "";
							arg1.anInt675 = 0;
						} else {
							arg1.aString15 = Class48.method563(Class48.method560(this.aLongArray3[local16]));
							arg1.anInt675 = 1;
						}
					}
				} else if (local16 == 503) {
					arg1.anInt664 = this.anInt859 * 15 + 20;
					if (arg1.anInt664 <= arg1.anInt679) {
						arg1.anInt664 = arg1.anInt679 + 1;
					}
				} else if (local16 == 327) {
					arg1.anInt656 = 150;
					arg1.anInt657 = (int) (Math.sin((double) anInt927 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean221) {
						for (local72 = 0; local72 < 7; local72++) {
							@Pc(341) int local341 = this.anIntArray269[local72];
							if (local341 >= 0 && !Class14.aClass14Array1[local341].method142(this.aByte41)) {
								return;
							}
						}
						this.aBoolean221 = false;
						@Pc(361) Class8_Sub1_Sub2_Sub5[] local361 = new Class8_Sub1_Sub2_Sub5[7];
						@Pc(363) int local363 = 0;
						for (@Pc(365) int local365 = 0; local365 < 7; local365++) {
							@Pc(372) int local372 = this.anIntArray269[local365];
							if (local372 >= 0) {
								local361[local363++] = Class14.aClass14Array1[local372].method143();
							}
						}
						@Pc(394) Class8_Sub1_Sub2_Sub5 local394 = new Class8_Sub1_Sub2_Sub5(local363, local361, -11616);
						for (@Pc(396) int local396 = 0; local396 < 5; local396++) {
							if (this.anIntArray254[local396] != 0) {
								local394.method477(anIntArrayArray25[local396][0], anIntArrayArray25[local396][this.anIntArray254[local396]]);
								if (local396 == 1) {
									local394.method477(anIntArray222[0], anIntArray222[this.anIntArray254[local396]]);
								}
							}
						}
						local394.method470();
						local394.method471(Class40.aClass40Array1[aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt546].anIntArray159[0]);
						local394.method480(64, 850, -30, -50, -30, true);
						arg1.anInt666 = 5;
						arg1.anInt667 = 0;
						Class36.method454(local394);
					}
				} else if (local16 == 324) {
					if (this.aClass8_Sub1_Sub1_Sub3_14 == null) {
						this.aClass8_Sub1_Sub1_Sub3_14 = arg1.aClass8_Sub1_Sub1_Sub3_1;
						this.aClass8_Sub1_Sub1_Sub3_15 = arg1.aClass8_Sub1_Sub1_Sub3_2;
					}
					if (this.aBoolean224) {
						arg1.aClass8_Sub1_Sub1_Sub3_1 = this.aClass8_Sub1_Sub1_Sub3_15;
					} else {
						arg1.aClass8_Sub1_Sub1_Sub3_1 = this.aClass8_Sub1_Sub1_Sub3_14;
					}
				} else if (local16 == 325) {
					if (this.aClass8_Sub1_Sub1_Sub3_14 == null) {
						this.aClass8_Sub1_Sub1_Sub3_14 = arg1.aClass8_Sub1_Sub1_Sub3_1;
						this.aClass8_Sub1_Sub1_Sub3_15 = arg1.aClass8_Sub1_Sub1_Sub3_2;
					}
					if (this.aBoolean224) {
						arg1.aClass8_Sub1_Sub1_Sub3_1 = this.aClass8_Sub1_Sub1_Sub3_14;
					} else {
						arg1.aClass8_Sub1_Sub1_Sub3_1 = this.aClass8_Sub1_Sub1_Sub3_15;
					}
				} else if (local16 == 600) {
					arg1.aString15 = this.aString28;
					if (anInt927 % 20 < 10) {
						arg1.aString15 = arg1.aString15 + "|";
					} else {
						arg1.aString15 = arg1.aString15 + " ";
					}
				} else {
					if (local16 == 613) {
						if (this.anInt931 < 1) {
							arg1.aString15 = "";
						} else if (this.aBoolean225) {
							arg1.anInt671 = 16711680;
							arg1.aString15 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt671 = 16777215;
							arg1.aString15 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(602) String local602;
					if (local16 == 650 || local16 == 655) {
						if (this.anInt920 == 0) {
							arg1.aString15 = "";
						} else {
							if (this.anInt930 == 0) {
								local602 = "earlier today";
							} else if (this.anInt930 == 1) {
								local602 = "yesterday";
							} else {
								local602 = this.anInt930 + " days ago";
							}
							arg1.aString15 = "You last logged in " + local602 + " from: " + signlink.dns;
						}
					}
					if (local16 == 651) {
						if (this.anInt885 == 0) {
							arg1.aString15 = "0 unread messages";
							arg1.anInt671 = 16776960;
						}
						if (this.anInt885 == 1) {
							arg1.aString15 = "1 unread message";
							arg1.anInt671 = 65280;
						}
						if (this.anInt885 > 1) {
							arg1.aString15 = this.anInt885 + " unread messages";
							arg1.anInt671 = 65280;
						}
					}
					if (local16 == 652) {
						if (this.anInt1009 == 201) {
							if (this.anInt860 == 1) {
								arg1.aString15 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg1.aString15 = "";
							}
						} else if (this.anInt1009 == 200) {
							arg1.aString15 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt1009 == 0) {
								local602 = "Earlier today";
							} else if (this.anInt1009 == 1) {
								local602 = "Yesterday";
							} else {
								local602 = this.anInt1009 + " days ago";
							}
							arg1.aString15 = local602 + " you changed your recovery questions";
						}
					}
					if (local16 == 653) {
						if (this.anInt1009 == 201) {
							if (this.anInt860 == 1) {
								arg1.aString15 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg1.aString15 = "";
							}
						} else if (this.anInt1009 == 200) {
							arg1.aString15 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg1.aString15 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local16 == 654) {
						if (this.anInt1009 == 201) {
							if (this.anInt860 == 1) {
								arg1.aString15 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg1.aString15 = "";
							}
						} else if (this.anInt1009 == 200) {
							arg1.aString15 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg1.aString15 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local16 == 1 && this.anInt853 == 0) {
				arg1.aString15 = "Loading friend list";
				arg1.anInt675 = 0;
			} else if (local16 == 1 && this.anInt853 == 1) {
				arg1.aString15 = "Connecting to friendserver";
				arg1.anInt675 = 0;
			} else if (local16 == 2 && this.anInt853 != 2) {
				arg1.aString15 = "Please wait...";
				arg1.anInt675 = 0;
			} else {
				local72 = this.anInt852;
				if (this.anInt853 != 2) {
					local72 = 0;
				}
				if (local16 > 700) {
					local16 -= 601;
				} else {
					local16--;
				}
				if (local16 >= local72) {
					arg1.aString15 = "";
					arg1.anInt675 = 0;
				} else {
					arg1.aString15 = this.aStringArray11[local16];
					arg1.anInt675 = 1;
				}
			}
		} catch (@Pc(810) RuntimeException local810) {
			signlink.reporterror("72601, " + arg0 + ", " + arg1 + ", " + local810.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!GLMIQHJI;)V")
	private void method608(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt962; local1++) {
				@Pc(8) int local8 = this.anIntArray233[local1];
				@Pc(13) Class8_Sub1_Sub2_Sub4_Sub1 local13 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local8];
				@Pc(16) int local16 = arg1.method165();
				if ((local16 & 0x1) != 0) {
					local16 += arg1.method165() << 8;
				}
				this.method701(arg1, local16, local8, local13);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("55483, " + arg0 + ", " + -23557 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method609() {
		try {
			if (aBoolean197 && this.anInt895 == 2 && Class43.anInt770 != this.anInt1042) {
				this.aClass29_8.method339();
				this.aClass8_Sub1_Sub1_Sub2_3.method101(151, 257, "Loading - please wait.", 0);
				this.aClass8_Sub1_Sub1_Sub2_3.method101(150, 256, "Loading - please wait.", 16777215);
				this.aClass29_8.method340(super.aGraphics2, 4, 4);
				this.anInt895 = 1;
				this.aLong31 = System.currentTimeMillis();
			}
			if (this.anInt895 == 1) {
				@Pc(58) int local58 = this.method610(this.anInt1046);
				if (local58 != 0 && System.currentTimeMillis() - this.aLong31 > 360000L) {
					signlink.reporterror(this.aString17 + " glcfb " + this.aLong33 + "," + local58 + "," + aBoolean197 + "," + this.aClass39Array1[0] + "," + this.aClass21_Sub1_1.method306() + "," + this.anInt1042 + "," + this.anInt978 + "," + this.anInt979);
					this.aLong31 = System.currentTimeMillis();
				}
			}
			if (this.anInt895 == 2 && this.anInt1042 != this.anInt908) {
				this.anInt908 = this.anInt1042;
				this.method619(this.anInt1042, this.aByte43);
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("75413, " + -69 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)I")
	private int method610(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < this.anInt1046 || arg0 > this.anInt1046) {
				this.aClass37ArrayArrayArray1 = null;
			}
			for (@Pc(14) int local14 = 0; local14 < this.aByteArrayArray5.length; local14++) {
				if (this.aByteArrayArray5[local14] == null && this.anIntArray260[local14] != -1) {
					return -1;
				}
				if (this.aByteArrayArray4[local14] == null && this.anIntArray261[local14] != -1) {
					return -2;
				}
			}
			@Pc(50) boolean local50 = true;
			for (@Pc(52) int local52 = 0; local52 < this.aByteArrayArray5.length; local52++) {
				@Pc(59) byte[] local59 = this.aByteArrayArray4[local52];
				if (local59 != null) {
					@Pc(73) int local73 = (this.anIntArray259[local52] >> 8) * 64 - this.anInt944;
					@Pc(85) int local85 = (this.anIntArray259[local52] & 0xFF) * 64 - this.anInt945;
					if (this.aBoolean231) {
						local73 = 10;
						local85 = 10;
					}
					local50 &= Class43.method546(local59, local73, local85);
				}
			}
			if (!local50) {
				return -3;
			} else if (this.aBoolean228) {
				return -4;
			} else {
				this.anInt895 = 2;
				Class43.anInt770 = this.anInt1042;
				this.method645();
				this.aClass8_Sub1_Sub3_6.method154(238);
				return 0;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("29117, " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method611() {
		try {
			this.aBoolean205 = true;
			try {
				@Pc(11) long local11 = System.currentTimeMillis();
				@Pc(13) int local13 = 0;
				@Pc(15) int local15 = 20;
				while (this.aBoolean203) {
					this.anInt1044++;
					this.method677();
					this.method677();
					this.method612();
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
			this.aBoolean205 = false;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("4055, " + 0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method612() {
		try {
			@Pc(8) int local8;
			if (this.anInt993 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt993 > 768) {
						this.anIntArray270[local8] = this.method653(1024 - this.anInt993, this.anIntArray272[local8], this.anIntArray271[local8]);
					} else if (this.anInt993 > 256) {
						this.anIntArray270[local8] = this.anIntArray272[local8];
					} else {
						this.anIntArray270[local8] = this.method653(256 - this.anInt993, this.anIntArray271[local8], this.anIntArray272[local8]);
					}
				}
			} else if (this.anInt994 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt994 > 768) {
						this.anIntArray270[local8] = this.method653(1024 - this.anInt994, this.anIntArray273[local8], this.anIntArray271[local8]);
					} else if (this.anInt994 > 256) {
						this.anIntArray270[local8] = this.anIntArray273[local8];
					} else {
						this.anIntArray270[local8] = this.method653(256 - this.anInt994, this.anIntArray271[local8], this.anIntArray273[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray270[local8] = this.anIntArray271[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass29_22.anIntArray64[local8] = this.aClass8_Sub1_Sub1_Sub3_11.anIntArray49[local8];
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
				local198 = this.anIntArray237[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray216[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray270[local220];
						local239 = this.aClass29_22.anIntArray64[local183];
						this.aClass29_22.anIntArray64[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass29_22.method340(super.aGraphics2, 0, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass29_23.anIntArray64[local198] = this.aClass8_Sub1_Sub1_Sub3_12.anIntArray49[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray237[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray216[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray270[local228];
						@Pc(373) int local373 = this.aClass29_23.anIntArray64[local183];
						this.aClass29_23.anIntArray64[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass29_23.method340(super.aGraphics2, 637, 0);
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("9522, " + 9 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass32_1.method412(this.anInt1042, arg2, arg1, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class33 local43 = Class33.method443(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt647;
					local54 = local43.anInt638;
				} else {
					local51 = local43.anInt638;
					local54 = local43.anInt647;
				}
				@Pc(65) int local65 = local43.anInt646;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method596(local54, 0, 0, 2, false, local51, local65, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], arg2, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], arg1);
			} else {
				this.method596(0, local25 + 1, local31, 2, false, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], arg2, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], arg1);
			}
			this.anInt898 = super.anInt845;
			this.anInt899 = super.anInt846;
			this.anInt901 = 2;
			this.anInt900 = 0;
			return true;
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("54488, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!USEDZXXV;Z)Z")
	private boolean method614(@OriginalArg(0) Class36 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				throw new NullPointerException();
			}
			@Pc(10) int local10 = arg0.anInt681;
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
				this.aStringArray13[this.anInt1029] = "Remove @whi@" + this.aStringArray11[local10];
				this.anIntArray242[this.anInt1029] = 994;
				this.anInt1029++;
				this.aStringArray13[this.anInt1029] = "Message @whi@" + this.aStringArray11[local10];
				this.anIntArray242[this.anInt1029] = 302;
				this.anInt1029++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray13[this.anInt1029] = "Remove @whi@" + arg0.aString15;
				this.anIntArray242[this.anInt1029] = 759;
				this.anInt1029++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("26453, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method574() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass25_1 != null) {
					this.aClass25_1.method290();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass25_1 = null;
			this.method657();
			if (this.aClass42_1 != null) {
				this.aClass42_1.aBoolean174 = false;
			}
			this.aClass42_1 = null;
			this.aClass21_Sub1_1.method308();
			this.aClass21_Sub1_1 = null;
			this.aClass8_Sub1_Sub3_9 = null;
			this.aClass8_Sub1_Sub3_6 = null;
			this.aClass8_Sub1_Sub3_8 = null;
			this.aClass8_Sub1_Sub3_7 = null;
			this.anIntArray259 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray4 = null;
			this.anIntArray260 = null;
			this.anIntArray261 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass32_1 = null;
			this.aClass11Array1 = null;
			this.anIntArrayArray23 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray255 = null;
			this.anIntArray256 = null;
			this.aByteArray21 = null;
			this.aClass29_6 = null;
			this.aClass29_7 = null;
			this.aClass29_8 = null;
			this.aClass29_9 = null;
			this.aClass29_3 = null;
			this.aClass29_4 = null;
			this.aClass29_5 = null;
			this.aClass29_10 = null;
			this.aClass29_11 = null;
			this.aClass29_12 = null;
			this.aClass29_13 = null;
			this.aClass29_14 = null;
			this.aClass29_15 = null;
			this.aClass29_16 = null;
			this.aClass29_17 = null;
			this.aClass29_18 = null;
			this.aClass8_Sub1_Sub1_Sub4_1 = null;
			this.aClass8_Sub1_Sub1_Sub4_2 = null;
			this.aClass8_Sub1_Sub1_Sub4_3 = null;
			this.aClass8_Sub1_Sub1_Sub4_6 = null;
			this.aClass8_Sub1_Sub1_Sub4_7 = null;
			this.aClass8_Sub1_Sub1_Sub4_8 = null;
			this.aClass8_Sub1_Sub1_Sub4Array2 = null;
			this.aClass8_Sub1_Sub1_Sub4_14 = null;
			this.aClass8_Sub1_Sub1_Sub4_15 = null;
			this.aClass8_Sub1_Sub1_Sub4_16 = null;
			this.aClass8_Sub1_Sub1_Sub4_17 = null;
			this.aClass8_Sub1_Sub1_Sub4_18 = null;
			this.aClass8_Sub1_Sub1_Sub4_9 = null;
			this.aClass8_Sub1_Sub1_Sub4_10 = null;
			this.aClass8_Sub1_Sub1_Sub4_11 = null;
			this.aClass8_Sub1_Sub1_Sub4_12 = null;
			this.aClass8_Sub1_Sub1_Sub4_13 = null;
			this.aClass8_Sub1_Sub1_Sub3_3 = null;
			this.aClass8_Sub1_Sub1_Sub3Array6 = null;
			this.aClass8_Sub1_Sub1_Sub3Array5 = null;
			this.aClass8_Sub1_Sub1_Sub3Array8 = null;
			this.aClass8_Sub1_Sub1_Sub3_4 = null;
			this.aClass8_Sub1_Sub1_Sub3_5 = null;
			this.aClass8_Sub1_Sub1_Sub3_6 = null;
			this.aClass8_Sub1_Sub1_Sub3_7 = null;
			this.aClass8_Sub1_Sub1_Sub3_8 = null;
			this.aClass8_Sub1_Sub1_Sub4Array3 = null;
			this.aClass8_Sub1_Sub1_Sub3Array4 = null;
			this.anInt954 += 0;
			this.anIntArrayArray22 = null;
			this.aClass8_Sub1_Sub2_Sub4_Sub1Array1 = null;
			this.anIntArray232 = null;
			this.anIntArray233 = null;
			this.aClass8_Sub1_Sub3Array1 = null;
			this.anIntArray248 = null;
			this.aClass8_Sub1_Sub2_Sub4_Sub2Array1 = null;
			this.anIntArray238 = null;
			this.aClass37ArrayArrayArray1 = null;
			this.aClass37_10 = null;
			this.aClass37_12 = null;
			this.aClass37_11 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.anIntArray242 = null;
			this.anIntArray243 = null;
			this.aStringArray13 = null;
			this.anIntArray246 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.aClass8_Sub1_Sub1_Sub3Array7 = null;
			this.aClass8_Sub1_Sub1_Sub3_13 = null;
			this.aStringArray11 = null;
			this.aLongArray4 = null;
			this.anIntArray226 = null;
			this.aClass29_22 = null;
			this.aClass29_23 = null;
			this.aClass29_19 = null;
			this.aClass29_20 = null;
			this.aClass29_21 = null;
			this.aClass29_24 = null;
			this.aClass29_25 = null;
			this.aClass29_26 = null;
			this.aClass29_27 = null;
			this.method672();
			Class33.method438();
			Class26.method324();
			Class2.method3();
			Class28.aClass28Array1 = null;
			Class14.aClass14Array1 = null;
			Class36.aClass36Array1 = null;
			Class13.aClass13Array1 = null;
			Class40.aClass40Array1 = null;
			Class44.aClass44Array1 = null;
			Class44.aClass18_9 = null;
			Class3.aClass3Array1 = null;
			super.aClass29_2 = null;
			Class8_Sub1_Sub2_Sub4_Sub1.aClass18_4 = null;
			Class8_Sub1_Sub1_Sub1.method69();
			Class32.method381();
			Class8_Sub1_Sub2_Sub5.method459();
			Class35.method446();
			System.gc();
		} catch (@Pc(373) RuntimeException local373) {
			signlink.reporterror("48320, " + 0 + ", " + local373.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method615() {
		try {
			this.aBoolean219 &= true;
			this.aClass8_Sub1_Sub1_Sub4_19 = new Class8_Sub1_Sub1_Sub4(this.aClass45_1, "titlebox", 0);
			this.aClass8_Sub1_Sub1_Sub4_20 = new Class8_Sub1_Sub1_Sub4(this.aClass45_1, "titlebutton", 0);
			this.aClass8_Sub1_Sub1_Sub4Array5 = new Class8_Sub1_Sub1_Sub4[12];
			@Pc(31) int local31 = 0;
			try {
				local31 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(38) Exception local38) {
			}
			@Pc(42) int local42;
			if (local31 == 0) {
				for (local42 = 0; local42 < 12; local42++) {
					this.aClass8_Sub1_Sub1_Sub4Array5[local42] = new Class8_Sub1_Sub1_Sub4(this.aClass45_1, "runes", local42);
				}
			} else {
				for (local42 = 0; local42 < 12; local42++) {
					this.aClass8_Sub1_Sub1_Sub4Array5[local42] = new Class8_Sub1_Sub1_Sub4(this.aClass45_1, "runes", (local42 & 0x3) + 12);
				}
			}
			this.aClass8_Sub1_Sub1_Sub3_11 = new Class8_Sub1_Sub1_Sub3(128, 265);
			this.aClass8_Sub1_Sub1_Sub3_12 = new Class8_Sub1_Sub1_Sub3(128, 265);
			for (local42 = 0; local42 < 33920; local42++) {
				this.aClass8_Sub1_Sub1_Sub3_11.anIntArray49[local42] = this.aClass29_22.anIntArray64[local42];
			}
			for (@Pc(118) int local118 = 0; local118 < 33920; local118++) {
				this.aClass8_Sub1_Sub1_Sub3_12.anIntArray49[local118] = this.aClass29_23.anIntArray64[local118];
			}
			this.anIntArray271 = new int[256];
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray271[local140] = local140 * 262144;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray271[local155 + 64] = local155 * 1024 + 16711680;
			}
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray271[local174 + 128] = local174 * 4 + 16776960;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray271[local193 + 192] = 16777215;
			}
			this.anIntArray272 = new int[256];
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray272[local212] = local212 * 1024;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray272[local227 + 64] = local227 * 4 + 65280;
			}
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray272[local246 + 128] = local246 * 262144 + 65535;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray272[local265 + 192] = 16777215;
			}
			this.anIntArray273 = new int[256];
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray273[local284] = local284 * 4;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray273[local299 + 64] = local299 * 262144 + 255;
			}
			for (@Pc(318) int local318 = 0; local318 < 64; local318++) {
				this.anIntArray273[local318 + 128] = local318 * 1024 + 16711935;
			}
			for (@Pc(337) int local337 = 0; local337 < 64; local337++) {
				this.anIntArray273[local337 + 192] = 16777215;
			}
			this.anIntArray270 = new int[256];
			this.anIntArray219 = new int[32768];
			this.anIntArray220 = new int[32768];
			this.method663(this.aByte50, null);
			this.anIntArray216 = new int[32768];
			this.anIntArray217 = new int[32768];
			this.method579(10, "Connecting to fileserver");
			if (!this.aBoolean203) {
				this.aBoolean192 = true;
				this.aBoolean203 = true;
				this.method578(this, 2);
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("91697, " + true + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!GLMIQHJI;B)V")
	private void method616(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1, @OriginalArg(2) byte arg2) {
		try {
			arg1.method175(this.aByte45);
			@Pc(10) int local10 = arg1.method176(8);
			@Pc(16) int local16;
			if (local10 < this.anInt983) {
				for (local16 = local10; local16 < this.anInt983; local16++) {
					this.anIntArray248[this.anInt1014++] = this.anIntArray238[local16];
				}
			}
			if (local10 > this.anInt983) {
				signlink.reporterror(this.aString17 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt983 = 0;
			@Pc(64) boolean local64 = false;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(79) int local79 = this.anIntArray238[local16];
				@Pc(84) Class8_Sub1_Sub2_Sub4_Sub2 local84 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local79];
				@Pc(89) int local89 = arg1.method176(1);
				if (local89 == 0) {
					this.anIntArray238[this.anInt983++] = local79;
					local84.anInt558 = anInt927;
				} else {
					@Pc(112) int local112 = arg1.method176(2);
					if (local112 == 0) {
						this.anIntArray238[this.anInt983++] = local79;
						local84.anInt558 = anInt927;
						this.anIntArray233[this.anInt962++] = local79;
					} else {
						@Pc(163) int local163;
						@Pc(173) int local173;
						if (local112 == 1) {
							this.anIntArray238[this.anInt983++] = local79;
							local84.anInt558 = anInt927;
							local163 = arg1.method176(3);
							local84.method375(false, local163, 908);
							local173 = arg1.method176(1);
							if (local173 == 1) {
								this.anIntArray233[this.anInt962++] = local79;
							}
						} else if (local112 == 2) {
							this.anIntArray238[this.anInt983++] = local79;
							local84.anInt558 = anInt927;
							local163 = arg1.method176(3);
							local84.method375(true, local163, 908);
							local173 = arg1.method176(3);
							local84.method375(true, local173, 908);
							@Pc(231) int local231 = arg1.method176(1);
							if (local231 == 1) {
								this.anIntArray233[this.anInt962++] = local79;
							}
						} else if (local112 == 3) {
							this.anIntArray248[this.anInt1014++] = local79;
						}
					}
				}
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("66969, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method617(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1077 = arg0;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("93810, " + 15546 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Ljava/lang/String;")
	private String method618() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("12190, " + -14660 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method619(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(5) int[] local5 = this.aClass8_Sub1_Sub1_Sub3_13.anIntArray49;
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
						this.aClass32_1.method417(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass32_1.method417(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass8_Sub1_Sub1_Sub3_13.method262();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method713(local34, local142, local36, local146, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method713(local34, local142, local36, local146, arg0 + 1);
					}
				}
			}
			this.aClass29_8.method339();
			this.anInt919 = 0;
			if (arg1 != this.aByte43) {
				this.anInt951 = -268;
			}
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
					@Pc(231) int local231 = this.aClass32_1.method411(this.anInt1042, local146, local221);
					if (local231 != 0) {
						local231 = local231 >> 14 & 0x7FFF;
						@Pc(243) int local243 = Class33.method443(local231).anInt635;
						if (local243 >= 0) {
							@Pc(247) int local247 = local146;
							@Pc(249) int local249 = local221;
							if (local243 != 22 && local243 != 29 && local243 != 34 && local243 != 36 && local243 != 46 && local243 != 47 && local243 != 48) {
								@Pc(281) int[][] local281 = this.aClass11Array1[this.anInt1042].anIntArrayArray8;
								for (@Pc(283) int local283 = 0; local283 < 10; local283++) {
									@Pc(290) int local290 = (int) (Math.random() * 4.0D);
									if (local290 == 0 && local247 > 0 && local247 > local146 - 3 && (local281[local247 - 1][local249] & 0x1280108) == 0) {
										local247--;
									}
									if (local290 == 1 && local247 < 103 && local247 < local146 + 3 && (local281[local247 + 1][local249] & 0x1280180) == 0) {
										local247++;
									}
									if (local290 == 2 && local249 > 0 && local249 > local221 - 3 && (local281[local247][local249 - 1] & 0x1280102) == 0) {
										local249--;
									}
									if (local290 == 3 && local249 < 103 && local249 < local221 + 3 && (local281[local247][local249 + 1] & 0x1280120) == 0) {
										local249++;
									}
								}
							}
							this.aClass8_Sub1_Sub1_Sub3Array7[this.anInt919] = this.aClass8_Sub1_Sub1_Sub3Array4[local243];
							this.anIntArray223[this.anInt919] = local247;
							this.anIntArray224[this.anInt919] = local249;
							this.anInt919++;
						}
					}
				}
			}
		} catch (@Pc(420) RuntimeException local420) {
			signlink.reporterror("97102, " + arg0 + ", " + arg1 + ", " + local420.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!WAJZGBEE;)V")
	private void method620(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub2_Sub4 arg1) {
		try {
			this.method621(arg1.anInt562, arg1.anInt563, 190, arg0);
			if (this.anInt1064 == 9) {
				;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("38681, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method667(arg1, this.anInt1042, arg0) - arg3;
				@Pc(33) int local33 = arg0 - this.anInt872;
				@Pc(38) int local38 = local28 - this.anInt873;
				@Pc(43) int local43 = arg1 - this.anInt874;
				@Pc(47) boolean local47 = false;
				@Pc(52) int local52 = Class8_Sub1_Sub2_Sub5.anIntArray153[this.anInt875];
				@Pc(57) int local57 = Class8_Sub1_Sub2_Sub5.anIntArray154[this.anInt875];
				@Pc(62) int local62 = Class8_Sub1_Sub2_Sub5.anIntArray153[this.anInt876];
				@Pc(67) int local67 = Class8_Sub1_Sub2_Sub5.anIntArray154[this.anInt876];
				@Pc(77) int local77 = local43 * local62 + local33 * local67 >> 16;
				@Pc(87) int local87 = local43 * local67 - local33 * local62 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local38 * local57 - local87 * local52 >> 16;
				@Pc(109) int local109 = local38 * local52 + local87 * local57 >> 16;
				if (local109 >= 50) {
					this.anInt975 = Class8_Sub1_Sub1_Sub1.anInt154 + (local89 << 9) / local109;
					this.anInt976 = Class8_Sub1_Sub1_Sub1.anInt155 + (local99 << 9) / local109;
				} else {
					this.anInt975 = -1;
					this.anInt976 = -1;
				}
			} else {
				this.anInt975 = -1;
				this.anInt976 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("38756, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method622() {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt858; local8++) {
				if (this.anIntArray257[local8] <= 0) {
					@Pc(17) boolean local17 = false;
					try {
						if (this.anIntArray225[local8] != this.anInt903 || this.anIntArray213[local8] != this.anInt1000) {
							@Pc(50) Class8_Sub1_Sub3 local50 = Class7.method33(this.anIntArray213[local8], this.anIntArray225[local8]);
							if (System.currentTimeMillis() + (long) (local50.anInt253 / 22) > this.aLong30 + (long) (this.anInt851 / 22)) {
								this.anInt851 = local50.anInt253;
								this.aLong30 = System.currentTimeMillis();
								if (this.method655(local50.aByteArray9, local50.anInt253)) {
									this.anInt903 = this.anIntArray225[local8];
									this.anInt1000 = this.anIntArray213[local8];
								} else {
									local17 = true;
								}
							}
						} else if (!this.method605()) {
							local17 = true;
						}
					} catch (@Pc(100) Exception local100) {
					}
					if (local17 && this.anIntArray257[local8] != -5) {
						this.anIntArray257[local8] = -5;
					} else {
						this.anInt858--;
						for (@Pc(116) int local116 = local8; local116 < this.anInt858; local116++) {
							this.anIntArray225[local116] = this.anIntArray225[local116 + 1];
							this.anIntArray213[local116] = this.anIntArray213[local116 + 1];
							this.anIntArray257[local116] = this.anIntArray257[local116 + 1];
						}
						local8--;
					}
				} else {
					@Pc(168) int local168 = this.anIntArray257[local8]--;
				}
			}
			if (this.anInt886 > 0) {
				this.anInt886 -= 20;
				if (this.anInt886 < 0) {
					this.anInt886 = 0;
				}
				if (this.anInt886 == 0 && this.aBoolean227 && !aBoolean197) {
					this.anInt921 = this.anInt864;
					this.aBoolean204 = true;
					this.aClass21_Sub1_1.method305(2, this.anInt921);
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("37969, " + -871 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZBI)V")
	private void method624(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			signlink.anInt1074 = arg2;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("61416, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!GLMIQHJI;I)V")
	private void method625(@OriginalArg(1) Class8_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1014 = 0;
			this.anInt962 = 0;
			this.method616(arg1, arg0, (byte) 9);
			this.method684(arg1, arg0);
			this.method603(arg1, arg0);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt1014; local30++) {
				local37 = this.anIntArray248[local30];
				if (this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local37].anInt558 != anInt927) {
					this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local37].aClass26_2 = null;
					this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local37] = null;
				}
			}
			if (arg0.anInt253 != arg1) {
				signlink.reporterror(this.aString17 + " size mismatch in getnpcpos - pos:" + arg0.anInt253 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt983; local37++) {
				if (this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray238[local37]] == null) {
					signlink.reporterror(this.aString17 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt983);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("93790, " + 292 + ", " + arg0 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method575() {
		try {
			if (this.aBoolean222 || this.aBoolean207 || this.aBoolean223) {
				this.method664();
			} else {
				anInt879++;
				if (this.aBoolean219) {
					this.method696();
				} else {
					this.method595(false);
				}
				this.anInt950 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("4134, " + 1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method626() {
		try {
			try {
				if (this.aClass25_1 != null) {
					this.aClass25_1.method290();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass25_1 = null;
			this.aBoolean219 = false;
			this.anInt984 = 0;
			this.aString17 = "";
			this.aString18 = "";
			this.method681();
			this.aClass32_1.method382();
			for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
				this.aClass11Array1[local34].method117();
			}
			System.gc();
			this.method657();
			this.anInt864 = -1;
			this.anInt921 = -1;
			this.anInt886 = 0;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("11429, " + 348 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method627(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 >> 7 == this.anInt1021 && aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 >> 7 == this.anInt1022) {
				this.anInt1021 = 0;
			}
			@Pc(21) int local21 = this.anInt961;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class8_Sub1_Sub2_Sub4_Sub1 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass8_Sub1_Sub2_Sub4_Sub1_1;
					local38 = this.anInt960 << 14;
				} else {
					local33 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray232[local27]];
					local38 = this.anIntArray232[local27] << 14;
				}
				if (local33 != null && local33.method378((byte) 4)) {
					local33.aBoolean120 = false;
					if ((aBoolean197 && this.anInt961 > 50 || this.anInt961 > 200) && !arg0 && local33.anInt587 == local33.anInt546) {
						local33.aBoolean120 = true;
					}
					@Pc(89) int local89 = local33.anInt562 >> 7;
					@Pc(94) int local94 = local33.anInt563 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass8_Sub1_Sub2_Sub5_1 == null || anInt927 < local33.anInt526 || anInt927 >= local33.anInt527) {
							if ((local33.anInt562 & 0x7F) == 64 && (local33.anInt563 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local89][local94] == this.anInt949) {
									continue;
								}
								this.anIntArrayArray22[local89][local94] = this.anInt949;
							}
							local33.anInt531 = this.method667(local33.anInt563, this.anInt1042, local33.anInt562);
							this.aClass32_1.method393(this.anInt1042, local33.aBoolean123, local38, local33, local33.anInt563, local33.anInt562, local33.anInt564, 60, local33.anInt531);
						} else {
							local33.aBoolean120 = false;
							local33.anInt531 = this.method667(local33.anInt563, this.anInt1042, local33.anInt562);
							this.aClass32_1.method394(local33.anInt521, local33.anInt563, local33, this.anInt1042, local33.anInt564, local33.anInt531, local38, local33.anInt519, local33.anInt520, local33.anInt522, local33.anInt562);
						}
					}
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("10667, " + arg0 + ", " + false + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method628() {
		try {
			this.aBoolean221 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray269[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class14.anInt240; local15++) {
					if (!Class14.aClass14Array1[local15].aBoolean60 && Class14.aClass14Array1[local15].anInt241 == local6 + (this.aBoolean224 ? 0 : 7)) {
						this.anIntArray269[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("55355, " + 2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method629() {
		try {
			this.aClass29_7.method339();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt905 == 2) {
				@Pc(13) byte[] local13 = this.aClass8_Sub1_Sub1_Sub4_2.aByteArray18;
				@Pc(15) int[] local15 = Class8_Sub1_Sub1.anIntArray157;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass8_Sub1_Sub1_Sub3_3.method271(this.anIntArray235, 0, 25, 33, this.anInt912, this.anIntArray231, 256, 25, 0, 33);
				this.aClass29_8.method339();
			} else {
				@Pc(64) int local64 = this.anInt912 + this.anInt1011 & 0x7FF;
				@Pc(71) int local71 = aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 / 32 + 48;
				local18 = 464 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 / 32;
				this.aClass8_Sub1_Sub1_Sub3_13.method271(this.anIntArray215, 5, local71, 151, local64, this.anIntArray230, this.anInt934 + 256, local18, 25, 146);
				this.aClass8_Sub1_Sub1_Sub3_3.method271(this.anIntArray235, 0, 25, 33, this.anInt912, this.anIntArray231, 256, 25, 0, 33);
				for (local20 = 0; local20 < this.anInt919; local20++) {
					local71 = this.anIntArray223[local20] * 4 + 2 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 / 32;
					local18 = this.anIntArray224[local20] * 4 + 2 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 / 32;
					this.method669(this.aClass8_Sub1_Sub1_Sub3Array7[local20], local18, (byte) 1, local71);
				}
				@Pc(166) int local166;
				for (@Pc(162) int local162 = 0; local162 < 104; local162++) {
					for (local166 = 0; local166 < 104; local166++) {
						@Pc(178) Class37 local178 = this.aClass37ArrayArrayArray1[this.anInt1042][local162][local166];
						if (local178 != null) {
							local71 = local162 * 4 + 2 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 / 32;
							local18 = local166 * 4 + 2 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 / 32;
							this.method669(this.aClass8_Sub1_Sub1_Sub3_4, local18, (byte) 1, local71);
						}
					}
				}
				for (local166 = 0; local166 < this.anInt983; local166++) {
					@Pc(229) Class8_Sub1_Sub2_Sub4_Sub2 local229 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray238[local166]];
					if (local229 != null && local229.method378((byte) 4)) {
						@Pc(238) Class26 local238 = local229.aClass26_2;
						if (local238.anIntArray61 != null) {
							local238 = local238.method323();
						}
						if (local238 != null && local238.aBoolean99) {
							local71 = local229.anInt562 / 32 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 / 32;
							local18 = local229.anInt563 / 32 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 / 32;
							this.method669(this.aClass8_Sub1_Sub1_Sub3_5, local18, (byte) 1, local71);
						}
					}
				}
				@Pc(294) Class8_Sub1_Sub2_Sub4_Sub1 local294;
				for (@Pc(284) int local284 = 0; local284 < this.anInt961; local284++) {
					local294 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray232[local284]];
					if (local294 != null && local294.method378((byte) 4)) {
						local71 = local294.anInt562 / 32 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 / 32;
						local18 = local294.anInt563 / 32 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 / 32;
						@Pc(322) boolean local322 = false;
						@Pc(326) long local326 = Class48.method559(local294.aString8);
						for (@Pc(328) int local328 = 0; local328 < this.anInt852; local328++) {
							if (local326 == this.aLongArray4[local328] && this.anIntArray226[local328] != 0) {
								local322 = true;
								break;
							}
						}
						@Pc(353) boolean local353 = false;
						if (aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt523 != 0 && local294.anInt523 != 0 && aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt523 == local294.anInt523) {
							local353 = true;
						}
						if (local322) {
							this.method669(this.aClass8_Sub1_Sub1_Sub3_7, local18, (byte) 1, local71);
						} else if (local353) {
							this.method669(this.aClass8_Sub1_Sub1_Sub3_8, local18, (byte) 1, local71);
						} else {
							this.method669(this.aClass8_Sub1_Sub1_Sub3_6, local18, (byte) 1, local71);
						}
					}
				}
				if (this.anInt943 != 0 && anInt927 % 20 < 10) {
					if (this.anInt943 == 1 && this.anInt888 >= 0 && this.anInt888 < this.aClass8_Sub1_Sub2_Sub4_Sub2Array1.length) {
						@Pc(431) Class8_Sub1_Sub2_Sub4_Sub2 local431 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[this.anInt888];
						if (local431 != null) {
							local71 = local431.anInt562 / 32 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 / 32;
							local18 = local431.anInt563 / 32 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 / 32;
							this.method631(this.aClass8_Sub1_Sub1_Sub3_10, local71, local18);
						}
					}
					if (this.anInt943 == 2) {
						local71 = (this.anInt937 - this.anInt944) * 4 + 2 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 / 32;
						local18 = (this.anInt938 - this.anInt945) * 4 + 2 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 / 32;
						this.method631(this.aClass8_Sub1_Sub1_Sub3_10, local71, local18);
					}
					if (this.anInt943 == 10 && this.anInt1010 >= 0 && this.anInt1010 < this.aClass8_Sub1_Sub2_Sub4_Sub1Array1.length) {
						local294 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[this.anInt1010];
						if (local294 != null) {
							local71 = local294.anInt562 / 32 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 / 32;
							local18 = local294.anInt563 / 32 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 / 32;
							this.method631(this.aClass8_Sub1_Sub1_Sub3_10, local71, local18);
						}
					}
				}
				if (this.anInt1021 != 0) {
					local71 = this.anInt1021 * 4 + 2 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 / 32;
					local18 = this.anInt1022 * 4 + 2 - aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 / 32;
					this.method669(this.aClass8_Sub1_Sub1_Sub3_9, local18, (byte) 1, local71);
				}
				Class8_Sub1_Sub1.method507(3, 97, 16777215, 78, 3);
				this.aClass29_8.method339();
			}
		} catch (@Pc(596) RuntimeException local596) {
			signlink.reporterror("24589, " + 13 + ", " + local596.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!USEDZXXV;)Z")
	private boolean method630(@OriginalArg(0) byte arg0, @OriginalArg(1) Class36 arg1) {
		try {
			if (arg1.anIntArray111 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg1.anIntArray111.length; local6++) {
				@Pc(14) int local14 = this.method656(local6, arg1);
				@Pc(19) int local19 = arg1.anIntArray112[local6];
				if (arg1.anIntArray111[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg1.anIntArray111[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg1.anIntArray111[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			if (arg0 != 21) {
				throw new NullPointerException();
			}
			return true;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("74759, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!INVDQNJU;III)V")
	private void method631(@OriginalArg(0) Class8_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) int local12 = arg1 * arg1 + arg2 * arg2;
			if (local12 > 4225 && local12 < 90000) {
				@Pc(26) int local26 = this.anInt912 + this.anInt1011 & 0x7FF;
				@Pc(30) int local30 = Class8_Sub1_Sub2_Sub5.anIntArray153[local26];
				@Pc(34) int local34 = Class8_Sub1_Sub2_Sub5.anIntArray154[local26];
				@Pc(43) int local43 = local30 * 256 / (this.anInt934 + 256);
				@Pc(52) int local52 = local34 * 256 / (this.anInt934 + 256);
				@Pc(62) int local62 = arg2 * local43 + arg1 * local52 >> 16;
				@Pc(72) int local72 = arg2 * local52 - arg1 * local43 >> 16;
				@Pc(78) double local78 = Math.atan2((double) local62, (double) local72);
				@Pc(84) int local84 = (int) (Math.sin(local78) * 63.0D);
				@Pc(90) int local90 = (int) (Math.cos(local78) * 57.0D);
				this.aClass8_Sub1_Sub1_Sub3_16.method272(local84 + 94 + 4 - 10, 83 - local90 - 20, local78);
			} else {
				this.method669(arg0, arg2, (byte) 1, arg1);
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("46493, " + arg0 + ", " + -46 + ", " + arg1 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method632() {
		try {
			try {
				@Pc(12) int local12 = aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 + this.anInt1032;
				@Pc(18) int local18 = aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 + this.anInt862;
				if (this.anInt880 - local12 < -500 || this.anInt880 - local12 > 500 || this.anInt881 - local18 < -500 || this.anInt881 - local18 > 500) {
					this.anInt880 = local12;
					this.anInt881 = local18;
				}
				if (this.anInt880 != local12) {
					this.anInt880 += (local12 - this.anInt880) / 16;
				}
				if (this.anInt881 != local18) {
					this.anInt881 += (local18 - this.anInt881) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt913 += (-this.anInt913 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt913 += (24 - this.anInt913) / 2;
				} else {
					this.anInt913 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt914 += (12 - this.anInt914) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt914 += (-this.anInt914 - 12) / 2;
				} else {
					this.anInt914 /= 2;
				}
				this.anInt912 = this.anInt912 + this.anInt913 / 2 & 0x7FF;
				this.anInt911 += this.anInt914 / 2;
				if (this.anInt911 < 128) {
					this.anInt911 = 128;
				}
				if (this.anInt911 > 383) {
					this.anInt911 = 383;
				}
				@Pc(205) int local205 = this.anInt880 >> 7;
				@Pc(210) int local210 = this.anInt881 >> 7;
				@Pc(220) int local220 = this.method667(this.anInt881, this.anInt1042, this.anInt880);
				@Pc(222) int local222 = 0;
				@Pc(238) int local238;
				if (local205 > 3 && local210 > 3 && local205 < 100 && local210 < 100) {
					for (local238 = local205 - 4; local238 <= local205 + 4; local238++) {
						for (@Pc(244) int local244 = local210 - 4; local244 <= local210 + 4; local244++) {
							@Pc(249) int local249 = this.anInt1042;
							if (local249 < 3 && (this.aByteArrayArrayArray8[1][local238][local244] & 0x2) == 2) {
								local249++;
							}
							@Pc(276) int local276 = local220 - this.anIntArrayArrayArray7[local249][local238][local244];
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
				if (local238 > this.anInt918) {
					this.anInt918 += (local238 - this.anInt918) / 24;
				} else if (local238 < this.anInt918) {
					this.anInt918 += (local238 - this.anInt918) / 80;
				}
			} catch (@Pc(340) Exception local340) {
				signlink.reporterror("glfc_ex " + aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 + "," + aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 + "," + this.anInt880 + "," + this.anInt881 + "," + this.anInt978 + "," + this.anInt979 + "," + this.anInt944 + "," + this.anInt945);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(390) RuntimeException local390) {
			signlink.reporterror("22771, " + 3 + ", " + local390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method633() {
		try {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt984 == 0) {
				local17 = super.anInt835 / 2 - 80;
				local24 = super.anInt836 / 2 + 20;
				local24 += 20;
				if (super.anInt844 == 1 && super.anInt845 >= local17 - 75 && super.anInt845 <= local17 + 75 && super.anInt846 >= local24 - 20 && super.anInt846 <= local24 + 20) {
					this.anInt984 = 3;
					this.anInt1031 = 0;
				}
				local17 = super.anInt835 / 2 + 80;
				if (super.anInt844 == 1 && super.anInt845 >= local17 - 75 && super.anInt845 <= local17 + 75 && super.anInt846 >= local24 - 20 && super.anInt846 <= local24 + 20) {
					this.aString23 = "";
					this.aString24 = "Enter your username & password.";
					this.anInt984 = 2;
					this.anInt1031 = 0;
				}
			} else if (this.anInt984 == 2) {
				local17 = super.anInt836 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt844 == 1 && super.anInt846 >= local17 - 15 && super.anInt846 < local17) {
					this.anInt1031 = 0;
				}
				local17 += 15;
				if (super.anInt844 == 1 && super.anInt846 >= local17 - 15 && super.anInt846 < local17) {
					this.anInt1031 = 1;
				}
				local17 += 15;
				local24 = super.anInt835 / 2 - 80;
				@Pc(170) int local170 = super.anInt836 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt844 == 1 && super.anInt845 >= local24 - 75 && super.anInt845 <= local24 + 75 && super.anInt846 >= local171 - 20 && super.anInt846 <= local171 + 20) {
					this.anInt966 = 0;
					this.method635(this.aString17, this.aString18, false);
					if (this.aBoolean219) {
						return;
					}
				}
				local24 = super.anInt835 / 2 + 80;
				if (super.anInt844 == 1 && super.anInt845 >= local24 - 75 && super.anInt845 <= local24 + 75 && super.anInt846 >= local171 - 20 && super.anInt846 <= local171 + 20) {
					this.anInt984 = 0;
					this.aString17 = "";
					this.aString18 = "";
				}
				while (true) {
					while (true) {
						@Pc(261) int local261 = this.method571();
						if (local261 == -1) {
							return;
						}
						@Pc(266) boolean local266 = false;
						for (@Pc(268) int local268 = 0; local268 < aString21.length(); local268++) {
							if (local261 == aString21.charAt(local268)) {
								local266 = true;
								break;
							}
						}
						if (this.anInt1031 == 0) {
							if (local261 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt1031 = 1;
							}
							if (local266) {
								this.aString17 = this.aString17 + (char) local261;
							}
							if (this.aString17.length() > 12) {
								this.aString17 = this.aString17.substring(0, 12);
							}
						} else if (this.anInt1031 == 1) {
							if (local261 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt1031 = 0;
							}
							if (local266) {
								this.aString18 = this.aString18 + (char) local261;
							}
							if (this.aString18.length() > 20) {
								this.aString18 = this.aString18.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt984 == 3) {
				local17 = super.anInt835 / 2;
				local24 = super.anInt836 / 2 + 50;
				@Pc(425) int local425 = local24 + 20;
				if (super.anInt844 == 1 && super.anInt845 >= local17 - 75 && super.anInt845 <= local17 + 75 && super.anInt846 >= local425 - 20 && super.anInt846 <= local425 + 20) {
					this.anInt984 = 0;
					return;
				}
			}
		} catch (@Pc(458) RuntimeException local458) {
			signlink.reporterror("39402, " + -44097 + ", " + local458.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method634() {
		try {
			this.aClass29_9.method339();
			Class8_Sub1_Sub1_Sub1.anIntArray25 = this.anIntArray251;
			this.aClass8_Sub1_Sub1_Sub4_3.method519(0, 272, 0);
			if (this.aBoolean214) {
				this.aClass8_Sub1_Sub1_Sub2_4.method101(40, 239, this.aString30, 0);
				this.aClass8_Sub1_Sub1_Sub2_4.method101(60, 239, this.aString26 + "*", 128);
			} else if (this.anInt963 == 1) {
				this.aClass8_Sub1_Sub1_Sub2_4.method101(40, 239, "Enter amount:", 0);
				this.aClass8_Sub1_Sub1_Sub2_4.method101(60, 239, this.aString29 + "*", 128);
			} else if (this.anInt963 == 2) {
				this.aClass8_Sub1_Sub1_Sub2_4.method101(40, 239, "Enter name:", 0);
				this.aClass8_Sub1_Sub1_Sub2_4.method101(60, 239, this.aString29 + "*", 128);
			} else if (this.aString20 != null) {
				this.aClass8_Sub1_Sub1_Sub2_4.method101(40, 239, this.aString20, 0);
				this.aClass8_Sub1_Sub1_Sub2_4.method101(60, 239, "Click to continue", 128);
			} else if (this.anInt1043 != -1) {
				this.method712(Class36.aClass36Array1[this.anInt1043], 0, 0, 0);
			} else if (this.anInt1023 == -1) {
				@Pc(161) Class8_Sub1_Sub1_Sub2 local161 = this.aClass8_Sub1_Sub1_Sub2_3;
				@Pc(163) int local163 = 0;
				Class8_Sub1_Sub1.method504(455, 0, 463, 77, 0);
				for (@Pc(171) int local171 = 0; local171 < 100; local171++) {
					if (this.aStringArray9[local171] != null) {
						@Pc(183) int local183 = this.anIntArray218[local171];
						@Pc(192) int local192 = this.anInt854 + 70 - local163 * 14;
						@Pc(197) String local197 = this.aStringArray8[local171];
						@Pc(199) byte local199 = 0;
						if (local197 != null && local197.startsWith("@cr1@")) {
							local197 = local197.substring(5);
							local199 = 1;
						}
						if (local197 != null && local197.startsWith("@cr2@")) {
							local197 = local197.substring(5);
							local199 = 2;
						}
						if (local183 == 0) {
							if (local192 > 0 && local192 < 110) {
								local161.method105(this.aStringArray9[local171], 0, 4, local192);
							}
							local163++;
						}
						@Pc(269) int local269;
						if ((local183 == 1 || local183 == 2) && (local183 == 1 || this.anInt1030 == 0 || this.anInt1030 == 1 && this.method604(local197))) {
							if (local192 > 0 && local192 < 110) {
								local269 = 4;
								if (local199 == 1) {
									this.aClass8_Sub1_Sub1_Sub4Array4[0].method519(4, 272, local192 - 12);
									local269 += 14;
								}
								if (local199 == 2) {
									this.aClass8_Sub1_Sub1_Sub4Array4[1].method519(local269, 272, local192 - 12);
									local269 += 14;
								}
								local161.method105(local197 + ":", 0, local269, local192);
								local269 += local161.method103(local197) + 8;
								local161.method105(this.aStringArray9[local171], 255, local269, local192);
							}
							local163++;
						}
						if ((local183 == 3 || local183 == 7) && this.anInt906 == 0 && (local183 == 7 || this.anInt953 == 0 || this.anInt953 == 1 && this.method604(local197))) {
							if (local192 > 0 && local192 < 110) {
								local161.method105("From", 0, 4, local192);
								local269 = local161.method103("From ") + 4;
								if (local199 == 1) {
									this.aClass8_Sub1_Sub1_Sub4Array4[0].method519(local269, 272, local192 - 12);
									local269 += 14;
								}
								if (local199 == 2) {
									this.aClass8_Sub1_Sub1_Sub4Array4[1].method519(local269, 272, local192 - 12);
									local269 += 14;
								}
								local161.method105(local197 + ":", 0, local269, local192);
								local269 += local161.method103(local197) + 8;
								local161.method105(this.aStringArray9[local171], 8388608, local269, local192);
							}
							local163++;
						}
						if (local183 == 4 && (this.anInt897 == 0 || this.anInt897 == 1 && this.method604(local197))) {
							if (local192 > 0 && local192 < 110) {
								local161.method105(local197 + " " + this.aStringArray9[local171], 8388736, 4, local192);
							}
							local163++;
						}
						if (local183 == 5 && this.anInt906 == 0 && this.anInt953 < 2) {
							if (local192 > 0 && local192 < 110) {
								local161.method105(this.aStringArray9[local171], 8388608, 4, local192);
							}
							local163++;
						}
						if (local183 == 6 && this.anInt906 == 0 && this.anInt953 < 2) {
							if (local192 > 0 && local192 < 110) {
								local161.method105("To " + local197 + ":", 0, 4, local192);
								local161.method105(this.aStringArray9[local171], 8388608, local161.method103("To " + local197) + 12, local192);
							}
							local163++;
						}
						if (local183 == 8 && (this.anInt897 == 0 || this.anInt897 == 1 && this.method604(local197))) {
							if (local192 > 0 && local192 < 110) {
								local161.method105(local197 + " " + this.aStringArray9[local171], 8270336, 4, local192);
							}
							local163++;
						}
					}
				}
				Class8_Sub1_Sub1.method503();
				this.anInt964 = local163 * 14 + 7;
				if (this.anInt964 < 78) {
					this.anInt964 = 78;
				}
				this.method649(this.anInt964, this.anInt964 - this.anInt854 - 77, 77, 463, 0);
				@Pc(639) String local639;
				if (aClass8_Sub1_Sub2_Sub4_Sub1_1 == null || aClass8_Sub1_Sub2_Sub4_Sub1_1.aString8 == null) {
					local639 = Class48.method563(this.aString17);
				} else {
					local639 = aClass8_Sub1_Sub2_Sub4_Sub1_1.aString8;
				}
				local161.method105(local639 + ":", 0, 4, 90);
				local161.method105(this.aString22 + "*", 255, local161.method103(local639 + ": ") + 6, 90);
				Class8_Sub1_Sub1.method510(0, 0, 479, 77);
			} else {
				this.method712(Class36.aClass36Array1[this.anInt1023], 0, 0, 0);
			}
			if (this.aBoolean216 && this.anInt1001 == 2) {
				this.method584();
			}
			this.aClass29_9.method340(super.aGraphics2, 17, 357);
			this.aClass29_8.method339();
			Class8_Sub1_Sub1_Sub1.anIntArray25 = this.anIntArray253;
		} catch (@Pc(724) RuntimeException local724) {
			signlink.reporterror("609, " + 7 + ", " + local724.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method635(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString23 = "";
				this.aString24 = "Connecting to server...";
				this.method595(true);
			}
			this.aClass25_1 = new Class25(this, this.method676(anInt878 + 43594), 614);
			@Pc(30) long local30 = Class48.method559(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass8_Sub1_Sub3_6.anInt253 = 0;
			this.aClass8_Sub1_Sub3_6.method155(14);
			this.aClass8_Sub1_Sub3_6.method155(local37);
			this.aClass25_1.method294(this.aClass8_Sub1_Sub3_6.aByteArray9, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass25_1.method291();
			}
			@Pc(74) int local74 = this.aClass25_1.method291();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass25_1.method293(this.aClass8_Sub1_Sub3_7.aByteArray9, 0, 8);
				this.aClass8_Sub1_Sub3_7.anInt253 = 0;
				this.aLong33 = this.aClass8_Sub1_Sub3_7.method171();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong33 >> 32), (int) this.aLong33 };
				this.aClass8_Sub1_Sub3_6.anInt253 = 0;
				this.aClass8_Sub1_Sub3_6.method155(10);
				this.aClass8_Sub1_Sub3_6.method159(local99[0]);
				this.aClass8_Sub1_Sub3_6.method159(local99[1]);
				this.aClass8_Sub1_Sub3_6.method159(local99[2]);
				this.aClass8_Sub1_Sub3_6.method159(local99[3]);
				this.aClass8_Sub1_Sub3_6.method159(signlink.anInt1069);
				this.aClass8_Sub1_Sub3_6.method162(arg0);
				this.aClass8_Sub1_Sub3_6.method162(arg1);
				this.aClass8_Sub1_Sub3_6.method180(aBigInteger2, aBigInteger1);
				this.aClass8_Sub1_Sub3_8.anInt253 = 0;
				if (arg2) {
					this.aClass8_Sub1_Sub3_8.method155(18);
				} else {
					this.aClass8_Sub1_Sub3_8.method155(16);
				}
				this.aClass8_Sub1_Sub3_8.method155(this.aClass8_Sub1_Sub3_6.anInt253 + 36 + 1 + 1 + 2);
				this.aClass8_Sub1_Sub3_8.method155(255);
				this.aClass8_Sub1_Sub3_8.method156(308);
				this.aClass8_Sub1_Sub3_8.method155(aBoolean197 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass8_Sub1_Sub3_8.method159(this.anIntArray245[local225]);
				}
				this.aClass8_Sub1_Sub3_8.method163(this.aClass8_Sub1_Sub3_6.anInt253, this.aClass8_Sub1_Sub3_6.aByteArray9);
				this.aClass8_Sub1_Sub3_6.aClass5_1 = new Class5((byte) 1, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass5_2 = new Class5((byte) 1, local99);
				this.aClass25_1.method294(this.aClass8_Sub1_Sub3_8.aByteArray9, this.aClass8_Sub1_Sub3_8.anInt253);
				local74 = this.aClass25_1.method291();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method635(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt931 = this.aClass25_1.method291();
					aBoolean213 = this.aClass25_1.method291() == 1;
					this.aLong29 = 0L;
					this.anInt992 = 0;
					this.aClass42_1.anInt769 = 0;
					super.aBoolean191 = true;
					this.aBoolean202 = true;
					this.aBoolean219 = true;
					this.aClass8_Sub1_Sub3_6.anInt253 = 0;
					this.aClass8_Sub1_Sub3_7.anInt253 = 0;
					this.anInt955 = -1;
					this.anInt967 = -1;
					this.anInt968 = -1;
					this.anInt969 = -1;
					this.anInt954 = 0;
					this.anInt956 = 0;
					this.anInt987 = 0;
					this.anInt958 = 0;
					this.anInt943 = 0;
					this.anInt1029 = 0;
					this.aBoolean216 = false;
					super.anInt837 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray9[local389] = null;
					}
					this.anInt970 = 0;
					this.anInt866 = 0;
					this.anInt895 = 0;
					this.anInt858 = 0;
					this.anInt1032 = (int) (Math.random() * 100.0D) - 50;
					this.anInt862 = (int) (Math.random() * 110.0D) - 55;
					this.anInt988 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1011 = (int) (Math.random() * 120.0D) - 60;
					this.anInt934 = (int) (Math.random() * 30.0D) - 20;
					this.anInt912 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt905 = 0;
					this.anInt908 = -1;
					this.anInt1021 = 0;
					this.anInt1022 = 0;
					this.anInt961 = 0;
					this.anInt983 = 0;
					for (local225 = 0; local225 < this.anInt959; local225++) {
						this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local225] = null;
						this.aClass8_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local259] = null;
					}
					aClass8_Sub1_Sub2_Sub4_Sub1_1 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[this.anInt960] = new Class8_Sub1_Sub2_Sub4_Sub1();
					this.aClass37_12.method495();
					this.aClass37_11.method495();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass37ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass37_10 = new Class37((byte) 3);
					this.anInt853 = 0;
					this.anInt852 = 0;
					this.anInt1023 = -1;
					this.anInt1043 = -1;
					this.anInt870 = -1;
					this.anInt891 = -1;
					this.anInt985 = -1;
					this.aBoolean233 = false;
					this.anInt884 = 3;
					this.anInt963 = 0;
					this.aBoolean216 = false;
					this.aBoolean214 = false;
					this.aString20 = null;
					this.anInt974 = 0;
					this.anInt907 = -1;
					this.aBoolean224 = true;
					this.method628();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray254[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray10[local538] = null;
						this.aBooleanArray11[local538] = false;
					}
					anInt1007 = 0;
					anInt1013 = 0;
					anInt909 = 0;
					anInt904 = 0;
					anInt996 = 0;
					anInt1051 = 0;
					anInt998 = 0;
					this.method639();
				} else if (local74 == 3) {
					this.aString23 = "";
					this.aString24 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString23 = "Your account has been disabled.";
					this.aString24 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString23 = "Your account is already logged in.";
					this.aString24 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString23 = "RuneScape has been updated!";
					this.aString24 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString23 = "This world is full.";
					this.aString24 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString23 = "Unable to connect.";
					this.aString24 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString23 = "Login limit exceeded.";
					this.aString24 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString23 = "Unable to connect.";
					this.aString24 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString24 = "Login server rejected session.";
					this.aString24 = "Please try again.";
				} else if (local74 == 12) {
					this.aString23 = "You need a members account to login to this world.";
					this.aString24 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString23 = "Could not complete login.";
					this.aString24 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString23 = "The server is being updated.";
					this.aString24 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean219 = true;
					this.aClass8_Sub1_Sub3_6.anInt253 = 0;
					this.aClass8_Sub1_Sub3_7.anInt253 = 0;
					this.anInt955 = -1;
					this.anInt967 = -1;
					this.anInt968 = -1;
					this.anInt969 = -1;
					this.anInt954 = 0;
					this.anInt956 = 0;
					this.anInt987 = 0;
					this.anInt1029 = 0;
					this.aBoolean216 = false;
					this.aLong31 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString23 = "Login attempts exceeded.";
					this.aString24 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString23 = "You are standing in a members-only area.";
					this.aString24 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString23 = "Invalid loginserver requested";
					this.aString24 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local389 = this.aClass25_1.method291(); local389 >= 0; local389--) {
						this.aString23 = "You have only just left another world";
						this.aString24 = "Your profile will be transferred in: " + local389 + " seconds";
						this.method595(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(899) Exception local899) {
						}
					}
					this.method635(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString23 = "Unexpected server response";
					this.aString24 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString23 = "No response from server";
					this.aString24 = "Please try using a different world.";
				} else if (this.anInt966 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(921) Exception local921) {
					}
					this.anInt966++;
					this.method635(arg0, arg1, arg2);
				} else {
					this.aString23 = "No response from loginserver";
					this.aString24 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(964) IOException local964) {
			this.aString23 = "";
			this.aString24 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIIII)V")
	private void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class8_Sub2 local1 = null;
			for (@Pc(6) Class8_Sub2 local6 = (Class8_Sub2) this.aClass37_10.method491(); local6 != null; local6 = (Class8_Sub2) this.aClass37_10.method493()) {
				if (local6.anInt204 == arg0 && local6.anInt206 == arg4 && local6.anInt207 == arg1 && local6.anInt205 == arg5) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class8_Sub2();
				local1.anInt204 = arg0;
				local1.anInt205 = arg5;
				local1.anInt206 = arg4;
				local1.anInt207 = arg1;
				this.method662(local1);
				this.aClass37_10.method488(local1);
			}
			local1.anInt211 = arg3;
			local1.anInt213 = arg2;
			local1.anInt212 = arg6;
			local1.anInt214 = arg7;
			local1.anInt203 = arg8;
			this.aBoolean219 &= true;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("73337, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)V")
	private void method638(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class36 local3 = Class36.aClass36Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray108.length && local3.anIntArray108[local5] != -1; local5++) {
				@Pc(20) Class36 local20 = Class36.aClass36Array1[local3.anIntArray108[local5]];
				if (local20.anInt669 == 1) {
					this.method638(local20.anInt684);
				}
				local20.anInt665 = 0;
				local20.anInt659 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("39658, " + arg0 + ", " + -97 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method639() {
		try {
			if (this.aClass29_9 == null) {
				this.method672();
				super.aClass29_2 = null;
				this.aClass29_19 = null;
				this.aClass29_20 = null;
				this.aClass29_21 = null;
				this.aClass29_22 = null;
				this.aClass29_23 = null;
				this.aClass29_24 = null;
				this.aClass29_25 = null;
				this.aClass29_26 = null;
				this.aClass29_27 = null;
				this.aClass29_9 = new Class29(96, 479, true, this.method577());
				this.aClass29_7 = new Class29(156, 172, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass8_Sub1_Sub1_Sub4_2.method519(0, 272, 0);
				this.aClass29_6 = new Class29(261, 190, true, this.method577());
				this.aClass29_8 = new Class29(334, 512, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass29_3 = new Class29(50, 496, true, this.method577());
				this.aClass29_4 = new Class29(37, 269, true, this.method577());
				this.aClass29_5 = new Class29(45, 249, true, this.method577());
				this.aBoolean200 = true;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("10401, " + 42263 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class36 local7 = Class36.aClass36Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray108.length && local7.anIntArray108[local9] != -1; local9++) {
				@Pc(24) Class36 local24 = Class36.aClass36Array1[local7.anIntArray108[local9]];
				if (local24.anInt669 == 1) {
					local3 |= this.method640(local24.anInt684, arg1);
				}
				if (local24.anInt669 == 6 && (local24.anInt677 != -1 || local24.anInt678 != -1)) {
					@Pc(55) boolean local55 = this.method630(this.aByte38, local24);
					@Pc(60) int local60;
					if (local55) {
						local60 = local24.anInt678;
					} else {
						local60 = local24.anInt677;
					}
					if (local60 != -1) {
						@Pc(72) Class40 local72 = Class40.aClass40Array1[local60];
						local24.anInt659 += arg1;
						while (local24.anInt659 > local72.method522(local24.anInt665)) {
							local24.anInt659 -= local72.method522(local24.anInt665) + 1;
							local24.anInt665++;
							if (local24.anInt665 >= local72.anInt753) {
								local24.anInt665 -= local72.anInt754;
								if (local24.anInt665 < 0 || local24.anInt665 >= local72.anInt753) {
									local24.anInt665 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			this.anInt954 += 0;
			return local3;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("23418, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method641() {
		try {
			this.aClass29_6.method339();
			Class8_Sub1_Sub1_Sub1.anIntArray25 = this.anIntArray252;
			this.aClass8_Sub1_Sub1_Sub4_1.method519(0, 272, 0);
			if (this.anInt891 != -1) {
				this.method712(Class36.aClass36Array1[this.anInt891], 0, 0, 0);
			} else if (this.anIntArray229[this.anInt884] != -1) {
				this.method712(Class36.aClass36Array1[this.anIntArray229[this.anInt884]], 0, 0, 0);
			}
			if (this.aBoolean216 && this.anInt1001 == 1) {
				this.method584();
			}
			this.aClass29_6.method340(super.aGraphics2, 553, 205);
			this.aClass29_8.method339();
			Class8_Sub1_Sub1_Sub1.anIntArray25 = this.anIntArray253;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("99078, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method642() {
		try {
			if (this.anInt906 != 0) {
				@Pc(8) int local8 = 0;
				if (this.anInt987 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray9[local15] != null) {
						@Pc(27) int local27 = this.anIntArray218[local15];
						@Pc(32) String local32 = this.aStringArray8[local15];
						if (local32 != null && local32.startsWith("@cr1@")) {
							local32 = local32.substring(5);
						}
						if (local32 != null && local32.startsWith("@cr2@")) {
							local32 = local32.substring(5);
						}
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt953 == 0 || this.anInt953 == 1 && this.method604(local32))) {
							@Pc(85) int local85 = 329 - local8 * 13;
							if (super.anInt839 > 4 && super.anInt840 - 4 > local85 - 10 && super.anInt840 - 4 <= local85 + 3) {
								@Pc(124) int local124 = this.aClass8_Sub1_Sub1_Sub2_3.method103("From:  " + local32 + this.aStringArray9[local15]) + 25;
								if (local124 > 450) {
									local124 = 450;
								}
								if (super.anInt839 < local124 + 4) {
									if (this.anInt931 >= 1) {
										this.aStringArray13[this.anInt1029] = "Report abuse @whi@" + local32;
										this.anIntArray242[this.anInt1029] = 2811;
										this.anInt1029++;
									}
									this.aStringArray13[this.anInt1029] = "Add ignore @whi@" + local32;
									this.anIntArray242[this.anInt1029] = 2694;
									this.anInt1029++;
									this.aStringArray13[this.anInt1029] = "Add friend @whi@" + local32;
									this.anIntArray242[this.anInt1029] = 2730;
									this.anInt1029++;
								}
							}
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if ((local27 == 5 || local27 == 6) && this.anInt953 < 2) {
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(237) RuntimeException local237) {
			signlink.reporterror("1614, " + 249 + ", " + local237.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method643() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray245[8] = 0;
			@Pc(14) int local14 = 0;
			while (this.anIntArray245[8] == 0) {
				@Pc(18) String local18 = "Unknown problem";
				this.method579(20, "Connecting to web server");
				try {
					@Pc(40) DataInputStream local40 = this.method668("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 308);
					@Pc(47) Class8_Sub1_Sub3 local47 = new Class8_Sub1_Sub3(new byte[40], -49015);
					local40.readFully(local47.aByteArray9, 0, 40);
					local40.close();
					for (@Pc(57) int local57 = 0; local57 < 9; local57++) {
						this.anIntArray245[local57] = local47.method170();
					}
					@Pc(72) int local72 = local47.method170();
					@Pc(74) int local74 = 1234;
					for (@Pc(76) int local76 = 0; local76 < 9; local76++) {
						local74 = (local74 << 1) + this.anIntArray245[local76];
					}
					if (local72 != local74) {
						local18 = "checksum problem";
						this.anIntArray245[8] = 0;
					}
				} catch (@Pc(103) EOFException local103) {
					local18 = "EOF problem";
					this.anIntArray245[8] = 0;
				} catch (@Pc(112) IOException local112) {
					local18 = "connection problem";
					this.anIntArray245[8] = 0;
				} catch (@Pc(121) Exception local121) {
					local18 = "logic problem";
					this.anIntArray245[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray245[8] == 0) {
					local14++;
					for (@Pc(139) int local139 = local3; local139 > 0; local139--) {
						if (local14 >= 10) {
							this.method579(10, "Game updated - please reload page");
							local139 = 10;
						} else {
							this.method579(10, local18 + " - Will retry in " + local139 + " secs.");
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
					this.aBoolean193 = !this.aBoolean193;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("25370, " + false + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method644() {
		try {
			if (this.anInt905 == 0 && super.anInt844 == 1) {
				@Pc(20) int local20 = super.anInt845 - 25 - 550;
				@Pc(27) int local27 = super.anInt846 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt912 + this.anInt1011 & 0x7FF;
					@Pc(51) int local51 = Class8_Sub1_Sub1_Sub1.anIntArray23[local47];
					@Pc(55) int local55 = Class8_Sub1_Sub1_Sub1.anIntArray24[local47];
					@Pc(64) int local64 = local51 * (this.anInt934 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt934 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 + local83 >> 7;
					@Pc(107) int local107 = aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 - local93 >> 7;
					@Pc(128) boolean local128 = this.method596(0, 0, 0, 1, true, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local100, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local107);
					if (local128) {
						this.aClass8_Sub1_Sub3_6.method155(local20);
						this.aClass8_Sub1_Sub3_6.method155(local27);
						this.aClass8_Sub1_Sub3_6.method156(this.anInt912);
						this.aClass8_Sub1_Sub3_6.method155(57);
						this.aClass8_Sub1_Sub3_6.method155(this.anInt1011);
						this.aClass8_Sub1_Sub3_6.method155(this.anInt934);
						this.aClass8_Sub1_Sub3_6.method155(89);
						this.aClass8_Sub1_Sub3_6.method156(aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562);
						this.aClass8_Sub1_Sub3_6.method156(aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563);
						this.aClass8_Sub1_Sub3_6.method155(this.anInt1006);
						this.aClass8_Sub1_Sub3_6.method155(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("68918, " + false + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method645() {
		try {
			@Pc(22) int local22;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(85) int local85;
			@Pc(94) int local94;
			@Pc(101) int local101;
			@Pc(169) int local169;
			try {
				this.anInt908 = -1;
				this.aClass37_11.method495();
				this.aClass37_12.method495();
				Class8_Sub1_Sub1_Sub1.method72();
				this.method681();
				this.aClass32_1.method382();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass11Array1[local22].method117();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class43 local77 = new Class43(154, this.anIntArrayArrayArray7, 104, 104, this.aByteArrayArrayArray8);
				local43 = this.aByteArrayArray5.length;
				Class43.aBoolean175 = Class32.aBoolean130;
				for (local85 = 0; local85 < local43; local85++) {
					local94 = this.anIntArray259[local85] >> 8;
					local101 = this.anIntArray259[local85] & 0xFF;
					if (local94 == 33 && local101 >= 71 && local101 <= 73) {
						Class43.aBoolean175 = false;
					}
				}
				if (Class43.aBoolean175) {
					this.aClass32_1.method383(this.anInt952, this.anInt1042);
				} else {
					this.aClass32_1.method383(this.anInt952, 0);
				}
				this.aClass8_Sub1_Sub3_6.method154(158);
				@Pc(290) int local290;
				@Pc(228) int local228;
				@Pc(278) int local278;
				if (!this.aBoolean231) {
					@Pc(174) byte[] local174;
					for (local94 = 0; local94 < local43; local94++) {
						local101 = (this.anIntArray259[local94] >> 8) * 64 - this.anInt944;
						local169 = (this.anIntArray259[local94] & 0xFF) * 64 - this.anInt945;
						local174 = this.aByteArrayArray5[local94];
						if (local174 != null) {
							local77.method545(this.aClass11Array1, (this.anInt979 - 6) * 8, local169, local101, local174, (this.anInt978 - 6) * 8);
						}
					}
					for (local101 = 0; local101 < local43; local101++) {
						local169 = (this.anIntArray259[local101] >> 8) * 64 - this.anInt944;
						local228 = (this.anIntArray259[local101] & 0xFF) * 64 - this.anInt945;
						@Pc(233) byte[] local233 = this.aByteArrayArray5[local101];
						if (local233 == null && this.anInt979 < 800) {
							local77.method537(64, local228, 64, local169);
						}
					}
					this.aClass8_Sub1_Sub3_6.method154(158);
					for (local169 = 0; local169 < local43; local169++) {
						local174 = this.aByteArrayArray4[local169];
						if (local174 != null) {
							local278 = (this.anIntArray259[local169] >> 8) * 64 - this.anInt944;
							local290 = (this.anIntArray259[local169] & 0xFF) * 64 - this.anInt945;
							local77.method533(this.anInt1034, local278, this.aClass11Array1, this.aClass32_1, local174, local290);
						}
					}
				}
				if (this.aBoolean231) {
					local94 = 0;
					label249: while (true) {
						@Pc(350) int local350;
						@Pc(356) int local356;
						@Pc(366) int local366;
						@Pc(368) int local368;
						if (local94 >= 4) {
							for (local101 = 0; local101 < 13; local101++) {
								for (local169 = 0; local169 < 13; local169++) {
									local228 = this.anIntArrayArrayArray8[0][local101][local169];
									if (local228 == -1) {
										local77.method537(8, local169 * 8, 8, local101 * 8);
									}
								}
							}
							this.aClass8_Sub1_Sub3_6.method154(158);
							local169 = 0;
							while (true) {
								if (local169 >= 4) {
									break label249;
								}
								for (local228 = 0; local228 < 13; local228++) {
									for (local278 = 0; local278 < 13; local278++) {
										local290 = this.anIntArrayArrayArray8[local169][local228][local278];
										if (local290 != -1) {
											local350 = local290 >> 24 & 0x3;
											local356 = local290 >> 1 & 0x3;
											local366 = local290 >> 14 & 0x3FF;
											local368 = local290 >> 3 & 0x7FF;
											@Pc(531) int local531 = (local366 / 8 << 8) + local368 / 8;
											for (@Pc(533) int local533 = 0; local533 < this.anIntArray259.length; local533++) {
												if (this.anIntArray259[local533] == local531 && this.aByteArrayArray4[local533] != null) {
													local77.method531(local278 * 8, local356, local228 * 8, local169, this.aByteArrayArray4[local533], (local366 & 0x7) * 8, local350, (local368 & 0x7) * 8, this.aClass11Array1, this.aClass32_1);
													break;
												}
											}
										}
									}
								}
								local169++;
							}
						}
						for (local101 = 0; local101 < 13; local101++) {
							for (local169 = 0; local169 < 13; local169++) {
								local228 = this.anIntArrayArrayArray8[local94][local101][local169];
								if (local228 != -1) {
									local278 = local228 >> 24 & 0x3;
									local290 = local228 >> 1 & 0x3;
									local350 = local228 >> 14 & 0x3FF;
									local356 = local228 >> 3 & 0x7FF;
									local366 = (local350 / 8 << 8) + local356 / 8;
									for (local368 = 0; local368 < this.anIntArray259.length; local368++) {
										if (this.anIntArray259[local368] == local366 && this.aByteArrayArray5[local368] != null) {
											local77.method547(local169 * 8, local94, local278, (byte) 4, (local356 & 0x7) * 8, local290, local101 * 8, this.aClass11Array1, (local350 & 0x7) * 8, this.aByteArrayArray5[local368]);
											break;
										}
									}
								}
							}
						}
						local94++;
					}
				}
				this.aClass8_Sub1_Sub3_6.method154(158);
				local77.method530(this.aClass11Array1, this.aClass32_1);
				this.aClass29_8.method339();
				this.aClass8_Sub1_Sub3_6.method154(158);
				for (local94 = 0; local94 < 104; local94++) {
					for (local101 = 0; local101 < 104; local101++) {
						this.method679(local94, local101);
					}
				}
				this.method675();
			} catch (@Pc(642) Exception local642) {
			}
			Class33.aClass18_6.method209();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass8_Sub1_Sub3_6.method154(134);
				this.aClass8_Sub1_Sub3_6.method159(1057001181);
			}
			if (aBoolean197 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass21_Sub1_1.method314(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass21_Sub1_1.method298(local35);
					if ((local39 & 0x79) == 0) {
						Class8_Sub1_Sub2_Sub5.method462(local35);
					}
				}
			}
			System.gc();
			Class8_Sub1_Sub1_Sub1.method73();
			this.aClass21_Sub1_1.method301();
			local22 = (this.anInt978 - 6) / 8 - 1;
			local35 = (this.anInt978 + 6) / 8 + 1;
			local39 = (this.anInt979 - 6) / 8 - 1;
			local43 = (this.anInt979 + 6) / 8 + 1;
			if (this.aBoolean215) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local85 = local22; local85 <= local35; local85++) {
				for (local94 = local39; local94 <= local43; local94++) {
					if (local85 == local22 || local85 == local35 || local94 == local39 || local94 == local43) {
						local101 = this.aClass21_Sub1_1.method316(local94, 0, local85);
						if (local101 != -1) {
							this.aClass21_Sub1_1.method300(local101, 3);
						}
						local169 = this.aClass21_Sub1_1.method316(local94, 1, local85);
						if (local169 != -1) {
							this.aClass21_Sub1_1.method300(local169, 3);
						}
					}
				}
			}
		} catch (@Pc(814) RuntimeException local814) {
			signlink.reporterror("96498, " + 112 + ", " + local814.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method647() {
		try {
			if (this.anInt895 == 2) {
				for (@Pc(16) Class8_Sub2 local16 = (Class8_Sub2) this.aClass37_10.method491(); local16 != null; local16 = (Class8_Sub2) this.aClass37_10.method493()) {
					if (local16.anInt203 > 0) {
						local16.anInt203--;
					}
					if (local16.anInt203 != 0) {
						if (local16.anInt214 > 0) {
							local16.anInt214--;
						}
						if (local16.anInt214 == 0 && local16.anInt206 >= 1 && local16.anInt207 >= 1 && local16.anInt206 <= 102 && local16.anInt207 <= 102 && (local16.anInt211 < 0 || Class43.method548(local16.anInt211, this.aByte48, local16.anInt213))) {
							this.method709(local16.anInt213, local16.anInt212, local16.anInt205, local16.anInt206, local16.anInt204, local16.anInt211, local16.anInt207);
							local16.anInt214 = -1;
							if (local16.anInt211 == local16.anInt208 && local16.anInt208 == -1) {
								local16.method554();
							} else if (local16.anInt211 == local16.anInt208 && local16.anInt212 == local16.anInt209 && local16.anInt213 == local16.anInt210) {
								local16.method554();
							}
						}
					} else if (local16.anInt208 < 0 || Class43.method548(local16.anInt208, this.aByte48, local16.anInt210)) {
						this.method709(local16.anInt210, local16.anInt209, local16.anInt205, local16.anInt206, local16.anInt204, local16.anInt208, local16.anInt207);
						local16.method554();
					}
				}
				anInt1017++;
				if (anInt1017 > 126) {
					anInt1017 = 0;
					this.aClass8_Sub1_Sub3_6.method154(46);
					this.aClass8_Sub1_Sub3_6.method155(132);
					return;
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("31193, " + true + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method648() {
		try {
			if (this.anInt1054 == 0) {
				@Pc(6) int local6 = super.anInt844;
				if (this.anInt866 == 1 && super.anInt845 >= 516 && super.anInt846 >= 160 && super.anInt845 <= 765 && super.anInt846 <= 205) {
					local6 = 0;
				}
				@Pc(48) int local48;
				@Pc(51) int local51;
				@Pc(127) int local127;
				if (this.aBoolean216) {
					if (local6 != 1) {
						local48 = super.anInt839;
						local51 = super.anInt840;
						if (this.anInt1001 == 0) {
							local48 -= 4;
							local51 -= 4;
						}
						if (this.anInt1001 == 1) {
							local48 -= 553;
							local51 -= 205;
						}
						if (this.anInt1001 == 2) {
							local48 -= 17;
							local51 -= 357;
						}
						if (local48 < this.anInt1002 - 10 || local48 > this.anInt1002 + this.anInt1004 + 10 || local51 < this.anInt1003 - 10 || local51 > this.anInt1003 + this.anInt1005 + 10) {
							this.aBoolean216 = false;
							if (this.anInt1001 == 1) {
								this.aBoolean218 = true;
							}
							if (this.anInt1001 == 2) {
								this.aBoolean230 = true;
							}
						}
					}
					if (local6 == 1) {
						local48 = this.anInt1002;
						local51 = this.anInt1003;
						local127 = this.anInt1004;
						@Pc(130) int local130 = super.anInt845;
						@Pc(133) int local133 = super.anInt846;
						if (this.anInt1001 == 0) {
							local130 -= 4;
							local133 -= 4;
						}
						if (this.anInt1001 == 1) {
							local130 -= 553;
							local133 -= 205;
						}
						if (this.anInt1001 == 2) {
							local130 -= 17;
							local133 -= 357;
						}
						@Pc(152) int local152 = -1;
						for (@Pc(154) int local154 = 0; local154 < this.anInt1029; local154++) {
							@Pc(169) int local169 = local51 + (this.anInt1029 - 1 - local154) * 15 + 31;
							if (local130 > local48 && local130 < local48 + local127 && local133 > local169 - 13 && local133 < local169 + 3) {
								local152 = local154;
							}
						}
						if (local152 != -1) {
							this.method593(local152);
						}
						this.aBoolean216 = false;
						if (this.anInt1001 == 1) {
							this.aBoolean218 = true;
						}
						if (this.anInt1001 == 2) {
							this.aBoolean230 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt1029 > 0) {
						local48 = this.anIntArray242[this.anInt1029 - 1];
						if (local48 == 355 || local48 == 416 || local48 == 630 || local48 == 708 || local48 == 903 || local48 == 375 || local48 == 10 || local48 == 132 || local48 == 532 || local48 == 8 || local48 == 959 || local48 == 1463) {
							local51 = this.anIntArray240[this.anInt1029 - 1];
							local127 = this.anIntArray241[this.anInt1029 - 1];
							@Pc(289) Class36 local289 = Class36.aClass36Array1[local127];
							if (local289.aBoolean152 || local289.aBoolean149) {
								this.aBoolean229 = false;
								this.anInt892 = 0;
								this.anInt1052 = local127;
								this.anInt1053 = local51;
								this.anInt1054 = 2;
								this.anInt1055 = super.anInt845;
								this.anInt1056 = super.anInt846;
								if (Class36.aClass36Array1[local127].anInt680 == this.anInt870) {
									this.anInt1054 = 1;
								}
								if (Class36.aClass36Array1[local127].anInt680 == this.anInt1043) {
									this.anInt1054 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt928 == 1 || this.method687(this.anInt1029 - 1)) && this.anInt1029 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt1029 > 0) {
						this.method593(this.anInt1029 - 1);
					}
					if (local6 != 2 || this.anInt1029 <= 0) {
						return;
					}
					this.method707();
				}
			}
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("42837, " + 1 + ", " + local384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (this.anInt893 != 19571) {
				this.method572();
			}
			this.aClass8_Sub1_Sub1_Sub4_4.method519(arg3, 272, arg4);
			this.aClass8_Sub1_Sub1_Sub4_5.method519(arg3, 272, arg4 + arg2 - 16);
			Class8_Sub1_Sub1.method507(16, arg3, this.anInt1057, arg4 + 16, arg2 - 32);
			@Pc(41) int local41 = (arg2 - 32) * arg2 / arg0;
			if (local41 < 8) {
				local41 = 8;
			}
			@Pc(58) int local58 = (arg2 - local41 - 32) * arg1 / (arg0 - arg2);
			Class8_Sub1_Sub1.method507(16, arg3, this.anInt948, arg4 + local58 + 16, local41);
			Class8_Sub1_Sub1.method512(this.anInt942, arg4 + local58 + 16, arg3, local41);
			Class8_Sub1_Sub1.method512(this.anInt942, arg4 + local58 + 16, arg3 + 1, local41);
			Class8_Sub1_Sub1.method510(arg3, this.anInt942, 16, arg4 + local58 + 16);
			Class8_Sub1_Sub1.method510(arg3, this.anInt942, 16, arg4 + local58 + 17);
			Class8_Sub1_Sub1.method512(this.anInt1018, arg4 + local58 + 16, arg3 + 15, local41);
			Class8_Sub1_Sub1.method512(this.anInt1018, arg4 + local58 + 17, arg3 + 14, local41 - 1);
			Class8_Sub1_Sub1.method510(arg3, this.anInt1018, 16, arg4 + local58 + local41 + 15);
			Class8_Sub1_Sub1.method510(arg3 + 1, this.anInt1018, 15, arg4 + local58 + local41 + 14);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("16893, " + arg0 + ", " + arg1 + ", " + 19571 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)Z")
	private boolean method650() {
		try {
			if (this.aClass25_1 == null) {
				return false;
			}
			@Pc(295) String local295;
			@Pc(253) int local253;
			try {
				@Pc(19) int local19 = this.aClass25_1.method292();
				if (local19 == 0) {
					return false;
				}
				if (this.anInt955 == -1) {
					this.aClass25_1.method293(this.aClass8_Sub1_Sub3_7.aByteArray9, 0, 1);
					this.anInt955 = this.aClass8_Sub1_Sub3_7.aByteArray9[0] & 0xFF;
					if (this.aClass5_2 != null) {
						this.anInt955 = this.anInt955 - this.aClass5_2.method29() & 0xFF;
					}
					this.anInt954 = Class15.anIntArray40[this.anInt955];
					local19--;
				}
				if (this.anInt954 == -1) {
					if (local19 <= 0) {
						return false;
					}
					this.aClass25_1.method293(this.aClass8_Sub1_Sub3_7.aByteArray9, 0, 1);
					this.anInt954 = this.aClass8_Sub1_Sub3_7.aByteArray9[0] & 0xFF;
					local19--;
				}
				if (this.anInt954 == -2) {
					if (local19 <= 1) {
						return false;
					}
					this.aClass25_1.method293(this.aClass8_Sub1_Sub3_7.aByteArray9, 0, 2);
					this.aClass8_Sub1_Sub3_7.anInt253 = 0;
					this.anInt954 = this.aClass8_Sub1_Sub3_7.method167();
					local19 -= 2;
				}
				if (local19 < this.anInt954) {
					return false;
				}
				this.aClass8_Sub1_Sub3_7.anInt253 = 0;
				this.aClass25_1.method293(this.aClass8_Sub1_Sub3_7.aByteArray9, 0, this.anInt954);
				this.anInt956 = 0;
				this.anInt969 = this.anInt968;
				this.anInt968 = this.anInt967;
				this.anInt967 = this.anInt955;
				@Pc(180) int local180;
				@Pc(166) int local166;
				@Pc(170) Class36 local170;
				@Pc(176) int local176;
				@Pc(184) int local184;
				if (this.anInt955 == 45) {
					this.aBoolean218 = true;
					local166 = this.aClass8_Sub1_Sub3_7.method167();
					local170 = Class36.aClass36Array1[local166];
					while (this.aClass8_Sub1_Sub3_7.anInt253 < this.anInt954) {
						local176 = this.aClass8_Sub1_Sub3_7.method179();
						local180 = this.aClass8_Sub1_Sub3_7.method167();
						local184 = this.aClass8_Sub1_Sub3_7.method165();
						if (local184 == 255) {
							local184 = this.aClass8_Sub1_Sub3_7.method170();
						}
						if (local176 >= 0 && local176 < local170.anIntArray110.length) {
							local170.anIntArray110[local176] = local180;
							local170.anIntArray115[local176] = local184;
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 57) {
					local166 = this.aClass8_Sub1_Sub3_7.method197();
					this.anInt1023 = local166;
					this.aBoolean230 = true;
					this.anInt955 = -1;
					return true;
				}
				@Pc(257) Class36 local257;
				if (this.anInt955 == 96) {
					local166 = this.aClass8_Sub1_Sub3_7.method195();
					local253 = this.aClass8_Sub1_Sub3_7.method195();
					local257 = Class36.aClass36Array1[local166];
					if (local257 != null && local257.anInt669 == 0) {
						if (local253 < 0) {
							local253 = 0;
						}
						if (local253 > local257.anInt664 - local257.anInt679) {
							local253 = local257.anInt664 - local257.anInt679;
						}
						local257.anInt683 = local253;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 240) {
					local295 = this.aClass8_Sub1_Sub3_7.method172();
					local253 = this.aClass8_Sub1_Sub3_7.method195();
					Class36.aClass36Array1[local253].aString15 = local295;
					if (Class36.aClass36Array1[local253].anInt680 == this.anIntArray229[this.anInt884]) {
						this.aBoolean218 = true;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 208) {
					local166 = this.aClass8_Sub1_Sub3_7.method195();
					local253 = this.aClass8_Sub1_Sub3_7.method193();
					local176 = this.aClass8_Sub1_Sub3_7.method193();
					local180 = this.aClass8_Sub1_Sub3_7.method194(this.anInt865);
					Class36.aClass36Array1[local253].anInt656 = local166;
					Class36.aClass36Array1[local253].anInt657 = local180;
					Class36.aClass36Array1[local253].anInt655 = local176;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 77) {
					this.aBoolean214 = false;
					this.anInt963 = 1;
					this.aString29 = "";
					this.aBoolean230 = true;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 186) {
					this.aBoolean214 = false;
					this.anInt963 = 2;
					this.aString29 = "";
					this.aBoolean230 = true;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 39) {
					local166 = this.aClass8_Sub1_Sub3_7.method195();
					local253 = this.aClass8_Sub1_Sub3_7.method195();
					if (this.anInt1043 != -1) {
						this.anInt1043 = -1;
						this.aBoolean230 = true;
					}
					if (this.anInt963 != 0) {
						this.anInt963 = 0;
						this.aBoolean230 = true;
					}
					this.anInt870 = local253;
					this.anInt891 = local166;
					this.aBoolean218 = true;
					this.aBoolean211 = true;
					this.aBoolean233 = false;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 25) {
					local166 = this.aClass8_Sub1_Sub3_7.method195();
					local253 = this.aClass8_Sub1_Sub3_7.method185();
					if (local166 == 65535) {
						local166 = -1;
					}
					this.anIntArray229[local253] = local166;
					this.aBoolean218 = true;
					this.aBoolean211 = true;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 160) {
					@Pc(507) byte local507 = this.aClass8_Sub1_Sub3_7.method189();
					local253 = this.aClass8_Sub1_Sub3_7.method195();
					this.anIntArray239[local253] = local507;
					if (this.anIntArray246[local253] != local507) {
						this.anIntArray246[local253] = local507;
						this.method583(local253);
						this.aBoolean218 = true;
						if (this.anInt1023 != -1) {
							this.aBoolean230 = true;
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 88) {
					this.anInt1030 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt953 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt897 = this.aClass8_Sub1_Sub3_7.method165();
					this.aBoolean199 = true;
					this.aBoolean230 = true;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 74) {
					local166 = this.aClass8_Sub1_Sub3_7.method195();
					@Pc(595) boolean local595 = this.aClass8_Sub1_Sub3_7.method165() == 1;
					Class36.aClass36Array1[local166].aBoolean148 = local595;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 191) {
					this.anInt987 = this.aClass8_Sub1_Sub3_7.method194(this.anInt865) * 30;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 18) {
					for (local166 = 0; local166 < this.aClass8_Sub1_Sub2_Sub4_Sub1Array1.length; local166++) {
						if (this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local166] != null) {
							this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local166].anInt578 = -1;
						}
					}
					for (local253 = 0; local253 < this.aClass8_Sub1_Sub2_Sub4_Sub2Array1.length; local253++) {
						if (this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local253] != null) {
							this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local253].anInt578 = -1;
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 0) {
					local166 = this.aClass8_Sub1_Sub3_7.method194(this.anInt865);
					this.method638(local166);
					if (this.anInt891 != -1) {
						this.anInt891 = -1;
						this.aBoolean218 = true;
						this.aBoolean211 = true;
					}
					this.anInt1043 = local166;
					this.aBoolean230 = true;
					this.anInt870 = -1;
					this.aBoolean233 = false;
					this.anInt955 = -1;
					return true;
				}
				@Pc(779) int local779;
				@Pc(1101) int local1101;
				@Pc(1080) int local1080;
				if (this.anInt955 == 136 || this.anInt955 == 50) {
					local166 = this.anInt978;
					local253 = this.anInt979;
					if (this.anInt955 == 136) {
						local166 = this.aClass8_Sub1_Sub3_7.method167();
						local253 = this.aClass8_Sub1_Sub3_7.method193();
						this.aBoolean231 = false;
					}
					if (this.anInt955 == 50) {
						local166 = this.aClass8_Sub1_Sub3_7.method193();
						this.aClass8_Sub1_Sub3_7.method175(this.aByte45);
						local176 = 0;
						while (true) {
							if (local176 >= 4) {
								this.aClass8_Sub1_Sub3_7.method177();
								local253 = this.aClass8_Sub1_Sub3_7.method167();
								this.aBoolean231 = true;
								break;
							}
							for (local180 = 0; local180 < 13; local180++) {
								for (local184 = 0; local184 < 13; local184++) {
									local779 = this.aClass8_Sub1_Sub3_7.method176(1);
									if (local779 == 1) {
										this.anIntArrayArrayArray8[local176][local180][local184] = this.aClass8_Sub1_Sub3_7.method176(26);
									} else {
										this.anIntArrayArrayArray8[local176][local180][local184] = -1;
									}
								}
							}
							local176++;
						}
					}
					if (this.anInt978 == local166 && this.anInt979 == local253 && this.anInt895 == 2) {
						this.anInt955 = -1;
						return true;
					}
					this.anInt978 = local166;
					this.anInt979 = local253;
					this.anInt944 = (this.anInt978 - 6) * 8;
					this.anInt945 = (this.anInt979 - 6) * 8;
					this.aBoolean215 = false;
					if ((this.anInt978 / 8 == 48 || this.anInt978 / 8 == 49) && this.anInt979 / 8 == 48) {
						this.aBoolean215 = true;
					}
					if (this.anInt978 / 8 == 48 && this.anInt979 / 8 == 148) {
						this.aBoolean215 = true;
					}
					this.anInt895 = 1;
					this.aLong31 = System.currentTimeMillis();
					this.aClass29_8.method339();
					this.aClass8_Sub1_Sub1_Sub2_3.method101(151, 257, "Loading - please wait.", 0);
					this.aClass8_Sub1_Sub1_Sub2_3.method101(150, 256, "Loading - please wait.", 16777215);
					this.aClass29_8.method340(super.aGraphics2, 4, 4);
					if (this.anInt955 == 136) {
						local176 = 0;
						local180 = (this.anInt978 - 6) / 8;
						label1095: while (true) {
							if (local180 > (this.anInt978 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local176][];
								this.aByteArrayArray4 = new byte[local176][];
								this.anIntArray259 = new int[local176];
								this.anIntArray260 = new int[local176];
								this.anIntArray261 = new int[local176];
								local176 = 0;
								local184 = (this.anInt978 - 6) / 8;
								while (true) {
									if (local184 > (this.anInt978 + 6) / 8) {
										break label1095;
									}
									for (local779 = (this.anInt979 - 6) / 8; local779 <= (this.anInt979 + 6) / 8; local779++) {
										this.anIntArray259[local176] = (local184 << 8) + local779;
										if (this.aBoolean215 && (local779 == 49 || local779 == 149 || local779 == 147 || local184 == 50 || local184 == 49 && local779 == 47)) {
											this.anIntArray260[local176] = -1;
											this.anIntArray261[local176] = -1;
											local176++;
										} else {
											local1080 = this.anIntArray260[local176] = this.aClass21_Sub1_1.method316(local779, 0, local184);
											if (local1080 != -1) {
												this.aClass21_Sub1_1.method305(3, local1080);
											}
											local1101 = this.anIntArray261[local176] = this.aClass21_Sub1_1.method316(local779, 1, local184);
											if (local1101 != -1) {
												this.aClass21_Sub1_1.method305(3, local1101);
											}
											local176++;
										}
									}
									local184++;
								}
							}
							for (local184 = (this.anInt979 - 6) / 8; local184 <= (this.anInt979 + 6) / 8; local184++) {
								local176++;
							}
							local180++;
						}
					}
					if (this.anInt955 == 50) {
						local176 = 0;
						@Pc(1137) int[] local1137 = new int[676];
						local184 = 0;
						label1054: while (true) {
							@Pc(1183) int local1183;
							@Pc(1167) int local1167;
							@Pc(1173) int local1173;
							if (local184 >= 4) {
								this.aByteArrayArray5 = new byte[local176][];
								this.aByteArrayArray4 = new byte[local176][];
								this.anIntArray259 = new int[local176];
								this.anIntArray260 = new int[local176];
								this.anIntArray261 = new int[local176];
								local779 = 0;
								while (true) {
									if (local779 >= local176) {
										break label1054;
									}
									local1080 = this.anIntArray259[local779] = local1137[local779];
									local1101 = local1080 >> 8 & 0xFF;
									local1167 = local1080 & 0xFF;
									local1173 = this.anIntArray260[local779] = this.aClass21_Sub1_1.method316(local1167, 0, local1101);
									if (local1173 != -1) {
										this.aClass21_Sub1_1.method305(3, local1173);
									}
									local1183 = this.anIntArray261[local779] = this.aClass21_Sub1_1.method316(local1167, 1, local1101);
									if (local1183 != -1) {
										this.aClass21_Sub1_1.method305(3, local1183);
									}
									local779++;
								}
							}
							for (local779 = 0; local779 < 13; local779++) {
								for (local1080 = 0; local1080 < 13; local1080++) {
									local1101 = this.anIntArrayArrayArray8[local184][local779][local1080];
									if (local1101 != -1) {
										local1167 = local1101 >> 14 & 0x3FF;
										local1173 = local1101 >> 3 & 0x7FF;
										local1183 = (local1167 / 8 << 8) + local1173 / 8;
										for (@Pc(1185) int local1185 = 0; local1185 < local176; local1185++) {
											if (local1137[local1185] == local1183) {
												local1183 = -1;
												break;
											}
										}
										if (local1183 != -1) {
											local1137[local176++] = local1183;
										}
									}
								}
							}
							local184++;
						}
					}
					local176 = this.anInt944 - this.anInt946;
					local180 = this.anInt945 - this.anInt947;
					this.anInt946 = this.anInt944;
					this.anInt947 = this.anInt945;
					for (local184 = 0; local184 < 16384; local184++) {
						@Pc(1338) Class8_Sub1_Sub2_Sub4_Sub2 local1338 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local184];
						if (local1338 != null) {
							for (local1080 = 0; local1080 < 10; local1080++) {
								local1338.anIntArray80[local1080] -= local176;
								local1338.anIntArray81[local1080] -= local180;
							}
							local1338.anInt562 -= local176 * 128;
							local1338.anInt563 -= local180 * 128;
						}
					}
					for (local779 = 0; local779 < this.anInt959; local779++) {
						@Pc(1393) Class8_Sub1_Sub2_Sub4_Sub1 local1393 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local779];
						if (local1393 != null) {
							for (local1101 = 0; local1101 < 10; local1101++) {
								local1393.anIntArray80[local1101] -= local176;
								local1393.anIntArray81[local1101] -= local180;
							}
							local1393.anInt562 -= local176 * 128;
							local1393.anInt563 -= local180 * 128;
						}
					}
					this.aBoolean228 = true;
					@Pc(1445) byte local1445 = 0;
					@Pc(1447) byte local1447 = 104;
					@Pc(1449) byte local1449 = 1;
					if (local176 < 0) {
						local1445 = 103;
						local1447 = -1;
						local1449 = -1;
					}
					@Pc(1459) byte local1459 = 0;
					@Pc(1461) byte local1461 = 104;
					@Pc(1463) byte local1463 = 1;
					if (local180 < 0) {
						local1459 = 103;
						local1461 = -1;
						local1463 = -1;
					}
					for (@Pc(1473) int local1473 = local1445; local1473 != local1447; local1473 += local1449) {
						for (@Pc(1477) int local1477 = local1459; local1477 != local1461; local1477 += local1463) {
							@Pc(1483) int local1483 = local1473 + local176;
							@Pc(1487) int local1487 = local1477 + local180;
							for (@Pc(1489) int local1489 = 0; local1489 < 4; local1489++) {
								if (local1483 >= 0 && local1487 >= 0 && local1483 < 104 && local1487 < 104) {
									this.aClass37ArrayArrayArray1[local1489][local1473][local1477] = this.aClass37ArrayArrayArray1[local1489][local1483][local1487];
								} else {
									this.aClass37ArrayArrayArray1[local1489][local1473][local1477] = null;
								}
							}
						}
					}
					for (@Pc(1551) Class8_Sub2 local1551 = (Class8_Sub2) this.aClass37_10.method491(); local1551 != null; local1551 = (Class8_Sub2) this.aClass37_10.method493()) {
						local1551.anInt206 -= local176;
						local1551.anInt207 -= local180;
						if (local1551.anInt206 < 0 || local1551.anInt207 < 0 || local1551.anInt206 >= 104 || local1551.anInt207 >= 104) {
							local1551.method554();
						}
					}
					if (this.anInt1021 != 0) {
						this.anInt1021 -= local176;
						this.anInt1022 -= local180;
					}
					this.aBoolean210 = false;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 248) {
					this.anInt905 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 55) {
					if (this.anInt884 == 12) {
						this.aBoolean218 = true;
					}
					this.anInt997 = this.aClass8_Sub1_Sub3_7.method168();
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 11) {
					local166 = this.aClass8_Sub1_Sub3_7.method170();
					local253 = this.aClass8_Sub1_Sub3_7.method193();
					this.anIntArray239[local253] = local166;
					if (this.anIntArray246[local253] != local166) {
						this.anIntArray246[local253] = local166;
						this.method583(local253);
						this.aBoolean218 = true;
						if (this.anInt1023 != -1) {
							this.aBoolean230 = true;
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 35) {
					local166 = this.aClass8_Sub1_Sub3_7.method167();
					local253 = this.aClass8_Sub1_Sub3_7.method168();
					local257 = Class36.aClass36Array1[local166];
					local257.anInt677 = local253;
					if (local253 == -1) {
						local257.anInt665 = 0;
						local257.anInt659 = 0;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 239) {
					local166 = this.aClass8_Sub1_Sub3_7.method167();
					local253 = this.aClass8_Sub1_Sub3_7.method165();
					local176 = this.aClass8_Sub1_Sub3_7.method167();
					if (this.aBoolean234 && !aBoolean197 && this.anInt858 < 50) {
						this.anIntArray225[this.anInt858] = local166;
						this.anIntArray213[this.anInt858] = local253;
						this.anIntArray257[this.anInt858] = local176 + Class7.anIntArray18[local166];
						this.anInt858++;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 185) {
					if (this.anInt884 == 12) {
						this.aBoolean218 = true;
					}
					this.anInt986 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 62) {
					local166 = this.aClass8_Sub1_Sub3_7.method193();
					if (local166 == 65535) {
						local166 = -1;
					}
					if (local166 != this.anInt864 && this.aBoolean227 && !aBoolean197 && this.anInt886 == 0) {
						this.anInt921 = local166;
						this.aBoolean204 = true;
						this.aClass21_Sub1_1.method305(2, this.anInt921);
					}
					this.anInt864 = local166;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 195) {
					local166 = this.aClass8_Sub1_Sub3_7.method167();
					local253 = this.aClass8_Sub1_Sub3_7.method167();
					if (this.aBoolean227 && !aBoolean197) {
						this.anInt921 = local166;
						this.aBoolean204 = false;
						this.aClass21_Sub1_1.method305(2, this.anInt921);
						this.anInt886 = local253;
					}
					this.anInt955 = -1;
					return true;
				}
				@Pc(1909) boolean local1909;
				@Pc(1978) String local1978;
				@Pc(1899) long local1899;
				if (this.anInt955 == 219) {
					local1899 = this.aClass8_Sub1_Sub3_7.method171();
					local176 = this.aClass8_Sub1_Sub3_7.method170();
					local180 = this.aClass8_Sub1_Sub3_7.method165();
					local1909 = false;
					for (local779 = 0; local779 < 100; local779++) {
						if (this.anIntArray221[local779] == local176) {
							local1909 = true;
							break;
						}
					}
					if (local180 <= 1) {
						for (local1080 = 0; local1080 < this.anInt859; local1080++) {
							if (this.aLongArray3[local1080] == local1899) {
								local1909 = true;
								break;
							}
						}
					}
					if (!local1909 && this.anInt991 == 0) {
						try {
							this.anIntArray221[this.anInt1036] = local176;
							this.anInt1036 = (this.anInt1036 + 1) % 100;
							local1978 = Class23.method282(this.aClass8_Sub1_Sub3_7, this.anInt954 - 13);
							if (local180 != 3) {
								local1978 = Class19.method220(local1978, this.anInt951);
							}
							if (local180 == 2 || local180 == 3) {
								this.method703(local1978, "@cr2@" + Class48.method563(Class48.method560(local1899)), 7);
							} else if (local180 == 1) {
								this.method703(local1978, "@cr1@" + Class48.method563(Class48.method560(local1899)), 7);
							} else {
								this.method703(local1978, Class48.method563(Class48.method560(local1899)), 3);
							}
						} catch (@Pc(2043) Exception local2043) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt955 = -1;
					return true;
				}
				@Pc(2064) String local2064;
				if (this.anInt955 == 249) {
					local166 = this.aClass8_Sub1_Sub3_7.method185();
					local2064 = this.aClass8_Sub1_Sub3_7.method172();
					local176 = this.aClass8_Sub1_Sub3_7.method186(535);
					if (local176 >= 1 && local176 <= 5) {
						if (local2064.equalsIgnoreCase("null")) {
							local2064 = null;
						}
						this.aStringArray10[local176 - 1] = local2064;
						this.aBooleanArray11[local176 - 1] = local166 == 0;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 220) {
					local1899 = this.aClass8_Sub1_Sub3_7.method171();
					local176 = this.aClass8_Sub1_Sub3_7.method165();
					@Pc(2123) String local2123 = Class48.method563(Class48.method560(local1899));
					for (local184 = 0; local184 < this.anInt852; local184++) {
						if (local1899 == this.aLongArray4[local184]) {
							if (this.anIntArray226[local184] != local176) {
								this.anIntArray226[local184] = local176;
								this.aBoolean218 = true;
								if (local176 > 0) {
									this.method703(local2123 + " has logged in.", "", 5);
								}
								if (local176 == 0) {
									this.method703(local2123 + " has logged out.", "", 5);
								}
							}
							local2123 = null;
							break;
						}
					}
					if (local2123 != null && this.anInt852 < 200) {
						this.aLongArray4[this.anInt852] = local1899;
						this.aStringArray11[this.anInt852] = local2123;
						this.anIntArray226[this.anInt852] = local176;
						this.anInt852++;
						this.aBoolean218 = true;
					}
					@Pc(2221) boolean local2221 = false;
					while (!local2221) {
						local2221 = true;
						for (local1080 = 0; local1080 < this.anInt852 - 1; local1080++) {
							if (this.anIntArray226[local1080] != anInt877 && this.anIntArray226[local1080 + 1] == anInt877 || this.anIntArray226[local1080] == 0 && this.anIntArray226[local1080 + 1] != 0) {
								local1101 = this.anIntArray226[local1080];
								this.anIntArray226[local1080] = this.anIntArray226[local1080 + 1];
								this.anIntArray226[local1080 + 1] = local1101;
								@Pc(2282) String local2282 = this.aStringArray11[local1080];
								this.aStringArray11[local1080] = this.aStringArray11[local1080 + 1];
								this.aStringArray11[local1080 + 1] = local2282;
								@Pc(2304) long local2304 = this.aLongArray4[local1080];
								this.aLongArray4[local1080] = this.aLongArray4[local1080 + 1];
								this.aLongArray4[local1080 + 1] = local2304;
								this.aBoolean218 = true;
								local2221 = false;
							}
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 231) {
					this.aBoolean210 = true;
					this.anInt1024 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt1025 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt1026 = this.aClass8_Sub1_Sub3_7.method167();
					this.anInt1027 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt1028 = this.aClass8_Sub1_Sub3_7.method165();
					if (this.anInt1028 >= 100) {
						this.anInt872 = this.anInt1024 * 128 + 64;
						this.anInt874 = this.anInt1025 * 128 + 64;
						this.anInt873 = this.method667(this.anInt874, this.anInt1042, this.anInt872) - this.anInt1026;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 85) {
					this.aBoolean210 = true;
					this.anInt1037 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt1038 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt1039 = this.aClass8_Sub1_Sub3_7.method167();
					this.anInt1040 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt1041 = this.aClass8_Sub1_Sub3_7.method165();
					if (this.anInt1041 >= 100) {
						local166 = this.anInt1037 * 128 + 64;
						local253 = this.anInt1038 * 128 + 64;
						local176 = this.method667(local253, this.anInt1042, local166) - this.anInt1039;
						local180 = local166 - this.anInt872;
						local184 = local176 - this.anInt873;
						local779 = local253 - this.anInt874;
						local1080 = (int) Math.sqrt((double) (local180 * local180 + local779 * local779));
						this.anInt875 = (int) (Math.atan2((double) local184, (double) local1080) * 325.949D) & 0x7FF;
						this.anInt876 = (int) (Math.atan2((double) local180, (double) local779) * -325.949D) & 0x7FF;
						if (this.anInt875 < 128) {
							this.anInt875 = 128;
						}
						if (this.anInt875 > 383) {
							this.anInt875 = 383;
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 156) {
					this.anInt943 = this.aClass8_Sub1_Sub3_7.method165();
					if (this.anInt943 == 1) {
						this.anInt888 = this.aClass8_Sub1_Sub3_7.method167();
					}
					if (this.anInt943 >= 2 && this.anInt943 <= 6) {
						if (this.anInt943 == 2) {
							this.anInt940 = 64;
							this.anInt941 = 64;
						}
						if (this.anInt943 == 3) {
							this.anInt940 = 0;
							this.anInt941 = 64;
						}
						if (this.anInt943 == 4) {
							this.anInt940 = 128;
							this.anInt941 = 64;
						}
						if (this.anInt943 == 5) {
							this.anInt940 = 64;
							this.anInt941 = 0;
						}
						if (this.anInt943 == 6) {
							this.anInt940 = 64;
							this.anInt941 = 128;
						}
						this.anInt943 = 2;
						this.anInt937 = this.aClass8_Sub1_Sub3_7.method167();
						this.anInt938 = this.aClass8_Sub1_Sub3_7.method167();
						this.anInt939 = this.aClass8_Sub1_Sub3_7.method165();
					}
					if (this.anInt943 == 10) {
						this.anInt1010 = this.aClass8_Sub1_Sub3_7.method167();
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 223) {
					local166 = this.aClass8_Sub1_Sub3_7.method167();
					local170 = Class36.aClass36Array1[local166];
					for (local176 = 0; local176 < local170.anIntArray110.length; local176++) {
						local170.anIntArray110[local176] = -1;
						local170.anIntArray110[local176] = 0;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 27) {
					this.anInt907 = this.aClass8_Sub1_Sub3_7.method185();
					if (this.anInt907 == this.anInt884) {
						if (this.anInt907 == 3) {
							this.anInt884 = 1;
						} else {
							this.anInt884 = 3;
						}
						this.aBoolean218 = true;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 225) {
					this.anInt885 = this.aClass8_Sub1_Sub3_7.method195();
					this.anInt1009 = this.aClass8_Sub1_Sub3_7.method184();
					this.anInt920 = this.aClass8_Sub1_Sub3_7.method170();
					this.anInt860 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt930 = this.aClass8_Sub1_Sub3_7.method194(this.anInt865);
					if (this.anInt920 != 0 && this.anInt870 == -1) {
						signlink.dnslookup(Class48.method562(this.anInt920));
						this.method688();
						@Pc(2771) short local2771 = 650;
						if (this.anInt1009 != 201 || this.anInt860 == 1) {
							local2771 = 655;
						}
						this.aString28 = "";
						this.aBoolean225 = false;
						for (local253 = 0; local253 < Class36.aClass36Array1.length; local253++) {
							if (Class36.aClass36Array1[local253] != null && Class36.aClass36Array1[local253].anInt681 == local2771) {
								this.anInt870 = Class36.aClass36Array1[local253].anInt680;
								break;
							}
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 142) {
					local166 = this.aClass8_Sub1_Sub3_7.method193();
					this.method638(local166);
					if (this.anInt891 != -1) {
						this.anInt891 = -1;
						this.aBoolean218 = true;
						this.aBoolean211 = true;
					}
					if (this.anInt1043 != -1) {
						this.anInt1043 = -1;
						this.aBoolean230 = true;
					}
					if (this.anInt963 != 0) {
						this.anInt963 = 0;
						this.aBoolean230 = true;
					}
					this.anInt870 = local166;
					this.aBoolean233 = false;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 174) {
					this.aBoolean210 = false;
					for (local166 = 0; local166 < 5; local166++) {
						this.aBooleanArray12[local166] = false;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 43) {
					this.method626();
					this.anInt955 = -1;
					return false;
				}
				if (this.anInt955 == 38) {
					local166 = this.aClass8_Sub1_Sub3_7.method165();
					local253 = this.aClass8_Sub1_Sub3_7.method165();
					local176 = this.aClass8_Sub1_Sub3_7.method165();
					local180 = this.aClass8_Sub1_Sub3_7.method165();
					this.aBooleanArray12[local166] = true;
					this.anIntArray247[local166] = local253;
					this.anIntArray236[local166] = local176;
					this.anIntArray244[local166] = local180;
					this.anIntArray212[local166] = 0;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 139) {
					this.anInt1059 = this.aClass8_Sub1_Sub3_7.method184();
					this.anInt977 = this.aClass8_Sub1_Sub3_7.method195();
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 91) {
					local166 = this.aClass8_Sub1_Sub3_7.method196();
					local253 = this.aClass8_Sub1_Sub3_7.method196();
					local176 = this.aClass8_Sub1_Sub3_7.method194(this.anInt865);
					@Pc(3007) Class36 local3007 = Class36.aClass36Array1[local176];
					local3007.anInt660 = local253;
					local3007.anInt674 = local166;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 89) {
					local166 = this.aClass8_Sub1_Sub3_7.method193();
					local253 = this.aClass8_Sub1_Sub3_7.method193();
					Class36.aClass36Array1[local166].anInt666 = 1;
					Class36.aClass36Array1[local166].anInt667 = local253;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 86) {
					local166 = this.aClass8_Sub1_Sub3_7.method194(this.anInt865);
					Class36.aClass36Array1[local166].anInt666 = 3;
					if (aClass8_Sub1_Sub2_Sub4_Sub1_1.aClass26_1 == null) {
						Class36.aClass36Array1[local166].anInt667 = (aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray76[0] << 25) + (aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray76[4] << 20) + (aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray75[0] << 15) + (aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray75[8] << 10) + (aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray75[11] << 5) + aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray75[1];
					} else {
						Class36.aClass36Array1[local166].anInt667 = (int) (aClass8_Sub1_Sub2_Sub4_Sub1_1.aClass26_1.aLong16 + 305419896L);
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 115) {
					for (local166 = 0; local166 < this.anIntArray246.length; local166++) {
						if (this.anIntArray246[local166] != this.anIntArray239[local166]) {
							this.anIntArray246[local166] = this.anIntArray239[local166];
							this.method583(local166);
							this.aBoolean218 = true;
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 61) {
					this.anInt859 = this.anInt954 / 8;
					for (local166 = 0; local166 < this.anInt859; local166++) {
						this.aLongArray3[local166] = this.aClass8_Sub1_Sub3_7.method171();
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 68) {
					this.anInt932 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt933 = this.aClass8_Sub1_Sub3_7.method186(535);
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 181) {
					this.anInt853 = this.aClass8_Sub1_Sub3_7.method165();
					this.aBoolean218 = true;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 169) {
					this.method683(this.anInt954, this.aBoolean208, this.aClass8_Sub1_Sub3_7);
					this.aBoolean228 = false;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 230) {
					local166 = this.aClass8_Sub1_Sub3_7.method194(this.anInt865);
					local253 = this.aClass8_Sub1_Sub3_7.method193();
					local176 = local253 >> 10 & 0x1F;
					local180 = local253 >> 5 & 0x1F;
					local184 = local253 & 0x1F;
					Class36.aClass36Array1[local166].anInt671 = (local176 << 19) + (local180 << 11) + (local184 << 3);
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 204) {
					this.anInt974 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 124) {
					this.anInt1021 = 0;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 164) {
					if (this.anInt891 != -1) {
						this.anInt891 = -1;
						this.aBoolean218 = true;
						this.aBoolean211 = true;
					}
					if (this.anInt1043 != -1) {
						this.anInt1043 = -1;
						this.aBoolean230 = true;
					}
					if (this.anInt963 != 0) {
						this.anInt963 = 0;
						this.aBoolean230 = true;
					}
					this.anInt870 = -1;
					this.aBoolean233 = false;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 158) {
					local166 = this.aClass8_Sub1_Sub3_7.method195();
					local253 = this.aClass8_Sub1_Sub3_7.method167();
					local176 = this.aClass8_Sub1_Sub3_7.method194(this.anInt865);
					if (local253 == 65535) {
						Class36.aClass36Array1[local166].anInt666 = 0;
						this.anInt955 = -1;
						return true;
					}
					@Pc(3416) Class2 local3416 = Class2.method4(local253);
					Class36.aClass36Array1[local166].anInt666 = 4;
					Class36.aClass36Array1[local166].anInt667 = local253;
					Class36.aClass36Array1[local166].anInt656 = local3416.anInt8;
					Class36.aClass36Array1[local166].anInt657 = local3416.anInt33;
					Class36.aClass36Array1[local166].anInt655 = local3416.anInt3 * 100 / local176;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 154) {
					this.aBoolean218 = true;
					local166 = this.aClass8_Sub1_Sub3_7.method199();
					local253 = this.aClass8_Sub1_Sub3_7.method185();
					local176 = this.aClass8_Sub1_Sub3_7.method186(535);
					this.anIntArray258[local253] = local166;
					this.anIntArray228[local253] = local176;
					this.anIntArray234[local253] = 1;
					for (local180 = 0; local180 < 98; local180++) {
						if (local166 >= anIntArray227[local180]) {
							this.anIntArray234[local253] = local180 + 2;
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 161) {
					this.anInt884 = this.aClass8_Sub1_Sub3_7.method186(535);
					this.aBoolean218 = true;
					this.aBoolean211 = true;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 244) {
					this.anInt933 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt932 = this.aClass8_Sub1_Sub3_7.method184();
					for (local166 = this.anInt932; local166 < this.anInt932 + 8; local166++) {
						for (local253 = this.anInt933; local253 < this.anInt933 + 8; local253++) {
							if (this.aClass37ArrayArrayArray1[this.anInt1042][local166][local253] != null) {
								this.aClass37ArrayArrayArray1[this.anInt1042][local166][local253] = null;
								this.method679(local166, local253);
							}
						}
					}
					for (@Pc(3604) Class8_Sub2 local3604 = (Class8_Sub2) this.aClass37_10.method491(); local3604 != null; local3604 = (Class8_Sub2) this.aClass37_10.method493()) {
						if (local3604.anInt206 >= this.anInt932 && local3604.anInt206 < this.anInt932 + 8 && local3604.anInt207 >= this.anInt933 && local3604.anInt207 < this.anInt933 + 8 && local3604.anInt204 == this.anInt1042) {
							local3604.anInt203 = 0;
						}
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 243) {
					this.aBoolean218 = true;
					local166 = this.aClass8_Sub1_Sub3_7.method167();
					local170 = Class36.aClass36Array1[local166];
					local176 = this.aClass8_Sub1_Sub3_7.method167();
					for (local180 = 0; local180 < local176; local180++) {
						local170.anIntArray110[local180] = this.aClass8_Sub1_Sub3_7.method193();
						local184 = this.aClass8_Sub1_Sub3_7.method165();
						if (local184 == 255) {
							local184 = this.aClass8_Sub1_Sub3_7.method199();
						}
						local170.anIntArray115[local180] = local184;
					}
					for (local184 = local176; local184 < local170.anIntArray110.length; local184++) {
						local170.anIntArray110[local184] = 0;
						local170.anIntArray115[local184] = 0;
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 40 || this.anInt955 == 83 || this.anInt955 == 205 || this.anInt955 == 7 || this.anInt955 == 118 || this.anInt955 == 9 || this.anInt955 == 134 || this.anInt955 == 255 || this.anInt955 == 183 || this.anInt955 == 75 || this.anInt955 == 192) {
					this.method654(this.aClass8_Sub1_Sub3_7, this.anInt955);
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 177) {
					local295 = this.aClass8_Sub1_Sub3_7.method172();
					@Pc(3806) long local3806;
					if (local295.endsWith(":tradereq:")) {
						local2064 = local295.substring(0, local295.indexOf(":"));
						local3806 = Class48.method559(local2064);
						local1909 = false;
						for (local779 = 0; local779 < this.anInt859; local779++) {
							if (this.aLongArray3[local779] == local3806) {
								local1909 = true;
								break;
							}
						}
						if (!local1909 && this.anInt991 == 0) {
							this.method703("wishes to trade with you.", local2064, 4);
						}
					} else if (local295.endsWith(":duelreq:")) {
						local2064 = local295.substring(0, local295.indexOf(":"));
						local3806 = Class48.method559(local2064);
						local1909 = false;
						for (local779 = 0; local779 < this.anInt859; local779++) {
							if (this.aLongArray3[local779] == local3806) {
								local1909 = true;
								break;
							}
						}
						if (!local1909 && this.anInt991 == 0) {
							this.method703("wishes to duel with you.", local2064, 8);
						}
					} else if (local295.endsWith(":chalreq:")) {
						local2064 = local295.substring(0, local295.indexOf(":"));
						local3806 = Class48.method559(local2064);
						local1909 = false;
						for (local779 = 0; local779 < this.anInt859; local779++) {
							if (this.aLongArray3[local779] == local3806) {
								local1909 = true;
								break;
							}
						}
						if (!local1909 && this.anInt991 == 0) {
							local1978 = local295.substring(local295.indexOf(":") + 1, local295.length() - 9);
							this.method703(local1978, local2064, 8);
						}
					} else {
						this.method703(local295, "", 0);
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 44) {
					local166 = this.aClass8_Sub1_Sub3_7.method195();
					this.method638(local166);
					if (this.anInt1043 != -1) {
						this.anInt1043 = -1;
						this.aBoolean230 = true;
					}
					if (this.anInt963 != 0) {
						this.anInt963 = 0;
						this.aBoolean230 = true;
					}
					this.anInt891 = local166;
					this.aBoolean218 = true;
					this.aBoolean211 = true;
					this.anInt870 = -1;
					this.aBoolean233 = false;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 222) {
					local166 = this.aClass8_Sub1_Sub3_7.method167();
					local253 = this.aClass8_Sub1_Sub3_7.method195();
					Class36.aClass36Array1[local166].anInt666 = 2;
					Class36.aClass36Array1[local166].anInt667 = local253;
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 97) {
					this.method625(this.aClass8_Sub1_Sub3_7, this.anInt954);
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 28) {
					this.anInt932 = this.aClass8_Sub1_Sub3_7.method165();
					this.anInt933 = this.aClass8_Sub1_Sub3_7.method186(535);
					while (this.aClass8_Sub1_Sub3_7.anInt253 < this.anInt954) {
						local166 = this.aClass8_Sub1_Sub3_7.method165();
						this.method654(this.aClass8_Sub1_Sub3_7, local166);
					}
					this.anInt955 = -1;
					return true;
				}
				if (this.anInt955 == 16) {
					local166 = this.aClass8_Sub1_Sub3_7.method196();
					if (local166 >= 0) {
						this.method638(local166);
					}
					this.anInt985 = local166;
					this.anInt955 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt955 + "," + this.anInt954 + " - " + this.anInt968 + "," + this.anInt969);
				this.method626();
			} catch (@Pc(4148) IOException local4148) {
				this.method600();
			} catch (@Pc(4153) Exception local4153) {
				local295 = "T2 - " + this.anInt955 + "," + this.anInt968 + "," + this.anInt969 + " - " + this.anInt954 + "," + (this.anInt944 + aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0]) + "," + (this.anInt945 + aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0]) + " - ";
				for (local253 = 0; local253 < this.anInt954 && local253 < 50; local253++) {
					local295 = local295 + this.aClass8_Sub1_Sub3_7.aByteArray9[local253] + ",";
				}
				signlink.reporterror(local295);
				this.method626();
			}
			return true;
		} catch (@Pc(4234) RuntimeException local4234) {
			signlink.reporterror("81001, " + 189 + ", " + local4234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method576(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean200 = true;
			@Pc(6) boolean local6 = false;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("68999, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GLMIQHJI;II)V")
	private void method651(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method175(this.aByte45);
			@Pc(8) int local8 = arg0.method176(1);
			if (local8 != 0) {
				@Pc(28) int local28 = arg0.method176(2);
				if (local28 == 0) {
					this.anIntArray233[this.anInt962++] = this.anInt960;
				} else {
					@Pc(51) int local51;
					@Pc(61) int local61;
					if (local28 == 1) {
						local51 = arg0.method176(3);
						aClass8_Sub1_Sub2_Sub4_Sub1_1.method375(false, local51, 908);
						local61 = arg0.method176(1);
						if (local61 == 1) {
							this.anIntArray233[this.anInt962++] = this.anInt960;
						}
					} else {
						@Pc(105) int local105;
						if (local28 == 2) {
							local51 = arg0.method176(3);
							aClass8_Sub1_Sub2_Sub4_Sub1_1.method375(true, local51, 908);
							local61 = arg0.method176(3);
							aClass8_Sub1_Sub2_Sub4_Sub1_1.method375(true, local61, 908);
							local105 = arg0.method176(1);
							if (local105 == 1) {
								this.anIntArray233[this.anInt962++] = this.anInt960;
							}
						} else if (local28 == 3) {
							local51 = arg0.method176(7);
							local61 = arg0.method176(7);
							this.anInt1042 = arg0.method176(2);
							local105 = arg0.method176(1);
							@Pc(150) int local150 = arg0.method176(1);
							if (local150 == 1) {
								this.anIntArray233[this.anInt962++] = this.anInt960;
							}
							aClass8_Sub1_Sub2_Sub4_Sub1_1.method377(local51, local105 == 1, local61);
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("76225, " + arg0 + ", " + -849 + ", " + arg1 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method652(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt983; local4++) {
				@Pc(14) Class8_Sub1_Sub2_Sub4_Sub2 local14 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray238[local4]];
				@Pc(23) int local23 = (this.anIntArray238[local4] << 14) + 536870912;
				if (local14 != null && local14.method378((byte) 4) && local14.aClass26_2.aBoolean100 == arg0) {
					@Pc(39) int local39 = local14.anInt562 >> 7;
					@Pc(44) int local44 = local14.anInt563 >> 7;
					if (local39 >= 0 && local39 < 104 && local44 >= 0 && local44 < 104) {
						if (local14.anInt586 == 1 && (local14.anInt562 & 0x7F) == 64 && (local14.anInt563 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local39][local44] == this.anInt949) {
								continue;
							}
							this.anIntArrayArray22[local39][local44] = this.anInt949;
						}
						this.aClass32_1.method393(this.anInt1042, local14.aBoolean123, local23, local14, local14.anInt563, local14.anInt562, local14.anInt564, (local14.anInt586 - 1) * 64 + 60, this.method667(local14.anInt563, this.anInt1042, local14.anInt562));
					}
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("53775, " + arg0 + ", " + -4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("75449, " + -43 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!GLMIQHJI;II)V")
	private void method654(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt954 += 0;
			@Pc(35) int local35;
			@Pc(38) int local38;
			@Pc(13) int local13;
			@Pc(22) int local22;
			@Pc(29) int local29;
			@Pc(32) int local32;
			if (arg1 == 83) {
				local13 = arg0.method165();
				local22 = this.anInt932 + (local13 >> 4 & 0x7);
				local29 = this.anInt933 + (local13 & 0x7);
				local32 = arg0.method167();
				local35 = arg0.method167();
				local38 = arg0.method167();
				if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
					@Pc(58) Class37 local58 = this.aClass37ArrayArrayArray1[this.anInt1042][local22][local29];
					if (local58 != null) {
						for (@Pc(64) Class8_Sub1_Sub2_Sub3 local64 = (Class8_Sub1_Sub2_Sub3) local58.method491(); local64 != null; local64 = (Class8_Sub1_Sub2_Sub3) local58.method493()) {
							if (local64.anInt402 == (local32 & 0x7FFF) && local64.anInt401 == local35) {
								local64.anInt401 = local38;
								break;
							}
						}
						this.method679(local22, local29);
					}
				}
			} else {
				@Pc(130) int local130;
				@Pc(134) int local134;
				@Pc(138) int local138;
				@Pc(142) int local142;
				@Pc(147) int local147;
				@Pc(151) int local151;
				@Pc(155) int local155;
				@Pc(160) int local160;
				if (arg1 == 205) {
					@Pc(99) byte local99 = arg0.method166();
					@Pc(103) byte local103 = arg0.method188();
					@Pc(107) byte local107 = arg0.method187();
					@Pc(111) byte local111 = arg0.method187();
					local35 = arg0.method165();
					local38 = this.anInt932 + (local35 >> 4 & 0x7);
					local130 = this.anInt933 + (local35 & 0x7);
					local134 = arg0.method185();
					local138 = local134 >> 2;
					local142 = local134 & 0x3;
					local147 = this.anIntArray250[local138];
					local151 = arg0.method193();
					local155 = arg0.method193();
					local160 = arg0.method194(this.anInt865);
					@Pc(164) int local164 = arg0.method193();
					@Pc(170) Class8_Sub1_Sub2_Sub4_Sub1 local170;
					if (local155 == this.anInt977) {
						local170 = aClass8_Sub1_Sub2_Sub4_Sub1_1;
					} else {
						local170 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local155];
					}
					if (local170 != null) {
						@Pc(182) Class33 local182 = Class33.method443(local164);
						@Pc(192) int local192 = this.anIntArrayArrayArray7[this.anInt1042][local38][local130];
						@Pc(204) int local204 = this.anIntArrayArrayArray7[this.anInt1042][local38 + 1][local130];
						@Pc(218) int local218 = this.anIntArrayArrayArray7[this.anInt1042][local38 + 1][local130 + 1];
						@Pc(230) int local230 = this.anIntArrayArrayArray7[this.anInt1042][local38][local130 + 1];
						@Pc(240) Class8_Sub1_Sub2_Sub5 local240 = local182.method433(local138, local142, local192, local204, local218, local230, -1);
						if (local240 != null) {
							this.method636(this.anInt1042, local130, 0, -1, local38, local147, 0, local160 + 1, local151 + 1);
							local170.anInt526 = local160 + anInt927;
							local170.anInt527 = local151 + anInt927;
							local170.aClass8_Sub1_Sub2_Sub5_1 = local240;
							@Pc(275) int local275 = local182.anInt647;
							@Pc(278) int local278 = local182.anInt638;
							if (local142 == 1 || local142 == 3) {
								local275 = local182.anInt638;
								local278 = local182.anInt647;
							}
							local170.anInt528 = local38 * 128 + local275 * 64;
							local170.anInt530 = local130 * 128 + local278 * 64;
							local170.anInt529 = this.method667(local170.anInt530, this.anInt1042, local170.anInt528);
							@Pc(324) byte local324;
							if (local107 > local111) {
								local324 = local107;
								local107 = local111;
								local111 = local324;
							}
							if (local99 > local103) {
								local324 = local99;
								local99 = local103;
								local103 = local324;
							}
							local170.anInt519 = local38 + local107;
							local170.anInt521 = local38 + local111;
							local170.anInt520 = local130 + local99;
							local170.anInt522 = local130 + local103;
						}
					}
				}
				@Pc(401) Class8_Sub1_Sub2_Sub3 local401;
				if (arg1 == 255) {
					local13 = arg0.method193();
					local22 = arg0.method186(535);
					local29 = this.anInt932 + (local22 >> 4 & 0x7);
					local32 = this.anInt933 + (local22 & 0x7);
					local35 = arg0.method167();
					if (local29 >= 0 && local32 >= 0 && local29 < 104 && local32 < 104) {
						local401 = new Class8_Sub1_Sub2_Sub3();
						local401.anInt402 = local13;
						local401.anInt401 = local35;
						if (this.aClass37ArrayArrayArray1[this.anInt1042][local29][local32] == null) {
							this.aClass37ArrayArrayArray1[this.anInt1042][local29][local32] = new Class37((byte) 3);
						}
						this.aClass37ArrayArrayArray1[this.anInt1042][local29][local32].method488(local401);
						this.method679(local29, local32);
					}
				} else if (arg1 == 75) {
					local13 = arg0.method186(535);
					local22 = local13 >> 2;
					local29 = local13 & 0x3;
					local32 = this.anIntArray250[local22];
					local35 = arg0.method165();
					local38 = this.anInt932 + (local35 >> 4 & 0x7);
					local130 = this.anInt933 + (local35 & 0x7);
					if (local38 >= 0 && local130 >= 0 && local38 < 104 && local130 < 104) {
						this.method636(this.anInt1042, local130, local22, -1, local38, local32, local29, 0, -1);
					}
				} else {
					if (arg1 == 40) {
						local13 = arg0.method165();
						local22 = this.anInt932 + (local13 >> 4 & 0x7);
						local29 = this.anInt933 + (local13 & 0x7);
						local32 = arg0.method167();
						local35 = arg0.method165();
						local38 = local35 >> 4 & 0xF;
						local130 = local35 & 0x7;
						if (aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0] >= local22 - local38 && aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0] <= local22 + local38 && aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0] >= local29 - local38 && aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0] <= local29 + local38 && this.aBoolean234 && !aBoolean197 && this.anInt858 < 50) {
							this.anIntArray225[this.anInt858] = local32;
							this.anIntArray213[this.anInt858] = local130;
							this.anIntArray257[this.anInt858] = Class7.anIntArray18[local32];
							this.anInt858++;
						}
					}
					if (arg1 == 134) {
						local13 = arg0.method186(535);
						local22 = this.anInt932 + (local13 >> 4 & 0x7);
						local29 = this.anInt933 + (local13 & 0x7);
						local32 = arg0.method167();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							@Pc(660) Class37 local660 = this.aClass37ArrayArrayArray1[this.anInt1042][local22][local29];
							if (local660 != null) {
								for (local401 = (Class8_Sub1_Sub2_Sub3) local660.method491(); local401 != null; local401 = (Class8_Sub1_Sub2_Sub3) local660.method493()) {
									if (local401.anInt402 == (local32 & 0x7FFF)) {
										local401.method554();
										break;
									}
								}
								if (local660.method491() == null) {
									this.aClass37ArrayArrayArray1[this.anInt1042][local22][local29] = null;
								}
								this.method679(local22, local29);
							}
						}
					} else if (arg1 == 7) {
						local13 = arg0.method184();
						local22 = this.anInt932 + (local13 >> 4 & 0x7);
						local29 = this.anInt933 + (local13 & 0x7);
						local32 = arg0.method193();
						local35 = arg0.method167();
						local38 = arg0.method167();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local38 != this.anInt977) {
							@Pc(754) Class8_Sub1_Sub2_Sub3 local754 = new Class8_Sub1_Sub2_Sub3();
							local754.anInt402 = local32;
							local754.anInt401 = local35;
							if (this.aClass37ArrayArrayArray1[this.anInt1042][local22][local29] == null) {
								this.aClass37ArrayArrayArray1[this.anInt1042][local22][local29] = new Class37((byte) 3);
							}
							this.aClass37ArrayArrayArray1[this.anInt1042][local22][local29].method488(local754);
							this.method679(local22, local29);
						}
					} else if (arg1 == 192) {
						local13 = arg0.method193();
						local22 = arg0.method165();
						local29 = this.anInt932 + (local22 >> 4 & 0x7);
						local32 = this.anInt933 + (local22 & 0x7);
						local35 = arg0.method184();
						local38 = local35 >> 2;
						local130 = local35 & 0x3;
						local134 = this.anIntArray250[local38];
						if (local29 >= 0 && local32 >= 0 && local29 < 104 && local32 < 104) {
							this.method636(this.anInt1042, local32, local38, local13, local29, local134, local130, 0, -1);
						}
					} else if (arg1 == 9) {
						local13 = arg0.method165();
						local22 = this.anInt932 + (local13 >> 4 & 0x7);
						local29 = this.anInt933 + (local13 & 0x7);
						local32 = local22 + arg0.method166();
						local35 = local29 + arg0.method166();
						local38 = arg0.method168();
						local130 = arg0.method167();
						local134 = arg0.method165() * 4;
						local138 = arg0.method165() * 4;
						local142 = arg0.method167();
						local147 = arg0.method167();
						local151 = arg0.method165();
						local155 = arg0.method165();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local32 >= 0 && local35 >= 0 && local32 < 104 && local35 < 104 && local130 != 65535) {
							local22 = local22 * 128 + 64;
							local29 = local29 * 128 + 64;
							local32 = local32 * 128 + 64;
							local35 = local35 * 128 + 64;
							@Pc(1002) Class8_Sub1_Sub2_Sub2 local1002 = new Class8_Sub1_Sub2_Sub2(this.method667(local29, this.anInt1042, local22) - local134, local142 + anInt927, local147 + anInt927, local151, -17838, local155, local29, local22, local38, this.anInt1042, local130, local138);
							local1002.method279(local35, local32, this.method667(local35, this.anInt1042, local32) - local138, local142 + anInt927);
							this.aClass37_12.method488(local1002);
						}
					} else if (arg1 == 118) {
						local13 = arg0.method165();
						local22 = this.anInt932 + (local13 >> 4 & 0x7);
						local29 = this.anInt933 + (local13 & 0x7);
						local32 = arg0.method167();
						local35 = arg0.method165();
						local38 = arg0.method167();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							local22 = local22 * 128 + 64;
							local29 = local29 * 128 + 64;
							@Pc(1098) Class8_Sub1_Sub2_Sub1 local1098 = new Class8_Sub1_Sub2_Sub1(local32, this.method667(local29, this.anInt1042, local22) - local35, this.anInt1042, local29, local38, false, anInt927, local22);
							this.aClass37_11.method488(local1098);
						}
					} else if (arg1 == 183) {
						local13 = arg0.method185();
						local22 = local13 >> 2;
						local29 = local13 & 0x3;
						local32 = this.anIntArray250[local22];
						local35 = arg0.method186(535);
						local38 = this.anInt932 + (local35 >> 4 & 0x7);
						local130 = this.anInt933 + (local35 & 0x7);
						local134 = arg0.method193();
						if (local38 >= 0 && local130 >= 0 && local38 < 103 && local130 < 103) {
							local138 = this.anIntArrayArrayArray7[this.anInt1042][local38][local130];
							local142 = this.anIntArrayArrayArray7[this.anInt1042][local38 + 1][local130];
							local147 = this.anIntArrayArrayArray7[this.anInt1042][local38 + 1][local130 + 1];
							local151 = this.anIntArrayArrayArray7[this.anInt1042][local38][local130 + 1];
							if (local32 == 0) {
								@Pc(1216) Class31 local1216 = this.aClass32_1.method404((byte) 4, this.anInt1042, local38, local130);
								if (local1216 != null) {
									local160 = local1216.anInt538 >> 14 & 0x7FFF;
									if (local22 == 2) {
										local1216.aClass8_Sub1_Sub2_6 = new Class8_Sub1_Sub2_Sub6(2, local142, local138, local147, 154, false, local134, local29 + 4, local151, local160);
										local1216.aClass8_Sub1_Sub2_7 = new Class8_Sub1_Sub2_Sub6(2, local142, local138, local147, 154, false, local134, local29 + 1 & 0x3, local151, local160);
									} else {
										local1216.aClass8_Sub1_Sub2_6 = new Class8_Sub1_Sub2_Sub6(local22, local142, local138, local147, 154, false, local134, local29, local151, local160);
									}
								}
							}
							if (local32 == 1) {
								@Pc(1293) Class20 local1293 = this.aClass32_1.method405(this.anInt1042, local130, local38, (byte) 7);
								if (local1293 != null) {
									local1293.aClass8_Sub1_Sub2_2 = new Class8_Sub1_Sub2_Sub6(4, local142, local138, local147, 154, false, local134, 0, local151, local1293.anInt340 >> 14 & 0x7FFF);
								}
							}
							if (local32 == 2) {
								@Pc(1327) Class4 local1327 = this.aClass32_1.method406(843, this.anInt1042, local130, local38);
								if (local22 == 11) {
									local22 = 10;
								}
								if (local1327 != null) {
									local1327.aClass8_Sub1_Sub2_1 = new Class8_Sub1_Sub2_Sub6(local22, local142, local138, local147, 154, false, local134, local29, local151, local1327.anInt76 >> 14 & 0x7FFF);
								}
							}
							if (local32 == 3) {
								@Pc(1366) Class34 local1366 = this.aClass32_1.method407(this.anInt1042, local130, local38);
								if (local1366 != null) {
									local1366.aClass8_Sub1_Sub2_8 = new Class8_Sub1_Sub2_Sub6(22, local142, local138, local147, 154, false, local134, local29, local151, local1366.anInt651 >> 14 & 0x7FFF);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1390) RuntimeException local1390) {
			signlink.reporterror("88317, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local1390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method655(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("39711, " + 44339 + ", " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!USEDZXXV;B)I")
	private int method656(@OriginalArg(0) int arg0, @OriginalArg(1) Class36 arg1) {
		try {
			if (arg1.anIntArrayArray14 == null || arg0 >= arg1.anIntArrayArray14.length) {
				return -2;
			}
			try {
				@Pc(24) int[] local24 = arg1.anIntArrayArray14[arg0];
				@Pc(26) int local26 = 0;
				@Pc(28) int local28 = 0;
				@Pc(30) byte local30 = 0;
				while (true) {
					@Pc(35) int local35 = local24[local28++];
					@Pc(37) int local37 = 0;
					@Pc(39) byte local39 = 0;
					if (local35 == 0) {
						return local26;
					}
					if (local35 == 1) {
						local37 = this.anIntArray228[local24[local28++]];
					}
					if (local35 == 2) {
						local37 = this.anIntArray234[local24[local28++]];
					}
					if (local35 == 3) {
						local37 = this.anIntArray258[local24[local28++]];
					}
					@Pc(86) Class36 local86;
					@Pc(91) int local91;
					@Pc(104) int local104;
					if (local35 == 4) {
						local86 = Class36.aClass36Array1[local24[local28++]];
						local91 = local24[local28++];
						if (local91 >= 0 && local91 < Class2.anInt4 && (!Class2.method4(local91).aBoolean5 || aBoolean196)) {
							for (local104 = 0; local104 < local86.anIntArray110.length; local104++) {
								if (local86.anIntArray110[local104] == local91 + 1) {
									local37 += local86.anIntArray115[local104];
								}
							}
						}
					}
					if (local35 == 5) {
						local37 = this.anIntArray246[local24[local28++]];
					}
					if (local35 == 6) {
						local37 = anIntArray227[this.anIntArray234[local24[local28++]] - 1];
					}
					if (local35 == 7) {
						local37 = this.anIntArray246[local24[local28++]] * 100 / 46875;
					}
					if (local35 == 8) {
						local37 = aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt532;
					}
					@Pc(179) int local179;
					if (local35 == 9) {
						for (local179 = 0; local179 < Class46.anInt800; local179++) {
							if (Class46.aBooleanArray10[local179]) {
								local37 += this.anIntArray234[local179];
							}
						}
					}
					if (local35 == 10) {
						local86 = Class36.aClass36Array1[local24[local28++]];
						local91 = local24[local28++] + 1;
						if (local91 >= 0 && local91 < Class2.anInt4 && (!Class2.method4(local91).aBoolean5 || aBoolean196)) {
							for (local104 = 0; local104 < local86.anIntArray110.length; local104++) {
								if (local86.anIntArray110[local104] == local91) {
									local37 = 999999999;
									break;
								}
							}
						}
					}
					if (local35 == 11) {
						local37 = this.anInt986;
					}
					if (local35 == 12) {
						local37 = this.anInt997;
					}
					if (local35 == 13) {
						local179 = this.anIntArray246[local24[local28++]];
						local91 = local24[local28++];
						local37 = (local179 & 0x1 << local91) == 0 ? 0 : 1;
					}
					if (local35 == 14) {
						local179 = local24[local28++];
						@Pc(294) Class50 local294 = Class50.aClass50Array1[local179];
						local104 = local294.anInt824;
						@Pc(300) int local300 = local294.anInt825;
						@Pc(303) int local303 = local294.anInt826;
						@Pc(309) int local309 = anIntArray249[local303 - local300];
						local37 = this.anIntArray246[local104] >> local300 & local309;
					}
					if (local35 == 15) {
						local39 = 1;
					}
					if (local35 == 16) {
						local39 = 2;
					}
					if (local35 == 17) {
						local39 = 3;
					}
					if (local35 == 18) {
						local37 = (aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 >> 7) + this.anInt944;
					}
					if (local35 == 19) {
						local37 = (aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 >> 7) + this.anInt945;
					}
					if (local35 == 20) {
						local37 = local24[local28++];
					}
					if (local39 == 0) {
						if (local30 == 0) {
							local26 += local37;
						}
						if (local30 == 1) {
							local26 -= local37;
						}
						if (local30 == 2 && local37 != 0) {
							local26 /= local37;
						}
						if (local30 == 3) {
							local26 *= local37;
						}
						local30 = 0;
					} else {
						local30 = local39;
					}
				}
			} catch (@Pc(402) Exception local402) {
				return -1;
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("14362, " + arg0 + ", " + arg1 + ", " + 63 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method657() {
		try {
			signlink.anInt1075 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("21005, " + 7 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method658(@OriginalArg(0) byte arg0) {
		try {
			this.anInt949++;
			this.method627(true);
			this.method652(true);
			this.method627(false);
			this.method652(false);
			this.method665();
			this.method594((byte) 5);
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean210) {
				local35 = this.anInt911;
				if (this.anInt918 / 256 > local35) {
					local35 = this.anInt918 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray236[4] + 128 > local35) {
					local35 = this.anIntArray236[4] + 128;
				}
				local74 = this.anInt912 + this.anInt988 & 0x7FF;
				this.method601(this.anInt881, this.anInt880, local35 * 3 + 600, local74, this.method667(aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563, this.anInt1042, aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562) - 50, local35);
			}
			if (this.aBoolean210) {
				local35 = this.method589();
			} else {
				local35 = this.method588();
			}
			local74 = this.anInt872;
			@Pc(118) int local118 = this.anInt873;
			@Pc(121) int local121 = this.anInt874;
			@Pc(124) int local124 = this.anInt875;
			@Pc(127) int local127 = this.anInt876;
			@Pc(132) boolean local132 = false;
			@Pc(190) int local190;
			for (@Pc(143) int local143 = 0; local143 < 5; local143++) {
				if (this.aBooleanArray12[local143]) {
					local190 = (int) (Math.random() * (double) (this.anIntArray247[local143] * 2 + 1) - (double) this.anIntArray247[local143] + Math.sin((double) this.anIntArray212[local143] * ((double) this.anIntArray244[local143] / 100.0D)) * (double) this.anIntArray236[local143]);
					if (local143 == 0) {
						this.anInt872 += local190;
					}
					if (local143 == 1) {
						this.anInt873 += local190;
					}
					if (local143 == 2) {
						this.anInt874 += local190;
					}
					if (local143 == 3) {
						this.anInt876 = this.anInt876 + local190 & 0x7FF;
					}
					if (local143 == 4) {
						this.anInt875 += local190;
						if (this.anInt875 < 128) {
							this.anInt875 = 128;
						}
						if (this.anInt875 > 383) {
							this.anInt875 = 383;
						}
					}
				}
			}
			local190 = Class8_Sub1_Sub1_Sub1.anInt158;
			Class8_Sub1_Sub2_Sub5.aBoolean161 = true;
			Class8_Sub1_Sub2_Sub5.anInt713 = 0;
			Class8_Sub1_Sub2_Sub5.anInt711 = super.anInt839 - 4;
			Class8_Sub1_Sub2_Sub5.anInt712 = super.anInt840 - 4;
			Class8_Sub1_Sub1.method505();
			this.aClass32_1.method421(local35, this.anInt873, 336, this.anInt875, this.anInt876, this.anInt874, this.anInt872);
			this.aClass32_1.method396();
			this.method697();
			this.method680();
			this.method666(local190);
			this.method661();
			this.aClass29_8.method340(super.aGraphics2, 4, 4);
			this.anInt872 = local74;
			this.anInt873 = local118;
			this.anInt874 = local121;
			this.anInt875 = local124;
			this.anInt876 = local127;
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("24246, " + arg0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILclient!PASMQFXV;I)V")
	private void method659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub1_Sub2_Sub4_Sub1 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != aClass8_Sub1_Sub2_Sub4_Sub1_1 && this.anInt1029 < 400) {
				@Pc(42) String local42;
				if (arg2.anInt517 == 0) {
					local42 = arg2.aString8 + method646(this.anInt917, arg2.anInt532, aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt532) + " (level-" + arg2.anInt532 + ")";
				} else {
					local42 = arg2.aString8 + " (skill-" + arg2.anInt517 + ")";
				}
				@Pc(172) int local172;
				if (this.anInt970 == 1) {
					this.aStringArray13[this.anInt1029] = "Use " + this.aString27 + " with @whi@" + local42;
					this.anIntArray242[this.anInt1029] = 448;
					this.anIntArray243[this.anInt1029] = arg1;
					this.anIntArray240[this.anInt1029] = arg3;
					this.anIntArray241[this.anInt1029] = arg0;
					this.anInt1029++;
				} else if (this.anInt866 != 1) {
					for (local172 = 4; local172 >= 0; local172--) {
						if (this.aStringArray10[local172] != null) {
							this.aStringArray13[this.anInt1029] = this.aStringArray10[local172] + " @whi@" + local42;
							@Pc(199) short local199 = 0;
							if (this.aStringArray10[local172].equalsIgnoreCase("attack")) {
								if (arg2.anInt532 > aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt532) {
									local199 = 2000;
								}
								if (aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt523 != 0 && arg2.anInt523 != 0) {
									if (aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt523 == arg2.anInt523) {
										local199 = 2000;
									} else {
										local199 = 0;
									}
								}
							} else if (this.aBooleanArray11[local172]) {
								local199 = 2000;
							}
							if (local172 == 0) {
								this.anIntArray242[this.anInt1029] = local199 + 380;
							}
							if (local172 == 1) {
								this.anIntArray242[this.anInt1029] = local199 + 915;
							}
							if (local172 == 2) {
								this.anIntArray242[this.anInt1029] = local199 + 401;
							}
							if (local172 == 3) {
								this.anIntArray242[this.anInt1029] = local199 + 766;
							}
							if (local172 == 4) {
								this.anIntArray242[this.anInt1029] = local199 + 820;
							}
							this.anIntArray243[this.anInt1029] = arg1;
							this.anIntArray240[this.anInt1029] = arg3;
							this.anIntArray241[this.anInt1029] = arg0;
							this.anInt1029++;
						}
					}
				} else if ((this.anInt868 & 0x8) == 8) {
					this.aStringArray13[this.anInt1029] = this.aString19 + " @whi@" + local42;
					this.anIntArray242[this.anInt1029] = 751;
					this.anIntArray243[this.anInt1029] = arg1;
					this.anIntArray240[this.anInt1029] = arg3;
					this.anIntArray241[this.anInt1029] = arg0;
					this.anInt1029++;
				}
				for (local172 = 0; local172 < this.anInt1029; local172++) {
					if (this.anIntArray242[local172] == 610) {
						this.aStringArray13[local172] = "Walk here @whi@" + local42;
						return;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("39145, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method660() {
		try {
			this.anInt954 += 0;
			for (@Pc(9) int local9 = -1; local9 < this.anInt961; local9++) {
				@Pc(17) int local17;
				if (local9 == -1) {
					local17 = this.anInt960;
				} else {
					local17 = this.anIntArray232[local9];
				}
				@Pc(29) Class8_Sub1_Sub2_Sub4_Sub1 local29 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local17];
				if (local29 != null) {
					this.method690(local29, 1);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("22004, " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method661() {
		try {
			this.method708((byte) 5);
			if (this.anInt901 == 1) {
				this.aClass8_Sub1_Sub1_Sub3Array8[this.anInt900 / 100].method267(this.anInt898 - 8 - 4, 272, this.anInt899 - 8 - 4);
			}
			if (this.anInt901 == 2) {
				this.aClass8_Sub1_Sub1_Sub3Array8[this.anInt900 / 100 + 4].method267(this.anInt898 - 8 - 4, 272, this.anInt899 - 8 - 4);
			}
			if (this.anInt985 != -1) {
				this.method640(this.anInt985, this.anInt856);
				this.method712(Class36.aClass36Array1[this.anInt985], 0, 0, 0);
			}
			if (this.anInt870 != -1) {
				this.method640(this.anInt870, this.anInt856);
				this.method712(Class36.aClass36Array1[this.anInt870], 0, 0, 0);
			}
			this.method700();
			if (!this.aBoolean216) {
				this.method585();
				this.method606();
			} else if (this.anInt1001 == 0) {
				this.method584();
			}
			if (this.anInt974 == 1) {
				this.aClass8_Sub1_Sub1_Sub3Array5[1].method267(472, 272, 296);
			}
			@Pc(165) int local165;
			if (aBoolean226) {
				@Pc(140) byte local140 = 20;
				@Pc(142) int local142 = 16776960;
				if (super.anInt834 < 15) {
					local142 = 16711680;
				}
				this.aClass8_Sub1_Sub1_Sub2_3.method100(this.anInt871, local142, 20, "Fps:" + super.anInt834);
				local165 = local140 + 15;
				@Pc(167) Runtime local167 = Runtime.getRuntime();
				@Pc(176) int local176 = (int) ((local167.totalMemory() - local167.freeMemory()) / 1024L);
				if (local176 > 33554432 && aBoolean197) {
				}
				this.aClass8_Sub1_Sub1_Sub2_3.method100(this.anInt871, 16776960, 35, "Mem:" + local176 + "k");
				local165 += 15;
			}
			if (this.anInt987 != 0) {
				@Pc(211) int local211 = this.anInt987 / 50;
				local165 = local211 / 60;
				@Pc(219) int local219 = local211 % 60;
				if (local219 < 10) {
					this.aClass8_Sub1_Sub1_Sub2_3.method105("System update in: " + local165 + ":0" + local219, 16776960, 4, 329);
				} else {
					this.aClass8_Sub1_Sub1_Sub2_3.method105("System update in: " + local165 + ":" + local219, 16776960, 4, 329);
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("67481, " + 0 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DSELJCMH;I)V")
	private void method662(@OriginalArg(0) Class8_Sub2 arg0) {
		try {
			@Pc(8) int local8 = 0;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = 0;
			if (arg0.anInt205 == 0) {
				local8 = this.aClass32_1.method408(arg0.anInt204, arg0.anInt206, arg0.anInt207);
			}
			if (arg0.anInt205 == 1) {
				local8 = this.aClass32_1.method409(arg0.anInt206, arg0.anInt207, arg0.anInt204);
			}
			if (arg0.anInt205 == 2) {
				local8 = this.aClass32_1.method410(arg0.anInt204, arg0.anInt206, arg0.anInt207);
			}
			if (arg0.anInt205 == 3) {
				local8 = this.aClass32_1.method411(arg0.anInt204, arg0.anInt206, arg0.anInt207);
			}
			if (local8 != 0) {
				@Pc(83) int local83 = this.aClass32_1.method412(arg0.anInt204, arg0.anInt206, arg0.anInt207, local8);
				local10 = local8 >> 14 & 0x7FFF;
				local12 = local83 & 0x1F;
				local14 = local83 >> 6;
			}
			arg0.anInt208 = local10;
			arg0.anInt210 = local12;
			arg0.anInt209 = local14;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("12683, " + arg0 + ", " + 7 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!VUMXQDFQ;)V")
	private void method663(@OriginalArg(0) byte arg0, @OriginalArg(1) Class8_Sub1_Sub1_Sub4 arg1) {
		try {
			if (arg0 != 116) {
				anInt980 = this.aClass5_2.method29();
			}
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray219.length; local12++) {
				this.anIntArray219[local12] = 0;
			}
			@Pc(37) int local37;
			for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
				local37 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray219[local37] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local37 = 0; local37 < 20; local37++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray220[local67] = (this.anIntArray219[local67 - 1] + this.anIntArray219[local67 + 1] + this.anIntArray219[local67 - 128] + this.anIntArray219[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray219;
				this.anIntArray219 = this.anIntArray220;
				this.anIntArray220 = local113;
			}
			if (arg1 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg1.anInt747; local59++) {
					for (local67 = 0; local67 < arg1.anInt746; local67++) {
						if (arg1.aByteArray18[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg1.anInt748 + 16;
							@Pc(156) int local156 = local59 + arg1.anInt749 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray219[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("76788, " + arg0 + ", " + arg1 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method664() {
		try {
			@Pc(4) Graphics local4 = this.method577().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method570();
			@Pc(47) byte local47;
			@Pc(53) int local53;
			if (this.aBoolean207) {
				this.aBoolean203 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local47 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local53 = local47 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(62) int local62 = local53 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(79) int local79 = local62 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(85) int local85 = local79 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(91) int local91 = local85 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(97) int local97 = local91 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean223) {
				this.aBoolean203 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean222) {
				this.aBoolean203 = false;
				local4.setColor(Color.yellow);
				local47 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local53 = local47 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local53 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local53 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local53 += 30;
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("81836, " + -38814 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method665() {
		try {
			for (@Pc(11) Class8_Sub1_Sub2_Sub2 local11 = (Class8_Sub1_Sub2_Sub2) this.aClass37_12.method491(); local11 != null; local11 = (Class8_Sub1_Sub2_Sub2) this.aClass37_12.method493()) {
				if (local11.anInt320 != this.anInt1042 || anInt927 > local11.anInt326) {
					local11.method554();
				} else if (anInt927 >= local11.anInt325) {
					if (local11.anInt333 > 0) {
						@Pc(41) Class8_Sub1_Sub2_Sub4_Sub2 local41 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local11.anInt333 - 1];
						if (local41 != null && local41.anInt562 >= 0 && local41.anInt562 < 13312 && local41.anInt563 >= 0 && local41.anInt563 < 13312) {
							local11.method279(local41.anInt563, local41.anInt562, this.method667(local41.anInt563, local11.anInt320, local41.anInt562) - local11.anInt330, anInt927);
						}
					}
					if (local11.anInt333 < 0) {
						@Pc(86) int local86 = -local11.anInt333 - 1;
						@Pc(92) Class8_Sub1_Sub2_Sub4_Sub1 local92;
						if (local86 == this.anInt977) {
							local92 = aClass8_Sub1_Sub2_Sub4_Sub1_1;
						} else {
							local92 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local86];
						}
						if (local92 != null && local92.anInt562 >= 0 && local92.anInt562 < 13312 && local92.anInt563 >= 0 && local92.anInt563 < 13312) {
							local11.method279(local92.anInt563, local92.anInt562, this.method667(local92.anInt563, local11.anInt320, local92.anInt562) - local11.anInt330, anInt927);
						}
					}
					local11.method280(this.anInt856);
					this.aClass32_1.method393(this.anInt1042, false, -1, local11, (int) local11.aDouble2, (int) local11.aDouble1, local11.anInt321, 60, (int) local11.aDouble3);
				}
			}
			anInt965++;
			if (anInt965 > 86) {
				anInt965 = 0;
				this.aClass8_Sub1_Sub3_6.method154(140);
			}
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("35042, " + 32731 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method666(@OriginalArg(1) int arg0) {
		try {
			if (this.aByte46 != -50) {
				this.anInt955 = this.aClass8_Sub1_Sub3_7.method165();
			}
			if (!aBoolean197) {
				@Pc(21) Class8_Sub1_Sub1_Sub4 local21;
				@Pc(29) int local29;
				@Pc(37) int local37;
				@Pc(40) byte[] local40;
				@Pc(43) byte[] local43;
				@Pc(45) int local45;
				@Pc(93) int local93;
				if (Class8_Sub1_Sub1_Sub1.anIntArray27[17] >= arg0) {
					local21 = Class8_Sub1_Sub1_Sub1.aClass8_Sub1_Sub1_Sub4Array1[17];
					local29 = local21.anInt746 * local21.anInt747 - 1;
					local37 = local21.anInt746 * this.anInt856 * 2;
					local40 = local21.aByteArray18;
					local43 = this.aByteArray21;
					for (local45 = 0; local45 <= local29; local45++) {
						local43[local45] = local40[local45 - local37 & local29];
					}
					local21.aByteArray18 = local43;
					this.aByteArray21 = local40;
					Class8_Sub1_Sub1_Sub1.method76(this.anInt1047, 17);
					anInt896++;
					if (anInt896 > 1347) {
						anInt896 = 0;
						this.aClass8_Sub1_Sub3_6.method154(132);
						this.aClass8_Sub1_Sub3_6.method155(0);
						local93 = this.aClass8_Sub1_Sub3_6.anInt253;
						this.aClass8_Sub1_Sub3_6.method156((int) (Math.random() * 65536.0D));
						this.aClass8_Sub1_Sub3_6.method156((int) (Math.random() * 65536.0D));
						this.aClass8_Sub1_Sub3_6.method155(222);
						this.aClass8_Sub1_Sub3_6.method155(172);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass8_Sub1_Sub3_6.method155(232);
						}
						this.aClass8_Sub1_Sub3_6.method156(38986);
						this.aClass8_Sub1_Sub3_6.method156(3803);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass8_Sub1_Sub3_6.method156(25132);
						}
						this.aClass8_Sub1_Sub3_6.method155(125);
						this.aClass8_Sub1_Sub3_6.method155((int) (Math.random() * 256.0D));
						this.aClass8_Sub1_Sub3_6.method164(this.aClass8_Sub1_Sub3_6.anInt253 - local93);
					}
				}
				if (Class8_Sub1_Sub1_Sub1.anIntArray27[24] >= arg0) {
					local21 = Class8_Sub1_Sub1_Sub1.aClass8_Sub1_Sub1_Sub4Array1[24];
					local29 = local21.anInt746 * local21.anInt747 - 1;
					local37 = local21.anInt746 * this.anInt856 * 2;
					local40 = local21.aByteArray18;
					local43 = this.aByteArray21;
					for (local45 = 0; local45 <= local29; local45++) {
						local43[local45] = local40[local45 - local37 & local29];
					}
					local21.aByteArray18 = local43;
					this.aByteArray21 = local40;
					Class8_Sub1_Sub1_Sub1.method76(this.anInt1047, 24);
					anInt1045++;
					if (anInt1045 > 1503) {
						anInt1045 = 0;
						this.aClass8_Sub1_Sub3_6.method154(126);
						this.aClass8_Sub1_Sub3_6.method155(0);
						local93 = this.aClass8_Sub1_Sub3_6.anInt253;
						this.aClass8_Sub1_Sub3_6.method156((int) (Math.random() * 65536.0D));
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass8_Sub1_Sub3_6.method156(45879);
						}
						this.aClass8_Sub1_Sub3_6.method156(49559);
						this.aClass8_Sub1_Sub3_6.method156(4938);
						this.aClass8_Sub1_Sub3_6.method156(15448);
						this.aClass8_Sub1_Sub3_6.method155(202);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass8_Sub1_Sub3_6.method156(8014);
						}
						this.aClass8_Sub1_Sub3_6.method155(173);
						this.aClass8_Sub1_Sub3_6.method155((int) (Math.random() * 256.0D));
						this.aClass8_Sub1_Sub3_6.method156((int) (Math.random() * 65536.0D));
						this.aClass8_Sub1_Sub3_6.method164(this.aClass8_Sub1_Sub3_6.anInt253 - local93);
					}
				}
				if (Class8_Sub1_Sub1_Sub1.anIntArray27[34] >= arg0) {
					local21 = Class8_Sub1_Sub1_Sub1.aClass8_Sub1_Sub1_Sub4Array1[34];
					local29 = local21.anInt746 * local21.anInt747 - 1;
					local37 = local21.anInt746 * this.anInt856 * 2;
					local40 = local21.aByteArray18;
					local43 = this.aByteArray21;
					for (local45 = 0; local45 <= local29; local45++) {
						local43[local45] = local40[local45 - local37 & local29];
					}
					local21.aByteArray18 = local43;
					this.aByteArray21 = local40;
					Class8_Sub1_Sub1_Sub1.method76(this.anInt1047, 34);
					return;
				}
			}
		} catch (@Pc(371) RuntimeException local371) {
			signlink.reporterror("76496, " + -50 + ", " + arg0 + ", " + local371.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IIII)I")
	private int method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(9) int local9 = arg2 >> 7;
			@Pc(13) int local13 = arg0 >> 7;
			if (local9 < 0 || local13 < 0 || local9 > 103 || local13 > 103) {
				return 0;
			}
			@Pc(27) int local27 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local9][local13] & 0x2) == 2) {
				local27 = arg1 + 1;
			}
			@Pc(47) int local47 = arg2 & 0x7F;
			@Pc(51) int local51 = arg0 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray7[local27][local9][local13] * (128 - local47) + this.anIntArrayArrayArray7[local27][local9 + 1][local13] * local47 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray7[local27][local9][local13 + 1] * (128 - local47) + this.anIntArrayArrayArray7[local27][local9 + 1][local13 + 1] * local47 >> 7;
			return local79 * (128 - local51) + local111 * local51 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("5575, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -23 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method668(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean193) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method676(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method572() {
		this.method579(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt833 = 5;
		}
		if (aBoolean206) {
			this.aBoolean222 = true;
			return;
		}
		aBoolean206 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method618();
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
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean223 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(83) int local83 = 0; local83 < 5; local83++) {
				this.aClass39Array1[local83] = new Class39(local83 + 1, (byte) -31, 500000, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local83]);
			}
		}
		try {
			this.method643();
			this.aClass45_1 = this.method705("title", "title screen", anInt980, 1, this.anIntArray245[1], 25);
			this.aClass8_Sub1_Sub1_Sub2_2 = new Class8_Sub1_Sub1_Sub2("p11_full", 0, false, this.aClass45_1);
			this.aClass8_Sub1_Sub1_Sub2_3 = new Class8_Sub1_Sub1_Sub2("p12_full", 0, false, this.aClass45_1);
			this.aClass8_Sub1_Sub1_Sub2_4 = new Class8_Sub1_Sub1_Sub2("b12_full", 0, false, this.aClass45_1);
			this.aClass8_Sub1_Sub1_Sub2_5 = new Class8_Sub1_Sub1_Sub2("q8_full", 0, true, this.aClass45_1);
			this.method592();
			this.method615();
			@Pc(179) Class45 local179 = this.method705("config", "config", anInt980, 2, this.anIntArray245[2], 30);
			@Pc(191) Class45 local191 = this.method705("interface", "interface", anInt980, 3, this.anIntArray245[3], 35);
			@Pc(203) Class45 local203 = this.method705("media", "2d graphics", anInt980, 4, this.anIntArray245[4], 40);
			@Pc(215) Class45 local215 = this.method705("textures", "textures", anInt980, 6, this.anIntArray245[6], 45);
			@Pc(227) Class45 local227 = this.method705("wordenc", "chat system", anInt980, 7, this.anIntArray245[7], 50);
			@Pc(239) Class45 local239 = this.method705("sounds", "sound effects", anInt980, 8, this.anIntArray245[8], 55);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass32_1 = new Class32(104, this.anIntArrayArrayArray7, 4, 104, 636);
			for (@Pc(264) int local264 = 0; local264 < 4; local264++) {
				this.aClass11Array1[local264] = new Class11(585, 104, 104);
			}
			this.aClass8_Sub1_Sub1_Sub3_13 = new Class8_Sub1_Sub1_Sub3(512, 512);
			@Pc(299) Class45 local299 = this.method705("versionlist", "update list", anInt980, 5, this.anIntArray245[5], 60);
			this.method579(60, "Connecting to update server");
			this.aClass21_Sub1_1 = new Class21_Sub1();
			this.aClass21_Sub1_1.method307(local299, this);
			Class35.method444(this.aClass21_Sub1_1.method317());
			Class8_Sub1_Sub2_Sub5.method460(this.aClass21_Sub1_1.method314(0), this.aClass21_Sub1_1);
			if (!aBoolean197) {
				this.anInt921 = 0;
				try {
					this.anInt921 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(340) Exception local340) {
				}
				this.aBoolean204 = true;
				this.aClass21_Sub1_1.method305(2, this.anInt921);
				while (this.aClass21_Sub1_1.method306() > 0) {
					this.method598();
					try {
						Thread.sleep(100L);
					} catch (@Pc(358) Exception local358) {
					}
					if (this.aClass21_Sub1_1.anInt354 > 3) {
						this.method671("ondemand");
						return;
					}
				}
			}
			this.method579(65, "Requesting animations");
			@Pc(382) int local382 = this.aClass21_Sub1_1.method314(1);
			for (@Pc(384) int local384 = 0; local384 < local382; local384++) {
				this.aClass21_Sub1_1.method305(1, local384);
			}
			@Pc(403) int local403;
			while (this.aClass21_Sub1_1.method306() > 0) {
				local403 = local382 - this.aClass21_Sub1_1.method306();
				if (local403 > 0) {
					this.method579(65, "Loading animations - " + local403 * 100 / local382 + "%");
				}
				this.method598();
				try {
					Thread.sleep(100L);
				} catch (@Pc(429) Exception local429) {
				}
				if (this.aClass21_Sub1_1.anInt354 > 3) {
					this.method671("ondemand");
					return;
				}
			}
			this.method579(70, "Requesting models");
			local382 = this.aClass21_Sub1_1.method314(0);
			@Pc(463) int local463;
			for (local403 = 0; local403 < local382; local403++) {
				local463 = this.aClass21_Sub1_1.method298(local403);
				if ((local463 & 0x1) != 0) {
					this.aClass21_Sub1_1.method305(0, local403);
				}
			}
			local382 = this.aClass21_Sub1_1.method306();
			while (this.aClass21_Sub1_1.method306() > 0) {
				local463 = local382 - this.aClass21_Sub1_1.method306();
				if (local463 > 0) {
					this.method579(70, "Loading models - " + local463 * 100 / local382 + "%");
				}
				this.method598();
				try {
					Thread.sleep(100L);
				} catch (@Pc(514) Exception local514) {
				}
			}
			if (this.aClass39Array1[0] != null) {
				this.method579(75, "Requesting maps");
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(48, 0, 47));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(48, 1, 47));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(48, 0, 48));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(48, 1, 48));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(48, 0, 49));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(48, 1, 49));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(47, 0, 47));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(47, 1, 47));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(47, 0, 48));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(47, 1, 48));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(148, 0, 48));
				this.aClass21_Sub1_1.method305(3, this.aClass21_Sub1_1.method316(148, 1, 48));
				local382 = this.aClass21_Sub1_1.method306();
				while (this.aClass21_Sub1_1.method306() > 0) {
					local463 = local382 - this.aClass21_Sub1_1.method306();
					if (local463 > 0) {
						this.method579(75, "Loading maps - " + local463 * 100 / local382 + "%");
					}
					this.method598();
					try {
						Thread.sleep(100L);
					} catch (@Pc(699) Exception local699) {
					}
				}
			}
			local382 = this.aClass21_Sub1_1.method314(0);
			@Pc(720) int local720;
			for (local463 = 0; local463 < local382; local463++) {
				local720 = this.aClass21_Sub1_1.method298(local463);
				@Pc(722) byte local722 = 0;
				if ((local720 & 0x8) != 0) {
					local722 = 10;
				} else if ((local720 & 0x20) != 0) {
					local722 = 9;
				} else if ((local720 & 0x10) != 0) {
					local722 = 8;
				} else if ((local720 & 0x40) != 0) {
					local722 = 7;
				} else if ((local720 & 0x80) != 0) {
					local722 = 6;
				} else if ((local720 & 0x2) != 0) {
					local722 = 5;
				} else if ((local720 & 0x4) != 0) {
					local722 = 4;
				}
				if ((local720 & 0x1) != 0) {
					local722 = 3;
				}
				if (local722 != 0) {
					this.aClass21_Sub1_1.method313(0, local722, local463);
				}
			}
			this.aClass21_Sub1_1.method297(aBoolean196);
			if (!aBoolean197) {
				local382 = this.aClass21_Sub1_1.method314(2);
				for (local720 = 1; local720 < local382; local720++) {
					if (this.aClass21_Sub1_1.method302(local720)) {
						this.aClass21_Sub1_1.method313(2, (byte) 1, local720);
					}
				}
			}
			this.method579(80, "Unpacking media");
			this.aClass8_Sub1_Sub1_Sub4_1 = new Class8_Sub1_Sub1_Sub4(local203, "invback", 0);
			this.aClass8_Sub1_Sub1_Sub4_3 = new Class8_Sub1_Sub1_Sub4(local203, "chatback", 0);
			this.aClass8_Sub1_Sub1_Sub4_2 = new Class8_Sub1_Sub1_Sub4(local203, "mapback", 0);
			this.aClass8_Sub1_Sub1_Sub4_6 = new Class8_Sub1_Sub1_Sub4(local203, "backbase1", 0);
			this.aClass8_Sub1_Sub1_Sub4_7 = new Class8_Sub1_Sub1_Sub4(local203, "backbase2", 0);
			this.aClass8_Sub1_Sub1_Sub4_8 = new Class8_Sub1_Sub1_Sub4(local203, "backhmid1", 0);
			for (local720 = 0; local720 < 13; local720++) {
				this.aClass8_Sub1_Sub1_Sub4Array2[local720] = new Class8_Sub1_Sub1_Sub4(local203, "sideicons", local720);
			}
			this.aClass8_Sub1_Sub1_Sub3_3 = new Class8_Sub1_Sub1_Sub3(local203, "compass", 0);
			this.aClass8_Sub1_Sub1_Sub3_16 = new Class8_Sub1_Sub1_Sub3(local203, "mapedge", 0);
			this.aClass8_Sub1_Sub1_Sub3_16.method264();
			@Pc(922) int local922;
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass8_Sub1_Sub1_Sub4Array3[local922] = new Class8_Sub1_Sub1_Sub4(local203, "mapscene", local922);
				}
			} catch (@Pc(940) Exception local940) {
			}
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass8_Sub1_Sub1_Sub3Array4[local922] = new Class8_Sub1_Sub1_Sub3(local203, "mapfunction", local922);
				}
			} catch (@Pc(960) Exception local960) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass8_Sub1_Sub1_Sub3Array6[local922] = new Class8_Sub1_Sub1_Sub3(local203, "hitmarks", local922);
				}
			} catch (@Pc(980) Exception local980) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass8_Sub1_Sub1_Sub3Array5[local922] = new Class8_Sub1_Sub1_Sub3(local203, "headicons", local922);
				}
			} catch (@Pc(1000) Exception local1000) {
			}
			this.aClass8_Sub1_Sub1_Sub3_9 = new Class8_Sub1_Sub1_Sub3(local203, "mapmarker", 0);
			this.aClass8_Sub1_Sub1_Sub3_10 = new Class8_Sub1_Sub1_Sub3(local203, "mapmarker", 1);
			for (local922 = 0; local922 < 8; local922++) {
				this.aClass8_Sub1_Sub1_Sub3Array8[local922] = new Class8_Sub1_Sub1_Sub3(local203, "cross", local922);
			}
			this.aClass8_Sub1_Sub1_Sub3_4 = new Class8_Sub1_Sub1_Sub3(local203, "mapdots", 0);
			this.aClass8_Sub1_Sub1_Sub3_5 = new Class8_Sub1_Sub1_Sub3(local203, "mapdots", 1);
			this.aClass8_Sub1_Sub1_Sub3_6 = new Class8_Sub1_Sub1_Sub3(local203, "mapdots", 2);
			this.aClass8_Sub1_Sub1_Sub3_7 = new Class8_Sub1_Sub1_Sub3(local203, "mapdots", 3);
			this.aClass8_Sub1_Sub1_Sub3_8 = new Class8_Sub1_Sub1_Sub3(local203, "mapdots", 4);
			this.aClass8_Sub1_Sub1_Sub4_4 = new Class8_Sub1_Sub1_Sub4(local203, "scrollbar", 0);
			this.aClass8_Sub1_Sub1_Sub4_5 = new Class8_Sub1_Sub1_Sub4(local203, "scrollbar", 1);
			this.aClass8_Sub1_Sub1_Sub4_14 = new Class8_Sub1_Sub1_Sub4(local203, "redstone1", 0);
			this.aClass8_Sub1_Sub1_Sub4_15 = new Class8_Sub1_Sub1_Sub4(local203, "redstone2", 0);
			this.aClass8_Sub1_Sub1_Sub4_16 = new Class8_Sub1_Sub1_Sub4(local203, "redstone3", 0);
			this.aClass8_Sub1_Sub1_Sub4_17 = new Class8_Sub1_Sub1_Sub4(local203, "redstone1", 0);
			this.aClass8_Sub1_Sub1_Sub4_17.method516();
			this.aClass8_Sub1_Sub1_Sub4_18 = new Class8_Sub1_Sub1_Sub4(local203, "redstone2", 0);
			this.aClass8_Sub1_Sub1_Sub4_18.method516();
			this.aClass8_Sub1_Sub1_Sub4_9 = new Class8_Sub1_Sub1_Sub4(local203, "redstone1", 0);
			this.aClass8_Sub1_Sub1_Sub4_9.method517((byte) 2);
			this.aClass8_Sub1_Sub1_Sub4_10 = new Class8_Sub1_Sub1_Sub4(local203, "redstone2", 0);
			this.aClass8_Sub1_Sub1_Sub4_10.method517((byte) 2);
			this.aClass8_Sub1_Sub1_Sub4_11 = new Class8_Sub1_Sub1_Sub4(local203, "redstone3", 0);
			this.aClass8_Sub1_Sub1_Sub4_11.method517((byte) 2);
			this.aClass8_Sub1_Sub1_Sub4_12 = new Class8_Sub1_Sub1_Sub4(local203, "redstone1", 0);
			this.aClass8_Sub1_Sub1_Sub4_12.method516();
			this.aClass8_Sub1_Sub1_Sub4_12.method517((byte) 2);
			this.aClass8_Sub1_Sub1_Sub4_13 = new Class8_Sub1_Sub1_Sub4(local203, "redstone2", 0);
			this.aClass8_Sub1_Sub1_Sub4_13.method516();
			this.aClass8_Sub1_Sub1_Sub4_13.method517((byte) 2);
			for (@Pc(1208) int local1208 = 0; local1208 < 2; local1208++) {
				this.aClass8_Sub1_Sub1_Sub4Array4[local1208] = new Class8_Sub1_Sub1_Sub4(local203, "mod_icons", local1208);
			}
			@Pc(1231) Class8_Sub1_Sub1_Sub3 local1231 = new Class8_Sub1_Sub1_Sub3(local203, "backleft1", 0);
			this.aClass29_10 = new Class29(local1231.anInt311, local1231.anInt310, true, this.method577());
			local1231.method265(0, 0);
			@Pc(1256) Class8_Sub1_Sub1_Sub3 local1256 = new Class8_Sub1_Sub1_Sub3(local203, "backleft2", 0);
			this.aClass29_11 = new Class29(local1256.anInt311, local1256.anInt310, true, this.method577());
			local1256.method265(0, 0);
			@Pc(1281) Class8_Sub1_Sub1_Sub3 local1281 = new Class8_Sub1_Sub1_Sub3(local203, "backright1", 0);
			this.aClass29_12 = new Class29(local1281.anInt311, local1281.anInt310, true, this.method577());
			local1281.method265(0, 0);
			@Pc(1306) Class8_Sub1_Sub1_Sub3 local1306 = new Class8_Sub1_Sub1_Sub3(local203, "backright2", 0);
			this.aClass29_13 = new Class29(local1306.anInt311, local1306.anInt310, true, this.method577());
			local1306.method265(0, 0);
			@Pc(1331) Class8_Sub1_Sub1_Sub3 local1331 = new Class8_Sub1_Sub1_Sub3(local203, "backtop1", 0);
			this.aClass29_14 = new Class29(local1331.anInt311, local1331.anInt310, true, this.method577());
			local1331.method265(0, 0);
			@Pc(1356) Class8_Sub1_Sub1_Sub3 local1356 = new Class8_Sub1_Sub1_Sub3(local203, "backvmid1", 0);
			this.aClass29_15 = new Class29(local1356.anInt311, local1356.anInt310, true, this.method577());
			local1356.method265(0, 0);
			@Pc(1381) Class8_Sub1_Sub1_Sub3 local1381 = new Class8_Sub1_Sub1_Sub3(local203, "backvmid2", 0);
			this.aClass29_16 = new Class29(local1381.anInt311, local1381.anInt310, true, this.method577());
			local1381.method265(0, 0);
			@Pc(1406) Class8_Sub1_Sub1_Sub3 local1406 = new Class8_Sub1_Sub1_Sub3(local203, "backvmid3", 0);
			this.aClass29_17 = new Class29(local1406.anInt311, local1406.anInt310, true, this.method577());
			local1406.method265(0, 0);
			@Pc(1431) Class8_Sub1_Sub1_Sub3 local1431 = new Class8_Sub1_Sub1_Sub3(local203, "backhmid2", 0);
			this.aClass29_18 = new Class29(local1431.anInt311, local1431.anInt310, true, this.method577());
			local1431.method265(0, 0);
			@Pc(1456) int local1456 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1463) int local1463 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1470) int local1470 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1477) int local1477 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1479) int local1479 = 0; local1479 < 100; local1479++) {
				if (this.aClass8_Sub1_Sub1_Sub3Array4[local1479] != null) {
					this.aClass8_Sub1_Sub1_Sub3Array4[local1479].method263(local1470 + local1477, local1463 + local1477, local1456 + local1477);
				}
				if (this.aClass8_Sub1_Sub1_Sub4Array3[local1479] != null) {
					this.aClass8_Sub1_Sub1_Sub4Array3[local1479].method518(local1470 + local1477, local1463 + local1477, local1456 + local1477);
				}
			}
			this.method579(83, "Unpacking textures");
			Class8_Sub1_Sub1_Sub1.method74(local215);
			Class8_Sub1_Sub1_Sub1.method78(0.8D);
			Class8_Sub1_Sub1_Sub1.method73();
			this.method579(86, "Unpacking config");
			Class40.method521(local179);
			Class33.method437(local179);
			Class28.method335(local179);
			Class2.method12(local179);
			Class26.method321(local179);
			Class14.method140(local179);
			Class44.method549(local179);
			Class3.method27(local179);
			Class50.method565(local179);
			Class2.aBoolean2 = aBoolean196;
			if (!aBoolean197) {
				this.method579(90, "Unpacking sounds");
				@Pc(1582) byte[] local1582 = local239.method553("sounds.dat", null);
				@Pc(1588) Class8_Sub1_Sub3 local1588 = new Class8_Sub1_Sub3(local1582, -49015);
				Class7.method32(local1588);
			}
			this.method579(95, "Unpacking interfaces");
			@Pc(1619) Class8_Sub1_Sub1_Sub2[] local1619 = new Class8_Sub1_Sub1_Sub2[] { this.aClass8_Sub1_Sub1_Sub2_2, this.aClass8_Sub1_Sub1_Sub2_3, this.aClass8_Sub1_Sub1_Sub2_4, this.aClass8_Sub1_Sub1_Sub2_5 };
			Class36.method451(local203, local1619, local191);
			this.method579(100, "Preparing game engine");
			@Pc(1635) int local1635;
			@Pc(1637) int local1637;
			@Pc(1639) int local1639;
			for (@Pc(1631) int local1631 = 0; local1631 < 33; local1631++) {
				local1635 = 999;
				local1637 = 0;
				for (local1639 = 0; local1639 < 34; local1639++) {
					if (this.aClass8_Sub1_Sub1_Sub4_2.aByteArray18[local1639 + local1631 * this.aClass8_Sub1_Sub1_Sub4_2.anInt746] == 0) {
						if (local1635 == 999) {
							local1635 = local1639;
						}
					} else if (local1635 != 999) {
						local1637 = local1639;
						break;
					}
				}
				this.anIntArray235[local1631] = local1635;
				this.anIntArray231[local1631] = local1637 - local1635;
			}
			@Pc(1697) int local1697;
			for (local1635 = 5; local1635 < 156; local1635++) {
				local1637 = 999;
				local1639 = 0;
				for (local1697 = 25; local1697 < 172; local1697++) {
					if (this.aClass8_Sub1_Sub1_Sub4_2.aByteArray18[local1697 + local1635 * this.aClass8_Sub1_Sub1_Sub4_2.anInt746] == 0 && (local1697 > 34 || local1635 > 34)) {
						if (local1637 == 999) {
							local1637 = local1697;
						}
					} else if (local1637 != 999) {
						local1639 = local1697;
						break;
					}
				}
				this.anIntArray215[local1635 - 5] = local1637 - 25;
				this.anIntArray230[local1635 - 5] = local1639 - local1637;
			}
			Class8_Sub1_Sub1_Sub1.method71(479, 96);
			this.anIntArray251 = Class8_Sub1_Sub1_Sub1.anIntArray25;
			Class8_Sub1_Sub1_Sub1.method71(190, 261);
			this.anIntArray252 = Class8_Sub1_Sub1_Sub1.anIntArray25;
			Class8_Sub1_Sub1_Sub1.method71(512, 334);
			this.anIntArray253 = Class8_Sub1_Sub1_Sub1.anIntArray25;
			@Pc(1781) int[] local1781 = new int[9];
			for (local1639 = 0; local1639 < 9; local1639++) {
				local1697 = local1639 * 32 + 128 + 15;
				@Pc(1799) int local1799 = local1697 * 3 + 600;
				@Pc(1803) int local1803 = Class8_Sub1_Sub1_Sub1.anIntArray23[local1697];
				local1781[local1639] = local1799 * local1803 >> 16;
			}
			Class32.method418(local1781);
			Class19.method210(local227);
			this.aClass42_1 = new Class42(this, 76);
			this.method578(this.aClass42_1, 10);
			Class8_Sub1_Sub2_Sub6.aClient5 = this;
			Class33.aClient3 = this;
			Class26.aClient2 = this;
		} catch (@Pc(1844) Exception local1844) {
			signlink.reporterror("loaderror " + this.aString25 + " " + this.anInt981);
			this.aBoolean207 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method578(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method578(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!INVDQNJU;IBI)V")
	private void method669(@OriginalArg(0) Class8_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(17) int local17 = this.anInt912 + this.anInt1011 & 0x7FF;
			@Pc(25) int local25 = arg3 * arg3 + arg1 * arg1;
			if (local25 <= 6400) {
				@Pc(33) int local33 = Class8_Sub1_Sub2_Sub5.anIntArray153[local17];
				@Pc(37) int local37 = Class8_Sub1_Sub2_Sub5.anIntArray154[local17];
				@Pc(46) int local46 = local33 * 256 / (this.anInt934 + 256);
				@Pc(55) int local55 = local37 * 256 / (this.anInt934 + 256);
				@Pc(65) int local65 = arg1 * local46 + arg3 * local55 >> 16;
				@Pc(75) int local75 = arg1 * local55 - arg3 * local46 >> 16;
				if (local25 > 2500) {
					arg0.method273(this.aClass8_Sub1_Sub1_Sub4_2, local65 + 94 + 4 - arg0.anInt314 / 2, 83 - local75 - arg0.anInt315 / 2 - 4);
				} else {
					arg0.method267(local65 + 94 + 4 - arg0.anInt314 / 2, 272, 83 - local75 - arg0.anInt315 / 2 - 4);
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("50042, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZLclient!USEDZXXV;II)V")
	private void method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg3) {
				this.aBoolean195 = !this.aBoolean195;
			}
			if (arg4.anInt669 == 0 && arg4.anIntArray108 != null && !arg4.aBoolean148 && (arg5 >= arg0 && arg6 >= arg2 && arg5 <= arg0 + arg4.anInt682 && arg6 <= arg2 + arg4.anInt679)) {
				@Pc(44) int local44 = arg4.anIntArray108.length;
				for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
					@Pc(55) int local55 = arg4.anIntArray114[local46] + arg0;
					@Pc(64) int local64 = arg4.anIntArray109[local46] + arg2 - arg1;
					@Pc(71) Class36 local71 = Class36.aClass36Array1[arg4.anIntArray108[local46]];
					@Pc(76) int local76 = local55 + local71.anInt660;
					@Pc(81) int local81 = local64 + local71.anInt674;
					if ((local71.anInt672 >= 0 || local71.anInt685 != 0) && arg5 >= local76 && arg6 >= local81 && arg5 < local76 + local71.anInt682 && arg6 < local81 + local71.anInt679) {
						if (local71.anInt672 >= 0) {
							this.anInt855 = local71.anInt672;
						} else {
							this.anInt855 = local71.anInt684;
						}
					}
					if (local71.anInt669 == 0) {
						this.method670(local76, local71.anInt683, local81, this.aBoolean195, local71, arg5, arg6);
						if (local71.anInt664 > local71.anInt679) {
							this.method597(local76 + local71.anInt682, this.aBoolean217, local81, arg5, local71, local71.anInt664, local71.anInt679, true, arg6);
						}
					} else {
						if (local71.anInt675 == 1 && arg5 >= local76 && arg6 >= local81 && arg5 < local76 + local71.anInt682 && arg6 < local81 + local71.anInt679) {
							@Pc(180) boolean local180 = false;
							if (local71.anInt681 != 0) {
								local180 = this.method614(local71, this.aBoolean201);
							}
							if (!local180) {
								this.aStringArray13[this.anInt1029] = local71.aString14;
								this.anIntArray242[this.anInt1029] = 612;
								this.anIntArray241[this.anInt1029] = local71.anInt684;
								this.anInt1029++;
							}
						}
						if (local71.anInt675 == 2 && this.anInt866 == 0 && arg5 >= local76 && arg6 >= local81 && arg5 < local76 + local71.anInt682 && arg6 < local81 + local71.anInt679) {
							@Pc(245) String local245 = local71.aString11;
							if (local245.indexOf(" ") != -1) {
								local245 = local245.substring(0, local245.indexOf(" "));
							}
							this.aStringArray13[this.anInt1029] = local245 + " @gre@" + local71.aString12;
							this.anIntArray242[this.anInt1029] = 482;
							this.anIntArray241[this.anInt1029] = local71.anInt684;
							this.anInt1029++;
						}
						if (local71.anInt675 == 3 && arg5 >= local76 && arg6 >= local81 && arg5 < local76 + local71.anInt682 && arg6 < local81 + local71.anInt679) {
							this.aStringArray13[this.anInt1029] = "Close";
							this.anIntArray242[this.anInt1029] = 236;
							this.anIntArray241[this.anInt1029] = local71.anInt684;
							this.anInt1029++;
						}
						if (local71.anInt675 == 4 && arg5 >= local76 && arg6 >= local81 && arg5 < local76 + local71.anInt682 && arg6 < local81 + local71.anInt679) {
							this.aStringArray13[this.anInt1029] = local71.aString14;
							this.anIntArray242[this.anInt1029] = 51;
							this.anIntArray241[this.anInt1029] = local71.anInt684;
							this.anInt1029++;
						}
						if (local71.anInt675 == 5 && arg5 >= local76 && arg6 >= local81 && arg5 < local76 + local71.anInt682 && arg6 < local81 + local71.anInt679) {
							this.aStringArray13[this.anInt1029] = local71.aString14;
							this.anIntArray242[this.anInt1029] = 137;
							this.anIntArray241[this.anInt1029] = local71.anInt684;
							this.anInt1029++;
						}
						if (local71.anInt675 == 6 && !this.aBoolean233 && arg5 >= local76 && arg6 >= local81 && arg5 < local76 + local71.anInt682 && arg6 < local81 + local71.anInt679) {
							this.aStringArray13[this.anInt1029] = local71.aString14;
							this.anIntArray242[this.anInt1029] = 806;
							this.anIntArray241[this.anInt1029] = local71.anInt684;
							this.anInt1029++;
						}
						if (local71.anInt669 == 2) {
							@Pc(493) int local493 = 0;
							for (@Pc(495) int local495 = 0; local495 < local71.anInt679; local495++) {
								for (@Pc(499) int local499 = 0; local499 < local71.anInt682; local499++) {
									@Pc(510) int local510 = local76 + local499 * (local71.anInt663 + 32);
									@Pc(519) int local519 = local81 + local495 * (local71.anInt658 + 32);
									if (local493 < 20) {
										local510 += local71.anIntArray113[local493];
										local519 += local71.anIntArray107[local493];
									}
									if (arg5 >= local510 && arg6 >= local519 && arg5 < local510 + 32 && arg6 < local519 + 32) {
										this.anInt1049 = local493;
										this.anInt1050 = local71.anInt684;
										if (local71.anIntArray110[local493] > 0) {
											@Pc(572) Class2 local572 = Class2.method4(local71.anIntArray110[local493] - 1);
											if (this.anInt970 == 1 && local71.aBoolean147) {
												if (local71.anInt684 != this.anInt972 || local493 != this.anInt971) {
													this.aStringArray13[this.anInt1029] = "Use " + this.aString27 + " with @lre@" + local572.aString1;
													this.anIntArray242[this.anInt1029] = 485;
													this.anIntArray243[this.anInt1029] = local572.anInt19;
													this.anIntArray240[this.anInt1029] = local493;
													this.anIntArray241[this.anInt1029] = local71.anInt684;
													this.anInt1029++;
												}
											} else if (this.anInt866 != 1 || !local71.aBoolean147) {
												@Pc(709) int local709;
												if (local71.aBoolean147) {
													for (local709 = 4; local709 >= 3; local709--) {
														if (local572.aStringArray2 != null && local572.aStringArray2[local709] != null) {
															this.aStringArray13[this.anInt1029] = local572.aStringArray2[local709] + " @lre@" + local572.aString1;
															if (local709 == 3) {
																this.anIntArray242[this.anInt1029] = 532;
															}
															if (local709 == 4) {
																this.anIntArray242[this.anInt1029] = 8;
															}
															this.anIntArray243[this.anInt1029] = local572.anInt19;
															this.anIntArray240[this.anInt1029] = local493;
															this.anIntArray241[this.anInt1029] = local71.anInt684;
															this.anInt1029++;
														} else if (local709 == 4) {
															this.aStringArray13[this.anInt1029] = "Drop @lre@" + local572.aString1;
															this.anIntArray242[this.anInt1029] = 8;
															this.anIntArray243[this.anInt1029] = local572.anInt19;
															this.anIntArray240[this.anInt1029] = local493;
															this.anIntArray241[this.anInt1029] = local71.anInt684;
															this.anInt1029++;
														}
													}
												}
												if (local71.aBoolean155) {
													this.aStringArray13[this.anInt1029] = "Use @lre@" + local572.aString1;
													this.anIntArray242[this.anInt1029] = 959;
													this.anIntArray243[this.anInt1029] = local572.anInt19;
													this.anIntArray240[this.anInt1029] = local493;
													this.anIntArray241[this.anInt1029] = local71.anInt684;
													this.anInt1029++;
												}
												if (local71.aBoolean147 && local572.aStringArray2 != null) {
													for (local709 = 2; local709 >= 0; local709--) {
														if (local572.aStringArray2[local709] != null) {
															this.aStringArray13[this.anInt1029] = local572.aStringArray2[local709] + " @lre@" + local572.aString1;
															if (local709 == 0) {
																this.anIntArray242[this.anInt1029] = 375;
															}
															if (local709 == 1) {
																this.anIntArray242[this.anInt1029] = 10;
															}
															if (local709 == 2) {
																this.anIntArray242[this.anInt1029] = 132;
															}
															this.anIntArray243[this.anInt1029] = local572.anInt19;
															this.anIntArray240[this.anInt1029] = local493;
															this.anIntArray241[this.anInt1029] = local71.anInt684;
															this.anInt1029++;
														}
													}
												}
												if (local71.aStringArray6 != null) {
													for (local709 = 4; local709 >= 0; local709--) {
														if (local71.aStringArray6[local709] != null) {
															this.aStringArray13[this.anInt1029] = local71.aStringArray6[local709] + " @lre@" + local572.aString1;
															if (local709 == 0) {
																this.anIntArray242[this.anInt1029] = 355;
															}
															if (local709 == 1) {
																this.anIntArray242[this.anInt1029] = 416;
															}
															if (local709 == 2) {
																this.anIntArray242[this.anInt1029] = 630;
															}
															if (local709 == 3) {
																this.anIntArray242[this.anInt1029] = 708;
															}
															if (local709 == 4) {
																this.anIntArray242[this.anInt1029] = 903;
															}
															this.anIntArray243[this.anInt1029] = local572.anInt19;
															this.anIntArray240[this.anInt1029] = local493;
															this.anIntArray241[this.anInt1029] = local71.anInt684;
															this.anInt1029++;
														}
													}
												}
												this.aStringArray13[this.anInt1029] = "Examine @lre@" + local572.aString1;
												this.anIntArray242[this.anInt1029] = 1463;
												this.anIntArray243[this.anInt1029] = local572.anInt19;
												this.anIntArray240[this.anInt1029] = local493;
												this.anIntArray241[this.anInt1029] = local71.anInt684;
												this.anInt1029++;
											} else if ((this.anInt868 & 0x10) == 16) {
												this.aStringArray13[this.anInt1029] = this.aString19 + " @lre@" + local572.aString1;
												this.anIntArray242[this.anInt1029] = 294;
												this.anIntArray243[this.anInt1029] = local572.anInt19;
												this.anIntArray240[this.anInt1029] = local493;
												this.anIntArray241[this.anInt1029] = local71.anInt684;
												this.anInt1029++;
											}
										}
									}
									local493++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1139) RuntimeException local1139) {
			signlink.reporterror("48561, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method671(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method672() {
		try {
			this.aBoolean203 = false;
			while (this.aBoolean205) {
				this.aBoolean203 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass8_Sub1_Sub1_Sub4_19 = null;
			this.aClass8_Sub1_Sub1_Sub4_20 = null;
			this.aClass8_Sub1_Sub1_Sub4Array5 = null;
			this.anIntArray270 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.anIntArray219 = null;
			this.anIntArray220 = null;
			this.anIntArray216 = null;
			this.anIntArray217 = null;
			this.aClass8_Sub1_Sub1_Sub3_11 = null;
			this.aClass8_Sub1_Sub1_Sub3_12 = null;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("4401, " + 0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method673(@OriginalArg(0) byte arg0) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt961; local3++) {
				if (local3 == -1) {
					local11 = this.anInt960;
				} else {
					local11 = this.anIntArray232[local3];
				}
				@Pc(23) Class8_Sub1_Sub2_Sub4_Sub1 local23 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local11];
				if (local23 != null && local23.anInt545 > 0) {
					local23.anInt545--;
					if (local23.anInt545 == 0) {
						local23.aString9 = null;
					}
				}
			}
			anInt910++;
			@Pc(54) boolean local54 = false;
			if (anInt910 > 66) {
				anInt910 = 0;
				this.aClass8_Sub1_Sub3_6.method154(122);
			}
			for (local11 = 0; local11 < this.anInt983; local11++) {
				@Pc(76) int local76 = this.anIntArray238[local11];
				@Pc(81) Class8_Sub1_Sub2_Sub4_Sub2 local81 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local76];
				if (local81 != null && local81.anInt545 > 0) {
					local81.anInt545--;
					if (local81.anInt545 == 0) {
						local81.aString9 = null;
					}
				}
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("12239, " + arg0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method674() {
		try {
			if (this.anInt987 > 1) {
				this.anInt987--;
			}
			if (this.anInt958 > 0) {
				this.anInt958--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method650(); local22++) {
			}
			if (this.aBoolean219) {
				@Pc(41) Object local41 = this.aClass42_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass42_1.anObject1) {
					if (!aBoolean213) {
						this.aClass42_1.anInt769 = 0;
					} else if (super.anInt844 != 0 || this.aClass42_1.anInt769 >= 40) {
						this.aClass8_Sub1_Sub3_6.method154(125);
						this.aClass8_Sub1_Sub3_6.method155(0);
						local66 = this.aClass8_Sub1_Sub3_6.anInt253;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass42_1.anInt769 && local66 - this.aClass8_Sub1_Sub3_6.anInt253 < 240; local70++) {
							local68++;
							local86 = this.aClass42_1.anIntArray175[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass42_1.anIntArray174[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass42_1.anIntArray175[local70] == -1 && this.aClass42_1.anIntArray174[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt1015 || local86 != this.anInt1016) {
								@Pc(165) int local165 = local103 - this.anInt1015;
								this.anInt1015 = local103;
								@Pc(173) int local173 = local86 - this.anInt1016;
								this.anInt1016 = local86;
								if (this.anInt992 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass8_Sub1_Sub3_6.method156((this.anInt992 << 12) + (local165 << 6) + local173);
									this.anInt992 = 0;
								} else if (this.anInt992 < 8) {
									this.aClass8_Sub1_Sub3_6.method158((this.anInt992 << 19) + local120 + 8388608);
									this.anInt992 = 0;
								} else {
									this.aClass8_Sub1_Sub3_6.method159((this.anInt992 << 19) + local120 - 1073741824);
									this.anInt992 = 0;
								}
							} else if (this.anInt992 < 2047) {
								this.anInt992++;
							}
						}
						this.aClass8_Sub1_Sub3_6.method164(this.aClass8_Sub1_Sub3_6.anInt253 - local66);
						if (local68 >= this.aClass42_1.anInt769) {
							this.aClass42_1.anInt769 = 0;
						} else {
							this.aClass42_1.anInt769 -= local68;
							for (local86 = 0; local86 < this.aClass42_1.anInt769; local86++) {
								this.aClass42_1.anIntArray174[local86] = this.aClass42_1.anIntArray174[local86 + local68];
								this.aClass42_1.anIntArray175[local86] = this.aClass42_1.anIntArray175[local86 + local68];
							}
						}
					}
				}
				if (super.anInt844 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong29) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong29 = super.aLong28;
					local66 = super.anInt846;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt845;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt844 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass8_Sub1_Sub3_6.method154(91);
					this.aClass8_Sub1_Sub3_6.method198((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt882 > 0) {
					this.anInt882--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean198 = true;
				}
				if (this.aBoolean198 && this.anInt882 <= 0) {
					this.anInt882 = 20;
					this.aBoolean198 = false;
					this.aClass8_Sub1_Sub3_6.method154(215);
					this.aClass8_Sub1_Sub3_6.method192(this.anInt912);
					this.aClass8_Sub1_Sub3_6.method156(this.anInt911);
				}
				if (super.aBoolean191 && !this.aBoolean202) {
					this.aBoolean202 = true;
					this.aClass8_Sub1_Sub3_6.method154(201);
					this.aClass8_Sub1_Sub3_6.method155(1);
				}
				if (!super.aBoolean191 && this.aBoolean202) {
					this.aBoolean202 = false;
					this.aClass8_Sub1_Sub3_6.method154(201);
					this.aClass8_Sub1_Sub3_6.method155(0);
				}
				this.method609();
				this.method647();
				this.method622();
				anInt1060++;
				if (anInt1060 > 97) {
					anInt1060 = 0;
					this.aClass8_Sub1_Sub3_6.method154(161);
				}
				this.anInt956++;
				if (this.anInt956 > 750) {
					this.method600();
				}
				this.method660();
				this.method689();
				this.method673((byte) 7);
				this.anInt856++;
				if (this.anInt901 != 0) {
					this.anInt900 += 20;
					if (this.anInt900 >= 400) {
						this.anInt901 = 0;
					}
				}
				if (this.anInt925 != 0) {
					this.anInt922++;
					if (this.anInt922 >= 15) {
						if (this.anInt925 == 2) {
							this.aBoolean218 = true;
						}
						if (this.anInt925 == 3) {
							this.aBoolean230 = true;
						}
						this.anInt925 = 0;
					}
				}
				if (this.anInt1054 != 0) {
					this.anInt892++;
					if (super.anInt839 > this.anInt1055 + 5 || super.anInt839 < this.anInt1055 - 5 || super.anInt840 > this.anInt1056 + 5 || super.anInt840 < this.anInt1056 - 5) {
						this.aBoolean229 = true;
					}
					if (super.anInt838 == 0) {
						if (this.anInt1054 == 2) {
							this.aBoolean218 = true;
						}
						if (this.anInt1054 == 3) {
							this.aBoolean230 = true;
						}
						this.anInt1054 = 0;
						if (this.aBoolean229 && this.anInt892 >= 5) {
							this.anInt1050 = -1;
							this.method585();
							if (this.anInt1050 == this.anInt1052 && this.anInt1049 != this.anInt1053) {
								@Pc(698) Class36 local698 = Class36.aClass36Array1[this.anInt1052];
								@Pc(700) byte local700 = 0;
								if (this.anInt1063 == 1 && local698.anInt681 == 206) {
									local700 = 1;
								}
								if (local698.anIntArray110[this.anInt1049] <= 0) {
									local700 = 0;
								}
								if (local698.aBoolean149) {
									local66 = this.anInt1053;
									local68 = this.anInt1049;
									local698.anIntArray110[local68] = local698.anIntArray110[local66];
									local698.anIntArray115[local68] = local698.anIntArray115[local66];
									local698.anIntArray110[local66] = -1;
									local698.anIntArray115[local66] = 0;
								} else if (local700 == 1) {
									local66 = this.anInt1053;
									local68 = this.anInt1049;
									while (local66 != local68) {
										if (local66 > local68) {
											local698.method449(local66, this.anInt982, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local698.method449(local66, this.anInt982, local66 + 1);
											local66++;
										}
									}
								} else {
									local698.method449(this.anInt1053, this.anInt982, this.anInt1049);
								}
								this.aClass8_Sub1_Sub3_6.method154(21);
								this.aClass8_Sub1_Sub3_6.method181(local700);
								this.aClass8_Sub1_Sub3_6.method190(this.anInt1052);
								this.aClass8_Sub1_Sub3_6.method191(this.anInt1053, (byte) 3);
								this.aClass8_Sub1_Sub3_6.method156(this.anInt1049);
							}
						} else if ((this.anInt928 == 1 || this.method687(this.anInt1029 - 1)) && this.anInt1029 > 2) {
							this.method707();
						} else if (this.anInt1029 > 0) {
							this.method593(this.anInt1029 - 1);
						}
						this.anInt922 = 10;
						super.anInt844 = 0;
					}
				}
				@Pc(876) int local876;
				@Pc(878) int local878;
				if (Class32.anInt616 != -1) {
					local876 = Class32.anInt616;
					local878 = Class32.anInt617;
					@Pc(899) boolean local899 = this.method596(0, 0, 0, 0, true, 0, 0, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0], local876, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0], local878);
					Class32.anInt616 = -1;
					if (local899) {
						this.anInt898 = super.anInt845;
						this.anInt899 = super.anInt846;
						this.anInt901 = 1;
						this.anInt900 = 0;
					}
				}
				if (super.anInt844 == 1 && this.aString20 != null) {
					this.aString20 = null;
					this.aBoolean230 = true;
					super.anInt844 = 0;
				}
				this.method648();
				this.aBoolean219 &= true;
				this.method644();
				this.method704();
				this.method698();
				if (super.anInt838 == 1 || super.anInt844 == 1) {
					this.anInt950++;
				}
				if (this.anInt895 == 2) {
					this.method632();
				}
				if (this.anInt895 == 2 && this.aBoolean210) {
					this.method580();
				}
				for (local876 = 0; local876 < 5; local876++) {
					@Pc(991) int local991 = this.anIntArray212[local876]++;
				}
				this.method587();
				super.anInt837++;
				if (super.anInt837 > 4500) {
					this.anInt958 = 250;
					super.anInt837 -= 500;
					this.aClass8_Sub1_Sub3_6.method154(203);
				}
				this.anInt916++;
				if (this.anInt916 > 500) {
					this.anInt916 = 0;
					local878 = (int) (Math.random() * 8.0D);
					if ((local878 & 0x1) == 1) {
						this.anInt1032 += this.anInt1033;
					}
					if ((local878 & 0x2) == 2) {
						this.anInt862 += this.anInt863;
					}
					if ((local878 & 0x4) == 4) {
						this.anInt988 += this.anInt989;
					}
				}
				if (this.anInt1032 < -50) {
					this.anInt1033 = 2;
				}
				if (this.anInt1032 > 50) {
					this.anInt1033 = -2;
				}
				if (this.anInt862 < -55) {
					this.anInt863 = 2;
				}
				if (this.anInt862 > 55) {
					this.anInt863 = -2;
				}
				if (this.anInt988 < -40) {
					this.anInt989 = 1;
				}
				if (this.anInt988 > 40) {
					this.anInt989 = -1;
				}
				this.anInt887++;
				if (this.anInt887 > 500) {
					this.anInt887 = 0;
					local878 = (int) (Math.random() * 8.0D);
					if ((local878 & 0x1) == 1) {
						this.anInt1011 += this.anInt1012;
					}
					if ((local878 & 0x2) == 2) {
						this.anInt934 += this.anInt935;
					}
				}
				if (this.anInt1011 < -60) {
					this.anInt1012 = 2;
				}
				if (this.anInt1011 > 60) {
					this.anInt1012 = -2;
				}
				if (this.anInt934 < -20) {
					this.anInt935 = 1;
				}
				if (this.anInt934 > 10) {
					this.anInt935 = -1;
				}
				this.anInt957++;
				if (this.anInt957 > 50) {
					this.aClass8_Sub1_Sub3_6.method154(158);
				}
				try {
					if (this.aClass25_1 != null && this.aClass8_Sub1_Sub3_6.anInt253 > 0) {
						this.aClass25_1.method294(this.aClass8_Sub1_Sub3_6.aByteArray9, this.aClass8_Sub1_Sub3_6.anInt253);
						this.aClass8_Sub1_Sub3_6.anInt253 = 0;
						this.anInt957 = 0;
					}
				} catch (@Pc(1233) IOException local1233) {
					this.method600();
				} catch (@Pc(1238) Exception local1238) {
					this.method626();
				}
			}
		} catch (@Pc(1243) RuntimeException local1243) {
			signlink.reporterror("51348, " + true + ", " + local1243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method675() {
		try {
			for (@Pc(6) Class8_Sub2 local6 = (Class8_Sub2) this.aClass37_10.method491(); local6 != null; local6 = (Class8_Sub2) this.aClass37_10.method493()) {
				if (local6.anInt203 == -1) {
					local6.anInt214 = 0;
					this.method662(local6);
				} else {
					local6.method554();
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("51, " + false + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Ljava/net/Socket;")
	public Socket method676(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method677() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray216[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray216[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray217[local54] = (this.anIntArray216[local54 - 1] + this.anIntArray216[local54 + 1] + this.anIntArray216[local54 - 128] + this.anIntArray216[local54 + 128]) / 4;
				}
			}
			this.anInt869 += 128;
			if (this.anInt869 > this.anIntArray219.length) {
				this.anInt869 -= this.anIntArray219.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method663(this.aByte50, this.aClass8_Sub1_Sub1_Sub4Array5[local48]);
			}
			@Pc(172) int local172;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local172 = local54 + (local48 << 7);
					@Pc(195) int local195 = this.anIntArray217[local172 + 128] - this.anIntArray219[local172 + this.anInt869 & this.anIntArray219.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray216[local172] = local195;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray237[local54] = this.anIntArray237[local54 + 1];
			}
			this.anIntArray237[255] = (int) (Math.sin((double) anInt927 / 14.0D) * 16.0D + Math.sin((double) anInt927 / 15.0D) * 14.0D + Math.sin((double) anInt927 / 16.0D) * 12.0D);
			if (this.anInt993 > 0) {
				this.anInt993 -= 4;
			}
			if (this.anInt994 > 0) {
				this.anInt994 -= 4;
			}
			if (this.anInt993 == 0 && this.anInt994 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt993 = 1024;
				}
				if (local172 == 1) {
					this.anInt994 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("24854, " + true + ", " + local306.toString());
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
				return new URL("http://127.0.0.1:" + (anInt878 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class37 local9 = this.aClass37ArrayArrayArray1[this.anInt1042][arg0][arg1];
		if (local9 == null) {
			this.aClass32_1.method403(this.anInt1042, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class8_Sub1_Sub2_Sub3 local23 = null;
		@Pc(27) Class8_Sub1_Sub2_Sub3 local27;
		for (local27 = (Class8_Sub1_Sub2_Sub3) local9.method491(); local27 != null; local27 = (Class8_Sub1_Sub2_Sub3) local9.method493()) {
			@Pc(32) Class2 local32 = Class2.method4(local27.anInt402);
			@Pc(35) int local35 = local32.anInt35;
			if (local32.aBoolean3) {
				local35 *= local27.anInt401 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method489(local23);
		@Pc(65) Class8_Sub1_Sub2_Sub3 local65 = null;
		@Pc(67) Class8_Sub1_Sub2_Sub3 local67 = null;
		for (local27 = (Class8_Sub1_Sub2_Sub3) local9.method491(); local27 != null; local27 = (Class8_Sub1_Sub2_Sub3) local9.method493()) {
			if (local27.anInt402 != local23.anInt402 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt402 != local23.anInt402 && local27.anInt402 != local65.anInt402 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass32_1.method389(this.anInt1042, local67, local65, local23, local110, arg0, arg1, this.method667(arg1 * 128 + 64, this.anInt1042, arg0 * 128 + 64));
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method680() {
		try {
			if (this.anInt943 == 2) {
				this.method621((this.anInt937 - this.anInt944 << 7) + this.anInt940, (this.anInt938 - this.anInt945 << 7) + this.anInt941, 190, this.anInt939 * 2);
				if (this.anInt1008 > 5 || this.anInt1008 < 5) {
					this.method572();
				}
				if (this.anInt975 > -1 && anInt927 % 20 < 10) {
					this.aClass8_Sub1_Sub1_Sub3Array5[2].method267(this.anInt975 - 12, 272, this.anInt976 - 28);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("66296, " + 5 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method681() {
		try {
			Class33.aClass18_6.method209();
			Class33.aClass18_5.method209();
			Class26.aClass18_3.method209();
			Class2.aClass18_1.method209();
			Class2.aClass18_2.method209();
			Class8_Sub1_Sub2_Sub4_Sub1.aClass18_4.method209();
			Class44.aClass18_9.method209();
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("81940, " + 110 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method573() {
		try {
			if (!this.aBoolean222 && !this.aBoolean207 && !this.aBoolean223) {
				anInt927++;
				if (this.aBoolean219) {
					this.method674();
				} else {
					this.method633();
				}
				this.method598();
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("77117, " + 60 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method682() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1044);
			if (this.aClass21_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass21_Sub1_1.anInt359);
			}
			System.out.println("loop-cycle:" + anInt927);
			System.out.println("draw-cycle:" + anInt879);
			System.out.println("ptype:" + this.anInt955);
			System.out.println("psize:" + this.anInt954);
			if (this.aClass25_1 != null) {
				this.aClass25_1.method295();
			}
			super.aBoolean189 = true;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("33794, " + 40926 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method577() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("19731, " + -51 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!GLMIQHJI;)V")
	private void method683(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2) {
		try {
			this.anInt1014 = 0;
			this.anInt962 = 0;
			if (arg1) {
				this.aBoolean217 = !this.aBoolean217;
			}
			this.method651(arg2, arg0);
			this.method591(arg2, arg0);
			this.method602(arg0, arg2, (byte) 6);
			this.method608(arg0, arg2);
			@Pc(46) int local46;
			for (@Pc(39) int local39 = 0; local39 < this.anInt1014; local39++) {
				local46 = this.anIntArray248[local39];
				if (this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local46].anInt558 != anInt927) {
					this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local46] = null;
				}
			}
			if (arg2.anInt253 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.anInt253 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local46 = 0; local46 < this.anInt961; local46++) {
				if (this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray232[local46]] == null) {
					signlink.reporterror(this.aString17 + " null entry in pl list - pos:" + local46 + " size:" + this.anInt961);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("75033, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!GLMIQHJI;Z)V")
	private void method684(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt254 + 21 < arg0 * 8) {
					@Pc(15) int local15 = arg1.method176(14);
					if (local15 != 16383) {
						if (this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local15] == null) {
							this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local15] = new Class8_Sub1_Sub2_Sub4_Sub2();
						}
						@Pc(35) Class8_Sub1_Sub2_Sub4_Sub2 local35 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local15];
						this.anIntArray238[this.anInt983++] = local15;
						local35.anInt558 = anInt927;
						@Pc(54) int local54 = arg1.method176(5);
						if (local54 > 15) {
							local54 -= 32;
						}
						local35.aClass26_2 = Class26.method320(arg1.method176(12));
						@Pc(70) int local70 = arg1.method176(1);
						@Pc(75) int local75 = arg1.method176(1);
						if (local75 == 1) {
							this.anIntArray233[this.anInt962++] = local15;
						}
						@Pc(94) int local94 = arg1.method176(5);
						if (local94 > 15) {
							local94 -= 32;
						}
						local35.anInt586 = local35.aClass26_2.aByte19;
						local35.anInt557 = local35.aClass26_2.anInt372;
						local35.anInt572 = local35.aClass26_2.anInt364;
						local35.anInt573 = local35.aClass26_2.anInt378;
						local35.anInt574 = local35.aClass26_2.anInt380;
						local35.anInt575 = local35.aClass26_2.anInt369;
						local35.anInt546 = local35.aClass26_2.anInt376;
						local35.method377(aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray81[0] + local94, local70 == 1, aClass8_Sub1_Sub2_Sub4_Sub1_1.anIntArray80[0] + local54);
						continue;
					}
				}
				arg1.method177();
				return;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("33677, " + arg0 + ", " + arg1 + ", " + false + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!USEDZXXV;)Z")
	private boolean method685(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt681;
			if (this.anInt853 == 2) {
				if (local10 == 201) {
					this.aBoolean230 = true;
					this.anInt963 = 0;
					this.aBoolean214 = true;
					this.aString26 = "";
					this.anInt889 = 1;
					this.aString30 = "Enter name of friend to add to list";
				}
				if (local10 == 202) {
					this.aBoolean230 = true;
					this.anInt963 = 0;
					this.aBoolean214 = true;
					this.aString26 = "";
					this.anInt889 = 2;
					this.aString30 = "Enter name of friend to delete from list";
				}
			}
			if (local10 == 205) {
				this.anInt958 = 250;
				return true;
			}
			if (local10 == 501) {
				this.aBoolean230 = true;
				this.anInt963 = 0;
				this.aBoolean214 = true;
				this.aString26 = "";
				this.anInt889 = 4;
				this.aString30 = "Enter name of player to add to list";
			}
			if (local10 == 502) {
				this.aBoolean230 = true;
				this.anInt963 = 0;
				this.aBoolean214 = true;
				this.aString26 = "";
				this.anInt889 = 5;
				this.aString30 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local10 >= 300 && local10 <= 313) {
				local118 = (local10 - 300) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray269[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class14.anInt240 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class14.anInt240) {
								local127 = 0;
							}
						}
						if (!Class14.aClass14Array1[local127].aBoolean60 && Class14.aClass14Array1[local127].anInt241 == local118 + (this.aBoolean224 ? 0 : 7)) {
							this.anIntArray269[local118] = local127;
							this.aBoolean221 = true;
							break;
						}
					}
				}
			}
			if (local10 >= 314 && local10 <= 323) {
				local118 = (local10 - 314) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray254[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray25[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray25[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray254[local118] = local127;
				this.aBoolean221 = true;
			}
			if (local10 == 324 && !this.aBoolean224) {
				this.aBoolean224 = true;
				this.method628();
			}
			if (local10 == 325 && this.aBoolean224) {
				this.aBoolean224 = false;
				this.method628();
			}
			if (local10 == 326) {
				this.aClass8_Sub1_Sub3_6.method154(43);
				this.aClass8_Sub1_Sub3_6.method155(this.aBoolean224 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass8_Sub1_Sub3_6.method155(this.anIntArray269[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass8_Sub1_Sub3_6.method155(this.anIntArray254[local122]);
				}
				return true;
			}
			if (local10 == 613) {
				this.aBoolean225 = !this.aBoolean225;
			}
			if (local10 >= 601 && local10 <= 612) {
				this.method688();
				if (this.aString28.length() > 0) {
					this.aClass8_Sub1_Sub3_6.method154(23);
					this.aClass8_Sub1_Sub3_6.method161(Class48.method559(this.aString28));
					this.aClass8_Sub1_Sub3_6.method155(local10 - 601);
					this.aClass8_Sub1_Sub3_6.method155(this.aBoolean225 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("1001, " + true + ", " + arg0 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method686() {
		try {
			if (this.aClass29_19 == null) {
				super.aClass29_2 = null;
				this.aClass29_9 = null;
				this.aClass29_7 = null;
				this.aClass29_6 = null;
				this.aClass29_8 = null;
				this.aClass29_3 = null;
				this.aClass29_4 = null;
				this.aClass29_5 = null;
				this.aClass29_22 = new Class29(265, 128, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass29_23 = new Class29(265, 128, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass29_19 = new Class29(171, 509, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass29_20 = new Class29(132, 360, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass29_21 = new Class29(200, 360, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass29_24 = new Class29(238, 202, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass29_25 = new Class29(238, 203, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass29_26 = new Class29(94, 74, true, this.method577());
				Class8_Sub1_Sub1.method505();
				this.aClass29_27 = new Class29(94, 75, true, this.method577());
				Class8_Sub1_Sub1.method505();
				if (this.aClass45_1 != null) {
					this.method592();
					this.method615();
				}
				this.aBoolean200 = true;
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("23352, " + 0 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IB)Z")
	private boolean method687(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray242[arg0];
			if (this.aByte49 != 39) {
				throw new NullPointerException();
			}
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 730;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("84802, " + arg0 + ", " + 39 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;)V")
	@Override
	protected void method579(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt981 = arg0;
			this.aString25 = arg1;
			this.method686();
			if (this.aClass45_1 == null) {
				super.method579(arg0, arg1);
			} else {
				this.aClass29_21.method339();
				this.aClass8_Sub1_Sub1_Sub2_4.method101(54, 180, "RuneScape is loading - please wait...", 16777215);
				Class8_Sub1_Sub1.method508(9179409, 34, 304, 62, 28);
				Class8_Sub1_Sub1.method508(0, 32, 302, 63, 29);
				Class8_Sub1_Sub1.method507(arg0 * 3, 30, 9179409, 64, 30);
				Class8_Sub1_Sub1.method507(300 - arg0 * 3, arg0 * 3 + 30, 0, 64, 30);
				this.aClass8_Sub1_Sub1_Sub2_4.method101(85, 180, arg1, 16777215);
				this.aClass29_21.method340(super.aGraphics2, 202, 171);
				if (this.aBoolean200) {
					this.aBoolean200 = false;
					if (!this.aBoolean203) {
						this.aClass29_22.method340(super.aGraphics2, 0, 0);
						this.aClass29_23.method340(super.aGraphics2, 637, 0);
					}
					this.aClass29_19.method340(super.aGraphics2, 128, 0);
					this.aClass29_20.method340(super.aGraphics2, 202, 371);
					this.aClass29_24.method340(super.aGraphics2, 0, 265);
					this.aClass29_25.method340(super.aGraphics2, 562, 265);
					this.aClass29_26.method340(super.aGraphics2, 128, 171);
					this.aClass29_27.method340(super.aGraphics2, 562, 171);
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("39167, " + 62 + ", " + arg0 + ", " + arg1 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method688() {
		try {
			this.anInt954 += 0;
			this.aClass8_Sub1_Sub3_6.method154(223);
			if (this.anInt891 != -1) {
				this.anInt891 = -1;
				this.aBoolean218 = true;
				this.aBoolean233 = false;
				this.aBoolean211 = true;
			}
			if (this.anInt1043 != -1) {
				this.anInt1043 = -1;
				this.aBoolean230 = true;
				this.aBoolean233 = false;
			}
			this.anInt870 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("19521, " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method689() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt983; local1++) {
				@Pc(8) int local8 = this.anIntArray238[local1];
				@Pc(13) Class8_Sub1_Sub2_Sub4_Sub2 local13 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local8];
				if (local13 != null) {
					this.method690(local13, local13.aClass26_2.aByte19);
				}
			}
			if (this.anInt890 != -16642) {
				this.anInt951 = this.aClass5_2.method29();
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("21111, " + -16642 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WAJZGBEE;II)V")
	private void method690(@OriginalArg(0) Class8_Sub1_Sub2_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anInt562 < 128 || arg0.anInt563 < 128 || arg0.anInt562 >= 13184 || arg0.anInt563 >= 13184) {
				arg0.anInt578 = -1;
				arg0.anInt551 = -1;
				arg0.anInt569 = 0;
				arg0.anInt570 = 0;
				arg0.anInt562 = arg0.anIntArray80[0] * 128 + arg0.anInt586 * 64;
				arg0.anInt563 = arg0.anIntArray81[0] * 128 + arg0.anInt586 * 64;
				arg0.method376();
			}
			if (arg0 == aClass8_Sub1_Sub2_Sub4_Sub1_1 && (arg0.anInt562 < 1536 || arg0.anInt563 < 1536 || arg0.anInt562 >= 11776 || arg0.anInt563 >= 11776)) {
				arg0.anInt578 = -1;
				arg0.anInt551 = -1;
				arg0.anInt569 = 0;
				arg0.anInt570 = 0;
				arg0.anInt562 = arg0.anIntArray80[0] * 128 + arg0.anInt586 * 64;
				arg0.anInt563 = arg0.anIntArray81[0] * 128 + arg0.anInt586 * 64;
				arg0.method376();
			}
			if (arg0.anInt569 > anInt927) {
				this.method691(arg0);
			} else if (arg0.anInt570 >= anInt927) {
				this.method692(arg0, 669);
			} else {
				this.method693(arg0);
			}
			this.method694(arg0);
			this.method695(arg0);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("85298, " + arg0 + ", " + arg1 + ", " + -390 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!WAJZGBEE;)V")
	private void method691(@OriginalArg(1) Class8_Sub1_Sub2_Sub4 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt569 - anInt927;
			@Pc(21) int local21 = arg0.anInt565 * 128 + arg0.anInt586 * 64;
			@Pc(31) int local31 = arg0.anInt567 * 128 + arg0.anInt586 * 64;
			arg0.anInt562 += (local21 - arg0.anInt562) / local11;
			arg0.anInt563 += (local31 - arg0.anInt563) / local11;
			arg0.anInt577 = 0;
			if (arg0.anInt571 == 0) {
				arg0.anInt559 = 1024;
			}
			if (arg0.anInt571 == 1) {
				arg0.anInt559 = 1536;
			}
			if (arg0.anInt571 == 2) {
				arg0.anInt559 = 0;
			}
			if (arg0.anInt571 == 3) {
				arg0.anInt559 = 512;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("99710, " + 20 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WAJZGBEE;I)V")
	private void method692(@OriginalArg(0) Class8_Sub1_Sub2_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anInt570 == anInt927 || arg0.anInt578 == -1 || arg0.anInt581 != 0 || arg0.anInt580 + 1 > Class40.aClass40Array1[arg0.anInt578].method522(arg0.anInt579)) {
				@Pc(29) int local29 = arg0.anInt570 - arg0.anInt569;
				@Pc(34) int local34 = anInt927 - arg0.anInt569;
				@Pc(44) int local44 = arg0.anInt565 * 128 + arg0.anInt586 * 64;
				@Pc(54) int local54 = arg0.anInt567 * 128 + arg0.anInt586 * 64;
				@Pc(64) int local64 = arg0.anInt566 * 128 + arg0.anInt586 * 64;
				@Pc(74) int local74 = arg0.anInt568 * 128 + arg0.anInt586 * 64;
				arg0.anInt562 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt563 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt577 = 0;
			if (arg0.anInt571 == 0) {
				arg0.anInt559 = 1024;
			}
			if (arg0.anInt571 == 1) {
				arg0.anInt559 = 1536;
			}
			if (arg0.anInt571 == 2) {
				arg0.anInt559 = 0;
			}
			if (arg0.anInt571 == 3) {
				arg0.anInt559 = 512;
			}
			arg0.anInt564 = arg0.anInt559;
			@Pc(138) boolean local138 = false;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("79573, " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!WAJZGBEE;I)V")
	private void method693(@OriginalArg(0) Class8_Sub1_Sub2_Sub4 arg0) {
		try {
			arg0.anInt587 = arg0.anInt546;
			if (arg0.anInt550 == 0) {
				arg0.anInt577 = 0;
			} else {
				if (arg0.anInt578 != -1 && arg0.anInt581 == 0) {
					@Pc(31) Class40 local31 = Class40.aClass40Array1[arg0.anInt578];
					if (arg0.anInt561 > 0 && local31.anInt759 == 0) {
						arg0.anInt577++;
						return;
					}
					if (arg0.anInt561 <= 0 && local31.anInt760 == 0) {
						arg0.anInt577++;
						return;
					}
				}
				@Pc(60) int local60 = arg0.anInt562;
				@Pc(63) int local63 = arg0.anInt563;
				@Pc(78) int local78 = arg0.anIntArray80[arg0.anInt550 - 1] * 128 + arg0.anInt586 * 64;
				@Pc(93) int local93 = arg0.anIntArray81[arg0.anInt550 - 1] * 128 + arg0.anInt586 * 64;
				if (local78 - local60 <= 256 && local78 - local60 >= -256 && local93 - local63 <= 256 && local93 - local63 >= -256) {
					if (local60 < local78) {
						if (local63 < local93) {
							arg0.anInt559 = 1280;
						} else if (local63 > local93) {
							arg0.anInt559 = 1792;
						} else {
							arg0.anInt559 = 1536;
						}
					} else if (local60 > local78) {
						if (local63 < local93) {
							arg0.anInt559 = 768;
						} else if (local63 > local93) {
							arg0.anInt559 = 256;
						} else {
							arg0.anInt559 = 512;
						}
					} else if (local63 < local93) {
						arg0.anInt559 = 1024;
					} else {
						arg0.anInt559 = 0;
					}
					@Pc(187) int local187 = arg0.anInt559 - arg0.anInt564 & 0x7FF;
					if (local187 > 1024) {
						local187 -= 2048;
					}
					@Pc(194) int local194 = arg0.anInt573;
					if (local187 >= -256 && local187 <= 256) {
						local194 = arg0.anInt572;
					} else if (local187 >= 256 && local187 < 768) {
						local194 = arg0.anInt575;
					} else if (local187 >= -768 && local187 <= -256) {
						local194 = arg0.anInt574;
					}
					if (local194 == -1) {
						local194 = arg0.anInt572;
					}
					arg0.anInt587 = local194;
					@Pc(236) int local236 = 4;
					if (arg0.anInt564 != arg0.anInt559 && arg0.anInt548 == -1 && arg0.anInt557 != 0) {
						local236 = 2;
					}
					if (arg0.anInt550 > 2) {
						local236 = 6;
					}
					if (arg0.anInt550 > 3) {
						local236 = 8;
					}
					if (arg0.anInt577 > 0 && arg0.anInt550 > 1) {
						local236 = 8;
						arg0.anInt577--;
					}
					if (arg0.aBooleanArray6[arg0.anInt550 - 1]) {
						local236 <<= 0x1;
					}
					if (local236 >= 8 && arg0.anInt587 == arg0.anInt572 && arg0.anInt576 != -1) {
						arg0.anInt587 = arg0.anInt576;
					}
					if (local60 < local78) {
						arg0.anInt562 += local236;
						if (arg0.anInt562 > local78) {
							arg0.anInt562 = local78;
						}
					} else if (local60 > local78) {
						arg0.anInt562 -= local236;
						if (arg0.anInt562 < local78) {
							arg0.anInt562 = local78;
						}
					}
					if (local63 < local93) {
						arg0.anInt563 += local236;
						if (arg0.anInt563 > local93) {
							arg0.anInt563 = local93;
						}
					} else if (local63 > local93) {
						arg0.anInt563 -= local236;
						if (arg0.anInt563 < local93) {
							arg0.anInt563 = local93;
						}
					}
					if (arg0.anInt562 == local78 && arg0.anInt563 == local93) {
						arg0.anInt550--;
						if (arg0.anInt561 > 0) {
							arg0.anInt561--;
							return;
						}
					}
				} else {
					arg0.anInt562 = local78;
					arg0.anInt563 = local93;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("28346, " + arg0 + ", " + -272 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!WAJZGBEE;I)V")
	private void method694(@OriginalArg(0) Class8_Sub1_Sub2_Sub4 arg0) {
		try {
			if (arg0.anInt557 != 0) {
				@Pc(40) int local40;
				@Pc(46) int local46;
				if (arg0.anInt548 != -1 && arg0.anInt548 < 32768) {
					@Pc(32) Class8_Sub1_Sub2_Sub4_Sub2 local32 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[arg0.anInt548];
					if (local32 != null) {
						local40 = arg0.anInt562 - local32.anInt562;
						local46 = arg0.anInt563 - local32.anInt563;
						if (local40 != 0 || local46 != 0) {
							arg0.anInt559 = (int) (Math.atan2((double) local40, (double) local46) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(71) int local71;
				if (arg0.anInt548 >= 32768) {
					local71 = arg0.anInt548 - 32768;
					if (local71 == this.anInt977) {
						local71 = this.anInt960;
					}
					@Pc(83) Class8_Sub1_Sub2_Sub4_Sub1 local83 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local71];
					if (local83 != null) {
						local46 = arg0.anInt562 - local83.anInt562;
						@Pc(97) int local97 = arg0.anInt563 - local83.anInt563;
						if (local46 != 0 || local97 != 0) {
							arg0.anInt559 = (int) (Math.atan2((double) local46, (double) local97) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt542 != 0 || arg0.anInt543 != 0) && (arg0.anInt550 == 0 || arg0.anInt577 > 0)) {
					local71 = arg0.anInt562 - (arg0.anInt542 - this.anInt944 - this.anInt944) * 64;
					local40 = arg0.anInt563 - (arg0.anInt543 - this.anInt945 - this.anInt945) * 64;
					if (local71 != 0 || local40 != 0) {
						arg0.anInt559 = (int) (Math.atan2((double) local71, (double) local40) * 325.949D) & 0x7FF;
					}
					arg0.anInt542 = 0;
					arg0.anInt543 = 0;
				}
				local71 = arg0.anInt559 - arg0.anInt564 & 0x7FF;
				if (local71 != 0) {
					if (local71 < arg0.anInt557 || local71 > 2048 - arg0.anInt557) {
						arg0.anInt564 = arg0.anInt559;
					} else if (local71 > 1024) {
						arg0.anInt564 -= arg0.anInt557;
					} else {
						arg0.anInt564 += arg0.anInt557;
					}
					arg0.anInt564 &= 0x7FF;
					if (arg0.anInt587 == arg0.anInt546 && arg0.anInt564 != arg0.anInt559) {
						if (arg0.anInt547 != -1) {
							arg0.anInt587 = arg0.anInt547;
							return;
						}
						arg0.anInt587 = arg0.anInt572;
						return;
					}
				}
			}
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("24280, " + arg0 + ", " + 8 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!WAJZGBEE;)V")
	private void method695(@OriginalArg(1) Class8_Sub1_Sub2_Sub4 arg0) {
		try {
			if (this.aByte42 != 6) {
				this.anInt955 = -1;
			}
			arg0.aBoolean123 = false;
			@Pc(20) Class40 local20;
			if (arg0.anInt587 != -1) {
				local20 = Class40.aClass40Array1[arg0.anInt587];
				arg0.anInt589++;
				if (arg0.anInt588 < local20.anInt753 && arg0.anInt589 > local20.method522(arg0.anInt588)) {
					arg0.anInt589 = 0;
					arg0.anInt588++;
				}
				if (arg0.anInt588 >= local20.anInt753) {
					arg0.anInt589 = 0;
					arg0.anInt588 = 0;
				}
			}
			if (arg0.anInt551 != -1 && anInt927 >= arg0.anInt554) {
				if (arg0.anInt552 < 0) {
					arg0.anInt552 = 0;
				}
				local20 = Class44.aClass44Array1[arg0.anInt551].aClass40_1;
				arg0.anInt553++;
				while (arg0.anInt552 < local20.anInt753 && arg0.anInt553 > local20.method522(arg0.anInt552)) {
					arg0.anInt553 -= local20.method522(arg0.anInt552);
					arg0.anInt552++;
				}
				if (arg0.anInt552 >= local20.anInt753 && (arg0.anInt552 < 0 || arg0.anInt552 >= local20.anInt753)) {
					arg0.anInt551 = -1;
				}
			}
			if (arg0.anInt578 != -1 && arg0.anInt581 <= 1) {
				local20 = Class40.aClass40Array1[arg0.anInt578];
				if (local20.anInt759 == 1 && arg0.anInt561 > 0 && arg0.anInt569 <= anInt927 && arg0.anInt570 < anInt927) {
					arg0.anInt581 = 1;
					return;
				}
			}
			if (arg0.anInt578 != -1 && arg0.anInt581 == 0) {
				local20 = Class40.aClass40Array1[arg0.anInt578];
				arg0.anInt580++;
				while (arg0.anInt579 < local20.anInt753 && arg0.anInt580 > local20.method522(arg0.anInt579)) {
					arg0.anInt580 -= local20.method522(arg0.anInt579);
					arg0.anInt579++;
				}
				if (arg0.anInt579 >= local20.anInt753) {
					arg0.anInt579 -= local20.anInt754;
					arg0.anInt582++;
					if (arg0.anInt582 >= local20.anInt758) {
						arg0.anInt578 = -1;
					}
					if (arg0.anInt579 < 0 || arg0.anInt579 >= local20.anInt753) {
						arg0.anInt578 = -1;
					}
				}
				arg0.aBoolean123 = local20.aBoolean173;
			}
			if (arg0.anInt581 > 0) {
				arg0.anInt581--;
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("22549, " + 6 + ", " + arg0 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method696() {
		try {
			if (this.aBoolean200) {
				this.aBoolean200 = false;
				this.aClass29_10.method340(super.aGraphics2, 0, 4);
				this.aClass29_11.method340(super.aGraphics2, 0, 357);
				this.aClass29_12.method340(super.aGraphics2, 722, 4);
				this.aClass29_13.method340(super.aGraphics2, 743, 205);
				this.aClass29_14.method340(super.aGraphics2, 0, 0);
				this.aClass29_15.method340(super.aGraphics2, 516, 4);
				this.aClass29_16.method340(super.aGraphics2, 516, 205);
				this.aClass29_17.method340(super.aGraphics2, 496, 357);
				this.aClass29_18.method340(super.aGraphics2, 0, 338);
				this.aBoolean218 = true;
				this.aBoolean230 = true;
				this.aBoolean211 = true;
				this.aBoolean199 = true;
				if (this.anInt895 != 2) {
					this.aClass29_8.method340(super.aGraphics2, 4, 4);
					this.aClass29_7.method340(super.aGraphics2, 550, 4);
				}
				anInt1048++;
				if (anInt1048 > 96) {
					anInt1048 = 0;
					this.aClass8_Sub1_Sub3_6.method154(137);
				}
			}
			if (this.anInt895 == 2) {
				this.method658((byte) 6);
			}
			if (this.aBoolean216 && this.anInt1001 == 1) {
				this.aBoolean218 = true;
			}
			@Pc(152) boolean local152;
			if (this.anInt891 != -1) {
				local152 = this.method640(this.anInt891, this.anInt856);
				if (local152) {
					this.aBoolean218 = true;
				}
			}
			if (this.anInt925 == 2) {
				this.aBoolean218 = true;
			}
			if (this.anInt1054 == 2) {
				this.aBoolean218 = true;
			}
			if (this.aBoolean218) {
				this.method641();
				this.aBoolean218 = false;
			}
			anInt894++;
			if (anInt894 > 102) {
				anInt894 = 0;
				this.aClass8_Sub1_Sub3_6.method154(154);
				this.aClass8_Sub1_Sub3_6.method158(4326152);
			}
			if (this.anInt1043 == -1) {
				this.aClass36_1.anInt683 = this.anInt964 - this.anInt854 - 77;
				if (super.anInt839 > 448 && super.anInt839 < 560 && super.anInt840 > 332) {
					this.method597(463, this.aBoolean217, 0, super.anInt839 - 17, this.aClass36_1, this.anInt964, 77, false, super.anInt840 - 357);
				}
				@Pc(257) int local257 = this.anInt964 - this.aClass36_1.anInt683 - 77;
				if (local257 < 0) {
					local257 = 0;
				}
				if (local257 > this.anInt964 - 77) {
					local257 = this.anInt964 - 77;
				}
				if (this.anInt854 != local257) {
					this.anInt854 = local257;
					this.aBoolean230 = true;
				}
				anInt850++;
				if (anInt850 > 1675) {
					anInt850 = 0;
					this.aClass8_Sub1_Sub3_6.method154(197);
					this.aClass8_Sub1_Sub3_6.method155(0);
					@Pc(304) int local304 = this.aClass8_Sub1_Sub3_6.anInt253;
					this.aClass8_Sub1_Sub3_6.method155((int) (Math.random() * 256.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method155(161);
					}
					this.aClass8_Sub1_Sub3_6.method155((int) (Math.random() * 256.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method156(44879);
					}
					this.aClass8_Sub1_Sub3_6.method156((int) (Math.random() * 65536.0D));
					this.aClass8_Sub1_Sub3_6.method156(9511);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method155(179);
					}
					this.aClass8_Sub1_Sub3_6.method155(141);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method155(181);
					}
					this.aClass8_Sub1_Sub3_6.method156(43761);
					this.aClass8_Sub1_Sub3_6.method164(this.aClass8_Sub1_Sub3_6.anInt253 - local304);
				}
			}
			if (this.anInt1043 != -1) {
				local152 = this.method640(this.anInt1043, this.anInt856);
				if (local152) {
					this.aBoolean230 = true;
				}
			}
			if (this.anInt925 == 3) {
				this.aBoolean230 = true;
			}
			if (this.anInt1054 == 3) {
				this.aBoolean230 = true;
			}
			if (this.aString20 != null) {
				this.aBoolean230 = true;
			}
			if (this.aBoolean216 && this.anInt1001 == 2) {
				this.aBoolean230 = true;
			}
			if (this.aBoolean230) {
				this.method634();
				this.aBoolean230 = false;
			}
			if (this.anInt895 == 2) {
				this.method629();
				this.aClass29_7.method340(super.aGraphics2, 550, 4);
			}
			if (this.anInt907 != -1) {
				this.aBoolean211 = true;
			}
			if (this.aBoolean211) {
				if (this.anInt907 != -1 && this.anInt907 == this.anInt884) {
					this.anInt907 = -1;
					this.aClass8_Sub1_Sub3_6.method154(189);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt884);
				}
				this.aBoolean211 = false;
				this.aClass29_5.method339();
				this.aClass8_Sub1_Sub1_Sub4_8.method519(0, 272, 0);
				if (this.anInt891 == -1) {
					if (this.anIntArray229[this.anInt884] != -1) {
						if (this.anInt884 == 0) {
							this.aClass8_Sub1_Sub1_Sub4_14.method519(22, 272, 10);
						}
						if (this.anInt884 == 1) {
							this.aClass8_Sub1_Sub1_Sub4_15.method519(54, 272, 8);
						}
						if (this.anInt884 == 2) {
							this.aClass8_Sub1_Sub1_Sub4_15.method519(82, 272, 8);
						}
						if (this.anInt884 == 3) {
							this.aClass8_Sub1_Sub1_Sub4_16.method519(110, 272, 8);
						}
						if (this.anInt884 == 4) {
							this.aClass8_Sub1_Sub1_Sub4_18.method519(153, 272, 8);
						}
						if (this.anInt884 == 5) {
							this.aClass8_Sub1_Sub1_Sub4_18.method519(181, 272, 8);
						}
						if (this.anInt884 == 6) {
							this.aClass8_Sub1_Sub1_Sub4_17.method519(209, 272, 9);
						}
					}
					if (this.anIntArray229[0] != -1 && (this.anInt907 != 0 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[0].method519(29, 272, 13);
					}
					if (this.anIntArray229[1] != -1 && (this.anInt907 != 1 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[1].method519(53, 272, 11);
					}
					if (this.anIntArray229[2] != -1 && (this.anInt907 != 2 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[2].method519(82, 272, 11);
					}
					if (this.anIntArray229[3] != -1 && (this.anInt907 != 3 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[3].method519(115, 272, 12);
					}
					if (this.anIntArray229[4] != -1 && (this.anInt907 != 4 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[4].method519(153, 272, 13);
					}
					if (this.anIntArray229[5] != -1 && (this.anInt907 != 5 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[5].method519(180, 272, 11);
					}
					if (this.anIntArray229[6] != -1 && (this.anInt907 != 6 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[6].method519(208, 272, 13);
					}
				}
				this.aClass29_5.method340(super.aGraphics2, 516, 160);
				this.aClass29_4.method339();
				this.aClass8_Sub1_Sub1_Sub4_7.method519(0, 272, 0);
				if (this.anInt891 == -1) {
					if (this.anIntArray229[this.anInt884] != -1) {
						if (this.anInt884 == 7) {
							this.aClass8_Sub1_Sub1_Sub4_9.method519(42, 272, 0);
						}
						if (this.anInt884 == 8) {
							this.aClass8_Sub1_Sub1_Sub4_10.method519(74, 272, 0);
						}
						if (this.anInt884 == 9) {
							this.aClass8_Sub1_Sub1_Sub4_10.method519(102, 272, 0);
						}
						if (this.anInt884 == 10) {
							this.aClass8_Sub1_Sub1_Sub4_11.method519(130, 272, 1);
						}
						if (this.anInt884 == 11) {
							this.aClass8_Sub1_Sub1_Sub4_13.method519(173, 272, 0);
						}
						if (this.anInt884 == 12) {
							this.aClass8_Sub1_Sub1_Sub4_13.method519(201, 272, 0);
						}
						if (this.anInt884 == 13) {
							this.aClass8_Sub1_Sub1_Sub4_12.method519(229, 272, 0);
						}
					}
					if (this.anIntArray229[8] != -1 && (this.anInt907 != 8 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[7].method519(74, 272, 2);
					}
					if (this.anIntArray229[9] != -1 && (this.anInt907 != 9 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[8].method519(102, 272, 3);
					}
					if (this.anIntArray229[10] != -1 && (this.anInt907 != 10 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[9].method519(137, 272, 4);
					}
					if (this.anIntArray229[11] != -1 && (this.anInt907 != 11 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[10].method519(174, 272, 2);
					}
					if (this.anIntArray229[12] != -1 && (this.anInt907 != 12 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[11].method519(201, 272, 2);
					}
					if (this.anIntArray229[13] != -1 && (this.anInt907 != 13 || anInt927 % 20 < 10)) {
						this.aClass8_Sub1_Sub1_Sub4Array2[12].method519(226, 272, 2);
					}
				}
				this.aClass29_4.method340(super.aGraphics2, 496, 466);
				this.aClass29_8.method339();
			}
			if (this.aBoolean199) {
				this.aBoolean199 = false;
				this.aClass29_3.method339();
				this.aClass8_Sub1_Sub1_Sub4_6.method519(0, 272, 0);
				this.aClass8_Sub1_Sub1_Sub2_3.method102(55, 28, 16777215, "Public chat", true);
				if (this.anInt1030 == 0) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(55, 41, 65280, "On", true);
				}
				if (this.anInt1030 == 1) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(55, 41, 16776960, "Friends", true);
				}
				if (this.anInt1030 == 2) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(55, 41, 16711680, "Off", true);
				}
				if (this.anInt1030 == 3) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(55, 41, 65535, "Hide", true);
				}
				this.aClass8_Sub1_Sub1_Sub2_3.method102(184, 28, 16777215, "Private chat", true);
				if (this.anInt953 == 0) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(184, 41, 65280, "On", true);
				}
				if (this.anInt953 == 1) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(184, 41, 16776960, "Friends", true);
				}
				if (this.anInt953 == 2) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(184, 41, 16711680, "Off", true);
				}
				this.aClass8_Sub1_Sub1_Sub2_3.method102(324, 28, 16777215, "Trade/compete", true);
				if (this.anInt897 == 0) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(324, 41, 65280, "On", true);
				}
				if (this.anInt897 == 1) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(324, 41, 16776960, "Friends", true);
				}
				if (this.anInt897 == 2) {
					this.aClass8_Sub1_Sub1_Sub2_3.method102(324, 41, 16711680, "Off", true);
				}
				this.aClass8_Sub1_Sub1_Sub2_3.method102(458, 33, 16777215, "Report abuse", true);
				this.aClass29_3.method340(super.aGraphics2, 0, 453);
				this.aClass29_8.method339();
			}
			this.anInt856 = 0;
		} catch (@Pc(1183) RuntimeException local1183) {
			signlink.reporterror("62857, " + -113 + ", " + local1183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method697() {
		try {
			this.anInt1065 = 0;
			@Pc(94) int local94;
			@Pc(74) int local74;
			for (@Pc(10) int local10 = -1; local10 < this.anInt961 + this.anInt983; local10++) {
				@Pc(17) Class8_Sub1_Sub2_Sub4 local17;
				if (local10 == -1) {
					local17 = aClass8_Sub1_Sub2_Sub4_Sub1_1;
				} else if (local10 < this.anInt961) {
					local17 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray232[local10]];
				} else {
					local17 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray238[local10 - this.anInt961]];
				}
				if (local17 != null && local17.method378((byte) 4)) {
					@Pc(58) Class26 local58;
					if (local17 instanceof Class8_Sub1_Sub2_Sub4_Sub2) {
						local58 = ((Class8_Sub1_Sub2_Sub4_Sub2) local17).aClass26_2;
						if (local58.anIntArray61 != null) {
							local58 = local58.method323();
						}
						if (local58 == null) {
							continue;
						}
					}
					if (local10 >= this.anInt961) {
						local58 = ((Class8_Sub1_Sub2_Sub4_Sub2) local17).aClass26_2;
						if (local58.anInt368 >= 0 && local58.anInt368 < this.aClass8_Sub1_Sub1_Sub3Array5.length) {
							this.method620(local17.anInt544 + 15, local17);
							if (this.anInt975 > -1) {
								this.aClass8_Sub1_Sub1_Sub3Array5[local58.anInt368].method267(this.anInt975 - 12, 272, this.anInt976 - 30);
							}
						}
						if (this.anInt943 == 1 && this.anInt888 == this.anIntArray238[local10 - this.anInt961] && anInt927 % 20 < 10) {
							this.method620(local17.anInt544 + 15, local17);
							if (this.anInt975 > -1) {
								this.aClass8_Sub1_Sub1_Sub3Array5[2].method267(this.anInt975 - 12, 272, this.anInt976 - 28);
							}
						}
					} else {
						local74 = 30;
						@Pc(77) Class8_Sub1_Sub2_Sub4_Sub1 local77 = (Class8_Sub1_Sub2_Sub4_Sub1) local17;
						if (local77.anInt524 != 0) {
							this.method620(local17.anInt544 + 15, local17);
							if (this.anInt975 > -1) {
								for (local94 = 0; local94 < 8; local94++) {
									if ((local77.anInt524 & 0x1 << local94) != 0) {
										this.aClass8_Sub1_Sub1_Sub3Array5[local94].method267(this.anInt975 - 12, 272, this.anInt976 - local74);
										local74 -= 25;
									}
								}
							}
						}
						if (local10 >= 0 && this.anInt943 == 10 && this.anInt1010 == this.anIntArray232[local10]) {
							this.method620(local17.anInt544 + 15, local17);
							if (this.anInt975 > -1) {
								this.aClass8_Sub1_Sub1_Sub3Array5[7].method267(this.anInt975 - 12, 272, this.anInt976 - local74);
							}
						}
					}
					if (local17.aString9 != null && (local10 >= this.anInt961 || this.anInt1030 == 0 || this.anInt1030 == 3 || this.anInt1030 == 1 && this.method604(((Class8_Sub1_Sub2_Sub4_Sub1) local17).aString8))) {
						this.method620(local17.anInt544, local17);
						if (this.anInt975 > -1 && this.anInt1065 < this.anInt1066) {
							this.anIntArray265[this.anInt1065] = this.aClass8_Sub1_Sub1_Sub2_4.method104(local17.aString9, this.anInt1061) / 2;
							this.anIntArray264[this.anInt1065] = this.aClass8_Sub1_Sub1_Sub2_4.anInt198;
							this.anIntArray262[this.anInt1065] = this.anInt975;
							this.anIntArray263[this.anInt1065] = this.anInt976;
							this.anIntArray266[this.anInt1065] = local17.anInt549;
							this.anIntArray267[this.anInt1065] = local17.anInt560;
							this.anIntArray268[this.anInt1065] = local17.anInt545;
							this.aStringArray12[this.anInt1065++] = local17.aString9;
							if (this.anInt926 == 0 && local17.anInt560 >= 1 && local17.anInt560 <= 3) {
								this.anIntArray264[this.anInt1065] += 10;
								this.anIntArray263[this.anInt1065] += 5;
							}
							if (this.anInt926 == 0 && local17.anInt560 == 4) {
								this.anIntArray265[this.anInt1065] = 60;
							}
							if (this.anInt926 == 0 && local17.anInt560 == 5) {
								this.anIntArray264[this.anInt1065] += 5;
							}
						}
					}
					if (local17.anInt583 > anInt927) {
						this.method620(local17.anInt544 + 15, local17);
						if (this.anInt975 > -1) {
							local74 = local17.anInt584 * 30 / local17.anInt585;
							if (local74 > 30) {
								local74 = 30;
							}
							Class8_Sub1_Sub1.method507(local74, this.anInt975 - 15, 65280, this.anInt976 - 3, 5);
							Class8_Sub1_Sub1.method507(30 - local74, this.anInt975 - 15 + local74, 16711680, this.anInt976 - 3, 5);
						}
					}
					for (local74 = 0; local74 < 4; local74++) {
						if (local17.anIntArray79[local74] > anInt927) {
							this.method620(local17.anInt544 / 2, local17);
							if (this.anInt975 > -1) {
								if (local74 == 1) {
									this.anInt976 -= 20;
								}
								if (local74 == 2) {
									this.anInt975 -= 15;
									this.anInt976 -= 10;
								}
								if (local74 == 3) {
									this.anInt975 += 15;
									this.anInt976 -= 10;
								}
								this.aClass8_Sub1_Sub1_Sub3Array6[local17.anIntArray78[local74]].method267(this.anInt975 - 12, 272, this.anInt976 - 12);
								this.aClass8_Sub1_Sub1_Sub2_2.method101(this.anInt976 + 4, this.anInt975, String.valueOf(local17.anIntArray77[local74]), 0);
								this.aClass8_Sub1_Sub1_Sub2_2.method101(this.anInt976 + 3, this.anInt975 - 1, String.valueOf(local17.anIntArray77[local74]), 16777215);
							}
						}
					}
				}
			}
			for (@Pc(600) int local600 = 0; local600 < this.anInt1065; local600++) {
				local74 = this.anIntArray262[local600];
				@Pc(612) int local612 = this.anIntArray263[local600];
				local94 = this.anIntArray265[local600];
				@Pc(622) int local622 = this.anIntArray264[local600];
				@Pc(624) boolean local624 = true;
				while (local624) {
					local624 = false;
					for (@Pc(630) int local630 = 0; local630 < local600; local630++) {
						if (local612 + 2 > this.anIntArray263[local630] - this.anIntArray264[local630] && local612 - local622 < this.anIntArray263[local630] + 2 && local74 - local94 < this.anIntArray262[local630] + this.anIntArray265[local630] && local74 + local94 > this.anIntArray262[local630] - this.anIntArray265[local630] && this.anIntArray263[local630] - this.anIntArray264[local630] < local612) {
							local612 = this.anIntArray263[local630] - this.anIntArray264[local630];
							local624 = true;
						}
					}
				}
				this.anInt975 = this.anIntArray262[local600];
				this.anInt976 = this.anIntArray263[local600] = local612;
				@Pc(729) String local729 = this.aStringArray12[local600];
				if (this.anInt926 == 0) {
					@Pc(734) int local734 = 16776960;
					if (this.anIntArray266[local600] < 6) {
						local734 = this.anIntArray214[this.anIntArray266[local600]];
					}
					if (this.anIntArray266[local600] == 6) {
						local734 = this.anInt949 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray266[local600] == 7) {
						local734 = this.anInt949 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray266[local600] == 8) {
						local734 = this.anInt949 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(809) int local809;
					if (this.anIntArray266[local600] == 9) {
						local809 = 150 - this.anIntArray268[local600];
						if (local809 < 50) {
							local734 = local809 * 1280 + 16711680;
						} else if (local809 < 100) {
							local734 = 16776960 - (local809 - 50) * 327680;
						} else if (local809 < 150) {
							local734 = (local809 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray266[local600] == 10) {
						local809 = 150 - this.anIntArray268[local600];
						if (local809 < 50) {
							local734 = local809 * 5 + 16711680;
						} else if (local809 < 100) {
							local734 = 16711935 - (local809 - 50) * 327680;
						} else if (local809 < 150) {
							local734 = (local809 - 100) * 327680 + 255 - (local809 - 100) * 5;
						}
					}
					if (this.anIntArray266[local600] == 11) {
						local809 = 150 - this.anIntArray268[local600];
						if (local809 < 50) {
							local734 = 16777215 - local809 * 327685;
						} else if (local809 < 100) {
							local734 = (local809 - 50) * 327685 + 65280;
						} else if (local809 < 150) {
							local734 = 16777215 - (local809 - 100) * 327680;
						}
					}
					if (this.anIntArray267[local600] == 0) {
						this.aClass8_Sub1_Sub1_Sub2_4.method101(this.anInt976 + 1, this.anInt975, local729, 0);
						this.aClass8_Sub1_Sub1_Sub2_4.method101(this.anInt976, this.anInt975, local729, local734);
					}
					if (this.anIntArray267[local600] == 1) {
						this.aClass8_Sub1_Sub1_Sub2_4.method106(this.anInt975, local729, this.anInt976 + 1, 0, this.anInt949);
						this.aClass8_Sub1_Sub1_Sub2_4.method106(this.anInt975, local729, this.anInt976, local734, this.anInt949);
					}
					if (this.anIntArray267[local600] == 2) {
						this.aClass8_Sub1_Sub1_Sub2_4.method107(local729, 0, this.anInt949, this.anInt976 + 1, this.anInt975);
						this.aClass8_Sub1_Sub1_Sub2_4.method107(local729, local734, this.anInt949, this.anInt976, this.anInt975);
					}
					if (this.anIntArray267[local600] == 3) {
						this.aClass8_Sub1_Sub1_Sub2_4.method108(150 - this.anIntArray268[local600], 0, this.anInt949, local729, this.anInt976 + 1, this.anInt975);
						this.aClass8_Sub1_Sub1_Sub2_4.method108(150 - this.anIntArray268[local600], local734, this.anInt949, local729, this.anInt976, this.anInt975);
					}
					@Pc(1107) int local1107;
					if (this.anIntArray267[local600] == 4) {
						local809 = this.aClass8_Sub1_Sub1_Sub2_4.method104(local729, this.anInt1061);
						local1107 = (150 - this.anIntArray268[local600]) * (local809 + 100) / 150;
						Class8_Sub1_Sub1.method504(455, this.anInt975 - 50, this.anInt975 + 50, 334, 0);
						this.aClass8_Sub1_Sub1_Sub2_4.method105(local729, 0, this.anInt975 + 50 - local1107, this.anInt976 + 1);
						this.aClass8_Sub1_Sub1_Sub2_4.method105(local729, local734, this.anInt975 + 50 - local1107, this.anInt976);
						Class8_Sub1_Sub1.method503();
					}
					if (this.anIntArray267[local600] == 5) {
						local809 = 150 - this.anIntArray268[local600];
						local1107 = 0;
						if (local809 < 25) {
							local1107 = local809 - 25;
						} else if (local809 > 125) {
							local1107 = local809 - 125;
						}
						Class8_Sub1_Sub1.method504(455, 0, 512, this.anInt976 + 5, this.anInt976 - this.aClass8_Sub1_Sub1_Sub2_4.anInt198 - 1);
						this.aClass8_Sub1_Sub1_Sub2_4.method101(this.anInt976 + local1107 + 1, this.anInt975, local729, 0);
						this.aClass8_Sub1_Sub1_Sub2_4.method101(this.anInt976 + local1107, this.anInt975, local729, local734);
						Class8_Sub1_Sub1.method503();
					}
				} else {
					this.aClass8_Sub1_Sub1_Sub2_4.method101(this.anInt976 + 1, this.anInt975, local729, 0);
					this.aClass8_Sub1_Sub1_Sub2_4.method101(this.anInt976, this.anInt975, local729, 16776960);
				}
			}
		} catch (@Pc(1257) RuntimeException local1257) {
			signlink.reporterror("92771, " + -590 + ", " + local1257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method698() {
		try {
			if (super.anInt844 == 1) {
				if (super.anInt845 >= 6 && super.anInt845 <= 106 && super.anInt846 >= 467 && super.anInt846 <= 499) {
					this.anInt1030 = (this.anInt1030 + 1) % 4;
					this.aBoolean199 = true;
					this.aBoolean230 = true;
					this.aClass8_Sub1_Sub3_6.method154(52);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt1030);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt953);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt897);
				}
				if (super.anInt845 >= 135 && super.anInt845 <= 235 && super.anInt846 >= 467 && super.anInt846 <= 499) {
					this.anInt953 = (this.anInt953 + 1) % 3;
					this.aBoolean199 = true;
					this.aBoolean230 = true;
					this.aClass8_Sub1_Sub3_6.method154(52);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt1030);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt953);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt897);
				}
				if (super.anInt845 >= 273 && super.anInt845 <= 373 && super.anInt846 >= 467 && super.anInt846 <= 499) {
					this.anInt897 = (this.anInt897 + 1) % 3;
					this.aBoolean199 = true;
					this.aBoolean230 = true;
					this.aClass8_Sub1_Sub3_6.method154(52);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt1030);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt953);
					this.aClass8_Sub1_Sub3_6.method155(this.anInt897);
				}
				if (super.anInt845 >= 412 && super.anInt845 <= 512 && super.anInt846 >= 467 && super.anInt846 <= 499) {
					if (this.anInt870 == -1) {
						this.method688();
						this.aString28 = "";
						this.aBoolean225 = false;
						for (@Pc(194) int local194 = 0; local194 < Class36.aClass36Array1.length; local194++) {
							if (Class36.aClass36Array1[local194] != null && Class36.aClass36Array1[local194].anInt681 == 600) {
								this.anInt1058 = this.anInt870 = Class36.aClass36Array1[local194].anInt680;
								return;
							}
						}
						return;
					}
					this.method703("Please close the interface you have open before using 'report abuse'", "", 0);
					return;
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("13085, " + 0 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method699() {
		try {
			if (this.anInt970 == 0 && this.anInt866 == 0) {
				this.aStringArray13[this.anInt1029] = "Walk here";
				this.anIntArray242[this.anInt1029] = 610;
				this.anIntArray240[this.anInt1029] = super.anInt839;
				this.anIntArray241[this.anInt1029] = super.anInt840;
				this.anInt1029++;
			}
			@Pc(41) int local41 = -1;
			this.anInt954 += 0;
			for (@Pc(49) int local49 = 0; local49 < Class8_Sub1_Sub2_Sub5.anInt713; local49++) {
				@Pc(55) int local55 = Class8_Sub1_Sub2_Sub5.anIntArray152[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					@Pc(224) int local224;
					if (local71 == 2 && this.aClass32_1.method412(this.anInt1042, local59, local65, local55) >= 0) {
						@Pc(97) Class33 local97 = Class33.method443(local77);
						if (local97.anIntArray97 != null) {
							local97 = local97.method439(841);
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt970 == 1) {
							this.aStringArray13[this.anInt1029] = "Use " + this.aString27 + " with @cya@" + local97.aString10;
							this.anIntArray242[this.anInt1029] = 262;
							this.anIntArray243[this.anInt1029] = local55;
							this.anIntArray240[this.anInt1029] = local59;
							this.anIntArray241[this.anInt1029] = local65;
							this.anInt1029++;
						} else if (this.anInt866 != 1) {
							if (local97.aStringArray5 != null) {
								for (local224 = 4; local224 >= 0; local224--) {
									if (local97.aStringArray5[local224] != null) {
										this.aStringArray13[this.anInt1029] = local97.aStringArray5[local224] + " @cya@" + local97.aString10;
										if (local224 == 0) {
											this.anIntArray242[this.anInt1029] = 237;
										}
										if (local224 == 1) {
											this.anIntArray242[this.anInt1029] = 111;
										}
										if (local224 == 2) {
											this.anIntArray242[this.anInt1029] = 686;
										}
										if (local224 == 3) {
											this.anIntArray242[this.anInt1029] = 391;
										}
										if (local224 == 4) {
											this.anIntArray242[this.anInt1029] = 1938;
										}
										this.anIntArray243[this.anInt1029] = local55;
										this.anIntArray240[this.anInt1029] = local59;
										this.anIntArray241[this.anInt1029] = local65;
										this.anInt1029++;
									}
								}
							}
							this.aStringArray13[this.anInt1029] = "Examine @cya@" + local97.aString10;
							this.anIntArray242[this.anInt1029] = 1714;
							this.anIntArray243[this.anInt1029] = local97.anInt636 << 14;
							this.anIntArray240[this.anInt1029] = local59;
							this.anIntArray241[this.anInt1029] = local65;
							this.anInt1029++;
						} else if ((this.anInt868 & 0x4) == 4) {
							this.aStringArray13[this.anInt1029] = this.aString19 + " @cya@" + local97.aString10;
							this.anIntArray242[this.anInt1029] = 16;
							this.anIntArray243[this.anInt1029] = local55;
							this.anIntArray240[this.anInt1029] = local59;
							this.anIntArray241[this.anInt1029] = local65;
							this.anInt1029++;
						}
					}
					@Pc(404) Class8_Sub1_Sub2_Sub4_Sub2 local404;
					@Pc(452) Class8_Sub1_Sub2_Sub4_Sub1 local452;
					@Pc(442) int local442;
					if (local71 == 1) {
						@Pc(375) Class8_Sub1_Sub2_Sub4_Sub2 local375 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[local77];
						if (local375.aClass26_2.aByte19 == 1 && (local375.anInt562 & 0x7F) == 64 && (local375.anInt563 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt983; local224++) {
								local404 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray238[local224]];
								if (local404 != null && local404 != local375 && local404.aClass26_2.aByte19 == 1 && local404.anInt562 == local375.anInt562 && local404.anInt563 == local375.anInt563) {
									this.method710(this.anIntArray238[local224], local59, local65, local404.aClass26_2);
								}
							}
							for (local442 = 0; local442 < this.anInt961; local442++) {
								local452 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray232[local442]];
								if (local452 != null && local452.anInt562 == local375.anInt562 && local452.anInt563 == local375.anInt563) {
									this.method659(local65, this.anIntArray232[local442], local452, local59);
								}
							}
						}
						this.method710(local77, local59, local65, local375.aClass26_2);
					}
					if (local71 == 0) {
						@Pc(494) Class8_Sub1_Sub2_Sub4_Sub1 local494 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[local77];
						if ((local494.anInt562 & 0x7F) == 64 && (local494.anInt563 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt983; local224++) {
								local404 = this.aClass8_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray238[local224]];
								if (local404 != null && local404.aClass26_2.aByte19 == 1 && local404.anInt562 == local494.anInt562 && local404.anInt563 == local494.anInt563) {
									this.method710(this.anIntArray238[local224], local59, local65, local404.aClass26_2);
								}
							}
							for (local442 = 0; local442 < this.anInt961; local442++) {
								local452 = this.aClass8_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray232[local442]];
								if (local452 != null && local452 != local494 && local452.anInt562 == local494.anInt562 && local452.anInt563 == local494.anInt563) {
									this.method659(local65, this.anIntArray232[local442], local452, local59);
								}
							}
						}
						this.method659(local65, local77, local494, local59);
					}
					if (local71 == 3) {
						@Pc(613) Class37 local613 = this.aClass37ArrayArrayArray1[this.anInt1042][local59][local65];
						if (local613 != null) {
							for (@Pc(620) Class8_Sub1_Sub2_Sub3 local620 = (Class8_Sub1_Sub2_Sub3) local613.method492(); local620 != null; local620 = (Class8_Sub1_Sub2_Sub3) local613.method494()) {
								@Pc(626) Class2 local626 = Class2.method4(local620.anInt402);
								if (this.anInt970 == 1) {
									this.aStringArray13[this.anInt1029] = "Use " + this.aString27 + " with @lre@" + local626.aString1;
									this.anIntArray242[this.anInt1029] = 992;
									this.anIntArray243[this.anInt1029] = local620.anInt402;
									this.anIntArray240[this.anInt1029] = local59;
									this.anIntArray241[this.anInt1029] = local65;
									this.anInt1029++;
								} else if (this.anInt866 != 1) {
									for (@Pc(743) int local743 = 4; local743 >= 0; local743--) {
										if (local626.aStringArray1 != null && local626.aStringArray1[local743] != null) {
											this.aStringArray13[this.anInt1029] = local626.aStringArray1[local743] + " @lre@" + local626.aString1;
											if (local743 == 0) {
												this.anIntArray242[this.anInt1029] = 750;
											}
											if (local743 == 1) {
												this.anIntArray242[this.anInt1029] = 12;
											}
											if (local743 == 2) {
												this.anIntArray242[this.anInt1029] = 321;
											}
											if (local743 == 3) {
												this.anIntArray242[this.anInt1029] = 247;
											}
											if (local743 == 4) {
												this.anIntArray242[this.anInt1029] = 801;
											}
											this.anIntArray243[this.anInt1029] = local620.anInt402;
											this.anIntArray240[this.anInt1029] = local59;
											this.anIntArray241[this.anInt1029] = local65;
											this.anInt1029++;
										} else if (local743 == 2) {
											this.aStringArray13[this.anInt1029] = "Take @lre@" + local626.aString1;
											this.anIntArray242[this.anInt1029] = 321;
											this.anIntArray243[this.anInt1029] = local620.anInt402;
											this.anIntArray240[this.anInt1029] = local59;
											this.anIntArray241[this.anInt1029] = local65;
											this.anInt1029++;
										}
									}
									this.aStringArray13[this.anInt1029] = "Examine @lre@" + local626.aString1;
									this.anIntArray242[this.anInt1029] = 1297;
									this.anIntArray243[this.anInt1029] = local620.anInt402;
									this.anIntArray240[this.anInt1029] = local59;
									this.anIntArray241[this.anInt1029] = local65;
									this.anInt1029++;
								} else if ((this.anInt868 & 0x1) == 1) {
									this.aStringArray13[this.anInt1029] = this.aString19 + " @lre@" + local626.aString1;
									this.anIntArray242[this.anInt1029] = 516;
									this.anIntArray243[this.anInt1029] = local620.anInt402;
									this.anIntArray240[this.anInt1029] = local59;
									this.anIntArray241[this.anInt1029] = local65;
									this.anInt1029++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("84026, " + 0 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method700() {
		try {
			this.anInt991 = 0;
			@Pc(10) int local10 = (aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt562 >> 7) + this.anInt944;
			@Pc(18) int local18 = (aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt563 >> 7) + this.anInt945;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt991 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt991 = 1;
			}
			if (this.anInt991 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt991 = 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("5062, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GLMIQHJI;IILclient!PASMQFXV;B)V")
	private void method701(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub1_Sub2_Sub4_Sub1 arg3) {
		try {
			if (this.aByte47 != 68) {
				this.anInt955 = arg0.method165();
			}
			@Pc(17) int local17;
			@Pc(21) int local21;
			if ((arg1 & 0x200) != 0) {
				local17 = arg0.method186(535);
				local21 = arg0.method185();
				arg3.method379(local21, anInt927, 500, local17);
				arg3.anInt583 = anInt927 + 300;
				arg3.anInt584 = arg0.method185();
				arg3.anInt585 = arg0.method185();
			}
			if ((arg1 & 0x10) != 0) {
				local17 = arg0.method184();
				@Pc(53) byte[] local53 = new byte[local17];
				@Pc(59) Class8_Sub1_Sub3 local59 = new Class8_Sub1_Sub3(local53, -49015);
				arg0.method174(local53, local17);
				this.aClass8_Sub1_Sub3Array1[arg2] = local59;
				arg3.method368(local59);
			}
			if ((arg1 & 0x2) != 0) {
				arg3.aString9 = arg0.method172();
				if (arg3.aString9.charAt(0) == '~') {
					arg3.aString9 = arg3.aString9.substring(1);
					this.method703(arg3.aString9, arg3.aString8, 2);
				} else if (arg3 == aClass8_Sub1_Sub2_Sub4_Sub1_1) {
					this.method703(arg3.aString9, arg3.aString8, 2);
				}
				arg3.anInt549 = 0;
				arg3.anInt560 = 0;
				arg3.anInt545 = 150;
			}
			if ((arg1 & 0x100) != 0) {
				arg3.anInt565 = arg0.method186(535);
				arg3.anInt567 = arg0.method185();
				arg3.anInt566 = arg0.method185();
				arg3.anInt568 = arg0.method165();
				arg3.anInt569 = arg0.method167() + anInt927;
				arg3.anInt570 = arg0.method195() + anInt927;
				arg3.anInt571 = arg0.method186(535);
				arg3.method376();
			}
			if ((arg1 & 0x400) != 0) {
				arg3.anInt551 = arg0.method194(this.anInt865);
				local17 = arg0.method170();
				arg3.anInt555 = local17 >> 16;
				arg3.anInt554 = anInt927 + (local17 & 0xFFFF);
				arg3.anInt552 = 0;
				arg3.anInt553 = 0;
				if (arg3.anInt554 > anInt927) {
					arg3.anInt552 = -1;
				}
				if (arg3.anInt551 == 65535) {
					arg3.anInt551 = -1;
				}
			}
			if ((arg1 & 0x20) != 0) {
				local17 = arg0.method186(535);
				local21 = arg0.method165();
				arg3.method379(local21, anInt927, 500, local17);
				arg3.anInt583 = anInt927 + 300;
				arg3.anInt584 = arg0.method184();
				arg3.anInt585 = arg0.method186(535);
			}
			if ((arg1 & 0x4) != 0) {
				arg3.anInt548 = arg0.method193();
				if (arg3.anInt548 == 65535) {
					arg3.anInt548 = -1;
				}
			}
			if ((arg1 & 0x80) != 0) {
				arg3.anInt542 = arg0.method193();
				arg3.anInt543 = arg0.method194(this.anInt865);
			}
			@Pc(292) int local292;
			if ((arg1 & 0x40) != 0) {
				local17 = arg0.method193();
				local21 = arg0.method186(535);
				local292 = arg0.method185();
				@Pc(295) int local295 = arg0.anInt253;
				if (arg3.aString8 != null && arg3.aBoolean119) {
					@Pc(305) long local305 = Class48.method559(arg3.aString8);
					@Pc(307) boolean local307 = false;
					if (local21 <= 1) {
						for (@Pc(312) int local312 = 0; local312 < this.anInt859; local312++) {
							if (this.aLongArray3[local312] == local305) {
								local307 = true;
								break;
							}
						}
					}
					if (!local307 && this.anInt991 == 0) {
						try {
							this.aClass8_Sub1_Sub3_9.anInt253 = 0;
							arg0.method201(this.aClass8_Sub1_Sub3_9.aByteArray9, local292);
							this.aClass8_Sub1_Sub3_9.anInt253 = 0;
							@Pc(357) String local357 = Class23.method282(this.aClass8_Sub1_Sub3_9, local292);
							@Pc(362) String local362 = Class19.method220(local357, this.anInt951);
							arg3.aString9 = local362;
							arg3.anInt549 = local17 >> 8;
							arg3.anInt560 = local17 & 0xFF;
							arg3.anInt545 = 150;
							if (local21 == 2 || local21 == 3) {
								this.method703(local362, "@cr2@" + arg3.aString8, 1);
							} else if (local21 == 1) {
								this.method703(local362, "@cr1@" + arg3.aString8, 1);
							} else {
								this.method703(local362, arg3.aString8, 2);
							}
						} catch (@Pc(426) Exception local426) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt253 = local295 + local292;
			}
			if ((arg1 & 0x8) != 0) {
				local17 = arg0.method195();
				if (local17 == 65535) {
					local17 = -1;
				}
				local21 = arg0.method165();
				if (local17 == arg3.anInt578 && local17 != -1) {
					local292 = Class40.aClass40Array1[local17].anInt761;
					if (local292 == 1) {
						arg3.anInt579 = 0;
						arg3.anInt580 = 0;
						arg3.anInt581 = local21;
						arg3.anInt582 = 0;
					}
					if (local292 == 2) {
						arg3.anInt582 = 0;
						return;
					}
				} else if (local17 == -1 || arg3.anInt578 == -1 || Class40.aClass40Array1[local17].anInt755 >= Class40.aClass40Array1[arg3.anInt578].anInt755) {
					arg3.anInt578 = local17;
					arg3.anInt579 = 0;
					arg3.anInt580 = 0;
					arg3.anInt581 = local21;
					arg3.anInt582 = 0;
					arg3.anInt561 = arg3.anInt550;
				}
			}
		} catch (@Pc(522) RuntimeException local522) {
			signlink.reporterror("84367, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 68 + ", " + local522.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method702(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt954 += arg1;
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt859; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt859--;
						this.aBoolean218 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt859; local34++) {
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass8_Sub1_Sub3_6.method154(173);
						this.aClass8_Sub1_Sub3_6.method161(arg0);
						return;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("89227, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)V")
	private void method703(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt1023 != -1) {
				this.aString20 = arg0;
				super.anInt844 = 0;
			}
			if (this.anInt1043 == -1) {
				this.aBoolean230 = true;
			}
			for (@Pc(23) int local23 = 99; local23 > 0; local23--) {
				this.anIntArray218[local23] = this.anIntArray218[local23 - 1];
				this.aStringArray8[local23] = this.aStringArray8[local23 - 1];
				this.aStringArray9[local23] = this.aStringArray9[local23 - 1];
			}
			this.anIntArray218[0] = arg2;
			this.aStringArray8[0] = arg1;
			this.aStringArray9[0] = arg0;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("12940, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method704() {
		try {
			if (this.anInt999 != -47865) {
				aBoolean232 = !aBoolean232;
			}
			if (super.anInt844 == 1) {
				if (super.anInt845 >= 539 && super.anInt845 <= 573 && super.anInt846 >= 169 && super.anInt846 < 205 && this.anIntArray229[0] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 0;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 569 && super.anInt845 <= 599 && super.anInt846 >= 168 && super.anInt846 < 205 && this.anIntArray229[1] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 1;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 597 && super.anInt845 <= 627 && super.anInt846 >= 168 && super.anInt846 < 205 && this.anIntArray229[2] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 2;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 625 && super.anInt845 <= 669 && super.anInt846 >= 168 && super.anInt846 < 203 && this.anIntArray229[3] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 3;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 666 && super.anInt845 <= 696 && super.anInt846 >= 168 && super.anInt846 < 205 && this.anIntArray229[4] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 4;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 694 && super.anInt845 <= 724 && super.anInt846 >= 168 && super.anInt846 < 205 && this.anIntArray229[5] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 5;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 722 && super.anInt845 <= 756 && super.anInt846 >= 169 && super.anInt846 < 205 && this.anIntArray229[6] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 6;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 540 && super.anInt845 <= 574 && super.anInt846 >= 466 && super.anInt846 < 502 && this.anIntArray229[7] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 7;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 572 && super.anInt845 <= 602 && super.anInt846 >= 466 && super.anInt846 < 503 && this.anIntArray229[8] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 8;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 599 && super.anInt845 <= 629 && super.anInt846 >= 466 && super.anInt846 < 503 && this.anIntArray229[9] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 9;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 627 && super.anInt845 <= 671 && super.anInt846 >= 467 && super.anInt846 < 502 && this.anIntArray229[10] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 10;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 669 && super.anInt845 <= 699 && super.anInt846 >= 466 && super.anInt846 < 503 && this.anIntArray229[11] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 11;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 696 && super.anInt845 <= 726 && super.anInt846 >= 466 && super.anInt846 < 503 && this.anIntArray229[12] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 12;
					this.aBoolean211 = true;
				}
				if (super.anInt845 >= 724 && super.anInt845 <= 758 && super.anInt846 >= 466 && super.anInt846 < 502 && this.anIntArray229[13] != -1) {
					this.aBoolean218 = true;
					this.anInt884 = 13;
					this.aBoolean211 = true;
					return;
				}
			}
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("76044, " + -47865 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)Lclient!XRWUKRPO;")
	private Class45 method705(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass39Array1[0] != null) {
					local3 = this.aClass39Array1[0].method496((byte) 8, arg3);
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
				return new Class45(-31558, local3);
			}
			local34 = 0;
			this.anInt954 += arg2;
			while (local3 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method579(arg5, "Requesting " + arg1);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method668(arg0 + arg4);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class8_Sub1_Sub3 local101 = new Class8_Sub1_Sub3(local90, -49015);
					local101.anInt253 = 3;
					@Pc(109) int local109 = local101.method169() + 6;
					@Pc(111) int local111 = 6;
					local3 = new byte[local109];
					for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
						local3[local116] = local90[local116];
					}
					@Pc(133) int local133;
					while (local111 < local109) {
						local133 = local109 - local111;
						if (local133 > 1000) {
							local133 = 1000;
						}
						@Pc(144) int local144 = local87.read(local3, local111, local133);
						if (local144 < 0) {
							(new StringBuffer("Length error: ")).append(local111).append("/").append(local109).toString();
							throw new IOException("EOF");
						}
						local111 += local144;
						@Pc(173) int local173 = local111 * 100 / local109;
						if (local173 != local76) {
							this.method579(arg5, "Loading " + arg1 + " - " + local173 + "%");
						}
						local76 = local173;
					}
					local87.close();
					try {
						if (this.aClass39Array1[0] != null) {
							this.aClass39Array1[0].method497(local3.length, local3, arg3);
						}
					} catch (@Pc(218) Exception local218) {
						this.aClass39Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local133 = (int) this.aCRC32_2.getValue();
						if (local133 != arg4) {
							local3 = null;
							local34++;
							local61 = "Checksum error: " + local133;
						}
					}
				} catch (@Pc(253) IOException local253) {
					if (local61.equals("Unknown error")) {
						local61 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(263) NullPointerException local263) {
					local61 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(272) ArrayIndexOutOfBoundsException local272) {
					local61 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(281) Exception local281) {
					local61 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local76 = local5; local76 > 0; local76--) {
						if (local34 >= 3) {
							this.method579(arg5, "Game updated - please reload page");
							local76 = 10;
						} else {
							this.method579(arg5, local61 + " - Retrying in " + local76);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(325) Exception local325) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean193 = !this.aBoolean193;
				}
			}
			return new Class45(-31558, local3);
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("96935, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private String method706(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("3421, " + 0 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method707() {
		try {
			@Pc(7) int local7 = this.aClass8_Sub1_Sub1_Sub2_4.method103("Choose Option");
			@Pc(23) int local23;
			for (@Pc(12) int local12 = 0; local12 < this.anInt1029; local12++) {
				local23 = this.aClass8_Sub1_Sub1_Sub2_4.method103(this.aStringArray13[local12]);
				if (local23 > local7) {
					local7 = local23;
				}
			}
			local7 += 8;
			local23 = this.anInt1029 * 15 + 21;
			@Pc(66) int local66;
			@Pc(84) int local84;
			if (super.anInt845 > 4 && super.anInt846 > 4 && super.anInt845 < 516 && super.anInt846 < 338) {
				local66 = super.anInt845 - local7 / 2 - 4;
				if (local66 + local7 > 512) {
					local66 = 512 - local7;
				}
				if (local66 < 0) {
					local66 = 0;
				}
				local84 = super.anInt846 - 4;
				if (local84 + local23 > 334) {
					local84 = 334 - local23;
				}
				if (local84 < 0) {
					local84 = 0;
				}
				this.aBoolean216 = true;
				this.anInt1001 = 0;
				this.anInt1002 = local66;
				this.anInt1003 = local84;
				this.anInt1004 = local7;
				this.anInt1005 = this.anInt1029 * 15 + 22;
			}
			if (super.anInt845 > 553 && super.anInt846 > 205 && super.anInt845 < 743 && super.anInt846 < 466) {
				local66 = super.anInt845 - local7 / 2 - 553;
				if (local66 < 0) {
					local66 = 0;
				} else if (local66 + local7 > 190) {
					local66 = 190 - local7;
				}
				local84 = super.anInt846 - 205;
				if (local84 < 0) {
					local84 = 0;
				} else if (local84 + local23 > 261) {
					local84 = 261 - local23;
				}
				this.aBoolean216 = true;
				this.anInt1001 = 1;
				this.anInt1002 = local66;
				this.anInt1003 = local84;
				this.anInt1004 = local7;
				this.anInt1005 = this.anInt1029 * 15 + 22;
			}
			if (super.anInt845 > 17 && super.anInt846 > 357 && super.anInt845 < 496 && super.anInt846 < 453) {
				local66 = super.anInt845 - local7 / 2 - 17;
				if (local66 < 0) {
					local66 = 0;
				} else if (local66 + local7 > 479) {
					local66 = 479 - local7;
				}
				local84 = super.anInt846 - 357;
				if (local84 < 0) {
					local84 = 0;
				} else if (local84 + local23 > 96) {
					local84 = 96 - local23;
				}
				this.aBoolean216 = true;
				this.anInt1001 = 2;
				this.anInt1002 = local66;
				this.anInt1003 = local84;
				this.anInt1004 = local7;
				this.anInt1005 = this.anInt1029 * 15 + 22;
			}
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("40430, " + false + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method708(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt906 != 0) {
				@Pc(8) Class8_Sub1_Sub1_Sub2 local8 = this.aClass8_Sub1_Sub1_Sub2_3;
				@Pc(13) boolean local13 = false;
				@Pc(20) int local20 = 0;
				if (this.anInt987 != 0) {
					local20 = 1;
				}
				for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
					if (this.aStringArray9[local27] != null) {
						@Pc(39) int local39 = this.anIntArray218[local27];
						@Pc(44) String local44 = this.aStringArray8[local27];
						@Pc(46) byte local46 = 0;
						if (local44 != null && local44.startsWith("@cr1@")) {
							local44 = local44.substring(5);
							local46 = 1;
						}
						if (local44 != null && local44.startsWith("@cr2@")) {
							local44 = local44.substring(5);
							local46 = 2;
						}
						@Pc(97) int local97;
						if ((local39 == 3 || local39 == 7) && (local39 == 7 || this.anInt953 == 0 || this.anInt953 == 1 && this.method604(local44))) {
							local97 = 329 - local20 * 13;
							local8.method105("From", 0, 4, local97);
							local8.method105("From", 65535, 4, local97 - 1);
							@Pc(122) int local122 = local8.method103("From ") + 4;
							if (local46 == 1) {
								this.aClass8_Sub1_Sub1_Sub4Array4[0].method519(local122, 272, local97 - 12);
								local122 += 14;
							}
							if (local46 == 2) {
								this.aClass8_Sub1_Sub1_Sub4Array4[1].method519(local122, 272, local97 - 12);
								local122 += 14;
							}
							local8.method105(local44 + ": " + this.aStringArray9[local27], 0, local122, local97);
							local8.method105(local44 + ": " + this.aStringArray9[local27], 65535, local122, local97 - 1);
							local20++;
							if (local20 >= 5) {
								return;
							}
						}
						if (local39 == 5 && this.anInt953 < 2) {
							local97 = 329 - local20 * 13;
							local8.method105(this.aStringArray9[local27], 0, 4, local97);
							local8.method105(this.aStringArray9[local27], 65535, 4, local97 - 1);
							local20++;
							if (local20 >= 5) {
								return;
							}
						}
						if (local39 == 6 && this.anInt953 < 2) {
							local97 = 329 - local20 * 13;
							local8.method105("To " + local44 + ": " + this.aStringArray9[local27], 0, 4, local97);
							local8.method105("To " + local44 + ": " + this.aStringArray9[local27], 65535, 4, local97 - 1);
							local20++;
							if (local20 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(301) RuntimeException local301) {
			signlink.reporterror("39171, " + arg0 + ", " + local301.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
				if (aBoolean197 && arg4 != this.anInt1042) {
					return;
				}
				@Pc(25) int local25 = 0;
				if (arg2 == 0) {
					local25 = this.aClass32_1.method408(arg4, arg3, arg6);
				}
				if (arg2 == 1) {
					local25 = this.aClass32_1.method409(arg3, arg6, arg4);
				}
				if (arg2 == 2) {
					local25 = this.aClass32_1.method410(arg4, arg3, arg6);
				}
				if (arg2 == 3) {
					local25 = this.aClass32_1.method411(arg4, arg3, arg6);
				}
				@Pc(81) int local81;
				if (local25 != 0) {
					local81 = this.aClass32_1.method412(arg4, arg3, arg6, local25);
					@Pc(87) int local87 = local25 >> 14 & 0x7FFF;
					@Pc(91) int local91 = local81 & 0x1F;
					@Pc(95) int local95 = local81 >> 6;
					@Pc(107) Class33 local107;
					if (arg2 == 0) {
						this.aClass32_1.method399(arg6, arg4, arg3);
						local107 = Class33.method443(local87);
						if (local107.aBoolean137) {
							this.aClass11Array1[arg4].method122(arg3, local95, local107.aBoolean139, arg6, local91);
						}
					}
					if (arg2 == 1) {
						this.aClass32_1.method400(arg4, arg6, arg3);
					}
					if (arg2 == 2) {
						this.aClass32_1.method401(arg6, arg4, arg3);
						local107 = Class33.method443(local87);
						if (arg3 + local107.anInt647 > 103 || arg6 + local107.anInt647 > 103 || arg3 + local107.anInt638 > 103 || arg6 + local107.anInt638 > 103) {
							return;
						}
						if (local107.aBoolean137) {
							this.aClass11Array1[arg4].method123(arg3, local95, local107.aBoolean139, local107.anInt638, local107.anInt647, arg6);
						}
					}
					if (arg2 == 3) {
						this.aClass32_1.method402(arg3, arg4, arg6);
						local107 = Class33.method443(local87);
						if (local107.aBoolean137 && local107.aBoolean132) {
							this.aClass11Array1[arg4].method125(arg3, arg6);
						}
					}
				}
				if (arg5 >= 0) {
					local81 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray8[1][arg3][arg6] & 0x2) == 2) {
						local81 = arg4 + 1;
					}
					Class43.method539(arg1, arg4, this.anIntArrayArrayArray7, arg5, this.aClass32_1, local81, arg3, arg0, this.aClass11Array1[arg4], arg6);
					return;
				}
			}
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("42503, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -23974 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIILclient!LPTCUHOU;)V")
	private void method710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26 arg3) {
		try {
			this.aBoolean219 &= true;
			if (this.anInt1029 < 400) {
				if (arg3.anIntArray61 != null) {
					arg3 = arg3.method323();
				}
				if (arg3 != null) {
					@Pc(25) String local25 = arg3.aString4;
					if (arg3.anInt365 != 0) {
						local25 = local25 + method646(this.anInt917, arg3.anInt365, aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt532) + " (level-" + arg3.anInt365 + ")";
					}
					if (this.anInt970 == 1) {
						this.aStringArray13[this.anInt1029] = "Use " + this.aString27 + " with @yel@" + local25;
						this.anIntArray242[this.anInt1029] = 818;
						this.anIntArray243[this.anInt1029] = arg0;
						this.anIntArray240[this.anInt1029] = arg1;
						this.anIntArray241[this.anInt1029] = arg2;
						this.anInt1029++;
					} else if (this.anInt866 != 1) {
						@Pc(164) int local164;
						if (arg3.aStringArray4 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg3.aStringArray4[local164] != null && !arg3.aStringArray4[local164].equalsIgnoreCase("attack")) {
									this.aStringArray13[this.anInt1029] = arg3.aStringArray4[local164] + " @yel@" + local25;
									if (local164 == 0) {
										this.anIntArray242[this.anInt1029] = 331;
									}
									if (local164 == 1) {
										this.anIntArray242[this.anInt1029] = 41;
									}
									if (local164 == 2) {
										this.anIntArray242[this.anInt1029] = 677;
									}
									if (local164 == 3) {
										this.anIntArray242[this.anInt1029] = 30;
									}
									if (local164 == 4) {
										this.anIntArray242[this.anInt1029] = 337;
									}
									this.anIntArray243[this.anInt1029] = arg0;
									this.anIntArray240[this.anInt1029] = arg1;
									this.anIntArray241[this.anInt1029] = arg2;
									this.anInt1029++;
								}
							}
						}
						if (arg3.aStringArray4 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg3.aStringArray4[local164] != null && arg3.aStringArray4[local164].equalsIgnoreCase("attack")) {
									@Pc(288) short local288 = 0;
									if (arg3.anInt365 > aClass8_Sub1_Sub2_Sub4_Sub1_1.anInt532) {
										local288 = 2000;
									}
									this.aStringArray13[this.anInt1029] = arg3.aStringArray4[local164] + " @yel@" + local25;
									if (local164 == 0) {
										this.anIntArray242[this.anInt1029] = local288 + 331;
									}
									if (local164 == 1) {
										this.anIntArray242[this.anInt1029] = local288 + 41;
									}
									if (local164 == 2) {
										this.anIntArray242[this.anInt1029] = local288 + 677;
									}
									if (local164 == 3) {
										this.anIntArray242[this.anInt1029] = local288 + 30;
									}
									if (local164 == 4) {
										this.anIntArray242[this.anInt1029] = local288 + 337;
									}
									this.anIntArray243[this.anInt1029] = arg0;
									this.anIntArray240[this.anInt1029] = arg1;
									this.anIntArray241[this.anInt1029] = arg2;
									this.anInt1029++;
								}
							}
						}
						this.aStringArray13[this.anInt1029] = "Examine @yel@" + local25;
						this.anIntArray242[this.anInt1029] = 1101;
						this.anIntArray243[this.anInt1029] = arg0;
						this.anIntArray240[this.anInt1029] = arg1;
						this.anIntArray241[this.anInt1029] = arg2;
						this.anInt1029++;
					} else if ((this.anInt868 & 0x2) == 2) {
						this.aStringArray13[this.anInt1029] = this.aString19 + " @yel@" + local25;
						this.anIntArray242[this.anInt1029] = 873;
						this.anIntArray243[this.anInt1029] = arg0;
						this.anIntArray240[this.anInt1029] = arg1;
						this.anIntArray241[this.anInt1029] = arg2;
						this.anInt1029++;
						return;
					}
				}
			}
		} catch (@Pc(438) RuntimeException local438) {
			signlink.reporterror("16671, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local438.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method711(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt859 >= 100) {
					this.method703("Your ignore list is full. Max of 100 hit", "", 0);
				} else {
					@Pc(23) String local23 = Class48.method563(Class48.method560(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt859; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method703(local23 + " is already on your ignore list", "", 0);
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt852; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method703("Please remove " + local23 + " from your friend list first", "", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt859++] = arg0;
					this.aBoolean218 = true;
					this.aClass8_Sub1_Sub3_6.method154(38);
					this.aClass8_Sub1_Sub3_6.method161(arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("94710, " + arg0 + ", " + 7 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!USEDZXXV;IIII)V")
	private void method712(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0.anInt669 == 0 && arg0.anIntArray108 != null && (!arg0.aBoolean148 || this.anInt883 == arg0.anInt684 || this.anInt902 == arg0.anInt684 || this.anInt995 == arg0.anInt684)) {
				@Pc(29) int local29 = Class8_Sub1_Sub1.anInt738;
				@Pc(31) int local31 = Class8_Sub1_Sub1.anInt736;
				@Pc(33) int local33 = Class8_Sub1_Sub1.anInt739;
				@Pc(35) int local35 = Class8_Sub1_Sub1.anInt737;
				Class8_Sub1_Sub1.method504(455, arg3, arg3 + arg0.anInt682, arg1 + arg0.anInt679, arg1);
				@Pc(51) int local51 = arg0.anIntArray108.length;
				for (@Pc(58) int local58 = 0; local58 < local51; local58++) {
					@Pc(67) int local67 = arg0.anIntArray114[local58] + arg3;
					@Pc(76) int local76 = arg0.anIntArray109[local58] + arg1 - arg2;
					@Pc(83) Class36 local83 = Class36.aClass36Array1[arg0.anIntArray108[local58]];
					@Pc(88) int local88 = local67 + local83.anInt660;
					@Pc(93) int local93 = local76 + local83.anInt674;
					if (local83.anInt681 > 0) {
						this.method607((byte) 4, local83);
					}
					if (local83.anInt669 == 0) {
						if (local83.anInt683 > local83.anInt664 - local83.anInt679) {
							local83.anInt683 = local83.anInt664 - local83.anInt679;
						}
						if (local83.anInt683 < 0) {
							local83.anInt683 = 0;
						}
						this.method712(local83, local93, local83.anInt683, local88);
						if (local83.anInt664 > local83.anInt679) {
							this.method649(local83.anInt664, local83.anInt683, local83.anInt679, local88 + local83.anInt682, local93);
						}
					} else if (local83.anInt669 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local83.anInt669 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local83.anInt679; local165++) {
								for (local169 = 0; local169 < local83.anInt682; local169++) {
									local180 = local88 + local169 * (local83.anInt663 + 32);
									@Pc(189) int local189 = local93 + local165 * (local83.anInt658 + 32);
									if (local163 < 20) {
										local180 += local83.anIntArray113[local163];
										local189 += local83.anIntArray107[local163];
									}
									if (local83.anIntArray110[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local83.anIntArray110[local163] - 1;
										if (local180 > Class8_Sub1_Sub1.anInt738 - 32 && local180 < Class8_Sub1_Sub1.anInt739 && local189 > Class8_Sub1_Sub1.anInt736 - 32 && local189 < Class8_Sub1_Sub1.anInt737 || this.anInt1054 != 0 && this.anInt1053 == local163) {
											@Pc(247) int local247 = 0;
											if (this.anInt970 == 1 && this.anInt971 == local163 && this.anInt972 == local83.anInt684) {
												local247 = 16777215;
											}
											@Pc(271) Class8_Sub1_Sub1_Sub3 local271 = Class2.method5(local247, local222, local83.anIntArray115[local163]);
											if (local271 != null) {
												@Pc(350) int local350;
												if (this.anInt1054 != 0 && this.anInt1053 == local163 && this.anInt1052 == local83.anInt684) {
													local213 = super.anInt839 - this.anInt1055;
													local215 = super.anInt840 - this.anInt1056;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt892 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method269(local180 + local213, local189 + local215);
													if (local189 + local215 < Class8_Sub1_Sub1.anInt736 && arg0.anInt683 > 0) {
														local350 = this.anInt856 * (Class8_Sub1_Sub1.anInt736 - local189 - local215) / 3;
														if (local350 > this.anInt856 * 10) {
															local350 = this.anInt856 * 10;
														}
														if (local350 > arg0.anInt683) {
															local350 = arg0.anInt683;
														}
														arg0.anInt683 -= local350;
														this.anInt1056 += local350;
													}
													if (local189 + local215 + 32 > Class8_Sub1_Sub1.anInt737 && arg0.anInt683 < arg0.anInt664 - arg0.anInt679) {
														local350 = this.anInt856 * (local189 + local215 + 32 - Class8_Sub1_Sub1.anInt737) / 3;
														if (local350 > this.anInt856 * 10) {
															local350 = this.anInt856 * 10;
														}
														if (local350 > arg0.anInt664 - arg0.anInt679 - arg0.anInt683) {
															local350 = arg0.anInt664 - arg0.anInt679 - arg0.anInt683;
														}
														arg0.anInt683 += local350;
														this.anInt1056 -= local350;
													}
												} else if (this.anInt925 != 0 && this.anInt924 == local163 && this.anInt923 == local83.anInt684) {
													local271.method269(local180, local189);
												} else {
													local271.method267(local180, 272, local189);
												}
												if (local271.anInt314 == 33 || local83.anIntArray115[local163] != 1) {
													local350 = local83.anIntArray115[local163];
													this.aClass8_Sub1_Sub1_Sub2_2.method105(method623(local350), 0, local180 + local213 + 1, local189 + 10 + local215);
													this.aClass8_Sub1_Sub1_Sub2_2.method105(method623(local350), 16776960, local180 + local213, local189 + 9 + local215);
												}
											}
										}
									} else if (local83.aClass8_Sub1_Sub1_Sub3Array2 != null && local163 < 20) {
										@Pc(539) Class8_Sub1_Sub1_Sub3 local539 = local83.aClass8_Sub1_Sub1_Sub3Array2[local163];
										if (local539 != null) {
											local539.method267(local180, 272, local189);
										}
									}
									local163++;
								}
							}
						} else if (local83.anInt669 == 3) {
							@Pc(564) boolean local564 = false;
							if (this.anInt995 == local83.anInt684 || this.anInt902 == local83.anInt684 || this.anInt883 == local83.anInt684) {
								local564 = true;
							}
							if (this.method630(this.aByte38, local83)) {
								local163 = local83.anInt668;
								if (local564 && local83.anInt673 != 0) {
									local163 = local83.anInt673;
								}
							} else {
								local163 = local83.anInt671;
								if (local564 && local83.anInt685 != 0) {
									local163 = local83.anInt685;
								}
							}
							if (local83.aByte32 == 0) {
								if (local83.aBoolean151) {
									Class8_Sub1_Sub1.method507(local83.anInt682, local88, local163, local93, local83.anInt679);
								} else {
									Class8_Sub1_Sub1.method508(local163, local83.anInt679, local83.anInt682, local93, local88);
								}
							} else if (local83.aBoolean151) {
								Class8_Sub1_Sub1.method506(local163, local88, local83.anInt682, local93, 256 - (local83.aByte32 & 0xFF), local83.anInt679);
							} else {
								Class8_Sub1_Sub1.method509(local83.anInt682, 256 - (local83.aByte32 & 0xFF), local88, local163, local93, local83.anInt679);
							}
						} else {
							@Pc(683) Class8_Sub1_Sub1_Sub2 local683;
							if (local83.anInt669 == 4) {
								local683 = local83.aClass8_Sub1_Sub1_Sub2_1;
								@Pc(686) String local686 = local83.aString15;
								@Pc(688) boolean local688 = false;
								if (this.anInt995 == local83.anInt684 || this.anInt902 == local83.anInt684 || this.anInt883 == local83.anInt684) {
									local688 = true;
								}
								if (this.method630(this.aByte38, local83)) {
									local165 = local83.anInt668;
									if (local688 && local83.anInt673 != 0) {
										local165 = local83.anInt673;
									}
									if (local83.aString13.length() > 0) {
										local686 = local83.aString13;
									}
								} else {
									local165 = local83.anInt671;
									if (local688 && local83.anInt685 != 0) {
										local165 = local83.anInt685;
									}
								}
								if (local83.anInt675 == 6 && this.aBoolean233) {
									local686 = "Please wait...";
									local165 = local83.anInt671;
								}
								if (Class8_Sub1_Sub1.anInt734 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local93 + local683.anInt198;
								while (local686.length() > 0) {
									if (local686.indexOf("%") != -1) {
										label348: while (true) {
											local215 = local686.indexOf("%1");
											if (local215 == -1) {
												while (true) {
													local215 = local686.indexOf("%2");
													if (local215 == -1) {
														while (true) {
															local215 = local686.indexOf("%3");
															if (local215 == -1) {
																while (true) {
																	local215 = local686.indexOf("%4");
																	if (local215 == -1) {
																		while (true) {
																			local215 = local686.indexOf("%5");
																			if (local215 == -1) {
																				break label348;
																			}
																			local686 = local686.substring(0, local215) + this.method706(this.method656(4, local83)) + local686.substring(local215 + 2);
																		}
																	}
																	local686 = local686.substring(0, local215) + this.method706(this.method656(3, local83)) + local686.substring(local215 + 2);
																}
															}
															local686 = local686.substring(0, local215) + this.method706(this.method656(2, local83)) + local686.substring(local215 + 2);
														}
													}
													local686 = local686.substring(0, local215) + this.method706(this.method656(1, local83)) + local686.substring(local215 + 2);
												}
											}
											local686 = local686.substring(0, local215) + this.method706(this.method656(0, local83)) + local686.substring(local215 + 2);
										}
									}
									local215 = local686.indexOf("\\n");
									@Pc(961) String local961;
									if (local215 == -1) {
										local961 = local686;
										local686 = "";
									} else {
										local961 = local686.substring(0, local215);
										local686 = local686.substring(local215 + 2);
									}
									if (local83.aBoolean153) {
										local683.method102(local88 + local83.anInt682 / 2, local213, local165, local961, local83.aBoolean150);
									} else {
										local683.method109(local961, local213, local83.aBoolean150, local88, local165);
									}
									local213 += local683.anInt198;
								}
							} else if (local83.anInt669 == 5) {
								@Pc(1023) Class8_Sub1_Sub1_Sub3 local1023;
								if (this.method630(this.aByte38, local83)) {
									local1023 = local83.aClass8_Sub1_Sub1_Sub3_2;
								} else {
									local1023 = local83.aClass8_Sub1_Sub1_Sub3_1;
								}
								if (local1023 != null) {
									local1023.method267(local88, 272, local93);
								}
							} else if (local83.anInt669 == 6) {
								local163 = Class8_Sub1_Sub1_Sub1.anInt154;
								local165 = Class8_Sub1_Sub1_Sub1.anInt155;
								Class8_Sub1_Sub1_Sub1.anInt154 = local88 + local83.anInt682 / 2;
								Class8_Sub1_Sub1_Sub1.anInt155 = local93 + local83.anInt679 / 2;
								local169 = Class8_Sub1_Sub1_Sub1.anIntArray23[local83.anInt656] * local83.anInt655 >> 16;
								local180 = Class8_Sub1_Sub1_Sub1.anIntArray24[local83.anInt656] * local83.anInt655 >> 16;
								@Pc(1085) boolean local1085 = this.method630(this.aByte38, local83);
								if (local1085) {
									local213 = local83.anInt678;
								} else {
									local213 = local83.anInt677;
								}
								@Pc(1105) Class8_Sub1_Sub2_Sub5 local1105;
								if (local213 == -1) {
									local1105 = local83.method453(local1085, -1, -1);
								} else {
									@Pc(1111) Class40 local1111 = Class40.aClass40Array1[local213];
									local1105 = local83.method453(local1085, local1111.anIntArray160[local83.anInt665], local1111.anIntArray159[local83.anInt665]);
								}
								if (local1105 != null) {
									local1105.method483(local83.anInt657, 0, local83.anInt656, 0, local169, local180);
								}
								Class8_Sub1_Sub1_Sub1.anInt154 = local163;
								Class8_Sub1_Sub1_Sub1.anInt155 = local165;
							} else if (local83.anInt669 == 7) {
								local683 = local83.aClass8_Sub1_Sub1_Sub2_1;
								local165 = 0;
								for (local169 = 0; local169 < local83.anInt679; local169++) {
									for (local180 = 0; local180 < local83.anInt682; local180++) {
										if (local83.anIntArray110[local165] > 0) {
											@Pc(1175) Class2 local1175 = Class2.method4(local83.anIntArray110[local165] - 1);
											@Pc(1178) String local1178 = local1175.aString1;
											if (local1175.aBoolean3 || local83.anIntArray115[local165] != 1) {
												local1178 = local1178 + " x" + method678(local83.anIntArray115[local165], 990);
											}
											local215 = local88 + local180 * (local83.anInt663 + 115);
											local222 = local93 + local169 * (local83.anInt658 + 12);
											if (local83.aBoolean153) {
												local683.method102(local215 + local83.anInt682 / 2, local222, local83.anInt671, local1178, local83.aBoolean150);
											} else {
												local683.method109(local1178, local222, local83.aBoolean150, local215, local83.anInt671);
											}
										}
										local165++;
									}
								}
							}
						}
					}
				}
				Class8_Sub1_Sub1.method504(455, local29, local33, local35, local31);
			}
		} catch (@Pc(1274) RuntimeException local1274) {
			signlink.reporterror("64151, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 851 + ", " + arg3 + ", " + local1274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass32_1.method408(arg4, arg3, arg1);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass32_1.method412(arg4, arg3, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg0;
				if (local8 > 0) {
					local30 = arg2;
				}
				@Pc(38) int[] local38 = this.aClass8_Sub1_Sub1_Sub3_13.anIntArray49;
				local52 = arg3 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class33 local61 = Class33.method443(local58);
				if (local61.anInt630 == -1) {
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
					@Pc(71) Class8_Sub1_Sub1_Sub4 local71 = this.aClass8_Sub1_Sub1_Sub4Array3[local61.anInt630];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt647 * 4 - local71.anInt746) / 2;
						@Pc(93) int local93 = (local61.anInt638 * 4 - local71.anInt747) / 2;
						local71.method519(arg3 * 4 + local83 + 48, 272, (104 - arg1 - local61.anInt638) * 4 + local93 + 48);
					}
				}
			}
			local8 = this.aClass32_1.method410(arg4, arg3, arg1);
			if (local8 != 0) {
				local18 = this.aClass32_1.method412(arg4, arg3, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class33 local447 = Class33.method443(local30);
				@Pc(479) int local479;
				if (local447.anInt630 != -1) {
					@Pc(457) Class8_Sub1_Sub1_Sub4 local457 = this.aClass8_Sub1_Sub1_Sub4Array3[local447.anInt630];
					if (local457 != null) {
						local58 = (local447.anInt647 * 4 - local457.anInt746) / 2;
						local479 = (local447.anInt638 * 4 - local457.anInt747) / 2;
						local457.method519(arg3 * 4 + local58 + 48, 272, (104 - arg1 - local447.anInt638) * 4 + local479 + 48);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass8_Sub1_Sub1_Sub3_13.anIntArray49;
					local479 = arg3 * 4 + (103 - arg1) * 512 * 4 + 24624;
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
			local8 = this.aClass32_1.method411(arg4, arg3, arg1);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(620) Class33 local620 = Class33.method443(local18);
				if (local620.anInt630 != -1) {
					@Pc(630) Class8_Sub1_Sub1_Sub4 local630 = this.aClass8_Sub1_Sub1_Sub4Array3[local620.anInt630];
					if (local630 != null) {
						local30 = (local620.anInt647 * 4 - local630.anInt746) / 2;
						@Pc(652) int local652 = (local620.anInt638 * 4 - local630.anInt747) / 2;
						local630.method519(arg3 * 4 + local30 + 48, 272, (104 - arg1 - local620.anInt638) * 4 + local652 + 48);
						return;
					}
				}
			}
		} catch (@Pc(676) RuntimeException local676) {
			signlink.reporterror("92849, " + -508 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local676.toString());
			throw new RuntimeException();
		}
	}
}
