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

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private static int anInt847;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private static int anInt848;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private static int anInt849;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private static int anInt883;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private static int anInt892;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	public static int anInt902;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private static int anInt910;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Z")
	private static boolean aBoolean232;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private static int anInt920;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private static int anInt948;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private static int anInt952;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private static int anInt970;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private static int anInt979;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!DLZHLHNK;")
	public static Class1_Sub1_Sub2_Sub1_Sub2 aClass1_Sub1_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private static int anInt986;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private static int anInt991;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private static int anInt994;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Z")
	private static boolean aBoolean245;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	public static int anInt995;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private static int anInt1000;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private static int anInt1006;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
	private static boolean aBoolean251;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private static int anInt1020;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
	private static boolean aBoolean256;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private static int anInt1052;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "B")
	private static byte aByte27 = 77;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private static int anInt901;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Z")
	private static boolean aBoolean227;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[[I")
	public static final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private static int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private static int anInt969;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Ljava/lang/String;")
	private static String aString24;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "B")
	private static byte aByte33;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "[I")
	public static final int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Z")
	private static boolean aBoolean254;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!ZIJPRJEC;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_4;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_5;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_6;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_7;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_8;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_9;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_10;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_11;

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

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!NYFUGYQS;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_6;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!JOCFVBOI;")
	private Class19 aClass19_2;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_7;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_8;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_11;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Lclient!XTGLDHGX;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!GHOWLKWN;")
	private Class14_Sub1 aClass14_Sub1_1;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_8;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_9;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_10;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_11;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_12;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_12;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_13;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_14;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_15;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_16;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_17;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_18;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_19;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_20;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_13;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_21;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_22;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_23;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_14;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_15;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_16;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_17;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array4;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_24;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_25;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_26;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!IVIFZQBK;")
	private Class17 aClass17_27;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Lclient!NQABEVLK;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_18;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_19;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_20;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_14;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_15;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_16;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Lclient!YXVQXWYR;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Lclient!YXVQXWYR;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!YXVQXWYR;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!YXVQXWYR;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
	private int[] anIntArray212 = new int[200];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[[[Lclient!LHGXPZPG;")
	private Class21[][][] aClass21ArrayArrayArray1 = new Class21[4][104][104];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
	private boolean aBoolean218 = true;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
	private volatile boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!MBMGIXGO;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(new byte[5000], 891);

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[Lclient!CWNCPMLX;")
	private Class1_Sub1_Sub2_Sub1_Sub1[] aClass1_Sub1_Sub2_Sub1_Sub1Array1 = new Class1_Sub1_Sub2_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	private int[] anIntArray215 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt841 = 9;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
	private int[] anIntArray216 = new int[1000];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!MBMGIXGO;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = Class1_Sub1_Sub3.method256();

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt851 = -1;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
	private int[] anIntArray221 = new int[Class45.anInt725];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
	private int[] anIntArray222 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt858 = -1;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt859 = -680;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt860 = 1834;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
	private volatile boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt862 = -30815;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt863 = 533;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt864 = -1;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt866 = 2048;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt867 = 2047;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[Lclient!DLZHLHNK;")
	private Class1_Sub1_Sub2_Sub1_Sub2[] aClass1_Sub1_Sub2_Sub1_Sub2Array1 = new Class1_Sub1_Sub2_Sub1_Sub2[this.anInt866];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	private int[] anIntArray223 = new int[this.anInt866];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray224 = new int[this.anInt866];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[Lclient!MBMGIXGO;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt866];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt871 = 1;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt875 = 7759444;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "B")
	private byte aByte28 = 14;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt882 = 732;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
	private int[] anIntArray225 = new int[Class45.anInt725];

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "B")
	private byte aByte29 = 25;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt884 = 3353893;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
	private int[] anIntArray226 = new int[5];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt891 = 748;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray227 = new int[100];

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array2 = new Class1_Sub1_Sub1_Sub2[13];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt900 = -1;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Z")
	private volatile boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt904 = -1;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt905 = -1;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray228 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray229 = new int[33];

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray230 = new int[256];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[Lclient!IGSLDTHC;")
	public Class16[] aClass16Array1 = new Class16[5];

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	public int[] anIntArray231 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "B")
	private byte aByte30 = -74;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt907 = 50;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "[I")
	private int[] anIntArray232 = new int[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
	private int[] anIntArray233 = new int[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
	private int[] anIntArray234 = new int[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
	private int[] anIntArray235 = new int[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
	private int[] anIntArray236 = new int[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
	private int[] anIntArray237 = new int[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private int[] anIntArray238 = new int[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[this.anInt907];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt909 = -1;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array4 = new Class1_Sub1_Sub1_Sub1[20];

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray239 = new int[5];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt919 = 2301979;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "B")
	private byte aByte31 = 24;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!LHGXPZPG;")
	private Class21 aClass21_10 = new Class21(169);

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt930 = -1;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[I")
	private int[] anIntArray241 = new int[5];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array5 = new Class1_Sub1_Sub1_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt944 = -1;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private int[] anIntArray242 = new int[Class45.anInt725];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
	private int[] anIntArray243 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt947 = 111;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
	private int[] anIntArray244 = new int[151];

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt949 = -1;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!LHGXPZPG;")
	private Class21 aClass21_11 = new Class21(169);

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
	private int[] anIntArray245 = new int[33];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt951 = 24869;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!DUCMKFAY;")
	private Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "[Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array3 = new Class1_Sub1_Sub1_Sub2[100];

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt954 = 5063219;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray246 = new int[7];

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
	private int[] anIntArray247 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray248 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt962 = -733;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!MBMGIXGO;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = Class1_Sub1_Sub3.method256();

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
	private int[] anIntArray249 = new int[9];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "[I")
	private int[] anIntArray250 = new int[500];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
	private int[] anIntArray251 = new int[500];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
	private int[] anIntArray252 = new int[500];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
	private int[] anIntArray253 = new int[500];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array6 = new Class1_Sub1_Sub1_Sub1[20];

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt977 = 519;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt978 = 445;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt980 = -29508;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt981 = -77;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[5];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray254 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt984 = 2;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt987 = -12499;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "[Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array7 = new Class1_Sub1_Sub1_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[Lclient!CXGZMTJK;")
	private Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array8 = new Class1_Sub1_Sub1_Sub1[8];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Z")
	private boolean aBoolean243 = true;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt999 = 1;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private final int[] anIntArray255 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt1001 = -1;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Lclient!LHGXPZPG;")
	private Class21 aClass21_12 = new Class21(169);

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt1002 = 128;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1007 = -1;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!MBMGIXGO;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9 = Class1_Sub1_Sub3.method256();

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "B")
	private byte aByte32 = 5;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[500];

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
	private int[] anIntArray261 = new int[5];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Z")
	private boolean aBoolean252 = true;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[I")
	private int[] anIntArray263 = new int[50];

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1012 = 2;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1013 = 78;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "B")
	private byte aByte34 = 6;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1016 = -589;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[Lclient!DSMJIEPN;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array5 = new Class1_Sub1_Sub1_Sub2[2];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1017 = 3;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Z")
	private boolean aBoolean255 = true;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
	private int[] anIntArray264 = new int[151];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[Lclient!FTPNODIB;")
	private Class12[] aClass12Array1 = new Class12[4];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private final int anInt1024 = 100;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
	private int[] anIntArray269 = new int[100];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
	private int[] anIntArray270 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
	private int[] anIntArray271 = new int[50];

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "B")
	private byte aByte35 = -13;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1044 = -1;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Z")
	private boolean aBoolean262 = true;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1046 = 2;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray272 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
	private int[] anIntArray273 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1053 = -1;

	static {
		aBoolean224 = true;
		anInt901 = 10;
		aBoolean227 = true;
		anIntArrayArray25 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray240 = new int[99];
		@Pc(277) int local277 = 0;
		@Pc(279) int local279;
		for (local279 = 0; local279 < 99; local279++) {
			@Pc(284) int local284 = local279 + 1;
			@Pc(297) int local297 = (int) ((double) local284 + Math.pow(2.0D, (double) local284 / 7.0D) * 300.0D);
			local277 += local297;
			anIntArray240[local279] = local277 / 4;
		}
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt969 = -192;
		aString24 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aByte33 = 9;
		anIntArray262 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBoolean254 = true;
		anIntArray265 = new int[32];
		local277 = 2;
		for (local279 = 0; local279 < 32; local279++) {
			anIntArray265[local279] = local277 - 1;
			local277 += local277;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String method578(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("24548, " + arg0 + ", " + 0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method607(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("13837, " + -33245 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private static void method616() {
		try {
			Class27.aBoolean123 = false;
			Class1_Sub1_Sub1_Sub3.aBoolean143 = false;
			aBoolean228 = false;
			Class8.aBoolean20 = false;
			Class46.aBoolean195 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("27524, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 317);
			if (arg0.length == 5) {
				anInt901 = Integer.parseInt(arg0[0]);
				anInt902 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method702();
				} else if (arg0[2].equals("highmem")) {
					method616();
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
				signlink.anInt1056 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method565();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	private static String method674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) int local9 = arg0 - arg1;
			if (local9 < -9) {
				return "@red@";
			} else if (local9 < -6) {
				return "@or3@";
			} else if (local9 < -3) {
				return "@or2@";
			} else if (local9 < 0) {
				return "@or1@";
			} else if (local9 > 9) {
				return "@gre@";
			} else if (local9 > 6) {
				return "@gr3@";
			} else if (local9 > 3) {
				return "@gr2@";
			} else if (local9 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("19760, " + arg0 + ", " + arg1 + ", " + true + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private static void method702() {
		try {
			Class27.aBoolean123 = true;
			if (aByte27 != 77) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			Class1_Sub1_Sub1_Sub3.aBoolean143 = true;
			aBoolean228 = true;
			Class8.aBoolean20 = true;
			Class46.aBoolean195 = true;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("23911, " + 77 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method579() {
		try {
			signlink.anInt1061 = 0;
			signlink.midi = "stop";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("83254, " + 860 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method580() {
		try {
			@Pc(10) int local10 = 5;
			this.anIntArray249[8] = 0;
			@Pc(17) int local17 = 0;
			while (this.anIntArray249[8] == 0) {
				@Pc(21) String local21 = "Unknown problem";
				this.method577(20, "Connecting to web server");
				try {
					@Pc(43) DataInputStream local43 = this.method696("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 317);
					@Pc(50) Class1_Sub1_Sub3 local50 = new Class1_Sub1_Sub3(new byte[40], 891);
					local43.readFully(local50.aByteArray10, 0, 40);
					local43.close();
					for (@Pc(60) int local60 = 0; local60 < 9; local60++) {
						this.anIntArray249[local60] = local50.method273();
					}
					@Pc(75) int local75 = local50.method273();
					@Pc(77) int local77 = 1234;
					for (@Pc(79) int local79 = 0; local79 < 9; local79++) {
						local77 = (local77 << 1) + this.anIntArray249[local79];
					}
					if (local75 != local77) {
						local21 = "checksum problem";
						this.anIntArray249[8] = 0;
					}
				} catch (@Pc(106) EOFException local106) {
					local21 = "EOF problem";
					this.anIntArray249[8] = 0;
				} catch (@Pc(115) IOException local115) {
					local21 = "connection problem";
					this.anIntArray249[8] = 0;
				} catch (@Pc(124) Exception local124) {
					local21 = "logic problem";
					this.anIntArray249[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray249[8] == 0) {
					local17++;
					for (@Pc(142) int local142 = local10; local142 > 0; local142--) {
						if (local17 >= 10) {
							this.method577(10, "Game updated - please reload page");
							local142 = 10;
						} else {
							this.method577(10, local21 + " - Will retry in " + local142 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(176) Exception local176) {
						}
					}
					local10 *= 2;
					if (local10 > 60) {
						local10 = 60;
					}
					this.aBoolean221 = !this.aBoolean221;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("50895, " + 533 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
	private boolean method581(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray252[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 337;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("93711, " + 9 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method582() {
		try {
			this.aClass17_27.method218();
			Class1_Sub1_Sub1_Sub3.anIntArray104 = this.anIntArray256;
			this.aClass1_Sub1_Sub1_Sub2_20.method155(0, 0);
			if (this.aBoolean261) {
				this.aClass1_Sub1_Sub1_Sub4_4.method500(0, this.aString22, 40, 239);
				this.aClass1_Sub1_Sub1_Sub4_4.method500(128, this.aString27 + "*", 60, 239);
			} else if (this.anInt1019 == 1) {
				this.aClass1_Sub1_Sub1_Sub4_4.method500(0, "Enter amount:", 40, 239);
				this.aClass1_Sub1_Sub1_Sub4_4.method500(128, this.aString20 + "*", 60, 239);
			} else if (this.anInt1019 == 2) {
				this.aClass1_Sub1_Sub1_Sub4_4.method500(0, "Enter name:", 40, 239);
				this.aClass1_Sub1_Sub1_Sub4_4.method500(128, this.aString20 + "*", 60, 239);
			} else if (this.aString17 != null) {
				this.aClass1_Sub1_Sub1_Sub4_4.method500(0, this.aString17, 40, 239);
				this.aClass1_Sub1_Sub1_Sub4_4.method500(128, "Click to continue", 60, 239);
			} else if (this.anInt1044 != -1) {
				this.method669(0, 0, Class10.aClass10Array1[this.anInt1044], 0);
			} else if (this.anInt944 == -1) {
				@Pc(161) Class1_Sub1_Sub1_Sub4 local161 = this.aClass1_Sub1_Sub1_Sub4_3;
				@Pc(163) int local163 = 0;
				Class1_Sub1_Sub1.method489(77, 0, 463, 0);
				for (@Pc(171) int local171 = 0; local171 < 100; local171++) {
					if (this.aStringArray9[local171] != null) {
						@Pc(183) int local183 = this.anIntArray227[local171];
						@Pc(192) int local192 = this.anInt968 + 70 - local163 * 14;
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
								local161.method504(0, this.aStringArray9[local171], local192, 822, 4);
							}
							local163++;
						}
						@Pc(269) int local269;
						if ((local183 == 1 || local183 == 2) && (local183 == 1 || this.anInt1051 == 0 || this.anInt1051 == 1 && this.method673(local197))) {
							if (local192 > 0 && local192 < 110) {
								local269 = 4;
								if (local199 == 1) {
									this.aClass1_Sub1_Sub1_Sub2Array5[0].method155(4, local192 - 12);
									local269 += 14;
								}
								if (local199 == 2) {
									this.aClass1_Sub1_Sub1_Sub2Array5[1].method155(local269, local192 - 12);
									local269 += 14;
								}
								local161.method504(0, local197 + ":", local192, 822, local269);
								local269 += local161.method502(this.anInt978, local197) + 8;
								local161.method504(255, this.aStringArray9[local171], local192, 822, local269);
							}
							local163++;
						}
						if ((local183 == 3 || local183 == 7) && this.anInt1009 == 0 && (local183 == 7 || this.anInt846 == 0 || this.anInt846 == 1 && this.method673(local197))) {
							if (local192 > 0 && local192 < 110) {
								local161.method504(0, "From", local192, 822, 4);
								local269 = local161.method502(this.anInt978, "From ") + 4;
								if (local199 == 1) {
									this.aClass1_Sub1_Sub1_Sub2Array5[0].method155(local269, local192 - 12);
									local269 += 14;
								}
								if (local199 == 2) {
									this.aClass1_Sub1_Sub1_Sub2Array5[1].method155(local269, local192 - 12);
									local269 += 14;
								}
								local161.method504(0, local197 + ":", local192, 822, local269);
								local269 += local161.method502(this.anInt978, local197) + 8;
								local161.method504(8388608, this.aStringArray9[local171], local192, 822, local269);
							}
							local163++;
						}
						if (local183 == 4 && (this.anInt1029 == 0 || this.anInt1029 == 1 && this.method673(local197))) {
							if (local192 > 0 && local192 < 110) {
								local161.method504(8388736, local197 + " " + this.aStringArray9[local171], local192, 822, 4);
							}
							local163++;
						}
						if (local183 == 5 && this.anInt1009 == 0 && this.anInt846 < 2) {
							if (local192 > 0 && local192 < 110) {
								local161.method504(8388608, this.aStringArray9[local171], local192, 822, 4);
							}
							local163++;
						}
						if (local183 == 6 && this.anInt1009 == 0 && this.anInt846 < 2) {
							if (local192 > 0 && local192 < 110) {
								local161.method504(0, "To " + local197 + ":", local192, 822, 4);
								local161.method504(8388608, this.aStringArray9[local171], local192, 822, local161.method502(this.anInt978, "To " + local197) + 12);
							}
							local163++;
						}
						if (local183 == 8 && (this.anInt1029 == 0 || this.anInt1029 == 1 && this.method673(local197))) {
							if (local192 > 0 && local192 < 110) {
								local161.method504(8270336, local197 + " " + this.aStringArray9[local171], local192, 822, 4);
							}
							local163++;
						}
					}
				}
				Class1_Sub1_Sub1.method488();
				this.anInt1013 = local163 * 14 + 7;
				if (this.anInt1013 < 78) {
					this.anInt1013 = 78;
				}
				this.method594(77, this.anInt1013 - this.anInt968 - 77, 0, 463, this.anInt1013);
				@Pc(643) String local643;
				if (aClass1_Sub1_Sub2_Sub1_Sub2_1 == null || aClass1_Sub1_Sub2_Sub1_Sub2_1.aString6 == null) {
					local643 = Class50.method563(this.aString25);
				} else {
					local643 = aClass1_Sub1_Sub2_Sub1_Sub2_1.aString6;
				}
				local161.method504(0, local643 + ":", 90, 822, 4);
				local161.method504(255, this.aString19 + "*", 90, 822, local161.method502(this.anInt978, local643 + ": ") + 6);
				Class1_Sub1_Sub1.method495(77, 0, 479, 0);
			} else {
				this.method669(0, 0, Class10.aClass10Array1[this.anInt944], 0);
			}
			if (this.aBoolean223 && this.anInt895 == 2) {
				this.method604((byte) 9);
			}
			this.aClass17_27.method219(357, super.aGraphics2, 17);
			this.aClass17_26.method218();
			Class1_Sub1_Sub1_Sub3.anIntArray104 = this.anIntArray258;
		} catch (@Pc(739) RuntimeException local739) {
			signlink.reporterror("19689, " + 6 + ", " + local739.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt901 = Integer.parseInt(this.getParameter("nodeid"));
		anInt902 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method702();
		} else {
			method616();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean227 = false;
		} else {
			aBoolean227 = true;
		}
		this.method566();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method576(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method576(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Ljava/net/Socket;")
	public Socket method583(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method584() {
		try {
			if (this.anInt965 == 0) {
				@Pc(14) int local14 = super.anInt832;
				if (this.anInt988 == 1 && super.anInt833 >= 516 && super.anInt834 >= 160 && super.anInt833 <= 765 && super.anInt834 <= 205) {
					local14 = 0;
				}
				@Pc(45) int local45;
				@Pc(48) int local48;
				@Pc(124) int local124;
				if (this.aBoolean223) {
					if (local14 != 1) {
						local45 = super.anInt827;
						local48 = super.anInt828;
						if (this.anInt895 == 0) {
							local45 -= 4;
							local48 -= 4;
						}
						if (this.anInt895 == 1) {
							local45 -= 553;
							local48 -= 205;
						}
						if (this.anInt895 == 2) {
							local45 -= 17;
							local48 -= 357;
						}
						if (local45 < this.anInt896 - 10 || local45 > this.anInt896 + this.anInt898 + 10 || local48 < this.anInt897 - 10 || local48 > this.anInt897 + this.anInt899 + 10) {
							this.aBoolean223 = false;
							if (this.anInt895 == 1) {
								this.aBoolean244 = true;
							}
							if (this.anInt895 == 2) {
								this.aBoolean253 = true;
							}
						}
					}
					if (local14 == 1) {
						local45 = this.anInt896;
						local48 = this.anInt897;
						local124 = this.anInt898;
						@Pc(127) int local127 = super.anInt833;
						@Pc(130) int local130 = super.anInt834;
						if (this.anInt895 == 0) {
							local127 -= 4;
							local130 -= 4;
						}
						if (this.anInt895 == 1) {
							local127 -= 553;
							local130 -= 205;
						}
						if (this.anInt895 == 2) {
							local127 -= 17;
							local130 -= 357;
						}
						@Pc(149) int local149 = -1;
						for (@Pc(151) int local151 = 0; local151 < this.anInt985; local151++) {
							@Pc(166) int local166 = local48 + (this.anInt985 - 1 - local151) * 15 + 31;
							if (local127 > local45 && local127 < local45 + local124 && local130 > local166 - 13 && local130 < local166 + 3) {
								local149 = local151;
							}
						}
						if (local149 != -1) {
							this.method633(local149);
						}
						this.aBoolean223 = false;
						if (this.anInt895 == 1) {
							this.aBoolean244 = true;
						}
						if (this.anInt895 == 2) {
							this.aBoolean253 = true;
							return;
						}
					}
				} else {
					if (local14 == 1 && this.anInt985 > 0) {
						local45 = this.anIntArray252[this.anInt985 - 1];
						if (local45 == 632 || local45 == 78 || local45 == 867 || local45 == 431 || local45 == 53 || local45 == 74 || local45 == 454 || local45 == 539 || local45 == 493 || local45 == 847 || local45 == 447 || local45 == 1125) {
							local48 = this.anIntArray250[this.anInt985 - 1];
							local124 = this.anIntArray251[this.anInt985 - 1];
							@Pc(286) Class10 local286 = Class10.aClass10Array1[local124];
							if (local286.aBoolean72 || local286.aBoolean68) {
								this.aBoolean258 = false;
								this.anInt912 = 0;
								this.anInt963 = local124;
								this.anInt964 = local48;
								this.anInt965 = 2;
								this.anInt966 = super.anInt833;
								this.anInt967 = super.anInt834;
								if (Class10.aClass10Array1[local124].anInt326 == this.anInt851) {
									this.anInt965 = 1;
								}
								if (Class10.aClass10Array1[local124].anInt326 == this.anInt1044) {
									this.anInt965 = 3;
								}
								return;
							}
						}
					}
					if (local14 == 1 && (this.anInt1032 == 1 || this.method581(this.anInt985 - 1)) && this.anInt985 > 2) {
						local14 = 2;
					}
					if (local14 == 1 && this.anInt985 > 0) {
						this.method633(this.anInt985 - 1);
					}
					if (local14 != 2 || this.anInt985 <= 0) {
						return;
					}
					this.method680();
				}
			}
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("37524, " + 4 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)V")
	private void method585(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			signlink.anInt1061 = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("51005, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method586() {
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
				this.anInt909 = -1;
				this.aClass21_11.method250();
				this.aClass21_10.method250();
				Class1_Sub1_Sub1_Sub3.method390(anInt847);
				this.method587();
				this.aClass27_1.method317(619);
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass12Array1[local22].method164();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class8 local77 = new Class8(this.aByteArrayArrayArray8, -60, 104, 104, this.anIntArrayArrayArray8);
				local43 = this.aByteArrayArray4.length;
				this.aClass1_Sub1_Sub3_9.method257(0);
				@Pc(256) int local256;
				@Pc(244) int local244;
				if (!this.aBoolean248) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray266[local91] >> 8) * 64 - this.anInt936;
						local117 = (this.anIntArray266[local91] & 0xFF) * 64 - this.anInt937;
						local122 = this.aByteArrayArray4[local91];
						if (local122 != null) {
							local77.method50(local122, local117, local105, (this.anInt958 - 6) * 8, (this.anInt959 - 6) * 8, this.aClass12Array1);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray266[local105] >> 8) * 64 - this.anInt936;
						local176 = (this.anIntArray266[local105] & 0xFF) * 64 - this.anInt937;
						@Pc(181) byte[] local181 = this.aByteArrayArray4[local105];
						if (local181 == null && this.anInt959 < 800) {
							local77.method44(local176, 64, 64, local117);
						}
					}
					anInt970++;
					if (anInt970 > 160) {
						anInt970 = 0;
						this.aClass1_Sub1_Sub3_9.method257(238);
						this.aClass1_Sub1_Sub3_9.method258(96);
					}
					this.aClass1_Sub1_Sub3_9.method257(0);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray5[local117];
						if (local122 != null) {
							local244 = (this.anIntArray266[local117] >> 8) * 64 - this.anInt936;
							local256 = (this.anIntArray266[local117] & 0xFF) * 64 - this.anInt937;
							local77.method60(local244, this.aClass12Array1, local256, this.aClass27_1, local122);
						}
					}
				}
				if (this.aBoolean248) {
					local91 = 0;
					label254: while (true) {
						@Pc(315) int local315;
						@Pc(321) int local321;
						@Pc(331) int local331;
						@Pc(333) int local333;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray7[0][local105][local117];
									if (local176 == -1) {
										local77.method44(local117 * 8, 8, 8, local105 * 8);
									}
								}
							}
							this.aClass1_Sub1_Sub3_9.method257(0);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label254;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local244 = 0; local244 < 13; local244++) {
										local256 = this.anIntArrayArrayArray7[local117][local176][local244];
										if (local256 != -1) {
											local315 = local256 >> 24 & 0x3;
											local321 = local256 >> 1 & 0x3;
											local331 = local256 >> 14 & 0x3FF;
											local333 = local256 >> 3 & 0x7FF;
											@Pc(496) int local496 = (local331 / 8 << 8) + local333 / 8;
											for (@Pc(498) int local498 = 0; local498 < this.anIntArray266.length; local498++) {
												if (this.anIntArray266[local498] == local496 && this.aByteArrayArray5[local498] != null) {
													local77.method53(this.aClass12Array1, this.aClass27_1, local315, local176 * 8, (local333 & 0x7) * 8, local117, this.aByteArrayArray5[local498], (local331 & 0x7) * 8, local321, local244 * 8);
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
								local176 = this.anIntArrayArrayArray7[local91][local105][local117];
								if (local176 != -1) {
									local244 = local176 >> 24 & 0x3;
									local256 = local176 >> 1 & 0x3;
									local315 = local176 >> 14 & 0x3FF;
									local321 = local176 >> 3 & 0x7FF;
									local331 = (local315 / 8 << 8) + local321 / 8;
									for (local333 = 0; local333 < this.anIntArray266.length; local333++) {
										if (this.anIntArray266[local333] == local331 && this.aByteArrayArray4[local333] != null) {
											local77.method49(local244, local256, this.aClass12Array1, local105 * 8, (local315 & 0x7) * 8, this.aByteArrayArray4[local333], (local321 & 0x7) * 8, local91, local117 * 8);
											break;
										}
									}
								}
							}
						}
						local91++;
					}
				}
				this.aClass1_Sub1_Sub3_9.method257(0);
				local77.method41(this.aClass12Array1, this.aClass27_1);
				this.aClass17_26.method218();
				this.aClass1_Sub1_Sub3_9.method257(0);
				local91 = Class8.anInt55;
				if (local91 > this.anInt881) {
					local91 = this.anInt881;
				}
				if (local91 < this.anInt881 - 1) {
					local91 = this.anInt881 - 1;
				}
				if (aBoolean228) {
					this.aClass27_1.method318(Class8.anInt55);
				} else {
					this.aClass27_1.method318(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method589(local105, local117);
					}
				}
				anInt948++;
				if (anInt948 > 98) {
					anInt948 = 0;
					this.aClass1_Sub1_Sub3_9.method257(150);
				}
				this.method627();
			} catch (@Pc(655) Exception local655) {
			}
			Class46.aClass13_9.method178();
			this.aBoolean246 &= true;
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub1_Sub3_9.method257(210);
				this.aClass1_Sub1_Sub3_9.method262(1057001181);
			}
			if (aBoolean228 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass14_Sub1_1.method187(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass14_Sub1_1.method191(local35);
					if ((local39 & 0x79) == 0) {
						Class1_Sub1_Sub2_Sub6.method533(local35);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub1_Sub3.method391();
			this.aClass14_Sub1_1.method198();
			local22 = (this.anInt958 - 6) / 8 - 1;
			local35 = (this.anInt958 + 6) / 8 + 1;
			local39 = (this.anInt959 - 6) / 8 - 1;
			local43 = (this.anInt959 + 6) / 8 + 1;
			if (this.aBoolean241) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass14_Sub1_1.method194(0, local105, local91);
						if (local117 != -1) {
							this.aClass14_Sub1_1.method192(local117, 3);
						}
						local176 = this.aClass14_Sub1_1.method194(1, local105, local91);
						if (local176 != -1) {
							this.aClass14_Sub1_1.method192(local176, 3);
						}
					}
				}
			}
		} catch (@Pc(825) RuntimeException local825) {
			signlink.reporterror("81650, " + true + ", " + local825.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method587() {
		try {
			Class46.aClass13_9.method178();
			Class46.aClass13_8.method178();
			Class6.aClass13_1.method178();
			Class9.aClass13_3.method178();
			Class9.aClass13_2.method178();
			Class1_Sub1_Sub2_Sub1_Sub2.aClass13_4.method178();
			Class25.aClass13_7.method178();
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("63488, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method588(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub1_Sub1_16.anIntArray39;
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
						this.aClass27_1.method352(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass27_1.method352(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub1_Sub1_16.method98();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method614(local142, local34, local146, local36, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method614(local142, local34, local146, local36, arg0 + 1);
					}
				}
			}
			this.aClass17_26.method218();
			this.aBoolean246 &= true;
			this.anInt960 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass27_1.method346(this.anInt881, local146, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class46.method515(local230).anInt748;
						if (local242 >= 0) {
							@Pc(246) int local246 = local146;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass12Array1[this.anInt881].anIntArrayArray3;
								for (@Pc(282) int local282 = 0; local282 < 10; local282++) {
									@Pc(289) int local289 = (int) (Math.random() * 4.0D);
									if (local289 == 0 && local246 > 0 && local246 > local146 - 3 && (local280[local246 - 1][local248] & 0x1280108) == 0) {
										local246--;
									}
									if (local289 == 1 && local246 < 103 && local246 < local146 + 3 && (local280[local246 + 1][local248] & 0x1280180) == 0) {
										local246++;
									}
									if (local289 == 2 && local248 > 0 && local248 > local220 - 3 && (local280[local246][local248 - 1] & 0x1280102) == 0) {
										local248--;
									}
									if (local289 == 3 && local248 < 103 && local248 < local220 + 3 && (local280[local246][local248 + 1] & 0x1280120) == 0) {
										local248++;
									}
								}
							}
							this.aClass1_Sub1_Sub1_Sub1Array7[this.anInt960] = this.aClass1_Sub1_Sub1_Sub1Array5[local242];
							this.anIntArray247[this.anInt960] = local246;
							this.anIntArray248[this.anInt960] = local248;
							this.anInt960++;
						}
					}
				}
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("35531, " + true + ", " + arg0 + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class21 local9 = this.aClass21ArrayArrayArray1[this.anInt881][arg0][arg1];
		if (local9 == null) {
			this.aClass27_1.method338(this.anInt881, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub2_Sub2 local23 = null;
		@Pc(27) Class1_Sub1_Sub2_Sub2 local27;
		for (local27 = (Class1_Sub1_Sub2_Sub2) local9.method246(); local27 != null; local27 = (Class1_Sub1_Sub2_Sub2) local9.method248()) {
			@Pc(32) Class9 local32 = Class9.method118(local27.anInt390);
			@Pc(35) int local35 = local32.anInt191;
			if (local32.aBoolean47) {
				local35 *= local27.anInt391 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method244(local23);
		@Pc(65) Class1_Sub1_Sub2_Sub2 local65 = null;
		@Pc(67) Class1_Sub1_Sub2_Sub2 local67 = null;
		for (local27 = (Class1_Sub1_Sub2_Sub2) local9.method246(); local27 != null; local27 = (Class1_Sub1_Sub2_Sub2) local9.method248()) {
			if (local27.anInt390 != local23.anInt390 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt390 != local23.anInt390 && local27.anInt390 != local65.anInt390 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass27_1.method324(arg0, local110, local65, this.method606(this.anInt881, arg1 * 128 + 64, arg0 * 128 + 64), local67, local23, this.anInt881, arg1);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method590(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt840; local1++) {
				@Pc(11) Class1_Sub1_Sub2_Sub1_Sub1 local11 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray215[local1]];
				@Pc(20) int local20 = (this.anIntArray215[local1] << 14) + 536870912;
				if (local11 != null && local11.method132(aBoolean254) && local11.aClass6_1.aBoolean15 == arg0) {
					@Pc(36) int local36 = local11.anInt268 >> 7;
					@Pc(41) int local41 = local11.anInt269 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt259 == 1 && (local11.anInt268 & 0x7F) == 64 && (local11.anInt269 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local36][local41] == this.anInt1040) {
								continue;
							}
							this.anIntArrayArray24[local36][local41] = this.anInt1040;
						}
						if (!local11.aClass6_1.aBoolean13) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass27_1.method328(this.anInt881, local11.anInt270, (byte) 6, this.method606(this.anInt881, local11.anInt269, local11.anInt268), local20, local11.anInt269, (local11.anInt259 - 1) * 64 + 60, local11.anInt268, local11, local11.aBoolean56);
					}
				}
			}
			if (arg1 == -30815) {
				;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("19775, " + arg0 + ", " + arg1 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Z")
	private boolean method591() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("23302, " + 11456 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method592(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!DUCMKFAY;IIII)V")
	private void method593(@OriginalArg(0) int arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1.anInt337 == 0 && arg1.anIntArray56 != null && !arg1.aBoolean73 && (arg2 >= arg0 && arg4 >= arg3 && arg2 <= arg0 + arg1.anInt318 && arg4 <= arg3 + arg1.anInt340)) {
				@Pc(34) int local34 = arg1.anIntArray56.length;
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg1.anIntArray57[local42] + arg0;
					@Pc(60) int local60 = arg1.anIntArray62[local42] + arg3 - arg5;
					@Pc(67) Class10 local67 = Class10.aClass10Array1[arg1.anIntArray56[local42]];
					@Pc(72) int local72 = local51 + local67.anInt338;
					@Pc(77) int local77 = local60 + local67.anInt339;
					if ((local67.anInt321 >= 0 || local67.anInt315 != 0) && arg2 >= local72 && arg4 >= local77 && arg2 < local72 + local67.anInt318 && arg4 < local77 + local67.anInt340) {
						if (local67.anInt321 >= 0) {
							this.anInt865 = local67.anInt321;
						} else {
							this.anInt865 = local67.anInt331;
						}
					}
					if (local67.anInt337 == 0) {
						this.method593(local72, local67, arg2, local77, arg4, local67.anInt319);
						if (local67.anInt336 > local67.anInt340) {
							this.method629(local72 + local67.anInt318, local67.anInt340, arg2, arg4, local67, local77, true, local67.anInt336);
						}
					} else {
						if (local67.anInt316 == 1 && arg2 >= local72 && arg4 >= local77 && arg2 < local72 + local67.anInt318 && arg4 < local77 + local67.anInt340) {
							@Pc(174) boolean local174 = false;
							if (local67.anInt314 != 0) {
								local174 = this.method667(local67);
							}
							if (!local174) {
								this.aStringArray13[this.anInt985] = local67.aString8;
								this.anIntArray252[this.anInt985] = 315;
								this.anIntArray251[this.anInt985] = local67.anInt331;
								this.anInt985++;
							}
						}
						if (local67.anInt316 == 2 && this.anInt988 == 0 && arg2 >= local72 && arg4 >= local77 && arg2 < local72 + local67.anInt318 && arg4 < local77 + local67.anInt340) {
							@Pc(238) String local238 = local67.aString9;
							if (local238.indexOf(" ") != -1) {
								local238 = local238.substring(0, local238.indexOf(" "));
							}
							this.aStringArray13[this.anInt985] = local238 + " @gre@" + local67.aString7;
							this.anIntArray252[this.anInt985] = 626;
							this.anIntArray251[this.anInt985] = local67.anInt331;
							this.anInt985++;
						}
						if (local67.anInt316 == 3 && arg2 >= local72 && arg4 >= local77 && arg2 < local72 + local67.anInt318 && arg4 < local77 + local67.anInt340) {
							this.aStringArray13[this.anInt985] = "Close";
							this.anIntArray252[this.anInt985] = 200;
							this.anIntArray251[this.anInt985] = local67.anInt331;
							this.anInt985++;
						}
						if (local67.anInt316 == 4 && arg2 >= local72 && arg4 >= local77 && arg2 < local72 + local67.anInt318 && arg4 < local77 + local67.anInt340) {
							this.aStringArray13[this.anInt985] = local67.aString8;
							this.anIntArray252[this.anInt985] = 169;
							this.anIntArray251[this.anInt985] = local67.anInt331;
							this.anInt985++;
						}
						if (local67.anInt316 == 5 && arg2 >= local72 && arg4 >= local77 && arg2 < local72 + local67.anInt318 && arg4 < local77 + local67.anInt340) {
							this.aStringArray13[this.anInt985] = local67.aString8;
							this.anIntArray252[this.anInt985] = 646;
							this.anIntArray251[this.anInt985] = local67.anInt331;
							this.anInt985++;
						}
						if (local67.anInt316 == 6 && !this.aBoolean242 && arg2 >= local72 && arg4 >= local77 && arg2 < local72 + local67.anInt318 && arg4 < local77 + local67.anInt340) {
							this.aStringArray13[this.anInt985] = local67.aString8;
							this.anIntArray252[this.anInt985] = 679;
							this.anIntArray251[this.anInt985] = local67.anInt331;
							this.anInt985++;
						}
						if (local67.anInt337 == 2) {
							@Pc(486) int local486 = 0;
							for (@Pc(488) int local488 = 0; local488 < local67.anInt340; local488++) {
								for (@Pc(492) int local492 = 0; local492 < local67.anInt318; local492++) {
									@Pc(503) int local503 = local72 + local492 * (local67.anInt322 + 32);
									@Pc(512) int local512 = local77 + local488 * (local67.anInt329 + 32);
									if (local486 < 20) {
										local503 += local67.anIntArray55[local486];
										local512 += local67.anIntArray59[local486];
									}
									if (arg2 >= local503 && arg4 >= local512 && arg2 < local503 + 32 && arg4 < local512 + 32) {
										this.anInt956 = local486;
										this.anInt957 = local67.anInt331;
										if (local67.anIntArray61[local486] > 0) {
											@Pc(565) Class9 local565 = Class9.method118(local67.anIntArray61[local486] - 1);
											if (this.anInt1047 == 1 && local67.aBoolean70) {
												if (local67.anInt331 != this.anInt1049 || local486 != this.anInt1048) {
													this.aStringArray13[this.anInt985] = "Use " + this.aString30 + " with @lre@" + local565.aString4;
													this.anIntArray252[this.anInt985] = 870;
													this.anIntArray253[this.anInt985] = local565.anInt192;
													this.anIntArray250[this.anInt985] = local486;
													this.anIntArray251[this.anInt985] = local67.anInt331;
													this.anInt985++;
												}
											} else if (this.anInt988 != 1 || !local67.aBoolean70) {
												@Pc(702) int local702;
												if (local67.aBoolean70) {
													for (local702 = 4; local702 >= 3; local702--) {
														if (local565.aStringArray3 != null && local565.aStringArray3[local702] != null) {
															this.aStringArray13[this.anInt985] = local565.aStringArray3[local702] + " @lre@" + local565.aString4;
															if (local702 == 3) {
																this.anIntArray252[this.anInt985] = 493;
															}
															if (local702 == 4) {
																this.anIntArray252[this.anInt985] = 847;
															}
															this.anIntArray253[this.anInt985] = local565.anInt192;
															this.anIntArray250[this.anInt985] = local486;
															this.anIntArray251[this.anInt985] = local67.anInt331;
															this.anInt985++;
														} else if (local702 == 4) {
															this.aStringArray13[this.anInt985] = "Drop @lre@" + local565.aString4;
															this.anIntArray252[this.anInt985] = 847;
															this.anIntArray253[this.anInt985] = local565.anInt192;
															this.anIntArray250[this.anInt985] = local486;
															this.anIntArray251[this.anInt985] = local67.anInt331;
															this.anInt985++;
														}
													}
												}
												if (local67.aBoolean69) {
													this.aStringArray13[this.anInt985] = "Use @lre@" + local565.aString4;
													this.anIntArray252[this.anInt985] = 447;
													this.anIntArray253[this.anInt985] = local565.anInt192;
													this.anIntArray250[this.anInt985] = local486;
													this.anIntArray251[this.anInt985] = local67.anInt331;
													this.anInt985++;
												}
												if (local67.aBoolean70 && local565.aStringArray3 != null) {
													for (local702 = 2; local702 >= 0; local702--) {
														if (local565.aStringArray3[local702] != null) {
															this.aStringArray13[this.anInt985] = local565.aStringArray3[local702] + " @lre@" + local565.aString4;
															if (local702 == 0) {
																this.anIntArray252[this.anInt985] = 74;
															}
															if (local702 == 1) {
																this.anIntArray252[this.anInt985] = 454;
															}
															if (local702 == 2) {
																this.anIntArray252[this.anInt985] = 539;
															}
															this.anIntArray253[this.anInt985] = local565.anInt192;
															this.anIntArray250[this.anInt985] = local486;
															this.anIntArray251[this.anInt985] = local67.anInt331;
															this.anInt985++;
														}
													}
												}
												if (local67.aStringArray4 != null) {
													for (local702 = 4; local702 >= 0; local702--) {
														if (local67.aStringArray4[local702] != null) {
															this.aStringArray13[this.anInt985] = local67.aStringArray4[local702] + " @lre@" + local565.aString4;
															if (local702 == 0) {
																this.anIntArray252[this.anInt985] = 632;
															}
															if (local702 == 1) {
																this.anIntArray252[this.anInt985] = 78;
															}
															if (local702 == 2) {
																this.anIntArray252[this.anInt985] = 867;
															}
															if (local702 == 3) {
																this.anIntArray252[this.anInt985] = 431;
															}
															if (local702 == 4) {
																this.anIntArray252[this.anInt985] = 53;
															}
															this.anIntArray253[this.anInt985] = local565.anInt192;
															this.anIntArray250[this.anInt985] = local486;
															this.anIntArray251[this.anInt985] = local67.anInt331;
															this.anInt985++;
														}
													}
												}
												this.aStringArray13[this.anInt985] = "Examine @lre@" + local565.aString4;
												this.anIntArray252[this.anInt985] = 1125;
												this.anIntArray253[this.anInt985] = local565.anInt192;
												this.anIntArray250[this.anInt985] = local486;
												this.anIntArray251[this.anInt985] = local67.anInt331;
												this.anInt985++;
											} else if ((this.anInt990 & 0x10) == 16) {
												this.aStringArray13[this.anInt985] = this.aString23 + " @lre@" + local565.aString4;
												this.anIntArray252[this.anInt985] = 543;
												this.anIntArray253[this.anInt985] = local565.anInt192;
												this.anIntArray250[this.anInt985] = local486;
												this.anIntArray251[this.anInt985] = local67.anInt331;
												this.anInt985++;
											}
										}
									}
									local486++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1132) RuntimeException local1132) {
			signlink.reporterror("38948, " + arg0 + ", " + 13037 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub1_Sub2_8.method155(arg3, arg2);
			this.aClass1_Sub1_Sub1_Sub2_9.method155(arg3, arg2 + arg0 - 16);
			Class1_Sub1_Sub1.method492(arg0 - 32, arg2 + 16, arg3, this.anInt919, 16);
			@Pc(35) int local35 = (arg0 - 32) * arg0 / arg4;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg0 - local35 - 32) * arg1 / (arg4 - arg0);
			Class1_Sub1_Sub1.method492(local35, arg2 + local52 + 16, arg3, this.anInt954, 16);
			Class1_Sub1_Sub1.method497(arg2 + local52 + 16, this.anInt875, local35, arg3, this.anInt987);
			Class1_Sub1_Sub1.method497(arg2 + local52 + 16, this.anInt875, local35, arg3 + 1, this.anInt987);
			Class1_Sub1_Sub1.method495(arg2 + local52 + 16, this.anInt875, 16, arg3);
			Class1_Sub1_Sub1.method495(arg2 + local52 + 17, this.anInt875, 16, arg3);
			Class1_Sub1_Sub1.method497(arg2 + local52 + 16, this.anInt884, local35, arg3 + 15, this.anInt987);
			Class1_Sub1_Sub1.method497(arg2 + local52 + 17, this.anInt884, local35 - 1, arg3 + 14, this.anInt987);
			Class1_Sub1_Sub1.method495(arg2 + local52 + local35 + 15, this.anInt884, 16, arg3);
			Class1_Sub1_Sub1.method495(arg2 + local52 + local35 + 14, this.anInt884, 15, arg3 + 1);
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("99728, " + 519 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MBMGIXGO;II)V")
	private void method595(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt842 = 0;
			this.anInt869 = 0;
			this.method703(arg0, arg1);
			this.method610(arg1, arg0);
			this.method650(arg1, arg0);
			@Pc(38) int local38;
			for (@Pc(31) int local31 = 0; local31 < this.anInt842; local31++) {
				local38 = this.anIntArray216[local31];
				if (this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local38].anInt256 != anInt995) {
					this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local38].aClass6_1 = null;
					this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local38] = null;
				}
			}
			if (arg0.anInt468 != arg1) {
				signlink.reporterror(this.aString25 + " size mismatch in getnpcpos - pos:" + arg0.anInt468 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local38 = 0; local38 < this.anInt840; local38++) {
				if (this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray215[local38]] == null) {
					signlink.reporterror(this.aString25 + " null entry in npc list - pos:" + local38 + " size:" + this.anInt840);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("78640, " + arg0 + ", " + arg1 + ", " + 973 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method596() {
		try {
			this.aBoolean246 &= true;
			if (super.anInt832 == 1) {
				if (super.anInt833 >= 6 && super.anInt833 <= 106 && super.anInt834 >= 467 && super.anInt834 <= 499) {
					this.anInt1051 = (this.anInt1051 + 1) % 4;
					this.aBoolean257 = true;
					this.aBoolean253 = true;
					this.aClass1_Sub1_Sub3_9.method257(95);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt1051);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt846);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt1029);
				}
				if (super.anInt833 >= 135 && super.anInt833 <= 235 && super.anInt834 >= 467 && super.anInt834 <= 499) {
					this.anInt846 = (this.anInt846 + 1) % 3;
					this.aBoolean257 = true;
					this.aBoolean253 = true;
					this.aClass1_Sub1_Sub3_9.method257(95);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt1051);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt846);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt1029);
				}
				if (super.anInt833 >= 273 && super.anInt833 <= 373 && super.anInt834 >= 467 && super.anInt834 <= 499) {
					this.anInt1029 = (this.anInt1029 + 1) % 3;
					this.aBoolean257 = true;
					this.aBoolean253 = true;
					this.aClass1_Sub1_Sub3_9.method257(95);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt1051);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt846);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt1029);
				}
				@Pc(192) int local192;
				if (super.anInt833 >= 412 && super.anInt833 <= 512 && super.anInt834 >= 467 && super.anInt834 <= 499) {
					if (this.anInt851 == -1) {
						this.method711();
						this.aString18 = "";
						this.aBoolean247 = false;
						for (local192 = 0; local192 < Class10.aClass10Array1.length; local192++) {
							if (Class10.aClass10Array1[local192] != null && Class10.aClass10Array1[local192].anInt314 == 600) {
								this.anInt1001 = this.anInt851 = Class10.aClass10Array1[local192].anInt326;
								break;
							}
						}
					} else {
						this.method641("Please close the interface you have open before using 'report abuse'", 0, "", this.aBoolean231);
					}
				}
				anInt892++;
				if (anInt892 > 1386) {
					anInt892 = 0;
					this.aClass1_Sub1_Sub3_9.method257(165);
					this.aClass1_Sub1_Sub3_9.method258(0);
					local192 = this.aClass1_Sub1_Sub3_9.anInt468;
					this.aClass1_Sub1_Sub3_9.method258(139);
					this.aClass1_Sub1_Sub3_9.method258(150);
					this.aClass1_Sub1_Sub3_9.method259(32131);
					this.aClass1_Sub1_Sub3_9.method258((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_9.method259(3250);
					this.aClass1_Sub1_Sub3_9.method258(177);
					this.aClass1_Sub1_Sub3_9.method259(24859);
					this.aClass1_Sub1_Sub3_9.method258(119);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_9.method259(47234);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_9.method258(21);
					}
					this.aClass1_Sub1_Sub3_9.method267(this.aClass1_Sub1_Sub3_9.anInt468 - local192);
					return;
				}
			}
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("30699, " + true + ", " + local315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ZI)V")
	private void method597(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class42.aClass42Array1[arg0].anInt697;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray231[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class1_Sub1_Sub1_Sub3.method396(0.9D, aByte33);
					}
					if (local12 == 2) {
						Class1_Sub1_Sub1_Sub3.method396(0.8D, aByte33);
					}
					if (local12 == 3) {
						Class1_Sub1_Sub1_Sub3.method396(0.7D, aByte33);
					}
					if (local12 == 4) {
						Class1_Sub1_Sub1_Sub3.method396(0.6D, aByte33);
					}
					Class9.aClass13_2.method178();
					this.aBoolean260 = true;
				}
				if (local4 == 3) {
					@Pc(57) boolean local57 = this.aBoolean243;
					if (local12 == 0) {
						this.method687(this.aBoolean243, 0);
						this.aBoolean243 = true;
					}
					if (local12 == 1) {
						this.method687(this.aBoolean243, -400);
						this.aBoolean243 = true;
					}
					if (local12 == 2) {
						this.method687(this.aBoolean243, -800);
						this.aBoolean243 = true;
					}
					if (local12 == 3) {
						this.method687(this.aBoolean243, -1200);
						this.aBoolean243 = true;
					}
					if (local12 == 4) {
						this.aBoolean243 = false;
					}
					if (this.aBoolean243 != local57 && !aBoolean228) {
						if (this.aBoolean243) {
							this.anInt1021 = this.anInt900;
							this.aBoolean255 = true;
							this.aClass14_Sub1_1.method190(2, this.anInt1021);
						} else {
							this.method579();
						}
						this.anInt1035 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean220 = true;
						this.method675((byte) 2, 0);
					}
					if (local12 == 1) {
						this.aBoolean220 = true;
						this.method675((byte) 2, -400);
					}
					if (local12 == 2) {
						this.aBoolean220 = true;
						this.method675((byte) 2, -800);
					}
					if (local12 == 3) {
						this.aBoolean220 = true;
						this.method675((byte) 2, -1200);
					}
					if (local12 == 4) {
						this.aBoolean220 = false;
					}
				}
				if (local4 == 5) {
					this.anInt1032 = local12;
				}
				if (local4 == 6) {
					this.anInt1030 = local12;
				}
				if (local4 == 8) {
					this.anInt1009 = local12;
					this.aBoolean253 = true;
				}
				if (local4 == 9) {
					this.anInt876 = local12;
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("64621, " + false + ", " + arg0 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method598(@OriginalArg(0) int arg0) {
		try {
			this.anInt906 = 0;
			@Pc(91) int local91;
			@Pc(71) int local71;
			for (@Pc(6) int local6 = -1; local6 < this.anInt868 + this.anInt840; local6++) {
				@Pc(13) Class1_Sub1_Sub2_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub2_Sub1_Sub2_1;
				} else if (local6 < this.anInt868) {
					local13 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray223[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray215[local6 - this.anInt868]];
				}
				if (local13 != null && local13.method132(aBoolean254)) {
					@Pc(54) Class6 local54;
					if (local13 instanceof Class1_Sub1_Sub2_Sub1_Sub1) {
						local54 = ((Class1_Sub1_Sub2_Sub1_Sub1) local13).aClass6_1;
						if (local54.anIntArray6 != null) {
							local54 = local54.method31(this.anInt860);
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt868) {
						local54 = ((Class1_Sub1_Sub2_Sub1_Sub1) local13).aClass6_1;
						if (local54.anInt37 >= 0 && local54.anInt37 < this.aClass1_Sub1_Sub1_Sub1Array6.length) {
							this.method691(local13, local13.anInt230 + 15);
							if (this.anInt904 > -1) {
								this.aClass1_Sub1_Sub1_Sub1Array6[local54.anInt37].method103(this.anInt904 - 12, this.anInt905 - 30);
							}
						}
						if (this.anInt850 == 1 && this.anInt1018 == this.anIntArray215[local6 - this.anInt868] && anInt995 % 20 < 10) {
							this.method691(local13, local13.anInt230 + 15);
							if (this.anInt904 > -1) {
								this.aClass1_Sub1_Sub1_Sub1Array6[2].method103(this.anInt904 - 12, this.anInt905 - 28);
							}
						}
					} else {
						local71 = 30;
						@Pc(74) Class1_Sub1_Sub2_Sub1_Sub2 local74 = (Class1_Sub1_Sub2_Sub1_Sub2) local13;
						if (local74.anInt278 != 0) {
							this.method691(local13, local13.anInt230 + 15);
							if (this.anInt904 > -1) {
								for (local91 = 0; local91 < 8; local91++) {
									if ((local74.anInt278 & 0x1 << local91) != 0) {
										this.aClass1_Sub1_Sub1_Sub1Array6[local91].method103(this.anInt904 - 12, this.anInt905 - local71);
										local71 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt850 == 10 && this.anInt885 == this.anIntArray223[local6]) {
							this.method691(local13, local13.anInt230 + 15);
							if (this.anInt904 > -1) {
								this.aClass1_Sub1_Sub1_Sub1Array6[7].method103(this.anInt904 - 12, this.anInt905 - local71);
							}
						}
					}
					if (local13.aString5 != null && (local6 >= this.anInt868 || this.anInt1051 == 0 || this.anInt1051 == 3 || this.anInt1051 == 1 && this.method673(((Class1_Sub1_Sub2_Sub1_Sub2) local13).aString6))) {
						this.method691(local13, local13.anInt230);
						if (this.anInt904 > -1 && this.anInt906 < this.anInt907) {
							this.anIntArray235[this.anInt906] = this.aClass1_Sub1_Sub1_Sub4_4.method503(local13.aString5) / 2;
							this.anIntArray234[this.anInt906] = this.aClass1_Sub1_Sub1_Sub4_4.anInt742;
							this.anIntArray232[this.anInt906] = this.anInt904;
							this.anIntArray233[this.anInt906] = this.anInt905;
							this.anIntArray236[this.anInt906] = local13.anInt235;
							this.anIntArray237[this.anInt906] = local13.anInt250;
							this.anIntArray238[this.anInt906] = local13.anInt254;
							this.aStringArray10[this.anInt906++] = local13.aString5;
							if (this.anInt1030 == 0 && local13.anInt250 >= 1 && local13.anInt250 <= 3) {
								this.anIntArray234[this.anInt906] += 10;
								this.anIntArray233[this.anInt906] += 5;
							}
							if (this.anInt1030 == 0 && local13.anInt250 == 4) {
								this.anIntArray235[this.anInt906] = 60;
							}
							if (this.anInt1030 == 0 && local13.anInt250 == 5) {
								this.anIntArray234[this.anInt906] += 5;
							}
						}
					}
					if (local13.anInt251 > anInt995) {
						this.method691(local13, local13.anInt230 + 15);
						if (this.anInt904 > -1) {
							local71 = local13.anInt252 * 30 / local13.anInt253;
							if (local71 > 30) {
								local71 = 30;
							}
							Class1_Sub1_Sub1.method492(5, this.anInt905 - 3, this.anInt904 - 15, 65280, local71);
							Class1_Sub1_Sub1.method492(5, this.anInt905 - 3, this.anInt904 - 15 + local71, 16711680, 30 - local71);
						}
					}
					for (local71 = 0; local71 < 4; local71++) {
						if (local13.anIntArray49[local71] > anInt995) {
							this.method691(local13, local13.anInt230 / 2);
							if (this.anInt904 > -1) {
								if (local71 == 1) {
									this.anInt905 -= 20;
								}
								if (local71 == 2) {
									this.anInt904 -= 15;
									this.anInt905 -= 10;
								}
								if (local71 == 3) {
									this.anInt904 += 15;
									this.anInt905 -= 10;
								}
								this.aClass1_Sub1_Sub1_Sub1Array4[local13.anIntArray48[local71]].method103(this.anInt904 - 12, this.anInt905 - 12);
								this.aClass1_Sub1_Sub1_Sub4_2.method500(0, String.valueOf(local13.anIntArray47[local71]), this.anInt905 + 4, this.anInt904);
								this.aClass1_Sub1_Sub1_Sub4_2.method500(16777215, String.valueOf(local13.anIntArray47[local71]), this.anInt905 + 3, this.anInt904 - 1);
							}
						}
					}
				}
			}
			if (arg0 != 0) {
				this.method570();
			}
			for (@Pc(600) int local600 = 0; local600 < this.anInt906; local600++) {
				local71 = this.anIntArray232[local600];
				@Pc(612) int local612 = this.anIntArray233[local600];
				local91 = this.anIntArray235[local600];
				@Pc(622) int local622 = this.anIntArray234[local600];
				@Pc(624) boolean local624 = true;
				while (local624) {
					local624 = false;
					for (@Pc(630) int local630 = 0; local630 < local600; local630++) {
						if (local612 + 2 > this.anIntArray233[local630] - this.anIntArray234[local630] && local612 - local622 < this.anIntArray233[local630] + 2 && local71 - local91 < this.anIntArray232[local630] + this.anIntArray235[local630] && local71 + local91 > this.anIntArray232[local630] - this.anIntArray235[local630] && this.anIntArray233[local630] - this.anIntArray234[local630] < local612) {
							local612 = this.anIntArray233[local630] - this.anIntArray234[local630];
							local624 = true;
						}
					}
				}
				this.anInt904 = this.anIntArray232[local600];
				this.anInt905 = this.anIntArray233[local600] = local612;
				@Pc(729) String local729 = this.aStringArray10[local600];
				if (this.anInt1030 == 0) {
					@Pc(734) int local734 = 16776960;
					if (this.anIntArray236[local600] < 6) {
						local734 = this.anIntArray228[this.anIntArray236[local600]];
					}
					if (this.anIntArray236[local600] == 6) {
						local734 = this.anInt1040 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray236[local600] == 7) {
						local734 = this.anInt1040 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray236[local600] == 8) {
						local734 = this.anInt1040 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(809) int local809;
					if (this.anIntArray236[local600] == 9) {
						local809 = 150 - this.anIntArray238[local600];
						if (local809 < 50) {
							local734 = local809 * 1280 + 16711680;
						} else if (local809 < 100) {
							local734 = 16776960 - (local809 - 50) * 327680;
						} else if (local809 < 150) {
							local734 = (local809 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray236[local600] == 10) {
						local809 = 150 - this.anIntArray238[local600];
						if (local809 < 50) {
							local734 = local809 * 5 + 16711680;
						} else if (local809 < 100) {
							local734 = 16711935 - (local809 - 50) * 327680;
						} else if (local809 < 150) {
							local734 = (local809 - 100) * 327680 + 255 - (local809 - 100) * 5;
						}
					}
					if (this.anIntArray236[local600] == 11) {
						local809 = 150 - this.anIntArray238[local600];
						if (local809 < 50) {
							local734 = 16777215 - local809 * 327685;
						} else if (local809 < 100) {
							local734 = (local809 - 50) * 327685 + 65280;
						} else if (local809 < 150) {
							local734 = 16777215 - (local809 - 100) * 327680;
						}
					}
					if (this.anIntArray237[local600] == 0) {
						this.aClass1_Sub1_Sub1_Sub4_4.method500(0, local729, this.anInt905 + 1, this.anInt904);
						this.aClass1_Sub1_Sub1_Sub4_4.method500(local734, local729, this.anInt905, this.anInt904);
					}
					if (this.anIntArray237[local600] == 1) {
						this.aClass1_Sub1_Sub1_Sub4_4.method505(0, local729, this.anInt904, this.anInt1040, this.anInt905 + 1);
						this.aClass1_Sub1_Sub1_Sub4_4.method505(local734, local729, this.anInt904, this.anInt1040, this.anInt905);
					}
					if (this.anIntArray237[local600] == 2) {
						this.aClass1_Sub1_Sub1_Sub4_4.method506(this.anInt904, local729, this.anInt1040, this.anInt905 + 1, this.aByte32, 0);
						this.aClass1_Sub1_Sub1_Sub4_4.method506(this.anInt904, local729, this.anInt1040, this.anInt905, this.aByte32, local734);
					}
					if (this.anIntArray237[local600] == 3) {
						this.aClass1_Sub1_Sub1_Sub4_4.method507(150 - this.anIntArray238[local600], local729, this.anInt1040, this.anInt905 + 1, this.anInt904, 0);
						this.aClass1_Sub1_Sub1_Sub4_4.method507(150 - this.anIntArray238[local600], local729, this.anInt1040, this.anInt905, this.anInt904, local734);
					}
					@Pc(1108) int local1108;
					if (this.anIntArray237[local600] == 4) {
						local809 = this.aClass1_Sub1_Sub1_Sub4_4.method503(local729);
						local1108 = (150 - this.anIntArray238[local600]) * (local809 + 100) / 150;
						Class1_Sub1_Sub1.method489(334, this.anInt904 - 50, this.anInt904 + 50, 0);
						this.aClass1_Sub1_Sub1_Sub4_4.method504(0, local729, this.anInt905 + 1, 822, this.anInt904 + 50 - local1108);
						this.aClass1_Sub1_Sub1_Sub4_4.method504(local734, local729, this.anInt905, 822, this.anInt904 + 50 - local1108);
						Class1_Sub1_Sub1.method488();
					}
					if (this.anIntArray237[local600] == 5) {
						local809 = 150 - this.anIntArray238[local600];
						local1108 = 0;
						if (local809 < 25) {
							local1108 = local809 - 25;
						} else if (local809 > 125) {
							local1108 = local809 - 125;
						}
						Class1_Sub1_Sub1.method489(this.anInt905 + 5, 0, 512, this.anInt905 - this.aClass1_Sub1_Sub1_Sub4_4.anInt742 - 1);
						this.aClass1_Sub1_Sub1_Sub4_4.method500(0, local729, this.anInt905 + local1108 + 1, this.anInt904);
						this.aClass1_Sub1_Sub1_Sub4_4.method500(local734, local729, this.anInt905 + local1108, this.anInt904);
						Class1_Sub1_Sub1.method488();
					}
				} else {
					this.aClass1_Sub1_Sub1_Sub4_4.method500(0, local729, this.anInt905 + 1, this.anInt904);
					this.aClass1_Sub1_Sub1_Sub4_4.method500(16776960, local729, this.anInt905, this.anInt904);
				}
			}
		} catch (@Pc(1258) RuntimeException local1258) {
			signlink.reporterror("52196, " + arg0 + ", " + local1258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method599(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt873; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt873--;
						this.aBoolean244 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt873; local28++) {
							this.aStringArray11[local28] = this.aStringArray11[local28 + 1];
							this.anIntArray212[local28] = this.anIntArray212[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_9.method257(215);
						this.aClass1_Sub1_Sub3_9.method264(arg0);
						break;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("18622, " + false + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method600() {
		try {
			this.aClass17_24.method218();
			Class1_Sub1_Sub1_Sub3.anIntArray104 = this.anIntArray257;
			this.aClass1_Sub1_Sub1_Sub2_18.method155(0, 0);
			if (this.anInt1007 != -1) {
				this.method669(0, 0, Class10.aClass10Array1[this.anInt1007], 0);
			} else if (this.anIntArray254[this.anInt1017] != -1) {
				this.method669(0, 0, Class10.aClass10Array1[this.anIntArray254[this.anInt1017]], 0);
			}
			if (this.aBoolean223 && this.anInt895 == 1) {
				this.method604((byte) 9);
			}
			this.aClass17_24.method219(205, super.aGraphics2, 553);
			this.aClass17_26.method218();
			Class1_Sub1_Sub1_Sub3.anIntArray104 = this.anIntArray258;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("56062, " + -81 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method601(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean228) {
				@Pc(17) Class1_Sub1_Sub1_Sub2 local17;
				@Pc(25) int local25;
				@Pc(33) int local33;
				@Pc(36) byte[] local36;
				@Pc(39) byte[] local39;
				@Pc(41) int local41;
				if (Class1_Sub1_Sub1_Sub3.anIntArray106[17] >= arg0) {
					local17 = Class1_Sub1_Sub1_Sub3.aClass1_Sub1_Sub1_Sub2Array1[17];
					local25 = local17.anInt305 * local17.anInt306 - 1;
					local33 = local17.anInt305 * this.anInt894 * 2;
					local36 = local17.aByteArray3;
					local39 = this.aByteArray21;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray3 = local39;
					this.aByteArray21 = local36;
					Class1_Sub1_Sub1_Sub3.method394(17);
					anInt849++;
					if (anInt849 > 1235) {
						anInt849 = 0;
						this.aClass1_Sub1_Sub3_9.method257(226);
						this.aClass1_Sub1_Sub3_9.method258(0);
						@Pc(88) int local88 = this.aClass1_Sub1_Sub3_9.anInt468;
						this.aClass1_Sub1_Sub3_9.method259(58722);
						this.aClass1_Sub1_Sub3_9.method258(240);
						this.aClass1_Sub1_Sub3_9.method259((int) (Math.random() * 65536.0D));
						this.aClass1_Sub1_Sub3_9.method258((int) (Math.random() * 256.0D));
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass1_Sub1_Sub3_9.method259(51825);
						}
						this.aClass1_Sub1_Sub3_9.method258((int) (Math.random() * 256.0D));
						this.aClass1_Sub1_Sub3_9.method259((int) (Math.random() * 65536.0D));
						this.aClass1_Sub1_Sub3_9.method259(7130);
						this.aClass1_Sub1_Sub3_9.method259((int) (Math.random() * 65536.0D));
						this.aClass1_Sub1_Sub3_9.method259(61657);
						this.aClass1_Sub1_Sub3_9.method267(this.aClass1_Sub1_Sub3_9.anInt468 - local88);
					}
				}
				if (Class1_Sub1_Sub1_Sub3.anIntArray106[24] >= arg0) {
					local17 = Class1_Sub1_Sub1_Sub3.aClass1_Sub1_Sub1_Sub2Array1[24];
					local25 = local17.anInt305 * local17.anInt306 - 1;
					local33 = local17.anInt305 * this.anInt894 * 2;
					local36 = local17.aByteArray3;
					local39 = this.aByteArray21;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray3 = local39;
					this.aByteArray21 = local36;
					Class1_Sub1_Sub1_Sub3.method394(24);
				}
				if (Class1_Sub1_Sub1_Sub3.anIntArray106[34] >= arg0) {
					local17 = Class1_Sub1_Sub1_Sub3.aClass1_Sub1_Sub1_Sub2Array1[34];
					local25 = local17.anInt305 * local17.anInt306 - 1;
					local33 = local17.anInt305 * this.anInt894 * 2;
					local36 = local17.aByteArray3;
					local39 = this.aByteArray21;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray3 = local39;
					this.aByteArray21 = local36;
					Class1_Sub1_Sub1_Sub3.method394(34);
					return;
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("86342, " + 854 + ", " + arg0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method602() {
		try {
			@Pc(18) int local18;
			for (@Pc(10) int local10 = -1; local10 < this.anInt868; local10++) {
				if (local10 == -1) {
					local18 = this.anInt867;
				} else {
					local18 = this.anIntArray223[local10];
				}
				@Pc(30) Class1_Sub1_Sub2_Sub1_Sub2 local30 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local18];
				if (local30 != null && local30.anInt254 > 0) {
					local30.anInt254--;
					if (local30.anInt254 == 0) {
						local30.aString5 = null;
					}
				}
			}
			for (local18 = 0; local18 < this.anInt840; local18++) {
				@Pc(61) int local61 = this.anIntArray215[local18];
				@Pc(66) Class1_Sub1_Sub2_Sub1_Sub1 local66 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local61];
				if (local66 != null && local66.anInt254 > 0) {
					local66.anInt254--;
					if (local66.anInt254 == 0) {
						local66.aString5 = null;
					}
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("18071, " + -92 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method603(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) int local6 = this.anInt971 * 128 + 64;
			@Pc(13) int local13 = this.anInt972 * 128 + 64;
			@Pc(24) int local24 = this.method606(this.anInt881, local13, local6) - this.anInt973;
			if (this.anInt852 < local6) {
				this.anInt852 += this.anInt974 + (local6 - this.anInt852) * this.anInt975 / 1000;
				if (this.anInt852 > local6) {
					this.anInt852 = local6;
				}
			}
			if (this.anInt852 > local6) {
				this.anInt852 -= this.anInt974 + (this.anInt852 - local6) * this.anInt975 / 1000;
				if (this.anInt852 < local6) {
					this.anInt852 = local6;
				}
			}
			if (this.anInt853 < local24) {
				this.anInt853 += this.anInt974 + (local24 - this.anInt853) * this.anInt975 / 1000;
				if (this.anInt853 > local24) {
					this.anInt853 = local24;
				}
			}
			if (this.anInt853 > local24) {
				this.anInt853 -= this.anInt974 + (this.anInt853 - local24) * this.anInt975 / 1000;
				if (this.anInt853 < local24) {
					this.anInt853 = local24;
				}
			}
			if (this.anInt854 < local13) {
				this.anInt854 += this.anInt974 + (local13 - this.anInt854) * this.anInt975 / 1000;
				if (this.anInt854 > local13) {
					this.anInt854 = local13;
				}
			}
			if (this.anInt854 > local13) {
				this.anInt854 -= this.anInt974 + (this.anInt854 - local13) * this.anInt975 / 1000;
				if (this.anInt854 < local13) {
					this.anInt854 = local13;
				}
			}
			local6 = this.anInt914 * 128 + 64;
			local13 = this.anInt915 * 128 + 64;
			local24 = this.method606(this.anInt881, local13, local6) - this.anInt916;
			@Pc(222) int local222 = local6 - this.anInt852;
			@Pc(227) int local227 = local24 - this.anInt853;
			@Pc(232) int local232 = local13 - this.anInt854;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(259) boolean local259 = false;
			@Pc(278) int local278 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt855 < local254) {
				this.anInt855 += this.anInt917 + (local254 - this.anInt855) * this.anInt918 / 1000;
				if (this.anInt855 > local254) {
					this.anInt855 = local254;
				}
			}
			if (this.anInt855 > local254) {
				this.anInt855 -= this.anInt917 + (this.anInt855 - local254) * this.anInt918 / 1000;
				if (this.anInt855 < local254) {
					this.anInt855 = local254;
				}
			}
			@Pc(349) int local349 = local278 - this.anInt856;
			if (local349 > 1024) {
				local349 -= 2048;
			}
			if (local349 < -1024) {
				local349 += 2048;
			}
			if (local349 > 0) {
				this.anInt856 += this.anInt917 + local349 * this.anInt918 / 1000;
				this.anInt856 &= 0x7FF;
			}
			if (local349 < 0) {
				this.anInt856 -= this.anInt917 + -local349 * this.anInt918 / 1000;
				this.anInt856 &= 0x7FF;
			}
			@Pc(407) int local407 = local278 - this.anInt856;
			if (local407 > 1024) {
				local407 -= 2048;
			}
			if (local407 < -1024) {
				local407 += 2048;
			}
			if (local407 < 0 && local349 > 0 || local407 > 0 && local349 < 0) {
				this.anInt856 = local278;
			}
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("71397, " + arg0 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method604(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) int local4 = this.anInt896;
			@Pc(7) int local7 = this.anInt897;
			@Pc(10) int local10 = this.anInt898;
			@Pc(13) int local13 = this.anInt899;
			Class1_Sub1_Sub1.method492(local13, local7, local4, 6116423, local10);
			@Pc(27) boolean local27 = false;
			Class1_Sub1_Sub1.method492(16, local7 + 1, local4 + 1, 0, local10 - 2);
			Class1_Sub1_Sub1.method493(local4 + 1, local10 - 2, local13 - 19, 0, local7 + 18);
			this.aClass1_Sub1_Sub1_Sub4_4.method504(6116423, "Choose Option", local7 + 14, 822, local4 + 3);
			@Pc(73) int local73 = super.anInt827;
			@Pc(76) int local76 = super.anInt828;
			if (this.anInt895 == 0) {
				local73 -= 4;
				local76 -= 4;
			}
			if (this.anInt895 == 1) {
				local73 -= 553;
				local76 -= 205;
			}
			if (this.anInt895 == 2) {
				local73 -= 17;
				local76 -= 357;
			}
			for (@Pc(95) int local95 = 0; local95 < this.anInt985; local95++) {
				@Pc(110) int local110 = local7 + (this.anInt985 - 1 - local95) * 15 + 31;
				@Pc(112) int local112 = 16777215;
				if (local73 > local4 && local73 < local4 + local10 && local76 > local110 - 13 && local76 < local110 + 3) {
					local112 = 16776960;
				}
				this.aClass1_Sub1_Sub1_Sub4_4.method508(true, local4 + 3, local112, this.aStringArray13[local95], local110);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("82996, " + arg0 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method605(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt873 >= 100 && this.anInt945 != 1) {
					this.method641("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this.aBoolean231);
				} else if (this.anInt873 >= 200) {
					this.method641("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this.aBoolean231);
				} else {
					@Pc(40) String local40 = Class50.method563(Class50.method560(arg0));
					for (@Pc(42) int local42 = 0; local42 < this.anInt873; local42++) {
						if (this.aLongArray4[local42] == arg0) {
							this.method641(local40 + " is already on your friend list", 0, "", this.aBoolean231);
							return;
						}
					}
					for (@Pc(79) int local79 = 0; local79 < this.anInt838; local79++) {
						if (this.aLongArray3[local79] == arg0) {
							this.method641("Please remove " + local40 + " from your ignore list first", 0, "", this.aBoolean231);
							return;
						}
					}
					if (!local40.equals(aClass1_Sub1_Sub2_Sub1_Sub2_1.aString6)) {
						this.aStringArray11[this.anInt873] = local40;
						this.aLongArray4[this.anInt873] = arg0;
						this.anIntArray212[this.anInt873] = 0;
						this.anInt873++;
						this.aBoolean244 = true;
						this.aClass1_Sub1_Sub3_9.method257(188);
						this.aClass1_Sub1_Sub3_9.method264(arg0);
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("15283, " + 68 + ", " + arg0 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)I")
	private int method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.aBoolean246 &= true;
			@Pc(9) int local9 = arg2 >> 7;
			@Pc(13) int local13 = arg1 >> 7;
			if (local9 < 0 || local13 < 0 || local9 > 103 || local13 > 103) {
				return 0;
			}
			@Pc(27) int local27 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray8[1][local9][local13] & 0x2) == 2) {
				local27 = arg0 + 1;
			}
			@Pc(47) int local47 = arg2 & 0x7F;
			@Pc(51) int local51 = arg1 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray8[local27][local9][local13] * (128 - local47) + this.anIntArrayArrayArray8[local27][local9 + 1][local13] * local47 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray8[local27][local9][local13 + 1] * (128 - local47) + this.anIntArrayArrayArray8[local27][local9 + 1][local13 + 1] * local47 >> 7;
			return local79 * (128 - local51) + local111 * local51 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("48438, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method608() {
		try {
			try {
				if (this.aClass26_1 != null) {
					this.aClass26_1.method310();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass26_1 = null;
			this.aBoolean246 = false;
			this.anInt839 = 0;
			this.aString25 = "";
			this.aString26 = "";
			this.method587();
			this.aClass27_1.method317(619);
			for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
				this.aClass12Array1[local34].method164();
			}
			System.gc();
			this.method579();
			this.anInt900 = -1;
			this.anInt1021 = -1;
			this.anInt1035 = 0;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("91154, " + true + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method609() {
		try {
			this.aBoolean235 = true;
			for (@Pc(11) int local11 = 0; local11 < 7; local11++) {
				this.anIntArray246[local11] = -1;
				for (@Pc(20) int local20 = 0; local20 < Class39.anInt683; local20++) {
					if (!Class39.aClass39Array1[local20].aBoolean172 && Class39.aClass39Array1[local20].anInt684 == local11 + (this.aBoolean237 ? 0 : 7)) {
						this.anIntArray246[local11] = local20;
						break;
					}
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("51214, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MBMGIXGO;B)V")
	private void method610(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt469 + 21 < arg0 * 8) {
					@Pc(24) int local24 = arg1.method279(14);
					if (local24 != 16383) {
						if (this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local24] == null) {
							this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local24] = new Class1_Sub1_Sub2_Sub1_Sub1();
						}
						@Pc(44) Class1_Sub1_Sub2_Sub1_Sub1 local44 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local24];
						this.anIntArray215[this.anInt840++] = local24;
						local44.anInt256 = anInt995;
						@Pc(63) int local63 = arg1.method279(5);
						if (local63 > 15) {
							local63 -= 32;
						}
						@Pc(72) int local72 = arg1.method279(5);
						if (local72 > 15) {
							local72 -= 32;
						}
						@Pc(81) int local81 = arg1.method279(1);
						local44.aClass6_1 = Class6.method29(arg1.method279(12));
						@Pc(93) int local93 = arg1.method279(1);
						if (local93 == 1) {
							this.anIntArray224[this.anInt869++] = local24;
						}
						local44.anInt259 = local44.aClass6_1.aByte1;
						local44.anInt228 = local44.aClass6_1.anInt39;
						local44.anInt271 = local44.aClass6_1.anInt33;
						local44.anInt272 = local44.aClass6_1.anInt27;
						local44.anInt273 = local44.aClass6_1.anInt40;
						local44.anInt274 = local44.aClass6_1.anInt24;
						local44.anInt233 = local44.aClass6_1.anInt38;
						local44.method128(aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0] + local72, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0] + local63, local81 == 1);
						continue;
					}
				}
				arg1.method280();
				return;
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("75258, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method571() {
		try {
			if (!this.aBoolean259 && !this.aBoolean225 && !this.aBoolean250) {
				anInt995++;
				if (this.aBoolean246) {
					this.method626(this.anInt1016);
				} else {
					this.method704();
				}
				this.method621();
				if (this.anInt951 != 24869) {
					aBoolean224 = true;
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("20652, " + 24869 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method611(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 >> 7 == this.anInt1037 && aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 >> 7 == this.anInt1038) {
				this.anInt1037 = 0;
			}
			@Pc(21) int local21 = this.anInt868;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(36) int local36 = 0; local36 < local21; local36++) {
				@Pc(42) Class1_Sub1_Sub2_Sub1_Sub2 local42;
				@Pc(47) int local47;
				if (arg0) {
					local42 = aClass1_Sub1_Sub2_Sub1_Sub2_1;
					local47 = this.anInt867 << 14;
				} else {
					local42 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray223[local36]];
					local47 = this.anIntArray223[local36] << 14;
				}
				if (local42 != null && local42.method132(aBoolean254)) {
					local42.aBoolean57 = false;
					if ((aBoolean228 && this.anInt868 > 50 || this.anInt868 > 200) && !arg0 && local42.anInt236 == local42.anInt233) {
						local42.aBoolean57 = true;
					}
					@Pc(98) int local98 = local42.anInt268 >> 7;
					@Pc(103) int local103 = local42.anInt269 >> 7;
					if (local98 >= 0 && local98 < 104 && local103 >= 0 && local103 < 104) {
						if (local42.aClass1_Sub1_Sub2_Sub6_1 == null || anInt995 < local42.anInt279 || anInt995 >= local42.anInt280) {
							if ((local42.anInt268 & 0x7F) == 64 && (local42.anInt269 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local98][local103] == this.anInt1040) {
									continue;
								}
								this.anIntArrayArray24[local98][local103] = this.anInt1040;
							}
							local42.anInt281 = this.method606(this.anInt881, local42.anInt269, local42.anInt268);
							this.aClass27_1.method328(this.anInt881, local42.anInt270, (byte) 6, local42.anInt281, local47, local42.anInt269, 60, local42.anInt268, local42, local42.aBoolean56);
						} else {
							local42.aBoolean57 = false;
							local42.anInt281 = this.method606(this.anInt881, local42.anInt269, local42.anInt268);
							this.aClass27_1.method329(this.anInt881, local42.anInt269, local42, local42.anInt270, local42.anInt289, local42.anInt268, local42.anInt281, local42.anInt286, local42.anInt288, local47, local42.anInt287);
						}
					}
				}
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("79491, " + 0 + ", " + arg0 + ", " + local232.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DUCMKFAY;)Z")
	private boolean method612(@OriginalArg(1) Class10 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt314;
			if (this.anInt874 == 2) {
				if (local9 == 201) {
					this.aBoolean253 = true;
					this.anInt1019 = 0;
					this.aBoolean261 = true;
					this.aString27 = "";
					this.anInt955 = 1;
					this.aString22 = "Enter name of friend to add to list";
				}
				if (local9 == 202) {
					this.aBoolean253 = true;
					this.anInt1019 = 0;
					this.aBoolean261 = true;
					this.aString27 = "";
					this.anInt955 = 2;
					this.aString22 = "Enter name of friend to delete from list";
				}
			}
			if (local9 == 205) {
				this.anInt926 = 250;
				return true;
			}
			if (local9 == 501) {
				this.aBoolean253 = true;
				this.anInt1019 = 0;
				this.aBoolean261 = true;
				this.aString27 = "";
				this.anInt955 = 4;
				this.aString22 = "Enter name of player to add to list";
			}
			if (local9 == 502) {
				this.aBoolean253 = true;
				this.anInt1019 = 0;
				this.aBoolean261 = true;
				this.aString27 = "";
				this.anInt955 = 5;
				this.aString22 = "Enter name of player to delete from list";
			}
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(126) int local126;
			if (local9 >= 300 && local9 <= 313) {
				local117 = (local9 - 300) / 2;
				local121 = local9 & 0x1;
				local126 = this.anIntArray246[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = Class39.anInt683 - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= Class39.anInt683) {
								local126 = 0;
							}
						}
						if (!Class39.aClass39Array1[local126].aBoolean172 && Class39.aClass39Array1[local126].anInt684 == local117 + (this.aBoolean237 ? 0 : 7)) {
							this.anIntArray246[local117] = local126;
							this.aBoolean235 = true;
							break;
						}
					}
				}
			}
			if (local9 >= 314 && local9 <= 323) {
				local117 = (local9 - 314) / 2;
				local121 = local9 & 0x1;
				local126 = this.anIntArray239[local117];
				if (local121 == 0) {
					local126--;
					if (local126 < 0) {
						local126 = anIntArrayArray25[local117].length - 1;
					}
				}
				if (local121 == 1) {
					local126++;
					if (local126 >= anIntArrayArray25[local117].length) {
						local126 = 0;
					}
				}
				this.anIntArray239[local117] = local126;
				this.aBoolean235 = true;
			}
			if (local9 == 324 && !this.aBoolean237) {
				this.aBoolean237 = true;
				this.method609();
			}
			if (local9 == 325 && this.aBoolean237) {
				this.aBoolean237 = false;
				this.method609();
			}
			if (local9 == 326) {
				this.aClass1_Sub1_Sub3_9.method257(101);
				this.aClass1_Sub1_Sub3_9.method258(this.aBoolean237 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.aClass1_Sub1_Sub3_9.method258(this.anIntArray246[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.aClass1_Sub1_Sub3_9.method258(this.anIntArray239[local121]);
				}
				return true;
			}
			if (local9 == 613) {
				this.aBoolean247 = !this.aBoolean247;
			}
			if (local9 >= 601 && local9 <= 612) {
				this.method711();
				if (this.aString18.length() > 0) {
					this.aClass1_Sub1_Sub3_9.method257(218);
					this.aClass1_Sub1_Sub3_9.method264(Class50.method559(this.aString18));
					this.aClass1_Sub1_Sub3_9.method258(local9 - 601);
					this.aClass1_Sub1_Sub3_9.method258(this.aBoolean247 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(354) RuntimeException local354) {
			signlink.reporterror("3833, " + 505 + ", " + arg0 + ", " + local354.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!MBMGIXGO;)V")
	private void method613(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(11) int local11 = 0; local11 < this.anInt869; local11++) {
				@Pc(18) int local18 = this.anIntArray224[local11];
				@Pc(23) Class1_Sub1_Sub2_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local18];
				@Pc(26) int local26 = arg2.method268();
				if ((local26 & 0x40) != 0) {
					local26 += arg2.method268() << 8;
				}
				this.method671(local26, local18, arg2, this.aByte29, local23);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("72508, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass27_1.method343(arg4, arg2, arg0);
			@Pc(21) int local21;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(33) int local33;
			@Pc(55) int local55;
			@Pc(61) int local61;
			if (local8 != 0) {
				local21 = this.aClass27_1.method347(arg4, arg2, arg0, local8);
				local27 = local21 >> 6 & 0x3;
				local31 = local21 & 0x1F;
				local33 = arg1;
				if (local8 > 0) {
					local33 = arg3;
				}
				@Pc(41) int[] local41 = this.aClass1_Sub1_Sub1_Sub1_16.anIntArray39;
				local55 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local61 = local8 >> 14 & 0x7FFF;
				@Pc(64) Class46 local64 = Class46.method515(local61);
				if (local64.anInt754 == -1) {
					if (local31 == 0 || local31 == 2) {
						if (local27 == 0) {
							local41[local55] = local33;
							local41[local55 + 512] = local33;
							local41[local55 + 1024] = local33;
							local41[local55 + 1536] = local33;
						} else if (local27 == 1) {
							local41[local55] = local33;
							local41[local55 + 1] = local33;
							local41[local55 + 2] = local33;
							local41[local55 + 3] = local33;
						} else if (local27 == 2) {
							local41[local55 + 3] = local33;
							local41[local55 + 3 + 512] = local33;
							local41[local55 + 3 + 1024] = local33;
							local41[local55 + 3 + 1536] = local33;
						} else if (local27 == 3) {
							local41[local55 + 1536] = local33;
							local41[local55 + 1536 + 1] = local33;
							local41[local55 + 1536 + 2] = local33;
							local41[local55 + 1536 + 3] = local33;
						}
					}
					if (local31 == 3) {
						if (local27 == 0) {
							local41[local55] = local33;
						} else if (local27 == 1) {
							local41[local55 + 3] = local33;
						} else if (local27 == 2) {
							local41[local55 + 3 + 1536] = local33;
						} else if (local27 == 3) {
							local41[local55 + 1536] = local33;
						}
					}
					if (local31 == 2) {
						if (local27 == 3) {
							local41[local55] = local33;
							local41[local55 + 512] = local33;
							local41[local55 + 1024] = local33;
							local41[local55 + 1536] = local33;
						} else if (local27 == 0) {
							local41[local55] = local33;
							local41[local55 + 1] = local33;
							local41[local55 + 2] = local33;
							local41[local55 + 3] = local33;
						} else if (local27 == 1) {
							local41[local55 + 3] = local33;
							local41[local55 + 3 + 512] = local33;
							local41[local55 + 3 + 1024] = local33;
							local41[local55 + 3 + 1536] = local33;
						} else if (local27 == 2) {
							local41[local55 + 1536] = local33;
							local41[local55 + 1536 + 1] = local33;
							local41[local55 + 1536 + 2] = local33;
							local41[local55 + 1536 + 3] = local33;
						}
					}
				} else {
					@Pc(74) Class1_Sub1_Sub1_Sub2 local74 = this.aClass1_Sub1_Sub1_Sub2Array3[local64.anInt754];
					if (local74 != null) {
						@Pc(86) int local86 = (local64.anInt746 * 4 - local74.anInt305) / 2;
						@Pc(96) int local96 = (local64.anInt756 * 4 - local74.anInt306) / 2;
						local74.method155(arg2 * 4 + local86 + 48, (104 - arg0 - local64.anInt756) * 4 + 48 + local96);
					}
				}
			}
			local8 = this.aClass27_1.method345(arg4, arg2, arg0);
			if (local8 != 0) {
				local21 = this.aClass27_1.method347(arg4, arg2, arg0, local8);
				local27 = local21 >> 6 & 0x3;
				local31 = local21 & 0x1F;
				local33 = local8 >> 14 & 0x7FFF;
				@Pc(450) Class46 local450 = Class46.method515(local33);
				@Pc(482) int local482;
				if (local450.anInt754 != -1) {
					@Pc(460) Class1_Sub1_Sub1_Sub2 local460 = this.aClass1_Sub1_Sub1_Sub2Array3[local450.anInt754];
					if (local460 != null) {
						local61 = (local450.anInt746 * 4 - local460.anInt305) / 2;
						local482 = (local450.anInt756 * 4 - local460.anInt306) / 2;
						local460.method155(arg2 * 4 + local61 + 48, (104 - arg0 - local450.anInt756) * 4 + 48 + local482);
					}
				} else if (local31 == 9) {
					local55 = 15658734;
					if (local8 > 0) {
						local55 = 15597568;
					}
					@Pc(519) int[] local519 = this.aClass1_Sub1_Sub1_Sub1_16.anIntArray39;
					local482 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
					if (local27 == 0 || local27 == 2) {
						local519[local482 + 1536] = local55;
						local519[local482 + 1024 + 1] = local55;
						local519[local482 + 512 + 2] = local55;
						local519[local482 + 3] = local55;
					} else {
						local519[local482] = local55;
						local519[local482 + 512 + 1] = local55;
						local519[local482 + 1024 + 2] = local55;
						local519[local482 + 1536 + 3] = local55;
					}
				}
			}
			local8 = this.aClass27_1.method346(arg4, arg2, arg0);
			if (local8 != 0) {
				local21 = local8 >> 14 & 0x7FFF;
				@Pc(614) Class46 local614 = Class46.method515(local21);
				if (local614.anInt754 != -1) {
					@Pc(624) Class1_Sub1_Sub1_Sub2 local624 = this.aClass1_Sub1_Sub1_Sub2Array3[local614.anInt754];
					if (local624 != null) {
						local33 = (local614.anInt746 * 4 - local624.anInt305) / 2;
						@Pc(646) int local646 = (local614.anInt756 * 4 - local624.anInt306) / 2;
						local624.method155(arg2 * 4 + local33 + 48, (104 - arg0 - local614.anInt756) * 4 + 48 + local646);
						return;
					}
				}
			}
		} catch (@Pc(670) RuntimeException local670) {
			signlink.reporterror("19786, " + arg0 + ", " + -960 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local670.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method615() {
		try {
			this.aClass1_Sub1_Sub1_Sub2_6 = new Class1_Sub1_Sub1_Sub2(this.aClass44_1, "titlebox", 0);
			this.aClass1_Sub1_Sub1_Sub2_7 = new Class1_Sub1_Sub1_Sub2(this.aClass44_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub1_Sub2Array4 = new Class1_Sub1_Sub1_Sub2[12];
			@Pc(33) int local33 = 0;
			try {
				local33 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(40) Exception local40) {
			}
			@Pc(44) int local44;
			if (local33 == 0) {
				for (local44 = 0; local44 < 12; local44++) {
					this.aClass1_Sub1_Sub1_Sub2Array4[local44] = new Class1_Sub1_Sub1_Sub2(this.aClass44_1, "runes", local44);
				}
			} else {
				for (local44 = 0; local44 < 12; local44++) {
					this.aClass1_Sub1_Sub1_Sub2Array4[local44] = new Class1_Sub1_Sub1_Sub2(this.aClass44_1, "runes", (local44 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub1_Sub1_14 = new Class1_Sub1_Sub1_Sub1(128, 265);
			this.aClass1_Sub1_Sub1_Sub1_15 = new Class1_Sub1_Sub1_Sub1(128, 265);
			for (local44 = 0; local44 < 33920; local44++) {
				this.aClass1_Sub1_Sub1_Sub1_14.anIntArray39[local44] = this.aClass17_15.anIntArray69[local44];
			}
			for (@Pc(120) int local120 = 0; local120 < 33920; local120++) {
				this.aClass1_Sub1_Sub1_Sub1_15.anIntArray39[local120] = this.aClass17_16.anIntArray69[local120];
			}
			this.anIntArray218 = new int[256];
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				this.anIntArray218[local142] = local142 * 262144;
			}
			for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
				this.anIntArray218[local157 + 64] = local157 * 1024 + 16711680;
			}
			for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
				this.anIntArray218[local176 + 128] = local176 * 4 + 16776960;
			}
			for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
				this.anIntArray218[local195 + 192] = 16777215;
			}
			this.anIntArray219 = new int[256];
			for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
				this.anIntArray219[local214] = local214 * 1024;
			}
			for (@Pc(229) int local229 = 0; local229 < 64; local229++) {
				this.anIntArray219[local229 + 64] = local229 * 4 + 65280;
			}
			for (@Pc(248) int local248 = 0; local248 < 64; local248++) {
				this.anIntArray219[local248 + 128] = local248 * 262144 + 65535;
			}
			for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
				this.anIntArray219[local267 + 192] = 16777215;
			}
			this.anIntArray220 = new int[256];
			for (@Pc(286) int local286 = 0; local286 < 64; local286++) {
				this.anIntArray220[local286] = local286 * 4;
			}
			for (@Pc(301) int local301 = 0; local301 < 64; local301++) {
				this.anIntArray220[local301 + 64] = local301 * 262144 + 255;
			}
			for (@Pc(320) int local320 = 0; local320 < 64; local320++) {
				this.anIntArray220[local320 + 128] = local320 * 1024 + 16711935;
			}
			for (@Pc(339) int local339 = 0; local339 < 64; local339++) {
				this.anIntArray220[local339 + 192] = 16777215;
			}
			this.anIntArray217 = new int[256];
			this.anIntArray259 = new int[32768];
			this.anIntArray260 = new int[32768];
			this.method670(null);
			this.anIntArray213 = new int[32768];
			this.anIntArray214 = new int[32768];
			this.method577(10, "Connecting to fileserver");
			if (!this.aBoolean219) {
				this.aBoolean222 = true;
				this.aBoolean219 = true;
				this.method576(this, 2);
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("57668, " + 215 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method617() {
		try {
			if (aBoolean228 && this.anInt934 == 2 && Class8.anInt52 != this.anInt881) {
				this.aClass17_26.method218();
				this.aClass1_Sub1_Sub1_Sub4_3.method500(0, "Loading - please wait.", 151, 257);
				this.aClass1_Sub1_Sub1_Sub4_3.method500(16777215, "Loading - please wait.", 150, 256);
				this.aClass17_26.method219(4, super.aGraphics2, 4);
				this.anInt934 = 1;
				this.aLong29 = System.currentTimeMillis();
			}
			if (this.anInt934 == 1) {
				@Pc(55) int local55 = this.method618();
				if (local55 != 0 && System.currentTimeMillis() - this.aLong29 > 360000L) {
					signlink.reporterror(this.aString25 + " glcfb " + this.aLong32 + "," + local55 + "," + aBoolean228 + "," + this.aClass16Array1[0] + "," + this.aClass14_Sub1_1.method184() + "," + this.anInt881 + "," + this.anInt958 + "," + this.anInt959);
					this.aLong29 = System.currentTimeMillis();
				}
			}
			if (this.anInt934 == 2 && this.anInt881 != this.anInt909) {
				this.anInt909 = this.anInt881;
				this.method588(this.anInt881);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("51136, " + -48877 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)I")
	private int method618() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray4.length; local3++) {
				if (this.aByteArrayArray4[local3] == null && this.anIntArray267[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray268[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(46) int local46 = 0; local46 < this.aByteArrayArray4.length; local46++) {
				@Pc(53) byte[] local53 = this.aByteArrayArray5[local46];
				if (local53 != null) {
					@Pc(67) int local67 = (this.anIntArray266[local46] >> 8) * 64 - this.anInt936;
					@Pc(79) int local79 = (this.anIntArray266[local46] & 0xFF) * 64 - this.anInt937;
					if (this.aBoolean248) {
						local67 = 10;
						local79 = 10;
					}
					local39 &= Class8.method59(local67, local53, local79);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean238) {
				return -4;
			} else {
				this.anInt934 = 2;
				Class8.anInt52 = this.anInt881;
				this.method586();
				this.aClass1_Sub1_Sub3_9.method257(121);
				return 0;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("50361, " + -95 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method619() {
		try {
			for (@Pc(12) Class1_Sub1_Sub2_Sub4 local12 = (Class1_Sub1_Sub2_Sub4) this.aClass21_10.method246(); local12 != null; local12 = (Class1_Sub1_Sub2_Sub4) this.aClass21_10.method248()) {
				if (local12.anInt674 != this.anInt881 || anInt995 > local12.anInt660) {
					local12.method526();
				} else if (anInt995 >= local12.anInt659) {
					if (local12.anInt669 > 0) {
						@Pc(42) Class1_Sub1_Sub2_Sub1_Sub1 local42 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local12.anInt669 - 1];
						if (local42 != null && local42.anInt268 >= 0 && local42.anInt268 < 13312 && local42.anInt269 >= 0 && local42.anInt269 < 13312) {
							local12.method461(anInt995, local42.anInt269, this.method606(local12.anInt674, local42.anInt269, local42.anInt268) - local12.anInt665, local42.anInt268);
						}
					}
					if (local12.anInt669 < 0) {
						@Pc(87) int local87 = -local12.anInt669 - 1;
						@Pc(93) Class1_Sub1_Sub2_Sub1_Sub2 local93;
						if (local87 == this.anInt864) {
							local93 = aClass1_Sub1_Sub2_Sub1_Sub2_1;
						} else {
							local93 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local87];
						}
						if (local93 != null && local93.anInt268 >= 0 && local93.anInt268 < 13312 && local93.anInt269 >= 0 && local93.anInt269 < 13312) {
							local12.method461(anInt995, local93.anInt269, this.method606(local12.anInt674, local93.anInt269, local93.anInt268) - local12.anInt665, local93.anInt268);
						}
					}
					local12.method462(this.anInt894, this.anInt931);
					this.aClass27_1.method328(this.anInt881, local12.anInt672, (byte) 6, (int) local12.aDouble8, -1, (int) local12.aDouble7, 60, (int) local12.aDouble6, local12, false);
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("65179, " + -948 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method620() {
		try {
			@Pc(7) byte[] local7 = this.aClass44_1.method484("title.dat", null);
			@Pc(13) Class1_Sub1_Sub1_Sub1 local13 = new Class1_Sub1_Sub1_Sub1(local7, this);
			this.aClass17_15.method218();
			local13.method101(0, 0);
			this.aClass17_16.method218();
			local13.method101(-637, 0);
			this.aClass17_12.method218();
			local13.method101(-128, 0);
			this.aClass17_13.method218();
			local13.method101(-202, -371);
			this.aClass17_14.method218();
			local13.method101(-202, -171);
			this.aClass17_17.method218();
			local13.method101(0, -265);
			this.aClass17_18.method218();
			local13.method101(-562, -265);
			this.aClass17_19.method218();
			local13.method101(-128, -171);
			this.aClass17_20.method218();
			local13.method101(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt185];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt186; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt185; local104++) {
					local98[local104] = local13.anIntArray39[local13.anInt185 + local13.anInt185 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt185; local130++) {
					local13.anIntArray39[local130 + local13.anInt185 * local100] = local98[local130];
				}
			}
			this.aClass17_15.method218();
			local13.method101(382, 0);
			this.aClass17_16.method218();
			local13.method101(-255, 0);
			this.aClass17_12.method218();
			local13.method101(254, 0);
			this.aClass17_13.method218();
			local13.method101(180, -371);
			this.aClass17_14.method218();
			local13.method101(180, -171);
			this.aClass17_17.method218();
			local13.method101(382, -265);
			this.aClass17_18.method218();
			local13.method101(-180, -265);
			this.aClass17_19.method218();
			local13.method101(254, -171);
			this.aClass17_20.method218();
			local13.method101(-180, -171);
			local13 = new Class1_Sub1_Sub1_Sub1(this.aClass44_1, "logo", 0);
			this.aClass17_12.method218();
			local13.method103(382 - local13.anInt185 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(271) RuntimeException local271) {
			signlink.reporterror("96255, " + 0 + ", " + local271.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method621() {
		try {
			while (true) {
				@Pc(10) Class1_Sub1_Sub4 local10 = this.aClass14_Sub1_1.method193();
				if (local10 == null) {
					return;
				}
				if (local10.anInt597 == 0) {
					Class1_Sub1_Sub2_Sub6.method532(local10.aByteArray12, local10.anInt598);
					if ((this.aClass14_Sub1_1.method191(local10.anInt598) & 0x62) != 0) {
						this.aBoolean244 = true;
						if (this.anInt1044 != -1) {
							this.aBoolean253 = true;
						}
					}
				}
				if (local10.anInt597 == 1 && local10.aByteArray12 != null) {
					Class37.method453(local10.aByteArray12);
				}
				if (local10.anInt597 == 2 && local10.anInt598 == this.anInt1021 && local10.aByteArray12 != null) {
					this.method585(this.aBoolean255, local10.aByteArray12);
				}
				if (local10.anInt597 == 3 && this.anInt934 == 1) {
					for (@Pc(81) int local81 = 0; local81 < this.aByteArrayArray4.length; local81++) {
						if (this.anIntArray267[local81] == local10.anInt598) {
							this.aByteArrayArray4[local81] = local10.aByteArray12;
							if (local10.aByteArray12 == null) {
								this.anIntArray267[local81] = -1;
							}
							break;
						}
						if (this.anIntArray268[local81] == local10.anInt598) {
							this.aByteArrayArray5[local81] = local10.aByteArray12;
							if (local10.aByteArray12 == null) {
								this.anIntArray268[local81] = -1;
							}
							break;
						}
					}
				}
				if (local10.anInt597 == 93 && this.aClass14_Sub1_1.method196(local10.anInt598)) {
					Class8.method43(new Class1_Sub1_Sub3(local10.aByteArray12, 891), this.aClass14_Sub1_1);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("21105, " + false + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method622() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray213[local5 + 32512] = 255;
				}
			}
			@Pc(46) int local46;
			@Pc(53) int local53;
			@Pc(59) int local59;
			for (local12 = 0; local12 < 100; local12++) {
				local46 = (int) (Math.random() * 124.0D) + 2;
				local53 = (int) (Math.random() * 128.0D) + 128;
				local59 = local46 + (local53 << 7);
				this.anIntArray213[local59] = 192;
			}
			for (local46 = 1; local46 < 255; local46++) {
				for (local53 = 1; local53 < 127; local53++) {
					local59 = local53 + (local46 << 7);
					this.anIntArray214[local59] = (this.anIntArray213[local59 - 1] + this.anIntArray213[local59 + 1] + this.anIntArray213[local59 - 128] + this.anIntArray213[local59 + 128]) / 4;
				}
			}
			this.anInt1043 += 128;
			if (this.anInt1043 > this.anIntArray259.length) {
				this.anInt1043 -= this.anIntArray259.length;
				local53 = (int) (Math.random() * 12.0D);
				this.method670(this.aClass1_Sub1_Sub1_Sub2Array4[local53]);
			}
			@Pc(171) int local171;
			for (local53 = 1; local53 < 255; local53++) {
				for (local59 = 1; local59 < 127; local59++) {
					local171 = local59 + (local53 << 7);
					@Pc(194) int local194 = this.anIntArray214[local171 + 128] - this.anIntArray259[local171 + this.anInt1043 & this.anIntArray259.length - 1] / 5;
					if (local194 < 0) {
						local194 = 0;
					}
					this.anIntArray213[local171] = local194;
				}
			}
			for (local59 = 0; local59 < 255; local59++) {
				this.anIntArray230[local59] = this.anIntArray230[local59 + 1];
			}
			this.anIntArray230[255] = (int) (Math.sin((double) anInt995 / 14.0D) * 16.0D + Math.sin((double) anInt995 / 15.0D) * 14.0D + Math.sin((double) anInt995 / 16.0D) * 12.0D);
			if (this.anInt942 > 0) {
				this.anInt942 -= 4;
			}
			if (this.anInt943 > 0) {
				this.anInt943 -= 4;
			}
			if (this.anInt942 == 0 && this.anInt943 == 0) {
				local171 = (int) (Math.random() * 2000.0D);
				if (local171 == 0) {
					this.anInt942 = 1024;
				}
				if (local171 == 1) {
					this.anInt943 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("52615, " + 25106 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BBI)Z")
	private boolean method623(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("75318, " + arg0 + ", " + 116 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method624(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(3) Class10 local3 = Class10.aClass10Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray56.length && local3.anIntArray56[local5] != -1; local5++) {
				@Pc(20) Class10 local20 = Class10.aClass10Array1[local3.anIntArray56[local5]];
				if (local20.anInt337 == 1) {
					this.method624(local20.anInt331, (byte) 6);
				}
				local20.anInt330 = 0;
				local20.anInt311 = 0;
			}
			@Pc(46) boolean local46 = false;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("61586, " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method625() {
		try {
			if (this.anInt850 == 2) {
				this.method692((this.anInt886 - this.anInt936 << 7) + this.anInt889, this.anInt888 * 2, this.anInt859, (this.anInt887 - this.anInt937 << 7) + this.anInt890);
				if (this.anInt904 > -1 && anInt995 % 20 < 10) {
					this.aClass1_Sub1_Sub1_Sub1Array6[2].method103(this.anInt904 - 12, this.anInt905 - 28);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("10525, " + -252 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method626(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt976 > 1) {
				this.anInt976--;
			}
			if (this.anInt926 > 0) {
				this.anInt926--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method709(); local22++) {
			}
			if (this.aBoolean246) {
				@Pc(41) Object local41 = this.aClass48_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass48_1.anObject1) {
					if (!aBoolean251) {
						this.aClass48_1.anInt783 = 0;
					} else if (super.anInt832 != 0 || this.aClass48_1.anInt783 >= 40) {
						this.aClass1_Sub1_Sub3_9.method257(45);
						this.aClass1_Sub1_Sub3_9.method258(0);
						local66 = this.aClass1_Sub1_Sub3_9.anInt468;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass48_1.anInt783 && local66 - this.aClass1_Sub1_Sub3_9.anInt468 < 240; local70++) {
							local68++;
							local86 = this.aClass48_1.anIntArray167[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass48_1.anIntArray168[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass48_1.anIntArray167[local70] == -1 && this.aClass48_1.anIntArray168[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt1022 || local86 != this.anInt1023) {
								@Pc(165) int local165 = local103 - this.anInt1022;
								this.anInt1022 = local103;
								@Pc(173) int local173 = local86 - this.anInt1023;
								this.anInt1023 = local86;
								if (this.anInt933 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_9.method259((this.anInt933 << 12) + (local165 << 6) + local173);
									this.anInt933 = 0;
								} else if (this.anInt933 < 8) {
									this.aClass1_Sub1_Sub3_9.method261((this.anInt933 << 19) + local120 + 8388608);
									this.anInt933 = 0;
								} else {
									this.aClass1_Sub1_Sub3_9.method262((this.anInt933 << 19) + local120 - 1073741824);
									this.anInt933 = 0;
								}
							} else if (this.anInt933 < 2047) {
								this.anInt933++;
							}
						}
						this.aClass1_Sub1_Sub3_9.method267(this.aClass1_Sub1_Sub3_9.anInt468 - local66);
						if (local68 >= this.aClass48_1.anInt783) {
							this.aClass48_1.anInt783 = 0;
						} else {
							this.aClass48_1.anInt783 -= local68;
							for (local86 = 0; local86 < this.aClass48_1.anInt783; local86++) {
								this.aClass48_1.anIntArray168[local86] = this.aClass48_1.anIntArray168[local86 + local68];
								this.aClass48_1.anIntArray167[local86] = this.aClass48_1.anIntArray167[local86 + local68];
							}
						}
					}
				}
				if (super.anInt832 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong33) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong33 = super.aLong28;
					local66 = super.anInt834;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt833;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt832 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub3_9.method257(241);
					this.aClass1_Sub1_Sub3_9.method262((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt929 > 0) {
					this.anInt929--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean234 = true;
				}
				if (this.aBoolean234 && this.anInt929 <= 0) {
					this.anInt929 = 20;
					this.aBoolean234 = false;
					this.aClass1_Sub1_Sub3_9.method257(86);
					this.aClass1_Sub1_Sub3_9.method259(this.anInt1002);
					this.aClass1_Sub1_Sub3_9.method292(this.anInt1003);
				}
				if (super.aBoolean217 && !this.aBoolean226) {
					this.aBoolean226 = true;
					this.aClass1_Sub1_Sub3_9.method257(3);
					this.aClass1_Sub1_Sub3_9.method258(1);
				}
				if (!super.aBoolean217 && this.aBoolean226) {
					this.aBoolean226 = false;
					this.aClass1_Sub1_Sub3_9.method257(3);
					this.aClass1_Sub1_Sub3_9.method258(0);
				}
				this.method617();
				this.method679((byte) 8);
				this.method654();
				this.anInt924++;
				if (this.anInt924 > 750) {
					this.method632();
				}
				this.method678();
				this.method659();
				this.method602();
				this.anInt894++;
				if (this.anInt880 != 0) {
					this.anInt879 += 20;
					if (this.anInt879 >= 400) {
						this.anInt880 = 0;
					}
				}
				if (this.anInt1028 != 0) {
					this.anInt1025++;
					if (this.anInt1025 >= 15) {
						if (this.anInt1028 == 2) {
							this.aBoolean244 = true;
						}
						if (this.anInt1028 == 3) {
							this.aBoolean253 = true;
						}
						this.anInt1028 = 0;
					}
				}
				if (this.anInt965 != 0) {
					this.anInt912++;
					if (super.anInt827 > this.anInt966 + 5 || super.anInt827 < this.anInt966 - 5 || super.anInt828 > this.anInt967 + 5 || super.anInt828 < this.anInt967 - 5) {
						this.aBoolean258 = true;
					}
					if (super.anInt826 == 0) {
						if (this.anInt965 == 2) {
							this.aBoolean244 = true;
						}
						if (this.anInt965 == 3) {
							this.aBoolean253 = true;
						}
						this.anInt965 = 0;
						if (this.aBoolean258 && this.anInt912 >= 5) {
							this.anInt957 = -1;
							this.method646();
							if (this.anInt957 == this.anInt963 && this.anInt956 != this.anInt964) {
								@Pc(683) Class10 local683 = Class10.aClass10Array1[this.anInt963];
								@Pc(685) byte local685 = 0;
								if (this.anInt876 == 1 && local683.anInt314 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray61[this.anInt956] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean68) {
									local66 = this.anInt964;
									local68 = this.anInt956;
									local683.anIntArray61[local68] = local683.anIntArray61[local66];
									local683.anIntArray60[local68] = local683.anIntArray60[local66];
									local683.anIntArray61[local66] = -1;
									local683.anIntArray60[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt964;
									local68 = this.anInt956;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method157(local66, (byte) 9, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local683.method157(local66, (byte) 9, local66 + 1);
											local66++;
										}
									}
								} else {
									local683.method157(this.anInt964, (byte) 9, this.anInt956);
								}
								this.aClass1_Sub1_Sub3_9.method257(214);
								this.aClass1_Sub1_Sub3_9.method293(this.anInt963);
								this.aClass1_Sub1_Sub3_9.method284(local685);
								this.aClass1_Sub1_Sub3_9.method293(this.anInt964);
								this.aClass1_Sub1_Sub3_9.method291(this.anInt956);
							}
						} else if ((this.anInt1032 == 1 || this.method581(this.anInt985 - 1)) && this.anInt985 > 2) {
							this.method680();
						} else if (this.anInt985 > 0) {
							this.method633(this.anInt985 - 1);
						}
						this.anInt1025 = 10;
						super.anInt832 = 0;
					}
				}
				@Pc(859) int local859;
				@Pc(861) int local861;
				if (Class27.anInt524 != -1) {
					local859 = Class27.anInt524;
					local861 = Class27.anInt525;
					@Pc(882) boolean local882 = this.method649(0, 0, 0, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, local861, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], true, local859);
					Class27.anInt524 = -1;
					if (local882) {
						this.anInt877 = super.anInt833;
						this.anInt878 = super.anInt834;
						this.anInt880 = 1;
						this.anInt879 = 0;
					}
				}
				if (super.anInt832 == 1 && this.aString17 != null) {
					this.aString17 = null;
					this.aBoolean253 = true;
					super.anInt832 = 0;
				}
				this.method584();
				this.method656();
				this.method642(19);
				this.method596();
				if (super.anInt826 == 1 || super.anInt832 == 1) {
					this.anInt1014++;
				}
				if (this.anInt934 == 2) {
					this.method672();
				}
				if (this.anInt934 == 2 && this.aBoolean249) {
					this.method603((byte) 5);
				}
				for (local859 = 0; local859 < 5; local859++) {
					@Pc(968) int local968 = this.anIntArray241[local859]++;
				}
				this.method637(732);
				super.anInt825++;
				if (super.anInt825 > 4500) {
					this.anInt926 = 250;
					super.anInt825 -= 500;
					this.aClass1_Sub1_Sub3_9.method257(202);
				}
				this.anInt911++;
				if (arg0 >= 0) {
					this.aClass21ArrayArrayArray1 = null;
				}
				if (this.anInt911 > 500) {
					this.anInt911 = 0;
					local861 = (int) (Math.random() * 8.0D);
					if ((local861 & 0x1) == 1) {
						this.anInt1045 += this.anInt1046;
					}
					if ((local861 & 0x2) == 2) {
						this.anInt983 += this.anInt984;
					}
					if ((local861 & 0x4) == 4) {
						this.anInt870 += this.anInt871;
					}
				}
				if (this.anInt1045 < -50) {
					this.anInt1046 = 2;
				}
				if (this.anInt1045 > 50) {
					this.anInt1046 = -2;
				}
				if (this.anInt983 < -55) {
					this.anInt984 = 2;
				}
				if (this.anInt983 > 55) {
					this.anInt984 = -2;
				}
				if (this.anInt870 < -40) {
					this.anInt871 = 1;
				}
				if (this.anInt870 > 40) {
					this.anInt871 = -1;
				}
				this.anInt1033++;
				if (this.anInt1033 > 500) {
					this.anInt1033 = 0;
					local861 = (int) (Math.random() * 8.0D);
					if ((local861 & 0x1) == 1) {
						this.anInt1011 += this.anInt1012;
					}
					if ((local861 & 0x2) == 2) {
						this.anInt998 += this.anInt999;
					}
				}
				if (this.anInt1011 < -60) {
					this.anInt1012 = 2;
				}
				if (this.anInt1011 > 60) {
					this.anInt1012 = -2;
				}
				if (this.anInt998 < -20) {
					this.anInt999 = 1;
				}
				if (this.anInt998 > 10) {
					this.anInt999 = -1;
				}
				this.anInt925++;
				if (this.anInt925 > 50) {
					this.aClass1_Sub1_Sub3_9.method257(0);
				}
				try {
					if (this.aClass26_1 != null && this.aClass1_Sub1_Sub3_9.anInt468 > 0) {
						this.aClass26_1.method314(this.aClass1_Sub1_Sub3_9.anInt468, this.aClass1_Sub1_Sub3_9.aByteArray10);
						this.aClass1_Sub1_Sub3_9.anInt468 = 0;
						this.anInt925 = 0;
					}
				} catch (@Pc(1215) IOException local1215) {
					this.method632();
				} catch (@Pc(1220) Exception local1220) {
					this.method608();
				}
			}
		} catch (@Pc(1225) RuntimeException local1225) {
			signlink.reporterror("71747, " + arg0 + ", " + local1225.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method627() {
		try {
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass21_12.method246(); local6 != null; local6 = (Class1_Sub2) this.aClass21_12.method248()) {
				if (local6.anInt347 == -1) {
					local6.anInt355 = 0;
					this.method653(local6);
				} else {
					local6.method526();
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("6061, " + -919 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method628() {
		try {
			if (this.aClass17_12 == null) {
				super.aClass17_2 = null;
				this.aClass17_27 = null;
				this.aClass17_25 = null;
				this.aClass17_24 = null;
				this.aClass17_26 = null;
				this.aClass17_21 = null;
				this.aClass17_22 = null;
				this.aClass17_23 = null;
				this.aClass17_15 = new Class17(128, 265, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass17_16 = new Class17(128, 265, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass17_12 = new Class17(509, 171, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass17_13 = new Class17(360, 132, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass17_14 = new Class17(360, 200, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass17_17 = new Class17(202, 238, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass17_18 = new Class17(203, 238, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass17_19 = new Class17(74, 94, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass17_20 = new Class17(75, 94, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				if (this.aClass44_1 != null) {
					this.method620();
					this.method615();
				}
				this.aBoolean260 = true;
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("33128, " + 0 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;)V")
	@Override
	protected void method577(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt961 = arg0;
			this.aString21 = arg1;
			this.method628();
			if (this.aClass44_1 == null) {
				super.method577(arg0, arg1);
			} else {
				this.aClass17_14.method218();
				this.aClass1_Sub1_Sub1_Sub4_4.method500(16777215, "RuneScape is loading - please wait...", 54, 180);
				Class1_Sub1_Sub1.method493(28, 304, 34, 9179409, 62);
				Class1_Sub1_Sub1.method493(29, 302, 32, 0, 63);
				Class1_Sub1_Sub1.method492(30, 64, 30, 9179409, arg0 * 3);
				Class1_Sub1_Sub1.method492(30, 64, arg0 * 3 + 30, 0, 300 - arg0 * 3);
				this.aClass1_Sub1_Sub1_Sub4_4.method500(16777215, arg1, 85, 180);
				this.aClass17_14.method219(171, super.aGraphics2, 202);
				if (this.aBoolean260) {
					this.aBoolean260 = false;
					if (!this.aBoolean219) {
						this.aClass17_15.method219(0, super.aGraphics2, 0);
						this.aClass17_16.method219(0, super.aGraphics2, 637);
					}
					this.aClass17_12.method219(0, super.aGraphics2, 128);
					this.aClass17_13.method219(371, super.aGraphics2, 202);
					this.aClass17_17.method219(265, super.aGraphics2, 0);
					this.aClass17_18.method219(265, super.aGraphics2, 562);
					this.aClass17_19.method219(171, super.aGraphics2, 128);
					this.aClass17_20.method219(171, super.aGraphics2, 562);
				}
			}
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("47669, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!DUCMKFAY;IZII)V")
	private void method629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		try {
			if (this.aBoolean230) {
				this.anInt913 = 32;
			} else {
				this.anInt913 = 0;
			}
			this.aBoolean230 = false;
			this.anInt922 += 0;
			if (arg2 >= arg0 && arg2 < arg0 + 16 && arg3 >= arg5 && arg3 < arg5 + 16) {
				arg4.anInt319 -= this.anInt1014 * 4;
				if (arg6) {
					this.aBoolean244 = true;
					return;
				}
			} else if (arg2 >= arg0 && arg2 < arg0 + 16 && arg3 >= arg5 + arg1 - 16 && arg3 < arg5 + arg1) {
				arg4.anInt319 += this.anInt1014 * 4;
				if (arg6) {
					this.aBoolean244 = true;
					return;
				}
			} else if (arg2 >= arg0 - this.anInt913 && arg2 < arg0 + this.anInt913 + 16 && arg3 >= arg5 + 16 && arg3 < arg5 + arg1 - 16 && this.anInt1014 > 0) {
				@Pc(122) int local122 = (arg1 - 32) * arg1 / arg7;
				if (local122 < 8) {
					local122 = 8;
				}
				@Pc(137) int local137 = arg3 - arg5 - local122 / 2 - 16;
				@Pc(143) int local143 = arg1 - local122 - 32;
				arg4.anInt319 = (arg7 - arg1) * local137 / local143;
				if (arg6) {
					this.aBoolean244 = true;
				}
				this.aBoolean230 = true;
			} else {
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("45715, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass27_1.method347(this.anInt881, arg2, arg1, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(31) int local31 = local16 & 0x1F;
			@Pc(37) int local37 = local16 >> 6 & 0x3;
			if (local31 == 10 || local31 == 11 || local31 == 22) {
				@Pc(49) Class46 local49 = Class46.method515(local7);
				@Pc(57) int local57;
				@Pc(60) int local60;
				if (local37 == 0 || local37 == 2) {
					local57 = local49.anInt746;
					local60 = local49.anInt756;
				} else {
					local57 = local49.anInt756;
					local60 = local49.anInt746;
				}
				@Pc(71) int local71 = local49.anInt757;
				if (local37 != 0) {
					local71 = (local71 << local37 & 0xF) + (local71 >> 4 - local37);
				}
				this.method649(2, 0, local60, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], local57, local71, arg1, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, arg2);
			} else {
				this.method649(2, local37, 0, local31 + 1, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, arg1, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, arg2);
			}
			this.anInt877 = super.anInt833;
			this.anInt878 = super.anInt834;
			this.anInt880 = 2;
			this.anInt879 = 0;
			return true;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("61218, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -770 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IBI)Lclient!XTGLDHGX;")
	private Class44 method631(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass16Array1[0] != null) {
					local3 = this.aClass16Array1[0].method214(arg0);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg3) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class44(44820, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method577(arg4, "Requesting " + arg1);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method696(arg2 + arg3);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class1_Sub1_Sub3 local95 = new Class1_Sub1_Sub3(local84, 891);
					local95.anInt468 = 3;
					@Pc(103) int local103 = local95.method272() + 6;
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
							this.method577(arg4, "Loading " + arg1 + " - " + local168 + "%");
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass16Array1[0] != null) {
							this.aClass16Array1[0].method215(local3.length, local3, (byte) 2, arg0);
						}
					} catch (@Pc(213) Exception local213) {
						this.aClass16Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local128 = (int) this.aCRC32_2.getValue();
						if (local128 != arg3) {
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
							this.method577(arg4, "Game updated - please reload page");
							local70 = 10;
						} else {
							this.method577(arg4, local55 + " - Retrying in " + local70);
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
					this.aBoolean221 = !this.aBoolean221;
				}
			}
			return new Class44(44820, local3);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("44021, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -41 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method632() {
		try {
			if (this.anInt926 > 0) {
				this.method608();
			} else {
				this.aClass17_26.method218();
				this.aClass1_Sub1_Sub1_Sub4_3.method500(0, "Connection lost", 144, 257);
				this.aClass1_Sub1_Sub1_Sub4_3.method500(16777215, "Connection lost", 143, 256);
				this.aClass1_Sub1_Sub1_Sub4_3.method500(0, "Please wait - attempting to reestablish", 159, 257);
				this.aClass1_Sub1_Sub1_Sub4_3.method500(16777215, "Please wait - attempting to reestablish", 158, 256);
				this.aClass17_26.method219(4, super.aGraphics2, 4);
				this.anInt932 = 0;
				this.anInt1037 = 0;
				@Pc(67) Class26 local67 = this.aClass26_1;
				this.aBoolean246 = false;
				this.anInt940 = 0;
				this.method648(this.aString25, this.aString26, true);
				if (!this.aBoolean246) {
					this.method608();
				}
				try {
					local67.method310();
				} catch (@Pc(90) Exception local90) {
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("43851, " + -670 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method633(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt1019 != 0) {
					this.anInt1019 = 0;
					this.aBoolean253 = true;
				}
				@Pc(18) int local18 = this.anIntArray250[arg0];
				@Pc(23) int local23 = this.anIntArray251[arg0];
				@Pc(28) int local28 = this.anIntArray252[arg0];
				@Pc(33) int local33 = this.anIntArray253[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(45) Class1_Sub1_Sub2_Sub1_Sub1 local45;
				if (local28 == 582) {
					local45 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local33];
					if (local45 != null) {
						this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local45.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local45.anIntArray45[0]);
						this.anInt877 = super.anInt833;
						this.anInt878 = super.anInt834;
						this.anInt880 = 2;
						this.anInt879 = 0;
						this.aClass1_Sub1_Sub3_9.method257(57);
						this.aClass1_Sub1_Sub3_9.method292(this.anInt1050);
						this.aClass1_Sub1_Sub3_9.method292(local33);
						this.aClass1_Sub1_Sub3_9.method291(this.anInt1048);
						this.aClass1_Sub1_Sub3_9.method292(this.anInt1049);
					}
				}
				@Pc(140) boolean local140;
				if (local28 == 234) {
					local140 = this.method649(2, 0, 0, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
					if (!local140) {
						this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
					}
					this.anInt877 = super.anInt833;
					this.anInt878 = super.anInt834;
					this.anInt880 = 2;
					this.anInt879 = 0;
					this.aClass1_Sub1_Sub3_9.method257(236);
					this.aClass1_Sub1_Sub3_9.method291(local23 + this.anInt937);
					this.aClass1_Sub1_Sub3_9.method259(local33);
					this.aClass1_Sub1_Sub3_9.method291(local18 + this.anInt936);
				}
				if (local28 == 62 && this.method630(local33, local23, local18)) {
					this.aClass1_Sub1_Sub3_9.method257(192);
					this.aClass1_Sub1_Sub3_9.method259(this.anInt1049);
					this.aClass1_Sub1_Sub3_9.method291(local33 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_9.method293(local23 + this.anInt937);
					this.aClass1_Sub1_Sub3_9.method291(this.anInt1048);
					this.aClass1_Sub1_Sub3_9.method293(local18 + this.anInt936);
					this.aClass1_Sub1_Sub3_9.method259(this.anInt1050);
				}
				if (local28 == 511) {
					local140 = this.method649(2, 0, 0, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
					if (!local140) {
						this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
					}
					this.anInt877 = super.anInt833;
					this.anInt878 = super.anInt834;
					this.anInt880 = 2;
					this.anInt879 = 0;
					this.aClass1_Sub1_Sub3_9.method257(25);
					this.aClass1_Sub1_Sub3_9.method291(this.anInt1049);
					this.aClass1_Sub1_Sub3_9.method292(this.anInt1050);
					this.aClass1_Sub1_Sub3_9.method259(local33);
					this.aClass1_Sub1_Sub3_9.method292(local23 + this.anInt937);
					this.aClass1_Sub1_Sub3_9.method293(this.anInt1048);
					this.aClass1_Sub1_Sub3_9.method259(local18 + this.anInt936);
				}
				if (local28 == 74) {
					this.aClass1_Sub1_Sub3_9.method257(122);
					this.aClass1_Sub1_Sub3_9.method293(local23);
					this.aClass1_Sub1_Sub3_9.method292(local18);
					this.aClass1_Sub1_Sub3_9.method291(local33);
					this.anInt1025 = 0;
					this.anInt1026 = local23;
					this.anInt1027 = local18;
					this.anInt1028 = 2;
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
						this.anInt1028 = 1;
					}
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
						this.anInt1028 = 3;
					}
				}
				@Pc(423) Class10 local423;
				if (local28 == 315) {
					local423 = Class10.aClass10Array1[local23];
					@Pc(425) boolean local425 = true;
					if (local423.anInt314 > 0) {
						local425 = this.method612(local423);
					}
					if (local425) {
						this.aClass1_Sub1_Sub3_9.method257(185);
						this.aClass1_Sub1_Sub3_9.method259(local23);
					}
				}
				@Pc(452) Class1_Sub1_Sub2_Sub1_Sub2 local452;
				if (local28 == 561) {
					local452 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local33];
					if (local452 != null) {
						this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local452.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local452.anIntArray45[0]);
						this.anInt877 = super.anInt833;
						this.anInt878 = super.anInt834;
						this.anInt880 = 2;
						this.anInt879 = 0;
						anInt1006 += local33;
						if (anInt1006 >= 90) {
							this.aClass1_Sub1_Sub3_9.method257(136);
							anInt1006 = 0;
						}
						this.aClass1_Sub1_Sub3_9.method257(128);
						this.aClass1_Sub1_Sub3_9.method259(local33);
					}
				}
				if (local28 == 20) {
					local45 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local33];
					if (local45 != null) {
						this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local45.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local45.anIntArray45[0]);
						this.anInt877 = super.anInt833;
						this.anInt878 = super.anInt834;
						this.anInt880 = 2;
						this.anInt879 = 0;
						this.aClass1_Sub1_Sub3_9.method257(155);
						this.aClass1_Sub1_Sub3_9.method291(local33);
					}
				}
				if (local28 == 779) {
					local452 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local33];
					if (local452 != null) {
						this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local452.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local452.anIntArray45[0]);
						this.anInt877 = super.anInt833;
						this.anInt878 = super.anInt834;
						this.anInt880 = 2;
						this.anInt879 = 0;
						this.aClass1_Sub1_Sub3_9.method257(153);
						this.aClass1_Sub1_Sub3_9.method291(local33);
					}
				}
				if (local28 == 516) {
					if (this.aBoolean223) {
						this.aClass27_1.method355(local23 - 4, local18 - 4);
					} else {
						this.aClass27_1.method355(super.anInt834 - 4, super.anInt833 - 4);
					}
				}
				if (local28 == 1062) {
					anInt883 += this.anInt936;
					if (anInt883 >= 113) {
						this.aClass1_Sub1_Sub3_9.method257(183);
						this.aClass1_Sub1_Sub3_9.method261(15086193);
						anInt883 = 0;
					}
					this.method630(local33, local23, local18);
					this.aClass1_Sub1_Sub3_9.method257(228);
					this.aClass1_Sub1_Sub3_9.method292(local33 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_9.method292(local23 + this.anInt937);
					this.aClass1_Sub1_Sub3_9.method259(local18 + this.anInt936);
				}
				if (local28 == 679 && !this.aBoolean242) {
					this.aClass1_Sub1_Sub3_9.method257(40);
					this.aClass1_Sub1_Sub3_9.method259(local23);
					this.aBoolean242 = true;
				}
				if (local28 == 431) {
					this.aClass1_Sub1_Sub3_9.method257(129);
					this.aClass1_Sub1_Sub3_9.method292(local18);
					this.aClass1_Sub1_Sub3_9.method259(local23);
					this.aClass1_Sub1_Sub3_9.method292(local33);
					this.anInt1025 = 0;
					this.anInt1026 = local23;
					this.anInt1027 = local18;
					this.anInt1028 = 2;
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
						this.anInt1028 = 1;
					}
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
						this.anInt1028 = 3;
					}
				}
				@Pc(832) long local832;
				@Pc(821) int local821;
				@Pc(817) String local817;
				if (local28 == 337 || local28 == 42 || local28 == 792 || local28 == 322) {
					local817 = this.aStringArray13[arg0];
					local821 = local817.indexOf("@whi@");
					if (local821 != -1) {
						local832 = Class50.method559(local817.substring(local821 + 5).trim());
						if (local28 == 337) {
							this.method605(local832);
						}
						if (local28 == 42) {
							this.method677(local832);
						}
						if (local28 == 792) {
							this.method599(local832);
						}
						if (local28 == 322) {
							this.method686(local832);
						}
					}
				}
				if (local28 == 53) {
					this.aClass1_Sub1_Sub3_9.method257(135);
					this.aClass1_Sub1_Sub3_9.method291(local18);
					this.aClass1_Sub1_Sub3_9.method292(local23);
					this.aClass1_Sub1_Sub3_9.method291(local33);
					this.anInt1025 = 0;
					this.anInt1026 = local23;
					this.anInt1027 = local18;
					this.anInt1028 = 2;
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
						this.anInt1028 = 1;
					}
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
						this.anInt1028 = 3;
					}
				}
				if (local28 == 539) {
					this.aClass1_Sub1_Sub3_9.method257(16);
					this.aClass1_Sub1_Sub3_9.method292(local33);
					this.aClass1_Sub1_Sub3_9.method293(local18);
					this.aClass1_Sub1_Sub3_9.method293(local23);
					this.anInt1025 = 0;
					this.anInt1026 = local23;
					this.anInt1027 = local18;
					this.anInt1028 = 2;
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
						this.anInt1028 = 1;
					}
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
						this.anInt1028 = 3;
					}
				}
				@Pc(1006) int local1006;
				@Pc(1002) String local1002;
				if (local28 == 484 || local28 == 6) {
					local817 = this.aStringArray13[arg0];
					local821 = local817.indexOf("@whi@");
					if (local821 != -1) {
						local817 = local817.substring(local821 + 5).trim();
						local1002 = Class50.method563(Class50.method560(Class50.method559(local817)));
						@Pc(1004) boolean local1004 = false;
						for (local1006 = 0; local1006 < this.anInt868; local1006++) {
							@Pc(1016) Class1_Sub1_Sub2_Sub1_Sub2 local1016 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray223[local1006]];
							if (local1016 != null && local1016.aString6 != null && local1016.aString6.equalsIgnoreCase(local1002)) {
								this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local1016.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local1016.anIntArray45[0]);
								if (local28 == 484) {
									this.aClass1_Sub1_Sub3_9.method257(139);
									this.aClass1_Sub1_Sub3_9.method291(this.anIntArray223[local1006]);
								}
								if (local28 == 6) {
									anInt1006 += local33;
									if (anInt1006 >= 90) {
										this.aClass1_Sub1_Sub3_9.method257(136);
										anInt1006 = 0;
									}
									this.aClass1_Sub1_Sub3_9.method257(128);
									this.aClass1_Sub1_Sub3_9.method259(this.anIntArray223[local1006]);
								}
								local1004 = true;
								break;
							}
						}
						if (!local1004) {
							this.method641("Unable to find " + local1002, 0, "", this.aBoolean231);
						}
					}
				}
				if (local28 == 870) {
					this.aClass1_Sub1_Sub3_9.method257(53);
					this.aClass1_Sub1_Sub3_9.method259(local18);
					this.aClass1_Sub1_Sub3_9.method292(this.anInt1048);
					this.aClass1_Sub1_Sub3_9.method293(local33);
					this.aClass1_Sub1_Sub3_9.method259(this.anInt1049);
					this.aClass1_Sub1_Sub3_9.method291(this.anInt1050);
					this.aClass1_Sub1_Sub3_9.method259(local23);
					this.anInt1025 = 0;
					this.anInt1026 = local23;
					this.anInt1027 = local18;
					this.anInt1028 = 2;
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
						this.anInt1028 = 1;
					}
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
						this.anInt1028 = 3;
					}
				}
				if (local28 == 847) {
					this.aClass1_Sub1_Sub3_9.method257(87);
					this.aClass1_Sub1_Sub3_9.method292(local33);
					this.aClass1_Sub1_Sub3_9.method259(local23);
					this.aClass1_Sub1_Sub3_9.method292(local18);
					this.anInt1025 = 0;
					this.anInt1026 = local23;
					this.anInt1027 = local18;
					this.anInt1028 = 2;
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
						this.anInt1028 = 1;
					}
					if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
						this.anInt1028 = 3;
					}
				}
				@Pc(1272) String local1272;
				if (local28 == 626) {
					local423 = Class10.aClass10Array1[local23];
					this.anInt988 = 1;
					this.anInt989 = local23;
					this.anInt990 = local423.anInt327;
					this.anInt1047 = 0;
					this.aBoolean244 = true;
					local1272 = local423.aString9;
					if (local1272.indexOf(" ") != -1) {
						local1272 = local1272.substring(0, local1272.indexOf(" "));
					}
					local1002 = local423.aString9;
					if (local1002.indexOf(" ") != -1) {
						local1002 = local1002.substring(local1002.indexOf(" ") + 1);
					}
					this.aString23 = local1272 + " " + local423.aString7 + " " + local1002;
					if (this.anInt990 == 16) {
						this.aBoolean244 = true;
						this.anInt1017 = 3;
						this.aBoolean239 = true;
					}
				} else {
					if (local28 == 78) {
						this.aClass1_Sub1_Sub3_9.method257(117);
						this.aClass1_Sub1_Sub3_9.method293(local23);
						this.aClass1_Sub1_Sub3_9.method293(local33);
						this.aClass1_Sub1_Sub3_9.method291(local18);
						this.anInt1025 = 0;
						this.anInt1026 = local23;
						this.anInt1027 = local18;
						this.anInt1028 = 2;
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
							this.anInt1028 = 1;
						}
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
							this.anInt1028 = 3;
						}
					}
					if (local28 == 27) {
						local452 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local452 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local452.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local452.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							anInt910 += local33;
							if (anInt910 >= 54) {
								this.aClass1_Sub1_Sub3_9.method257(189);
								this.aClass1_Sub1_Sub3_9.method258(234);
								anInt910 = 0;
							}
							this.aClass1_Sub1_Sub3_9.method257(73);
							this.aClass1_Sub1_Sub3_9.method291(local33);
						}
					}
					if (local28 == 213) {
						local140 = this.method649(2, 0, 0, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
						if (!local140) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
						}
						this.anInt877 = super.anInt833;
						this.anInt878 = super.anInt834;
						this.anInt880 = 2;
						this.anInt879 = 0;
						this.aClass1_Sub1_Sub3_9.method257(79);
						this.aClass1_Sub1_Sub3_9.method291(local23 + this.anInt937);
						this.aClass1_Sub1_Sub3_9.method259(local33);
						this.aClass1_Sub1_Sub3_9.method292(local18 + this.anInt936);
					}
					if (local28 == 632) {
						this.aClass1_Sub1_Sub3_9.method257(145);
						this.aClass1_Sub1_Sub3_9.method292(local23);
						this.aClass1_Sub1_Sub3_9.method292(local18);
						this.aClass1_Sub1_Sub3_9.method292(local33);
						this.anInt1025 = 0;
						this.anInt1026 = local23;
						this.anInt1027 = local18;
						this.anInt1028 = 2;
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
							this.anInt1028 = 1;
						}
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
							this.anInt1028 = 3;
						}
					}
					if (local28 == 493) {
						this.aClass1_Sub1_Sub3_9.method257(75);
						this.aClass1_Sub1_Sub3_9.method293(local23);
						this.aClass1_Sub1_Sub3_9.method291(local18);
						this.aClass1_Sub1_Sub3_9.method292(local33);
						this.anInt1025 = 0;
						this.anInt1026 = local23;
						this.anInt1027 = local18;
						this.anInt1028 = 2;
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
							this.anInt1028 = 1;
						}
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
							this.anInt1028 = 3;
						}
					}
					if (local28 == 652) {
						local140 = this.method649(2, 0, 0, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
						if (!local140) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
						}
						this.anInt877 = super.anInt833;
						this.anInt878 = super.anInt834;
						this.anInt880 = 2;
						this.anInt879 = 0;
						this.aClass1_Sub1_Sub3_9.method257(156);
						this.aClass1_Sub1_Sub3_9.method292(local18 + this.anInt936);
						this.aClass1_Sub1_Sub3_9.method291(local23 + this.anInt937);
						this.aClass1_Sub1_Sub3_9.method293(local33);
					}
					if (local28 == 94) {
						local140 = this.method649(2, 0, 0, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
						if (!local140) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
						}
						this.anInt877 = super.anInt833;
						this.anInt878 = super.anInt834;
						this.anInt880 = 2;
						this.anInt879 = 0;
						this.aClass1_Sub1_Sub3_9.method257(181);
						this.aClass1_Sub1_Sub3_9.method291(local23 + this.anInt937);
						this.aClass1_Sub1_Sub3_9.method259(local33);
						this.aClass1_Sub1_Sub3_9.method291(local18 + this.anInt936);
						this.aClass1_Sub1_Sub3_9.method292(this.anInt989);
					}
					if (local28 == 646) {
						this.aClass1_Sub1_Sub3_9.method257(185);
						this.aClass1_Sub1_Sub3_9.method259(local23);
						local423 = Class10.aClass10Array1[local23];
						if (local423.anIntArrayArray2 != null && local423.anIntArrayArray2[0][0] == 5) {
							local821 = local423.anIntArrayArray2[0][1];
							if (this.anIntArray231[local821] != local423.anIntArray54[0]) {
								this.anIntArray231[local821] = local423.anIntArray54[0];
								this.method597(local821);
								this.aBoolean244 = true;
							}
						}
					}
					if (local28 == 225) {
						local45 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local45 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local45.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local45.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							anInt1020 += local33;
							if (anInt1020 >= 85) {
								this.aClass1_Sub1_Sub3_9.method257(230);
								this.aClass1_Sub1_Sub3_9.method258(239);
								anInt1020 = 0;
							}
							this.aClass1_Sub1_Sub3_9.method257(17);
							this.aClass1_Sub1_Sub3_9.method293(local33);
						}
					}
					if (local28 == 965) {
						local45 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local45 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local45.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local45.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							anInt986++;
							if (anInt986 >= 96) {
								this.aClass1_Sub1_Sub3_9.method257(152);
								this.aClass1_Sub1_Sub3_9.method258(88);
								anInt986 = 0;
							}
							this.aClass1_Sub1_Sub3_9.method257(21);
							this.aClass1_Sub1_Sub3_9.method259(local33);
						}
					}
					if (local28 == 413) {
						local45 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local45 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local45.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local45.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							this.aClass1_Sub1_Sub3_9.method257(131);
							this.aClass1_Sub1_Sub3_9.method293(local33);
							this.aClass1_Sub1_Sub3_9.method292(this.anInt989);
						}
					}
					if (local28 == 200) {
						this.method711();
					}
					if (local28 == 1025) {
						local45 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local45 != null) {
							@Pc(2141) Class6 local2141 = local45.aClass6_1;
							if (local2141.anIntArray6 != null) {
								local2141 = local2141.method31(this.anInt860);
							}
							if (local2141 != null) {
								if (local2141.aByteArray1 == null) {
									local1002 = "It's a " + local2141.aString1 + ".";
								} else {
									local1002 = new String(local2141.aByteArray1);
								}
								this.method641(local1002, 0, "", this.aBoolean231);
							}
						}
					}
					if (local28 == 900) {
						this.method630(local33, local23, local18);
						this.aClass1_Sub1_Sub3_9.method257(252);
						this.aClass1_Sub1_Sub3_9.method293(local33 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_9.method291(local23 + this.anInt937);
						this.aClass1_Sub1_Sub3_9.method292(local18 + this.anInt936);
					}
					if (local28 == 412) {
						local45 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local45 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local45.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local45.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							this.aClass1_Sub1_Sub3_9.method257(72);
							this.aClass1_Sub1_Sub3_9.method292(local33);
						}
					}
					if (local28 == 365) {
						local452 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local452 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local452.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local452.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							this.aClass1_Sub1_Sub3_9.method257(249);
							this.aClass1_Sub1_Sub3_9.method292(local33);
							this.aClass1_Sub1_Sub3_9.method291(this.anInt989);
						}
					}
					if (local28 == 729) {
						local452 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local452 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local452.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local452.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							this.aClass1_Sub1_Sub3_9.method257(39);
							this.aClass1_Sub1_Sub3_9.method291(local33);
						}
					}
					if (local28 == 577) {
						local452 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local452 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local452.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local452.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							this.aClass1_Sub1_Sub3_9.method257(139);
							this.aClass1_Sub1_Sub3_9.method291(local33);
						}
					}
					if (local28 == 956 && this.method630(local33, local23, local18)) {
						this.aClass1_Sub1_Sub3_9.method257(35);
						this.aClass1_Sub1_Sub3_9.method291(local18 + this.anInt936);
						this.aClass1_Sub1_Sub3_9.method292(this.anInt989);
						this.aClass1_Sub1_Sub3_9.method292(local23 + this.anInt937);
						this.aClass1_Sub1_Sub3_9.method291(local33 >> 14 & 0x7FFF);
					}
					if (local28 == 567) {
						local140 = this.method649(2, 0, 0, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
						if (!local140) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
						}
						this.anInt877 = super.anInt833;
						this.anInt878 = super.anInt834;
						this.anInt880 = 2;
						this.anInt879 = 0;
						this.aClass1_Sub1_Sub3_9.method257(23);
						this.aClass1_Sub1_Sub3_9.method291(local23 + this.anInt937);
						this.aClass1_Sub1_Sub3_9.method291(local33);
						this.aClass1_Sub1_Sub3_9.method291(local18 + this.anInt936);
					}
					if (local28 == 867) {
						if ((local33 & 0x3) == 0) {
							anInt1000++;
						}
						if (anInt1000 >= 59) {
							this.aClass1_Sub1_Sub3_9.method257(200);
							this.aClass1_Sub1_Sub3_9.method259(25501);
							anInt1000 = 0;
						}
						this.aClass1_Sub1_Sub3_9.method257(43);
						this.aClass1_Sub1_Sub3_9.method291(local23);
						this.aClass1_Sub1_Sub3_9.method292(local33);
						this.aClass1_Sub1_Sub3_9.method292(local18);
						this.anInt1025 = 0;
						this.anInt1026 = local23;
						this.anInt1027 = local18;
						this.anInt1028 = 2;
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
							this.anInt1028 = 1;
						}
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
							this.anInt1028 = 3;
						}
					}
					if (local28 == 543) {
						this.aClass1_Sub1_Sub3_9.method257(237);
						this.aClass1_Sub1_Sub3_9.method259(local18);
						this.aClass1_Sub1_Sub3_9.method292(local33);
						this.aClass1_Sub1_Sub3_9.method259(local23);
						this.aClass1_Sub1_Sub3_9.method292(this.anInt989);
						this.anInt1025 = 0;
						this.anInt1026 = local23;
						this.anInt1027 = local18;
						this.anInt1028 = 2;
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
							this.anInt1028 = 1;
						}
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
							this.anInt1028 = 3;
						}
					}
					if (local28 == 606) {
						local817 = this.aStringArray13[arg0];
						local821 = local817.indexOf("@whi@");
						if (local821 != -1) {
							if (this.anInt851 == -1) {
								this.method711();
								this.aString18 = local817.substring(local821 + 5).trim();
								this.aBoolean247 = false;
								for (@Pc(2774) int local2774 = 0; local2774 < Class10.aClass10Array1.length; local2774++) {
									if (Class10.aClass10Array1[local2774] != null && Class10.aClass10Array1[local2774].anInt314 == 600) {
										this.anInt1001 = this.anInt851 = Class10.aClass10Array1[local2774].anInt326;
										break;
									}
								}
							} else {
								this.method641("Please close the interface you have open before using 'report abuse'", 0, "", this.aBoolean231);
							}
						}
					}
					if (local28 == 491) {
						local452 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local452 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local452.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local452.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							this.aClass1_Sub1_Sub3_9.method257(14);
							this.aClass1_Sub1_Sub3_9.method292(this.anInt1049);
							this.aClass1_Sub1_Sub3_9.method259(local33);
							this.aClass1_Sub1_Sub3_9.method259(this.anInt1050);
							this.aClass1_Sub1_Sub3_9.method291(this.anInt1048);
						}
					}
					if (local28 == 639) {
						local817 = this.aStringArray13[arg0];
						local821 = local817.indexOf("@whi@");
						if (local821 != -1) {
							local832 = Class50.method559(local817.substring(local821 + 5).trim());
							local1006 = -1;
							for (@Pc(2915) int local2915 = 0; local2915 < this.anInt873; local2915++) {
								if (this.aLongArray4[local2915] == local832) {
									local1006 = local2915;
									break;
								}
							}
							if (local1006 != -1 && this.anIntArray212[local1006] > 0) {
								this.aBoolean253 = true;
								this.anInt1019 = 0;
								this.aBoolean261 = true;
								this.aString27 = "";
								this.anInt955 = 3;
								this.aLong30 = this.aLongArray4[local1006];
								this.aString22 = "Enter message to send to " + this.aStringArray11[local1006];
							}
						}
					}
					if (local28 == 454) {
						this.aClass1_Sub1_Sub3_9.method257(41);
						this.aClass1_Sub1_Sub3_9.method259(local33);
						this.aClass1_Sub1_Sub3_9.method292(local18);
						this.aClass1_Sub1_Sub3_9.method292(local23);
						this.anInt1025 = 0;
						this.anInt1026 = local23;
						this.anInt1027 = local18;
						this.anInt1028 = 2;
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt851) {
							this.anInt1028 = 1;
						}
						if (Class10.aClass10Array1[local23].anInt326 == this.anInt1044) {
							this.anInt1028 = 3;
						}
					}
					if (local28 == 478) {
						local45 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local45 != null) {
							this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local45.anIntArray46[0], aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local45.anIntArray45[0]);
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							if ((local33 & 0x3) == 0) {
								anInt994++;
							}
							if (anInt994 >= 53) {
								this.aClass1_Sub1_Sub3_9.method257(85);
								this.aClass1_Sub1_Sub3_9.method258(66);
								anInt994 = 0;
							}
							this.aClass1_Sub1_Sub3_9.method257(18);
							this.aClass1_Sub1_Sub3_9.method291(local33);
						}
					}
					if (local28 == 113) {
						this.method630(local33, local23, local18);
						this.aClass1_Sub1_Sub3_9.method257(70);
						this.aClass1_Sub1_Sub3_9.method291(local18 + this.anInt936);
						this.aClass1_Sub1_Sub3_9.method259(local23 + this.anInt937);
						this.aClass1_Sub1_Sub3_9.method293(local33 >> 14 & 0x7FFF);
					}
					if (local28 == 872) {
						this.method630(local33, local23, local18);
						this.aClass1_Sub1_Sub3_9.method257(234);
						this.aClass1_Sub1_Sub3_9.method293(local18 + this.anInt936);
						this.aClass1_Sub1_Sub3_9.method292(local33 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_9.method293(local23 + this.anInt937);
					}
					if (local28 == 502) {
						this.method630(local33, local23, local18);
						this.aClass1_Sub1_Sub3_9.method257(132);
						this.aClass1_Sub1_Sub3_9.method293(local18 + this.anInt936);
						this.aClass1_Sub1_Sub3_9.method259(local33 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_9.method292(local23 + this.anInt937);
					}
					@Pc(3235) Class9 local3235;
					if (local28 == 1125) {
						local3235 = Class9.method118(local33);
						@Pc(3239) Class10 local3239 = Class10.aClass10Array1[local23];
						if (local3239 != null && local3239.anIntArray60[local18] >= 100000) {
							local1272 = local3239.anIntArray60[local18] + " x " + local3235.aString4;
						} else if (local3235.aByteArray2 == null) {
							local1272 = "It's a " + local3235.aString4 + ".";
						} else {
							local1272 = new String(local3235.aByteArray2);
						}
						this.method641(local1272, 0, "", this.aBoolean231);
					}
					if (local28 == 169) {
						this.aClass1_Sub1_Sub3_9.method257(185);
						this.aClass1_Sub1_Sub3_9.method259(local23);
						local423 = Class10.aClass10Array1[local23];
						if (local423.anIntArrayArray2 != null && local423.anIntArrayArray2[0][0] == 5) {
							local821 = local423.anIntArrayArray2[0][1];
							this.anIntArray231[local821] = 1 - this.anIntArray231[local821];
							this.method597(local821);
							this.aBoolean244 = true;
						}
					}
					if (local28 == 447) {
						this.anInt1047 = 1;
						this.anInt1048 = local18;
						this.anInt1049 = local23;
						this.anInt1050 = local33;
						this.aString30 = Class9.method118(local33).aString4;
						this.anInt988 = 0;
						this.aBoolean244 = true;
					} else {
						if (local28 == 1226) {
							@Pc(3380) int local3380 = local33 >> 14 & 0x7FFF;
							@Pc(3383) Class46 local3383 = Class46.method515(local3380);
							if (local3383.aByteArray20 == null) {
								local1002 = "It's a " + local3383.aString16 + ".";
							} else {
								local1002 = new String(local3383.aByteArray20);
							}
							this.method641(local1002, 0, "", this.aBoolean231);
						}
						if (local28 == 244) {
							local140 = this.method649(2, 0, 0, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
							if (!local140) {
								this.method649(2, 0, 1, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 1, 0, local23, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], false, local18);
							}
							this.anInt877 = super.anInt833;
							this.anInt878 = super.anInt834;
							this.anInt880 = 2;
							this.anInt879 = 0;
							this.aClass1_Sub1_Sub3_9.method257(253);
							this.aClass1_Sub1_Sub3_9.method291(local18 + this.anInt936);
							this.aClass1_Sub1_Sub3_9.method293(local23 + this.anInt937);
							this.aClass1_Sub1_Sub3_9.method292(local33);
						}
						if (local28 == 1448) {
							local3235 = Class9.method118(local33);
							if (local3235.aByteArray2 == null) {
								local1272 = "It's a " + local3235.aString4 + ".";
							} else {
								local1272 = new String(local3235.aByteArray2);
							}
							this.method641(local1272, 0, "", this.aBoolean231);
						}
						this.anInt1047 = 0;
						this.anInt988 = 0;
						this.aBoolean244 = true;
					}
				}
			}
		} catch (@Pc(3548) RuntimeException local3548) {
			signlink.reporterror("53, " + arg0 + ", " + false + ", " + local3548.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method634(@OriginalArg(0) int arg0) {
		try {
			this.anInt1031 = 0;
			@Pc(10) int local10 = (aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 >> 7) + this.anInt936;
			@Pc(18) int local18 = (aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 >> 7) + this.anInt937;
			@Pc(22) boolean local22 = false;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt1031 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt1031 = 1;
			}
			if (this.anInt1031 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt1031 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("12723, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean222) {
			this.method700();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method635() {
		try {
			if (this.anInt1047 == 0 && this.anInt988 == 0) {
				this.aStringArray13[this.anInt985] = "Walk here";
				this.anIntArray252[this.anInt985] = 516;
				this.anIntArray250[this.anInt985] = super.anInt827;
				this.anIntArray251[this.anInt985] = super.anInt828;
				this.anInt985++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub2_Sub6.anInt814; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub2_Sub6.anIntArray205[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass27_1.method347(this.anInt881, local53, local59, local49) >= 0) {
						@Pc(91) Class46 local91 = Class46.method515(local71);
						if (local91.anIntArray163 != null) {
							local91 = local91.method523();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt1047 == 1) {
							this.aStringArray13[this.anInt985] = "Use " + this.aString30 + " with @cya@" + local91.aString16;
							this.anIntArray252[this.anInt985] = 62;
							this.anIntArray253[this.anInt985] = local49;
							this.anIntArray250[this.anInt985] = local53;
							this.anIntArray251[this.anInt985] = local59;
							this.anInt985++;
						} else if (this.anInt988 != 1) {
							if (local91.aStringArray7 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray7[local218] != null) {
										this.aStringArray13[this.anInt985] = local91.aStringArray7[local218] + " @cya@" + local91.aString16;
										if (local218 == 0) {
											this.anIntArray252[this.anInt985] = 502;
										}
										if (local218 == 1) {
											this.anIntArray252[this.anInt985] = 900;
										}
										if (local218 == 2) {
											this.anIntArray252[this.anInt985] = 113;
										}
										if (local218 == 3) {
											this.anIntArray252[this.anInt985] = 872;
										}
										if (local218 == 4) {
											this.anIntArray252[this.anInt985] = 1062;
										}
										this.anIntArray253[this.anInt985] = local49;
										this.anIntArray250[this.anInt985] = local53;
										this.anIntArray251[this.anInt985] = local59;
										this.anInt985++;
									}
								}
							}
							this.aStringArray13[this.anInt985] = "Examine @cya@" + local91.aString16;
							this.anIntArray252[this.anInt985] = 1226;
							this.anIntArray253[this.anInt985] = local91.anInt752 << 14;
							this.anIntArray250[this.anInt985] = local53;
							this.anIntArray251[this.anInt985] = local59;
							this.anInt985++;
						} else if ((this.anInt990 & 0x4) == 4) {
							this.aStringArray13[this.anInt985] = this.aString23 + " @cya@" + local91.aString16;
							this.anIntArray252[this.anInt985] = 956;
							this.anIntArray253[this.anInt985] = local49;
							this.anIntArray250[this.anInt985] = local53;
							this.anIntArray251[this.anInt985] = local59;
							this.anInt985++;
						}
					}
					@Pc(398) Class1_Sub1_Sub2_Sub1_Sub1 local398;
					@Pc(446) Class1_Sub1_Sub2_Sub1_Sub2 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class1_Sub1_Sub2_Sub1_Sub1 local369 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local71];
						if (local369.aClass6_1.aByte1 == 1 && (local369.anInt268 & 0x7F) == 64 && (local369.anInt269 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt840; local218++) {
								local398 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray215[local218]];
								if (local398 != null && local398 != local369 && local398.aClass6_1.aByte1 == 1 && local398.anInt268 == local369.anInt268 && local398.anInt269 == local369.anInt269) {
									this.method651(local398.aClass6_1, this.anIntArray215[local218], local59, local53);
								}
							}
							for (local436 = 0; local436 < this.anInt868; local436++) {
								local446 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray223[local436]];
								if (local446 != null && local446.anInt268 == local369.anInt268 && local446.anInt269 == local369.anInt269) {
									this.method652(local53, this.anIntArray223[local436], local446, local59);
								}
							}
						}
						this.method651(local369.aClass6_1, local71, local59, local53);
					}
					if (local65 == 0) {
						@Pc(488) Class1_Sub1_Sub2_Sub1_Sub2 local488 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local71];
						if ((local488.anInt268 & 0x7F) == 64 && (local488.anInt269 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt840; local218++) {
								local398 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray215[local218]];
								if (local398 != null && local398.aClass6_1.aByte1 == 1 && local398.anInt268 == local488.anInt268 && local398.anInt269 == local488.anInt269) {
									this.method651(local398.aClass6_1, this.anIntArray215[local218], local59, local53);
								}
							}
							for (local436 = 0; local436 < this.anInt868; local436++) {
								local446 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray223[local436]];
								if (local446 != null && local446 != local488 && local446.anInt268 == local488.anInt268 && local446.anInt269 == local488.anInt269) {
									this.method652(local53, this.anIntArray223[local436], local446, local59);
								}
							}
						}
						this.method652(local53, local71, local488, local59);
					}
					if (local65 == 3) {
						@Pc(607) Class21 local607 = this.aClass21ArrayArrayArray1[this.anInt881][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class1_Sub1_Sub2_Sub2 local614 = (Class1_Sub1_Sub2_Sub2) local607.method247(); local614 != null; local614 = (Class1_Sub1_Sub2_Sub2) local607.method249()) {
								@Pc(620) Class9 local620 = Class9.method118(local614.anInt390);
								if (this.anInt1047 == 1) {
									this.aStringArray13[this.anInt985] = "Use " + this.aString30 + " with @lre@" + local620.aString4;
									this.anIntArray252[this.anInt985] = 511;
									this.anIntArray253[this.anInt985] = local614.anInt390;
									this.anIntArray250[this.anInt985] = local53;
									this.anIntArray251[this.anInt985] = local59;
									this.anInt985++;
								} else if (this.anInt988 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray2 != null && local620.aStringArray2[local737] != null) {
											this.aStringArray13[this.anInt985] = local620.aStringArray2[local737] + " @lre@" + local620.aString4;
											if (local737 == 0) {
												this.anIntArray252[this.anInt985] = 652;
											}
											if (local737 == 1) {
												this.anIntArray252[this.anInt985] = 567;
											}
											if (local737 == 2) {
												this.anIntArray252[this.anInt985] = 234;
											}
											if (local737 == 3) {
												this.anIntArray252[this.anInt985] = 244;
											}
											if (local737 == 4) {
												this.anIntArray252[this.anInt985] = 213;
											}
											this.anIntArray253[this.anInt985] = local614.anInt390;
											this.anIntArray250[this.anInt985] = local53;
											this.anIntArray251[this.anInt985] = local59;
											this.anInt985++;
										} else if (local737 == 2) {
											this.aStringArray13[this.anInt985] = "Take @lre@" + local620.aString4;
											this.anIntArray252[this.anInt985] = 234;
											this.anIntArray253[this.anInt985] = local614.anInt390;
											this.anIntArray250[this.anInt985] = local53;
											this.anIntArray251[this.anInt985] = local59;
											this.anInt985++;
										}
									}
									this.aStringArray13[this.anInt985] = "Examine @lre@" + local620.aString4;
									this.anIntArray252[this.anInt985] = 1448;
									this.anIntArray253[this.anInt985] = local614.anInt390;
									this.anIntArray250[this.anInt985] = local53;
									this.anIntArray251[this.anInt985] = local59;
									this.anInt985++;
								} else if ((this.anInt990 & 0x1) == 1) {
									this.aStringArray13[this.anInt985] = this.aString23 + " @lre@" + local620.aString4;
									this.anIntArray252[this.anInt985] = 94;
									this.anIntArray253[this.anInt985] = local614.anInt390;
									this.anIntArray250[this.anInt985] = local53;
									this.anIntArray251[this.anInt985] = local59;
									this.anInt985++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(952) RuntimeException local952) {
			signlink.reporterror("26026, " + 33660 + ", " + local952.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method572(@OriginalArg(0) int arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass26_1 != null) {
					this.aClass26_1.method310();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass26_1 = null;
			this.method579();
			if (this.aClass48_1 != null) {
				this.aClass48_1.aBoolean205 = false;
			}
			this.aClass48_1 = null;
			this.aClass14_Sub1_1.method185();
			this.aClass14_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_6 = null;
			this.aClass1_Sub1_Sub3_9 = null;
			this.aClass1_Sub1_Sub3_7 = null;
			this.aClass1_Sub1_Sub3_8 = null;
			this.anIntArray266 = null;
			this.aByteArrayArray4 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray267 = null;
			this.anIntArray268 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass27_1 = null;
			this.aClass12Array1 = null;
			this.anIntArrayArray23 = null;
			this.anIntArrayArray22 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.aByteArray21 = null;
			this.aClass17_24 = null;
			this.aClass17_25 = null;
			this.aClass17_26 = null;
			this.aClass17_27 = null;
			this.aClass17_21 = null;
			this.aClass17_22 = null;
			this.aClass17_23 = null;
			this.aClass17_3 = null;
			this.aClass17_4 = null;
			this.aClass17_5 = null;
			this.aClass17_6 = null;
			this.aClass17_7 = null;
			this.aClass17_8 = null;
			this.aClass17_9 = null;
			this.aClass17_10 = null;
			this.aClass17_11 = null;
			this.aClass1_Sub1_Sub1_Sub2_18 = null;
			this.aClass1_Sub1_Sub1_Sub2_19 = null;
			this.aClass1_Sub1_Sub1_Sub2_20 = null;
			this.aClass1_Sub1_Sub1_Sub2_10 = null;
			this.aClass1_Sub1_Sub1_Sub2_11 = null;
			this.aClass1_Sub1_Sub1_Sub2_12 = null;
			this.aClass1_Sub1_Sub1_Sub2Array2 = null;
			this.aClass1_Sub1_Sub1_Sub2_13 = null;
			this.aClass1_Sub1_Sub1_Sub2_14 = null;
			this.aClass1_Sub1_Sub1_Sub2_15 = null;
			this.aClass1_Sub1_Sub1_Sub2_16 = null;
			this.aClass1_Sub1_Sub1_Sub2_17 = null;
			this.aClass1_Sub1_Sub1_Sub2_1 = null;
			this.aClass1_Sub1_Sub1_Sub2_2 = null;
			this.aClass1_Sub1_Sub1_Sub2_3 = null;
			this.aClass1_Sub1_Sub1_Sub2_4 = null;
			this.aClass1_Sub1_Sub1_Sub2_5 = null;
			this.aClass1_Sub1_Sub1_Sub1_13 = null;
			this.aClass1_Sub1_Sub1_Sub1Array4 = null;
			this.aClass1_Sub1_Sub1_Sub1Array6 = null;
			this.aClass1_Sub1_Sub1_Sub1Array8 = null;
			this.aClass1_Sub1_Sub1_Sub1_8 = null;
			this.aClass1_Sub1_Sub1_Sub1_9 = null;
			this.aClass1_Sub1_Sub1_Sub1_10 = null;
			this.aClass1_Sub1_Sub1_Sub1_11 = null;
			this.aClass1_Sub1_Sub1_Sub1_12 = null;
			this.aClass1_Sub1_Sub1_Sub2Array3 = null;
			this.aClass1_Sub1_Sub1_Sub1Array5 = null;
			this.anIntArrayArray24 = null;
			this.aClass1_Sub1_Sub2_Sub1_Sub2Array1 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray216 = null;
			this.aClass1_Sub1_Sub2_Sub1_Sub1Array1 = null;
			this.anIntArray215 = null;
			this.aClass21ArrayArrayArray1 = null;
			this.aClass21_12 = null;
			@Pc(253) boolean local253 = false;
			this.aClass21_10 = null;
			this.aClass21_11 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.anIntArray252 = null;
			this.anIntArray253 = null;
			this.aStringArray13 = null;
			this.anIntArray231 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			this.aClass1_Sub1_Sub1_Sub1Array7 = null;
			this.aClass1_Sub1_Sub1_Sub1_16 = null;
			this.aStringArray11 = null;
			this.aLongArray4 = null;
			this.anIntArray212 = null;
			this.aClass17_15 = null;
			this.aClass17_16 = null;
			this.aClass17_12 = null;
			this.aClass17_13 = null;
			this.aClass17_14 = null;
			this.aClass17_17 = null;
			this.aClass17_18 = null;
			this.aClass17_19 = null;
			this.aClass17_20 = null;
			this.method682();
			Class46.method518();
			Class6.method33();
			Class9.method111();
			Class24.aClass24Array1 = null;
			Class39.aClass39Array1 = null;
			Class10.aClass10Array1 = null;
			Class29.aClass29Array1 = null;
			Class22.aClass22Array1 = null;
			Class25.aClass25Array1 = null;
			Class25.aClass13_7 = null;
			Class42.aClass42Array1 = null;
			super.aClass17_2 = null;
			Class1_Sub1_Sub2_Sub1_Sub2.aClass13_4 = null;
			Class1_Sub1_Sub1_Sub3.method387();
			Class27.method316();
			Class1_Sub1_Sub2_Sub6.method530();
			Class37.method454();
			System.gc();
		} catch (@Pc(371) RuntimeException local371) {
			signlink.reporterror("35760, " + arg0 + ", " + local371.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method636(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1010);
			if (this.aClass14_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass14_Sub1_1.anInt377);
			}
			System.out.println("loop-cycle:" + anInt995);
			System.out.println("draw-cycle:" + anInt952);
			System.out.println("ptype:" + this.anInt923);
			@Pc(59) boolean local59 = false;
			System.out.println("psize:" + this.anInt922);
			if (this.aClass26_1 != null) {
				this.aClass26_1.method315();
			}
			super.aBoolean215 = true;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("16696, " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method575() {
		try {
			this.anInt922 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("60139, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method637(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(9) int local9;
				do {
					while (true) {
						local9 = this.method569();
						if (local9 == -1) {
							return;
						}
						if (this.anInt851 != -1 && this.anInt851 == this.anInt1001) {
							if (local9 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							}
							break;
						}
						@Pc(189) int local189;
						if (this.aBoolean261) {
							if (local9 >= 32 && local9 <= 122 && this.aString27.length() < 80) {
								this.aString27 = this.aString27 + (char) local9;
								this.aBoolean253 = true;
							}
							if (local9 == 8 && this.aString27.length() > 0) {
								this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
								this.aBoolean253 = true;
							}
							if (local9 == 13 || local9 == 10) {
								this.aBoolean261 = false;
								this.aBoolean253 = true;
								@Pc(149) long local149;
								if (this.anInt955 == 1) {
									local149 = Class50.method559(this.aString27);
									this.method605(local149);
								}
								if (this.anInt955 == 2 && this.anInt873 > 0) {
									local149 = Class50.method559(this.aString27);
									this.method599(local149);
								}
								if (this.anInt955 == 3 && this.aString27.length() > 0) {
									this.aClass1_Sub1_Sub3_9.method257(126);
									this.aClass1_Sub1_Sub3_9.method258(0);
									local189 = this.aClass1_Sub1_Sub3_9.anInt468;
									this.aClass1_Sub1_Sub3_9.method264(this.aLong30);
									Class36.method450(this.aString27, this.aBoolean262, this.aClass1_Sub1_Sub3_9);
									this.aClass1_Sub1_Sub3_9.method267(this.aClass1_Sub1_Sub3_9.anInt468 - local189);
									this.aString27 = Class36.method451(this.aString27);
									this.aString27 = Class35.method421(this.aString27);
									this.method641(this.aString27, 6, Class50.method563(Class50.method560(this.aLong30)), this.aBoolean231);
									if (this.anInt846 == 2) {
										this.anInt846 = 1;
										this.aBoolean257 = true;
										this.aClass1_Sub1_Sub3_9.method257(95);
										this.aClass1_Sub1_Sub3_9.method258(this.anInt1051);
										this.aClass1_Sub1_Sub3_9.method258(this.anInt846);
										this.aClass1_Sub1_Sub3_9.method258(this.anInt1029);
									}
								}
								if (this.anInt955 == 4 && this.anInt838 < 100) {
									local149 = Class50.method559(this.aString27);
									this.method677(local149);
								}
								if (this.anInt955 == 5 && this.anInt838 > 0) {
									local149 = Class50.method559(this.aString27);
									this.method686(local149);
								}
							}
						} else if (this.anInt1019 == 1) {
							if (local9 >= 48 && local9 <= 57 && this.aString20.length() < 10) {
								this.aString20 = this.aString20 + (char) local9;
								this.aBoolean253 = true;
							}
							if (local9 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
								this.aBoolean253 = true;
							}
							if (local9 == 13 || local9 == 10) {
								if (this.aString20.length() > 0) {
									local189 = 0;
									try {
										local189 = Integer.parseInt(this.aString20);
									} catch (@Pc(368) Exception local368) {
									}
									this.aClass1_Sub1_Sub3_9.method257(208);
									this.aClass1_Sub1_Sub3_9.method262(local189);
								}
								this.anInt1019 = 0;
								this.aBoolean253 = true;
							}
						} else if (this.anInt1019 == 2) {
							if (local9 >= 32 && local9 <= 122 && this.aString20.length() < 12) {
								this.aString20 = this.aString20 + (char) local9;
								this.aBoolean253 = true;
							}
							if (local9 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
								this.aBoolean253 = true;
							}
							if (local9 == 13 || local9 == 10) {
								if (this.aString20.length() > 0) {
									this.aClass1_Sub1_Sub3_9.method257(60);
									this.aClass1_Sub1_Sub3_9.method264(Class50.method559(this.aString20));
								}
								this.anInt1019 = 0;
								this.aBoolean253 = true;
							}
						} else if (this.anInt1044 == -1) {
							if (local9 >= 32 && local9 <= 122 && this.aString19.length() < 80) {
								this.aString19 = this.aString19 + (char) local9;
								this.aBoolean253 = true;
							}
							if (local9 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
								this.aBoolean253 = true;
							}
							if ((local9 == 13 || local9 == 10) && this.aString19.length() > 0) {
								if (this.anInt857 == 2) {
									if (this.aString19.equals("::clientdrop")) {
										this.method632();
									}
									if (this.aString19.equals("::lag")) {
										this.method636((byte) 1);
									}
									if (this.aString19.equals("::prefetchmusic")) {
										for (local189 = 0; local189 < this.aClass14_Sub1_1.method187(2); local189++) {
											this.aClass14_Sub1_1.method195((byte) 1, 2, local189, (byte) 8);
										}
									}
									if (this.aString19.equals("::fpson")) {
										aBoolean245 = true;
									}
									if (this.aString19.equals("::fpsoff")) {
										aBoolean245 = false;
									}
									if (this.aString19.equals("::noclip")) {
										for (local189 = 0; local189 < 4; local189++) {
											for (@Pc(596) int local596 = 1; local596 < 103; local596++) {
												for (@Pc(600) int local600 = 1; local600 < 103; local600++) {
													this.aClass12Array1[local189].anIntArrayArray3[local596][local600] = 0;
												}
											}
										}
									}
								}
								if (this.aString19.startsWith("::")) {
									this.aClass1_Sub1_Sub3_9.method257(103);
									this.aClass1_Sub1_Sub3_9.method258(this.aString19.length() - 1);
									this.aClass1_Sub1_Sub3_9.method265(this.aString19.substring(2));
								} else {
									@Pc(655) String local655 = this.aString19.toLowerCase();
									@Pc(657) byte local657 = 0;
									if (local655.startsWith("yellow:")) {
										local657 = 0;
										this.aString19 = this.aString19.substring(7);
									} else if (local655.startsWith("red:")) {
										local657 = 1;
										this.aString19 = this.aString19.substring(4);
									} else if (local655.startsWith("green:")) {
										local657 = 2;
										this.aString19 = this.aString19.substring(6);
									} else if (local655.startsWith("cyan:")) {
										local657 = 3;
										this.aString19 = this.aString19.substring(5);
									} else if (local655.startsWith("purple:")) {
										local657 = 4;
										this.aString19 = this.aString19.substring(7);
									} else if (local655.startsWith("white:")) {
										local657 = 5;
										this.aString19 = this.aString19.substring(6);
									} else if (local655.startsWith("flash1:")) {
										local657 = 6;
										this.aString19 = this.aString19.substring(7);
									} else if (local655.startsWith("flash2:")) {
										local657 = 7;
										this.aString19 = this.aString19.substring(7);
									} else if (local655.startsWith("flash3:")) {
										local657 = 8;
										this.aString19 = this.aString19.substring(7);
									} else if (local655.startsWith("glow1:")) {
										local657 = 9;
										this.aString19 = this.aString19.substring(6);
									} else if (local655.startsWith("glow2:")) {
										local657 = 10;
										this.aString19 = this.aString19.substring(6);
									} else if (local655.startsWith("glow3:")) {
										local657 = 11;
										this.aString19 = this.aString19.substring(6);
									}
									local655 = this.aString19.toLowerCase();
									@Pc(829) byte local829 = 0;
									if (local655.startsWith("wave:")) {
										local829 = 1;
										this.aString19 = this.aString19.substring(5);
									} else if (local655.startsWith("wave2:")) {
										local829 = 2;
										this.aString19 = this.aString19.substring(6);
									} else if (local655.startsWith("shake:")) {
										local829 = 3;
										this.aString19 = this.aString19.substring(6);
									} else if (local655.startsWith("scroll:")) {
										local829 = 4;
										this.aString19 = this.aString19.substring(7);
									} else if (local655.startsWith("slide:")) {
										local829 = 5;
										this.aString19 = this.aString19.substring(6);
									}
									this.aClass1_Sub1_Sub3_9.method257(4);
									this.aClass1_Sub1_Sub3_9.method258(0);
									@Pc(910) int local910 = this.aClass1_Sub1_Sub3_9.anInt468;
									this.aClass1_Sub1_Sub3_9.method285(301, local829);
									this.aClass1_Sub1_Sub3_9.method285(301, local657);
									this.aClass1_Sub1_Sub3_6.anInt468 = 0;
									Class36.method450(this.aString19, this.aBoolean262, this.aClass1_Sub1_Sub3_6);
									this.aClass1_Sub1_Sub3_9.method301(this.aByte34, this.aClass1_Sub1_Sub3_6.aByteArray10, this.aClass1_Sub1_Sub3_6.anInt468);
									this.aClass1_Sub1_Sub3_9.method267(this.aClass1_Sub1_Sub3_9.anInt468 - local910);
									this.aString19 = Class36.method451(this.aString19);
									this.aString19 = Class35.method421(this.aString19);
									aClass1_Sub1_Sub2_Sub1_Sub2_1.aString5 = this.aString19;
									aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt235 = local657;
									aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt250 = local829;
									aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt254 = 150;
									if (this.anInt857 == 2) {
										this.method641(aClass1_Sub1_Sub2_Sub1_Sub2_1.aString5, 2, "@cr2@" + aClass1_Sub1_Sub2_Sub1_Sub2_1.aString6, this.aBoolean231);
									} else if (this.anInt857 == 1) {
										this.method641(aClass1_Sub1_Sub2_Sub1_Sub2_1.aString5, 2, "@cr1@" + aClass1_Sub1_Sub2_Sub1_Sub2_1.aString6, this.aBoolean231);
									} else {
										this.method641(aClass1_Sub1_Sub2_Sub1_Sub2_1.aString5, 2, aClass1_Sub1_Sub2_Sub1_Sub2_1.aString6, this.aBoolean231);
									}
									if (this.anInt1051 == 2) {
										this.anInt1051 = 3;
										this.aBoolean257 = true;
										this.aClass1_Sub1_Sub3_9.method257(95);
										this.aClass1_Sub1_Sub3_9.method258(this.anInt1051);
										this.aClass1_Sub1_Sub3_9.method258(this.anInt846);
										this.aClass1_Sub1_Sub3_9.method258(this.anInt1029);
									}
								}
								this.aString19 = "";
								this.aBoolean253 = true;
							}
						}
					}
				} while ((local9 < 97 || local9 > 122) && (local9 < 65 || local9 > 90) && (local9 < 48 || local9 > 57) && local9 != 32);
				if (this.aString18.length() < 12) {
					this.aString18 = this.aString18 + (char) local9;
				}
			}
		} catch (@Pc(1068) RuntimeException local1068) {
			signlink.reporterror("88130, " + arg0 + ", " + local1068.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V")
	private void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt841 != 9) {
				this.anInt841 = this.aClass19_2.method227();
			}
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
				if (this.aStringArray9[local12] != null) {
					@Pc(24) int local24 = this.anIntArray227[local12];
					@Pc(35) int local35 = this.anInt968 + 70 + 4 - local10 * 14;
					if (local35 < -20) {
						break;
					}
					@Pc(43) String local43 = this.aStringArray8[local12];
					if (local43 != null && local43.startsWith("@cr1@")) {
						local43 = local43.substring(5);
					}
					if (local43 != null && local43.startsWith("@cr2@")) {
						local43 = local43.substring(5);
					}
					if (local24 == 0) {
						local10++;
					}
					if ((local24 == 1 || local24 == 2) && (local24 == 1 || this.anInt1051 == 0 || this.anInt1051 == 1 && this.method673(local43))) {
						if (arg1 > local35 - 14 && arg1 <= local35 && !local43.equals(aClass1_Sub1_Sub2_Sub1_Sub2_1.aString6)) {
							if (this.anInt857 >= 1) {
								this.aStringArray13[this.anInt985] = "Report abuse @whi@" + local43;
								this.anIntArray252[this.anInt985] = 606;
								this.anInt985++;
							}
							this.aStringArray13[this.anInt985] = "Add ignore @whi@" + local43;
							this.anIntArray252[this.anInt985] = 42;
							this.anInt985++;
							this.aStringArray13[this.anInt985] = "Add friend @whi@" + local43;
							this.anIntArray252[this.anInt985] = 337;
							this.anInt985++;
						}
						local10++;
					}
					if ((local24 == 3 || local24 == 7) && this.anInt1009 == 0 && (local24 == 7 || this.anInt846 == 0 || this.anInt846 == 1 && this.method673(local43))) {
						if (arg1 > local35 - 14 && arg1 <= local35) {
							if (this.anInt857 >= 1) {
								this.aStringArray13[this.anInt985] = "Report abuse @whi@" + local43;
								this.anIntArray252[this.anInt985] = 606;
								this.anInt985++;
							}
							this.aStringArray13[this.anInt985] = "Add ignore @whi@" + local43;
							this.anIntArray252[this.anInt985] = 42;
							this.anInt985++;
							this.aStringArray13[this.anInt985] = "Add friend @whi@" + local43;
							this.anIntArray252[this.anInt985] = 337;
							this.anInt985++;
						}
						local10++;
					}
					if (local24 == 4 && (this.anInt1029 == 0 || this.anInt1029 == 1 && this.method673(local43))) {
						if (arg1 > local35 - 14 && arg1 <= local35) {
							this.aStringArray13[this.anInt985] = "Accept trade @whi@" + local43;
							this.anIntArray252[this.anInt985] = 484;
							this.anInt985++;
						}
						local10++;
					}
					if ((local24 == 5 || local24 == 6) && this.anInt1009 == 0 && this.anInt846 < 2) {
						local10++;
					}
					if (local24 == 8 && (this.anInt1029 == 0 || this.anInt1029 == 1 && this.method673(local43))) {
						if (arg1 > local35 - 14 && arg1 <= local35) {
							this.aStringArray13[this.anInt985] = "Accept challenge @whi@" + local43;
							this.anIntArray252[this.anInt985] = 6;
							this.anInt985++;
						}
						local10++;
					}
				}
			}
		} catch (@Pc(408) RuntimeException local408) {
			signlink.reporterror("86869, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local408.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!DUCMKFAY;)V")
	private void method639(@OriginalArg(1) Class10 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt314;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local66 = this.anInt873;
					if (this.anInt874 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString11 = "";
						arg0.anInt316 = 0;
					} else {
						if (this.anIntArray212[local4] == 0) {
							arg0.aString11 = "@red@Offline";
						} else if (this.anIntArray212[local4] == anInt901) {
							arg0.aString11 = "@gre@World-" + (this.anIntArray212[local4] - 9);
						} else {
							arg0.aString11 = "@yel@World-" + (this.anIntArray212[local4] - 9);
						}
						arg0.anInt316 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt873;
					if (this.anInt874 != 2) {
						local66 = 0;
					}
					arg0.anInt336 = local66 * 15 + 20;
					if (arg0.anInt336 <= arg0.anInt340) {
						arg0.anInt336 = arg0.anInt340 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt874 == 0) {
						arg0.aString11 = "Loading ignore list";
						arg0.anInt316 = 0;
					} else if (local4 == 1 && this.anInt874 == 0) {
						arg0.aString11 = "Please wait...";
						arg0.anInt316 = 0;
					} else {
						local66 = this.anInt838;
						if (this.anInt874 == 0) {
							local66 = 0;
						}
						if (local4 >= local66) {
							arg0.aString11 = "";
							arg0.anInt316 = 0;
						} else {
							arg0.aString11 = Class50.method563(Class50.method560(this.aLongArray3[local4]));
							arg0.anInt316 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt336 = this.anInt838 * 15 + 20;
					if (arg0.anInt336 <= arg0.anInt340) {
						arg0.anInt336 = arg0.anInt340 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt342 = 150;
					arg0.anInt343 = (int) (Math.sin((double) anInt995 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean235) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(335) int local335 = this.anIntArray246[local66];
							if (local335 >= 0 && !Class39.aClass39Array1[local335].method467((byte) 2)) {
								return;
							}
						}
						this.aBoolean235 = false;
						@Pc(354) Class1_Sub1_Sub2_Sub6[] local354 = new Class1_Sub1_Sub2_Sub6[7];
						@Pc(356) int local356 = 0;
						for (@Pc(358) int local358 = 0; local358 < 7; local358++) {
							@Pc(365) int local365 = this.anIntArray246[local358];
							if (local365 >= 0) {
								local354[local356++] = Class39.aClass39Array1[local365].method468();
							}
						}
						@Pc(387) Class1_Sub1_Sub2_Sub6 local387 = new Class1_Sub1_Sub2_Sub6(local356, local354, -38);
						for (@Pc(389) int local389 = 0; local389 < 5; local389++) {
							if (this.anIntArray239[local389] != 0) {
								local387.method548(anIntArrayArray25[local389][0], anIntArrayArray25[local389][this.anIntArray239[local389]]);
								if (local389 == 1) {
									local387.method548(anIntArray262[0], anIntArray262[this.anIntArray239[local389]]);
								}
							}
						}
						local387.method541();
						local387.method542(Class22.aClass22Array1[aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt233].anIntArray76[0]);
						local387.method551(64, 850, -30, -50, -30, true);
						arg0.anInt324 = 5;
						arg0.anInt325 = 0;
						Class10.method161(this.aBoolean233, local387);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub1_Sub1_5 == null) {
						this.aClass1_Sub1_Sub1_Sub1_5 = arg0.aClass1_Sub1_Sub1_Sub1_1;
						this.aClass1_Sub1_Sub1_Sub1_6 = arg0.aClass1_Sub1_Sub1_Sub1_2;
					}
					if (this.aBoolean237) {
						arg0.aClass1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_6;
					} else {
						arg0.aClass1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_5;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub1_Sub1_5 == null) {
						this.aClass1_Sub1_Sub1_Sub1_5 = arg0.aClass1_Sub1_Sub1_Sub1_1;
						this.aClass1_Sub1_Sub1_Sub1_6 = arg0.aClass1_Sub1_Sub1_Sub1_2;
					}
					if (this.aBoolean237) {
						arg0.aClass1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_5;
					} else {
						arg0.aClass1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_6;
					}
				} else if (local4 == 600) {
					arg0.aString11 = this.aString18;
					if (anInt995 % 20 < 10) {
						arg0.aString11 = arg0.aString11 + "|";
					} else {
						arg0.aString11 = arg0.aString11 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt857 < 1) {
							arg0.aString11 = "";
						} else if (this.aBoolean247) {
							arg0.anInt323 = 16711680;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt323 = 16777215;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(596) String local596;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt1008 == 0) {
							arg0.aString11 = "";
						} else {
							if (this.anInt921 == 0) {
								local596 = "earlier today";
							} else if (this.anInt921 == 1) {
								local596 = "yesterday";
							} else {
								local596 = this.anInt921 + " days ago";
							}
							arg0.aString11 = "You last logged in " + local596 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt993 == 0) {
							arg0.aString11 = "0 unread messages";
							arg0.anInt323 = 16776960;
						}
						if (this.anInt993 == 1) {
							arg0.aString11 = "1 unread message";
							arg0.anInt323 = 65280;
						}
						if (this.anInt993 > 1) {
							arg0.aString11 = this.anInt993 + " unread messages";
							arg0.anInt323 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt996 == 201) {
							if (this.anInt982 == 1) {
								arg0.aString11 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString11 = "";
							}
						} else if (this.anInt996 == 200) {
							arg0.aString11 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt996 == 0) {
								local596 = "Earlier today";
							} else if (this.anInt996 == 1) {
								local596 = "Yesterday";
							} else {
								local596 = this.anInt996 + " days ago";
							}
							arg0.aString11 = local596 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt996 == 201) {
							if (this.anInt982 == 1) {
								arg0.aString11 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString11 = "";
							}
						} else if (this.anInt996 == 200) {
							arg0.aString11 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString11 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt996 == 201) {
							if (this.anInt982 == 1) {
								arg0.aString11 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString11 = "";
							}
						} else if (this.anInt996 == 200) {
							arg0.aString11 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString11 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt874 == 0) {
				arg0.aString11 = "Loading friend list";
				arg0.anInt316 = 0;
			} else if (local4 == 1 && this.anInt874 == 1) {
				arg0.aString11 = "Connecting to friendserver";
				arg0.anInt316 = 0;
			} else if (local4 == 2 && this.anInt874 != 2) {
				arg0.aString11 = "Please wait...";
				arg0.anInt316 = 0;
			} else {
				local66 = this.anInt873;
				if (this.anInt874 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString11 = "";
					arg0.anInt316 = 0;
				} else {
					arg0.aString11 = this.aStringArray11[local4];
					arg0.anInt316 = 1;
				}
			}
		} catch (@Pc(804) RuntimeException local804) {
			signlink.reporterror("36496, " + 950 + ", " + arg0 + ", " + local804.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method640() {
		try {
			if (this.anInt1009 != 0) {
				@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = this.aClass1_Sub1_Sub1_Sub4_3;
				if (this.aByte35 != -13) {
					aBoolean256 = !aBoolean256;
				}
				@Pc(18) int local18 = 0;
				if (this.anInt976 != 0) {
					local18 = 1;
				}
				for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
					if (this.aStringArray9[local25] != null) {
						@Pc(37) int local37 = this.anIntArray227[local25];
						@Pc(42) String local42 = this.aStringArray8[local25];
						@Pc(44) byte local44 = 0;
						if (local42 != null && local42.startsWith("@cr1@")) {
							local42 = local42.substring(5);
							local44 = 1;
						}
						if (local42 != null && local42.startsWith("@cr2@")) {
							local42 = local42.substring(5);
							local44 = 2;
						}
						@Pc(95) int local95;
						if ((local37 == 3 || local37 == 7) && (local37 == 7 || this.anInt846 == 0 || this.anInt846 == 1 && this.method673(local42))) {
							local95 = 329 - local18 * 13;
							local6.method504(0, "From", local95, 822, 4);
							local6.method504(65535, "From", local95 - 1, 822, 4);
							@Pc(121) int local121 = local6.method502(this.anInt978, "From ") + 4;
							if (local44 == 1) {
								this.aClass1_Sub1_Sub1_Sub2Array5[0].method155(local121, local95 - 12);
								local121 += 14;
							}
							if (local44 == 2) {
								this.aClass1_Sub1_Sub1_Sub2Array5[1].method155(local121, local95 - 12);
								local121 += 14;
							}
							local6.method504(0, local42 + ": " + this.aStringArray9[local25], local95, 822, local121);
							local6.method504(65535, local42 + ": " + this.aStringArray9[local25], local95 - 1, 822, local121);
							local18++;
							if (local18 >= 5) {
								return;
							}
						}
						if (local37 == 5 && this.anInt846 < 2) {
							local95 = 329 - local18 * 13;
							local6.method504(0, this.aStringArray9[local25], local95, 822, 4);
							local6.method504(65535, this.aStringArray9[local25], local95 - 1, 822, 4);
							local18++;
							if (local18 >= 5) {
								return;
							}
						}
						if (local37 == 6 && this.anInt846 < 2) {
							local95 = 329 - local18 * 13;
							local6.method504(0, "To " + local42 + ": " + this.aStringArray9[local25], local95, 822, 4);
							local6.method504(65535, "To " + local42 + ": " + this.aStringArray9[local25], local95 - 1, 822, 4);
							local18++;
							if (local18 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("85217, " + -13 + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
	private void method641(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		try {
			if (!arg3) {
				if (arg1 == 0 && this.anInt944 != -1) {
					this.aString17 = arg0;
					super.anInt832 = 0;
				}
				if (this.anInt1044 == -1) {
					this.aBoolean253 = true;
				}
				for (@Pc(23) int local23 = 99; local23 > 0; local23--) {
					this.anIntArray227[local23] = this.anIntArray227[local23 - 1];
					this.aStringArray8[local23] = this.aStringArray8[local23 - 1];
					this.aStringArray9[local23] = this.aStringArray9[local23 - 1];
				}
				this.anIntArray227[0] = arg1;
				this.aStringArray8[0] = arg2;
				this.aStringArray9[0] = arg0;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("56346, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method642(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = true;
			if (super.anInt832 == 1) {
				if (super.anInt833 >= 539 && super.anInt833 <= 573 && super.anInt834 >= 169 && super.anInt834 < 205 && this.anIntArray254[0] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 0;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 569 && super.anInt833 <= 599 && super.anInt834 >= 168 && super.anInt834 < 205 && this.anIntArray254[1] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 1;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 597 && super.anInt833 <= 627 && super.anInt834 >= 168 && super.anInt834 < 205 && this.anIntArray254[2] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 2;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 625 && super.anInt833 <= 669 && super.anInt834 >= 168 && super.anInt834 < 203 && this.anIntArray254[3] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 3;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 666 && super.anInt833 <= 696 && super.anInt834 >= 168 && super.anInt834 < 205 && this.anIntArray254[4] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 4;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 694 && super.anInt833 <= 724 && super.anInt834 >= 168 && super.anInt834 < 205 && this.anIntArray254[5] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 5;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 722 && super.anInt833 <= 756 && super.anInt834 >= 169 && super.anInt834 < 205 && this.anIntArray254[6] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 6;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 540 && super.anInt833 <= 574 && super.anInt834 >= 466 && super.anInt834 < 502 && this.anIntArray254[7] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 7;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 572 && super.anInt833 <= 602 && super.anInt834 >= 466 && super.anInt834 < 503 && this.anIntArray254[8] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 8;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 599 && super.anInt833 <= 629 && super.anInt834 >= 466 && super.anInt834 < 503 && this.anIntArray254[9] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 9;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 627 && super.anInt833 <= 671 && super.anInt834 >= 467 && super.anInt834 < 502 && this.anIntArray254[10] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 10;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 669 && super.anInt833 <= 699 && super.anInt834 >= 466 && super.anInt834 < 503 && this.anIntArray254[11] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 11;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 696 && super.anInt833 <= 726 && super.anInt834 >= 466 && super.anInt834 < 503 && this.anIntArray254[12] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 12;
					this.aBoolean239 = true;
				}
				if (super.anInt833 >= 724 && super.anInt833 <= 758 && super.anInt834 >= 466 && super.anInt834 < 502 && this.anIntArray254[13] != -1) {
					this.aBoolean244 = true;
					this.anInt1017 = 13;
					this.aBoolean239 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("30484, " + arg0 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method643() {
		try {
			if (this.aClass17_27 == null) {
				this.method682();
				super.aClass17_2 = null;
				this.aClass17_12 = null;
				this.aClass17_13 = null;
				this.aClass17_14 = null;
				this.aClass17_15 = null;
				this.aClass17_16 = null;
				this.aClass17_17 = null;
				this.aClass17_18 = null;
				this.aClass17_19 = null;
				this.aClass17_20 = null;
				this.aClass17_27 = new Class17(479, 96, this.method575(), 0);
				this.aClass17_25 = new Class17(172, 156, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass1_Sub1_Sub1_Sub2_19.method155(0, 0);
				this.aClass17_24 = new Class17(190, 261, this.method575(), 0);
				this.aClass17_26 = new Class17(512, 334, this.method575(), 0);
				Class1_Sub1_Sub1.method490(this.aBoolean252);
				this.aClass17_21 = new Class17(496, 50, this.method575(), 0);
				this.aClass17_22 = new Class17(269, 37, this.method575(), 0);
				this.aClass17_23 = new Class17(249, 45, this.method575(), 0);
				this.aBoolean260 = true;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("35544, " + 1 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)Ljava/lang/String;")
	private String method644() {
		try {
			this.aBoolean246 &= true;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("82775, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CXGZMTJK;III)V")
	private void method645(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg1 * arg1;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(25) int local25 = this.anInt1003 + this.anInt1011 & 0x7FF;
				@Pc(29) int local29 = Class1_Sub1_Sub2_Sub6.anIntArray206[local25];
				@Pc(33) int local33 = Class1_Sub1_Sub2_Sub6.anIntArray207[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt998 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt998 + 256);
				@Pc(61) int local61 = arg1 * local42 + arg2 * local51 >> 16;
				@Pc(71) int local71 = arg1 * local51 - arg2 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass1_Sub1_Sub1_Sub1_7.method108(83 - local89 - 20, local77, local83 + 94 + 4 - 10);
			} else {
				this.method705(arg0, arg2, arg1);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("37468, " + arg0 + ", " + -760 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method646() {
		try {
			if (this.anInt965 == 0) {
				this.aStringArray13[0] = "Cancel";
				this.anIntArray252[0] = 1107;
				this.anInt985 = 1;
				this.method693();
				this.anInt865 = 0;
				if (super.anInt827 > 4 && super.anInt828 > 4 && super.anInt827 < 516 && super.anInt828 < 338) {
					if (this.anInt851 == -1) {
						this.method635();
					} else {
						this.method593(4, Class10.aClass10Array1[this.anInt851], super.anInt827, 4, super.anInt828, 0);
					}
				}
				if (this.anInt865 != this.anInt935) {
					this.anInt935 = this.anInt865;
				}
				this.anInt865 = 0;
				if (super.anInt827 > 553 && super.anInt828 > 205 && super.anInt827 < 743 && super.anInt828 < 466) {
					if (this.anInt1007 != -1) {
						this.method593(553, Class10.aClass10Array1[this.anInt1007], super.anInt827, 205, super.anInt828, 0);
					} else if (this.anIntArray254[this.anInt1017] != -1) {
						this.method593(553, Class10.aClass10Array1[this.anIntArray254[this.anInt1017]], super.anInt827, 205, super.anInt828, 0);
					}
				}
				if (this.anInt865 != this.anInt946) {
					this.aBoolean244 = true;
					this.anInt946 = this.anInt865;
				}
				this.anInt865 = 0;
				if (super.anInt827 > 17 && super.anInt828 > 357 && super.anInt827 < 496 && super.anInt828 < 453) {
					if (this.anInt1044 != -1) {
						this.method593(17, Class10.aClass10Array1[this.anInt1044], super.anInt827, 357, super.anInt828, 0);
					} else if (super.anInt828 < 434 && super.anInt827 < 426) {
						this.method638(super.anInt827 - 17, super.anInt828 - 357);
					}
				}
				if (this.anInt1044 != -1 && this.anInt865 != this.anInt941) {
					this.aBoolean253 = true;
					this.anInt941 = this.anInt865;
				}
				@Pc(223) boolean local223 = false;
				this.anInt922 += 0;
				while (!local223) {
					local223 = true;
					for (@Pc(235) int local235 = 0; local235 < this.anInt985 - 1; local235++) {
						if (this.anIntArray252[local235] < 1000 && this.anIntArray252[local235 + 1] > 1000) {
							@Pc(256) String local256 = this.aStringArray13[local235];
							this.aStringArray13[local235] = this.aStringArray13[local235 + 1];
							this.aStringArray13[local235 + 1] = local256;
							@Pc(278) int local278 = this.anIntArray252[local235];
							this.anIntArray252[local235] = this.anIntArray252[local235 + 1];
							this.anIntArray252[local235 + 1] = local278;
							@Pc(300) int local300 = this.anIntArray250[local235];
							this.anIntArray250[local235] = this.anIntArray250[local235 + 1];
							this.anIntArray250[local235 + 1] = local300;
							@Pc(322) int local322 = this.anIntArray251[local235];
							this.anIntArray251[local235] = this.anIntArray251[local235 + 1];
							this.anIntArray251[local235 + 1] = local322;
							@Pc(344) int local344 = this.anIntArray253[local235];
							this.anIntArray253[local235] = this.anIntArray253[local235 + 1];
							this.anIntArray253[local235 + 1] = local344;
							local223 = false;
						}
					}
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("40707, " + 0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	private int method647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(8) int local8 = 256 - arg2;
			return ((arg0 & 0xFF00FF) * local8 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local8 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("76365, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method648(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString28 = "";
				this.aString29 = "Connecting to server...";
				this.method699(true);
			}
			this.aClass26_1 = new Class26(this, -978, this.method583(anInt902 + 43594));
			@Pc(30) long local30 = Class50.method559(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_9.anInt468 = 0;
			this.aClass1_Sub1_Sub3_9.method258(14);
			this.aClass1_Sub1_Sub3_9.method258(local37);
			this.aClass26_1.method314(2, this.aClass1_Sub1_Sub3_9.aByteArray10);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass26_1.method311();
			}
			@Pc(74) int local74 = this.aClass26_1.method311();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass26_1.method313(this.aClass1_Sub1_Sub3_8.aByteArray10, 0, 8);
				this.aClass1_Sub1_Sub3_8.anInt468 = 0;
				this.aLong32 = this.aClass1_Sub1_Sub3_8.method274();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong32 >> 32), (int) this.aLong32 };
				this.aClass1_Sub1_Sub3_9.anInt468 = 0;
				this.aClass1_Sub1_Sub3_9.method258(10);
				this.aClass1_Sub1_Sub3_9.method262(local99[0]);
				this.aClass1_Sub1_Sub3_9.method262(local99[1]);
				this.aClass1_Sub1_Sub3_9.method262(local99[2]);
				this.aClass1_Sub1_Sub3_9.method262(local99[3]);
				this.aClass1_Sub1_Sub3_9.method262(signlink.anInt1055);
				this.aClass1_Sub1_Sub3_9.method265(arg0);
				this.aClass1_Sub1_Sub3_9.method265(arg1);
				this.aClass1_Sub1_Sub3_9.method283(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_7.anInt468 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_7.method258(18);
				} else {
					this.aClass1_Sub1_Sub3_7.method258(16);
				}
				this.aClass1_Sub1_Sub3_7.method258(this.aClass1_Sub1_Sub3_9.anInt468 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_7.method258(255);
				this.aClass1_Sub1_Sub3_7.method259(317);
				this.aClass1_Sub1_Sub3_7.method258(aBoolean228 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub3_7.method262(this.anIntArray249[local225]);
				}
				this.aClass1_Sub1_Sub3_7.method266(this.aClass1_Sub1_Sub3_9.aByteArray10, this.aClass1_Sub1_Sub3_9.anInt468);
				this.aClass1_Sub1_Sub3_9.aClass19_1 = new Class19(-436, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass19_2 = new Class19(-436, local99);
				this.aClass26_1.method314(this.aClass1_Sub1_Sub3_7.anInt468, this.aClass1_Sub1_Sub3_7.aByteArray10);
				local74 = this.aClass26_1.method311();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method648(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt857 = this.aClass26_1.method311();
					aBoolean251 = this.aClass26_1.method311() == 1;
					this.aLong33 = 0L;
					this.anInt933 = 0;
					this.aClass48_1.anInt783 = 0;
					super.aBoolean217 = true;
					this.aBoolean226 = true;
					this.aBoolean246 = true;
					this.aClass1_Sub1_Sub3_9.anInt468 = 0;
					this.aClass1_Sub1_Sub3_8.anInt468 = 0;
					this.anInt923 = -1;
					this.anInt843 = -1;
					this.anInt844 = -1;
					this.anInt845 = -1;
					this.anInt922 = 0;
					this.anInt924 = 0;
					this.anInt976 = 0;
					this.anInt926 = 0;
					this.anInt850 = 0;
					this.anInt985 = 0;
					this.aBoolean223 = false;
					super.anInt825 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray9[local389] = null;
					}
					this.anInt1047 = 0;
					this.anInt988 = 0;
					this.anInt934 = 0;
					this.anInt953 = 0;
					this.anInt1045 = (int) (Math.random() * 100.0D) - 50;
					this.anInt983 = (int) (Math.random() * 110.0D) - 55;
					this.anInt870 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1011 = (int) (Math.random() * 120.0D) - 60;
					this.anInt998 = (int) (Math.random() * 30.0D) - 20;
					this.anInt1003 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt932 = 0;
					this.anInt909 = -1;
					this.anInt1037 = 0;
					this.anInt1038 = 0;
					this.anInt868 = 0;
					this.anInt840 = 0;
					for (local225 = 0; local225 < this.anInt866; local225++) {
						this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local225] = null;
						this.aClass1_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local259] = null;
					}
					aClass1_Sub1_Sub2_Sub1_Sub2_1 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[this.anInt867] = new Class1_Sub1_Sub2_Sub1_Sub2();
					this.aClass21_10.method250();
					this.aClass21_11.method250();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass21ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass21_12 = new Class21(169);
					this.anInt874 = 0;
					this.anInt873 = 0;
					this.anInt944 = -1;
					this.anInt1044 = -1;
					this.anInt851 = -1;
					this.anInt1007 = -1;
					this.anInt930 = -1;
					this.aBoolean242 = false;
					this.anInt1017 = 3;
					this.anInt1019 = 0;
					this.aBoolean223 = false;
					this.aBoolean261 = false;
					this.aString17 = null;
					this.anInt950 = 0;
					this.anInt949 = -1;
					this.aBoolean237 = true;
					this.method609();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray239[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray12[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt1000 = 0;
					anInt986 = 0;
					anInt910 = 0;
					anInt1052 = 0;
					anInt883 = 0;
					anInt1006 = 0;
					anInt994 = 0;
					anInt1020 = 0;
					this.method643();
				} else if (local74 == 3) {
					this.aString28 = "";
					this.aString29 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString28 = "Your account has been disabled.";
					this.aString29 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString28 = "Your account is already logged in.";
					this.aString29 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString28 = "RuneScape has been updated!";
					this.aString29 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString28 = "This world is full.";
					this.aString29 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString28 = "Unable to connect.";
					this.aString29 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString28 = "Login limit exceeded.";
					this.aString29 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString28 = "Unable to connect.";
					this.aString29 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString29 = "Login server rejected session.";
					this.aString29 = "Please try again.";
				} else if (local74 == 12) {
					this.aString28 = "You need a members account to login to this world.";
					this.aString29 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString28 = "Could not complete login.";
					this.aString29 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString28 = "The server is being updated.";
					this.aString29 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean246 = true;
					this.aClass1_Sub1_Sub3_9.anInt468 = 0;
					this.aClass1_Sub1_Sub3_8.anInt468 = 0;
					this.anInt923 = -1;
					this.anInt843 = -1;
					this.anInt844 = -1;
					this.anInt845 = -1;
					this.anInt922 = 0;
					this.anInt924 = 0;
					this.anInt976 = 0;
					this.anInt985 = 0;
					this.aBoolean223 = false;
					this.aLong29 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString28 = "Login attempts exceeded.";
					this.aString29 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString28 = "You are standing in a members-only area.";
					this.aString29 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString28 = "Invalid loginserver requested";
					this.aString29 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local389 = this.aClass26_1.method311(); local389 >= 0; local389--) {
						this.aString28 = "You have only just left another world";
						this.aString29 = "Your profile will be transferred in: " + local389 + " seconds";
						this.method699(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(899) Exception local899) {
						}
					}
					this.method648(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString28 = "Unexpected server response";
					this.aString29 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString28 = "No response from server";
					this.aString29 = "Please try using a different world.";
				} else if (this.anInt940 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(921) Exception local921) {
					}
					this.anInt940++;
					this.method648(arg0, arg1, arg2);
				} else {
					this.aString28 = "No response from loginserver";
					this.aString29 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(964) IOException local964) {
			this.aString28 = "";
			this.aString29 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
	private boolean method649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray23[local7][local11] = 0;
					this.anIntArrayArray22[local7][local11] = 99999999;
				}
			}
			local11 = arg8;
			@Pc(39) int local39 = arg4;
			this.anIntArrayArray23[arg8][arg4] = 99;
			this.anIntArrayArray22[arg8][arg4] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray272[0] = arg8;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray273[0] = arg4;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray272.length;
			@Pc(81) int[][] local81 = this.aClass12Array1[this.anInt881].anIntArrayArray3;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray272[local57];
				local39 = this.anIntArray273[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg10 && local39 == arg7) {
					local70 = true;
					break;
				}
				if (arg3 != 0) {
					if ((arg3 < 5 || arg3 == 10) && this.aClass12Array1[this.anInt881].method173(arg10, local11, local39, arg1, arg3 - 1, arg7)) {
						local70 = true;
						break;
					}
					if (arg3 < 10 && this.aClass12Array1[this.anInt881].method174(arg10, arg7, local39, arg3 - 1, arg1, local11)) {
						local70 = true;
						break;
					}
				}
				if (arg5 != 0 && arg2 != 0 && this.aClass12Array1[this.anInt881].method175(arg7, arg10, local11, arg2, arg6, arg5, local39)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray22[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray23[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray272[local66] = local11 - 1;
					this.anIntArray273[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39] = 2;
					this.anIntArrayArray22[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray23[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray272[local66] = local11 + 1;
					this.anIntArray273[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39] = 8;
					this.anIntArrayArray22[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray23[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray272[local66] = local11;
					this.anIntArray273[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11][local39 - 1] = 1;
					this.anIntArrayArray22[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray23[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray272[local66] = local11;
					this.anIntArray273[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11][local39 + 1] = 4;
					this.anIntArrayArray22[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray23[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray272[local66] = local11 - 1;
					this.anIntArray273[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray23[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray272[local66] = local11 + 1;
					this.anIntArray273[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray23[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray272[local66] = local11 - 1;
					this.anIntArray273[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray23[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray272[local66] = local11 + 1;
					this.anIntArray273[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt1039 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (arg9) {
					local192 = 100;
					for (local808 = 1; local808 < 2; local808++) {
						for (local814 = arg10 - local808; local814 <= arg10 + local808; local814++) {
							for (local820 = arg7 - local808; local820 <= arg7 + local808; local820++) {
								if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray22[local814][local820] < local192) {
									local192 = this.anIntArrayArray22[local814][local820];
									local11 = local814;
									local39 = local820;
									this.anInt1039 = 1;
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
			this.anIntArray272[0] = local11;
			local57 = local881 + 1;
			this.anIntArray273[0] = local39;
			local192 = local808 = this.anIntArrayArray23[local11][local39];
			while (local11 != arg8 || local39 != arg4) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray272[local57] = local11;
					this.anIntArray273[local57++] = local39;
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
				local814 = this.anIntArray272[local57];
				local820 = this.anIntArray273[local57];
				anInt1052 += local74;
				if (anInt1052 >= 92) {
					this.aClass1_Sub1_Sub3_9.method257(36);
					this.aClass1_Sub1_Sub3_9.method262(0);
					anInt1052 = 0;
				}
				if (arg0 == 0) {
					this.aClass1_Sub1_Sub3_9.method257(164);
					this.aClass1_Sub1_Sub3_9.method258(local74 + local74 + 3);
				}
				if (arg0 == 1) {
					this.aClass1_Sub1_Sub3_9.method257(248);
					this.aClass1_Sub1_Sub3_9.method258(local74 + local74 + 3 + 14);
				}
				if (arg0 == 2) {
					this.aClass1_Sub1_Sub3_9.method257(98);
					this.aClass1_Sub1_Sub3_9.method258(local74 + local74 + 3);
				}
				this.aClass1_Sub1_Sub3_9.method293(local814 + this.anInt936);
				this.anInt1037 = this.anIntArray272[0];
				this.anInt1038 = this.anIntArray273[0];
				for (@Pc(1075) int local1075 = 1; local1075 < local74; local1075++) {
					local57--;
					this.aClass1_Sub1_Sub3_9.method258(this.anIntArray272[local57] - local814);
					this.aClass1_Sub1_Sub3_9.method258(this.anIntArray273[local57] - local820);
				}
				this.aClass1_Sub1_Sub3_9.method291(local820 + this.anInt937);
				this.aClass1_Sub1_Sub3_9.method284(super.anIntArray210[5] == 1 ? 1 : 0);
				return true;
			} else if (arg0 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1131) RuntimeException local1131) {
			signlink.reporterror("85388, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -11308 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MBMGIXGO;Z)V")
	private void method650(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt869; local3++) {
				@Pc(10) int local10 = this.anIntArray224[local3];
				@Pc(15) Class1_Sub1_Sub2_Sub1_Sub1 local15 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local10];
				@Pc(18) int local18 = arg1.method268();
				@Pc(26) int local26;
				@Pc(34) int local34;
				if ((local18 & 0x10) != 0) {
					local26 = arg1.method294();
					if (local26 == 65535) {
						local26 = -1;
					}
					local34 = arg1.method268();
					if (local26 == local15.anInt245 && local26 != -1) {
						@Pc(46) int local46 = Class22.aClass22Array1[local26].anInt441;
						if (local46 == 1) {
							local15.anInt246 = 0;
							local15.anInt247 = 0;
							local15.anInt248 = local34;
							local15.anInt249 = 0;
						}
						if (local46 == 2) {
							local15.anInt249 = 0;
						}
					} else if (local26 == -1 || local15.anInt245 == -1 || Class22.aClass22Array1[local26].anInt435 >= Class22.aClass22Array1[local15.anInt245].anInt435) {
						local15.anInt245 = local26;
						local15.anInt246 = 0;
						local15.anInt247 = 0;
						local15.anInt248 = local34;
						local15.anInt249 = 0;
						local15.anInt260 = local15.anInt244;
					}
				}
				if ((local18 & 0x8) != 0) {
					local26 = arg1.method286();
					local34 = arg1.method287();
					local15.method130(local34, local26, anInt995);
					local15.anInt251 = anInt995 + 300;
					local15.anInt252 = arg1.method286();
					local15.anInt253 = arg1.method268();
				}
				if ((local18 & 0x80) != 0) {
					local15.anInt239 = arg1.method270();
					local26 = arg1.method273();
					local15.anInt243 = local26 >> 16;
					local15.anInt242 = anInt995 + (local26 & 0xFFFF);
					local15.anInt240 = 0;
					local15.anInt241 = 0;
					if (local15.anInt242 > anInt995) {
						local15.anInt240 = -1;
					}
					if (local15.anInt239 == 65535) {
						local15.anInt239 = -1;
					}
				}
				if ((local18 & 0x20) != 0) {
					local15.anInt226 = arg1.method270();
					if (local15.anInt226 == 65535) {
						local15.anInt226 = -1;
					}
				}
				if ((local18 & 0x1) != 0) {
					local15.aString5 = arg1.method275();
					local15.anInt254 = 100;
				}
				if ((local18 & 0x40) != 0) {
					local26 = arg1.method287();
					local34 = arg1.method288();
					local15.method130(local34, local26, anInt995);
					local15.anInt251 = anInt995 + 300;
					local15.anInt252 = arg1.method288();
					local15.anInt253 = arg1.method287();
				}
				if ((local18 & 0x2) != 0) {
					local15.aClass6_1 = Class6.method29(arg1.method296());
					local15.anInt259 = local15.aClass6_1.aByte1;
					local15.anInt228 = local15.aClass6_1.anInt39;
					local15.anInt271 = local15.aClass6_1.anInt33;
					local15.anInt272 = local15.aClass6_1.anInt27;
					local15.anInt273 = local15.aClass6_1.anInt40;
					local15.anInt274 = local15.aClass6_1.anInt24;
					local15.anInt233 = local15.aClass6_1.anInt38;
				}
				if ((local18 & 0x4) != 0) {
					local15.anInt257 = arg1.method294();
					local15.anInt258 = arg1.method294();
				}
			}
			this.aBoolean246 &= true;
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("51191, " + arg0 + ", " + arg1 + ", " + true + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CKDEJADD;IZII)V")
	private void method651(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt985 < 400) {
				if (arg0.anIntArray6 != null) {
					arg0 = arg0.method31(this.anInt860);
				}
				if (arg0 != null && arg0.aBoolean13) {
					@Pc(24) String local24 = arg0.aString1;
					if (arg0.anInt29 != 0) {
						local24 = local24 + method674(aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt277, arg0.anInt29) + " (level-" + arg0.anInt29 + ")";
					}
					if (this.anInt1047 == 1) {
						this.aStringArray13[this.anInt985] = "Use " + this.aString30 + " with @yel@" + local24;
						this.anIntArray252[this.anInt985] = 582;
						this.anIntArray253[this.anInt985] = arg1;
						this.anIntArray250[this.anInt985] = arg3;
						this.anIntArray251[this.anInt985] = arg2;
						this.anInt985++;
					} else if (this.anInt988 != 1) {
						@Pc(170) int local170;
						if (arg0.aStringArray1 != null) {
							for (local170 = 4; local170 >= 0; local170--) {
								if (arg0.aStringArray1[local170] != null && !arg0.aStringArray1[local170].equalsIgnoreCase("attack")) {
									this.aStringArray13[this.anInt985] = arg0.aStringArray1[local170] + " @yel@" + local24;
									if (local170 == 0) {
										this.anIntArray252[this.anInt985] = 20;
									}
									if (local170 == 1) {
										this.anIntArray252[this.anInt985] = 412;
									}
									if (local170 == 2) {
										this.anIntArray252[this.anInt985] = 225;
									}
									if (local170 == 3) {
										this.anIntArray252[this.anInt985] = 965;
									}
									if (local170 == 4) {
										this.anIntArray252[this.anInt985] = 478;
									}
									this.anIntArray253[this.anInt985] = arg1;
									this.anIntArray250[this.anInt985] = arg3;
									this.anIntArray251[this.anInt985] = arg2;
									this.anInt985++;
								}
							}
						}
						if (arg0.aStringArray1 != null) {
							for (local170 = 4; local170 >= 0; local170--) {
								if (arg0.aStringArray1[local170] != null && arg0.aStringArray1[local170].equalsIgnoreCase("attack")) {
									@Pc(294) short local294 = 0;
									if (arg0.anInt29 > aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt277) {
										local294 = 2000;
									}
									this.aStringArray13[this.anInt985] = arg0.aStringArray1[local170] + " @yel@" + local24;
									if (local170 == 0) {
										this.anIntArray252[this.anInt985] = local294 + 20;
									}
									if (local170 == 1) {
										this.anIntArray252[this.anInt985] = local294 + 412;
									}
									if (local170 == 2) {
										this.anIntArray252[this.anInt985] = local294 + 225;
									}
									if (local170 == 3) {
										this.anIntArray252[this.anInt985] = local294 + 965;
									}
									if (local170 == 4) {
										this.anIntArray252[this.anInt985] = local294 + 478;
									}
									this.anIntArray253[this.anInt985] = arg1;
									this.anIntArray250[this.anInt985] = arg3;
									this.anIntArray251[this.anInt985] = arg2;
									this.anInt985++;
								}
							}
						}
						this.aStringArray13[this.anInt985] = "Examine @yel@" + local24;
						this.anIntArray252[this.anInt985] = 1025;
						this.anIntArray253[this.anInt985] = arg1;
						this.anIntArray250[this.anInt985] = arg3;
						this.anIntArray251[this.anInt985] = arg2;
						this.anInt985++;
					} else if ((this.anInt990 & 0x2) == 2) {
						this.aStringArray13[this.anInt985] = this.aString23 + " @yel@" + local24;
						this.anIntArray252[this.anInt985] = 413;
						this.anIntArray253[this.anInt985] = arg1;
						this.anIntArray250[this.anInt985] = arg3;
						this.anIntArray251[this.anInt985] = arg2;
						this.anInt985++;
						return;
					}
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("36696, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!DLZHLHNK;ZI)V")
	private void method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != aClass1_Sub1_Sub2_Sub1_Sub2_1 && this.anInt985 < 400) {
				@Pc(38) String local38;
				if (arg2.anInt290 == 0) {
					local38 = arg2.aString6 + method674(aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt277, arg2.anInt277) + " (level-" + arg2.anInt277 + ")";
				} else {
					local38 = arg2.aString6 + " (skill-" + arg2.anInt290 + ")";
				}
				@Pc(168) int local168;
				if (this.anInt1047 == 1) {
					this.aStringArray13[this.anInt985] = "Use " + this.aString30 + " with @whi@" + local38;
					this.anIntArray252[this.anInt985] = 491;
					this.anIntArray253[this.anInt985] = arg1;
					this.anIntArray250[this.anInt985] = arg0;
					this.anIntArray251[this.anInt985] = arg3;
					this.anInt985++;
				} else if (this.anInt988 != 1) {
					for (local168 = 4; local168 >= 0; local168--) {
						if (this.aStringArray12[local168] != null) {
							this.aStringArray13[this.anInt985] = this.aStringArray12[local168] + " @whi@" + local38;
							@Pc(195) short local195 = 0;
							if (this.aStringArray12[local168].equalsIgnoreCase("attack")) {
								if (arg2.anInt277 > aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt277) {
									local195 = 2000;
								}
								if (aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt275 != 0 && arg2.anInt275 != 0) {
									if (aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt275 == arg2.anInt275) {
										local195 = 2000;
									} else {
										local195 = 0;
									}
								}
							} else if (this.aBooleanArray12[local168]) {
								local195 = 2000;
							}
							if (local168 == 0) {
								this.anIntArray252[this.anInt985] = local195 + 561;
							}
							if (local168 == 1) {
								this.anIntArray252[this.anInt985] = local195 + 779;
							}
							if (local168 == 2) {
								this.anIntArray252[this.anInt985] = local195 + 27;
							}
							if (local168 == 3) {
								this.anIntArray252[this.anInt985] = local195 + 577;
							}
							if (local168 == 4) {
								this.anIntArray252[this.anInt985] = local195 + 729;
							}
							this.anIntArray253[this.anInt985] = arg1;
							this.anIntArray250[this.anInt985] = arg0;
							this.anIntArray251[this.anInt985] = arg3;
							this.anInt985++;
						}
					}
				} else if ((this.anInt990 & 0x8) == 8) {
					this.aStringArray13[this.anInt985] = this.aString23 + " @whi@" + local38;
					this.anIntArray252[this.anInt985] = 365;
					this.anIntArray253[this.anInt985] = arg1;
					this.anIntArray250[this.anInt985] = arg0;
					this.anIntArray251[this.anInt985] = arg3;
					this.anInt985++;
				}
				for (local168 = 0; local168 < this.anInt985; local168++) {
					if (this.anIntArray252[local168] == 516) {
						this.aStringArray13[local168] = "Walk here @whi@" + local38;
						return;
					}
				}
			}
		} catch (@Pc(345) RuntimeException local345) {
			signlink.reporterror("46972, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!DYMVKFXP;)V")
	private void method653(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt349 == 0) {
				local1 = this.aClass27_1.method343(arg0.anInt348, arg0.anInt350, arg0.anInt351);
			}
			if (arg0.anInt349 == 1) {
				local1 = this.aClass27_1.method344(arg0.anInt348, arg0.anInt350, arg0.anInt351);
			}
			if (arg0.anInt349 == 2) {
				local1 = this.aClass27_1.method345(arg0.anInt348, arg0.anInt350, arg0.anInt351);
			}
			if (arg0.anInt349 == 3) {
				local1 = this.aClass27_1.method346(arg0.anInt348, arg0.anInt350, arg0.anInt351);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass27_1.method347(arg0.anInt348, arg0.anInt350, arg0.anInt351, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt352 = local3;
			arg0.anInt354 = local5;
			arg0.anInt353 = local7;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("69945, " + false + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method654() {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt953; local8++) {
				if (this.anIntArray271[local8] <= 0) {
					@Pc(17) boolean local17 = false;
					try {
						if (this.anIntArray263[local8] != this.anInt858 || this.anIntArray270[local8] != this.anInt1053) {
							@Pc(50) Class1_Sub1_Sub3 local50 = Class18.method222(this.anIntArray270[local8], this.anIntArray263[local8]);
							if (System.currentTimeMillis() + (long) (local50.anInt468 / 22) > this.aLong31 + (long) (this.anInt1034 / 22)) {
								this.anInt1034 = local50.anInt468;
								this.aLong31 = System.currentTimeMillis();
								if (this.method623(local50.aByteArray10, local50.anInt468)) {
									this.anInt858 = this.anIntArray263[local8];
									this.anInt1053 = this.anIntArray270[local8];
								} else {
									local17 = true;
								}
							}
						} else if (!this.method591()) {
							local17 = true;
						}
					} catch (@Pc(100) Exception local100) {
					}
					if (local17 && this.anIntArray271[local8] != -5) {
						this.anIntArray271[local8] = -5;
					} else {
						this.anInt953--;
						for (@Pc(116) int local116 = local8; local116 < this.anInt953; local116++) {
							this.anIntArray263[local116] = this.anIntArray263[local116 + 1];
							this.anIntArray270[local116] = this.anIntArray270[local116 + 1];
							this.anIntArray271[local116] = this.anIntArray271[local116 + 1];
						}
						local8--;
					}
				} else {
					@Pc(168) int local168 = this.anIntArray271[local8]--;
				}
			}
			if (this.anInt1035 > 0) {
				this.anInt1035 -= 20;
				if (this.anInt1035 < 0) {
					this.anInt1035 = 0;
				}
				if (this.anInt1035 == 0 && this.aBoolean243 && !aBoolean228) {
					this.anInt1021 = this.anInt900;
					this.aBoolean255 = true;
					this.aClass14_Sub1_1.method190(2, this.anInt1021);
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("65150, " + false + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method570() {
		this.method577(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt821 = 5;
		}
		if (aBoolean232) {
			this.aBoolean259 = true;
			return;
		}
		aBoolean232 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method644();
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
			this.aBoolean250 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(83) int local83 = 0; local83 < 5; local83++) {
				this.aClass16Array1[local83] = new Class16(500000, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local83], local83 + 1, true);
			}
		}
		try {
			this.method580();
			this.aClass44_1 = this.method631(1, "title screen", "title", this.anIntArray249[1], 25);
			this.aClass1_Sub1_Sub1_Sub4_2 = new Class1_Sub1_Sub1_Sub4(false, "p11_full", 0, this.aClass44_1);
			this.aClass1_Sub1_Sub1_Sub4_3 = new Class1_Sub1_Sub1_Sub4(false, "p12_full", 0, this.aClass44_1);
			this.aClass1_Sub1_Sub1_Sub4_4 = new Class1_Sub1_Sub1_Sub4(false, "b12_full", 0, this.aClass44_1);
			this.aClass1_Sub1_Sub1_Sub4_5 = new Class1_Sub1_Sub1_Sub4(true, "q8_full", 0, this.aClass44_1);
			this.method620();
			this.method615();
			@Pc(179) Class44 local179 = this.method631(2, "config", "config", this.anIntArray249[2], 30);
			@Pc(191) Class44 local191 = this.method631(3, "interface", "interface", this.anIntArray249[3], 35);
			@Pc(203) Class44 local203 = this.method631(4, "2d graphics", "media", this.anIntArray249[4], 40);
			@Pc(215) Class44 local215 = this.method631(6, "textures", "textures", this.anIntArray249[6], 45);
			@Pc(227) Class44 local227 = this.method631(7, "chat system", "wordenc", this.anIntArray249[7], 50);
			@Pc(239) Class44 local239 = this.method631(8, "sound effects", "sounds", this.anIntArray249[8], 55);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass27_1 = new Class27(104, (byte) 43, 104, this.anIntArrayArrayArray8, 4);
			for (@Pc(264) int local264 = 0; local264 < 4; local264++) {
				this.aClass12Array1[local264] = new Class12(104, 104, true);
			}
			this.aClass1_Sub1_Sub1_Sub1_16 = new Class1_Sub1_Sub1_Sub1(512, 512);
			@Pc(299) Class44 local299 = this.method631(5, "update list", "versionlist", this.anIntArray249[5], 60);
			this.method577(60, "Connecting to update server");
			this.aClass14_Sub1_1 = new Class14_Sub1();
			this.aClass14_Sub1_1.method183(local299, this);
			Class37.method452(this.aClass14_Sub1_1.method189());
			Class1_Sub1_Sub2_Sub6.method531(this.aClass14_Sub1_1.method187(0), this.aClass14_Sub1_1);
			if (!aBoolean228) {
				this.anInt1021 = 0;
				try {
					this.anInt1021 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(340) Exception local340) {
				}
				this.aBoolean255 = true;
				this.aClass14_Sub1_1.method190(2, this.anInt1021);
				while (this.aClass14_Sub1_1.method184() > 0) {
					this.method621();
					try {
						Thread.sleep(100L);
					} catch (@Pc(358) Exception local358) {
					}
					if (this.aClass14_Sub1_1.anInt381 > 3) {
						this.method592("ondemand");
						return;
					}
				}
			}
			this.method577(65, "Requesting animations");
			@Pc(382) int local382 = this.aClass14_Sub1_1.method187(1);
			for (@Pc(384) int local384 = 0; local384 < local382; local384++) {
				this.aClass14_Sub1_1.method190(1, local384);
			}
			@Pc(403) int local403;
			while (this.aClass14_Sub1_1.method184() > 0) {
				local403 = local382 - this.aClass14_Sub1_1.method184();
				if (local403 > 0) {
					this.method577(65, "Loading animations - " + local403 * 100 / local382 + "%");
				}
				this.method621();
				try {
					Thread.sleep(100L);
				} catch (@Pc(429) Exception local429) {
				}
				if (this.aClass14_Sub1_1.anInt381 > 3) {
					this.method592("ondemand");
					return;
				}
			}
			this.method577(70, "Requesting models");
			local382 = this.aClass14_Sub1_1.method187(0);
			@Pc(463) int local463;
			for (local403 = 0; local403 < local382; local403++) {
				local463 = this.aClass14_Sub1_1.method191(local403);
				if ((local463 & 0x1) != 0) {
					this.aClass14_Sub1_1.method190(0, local403);
				}
			}
			local382 = this.aClass14_Sub1_1.method184();
			while (this.aClass14_Sub1_1.method184() > 0) {
				local463 = local382 - this.aClass14_Sub1_1.method184();
				if (local463 > 0) {
					this.method577(70, "Loading models - " + local463 * 100 / local382 + "%");
				}
				this.method621();
				try {
					Thread.sleep(100L);
				} catch (@Pc(514) Exception local514) {
				}
			}
			if (this.aClass16Array1[0] != null) {
				this.method577(75, "Requesting maps");
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(0, 48, 47));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(1, 48, 47));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(0, 48, 48));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(1, 48, 48));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(0, 48, 49));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(1, 48, 49));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(0, 47, 47));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(1, 47, 47));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(0, 47, 48));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(1, 47, 48));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(0, 148, 48));
				this.aClass14_Sub1_1.method190(3, this.aClass14_Sub1_1.method194(1, 148, 48));
				local382 = this.aClass14_Sub1_1.method184();
				while (this.aClass14_Sub1_1.method184() > 0) {
					local463 = local382 - this.aClass14_Sub1_1.method184();
					if (local463 > 0) {
						this.method577(75, "Loading maps - " + local463 * 100 / local382 + "%");
					}
					this.method621();
					try {
						Thread.sleep(100L);
					} catch (@Pc(699) Exception local699) {
					}
				}
			}
			local382 = this.aClass14_Sub1_1.method187(0);
			@Pc(720) int local720;
			for (local463 = 0; local463 < local382; local463++) {
				local720 = this.aClass14_Sub1_1.method191(local463);
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
					this.aClass14_Sub1_1.method195(local722, 0, local463, (byte) 8);
				}
			}
			this.aClass14_Sub1_1.method186(aBoolean227);
			if (!aBoolean228) {
				local382 = this.aClass14_Sub1_1.method187(2);
				for (local720 = 1; local720 < local382; local720++) {
					if (this.aClass14_Sub1_1.method201(local720)) {
						this.aClass14_Sub1_1.method195((byte) 1, 2, local720, (byte) 8);
					}
				}
			}
			this.method577(80, "Unpacking media");
			this.aClass1_Sub1_Sub1_Sub2_18 = new Class1_Sub1_Sub1_Sub2(local203, "invback", 0);
			this.aClass1_Sub1_Sub1_Sub2_20 = new Class1_Sub1_Sub1_Sub2(local203, "chatback", 0);
			this.aClass1_Sub1_Sub1_Sub2_19 = new Class1_Sub1_Sub1_Sub2(local203, "mapback", 0);
			this.aClass1_Sub1_Sub1_Sub2_10 = new Class1_Sub1_Sub1_Sub2(local203, "backbase1", 0);
			this.aClass1_Sub1_Sub1_Sub2_11 = new Class1_Sub1_Sub1_Sub2(local203, "backbase2", 0);
			this.aClass1_Sub1_Sub1_Sub2_12 = new Class1_Sub1_Sub1_Sub2(local203, "backhmid1", 0);
			for (local720 = 0; local720 < 13; local720++) {
				this.aClass1_Sub1_Sub1_Sub2Array2[local720] = new Class1_Sub1_Sub1_Sub2(local203, "sideicons", local720);
			}
			this.aClass1_Sub1_Sub1_Sub1_13 = new Class1_Sub1_Sub1_Sub1(local203, "compass", 0);
			this.aClass1_Sub1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub1(local203, "mapedge", 0);
			this.aClass1_Sub1_Sub1_Sub1_7.method100();
			@Pc(922) int local922;
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub1_Sub2Array3[local922] = new Class1_Sub1_Sub1_Sub2(local203, "mapscene", local922);
				}
			} catch (@Pc(940) Exception local940) {
			}
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub1_Sub1Array5[local922] = new Class1_Sub1_Sub1_Sub1(local203, "mapfunction", local922);
				}
			} catch (@Pc(960) Exception local960) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub1_Sub1Array4[local922] = new Class1_Sub1_Sub1_Sub1(local203, "hitmarks", local922);
				}
			} catch (@Pc(980) Exception local980) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub1_Sub1Array6[local922] = new Class1_Sub1_Sub1_Sub1(local203, "headicons", local922);
				}
			} catch (@Pc(1000) Exception local1000) {
			}
			this.aClass1_Sub1_Sub1_Sub1_3 = new Class1_Sub1_Sub1_Sub1(local203, "mapmarker", 0);
			this.aClass1_Sub1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub1(local203, "mapmarker", 1);
			for (local922 = 0; local922 < 8; local922++) {
				this.aClass1_Sub1_Sub1_Sub1Array8[local922] = new Class1_Sub1_Sub1_Sub1(local203, "cross", local922);
			}
			this.aClass1_Sub1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub1(local203, "mapdots", 0);
			this.aClass1_Sub1_Sub1_Sub1_9 = new Class1_Sub1_Sub1_Sub1(local203, "mapdots", 1);
			this.aClass1_Sub1_Sub1_Sub1_10 = new Class1_Sub1_Sub1_Sub1(local203, "mapdots", 2);
			this.aClass1_Sub1_Sub1_Sub1_11 = new Class1_Sub1_Sub1_Sub1(local203, "mapdots", 3);
			this.aClass1_Sub1_Sub1_Sub1_12 = new Class1_Sub1_Sub1_Sub1(local203, "mapdots", 4);
			this.aClass1_Sub1_Sub1_Sub2_8 = new Class1_Sub1_Sub1_Sub2(local203, "scrollbar", 0);
			this.aClass1_Sub1_Sub1_Sub2_9 = new Class1_Sub1_Sub1_Sub2(local203, "scrollbar", 1);
			this.aClass1_Sub1_Sub1_Sub2_13 = new Class1_Sub1_Sub1_Sub2(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub1_Sub2_14 = new Class1_Sub1_Sub1_Sub2(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub1_Sub2_15 = new Class1_Sub1_Sub1_Sub2(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub1_Sub2_16 = new Class1_Sub1_Sub1_Sub2(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub1_Sub2_16.method152();
			this.aClass1_Sub1_Sub1_Sub2_17 = new Class1_Sub1_Sub1_Sub2(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub1_Sub2_17.method152();
			this.aClass1_Sub1_Sub1_Sub2_1 = new Class1_Sub1_Sub1_Sub2(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub1_Sub2_1.method153();
			this.aClass1_Sub1_Sub1_Sub2_2 = new Class1_Sub1_Sub1_Sub2(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub1_Sub2_2.method153();
			this.aClass1_Sub1_Sub1_Sub2_3 = new Class1_Sub1_Sub1_Sub2(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub1_Sub2_3.method153();
			this.aClass1_Sub1_Sub1_Sub2_4 = new Class1_Sub1_Sub1_Sub2(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub1_Sub2_4.method152();
			this.aClass1_Sub1_Sub1_Sub2_4.method153();
			this.aClass1_Sub1_Sub1_Sub2_5 = new Class1_Sub1_Sub1_Sub2(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub1_Sub2_5.method152();
			this.aClass1_Sub1_Sub1_Sub2_5.method153();
			for (@Pc(1208) int local1208 = 0; local1208 < 2; local1208++) {
				this.aClass1_Sub1_Sub1_Sub2Array5[local1208] = new Class1_Sub1_Sub1_Sub2(local203, "mod_icons", local1208);
			}
			@Pc(1231) Class1_Sub1_Sub1_Sub1 local1231 = new Class1_Sub1_Sub1_Sub1(local203, "backleft1", 0);
			this.aClass17_3 = new Class17(local1231.anInt185, local1231.anInt186, this.method575(), 0);
			local1231.method101(0, 0);
			@Pc(1256) Class1_Sub1_Sub1_Sub1 local1256 = new Class1_Sub1_Sub1_Sub1(local203, "backleft2", 0);
			this.aClass17_4 = new Class17(local1256.anInt185, local1256.anInt186, this.method575(), 0);
			local1256.method101(0, 0);
			@Pc(1281) Class1_Sub1_Sub1_Sub1 local1281 = new Class1_Sub1_Sub1_Sub1(local203, "backright1", 0);
			this.aClass17_5 = new Class17(local1281.anInt185, local1281.anInt186, this.method575(), 0);
			local1281.method101(0, 0);
			@Pc(1306) Class1_Sub1_Sub1_Sub1 local1306 = new Class1_Sub1_Sub1_Sub1(local203, "backright2", 0);
			this.aClass17_6 = new Class17(local1306.anInt185, local1306.anInt186, this.method575(), 0);
			local1306.method101(0, 0);
			@Pc(1331) Class1_Sub1_Sub1_Sub1 local1331 = new Class1_Sub1_Sub1_Sub1(local203, "backtop1", 0);
			this.aClass17_7 = new Class17(local1331.anInt185, local1331.anInt186, this.method575(), 0);
			local1331.method101(0, 0);
			@Pc(1356) Class1_Sub1_Sub1_Sub1 local1356 = new Class1_Sub1_Sub1_Sub1(local203, "backvmid1", 0);
			this.aClass17_8 = new Class17(local1356.anInt185, local1356.anInt186, this.method575(), 0);
			local1356.method101(0, 0);
			@Pc(1381) Class1_Sub1_Sub1_Sub1 local1381 = new Class1_Sub1_Sub1_Sub1(local203, "backvmid2", 0);
			this.aClass17_9 = new Class17(local1381.anInt185, local1381.anInt186, this.method575(), 0);
			local1381.method101(0, 0);
			@Pc(1406) Class1_Sub1_Sub1_Sub1 local1406 = new Class1_Sub1_Sub1_Sub1(local203, "backvmid3", 0);
			this.aClass17_10 = new Class17(local1406.anInt185, local1406.anInt186, this.method575(), 0);
			local1406.method101(0, 0);
			@Pc(1431) Class1_Sub1_Sub1_Sub1 local1431 = new Class1_Sub1_Sub1_Sub1(local203, "backhmid2", 0);
			this.aClass17_11 = new Class17(local1431.anInt185, local1431.anInt186, this.method575(), 0);
			local1431.method101(0, 0);
			@Pc(1456) int local1456 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1463) int local1463 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1470) int local1470 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1477) int local1477 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1479) int local1479 = 0; local1479 < 100; local1479++) {
				if (this.aClass1_Sub1_Sub1_Sub1Array5[local1479] != null) {
					this.aClass1_Sub1_Sub1_Sub1Array5[local1479].method99(local1456 + local1477, local1463 + local1477, local1470 + local1477);
				}
				if (this.aClass1_Sub1_Sub1_Sub2Array3[local1479] != null) {
					this.aClass1_Sub1_Sub1_Sub2Array3[local1479].method154(local1456 + local1477, local1463 + local1477, local1470 + local1477);
				}
			}
			this.method577(83, "Unpacking textures");
			Class1_Sub1_Sub1_Sub3.method392(local215);
			Class1_Sub1_Sub1_Sub3.method396(0.8D, aByte33);
			Class1_Sub1_Sub1_Sub3.method391();
			this.method577(86, "Unpacking config");
			Class22.method251(local179);
			Class46.method519(local179);
			Class24.method303(local179);
			Class9.method113(local179);
			Class6.method32(local179);
			Class39.method465(local179);
			Class25.method307(local179);
			Class42.method476(local179);
			Class38.method463(local179);
			Class9.aBoolean48 = aBoolean227;
			if (!aBoolean228) {
				this.method577(90, "Unpacking sounds");
				@Pc(1582) byte[] local1582 = local239.method484("sounds.dat", null);
				@Pc(1588) Class1_Sub1_Sub3 local1588 = new Class1_Sub1_Sub3(local1582, 891);
				Class18.method221(local1588);
			}
			this.method577(95, "Unpacking interfaces");
			@Pc(1619) Class1_Sub1_Sub1_Sub4[] local1619 = new Class1_Sub1_Sub1_Sub4[] { this.aClass1_Sub1_Sub1_Sub4_2, this.aClass1_Sub1_Sub1_Sub4_3, this.aClass1_Sub1_Sub1_Sub4_4, this.aClass1_Sub1_Sub1_Sub4_5 };
			Class10.method158(local191, local1619, local203);
			this.method577(100, "Preparing game engine");
			@Pc(1635) int local1635;
			@Pc(1637) int local1637;
			@Pc(1639) int local1639;
			for (@Pc(1631) int local1631 = 0; local1631 < 33; local1631++) {
				local1635 = 999;
				local1637 = 0;
				for (local1639 = 0; local1639 < 34; local1639++) {
					if (this.aClass1_Sub1_Sub1_Sub2_19.aByteArray3[local1639 + local1631 * this.aClass1_Sub1_Sub1_Sub2_19.anInt305] == 0) {
						if (local1635 == 999) {
							local1635 = local1639;
						}
					} else if (local1635 != 999) {
						local1637 = local1639;
						break;
					}
				}
				this.anIntArray229[local1631] = local1635;
				this.anIntArray245[local1631] = local1637 - local1635;
			}
			@Pc(1697) int local1697;
			for (local1635 = 5; local1635 < 156; local1635++) {
				local1637 = 999;
				local1639 = 0;
				for (local1697 = 25; local1697 < 172; local1697++) {
					if (this.aClass1_Sub1_Sub1_Sub2_19.aByteArray3[local1697 + local1635 * this.aClass1_Sub1_Sub1_Sub2_19.anInt305] == 0 && (local1697 > 34 || local1635 > 34)) {
						if (local1637 == 999) {
							local1637 = local1697;
						}
					} else if (local1637 != 999) {
						local1639 = local1697;
						break;
					}
				}
				this.anIntArray244[local1635 - 5] = local1637 - 25;
				this.anIntArray264[local1635 - 5] = local1639 - local1637;
			}
			Class1_Sub1_Sub1_Sub3.method389(479, 96);
			this.anIntArray256 = Class1_Sub1_Sub1_Sub3.anIntArray104;
			Class1_Sub1_Sub1_Sub3.method389(190, 261);
			this.anIntArray257 = Class1_Sub1_Sub1_Sub3.anIntArray104;
			Class1_Sub1_Sub1_Sub3.method389(512, 334);
			this.anIntArray258 = Class1_Sub1_Sub1_Sub3.anIntArray104;
			@Pc(1781) int[] local1781 = new int[9];
			for (local1639 = 0; local1639 < 9; local1639++) {
				local1697 = local1639 * 32 + 128 + 15;
				@Pc(1799) int local1799 = local1697 * 3 + 600;
				@Pc(1803) int local1803 = Class1_Sub1_Sub1_Sub3.anIntArray102[local1697];
				local1781[local1639] = local1799 * local1803 >> 16;
			}
			Class27.method353(local1781, aBoolean256);
			Class35.method411(local227);
			this.aClass48_1 = new Class48(this, anInt969);
			this.method576(this.aClass48_1, 10);
			Class1_Sub1_Sub2_Sub5.aClient3 = this;
			Class46.aClient4 = this;
			Class6.aClient1 = this;
		} catch (@Pc(1844) Exception local1844) {
			signlink.reporterror("loaderror " + this.aString21 + " " + this.anInt961);
			this.aBoolean225 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MBMGIXGO;IB)V")
	private void method655(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			while (arg0.anInt469 + 10 < arg1 * 8) {
				@Pc(24) int local24 = arg0.method279(11);
				if (local24 == 2047) {
					break;
				}
				if (this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local24] == null) {
					this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local24] = new Class1_Sub1_Sub2_Sub1_Sub2();
					if (this.aClass1_Sub1_Sub3Array1[local24] != null) {
						this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local24].method133(this.aClass1_Sub1_Sub3Array1[local24]);
					}
				}
				this.anIntArray223[this.anInt868++] = local24;
				@Pc(70) Class1_Sub1_Sub2_Sub1_Sub2 local70 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local24];
				local70.anInt256 = anInt995;
				@Pc(78) int local78 = arg0.method279(1);
				if (local78 == 1) {
					this.anIntArray224[this.anInt869++] = local24;
				}
				@Pc(97) int local97 = arg0.method279(1);
				@Pc(102) int local102 = arg0.method279(5);
				if (local102 > 15) {
					local102 -= 32;
				}
				@Pc(111) int local111 = arg0.method279(5);
				if (local111 > 15) {
					local111 -= 32;
				}
				local70.method128(aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0] + local111, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0] + local102, local97 == 1);
			}
			arg0.method280();
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("22315, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method656() {
		try {
			this.aBoolean246 &= true;
			if (this.anInt932 == 0 && super.anInt832 == 1) {
				@Pc(20) int local20 = super.anInt833 - 25 - 550;
				@Pc(27) int local27 = super.anInt834 - 5 - 4;
				@Pc(47) int local47;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					local47 = this.anInt1003 + this.anInt1011 & 0x7FF;
					@Pc(51) int local51 = Class1_Sub1_Sub1_Sub3.anIntArray102[local47];
					@Pc(55) int local55 = Class1_Sub1_Sub1_Sub3.anIntArray103[local47];
					@Pc(64) int local64 = local51 * (this.anInt998 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt998 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 + local83 >> 7;
					@Pc(107) int local107 = aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 - local93 >> 7;
					@Pc(128) boolean local128 = this.method649(1, 0, 0, 0, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0], 0, 0, local107, aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0], true, local100);
					if (local128) {
						this.aClass1_Sub1_Sub3_9.method258(local20);
						this.aClass1_Sub1_Sub3_9.method258(local27);
						this.aClass1_Sub1_Sub3_9.method259(this.anInt1003);
						this.aClass1_Sub1_Sub3_9.method258(57);
						this.aClass1_Sub1_Sub3_9.method258(this.anInt1011);
						this.aClass1_Sub1_Sub3_9.method258(this.anInt998);
						this.aClass1_Sub1_Sub3_9.method258(89);
						this.aClass1_Sub1_Sub3_9.method259(aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268);
						this.aClass1_Sub1_Sub3_9.method259(aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269);
						this.aClass1_Sub1_Sub3_9.method258(this.anInt1039);
						this.aClass1_Sub1_Sub3_9.method258(63);
					}
				}
				anInt979++;
				if (anInt979 > 1151) {
					anInt979 = 0;
					this.aClass1_Sub1_Sub3_9.method257(246);
					this.aClass1_Sub1_Sub3_9.method258(0);
					local47 = this.aClass1_Sub1_Sub3_9.anInt468;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_9.method258(101);
					}
					this.aClass1_Sub1_Sub3_9.method258(197);
					this.aClass1_Sub1_Sub3_9.method259((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_9.method258((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_9.method258(67);
					this.aClass1_Sub1_Sub3_9.method259(14214);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_9.method259(29487);
					}
					this.aClass1_Sub1_Sub3_9.method259((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_9.method258(220);
					}
					this.aClass1_Sub1_Sub3_9.method258(180);
					this.aClass1_Sub1_Sub3_9.method267(this.aClass1_Sub1_Sub3_9.anInt468 - local47);
					return;
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("13593, " + true + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private String method657(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("1025, " + 369 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method658() {
		try {
			@Pc(14) Graphics local14 = this.method575().getGraphics();
			local14.setColor(Color.black);
			local14.fillRect(0, 0, 765, 503);
			this.method568();
			@Pc(46) byte local46;
			@Pc(52) int local52;
			if (this.aBoolean225) {
				this.aBoolean219 = false;
				local14.setFont(new Font("Helvetica", 1, 16));
				local14.setColor(Color.yellow);
				local46 = 35;
				local14.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local52 = local46 + 50;
				local14.setColor(Color.white);
				local14.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(61) int local61 = local52 + 50;
				local14.setColor(Color.white);
				local14.setFont(new Font("Helvetica", 1, 12));
				local14.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(78) int local78 = local61 + 30;
				local14.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(84) int local84 = local78 + 30;
				local14.drawString("3: Try using a different game-world", 30, 195);
				@Pc(90) int local90 = local84 + 30;
				local14.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(96) int local96 = local90 + 30;
				local14.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean250) {
				this.aBoolean219 = false;
				local14.setFont(new Font("Helvetica", 1, 20));
				local14.setColor(Color.white);
				local14.drawString("Error - unable to load game!", 50, 50);
				local14.drawString("To play RuneScape make sure you play from", 50, 100);
				local14.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean259) {
				this.aBoolean219 = false;
				local14.setColor(Color.yellow);
				local46 = 35;
				local14.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local52 = local46 + 50;
				local14.setColor(Color.white);
				local14.drawString("To fix this try the following (in order):", 30, 85);
				local52 += 50;
				local14.setColor(Color.white);
				local14.setFont(new Font("Helvetica", 1, 12));
				local14.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local52 += 30;
				local14.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local52 += 30;
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("4031, " + -13873 + ", " + local184.toString());
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
				return new URL("http://127.0.0.1:" + (anInt902 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method659() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt840; local1++) {
				@Pc(8) int local8 = this.anIntArray215[local1];
				@Pc(13) Class1_Sub1_Sub2_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local8];
				if (local13 != null) {
					this.method660(local13.aClass6_1.aByte1, local13);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("41621, " + -8066 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!GQOSZKJC;)V")
	private void method660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub1 arg1) {
		try {
			if (arg1.anInt268 < 128 || arg1.anInt269 < 128 || arg1.anInt268 >= 13184 || arg1.anInt269 >= 13184) {
				arg1.anInt245 = -1;
				arg1.anInt239 = -1;
				arg1.anInt265 = 0;
				arg1.anInt266 = 0;
				arg1.anInt268 = arg1.anIntArray45[0] * 128 + arg1.anInt259 * 64;
				arg1.anInt269 = arg1.anIntArray46[0] * 128 + arg1.anInt259 * 64;
				arg1.method129();
			}
			if (arg1 == aClass1_Sub1_Sub2_Sub1_Sub2_1 && (arg1.anInt268 < 1536 || arg1.anInt269 < 1536 || arg1.anInt268 >= 11776 || arg1.anInt269 >= 11776)) {
				arg1.anInt245 = -1;
				arg1.anInt239 = -1;
				arg1.anInt265 = 0;
				arg1.anInt266 = 0;
				arg1.anInt268 = arg1.anIntArray45[0] * 128 + arg1.anInt259 * 64;
				arg1.anInt269 = arg1.anIntArray46[0] * 128 + arg1.anInt259 * 64;
				arg1.method129();
			}
			if (arg1.anInt265 > anInt995) {
				this.method661(arg1);
			} else if (arg1.anInt266 >= anInt995) {
				this.method662(arg1, this.aByte31);
			} else {
				this.method663(arg1);
			}
			this.method664(arg1);
			this.method665(arg1);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("29397, " + 46988 + ", " + arg0 + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GQOSZKJC;Z)V")
	private void method661(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt265 - anInt995;
			@Pc(14) int local14 = arg0.anInt261 * 128 + arg0.anInt259 * 64;
			@Pc(24) int local24 = arg0.anInt263 * 128 + arg0.anInt259 * 64;
			arg0.anInt268 += (local14 - arg0.anInt268) / local4;
			arg0.anInt269 += (local24 - arg0.anInt269) / local4;
			arg0.anInt227 = 0;
			if (arg0.anInt267 == 0) {
				arg0.anInt232 = 1024;
			}
			if (arg0.anInt267 == 1) {
				arg0.anInt232 = 1536;
			}
			if (arg0.anInt267 == 2) {
				arg0.anInt232 = 0;
			}
			if (arg0.anInt267 == 3) {
				arg0.anInt232 = 512;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("99888, " + arg0 + ", " + true + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GQOSZKJC;B)V")
	private void method662(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0.anInt266 == anInt995 || arg0.anInt245 == -1 || arg0.anInt248 != 0 || arg0.anInt247 + 1 > Class22.aClass22Array1[arg0.anInt245].method252(arg0.anInt246)) {
				@Pc(29) int local29 = arg0.anInt266 - arg0.anInt265;
				@Pc(34) int local34 = anInt995 - arg0.anInt265;
				@Pc(44) int local44 = arg0.anInt261 * 128 + arg0.anInt259 * 64;
				@Pc(54) int local54 = arg0.anInt263 * 128 + arg0.anInt259 * 64;
				@Pc(64) int local64 = arg0.anInt262 * 128 + arg0.anInt259 * 64;
				@Pc(74) int local74 = arg0.anInt264 * 128 + arg0.anInt259 * 64;
				arg0.anInt268 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt269 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt227 = 0;
			if (arg0.anInt267 == 0) {
				arg0.anInt232 = 1024;
			}
			if (arg0.anInt267 == 1) {
				arg0.anInt232 = 1536;
			}
			if (arg0.anInt267 == 2) {
				arg0.anInt232 = 0;
			}
			if (arg0.anInt267 == 3) {
				arg0.anInt232 = 512;
			}
			arg0.anInt270 = arg0.anInt232;
			if (arg1 != this.aByte31) {
				anInt969 = -383;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("10794, " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!GQOSZKJC;)V")
	private void method663(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		try {
			arg0.anInt236 = arg0.anInt233;
			if (arg0.anInt244 == 0) {
				arg0.anInt227 = 0;
			} else {
				if (arg0.anInt245 != -1 && arg0.anInt248 == 0) {
					@Pc(24) Class22 local24 = Class22.aClass22Array1[arg0.anInt245];
					if (arg0.anInt260 > 0 && local24.anInt439 == 0) {
						arg0.anInt227++;
						return;
					}
					if (arg0.anInt260 <= 0 && local24.anInt440 == 0) {
						arg0.anInt227++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt268;
				@Pc(56) int local56 = arg0.anInt269;
				@Pc(71) int local71 = arg0.anIntArray45[arg0.anInt244 - 1] * 128 + arg0.anInt259 * 64;
				@Pc(86) int local86 = arg0.anIntArray46[arg0.anInt244 - 1] * 128 + arg0.anInt259 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt232 = 1280;
						} else if (local56 > local86) {
							arg0.anInt232 = 1792;
						} else {
							arg0.anInt232 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt232 = 768;
						} else if (local56 > local86) {
							arg0.anInt232 = 256;
						} else {
							arg0.anInt232 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt232 = 1024;
					} else {
						arg0.anInt232 = 0;
					}
					@Pc(180) int local180 = arg0.anInt232 - arg0.anInt270 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt272;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt271;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt274;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt273;
					}
					if (local187 == -1) {
						local187 = arg0.anInt271;
					}
					arg0.anInt236 = local187;
					@Pc(229) int local229 = 4;
					if (arg0.anInt270 != arg0.anInt232 && arg0.anInt226 == -1 && arg0.anInt228 != 0) {
						local229 = 2;
					}
					if (arg0.anInt244 > 2) {
						local229 = 6;
					}
					if (arg0.anInt244 > 3) {
						local229 = 8;
					}
					if (arg0.anInt227 > 0 && arg0.anInt244 > 1) {
						local229 = 8;
						arg0.anInt227--;
					}
					if (arg0.aBooleanArray3[arg0.anInt244 - 1]) {
						local229 <<= 0x1;
					}
					if (local229 >= 8 && arg0.anInt236 == arg0.anInt271 && arg0.anInt229 != -1) {
						arg0.anInt236 = arg0.anInt229;
					}
					if (local53 < local71) {
						arg0.anInt268 += local229;
						if (arg0.anInt268 > local71) {
							arg0.anInt268 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt268 -= local229;
						if (arg0.anInt268 < local71) {
							arg0.anInt268 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt269 += local229;
						if (arg0.anInt269 > local86) {
							arg0.anInt269 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt269 -= local229;
						if (arg0.anInt269 < local86) {
							arg0.anInt269 = local86;
						}
					}
					if (arg0.anInt268 == local71 && arg0.anInt269 == local86) {
						arg0.anInt244--;
						if (arg0.anInt260 > 0) {
							arg0.anInt260--;
							return;
						}
					}
				} else {
					arg0.anInt268 = local71;
					arg0.anInt269 = local86;
				}
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("41887, " + 34 + ", " + arg0 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GQOSZKJC;I)V")
	private void method664(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		try {
			if (arg0.anInt228 != 0) {
				@Pc(30) int local30;
				@Pc(36) int local36;
				if (arg0.anInt226 != -1 && arg0.anInt226 < 32768) {
					@Pc(22) Class1_Sub1_Sub2_Sub1_Sub1 local22 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[arg0.anInt226];
					if (local22 != null) {
						local30 = arg0.anInt268 - local22.anInt268;
						local36 = arg0.anInt269 - local22.anInt269;
						if (local30 != 0 || local36 != 0) {
							arg0.anInt232 = (int) (Math.atan2((double) local30, (double) local36) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(61) int local61;
				if (arg0.anInt226 >= 32768) {
					local61 = arg0.anInt226 - 32768;
					if (local61 == this.anInt864) {
						local61 = this.anInt867;
					}
					@Pc(73) Class1_Sub1_Sub2_Sub1_Sub2 local73 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local61];
					if (local73 != null) {
						local36 = arg0.anInt268 - local73.anInt268;
						@Pc(87) int local87 = arg0.anInt269 - local73.anInt269;
						if (local36 != 0 || local87 != 0) {
							arg0.anInt232 = (int) (Math.atan2((double) local36, (double) local87) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt257 != 0 || arg0.anInt258 != 0) && (arg0.anInt244 == 0 || arg0.anInt227 > 0)) {
					local61 = arg0.anInt268 - (arg0.anInt257 - this.anInt936 - this.anInt936) * 64;
					local30 = arg0.anInt269 - (arg0.anInt258 - this.anInt937 - this.anInt937) * 64;
					if (local61 != 0 || local30 != 0) {
						arg0.anInt232 = (int) (Math.atan2((double) local61, (double) local30) * 325.949D) & 0x7FF;
					}
					arg0.anInt257 = 0;
					arg0.anInt258 = 0;
				}
				local61 = arg0.anInt232 - arg0.anInt270 & 0x7FF;
				if (local61 != 0) {
					if (local61 < arg0.anInt228 || local61 > 2048 - arg0.anInt228) {
						arg0.anInt270 = arg0.anInt232;
					} else if (local61 > 1024) {
						arg0.anInt270 -= arg0.anInt228;
					} else {
						arg0.anInt270 += arg0.anInt228;
					}
					arg0.anInt270 &= 0x7FF;
					if (arg0.anInt236 == arg0.anInt233 && arg0.anInt270 != arg0.anInt232) {
						if (arg0.anInt234 != -1) {
							arg0.anInt236 = arg0.anInt234;
							return;
						}
						arg0.anInt236 = arg0.anInt271;
						return;
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("73745, " + arg0 + ", " + -843 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!GQOSZKJC;I)V")
	private void method665(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		try {
			arg0.aBoolean56 = false;
			@Pc(21) Class22 local21;
			if (arg0.anInt236 != -1) {
				local21 = Class22.aClass22Array1[arg0.anInt236];
				arg0.anInt238++;
				if (arg0.anInt237 < local21.anInt433 && arg0.anInt238 > local21.method252(arg0.anInt237)) {
					arg0.anInt238 = 0;
					arg0.anInt237++;
				}
				if (arg0.anInt237 >= local21.anInt433) {
					arg0.anInt238 = 0;
					arg0.anInt237 = 0;
				}
			}
			if (arg0.anInt239 != -1 && anInt995 >= arg0.anInt242) {
				if (arg0.anInt240 < 0) {
					arg0.anInt240 = 0;
				}
				local21 = Class25.aClass25Array1[arg0.anInt239].aClass22_1;
				arg0.anInt241++;
				while (arg0.anInt240 < local21.anInt433 && arg0.anInt241 > local21.method252(arg0.anInt240)) {
					arg0.anInt241 -= local21.method252(arg0.anInt240);
					arg0.anInt240++;
				}
				if (arg0.anInt240 >= local21.anInt433 && (arg0.anInt240 < 0 || arg0.anInt240 >= local21.anInt433)) {
					arg0.anInt239 = -1;
				}
			}
			if (arg0.anInt245 != -1 && arg0.anInt248 <= 1) {
				local21 = Class22.aClass22Array1[arg0.anInt245];
				if (local21.anInt439 == 1 && arg0.anInt260 > 0 && arg0.anInt265 <= anInt995 && arg0.anInt266 < anInt995) {
					arg0.anInt248 = 1;
					return;
				}
			}
			if (arg0.anInt245 != -1 && arg0.anInt248 == 0) {
				local21 = Class22.aClass22Array1[arg0.anInt245];
				arg0.anInt247++;
				while (arg0.anInt246 < local21.anInt433 && arg0.anInt247 > local21.method252(arg0.anInt246)) {
					arg0.anInt247 -= local21.method252(arg0.anInt246);
					arg0.anInt246++;
				}
				if (arg0.anInt246 >= local21.anInt433) {
					arg0.anInt246 -= local21.anInt434;
					arg0.anInt249++;
					if (arg0.anInt249 >= local21.anInt438) {
						arg0.anInt245 = -1;
					}
					if (arg0.anInt246 < 0 || arg0.anInt246 >= local21.anInt433) {
						arg0.anInt245 = -1;
					}
				}
				arg0.aBoolean56 = local21.aBoolean104;
			}
			if (arg0.anInt248 > 0) {
				arg0.anInt248--;
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("56331, " + arg0 + ", " + -805 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method666() {
		try {
			if (this.aBoolean260) {
				this.aBoolean260 = false;
				this.aClass17_3.method219(4, super.aGraphics2, 0);
				this.aClass17_4.method219(357, super.aGraphics2, 0);
				this.aClass17_5.method219(4, super.aGraphics2, 722);
				this.aClass17_6.method219(205, super.aGraphics2, 743);
				this.aClass17_7.method219(0, super.aGraphics2, 0);
				this.aClass17_8.method219(4, super.aGraphics2, 516);
				this.aClass17_9.method219(205, super.aGraphics2, 516);
				this.aClass17_10.method219(357, super.aGraphics2, 496);
				this.aClass17_11.method219(338, super.aGraphics2, 0);
				this.aBoolean244 = true;
				this.aBoolean253 = true;
				this.aBoolean239 = true;
				this.aBoolean257 = true;
				if (this.anInt934 != 2) {
					this.aClass17_26.method219(4, super.aGraphics2, 4);
					this.aClass17_25.method219(4, super.aGraphics2, 550);
				}
			}
			if (this.anInt934 == 2) {
				this.method710();
			}
			if (this.aBoolean223 && this.anInt895 == 1) {
				this.aBoolean244 = true;
			}
			@Pc(145) boolean local145;
			if (this.anInt1007 != -1) {
				local145 = this.method683(this.anInt894, this.anInt1007);
				if (local145) {
					this.aBoolean244 = true;
				}
			}
			if (this.anInt1028 == 2) {
				this.aBoolean244 = true;
			}
			if (this.anInt965 == 2) {
				this.aBoolean244 = true;
			}
			if (this.aBoolean244) {
				this.method600();
				this.aBoolean244 = false;
			}
			if (this.anInt1044 == -1) {
				this.aClass10_1.anInt319 = this.anInt1013 - this.anInt968 - 77;
				if (super.anInt827 > 448 && super.anInt827 < 560 && super.anInt828 > 332) {
					this.method629(463, 77, super.anInt827 - 17, super.anInt828 - 357, this.aClass10_1, 0, false, this.anInt1013);
				}
				@Pc(227) int local227 = this.anInt1013 - this.aClass10_1.anInt319 - 77;
				if (local227 < 0) {
					local227 = 0;
				}
				if (local227 > this.anInt1013 - 77) {
					local227 = this.anInt1013 - 77;
				}
				if (this.anInt968 != local227) {
					this.anInt968 = local227;
					this.aBoolean253 = true;
				}
			}
			if (this.anInt1044 != -1) {
				local145 = this.method683(this.anInt894, this.anInt1044);
				if (local145) {
					this.aBoolean253 = true;
				}
			}
			if (this.anInt1028 == 3) {
				this.aBoolean253 = true;
			}
			if (this.anInt965 == 3) {
				this.aBoolean253 = true;
			}
			if (this.aString17 != null) {
				this.aBoolean253 = true;
			}
			if (this.aBoolean223 && this.anInt895 == 2) {
				this.aBoolean253 = true;
			}
			if (this.aBoolean253) {
				this.method582();
				this.aBoolean253 = false;
			}
			if (this.anInt934 == 2) {
				this.method690();
				this.aClass17_25.method219(4, super.aGraphics2, 550);
			}
			if (this.anInt949 != -1) {
				this.aBoolean239 = true;
			}
			if (this.aBoolean239) {
				if (this.anInt949 != -1 && this.anInt949 == this.anInt1017) {
					this.anInt949 = -1;
					this.aClass1_Sub1_Sub3_9.method257(120);
					this.aClass1_Sub1_Sub3_9.method258(this.anInt1017);
				}
				this.aBoolean239 = false;
				this.aClass17_23.method218();
				this.aClass1_Sub1_Sub1_Sub2_12.method155(0, 0);
				if (this.anInt1007 == -1) {
					if (this.anIntArray254[this.anInt1017] != -1) {
						if (this.anInt1017 == 0) {
							this.aClass1_Sub1_Sub1_Sub2_13.method155(22, 10);
						}
						if (this.anInt1017 == 1) {
							this.aClass1_Sub1_Sub1_Sub2_14.method155(54, 8);
						}
						if (this.anInt1017 == 2) {
							this.aClass1_Sub1_Sub1_Sub2_14.method155(82, 8);
						}
						if (this.anInt1017 == 3) {
							this.aClass1_Sub1_Sub1_Sub2_15.method155(110, 8);
						}
						if (this.anInt1017 == 4) {
							this.aClass1_Sub1_Sub1_Sub2_17.method155(153, 8);
						}
						if (this.anInt1017 == 5) {
							this.aClass1_Sub1_Sub1_Sub2_17.method155(181, 8);
						}
						if (this.anInt1017 == 6) {
							this.aClass1_Sub1_Sub1_Sub2_16.method155(209, 9);
						}
					}
					if (this.anIntArray254[0] != -1 && (this.anInt949 != 0 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[0].method155(29, 13);
					}
					if (this.anIntArray254[1] != -1 && (this.anInt949 != 1 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[1].method155(53, 11);
					}
					if (this.anIntArray254[2] != -1 && (this.anInt949 != 2 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[2].method155(82, 11);
					}
					if (this.anIntArray254[3] != -1 && (this.anInt949 != 3 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[3].method155(115, 12);
					}
					if (this.anIntArray254[4] != -1 && (this.anInt949 != 4 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[4].method155(153, 13);
					}
					if (this.anIntArray254[5] != -1 && (this.anInt949 != 5 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[5].method155(180, 11);
					}
					if (this.anIntArray254[6] != -1 && (this.anInt949 != 6 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[6].method155(208, 13);
					}
				}
				this.aClass17_23.method219(160, super.aGraphics2, 516);
				this.aClass17_22.method218();
				this.aClass1_Sub1_Sub1_Sub2_11.method155(0, 0);
				if (this.anInt1007 == -1) {
					if (this.anIntArray254[this.anInt1017] != -1) {
						if (this.anInt1017 == 7) {
							this.aClass1_Sub1_Sub1_Sub2_1.method155(42, 0);
						}
						if (this.anInt1017 == 8) {
							this.aClass1_Sub1_Sub1_Sub2_2.method155(74, 0);
						}
						if (this.anInt1017 == 9) {
							this.aClass1_Sub1_Sub1_Sub2_2.method155(102, 0);
						}
						if (this.anInt1017 == 10) {
							this.aClass1_Sub1_Sub1_Sub2_3.method155(130, 1);
						}
						if (this.anInt1017 == 11) {
							this.aClass1_Sub1_Sub1_Sub2_5.method155(173, 0);
						}
						if (this.anInt1017 == 12) {
							this.aClass1_Sub1_Sub1_Sub2_5.method155(201, 0);
						}
						if (this.anInt1017 == 13) {
							this.aClass1_Sub1_Sub1_Sub2_4.method155(229, 0);
						}
					}
					if (this.anIntArray254[8] != -1 && (this.anInt949 != 8 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[7].method155(74, 2);
					}
					if (this.anIntArray254[9] != -1 && (this.anInt949 != 9 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[8].method155(102, 3);
					}
					if (this.anIntArray254[10] != -1 && (this.anInt949 != 10 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[9].method155(137, 4);
					}
					if (this.anIntArray254[11] != -1 && (this.anInt949 != 11 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[10].method155(174, 2);
					}
					if (this.anIntArray254[12] != -1 && (this.anInt949 != 12 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[11].method155(201, 2);
					}
					if (this.anIntArray254[13] != -1 && (this.anInt949 != 13 || anInt995 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub2Array2[12].method155(226, 2);
					}
				}
				this.aClass17_22.method219(466, super.aGraphics2, 496);
				this.aClass17_26.method218();
			}
			if (this.aBoolean257) {
				this.aBoolean257 = false;
				this.aClass17_21.method218();
				this.aClass1_Sub1_Sub1_Sub2_10.method155(0, 0);
				this.aClass1_Sub1_Sub1_Sub4_3.method501(16777215, 55, this.anInt891, "Public chat", 28, true);
				if (this.anInt1051 == 0) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(65280, 55, this.anInt891, "On", 41, true);
				}
				if (this.anInt1051 == 1) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(16776960, 55, this.anInt891, "Friends", 41, true);
				}
				if (this.anInt1051 == 2) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(16711680, 55, this.anInt891, "Off", 41, true);
				}
				if (this.anInt1051 == 3) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(65535, 55, this.anInt891, "Hide", 41, true);
				}
				this.aClass1_Sub1_Sub1_Sub4_3.method501(16777215, 184, this.anInt891, "Private chat", 28, true);
				if (this.anInt846 == 0) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(65280, 184, this.anInt891, "On", 41, true);
				}
				if (this.anInt846 == 1) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(16776960, 184, this.anInt891, "Friends", 41, true);
				}
				if (this.anInt846 == 2) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(16711680, 184, this.anInt891, "Off", 41, true);
				}
				this.aClass1_Sub1_Sub1_Sub4_3.method501(16777215, 324, this.anInt891, "Trade/compete", 28, true);
				if (this.anInt1029 == 0) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(65280, 324, this.anInt891, "On", 41, true);
				}
				if (this.anInt1029 == 1) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(16776960, 324, this.anInt891, "Friends", 41, true);
				}
				if (this.anInt1029 == 2) {
					this.aClass1_Sub1_Sub1_Sub4_3.method501(16711680, 324, this.anInt891, "Off", 41, true);
				}
				this.aClass1_Sub1_Sub1_Sub4_3.method501(16777215, 458, this.anInt891, "Report abuse", 33, true);
				this.aClass17_21.method219(453, super.aGraphics2, 0);
				this.aClass17_26.method218();
			}
			this.anInt894 = 0;
		} catch (@Pc(1067) RuntimeException local1067) {
			signlink.reporterror("25270, " + true + ", " + local1067.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DUCMKFAY;Z)Z")
	private boolean method667(@OriginalArg(0) Class10 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt314;
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
				this.aStringArray13[this.anInt985] = "Remove @whi@" + this.aStringArray11[local4];
				this.anIntArray252[this.anInt985] = 792;
				this.anInt985++;
				this.aStringArray13[this.anInt985] = "Message @whi@" + this.aStringArray11[local4];
				this.anIntArray252[this.anInt985] = 639;
				this.anInt985++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray13[this.anInt985] = "Remove @whi@" + arg0.aString11;
				this.anIntArray252[this.anInt985] = 322;
				this.anInt985++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("96874, " + arg0 + ", " + false + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method668() {
		try {
			@Pc(6) Class1_Sub1_Sub2_Sub3 local6 = (Class1_Sub1_Sub2_Sub3) this.aClass21_11.method246();
			this.aBoolean246 &= true;
			while (local6 != null) {
				if (local6.anInt546 != this.anInt881 || local6.aBoolean136) {
					local6.method526();
				} else if (anInt995 >= local6.anInt550) {
					local6.method372(this.anInt894);
					if (local6.aBoolean136) {
						local6.method526();
					} else {
						this.aClass27_1.method328(local6.anInt546, 0, (byte) 6, local6.anInt549, -1, local6.anInt548, 60, local6.anInt547, local6, false);
					}
				}
				local6 = (Class1_Sub1_Sub2_Sub3) this.aClass21_11.method248();
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("28956, " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!DUCMKFAY;I)V")
	private void method669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt337 == 0 && arg2.anIntArray56 != null && (!arg2.aBoolean73 || this.anInt935 == arg2.anInt331 || this.anInt946 == arg2.anInt331 || this.anInt941 == arg2.anInt331)) {
				@Pc(40) int local40 = Class1_Sub1_Sub1.anInt733;
				@Pc(42) int local42 = Class1_Sub1_Sub1.anInt731;
				@Pc(44) int local44 = Class1_Sub1_Sub1.anInt734;
				@Pc(46) int local46 = Class1_Sub1_Sub1.anInt732;
				Class1_Sub1_Sub1.method489(arg3 + arg2.anInt340, arg1, arg1 + arg2.anInt318, arg3);
				@Pc(62) int local62 = arg2.anIntArray56.length;
				for (@Pc(64) int local64 = 0; local64 < local62; local64++) {
					@Pc(73) int local73 = arg2.anIntArray57[local64] + arg1;
					@Pc(82) int local82 = arg2.anIntArray62[local64] + arg3 - arg0;
					@Pc(89) Class10 local89 = Class10.aClass10Array1[arg2.anIntArray56[local64]];
					@Pc(94) int local94 = local73 + local89.anInt338;
					@Pc(99) int local99 = local82 + local89.anInt339;
					if (local89.anInt314 > 0) {
						this.method639(local89);
					}
					if (local89.anInt337 == 0) {
						if (local89.anInt319 > local89.anInt336 - local89.anInt340) {
							local89.anInt319 = local89.anInt336 - local89.anInt340;
						}
						if (local89.anInt319 < 0) {
							local89.anInt319 = 0;
						}
						this.method669(local89.anInt319, local94, local89, local99);
						if (local89.anInt336 > local89.anInt340) {
							this.method594(local89.anInt340, local89.anInt319, local99, local94 + local89.anInt318, local89.anInt336);
						}
					} else if (local89.anInt337 != 1) {
						@Pc(171) int local171;
						@Pc(175) int local175;
						@Pc(186) int local186;
						@Pc(221) int local221;
						@Pc(228) int local228;
						@Pc(169) int local169;
						@Pc(219) int local219;
						if (local89.anInt337 == 2) {
							local169 = 0;
							for (local171 = 0; local171 < local89.anInt340; local171++) {
								for (local175 = 0; local175 < local89.anInt318; local175++) {
									local186 = local94 + local175 * (local89.anInt322 + 32);
									@Pc(195) int local195 = local99 + local171 * (local89.anInt329 + 32);
									if (local169 < 20) {
										local186 += local89.anIntArray55[local169];
										local195 += local89.anIntArray59[local169];
									}
									if (local89.anIntArray61[local169] > 0) {
										local219 = 0;
										local221 = 0;
										local228 = local89.anIntArray61[local169] - 1;
										if (local186 > Class1_Sub1_Sub1.anInt733 - 32 && local186 < Class1_Sub1_Sub1.anInt734 && local195 > Class1_Sub1_Sub1.anInt731 - 32 && local195 < Class1_Sub1_Sub1.anInt732 || this.anInt965 != 0 && this.anInt964 == local169) {
											@Pc(253) int local253 = 0;
											if (this.anInt1047 == 1 && this.anInt1048 == local169 && this.anInt1049 == local89.anInt331) {
												local253 = 16777215;
											}
											@Pc(277) Class1_Sub1_Sub1_Sub1 local277 = Class9.method120(local228, local89.anIntArray60[local169], local253);
											if (local277 != null) {
												@Pc(357) int local357;
												if (this.anInt965 != 0 && this.anInt964 == local169 && this.anInt963 == local89.anInt331) {
													local219 = super.anInt827 - this.anInt966;
													local221 = super.anInt828 - this.anInt967;
													if (local219 < 5 && local219 > -5) {
														local219 = 0;
													}
													if (local221 < 5 && local221 > -5) {
														local221 = 0;
													}
													if (this.anInt912 < 5) {
														local219 = 0;
														local221 = 0;
													}
													local277.method105(local186 + local219, local195 + local221, this.aBoolean236);
													if (local195 + local221 < Class1_Sub1_Sub1.anInt731 && arg2.anInt319 > 0) {
														local357 = this.anInt894 * (Class1_Sub1_Sub1.anInt731 - local195 - local221) / 3;
														if (local357 > this.anInt894 * 10) {
															local357 = this.anInt894 * 10;
														}
														if (local357 > arg2.anInt319) {
															local357 = arg2.anInt319;
														}
														arg2.anInt319 -= local357;
														this.anInt967 += local357;
													}
													if (local195 + local221 + 32 > Class1_Sub1_Sub1.anInt732 && arg2.anInt319 < arg2.anInt336 - arg2.anInt340) {
														local357 = this.anInt894 * (local195 + local221 + 32 - Class1_Sub1_Sub1.anInt732) / 3;
														if (local357 > this.anInt894 * 10) {
															local357 = this.anInt894 * 10;
														}
														if (local357 > arg2.anInt336 - arg2.anInt340 - arg2.anInt319) {
															local357 = arg2.anInt336 - arg2.anInt340 - arg2.anInt319;
														}
														arg2.anInt319 += local357;
														this.anInt967 -= local357;
													}
												} else if (this.anInt1028 != 0 && this.anInt1027 == local169 && this.anInt1026 == local89.anInt331) {
													local277.method105(local186, local195, this.aBoolean236);
												} else {
													local277.method103(local186, local195);
												}
												if (local277.anInt189 == 33 || local89.anIntArray60[local169] != 1) {
													local357 = local89.anIntArray60[local169];
													this.aClass1_Sub1_Sub1_Sub4_2.method504(0, method607(local357), local195 + local221 + 10, 822, local186 + local219 + 1);
													this.aClass1_Sub1_Sub1_Sub4_2.method504(16776960, method607(local357), local195 + local221 + 9, 822, local186 + local219);
												}
											}
										}
									} else if (local89.aClass1_Sub1_Sub1_Sub1Array1 != null && local169 < 20) {
										@Pc(547) Class1_Sub1_Sub1_Sub1 local547 = local89.aClass1_Sub1_Sub1_Sub1Array1[local169];
										if (local547 != null) {
											local547.method103(local186, local195);
										}
									}
									local169++;
								}
							}
						} else if (local89.anInt337 == 3) {
							@Pc(573) boolean local573 = false;
							if (this.anInt941 == local89.anInt331 || this.anInt946 == local89.anInt331 || this.anInt935 == local89.anInt331) {
								local573 = true;
							}
							if (this.method695(local89)) {
								local169 = local89.anInt317;
								if (local573 && local89.anInt328 != 0) {
									local169 = local89.anInt328;
								}
							} else {
								local169 = local89.anInt323;
								if (local573 && local89.anInt315 != 0) {
									local169 = local89.anInt315;
								}
							}
							if (local89.aByte6 == 0) {
								if (local89.aBoolean67) {
									Class1_Sub1_Sub1.method492(local89.anInt340, local99, local94, local169, local89.anInt318);
								} else {
									Class1_Sub1_Sub1.method493(local94, local89.anInt318, local89.anInt340, local169, local99);
								}
							} else if (local89.aBoolean67) {
								Class1_Sub1_Sub1.method491(local169, local99, local89.anInt318, local89.anInt340, 256 - (local89.aByte6 & 0xFF), local94);
							} else {
								Class1_Sub1_Sub1.method494(local99, local89.anInt340, 256 - (local89.aByte6 & 0xFF), local169, local89.anInt318, local94);
							}
						} else {
							@Pc(691) Class1_Sub1_Sub1_Sub4 local691;
							if (local89.anInt337 == 4) {
								local691 = local89.aClass1_Sub1_Sub1_Sub4_1;
								@Pc(694) String local694 = local89.aString11;
								@Pc(696) boolean local696 = false;
								if (this.anInt941 == local89.anInt331 || this.anInt946 == local89.anInt331 || this.anInt935 == local89.anInt331) {
									local696 = true;
								}
								if (this.method695(local89)) {
									local171 = local89.anInt317;
									if (local696 && local89.anInt328 != 0) {
										local171 = local89.anInt328;
									}
									if (local89.aString10.length() > 0) {
										local694 = local89.aString10;
									}
								} else {
									local171 = local89.anInt323;
									if (local696 && local89.anInt315 != 0) {
										local171 = local89.anInt315;
									}
								}
								if (local89.anInt316 == 6 && this.aBoolean242) {
									local694 = "Please wait...";
									local171 = local89.anInt323;
								}
								if (Class1_Sub1_Sub1.anInt729 == 479) {
									if (local171 == 16776960) {
										local171 = 255;
									}
									if (local171 == 49152) {
										local171 = 16777215;
									}
								}
								local219 = local99 + local691.anInt742;
								while (local694.length() > 0) {
									if (local694.indexOf("%") != -1) {
										label348: while (true) {
											local221 = local694.indexOf("%1");
											if (local221 == -1) {
												while (true) {
													local221 = local694.indexOf("%2");
													if (local221 == -1) {
														while (true) {
															local221 = local694.indexOf("%3");
															if (local221 == -1) {
																while (true) {
																	local221 = local694.indexOf("%4");
																	if (local221 == -1) {
																		while (true) {
																			local221 = local694.indexOf("%5");
																			if (local221 == -1) {
																				break label348;
																			}
																			local694 = local694.substring(0, local221) + this.method657(this.method688(341, local89, 4)) + local694.substring(local221 + 2);
																		}
																	}
																	local694 = local694.substring(0, local221) + this.method657(this.method688(341, local89, 3)) + local694.substring(local221 + 2);
																}
															}
															local694 = local694.substring(0, local221) + this.method657(this.method688(341, local89, 2)) + local694.substring(local221 + 2);
														}
													}
													local694 = local694.substring(0, local221) + this.method657(this.method688(341, local89, 1)) + local694.substring(local221 + 2);
												}
											}
											local694 = local694.substring(0, local221) + this.method657(this.method688(341, local89, 0)) + local694.substring(local221 + 2);
										}
									}
									local221 = local694.indexOf("\\n");
									@Pc(968) String local968;
									if (local221 == -1) {
										local968 = local694;
										local694 = "";
									} else {
										local968 = local694.substring(0, local221);
										local694 = local694.substring(local221 + 2);
									}
									if (local89.aBoolean66) {
										local691.method501(local171, local94 + local89.anInt318 / 2, this.anInt891, local968, local219, local89.aBoolean74);
									} else {
										local691.method508(local89.aBoolean74, local94, local171, local968, local219);
									}
									local219 += local691.anInt742;
								}
							} else if (local89.anInt337 == 5) {
								@Pc(1031) Class1_Sub1_Sub1_Sub1 local1031;
								if (this.method695(local89)) {
									local1031 = local89.aClass1_Sub1_Sub1_Sub1_2;
								} else {
									local1031 = local89.aClass1_Sub1_Sub1_Sub1_1;
								}
								if (local1031 != null) {
									local1031.method103(local94, local99);
								}
							} else if (local89.anInt337 == 6) {
								local169 = Class1_Sub1_Sub1_Sub3.anInt581;
								local171 = Class1_Sub1_Sub1_Sub3.anInt582;
								Class1_Sub1_Sub1_Sub3.anInt581 = local94 + local89.anInt318 / 2;
								Class1_Sub1_Sub1_Sub3.anInt582 = local99 + local89.anInt340 / 2;
								local175 = Class1_Sub1_Sub1_Sub3.anIntArray102[local89.anInt342] * local89.anInt341 >> 16;
								local186 = Class1_Sub1_Sub1_Sub3.anIntArray103[local89.anInt342] * local89.anInt341 >> 16;
								@Pc(1092) boolean local1092 = this.method695(local89);
								if (local1092) {
									local219 = local89.anInt335;
								} else {
									local219 = local89.anInt334;
								}
								@Pc(1112) Class1_Sub1_Sub2_Sub6 local1112;
								if (local219 == -1) {
									local1112 = local89.method162(-1, -1, local1092);
								} else {
									@Pc(1118) Class22 local1118 = Class22.aClass22Array1[local219];
									local1112 = local89.method162(local1118.anIntArray77[local89.anInt330], local1118.anIntArray76[local89.anInt330], local1092);
								}
								if (local1112 != null) {
									local1112.method554(local89.anInt343, 0, local89.anInt342, 0, local175, local186);
								}
								Class1_Sub1_Sub1_Sub3.anInt581 = local169;
								Class1_Sub1_Sub1_Sub3.anInt582 = local171;
							} else if (local89.anInt337 == 7) {
								local691 = local89.aClass1_Sub1_Sub1_Sub4_1;
								local171 = 0;
								for (local175 = 0; local175 < local89.anInt340; local175++) {
									for (local186 = 0; local186 < local89.anInt318; local186++) {
										if (local89.anIntArray61[local171] > 0) {
											@Pc(1182) Class9 local1182 = Class9.method118(local89.anIntArray61[local171] - 1);
											@Pc(1185) String local1185 = local1182.aString4;
											if (local1182.aBoolean47 || local89.anIntArray60[local171] != 1) {
												local1185 = local1185 + " x" + method578(local89.anIntArray60[local171]);
											}
											local221 = local94 + local186 * (local89.anInt322 + 115);
											local228 = local99 + local175 * (local89.anInt329 + 12);
											if (local89.aBoolean66) {
												local691.method501(local89.anInt323, local221 + local89.anInt318 / 2, this.anInt891, local1185, local228, local89.aBoolean74);
											} else {
												local691.method508(local89.aBoolean74, local221, local89.anInt323, local1185, local228);
											}
										}
										local171++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub1.method489(local46, local40, local44, local42);
			}
		} catch (@Pc(1282) RuntimeException local1282) {
			signlink.reporterror("5217, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DSMJIEPN;I)V")
	private void method670(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray259.length; local11++) {
				this.anIntArray259[local11] = 0;
			}
			@Pc(36) int local36;
			for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
				local36 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray259[local36] = (int) (Math.random() * 256.0D);
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local36 = 0; local36 < 20; local36++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray260[local66] = (this.anIntArray259[local66 - 1] + this.anIntArray259[local66 + 1] + this.anIntArray259[local66 - 128] + this.anIntArray259[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray259;
				this.anIntArray259 = this.anIntArray260;
				this.anIntArray260 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt306; local58++) {
					for (local66 = 0; local66 < arg0.anInt305; local66++) {
						if (arg0.aByteArray3[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt307 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt308 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray259[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("98023, " + arg0 + ", " + -135 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!MBMGIXGO;BLclient!DLZHLHNK;)V")
	private void method671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) Class1_Sub1_Sub2_Sub1_Sub2 arg4) {
		try {
			if (arg3 != 25) {
				this.aClass21ArrayArrayArray1 = null;
			}
			if ((arg0 & 0x400) != 0) {
				arg4.anInt261 = arg2.method288();
				arg4.anInt263 = arg2.method288();
				arg4.anInt262 = arg2.method288();
				arg4.anInt264 = arg2.method288();
				arg4.anInt265 = arg2.method296() + anInt995;
				arg4.anInt266 = arg2.method295() + anInt995;
				arg4.anInt267 = arg2.method288();
				arg4.method129();
			}
			@Pc(65) int local65;
			if ((arg0 & 0x100) != 0) {
				arg4.anInt239 = arg2.method294();
				local65 = arg2.method273();
				arg4.anInt243 = local65 >> 16;
				arg4.anInt242 = anInt995 + (local65 & 0xFFFF);
				arg4.anInt240 = 0;
				arg4.anInt241 = 0;
				if (arg4.anInt242 > anInt995) {
					arg4.anInt240 = -1;
				}
				if (arg4.anInt239 == 65535) {
					arg4.anInt239 = -1;
				}
			}
			@Pc(114) int local114;
			@Pc(126) int local126;
			if ((arg0 & 0x8) != 0) {
				local65 = arg2.method294();
				if (local65 == 65535) {
					local65 = -1;
				}
				local114 = arg2.method287();
				if (local65 == arg4.anInt245 && local65 != -1) {
					local126 = Class22.aClass22Array1[local65].anInt441;
					if (local126 == 1) {
						arg4.anInt246 = 0;
						arg4.anInt247 = 0;
						arg4.anInt248 = local114;
						arg4.anInt249 = 0;
					}
					if (local126 == 2) {
						arg4.anInt249 = 0;
					}
				} else if (local65 == -1 || arg4.anInt245 == -1 || Class22.aClass22Array1[local65].anInt435 >= Class22.aClass22Array1[arg4.anInt245].anInt435) {
					arg4.anInt245 = local65;
					arg4.anInt246 = 0;
					arg4.anInt247 = 0;
					arg4.anInt248 = local114;
					arg4.anInt249 = 0;
					arg4.anInt260 = arg4.anInt244;
				}
			}
			if ((arg0 & 0x4) != 0) {
				arg4.aString5 = arg2.method275();
				if (arg4.aString5.charAt(0) == '~') {
					arg4.aString5 = arg4.aString5.substring(1);
					this.method641(arg4.aString5, 2, arg4.aString6, this.aBoolean231);
				} else if (arg4 == aClass1_Sub1_Sub2_Sub1_Sub2_1) {
					this.method641(arg4.aString5, 2, arg4.aString6, this.aBoolean231);
				}
				arg4.anInt235 = 0;
				arg4.anInt250 = 0;
				arg4.anInt254 = 150;
			}
			if ((arg0 & 0x80) != 0) {
				local65 = arg2.method294();
				local114 = arg2.method268();
				local126 = arg2.method287();
				@Pc(255) int local255 = arg2.anInt468;
				if (arg4.aString6 != null && arg4.aBoolean58) {
					@Pc(265) long local265 = Class50.method559(arg4.aString6);
					@Pc(267) boolean local267 = false;
					if (local114 <= 1) {
						for (@Pc(272) int local272 = 0; local272 < this.anInt838; local272++) {
							if (this.aLongArray3[local272] == local265) {
								local267 = true;
								break;
							}
						}
					}
					if (!local267 && this.anInt1031 == 0) {
						try {
							this.aClass1_Sub1_Sub3_6.anInt468 = 0;
							arg2.method302(local126, this.aClass1_Sub1_Sub3_6.aByteArray10);
							this.aClass1_Sub1_Sub3_6.anInt468 = 0;
							@Pc(317) String local317 = Class36.method449(local126, this.aClass1_Sub1_Sub3_6);
							@Pc(321) String local321 = Class35.method421(local317);
							arg4.aString5 = local321;
							arg4.anInt235 = local65 >> 8;
							arg4.anInt250 = local65 & 0xFF;
							arg4.anInt254 = 150;
							if (local114 == 2 || local114 == 3) {
								this.method641(local321, 1, "@cr2@" + arg4.aString6, this.aBoolean231);
							} else if (local114 == 1) {
								this.method641(local321, 1, "@cr1@" + arg4.aString6, this.aBoolean231);
							} else {
								this.method641(local321, 2, arg4.aString6, this.aBoolean231);
							}
						} catch (@Pc(388) Exception local388) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.anInt468 = local255 + local126;
			}
			if ((arg0 & 0x1) != 0) {
				arg4.anInt226 = arg2.method294();
				if (arg4.anInt226 == 65535) {
					arg4.anInt226 = -1;
				}
			}
			if ((arg0 & 0x10) != 0) {
				local65 = arg2.method287();
				@Pc(423) byte[] local423 = new byte[local65];
				@Pc(429) Class1_Sub1_Sub3 local429 = new Class1_Sub1_Sub3(local423, 891);
				arg2.method277(local65, this.aByte28, local423);
				this.aClass1_Sub1_Sub3Array1[arg1] = local429;
				arg4.method133(local429);
			}
			if ((arg0 & 0x2) != 0) {
				arg4.anInt257 = arg2.method296();
				arg4.anInt258 = arg2.method294();
			}
			if ((arg0 & 0x20) != 0) {
				local65 = arg2.method268();
				local114 = arg2.method286();
				arg4.method130(local114, local65, anInt995);
				arg4.anInt251 = anInt995 + 300;
				arg4.anInt252 = arg2.method287();
				arg4.anInt253 = arg2.method268();
			}
			if ((arg0 & 0x200) != 0) {
				local65 = arg2.method268();
				local114 = arg2.method288();
				arg4.method130(local114, local65, anInt995);
				arg4.anInt251 = anInt995 + 300;
				arg4.anInt252 = arg2.method268();
				arg4.anInt253 = arg2.method287();
			}
		} catch (@Pc(523) RuntimeException local523) {
			signlink.reporterror("50326, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local523.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method672() {
		try {
			try {
				@Pc(13) int local13 = aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 + this.anInt1045;
				@Pc(19) int local19 = aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 + this.anInt983;
				if (this.anInt927 - local13 < -500 || this.anInt927 - local13 > 500 || this.anInt928 - local19 < -500 || this.anInt928 - local19 > 500) {
					this.anInt927 = local13;
					this.anInt928 = local19;
				}
				if (this.anInt927 != local13) {
					this.anInt927 += (local13 - this.anInt927) / 16;
				}
				if (this.anInt928 != local19) {
					this.anInt928 += (local19 - this.anInt928) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt1004 += (-this.anInt1004 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt1004 += (24 - this.anInt1004) / 2;
				} else {
					this.anInt1004 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt1005 += (12 - this.anInt1005) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt1005 += (-this.anInt1005 - 12) / 2;
				} else {
					this.anInt1005 /= 2;
				}
				this.anInt1003 = this.anInt1003 + this.anInt1004 / 2 & 0x7FF;
				this.anInt1002 += this.anInt1005 / 2;
				if (this.anInt1002 < 128) {
					this.anInt1002 = 128;
				}
				if (this.anInt1002 > 383) {
					this.anInt1002 = 383;
				}
				@Pc(206) int local206 = this.anInt927 >> 7;
				@Pc(211) int local211 = this.anInt928 >> 7;
				@Pc(221) int local221 = this.method606(this.anInt881, this.anInt928, this.anInt927);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt881;
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
				anInt920++;
				if (anInt920 > 1512) {
					anInt920 = 0;
					this.aClass1_Sub1_Sub3_9.method257(77);
					this.aClass1_Sub1_Sub3_9.method258(0);
					local239 = this.aClass1_Sub1_Sub3_9.anInt468;
					this.aClass1_Sub1_Sub3_9.method258((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_9.method258(101);
					this.aClass1_Sub1_Sub3_9.method258(233);
					this.aClass1_Sub1_Sub3_9.method259(45092);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_9.method259(35784);
					}
					this.aClass1_Sub1_Sub3_9.method258((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_9.method258(64);
					this.aClass1_Sub1_Sub3_9.method258(38);
					this.aClass1_Sub1_Sub3_9.method259((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_9.method259((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_9.method267(this.aClass1_Sub1_Sub3_9.anInt468 - local239);
				}
				local239 = local223 * 192;
				if (local239 > 98048) {
					local239 = 98048;
				}
				if (local239 < 32768) {
					local239 = 32768;
				}
				if (local239 > this.anInt908) {
					this.anInt908 += (local239 - this.anInt908) / 24;
				} else if (local239 < this.anInt908) {
					this.anInt908 += (local239 - this.anInt908) / 80;
				}
			} catch (@Pc(429) Exception local429) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 + "," + aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 + "," + this.anInt927 + "," + this.anInt928 + "," + this.anInt958 + "," + this.anInt959 + "," + this.anInt936 + "," + this.anInt937);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(479) RuntimeException local479) {
			signlink.reporterror("25141, " + 3 + ", " + local479.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method573() {
		try {
			if (this.aBoolean259 || this.aBoolean225 || this.aBoolean250) {
				this.method658();
			} else {
				anInt952++;
				if (this.aBoolean246) {
					this.method666();
				} else {
					this.method699(false);
				}
				this.anInt1014 = 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("24097, " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	private boolean method673(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt873; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray11[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub2_Sub1_Sub2_1.aString6);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("24883, " + false + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method675(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			signlink.anInt1063 = arg1;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("83178, " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method676() {
		try {
			this.method640();
			if (this.anInt880 == 1) {
				this.aClass1_Sub1_Sub1_Sub1Array8[this.anInt879 / 100].method103(this.anInt877 - 8 - 4, this.anInt878 - 8 - 4);
				anInt991++;
				if (anInt991 > 67) {
					anInt991 = 0;
					this.aClass1_Sub1_Sub3_9.method257(78);
				}
			}
			if (this.anInt880 == 2) {
				this.aClass1_Sub1_Sub1_Sub1Array8[this.anInt879 / 100 + 4].method103(this.anInt877 - 8 - 4, this.anInt878 - 8 - 4);
			}
			if (this.anInt930 != -1) {
				this.method683(this.anInt894, this.anInt930);
				this.method669(0, 0, Class10.aClass10Array1[this.anInt930], 0);
			}
			if (this.anInt851 != -1) {
				this.method683(this.anInt894, this.anInt851);
				this.method669(0, 0, Class10.aClass10Array1[this.anInt851], 0);
			}
			this.method634(184);
			if (!this.aBoolean223) {
				this.method646();
				this.method689();
			} else if (this.anInt895 == 0) {
				this.method604((byte) 9);
			}
			if (this.anInt950 == 1) {
				this.aClass1_Sub1_Sub1_Sub1Array6[1].method103(472, 296);
			}
			@Pc(182) int local182;
			if (aBoolean245) {
				@Pc(158) byte local158 = 20;
				@Pc(160) int local160 = 16776960;
				if (super.anInt822 < 15) {
					local160 = 16711680;
				}
				this.aClass1_Sub1_Sub1_Sub4_3.method499("Fps:" + super.anInt822, local160, 20);
				local182 = local158 + 15;
				@Pc(184) Runtime local184 = Runtime.getRuntime();
				@Pc(193) int local193 = (int) ((local184.totalMemory() - local184.freeMemory()) / 1024L);
				if (local193 > 33554432 && aBoolean228) {
				}
				this.aClass1_Sub1_Sub1_Sub4_3.method499("Mem:" + local193 + "k", 16776960, 35);
				local182 += 15;
			}
			if (this.anInt976 != 0) {
				@Pc(227) int local227 = this.anInt976 / 50;
				local182 = local227 / 60;
				@Pc(235) int local235 = local227 % 60;
				if (local235 < 10) {
					this.aClass1_Sub1_Sub1_Sub4_3.method504(16776960, "System update in: " + local182 + ":0" + local235, 329, 822, 4);
				} else {
					this.aClass1_Sub1_Sub1_Sub4_3.method504(16776960, "System update in: " + local182 + ":" + local235, 329, 822, 4);
				}
				anInt848++;
				if (anInt848 > 75) {
					anInt848 = 0;
					this.aClass1_Sub1_Sub3_9.method257(148);
					return;
				}
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("53284, " + 8 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method677(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt838 >= 100) {
					this.method641("Your ignore list is full. Max of 100 hit", 0, "", this.aBoolean231);
				} else {
					@Pc(24) String local24 = Class50.method563(Class50.method560(arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt838; local26++) {
						if (this.aLongArray3[local26] == arg0) {
							this.method641(local24 + " is already on your ignore list", 0, "", this.aBoolean231);
							return;
						}
					}
					for (@Pc(64) int local64 = 0; local64 < this.anInt873; local64++) {
						if (this.aLongArray4[local64] == arg0) {
							this.method641("Please remove " + local24 + " from your friend list first", 0, "", this.aBoolean231);
							return;
						}
					}
					this.aLongArray3[this.anInt838++] = arg0;
					this.aBoolean244 = true;
					this.aClass1_Sub1_Sub3_9.method257(133);
					this.aClass1_Sub1_Sub3_9.method264(arg0);
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("45688, " + arg0 + ", " + 4 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method678() {
		try {
			if (this.aByte30 == -74) {
				for (@Pc(8) int local8 = -1; local8 < this.anInt868; local8++) {
					@Pc(16) int local16;
					if (local8 == -1) {
						local16 = this.anInt867;
					} else {
						local16 = this.anIntArray223[local8];
					}
					@Pc(28) Class1_Sub1_Sub2_Sub1_Sub2 local28 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local16];
					if (local28 != null) {
						this.method660(1, local28);
					}
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("2450, " + -74 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method679(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt934 == 2) {
				for (@Pc(21) Class1_Sub2 local21 = (Class1_Sub2) this.aClass21_12.method246(); local21 != null; local21 = (Class1_Sub2) this.aClass21_12.method248()) {
					if (local21.anInt347 > 0) {
						local21.anInt347--;
					}
					if (local21.anInt347 != 0) {
						if (local21.anInt355 > 0) {
							local21.anInt355--;
						}
						if (local21.anInt355 == 0 && local21.anInt350 >= 1 && local21.anInt351 >= 1 && local21.anInt350 <= 102 && local21.anInt351 <= 102 && (local21.anInt344 < 0 || Class8.method48(local21.anInt344, local21.anInt346))) {
							this.method706(local21.anInt351, local21.anInt348, local21.anInt345, local21.anInt346, local21.anInt350, local21.anInt349, local21.anInt344);
							local21.anInt355 = -1;
							if (local21.anInt344 == local21.anInt352 && local21.anInt352 == -1) {
								local21.method526();
							} else if (local21.anInt344 == local21.anInt352 && local21.anInt345 == local21.anInt353 && local21.anInt346 == local21.anInt354) {
								local21.method526();
							}
						}
					} else if (local21.anInt352 < 0 || Class8.method48(local21.anInt352, local21.anInt354)) {
						this.method706(local21.anInt351, local21.anInt348, local21.anInt353, local21.anInt354, local21.anInt350, local21.anInt349, local21.anInt352);
						local21.method526();
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("99295, " + arg0 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method680() {
		try {
			@Pc(8) int local8 = this.aClass1_Sub1_Sub1_Sub4_4.method502(this.anInt978, "Choose Option");
			this.aBoolean246 &= true;
			@Pc(28) int local28;
			for (@Pc(16) int local16 = 0; local16 < this.anInt985; local16++) {
				local28 = this.aClass1_Sub1_Sub1_Sub4_4.method502(this.anInt978, this.aStringArray13[local16]);
				if (local28 > local8) {
					local8 = local28;
				}
			}
			local8 += 8;
			local28 = this.anInt985 * 15 + 21;
			@Pc(71) int local71;
			@Pc(89) int local89;
			if (super.anInt833 > 4 && super.anInt834 > 4 && super.anInt833 < 516 && super.anInt834 < 338) {
				local71 = super.anInt833 - local8 / 2 - 4;
				if (local71 + local8 > 512) {
					local71 = 512 - local8;
				}
				if (local71 < 0) {
					local71 = 0;
				}
				local89 = super.anInt834 - 4;
				if (local89 + local28 > 334) {
					local89 = 334 - local28;
				}
				if (local89 < 0) {
					local89 = 0;
				}
				this.aBoolean223 = true;
				this.anInt895 = 0;
				this.anInt896 = local71;
				this.anInt897 = local89;
				this.anInt898 = local8;
				this.anInt899 = this.anInt985 * 15 + 22;
			}
			if (super.anInt833 > 553 && super.anInt834 > 205 && super.anInt833 < 743 && super.anInt834 < 466) {
				local71 = super.anInt833 - local8 / 2 - 553;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local8 > 190) {
					local71 = 190 - local8;
				}
				local89 = super.anInt834 - 205;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local28 > 261) {
					local89 = 261 - local28;
				}
				this.aBoolean223 = true;
				this.anInt895 = 1;
				this.anInt896 = local71;
				this.anInt897 = local89;
				this.anInt898 = local8;
				this.anInt899 = this.anInt985 * 15 + 22;
			}
			if (super.anInt833 > 17 && super.anInt834 > 357 && super.anInt833 < 496 && super.anInt834 < 453) {
				local71 = super.anInt833 - local8 / 2 - 17;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local8 > 479) {
					local71 = 479 - local8;
				}
				local89 = super.anInt834 - 357;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local28 > 96) {
					local89 = 96 - local28;
				}
				this.aBoolean223 = true;
				this.anInt895 = 2;
				this.anInt896 = local71;
				this.anInt897 = local89;
				this.anInt898 = local8;
				this.anInt899 = this.anInt985 * 15 + 22;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("40223, " + true + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!MBMGIXGO;IB)V")
	private void method681(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			arg0.method278(this.anInt980);
			@Pc(8) boolean local8 = false;
			@Pc(19) int local19 = arg0.method279(1);
			if (local19 != 0) {
				@Pc(27) int local27 = arg0.method279(2);
				if (local27 == 0) {
					this.anIntArray224[this.anInt869++] = this.anInt867;
				} else {
					@Pc(50) int local50;
					@Pc(60) int local60;
					if (local27 == 1) {
						local50 = arg0.method279(3);
						aClass1_Sub1_Sub2_Sub1_Sub2_1.method131(false, local50);
						local60 = arg0.method279(1);
						if (local60 == 1) {
							this.anIntArray224[this.anInt869++] = this.anInt867;
						}
					} else {
						@Pc(104) int local104;
						if (local27 == 2) {
							local50 = arg0.method279(3);
							aClass1_Sub1_Sub2_Sub1_Sub2_1.method131(true, local50);
							local60 = arg0.method279(3);
							aClass1_Sub1_Sub2_Sub1_Sub2_1.method131(true, local60);
							local104 = arg0.method279(1);
							if (local104 == 1) {
								this.anIntArray224[this.anInt869++] = this.anInt867;
							}
						} else if (local27 == 3) {
							this.anInt881 = arg0.method279(2);
							local50 = arg0.method279(1);
							local60 = arg0.method279(1);
							if (local60 == 1) {
								this.anIntArray224[this.anInt869++] = this.anInt867;
							}
							local104 = arg0.method279(7);
							@Pc(164) int local164 = arg0.method279(7);
							aClass1_Sub1_Sub2_Sub1_Sub2_1.method128(local164, local104, local50 == 1);
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("453, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method682() {
		try {
			this.aBoolean219 = false;
			while (this.aBoolean229) {
				this.aBoolean219 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub1_Sub2_6 = null;
			this.aClass1_Sub1_Sub1_Sub2_7 = null;
			this.aClass1_Sub1_Sub1_Sub2Array4 = null;
			this.anIntArray217 = null;
			this.anIntArray218 = null;
			this.anIntArray219 = null;
			this.anIntArray220 = null;
			this.anIntArray259 = null;
			this.anIntArray260 = null;
			this.anIntArray213 = null;
			this.anIntArray214 = null;
			this.aClass1_Sub1_Sub1_Sub1_14 = null;
			this.aClass1_Sub1_Sub1_Sub1_15 = null;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("81448, " + 3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZI)Z")
	private boolean method683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(13) Class10 local13 = Class10.aClass10Array1[arg1];
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray56.length && local13.anIntArray56[local15] != -1; local15++) {
				@Pc(30) Class10 local30 = Class10.aClass10Array1[local13.anIntArray56[local15]];
				if (local30.anInt337 == 1) {
					local3 |= this.method683(arg0, local30.anInt331);
				}
				if (local30.anInt337 == 6 && (local30.anInt334 != -1 || local30.anInt335 != -1)) {
					@Pc(60) boolean local60 = this.method695(local30);
					@Pc(65) int local65;
					if (local60) {
						local65 = local30.anInt335;
					} else {
						local65 = local30.anInt334;
					}
					if (local65 != -1) {
						@Pc(77) Class22 local77 = Class22.aClass22Array1[local65];
						local30.anInt311 += arg0;
						while (local30.anInt311 > local77.method252(local30.anInt330)) {
							local30.anInt311 -= local77.method252(local30.anInt330) + 1;
							local30.anInt330++;
							if (local30.anInt330 >= local77.anInt433) {
								local30.anInt330 -= local77.anInt434;
								if (local30.anInt330 < 0 || local30.anInt330 >= local77.anInt433) {
									local30.anInt330 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("91882, " + arg0 + ", " + false + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)I")
	private int method684() {
		try {
			@Pc(11) int local11 = 3;
			if (this.anInt855 < 310) {
				@Pc(20) int local20 = this.anInt852 >> 7;
				@Pc(25) int local25 = this.anInt854 >> 7;
				@Pc(30) int local30 = aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 >> 7;
				@Pc(35) int local35 = aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt881][local20][local25] & 0x4) != 0) {
					local11 = this.anInt881;
				}
				@Pc(57) int local57;
				if (local30 > local20) {
					local57 = local30 - local20;
				} else {
					local57 = local20 - local30;
				}
				@Pc(70) int local70;
				if (local35 > local25) {
					local70 = local35 - local25;
				} else {
					local70 = local25 - local35;
				}
				@Pc(85) int local85;
				@Pc(87) int local87;
				if (local57 > local70) {
					local85 = local70 * 65536 / local57;
					local87 = 32768;
					while (local20 != local30) {
						if (local20 < local30) {
							local20++;
						} else if (local20 > local30) {
							local20--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt881][local20][local25] & 0x4) != 0) {
							local11 = this.anInt881;
						}
						local87 += local85;
						if (local87 >= 65536) {
							local87 -= 65536;
							if (local25 < local35) {
								local25++;
							} else if (local25 > local35) {
								local25--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt881][local20][local25] & 0x4) != 0) {
								local11 = this.anInt881;
							}
						}
					}
				} else {
					local85 = local57 * 65536 / local70;
					local87 = 32768;
					while (local25 != local35) {
						if (local25 < local35) {
							local25++;
						} else if (local25 > local35) {
							local25--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt881][local20][local25] & 0x4) != 0) {
							local11 = this.anInt881;
						}
						local87 += local85;
						if (local87 >= 65536) {
							local87 -= 65536;
							if (local20 < local30) {
								local20++;
							} else if (local20 > local30) {
								local20--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt881][local20][local25] & 0x4) != 0) {
								local11 = this.anInt881;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt881][aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 >> 7][aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 >> 7] & 0x4) != 0) {
				local11 = this.anInt881;
			}
			return local11;
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("62088, " + 111 + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)I")
	private int method685(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				this.aClass1_Sub1_Sub3_9.method258(21);
			}
			@Pc(17) int local17 = this.method606(this.anInt881, this.anInt854, this.anInt852);
			if (local17 - this.anInt853 >= 800 || (this.aByteArrayArrayArray8[this.anInt881][this.anInt852 >> 7][this.anInt854 >> 7] & 0x4) == 0) {
				return 3;
			} else {
				return this.anInt881;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("3005, " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method686(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(13) int local13 = 0; local13 < this.anInt838; local13++) {
					if (this.aLongArray3[local13] == arg0) {
						this.anInt838--;
						this.aBoolean244 = true;
						for (@Pc(33) int local33 = local13; local33 < this.anInt838; local33++) {
							this.aLongArray3[local33] = this.aLongArray3[local33 + 1];
						}
						this.aClass1_Sub1_Sub3_9.method257(74);
						this.aClass1_Sub1_Sub3_9.method264(arg0);
						return;
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("47229, " + 3 + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZI)V")
	private void method687(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1060 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("30156, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DUCMKFAY;I)I")
	private int method688(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg1.anIntArrayArray2 == null || arg2 >= arg1.anIntArrayArray2.length) {
				return -2;
			}
			try {
				@Pc(20) int[] local20 = arg1.anIntArrayArray2[arg2];
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
						local33 = this.anIntArray225[local20[local24++]];
					}
					if (local31 == 2) {
						local33 = this.anIntArray242[local20[local24++]];
					}
					if (local31 == 3) {
						local33 = this.anIntArray221[local20[local24++]];
					}
					@Pc(82) Class10 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local31 == 4) {
						local82 = Class10.aClass10Array1[local20[local24++]];
						local87 = local20[local24++];
						if (local87 >= 0 && local87 < Class9.anInt221 && (!Class9.method118(local87).aBoolean46 || aBoolean227)) {
							for (local100 = 0; local100 < local82.anIntArray61.length; local100++) {
								if (local82.anIntArray61[local100] == local87 + 1) {
									local33 += local82.anIntArray60[local100];
								}
							}
						}
					}
					if (local31 == 5) {
						local33 = this.anIntArray231[local20[local24++]];
					}
					if (local31 == 6) {
						local33 = anIntArray240[this.anIntArray242[local20[local24++]] - 1];
					}
					if (local31 == 7) {
						local33 = this.anIntArray231[local20[local24++]] * 100 / 46875;
					}
					if (local31 == 8) {
						local33 = aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt277;
					}
					@Pc(175) int local175;
					if (local31 == 9) {
						for (local175 = 0; local175 < Class45.anInt725; local175++) {
							if (Class45.aBooleanArray8[local175]) {
								local33 += this.anIntArray242[local175];
							}
						}
					}
					if (local31 == 10) {
						local82 = Class10.aClass10Array1[local20[local24++]];
						local87 = local20[local24++] + 1;
						if (local87 >= 0 && local87 < Class9.anInt221 && (!Class9.method118(local87).aBoolean46 || aBoolean227)) {
							for (local100 = 0; local100 < local82.anIntArray61.length; local100++) {
								if (local82.anIntArray61[local100] == local87) {
									local33 = 999999999;
									break;
								}
							}
						}
					}
					if (local31 == 11) {
						local33 = this.anInt992;
					}
					if (local31 == 12) {
						local33 = this.anInt861;
					}
					if (local31 == 13) {
						local175 = this.anIntArray231[local20[local24++]];
						local87 = local20[local24++];
						local33 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local31 == 14) {
						local175 = local20[local24++];
						@Pc(290) Class38 local290 = Class38.aClass38Array1[local175];
						local100 = local290.anInt677;
						@Pc(296) int local296 = local290.anInt678;
						@Pc(299) int local299 = local290.anInt679;
						@Pc(305) int local305 = anIntArray265[local299 - local296];
						local33 = this.anIntArray231[local100] >> local296 & local305;
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
						local33 = (aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 >> 7) + this.anInt936;
					}
					if (local31 == 19) {
						local33 = (aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 >> 7) + this.anInt937;
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
			} catch (@Pc(398) Exception local398) {
				return -1;
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("72370, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method689() {
		try {
			if (this.anInt985 >= 2 || this.anInt1047 != 0 || this.anInt988 != 0) {
				@Pc(31) String local31;
				if (this.anInt1047 == 1 && this.anInt985 < 2) {
					local31 = "Use " + this.aString30 + " with...";
				} else if (this.anInt988 == 1 && this.anInt985 < 2) {
					local31 = this.aString23 + "...";
				} else {
					local31 = this.aStringArray13[this.anInt985 - 1];
				}
				if (this.anInt985 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt985 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub1_Sub4_4.method509(4, 16777215, local31, anInt995 / 1000, 973, 15);
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("86922, " + 45706 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method690() {
		try {
			this.aClass17_25.method218();
			@Pc(21) int local21;
			@Pc(23) int local23;
			if (this.anInt932 == 2) {
				@Pc(16) byte[] local16 = this.aClass1_Sub1_Sub1_Sub2_19.aByteArray3;
				@Pc(18) int[] local18 = Class1_Sub1_Sub1.anIntArray155;
				local21 = local16.length;
				for (local23 = 0; local23 < local21; local23++) {
					if (local16[local23] == 0) {
						local18[local23] = 0;
					}
				}
				this.aClass1_Sub1_Sub1_Sub1_13.method107(33, this.anInt1003, this.anIntArray245, 256, this.anIntArray229, 25, 0, 0, 33, 25);
				this.aClass17_26.method218();
			} else {
				@Pc(67) int local67 = this.anInt1003 + this.anInt1011 & 0x7FF;
				@Pc(74) int local74 = aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 / 32 + 48;
				local21 = 464 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 / 32;
				this.aClass1_Sub1_Sub1_Sub1_16.method107(151, local67, this.anIntArray264, this.anInt998 + 256, this.anIntArray244, local21, 5, 25, 146, local74);
				this.aClass1_Sub1_Sub1_Sub1_13.method107(33, this.anInt1003, this.anIntArray245, 256, this.anIntArray229, 25, 0, 0, 33, 25);
				for (local23 = 0; local23 < this.anInt960; local23++) {
					local74 = this.anIntArray247[local23] * 4 + 2 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 / 32;
					local21 = this.anIntArray248[local23] * 4 + 2 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 / 32;
					this.method705(this.aClass1_Sub1_Sub1_Sub1Array7[local23], local74, local21);
				}
				@Pc(169) int local169;
				for (@Pc(165) int local165 = 0; local165 < 104; local165++) {
					for (local169 = 0; local169 < 104; local169++) {
						@Pc(181) Class21 local181 = this.aClass21ArrayArrayArray1[this.anInt881][local165][local169];
						if (local181 != null) {
							local74 = local165 * 4 + 2 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 / 32;
							local21 = local169 * 4 + 2 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 / 32;
							this.method705(this.aClass1_Sub1_Sub1_Sub1_8, local74, local21);
						}
					}
				}
				for (local169 = 0; local169 < this.anInt840; local169++) {
					@Pc(232) Class1_Sub1_Sub2_Sub1_Sub1 local232 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray215[local169]];
					if (local232 != null && local232.method132(aBoolean254)) {
						@Pc(241) Class6 local241 = local232.aClass6_1;
						if (local241.anIntArray6 != null) {
							local241 = local241.method31(this.anInt860);
						}
						if (local241 != null && local241.aBoolean14 && local241.aBoolean13) {
							local74 = local232.anInt268 / 32 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 / 32;
							local21 = local232.anInt269 / 32 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 / 32;
							this.method705(this.aClass1_Sub1_Sub1_Sub1_9, local74, local21);
						}
					}
				}
				@Pc(301) Class1_Sub1_Sub2_Sub1_Sub2 local301;
				for (@Pc(291) int local291 = 0; local291 < this.anInt868; local291++) {
					local301 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray223[local291]];
					if (local301 != null && local301.method132(aBoolean254)) {
						local74 = local301.anInt268 / 32 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 / 32;
						local21 = local301.anInt269 / 32 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 / 32;
						@Pc(329) boolean local329 = false;
						@Pc(333) long local333 = Class50.method559(local301.aString6);
						for (@Pc(335) int local335 = 0; local335 < this.anInt873; local335++) {
							if (local333 == this.aLongArray4[local335] && this.anIntArray212[local335] != 0) {
								local329 = true;
								break;
							}
						}
						@Pc(360) boolean local360 = false;
						if (aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt275 != 0 && local301.anInt275 != 0 && aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt275 == local301.anInt275) {
							local360 = true;
						}
						if (local329) {
							this.method705(this.aClass1_Sub1_Sub1_Sub1_11, local74, local21);
						} else if (local360) {
							this.method705(this.aClass1_Sub1_Sub1_Sub1_12, local74, local21);
						} else {
							this.method705(this.aClass1_Sub1_Sub1_Sub1_10, local74, local21);
						}
					}
				}
				if (this.anInt850 != 0 && anInt995 % 20 < 10) {
					if (this.anInt850 == 1 && this.anInt1018 >= 0 && this.anInt1018 < this.aClass1_Sub1_Sub2_Sub1_Sub1Array1.length) {
						@Pc(434) Class1_Sub1_Sub2_Sub1_Sub1 local434 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[this.anInt1018];
						if (local434 != null) {
							local74 = local434.anInt268 / 32 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 / 32;
							local21 = local434.anInt269 / 32 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 / 32;
							this.method645(this.aClass1_Sub1_Sub1_Sub1_4, local21, local74);
						}
					}
					if (this.anInt850 == 2) {
						local74 = (this.anInt886 - this.anInt936) * 4 + 2 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 / 32;
						local21 = (this.anInt887 - this.anInt937) * 4 + 2 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 / 32;
						this.method645(this.aClass1_Sub1_Sub1_Sub1_4, local21, local74);
					}
					if (this.anInt850 == 10 && this.anInt885 >= 0 && this.anInt885 < this.aClass1_Sub1_Sub2_Sub1_Sub2Array1.length) {
						local301 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[this.anInt885];
						if (local301 != null) {
							local74 = local301.anInt268 / 32 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 / 32;
							local21 = local301.anInt269 / 32 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 / 32;
							this.method645(this.aClass1_Sub1_Sub1_Sub1_4, local21, local74);
						}
					}
				}
				if (this.anInt1037 != 0) {
					local74 = this.anInt1037 * 4 + 2 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268 / 32;
					local21 = this.anInt1038 * 4 + 2 - aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269 / 32;
					this.method705(this.aClass1_Sub1_Sub1_Sub1_3, local74, local21);
				}
				Class1_Sub1_Sub1.method492(3, 78, 97, 16777215, 3);
				this.aClass17_26.method218();
			}
		} catch (@Pc(599) RuntimeException local599) {
			signlink.reporterror("83200, " + false + ", " + local599.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!GQOSZKJC;I)V")
	private void method691(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method692(arg0.anInt268, arg1, this.anInt859, arg0.anInt269);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("30100, " + true + ", " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= 128 && arg3 >= 128 && arg0 <= 13056 && arg3 <= 13056) {
				@Pc(28) int local28 = this.method606(this.anInt881, arg3, arg0) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt852;
				@Pc(38) int local38 = local28 - this.anInt853;
				@Pc(43) int local43 = arg3 - this.anInt854;
				@Pc(48) int local48 = Class1_Sub1_Sub2_Sub6.anIntArray206[this.anInt855];
				@Pc(53) int local53 = Class1_Sub1_Sub2_Sub6.anIntArray207[this.anInt855];
				@Pc(58) int local58 = Class1_Sub1_Sub2_Sub6.anIntArray206[this.anInt856];
				@Pc(63) int local63 = Class1_Sub1_Sub2_Sub6.anIntArray207[this.anInt856];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				if (arg2 >= 0) {
					this.aClass1_Sub1_Sub3_9.method258(27);
				}
				local73 = local38 * local53 - local83 * local48 >> 16;
				local43 = local38 * local48 + local83 * local53 >> 16;
				if (local43 >= 50) {
					this.anInt904 = Class1_Sub1_Sub1_Sub3.anInt581 + (local85 << 9) / local43;
					this.anInt905 = Class1_Sub1_Sub1_Sub3.anInt582 + (local73 << 9) / local43;
				} else {
					this.anInt904 = -1;
					this.anInt905 = -1;
				}
			} else {
				this.anInt904 = -1;
				this.anInt905 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("97939, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method693() {
		try {
			if (this.anInt1009 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt976 != 0) {
					local5 = 1;
				}
				for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
					if (this.aStringArray9[local17] != null) {
						@Pc(29) int local29 = this.anIntArray227[local17];
						@Pc(34) String local34 = this.aStringArray8[local17];
						if (local34 != null && local34.startsWith("@cr1@")) {
							local34 = local34.substring(5);
						}
						if (local34 != null && local34.startsWith("@cr2@")) {
							local34 = local34.substring(5);
						}
						if ((local29 == 3 || local29 == 7) && (local29 == 7 || this.anInt846 == 0 || this.anInt846 == 1 && this.method673(local34))) {
							@Pc(87) int local87 = 329 - local5 * 13;
							if (super.anInt827 > 4 && super.anInt828 - 4 > local87 - 10 && super.anInt828 - 4 <= local87 + 3) {
								@Pc(127) int local127 = this.aClass1_Sub1_Sub1_Sub4_3.method502(this.anInt978, "From:  " + local34 + this.aStringArray9[local17]) + 25;
								if (local127 > 450) {
									local127 = 450;
								}
								if (super.anInt827 < local127 + 4) {
									if (this.anInt857 >= 1) {
										this.aStringArray13[this.anInt985] = "Report abuse @whi@" + local34;
										this.anIntArray252[this.anInt985] = 2606;
										this.anInt985++;
									}
									this.aStringArray13[this.anInt985] = "Add ignore @whi@" + local34;
									this.anIntArray252[this.anInt985] = 2042;
									this.anInt985++;
									this.aStringArray13[this.anInt985] = "Add friend @whi@" + local34;
									this.anIntArray252[this.anInt985] = 2337;
									this.anInt985++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local29 == 5 || local29 == 6) && this.anInt846 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("61314, " + false + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass21_12.method246(); local6 != null; local6 = (Class1_Sub2) this.aClass21_12.method248()) {
				if (local6.anInt348 == arg6 && local6.anInt350 == arg7 && local6.anInt351 == arg4 && local6.anInt349 == arg3) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt348 = arg6;
				local1.anInt349 = arg3;
				local1.anInt350 = arg7;
				local1.anInt351 = arg4;
				this.method653(local1);
				this.aClass21_12.method243(local1);
			}
			local1.anInt344 = arg1;
			local1.anInt346 = arg5;
			local1.anInt345 = arg2;
			local1.anInt355 = arg8;
			local1.anInt347 = arg0;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("83646, " + 404 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!DUCMKFAY;Z)Z")
	private boolean method695(@OriginalArg(0) Class10 arg0) {
		try {
			if (arg0.anIntArray58 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < arg0.anIntArray58.length; local11++) {
				@Pc(19) int local19 = this.method688(341, arg0, local11);
				@Pc(24) int local24 = arg0.anIntArray54[local11];
				if (arg0.anIntArray58[local11] == 2) {
					if (local19 >= local24) {
						return false;
					}
				} else if (arg0.anIntArray58[local11] == 3) {
					if (local19 <= local24) {
						return false;
					}
				} else if (arg0.anIntArray58[local11] == 4) {
					if (local19 == local24) {
						return false;
					}
				} else if (local19 != local24) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("43472, " + arg0 + ", " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method696(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean221) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method583(43595);
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

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method697() {
		try {
			@Pc(8) int local8;
			if (this.anInt942 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt942 > 768) {
						this.anIntArray217[local8] = this.method647(this.anIntArray218[local8], this.anIntArray219[local8], 1024 - this.anInt942);
					} else if (this.anInt942 > 256) {
						this.anIntArray217[local8] = this.anIntArray219[local8];
					} else {
						this.anIntArray217[local8] = this.method647(this.anIntArray219[local8], this.anIntArray218[local8], 256 - this.anInt942);
					}
				}
			} else if (this.anInt943 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt943 > 768) {
						this.anIntArray217[local8] = this.method647(this.anIntArray218[local8], this.anIntArray220[local8], 1024 - this.anInt943);
					} else if (this.anInt943 > 256) {
						this.anIntArray217[local8] = this.anIntArray220[local8];
					} else {
						this.anIntArray217[local8] = this.method647(this.anIntArray220[local8], this.anIntArray218[local8], 256 - this.anInt943);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray217[local8] = this.anIntArray218[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass17_15.anIntArray69[local8] = this.aClass1_Sub1_Sub1_Sub1_14.anIntArray39[local8];
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
				local198 = this.anIntArray230[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray213[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray217[local220];
						local239 = this.aClass17_15.anIntArray69[local183];
						this.aClass17_15.anIntArray69[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass17_15.method219(0, super.aGraphics2, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass17_16.anIntArray69[local198] = this.aClass1_Sub1_Sub1_Sub1_15.anIntArray39[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray230[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray213[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray217[local228];
						@Pc(373) int local373 = this.aClass17_16.anIntArray69[local183];
						this.aClass17_16.anIntArray69[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass17_16.method219(0, super.aGraphics2, 637);
		} catch (@Pc(453) RuntimeException local453) {
			signlink.reporterror("45513, " + 9 + ", " + local453.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!MBMGIXGO;)V")
	private void method698(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method279(8);
			@Pc(12) int local12;
			if (local6 < this.anInt868) {
				for (local12 = local6; local12 < this.anInt868; local12++) {
					this.anIntArray216[this.anInt842++] = this.anIntArray223[local12];
				}
			}
			if (local6 > this.anInt868) {
				signlink.reporterror(this.aString25 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt868 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray223[local12];
				@Pc(69) Class1_Sub1_Sub2_Sub1_Sub2 local69 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local64];
				@Pc(74) int local74 = arg1.method279(1);
				if (local74 == 0) {
					this.anIntArray223[this.anInt868++] = local64;
					local69.anInt256 = anInt995;
				} else {
					@Pc(97) int local97 = arg1.method279(2);
					if (local97 == 0) {
						this.anIntArray223[this.anInt868++] = local64;
						local69.anInt256 = anInt995;
						this.anIntArray224[this.anInt869++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray223[this.anInt868++] = local64;
							local69.anInt256 = anInt995;
							local148 = arg1.method279(3);
							local69.method131(false, local148);
							local158 = arg1.method279(1);
							if (local158 == 1) {
								this.anIntArray224[this.anInt869++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray223[this.anInt868++] = local64;
							local69.anInt256 = anInt995;
							local148 = arg1.method279(3);
							local69.method131(true, local148);
							local158 = arg1.method279(3);
							local69.method131(true, local158);
							@Pc(216) int local216 = arg1.method279(1);
							if (local216 == 1) {
								this.anIntArray224[this.anInt869++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray216[this.anInt842++] = local64;
						}
					}
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("47230, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method699(@OriginalArg(0) boolean arg0) {
		try {
			this.method628();
			this.aClass17_14.method218();
			this.aClass1_Sub1_Sub1_Sub2_6.method155(0, 0);
			@Pc(48) byte local48;
			@Pc(61) int local61;
			if (this.anInt839 == 0) {
				this.aClass1_Sub1_Sub1_Sub4_2.method501(7711145, 180, this.anInt891, this.aClass14_Sub1_1.aString12, 180, true);
				local48 = 80;
				this.aClass1_Sub1_Sub1_Sub4_4.method501(16776960, 180, this.anInt891, "Welcome to RuneScape", 80, true);
				local61 = local48 + 30;
				this.aClass1_Sub1_Sub1_Sub2_7.method155(27, 100);
				this.aClass1_Sub1_Sub1_Sub4_4.method501(16777215, 100, this.anInt891, "New User", 125, true);
				this.aClass1_Sub1_Sub1_Sub2_7.method155(187, 100);
				this.aClass1_Sub1_Sub1_Sub4_4.method501(16777215, 260, this.anInt891, "Existing User", 125, true);
			}
			if (this.anInt839 == 2) {
				local48 = 60;
				if (this.aString28.length() > 0) {
					this.aClass1_Sub1_Sub1_Sub4_4.method501(16776960, 180, this.anInt891, this.aString28, 45, true);
					this.aClass1_Sub1_Sub1_Sub4_4.method501(16776960, 180, this.anInt891, this.aString29, 60, true);
					local61 = local48 + 30;
				} else {
					this.aClass1_Sub1_Sub1_Sub4_4.method501(16776960, 180, this.anInt891, this.aString29, 53, true);
					local61 = local48 + 30;
				}
				this.aClass1_Sub1_Sub1_Sub4_4.method508(true, 90, 16777215, "Username: " + this.aString25 + (this.anInt1015 == 0 & anInt995 % 40 < 20 ? "@yel@|" : ""), 90);
				local61 += 15;
				this.aClass1_Sub1_Sub1_Sub4_4.method508(true, 92, 16777215, "Password: " + Class50.method564(this.aString26) + (this.anInt1015 == 1 & anInt995 % 40 < 20 ? "@yel@|" : ""), 105);
				local61 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub1_Sub2_7.method155(27, 130);
					this.aClass1_Sub1_Sub1_Sub4_4.method501(16777215, 100, this.anInt891, "Login", 155, true);
					this.aClass1_Sub1_Sub1_Sub2_7.method155(187, 130);
					this.aClass1_Sub1_Sub1_Sub4_4.method501(16777215, 260, this.anInt891, "Cancel", 155, true);
				}
			}
			if (this.anInt839 == 3) {
				this.aClass1_Sub1_Sub1_Sub4_4.method501(16776960, 180, this.anInt891, "Create a free account", 40, true);
				local48 = 65;
				this.aClass1_Sub1_Sub1_Sub4_4.method501(16777215, 180, this.anInt891, "To create a new account you need to", 65, true);
				local61 = local48 + 15;
				this.aClass1_Sub1_Sub1_Sub4_4.method501(16777215, 180, this.anInt891, "go back to the main RuneScape webpage", 80, true);
				local61 += 15;
				this.aClass1_Sub1_Sub1_Sub4_4.method501(16777215, 180, this.anInt891, "and choose the red 'create account'", 95, true);
				local61 += 15;
				this.aClass1_Sub1_Sub1_Sub4_4.method501(16777215, 180, this.anInt891, "button at the top right of that page.", 110, true);
				local61 += 15;
				this.aClass1_Sub1_Sub1_Sub2_7.method155(107, 130);
				this.aClass1_Sub1_Sub1_Sub4_4.method501(16777215, 180, this.anInt891, "Cancel", 155, true);
			}
			this.aClass17_14.method219(171, super.aGraphics2, 202);
			if (this.aBoolean260) {
				this.aBoolean260 = false;
				this.aClass17_12.method219(0, super.aGraphics2, 128);
				this.aClass17_13.method219(371, super.aGraphics2, 202);
				this.aClass17_17.method219(265, super.aGraphics2, 0);
				this.aClass17_18.method219(265, super.aGraphics2, 562);
				this.aClass17_19.method219(171, super.aGraphics2, 128);
				this.aClass17_20.method219(171, super.aGraphics2, 562);
			}
		} catch (@Pc(507) RuntimeException local507) {
			signlink.reporterror("92290, " + arg0 + ", " + false + ", " + local507.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method700() {
		try {
			this.aBoolean229 = true;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean219) {
					this.anInt1010++;
					this.method622();
					this.method622();
					this.method697();
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
			this.aBoolean229 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("48378, " + 59 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method574(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean260 = true;
			@Pc(7) boolean local7 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("97636, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MBMGIXGO;I)V")
	private void method701(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			while (arg0 >= 0) {
				arg2 = -1;
			}
			@Pc(13) int local13;
			@Pc(22) int local22;
			@Pc(29) int local29;
			@Pc(32) int local32;
			@Pc(35) int local35;
			@Pc(38) int local38;
			if (arg2 == 84) {
				local13 = arg1.method268();
				local22 = this.anInt1041 + (local13 >> 4 & 0x7);
				local29 = this.anInt1042 + (local13 & 0x7);
				local32 = arg1.method270();
				local35 = arg1.method270();
				local38 = arg1.method270();
				if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
					@Pc(58) Class21 local58 = this.aClass21ArrayArrayArray1[this.anInt881][local22][local29];
					if (local58 != null) {
						for (@Pc(64) Class1_Sub1_Sub2_Sub2 local64 = (Class1_Sub1_Sub2_Sub2) local58.method246(); local64 != null; local64 = (Class1_Sub1_Sub2_Sub2) local58.method248()) {
							if (local64.anInt390 == (local32 & 0x7FFF) && local64.anInt391 == local35) {
								local64.anInt391 = local38;
								break;
							}
						}
						this.method589(local22, local29);
					}
				}
			} else {
				@Pc(131) int local131;
				if (arg2 == 105) {
					local13 = arg1.method268();
					local22 = this.anInt1041 + (local13 >> 4 & 0x7);
					local29 = this.anInt1042 + (local13 & 0x7);
					local32 = arg1.method270();
					local35 = arg1.method268();
					local38 = local35 >> 4 & 0xF;
					local131 = local35 & 0x7;
					if (aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0] >= local22 - local38 && aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0] <= local22 + local38 && aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0] >= local29 - local38 && aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0] <= local29 + local38 && this.aBoolean220 && !aBoolean228 && this.anInt953 < 50) {
						this.anIntArray263[this.anInt953] = local32;
						this.anIntArray270[this.anInt953] = local131;
						this.anIntArray271[this.anInt953] = Class18.anIntArray70[local32];
						this.anInt953++;
					}
				}
				if (arg2 == 215) {
					local13 = arg1.method295();
					local22 = arg1.method288();
					local29 = this.anInt1041 + (local22 >> 4 & 0x7);
					local32 = this.anInt1042 + (local22 & 0x7);
					local35 = arg1.method295();
					local38 = arg1.method270();
					if (local29 >= 0 && local32 >= 0 && local29 < 104 && local32 < 104 && local35 != this.anInt864) {
						@Pc(250) Class1_Sub1_Sub2_Sub2 local250 = new Class1_Sub1_Sub2_Sub2();
						local250.anInt390 = local13;
						local250.anInt391 = local38;
						if (this.aClass21ArrayArrayArray1[this.anInt881][local29][local32] == null) {
							this.aClass21ArrayArrayArray1[this.anInt881][local29][local32] = new Class21(169);
						}
						this.aClass21ArrayArrayArray1[this.anInt881][local29][local32].method243(local250);
						this.method589(local29, local32);
					}
				} else {
					@Pc(347) Class1_Sub1_Sub2_Sub2 local347;
					if (arg2 == 156) {
						local13 = arg1.method286();
						local22 = this.anInt1041 + (local13 >> 4 & 0x7);
						local29 = this.anInt1042 + (local13 & 0x7);
						local32 = arg1.method270();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							@Pc(341) Class21 local341 = this.aClass21ArrayArrayArray1[this.anInt881][local22][local29];
							if (local341 != null) {
								for (local347 = (Class1_Sub1_Sub2_Sub2) local341.method246(); local347 != null; local347 = (Class1_Sub1_Sub2_Sub2) local341.method248()) {
									if (local347.anInt390 == (local32 & 0x7FFF)) {
										local347.method526();
										break;
									}
								}
								if (local341.method246() == null) {
									this.aClass21ArrayArrayArray1[this.anInt881][local22][local29] = null;
								}
								this.method589(local22, local29);
							}
						}
					} else {
						@Pc(428) int local428;
						@Pc(448) int local448;
						@Pc(460) int local460;
						@Pc(474) int local474;
						@Pc(486) int local486;
						@Pc(506) int local506;
						if (arg2 == 160) {
							local13 = arg1.method288();
							local22 = this.anInt1041 + (local13 >> 4 & 0x7);
							local29 = this.anInt1042 + (local13 & 0x7);
							local32 = arg1.method288();
							local35 = local32 >> 2;
							local38 = local32 & 0x3;
							local131 = this.anIntArray255[local35];
							local428 = arg1.method295();
							if (local22 >= 0 && local29 >= 0 && local22 < 103 && local29 < 103) {
								local448 = this.anIntArrayArrayArray8[this.anInt881][local22][local29];
								local460 = this.anIntArrayArrayArray8[this.anInt881][local22 + 1][local29];
								local474 = this.anIntArrayArrayArray8[this.anInt881][local22 + 1][local29 + 1];
								local486 = this.anIntArrayArrayArray8[this.anInt881][local22][local29 + 1];
								if (local131 == 0) {
									@Pc(497) Class11 local497 = this.aClass27_1.method339(this.anInt881, local22, local29);
									if (local497 != null) {
										local506 = local497.anInt361 >> 14 & 0x7FFF;
										if (local35 == 2) {
											local497.aClass1_Sub1_Sub2_4 = new Class1_Sub1_Sub2_Sub5(local506, local38 + 4, 2, local460, (byte) 7, local474, local448, local486, local428, false);
											local497.aClass1_Sub1_Sub2_5 = new Class1_Sub1_Sub2_Sub5(local506, local38 + 1 & 0x3, 2, local460, (byte) 7, local474, local448, local486, local428, false);
										} else {
											local497.aClass1_Sub1_Sub2_4 = new Class1_Sub1_Sub2_Sub5(local506, local38, local35, local460, (byte) 7, local474, local448, local486, local428, false);
										}
									}
								}
								if (local131 == 1) {
									@Pc(574) Class28 local574 = this.aClass27_1.method340(local22, local29, this.anInt881);
									if (local574 != null) {
										local574.aClass1_Sub1_Sub2_6 = new Class1_Sub1_Sub2_Sub5(local574.anInt540 >> 14 & 0x7FFF, 0, 4, local460, (byte) 7, local474, local448, local486, local428, false);
									}
								}
								if (local131 == 2) {
									@Pc(608) Class30 local608 = this.aClass27_1.method341(local22, local29, (byte) 4, this.anInt881);
									if (local35 == 11) {
										local35 = 10;
									}
									if (local608 != null) {
										local608.aClass1_Sub1_Sub2_7 = new Class1_Sub1_Sub2_Sub5(local608.anInt565 >> 14 & 0x7FFF, local38, local35, local460, (byte) 7, local474, local448, local486, local428, false);
									}
								}
								if (local131 == 3) {
									@Pc(647) Class49 local647 = this.aClass27_1.method342(local29, local22, this.anInt881);
									if (local647 != null) {
										local647.aClass1_Sub1_Sub2_8 = new Class1_Sub1_Sub2_Sub5(local647.anInt787 >> 14 & 0x7FFF, local38, 22, local460, (byte) 7, local474, local448, local486, local428, false);
									}
								}
							}
						} else {
							if (arg2 == 147) {
								local13 = arg1.method288();
								local22 = this.anInt1041 + (local13 >> 4 & 0x7);
								local29 = this.anInt1042 + (local13 & 0x7);
								local32 = arg1.method270();
								@Pc(700) byte local700 = arg1.method290();
								local38 = arg1.method294();
								@Pc(708) byte local708 = arg1.method289();
								local428 = arg1.method270();
								local448 = arg1.method288();
								local460 = local448 >> 2;
								local474 = local448 & 0x3;
								local486 = this.anIntArray255[local460];
								@Pc(731) byte local731 = arg1.method269();
								local506 = arg1.method270();
								@Pc(738) byte local738 = arg1.method289();
								@Pc(744) Class1_Sub1_Sub2_Sub1_Sub2 local744;
								if (local32 == this.anInt864) {
									local744 = aClass1_Sub1_Sub2_Sub1_Sub2_1;
								} else {
									local744 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local32];
								}
								if (local744 != null) {
									@Pc(756) Class46 local756 = Class46.method515(local506);
									@Pc(766) int local766 = this.anIntArrayArrayArray8[this.anInt881][local22][local29];
									@Pc(778) int local778 = this.anIntArrayArrayArray8[this.anInt881][local22 + 1][local29];
									@Pc(792) int local792 = this.anIntArrayArrayArray8[this.anInt881][local22 + 1][local29 + 1];
									@Pc(804) int local804 = this.anIntArrayArrayArray8[this.anInt881][local22][local29 + 1];
									@Pc(814) Class1_Sub1_Sub2_Sub6 local814 = local756.method521(local460, local474, local766, local778, local792, local804, -1);
									if (local814 != null) {
										this.method694(local428 + 1, -1, 0, local486, local29, 0, this.anInt881, local22, local38 + 1);
										local744.anInt279 = local38 + anInt995;
										local744.anInt280 = local428 + anInt995;
										local744.aClass1_Sub1_Sub2_Sub6_1 = local814;
										@Pc(849) int local849 = local756.anInt746;
										@Pc(852) int local852 = local756.anInt756;
										if (local474 == 1 || local474 == 3) {
											local849 = local756.anInt756;
											local852 = local756.anInt746;
										}
										local744.anInt282 = local22 * 128 + local849 * 64;
										local744.anInt284 = local29 * 128 + local852 * 64;
										local744.anInt283 = this.method606(this.anInt881, local744.anInt284, local744.anInt282);
										@Pc(898) byte local898;
										if (local731 > local700) {
											local898 = local731;
											local731 = local700;
											local700 = local898;
										}
										if (local738 > local708) {
											local898 = local738;
											local738 = local708;
											local708 = local898;
										}
										local744.anInt286 = local22 + local731;
										local744.anInt288 = local22 + local700;
										local744.anInt287 = local29 + local738;
										local744.anInt289 = local29 + local708;
									}
								}
							}
							if (arg2 == 151) {
								local13 = arg1.method286();
								local22 = this.anInt1041 + (local13 >> 4 & 0x7);
								local29 = this.anInt1042 + (local13 & 0x7);
								local32 = arg1.method294();
								local35 = arg1.method288();
								local38 = local35 >> 2;
								local131 = local35 & 0x3;
								local428 = this.anIntArray255[local38];
								if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
									this.method694(-1, local32, local131, local428, local29, local38, this.anInt881, local22, 0);
								}
							} else if (arg2 == 4) {
								local13 = arg1.method268();
								local22 = this.anInt1041 + (local13 >> 4 & 0x7);
								local29 = this.anInt1042 + (local13 & 0x7);
								local32 = arg1.method270();
								local35 = arg1.method268();
								local38 = arg1.method270();
								if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
									local22 = local22 * 128 + 64;
									local29 = local29 * 128 + 64;
									@Pc(1073) Class1_Sub1_Sub2_Sub3 local1073 = new Class1_Sub1_Sub2_Sub3(this.anInt881, anInt995, 6, local38, local32, this.method606(this.anInt881, local29, local22) - local35, local29, local22);
									this.aClass21_11.method243(local1073);
								}
							} else if (arg2 == 44) {
								local13 = arg1.method296();
								local22 = arg1.method270();
								local29 = arg1.method268();
								local32 = this.anInt1041 + (local29 >> 4 & 0x7);
								local35 = this.anInt1042 + (local29 & 0x7);
								if (local32 >= 0 && local35 >= 0 && local32 < 104 && local35 < 104) {
									local347 = new Class1_Sub1_Sub2_Sub2();
									local347.anInt390 = local13;
									local347.anInt391 = local22;
									if (this.aClass21ArrayArrayArray1[this.anInt881][local32][local35] == null) {
										this.aClass21ArrayArrayArray1[this.anInt881][local32][local35] = new Class21(169);
									}
									this.aClass21ArrayArrayArray1[this.anInt881][local32][local35].method243(local347);
									this.method589(local32, local35);
								}
							} else if (arg2 == 101) {
								local13 = arg1.method287();
								local22 = local13 >> 2;
								local29 = local13 & 0x3;
								local32 = this.anIntArray255[local22];
								local35 = arg1.method268();
								local38 = this.anInt1041 + (local35 >> 4 & 0x7);
								local131 = this.anInt1042 + (local35 & 0x7);
								if (local38 >= 0 && local131 >= 0 && local38 < 104 && local131 < 104) {
									this.method694(-1, -1, local29, local32, local131, local22, this.anInt881, local38, 0);
								}
							} else if (arg2 == 117) {
								local13 = arg1.method268();
								local22 = this.anInt1041 + (local13 >> 4 & 0x7);
								local29 = this.anInt1042 + (local13 & 0x7);
								local32 = local22 + arg1.method269();
								local35 = local29 + arg1.method269();
								local38 = arg1.method271();
								local131 = arg1.method270();
								local428 = arg1.method268() * 4;
								local448 = arg1.method268() * 4;
								local460 = arg1.method270();
								local474 = arg1.method270();
								local486 = arg1.method268();
								@Pc(1289) int local1289 = arg1.method268();
								if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local32 >= 0 && local35 >= 0 && local32 < 104 && local35 < 104 && local131 != 65535) {
									local22 = local22 * 128 + 64;
									local29 = local29 * 128 + 64;
									local32 = local32 * 128 + 64;
									local35 = local35 * 128 + 64;
									@Pc(1365) Class1_Sub1_Sub2_Sub4 local1365 = new Class1_Sub1_Sub2_Sub4(local486, local448, 46883, local460 + anInt995, local474 + anInt995, local1289, this.anInt881, this.method606(this.anInt881, local29, local22) - local428, local29, local22, local38, local131);
									local1365.method461(local460 + anInt995, local35, this.method606(this.anInt881, local35, local32) - local448, local32);
									this.aClass21_10.method243(local1365);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1388) RuntimeException local1388) {
			signlink.reporterror("29026, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!MBMGIXGO;II)V")
	private void method703(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method278(this.anInt980);
			@Pc(15) int local15 = arg0.method279(8);
			@Pc(21) int local21;
			if (local15 < this.anInt840) {
				for (local21 = local15; local21 < this.anInt840; local21++) {
					this.anIntArray216[this.anInt842++] = this.anIntArray215[local21];
				}
			}
			if (local15 > this.anInt840) {
				signlink.reporterror(this.aString25 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt840 = 0;
			for (local21 = 0; local21 < local15; local21++) {
				@Pc(73) int local73 = this.anIntArray215[local21];
				@Pc(78) Class1_Sub1_Sub2_Sub1_Sub1 local78 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local73];
				@Pc(83) int local83 = arg0.method279(1);
				if (local83 == 0) {
					this.anIntArray215[this.anInt840++] = local73;
					local78.anInt256 = anInt995;
				} else {
					@Pc(106) int local106 = arg0.method279(2);
					if (local106 == 0) {
						this.anIntArray215[this.anInt840++] = local73;
						local78.anInt256 = anInt995;
						this.anIntArray224[this.anInt869++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray215[this.anInt840++] = local73;
							local78.anInt256 = anInt995;
							local157 = arg0.method279(3);
							local78.method131(false, local157);
							local167 = arg0.method279(1);
							if (local167 == 1) {
								this.anIntArray224[this.anInt869++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray215[this.anInt840++] = local73;
							local78.anInt256 = anInt995;
							local157 = arg0.method279(3);
							local78.method131(true, local157);
							local167 = arg0.method279(3);
							local78.method131(true, local167);
							@Pc(225) int local225 = arg0.method279(1);
							if (local225 == 1) {
								this.anIntArray224[this.anInt869++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray216[this.anInt842++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("60808, " + arg0 + ", " + -45 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method704() {
		try {
			@Pc(16) int local16;
			@Pc(23) int local23;
			if (this.anInt839 == 0) {
				local16 = super.anInt823 / 2 - 80;
				local23 = super.anInt824 / 2 + 20;
				local23 += 20;
				if (super.anInt832 == 1 && super.anInt833 >= local16 - 75 && super.anInt833 <= local16 + 75 && super.anInt834 >= local23 - 20 && super.anInt834 <= local23 + 20) {
					this.anInt839 = 3;
					this.anInt1015 = 0;
				}
				local16 = super.anInt823 / 2 + 80;
				if (super.anInt832 == 1 && super.anInt833 >= local16 - 75 && super.anInt833 <= local16 + 75 && super.anInt834 >= local23 - 20 && super.anInt834 <= local23 + 20) {
					this.aString28 = "";
					this.aString29 = "Enter your username & password.";
					this.anInt839 = 2;
					this.anInt1015 = 0;
				}
			} else if (this.anInt839 == 2) {
				local16 = super.anInt824 / 2 - 40;
				local16 += 30;
				local16 += 25;
				if (super.anInt832 == 1 && super.anInt834 >= local16 - 15 && super.anInt834 < local16) {
					this.anInt1015 = 0;
				}
				local16 += 15;
				if (super.anInt832 == 1 && super.anInt834 >= local16 - 15 && super.anInt834 < local16) {
					this.anInt1015 = 1;
				}
				local16 += 15;
				local23 = super.anInt823 / 2 - 80;
				@Pc(169) int local169 = super.anInt824 / 2 + 50;
				@Pc(170) int local170 = local169 + 20;
				if (super.anInt832 == 1 && super.anInt833 >= local23 - 75 && super.anInt833 <= local23 + 75 && super.anInt834 >= local170 - 20 && super.anInt834 <= local170 + 20) {
					this.anInt940 = 0;
					this.method648(this.aString25, this.aString26, false);
					if (this.aBoolean246) {
						return;
					}
				}
				local23 = super.anInt823 / 2 + 80;
				if (super.anInt832 == 1 && super.anInt833 >= local23 - 75 && super.anInt833 <= local23 + 75 && super.anInt834 >= local170 - 20 && super.anInt834 <= local170 + 20) {
					this.anInt839 = 0;
					this.aString25 = "";
					this.aString26 = "";
				}
				while (true) {
					while (true) {
						@Pc(260) int local260 = this.method569();
						if (local260 == -1) {
							return;
						}
						@Pc(265) boolean local265 = false;
						for (@Pc(267) int local267 = 0; local267 < aString24.length(); local267++) {
							if (local260 == aString24.charAt(local267)) {
								local265 = true;
								break;
							}
						}
						if (this.anInt1015 == 0) {
							if (local260 == 8 && this.aString25.length() > 0) {
								this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt1015 = 1;
							}
							if (local265) {
								this.aString25 = this.aString25 + (char) local260;
							}
							if (this.aString25.length() > 12) {
								this.aString25 = this.aString25.substring(0, 12);
							}
						} else if (this.anInt1015 == 1) {
							if (local260 == 8 && this.aString26.length() > 0) {
								this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt1015 = 0;
							}
							if (local265) {
								this.aString26 = this.aString26 + (char) local260;
							}
							if (this.aString26.length() > 20) {
								this.aString26 = this.aString26.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt839 == 3) {
				local16 = super.anInt823 / 2;
				local23 = super.anInt824 / 2 + 50;
				@Pc(424) int local424 = local23 + 20;
				if (super.anInt832 == 1 && super.anInt833 >= local16 - 75 && super.anInt833 <= local16 + 75 && super.anInt834 >= local424 - 20 && super.anInt834 <= local424 + 20) {
					this.anInt839 = 0;
					return;
				}
			}
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("8370, " + true + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CXGZMTJK;IIZ)V")
	private void method705(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt1003 + this.anInt1011 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg2 * arg2;
			if (local15 <= 6400) {
				@Pc(26) int local26 = Class1_Sub1_Sub2_Sub6.anIntArray206[local7];
				@Pc(30) int local30 = Class1_Sub1_Sub2_Sub6.anIntArray207[local7];
				@Pc(39) int local39 = local26 * 256 / (this.anInt998 + 256);
				@Pc(48) int local48 = local30 * 256 / (this.anInt998 + 256);
				@Pc(58) int local58 = arg2 * local39 + arg1 * local48 >> 16;
				@Pc(68) int local68 = arg2 * local48 - arg1 * local39 >> 16;
				if (local15 > 2500) {
					arg0.method109(this.aClass1_Sub1_Sub1_Sub2_19, 83 - local68 - arg0.anInt190 / 2 - 4, local58 + 94 - arg0.anInt189 / 2 + 4);
				} else {
					arg0.method103(local58 + 94 + 4 - arg0.anInt189 / 2, 83 - local68 - arg0.anInt190 / 2 - 4);
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("45113, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 >= 1 && arg0 >= 1 && arg4 <= 102 && arg0 <= 102) {
				if (aBoolean228 && arg1 != this.anInt881) {
					return;
				}
				@Pc(31) int local31 = 0;
				if (arg5 == 0) {
					local31 = this.aClass27_1.method343(arg1, arg4, arg0);
				}
				if (arg5 == 1) {
					local31 = this.aClass27_1.method344(arg1, arg4, arg0);
				}
				if (arg5 == 2) {
					local31 = this.aClass27_1.method345(arg1, arg4, arg0);
				}
				if (arg5 == 3) {
					local31 = this.aClass27_1.method346(arg1, arg4, arg0);
				}
				@Pc(87) int local87;
				if (local31 != 0) {
					local87 = this.aClass27_1.method347(arg1, arg4, arg0, local31);
					@Pc(93) int local93 = local31 >> 14 & 0x7FFF;
					@Pc(97) int local97 = local87 & 0x1F;
					@Pc(101) int local101 = local87 >> 6;
					@Pc(113) Class46 local113;
					if (arg5 == 0) {
						this.aClass27_1.method334(arg4, arg1, arg0);
						local113 = Class46.method515(local93);
						if (local113.aBoolean201) {
							this.aClass12Array1[arg1].method169(local101, local97, local113.aBoolean196, arg4, arg0);
						}
					}
					if (arg5 == 1) {
						this.aClass27_1.method335(arg0, arg1, arg4);
					}
					if (arg5 == 2) {
						this.aClass27_1.method336(arg1, arg4, arg0);
						local113 = Class46.method515(local93);
						if (arg4 + local113.anInt746 > 103 || arg0 + local113.anInt746 > 103 || arg4 + local113.anInt756 > 103 || arg0 + local113.anInt756 > 103) {
							return;
						}
						if (local113.aBoolean201) {
							this.aClass12Array1[arg1].method170(local101, local113.anInt746, arg4, arg0, local113.anInt756, local113.aBoolean196);
						}
					}
					if (arg5 == 3) {
						this.aClass27_1.method337((byte) 9, arg1, arg0, arg4);
						local113 = Class46.method515(local93);
						if (local113.aBoolean201 && local113.aBoolean203) {
							this.aClass12Array1[arg1].method172(360, arg0, arg4);
						}
					}
				}
				if (arg6 >= 0) {
					local87 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray8[1][arg4][arg0] & 0x2) == 2) {
						local87 = arg1 + 1;
					}
					Class8.method58(this.aClass27_1, arg2, arg0, arg3, local87, this.aClass12Array1[arg1], this.anIntArrayArrayArray8, arg4, arg6, arg1);
					return;
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("56911, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 4 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!MBMGIXGO;I)V")
	private void method707(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt842 = 0;
			this.anInt869 = 0;
			this.method681(arg1, arg0, (byte) 5);
			this.method698(arg0, arg1);
			this.method655(arg1, arg0, (byte) 8);
			this.method613(arg0, (byte) 2, arg1);
			@Pc(43) int local43;
			for (@Pc(36) int local36 = 0; local36 < this.anInt842; local36++) {
				local43 = this.anIntArray216[local36];
				if (this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local43].anInt256 != anInt995) {
					this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local43] = null;
				}
			}
			if (arg1.anInt468 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt468 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local43 = 0; local43 < this.anInt868; local43++) {
				if (this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray223[local43]] == null) {
					signlink.reporterror(this.aString25 + " null entry in pl list - pos:" + local43 + " size:" + this.anInt868);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("70865, " + arg0 + ", " + arg1 + ", " + 9759 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg1 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg0;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(41) int local41;
			if (local5 != 0) {
				local27 = Class1_Sub1_Sub2_Sub6.anIntArray206[local5];
				local31 = Class1_Sub1_Sub2_Sub6.anIntArray207[local5];
				local41 = local31 * 0 - arg0 * local27 >> 16;
				local17 = local27 * 0 + arg0 * local31 >> 16;
				local15 = local41;
			}
			if (local11 != 0) {
				local27 = Class1_Sub1_Sub2_Sub6.anIntArray206[local11];
				local31 = Class1_Sub1_Sub2_Sub6.anIntArray207[local11];
				local41 = local17 * local27 + local31 * 0 >> 16;
				local17 = local17 * local31 - local27 * 0 >> 16;
				local13 = local41;
			}
			this.anInt852 = arg2 - local13;
			this.anInt853 = arg3 - local15;
			this.anInt854 = arg5 - local17;
			this.anInt855 = arg1;
			this.anInt856 = arg4;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("69735, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)Z")
	private boolean method709() {
		try {
			if (this.aClass26_1 == null) {
				return false;
			}
			@Pc(2048) String local2048;
			@Pc(237) int local237;
			try {
				@Pc(15) int local15 = this.aClass26_1.method312();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt923 == -1) {
					this.aClass26_1.method313(this.aClass1_Sub1_Sub3_8.aByteArray10, 0, 1);
					this.anInt923 = this.aClass1_Sub1_Sub3_8.aByteArray10[0] & 0xFF;
					if (this.aClass19_2 != null) {
						this.anInt923 = this.anInt923 - this.aClass19_2.method227() & 0xFF;
					}
					this.anInt922 = Class32.anIntArray111[this.anInt923];
					local15--;
				}
				if (this.anInt922 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass26_1.method313(this.aClass1_Sub1_Sub3_8.aByteArray10, 0, 1);
					this.anInt922 = this.aClass1_Sub1_Sub3_8.aByteArray10[0] & 0xFF;
					local15--;
				}
				if (this.anInt922 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass26_1.method313(this.aClass1_Sub1_Sub3_8.aByteArray10, 0, 2);
					this.aClass1_Sub1_Sub3_8.anInt468 = 0;
					this.anInt922 = this.aClass1_Sub1_Sub3_8.method270();
					local15 -= 2;
				}
				if (local15 < this.anInt922) {
					return false;
				}
				this.aClass1_Sub1_Sub3_8.anInt468 = 0;
				this.aClass26_1.method313(this.aClass1_Sub1_Sub3_8.aByteArray10, 0, this.anInt922);
				this.anInt924 = 0;
				this.anInt845 = this.anInt844;
				this.anInt844 = this.anInt843;
				this.anInt843 = this.anInt923;
				if (this.anInt923 == 81) {
					this.method707(this.anInt922, this.aClass1_Sub1_Sub3_8);
					this.aBoolean238 = false;
					this.anInt923 = -1;
					return true;
				}
				if (this.anInt923 == 176) {
					this.anInt996 = this.aClass1_Sub1_Sub3_8.method287();
					this.anInt993 = this.aClass1_Sub1_Sub3_8.method295();
					this.anInt982 = this.aClass1_Sub1_Sub3_8.method268();
					this.anInt1008 = this.aClass1_Sub1_Sub3_8.method300();
					this.anInt921 = this.aClass1_Sub1_Sub3_8.method270();
					if (this.anInt1008 != 0 && this.anInt851 == -1) {
						signlink.dnslookup(Class50.method562(this.anInt1008));
						this.method711();
						@Pc(219) short local219 = 650;
						if (this.anInt996 != 201 || this.anInt982 == 1) {
							local219 = 655;
						}
						this.aString18 = "";
						this.aBoolean247 = false;
						for (local237 = 0; local237 < Class10.aClass10Array1.length; local237++) {
							if (Class10.aClass10Array1[local237] != null && Class10.aClass10Array1[local237].anInt314 == local219) {
								this.anInt851 = Class10.aClass10Array1[local237].anInt326;
								break;
							}
						}
					}
					this.anInt923 = -1;
					return true;
				}
				@Pc(286) int local286;
				if (this.anInt923 == 64) {
					this.anInt1041 = this.aClass1_Sub1_Sub3_8.method287();
					this.anInt1042 = this.aClass1_Sub1_Sub3_8.method288();
					for (local286 = this.anInt1041; local286 < this.anInt1041 + 8; local286++) {
						for (local237 = this.anInt1042; local237 < this.anInt1042 + 8; local237++) {
							if (this.aClass21ArrayArrayArray1[this.anInt881][local286][local237] != null) {
								this.aClass21ArrayArrayArray1[this.anInt881][local286][local237] = null;
								this.method589(local286, local237);
							}
						}
					}
					for (@Pc(336) Class1_Sub2 local336 = (Class1_Sub2) this.aClass21_12.method246(); local336 != null; local336 = (Class1_Sub2) this.aClass21_12.method248()) {
						if (local336.anInt350 >= this.anInt1041 && local336.anInt350 < this.anInt1041 + 8 && local336.anInt351 >= this.anInt1042 && local336.anInt351 < this.anInt1042 + 8 && local336.anInt348 == this.anInt881) {
							local336.anInt347 = 0;
						}
					}
					this.anInt923 = -1;
					return true;
				}
				if (this.anInt923 == 185) {
					local286 = this.aClass1_Sub1_Sub3_8.method296();
					Class10.aClass10Array1[local286].anInt324 = 3;
					if (aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass6_2 == null) {
						Class10.aClass10Array1[local286].anInt325 = (aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray50[0] << 25) + (aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray50[4] << 20) + (aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[0] << 15) + (aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[8] << 10) + (aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[11] << 5) + aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray51[1];
					} else {
						Class10.aClass10Array1[local286].anInt325 = (int) (aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass6_2.aLong4 + 305419896L);
					}
					this.anInt923 = -1;
					return true;
				}
				if (this.anInt923 == 107) {
					this.aBoolean249 = false;
					for (local286 = 0; local286 < 5; local286++) {
						this.aBooleanArray11[local286] = false;
					}
					this.anInt923 = -1;
					return true;
				}
				@Pc(500) int local500;
				@Pc(498) Class10 local498;
				if (this.anInt923 == 72) {
					local286 = this.aClass1_Sub1_Sub3_8.method294();
					local498 = Class10.aClass10Array1[local286];
					for (local500 = 0; local500 < local498.anIntArray61.length; local500++) {
						local498.anIntArray61[local500] = -1;
						local498.anIntArray61[local500] = 0;
					}
					this.anInt923 = -1;
					return true;
				}
				if (this.anInt923 == 214) {
					this.anInt838 = this.anInt922 / 8;
					for (local286 = 0; local286 < this.anInt838; local286++) {
						this.aLongArray3[local286] = this.aClass1_Sub1_Sub3_8.method274();
					}
					this.anInt923 = -1;
					return true;
				}
				if (this.anInt923 == 166) {
					this.aBoolean249 = true;
					this.anInt971 = this.aClass1_Sub1_Sub3_8.method268();
					this.anInt972 = this.aClass1_Sub1_Sub3_8.method268();
					this.anInt973 = this.aClass1_Sub1_Sub3_8.method270();
					this.anInt974 = this.aClass1_Sub1_Sub3_8.method268();
					this.anInt975 = this.aClass1_Sub1_Sub3_8.method268();
					if (this.anInt975 >= 100) {
						this.anInt852 = this.anInt971 * 128 + 64;
						this.anInt854 = this.anInt972 * 128 + 64;
						this.anInt853 = this.method606(this.anInt881, this.anInt854, this.anInt852) - this.anInt973;
					}
					this.anInt923 = -1;
					return true;
				}
				@Pc(663) int local663;
				if (this.anInt923 == 134) {
					this.aBoolean244 = true;
					local286 = this.aClass1_Sub1_Sub3_8.method268();
					local237 = this.aClass1_Sub1_Sub3_8.method299();
					local500 = this.aClass1_Sub1_Sub3_8.method268();
					this.anIntArray221[local286] = local237;
					this.anIntArray225[local286] = local500;
					this.anIntArray242[local286] = 1;
					for (local663 = 0; local663 < 98; local663++) {
						if (local237 >= anIntArray240[local663]) {
							this.anIntArray242[local286] = local663 + 2;
						}
					}
					this.anInt923 = -1;
					return true;
				}
				if (this.anInt923 == 71) {
					local286 = this.aClass1_Sub1_Sub3_8.method270();
					local237 = this.aClass1_Sub1_Sub3_8.method286();
					if (local286 == 65535) {
						local286 = -1;
					}
					this.anIntArray254[local237] = local286;
					this.aBoolean244 = true;
					this.aBoolean239 = true;
					this.anInt923 = -1;
					return true;
				}
				if (this.anInt923 == 74) {
					local286 = this.aClass1_Sub1_Sub3_8.method294();
					if (local286 == 65535) {
						local286 = -1;
					}
					if (local286 != this.anInt900 && this.aBoolean243 && !aBoolean228 && this.anInt1035 == 0) {
						this.anInt1021 = local286;
						this.aBoolean255 = true;
						this.aClass14_Sub1_1.method190(2, this.anInt1021);
					}
					this.anInt900 = local286;
					this.anInt923 = -1;
					return true;
				}
				if (this.anInt923 == 121) {
					local286 = this.aClass1_Sub1_Sub3_8.method296();
					local237 = this.aClass1_Sub1_Sub3_8.method295();
					if (this.aBoolean243 && !aBoolean228) {
						this.anInt1021 = local286;
						this.aBoolean255 = false;
						this.aClass14_Sub1_1.method190(2, this.anInt1021);
						this.anInt1035 = local237;
					}
					this.anInt923 = -1;
					return true;
				}
				if (this.anInt923 == 109) {
					this.method608();
					this.anInt923 = -1;
					return false;
				}
				if (this.anInt923 == 70) {
					local286 = this.aClass1_Sub1_Sub3_8.method271();
					local237 = this.aClass1_Sub1_Sub3_8.method297();
					local500 = this.aClass1_Sub1_Sub3_8.method294();
					@Pc(839) Class10 local839 = Class10.aClass10Array1[local500];
					local839.anInt338 = local286;
					local839.anInt339 = local237;
					this.anInt923 = -1;
					return true;
				}
				@Pc(904) int local904;
				@Pc(912) int local912;
				@Pc(1213) int local1213;
				@Pc(1234) int local1234;
				if (this.anInt923 != 73 && this.anInt923 != 241) {
					if (this.anInt923 == 208) {
						local286 = this.aClass1_Sub1_Sub3_8.method297();
						if (local286 >= 0) {
							this.method624(local286, (byte) 6);
						}
						this.anInt930 = local286;
						this.anInt923 = -1;
						return true;
					}
					if (this.anInt923 == 99) {
						this.anInt932 = this.aClass1_Sub1_Sub3_8.method268();
						this.anInt923 = -1;
						return true;
					}
					if (this.anInt923 == 75) {
						local286 = this.aClass1_Sub1_Sub3_8.method296();
						local237 = this.aClass1_Sub1_Sub3_8.method296();
						Class10.aClass10Array1[local237].anInt324 = 2;
						Class10.aClass10Array1[local237].anInt325 = local286;
						this.anInt923 = -1;
						return true;
					}
					if (this.anInt923 == 114) {
						this.anInt976 = this.aClass1_Sub1_Sub3_8.method294() * 30;
						this.anInt923 = -1;
						return true;
					}
					if (this.anInt923 == 60) {
						this.anInt1042 = this.aClass1_Sub1_Sub3_8.method268();
						this.anInt1041 = this.aClass1_Sub1_Sub3_8.method287();
						while (this.aClass1_Sub1_Sub3_8.anInt468 < this.anInt922) {
							local286 = this.aClass1_Sub1_Sub3_8.method268();
							this.method701(this.anInt981, this.aClass1_Sub1_Sub3_8, local286);
						}
						this.anInt923 = -1;
						return true;
					}
					if (this.anInt923 == 35) {
						local286 = this.aClass1_Sub1_Sub3_8.method268();
						local237 = this.aClass1_Sub1_Sub3_8.method268();
						local500 = this.aClass1_Sub1_Sub3_8.method268();
						local663 = this.aClass1_Sub1_Sub3_8.method268();
						this.aBooleanArray11[local286] = true;
						this.anIntArray222[local286] = local237;
						this.anIntArray261[local286] = local500;
						this.anIntArray226[local286] = local663;
						this.anIntArray241[local286] = 0;
						this.anInt923 = -1;
						return true;
					}
					if (this.anInt923 == 174) {
						local286 = this.aClass1_Sub1_Sub3_8.method270();
						local237 = this.aClass1_Sub1_Sub3_8.method268();
						local500 = this.aClass1_Sub1_Sub3_8.method270();
						if (this.aBoolean220 && !aBoolean228 && this.anInt953 < 50) {
							this.anIntArray263[this.anInt953] = local286;
							this.anIntArray270[this.anInt953] = local237;
							this.anIntArray271[this.anInt953] = local500 + Class18.anIntArray70[local286];
							this.anInt953++;
						}
						this.anInt923 = -1;
						return true;
					}
					if (this.anInt923 != 104) {
						if (this.anInt923 == 78) {
							this.anInt1037 = 0;
							this.anInt923 = -1;
							return true;
						}
						@Pc(2201) String local2201;
						@Pc(2064) boolean local2064;
						if (this.anInt923 == 253) {
							local2048 = this.aClass1_Sub1_Sub3_8.method275();
							@Pc(2062) long local2062;
							@Pc(2059) String local2059;
							if (local2048.endsWith(":tradereq:")) {
								local2059 = local2048.substring(0, local2048.indexOf(":"));
								local2062 = Class50.method559(local2059);
								local2064 = false;
								for (local912 = 0; local912 < this.anInt838; local912++) {
									if (this.aLongArray3[local912] == local2062) {
										local2064 = true;
										break;
									}
								}
								if (!local2064 && this.anInt1031 == 0) {
									this.method641("wishes to trade with you.", 4, local2059, this.aBoolean231);
								}
							} else if (local2048.endsWith(":duelreq:")) {
								local2059 = local2048.substring(0, local2048.indexOf(":"));
								local2062 = Class50.method559(local2059);
								local2064 = false;
								for (local912 = 0; local912 < this.anInt838; local912++) {
									if (this.aLongArray3[local912] == local2062) {
										local2064 = true;
										break;
									}
								}
								if (!local2064 && this.anInt1031 == 0) {
									this.method641("wishes to duel with you.", 8, local2059, this.aBoolean231);
								}
							} else if (local2048.endsWith(":chalreq:")) {
								local2059 = local2048.substring(0, local2048.indexOf(":"));
								local2062 = Class50.method559(local2059);
								local2064 = false;
								for (local912 = 0; local912 < this.anInt838; local912++) {
									if (this.aLongArray3[local912] == local2062) {
										local2064 = true;
										break;
									}
								}
								if (!local2064 && this.anInt1031 == 0) {
									local2201 = local2048.substring(local2048.indexOf(":") + 1, local2048.length() - 9);
									this.method641(local2201, 8, local2059, this.aBoolean231);
								}
							} else {
								this.method641(local2048, 0, "", this.aBoolean231);
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 1) {
							for (local286 = 0; local286 < this.aClass1_Sub1_Sub2_Sub1_Sub2Array1.length; local286++) {
								if (this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local286] != null) {
									this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local286].anInt245 = -1;
								}
							}
							for (local237 = 0; local237 < this.aClass1_Sub1_Sub2_Sub1_Sub1Array1.length; local237++) {
								if (this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local237] != null) {
									this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local237].anInt245 = -1;
								}
							}
							this.anInt923 = -1;
							return true;
						}
						@Pc(2282) long local2282;
						if (this.anInt923 == 50) {
							local2282 = this.aClass1_Sub1_Sub3_8.method274();
							local500 = this.aClass1_Sub1_Sub3_8.method268();
							@Pc(2292) String local2292 = Class50.method563(Class50.method560(local2282));
							for (local904 = 0; local904 < this.anInt873; local904++) {
								if (local2282 == this.aLongArray4[local904]) {
									if (this.anIntArray212[local904] != local500) {
										this.anIntArray212[local904] = local500;
										this.aBoolean244 = true;
										if (local500 > 0) {
											this.method641(local2292 + " has logged in.", 5, "", this.aBoolean231);
										}
										if (local500 == 0) {
											this.method641(local2292 + " has logged out.", 5, "", this.aBoolean231);
										}
									}
									local2292 = null;
									break;
								}
							}
							if (local2292 != null && this.anInt873 < 200) {
								this.aLongArray4[this.anInt873] = local2282;
								this.aStringArray11[this.anInt873] = local2292;
								this.anIntArray212[this.anInt873] = local500;
								this.anInt873++;
								this.aBoolean244 = true;
							}
							@Pc(2392) boolean local2392 = false;
							while (!local2392) {
								local2392 = true;
								for (local1213 = 0; local1213 < this.anInt873 - 1; local1213++) {
									if (this.anIntArray212[local1213] != anInt901 && this.anIntArray212[local1213 + 1] == anInt901 || this.anIntArray212[local1213] == 0 && this.anIntArray212[local1213 + 1] != 0) {
										local1234 = this.anIntArray212[local1213];
										this.anIntArray212[local1213] = this.anIntArray212[local1213 + 1];
										this.anIntArray212[local1213 + 1] = local1234;
										@Pc(2453) String local2453 = this.aStringArray11[local1213];
										this.aStringArray11[local1213] = this.aStringArray11[local1213 + 1];
										this.aStringArray11[local1213 + 1] = local2453;
										@Pc(2475) long local2475 = this.aLongArray4[local1213];
										this.aLongArray4[local1213] = this.aLongArray4[local1213 + 1];
										this.aLongArray4[local1213 + 1] = local2475;
										this.aBoolean244 = true;
										local2392 = false;
									}
								}
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 110) {
							if (this.anInt1017 == 12) {
								this.aBoolean244 = true;
							}
							this.anInt992 = this.aClass1_Sub1_Sub3_8.method268();
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 254) {
							this.anInt850 = this.aClass1_Sub1_Sub3_8.method268();
							if (this.anInt850 == 1) {
								this.anInt1018 = this.aClass1_Sub1_Sub3_8.method270();
							}
							if (this.anInt850 >= 2 && this.anInt850 <= 6) {
								if (this.anInt850 == 2) {
									this.anInt889 = 64;
									this.anInt890 = 64;
								}
								if (this.anInt850 == 3) {
									this.anInt889 = 0;
									this.anInt890 = 64;
								}
								if (this.anInt850 == 4) {
									this.anInt889 = 128;
									this.anInt890 = 64;
								}
								if (this.anInt850 == 5) {
									this.anInt889 = 64;
									this.anInt890 = 0;
								}
								if (this.anInt850 == 6) {
									this.anInt889 = 64;
									this.anInt890 = 128;
								}
								this.anInt850 = 2;
								this.anInt886 = this.aClass1_Sub1_Sub3_8.method270();
								this.anInt887 = this.aClass1_Sub1_Sub3_8.method270();
								this.anInt888 = this.aClass1_Sub1_Sub3_8.method268();
							}
							if (this.anInt850 == 10) {
								this.anInt885 = this.aClass1_Sub1_Sub3_8.method270();
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 248) {
							local286 = this.aClass1_Sub1_Sub3_8.method295();
							local237 = this.aClass1_Sub1_Sub3_8.method270();
							if (this.anInt1044 != -1) {
								this.anInt1044 = -1;
								this.aBoolean253 = true;
							}
							if (this.anInt1019 != 0) {
								this.anInt1019 = 0;
								this.aBoolean253 = true;
							}
							this.anInt851 = local286;
							this.anInt1007 = local237;
							this.aBoolean244 = true;
							this.aBoolean239 = true;
							this.aBoolean242 = false;
							this.anInt923 = -1;
							return true;
						}
						@Pc(2710) Class10 local2710;
						if (this.anInt923 == 79) {
							local286 = this.aClass1_Sub1_Sub3_8.method294();
							local237 = this.aClass1_Sub1_Sub3_8.method295();
							local2710 = Class10.aClass10Array1[local286];
							if (local2710 != null && local2710.anInt337 == 0) {
								if (local237 < 0) {
									local237 = 0;
								}
								if (local237 > local2710.anInt336 - local2710.anInt340) {
									local237 = local2710.anInt336 - local2710.anInt340;
								}
								local2710.anInt319 = local237;
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 68) {
							for (local286 = 0; local286 < this.anIntArray231.length; local286++) {
								if (this.anIntArray231[local286] != this.anIntArray243[local286]) {
									this.anIntArray231[local286] = this.anIntArray243[local286];
									this.method597(local286);
									this.aBoolean244 = true;
								}
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 196) {
							local2282 = this.aClass1_Sub1_Sub3_8.method274();
							local500 = this.aClass1_Sub1_Sub3_8.method273();
							local663 = this.aClass1_Sub1_Sub3_8.method268();
							local2064 = false;
							for (local912 = 0; local912 < 100; local912++) {
								if (this.anIntArray269[local912] == local500) {
									local2064 = true;
									break;
								}
							}
							if (local663 <= 1) {
								for (local1213 = 0; local1213 < this.anInt838; local1213++) {
									if (this.aLongArray3[local1213] == local2282) {
										local2064 = true;
										break;
									}
								}
							}
							if (!local2064 && this.anInt1031 == 0) {
								try {
									this.anIntArray269[this.anInt997] = local500;
									this.anInt997 = (this.anInt997 + 1) % 100;
									local2201 = Class36.method449(this.anInt922 - 13, this.aClass1_Sub1_Sub3_8);
									if (local663 != 3) {
										local2201 = Class35.method421(local2201);
									}
									if (local663 == 2 || local663 == 3) {
										this.method641(local2201, 7, "@cr2@" + Class50.method563(Class50.method560(local2282)), this.aBoolean231);
									} else if (local663 == 1) {
										this.method641(local2201, 7, "@cr1@" + Class50.method563(Class50.method560(local2282)), this.aBoolean231);
									} else {
										this.method641(local2201, 3, Class50.method563(Class50.method560(local2282)), this.aBoolean231);
									}
								} catch (@Pc(2938) Exception local2938) {
									signlink.reporterror("cde1");
								}
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 85) {
							this.anInt1042 = this.aClass1_Sub1_Sub3_8.method287();
							this.anInt1041 = this.aClass1_Sub1_Sub3_8.method287();
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 24) {
							this.anInt949 = this.aClass1_Sub1_Sub3_8.method288();
							if (this.anInt949 == this.anInt1017) {
								if (this.anInt949 == 3) {
									this.anInt1017 = 1;
								} else {
									this.anInt1017 = 3;
								}
								this.aBoolean244 = true;
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 246) {
							local286 = this.aClass1_Sub1_Sub3_8.method294();
							local237 = this.aClass1_Sub1_Sub3_8.method270();
							local500 = this.aClass1_Sub1_Sub3_8.method270();
							if (local500 == 65535) {
								Class10.aClass10Array1[local286].anInt324 = 0;
								this.anInt923 = -1;
								return true;
							}
							@Pc(3035) Class9 local3035 = Class9.method118(local500);
							Class10.aClass10Array1[local286].anInt324 = 4;
							Class10.aClass10Array1[local286].anInt325 = local500;
							Class10.aClass10Array1[local286].anInt342 = local3035.anInt211;
							Class10.aClass10Array1[local286].anInt343 = local3035.anInt217;
							Class10.aClass10Array1[local286].anInt341 = local3035.anInt207 * 100 / local237;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 171) {
							@Pc(3085) boolean local3085 = this.aClass1_Sub1_Sub3_8.method268() == 1;
							local237 = this.aClass1_Sub1_Sub3_8.method270();
							Class10.aClass10Array1[local237].aBoolean73 = local3085;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 142) {
							local286 = this.aClass1_Sub1_Sub3_8.method294();
							this.method624(local286, (byte) 6);
							if (this.anInt1044 != -1) {
								this.anInt1044 = -1;
								this.aBoolean253 = true;
							}
							if (this.anInt1019 != 0) {
								this.anInt1019 = 0;
								this.aBoolean253 = true;
							}
							this.anInt1007 = local286;
							this.aBoolean244 = true;
							this.aBoolean239 = true;
							this.anInt851 = -1;
							this.aBoolean242 = false;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 126) {
							local2048 = this.aClass1_Sub1_Sub3_8.method275();
							local237 = this.aClass1_Sub1_Sub3_8.method295();
							Class10.aClass10Array1[local237].aString11 = local2048;
							if (Class10.aClass10Array1[local237].anInt326 == this.anIntArray254[this.anInt1017]) {
								this.aBoolean244 = true;
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 206) {
							this.anInt1051 = this.aClass1_Sub1_Sub3_8.method268();
							this.anInt846 = this.aClass1_Sub1_Sub3_8.method268();
							this.anInt1029 = this.aClass1_Sub1_Sub3_8.method268();
							this.aBoolean257 = true;
							this.aBoolean253 = true;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 240) {
							if (this.anInt1017 == 12) {
								this.aBoolean244 = true;
							}
							this.anInt861 = this.aClass1_Sub1_Sub3_8.method271();
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 8) {
							local286 = this.aClass1_Sub1_Sub3_8.method296();
							local237 = this.aClass1_Sub1_Sub3_8.method270();
							Class10.aClass10Array1[local286].anInt324 = 1;
							Class10.aClass10Array1[local286].anInt325 = local237;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 122) {
							local286 = this.aClass1_Sub1_Sub3_8.method296();
							local237 = this.aClass1_Sub1_Sub3_8.method296();
							local500 = local237 >> 10 & 0x1F;
							local663 = local237 >> 5 & 0x1F;
							local904 = local237 & 0x1F;
							Class10.aClass10Array1[local286].anInt323 = (local500 << 19) + (local663 << 11) + (local904 << 3);
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 53) {
							this.aBoolean244 = true;
							local286 = this.aClass1_Sub1_Sub3_8.method270();
							local498 = Class10.aClass10Array1[local286];
							local500 = this.aClass1_Sub1_Sub3_8.method270();
							for (local663 = 0; local663 < local500; local663++) {
								local904 = this.aClass1_Sub1_Sub3_8.method268();
								if (local904 == 255) {
									local904 = this.aClass1_Sub1_Sub3_8.method300();
								}
								local498.anIntArray61[local663] = this.aClass1_Sub1_Sub3_8.method296();
								local498.anIntArray60[local663] = local904;
							}
							for (local904 = local500; local904 < local498.anIntArray61.length; local904++) {
								local498.anIntArray61[local904] = 0;
								local498.anIntArray60[local904] = 0;
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 230) {
							local286 = this.aClass1_Sub1_Sub3_8.method295();
							local237 = this.aClass1_Sub1_Sub3_8.method270();
							local500 = this.aClass1_Sub1_Sub3_8.method270();
							local663 = this.aClass1_Sub1_Sub3_8.method296();
							Class10.aClass10Array1[local237].anInt342 = local500;
							Class10.aClass10Array1[local237].anInt343 = local663;
							Class10.aClass10Array1[local237].anInt341 = local286;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 221) {
							this.anInt874 = this.aClass1_Sub1_Sub3_8.method268();
							this.aBoolean244 = true;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 177) {
							this.aBoolean249 = true;
							this.anInt914 = this.aClass1_Sub1_Sub3_8.method268();
							this.anInt915 = this.aClass1_Sub1_Sub3_8.method268();
							this.anInt916 = this.aClass1_Sub1_Sub3_8.method270();
							this.anInt917 = this.aClass1_Sub1_Sub3_8.method268();
							this.anInt918 = this.aClass1_Sub1_Sub3_8.method268();
							if (this.anInt918 >= 100) {
								local286 = this.anInt914 * 128 + 64;
								local237 = this.anInt915 * 128 + 64;
								local500 = this.method606(this.anInt881, local237, local286) - this.anInt916;
								local663 = local286 - this.anInt852;
								local904 = local500 - this.anInt853;
								local912 = local237 - this.anInt854;
								local1213 = (int) Math.sqrt((double) (local663 * local663 + local912 * local912));
								this.anInt855 = (int) (Math.atan2((double) local904, (double) local1213) * 325.949D) & 0x7FF;
								this.anInt856 = (int) (Math.atan2((double) local663, (double) local912) * -325.949D) & 0x7FF;
								if (this.anInt855 < 128) {
									this.anInt855 = 128;
								}
								if (this.anInt855 > 383) {
									this.anInt855 = 383;
								}
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 249) {
							this.anInt945 = this.aClass1_Sub1_Sub3_8.method286();
							this.anInt864 = this.aClass1_Sub1_Sub3_8.method296();
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 65) {
							this.method595(this.aClass1_Sub1_Sub3_8, this.anInt922);
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 27) {
							this.aBoolean261 = false;
							this.anInt1019 = 1;
							this.aString20 = "";
							this.aBoolean253 = true;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 187) {
							this.aBoolean261 = false;
							this.anInt1019 = 2;
							this.aString20 = "";
							this.aBoolean253 = true;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 97) {
							local286 = this.aClass1_Sub1_Sub3_8.method270();
							this.method624(local286, (byte) 6);
							if (this.anInt1007 != -1) {
								this.anInt1007 = -1;
								this.aBoolean244 = true;
								this.aBoolean239 = true;
							}
							if (this.anInt1044 != -1) {
								this.anInt1044 = -1;
								this.aBoolean253 = true;
							}
							if (this.anInt1019 != 0) {
								this.anInt1019 = 0;
								this.aBoolean253 = true;
							}
							this.anInt851 = local286;
							this.aBoolean242 = false;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 218) {
							local286 = this.aClass1_Sub1_Sub3_8.method298();
							this.anInt944 = local286;
							this.aBoolean253 = true;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 87) {
							local286 = this.aClass1_Sub1_Sub3_8.method294();
							local237 = this.aClass1_Sub1_Sub3_8.method299();
							this.anIntArray243[local286] = local237;
							if (this.anIntArray231[local286] != local237) {
								this.anIntArray231[local286] = local237;
								this.method597(local286);
								this.aBoolean244 = true;
								if (this.anInt944 != -1) {
									this.aBoolean253 = true;
								}
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 36) {
							local286 = this.aClass1_Sub1_Sub3_8.method294();
							@Pc(3798) byte local3798 = this.aClass1_Sub1_Sub3_8.method269();
							this.anIntArray243[local286] = local3798;
							if (this.anIntArray231[local286] != local3798) {
								this.anIntArray231[local286] = local3798;
								this.method597(local286);
								this.aBoolean244 = true;
								if (this.anInt944 != -1) {
									this.aBoolean253 = true;
								}
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 61) {
							this.anInt950 = this.aClass1_Sub1_Sub3_8.method268();
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 200) {
							local286 = this.aClass1_Sub1_Sub3_8.method270();
							local237 = this.aClass1_Sub1_Sub3_8.method271();
							local2710 = Class10.aClass10Array1[local286];
							local2710.anInt334 = local237;
							if (local237 == -1) {
								local2710.anInt330 = 0;
								local2710.anInt311 = 0;
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 219) {
							if (this.anInt1007 != -1) {
								this.anInt1007 = -1;
								this.aBoolean244 = true;
								this.aBoolean239 = true;
							}
							if (this.anInt1044 != -1) {
								this.anInt1044 = -1;
								this.aBoolean253 = true;
							}
							if (this.anInt1019 != 0) {
								this.anInt1019 = 0;
								this.aBoolean253 = true;
							}
							this.anInt851 = -1;
							this.aBoolean242 = false;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 34) {
							this.aBoolean244 = true;
							local286 = this.aClass1_Sub1_Sub3_8.method270();
							local498 = Class10.aClass10Array1[local286];
							while (this.aClass1_Sub1_Sub3_8.anInt468 < this.anInt922) {
								local500 = this.aClass1_Sub1_Sub3_8.method282();
								local663 = this.aClass1_Sub1_Sub3_8.method270();
								local904 = this.aClass1_Sub1_Sub3_8.method268();
								if (local904 == 255) {
									local904 = this.aClass1_Sub1_Sub3_8.method273();
								}
								if (local500 >= 0 && local500 < local498.anIntArray61.length) {
									local498.anIntArray61[local500] = local663;
									local498.anIntArray60[local500] = local904;
								}
							}
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 105 || this.anInt923 == 84 || this.anInt923 == 147 || this.anInt923 == 215 || this.anInt923 == 4 || this.anInt923 == 117 || this.anInt923 == 156 || this.anInt923 == 44 || this.anInt923 == 160 || this.anInt923 == 101 || this.anInt923 == 151) {
							this.method701(this.anInt981, this.aClass1_Sub1_Sub3_8, this.anInt923);
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 106) {
							this.anInt1017 = this.aClass1_Sub1_Sub3_8.method287();
							this.aBoolean244 = true;
							this.aBoolean239 = true;
							this.anInt923 = -1;
							return true;
						}
						if (this.anInt923 == 164) {
							local286 = this.aClass1_Sub1_Sub3_8.method294();
							this.method624(local286, (byte) 6);
							if (this.anInt1007 != -1) {
								this.anInt1007 = -1;
								this.aBoolean244 = true;
								this.aBoolean239 = true;
							}
							this.anInt1044 = local286;
							this.aBoolean253 = true;
							this.anInt851 = -1;
							this.aBoolean242 = false;
							this.anInt923 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt923 + "," + this.anInt922 + " - " + this.anInt844 + "," + this.anInt845);
						this.method608();
						return true;
					}
					local286 = this.aClass1_Sub1_Sub3_8.method287();
					local237 = this.aClass1_Sub1_Sub3_8.method286();
					@Pc(1993) String local1993 = this.aClass1_Sub1_Sub3_8.method275();
					if (local286 >= 1 && local286 <= 5) {
						if (local1993.equalsIgnoreCase("null")) {
							local1993 = null;
						}
						this.aStringArray12[local286 - 1] = local1993;
						this.aBooleanArray12[local286 - 1] = local237 == 0;
					}
					this.anInt923 = -1;
					return true;
				}
				local286 = this.anInt958;
				local237 = this.anInt959;
				if (this.anInt923 == 73) {
					local286 = this.aClass1_Sub1_Sub3_8.method295();
					local237 = this.aClass1_Sub1_Sub3_8.method270();
					this.aBoolean248 = false;
				}
				if (this.anInt923 == 241) {
					local237 = this.aClass1_Sub1_Sub3_8.method295();
					this.aClass1_Sub1_Sub3_8.method278(this.anInt980);
					local500 = 0;
					while (true) {
						if (local500 >= 4) {
							this.aClass1_Sub1_Sub3_8.method280();
							local286 = this.aClass1_Sub1_Sub3_8.method270();
							this.aBoolean248 = true;
							break;
						}
						for (local663 = 0; local663 < 13; local663++) {
							for (local904 = 0; local904 < 13; local904++) {
								local912 = this.aClass1_Sub1_Sub3_8.method279(1);
								if (local912 == 1) {
									this.anIntArrayArrayArray7[local500][local663][local904] = this.aClass1_Sub1_Sub3_8.method279(26);
								} else {
									this.anIntArrayArrayArray7[local500][local663][local904] = -1;
								}
							}
						}
						local500++;
					}
				}
				if (this.anInt958 == local286 && this.anInt959 == local237 && this.anInt934 == 2) {
					this.anInt923 = -1;
					return true;
				}
				this.anInt958 = local286;
				this.anInt959 = local237;
				this.anInt936 = (this.anInt958 - 6) * 8;
				this.anInt937 = (this.anInt959 - 6) * 8;
				this.aBoolean241 = false;
				if ((this.anInt958 / 8 == 48 || this.anInt958 / 8 == 49) && this.anInt959 / 8 == 48) {
					this.aBoolean241 = true;
				}
				if (this.anInt958 / 8 == 48 && this.anInt959 / 8 == 148) {
					this.aBoolean241 = true;
				}
				this.anInt934 = 1;
				this.aLong29 = System.currentTimeMillis();
				this.aClass17_26.method218();
				this.aClass1_Sub1_Sub1_Sub4_3.method500(0, "Loading - please wait.", 151, 257);
				this.aClass1_Sub1_Sub1_Sub4_3.method500(16777215, "Loading - please wait.", 150, 256);
				this.aClass17_26.method219(4, super.aGraphics2, 4);
				if (this.anInt923 == 73) {
					local500 = 0;
					local663 = (this.anInt958 - 6) / 8;
					label1094: while (true) {
						if (local663 > (this.anInt958 + 6) / 8) {
							this.aByteArrayArray4 = new byte[local500][];
							this.aByteArrayArray5 = new byte[local500][];
							this.anIntArray266 = new int[local500];
							this.anIntArray267 = new int[local500];
							this.anIntArray268 = new int[local500];
							local500 = 0;
							local904 = (this.anInt958 - 6) / 8;
							while (true) {
								if (local904 > (this.anInt958 + 6) / 8) {
									break label1094;
								}
								for (local912 = (this.anInt959 - 6) / 8; local912 <= (this.anInt959 + 6) / 8; local912++) {
									this.anIntArray266[local500] = (local904 << 8) + local912;
									if (this.aBoolean241 && (local912 == 49 || local912 == 149 || local912 == 147 || local904 == 50 || local904 == 49 && local912 == 47)) {
										this.anIntArray267[local500] = -1;
										this.anIntArray268[local500] = -1;
										local500++;
									} else {
										local1213 = this.anIntArray267[local500] = this.aClass14_Sub1_1.method194(0, local912, local904);
										if (local1213 != -1) {
											this.aClass14_Sub1_1.method190(3, local1213);
										}
										local1234 = this.anIntArray268[local500] = this.aClass14_Sub1_1.method194(1, local912, local904);
										if (local1234 != -1) {
											this.aClass14_Sub1_1.method190(3, local1234);
										}
										local500++;
									}
								}
								local904++;
							}
						}
						for (local904 = (this.anInt959 - 6) / 8; local904 <= (this.anInt959 + 6) / 8; local904++) {
							local500++;
						}
						local663++;
					}
				}
				if (this.anInt923 == 241) {
					local500 = 0;
					@Pc(1270) int[] local1270 = new int[676];
					local904 = 0;
					label1053: while (true) {
						@Pc(1300) int local1300;
						@Pc(1306) int local1306;
						@Pc(1316) int local1316;
						if (local904 >= 4) {
							this.aByteArrayArray4 = new byte[local500][];
							this.aByteArrayArray5 = new byte[local500][];
							this.anIntArray266 = new int[local500];
							this.anIntArray267 = new int[local500];
							this.anIntArray268 = new int[local500];
							local912 = 0;
							while (true) {
								if (local912 >= local500) {
									break label1053;
								}
								local1213 = this.anIntArray266[local912] = local1270[local912];
								local1234 = local1213 >> 8 & 0xFF;
								local1300 = local1213 & 0xFF;
								local1306 = this.anIntArray267[local912] = this.aClass14_Sub1_1.method194(0, local1300, local1234);
								if (local1306 != -1) {
									this.aClass14_Sub1_1.method190(3, local1306);
								}
								local1316 = this.anIntArray268[local912] = this.aClass14_Sub1_1.method194(1, local1300, local1234);
								if (local1316 != -1) {
									this.aClass14_Sub1_1.method190(3, local1316);
								}
								local912++;
							}
						}
						for (local912 = 0; local912 < 13; local912++) {
							for (local1213 = 0; local1213 < 13; local1213++) {
								local1234 = this.anIntArrayArrayArray7[local904][local912][local1213];
								if (local1234 != -1) {
									local1300 = local1234 >> 14 & 0x3FF;
									local1306 = local1234 >> 3 & 0x7FF;
									local1316 = (local1300 / 8 << 8) + local1306 / 8;
									for (@Pc(1318) int local1318 = 0; local1318 < local500; local1318++) {
										if (local1270[local1318] == local1316) {
											local1316 = -1;
											break;
										}
									}
									if (local1316 != -1) {
										local1270[local500++] = local1316;
									}
								}
							}
						}
						local904++;
					}
				}
				local500 = this.anInt936 - this.anInt938;
				local663 = this.anInt937 - this.anInt939;
				this.anInt938 = this.anInt936;
				this.anInt939 = this.anInt937;
				for (local904 = 0; local904 < 16384; local904++) {
					@Pc(1471) Class1_Sub1_Sub2_Sub1_Sub1 local1471 = this.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local904];
					if (local1471 != null) {
						for (local1213 = 0; local1213 < 10; local1213++) {
							local1471.anIntArray45[local1213] -= local500;
							local1471.anIntArray46[local1213] -= local663;
						}
						local1471.anInt268 -= local500 * 128;
						local1471.anInt269 -= local663 * 128;
					}
				}
				for (local912 = 0; local912 < this.anInt866; local912++) {
					@Pc(1526) Class1_Sub1_Sub2_Sub1_Sub2 local1526 = this.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local912];
					if (local1526 != null) {
						for (local1234 = 0; local1234 < 10; local1234++) {
							local1526.anIntArray45[local1234] -= local500;
							local1526.anIntArray46[local1234] -= local663;
						}
						local1526.anInt268 -= local500 * 128;
						local1526.anInt269 -= local663 * 128;
					}
				}
				this.aBoolean238 = true;
				@Pc(1578) byte local1578 = 0;
				@Pc(1580) byte local1580 = 104;
				@Pc(1582) byte local1582 = 1;
				if (local500 < 0) {
					local1578 = 103;
					local1580 = -1;
					local1582 = -1;
				}
				@Pc(1592) byte local1592 = 0;
				@Pc(1594) byte local1594 = 104;
				@Pc(1596) byte local1596 = 1;
				if (local663 < 0) {
					local1592 = 103;
					local1594 = -1;
					local1596 = -1;
				}
				for (@Pc(1606) int local1606 = local1578; local1606 != local1580; local1606 += local1582) {
					for (@Pc(1610) int local1610 = local1592; local1610 != local1594; local1610 += local1596) {
						@Pc(1616) int local1616 = local1606 + local500;
						@Pc(1620) int local1620 = local1610 + local663;
						for (@Pc(1622) int local1622 = 0; local1622 < 4; local1622++) {
							if (local1616 >= 0 && local1620 >= 0 && local1616 < 104 && local1620 < 104) {
								this.aClass21ArrayArrayArray1[local1622][local1606][local1610] = this.aClass21ArrayArrayArray1[local1622][local1616][local1620];
							} else {
								this.aClass21ArrayArrayArray1[local1622][local1606][local1610] = null;
							}
						}
					}
				}
				for (@Pc(1684) Class1_Sub2 local1684 = (Class1_Sub2) this.aClass21_12.method246(); local1684 != null; local1684 = (Class1_Sub2) this.aClass21_12.method248()) {
					local1684.anInt350 -= local500;
					local1684.anInt351 -= local663;
					if (local1684.anInt350 < 0 || local1684.anInt351 < 0 || local1684.anInt350 >= 104 || local1684.anInt351 >= 104) {
						local1684.method526();
					}
				}
				if (this.anInt1037 != 0) {
					this.anInt1037 -= local500;
					this.anInt1038 -= local663;
				}
				this.aBoolean249 = false;
				this.anInt923 = -1;
				return true;
			} catch (@Pc(4141) IOException local4141) {
				this.method632();
			} catch (@Pc(4146) Exception local4146) {
				local2048 = "T2 - " + this.anInt923 + "," + this.anInt844 + "," + this.anInt845 + " - " + this.anInt922 + "," + (this.anInt936 + aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray45[0]) + "," + (this.anInt937 + aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray46[0]) + " - ";
				for (local237 = 0; local237 < this.anInt922 && local237 < 50; local237++) {
					local2048 = local2048 + this.aClass1_Sub1_Sub3_8.aByteArray10[local237] + ",";
				}
				signlink.reporterror(local2048);
				this.method608();
			}
			return true;
		} catch (@Pc(4227) RuntimeException local4227) {
			signlink.reporterror("32862, " + true + ", " + local4227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method710() {
		try {
			this.anInt1040++;
			this.method611(true);
			this.method590(true, this.anInt862);
			this.method611(false);
			this.method590(false, this.anInt862);
			this.method619();
			this.method668();
			@Pc(37) int local37;
			@Pc(76) int local76;
			if (!this.aBoolean249) {
				local37 = this.anInt1002;
				if (this.anInt908 / 256 > local37) {
					local37 = this.anInt908 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray261[4] + 128 > local37) {
					local37 = this.anIntArray261[4] + 128;
				}
				local76 = this.anInt1003 + this.anInt870 & 0x7FF;
				this.method708(local37 * 3 + 600, local37, this.anInt927, this.method606(this.anInt881, aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt269, aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt268) - 50, local76, this.anInt928);
			}
			if (this.aBoolean249) {
				local37 = this.method685(this.anInt962);
			} else {
				local37 = this.method684();
			}
			local76 = this.anInt852;
			@Pc(121) int local121 = this.anInt853;
			@Pc(124) int local124 = this.anInt854;
			@Pc(127) int local127 = this.anInt855;
			@Pc(130) int local130 = this.anInt856;
			@Pc(179) int local179;
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				if (this.aBooleanArray11[local132]) {
					local179 = (int) (Math.random() * (double) (this.anIntArray222[local132] * 2 + 1) - (double) this.anIntArray222[local132] + Math.sin((double) this.anIntArray241[local132] * ((double) this.anIntArray226[local132] / 100.0D)) * (double) this.anIntArray261[local132]);
					if (local132 == 0) {
						this.anInt852 += local179;
					}
					if (local132 == 1) {
						this.anInt853 += local179;
					}
					if (local132 == 2) {
						this.anInt854 += local179;
					}
					if (local132 == 3) {
						this.anInt856 = this.anInt856 + local179 & 0x7FF;
					}
					if (local132 == 4) {
						this.anInt855 += local179;
						if (this.anInt855 < 128) {
							this.anInt855 = 128;
						}
						if (this.anInt855 > 383) {
							this.anInt855 = 383;
						}
					}
				}
			}
			local179 = Class1_Sub1_Sub1_Sub3.anInt585;
			Class1_Sub1_Sub2_Sub6.aBoolean212 = true;
			Class1_Sub1_Sub2_Sub6.anInt814 = 0;
			Class1_Sub1_Sub2_Sub6.anInt812 = super.anInt827 - 4;
			Class1_Sub1_Sub2_Sub6.anInt813 = super.anInt828 - 4;
			Class1_Sub1_Sub1.method490(this.aBoolean252);
			this.aClass27_1.method356(this.anInt852, this.anInt854, this.anInt856, this.anInt853, local37, this.anInt855);
			this.aClass27_1.method331();
			this.method598(this.anInt872);
			this.method625();
			this.method601(local179);
			this.method676();
			this.aClass17_26.method219(4, super.aGraphics2, 4);
			this.anInt852 = local76;
			this.anInt853 = local121;
			this.anInt854 = local124;
			this.anInt855 = local127;
			this.anInt856 = local130;
		} catch (@Pc(324) RuntimeException local324) {
			signlink.reporterror("97263, " + 1 + ", " + local324.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method711() {
		try {
			this.aClass1_Sub1_Sub3_9.method257(130);
			if (this.anInt1007 != -1) {
				this.anInt1007 = -1;
				this.aBoolean244 = true;
				this.aBoolean242 = false;
				this.aBoolean239 = true;
			}
			if (this.anInt1044 != -1) {
				this.anInt1044 = -1;
				this.aBoolean253 = true;
				this.aBoolean242 = false;
			}
			this.anInt851 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("33125, " + 537 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}
}
