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

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private static int anInt831;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
	private static boolean aBoolean219;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
	private static boolean aBoolean220;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private static int anInt837;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private static int anInt863;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Z")
	private static boolean aBoolean226;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private static int anInt871;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private static int anInt887;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private static int anInt892;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private static int anInt915;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	public static int anInt919;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
	private static boolean aBoolean244;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private static int anInt920;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private static int anInt926;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private static int anInt935;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private static int anInt941;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
	private static boolean aBoolean247;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private static int anInt975;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	public static int anInt1013;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private static int anInt1017;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private static int anInt1029;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Lclient!IOPHRJNF;")
	public static Class2_Sub1_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private static int anInt1045;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private static int anInt1051;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Ljava/lang/String;")
	private static String aString20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	public static int[] anIntArray232 = new int[32];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
	public static final int[] anIntArray234;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private static int anInt918;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Z")
	private static boolean aBoolean243;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private static int anInt956;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private static int anInt1034;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[[I")
	public static final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
	private static int[] anIntArray275;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_3;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_4;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_5;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_6;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_7;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_8;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_9;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_10;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_11;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_1;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_2;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_3;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_4;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_5;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!ZPYOGBCY;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_6;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_7;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_12;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_13;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_14;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4[] aClass2_Sub1_Sub3_Sub4Array3;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!PJTXDRVG;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Lclient!BKBLJVKV;")
	private Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Lclient!BKBLJVKV;")
	private Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_3;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Lclient!BKBLJVKV;")
	private Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Lclient!BKBLJVKV;")
	private Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_15;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_16;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_17;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_18;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_9;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_8;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_9;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_10;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_10;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_11;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!WMQKHABS;")
	private Class43 aClass43_2;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_19;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_20;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_21;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_22;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_23;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_24;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_25;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_26;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!ZTWZAULT;")
	private Class49 aClass49_27;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!ZRJULOYY;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Lclient!VSQMPWOM;")
	private Class39 aClass39_2;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_13;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_14;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_13;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_14;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_15;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!BPHGILGU;")
	private Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_15;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_16;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_17;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_18;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_19;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_20;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_16;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_17;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt830 = 50;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
	private int[] anIntArray212 = new int[this.anInt830];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private int[] anIntArray213 = new int[this.anInt830];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
	private int[] anIntArray214 = new int[this.anInt830];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	private int[] anIntArray215 = new int[this.anInt830];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
	private int[] anIntArray216 = new int[this.anInt830];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
	private int[] anIntArray217 = new int[this.anInt830];

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray218 = new int[this.anInt830];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[this.anInt830];

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt833 = 3353893;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
	private int[] anIntArray219 = new int[500];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray220 = new int[500];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private int[] anIntArray221 = new int[500];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray222 = new int[500];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4[] aClass2_Sub1_Sub3_Sub4Array2 = new Class2_Sub1_Sub3_Sub4[2];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt835 = -1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray223 = new int[151];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	private int[] anIntArray226 = new int[50];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt843 = 7;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt845 = 2;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[Lclient!RUPQNTVM;")
	private Class30[] aClass30Array1 = new Class30[4];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Lclient!ZXKMWHPZ;")
	private Class50 aClass50_10 = new Class50((byte) 8);

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!ZXKMWHPZ;")
	private Class50 aClass50_11 = new Class50((byte) 8);

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt849 = -738;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Z")
	private volatile boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt850 = -21443;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt851 = -470;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt855 = -1;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array4 = new Class2_Sub1_Sub3_Sub2[8];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt869 = 743;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "B")
	private byte aByte40 = -120;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt873 = 2;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
	private int[] anIntArray227 = new int[200];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Lclient!ZXKMWHPZ;")
	private Class50 aClass50_12 = new Class50((byte) 8);

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[I")
	private int[] anIntArray228 = new int[33];

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray229 = new int[2000];

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private final int anInt880 = 100;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray230 = new int[100];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt891 = -347;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
	private int[] anIntArray231 = new int[33];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
	private boolean aBoolean235 = true;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!FMDWWBSX;")
	private Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
	private int[] anIntArray233 = new int[9];

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt896 = 43818;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt897 = -15852;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
	private int[] anIntArray235 = new int[100];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt908 = -1;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt910 = -1;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt911 = 2048;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt912 = 2047;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[Lclient!IOPHRJNF;")
	private Class2_Sub1_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub1_Sub2Array1 = new Class2_Sub1_Sub1_Sub1_Sub2[this.anInt911];

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
	private int[] anIntArray240 = new int[this.anInt911];

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	private int[] anIntArray241 = new int[this.anInt911];

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[Lclient!BFQIDHPO;")
	private Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array1 = new Class2_Sub1_Sub2[this.anInt911];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt916 = 8;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt921 = 7759444;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
	private int[] anIntArray242 = new int[50];

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray243 = new int[256];

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Lclient!BFQIDHPO;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_6 = Class2_Sub1_Sub2.method67(anInt956);

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt937 = -1;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
	private int[] anIntArray244 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt938 = -1;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array5 = new Class2_Sub1_Sub3_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "B")
	private byte aByte41 = 91;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "[I")
	private int[] anIntArray245 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray246 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt942 = 467;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[I")
	private int[] anIntArray247 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
	private int[] anIntArray248 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
	private volatile boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
	private int[] anIntArray249 = new int[Class18.anInt424];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt946 = 3;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
	private final int[] anIntArray250 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "B")
	private byte aByte42 = -37;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[500];

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray251 = new int[151];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt947 = 2301979;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray252 = new int[Class18.anInt424];

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt950 = -1;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
	private boolean aBoolean251 = true;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[5];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "B")
	private byte aByte43 = 9;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt963 = 943;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt965 = -1;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt967 = 2;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt968 = 128;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "B")
	private byte aByte44 = -18;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[I")
	private int[] anIntArray255 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray256 = new int[5];

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt972 = -593;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt973 = 2531;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "B")
	private byte aByte45 = -120;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
	private int[] anIntArray257 = new int[Class18.anInt424];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
	private int[] anIntArray258 = new int[5];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Lclient!BFQIDHPO;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_7 = Class2_Sub1_Sub2.method67(anInt956);

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt976 = -1;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt977 = 78;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt981 = -999;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!BFQIDHPO;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_8 = Class2_Sub1_Sub2.method67(anInt956);

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "[I")
	private int[] anIntArray263 = new int[5];

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!BFQIDHPO;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_9 = new Class2_Sub1_Sub2(new byte[5000], -990);

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[Lclient!BFCMZACY;")
	private Class2_Sub1_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1_Sub1Array1 = new Class2_Sub1_Sub1_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
	private int[] anIntArray264 = new int[16384];

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray265 = new int[5];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[I")
	private int[] anIntArray266 = new int[5];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt986 = -1;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
	private boolean aBoolean256 = true;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4[] aClass2_Sub1_Sub3_Sub4Array4 = new Class2_Sub1_Sub3_Sub4[13];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean258 = true;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array6 = new Class2_Sub1_Sub3_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array7 = new Class2_Sub1_Sub3_Sub2[32];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[[[Lclient!ZXKMWHPZ;")
	private Class50[][][] aClass50ArrayArrayArray1 = new Class50[4][104][104];

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1005 = -1;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1012 = 153;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1015 = 1;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1018 = -1;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1019 = -1;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
	private int[] anIntArray267 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[Lclient!RAOZRSKX;")
	private Class2_Sub1_Sub3_Sub4[] aClass2_Sub1_Sub3_Sub4Array5 = new Class2_Sub1_Sub3_Sub4[100];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1027 = 5063219;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Z")
	private volatile boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1032 = 1;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[I")
	public int[] anIntArray268 = new int[2000];

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1033 = -535;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1038 = -124;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1039 = 6332;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Z")
	private boolean aBoolean265 = true;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1044 = -1;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "Z")
	private boolean aBoolean266 = false;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
	private int[] anIntArray272 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array8 = new Class2_Sub1_Sub3_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1047 = -872;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1048 = -1;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[Lclient!VXBCLRCG;")
	public Class41[] aClass41Array1 = new Class41[5];

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
	private int[] anIntArray273 = new int[100];

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1052 = 4;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
	private int[] anIntArray274 = new int[7];

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private int anInt1053 = 8;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "[Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array9 = new Class2_Sub1_Sub3_Sub2[20];

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "[I")
	private int[] anIntArray276 = new int[50];

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1060 = -1;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "[Lclient!NDGQUJMA;")
	private Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array10 = new Class2_Sub1_Sub3_Sub2[32];

	static {
		@Pc(16) int local16 = 2;
		@Pc(18) int local18;
		for (local18 = 0; local18 < 32; local18++) {
			anIntArray232[local18] = local16 - 1;
			local16 += local16;
		}
		anIntArray234 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt918 = 10;
		aBoolean243 = true;
		anInt956 = 122;
		anInt1034 = 4;
		anIntArrayArray25 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray275 = new int[99];
		local16 = 0;
		for (local18 = 0; local18 < 99; local18++) {
			@Pc(380) int local380 = local18 + 1;
			@Pc(393) int local393 = (int) ((double) local380 + Math.pow(2.0D, (double) local380 / 7.0D) * 300.0D);
			local16 += local393;
			anIntArray275[local18] = local16 / 4;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private static void method602() {
		try {
			Class27.aBoolean121 = false;
			Class2_Sub1_Sub3_Sub3.aBoolean128 = false;
			aBoolean244 = false;
			Class29.aBoolean146 = false;
			Class46.aBoolean192 = false;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("10615, " + 6 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) int local7 = arg0 - arg1;
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
			signlink.reporterror("55509, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private static String method614(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("1043, " + arg0 + ", " + -14 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private static void method619() {
		try {
			Class27.aBoolean121 = true;
			Class2_Sub1_Sub3_Sub3.aBoolean128 = true;
			aBoolean244 = true;
			Class29.aBoolean146 = true;
			Class46.aBoolean192 = true;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("70852, " + -588 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	private static String method631(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("71655, " + arg0 + ", " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 367);
			if (arg0.length == 5) {
				anInt918 = Integer.parseInt(arg0[0]);
				anInt919 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method619();
				} else if (arg0[2].equals("highmem")) {
					method602();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean243 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean243 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1065 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method574();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method587() {
		try {
			for (@Pc(6) Class2_Sub1_Sub1_Sub4 local6 = (Class2_Sub1_Sub1_Sub4) this.aClass50_12.method569(); local6 != null; local6 = (Class2_Sub1_Sub1_Sub4) this.aClass50_12.method571()) {
				if (local6.anInt445 != this.anInt876 || anInt1013 > local6.anInt435) {
					local6.method504();
				} else if (anInt1013 >= local6.anInt434) {
					if (local6.anInt442 > 0) {
						@Pc(46) Class2_Sub1_Sub1_Sub1_Sub1 local46 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local6.anInt442 - 1];
						if (local46 != null && local46.anInt328 >= 0 && local46.anInt328 < 13312 && local46.anInt329 >= 0 && local46.anInt329 < 13312) {
							local6.method247(anInt1013, local46.anInt328, local46.anInt329, this.method624(local46.anInt329, local6.anInt445, local46.anInt328) - local6.anInt439);
						}
					}
					if (local6.anInt442 < 0) {
						@Pc(91) int local91 = -local6.anInt442 - 1;
						@Pc(97) Class2_Sub1_Sub1_Sub1_Sub2 local97;
						if (local91 == this.anInt835) {
							local97 = aClass2_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local97 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local91];
						}
						if (local97 != null && local97.anInt328 >= 0 && local97.anInt328 < 13312 && local97.anInt329 >= 0 && local97.anInt329 < 13312) {
							local6.method247(anInt1013, local97.anInt328, local97.anInt329, this.method624(local97.anInt329, local6.anInt445, local97.anInt328) - local6.anInt439);
						}
					}
					local6.method246(this.anInt1046, 225);
					this.aClass27_1.method308(local6.anInt443, this.anInt876, (int) local6.aDouble6, 60, (int) local6.aDouble7, local6, -1, false, (int) local6.aDouble5);
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("74368, " + true + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method588(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString23 = "";
				this.aString24 = "Connecting to server...";
				this.method623(true);
			}
			this.aClass47_1 = new Class47(this.method712(anInt919 + 43594), this, false);
			@Pc(30) long local30 = Class19.method231(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass2_Sub1_Sub2_7.anInt123 = 0;
			this.aClass2_Sub1_Sub2_7.method69(14);
			this.aClass2_Sub1_Sub2_7.method69(local37);
			this.aClass47_1.method561(2, this.aClass2_Sub1_Sub2_7.aByteArray1);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass47_1.method558();
			}
			@Pc(74) int local74 = this.aClass47_1.method558();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass47_1.method560(this.aClass2_Sub1_Sub2_6.aByteArray1, 0, 8);
				this.aClass2_Sub1_Sub2_6.anInt123 = 0;
				this.aLong30 = this.aClass2_Sub1_Sub2_6.method85();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong30 >> 32), (int) this.aLong30 };
				this.aClass2_Sub1_Sub2_7.anInt123 = 0;
				this.aClass2_Sub1_Sub2_7.method69(10);
				this.aClass2_Sub1_Sub2_7.method73(local99[0]);
				this.aClass2_Sub1_Sub2_7.method73(local99[1]);
				this.aClass2_Sub1_Sub2_7.method73(local99[2]);
				this.aClass2_Sub1_Sub2_7.method73(local99[3]);
				this.aClass2_Sub1_Sub2_7.method73(signlink.anInt1064);
				this.aClass2_Sub1_Sub2_7.method76(arg0);
				this.aClass2_Sub1_Sub2_7.method76(arg1);
				this.aClass2_Sub1_Sub2_7.method94(aBigInteger2, aBigInteger1);
				this.aClass2_Sub1_Sub2_8.anInt123 = 0;
				if (arg2) {
					this.aClass2_Sub1_Sub2_8.method69(18);
				} else {
					this.aClass2_Sub1_Sub2_8.method69(16);
				}
				this.aClass2_Sub1_Sub2_8.method69(this.aClass2_Sub1_Sub2_7.anInt123 + 36 + 1 + 1 + 2);
				this.aClass2_Sub1_Sub2_8.method69(255);
				this.aClass2_Sub1_Sub2_8.method70(367);
				this.aClass2_Sub1_Sub2_8.method69(aBoolean244 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass2_Sub1_Sub2_8.method73(this.anIntArray233[local225]);
				}
				this.aClass2_Sub1_Sub2_8.method77(this.aClass2_Sub1_Sub2_7.aByteArray1, this.aClass2_Sub1_Sub2_7.anInt123);
				this.aClass2_Sub1_Sub2_7.aClass43_1 = new Class43(local99, (byte) 4);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass43_2 = new Class43(local99, (byte) 4);
				this.aClass47_1.method561(this.aClass2_Sub1_Sub2_8.anInt123, this.aClass2_Sub1_Sub2_8.aByteArray1);
				local74 = this.aClass47_1.method558();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method588(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt874 = this.aClass47_1.method558();
					aBoolean247 = this.aClass47_1.method558() == 1;
					this.aLong29 = 0L;
					this.anInt974 = 0;
					this.aClass48_1.anInt802 = 0;
					super.aBoolean217 = true;
					this.aBoolean260 = true;
					this.aBoolean227 = true;
					this.aClass2_Sub1_Sub2_7.anInt123 = 0;
					this.aClass2_Sub1_Sub2_6.anInt123 = 0;
					this.anInt857 = -1;
					this.anInt1024 = -1;
					this.anInt1025 = -1;
					this.anInt1026 = -1;
					this.anInt856 = 0;
					this.anInt858 = 0;
					this.anInt862 = 0;
					this.anInt860 = 0;
					this.anInt866 = 0;
					this.anInt909 = 0;
					this.aBoolean236 = false;
					super.anInt816 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray14[local389] = null;
					}
					this.anInt992 = 0;
					this.anInt838 = 0;
					this.anInt870 = 0;
					this.anInt864 = 0;
					this.anInt844 = (int) (Math.random() * 100.0D) - 50;
					this.anInt872 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1031 = (int) (Math.random() * 80.0D) - 40;
					this.anInt966 = (int) (Math.random() * 120.0D) - 60;
					this.anInt1014 = (int) (Math.random() * 30.0D) - 20;
					this.anInt969 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt888 = 0;
					this.anInt1060 = -1;
					this.anInt943 = 0;
					this.anInt944 = 0;
					this.anInt913 = 0;
					this.anInt983 = 0;
					for (local225 = 0; local225 < this.anInt911; local225++) {
						this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local225] = null;
						this.aClass2_Sub1_Sub2Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local259] = null;
					}
					aClass2_Sub1_Sub1_Sub1_Sub2_1 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[this.anInt912] = new Class2_Sub1_Sub1_Sub1_Sub2();
					this.aClass50_12.method573();
					this.aClass50_11.method573();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass50ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass50_10 = new Class50((byte) 8);
					this.anInt980 = 0;
					this.anInt979 = 0;
					this.method639(this.anInt1005);
					this.anInt1005 = -1;
					this.method639(this.anInt965);
					this.anInt965 = -1;
					this.method639(this.anInt976);
					this.anInt976 = -1;
					this.method639(this.anInt910);
					this.anInt910 = -1;
					this.method639(this.anInt950);
					this.anInt950 = -1;
					this.method639(this.anInt1048);
					this.anInt1048 = -1;
					this.method639(this.anInt986);
					this.anInt986 = -1;
					this.aBoolean233 = false;
					this.anInt946 = 3;
					this.anInt1054 = 0;
					this.aBoolean236 = false;
					this.aBoolean238 = false;
					this.aString31 = null;
					this.anInt841 = 0;
					this.anInt1044 = -1;
					this.aBoolean259 = true;
					this.method717((byte) 2);
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray263[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray12[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt1045 = 0;
					anInt1029 = 0;
					anInt1051 = 0;
					anInt975 = 0;
					anInt831 = 0;
					anInt920 = 0;
					this.method669(this.anInt942);
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
					this.aBoolean227 = true;
					this.aClass2_Sub1_Sub2_7.anInt123 = 0;
					this.aClass2_Sub1_Sub2_6.anInt123 = 0;
					this.anInt857 = -1;
					this.anInt1024 = -1;
					this.anInt1025 = -1;
					this.anInt1026 = -1;
					this.anInt856 = 0;
					this.anInt858 = 0;
					this.anInt862 = 0;
					this.anInt909 = 0;
					this.aBoolean236 = false;
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
					local389 = this.aClass47_1.method558();
					for (@Pc(908) int local908 = local389 + 3; local908 >= 0; local908--) {
						this.aString23 = "You have only just left another world";
						this.aString24 = "Your profile will be transferred in: " + local908;
						this.method623(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(930) Exception local930) {
						}
					}
					this.method588(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString23 = "Malformed login packet.";
					this.aString24 = "Please try again.";
				} else if (local74 == 23) {
					this.aString23 = "No reply from loginserver.";
					this.aString24 = "Please try again.";
				} else if (local74 == 24) {
					this.aString23 = "Error loading your profile.";
					this.aString24 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString23 = "Unexpected loginserver response.";
					this.aString24 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString23 = "This computers address has been blocked";
					this.aString24 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString23 = "Unexpected server response";
					this.aString24 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString23 = "No response from server";
					this.aString24 = "Please try using a different world.";
				} else if (this.anInt848 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1002) Exception local1002) {
					}
					this.anInt848++;
					this.method588(arg0, arg1, arg2);
				} else {
					this.aString23 = "No response from loginserver";
					this.aString24 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1045) IOException local1045) {
			this.aString23 = "";
			this.aString24 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!BFQIDHPO;)V")
	private void method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub2 arg2) {
		try {
			this.anInt1020 = 0;
			this.anInt914 = 0;
			this.method613(arg2, arg0);
			this.method683(arg0, arg2);
			if (arg1 <= 0) {
				this.anInt1012 = -256;
			}
			this.method714(arg0, arg2);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt1020; local29++) {
				local36 = this.anIntArray267[local29];
				if (this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local36].anInt327 != anInt1013) {
					this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local36].aClass32_1 = null;
					this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local36] = null;
				}
			}
			if (arg2.anInt123 != arg0) {
				signlink.reporterror(this.aString26 + " size mismatch in getnpcpos - pos:" + arg2.anInt123 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt983; local36++) {
				if (this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray264[local36]] == null) {
					signlink.reporterror(this.aString26 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt983);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("34296, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Z")
	private boolean method590() {
		try {
			if (this.aClass47_1 == null) {
				return false;
			}
			@Pc(427) String local427;
			@Pc(169) int local169;
			try {
				@Pc(17) int local17 = this.aClass47_1.method559();
				if (local17 == 0) {
					return false;
				}
				if (this.anInt857 == -1) {
					this.aClass47_1.method560(this.aClass2_Sub1_Sub2_6.aByteArray1, 0, 1);
					this.anInt857 = this.aClass2_Sub1_Sub2_6.aByteArray1[0] & 0xFF;
					if (this.aClass43_2 != null) {
						this.anInt857 = this.anInt857 - this.aClass43_2.method501() & 0xFF;
					}
					this.anInt856 = Class8.anIntArray43[this.anInt857];
					local17--;
				}
				if (this.anInt856 == -1) {
					if (local17 <= 0) {
						return false;
					}
					this.aClass47_1.method560(this.aClass2_Sub1_Sub2_6.aByteArray1, 0, 1);
					this.anInt856 = this.aClass2_Sub1_Sub2_6.aByteArray1[0] & 0xFF;
					local17--;
				}
				if (this.anInt856 == -2) {
					if (local17 <= 1) {
						return false;
					}
					this.aClass47_1.method560(this.aClass2_Sub1_Sub2_6.aByteArray1, 0, 2);
					this.aClass2_Sub1_Sub2_6.anInt123 = 0;
					this.anInt856 = this.aClass2_Sub1_Sub2_6.method81();
					local17 -= 2;
				}
				if (local17 < this.anInt856) {
					return false;
				}
				this.aClass2_Sub1_Sub2_6.anInt123 = 0;
				this.aClass47_1.method560(this.aClass2_Sub1_Sub2_6.aByteArray1, 0, this.anInt856);
				this.anInt858 = 0;
				this.anInt1026 = this.anInt1025;
				this.anInt1025 = this.anInt1024;
				this.anInt1024 = this.anInt857;
				@Pc(173) int local173;
				@Pc(190) int local190;
				@Pc(165) int local165;
				if (this.anInt857 == 250) {
					this.aBoolean255 = true;
					local165 = this.aClass2_Sub1_Sub2_6.method98();
					local169 = this.aClass2_Sub1_Sub2_6.method84();
					local173 = this.aClass2_Sub1_Sub2_6.method79();
					this.anIntArray249[local173] = local169;
					this.anIntArray257[local173] = local165;
					this.anIntArray252[local173] = 1;
					for (local190 = 0; local190 < 98; local190++) {
						if (local169 >= anIntArray275[local190]) {
							this.anIntArray252[local173] = local190 + 2;
						}
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 38) {
					local165 = this.aClass2_Sub1_Sub2_6.method107();
					this.method635(local165);
					if (this.anInt965 != -1) {
						this.method639(this.anInt965);
						this.anInt965 = -1;
						this.aBoolean224 = true;
					}
					if (this.anInt910 != -1) {
						this.method639(this.anInt910);
						this.anInt910 = -1;
						this.aBoolean263 = true;
					}
					if (this.anInt950 != -1) {
						this.method639(this.anInt950);
						this.anInt950 = -1;
					}
					if (this.anInt976 != -1) {
						this.method639(this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt1048 != local165) {
						this.method639(this.anInt1048);
						this.anInt1048 = local165;
					}
					if (this.anInt1054 != 0) {
						this.anInt1054 = 0;
						this.aBoolean224 = true;
					}
					this.aBoolean255 = true;
					this.aBoolean248 = true;
					this.aBoolean233 = false;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 153) {
					local165 = this.aClass2_Sub1_Sub2_6.method106();
					local169 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					if (this.anInt965 != -1) {
						this.method639(this.anInt965);
						this.anInt965 = -1;
						this.aBoolean224 = true;
					}
					if (this.anInt910 != -1) {
						this.method639(this.anInt910);
						this.anInt910 = -1;
						this.aBoolean263 = true;
					}
					if (this.anInt950 != -1) {
						this.method639(this.anInt950);
						this.anInt950 = -1;
					}
					if (this.anInt976 != local169) {
						this.method639(this.anInt976);
						this.anInt976 = local169;
					}
					if (this.anInt1048 != local165) {
						this.method639(this.anInt1048);
						this.anInt1048 = local165;
					}
					if (this.anInt1054 != 0) {
						this.anInt1054 = 0;
						this.aBoolean224 = true;
					}
					this.aBoolean255 = true;
					this.aBoolean248 = true;
					this.aBoolean233 = false;
					this.anInt857 = -1;
					return true;
				}
				@Pc(445) int local445;
				@Pc(438) String local438;
				@Pc(443) boolean local443;
				@Pc(580) String local580;
				if (this.anInt857 == 198) {
					local427 = this.aClass2_Sub1_Sub2_6.method86();
					@Pc(441) long local441;
					if (local427.endsWith(":tradereq:")) {
						local438 = local427.substring(0, local427.indexOf(":"));
						local441 = Class19.method231(local438);
						local443 = false;
						for (local445 = 0; local445 < this.anInt982; local445++) {
							if (this.aLongArray4[local445] == local441) {
								local443 = true;
								break;
							}
						}
						if (!local443 && this.anInt991 == 0) {
							this.method626(local438, "wishes to trade with you.", 4, this.anInt916);
						}
					} else if (local427.endsWith(":duelreq:")) {
						local438 = local427.substring(0, local427.indexOf(":"));
						local441 = Class19.method231(local438);
						local443 = false;
						for (local445 = 0; local445 < this.anInt982; local445++) {
							if (this.aLongArray4[local445] == local441) {
								local443 = true;
								break;
							}
						}
						if (!local443 && this.anInt991 == 0) {
							this.method626(local438, "wishes to duel with you.", 8, this.anInt916);
						}
					} else if (local427.endsWith(":chalreq:")) {
						local438 = local427.substring(0, local427.indexOf(":"));
						local441 = Class19.method231(local438);
						local443 = false;
						for (local445 = 0; local445 < this.anInt982; local445++) {
							if (this.aLongArray4[local445] == local441) {
								local443 = true;
								break;
							}
						}
						if (!local443 && this.anInt991 == 0) {
							local580 = local427.substring(local427.indexOf(":") + 1, local427.length() - 9);
							this.method626(local438, local580, 8, this.anInt916);
						}
					} else {
						this.method626("", local427, 0, this.anInt916);
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 220) {
					this.aBoolean238 = false;
					this.anInt1054 = 2;
					this.aString28 = "";
					this.aBoolean224 = true;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 14) {
					local165 = this.aClass2_Sub1_Sub2_6.method109();
					local169 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					local173 = this.aClass2_Sub1_Sub2_6.method110();
					@Pc(645) Class10 local645 = Class10.method204(local169);
					local645.anInt259 = local173;
					local645.anInt252 = local165;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 216) {
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					local169 = this.aClass2_Sub1_Sub2_6.method79();
					local173 = this.aClass2_Sub1_Sub2_6.method81();
					if (local173 == 65535) {
						if (this.anInt864 < 50) {
							this.anIntArray242[this.anInt864] = (short) local165;
							this.anIntArray276[this.anInt864] = local169;
							this.anIntArray226[this.anInt864] = 0;
							this.anInt864++;
						}
					} else if (this.aBoolean251 && !aBoolean244 && this.anInt864 < 50) {
						this.anIntArray242[this.anInt864] = local165;
						this.anIntArray276[this.anInt864] = local169;
						this.anIntArray226[this.anInt864] = local173 + Class21.anIntArray61[local165];
						this.anInt864++;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 149) {
					this.anInt866 = this.aClass2_Sub1_Sub2_6.method79();
					if (this.anInt866 == 1) {
						this.anInt852 = this.aClass2_Sub1_Sub2_6.method81();
					}
					if (this.anInt866 >= 2 && this.anInt866 <= 6) {
						if (this.anInt866 == 2) {
							this.anInt884 = 64;
							this.anInt885 = 64;
						}
						if (this.anInt866 == 3) {
							this.anInt884 = 0;
							this.anInt885 = 64;
						}
						if (this.anInt866 == 4) {
							this.anInt884 = 128;
							this.anInt885 = 64;
						}
						if (this.anInt866 == 5) {
							this.anInt884 = 64;
							this.anInt885 = 0;
						}
						if (this.anInt866 == 6) {
							this.anInt884 = 64;
							this.anInt885 = 128;
						}
						this.anInt866 = 2;
						this.anInt881 = this.aClass2_Sub1_Sub2_6.method81();
						this.anInt882 = this.aClass2_Sub1_Sub2_6.method81();
						this.anInt883 = this.aClass2_Sub1_Sub2_6.method79();
					}
					if (this.anInt866 == 10) {
						this.anInt964 = this.aClass2_Sub1_Sub2_6.method81();
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 142) {
					this.anInt982 = this.anInt856 / 8;
					for (local165 = 0; local165 < this.anInt982; local165++) {
						this.aLongArray4[local165] = this.aClass2_Sub1_Sub2_6.method85();
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 10) {
					this.anInt998 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt999 = this.aClass2_Sub1_Sub2_6.method100();
					this.anInt857 = -1;
					return true;
				}
				@Pc(936) int local936;
				@Pc(922) Class10 local922;
				if (this.anInt857 == 110) {
					this.aBoolean255 = true;
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					local922 = Class10.method204(local165);
					while (this.aClass2_Sub1_Sub2_6.anInt123 < this.anInt856) {
						local173 = this.aClass2_Sub1_Sub2_6.method93();
						local190 = this.aClass2_Sub1_Sub2_6.method81();
						local936 = this.aClass2_Sub1_Sub2_6.method79();
						if (local936 == 255) {
							local936 = this.aClass2_Sub1_Sub2_6.method84();
						}
						if (local173 >= 0 && local173 < local922.anIntArray46.length) {
							local922.anIntArray46[local173] = local190;
							local922.anIntArray50[local173] = local936;
						}
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 226) {
					local165 = this.aClass2_Sub1_Sub2_6.method106();
					this.method635(local165);
					if (this.anInt1048 != -1) {
						this.method639(this.anInt1048);
						this.anInt1048 = -1;
						this.aBoolean255 = true;
						this.aBoolean248 = true;
					}
					if (this.anInt965 != -1) {
						this.method639(this.anInt965);
						this.anInt965 = -1;
						this.aBoolean224 = true;
					}
					if (this.anInt910 != -1) {
						this.method639(this.anInt910);
						this.anInt910 = -1;
						this.aBoolean263 = true;
					}
					if (this.anInt950 != -1) {
						this.method639(this.anInt950);
						this.anInt950 = -1;
					}
					if (this.anInt976 != local165) {
						this.method639(this.anInt976);
						this.anInt976 = local165;
					}
					if (this.anInt1054 != 0) {
						this.anInt1054 = 0;
						this.aBoolean224 = true;
					}
					this.aBoolean233 = false;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 36) {
					this.anInt943 = 0;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 168) {
					this.anInt980 = this.aClass2_Sub1_Sub2_6.method79();
					this.aBoolean255 = true;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 121) {
					local165 = this.aClass2_Sub1_Sub2_6.method107();
					local169 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					local173 = local169 >> 10 & 0x1F;
					local190 = local169 >> 5 & 0x1F;
					local936 = local169 & 0x1F;
					Class10.method204(local165).anInt231 = (local173 << 19) + (local190 << 11) + (local936 << 3);
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 155) {
					local165 = this.aClass2_Sub1_Sub2_6.method111();
					if (local165 >= 0) {
						this.method635(local165);
					}
					if (local165 != this.anInt986) {
						this.method639(this.anInt986);
						this.anInt986 = local165;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 208) {
					local165 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					Class10.method204(local165).anInt257 = 3;
					if (aClass2_Sub1_Sub1_Sub1_Sub2_1.aClass32_2 == null) {
						Class10.method204(local165).anInt258 = (aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray60[0] << 25) + (aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray60[4] << 20) + (aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray59[0] << 15) + (aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray59[8] << 10) + (aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray59[11] << 5) + aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray59[1];
					} else {
						Class10.method204(local165).anInt258 = (int) (aClass2_Sub1_Sub1_Sub1_Sub2_1.aClass32_2.aLong21 + 305419896L);
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 1) {
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					local169 = this.aClass2_Sub1_Sub2_6.method106();
					local173 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					local190 = this.aClass2_Sub1_Sub2_6.method107();
					Class10.method204(local165).anInt261 = local190;
					Class10.method204(local165).anInt262 = local169;
					Class10.method204(local165).anInt260 = local173;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 122) {
					local165 = this.aClass2_Sub1_Sub2_6.method79();
					local169 = this.aClass2_Sub1_Sub2_6.method79();
					local173 = this.aClass2_Sub1_Sub2_6.method79();
					local190 = this.aClass2_Sub1_Sub2_6.method79();
					this.aBooleanArray11[local165] = true;
					this.anIntArray258[local165] = local169;
					this.anIntArray266[local165] = local173;
					this.anIntArray265[local165] = local190;
					this.anIntArray256[local165] = 0;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 123) {
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					@Pc(1368) boolean local1368 = this.aClass2_Sub1_Sub2_6.method98() == 1;
					Class10.method204(local165).aBoolean71 = local1368;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 201) {
					local165 = this.aClass2_Sub1_Sub2_6.method98();
					local169 = this.aClass2_Sub1_Sub2_6.method106();
					if (local169 == 65535) {
						local169 = -1;
					}
					if (this.anIntArray255[local165] != local169) {
						this.method639(this.anIntArray255[local165]);
						this.anIntArray255[local165] = local169;
					}
					this.aBoolean255 = true;
					this.aBoolean248 = true;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 108) {
					this.anInt862 = this.aClass2_Sub1_Sub2_6.method106() * 30;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 170) {
					this.aBoolean222 = true;
					this.anInt1055 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt1056 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt1057 = this.aClass2_Sub1_Sub2_6.method81();
					this.anInt1058 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt1059 = this.aClass2_Sub1_Sub2_6.method79();
					if (this.anInt1059 >= 100) {
						this.anInt1007 = this.anInt1055 * 128 + 64;
						this.anInt1009 = this.anInt1056 * 128 + 64;
						this.anInt1008 = this.method624(this.anInt1009, this.anInt876, this.anInt1007) - this.anInt1057;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 227) {
					this.anInt1044 = this.aClass2_Sub1_Sub2_6.method99();
					if (this.anInt1044 == this.anInt946) {
						if (this.anInt1044 == 3) {
							this.anInt946 = 1;
						} else {
							this.anInt946 = 3;
						}
						this.aBoolean255 = true;
					}
					this.anInt857 = -1;
					return true;
				}
				@Pc(1564) Class10 local1564;
				if (this.anInt857 == 152) {
					local165 = this.aClass2_Sub1_Sub2_6.method106();
					local169 = this.aClass2_Sub1_Sub2_6.method81();
					local1564 = Class10.method204(local169);
					if (local1564 != null && local1564.anInt267 == 0) {
						if (local165 < 0) {
							local165 = 0;
						}
						if (local165 > local1564.anInt256 - local1564.anInt246) {
							local165 = local1564.anInt256 - local1564.anInt246;
						}
						local1564.anInt268 = local165;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 53) {
					local165 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					local169 = this.aClass2_Sub1_Sub2_6.method106();
					Class10.method204(local165).anInt257 = 1;
					Class10.method204(local165).anInt258 = local169;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 19) {
					this.anInt998 = this.aClass2_Sub1_Sub2_6.method99();
					this.anInt999 = this.aClass2_Sub1_Sub2_6.method99();
					while (this.aClass2_Sub1_Sub2_6.anInt123 < this.anInt856) {
						local165 = this.aClass2_Sub1_Sub2_6.method79();
						this.method703(local165, this.aClass2_Sub1_Sub2_6);
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 235) {
					this.anInt841 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 47) {
					local427 = this.aClass2_Sub1_Sub2_6.method86();
					local169 = this.aClass2_Sub1_Sub2_6.method79();
					local173 = this.aClass2_Sub1_Sub2_6.method98();
					if (local173 >= 1 && local173 <= 5) {
						if (local427.equalsIgnoreCase("null")) {
							local427 = null;
						}
						this.aStringArray12[local173 - 1] = local427;
						this.aBooleanArray12[local173 - 1] = local169 == 0;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 75) {
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					local169 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					local173 = this.aClass2_Sub1_Sub2_6.method106();
					Class10.method204(local169).anInt245 = (local173 << 16) + local165;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 99) {
					this.anInt835 = this.aClass2_Sub1_Sub2_6.method81();
					this.anInt890 = this.aClass2_Sub1_Sub2_6.method100();
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 181) {
					for (local165 = 0; local165 < this.aClass2_Sub1_Sub1_Sub1_Sub2Array1.length; local165++) {
						if (this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local165] != null) {
							this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local165].anInt316 = -1;
						}
					}
					for (local169 = 0; local169 < this.aClass2_Sub1_Sub1_Sub1_Sub1Array1.length; local169++) {
						if (this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local169] != null) {
							this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local169].anInt316 = -1;
						}
					}
					this.anInt857 = -1;
					return true;
				}
				@Pc(1872) int local1872;
				@Pc(1839) long local1839;
				if (this.anInt857 == 45) {
					local1839 = this.aClass2_Sub1_Sub2_6.method85();
					local173 = this.aClass2_Sub1_Sub2_6.method84();
					local190 = this.aClass2_Sub1_Sub2_6.method79();
					local443 = false;
					for (local445 = 0; local445 < 100; local445++) {
						if (this.anIntArray230[local445] == local173) {
							local443 = true;
							break;
						}
					}
					if (local190 <= 1) {
						for (local1872 = 0; local1872 < this.anInt982; local1872++) {
							if (this.aLongArray4[local1872] == local1839) {
								local443 = true;
								break;
							}
						}
					}
					if (!local443 && this.anInt991 == 0) {
						try {
							this.anIntArray230[this.anInt996] = local173;
							this.anInt996 = (this.anInt996 + 1) % 100;
							local580 = Class26.method293(this.anInt1038, this.aClass2_Sub1_Sub2_6, this.anInt856 - 13);
							if (local190 != 3) {
								local580 = Class1.method11(local580);
							}
							if (local190 == 2 || local190 == 3) {
								this.method626("@cr2@" + Class19.method235(Class19.method232(local1839)), local580, 7, this.anInt916);
							} else if (local190 == 1) {
								this.method626("@cr1@" + Class19.method235(Class19.method232(local1839)), local580, 7, this.anInt916);
							} else {
								this.method626(Class19.method235(Class19.method232(local1839)), local580, 3, this.anInt916);
							}
						} catch (@Pc(1986) Exception local1986) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt857 = -1;
					return true;
				}
				@Pc(2357) int local2357;
				if (this.anInt857 == 243 || this.anInt857 == 46) {
					local165 = this.anInt846;
					local169 = this.anInt847;
					if (this.anInt857 == 243) {
						local165 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
						local169 = this.aClass2_Sub1_Sub2_6.method81();
						this.aBoolean218 = false;
					}
					if (this.anInt857 == 46) {
						local165 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
						local169 = this.aClass2_Sub1_Sub2_6.method106();
						this.aClass2_Sub1_Sub2_6.method89();
						local173 = 0;
						while (true) {
							if (local173 >= 4) {
								this.aClass2_Sub1_Sub2_6.method91();
								this.aBoolean218 = true;
								break;
							}
							for (local190 = 0; local190 < 13; local190++) {
								for (local936 = 0; local936 < 13; local936++) {
									local445 = this.aClass2_Sub1_Sub2_6.method90(1);
									if (local445 == 1) {
										this.anIntArrayArrayArray8[local173][local190][local936] = this.aClass2_Sub1_Sub2_6.method90(26);
									} else {
										this.anIntArrayArrayArray8[local173][local190][local936] = -1;
									}
								}
							}
							local173++;
						}
					}
					if (this.anInt846 == local165 && this.anInt847 == local169 && this.anInt870 == 2) {
						this.anInt857 = -1;
						return true;
					}
					this.anInt846 = local165;
					this.anInt847 = local169;
					this.anInt922 = (this.anInt846 - 6) * 8;
					this.anInt923 = (this.anInt847 - 6) * 8;
					this.aBoolean229 = false;
					if ((this.anInt846 / 8 == 48 || this.anInt846 / 8 == 49) && this.anInt847 / 8 == 48) {
						this.aBoolean229 = true;
					}
					if (this.anInt846 / 8 == 48 && this.anInt847 / 8 == 148) {
						this.aBoolean229 = true;
					}
					this.anInt870 = 1;
					this.aLong31 = System.currentTimeMillis();
					this.method663(null, "Loading - please wait.");
					if (this.anInt857 == 243) {
						local173 = 0;
						local190 = (this.anInt846 - 6) / 8;
						label1190: while (true) {
							if (local190 > (this.anInt846 + 6) / 8) {
								this.aByteArrayArray6 = new byte[local173][];
								this.aByteArrayArray5 = new byte[local173][];
								this.anIntArray269 = new int[local173];
								this.anIntArray270 = new int[local173];
								this.anIntArray271 = new int[local173];
								local173 = 0;
								local936 = (this.anInt846 - 6) / 8;
								while (true) {
									if (local936 > (this.anInt846 + 6) / 8) {
										break label1190;
									}
									for (local445 = (this.anInt847 - 6) / 8; local445 <= (this.anInt847 + 6) / 8; local445++) {
										this.anIntArray269[local173] = (local936 << 8) + local445;
										if (this.aBoolean229 && (local445 == 49 || local445 == 149 || local445 == 147 || local936 == 50 || local936 == 49 && local445 == 47)) {
											this.anIntArray270[local173] = -1;
											this.anIntArray271[local173] = -1;
											local173++;
										} else {
											local1872 = this.anIntArray270[local173] = this.aClass5_Sub1_1.method183(local936, 0, local445);
											if (local1872 != -1) {
												this.aClass5_Sub1_1.method173(3, local1872);
											}
											local2357 = this.anIntArray271[local173] = this.aClass5_Sub1_1.method183(local936, 1, local445);
											if (local2357 != -1) {
												this.aClass5_Sub1_1.method173(3, local2357);
											}
											local173++;
										}
									}
									local936++;
								}
							}
							for (local936 = (this.anInt847 - 6) / 8; local936 <= (this.anInt847 + 6) / 8; local936++) {
								local173++;
							}
							local190++;
						}
					}
					if (this.anInt857 == 46) {
						local173 = 0;
						@Pc(2393) int[] local2393 = new int[676];
						local936 = 0;
						label1149: while (true) {
							@Pc(2439) int local2439;
							@Pc(2423) int local2423;
							@Pc(2429) int local2429;
							if (local936 >= 4) {
								this.aByteArrayArray6 = new byte[local173][];
								this.aByteArrayArray5 = new byte[local173][];
								this.anIntArray269 = new int[local173];
								this.anIntArray270 = new int[local173];
								this.anIntArray271 = new int[local173];
								local445 = 0;
								while (true) {
									if (local445 >= local173) {
										break label1149;
									}
									local1872 = this.anIntArray269[local445] = local2393[local445];
									local2357 = local1872 >> 8 & 0xFF;
									local2423 = local1872 & 0xFF;
									local2429 = this.anIntArray270[local445] = this.aClass5_Sub1_1.method183(local2357, 0, local2423);
									if (local2429 != -1) {
										this.aClass5_Sub1_1.method173(3, local2429);
									}
									local2439 = this.anIntArray271[local445] = this.aClass5_Sub1_1.method183(local2357, 1, local2423);
									if (local2439 != -1) {
										this.aClass5_Sub1_1.method173(3, local2439);
									}
									local445++;
								}
							}
							for (local445 = 0; local445 < 13; local445++) {
								for (local1872 = 0; local1872 < 13; local1872++) {
									local2357 = this.anIntArrayArrayArray8[local936][local445][local1872];
									if (local2357 != -1) {
										local2423 = local2357 >> 14 & 0x3FF;
										local2429 = local2357 >> 3 & 0x7FF;
										local2439 = (local2423 / 8 << 8) + local2429 / 8;
										for (@Pc(2441) int local2441 = 0; local2441 < local173; local2441++) {
											if (local2393[local2441] == local2439) {
												local2439 = -1;
												break;
											}
										}
										if (local2439 != -1) {
											local2393[local173++] = local2439;
										}
									}
								}
							}
							local936++;
						}
					}
					local173 = this.anInt922 - this.anInt924;
					local190 = this.anInt923 - this.anInt925;
					this.anInt924 = this.anInt922;
					this.anInt925 = this.anInt923;
					for (local936 = 0; local936 < 16384; local936++) {
						@Pc(2594) Class2_Sub1_Sub1_Sub1_Sub1 local2594 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local936];
						if (local2594 != null) {
							for (local1872 = 0; local1872 < 10; local1872++) {
								local2594.anIntArray57[local1872] -= local173;
								local2594.anIntArray58[local1872] -= local190;
							}
							local2594.anInt328 -= local173 * 128;
							local2594.anInt329 -= local190 * 128;
						}
					}
					for (local445 = 0; local445 < this.anInt911; local445++) {
						@Pc(2649) Class2_Sub1_Sub1_Sub1_Sub2 local2649 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local445];
						if (local2649 != null) {
							for (local2357 = 0; local2357 < 10; local2357++) {
								local2649.anIntArray57[local2357] -= local173;
								local2649.anIntArray58[local2357] -= local190;
							}
							local2649.anInt328 -= local173 * 128;
							local2649.anInt329 -= local190 * 128;
						}
					}
					this.aBoolean246 = true;
					@Pc(2701) byte local2701 = 0;
					@Pc(2703) byte local2703 = 104;
					@Pc(2705) byte local2705 = 1;
					if (local173 < 0) {
						local2701 = 103;
						local2703 = -1;
						local2705 = -1;
					}
					@Pc(2715) byte local2715 = 0;
					@Pc(2717) byte local2717 = 104;
					@Pc(2719) byte local2719 = 1;
					if (local190 < 0) {
						local2715 = 103;
						local2717 = -1;
						local2719 = -1;
					}
					for (@Pc(2729) int local2729 = local2701; local2729 != local2703; local2729 += local2705) {
						for (@Pc(2733) int local2733 = local2715; local2733 != local2717; local2733 += local2719) {
							@Pc(2739) int local2739 = local2729 + local173;
							@Pc(2743) int local2743 = local2733 + local190;
							for (@Pc(2745) int local2745 = 0; local2745 < 4; local2745++) {
								if (local2739 >= 0 && local2743 >= 0 && local2739 < 104 && local2743 < 104) {
									this.aClass50ArrayArrayArray1[local2745][local2729][local2733] = this.aClass50ArrayArrayArray1[local2745][local2739][local2743];
								} else {
									this.aClass50ArrayArrayArray1[local2745][local2729][local2733] = null;
								}
							}
						}
					}
					for (@Pc(2807) Class2_Sub2 local2807 = (Class2_Sub2) this.aClass50_10.method569(); local2807 != null; local2807 = (Class2_Sub2) this.aClass50_10.method571()) {
						local2807.anInt401 -= local173;
						local2807.anInt402 -= local190;
						if (local2807.anInt401 < 0 || local2807.anInt402 < 0 || local2807.anInt401 >= 104 || local2807.anInt402 >= 104) {
							local2807.method504();
						}
					}
					if (this.anInt943 != 0) {
						this.anInt943 -= local173;
						this.anInt944 -= local190;
					}
					this.aBoolean222 = false;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 240) {
					if (this.anInt946 == 12) {
						this.aBoolean255 = true;
					}
					this.anInt898 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 92) {
					local165 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					local169 = this.aClass2_Sub1_Sub2_6.method111();
					local1564 = Class10.method204(local165);
					if (local1564.anInt253 != local169 || local169 == -1) {
						local1564.anInt253 = local169;
						local1564.anInt238 = 0;
						local1564.anInt232 = 0;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 222) {
					this.anInt998 = this.aClass2_Sub1_Sub2_6.method100();
					this.anInt999 = this.aClass2_Sub1_Sub2_6.method98();
					for (local165 = this.anInt998; local165 < this.anInt998 + 8; local165++) {
						for (local169 = this.anInt999; local169 < this.anInt999 + 8; local169++) {
							if (this.aClass50ArrayArrayArray1[this.anInt876][local165][local169] != null) {
								this.aClass50ArrayArrayArray1[this.anInt876][local165][local169] = null;
								this.method647(local165, local169);
							}
						}
					}
					for (@Pc(2997) Class2_Sub2 local2997 = (Class2_Sub2) this.aClass50_10.method569(); local2997 != null; local2997 = (Class2_Sub2) this.aClass50_10.method571()) {
						if (local2997.anInt401 >= this.anInt998 && local2997.anInt401 < this.anInt998 + 8 && local2997.anInt402 >= this.anInt999 && local2997.anInt402 < this.anInt999 + 8 && local2997.anInt399 == this.anInt876) {
							local2997.anInt398 = 0;
						}
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 129) {
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					local922 = Class10.method204(local165);
					for (local173 = 0; local173 < local922.anIntArray46.length; local173++) {
						local922.anIntArray46[local173] = -1;
						local922.anIntArray46[local173] = 0;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 207) {
					this.anInt1043 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt961 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt1035 = this.aClass2_Sub1_Sub2_6.method79();
					this.aBoolean257 = true;
					this.aBoolean224 = true;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 171) {
					this.anInt946 = this.aClass2_Sub1_Sub2_6.method79();
					this.aBoolean255 = true;
					this.aBoolean248 = true;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 73) {
					local165 = this.aClass2_Sub1_Sub2_6.method107();
					local169 = this.aClass2_Sub1_Sub2_6.method106();
					Class10.method204(local169).anInt257 = 2;
					Class10.method204(local169).anInt258 = local165;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 159) {
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					local169 = this.aClass2_Sub1_Sub2_6.method107();
					this.method635(local165);
					if (local169 != -1) {
						this.method635(local169);
					}
					if (this.anInt976 != -1) {
						this.method639(this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt1048 != -1) {
						this.method639(this.anInt1048);
						this.anInt1048 = -1;
					}
					if (this.anInt965 != -1) {
						this.method639(this.anInt965);
						this.anInt965 = -1;
					}
					if (this.anInt910 != local165) {
						this.method639(this.anInt910);
						this.anInt910 = local165;
					}
					if (this.anInt950 != local165) {
						this.method639(this.anInt950);
						this.anInt950 = local169;
					}
					this.anInt1054 = 0;
					this.aBoolean233 = false;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 5) {
					local165 = this.aClass2_Sub1_Sub2_6.method111();
					if (local165 != this.anInt1005) {
						this.method639(this.anInt1005);
						this.anInt1005 = local165;
					}
					this.aBoolean224 = true;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 78) {
					this.method589(this.anInt856, this.anInt869, this.aClass2_Sub1_Sub2_6);
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 205) {
					this.anInt888 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 252) {
					this.method662();
					this.anInt857 = -1;
					return false;
				}
				if (this.anInt857 == 228) {
					if (this.anInt1048 != -1) {
						this.method639(this.anInt1048);
						this.anInt1048 = -1;
						this.aBoolean255 = true;
						this.aBoolean248 = true;
					}
					if (this.anInt965 != -1) {
						this.method639(this.anInt965);
						this.anInt965 = -1;
						this.aBoolean224 = true;
					}
					if (this.anInt910 != -1) {
						this.method639(this.anInt910);
						this.anInt910 = -1;
						this.aBoolean263 = true;
					}
					if (this.anInt950 != -1) {
						this.method639(this.anInt950);
						this.anInt950 = -1;
					}
					if (this.anInt976 != -1) {
						this.method639(this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt1054 != 0) {
						this.anInt1054 = 0;
						this.aBoolean224 = true;
					}
					this.aBoolean233 = false;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 61) {
					local1839 = this.aClass2_Sub1_Sub2_6.method85();
					local173 = this.aClass2_Sub1_Sub2_6.method79();
					@Pc(3436) String local3436 = Class19.method235(Class19.method232(local1839));
					for (local936 = 0; local936 < this.anInt979; local936++) {
						if (local1839 == this.aLongArray3[local936]) {
							if (this.anIntArray227[local936] != local173) {
								this.anIntArray227[local936] = local173;
								this.aBoolean255 = true;
								if (local173 > 0) {
									this.method626("", local3436 + " has logged in.", 5, this.anInt916);
								}
								if (local173 == 0) {
									this.method626("", local3436 + " has logged out.", 5, this.anInt916);
								}
							}
							local3436 = null;
							break;
						}
					}
					if (local3436 != null && this.anInt979 < 200) {
						this.aLongArray3[this.anInt979] = local1839;
						this.aStringArray9[this.anInt979] = local3436;
						this.anIntArray227[this.anInt979] = local173;
						this.anInt979++;
						this.aBoolean255 = true;
					}
					@Pc(3536) boolean local3536 = false;
					while (!local3536) {
						local3536 = true;
						for (local1872 = 0; local1872 < this.anInt979 - 1; local1872++) {
							if (this.anIntArray227[local1872] != anInt918 && this.anIntArray227[local1872 + 1] == anInt918 || this.anIntArray227[local1872] == 0 && this.anIntArray227[local1872 + 1] != 0) {
								local2357 = this.anIntArray227[local1872];
								this.anIntArray227[local1872] = this.anIntArray227[local1872 + 1];
								this.anIntArray227[local1872 + 1] = local2357;
								@Pc(3597) String local3597 = this.aStringArray9[local1872];
								this.aStringArray9[local1872] = this.aStringArray9[local1872 + 1];
								this.aStringArray9[local1872 + 1] = local3597;
								@Pc(3619) long local3619 = this.aLongArray3[local1872];
								this.aLongArray3[local1872] = this.aLongArray3[local1872 + 1];
								this.aLongArray3[local1872 + 1] = local3619;
								this.aBoolean255 = true;
								local3536 = false;
							}
						}
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 113) {
					this.aBoolean222 = false;
					for (local165 = 0; local165 < 5; local165++) {
						this.aBooleanArray11[local165] = false;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 23) {
					if (this.anInt946 == 12) {
						this.aBoolean255 = true;
					}
					this.anInt1028 = this.aClass2_Sub1_Sub2_6.method82();
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 4) {
					for (local165 = 0; local165 < this.anIntArray268.length; local165++) {
						if (this.anIntArray268[local165] != this.anIntArray229[local165]) {
							this.anIntArray268[local165] = this.anIntArray229[local165];
							this.method592(local165);
							this.aBoolean255 = true;
						}
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 157) {
					this.aBoolean238 = false;
					this.anInt1054 = 1;
					this.aString28 = "";
					this.aBoolean224 = true;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 7) {
					local165 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					local169 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					local173 = this.aClass2_Sub1_Sub2_6.method107();
					if (local169 == 65535) {
						Class10.method204(local173).anInt257 = 0;
						this.anInt857 = -1;
						return true;
					}
					@Pc(3801) Class28 local3801 = Class28.method410(local169);
					Class10.method204(local173).anInt257 = 4;
					Class10.method204(local173).anInt258 = local169;
					Class10.method204(local173).anInt261 = local3801.anInt580;
					Class10.method204(local173).anInt262 = local3801.anInt585;
					Class10.method204(local173).anInt260 = local3801.anInt600 * 100 / local165;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 83) {
					this.aBoolean222 = true;
					this.anInt951 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt952 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt953 = this.aClass2_Sub1_Sub2_6.method81();
					this.anInt954 = this.aClass2_Sub1_Sub2_6.method79();
					this.anInt955 = this.aClass2_Sub1_Sub2_6.method79();
					if (this.anInt955 >= 100) {
						local165 = this.anInt951 * 128 + 64;
						local169 = this.anInt952 * 128 + 64;
						local173 = this.method624(local169, this.anInt876, local165) - this.anInt953;
						local190 = local165 - this.anInt1007;
						local936 = local173 - this.anInt1008;
						local445 = local169 - this.anInt1009;
						local1872 = (int) Math.sqrt((double) (local190 * local190 + local445 * local445));
						this.anInt1010 = (int) (Math.atan2((double) local936, (double) local1872) * 325.949D) & 0x7FF;
						this.anInt1011 = (int) (Math.atan2((double) local190, (double) local445) * -325.949D) & 0x7FF;
						if (this.anInt1010 < 128) {
							this.anInt1010 = 128;
						}
						if (this.anInt1010 > 383) {
							this.anInt1010 = 383;
						}
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 141) {
					local165 = this.aClass2_Sub1_Sub2_6.method106();
					this.method635(local165);
					if (this.anInt1048 != -1) {
						this.method639(this.anInt1048);
						this.anInt1048 = -1;
						this.aBoolean255 = true;
						this.aBoolean248 = true;
					}
					if (this.anInt910 != -1) {
						this.method639(this.anInt910);
						this.anInt910 = -1;
						this.aBoolean263 = true;
					}
					if (this.anInt950 != -1) {
						this.method639(this.anInt950);
						this.anInt950 = -1;
					}
					if (this.anInt976 != -1) {
						this.method639(this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt965 != local165) {
						this.method639(this.anInt965);
						this.anInt965 = local165;
					}
					this.aBoolean233 = false;
					this.aBoolean224 = true;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 184) {
					this.anInt962 = this.aClass2_Sub1_Sub2_6.method107();
					this.anInt886 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					this.anInt1004 = this.aClass2_Sub1_Sub2_6.method107();
					this.anInt917 = this.aClass2_Sub1_Sub2_6.method84();
					this.anInt939 = this.aClass2_Sub1_Sub2_6.method81();
					this.anInt893 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					this.aClass2_Sub1_Sub2_6.method79();
					this.anInt1049 = this.aClass2_Sub1_Sub2_6.method108(this.aByte43);
					this.anInt1040 = this.aClass2_Sub1_Sub2_6.method81();
					this.anInt1042 = this.aClass2_Sub1_Sub2_6.method107();
					this.aClass2_Sub1_Sub2_6.method107();
					signlink.dnslookup(Class19.method234(this.anInt917));
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 245) {
					this.aBoolean255 = true;
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					local922 = Class10.method204(local165);
					local173 = this.aClass2_Sub1_Sub2_6.method81();
					for (local190 = 0; local190 < local173; local190++) {
						local922.anIntArray46[local190] = this.aClass2_Sub1_Sub2_6.method106();
						local936 = this.aClass2_Sub1_Sub2_6.method99();
						if (local936 == 255) {
							local936 = this.aClass2_Sub1_Sub2_6.method84();
						}
						local922.anIntArray50[local190] = local936;
					}
					for (local936 = local173; local936 < local922.anIntArray46.length; local936++) {
						local922.anIntArray46[local936] = 0;
						local922.anIntArray50[local936] = 0;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 65) {
					local165 = this.aClass2_Sub1_Sub2_6.method106();
					local438 = this.aClass2_Sub1_Sub2_6.method86();
					Class10.method204(local165).aString5 = local438;
					@Pc(4234) int local4234 = this.anIntArray255[this.anInt946];
					if (Class10.method204(local165).anInt234 == local4234) {
						this.aBoolean255 = true;
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 26 || this.anInt857 == 215 || this.anInt857 == 27 || this.anInt857 == 192 || this.anInt857 == 204 || this.anInt857 == 12 || this.anInt857 == 62 || this.anInt857 == 33 || this.anInt857 == 76 || this.anInt857 == 11 || this.anInt857 == 106) {
					this.method703(this.anInt857, this.aClass2_Sub1_Sub2_6);
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 253) {
					local165 = this.aClass2_Sub1_Sub2_6.method107();
					local169 = this.aClass2_Sub1_Sub2_6.method114(216);
					this.anIntArray229[local165] = local169;
					if (this.anIntArray268[local165] != local169) {
						this.anIntArray268[local165] = local169;
						this.method592(local165);
						this.aBoolean255 = true;
						if (this.anInt1005 != -1) {
							this.aBoolean224 = true;
						}
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 224) {
					this.method612(this.anInt856, this.aClass2_Sub1_Sub2_6);
					this.aBoolean246 = false;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 128) {
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					@Pc(4380) byte local4380 = this.aClass2_Sub1_Sub2_6.method102();
					this.anIntArray229[local165] = local4380;
					if (this.anIntArray268[local165] != local4380) {
						this.anIntArray268[local165] = local4380;
						this.method592(local165);
						this.aBoolean255 = true;
						if (this.anInt1005 != -1) {
							this.aBoolean224 = true;
						}
					}
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 191) {
					local165 = this.aClass2_Sub1_Sub2_6.method81();
					if (local165 == 65535) {
						local165 = -1;
					}
					if (local165 != this.anInt908 && this.aBoolean258 && !aBoolean244 && this.anInt1061 == 0) {
						this.anInt889 = local165;
						this.aBoolean234 = true;
						this.aClass5_Sub1_1.method173(2, this.anInt889);
					}
					this.anInt908 = local165;
					this.anInt857 = -1;
					return true;
				}
				if (this.anInt857 == 247) {
					local165 = this.aClass2_Sub1_Sub2_6.method106();
					local169 = this.aClass2_Sub1_Sub2_6.method112();
					if (this.aBoolean258 && !aBoolean244) {
						this.anInt889 = local165;
						this.aBoolean234 = false;
						this.aClass5_Sub1_1.method173(2, this.anInt889);
						this.anInt1061 = local169;
					}
					this.anInt857 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt857 + "," + this.anInt856 + " - " + this.anInt1025 + "," + this.anInt1026);
				this.method662();
			} catch (@Pc(4528) IOException local4528) {
				this.method591();
			} catch (@Pc(4533) Exception local4533) {
				local427 = "T2 - " + this.anInt857 + "," + this.anInt1025 + "," + this.anInt1026 + " - " + this.anInt856 + "," + (this.anInt922 + aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0]) + "," + (this.anInt923 + aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0]) + " - ";
				for (local169 = 0; local169 < this.anInt856 && local169 < 50; local169++) {
					local427 = local427 + this.aClass2_Sub1_Sub2_6.aByteArray1[local169] + ",";
				}
				signlink.reporterror(local427);
				this.method662();
			}
			return true;
		} catch (@Pc(4614) RuntimeException local4614) {
			signlink.reporterror("89437, " + -38717 + ", " + local4614.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method591() {
		try {
			if (this.anInt860 > 0) {
				this.method662();
			} else {
				this.method663("Please wait - attempting to reestablish", "Connection lost");
				this.anInt888 = 0;
				this.anInt943 = 0;
				@Pc(27) Class47 local27 = this.aClass47_1;
				this.aBoolean227 = false;
				this.anInt848 = 0;
				this.method588(this.aString26, this.aString27, true);
				if (!this.aBoolean227) {
					this.method662();
				}
				try {
					local27.method557();
				} catch (@Pc(50) Exception local50) {
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("87836, " + false + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method592(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class23.aClass23Array1[arg0].anInt476;
			if (local4 != 0) {
				@Pc(18) int local18 = this.anIntArray268[arg0];
				if (local4 == 1) {
					if (local18 == 1) {
						Class2_Sub1_Sub3_Sub3.method371(0.9D);
					}
					if (local18 == 2) {
						Class2_Sub1_Sub3_Sub3.method371(0.8D);
					}
					if (local18 == 3) {
						Class2_Sub1_Sub3_Sub3.method371(0.7D);
					}
					if (local18 == 4) {
						Class2_Sub1_Sub3_Sub3.method371(0.6D);
					}
					Class28.aClass31_5.method451();
					this.aBoolean263 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean258;
					if (local18 == 0) {
						this.method674(0, this.aBoolean258);
						this.aBoolean258 = true;
					}
					if (local18 == 1) {
						this.method674(-400, this.aBoolean258);
						this.aBoolean258 = true;
					}
					if (local18 == 2) {
						this.method674(-800, this.aBoolean258);
						this.aBoolean258 = true;
					}
					if (local18 == 3) {
						this.method674(-1200, this.aBoolean258);
						this.aBoolean258 = true;
					}
					if (local18 == 4) {
						this.aBoolean258 = false;
					}
					if (this.aBoolean258 != local56 && !aBoolean244) {
						if (this.aBoolean258) {
							this.anInt889 = this.anInt908;
							this.aBoolean234 = true;
							this.aClass5_Sub1_1.method173(2, this.anInt889);
						} else {
							this.method646();
						}
						this.anInt1061 = 0;
					}
				}
				if (local4 == 4) {
					if (local18 == 0) {
						this.aBoolean251 = true;
						this.method709(0);
					}
					if (local18 == 1) {
						this.aBoolean251 = true;
						this.method709(-400);
					}
					if (local18 == 2) {
						this.aBoolean251 = true;
						this.method709(-800);
					}
					if (local18 == 3) {
						this.aBoolean251 = true;
						this.method709(-1200);
					}
					if (local18 == 4) {
						this.aBoolean251 = false;
					}
				}
				if (local4 == 5) {
					this.anInt949 = local18;
				}
				if (local4 == 6) {
					this.anInt900 = local18;
				}
				if (local4 == 8) {
					this.anInt1023 = local18;
					this.aBoolean224 = true;
				}
				if (local4 == 9) {
					this.anInt854 = local18;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("84733, " + 5 + ", " + arg0 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!FMDWWBSX;)V")
	private void method593(@OriginalArg(1) Class10 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt263;
			@Pc(69) int local69;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local69 = this.anInt979;
					if (this.anInt980 != 2) {
						local69 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local69) {
						arg0.aString5 = "";
						arg0.anInt266 = 0;
					} else {
						if (this.anIntArray227[local4] == 0) {
							arg0.aString5 = "@red@Offline";
						} else if (this.anIntArray227[local4] < 200) {
							if (this.anIntArray227[local4] == anInt918) {
								arg0.aString5 = "@gre@World" + (this.anIntArray227[local4] - 9);
							} else {
								arg0.aString5 = "@yel@World" + (this.anIntArray227[local4] - 9);
							}
						} else if (this.anIntArray227[local4] == anInt918) {
							arg0.aString5 = "@gre@Classic" + (this.anIntArray227[local4] - 219);
						} else {
							arg0.aString5 = "@yel@Classic" + (this.anIntArray227[local4] - 219);
						}
						arg0.anInt266 = 1;
					}
				} else if (local4 == 203) {
					local69 = this.anInt979;
					if (this.anInt980 != 2) {
						local69 = 0;
					}
					arg0.anInt256 = local69 * 15 + 20;
					if (arg0.anInt256 <= arg0.anInt246) {
						arg0.anInt256 = arg0.anInt246 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt980 == 0) {
						arg0.aString5 = "Loading ignore list";
						arg0.anInt266 = 0;
					} else if (local4 == 1 && this.anInt980 == 0) {
						arg0.aString5 = "Please wait...";
						arg0.anInt266 = 0;
					} else {
						local69 = this.anInt982;
						if (this.anInt980 == 0) {
							local69 = 0;
						}
						if (local4 >= local69) {
							arg0.aString5 = "";
							arg0.anInt266 = 0;
						} else {
							arg0.aString5 = Class19.method235(Class19.method232(this.aLongArray4[local4]));
							arg0.anInt266 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt256 = this.anInt982 * 15 + 20;
					if (arg0.anInt256 <= arg0.anInt246) {
						arg0.anInt256 = arg0.anInt246 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt261 = 150;
					arg0.anInt262 = (int) (Math.sin((double) anInt1013 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean264) {
						for (local69 = 0; local69 < 7; local69++) {
							@Pc(382) int local382 = this.anIntArray274[local69];
							if (local382 >= 0 && !Class25.aClass25Array1[local382].method289()) {
								return;
							}
						}
						this.aBoolean264 = false;
						@Pc(401) Class2_Sub1_Sub1_Sub6[] local401 = new Class2_Sub1_Sub1_Sub6[7];
						@Pc(403) int local403 = 0;
						for (@Pc(405) int local405 = 0; local405 < 7; local405++) {
							@Pc(412) int local412 = this.anIntArray274[local405];
							if (local412 >= 0) {
								local401[local403++] = Class25.aClass25Array1[local412].method290();
							}
						}
						@Pc(434) Class2_Sub1_Sub1_Sub6 local434 = new Class2_Sub1_Sub1_Sub6(local401, 273, local403);
						for (@Pc(436) int local436 = 0; local436 < 5; local436++) {
							if (this.anIntArray263[local436] != 0) {
								local434.method526(anIntArrayArray25[local436][0], anIntArrayArray25[local436][this.anIntArray263[local436]]);
								if (local436 == 1) {
									local434.method526(anIntArray234[0], anIntArray234[this.anIntArray263[local436]]);
								}
							}
						}
						local434.method519();
						local434.method520(Class33.aClass33Array1[aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt309].anIntArray115[0]);
						local434.method529(64, 850, -30, -50, -30, true);
						arg0.anInt257 = 5;
						arg0.anInt258 = 0;
						Class10.method205(local434);
					}
				} else if (local4 == 324) {
					if (this.aClass2_Sub1_Sub3_Sub2_10 == null) {
						this.aClass2_Sub1_Sub3_Sub2_10 = arg0.aClass2_Sub1_Sub3_Sub2_2;
						this.aClass2_Sub1_Sub3_Sub2_11 = arg0.aClass2_Sub1_Sub3_Sub2_1;
					}
					if (this.aBoolean259) {
						arg0.aClass2_Sub1_Sub3_Sub2_2 = this.aClass2_Sub1_Sub3_Sub2_11;
					} else {
						arg0.aClass2_Sub1_Sub3_Sub2_2 = this.aClass2_Sub1_Sub3_Sub2_10;
					}
				} else if (local4 == 325) {
					if (this.aClass2_Sub1_Sub3_Sub2_10 == null) {
						this.aClass2_Sub1_Sub3_Sub2_10 = arg0.aClass2_Sub1_Sub3_Sub2_2;
						this.aClass2_Sub1_Sub3_Sub2_11 = arg0.aClass2_Sub1_Sub3_Sub2_1;
					}
					if (this.aBoolean259) {
						arg0.aClass2_Sub1_Sub3_Sub2_2 = this.aClass2_Sub1_Sub3_Sub2_10;
					} else {
						arg0.aClass2_Sub1_Sub3_Sub2_2 = this.aClass2_Sub1_Sub3_Sub2_11;
					}
				} else if (local4 == 600) {
					arg0.aString5 = this.aString30;
					if (anInt1013 % 20 < 10) {
						arg0.aString5 = arg0.aString5 + "|";
					} else {
						arg0.aString5 = arg0.aString5 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt874 < 1) {
							arg0.aString5 = "";
						} else if (this.aBoolean237) {
							arg0.anInt231 = 16711680;
							arg0.aString5 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt231 = 16777215;
							arg0.aString5 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(641) String local641;
					if (local4 == 660) {
						local69 = this.anInt962 - this.anInt886;
						if (local69 <= 0) {
							local641 = "earlier today";
						} else if (local69 == 1) {
							local641 = "yesterday";
						} else {
							local641 = local69 + " days ago";
						}
						arg0.aString5 = "You last logged in @red@" + local641 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt1042 == 0) {
							arg0.aString5 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt1042 <= this.anInt962) {
							arg0.aString5 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method594(this.anInt1042);
						} else {
							local69 = this.anInt962 + 14 - this.anInt1042;
							if (local69 <= 0) {
								local641 = "Earlier today";
							} else if (local69 == 1) {
								local641 = "Yesterday";
							} else {
								local641 = local69 + " days ago";
							}
							arg0.aString5 = local641 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method594(this.anInt1042) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(759) String local759;
						if (this.anInt1040 == 0) {
							local759 = "@yel@0 unread messages";
						} else if (this.anInt1040 == 1) {
							local759 = "@gre@1 unread message";
						} else {
							local759 = "@gre@" + this.anInt1040 + " unread messages";
						}
						arg0.aString5 = "You have " + local759 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt939 > 0 && this.anInt939 <= this.anInt962 + 10) {
							arg0.aString5 = "Last password change:\\n@gre@" + this.method594(this.anInt939);
						} else {
							arg0.aString5 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt1049 > 2 && !aBoolean243) {
							arg0.aString5 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt1049 > 2) {
							arg0.aString5 = "\\n\\nYou have @gre@" + this.anInt1049 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt1049 > 0) {
							arg0.aString5 = "You have @gre@" + this.anInt1049 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString5 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt1049 > 2 && !aBoolean243) {
							arg0.aString5 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt1049 > 0) {
							arg0.aString5 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString5 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt1042 > this.anInt962) {
							arg0.aString5 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString5 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt980 == 0) {
				arg0.aString5 = "Loading friend list";
				arg0.anInt266 = 0;
			} else if (local4 == 1 && this.anInt980 == 1) {
				arg0.aString5 = "Connecting to friendserver";
				arg0.anInt266 = 0;
			} else if (local4 == 2 && this.anInt980 != 2) {
				arg0.aString5 = "Please wait...";
				arg0.anInt266 = 0;
			} else {
				local69 = this.anInt979;
				if (this.anInt980 != 2) {
					local69 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local69) {
					arg0.aString5 = "";
					arg0.anInt266 = 0;
				} else {
					arg0.aString5 = this.aStringArray9[local4];
					arg0.anInt266 = 1;
				}
			}
		} catch (@Pc(916) RuntimeException local916) {
			signlink.reporterror("84851, " + 2 + ", " + arg0 + ", " + local916.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	private String method594(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt962 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(26) int local26 = local16.get(5);
			@Pc(30) int local30 = local16.get(2);
			@Pc(34) int local34 = local16.get(1);
			@Pc(92) String[] local92 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local26 + "-" + local92[local30] + "-" + local34;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("24493, " + false + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
	private String method595() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("36870, " + 7 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method596() {
		try {
			this.anInt991 = 0;
			@Pc(10) int local10 = (aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 >> 7) + this.anInt922;
			@Pc(18) int local18 = (aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 >> 7) + this.anInt923;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt991 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt991 = 1;
			}
			if (this.anInt991 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt991 = 0;
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("53146, " + 0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method597(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte40) {
				this.anInt857 = this.aClass2_Sub1_Sub2_6.method79();
			}
			if (aBoolean244 && this.anInt870 == 2 && Class29.anInt605 != this.anInt876) {
				this.method663(null, "Loading - please wait.");
				this.anInt870 = 1;
				this.aLong31 = System.currentTimeMillis();
			}
			if (this.anInt870 == 1) {
				@Pc(37) int local37 = this.method598();
				if (local37 != 0 && System.currentTimeMillis() - this.aLong31 > 360000L) {
					signlink.reporterror(this.aString26 + " glcfb " + this.aLong30 + "," + local37 + "," + aBoolean244 + "," + this.aClass41Array1[0] + "," + this.aClass5_Sub1_1.method171() + "," + this.anInt876 + "," + this.anInt846 + "," + this.anInt847);
					this.aLong31 = System.currentTimeMillis();
				}
			}
			if (this.anInt870 == 2 && this.anInt876 != this.anInt1060) {
				this.anInt1060 = this.anInt876;
				this.method708(this.anInt876, (byte) 2);
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("38205, " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)I")
	private int method598() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray270[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray271[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray6.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray269[local41] >> 8) * 64 - this.anInt922;
					@Pc(74) int local74 = (this.anIntArray269[local41] & 0xFF) * 64 - this.anInt923;
					if (this.aBoolean218) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class29.method420(local74, local48, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean246) {
				return -4;
			} else {
				this.anInt870 = 2;
				Class29.anInt605 = this.anInt876;
				this.method608();
				this.anInt856 += 0;
				this.aClass2_Sub1_Sub2_7.method68(178);
				return 0;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("17720, " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method579() {
		this.method586("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt812 = 5;
		}
		if (aBoolean226) {
			this.aBoolean266 = true;
			return;
		}
		aBoolean226 = true;
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
			this.aBoolean252 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass41Array1[local107] = new Class41(signlink.aRandomAccessFileArray1[local107], local107 + 1, 500000, 9, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method656(964);
			this.aClass39_2 = this.method675("title screen", 1, 25, "title", this.anIntArray233[1]);
			this.aClass2_Sub1_Sub3_Sub1_2 = new Class2_Sub1_Sub3_Sub1("p11_full", false, 2, this.aClass39_2);
			this.aClass2_Sub1_Sub3_Sub1_3 = new Class2_Sub1_Sub3_Sub1("p12_full", false, 2, this.aClass39_2);
			this.aClass2_Sub1_Sub3_Sub1_4 = new Class2_Sub1_Sub3_Sub1("b12_full", false, 2, this.aClass39_2);
			this.aClass2_Sub1_Sub3_Sub1_5 = new Class2_Sub1_Sub3_Sub1("q8_full", true, 2, this.aClass39_2);
			this.method665();
			this.method629(187);
			@Pc(203) Class39 local203 = this.method675("config", 2, 30, "config", this.anIntArray233[2]);
			@Pc(215) Class39 local215 = this.method675("interface", 3, 35, "interface", this.anIntArray233[3]);
			@Pc(227) Class39 local227 = this.method675("2d graphics", 4, 40, "media", this.anIntArray233[4]);
			@Pc(239) Class39 local239 = this.method675("textures", 6, 45, "textures", this.anIntArray233[6]);
			@Pc(251) Class39 local251 = this.method675("chat system", 7, 50, "wordenc", this.anIntArray233[7]);
			@Pc(263) Class39 local263 = this.method675("sound effects", 8, 55, "sounds", this.anIntArray233[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass27_1 = new Class27(104, false, 4, 104, this.anIntArrayArrayArray7);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass30Array1[local288] = new Class30((byte) 3, 104, 104);
			}
			this.aClass2_Sub1_Sub3_Sub2_12 = new Class2_Sub1_Sub3_Sub2(512, 512);
			@Pc(323) Class39 local323 = this.method675("update list", 5, 60, "versionlist", this.anIntArray233[5]);
			this.method586("Connecting to update server", 60);
			this.aClass5_Sub1_1 = new Class5_Sub1();
			this.aClass5_Sub1_1.method184(local323, this);
			Class4.method164(this.aClass5_Sub1_1.method189());
			Class2_Sub1_Sub1_Sub6.method509(this.aClass5_Sub1_1.method176(0), this.aClass5_Sub1_1);
			if (!aBoolean244) {
				this.anInt889 = 0;
				this.aBoolean234 = true;
				this.aClass5_Sub1_1.method173(2, this.anInt889);
				while (this.aClass5_Sub1_1.method171() > 0) {
					this.method627();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass5_Sub1_1.anInt180 > 3) {
						this.method706("ondemand");
						return;
					}
				}
			}
			this.method586("Requesting animations", 65);
			@Pc(398) int local398 = this.aClass5_Sub1_1.method176(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass5_Sub1_1.method173(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass5_Sub1_1.method171() > 0) {
				local419 = local398 - this.aClass5_Sub1_1.method171();
				if (local419 > 0) {
					this.method586("Loading animations - " + local419 * 100 / local398 + "%", 65);
				}
				this.method627();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass5_Sub1_1.anInt180 > 3) {
					this.method706("ondemand");
					return;
				}
			}
			this.method586("Requesting models", 70);
			local398 = this.aClass5_Sub1_1.method176(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass5_Sub1_1.method175(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass5_Sub1_1.method173(0, local419);
				}
			}
			local398 = this.aClass5_Sub1_1.method171();
			while (this.aClass5_Sub1_1.method171() > 0) {
				local479 = local398 - this.aClass5_Sub1_1.method171();
				if (local479 > 0) {
					this.method586("Loading models - " + local479 * 100 / local398 + "%", 70);
				}
				this.method627();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass41Array1[0] != null) {
				this.method586("Requesting maps", 75);
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(47, 0, 48));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(47, 1, 48));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(48, 0, 48));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(48, 1, 48));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(49, 0, 48));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(49, 1, 48));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(47, 0, 47));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(47, 1, 47));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(48, 0, 47));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(48, 1, 47));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(48, 0, 148));
				this.aClass5_Sub1_1.method173(3, this.aClass5_Sub1_1.method183(48, 1, 148));
				local398 = this.aClass5_Sub1_1.method171();
				while (this.aClass5_Sub1_1.method171() > 0) {
					local479 = local398 - this.aClass5_Sub1_1.method171();
					if (local479 > 0) {
						this.method586("Loading maps - " + local479 * 100 / local398 + "%", 75);
					}
					this.method627();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass5_Sub1_1.method176(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass5_Sub1_1.method175(local479);
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
					this.aClass5_Sub1_1.method190(0, local479, local738);
				}
			}
			this.aClass5_Sub1_1.method177(aBoolean243);
			if (!aBoolean244) {
				local398 = this.aClass5_Sub1_1.method176(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass5_Sub1_1.method172(local736)) {
						this.aClass5_Sub1_1.method190(2, local736, (byte) 1);
					}
				}
			}
			this.method586("Unpacking media", 80);
			this.aClass2_Sub1_Sub3_Sub4_8 = new Class2_Sub1_Sub3_Sub4(local227, "invback", 0);
			this.aClass2_Sub1_Sub3_Sub4_10 = new Class2_Sub1_Sub3_Sub4(local227, "chatback", 0);
			this.aClass2_Sub1_Sub3_Sub4_9 = new Class2_Sub1_Sub3_Sub4(local227, "mapback", 0);
			this.aClass2_Sub1_Sub3_Sub4_16 = new Class2_Sub1_Sub3_Sub4(local227, "backbase1", 0);
			this.aClass2_Sub1_Sub3_Sub4_17 = new Class2_Sub1_Sub3_Sub4(local227, "backbase2", 0);
			this.aClass2_Sub1_Sub3_Sub4_18 = new Class2_Sub1_Sub3_Sub4(local227, "backhmid1", 0);
			for (local736 = 0; local736 < 13; local736++) {
				this.aClass2_Sub1_Sub3_Sub4Array4[local736] = new Class2_Sub1_Sub3_Sub4(local227, "sideicons", local736);
			}
			this.aClass2_Sub1_Sub3_Sub2_15 = new Class2_Sub1_Sub3_Sub2(local227, "compass", 0);
			this.aClass2_Sub1_Sub3_Sub2_9 = new Class2_Sub1_Sub3_Sub2(local227, "mapedge", 0);
			this.aClass2_Sub1_Sub3_Sub2_9.method274();
			for (@Pc(938) int local938 = 0; local938 < 72; local938++) {
				this.aClass2_Sub1_Sub3_Sub4Array5[local938] = new Class2_Sub1_Sub3_Sub4(local227, "mapscene", local938);
			}
			for (@Pc(956) int local956 = 0; local956 < 70; local956++) {
				this.aClass2_Sub1_Sub3_Sub2Array8[local956] = new Class2_Sub1_Sub3_Sub2(local227, "mapfunction", local956);
			}
			for (@Pc(974) int local974 = 0; local974 < 5; local974++) {
				this.aClass2_Sub1_Sub3_Sub2Array9[local974] = new Class2_Sub1_Sub3_Sub2(local227, "hitmarks", local974);
			}
			for (@Pc(992) int local992 = 0; local992 < 6; local992++) {
				this.aClass2_Sub1_Sub3_Sub2Array5[local992] = new Class2_Sub1_Sub3_Sub2(local227, "headicons_pk", local992);
			}
			for (@Pc(1010) int local1010 = 0; local1010 < 9; local1010++) {
				this.aClass2_Sub1_Sub3_Sub2Array7[local1010] = new Class2_Sub1_Sub3_Sub2(local227, "headicons_prayer", local1010);
			}
			for (@Pc(1028) int local1028 = 0; local1028 < 6; local1028++) {
				this.aClass2_Sub1_Sub3_Sub2Array10[local1028] = new Class2_Sub1_Sub3_Sub2(local227, "headicons_hint", local1028);
			}
			this.aClass2_Sub1_Sub3_Sub2_3 = new Class2_Sub1_Sub3_Sub2(local227, "overlay_multiway", 0);
			this.aClass2_Sub1_Sub3_Sub2_16 = new Class2_Sub1_Sub3_Sub2(local227, "mapmarker", 0);
			this.aClass2_Sub1_Sub3_Sub2_17 = new Class2_Sub1_Sub3_Sub2(local227, "mapmarker", 1);
			for (@Pc(1070) int local1070 = 0; local1070 < 8; local1070++) {
				this.aClass2_Sub1_Sub3_Sub2Array4[local1070] = new Class2_Sub1_Sub3_Sub2(local227, "cross", local1070);
			}
			this.aClass2_Sub1_Sub3_Sub2_4 = new Class2_Sub1_Sub3_Sub2(local227, "mapdots", 0);
			this.aClass2_Sub1_Sub3_Sub2_5 = new Class2_Sub1_Sub3_Sub2(local227, "mapdots", 1);
			this.aClass2_Sub1_Sub3_Sub2_6 = new Class2_Sub1_Sub3_Sub2(local227, "mapdots", 2);
			this.aClass2_Sub1_Sub3_Sub2_7 = new Class2_Sub1_Sub3_Sub2(local227, "mapdots", 3);
			this.aClass2_Sub1_Sub3_Sub2_8 = new Class2_Sub1_Sub3_Sub2(local227, "mapdots", 4);
			this.aClass2_Sub1_Sub3_Sub4_19 = new Class2_Sub1_Sub3_Sub4(local227, "scrollbar", 0);
			this.aClass2_Sub1_Sub3_Sub4_20 = new Class2_Sub1_Sub3_Sub4(local227, "scrollbar", 1);
			this.aClass2_Sub1_Sub3_Sub4_1 = new Class2_Sub1_Sub3_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub3_Sub4_2 = new Class2_Sub1_Sub3_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub3_Sub4_3 = new Class2_Sub1_Sub3_Sub4(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub3_Sub4_4 = new Class2_Sub1_Sub3_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub3_Sub4_4.method397(842);
			this.aClass2_Sub1_Sub3_Sub4_5 = new Class2_Sub1_Sub3_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub3_Sub4_5.method397(842);
			this.aClass2_Sub1_Sub3_Sub4_11 = new Class2_Sub1_Sub3_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub3_Sub4_11.method398();
			this.aClass2_Sub1_Sub3_Sub4_12 = new Class2_Sub1_Sub3_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub3_Sub4_12.method398();
			this.aClass2_Sub1_Sub3_Sub4_13 = new Class2_Sub1_Sub3_Sub4(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub3_Sub4_13.method398();
			this.aClass2_Sub1_Sub3_Sub4_14 = new Class2_Sub1_Sub3_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub3_Sub4_14.method397(842);
			this.aClass2_Sub1_Sub3_Sub4_14.method398();
			this.aClass2_Sub1_Sub3_Sub4_15 = new Class2_Sub1_Sub3_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub3_Sub4_15.method397(842);
			this.aClass2_Sub1_Sub3_Sub4_15.method398();
			for (@Pc(1260) int local1260 = 0; local1260 < 2; local1260++) {
				this.aClass2_Sub1_Sub3_Sub4Array2[local1260] = new Class2_Sub1_Sub3_Sub4(local227, "mod_icons", local1260);
			}
			@Pc(1283) Class2_Sub1_Sub3_Sub2 local1283 = new Class2_Sub1_Sub3_Sub2(local227, "backleft1", 0);
			this.aClass49_19 = new Class49(anInt871, this.method584(), local1283.anInt464, local1283.anInt465);
			local1283.method275(0, 0);
			@Pc(1308) Class2_Sub1_Sub3_Sub2 local1308 = new Class2_Sub1_Sub3_Sub2(local227, "backleft2", 0);
			this.aClass49_20 = new Class49(anInt871, this.method584(), local1308.anInt464, local1308.anInt465);
			local1308.method275(0, 0);
			@Pc(1333) Class2_Sub1_Sub3_Sub2 local1333 = new Class2_Sub1_Sub3_Sub2(local227, "backright1", 0);
			this.aClass49_21 = new Class49(anInt871, this.method584(), local1333.anInt464, local1333.anInt465);
			local1333.method275(0, 0);
			@Pc(1358) Class2_Sub1_Sub3_Sub2 local1358 = new Class2_Sub1_Sub3_Sub2(local227, "backright2", 0);
			this.aClass49_22 = new Class49(anInt871, this.method584(), local1358.anInt464, local1358.anInt465);
			local1358.method275(0, 0);
			@Pc(1383) Class2_Sub1_Sub3_Sub2 local1383 = new Class2_Sub1_Sub3_Sub2(local227, "backtop1", 0);
			this.aClass49_23 = new Class49(anInt871, this.method584(), local1383.anInt464, local1383.anInt465);
			local1383.method275(0, 0);
			@Pc(1408) Class2_Sub1_Sub3_Sub2 local1408 = new Class2_Sub1_Sub3_Sub2(local227, "backvmid1", 0);
			this.aClass49_24 = new Class49(anInt871, this.method584(), local1408.anInt464, local1408.anInt465);
			local1408.method275(0, 0);
			@Pc(1433) Class2_Sub1_Sub3_Sub2 local1433 = new Class2_Sub1_Sub3_Sub2(local227, "backvmid2", 0);
			this.aClass49_25 = new Class49(anInt871, this.method584(), local1433.anInt464, local1433.anInt465);
			local1433.method275(0, 0);
			@Pc(1458) Class2_Sub1_Sub3_Sub2 local1458 = new Class2_Sub1_Sub3_Sub2(local227, "backvmid3", 0);
			this.aClass49_26 = new Class49(anInt871, this.method584(), local1458.anInt464, local1458.anInt465);
			local1458.method275(0, 0);
			@Pc(1483) Class2_Sub1_Sub3_Sub2 local1483 = new Class2_Sub1_Sub3_Sub2(local227, "backhmid2", 0);
			this.aClass49_27 = new Class49(anInt871, this.method584(), local1483.anInt464, local1483.anInt465);
			local1483.method275(0, 0);
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1529) int local1529 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1531) int local1531 = 0; local1531 < 100; local1531++) {
				if (this.aClass2_Sub1_Sub3_Sub2Array8[local1531] != null) {
					this.aClass2_Sub1_Sub3_Sub2Array8[local1531].method273(local1508 + local1529, local1515 + local1529, 289, local1522 + local1529);
				}
				if (this.aClass2_Sub1_Sub3_Sub4Array5[local1531] != null) {
					this.aClass2_Sub1_Sub3_Sub4Array5[local1531].method399(local1508 + local1529, local1515 + local1529, 289, local1522 + local1529);
				}
			}
			this.method586("Unpacking textures", 83);
			Class2_Sub1_Sub3_Sub3.method367(local239);
			Class2_Sub1_Sub3_Sub3.method371(0.8D);
			Class2_Sub1_Sub3_Sub3.method366();
			this.method586("Unpacking config", 86);
			Class33.method460(local203);
			Class46.method548(local203);
			Class14.method209(local203);
			Class28.method412(local203);
			Class32.method457(local203);
			Class25.method287(local203);
			Class6.method192(local203);
			Class23.method285(local203);
			Class36.method482(local203);
			Class28.aBoolean145 = aBoolean243;
			if (!aBoolean244) {
				this.method586("Unpacking sounds", 90);
				@Pc(1634) byte[] local1634 = local263.method489("sounds.dat", null);
				@Pc(1640) Class2_Sub1_Sub2 local1640 = new Class2_Sub1_Sub2(local1634, -990);
				Class21.method248(local1640);
			}
			this.method586("Unpacking interfaces", 95);
			@Pc(1671) Class2_Sub1_Sub3_Sub1[] local1671 = new Class2_Sub1_Sub3_Sub1[] { this.aClass2_Sub1_Sub3_Sub1_2, this.aClass2_Sub1_Sub3_Sub1_3, this.aClass2_Sub1_Sub3_Sub1_4, this.aClass2_Sub1_Sub3_Sub1_5 };
			Class10.method199(local215, local1671, local227);
			this.method586("Preparing game engine", 100);
			@Pc(1687) int local1687;
			@Pc(1689) int local1689;
			@Pc(1691) int local1691;
			for (@Pc(1683) int local1683 = 0; local1683 < 33; local1683++) {
				local1687 = 999;
				local1689 = 0;
				for (local1691 = 0; local1691 < 34; local1691++) {
					if (this.aClass2_Sub1_Sub3_Sub4_9.aByteArray14[local1691 + local1683 * this.aClass2_Sub1_Sub3_Sub4_9.anInt566] == 0) {
						if (local1687 == 999) {
							local1687 = local1691;
						}
					} else if (local1687 != 999) {
						local1689 = local1691;
						break;
					}
				}
				this.anIntArray228[local1683] = local1687;
				this.anIntArray231[local1683] = local1689 - local1687;
			}
			@Pc(1749) int local1749;
			for (local1687 = 5; local1687 < 156; local1687++) {
				local1689 = 999;
				local1691 = 0;
				for (local1749 = 25; local1749 < 172; local1749++) {
					if (this.aClass2_Sub1_Sub3_Sub4_9.aByteArray14[local1749 + local1687 * this.aClass2_Sub1_Sub3_Sub4_9.anInt566] == 0 && (local1749 > 34 || local1687 > 34)) {
						if (local1689 == 999) {
							local1689 = local1749;
						}
					} else if (local1689 != 999) {
						local1691 = local1749;
						break;
					}
				}
				this.anIntArray251[local1687 - 5] = local1689 - 25;
				this.anIntArray223[local1687 - 5] = local1691 - local1689;
			}
			Class2_Sub1_Sub3_Sub3.method364(765, 503);
			this.anIntArray262 = Class2_Sub1_Sub3_Sub3.anIntArray89;
			Class2_Sub1_Sub3_Sub3.method364(479, 96);
			this.anIntArray259 = Class2_Sub1_Sub3_Sub3.anIntArray89;
			Class2_Sub1_Sub3_Sub3.method364(190, 261);
			this.anIntArray260 = Class2_Sub1_Sub3_Sub3.anIntArray89;
			Class2_Sub1_Sub3_Sub3.method364(512, 334);
			this.anIntArray261 = Class2_Sub1_Sub3_Sub3.anIntArray89;
			@Pc(1840) int[] local1840 = new int[9];
			for (local1691 = 0; local1691 < 9; local1691++) {
				local1749 = local1691 * 32 + 128 + 15;
				@Pc(1858) int local1858 = local1749 * 3 + 600;
				@Pc(1862) int local1862 = Class2_Sub1_Sub3_Sub3.anIntArray87[local1749];
				local1840[local1691] = local1858 * local1862 >> 16;
			}
			Class27.method333(local1840);
			Class1.method1(local251);
			this.aClass48_1 = new Class48(0, this);
			this.method585(this.aClass48_1, 10);
			Class2_Sub1_Sub1_Sub5.aClient3 = this;
			Class46.aClient4 = this;
			Class32.aClient2 = this;
		} catch (@Pc(1903) Exception local1903) {
			signlink.reporterror("loaderror " + this.aString25 + " " + this.anInt984);
			this.aBoolean225 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method599(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt979 >= 100 && this.anInt890 != 1) {
					this.method626("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, this.anInt916);
				} else if (this.anInt979 >= 200) {
					this.method626("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, this.anInt916);
				} else {
					@Pc(40) String local40 = Class19.method235(Class19.method232(arg0));
					for (@Pc(42) int local42 = 0; local42 < this.anInt979; local42++) {
						if (this.aLongArray3[local42] == arg0) {
							this.method626("", local40 + " is already on your friend list", 0, this.anInt916);
							return;
						}
					}
					for (@Pc(73) int local73 = 0; local73 < this.anInt982; local73++) {
						if (this.aLongArray4[local73] == arg0) {
							this.method626("", "Please remove " + local40 + " from your ignore list first", 0, this.anInt916);
							return;
						}
					}
					if (!local40.equals(aClass2_Sub1_Sub1_Sub1_Sub2_1.aString11)) {
						this.aStringArray9[this.anInt979] = local40;
						this.aLongArray3[this.anInt979] = arg0;
						this.anIntArray227[this.anInt979] = 0;
						this.anInt979++;
						this.aBoolean255 = true;
						this.aClass2_Sub1_Sub2_7.method68(23);
						this.aClass2_Sub1_Sub2_7.method75(this.anInt1053, arg0);
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("33021, " + arg0 + ", " + -872 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method600() {
		try {
			for (@Pc(10) Class2_Sub1_Sub1_Sub3 local10 = (Class2_Sub1_Sub1_Sub3) this.aClass50_11.method569(); local10 != null; local10 = (Class2_Sub1_Sub1_Sub3) this.aClass50_11.method571()) {
				if (local10.anInt385 != this.anInt876 || local10.aBoolean88) {
					local10.method504();
				} else if (anInt1013 >= local10.anInt389) {
					local10.method229(this.anInt1046);
					if (local10.aBoolean88) {
						local10.method504();
					} else {
						this.aClass27_1.method308(0, local10.anInt385, local10.anInt387, 60, local10.anInt388, local10, -1, false, local10.anInt386);
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("11302, " + 45678 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method601(@OriginalArg(0) boolean arg0) {
		try {
			if (super.aClass49_2 == null) {
				this.method668((byte) 1);
				if (!arg0) {
					this.aClass49_3 = null;
					this.aClass49_4 = null;
					this.aClass49_5 = null;
					this.aClass49_6 = null;
					this.aClass49_7 = null;
					this.aClass49_8 = null;
					this.aClass49_9 = null;
					this.aClass49_10 = null;
					this.aClass49_11 = null;
					this.aClass49_18 = null;
					this.aClass49_16 = null;
					this.aClass49_15 = null;
					this.aClass49_17 = null;
					this.aClass49_12 = null;
					this.aClass49_13 = null;
					this.aClass49_14 = null;
					super.aClass49_2 = new Class49(anInt871, this.method584(), 765, 503);
					this.aBoolean263 = true;
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("67719, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method603() {
		try {
			if (this.anInt862 > 1) {
				this.anInt862--;
			}
			if (this.anInt860 > 0) {
				this.anInt860--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method590(); local22++) {
			}
			if (this.aBoolean227) {
				@Pc(41) Object local41 = this.aClass48_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass48_1.anObject1) {
					if (!aBoolean247) {
						this.aClass48_1.anInt802 = 0;
					} else if (super.anInt823 != 0 || this.aClass48_1.anInt802 >= 40) {
						this.aClass2_Sub1_Sub2_7.method68(158);
						this.aClass2_Sub1_Sub2_7.method69(0);
						local66 = this.aClass2_Sub1_Sub2_7.anInt123;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass48_1.anInt802 && local66 - this.aClass2_Sub1_Sub2_7.anInt123 < 240; local70++) {
							local68++;
							local86 = this.aClass48_1.anIntArray208[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass48_1.anIntArray207[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass48_1.anIntArray208[local70] == -1 && this.aClass48_1.anIntArray207[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt867 || local86 != this.anInt868) {
								@Pc(165) int local165 = local103 - this.anInt867;
								this.anInt867 = local103;
								@Pc(173) int local173 = local86 - this.anInt868;
								this.anInt868 = local86;
								if (this.anInt974 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass2_Sub1_Sub2_7.method70((this.anInt974 << 12) + (local165 << 6) + local173);
									this.anInt974 = 0;
								} else if (this.anInt974 < 8) {
									this.aClass2_Sub1_Sub2_7.method72((this.anInt974 << 19) + local120 + 8388608);
									this.anInt974 = 0;
								} else {
									this.aClass2_Sub1_Sub2_7.method73((this.anInt974 << 19) + local120 - 1073741824);
									this.anInt974 = 0;
								}
							} else if (this.anInt974 < 2047) {
								this.anInt974++;
							}
						}
						this.aClass2_Sub1_Sub2_7.method78(this.aClass2_Sub1_Sub2_7.anInt123 - local66);
						if (local68 >= this.aClass48_1.anInt802) {
							this.aClass48_1.anInt802 = 0;
						} else {
							this.aClass48_1.anInt802 -= local68;
							for (local86 = 0; local86 < this.aClass48_1.anInt802; local86++) {
								this.aClass48_1.anIntArray207[local86] = this.aClass48_1.anIntArray207[local86 + local68];
								this.aClass48_1.anIntArray208[local86] = this.aClass48_1.anIntArray208[local86 + local68];
							}
						}
					}
				}
				if (super.anInt823 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong29) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong29 = super.aLong28;
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
					this.aClass2_Sub1_Sub2_7.method68(126);
					this.aClass2_Sub1_Sub2_7.method73((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt929 > 0) {
					this.anInt929--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean245 = true;
				}
				if (this.aBoolean245 && this.anInt929 <= 0) {
					this.anInt929 = 20;
					this.aBoolean245 = false;
					this.aClass2_Sub1_Sub2_7.method68(165);
					this.aClass2_Sub1_Sub2_7.method70(this.anInt968);
					this.aClass2_Sub1_Sub2_7.method104(this.anInt969);
				}
				if (super.aBoolean217 && !this.aBoolean260) {
					this.aBoolean260 = true;
					this.aClass2_Sub1_Sub2_7.method68(207);
					this.aClass2_Sub1_Sub2_7.method69(1);
				}
				if (!super.aBoolean217 && this.aBoolean260) {
					this.aBoolean260 = false;
					this.aClass2_Sub1_Sub2_7.method68(207);
					this.aClass2_Sub1_Sub2_7.method69(0);
				}
				this.method597(this.aByte45);
				this.method718(413);
				this.method609();
				anInt935++;
				if (anInt935 > 87) {
					anInt935 = 0;
					this.aClass2_Sub1_Sub2_7.method68(1);
				}
				this.anInt858++;
				if (this.anInt858 > 750) {
					this.method591();
				}
				this.method625();
				this.method694();
				this.method670();
				anInt915++;
				if (anInt915 > 75) {
					anInt915 = 0;
					this.aClass2_Sub1_Sub2_7.method68(22);
				}
				this.anInt1046++;
				if (this.anInt1003 != 0) {
					this.anInt1002 += 20;
					if (this.anInt1002 >= 400) {
						this.anInt1003 = 0;
					}
				}
				if (this.anInt990 != 0) {
					this.anInt987++;
					if (this.anInt987 >= 15) {
						if (this.anInt990 == 2) {
							this.aBoolean255 = true;
						}
						if (this.anInt990 == 3) {
							this.aBoolean224 = true;
						}
						this.anInt990 = 0;
					}
				}
				if (this.anInt932 != 0) {
					this.anInt865++;
					if (super.anInt818 > this.anInt933 + 5 || super.anInt818 < this.anInt933 - 5 || super.anInt819 > this.anInt934 + 5 || super.anInt819 < this.anInt934 - 5) {
						this.aBoolean240 = true;
					}
					if (super.anInt817 == 0) {
						if (this.anInt932 == 2) {
							this.aBoolean255 = true;
						}
						if (this.anInt932 == 3) {
							this.aBoolean224 = true;
						}
						this.anInt932 = 0;
						if (this.aBoolean240 && this.anInt865 >= 5) {
							this.anInt960 = -1;
							this.method673();
							if (this.anInt960 == this.anInt930 && this.anInt959 != this.anInt931) {
								@Pc(721) Class10 local721 = Class10.method204(this.anInt930);
								@Pc(723) byte local723 = 0;
								if (this.anInt854 == 1 && local721.anInt263 == 206) {
									local723 = 1;
								}
								if (local721.anIntArray46[this.anInt959] <= 0) {
									local723 = 0;
								}
								if (local721.aBoolean64) {
									local66 = this.anInt931;
									local68 = this.anInt959;
									local721.anIntArray46[local68] = local721.anIntArray46[local66];
									local721.anIntArray50[local68] = local721.anIntArray50[local66];
									local721.anIntArray46[local66] = -1;
									local721.anIntArray50[local66] = 0;
								} else if (local723 == 1) {
									local66 = this.anInt931;
									local68 = this.anInt959;
									while (local66 != local68) {
										if (local66 > local68) {
											local721.method200(local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local721.method200(local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local721.method200(this.anInt931, this.anInt959);
								}
								this.aClass2_Sub1_Sub2_7.method68(217);
								this.aClass2_Sub1_Sub2_7.method96(local723);
								this.aClass2_Sub1_Sub2_7.method104(this.anInt930);
								this.aClass2_Sub1_Sub2_7.method104(this.anInt931);
								this.aClass2_Sub1_Sub2_7.method104(this.anInt959);
							}
						} else if ((this.anInt949 == 1 || this.method640(this.anInt909 - 1)) && this.anInt909 > 2) {
							this.method611();
						} else if (this.anInt909 > 0) {
							this.method681(this.anInt909 - 1);
						}
						this.anInt987 = 10;
						super.anInt823 = 0;
					}
				}
				anInt1017++;
				@Pc(914) int local914;
				if (anInt1017 > 1083) {
					anInt1017 = 0;
					this.aClass2_Sub1_Sub2_7.method68(44);
					this.aClass2_Sub1_Sub2_7.method69(0);
					local914 = this.aClass2_Sub1_Sub2_7.anInt123;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub2_7.method69(197);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub2_7.method69(248);
					}
					this.aClass2_Sub1_Sub2_7.method70((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub2_7.method69(169);
					this.aClass2_Sub1_Sub2_7.method69((int) (Math.random() * 256.0D));
					this.aClass2_Sub1_Sub2_7.method70((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub2_7.method69(192);
					this.aClass2_Sub1_Sub2_7.method69(124);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub2_7.method69(81);
					}
					this.aClass2_Sub1_Sub2_7.method70((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub2_7.method78(this.aClass2_Sub1_Sub2_7.anInt123 - local914);
				}
				@Pc(997) int local997;
				if (Class27.anInt517 != -1) {
					local914 = Class27.anInt517;
					local997 = Class27.anInt518;
					@Pc(1018) boolean local1018 = this.method650(0, 0, local997, true, (byte) 6, 0, local914, 0, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, 0);
					Class27.anInt517 = -1;
					if (local1018) {
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 1;
						this.anInt1002 = 0;
					}
				}
				if (super.anInt823 == 1 && this.aString31 != null) {
					this.aString31 = null;
					this.aBoolean224 = true;
					super.anInt823 = 0;
				}
				this.method676();
				if (this.anInt910 == -1) {
					this.method723();
					this.method659();
					this.method616();
				}
				if (super.anInt817 == 1 || super.anInt823 == 1) {
					this.anInt1021++;
				}
				if (this.anInt832 == 0 && this.anInt853 == 0 && this.anInt878 == 0) {
					if (this.anInt877 > 0) {
						this.anInt877--;
					}
				} else if (this.anInt877 < 100) {
					this.anInt877++;
					if (this.anInt877 == 100) {
						if (this.anInt832 != 0) {
							this.aBoolean224 = true;
						}
						if (this.anInt853 != 0) {
							this.aBoolean255 = true;
						}
					}
				}
				if (this.anInt870 == 2) {
					this.method689();
				}
				if (this.anInt870 == 2 && this.aBoolean222) {
					this.method724();
				}
				for (local914 = 0; local914 < 5; local914++) {
					@Pc(1154) int local1154 = this.anIntArray256[local914]++;
				}
				this.method666();
				super.anInt816++;
				if (super.anInt816 > 4500) {
					this.anInt860 = 250;
					super.anInt816 -= 500;
					this.aClass2_Sub1_Sub2_7.method68(82);
				}
				this.anInt958++;
				if (this.anInt958 > 500) {
					this.anInt958 = 0;
					local997 = (int) (Math.random() * 8.0D);
					if ((local997 & 0x1) == 1) {
						this.anInt844 += this.anInt845;
					}
					if ((local997 & 0x2) == 2) {
						this.anInt872 += this.anInt873;
					}
					if ((local997 & 0x4) == 4) {
						this.anInt1031 += this.anInt1032;
					}
				}
				if (this.anInt844 < -50) {
					this.anInt845 = 2;
				}
				if (this.anInt844 > 50) {
					this.anInt845 = -2;
				}
				if (this.anInt872 < -55) {
					this.anInt873 = 2;
				}
				if (this.anInt872 > 55) {
					this.anInt873 = -2;
				}
				if (this.anInt1031 < -40) {
					this.anInt1032 = 1;
				}
				if (this.anInt1031 > 40) {
					this.anInt1032 = -1;
				}
				this.anInt1030++;
				if (this.anInt1030 > 500) {
					this.anInt1030 = 0;
					local997 = (int) (Math.random() * 8.0D);
					if ((local997 & 0x1) == 1) {
						this.anInt966 += this.anInt967;
					}
					if ((local997 & 0x2) == 2) {
						this.anInt1014 += this.anInt1015;
					}
				}
				if (this.anInt966 < -60) {
					this.anInt967 = 2;
				}
				if (this.anInt966 > 60) {
					this.anInt967 = -2;
				}
				if (this.anInt1014 < -20) {
					this.anInt1015 = 1;
				}
				if (this.anInt1014 > 10) {
					this.anInt1015 = -1;
				}
				this.anInt859++;
				if (this.anInt859 > 50) {
					this.aClass2_Sub1_Sub2_7.method68(54);
				}
				try {
					if (this.aClass47_1 != null && this.aClass2_Sub1_Sub2_7.anInt123 > 0) {
						this.aClass47_1.method561(this.aClass2_Sub1_Sub2_7.anInt123, this.aClass2_Sub1_Sub2_7.aByteArray1);
						this.aClass2_Sub1_Sub2_7.anInt123 = 0;
						this.anInt859 = 0;
					}
				} catch (@Pc(1396) IOException local1396) {
					this.method591();
				} catch (@Pc(1401) Exception local1401) {
					this.method662();
				}
			}
		} catch (@Pc(1406) RuntimeException local1406) {
			signlink.reporterror("6545, " + false + ", " + local1406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(9) Class2_Sub2 local9 = null;
			for (@Pc(14) Class2_Sub2 local14 = (Class2_Sub2) this.aClass50_10.method569(); local14 != null; local14 = (Class2_Sub2) this.aClass50_10.method571()) {
				if (local14.anInt399 == arg7 && local14.anInt401 == arg6 && local14.anInt402 == arg1 && local14.anInt400 == arg2) {
					local9 = local14;
					break;
				}
			}
			if (local9 == null) {
				local9 = new Class2_Sub2();
				local9.anInt399 = arg7;
				local9.anInt400 = arg2;
				local9.anInt401 = arg6;
				local9.anInt402 = arg1;
				this.method722(local9, (byte) 3);
				this.aClass50_10.method566(local9);
			}
			local9.anInt403 = arg4;
			local9.anInt405 = arg8;
			local9.anInt404 = arg0;
			local9.anInt394 = arg3;
			local9.anInt398 = arg5;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("21427, " + -2633 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	@Override
	protected void method586(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt984 = arg1;
			this.aString25 = arg0;
			this.method687();
			if (this.aClass39_2 == null) {
				super.method586(arg0, arg1);
			} else {
				this.aClass49_5.method563();
				this.aClass2_Sub1_Sub3_Sub1_4.method149(54, 16777215, "RuneScape is loading - please wait...", 180);
				Class2_Sub1_Sub3.method389(62, 9179409, 28, 34, 304);
				Class2_Sub1_Sub3.method389(63, 0, 29, 32, 302);
				Class2_Sub1_Sub3.method388(9179409, 30, 64, arg1 * 3, 30);
				Class2_Sub1_Sub3.method388(0, arg1 * 3 + 30, 64, 300 - arg1 * 3, 30);
				this.aClass2_Sub1_Sub3_Sub1_4.method149(85, 16777215, arg0, 180);
				this.aClass49_5.method564(super.aGraphics2, 202, 171);
				if (this.aBoolean263) {
					this.aBoolean263 = false;
					if (!this.aBoolean223) {
						this.aClass49_6.method564(super.aGraphics2, 0, 0);
						this.aClass49_7.method564(super.aGraphics2, 637, 0);
					}
					this.aClass49_3.method564(super.aGraphics2, 128, 0);
					this.aClass49_4.method564(super.aGraphics2, 202, 371);
					this.aClass49_8.method564(super.aGraphics2, 0, 265);
					this.aClass49_9.method564(super.aGraphics2, 562, 265);
					this.aClass49_10.method564(super.aGraphics2, 128, 171);
					this.aClass49_11.method564(super.aGraphics2, 562, 171);
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("26193, " + arg0 + ", " + arg1 + ", " + 108 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method606(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt982; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt982--;
						this.aBoolean255 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt982; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass2_Sub1_Sub2_7.method68(12);
						this.aClass2_Sub1_Sub2_7.method75(this.anInt1053, arg0);
						break;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("52075, " + 291 + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method607() {
		try {
			this.aClass49_18.method563();
			Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray259;
			this.aClass2_Sub1_Sub3_Sub4_10.method400(0, 0);
			if (this.aBoolean238) {
				this.aClass2_Sub1_Sub3_Sub1_4.method149(40, 0, this.aString19, 239);
				this.aClass2_Sub1_Sub3_Sub1_4.method149(60, 128, this.aString17 + "*", 239);
			} else if (this.anInt1054 == 1) {
				this.aClass2_Sub1_Sub3_Sub1_4.method149(40, 0, "Enter amount:", 239);
				this.aClass2_Sub1_Sub3_Sub1_4.method149(60, 128, this.aString28 + "*", 239);
			} else if (this.anInt1054 == 2) {
				this.aClass2_Sub1_Sub3_Sub1_4.method149(40, 0, "Enter name:", 239);
				this.aClass2_Sub1_Sub3_Sub1_4.method149(60, 128, this.aString28 + "*", 239);
			} else {
				@Pc(125) Class2_Sub1_Sub3_Sub1 local125;
				@Pc(133) int local133;
				@Pc(144) int local144;
				if (this.anInt1054 == 3) {
					if (this.aString28 != this.aString22) {
						this.method671(this.aString28);
						this.aString22 = this.aString28;
					}
					local125 = this.aClass2_Sub1_Sub3_Sub1_3;
					Class2_Sub1_Sub3.method385(0, 0, 463, 77);
					for (local133 = 0; local133 < this.anInt906; local133++) {
						local144 = local133 * 14 + 18 - this.anInt907;
						if (local144 > 0 && local144 < 110) {
							local125.method149(local144, 0, this.aStringArray10[local133], 239);
						}
					}
					Class2_Sub1_Sub3.method384();
					if (this.anInt906 > 5) {
						this.method721(463, 0, this.aBoolean254, this.anInt907, this.anInt906 * 14 + 7, 77);
					}
					if (this.aString28.length() == 0) {
						this.aClass2_Sub1_Sub3_Sub1_4.method149(40, 255, "Enter object name", 239);
					} else if (this.anInt906 == 0) {
						this.aClass2_Sub1_Sub3_Sub1_4.method149(40, 0, "No matching objects found, please shorten search", 239);
					}
					local125.method149(90, 0, this.aString28 + "*", 239);
					Class2_Sub1_Sub3.method391(479, 0, 0, 77);
				} else if (this.aString31 != null) {
					this.aClass2_Sub1_Sub3_Sub1_4.method149(40, 0, this.aString31, 239);
					this.aClass2_Sub1_Sub3_Sub1_4.method149(60, 128, "Click to continue", 239);
				} else if (this.anInt965 != -1) {
					this.method642(0, 0, 0, Class10.method204(this.anInt965), this.aBoolean230);
				} else if (this.anInt1005 == -1) {
					local125 = this.aClass2_Sub1_Sub3_Sub1_3;
					local133 = 0;
					Class2_Sub1_Sub3.method385(0, 0, 463, 77);
					for (local144 = 0; local144 < 100; local144++) {
						if (this.aStringArray14[local144] != null) {
							@Pc(312) int local312 = this.anIntArray273[local144];
							@Pc(321) int local321 = this.anInt1016 + 70 - local133 * 14;
							@Pc(326) String local326 = this.aStringArray13[local144];
							@Pc(328) byte local328 = 0;
							if (local326 != null && local326.startsWith("@cr1@")) {
								local326 = local326.substring(5);
								local328 = 1;
							}
							if (local326 != null && local326.startsWith("@cr2@")) {
								local326 = local326.substring(5);
								local328 = 2;
							}
							if (local312 == 0) {
								if (local321 > 0 && local321 < 110) {
									local125.method153(local321, this.aStringArray14[local144], 4, 0);
								}
								local133++;
							}
							@Pc(398) int local398;
							if ((local312 == 1 || local312 == 2) && (local312 == 1 || this.anInt1043 == 0 || this.anInt1043 == 1 && this.method680((byte) 7, local326))) {
								if (local321 > 0 && local321 < 110) {
									local398 = 4;
									if (local328 == 1) {
										this.aClass2_Sub1_Sub3_Sub4Array2[0].method400(local321 - 12, 4);
										local398 += 14;
									}
									if (local328 == 2) {
										this.aClass2_Sub1_Sub3_Sub4Array2[1].method400(local321 - 12, local398);
										local398 += 14;
									}
									local125.method153(local321, local326 + ":", local398, 0);
									local398 += local125.method151(local326) + 8;
									local125.method153(local321, this.aStringArray14[local144], local398, 255);
								}
								local133++;
							}
							if ((local312 == 3 || local312 == 7) && this.anInt1023 == 0 && (local312 == 7 || this.anInt961 == 0 || this.anInt961 == 1 && this.method680((byte) 7, local326))) {
								if (local321 > 0 && local321 < 110) {
									local125.method153(local321, "From", 4, 0);
									local398 = local125.method151("From ") + 4;
									if (local328 == 1) {
										this.aClass2_Sub1_Sub3_Sub4Array2[0].method400(local321 - 12, local398);
										local398 += 14;
									}
									if (local328 == 2) {
										this.aClass2_Sub1_Sub3_Sub4Array2[1].method400(local321 - 12, local398);
										local398 += 14;
									}
									local125.method153(local321, local326 + ":", local398, 0);
									local398 += local125.method151(local326) + 8;
									local125.method153(local321, this.aStringArray14[local144], local398, 8388608);
								}
								local133++;
							}
							if (local312 == 4 && (this.anInt1035 == 0 || this.anInt1035 == 1 && this.method680((byte) 7, local326))) {
								if (local321 > 0 && local321 < 110) {
									local125.method153(local321, local326 + " " + this.aStringArray14[local144], 4, 8388736);
								}
								local133++;
							}
							if (local312 == 5 && this.anInt1023 == 0 && this.anInt961 < 2) {
								if (local321 > 0 && local321 < 110) {
									local125.method153(local321, this.aStringArray14[local144], 4, 8388608);
								}
								local133++;
							}
							if (local312 == 6 && this.anInt1023 == 0 && this.anInt961 < 2) {
								if (local321 > 0 && local321 < 110) {
									local125.method153(local321, "To " + local326 + ":", 4, 0);
									local125.method153(local321, this.aStringArray14[local144], local125.method151("To " + local326) + 12, 8388608);
								}
								local133++;
							}
							if (local312 == 8 && (this.anInt1035 == 0 || this.anInt1035 == 1 && this.method680((byte) 7, local326))) {
								if (local321 > 0 && local321 < 110) {
									local125.method153(local321, local326 + " " + this.aStringArray14[local144], 4, 8270336);
								}
								local133++;
							}
						}
					}
					Class2_Sub1_Sub3.method384();
					this.anInt977 = local133 * 14 + 7;
					if (this.anInt977 < 78) {
						this.anInt977 = 78;
					}
					this.method721(463, 0, this.aBoolean254, this.anInt977 - this.anInt1016 - 77, this.anInt977, 77);
					@Pc(769) String local769;
					if (aClass2_Sub1_Sub1_Sub1_Sub2_1 == null || aClass2_Sub1_Sub1_Sub1_Sub2_1.aString11 == null) {
						local769 = Class19.method235(this.aString26);
					} else {
						local769 = aClass2_Sub1_Sub1_Sub1_Sub2_1.aString11;
					}
					local125.method153(90, local769 + ":", 4, 0);
					local125.method153(90, this.aString21 + "*", local125.method151(local769 + ": ") + 6, 255);
					Class2_Sub1_Sub3.method391(479, 0, 0, 77);
				} else {
					this.method642(0, 0, 0, Class10.method204(this.anInt1005), this.aBoolean230);
				}
			}
			if (this.aBoolean236 && this.anInt901 == 2) {
				this.method618();
			}
			this.aClass49_18.method564(super.aGraphics2, 17, 357);
			this.aClass49_17.method563();
			Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
		} catch (@Pc(855) RuntimeException local855) {
			signlink.reporterror("98970, " + false + ", " + local855.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method608() {
		try {
			@Pc(23) int local23;
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(44) int local44;
			@Pc(92) int local92;
			@Pc(106) int local106;
			@Pc(118) int local118;
			@Pc(177) int local177;
			try {
				this.anInt1060 = -1;
				this.aClass50_11.method573();
				this.aClass50_12.method573();
				Class2_Sub1_Sub3_Sub3.method365();
				this.method658(this.aBoolean253);
				this.aClass27_1.method297();
				System.gc();
				for (local23 = 0; local23 < 4; local23++) {
					this.aClass30Array1[local23].method437();
				}
				for (local36 = 0; local36 < 4; local36++) {
					for (local40 = 0; local40 < 104; local40++) {
						for (local44 = 0; local44 < 104; local44++) {
							this.aByteArrayArrayArray8[local36][local40][local44] = 0;
						}
					}
				}
				@Pc(78) Class29 local78 = new Class29(this.aByteArrayArrayArray8, this.anIntArrayArrayArray7, 104, 216, 104);
				local44 = this.aByteArrayArray6.length;
				this.aClass2_Sub1_Sub2_7.method68(54);
				@Pc(240) int local240;
				@Pc(228) int local228;
				if (!this.aBoolean218) {
					@Pc(123) byte[] local123;
					for (local92 = 0; local92 < local44; local92++) {
						local106 = (this.anIntArray269[local92] >> 8) * 64 - this.anInt922;
						local118 = (this.anIntArray269[local92] & 0xFF) * 64 - this.anInt923;
						local123 = this.aByteArrayArray6[local92];
						if (local123 != null) {
							local78.method417(local123, (this.anInt847 - 6) * 8, (this.anInt846 - 6) * 8, this.aClass30Array1, local106, local118);
						}
					}
					for (local106 = 0; local106 < local44; local106++) {
						local118 = (this.anIntArray269[local106] >> 8) * 64 - this.anInt922;
						local177 = (this.anIntArray269[local106] & 0xFF) * 64 - this.anInt923;
						@Pc(182) byte[] local182 = this.aByteArrayArray6[local106];
						if (local182 == null && this.anInt847 < 800) {
							local78.method416(64, 64, local177, local118, this.aBoolean232);
						}
					}
					this.aClass2_Sub1_Sub2_7.method68(54);
					for (local118 = 0; local118 < local44; local118++) {
						local123 = this.aByteArrayArray5[local118];
						if (local123 != null) {
							local228 = (this.anIntArray269[local118] >> 8) * 64 - this.anInt922;
							local240 = (this.anIntArray269[local118] & 0xFF) * 64 - this.anInt923;
							local78.method418(local240, local228, this.aClass27_1, local123, this.aClass30Array1);
						}
					}
				}
				if (this.aBoolean218) {
					local92 = 0;
					label254: while (true) {
						@Pc(295) int local295;
						@Pc(301) int local301;
						@Pc(307) int local307;
						@Pc(317) int local317;
						@Pc(319) int local319;
						if (local92 >= 4) {
							for (local106 = 0; local106 < 13; local106++) {
								for (local118 = 0; local118 < 13; local118++) {
									local177 = this.anIntArrayArrayArray8[0][local106][local118];
									if (local177 == -1) {
										local78.method416(8, 8, local118 * 8, local106 * 8, this.aBoolean232);
									}
								}
							}
							this.aClass2_Sub1_Sub2_7.method68(54);
							local118 = 0;
							while (true) {
								if (local118 >= 4) {
									break label254;
								}
								for (local177 = 0; local177 < 13; local177++) {
									for (local228 = 0; local228 < 13; local228++) {
										local240 = this.anIntArrayArrayArray8[local118][local177][local228];
										if (local240 != -1) {
											local295 = local240 >> 24 & 0x3;
											local301 = local240 >> 1 & 0x3;
											local307 = local240 >> 14 & 0x3FF;
											local317 = local240 >> 3 & 0x7FF;
											local319 = (local307 / 8 << 8) + local317 / 8;
											for (@Pc(500) int local500 = 0; local500 < this.anIntArray269.length; local500++) {
												if (this.anIntArray269[local500] == local319 && this.aByteArrayArray5[local500] != null) {
													local78.method430((local317 & 0x7) * 8, local228 * 8, this.aClass27_1, local301, local118, this.aClass30Array1, (local307 & 0x7) * 8, this.aByteArrayArray5[local500], local295, local177 * 8);
													break;
												}
											}
										}
									}
								}
								local118++;
							}
						}
						for (local106 = 0; local106 < 13; local106++) {
							for (local118 = 0; local118 < 13; local118++) {
								@Pc(271) boolean local271 = false;
								local228 = this.anIntArrayArrayArray8[local92][local106][local118];
								if (local228 != -1) {
									local240 = local228 >> 24 & 0x3;
									local295 = local228 >> 1 & 0x3;
									local301 = local228 >> 14 & 0x3FF;
									local307 = local228 >> 3 & 0x7FF;
									local317 = (local301 / 8 << 8) + local307 / 8;
									for (local319 = 0; local319 < this.anIntArray269.length; local319++) {
										if (this.anIntArray269[local319] == local317 && this.aByteArrayArray6[local319] != null) {
											local78.method421(local295, (local301 & 0x7) * 8, local118 * 8, local92, this.aByteArrayArray6[local319], this.aClass30Array1, local106 * 8, (local307 & 0x7) * 8, local240, this.anInt849);
											local271 = true;
											break;
										}
									}
								}
								if (!local271) {
									local78.method415(local106 * 8, local92, local118 * 8);
								}
							}
						}
						local92++;
					}
				}
				this.aClass2_Sub1_Sub2_7.method68(54);
				local78.method428(this.aClass27_1, this.aClass30Array1, this.anInt1050);
				if (this.aClass49_17 != null) {
					this.aClass49_17.method563();
					Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
				}
				this.aClass2_Sub1_Sub2_7.method68(54);
				local92 = Class29.anInt609;
				if (local92 > this.anInt876) {
					local92 = this.anInt876;
				}
				if (local92 < this.anInt876 - 1) {
					local92 = this.anInt876 - 1;
				}
				if (aBoolean244) {
					this.aClass27_1.method298(Class29.anInt609);
				} else {
					this.aClass27_1.method298(0);
				}
				for (local106 = 0; local106 < 104; local106++) {
					for (local118 = 0; local118 < 104; local118++) {
						this.method647(local106, local118);
					}
				}
				this.method685();
			} catch (@Pc(650) Exception local650) {
			}
			Class46.aClass31_8.method451();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass2_Sub1_Sub2_7.method68(120);
				this.aClass2_Sub1_Sub2_7.method73(1057001181);
			}
			if (aBoolean244 && signlink.aRandomAccessFile3 != null) {
				local23 = this.aClass5_Sub1_1.method176(0);
				for (local36 = 0; local36 < local23; local36++) {
					local40 = this.aClass5_Sub1_1.method175(local36);
					if ((local40 & 0x79) == 0) {
						Class2_Sub1_Sub1_Sub6.method511(local36);
					}
				}
			}
			System.gc();
			Class2_Sub1_Sub3_Sub3.method366();
			this.aClass5_Sub1_1.method186((byte) 4);
			this.aBoolean227 &= true;
			local23 = (this.anInt846 - 6) / 8 - 1;
			local36 = (this.anInt846 + 6) / 8 + 1;
			local40 = (this.anInt847 - 6) / 8 - 1;
			local44 = (this.anInt847 + 6) / 8 + 1;
			if (this.aBoolean229) {
				local23 = 49;
				local36 = 50;
				local40 = 49;
				local44 = 50;
			}
			for (local92 = local23; local92 <= local36; local92++) {
				for (local106 = local40; local106 <= local44; local106++) {
					if (local92 == local23 || local92 == local36 || local106 == local40 || local106 == local44) {
						local118 = this.aClass5_Sub1_1.method183(local92, 0, local106);
						if (local118 != -1) {
							this.aClass5_Sub1_1.method187(3, local118);
						}
						local177 = this.aClass5_Sub1_1.method183(local92, 1, local106);
						if (local177 != -1) {
							this.aClass5_Sub1_1.method187(3, local177);
						}
					}
				}
			}
		} catch (@Pc(820) RuntimeException local820) {
			signlink.reporterror("29187, " + true + ", " + local820.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method609() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt864; local3++) {
				if (this.anIntArray226[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray242[local3] != this.anInt855 || this.anIntArray276[local3] != this.anInt938) {
							@Pc(45) Class2_Sub1_Sub2 local45 = Class21.method249(this.anIntArray276[local3], this.anIntArray242[local3], 110);
							if (System.currentTimeMillis() + (long) (local45.anInt123 / 22) > this.aLong33 + (long) (this.anInt978 / 22)) {
								this.anInt978 = local45.anInt123;
								this.aLong33 = System.currentTimeMillis();
								if (this.method667(local45.anInt123, local45.aByteArray1)) {
									this.anInt855 = this.anIntArray242[local3];
									this.anInt938 = this.anIntArray276[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method679()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
						if (signlink.reporterror) {
							this.aClass2_Sub1_Sub2_7.method68(156);
							this.aClass2_Sub1_Sub2_7.method70(this.anIntArray242[local3] & 0x7FFF);
						} else {
							this.aClass2_Sub1_Sub2_7.method68(156);
							this.aClass2_Sub1_Sub2_7.method70(-1);
						}
					}
					if (local12 && this.anIntArray226[local3] != -5) {
						this.anIntArray226[local3] = -5;
					} else {
						this.anInt864--;
						for (@Pc(138) int local138 = local3; local138 < this.anInt864; local138++) {
							this.anIntArray242[local138] = this.anIntArray242[local138 + 1];
							this.anIntArray276[local138] = this.anIntArray276[local138 + 1];
							this.anIntArray226[local138] = this.anIntArray226[local138 + 1];
						}
						local3--;
					}
				} else {
					@Pc(190) int local190 = this.anIntArray226[local3]--;
				}
			}
			if (this.anInt1061 > 0) {
				this.anInt1061 -= 20;
				if (this.anInt1061 < 0) {
					this.anInt1061 = 0;
				}
				if (this.anInt1061 == 0 && this.aBoolean258 && !aBoolean244) {
					this.anInt889 = this.anInt908;
					this.aBoolean234 = true;
					this.aClass5_Sub1_1.method173(2, this.anInt889);
					return;
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("66969, " + -95 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
				if (this.aStringArray14[local8] != null) {
					@Pc(20) int local20 = this.anIntArray273[local8];
					@Pc(31) int local31 = this.anInt1016 + 70 + 4 - local6 * 14;
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
					if ((local20 == 1 || local20 == 2) && (local20 == 1 || this.anInt1043 == 0 || this.anInt1043 == 1 && this.method680((byte) 7, local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31 && !local39.equals(aClass2_Sub1_Sub1_Sub1_Sub2_1.aString11)) {
							if (this.anInt874 >= 1) {
								this.aStringArray11[this.anInt909] = "Report abuse @whi@" + local39;
								this.anIntArray221[this.anInt909] = 414;
								this.anInt909++;
							}
							this.aStringArray11[this.anInt909] = "Add ignore @whi@" + local39;
							this.anIntArray221[this.anInt909] = 872;
							this.anInt909++;
							this.aStringArray11[this.anInt909] = "Add friend @whi@" + local39;
							this.anIntArray221[this.anInt909] = 106;
							this.anInt909++;
						}
						local6++;
					}
					if ((local20 == 3 || local20 == 7) && this.anInt1023 == 0 && (local20 == 7 || this.anInt961 == 0 || this.anInt961 == 1 && this.method680((byte) 7, local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31) {
							if (this.anInt874 >= 1) {
								this.aStringArray11[this.anInt909] = "Report abuse @whi@" + local39;
								this.anIntArray221[this.anInt909] = 414;
								this.anInt909++;
							}
							this.aStringArray11[this.anInt909] = "Add ignore @whi@" + local39;
							this.anIntArray221[this.anInt909] = 872;
							this.anInt909++;
							this.aStringArray11[this.anInt909] = "Add friend @whi@" + local39;
							this.anIntArray221[this.anInt909] = 106;
							this.anInt909++;
						}
						local6++;
					}
					if (local20 == 4 && (this.anInt1035 == 0 || this.anInt1035 == 1 && this.method680((byte) 7, local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31) {
							this.aStringArray11[this.anInt909] = "Accept trade @whi@" + local39;
							this.anIntArray221[this.anInt909] = 416;
							this.anInt909++;
						}
						local6++;
					}
					if ((local20 == 5 || local20 == 6) && this.anInt1023 == 0 && this.anInt961 < 2) {
						local6++;
					}
					if (local20 == 8 && (this.anInt1035 == 0 || this.anInt1035 == 1 && this.method680((byte) 7, local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31) {
							this.aStringArray11[this.anInt909] = "Accept challenge @whi@" + local39;
							this.anIntArray221[this.anInt909] = 918;
							this.anInt909++;
						}
						local6++;
					}
				}
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("86709, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method611() {
		try {
			@Pc(7) int local7 = this.aClass2_Sub1_Sub3_Sub1_4.method151("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt909; local9++) {
				local20 = this.aClass2_Sub1_Sub3_Sub1_4.method151(this.aStringArray11[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt909 * 15 + 21;
			@Pc(72) int local72;
			@Pc(90) int local90;
			if (super.anInt824 > 4 && super.anInt825 > 4 && super.anInt824 < 516 && super.anInt825 < 338) {
				local72 = super.anInt824 - local7 / 2 - 4;
				if (local72 + local7 > 512) {
					local72 = 512 - local7;
				}
				if (local72 < 0) {
					local72 = 0;
				}
				local90 = super.anInt825 - 4;
				if (local90 + local20 > 334) {
					local90 = 334 - local20;
				}
				if (local90 < 0) {
					local90 = 0;
				}
				this.aBoolean236 = true;
				this.anInt901 = 0;
				this.anInt902 = local72;
				this.anInt903 = local90;
				this.anInt904 = local7;
				this.anInt905 = this.anInt909 * 15 + 22;
			}
			if (super.anInt824 > 553 && super.anInt825 > 205 && super.anInt824 < 743 && super.anInt825 < 466) {
				local72 = super.anInt824 - local7 / 2 - 553;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local7 > 190) {
					local72 = 190 - local7;
				}
				local90 = super.anInt825 - 205;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local20 > 261) {
					local90 = 261 - local20;
				}
				this.aBoolean236 = true;
				this.anInt901 = 1;
				this.anInt902 = local72;
				this.anInt903 = local90;
				this.anInt904 = local7;
				this.anInt905 = this.anInt909 * 15 + 22;
			}
			if (super.anInt824 > 17 && super.anInt825 > 357 && super.anInt824 < 496 && super.anInt825 < 453) {
				local72 = super.anInt824 - local7 / 2 - 17;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local7 > 479) {
					local72 = 479 - local7;
				}
				local90 = super.anInt825 - 357;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local20 > 96) {
					local90 = 96 - local20;
				}
				this.aBoolean236 = true;
				this.anInt901 = 2;
				this.anInt902 = local72;
				this.anInt903 = local90;
				this.anInt904 = local7;
				this.anInt905 = this.anInt909 * 15 + 22;
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("83245, " + 0 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!BFQIDHPO;)V")
	private void method612(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		try {
			this.anInt1020 = 0;
			this.anInt914 = 0;
			this.method690(arg0, arg1);
			this.method655(arg0, arg1);
			this.method684(arg0, arg1, this.aByte42);
			this.method617(arg0, arg1);
			@Pc(44) int local44;
			for (@Pc(37) int local37 = 0; local37 < this.anInt1020; local37++) {
				local44 = this.anIntArray267[local37];
				if (this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local44].anInt327 != anInt1013) {
					this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local44] = null;
				}
			}
			if (arg1.anInt123 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt123 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local44 = 0; local44 < this.anInt913; local44++) {
				if (this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray240[local44]] == null) {
					signlink.reporterror(this.aString26 + " null entry in pl list - pos:" + local44 + " size:" + this.anInt913);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("73031, " + arg0 + ", " + 22847 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!BFQIDHPO;I)V")
	private void method613(@OriginalArg(1) Class2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method89();
			@Pc(19) int local19 = arg0.method90(8);
			@Pc(25) int local25;
			if (local19 < this.anInt983) {
				for (local25 = local19; local25 < this.anInt983; local25++) {
					this.anIntArray267[this.anInt1020++] = this.anIntArray264[local25];
				}
			}
			if (local19 > this.anInt983) {
				signlink.reporterror(this.aString26 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt983 = 0;
			for (local25 = 0; local25 < local19; local25++) {
				@Pc(77) int local77 = this.anIntArray264[local25];
				@Pc(82) Class2_Sub1_Sub1_Sub1_Sub1 local82 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local77];
				@Pc(87) int local87 = arg0.method90(1);
				if (local87 == 0) {
					this.anIntArray264[this.anInt983++] = local77;
					local82.anInt327 = anInt1013;
				} else {
					@Pc(110) int local110 = arg0.method90(2);
					if (local110 == 0) {
						this.anIntArray264[this.anInt983++] = local77;
						local82.anInt327 = anInt1013;
						this.anIntArray241[this.anInt914++] = local77;
					} else {
						@Pc(161) int local161;
						@Pc(172) int local172;
						if (local110 == 1) {
							this.anIntArray264[this.anInt983++] = local77;
							local82.anInt327 = anInt1013;
							local161 = arg0.method90(3);
							local82.method219(local161, this.aByte41, false);
							local172 = arg0.method90(1);
							if (local172 == 1) {
								this.anIntArray241[this.anInt914++] = local77;
							}
						} else if (local110 == 2) {
							this.anIntArray264[this.anInt983++] = local77;
							local82.anInt327 = anInt1013;
							local161 = arg0.method90(3);
							local82.method219(local161, this.aByte41, true);
							local172 = arg0.method90(3);
							local82.method219(local172, this.aByte41, true);
							@Pc(232) int local232 = arg0.method90(1);
							if (local232 == 1) {
								this.anIntArray241[this.anInt914++] = local77;
							}
						} else if (local110 == 3) {
							this.anIntArray267[this.anInt1020++] = local77;
						}
					}
				}
			}
		} catch (@Pc(269) RuntimeException local269) {
			signlink.reporterror("11782, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local269.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NDGQUJMA;II)V")
	private void method615(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(13) int local13 = arg2 * arg2 + arg0 * arg0;
			if (local13 > 4225 && local13 < 90000) {
				@Pc(27) int local27 = this.anInt969 + this.anInt966 & 0x7FF;
				@Pc(31) int local31 = Class2_Sub1_Sub1_Sub6.anIntArray179[local27];
				@Pc(35) int local35 = Class2_Sub1_Sub1_Sub6.anIntArray180[local27];
				@Pc(44) int local44 = local31 * 256 / (this.anInt1014 + 256);
				@Pc(53) int local53 = local35 * 256 / (this.anInt1014 + 256);
				@Pc(63) int local63 = arg0 * local44 + arg2 * local53 >> 16;
				@Pc(73) int local73 = arg0 * local53 - arg2 * local44 >> 16;
				@Pc(79) double local79 = Math.atan2((double) local63, (double) local73);
				@Pc(85) int local85 = (int) (Math.sin(local79) * 63.0D);
				@Pc(91) int local91 = (int) (Math.cos(local79) * 57.0D);
				this.aClass2_Sub1_Sub3_Sub2_9.method282(83 - local91 - 20, local79, local85 + 94 + 4 - 10);
			} else {
				this.method636(arg2, arg1, arg0);
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("99903, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method616() {
		try {
			if (super.anInt823 == 1) {
				if (super.anInt824 >= 6 && super.anInt824 <= 106 && super.anInt825 >= 467 && super.anInt825 <= 499) {
					this.anInt1043 = (this.anInt1043 + 1) % 4;
					this.aBoolean257 = true;
					this.aBoolean224 = true;
					this.aClass2_Sub1_Sub2_7.method68(83);
					this.aClass2_Sub1_Sub2_7.method69(this.anInt1043);
					this.aClass2_Sub1_Sub2_7.method69(this.anInt961);
					this.aClass2_Sub1_Sub2_7.method69(this.anInt1035);
				}
				if (super.anInt824 >= 135 && super.anInt824 <= 235 && super.anInt825 >= 467 && super.anInt825 <= 499) {
					this.anInt961 = (this.anInt961 + 1) % 3;
					this.aBoolean257 = true;
					this.aBoolean224 = true;
					this.aClass2_Sub1_Sub2_7.method68(83);
					this.aClass2_Sub1_Sub2_7.method69(this.anInt1043);
					this.aClass2_Sub1_Sub2_7.method69(this.anInt961);
					this.aClass2_Sub1_Sub2_7.method69(this.anInt1035);
				}
				if (super.anInt824 >= 273 && super.anInt824 <= 373 && super.anInt825 >= 467 && super.anInt825 <= 499) {
					this.anInt1035 = (this.anInt1035 + 1) % 3;
					this.aBoolean257 = true;
					this.aBoolean224 = true;
					this.aClass2_Sub1_Sub2_7.method68(83);
					this.aClass2_Sub1_Sub2_7.method69(this.anInt1043);
					this.aClass2_Sub1_Sub2_7.method69(this.anInt961);
					this.aClass2_Sub1_Sub2_7.method69(this.anInt1035);
				}
				if (super.anInt824 >= 412 && super.anInt824 <= 512 && super.anInt825 >= 467 && super.anInt825 <= 499) {
					if (this.anInt976 == -1) {
						this.method693();
						this.aString30 = "";
						this.aBoolean237 = false;
						this.anInt937 = this.anInt976 = Class10.anInt247;
						return;
					}
					this.method626("", "Please close the interface you have open before using 'report abuse'", 0, this.anInt916);
					return;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("60432, " + -97 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BFQIDHPO;Z)V")
	private void method617(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			this.aBoolean227 &= true;
			for (@Pc(7) int local7 = 0; local7 < this.anInt914; local7++) {
				@Pc(14) int local14 = this.anIntArray241[local7];
				@Pc(19) Class2_Sub1_Sub1_Sub1_Sub2 local19 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local14];
				@Pc(22) int local22 = arg1.method79();
				if ((local22 & 0x20) != 0) {
					local22 += arg1.method79() << 8;
				}
				this.method710(local19, local14, local22, arg1);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("66777, " + arg0 + ", " + arg1 + ", " + true + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method618() {
		try {
			@Pc(2) int local2 = this.anInt902;
			@Pc(5) int local5 = this.anInt903;
			@Pc(8) int local8 = this.anInt904;
			@Pc(11) int local11 = this.anInt905;
			Class2_Sub1_Sub3.method388(6116423, local2, local5, local8, local11);
			Class2_Sub1_Sub3.method388(0, local2 + 1, local5 + 1, local8 - 2, 16);
			Class2_Sub1_Sub3.method389(local5 + 18, 0, local2 + 1, local11 - 19, local8 - 2);
			this.aClass2_Sub1_Sub3_Sub1_4.method153(local5 + 14, "Choose Option", local2 + 3, 6116423);
			@Pc(63) int local63 = super.anInt818;
			@Pc(66) int local66 = super.anInt819;
			if (this.anInt901 == 0) {
				local63 -= 4;
				local66 -= 4;
			}
			if (this.anInt901 == 1) {
				local63 -= 553;
				local66 -= 205;
			}
			if (this.anInt901 == 2) {
				local63 -= 17;
				local66 -= 357;
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt909; local85++) {
				@Pc(100) int local100 = local5 + (this.anInt909 - 1 - local85) * 15 + 31;
				@Pc(102) int local102 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local100 - 13 && local66 < local100 + 3) {
					local102 = 16776960;
				}
				this.aClass2_Sub1_Sub3_Sub1_4.method157(true, local100, local2 + 3, local102, this.aStringArray11[local85]);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("30461, " + 31290 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIIIII)V")
	private void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg3 >= 1 && arg4 >= 1 && arg3 <= 102 && arg4 <= 102) {
				if (aBoolean244 && arg2 != this.anInt876) {
					return;
				}
				@Pc(27) int local27 = 0;
				if (arg1 == 0) {
					local27 = this.aClass27_1.method323(arg2, arg3, arg4);
				}
				if (arg1 == 1) {
					local27 = this.aClass27_1.method324(arg2, arg3, arg4);
				}
				if (arg1 == 2) {
					local27 = this.aClass27_1.method325(arg2, arg3, arg4);
				}
				if (arg1 == 3) {
					local27 = this.aClass27_1.method326(arg2, arg3, arg4);
				}
				@Pc(83) int local83;
				if (local27 != 0) {
					local83 = this.aClass27_1.method327(arg2, arg3, arg4, local27);
					@Pc(89) int local89 = local27 >> 14 & 0x7FFF;
					@Pc(93) int local93 = local83 & 0x1F;
					@Pc(97) int local97 = local83 >> 6;
					@Pc(110) Class46 local110;
					if (arg1 == 0) {
						this.aClass27_1.method314(this.aBoolean239, arg4, arg3, arg2);
						local110 = Class46.method546(local89);
						if (local110.aBoolean202) {
							this.aClass30Array1[arg2].method442(local93, arg3, arg4, local110.aBoolean196, local97);
						}
					}
					if (arg1 == 1) {
						this.aClass27_1.method315(arg2, arg3, arg4);
					}
					if (arg1 == 2) {
						this.aClass27_1.method316(arg4, arg3, arg2);
						local110 = Class46.method546(local89);
						if (arg3 + local110.anInt783 > 103 || arg4 + local110.anInt783 > 103 || arg3 + local110.anInt789 > 103 || arg4 + local110.anInt789 > 103) {
							return;
						}
						if (local110.aBoolean202) {
							this.aClass30Array1[arg2].method443(local110.anInt789, local110.anInt783, local97, arg4, arg3, local110.aBoolean196);
						}
					}
					if (arg1 == 3) {
						this.aClass27_1.method317(arg4, arg3, arg2);
						local110 = Class46.method546(local89);
						if (local110.aBoolean202 && local110.aBoolean195) {
							this.aClass30Array1[arg2].method445(arg3, arg4);
						}
					}
				}
				if (arg5 >= 0) {
					local83 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray8[1][arg3][arg4] & 0x2) == 2) {
						local83 = arg2 + 1;
					}
					Class29.method426(local83, arg2, this.anIntArrayArrayArray7, arg5, arg0, arg4, arg6, arg3, this.aClass30Array1[arg2], this.aClass27_1);
					return;
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("14393, " + arg0 + ", " + arg1 + ", " + -28 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
	private int method621() {
		try {
			if (this.anInt973 != 2531) {
				this.method579();
			}
			@Pc(9) int local9 = 3;
			if (this.anInt1010 < 310) {
				anInt926++;
				if (anInt926 > 143) {
					anInt926 = 0;
					this.aClass2_Sub1_Sub2_7.method68(60);
					this.aClass2_Sub1_Sub2_7.method69(254);
				}
				@Pc(36) int local36 = this.anInt1007 >> 7;
				@Pc(41) int local41 = this.anInt1009 >> 7;
				@Pc(46) int local46 = aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 >> 7;
				@Pc(51) int local51 = aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt876][local36][local41] & 0x4) != 0) {
					local9 = this.anInt876;
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
						if ((this.aByteArrayArrayArray8[this.anInt876][local36][local41] & 0x4) != 0) {
							local9 = this.anInt876;
						}
						local103 += local101;
						if (local103 >= 65536) {
							local103 -= 65536;
							if (local41 < local51) {
								local41++;
							} else if (local41 > local51) {
								local41--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt876][local36][local41] & 0x4) != 0) {
								local9 = this.anInt876;
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
						if ((this.aByteArrayArrayArray8[this.anInt876][local36][local41] & 0x4) != 0) {
							local9 = this.anInt876;
						}
						local103 += local101;
						if (local103 >= 65536) {
							local103 -= 65536;
							if (local36 < local46) {
								local36++;
							} else if (local36 > local46) {
								local36--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt876][local36][local41] & 0x4) != 0) {
								local9 = this.anInt876;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt876][aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 >> 7][aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 >> 7] & 0x4) != 0) {
				local9 = this.anInt876;
			}
			return local9;
		} catch (@Pc(269) RuntimeException local269) {
			signlink.reporterror("33581, " + 2531 + ", " + local269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)I")
	private int method622() {
		try {
			@Pc(18) int local18 = this.method624(this.anInt1009, this.anInt876, this.anInt1007);
			return local18 - this.anInt1008 >= 800 || (this.aByteArrayArrayArray8[this.anInt876][this.anInt1007 >> 7][this.anInt1009 >> 7] & 0x4) == 0 ? 3 : this.anInt876;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("13353, " + false + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method623(@OriginalArg(1) boolean arg0) {
		try {
			this.method687();
			this.aClass49_5.method563();
			this.aClass2_Sub1_Sub3_Sub4_6.method400(0, 0);
			@Pc(54) byte local54;
			@Pc(66) int local66;
			if (this.anInt895 == 0) {
				this.aClass2_Sub1_Sub3_Sub1_2.method150(true, this.aClass5_Sub1_1.aString3, 7711145, 180, 180);
				local54 = 80;
				this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "Welcome to RuneScape", 16776960, 80, 180);
				local66 = local54 + 30;
				this.aClass2_Sub1_Sub3_Sub4_7.method400(100, 27);
				this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "New User", 16777215, 125, 100);
				this.aClass2_Sub1_Sub3_Sub4_7.method400(100, 187);
				this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "Existing User", 16777215, 125, 260);
			}
			if (this.anInt895 == 2) {
				local54 = 60;
				if (this.aString23.length() > 0) {
					this.aClass2_Sub1_Sub3_Sub1_4.method150(true, this.aString23, 16776960, 45, 180);
					this.aClass2_Sub1_Sub3_Sub1_4.method150(true, this.aString24, 16776960, 60, 180);
					local66 = local54 + 30;
				} else {
					this.aClass2_Sub1_Sub3_Sub1_4.method150(true, this.aString24, 16776960, 53, 180);
					local66 = local54 + 30;
				}
				this.aClass2_Sub1_Sub3_Sub1_4.method157(true, 90, 90, 16777215, "Username: " + this.aString26 + (this.anInt842 == 0 & anInt1013 % 40 < 20 ? "@yel@|" : ""));
				local66 += 15;
				this.aClass2_Sub1_Sub3_Sub1_4.method157(true, 105, 92, 16777215, "Password: " + Class19.method236(this.aString27) + (this.anInt842 == 1 & anInt1013 % 40 < 20 ? "@yel@|" : ""));
				local66 += 15;
				if (!arg0) {
					this.aClass2_Sub1_Sub3_Sub4_7.method400(130, 27);
					this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "Login", 16777215, 155, 100);
					this.aClass2_Sub1_Sub3_Sub4_7.method400(130, 187);
					this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "Cancel", 16777215, 155, 260);
				}
			}
			if (this.anInt895 == 3) {
				this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "Create a free account", 16776960, 40, 180);
				local54 = 65;
				this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "To create a new account you need to", 16777215, 65, 180);
				local66 = local54 + 15;
				this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "go back to the main RuneScape webpage", 16777215, 80, 180);
				local66 += 15;
				this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "and choose the 'create account'", 16777215, 95, 180);
				local66 += 15;
				this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "button near the top of that page.", 16777215, 110, 180);
				local66 += 15;
				this.aClass2_Sub1_Sub3_Sub4_7.method400(130, 107);
				this.aClass2_Sub1_Sub3_Sub1_4.method150(true, "Cancel", 16777215, 155, 180);
			}
			this.aClass49_5.method564(super.aGraphics2, 202, 171);
			if (this.aBoolean263) {
				this.aBoolean263 = false;
				this.aClass49_3.method564(super.aGraphics2, 128, 0);
				this.aClass49_4.method564(super.aGraphics2, 202, 371);
				this.aClass49_8.method564(super.aGraphics2, 0, 265);
				this.aClass49_9.method564(super.aGraphics2, 562, 265);
				this.aClass49_10.method564(super.aGraphics2, 128, 171);
				this.aClass49_11.method564(super.aGraphics2, 562, 171);
			}
		} catch (@Pc(499) RuntimeException local499) {
			signlink.reporterror("43089, " + 356 + ", " + arg0 + ", " + local499.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			@Pc(41) int local41 = arg2 & 0x7F;
			@Pc(45) int local45 = arg0 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(110) int local110 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local110 * local45 >> 7;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("25490, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method625() {
		try {
			for (@Pc(13) int local13 = -1; local13 < this.anInt913; local13++) {
				@Pc(21) int local21;
				if (local13 == -1) {
					local21 = this.anInt912;
				} else {
					local21 = this.anIntArray240[local13];
				}
				@Pc(33) Class2_Sub1_Sub1_Sub1_Sub2 local33 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local21];
				if (local33 != null) {
					this.method695(1, local33);
				}
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("54692, " + 8 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	private void method626(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 == 0 && this.anInt1005 != -1) {
				this.aString31 = arg1;
				super.anInt823 = 0;
			}
			if (this.anInt965 == -1) {
				this.aBoolean224 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray273[local20] = this.anIntArray273[local20 - 1];
				this.aStringArray13[local20] = this.aStringArray13[local20 - 1];
				this.aStringArray14[local20] = this.aStringArray14[local20 - 1];
			}
			this.anIntArray273[0] = arg2;
			if (arg3 < 8 || arg3 > 8) {
				this.aClass2_Sub1_Sub2_7.method69(51);
			}
			this.aStringArray13[0] = arg0;
			this.aStringArray14[0] = arg1;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("38196, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method627() {
		try {
			while (true) {
				@Pc(15) Class2_Sub1_Sub4 local15 = this.aClass5_Sub1_1.method181();
				if (local15 == null) {
					return;
				}
				if (local15.anInt549 == 0) {
					Class2_Sub1_Sub1_Sub6.method510(local15.anInt550, local15.aByteArray13);
					if ((this.aClass5_Sub1_1.method175(local15.anInt550) & 0x62) != 0) {
						this.aBoolean255 = true;
						if (this.anInt965 != -1 || this.anInt1005 != -1) {
							this.aBoolean224 = true;
						}
					}
				}
				if (local15.anInt549 == 1 && local15.aByteArray13 != null) {
					Class4.method165(local15.aByteArray13);
				}
				if (local15.anInt549 == 2 && local15.anInt550 == this.anInt889 && local15.aByteArray13 != null) {
					this.method634(local15.aByteArray13, this.aBoolean234);
				}
				if (local15.anInt549 == 3 && this.anInt870 == 1) {
					for (@Pc(90) int local90 = 0; local90 < this.aByteArrayArray6.length; local90++) {
						if (this.anIntArray270[local90] == local15.anInt550) {
							this.aByteArrayArray6[local90] = local15.aByteArray13;
							if (local15.aByteArray13 == null) {
								this.anIntArray270[local90] = -1;
							}
							break;
						}
						if (this.anIntArray271[local90] == local15.anInt550) {
							this.aByteArrayArray5[local90] = local15.aByteArray13;
							if (local15.aByteArray13 == null) {
								this.anIntArray271[local90] = -1;
							}
							break;
						}
					}
				}
				if (local15.anInt549 == 93 && this.aClass5_Sub1_1.method182(local15.anInt550)) {
					Class29.method429(this.aClass5_Sub1_1, new Class2_Sub1_Sub2(local15.aByteArray13, -990));
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("76675, " + 5 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FMDWWBSX;Z)Z")
	private boolean method628(@OriginalArg(0) Class10 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				this.aClass2_Sub1_Sub2_7.method69(57);
			}
			if (arg0.anIntArray44 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray44.length; local12++) {
				@Pc(21) int local21 = this.method677(this.anInt963, arg0, local12);
				@Pc(26) int local26 = arg0.anIntArray47[local12];
				if (arg0.anIntArray44[local12] == 2) {
					if (local21 >= local26) {
						return false;
					}
				} else if (arg0.anIntArray44[local12] == 3) {
					if (local21 <= local26) {
						return false;
					}
				} else if (arg0.anIntArray44[local12] == 4) {
					if (local21 == local26) {
						return false;
					}
				} else if (local21 != local26) {
					return false;
				}
			}
			return true;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("3736, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method629(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_Sub1_Sub3_Sub4_6 = new Class2_Sub1_Sub3_Sub4(this.aClass39_2, "titlebox", 0);
			this.aClass2_Sub1_Sub3_Sub4_7 = new Class2_Sub1_Sub3_Sub4(this.aClass39_2, "titlebutton", 0);
			@Pc(23) boolean local23 = false;
			this.aClass2_Sub1_Sub3_Sub4Array3 = new Class2_Sub1_Sub3_Sub4[12];
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				this.aClass2_Sub1_Sub3_Sub4Array3[local29] = new Class2_Sub1_Sub3_Sub4(this.aClass39_2, "runes", local29);
			}
			this.aClass2_Sub1_Sub3_Sub2_13 = new Class2_Sub1_Sub3_Sub2(128, 265);
			this.aClass2_Sub1_Sub3_Sub2_14 = new Class2_Sub1_Sub3_Sub2(128, 265);
			for (@Pc(62) int local62 = 0; local62 < 33920; local62++) {
				this.aClass2_Sub1_Sub3_Sub2_13.anIntArray63[local62] = this.aClass49_6.anIntArray209[local62];
			}
			for (@Pc(80) int local80 = 0; local80 < 33920; local80++) {
				this.aClass2_Sub1_Sub3_Sub2_14.anIntArray63[local80] = this.aClass49_7.anIntArray209[local80];
			}
			this.anIntArray237 = new int[256];
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				this.anIntArray237[local102] = local102 * 262144;
			}
			for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
				this.anIntArray237[local117 + 64] = local117 * 1024 + 16711680;
			}
			for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
				this.anIntArray237[local136 + 128] = local136 * 4 + 16776960;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray237[local155 + 192] = 16777215;
			}
			this.anIntArray238 = new int[256];
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray238[local174] = local174 * 1024;
			}
			for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
				this.anIntArray238[local189 + 64] = local189 * 4 + 65280;
			}
			for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
				this.anIntArray238[local208 + 128] = local208 * 262144 + 65535;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray238[local227 + 192] = 16777215;
			}
			this.anIntArray239 = new int[256];
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray239[local246] = local246 * 4;
			}
			for (@Pc(261) int local261 = 0; local261 < 64; local261++) {
				this.anIntArray239[local261 + 64] = local261 * 262144 + 255;
			}
			for (@Pc(280) int local280 = 0; local280 < 64; local280++) {
				this.anIntArray239[local280 + 128] = local280 * 1024 + 16711935;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray239[local299 + 192] = 16777215;
			}
			this.anIntArray236 = new int[256];
			this.anIntArray224 = new int[32768];
			this.anIntArray225 = new int[32768];
			this.method707(null);
			this.anIntArray253 = new int[32768];
			this.anIntArray254 = new int[32768];
			this.method586("Connecting to fileserver", 10);
			if (!this.aBoolean223) {
				this.aBoolean249 = true;
				this.aBoolean223 = true;
				this.method585(this, 2);
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("71660, " + arg0 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method630() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray253[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray253[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray254[local54] = (this.anIntArray253[local54 - 1] + this.anIntArray253[local54 + 1] + this.anIntArray253[local54 - 128] + this.anIntArray253[local54 + 128]) / 4;
				}
			}
			this.anInt1022 += 128;
			if (this.anInt1022 > this.anIntArray224.length) {
				this.anInt1022 -= this.anIntArray224.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method707(this.aClass2_Sub1_Sub3_Sub4Array3[local48]);
			}
			@Pc(173) int local173;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local173 = local54 + (local48 << 7);
					@Pc(196) int local196 = this.anIntArray254[local173 + 128] - this.anIntArray224[local173 + this.anInt1022 & this.anIntArray224.length - 1] / 5;
					if (local196 < 0) {
						local196 = 0;
					}
					this.anIntArray253[local173] = local196;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray243[local54] = this.anIntArray243[local54 + 1];
			}
			this.anIntArray243[255] = (int) (Math.sin((double) anInt1013 / 14.0D) * 16.0D + Math.sin((double) anInt1013 / 15.0D) * 14.0D + Math.sin((double) anInt1013 / 16.0D) * 12.0D);
			if (this.anInt1036 > 0) {
				this.anInt1036 -= 4;
			}
			if (this.anInt1037 > 0) {
				this.anInt1037 -= 4;
			}
			if (this.anInt1036 == 0 && this.anInt1037 == 0) {
				local173 = (int) (Math.random() * 2000.0D);
				if (local173 == 0) {
					this.anInt1036 = 1024;
				}
				if (local173 == 1) {
					this.anInt1037 = 1024;
					return;
				}
			}
		} catch (@Pc(307) RuntimeException local307) {
			signlink.reporterror("73943, " + -19541 + ", " + local307.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method632(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt983; local1++) {
				@Pc(11) Class2_Sub1_Sub1_Sub1_Sub1 local11 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray264[local1]];
				@Pc(20) int local20 = (this.anIntArray264[local1] << 14) + 536870912;
				if (local11 != null && local11.method221(122) && local11.aClass32_1.aBoolean157 == arg0 && local11.aClass32_1.method452()) {
					@Pc(41) int local41 = local11.anInt328 >> 7;
					@Pc(46) int local46 = local11.anInt329 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt321 == 1 && (local11.anInt328 & 0x7F) == 64 && (local11.anInt329 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local41][local46] == this.anInt836) {
								continue;
							}
							this.anIntArrayArray22[local41][local46] = this.anInt836;
						}
						if (!local11.aClass32_1.aBoolean155) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass27_1.method308(local11.anInt330, this.anInt876, local11.anInt329, (local11.anInt321 - 1) * 64 + 60, this.method624(local11.anInt329, this.anInt876, local11.anInt328), local11, local20, local11.aBoolean82, local11.anInt328);
					}
				}
			}
			if (arg1) {
				this.aClass50ArrayArrayArray1 = null;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("461, " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method633(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean242) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method712(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZZ)V")
	private void method634(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			if (this.aBoolean258) {
				signlink.anInt1070 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("35849, " + arg0 + ", " + false + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method635(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) Class10 local8 = Class10.method204(arg0);
			for (@Pc(10) int local10 = 0; local10 < local8.anIntArray48.length && local8.anIntArray48[local10] != -1; local10++) {
				@Pc(24) Class10 local24 = Class10.method204(local8.anIntArray48[local10]);
				if (local24.anInt267 == 1) {
					this.method635(local24.anInt264);
				}
				local24.anInt238 = 0;
				local24.anInt232 = 0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("84620, " + arg0 + ", " + 7 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!NDGQUJMA;I)V")
	private void method636(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 != null) {
				@Pc(10) int local10 = this.anInt969 + this.anInt966 & 0x7FF;
				@Pc(18) int local18 = arg0 * arg0 + arg2 * arg2;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class2_Sub1_Sub1_Sub6.anIntArray179[local10];
					@Pc(30) int local30 = Class2_Sub1_Sub1_Sub6.anIntArray180[local10];
					@Pc(43) int local43 = local26 * 256 / (this.anInt1014 + 256);
					@Pc(52) int local52 = local30 * 256 / (this.anInt1014 + 256);
					@Pc(62) int local62 = arg2 * local43 + arg0 * local52 >> 16;
					@Pc(72) int local72 = arg2 * local52 - arg0 * local43 >> 16;
					if (local18 > 2500) {
						arg1.method283(local62 + 94 + 4 - arg1.anInt468 / 2, 83 - local72 - arg1.anInt469 / 2 - 4, this.aClass2_Sub1_Sub3_Sub4_9);
					} else {
						arg1.method277(83 - local72 - arg1.anInt469 / 2 - 4, local62 + 94 - arg1.anInt468 / 2 + 4);
					}
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("90210, " + 103 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method637() {
		try {
			this.method686();
			if (this.anInt1003 == 1) {
				this.aClass2_Sub1_Sub3_Sub2Array4[this.anInt1002 / 100].method277(this.anInt1001 - 8 - 4, this.anInt1000 - 8 - 4);
			}
			if (this.anInt1003 == 2) {
				this.aClass2_Sub1_Sub3_Sub2Array4[this.anInt1002 / 100 + 4].method277(this.anInt1001 - 8 - 4, this.anInt1000 - 8 - 4);
				anInt863++;
				if (anInt863 > 80) {
					anInt863 = 0;
					this.aClass2_Sub1_Sub2_7.method68(171);
				}
			}
			if (this.anInt986 != -1) {
				this.method716(this.anInt986, this.anInt1046);
				this.method642(0, 0, 0, Class10.method204(this.anInt986), this.aBoolean230);
			}
			if (this.anInt976 != -1) {
				this.method716(this.anInt976, this.anInt1046);
				this.method642(0, 0, 0, Class10.method204(this.anInt976), this.aBoolean230);
			}
			this.method596();
			if (!this.aBoolean236) {
				this.method673();
				this.method688();
			} else if (this.anInt901 == 0) {
				this.method618();
			}
			if (this.anInt841 == 1) {
				this.aClass2_Sub1_Sub3_Sub2_3.method277(296, 472);
			}
			@Pc(191) int local191;
			if (aBoolean219) {
				@Pc(156) byte local156 = 20;
				@Pc(158) int local158 = 16776960;
				if (super.anInt813 < 30 && aBoolean244) {
					local158 = 16711680;
				}
				if (super.anInt813 < 20 && !aBoolean244) {
					local158 = 16711680;
				}
				this.aClass2_Sub1_Sub3_Sub1_3.method148(this.anInt850, local158, "Fps:" + super.anInt813, 20);
				local191 = local156 + 15;
				@Pc(193) Runtime local193 = Runtime.getRuntime();
				@Pc(202) int local202 = (int) ((local193.totalMemory() - local193.freeMemory()) / 1024L);
				if (local202 > 33554432 && aBoolean244) {
				}
				if (local202 > 67108864 && !aBoolean244) {
				}
				this.aClass2_Sub1_Sub3_Sub1_3.method148(this.anInt850, 16776960, "Mem:" + local202 + "k", 35);
				local191 += 15;
			}
			if (this.anInt862 != 0) {
				@Pc(244) int local244 = this.anInt862 / 50;
				local191 = local244 / 60;
				@Pc(252) int local252 = local244 % 60;
				if (local252 < 10) {
					this.aClass2_Sub1_Sub3_Sub1_3.method153(329, "System update in: " + local191 + ":0" + local252, 4, 16776960);
				} else {
					this.aClass2_Sub1_Sub3_Sub1_3.method153(329, "System update in: " + local191 + ":" + local252, 4, 16776960);
				}
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("34773, " + 47383 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method638(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt982 >= 100) {
					this.method626("", "Your ignore list is full. Max of 100 hit", 0, this.anInt916);
				} else {
					@Pc(24) String local24 = Class19.method235(Class19.method232(arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt982; local26++) {
						if (this.aLongArray4[local26] == arg0) {
							this.method626("", local24 + " is already on your ignore list", 0, this.anInt916);
							return;
						}
					}
					for (@Pc(62) int local62 = 0; local62 < this.anInt979; local62++) {
						if (this.aLongArray3[local62] == arg0) {
							this.method626("", "Please remove " + local24 + " from your friend list first", 0, this.anInt916);
							return;
						}
					}
					this.aLongArray4[this.anInt982++] = arg0;
					this.aBoolean255 = true;
					this.aClass2_Sub1_Sub2_7.method68(233);
					this.aClass2_Sub1_Sub2_7.method75(this.anInt1053, arg0);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("73664, " + false + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method639(@OriginalArg(0) int arg0) {
		try {
			Class10.method206(arg0);
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("61186, " + arg0 + ", " + -964 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
	private boolean method640(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(17) int local17 = this.anIntArray221[arg0];
			if (local17 >= 2000) {
				local17 -= 2000;
			}
			return local17 == 106;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("76526, " + 1 + ", " + arg0 + ", " + local29.toString());
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
				return new URL("http://127.0.0.1:" + (anInt919 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!FMDWWBSX;II)V")
	private void method641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean228) {
				this.anInt894 = 32;
			} else {
				this.anInt894 = 0;
			}
			this.aBoolean228 = false;
			if (arg7 >= arg0 && arg7 < arg0 + 16 && arg4 >= arg6 && arg4 < arg6 + 16) {
				arg5.anInt268 -= this.anInt1021 * 4;
				if (arg3 == 1) {
					this.aBoolean255 = true;
				}
				if (arg3 == 2 || arg3 == 3) {
					this.aBoolean224 = true;
				}
			} else if (arg7 >= arg0 && arg7 < arg0 + 16 && arg4 >= arg6 + arg2 - 16 && arg4 < arg6 + arg2) {
				arg5.anInt268 += this.anInt1021 * 4;
				if (arg3 == 1) {
					this.aBoolean255 = true;
				}
				if (arg3 == 2 || arg3 == 3) {
					this.aBoolean224 = true;
				}
			} else if (arg7 >= arg0 - this.anInt894 && arg7 < arg0 + this.anInt894 + 16 && arg4 >= arg6 + 16 && arg4 < arg6 + arg2 - 16 && this.anInt1021 > 0) {
				@Pc(146) int local146 = (arg2 - 32) * arg2 / arg1;
				if (local146 < 8) {
					local146 = 8;
				}
				@Pc(161) int local161 = arg4 - arg6 - local146 / 2 - 16;
				@Pc(167) int local167 = arg2 - local146 - 32;
				arg5.anInt268 = (arg1 - arg2) * local161 / local167;
				if (arg3 == 1) {
					this.aBoolean255 = true;
				}
				if (arg3 == 2 || arg3 == 3) {
					this.aBoolean224 = true;
				}
				this.aBoolean228 = true;
			}
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("29066, " + -535 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!FMDWWBSX;Z)V")
	private void method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4) {
		try {
			if (arg3.anInt267 == 0 && arg3.anIntArray48 != null && (!arg3.aBoolean71 || this.anInt1006 == arg3.anInt264 || this.anInt875 == arg3.anInt264 || this.anInt936 == arg3.anInt264)) {
				@Pc(29) int local29 = Class2_Sub1_Sub3.anInt559;
				@Pc(31) int local31 = Class2_Sub1_Sub3.anInt557;
				@Pc(33) int local33 = Class2_Sub1_Sub3.anInt560;
				@Pc(35) int local35 = Class2_Sub1_Sub3.anInt558;
				this.aBoolean227 &= arg4;
				Class2_Sub1_Sub3.method385(arg1, arg2, arg1 + arg3.anInt250, arg2 + arg3.anInt246);
				@Pc(57) int local57 = arg3.anIntArray48.length;
				for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
					@Pc(68) int local68 = arg3.anIntArray45[local59] + arg1;
					@Pc(77) int local77 = arg3.anIntArray52[local59] + arg2 - arg0;
					@Pc(83) Class10 local83 = Class10.method204(arg3.anIntArray48[local59]);
					@Pc(88) int local88 = local68 + local83.anInt259;
					@Pc(93) int local93 = local77 + local83.anInt252;
					if (local83.anInt263 > 0) {
						this.method593(local83);
					}
					if (local83.anInt267 == 0) {
						if (local83.anInt268 > local83.anInt256 - local83.anInt246) {
							local83.anInt268 = local83.anInt256 - local83.anInt246;
						}
						if (local83.anInt268 < 0) {
							local83.anInt268 = 0;
						}
						this.method642(local83.anInt268, local88, local93, local83, this.aBoolean230);
						if (local83.anInt256 > local83.anInt246) {
							this.method721(local88 + local83.anInt250, local93, this.aBoolean254, local83.anInt268, local83.anInt256, local83.anInt246);
						}
					} else if (local83.anInt267 != 1) {
						@Pc(167) int local167;
						@Pc(171) int local171;
						@Pc(182) int local182;
						@Pc(217) int local217;
						@Pc(224) int local224;
						@Pc(249) int local249;
						@Pc(165) int local165;
						@Pc(215) int local215;
						if (local83.anInt267 == 2) {
							local165 = 0;
							for (local167 = 0; local167 < local83.anInt246; local167++) {
								for (local171 = 0; local171 < local83.anInt250; local171++) {
									local182 = local88 + local171 * (local83.anInt233 + 32);
									@Pc(191) int local191 = local93 + local167 * (local83.anInt251 + 32);
									if (local165 < 20) {
										local182 += local83.anIntArray51[local165];
										local191 += local83.anIntArray49[local165];
									}
									if (local83.anIntArray46[local165] > 0) {
										local215 = 0;
										local217 = 0;
										local224 = local83.anIntArray46[local165] - 1;
										if (local182 > Class2_Sub1_Sub3.anInt559 - 32 && local182 < Class2_Sub1_Sub3.anInt560 && local191 > Class2_Sub1_Sub3.anInt557 - 32 && local191 < Class2_Sub1_Sub3.anInt558 || this.anInt932 != 0 && this.anInt931 == local165) {
											local249 = 0;
											if (this.anInt992 == 1 && this.anInt993 == local165 && this.anInt994 == local83.anInt264) {
												local249 = 16777215;
											}
											@Pc(273) Class2_Sub1_Sub3_Sub2 local273 = Class28.method411(local249, local224, local83.anIntArray50[local165]);
											if (local273 != null) {
												@Pc(352) int local352;
												if (this.anInt932 != 0 && this.anInt931 == local165 && this.anInt930 == local83.anInt264) {
													local215 = super.anInt818 - this.anInt933;
													local217 = super.anInt819 - this.anInt934;
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (local217 < 5 && local217 > -5) {
														local217 = 0;
													}
													if (this.anInt865 < 5) {
														local215 = 0;
														local217 = 0;
													}
													local273.method279(local191 + local217, local182 + local215);
													if (local191 + local217 < Class2_Sub1_Sub3.anInt557 && arg3.anInt268 > 0) {
														local352 = this.anInt1046 * (Class2_Sub1_Sub3.anInt557 - local191 - local217) / 3;
														if (local352 > this.anInt1046 * 10) {
															local352 = this.anInt1046 * 10;
														}
														if (local352 > arg3.anInt268) {
															local352 = arg3.anInt268;
														}
														arg3.anInt268 -= local352;
														this.anInt934 += local352;
													}
													if (local191 + local217 + 32 > Class2_Sub1_Sub3.anInt558 && arg3.anInt268 < arg3.anInt256 - arg3.anInt246) {
														local352 = this.anInt1046 * (local191 + local217 + 32 - Class2_Sub1_Sub3.anInt558) / 3;
														if (local352 > this.anInt1046 * 10) {
															local352 = this.anInt1046 * 10;
														}
														if (local352 > arg3.anInt256 - arg3.anInt246 - arg3.anInt268) {
															local352 = arg3.anInt256 - arg3.anInt246 - arg3.anInt268;
														}
														arg3.anInt268 += local352;
														this.anInt934 -= local352;
													}
												} else if (this.anInt990 != 0 && this.anInt989 == local165 && this.anInt988 == local83.anInt264) {
													local273.method279(local191, local182);
												} else {
													local273.method277(local191, local182);
												}
												if (local273.anInt468 == 33 || local83.anIntArray50[local165] != 1) {
													local352 = local83.anIntArray50[local165];
													this.aClass2_Sub1_Sub3_Sub1_2.method153(local191 + local217 + 10, method631(local352), local182 + local215 + 1, 0);
													this.aClass2_Sub1_Sub3_Sub1_2.method153(local191 + local217 + 9, method631(local352), local182 + local215, 16776960);
												}
											}
										}
									} else if (local83.aClass2_Sub1_Sub3_Sub2Array1 != null && local165 < 20) {
										@Pc(541) Class2_Sub1_Sub3_Sub2 local541 = local83.aClass2_Sub1_Sub3_Sub2Array1[local165];
										if (local541 != null) {
											local541.method277(local191, local182);
										}
									}
									local165++;
								}
							}
						} else if (local83.anInt267 == 3) {
							@Pc(567) boolean local567 = false;
							if (this.anInt936 == local83.anInt264 || this.anInt875 == local83.anInt264 || this.anInt1006 == local83.anInt264) {
								local567 = true;
							}
							if (this.method628(local83, this.aBoolean241)) {
								local165 = local83.anInt235;
								if (local567 && local83.anInt265 != 0) {
									local165 = local83.anInt265;
								}
							} else {
								local165 = local83.anInt231;
								if (local567 && local83.anInt255 != 0) {
									local165 = local83.anInt255;
								}
							}
							if (local83.aByte16 == 0) {
								if (local83.aBoolean72) {
									Class2_Sub1_Sub3.method388(local165, local88, local93, local83.anInt250, local83.anInt246);
								} else {
									Class2_Sub1_Sub3.method389(local93, local165, local88, local83.anInt246, local83.anInt250);
								}
							} else if (local83.aBoolean72) {
								Class2_Sub1_Sub3.method387(local83.anInt246, local165, local88, local83.anInt250, local93, 256 - (local83.aByte16 & 0xFF));
							} else {
								Class2_Sub1_Sub3.method390(local83.anInt250, local88, local93, local83.anInt246, 256 - (local83.aByte16 & 0xFF), local165);
							}
						} else {
							@Pc(686) Class2_Sub1_Sub3_Sub1 local686;
							@Pc(969) String local969;
							if (local83.anInt267 == 4) {
								local686 = local83.aClass2_Sub1_Sub3_Sub1_1;
								@Pc(689) String local689 = local83.aString5;
								@Pc(691) boolean local691 = false;
								if (this.anInt936 == local83.anInt264 || this.anInt875 == local83.anInt264 || this.anInt1006 == local83.anInt264) {
									local691 = true;
								}
								if (this.method628(local83, this.aBoolean241)) {
									local167 = local83.anInt235;
									if (local691 && local83.anInt265 != 0) {
										local167 = local83.anInt265;
									}
									if (local83.aString7.length() > 0) {
										local689 = local83.aString7;
									}
								} else {
									local167 = local83.anInt231;
									if (local691 && local83.anInt255 != 0) {
										local167 = local83.anInt255;
									}
								}
								if (local83.anInt266 == 6 && this.aBoolean233) {
									local689 = "Please wait...";
									local167 = local83.anInt231;
								}
								if (Class2_Sub1_Sub3.anInt555 == 479) {
									if (local167 == 16776960) {
										local167 = 255;
									}
									if (local167 == 49152) {
										local167 = 16777215;
									}
								}
								local215 = local93 + local686.anInt167;
								while (local689.length() > 0) {
									if (local689.indexOf("%") != -1) {
										label390: while (true) {
											local217 = local689.indexOf("%1");
											if (local217 == -1) {
												while (true) {
													local217 = local689.indexOf("%2");
													if (local217 == -1) {
														while (true) {
															local217 = local689.indexOf("%3");
															if (local217 == -1) {
																while (true) {
																	local217 = local689.indexOf("%4");
																	if (local217 == -1) {
																		while (true) {
																			local217 = local689.indexOf("%5");
																			if (local217 == -1) {
																				break label390;
																			}
																			local689 = local689.substring(0, local217) + this.method672(723, this.method677(this.anInt963, local83, 4)) + local689.substring(local217 + 2);
																		}
																	}
																	local689 = local689.substring(0, local217) + this.method672(723, this.method677(this.anInt963, local83, 3)) + local689.substring(local217 + 2);
																}
															}
															local689 = local689.substring(0, local217) + this.method672(723, this.method677(this.anInt963, local83, 2)) + local689.substring(local217 + 2);
														}
													}
													local689 = local689.substring(0, local217) + this.method672(723, this.method677(this.anInt963, local83, 1)) + local689.substring(local217 + 2);
												}
											}
											local689 = local689.substring(0, local217) + this.method672(723, this.method677(this.anInt963, local83, 0)) + local689.substring(local217 + 2);
										}
									}
									local217 = local689.indexOf("\\n");
									if (local217 == -1) {
										local969 = local689;
										local689 = "";
									} else {
										local969 = local689.substring(0, local217);
										local689 = local689.substring(local217 + 2);
									}
									if (local83.aBoolean69) {
										local686.method150(local83.aBoolean66, local969, local167, local215, local88 + local83.anInt250 / 2);
									} else {
										local686.method157(local83.aBoolean66, local215, local88, local167, local969);
									}
									local215 += local686.anInt167;
								}
							} else if (local83.anInt267 == 5) {
								@Pc(1032) Class2_Sub1_Sub3_Sub2 local1032;
								if (this.method628(local83, this.aBoolean241)) {
									local1032 = local83.aClass2_Sub1_Sub3_Sub2_1;
								} else {
									local1032 = local83.aClass2_Sub1_Sub3_Sub2_2;
								}
								if (local1032 != null) {
									local1032.method277(local93, local88);
								}
							} else if (local83.anInt267 == 6) {
								local165 = Class2_Sub1_Sub3_Sub3.anInt543;
								local167 = Class2_Sub1_Sub3_Sub3.anInt544;
								Class2_Sub1_Sub3_Sub3.anInt543 = local88 + local83.anInt250 / 2;
								Class2_Sub1_Sub3_Sub3.anInt544 = local93 + local83.anInt246 / 2;
								local171 = Class2_Sub1_Sub3_Sub3.anIntArray87[local83.anInt261] * local83.anInt260 >> 16;
								local182 = Class2_Sub1_Sub3_Sub3.anIntArray88[local83.anInt261] * local83.anInt260 >> 16;
								@Pc(1094) boolean local1094 = this.method628(local83, this.aBoolean241);
								if (local1094) {
									local215 = local83.anInt254;
								} else {
									local215 = local83.anInt253;
								}
								@Pc(1114) Class2_Sub1_Sub1_Sub6 local1114;
								if (local215 == -1) {
									local1114 = local83.method202(-1, -1, local1094);
								} else {
									@Pc(1120) Class33 local1120 = Class33.aClass33Array1[local215];
									local1114 = local83.method202(local1120.anIntArray116[local83.anInt238], local1120.anIntArray115[local83.anInt238], local1094);
								}
								if (local1114 != null) {
									local1114.method533(local83.anInt262, 0, local83.anInt261, 0, local171, local182);
								}
								Class2_Sub1_Sub3_Sub3.anInt543 = local165;
								Class2_Sub1_Sub3_Sub3.anInt544 = local167;
							} else {
								if (local83.anInt267 == 7) {
									local686 = local83.aClass2_Sub1_Sub3_Sub1_1;
									local167 = 0;
									for (local171 = 0; local171 < local83.anInt246; local171++) {
										for (local182 = 0; local182 < local83.anInt250; local182++) {
											if (local83.anIntArray46[local167] > 0) {
												@Pc(1184) Class28 local1184 = Class28.method410(local83.anIntArray46[local167] - 1);
												@Pc(1188) String local1188 = String.valueOf(local1184.aString13);
												if (local1184.aBoolean141 || local83.anIntArray50[local167] != 1) {
													local1188 = local1188 + " x" + method614(local83.anIntArray50[local167]);
												}
												local217 = local88 + local182 * (local83.anInt233 + 115);
												local224 = local93 + local171 * (local83.anInt251 + 12);
												if (local83.aBoolean69) {
													local686.method150(local83.aBoolean66, local1188, local83.anInt231, local224, local217 + local83.anInt250 / 2);
												} else {
													local686.method157(local83.aBoolean66, local224, local217, local83.anInt231, local1188);
												}
											}
											local167++;
										}
									}
								}
								if (local83.anInt267 == 8 && (this.anInt832 == local83.anInt264 || this.anInt853 == local83.anInt264 || this.anInt878 == local83.anInt264) && this.anInt877 == 100) {
									local165 = 0;
									local167 = 0;
									@Pc(1302) Class2_Sub1_Sub3_Sub1 local1302 = this.aClass2_Sub1_Sub3_Sub1_3;
									@Pc(1305) String local1305 = local83.aString5;
									while (local1305.length() > 0) {
										local215 = local1305.indexOf("\\n");
										if (local215 == -1) {
											local969 = local1305;
											local1305 = "";
										} else {
											local969 = local1305.substring(0, local215);
											local1305 = local1305.substring(local215 + 2);
										}
										local217 = local1302.method151(local969);
										if (local217 > local165) {
											local165 = local217;
										}
										local167 += local1302.anInt167 + 1;
									}
									local165 += 6;
									local167 += 7;
									local215 = local88 + local83.anInt250 - local165 - 5;
									local217 = local93 + local83.anInt246 + 5;
									if (local215 < local88 + 5) {
										local215 = local88 + 5;
									}
									if (local215 + local165 > arg1 + arg3.anInt250) {
										local215 = arg1 + arg3.anInt250 - local165;
									}
									if (local217 + local167 > arg2 + arg3.anInt246) {
										local217 = arg2 + arg3.anInt246 - local167;
									}
									Class2_Sub1_Sub3.method388(16777120, local215, local217, local165, local167);
									Class2_Sub1_Sub3.method389(local217, 0, local215, local167, local165);
									local1305 = local83.aString5;
									local224 = local217 + local1302.anInt167 + 2;
									while (local1305.length() > 0) {
										local249 = local1305.indexOf("\\n");
										if (local249 == -1) {
											local969 = local1305;
											local1305 = "";
										} else {
											local969 = local1305.substring(0, local249);
											local1305 = local1305.substring(local249 + 2);
										}
										local1302.method157(false, local224, local215 + 3, 0, local969);
										local224 += local1302.anInt167 + 1;
									}
								}
							}
						}
					}
				}
				Class2_Sub1_Sub3.method385(local29, local31, local33, local35);
			}
		} catch (@Pc(1490) RuntimeException local1490) {
			signlink.reporterror("71732, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1490.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FMDWWBSX;I)Z")
	private boolean method643(@OriginalArg(0) Class10 arg0) {
		try {
			@Pc(14) int local14 = arg0.anInt263;
			if (this.anInt980 == 2) {
				if (local14 == 201) {
					this.aBoolean224 = true;
					this.anInt1054 = 0;
					this.aBoolean238 = true;
					this.aString17 = "";
					this.anInt1062 = 1;
					this.aString19 = "Enter name of friend to add to list";
				}
				if (local14 == 202) {
					this.aBoolean224 = true;
					this.anInt1054 = 0;
					this.aBoolean238 = true;
					this.aString17 = "";
					this.anInt1062 = 2;
					this.aString19 = "Enter name of friend to delete from list";
				}
			}
			if (local14 == 205) {
				this.anInt860 = 250;
				return true;
			}
			if (local14 == 501) {
				this.aBoolean224 = true;
				this.anInt1054 = 0;
				this.aBoolean238 = true;
				this.aString17 = "";
				this.anInt1062 = 4;
				this.aString19 = "Enter name of player to add to list";
			}
			if (local14 == 502) {
				this.aBoolean224 = true;
				this.anInt1054 = 0;
				this.aBoolean238 = true;
				this.aString17 = "";
				this.anInt1062 = 5;
				this.aString19 = "Enter name of player to delete from list";
			}
			@Pc(122) int local122;
			@Pc(126) int local126;
			@Pc(131) int local131;
			if (local14 >= 300 && local14 <= 313) {
				local122 = (local14 - 300) / 2;
				local126 = local14 & 0x1;
				local131 = this.anIntArray274[local122];
				if (local131 != -1) {
					while (true) {
						if (local126 == 0) {
							local131--;
							if (local131 < 0) {
								local131 = Class25.anInt487 - 1;
							}
						}
						if (local126 == 1) {
							local131++;
							if (local131 >= Class25.anInt487) {
								local131 = 0;
							}
						}
						if (!Class25.aClass25Array1[local131].aBoolean115 && Class25.aClass25Array1[local131].anInt488 == local122 + (this.aBoolean259 ? 0 : 7)) {
							this.anIntArray274[local122] = local131;
							this.aBoolean264 = true;
							break;
						}
					}
				}
			}
			if (local14 >= 314 && local14 <= 323) {
				local122 = (local14 - 314) / 2;
				local126 = local14 & 0x1;
				local131 = this.anIntArray263[local122];
				if (local126 == 0) {
					local131--;
					if (local131 < 0) {
						local131 = anIntArrayArray25[local122].length - 1;
					}
				}
				if (local126 == 1) {
					local131++;
					if (local131 >= anIntArrayArray25[local122].length) {
						local131 = 0;
					}
				}
				this.anIntArray263[local122] = local131;
				this.aBoolean264 = true;
			}
			if (local14 == 324 && !this.aBoolean259) {
				this.aBoolean259 = true;
				this.method717((byte) 2);
			}
			if (local14 == 325 && this.aBoolean259) {
				this.aBoolean259 = false;
				this.method717((byte) 2);
			}
			if (local14 == 326) {
				this.aClass2_Sub1_Sub2_7.method68(163);
				this.aClass2_Sub1_Sub2_7.method69(this.aBoolean259 ? 0 : 1);
				for (local122 = 0; local122 < 7; local122++) {
					this.aClass2_Sub1_Sub2_7.method69(this.anIntArray274[local122]);
				}
				for (local126 = 0; local126 < 5; local126++) {
					this.aClass2_Sub1_Sub2_7.method69(this.anIntArray263[local126]);
				}
				return true;
			}
			if (local14 == 620) {
				this.aBoolean237 = !this.aBoolean237;
			}
			if (local14 >= 601 && local14 <= 613) {
				this.method693();
				if (this.aString30.length() > 0) {
					this.aClass2_Sub1_Sub2_7.method68(139);
					this.aClass2_Sub1_Sub2_7.method75(this.anInt1053, Class19.method231(this.aString30));
					this.aClass2_Sub1_Sub2_7.method69(local14 - 601);
					this.aClass2_Sub1_Sub2_7.method69(this.aBoolean237 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("27322, " + arg0 + ", " + 2 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!FMDWWBSX;I)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg5.anInt267 == 0 && arg5.anIntArray48 != null && !arg5.aBoolean71 && (arg0 >= arg1 && arg3 >= arg2 && arg0 <= arg1 + arg5.anInt250 && arg3 <= arg2 + arg5.anInt246)) {
				@Pc(34) int local34 = arg5.anIntArray48.length;
				this.anInt856 += 0;
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg5.anIntArray45[local42] + arg1;
					@Pc(60) int local60 = arg5.anIntArray52[local42] + arg2 - arg6;
					@Pc(66) Class10 local66 = Class10.method204(arg5.anIntArray48[local42]);
					@Pc(71) int local71 = local51 + local66.anInt259;
					@Pc(76) int local76 = local60 + local66.anInt252;
					if ((local66.anInt241 >= 0 || local66.anInt255 != 0) && arg0 >= local71 && arg3 >= local76 && arg0 < local71 + local66.anInt250 && arg3 < local76 + local66.anInt246) {
						if (local66.anInt241 >= 0) {
							this.anInt957 = local66.anInt241;
						} else {
							this.anInt957 = local66.anInt264;
						}
					}
					if (local66.anInt267 == 8 && arg0 >= local71 && arg3 >= local76 && arg0 < local71 + local66.anInt250 && arg3 < local76 + local66.anInt246) {
						this.anInt899 = local66.anInt264;
					}
					if (local66.anInt267 == 0) {
						this.method644(arg0, local71, local76, arg3, arg4, local66, local66.anInt268);
						if (local66.anInt256 > local66.anInt246) {
							this.method641(local71 + local66.anInt250, local66.anInt256, local66.anInt246, arg4, arg3, local66, local76, arg0);
						}
					} else {
						if (local66.anInt266 == 1 && arg0 >= local71 && arg3 >= local76 && arg0 < local71 + local66.anInt250 && arg3 < local76 + local66.anInt246) {
							@Pc(200) boolean local200 = false;
							if (local66.anInt263 != 0) {
								local200 = this.method678(local66);
							}
							if (!local200) {
								this.aStringArray11[this.anInt909] = local66.aString6;
								this.anIntArray221[this.anInt909] = 253;
								this.anIntArray220[this.anInt909] = local66.anInt264;
								this.anInt909++;
							}
						}
						if (local66.anInt266 == 2 && this.anInt838 == 0 && arg0 >= local71 && arg3 >= local76 && arg0 < local71 + local66.anInt250 && arg3 < local76 + local66.anInt246) {
							@Pc(264) String local264 = local66.aString8;
							if (local264.indexOf(" ") != -1) {
								local264 = local264.substring(0, local264.indexOf(" "));
							}
							this.aStringArray11[this.anInt909] = local264 + " @gre@" + local66.aString4;
							this.anIntArray221[this.anInt909] = 565;
							this.anIntArray220[this.anInt909] = local66.anInt264;
							this.anInt909++;
						}
						if (local66.anInt266 == 3 && arg0 >= local71 && arg3 >= local76 && arg0 < local71 + local66.anInt250 && arg3 < local76 + local66.anInt246) {
							this.aStringArray11[this.anInt909] = "Close";
							if (arg4 == 3) {
								this.anIntArray221[this.anInt909] = 827;
							} else {
								this.anIntArray221[this.anInt909] = 727;
							}
							this.anIntArray220[this.anInt909] = local66.anInt264;
							this.anInt909++;
						}
						if (local66.anInt266 == 4 && arg0 >= local71 && arg3 >= local76 && arg0 < local71 + local66.anInt250 && arg3 < local76 + local66.anInt246) {
							this.aStringArray11[this.anInt909] = local66.aString6;
							this.anIntArray221[this.anInt909] = 125;
							this.anIntArray220[this.anInt909] = local66.anInt264;
							this.anInt909++;
						}
						if (local66.anInt266 == 5 && arg0 >= local71 && arg3 >= local76 && arg0 < local71 + local66.anInt250 && arg3 < local76 + local66.anInt246) {
							this.aStringArray11[this.anInt909] = local66.aString6;
							this.anIntArray221[this.anInt909] = 14;
							this.anIntArray220[this.anInt909] = local66.anInt264;
							this.anInt909++;
						}
						if (local66.anInt266 == 6 && !this.aBoolean233 && arg0 >= local71 && arg3 >= local76 && arg0 < local71 + local66.anInt250 && arg3 < local76 + local66.anInt246) {
							this.aStringArray11[this.anInt909] = local66.aString6;
							this.anIntArray221[this.anInt909] = 683;
							this.anIntArray220[this.anInt909] = local66.anInt264;
							this.anInt909++;
						}
						if (local66.anInt267 == 2) {
							@Pc(523) int local523 = 0;
							for (@Pc(525) int local525 = 0; local525 < local66.anInt246; local525++) {
								for (@Pc(529) int local529 = 0; local529 < local66.anInt250; local529++) {
									@Pc(540) int local540 = local71 + local529 * (local66.anInt233 + 32);
									@Pc(549) int local549 = local76 + local525 * (local66.anInt251 + 32);
									if (local523 < 20) {
										local540 += local66.anIntArray51[local523];
										local549 += local66.anIntArray49[local523];
									}
									if (arg0 >= local540 && arg3 >= local549 && arg0 < local540 + 32 && arg3 < local549 + 32) {
										this.anInt959 = local523;
										this.anInt960 = local66.anInt264;
										if (local66.anIntArray46[local523] > 0) {
											@Pc(602) Class28 local602 = Class28.method410(local66.anIntArray46[local523] - 1);
											if (this.anInt992 == 1 && local66.aBoolean68) {
												if (local66.anInt264 != this.anInt994 || local523 != this.anInt993) {
													this.aStringArray11[this.anInt909] = "Use " + this.aString29 + " with @lre@" + local602.aString13;
													this.anIntArray221[this.anInt909] = 151;
													this.anIntArray222[this.anInt909] = local602.anInt581;
													this.anIntArray219[this.anInt909] = local523;
													this.anIntArray220[this.anInt909] = local66.anInt264;
													this.anInt909++;
												}
											} else if (this.anInt838 != 1 || !local66.aBoolean68) {
												@Pc(739) int local739;
												if (local66.aBoolean68) {
													for (local739 = 4; local739 >= 3; local739--) {
														if (local602.aStringArray5 != null && local602.aStringArray5[local739] != null) {
															this.aStringArray11[this.anInt909] = local602.aStringArray5[local739] + " @lre@" + local602.aString13;
															if (local739 == 3) {
																this.anIntArray221[this.anInt909] = 508;
															}
															if (local739 == 4) {
																this.anIntArray221[this.anInt909] = 959;
															}
															this.anIntArray222[this.anInt909] = local602.anInt581;
															this.anIntArray219[this.anInt909] = local523;
															this.anIntArray220[this.anInt909] = local66.anInt264;
															this.anInt909++;
														} else if (local739 == 4) {
															this.aStringArray11[this.anInt909] = "Drop @lre@" + local602.aString13;
															this.anIntArray221[this.anInt909] = 959;
															this.anIntArray222[this.anInt909] = local602.anInt581;
															this.anIntArray219[this.anInt909] = local523;
															this.anIntArray220[this.anInt909] = local66.anInt264;
															this.anInt909++;
														}
													}
												}
												if (local66.aBoolean70) {
													this.aStringArray11[this.anInt909] = "Use @lre@" + local602.aString13;
													this.anIntArray221[this.anInt909] = 286;
													this.anIntArray222[this.anInt909] = local602.anInt581;
													this.anIntArray219[this.anInt909] = local523;
													this.anIntArray220[this.anInt909] = local66.anInt264;
													this.anInt909++;
												}
												if (local66.aBoolean68 && local602.aStringArray5 != null) {
													for (local739 = 2; local739 >= 0; local739--) {
														if (local602.aStringArray5[local739] != null) {
															this.aStringArray11[this.anInt909] = local602.aStringArray5[local739] + " @lre@" + local602.aString13;
															if (local739 == 0) {
																this.anIntArray221[this.anInt909] = 500;
															}
															if (local739 == 1) {
																this.anIntArray221[this.anInt909] = 360;
															}
															if (local739 == 2) {
																this.anIntArray221[this.anInt909] = 986;
															}
															this.anIntArray222[this.anInt909] = local602.anInt581;
															this.anIntArray219[this.anInt909] = local523;
															this.anIntArray220[this.anInt909] = local66.anInt264;
															this.anInt909++;
														}
													}
												}
												if (local66.aStringArray2 != null) {
													for (local739 = 4; local739 >= 0; local739--) {
														if (local66.aStringArray2[local739] != null) {
															this.aStringArray11[this.anInt909] = local66.aStringArray2[local739] + " @lre@" + local602.aString13;
															if (local739 == 0) {
																this.anIntArray221[this.anInt909] = 191;
															}
															if (local739 == 1) {
																this.anIntArray221[this.anInt909] = 603;
															}
															if (local739 == 2) {
																this.anIntArray221[this.anInt909] = 972;
															}
															if (local739 == 3) {
																this.anIntArray221[this.anInt909] = 517;
															}
															if (local739 == 4) {
																this.anIntArray221[this.anInt909] = 788;
															}
															this.anIntArray222[this.anInt909] = local602.anInt581;
															this.anIntArray219[this.anInt909] = local523;
															this.anIntArray220[this.anInt909] = local66.anInt264;
															this.anInt909++;
														}
													}
												}
												this.aStringArray11[this.anInt909] = "Examine @lre@" + local602.aString13;
												this.anIntArray221[this.anInt909] = 1690;
												this.anIntArray222[this.anInt909] = local602.anInt581;
												this.anIntArray219[this.anInt909] = local523;
												this.anIntArray220[this.anInt909] = local66.anInt264;
												this.anInt909++;
											} else if ((this.anInt840 & 0x10) == 16) {
												this.aStringArray11[this.anInt909] = this.aString18 + " @lre@" + local602.aString13;
												this.anIntArray221[this.anInt909] = 817;
												this.anIntArray222[this.anInt909] = local602.anInt581;
												this.anIntArray219[this.anInt909] = local523;
												this.anIntArray220[this.anInt909] = local66.anInt264;
												this.anInt909++;
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
			signlink.reporterror("47737, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method645() {
		try {
			this.aClass49_15.method563();
			Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray260;
			if (this.anInt897 == -15852) {
				this.aClass2_Sub1_Sub3_Sub4_8.method400(0, 0);
				if (this.anInt1048 != -1) {
					this.method642(0, 0, 0, Class10.method204(this.anInt1048), this.aBoolean230);
				} else if (this.anIntArray255[this.anInt946] != -1) {
					this.method642(0, 0, 0, Class10.method204(this.anIntArray255[this.anInt946]), this.aBoolean230);
				}
				if (this.aBoolean236 && this.anInt901 == 1) {
					this.method618();
				}
				this.aClass49_15.method564(super.aGraphics2, 553, 205);
				this.aClass49_17.method563();
				Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("20641, " + -15852 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method646() {
		try {
			this.anInt856 += 0;
			signlink.aBoolean268 = false;
			signlink.anInt1070 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("99834, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class50 local9 = this.aClass50ArrayArrayArray1[this.anInt876][arg0][arg1];
		if (local9 == null) {
			this.aClass27_1.method318(this.anInt876, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub1_Sub2 local23 = null;
		@Pc(27) Class2_Sub1_Sub1_Sub2 local27;
		for (local27 = (Class2_Sub1_Sub1_Sub2) local9.method569(); local27 != null; local27 = (Class2_Sub1_Sub1_Sub2) local9.method571()) {
			@Pc(32) Class28 local32 = Class28.method410(local27.anInt226);
			@Pc(35) int local35 = local32.anInt573;
			if (local32.aBoolean141) {
				local35 *= local27.anInt227 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method567(local23);
		@Pc(65) Class2_Sub1_Sub1_Sub2 local65 = null;
		@Pc(67) Class2_Sub1_Sub1_Sub2 local67 = null;
		for (local27 = (Class2_Sub1_Sub1_Sub2) local9.method569(); local27 != null; local27 = (Class2_Sub1_Sub1_Sub2) local9.method571()) {
			if (local27.anInt226 != local23.anInt226 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt226 != local23.anInt226 && local27.anInt226 != local65.anInt226 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass27_1.method304(local65, arg1, local110, this.method624(arg1 * 128 + 64, this.anInt876, arg0 * 128 + 64), local67, arg0, 959, this.anInt876, local23);
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method648() {
		try {
			if (this.anInt866 == 2) {
				this.method692(this.anInt883 * 2, (this.anInt881 - this.anInt922 << 7) + this.anInt884, this.anInt981, (this.anInt882 - this.anInt923 << 7) + this.anInt885);
				if (this.anInt1018 > -1 && anInt1013 % 20 < 10) {
					this.aClass2_Sub1_Sub3_Sub2Array10[0].method277(this.anInt1019 - 28, this.anInt1018 - 12);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("85967, " + 6 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)Z")
	private boolean method649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass27_1.method327(this.anInt876, arg0, arg2, arg1);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt837++;
			if (anInt837 > 119) {
				anInt837 = 0;
				this.aClass2_Sub1_Sub2_7.method68(240);
				this.aClass2_Sub1_Sub2_7.method69(120);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(70) Class46 local70 = Class46.method546(local7);
				@Pc(78) int local78;
				@Pc(81) int local81;
				if (local31 == 0 || local31 == 2) {
					local78 = local70.anInt783;
					local81 = local70.anInt789;
				} else {
					local78 = local70.anInt789;
					local81 = local70.anInt783;
				}
				@Pc(92) int local92 = local70.anInt792;
				if (local31 != 0) {
					local92 = (local92 << local31 & 0xF) + (local92 >> 4 - local31);
				}
				this.method650(0, local92, arg2, true, (byte) 6, local78, arg0, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], local81, 0);
			} else {
				this.method650(local31, 0, arg2, true, (byte) 6, 0, arg0, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, local25 + 1);
			}
			this.anInt1000 = super.anInt824;
			this.anInt1001 = super.anInt825;
			this.anInt1003 = 2;
			this.anInt1002 = 0;
			return true;
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("8925, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -461 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method581() {
		try {
			if (this.aClass5_Sub1_1 != null) {
				this.aClass5_Sub1_1.method178();
			}
			this.aClass5_Sub1_1 = null;
			try {
				if (this.aClass47_1 != null) {
					this.aClass47_1.method557();
				}
			} catch (@Pc(18) Exception local18) {
			}
			this.aClass47_1 = null;
			this.aClass2_Sub1_Sub2_7 = null;
			this.aClass2_Sub1_Sub2_8 = null;
			this.aClass2_Sub1_Sub2_6 = null;
			this.aClass2_Sub1_Sub3_Sub4_8 = null;
			this.aClass2_Sub1_Sub3_Sub4_9 = null;
			this.aClass2_Sub1_Sub3_Sub4_10 = null;
			this.aClass2_Sub1_Sub3_Sub4_11 = null;
			this.aClass2_Sub1_Sub3_Sub4_12 = null;
			this.aClass2_Sub1_Sub3_Sub4_13 = null;
			this.aClass2_Sub1_Sub3_Sub4_14 = null;
			this.aClass2_Sub1_Sub3_Sub4_15 = null;
			if (this.aClass48_1 != null) {
				this.aClass48_1.aBoolean209 = false;
			}
			this.aClass48_1 = null;
			this.aClass2_Sub1_Sub2_9 = null;
			this.aClass2_Sub1_Sub3_Sub2_12 = null;
			this.aClass2_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray264 = null;
			this.aClass2_Sub1_Sub3_Sub2_3 = null;
			this.aClass2_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.aClass2_Sub1_Sub2Array1 = null;
			this.anIntArray267 = null;
			this.anIntArray268 = null;
			this.aStringArray9 = null;
			this.aLongArray3 = null;
			this.anIntArray227 = null;
			this.aClass2_Sub1_Sub3_Sub4Array4 = null;
			this.anIntArrayArray22 = null;
			this.aClass49_6 = null;
			this.aClass49_7 = null;
			this.aClass49_3 = null;
			this.aClass49_4 = null;
			this.aClass49_5 = null;
			this.aClass49_19 = null;
			this.aClass49_20 = null;
			this.aClass49_21 = null;
			this.aClass49_22 = null;
			this.aClass2_Sub1_Sub3_Sub2_4 = null;
			this.aClass2_Sub1_Sub3_Sub2_5 = null;
			this.aClass2_Sub1_Sub3_Sub2_6 = null;
			this.aClass2_Sub1_Sub3_Sub2_7 = null;
			this.aClass2_Sub1_Sub3_Sub2_8 = null;
			this.aClass50_12 = null;
			this.aClass50_11 = null;
			this.anIntArrayArray23 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray245 = null;
			this.anIntArray246 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			this.aClass2_Sub1_Sub3_Sub2Array6 = null;
			this.method646();
			this.aClass2_Sub1_Sub3_Sub4_1 = null;
			this.aClass2_Sub1_Sub3_Sub4_2 = null;
			this.aClass2_Sub1_Sub3_Sub4_3 = null;
			this.aClass2_Sub1_Sub3_Sub4_4 = null;
			this.aClass2_Sub1_Sub3_Sub4_5 = null;
			this.anIntArray269 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray270 = null;
			this.anIntArray271 = null;
			this.aClass2_Sub1_Sub3_Sub4Array5 = null;
			this.aClass2_Sub1_Sub3_Sub2Array8 = null;
			this.aClass49_15 = null;
			this.aClass49_16 = null;
			this.aClass49_17 = null;
			this.aClass49_18 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass27_1 = null;
			this.aClass30Array1 = null;
			this.aClass49_23 = null;
			this.aClass49_24 = null;
			this.aClass49_25 = null;
			this.aClass49_26 = null;
			this.aClass49_27 = null;
			this.aClass2_Sub1_Sub3_Sub2_15 = null;
			this.aClass2_Sub1_Sub3_Sub2Array9 = null;
			this.aClass2_Sub1_Sub3_Sub2Array5 = null;
			this.aClass2_Sub1_Sub3_Sub2Array7 = null;
			this.aClass2_Sub1_Sub3_Sub2Array10 = null;
			this.aClass2_Sub1_Sub3_Sub2Array4 = null;
			this.aClass2_Sub1_Sub3_Sub4_16 = null;
			this.aClass2_Sub1_Sub3_Sub4_17 = null;
			this.aClass2_Sub1_Sub3_Sub4_18 = null;
			this.aClass49_12 = null;
			this.aClass49_13 = null;
			this.aClass49_14 = null;
			this.aByteArray21 = null;
			this.aClass50ArrayArrayArray1 = null;
			this.aClass50_10 = null;
			this.aClass49_8 = null;
			this.aClass49_9 = null;
			this.aClass49_10 = null;
			this.aClass49_11 = null;
			this.anIntArray219 = null;
			this.anIntArray220 = null;
			this.anIntArray221 = null;
			this.anIntArray222 = null;
			this.aStringArray11 = null;
			this.method668((byte) 1);
			Class46.method547(this.anInt1012);
			Class32.method454(this.anInt1012);
			Class28.method405(this.anInt1012);
			Class10.method208(this.anInt1012);
			Class14.aClass14Array1 = null;
			Class25.aClass25Array1 = null;
			Class9.aClass9Array1 = null;
			Class33.aClass33Array1 = null;
			Class6.aClass6Array1 = null;
			Class6.aClass31_1 = null;
			Class23.aClass23Array1 = null;
			super.aClass49_2 = null;
			Class2_Sub1_Sub1_Sub1_Sub2.aClass31_4 = null;
			Class2_Sub1_Sub3_Sub3.method362(this.anInt1012);
			Class27.method296(this.anInt1012);
			Class2_Sub1_Sub1_Sub6.method508(this.anInt1012);
			Class4.method166(this.anInt1012);
			System.gc();
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("84783, " + false + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZBIIIIIII)Z")
	private boolean method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray23[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			@Pc(40) boolean local40 = false;
			local11 = arg8;
			@Pc(50) int local50 = arg9;
			this.anIntArrayArray23[arg8][arg9] = 99;
			this.anIntArrayArray24[arg8][arg9] = 0;
			@Pc(66) byte local66 = 0;
			@Pc(68) int local68 = 0;
			this.anIntArray245[0] = arg8;
			@Pc(77) int local77 = local66 + 1;
			this.anIntArray246[0] = arg9;
			@Pc(81) boolean local81 = false;
			@Pc(85) int local85 = this.anIntArray245.length;
			@Pc(92) int[][] local92 = this.aClass30Array1[this.anInt876].anIntArrayArray14;
			@Pc(203) int local203;
			while (local68 != local77) {
				local11 = this.anIntArray245[local68];
				local50 = this.anIntArray246[local68];
				local68 = (local68 + 1) % local85;
				if (local11 == arg6 && local50 == arg2) {
					local81 = true;
					break;
				}
				if (arg11 != 0) {
					if ((arg11 < 5 || arg11 == 10) && this.aClass30Array1[this.anInt876].method446(arg6, arg0, arg11 - 1, arg2, local50, local11)) {
						local81 = true;
						break;
					}
					if (arg11 < 10 && this.aClass30Array1[this.anInt876].method447(arg0, arg6, arg2, local11, arg11 - 1, local50)) {
						local81 = true;
						break;
					}
				}
				if (arg5 != 0 && arg10 != 0 && this.aClass30Array1[this.anInt876].method448(arg10, local50, arg5, local11, arg2, arg6, arg1)) {
					local81 = true;
					break;
				}
				local203 = this.anIntArrayArray24[local11][local50] + 1;
				if (local11 > 0 && this.anIntArrayArray23[local11 - 1][local50] == 0 && (local92[local11 - 1][local50] & 0x1280108) == 0) {
					this.anIntArray245[local77] = local11 - 1;
					this.anIntArray246[local77] = local50;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray23[local11 - 1][local50] = 2;
					this.anIntArrayArray24[local11 - 1][local50] = local203;
				}
				if (local11 < 103 && this.anIntArrayArray23[local11 + 1][local50] == 0 && (local92[local11 + 1][local50] & 0x1280180) == 0) {
					this.anIntArray245[local77] = local11 + 1;
					this.anIntArray246[local77] = local50;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray23[local11 + 1][local50] = 8;
					this.anIntArrayArray24[local11 + 1][local50] = local203;
				}
				if (local50 > 0 && this.anIntArrayArray23[local11][local50 - 1] == 0 && (local92[local11][local50 - 1] & 0x1280102) == 0) {
					this.anIntArray245[local77] = local11;
					this.anIntArray246[local77] = local50 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray23[local11][local50 - 1] = 1;
					this.anIntArrayArray24[local11][local50 - 1] = local203;
				}
				if (local50 < 103 && this.anIntArrayArray23[local11][local50 + 1] == 0 && (local92[local11][local50 + 1] & 0x1280120) == 0) {
					this.anIntArray245[local77] = local11;
					this.anIntArray246[local77] = local50 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray23[local11][local50 + 1] = 4;
					this.anIntArrayArray24[local11][local50 + 1] = local203;
				}
				if (local11 > 0 && local50 > 0 && this.anIntArrayArray23[local11 - 1][local50 - 1] == 0 && (local92[local11 - 1][local50 - 1] & 0x128010E) == 0 && (local92[local11 - 1][local50] & 0x1280108) == 0 && (local92[local11][local50 - 1] & 0x1280102) == 0) {
					this.anIntArray245[local77] = local11 - 1;
					this.anIntArray246[local77] = local50 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray23[local11 - 1][local50 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local50 - 1] = local203;
				}
				if (local11 < 103 && local50 > 0 && this.anIntArrayArray23[local11 + 1][local50 - 1] == 0 && (local92[local11 + 1][local50 - 1] & 0x1280183) == 0 && (local92[local11 + 1][local50] & 0x1280180) == 0 && (local92[local11][local50 - 1] & 0x1280102) == 0) {
					this.anIntArray245[local77] = local11 + 1;
					this.anIntArray246[local77] = local50 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray23[local11 + 1][local50 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local50 - 1] = local203;
				}
				if (local11 > 0 && local50 < 103 && this.anIntArrayArray23[local11 - 1][local50 + 1] == 0 && (local92[local11 - 1][local50 + 1] & 0x1280138) == 0 && (local92[local11 - 1][local50] & 0x1280108) == 0 && (local92[local11][local50 + 1] & 0x1280120) == 0) {
					this.anIntArray245[local77] = local11 - 1;
					this.anIntArray246[local77] = local50 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray23[local11 - 1][local50 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local50 + 1] = local203;
				}
				if (local11 < 103 && local50 < 103 && this.anIntArrayArray23[local11 + 1][local50 + 1] == 0 && (local92[local11 + 1][local50 + 1] & 0x12801E0) == 0 && (local92[local11 + 1][local50] & 0x1280180) == 0 && (local92[local11][local50 + 1] & 0x1280120) == 0) {
					this.anIntArray245[local77] = local11 + 1;
					this.anIntArray246[local77] = local50 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray23[local11 + 1][local50 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local50 + 1] = local203;
				}
			}
			this.anInt1041 = 0;
			@Pc(819) int local819;
			@Pc(825) int local825;
			@Pc(831) int local831;
			if (!local81) {
				if (!arg3) {
					return false;
				}
				local203 = 1000;
				local819 = 100;
				for (local825 = arg6 - 10; local825 <= arg6 + 10; local825++) {
					for (local831 = arg2 - 10; local831 <= arg2 + 10; local831++) {
						if (local825 >= 0 && local831 >= 0 && local825 < 104 && local831 < 104 && this.anIntArrayArray24[local825][local831] < 100) {
							@Pc(853) int local853 = 0;
							if (local825 < arg6) {
								local853 = arg6 - local825;
							} else if (local825 > arg6 + arg5 - 1) {
								local853 = local825 + 1 - arg6 - arg5;
							}
							@Pc(879) int local879 = 0;
							if (local831 < arg2) {
								local879 = arg2 - local831;
							} else if (local831 > arg2 + arg10 - 1) {
								local879 = local831 + 1 - arg2 - arg10;
							}
							@Pc(911) int local911 = local853 * local853 + local879 * local879;
							if (local911 < local203 || local911 == local203 && this.anIntArrayArray24[local825][local831] < local819) {
								local203 = local911;
								local819 = this.anIntArrayArray24[local825][local831];
								local11 = local825;
								local50 = local831;
							}
						}
					}
				}
				if (local203 == 1000) {
					return false;
				}
				if (local11 == arg8 && local50 == arg9) {
					return false;
				}
				this.anInt1041 = 1;
			}
			@Pc(972) byte local972 = 0;
			this.anIntArray245[0] = local11;
			local68 = local972 + 1;
			this.anIntArray246[0] = local50;
			local203 = local819 = this.anIntArrayArray23[local11][local50];
			while (local11 != arg8 || local50 != arg9) {
				if (local203 != local819) {
					local819 = local203;
					this.anIntArray245[local68] = local11;
					this.anIntArray246[local68++] = local50;
				}
				if ((local203 & 0x2) != 0) {
					local11++;
				} else if ((local203 & 0x8) != 0) {
					local11--;
				}
				if ((local203 & 0x1) != 0) {
					local50++;
				} else if ((local203 & 0x4) != 0) {
					local50--;
				}
				local203 = this.anIntArrayArray23[local11][local50];
			}
			if (local68 > 0) {
				local85 = local68;
				if (local68 > 25) {
					local85 = 25;
				}
				local68--;
				@Pc(1062) int local1062 = this.anIntArray245[local68];
				local825 = this.anIntArray246[local68];
				if (arg7 == 0) {
					this.aClass2_Sub1_Sub2_7.method68(129);
					this.aClass2_Sub1_Sub2_7.method69(local85 + local85 + 3);
				}
				if (arg7 == 1) {
					this.aClass2_Sub1_Sub2_7.method68(132);
					this.aClass2_Sub1_Sub2_7.method69(local85 + local85 + 3 + 14);
				}
				if (arg7 == 2) {
					this.aClass2_Sub1_Sub2_7.method68(211);
					this.aClass2_Sub1_Sub2_7.method69(local85 + local85 + 3);
				}
				this.aClass2_Sub1_Sub2_7.method97(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass2_Sub1_Sub2_7.method70(local825 + this.anInt923);
				this.anInt943 = this.anIntArray245[0];
				this.anInt944 = this.anIntArray246[0];
				for (local831 = 1; local831 < local85; local831++) {
					local68--;
					this.aClass2_Sub1_Sub2_7.method69(this.anIntArray245[local68] - local1062);
					this.aClass2_Sub1_Sub2_7.method97(this.anIntArray246[local68] - local825);
				}
				this.aClass2_Sub1_Sub2_7.method104(local1062 + this.anInt922);
				return true;
			} else if (arg7 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1194) RuntimeException local1194) {
			signlink.reporterror("37196, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1194.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method651(@OriginalArg(0) int arg0) {
		try {
			this.anInt829 = 0;
			@Pc(8) boolean local8 = false;
			@Pc(74) int local74;
			for (@Pc(10) int local10 = -1; local10 < this.anInt913 + this.anInt983; local10++) {
				@Pc(17) Class2_Sub1_Sub1_Sub1 local17;
				if (local10 == -1) {
					local17 = aClass2_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local10 < this.anInt913) {
					local17 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray240[local10]];
				} else {
					local17 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray264[local10 - this.anInt913]];
				}
				if (local17 != null && local17.method221(122)) {
					@Pc(58) Class32 local58;
					if (local17 instanceof Class2_Sub1_Sub1_Sub1_Sub1) {
						local58 = ((Class2_Sub1_Sub1_Sub1_Sub1) local17).aClass32_1;
						if (local58.anIntArray114 != null) {
							local58 = local58.method458();
						}
						if (local58 == null) {
							continue;
						}
					}
					if (local10 >= this.anInt913) {
						local58 = ((Class2_Sub1_Sub1_Sub1_Sub1) local17).aClass32_1;
						if (local58.anInt641 >= 0 && local58.anInt641 < this.aClass2_Sub1_Sub3_Sub2Array7.length) {
							this.method691(local17, local17.anInt356 + 15);
							if (this.anInt1018 > -1) {
								this.aClass2_Sub1_Sub3_Sub2Array7[local58.anInt641].method277(this.anInt1019 - 30, this.anInt1018 - 12);
							}
						}
						if (this.anInt866 == 1 && this.anInt852 == this.anIntArray264[local10 - this.anInt913] && anInt1013 % 20 < 10) {
							this.method691(local17, local17.anInt356 + 15);
							if (this.anInt1018 > -1) {
								this.aClass2_Sub1_Sub3_Sub2Array10[0].method277(this.anInt1019 - 28, this.anInt1018 - 12);
							}
						}
					} else {
						local74 = 30;
						@Pc(77) Class2_Sub1_Sub1_Sub1_Sub2 local77 = (Class2_Sub1_Sub1_Sub1_Sub2) local17;
						if (local77.anInt360 != -1 || local77.anInt366 != -1) {
							this.method691(local17, local17.anInt356 + 15);
							if (this.anInt1018 > -1) {
								if (local77.anInt360 != -1) {
									this.aClass2_Sub1_Sub3_Sub2Array5[local77.anInt360].method277(this.anInt1019 - 30, this.anInt1018 - 12);
									local74 += 25;
								}
								if (local77.anInt366 != -1) {
									this.aClass2_Sub1_Sub3_Sub2Array7[local77.anInt366].method277(this.anInt1019 - local74, this.anInt1018 - 12);
									local74 += 25;
								}
							}
						}
						if (local10 >= 0 && this.anInt866 == 10 && this.anInt964 == this.anIntArray240[local10]) {
							this.method691(local17, local17.anInt356 + 15);
							if (this.anInt1018 > -1) {
								this.aClass2_Sub1_Sub3_Sub2Array10[1].method277(this.anInt1019 - local74, this.anInt1018 - 12);
							}
						}
					}
					if (local17.aString10 != null && (local10 >= this.anInt913 || this.anInt1043 == 0 || this.anInt1043 == 3 || this.anInt1043 == 1 && this.method680((byte) 7, ((Class2_Sub1_Sub1_Sub1_Sub2) local17).aString11))) {
						this.method691(local17, local17.anInt356);
						if (this.anInt1018 > -1 && this.anInt829 < this.anInt830) {
							this.anIntArray215[this.anInt829] = this.aClass2_Sub1_Sub3_Sub1_4.method152(local17.aString10) / 2;
							this.anIntArray214[this.anInt829] = this.aClass2_Sub1_Sub3_Sub1_4.anInt167;
							this.anIntArray212[this.anInt829] = this.anInt1018;
							this.anIntArray213[this.anInt829] = this.anInt1019;
							this.anIntArray216[this.anInt829] = local17.anInt323;
							this.anIntArray217[this.anInt829] = local17.anInt331;
							this.anIntArray218[this.anInt829] = local17.anInt349;
							this.aStringArray8[this.anInt829++] = local17.aString10;
							if (this.anInt900 == 0 && local17.anInt331 >= 1 && local17.anInt331 <= 3) {
								this.anIntArray214[this.anInt829] += 10;
								this.anIntArray213[this.anInt829] += 5;
							}
							if (this.anInt900 == 0 && local17.anInt331 == 4) {
								this.anIntArray215[this.anInt829] = 60;
							}
							if (this.anInt900 == 0 && local17.anInt331 == 5) {
								this.anIntArray214[this.anInt829] += 5;
							}
						}
					}
					if (local17.anInt350 > anInt1013) {
						this.method691(local17, local17.anInt356 + 15);
						if (this.anInt1018 > -1) {
							local74 = local17.anInt351 * 30 / local17.anInt352;
							if (local74 > 30) {
								local74 = 30;
							}
							Class2_Sub1_Sub3.method388(65280, this.anInt1018 - 15, this.anInt1019 - 3, local74, 5);
							Class2_Sub1_Sub3.method388(16711680, this.anInt1018 + local74 - 15, this.anInt1019 - 3, 30 - local74, 5);
						}
					}
					for (local74 = 0; local74 < 4; local74++) {
						if (local17.anIntArray56[local74] > anInt1013) {
							this.method691(local17, local17.anInt356 / 2);
							if (this.anInt1018 > -1) {
								if (local74 == 1) {
									this.anInt1019 -= 20;
								}
								if (local74 == 2) {
									this.anInt1018 -= 15;
									this.anInt1019 -= 10;
								}
								if (local74 == 3) {
									this.anInt1018 += 15;
									this.anInt1019 -= 10;
								}
								this.aClass2_Sub1_Sub3_Sub2Array9[local17.anIntArray55[local74]].method277(this.anInt1019 - 12, this.anInt1018 - 12);
								this.aClass2_Sub1_Sub3_Sub1_2.method149(this.anInt1019 + 4, 0, String.valueOf(local17.anIntArray54[local74]), this.anInt1018);
								this.aClass2_Sub1_Sub3_Sub1_2.method149(this.anInt1019 + 3, 16777215, String.valueOf(local17.anIntArray54[local74]), this.anInt1018 - 1);
							}
						}
					}
				}
			}
			for (@Pc(614) int local614 = 0; local614 < this.anInt829; local614++) {
				local74 = this.anIntArray212[local614];
				@Pc(626) int local626 = this.anIntArray213[local614];
				@Pc(631) int local631 = this.anIntArray215[local614];
				@Pc(636) int local636 = this.anIntArray214[local614];
				@Pc(638) boolean local638 = true;
				while (local638) {
					local638 = false;
					for (@Pc(644) int local644 = 0; local644 < local614; local644++) {
						if (local626 + 2 > this.anIntArray213[local644] - this.anIntArray214[local644] && local626 - local636 < this.anIntArray213[local644] + 2 && local74 - local631 < this.anIntArray212[local644] + this.anIntArray215[local644] && local74 + local631 > this.anIntArray212[local644] - this.anIntArray215[local644] && this.anIntArray213[local644] - this.anIntArray214[local644] < local626) {
							local626 = this.anIntArray213[local644] - this.anIntArray214[local644];
							local638 = true;
						}
					}
				}
				this.anInt1018 = this.anIntArray212[local614];
				this.anInt1019 = this.anIntArray213[local614] = local626;
				@Pc(743) String local743 = this.aStringArray8[local614];
				if (this.anInt900 == 0) {
					@Pc(748) int local748 = 16776960;
					if (this.anIntArray216[local614] < 6) {
						local748 = this.anIntArray272[this.anIntArray216[local614]];
					}
					if (this.anIntArray216[local614] == 6) {
						local748 = this.anInt836 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray216[local614] == 7) {
						local748 = this.anInt836 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray216[local614] == 8) {
						local748 = this.anInt836 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(823) int local823;
					if (this.anIntArray216[local614] == 9) {
						local823 = 150 - this.anIntArray218[local614];
						if (local823 < 50) {
							local748 = local823 * 1280 + 16711680;
						} else if (local823 < 100) {
							local748 = 16776960 - (local823 - 50) * 327680;
						} else if (local823 < 150) {
							local748 = (local823 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray216[local614] == 10) {
						local823 = 150 - this.anIntArray218[local614];
						if (local823 < 50) {
							local748 = local823 * 5 + 16711680;
						} else if (local823 < 100) {
							local748 = 16711935 - (local823 - 50) * 327680;
						} else if (local823 < 150) {
							local748 = (local823 - 100) * 327680 + 255 - (local823 - 100) * 5;
						}
					}
					if (this.anIntArray216[local614] == 11) {
						local823 = 150 - this.anIntArray218[local614];
						if (local823 < 50) {
							local748 = 16777215 - local823 * 327685;
						} else if (local823 < 100) {
							local748 = (local823 - 50) * 327685 + 65280;
						} else if (local823 < 150) {
							local748 = 16777215 - (local823 - 100) * 327680;
						}
					}
					if (this.anIntArray217[local614] == 0) {
						this.aClass2_Sub1_Sub3_Sub1_4.method149(this.anInt1019 + 1, 0, local743, this.anInt1018);
						this.aClass2_Sub1_Sub3_Sub1_4.method149(this.anInt1019, local748, local743, this.anInt1018);
					}
					if (this.anIntArray217[local614] == 1) {
						this.aClass2_Sub1_Sub3_Sub1_4.method154(this.anInt1019 + 1, local743, this.anInt1018, this.anInt836, 0);
						this.aClass2_Sub1_Sub3_Sub1_4.method154(this.anInt1019, local743, this.anInt1018, this.anInt836, local748);
					}
					if (this.anIntArray217[local614] == 2) {
						this.aClass2_Sub1_Sub3_Sub1_4.method155(this.anInt836, 938, this.anInt1019 + 1, 0, this.anInt1018, local743);
						this.aClass2_Sub1_Sub3_Sub1_4.method155(this.anInt836, 938, this.anInt1019, local748, this.anInt1018, local743);
					}
					if (this.anIntArray217[local614] == 3) {
						this.aClass2_Sub1_Sub3_Sub1_4.method156(150 - this.anIntArray218[local614], this.anInt891, 0, this.anInt1018, this.anInt1019 + 1, local743, this.anInt836);
						this.aClass2_Sub1_Sub3_Sub1_4.method156(150 - this.anIntArray218[local614], this.anInt891, local748, this.anInt1018, this.anInt1019, local743, this.anInt836);
					}
					@Pc(1122) int local1122;
					if (this.anIntArray217[local614] == 4) {
						local823 = this.aClass2_Sub1_Sub3_Sub1_4.method152(local743);
						local1122 = (150 - this.anIntArray218[local614]) * (local823 + 100) / 150;
						Class2_Sub1_Sub3.method385(this.anInt1018 - 50, 0, this.anInt1018 + 50, 334);
						this.aClass2_Sub1_Sub3_Sub1_4.method153(this.anInt1019 + 1, local743, this.anInt1018 + 50 - local1122, 0);
						this.aClass2_Sub1_Sub3_Sub1_4.method153(this.anInt1019, local743, this.anInt1018 + 50 - local1122, local748);
						Class2_Sub1_Sub3.method384();
					}
					if (this.anIntArray217[local614] == 5) {
						local823 = 150 - this.anIntArray218[local614];
						local1122 = 0;
						if (local823 < 25) {
							local1122 = local823 - 25;
						} else if (local823 > 125) {
							local1122 = local823 - 125;
						}
						Class2_Sub1_Sub3.method385(0, this.anInt1019 - this.aClass2_Sub1_Sub3_Sub1_4.anInt167 - 1, 512, this.anInt1019 + 5);
						this.aClass2_Sub1_Sub3_Sub1_4.method149(this.anInt1019 + local1122 + 1, 0, local743, this.anInt1018);
						this.aClass2_Sub1_Sub3_Sub1_4.method149(this.anInt1019 + local1122, local748, local743, this.anInt1018);
						Class2_Sub1_Sub3.method384();
					}
				} else {
					this.aClass2_Sub1_Sub3_Sub1_4.method149(this.anInt1019 + 1, 0, local743, this.anInt1018);
					this.aClass2_Sub1_Sub3_Sub1_4.method149(this.anInt1019, 16776960, local743, this.anInt1018);
				}
			}
		} catch (@Pc(1272) RuntimeException local1272) {
			signlink.reporterror("97240, " + arg0 + ", " + local1272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method652(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt1036 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1036 > 768) {
						this.anIntArray236[local8] = this.method711(this.anIntArray238[local8], 47, this.anIntArray237[local8], 1024 - this.anInt1036);
					} else if (this.anInt1036 > 256) {
						this.anIntArray236[local8] = this.anIntArray238[local8];
					} else {
						this.anIntArray236[local8] = this.method711(this.anIntArray237[local8], 47, this.anIntArray238[local8], 256 - this.anInt1036);
					}
				}
			} else if (this.anInt1037 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1037 > 768) {
						this.anIntArray236[local8] = this.method711(this.anIntArray239[local8], 47, this.anIntArray237[local8], 1024 - this.anInt1037);
					} else if (this.anInt1037 > 256) {
						this.anIntArray236[local8] = this.anIntArray239[local8];
					} else {
						this.anIntArray236[local8] = this.method711(this.anIntArray237[local8], 47, this.anIntArray239[local8], 256 - this.anInt1037);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray236[local8] = this.anIntArray237[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass49_6.anIntArray209[local8] = this.aClass2_Sub1_Sub3_Sub2_13.anIntArray63[local8];
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
				local198 = this.anIntArray243[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray253[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray236[local220];
						local239 = this.aClass49_6.anIntArray209[local183];
						this.aClass49_6.anIntArray209[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass49_6.method564(super.aGraphics2, 0, 0);
			@Pc(303) boolean local303 = true;
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass49_7.anIntArray209[local198] = this.aClass2_Sub1_Sub3_Sub2_14.anIntArray63[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray243[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray253[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(366) int local366 = 256 - local228;
						local228 = this.anIntArray236[local228];
						@Pc(377) int local377 = this.aClass49_7.anIntArray209[local183];
						this.aClass49_7.anIntArray209[local183++] = ((local228 & 0xFF00FF) * local239 + (local377 & 0xFF00FF) * local366 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local377 & 0xFF00) * local366 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass49_7.method564(super.aGraphics2, 637, 0);
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("36771, " + arg0 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method653() {
		try {
			this.aClass49_16.method563();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt888 == 2) {
				@Pc(13) byte[] local13 = this.aClass2_Sub1_Sub3_Sub4_9.aByteArray14;
				@Pc(15) int[] local15 = Class2_Sub1_Sub3.anIntArray93;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass2_Sub1_Sub3_Sub2_15.method281(this.anIntArray231, 25, this.anInt969, 0, 256, this.anIntArray228, 33, 0, 25, 33);
				this.aClass49_17.method563();
				Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
			} else {
				@Pc(67) int local67 = this.anInt969 + this.anInt966 & 0x7FF;
				@Pc(74) int local74 = aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 / 32 + 48;
				local18 = 464 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 / 32;
				this.aClass2_Sub1_Sub3_Sub2_12.method281(this.anIntArray223, local74, local67, 5, this.anInt1014 + 256, this.anIntArray251, 151, 25, local18, 146);
				this.aClass2_Sub1_Sub3_Sub2_15.method281(this.anIntArray231, 25, this.anInt969, 0, 256, this.anIntArray228, 33, 0, 25, 33);
				for (local20 = 0; local20 < this.anInt945; local20++) {
					local74 = this.anIntArray247[local20] * 4 + 2 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 / 32;
					local18 = this.anIntArray248[local20] * 4 + 2 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 / 32;
					this.method636(local74, this.aClass2_Sub1_Sub3_Sub2Array6[local20], local18);
				}
				@Pc(175) int local175;
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					for (local175 = 0; local175 < 104; local175++) {
						@Pc(187) Class50 local187 = this.aClass50ArrayArrayArray1[this.anInt876][local171][local175];
						if (local187 != null) {
							local74 = local171 * 4 + 2 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 / 32;
							local18 = local175 * 4 + 2 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 / 32;
							this.method636(local74, this.aClass2_Sub1_Sub3_Sub2_4, local18);
						}
					}
				}
				for (local175 = 0; local175 < this.anInt983; local175++) {
					@Pc(238) Class2_Sub1_Sub1_Sub1_Sub1 local238 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray264[local175]];
					if (local238 != null && local238.method221(122)) {
						@Pc(247) Class32 local247 = local238.aClass32_1;
						if (local247.anIntArray114 != null) {
							local247 = local247.method458();
						}
						if (local247 != null && local247.aBoolean154 && local247.aBoolean155) {
							local74 = local238.anInt328 / 32 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 / 32;
							local18 = local238.anInt329 / 32 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 / 32;
							this.method636(local74, this.aClass2_Sub1_Sub3_Sub2_5, local18);
						}
					}
				}
				@Pc(306) Class2_Sub1_Sub1_Sub1_Sub2 local306;
				for (@Pc(296) int local296 = 0; local296 < this.anInt913; local296++) {
					local306 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray240[local296]];
					if (local306 != null && local306.method221(122)) {
						local74 = local306.anInt328 / 32 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 / 32;
						local18 = local306.anInt329 / 32 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 / 32;
						@Pc(334) boolean local334 = false;
						@Pc(338) long local338 = Class19.method231(local306.aString11);
						for (@Pc(340) int local340 = 0; local340 < this.anInt979; local340++) {
							if (local338 == this.aLongArray3[local340] && this.anIntArray227[local340] != 0) {
								local334 = true;
								break;
							}
						}
						@Pc(365) boolean local365 = false;
						if (aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt358 != 0 && local306.anInt358 != 0 && aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt358 == local306.anInt358) {
							local365 = true;
						}
						if (local334) {
							this.method636(local74, this.aClass2_Sub1_Sub3_Sub2_7, local18);
						} else if (local365) {
							this.method636(local74, this.aClass2_Sub1_Sub3_Sub2_8, local18);
						} else {
							this.method636(local74, this.aClass2_Sub1_Sub3_Sub2_6, local18);
						}
					}
				}
				if (this.anInt866 != 0 && anInt1013 % 20 < 10) {
					if (this.anInt866 == 1 && this.anInt852 >= 0 && this.anInt852 < this.aClass2_Sub1_Sub1_Sub1_Sub1Array1.length) {
						@Pc(439) Class2_Sub1_Sub1_Sub1_Sub1 local439 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[this.anInt852];
						if (local439 != null) {
							local74 = local439.anInt328 / 32 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 / 32;
							local18 = local439.anInt329 / 32 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 / 32;
							this.method615(local18, this.aClass2_Sub1_Sub3_Sub2_17, local74);
						}
					}
					if (this.anInt866 == 2) {
						local74 = (this.anInt881 - this.anInt922) * 4 + 2 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 / 32;
						local18 = (this.anInt882 - this.anInt923) * 4 + 2 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 / 32;
						this.method615(local18, this.aClass2_Sub1_Sub3_Sub2_17, local74);
					}
					if (this.anInt866 == 10 && this.anInt964 >= 0 && this.anInt964 < this.aClass2_Sub1_Sub1_Sub1_Sub2Array1.length) {
						local306 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[this.anInt964];
						if (local306 != null) {
							local74 = local306.anInt328 / 32 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 / 32;
							local18 = local306.anInt329 / 32 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 / 32;
							this.method615(local18, this.aClass2_Sub1_Sub3_Sub2_17, local74);
						}
					}
				}
				if (this.anInt943 != 0) {
					local74 = this.anInt943 * 4 + 2 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 / 32;
					local18 = this.anInt944 * 4 + 2 - aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 / 32;
					this.method636(local74, this.aClass2_Sub1_Sub3_Sub2_16, local18);
				}
				Class2_Sub1_Sub3.method388(16777215, 97, 78, 3, 3);
				this.aClass49_17.method563();
				Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
			}
		} catch (@Pc(607) RuntimeException local607) {
			signlink.reporterror("44936, " + 0 + ", " + local607.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method654() {
		try {
			if (this.anInt1023 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt862 != 0) {
					local5 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray14[local15] != null) {
						@Pc(27) int local27 = this.anIntArray273[local15];
						@Pc(32) String local32 = this.aStringArray13[local15];
						if (local32 != null && local32.startsWith("@cr1@")) {
							local32 = local32.substring(5);
						}
						if (local32 != null && local32.startsWith("@cr2@")) {
							local32 = local32.substring(5);
						}
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt961 == 0 || this.anInt961 == 1 && this.method680((byte) 7, local32))) {
							@Pc(85) int local85 = 329 - local5 * 13;
							if (super.anInt818 > 4 && super.anInt819 - 4 > local85 - 10 && super.anInt819 - 4 <= local85 + 3) {
								@Pc(124) int local124 = this.aClass2_Sub1_Sub3_Sub1_3.method151("From:  " + local32 + this.aStringArray14[local15]) + 25;
								if (local124 > 450) {
									local124 = 450;
								}
								if (super.anInt818 < local124 + 4) {
									if (this.anInt874 >= 1) {
										this.aStringArray11[this.anInt909] = "Report abuse @whi@" + local32;
										this.anIntArray221[this.anInt909] = 2414;
										this.anInt909++;
									}
									this.aStringArray11[this.anInt909] = "Add ignore @whi@" + local32;
									this.anIntArray221[this.anInt909] = 2872;
									this.anInt909++;
									this.aStringArray11[this.anInt909] = "Add friend @whi@" + local32;
									this.anIntArray221[this.anInt909] = 2106;
									this.anInt909++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local27 == 5 || local27 == 6) && this.anInt961 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(237) RuntimeException local237) {
			signlink.reporterror("5084, " + false + ", " + local237.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!BFQIDHPO;)V")
	private void method655(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		try {
			@Pc(6) int local6 = arg1.method90(8);
			@Pc(12) int local12;
			if (local6 < this.anInt913) {
				for (local12 = local6; local12 < this.anInt913; local12++) {
					this.anIntArray267[this.anInt1020++] = this.anIntArray240[local12];
				}
			}
			if (local6 > this.anInt913) {
				signlink.reporterror(this.aString26 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt913 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray240[local12];
				@Pc(69) Class2_Sub1_Sub1_Sub1_Sub2 local69 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local64];
				@Pc(74) int local74 = arg1.method90(1);
				if (local74 == 0) {
					this.anIntArray240[this.anInt913++] = local64;
					local69.anInt327 = anInt1013;
				} else {
					@Pc(97) int local97 = arg1.method90(2);
					if (local97 == 0) {
						this.anIntArray240[this.anInt913++] = local64;
						local69.anInt327 = anInt1013;
						this.anIntArray241[this.anInt914++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(159) int local159;
						if (local97 == 1) {
							this.anIntArray240[this.anInt913++] = local64;
							local69.anInt327 = anInt1013;
							local148 = arg1.method90(3);
							local69.method219(local148, this.aByte41, false);
							local159 = arg1.method90(1);
							if (local159 == 1) {
								this.anIntArray241[this.anInt914++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray240[this.anInt913++] = local64;
							local69.anInt327 = anInt1013;
							local148 = arg1.method90(3);
							local69.method219(local148, this.aByte41, true);
							local159 = arg1.method90(3);
							local69.method219(local159, this.aByte41, true);
							@Pc(219) int local219 = arg1.method90(1);
							if (local219 == 1) {
								this.anIntArray241[this.anInt914++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray267[this.anInt1020++] = local64;
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("51530, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method656(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray233[8] = 0;
			@Pc(10) int local10 = 0;
			@Pc(14) boolean local14 = false;
			while (this.anIntArray233[8] == 0) {
				@Pc(18) String local18 = "Unknown problem";
				this.method586("Connecting to web server", 20);
				try {
					@Pc(40) DataInputStream local40 = this.method633("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 367);
					@Pc(47) Class2_Sub1_Sub2 local47 = new Class2_Sub1_Sub2(new byte[40], -990);
					local40.readFully(local47.aByteArray1, 0, 40);
					local40.close();
					for (@Pc(57) int local57 = 0; local57 < 9; local57++) {
						this.anIntArray233[local57] = local47.method84();
					}
					@Pc(72) int local72 = local47.method84();
					@Pc(74) int local74 = 1234;
					for (@Pc(76) int local76 = 0; local76 < 9; local76++) {
						local74 = (local74 << 1) + this.anIntArray233[local76];
					}
					if (local72 != local74) {
						local18 = "checksum problem";
						this.anIntArray233[8] = 0;
					}
				} catch (@Pc(103) EOFException local103) {
					local18 = "EOF problem";
					this.anIntArray233[8] = 0;
				} catch (@Pc(112) IOException local112) {
					local18 = "connection problem";
					this.anIntArray233[8] = 0;
				} catch (@Pc(121) Exception local121) {
					local18 = "logic problem";
					this.anIntArray233[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray233[8] == 0) {
					local10++;
					for (@Pc(139) int local139 = local3; local139 > 0; local139--) {
						if (local10 >= 10) {
							this.method586("Game updated - please reload page", 10);
							local139 = 10;
						} else {
							this.method586(local18 + " - Will retry in " + local139 + " secs.", 10);
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
					this.aBoolean242 = !this.aBoolean242;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("37541, " + arg0 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method657() {
		try {
			this.aBoolean262 = true;
			try {
				@Pc(6) long local6 = System.currentTimeMillis();
				@Pc(8) int local8 = 0;
				@Pc(10) int local10 = 20;
				while (this.aBoolean223) {
					this.anInt985++;
					this.method630();
					this.method630();
					this.method652(9);
					local8++;
					if (local8 > 10) {
						@Pc(33) long local33 = System.currentTimeMillis();
						@Pc(42) int local42 = (int) (local33 - local6) / 10 - local10;
						local10 = 40 - local42;
						if (local10 < 5) {
							local10 = 5;
						}
						local8 = 0;
						local6 = local33;
					}
					try {
						Thread.sleep((long) local10);
					} catch (@Pc(60) Exception local60) {
					}
				}
			} catch (@Pc(66) Exception local66) {
			}
			this.aBoolean262 = false;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("96507, " + 0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method658(@OriginalArg(0) boolean arg0) {
		try {
			Class46.aClass31_8.method451();
			Class46.aClass31_9.method451();
			Class32.aClass31_7.method451();
			Class28.aClass31_6.method451();
			if (arg0) {
				this.anInt896 = -90;
			}
			Class28.aClass31_5.method451();
			Class2_Sub1_Sub1_Sub1_Sub2.aClass31_4.method451();
			Class6.aClass31_1.method451();
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("42868, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method659() {
		try {
			if (super.anInt823 == 1) {
				if (super.anInt824 >= 539 && super.anInt824 <= 573 && super.anInt825 >= 169 && super.anInt825 < 205 && this.anIntArray255[0] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 0;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 569 && super.anInt824 <= 599 && super.anInt825 >= 168 && super.anInt825 < 205 && this.anIntArray255[1] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 1;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 597 && super.anInt824 <= 627 && super.anInt825 >= 168 && super.anInt825 < 205 && this.anIntArray255[2] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 2;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 625 && super.anInt824 <= 669 && super.anInt825 >= 168 && super.anInt825 < 203 && this.anIntArray255[3] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 3;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 666 && super.anInt824 <= 696 && super.anInt825 >= 168 && super.anInt825 < 205 && this.anIntArray255[4] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 4;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 694 && super.anInt824 <= 724 && super.anInt825 >= 168 && super.anInt825 < 205 && this.anIntArray255[5] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 5;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 722 && super.anInt824 <= 756 && super.anInt825 >= 169 && super.anInt825 < 205 && this.anIntArray255[6] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 6;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 540 && super.anInt824 <= 574 && super.anInt825 >= 466 && super.anInt825 < 502 && this.anIntArray255[7] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 7;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 572 && super.anInt824 <= 602 && super.anInt825 >= 466 && super.anInt825 < 503 && this.anIntArray255[8] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 8;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 599 && super.anInt824 <= 629 && super.anInt825 >= 466 && super.anInt825 < 503 && this.anIntArray255[9] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 9;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 627 && super.anInt824 <= 671 && super.anInt825 >= 467 && super.anInt825 < 502 && this.anIntArray255[10] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 10;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 669 && super.anInt824 <= 699 && super.anInt825 >= 466 && super.anInt825 < 503 && this.anIntArray255[11] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 11;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 696 && super.anInt824 <= 726 && super.anInt825 >= 466 && super.anInt825 < 503 && this.anIntArray255[12] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 12;
					this.aBoolean248 = true;
				}
				if (super.anInt824 >= 724 && super.anInt824 <= 758 && super.anInt825 >= 466 && super.anInt825 < 502 && this.anIntArray255[13] != -1) {
					this.aBoolean255 = true;
					this.anInt946 = 13;
					this.aBoolean248 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("26492, " + 98 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!IOPHRJNF;I)V")
	private void method660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != aClass2_Sub1_Sub1_Sub1_Sub2_1 && this.anInt909 < 400) {
				@Pc(42) String local42;
				if (arg2.anInt361 == 0) {
					local42 = arg2.aString11 + method605(aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt376, arg2.anInt376) + " (level-" + arg2.anInt376 + ")";
				} else {
					local42 = arg2.aString11 + " (skill-" + arg2.anInt361 + ")";
				}
				@Pc(172) int local172;
				if (this.anInt992 == 1) {
					this.aStringArray11[this.anInt909] = "Use " + this.aString29 + " with @whi@" + local42;
					this.anIntArray221[this.anInt909] = 453;
					this.anIntArray222[this.anInt909] = arg0;
					this.anIntArray219[this.anInt909] = arg3;
					this.anIntArray220[this.anInt909] = arg1;
					this.anInt909++;
				} else if (this.anInt838 != 1) {
					for (local172 = 4; local172 >= 0; local172--) {
						if (this.aStringArray12[local172] != null) {
							this.aStringArray11[this.anInt909] = this.aStringArray12[local172] + " @whi@" + local42;
							@Pc(199) short local199 = 0;
							if (this.aStringArray12[local172].equalsIgnoreCase("attack")) {
								if (arg2.anInt376 > aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt376) {
									local199 = 2000;
								}
								if (aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt358 != 0 && arg2.anInt358 != 0) {
									if (aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt358 == arg2.anInt358) {
										local199 = 2000;
									} else {
										local199 = 0;
									}
								}
							} else if (this.aBooleanArray12[local172]) {
								local199 = 2000;
							}
							if (local172 == 0) {
								this.anIntArray221[this.anInt909] = local199 + 403;
							}
							if (local172 == 1) {
								this.anIntArray221[this.anInt909] = local199 + 124;
							}
							if (local172 == 2) {
								this.anIntArray221[this.anInt909] = local199 + 764;
							}
							if (local172 == 3) {
								this.anIntArray221[this.anInt909] = local199 + 246;
							}
							if (local172 == 4) {
								this.anIntArray221[this.anInt909] = local199 + 329;
							}
							this.anIntArray222[this.anInt909] = arg0;
							this.anIntArray219[this.anInt909] = arg3;
							this.anIntArray220[this.anInt909] = arg1;
							this.anInt909++;
						}
					}
				} else if ((this.anInt840 & 0x8) == 8) {
					this.aStringArray11[this.anInt909] = this.aString18 + " @whi@" + local42;
					this.anIntArray221[this.anInt909] = 322;
					this.anIntArray222[this.anInt909] = arg0;
					this.anIntArray219[this.anInt909] = arg3;
					this.anIntArray220[this.anInt909] = arg1;
					this.anInt909++;
				}
				for (local172 = 0; local172 < this.anInt909; local172++) {
					if (this.anIntArray221[local172] == 903) {
						this.aStringArray11[local172] = "Walk here @whi@" + local42;
						return;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("6077, " + arg0 + ", " + -10739 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = 2048 - arg6 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg0 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg5;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class2_Sub1_Sub1_Sub6.anIntArray179[local5];
				local27 = Class2_Sub1_Sub1_Sub6.anIntArray180[local5];
				local37 = local27 * 0 - arg5 * local23 >> 16;
				local17 = local23 * 0 + arg5 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class2_Sub1_Sub1_Sub6.anIntArray179[local11];
				local27 = Class2_Sub1_Sub1_Sub6.anIntArray180[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt1007 = arg4 - local13;
			this.anInt1008 = arg3 - local15;
			if (arg1 != 6332) {
				this.anInt857 = -1;
			}
			this.anInt1009 = arg2 - local17;
			this.anInt1010 = arg6;
			this.anInt1011 = arg0;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("97319, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method662() {
		try {
			try {
				if (this.aClass47_1 != null) {
					this.aClass47_1.method557();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass47_1 = null;
			this.aBoolean227 = false;
			this.anInt895 = 0;
			this.aString26 = "";
			this.aString27 = "";
			this.method658(this.aBoolean253);
			this.aClass27_1.method297();
			for (@Pc(43) int local43 = 0; local43 < 4; local43++) {
				this.aClass30Array1[local43].method437();
			}
			System.gc();
			this.method646();
			this.anInt908 = -1;
			this.anInt889 = -1;
			this.anInt1061 = 0;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("14531, " + 0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)V")
	private void method663(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		try {
			this.aBoolean227 &= true;
			@Pc(17) int local17;
			if (this.aClass49_17 != null) {
				this.aClass49_17.method563();
				Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
				local17 = 151;
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass2_Sub1_Sub3_Sub1_3.method149(local17, 0, arg1, 257);
				this.aClass2_Sub1_Sub3_Sub1_3.method149(local17 - 1, 16777215, arg1, 256);
				local17 += 15;
				if (arg0 != null) {
					this.aClass2_Sub1_Sub3_Sub1_3.method149(local17, 0, arg0, 257);
					this.aClass2_Sub1_Sub3_Sub1_3.method149(local17 - 1, 16777215, arg0, 256);
				}
				this.aClass49_17.method564(super.aGraphics2, 4, 4);
			} else if (super.aClass49_2 != null) {
				super.aClass49_2.method563();
				Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray262;
				local17 = 251;
				Class2_Sub1_Sub3.method388(0, 233, 221, 300, 50);
				Class2_Sub1_Sub3.method389(221, 16777215, 233, 50, 300);
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass2_Sub1_Sub3_Sub1_3.method149(local17, 0, arg1, 383);
				this.aClass2_Sub1_Sub3_Sub1_3.method149(local17 - 1, 16777215, arg1, 382);
				local17 += 15;
				if (arg0 != null) {
					this.aClass2_Sub1_Sub3_Sub1_3.method149(local17, 0, arg0, 383);
					this.aClass2_Sub1_Sub3_Sub1_3.method149(local17 - 1, 16777215, arg0, 382);
				}
				super.aClass49_2.method564(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("69548, " + true + ", " + arg0 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method664(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean244) {
				for (@Pc(16) int local16 = 0; local16 < this.anIntArray244.length; local16++) {
					@Pc(23) int local23 = this.anIntArray244[local16];
					if (Class2_Sub1_Sub3_Sub3.anIntArray91[local23] >= arg0) {
						@Pc(32) Class2_Sub1_Sub3_Sub4 local32 = Class2_Sub1_Sub3_Sub3.aClass2_Sub1_Sub3_Sub4Array1[local23];
						@Pc(40) int local40 = local32.anInt566 * local32.anInt567 - 1;
						@Pc(48) int local48 = local32.anInt566 * this.anInt1046 * 2;
						@Pc(51) byte[] local51 = local32.aByteArray14;
						@Pc(54) byte[] local54 = this.aByteArray21;
						for (@Pc(56) int local56 = 0; local56 <= local40; local56++) {
							local54[local56] = local51[local56 - local48 & local40];
						}
						local32.aByteArray14 = local54;
						this.aByteArray21 = local51;
						Class2_Sub1_Sub3_Sub3.method369(local23);
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("21014, " + arg0 + ", " + 6 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method665() {
		try {
			@Pc(7) byte[] local7 = this.aClass39_2.method489("title.dat", null);
			@Pc(13) Class2_Sub1_Sub3_Sub2 local13 = new Class2_Sub1_Sub3_Sub2(local7, this);
			this.aClass49_6.method563();
			local13.method275(0, 0);
			this.aClass49_7.method563();
			local13.method275(0, -637);
			this.aClass49_3.method563();
			local13.method275(0, -128);
			this.aClass49_4.method563();
			local13.method275(-371, -202);
			this.aClass49_5.method563();
			local13.method275(-171, -202);
			this.aClass49_8.method563();
			local13.method275(-265, 0);
			this.aClass49_9.method563();
			local13.method275(-265, -562);
			this.aClass49_10.method563();
			local13.method275(-171, -128);
			this.aClass49_11.method563();
			local13.method275(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt464];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt465; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt464; local104++) {
					local98[local104] = local13.anIntArray63[local13.anInt464 + local13.anInt464 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt464; local130++) {
					local13.anIntArray63[local130 + local13.anInt464 * local100] = local98[local130];
				}
			}
			this.aClass49_6.method563();
			local13.method275(0, 382);
			this.aClass49_7.method563();
			local13.method275(0, -255);
			this.aClass49_3.method563();
			local13.method275(0, 254);
			this.aClass49_4.method563();
			local13.method275(-371, 180);
			this.aClass49_5.method563();
			local13.method275(-171, 180);
			this.aClass49_8.method563();
			local13.method275(-265, 382);
			this.aClass49_9.method563();
			local13.method275(-265, -180);
			this.aClass49_10.method563();
			local13.method275(-171, 254);
			this.aClass49_11.method563();
			local13.method275(-171, -180);
			local13 = new Class2_Sub1_Sub3_Sub2(this.aClass39_2, "logo", 0);
			this.aClass49_3.method563();
			local13.method277(18, 382 - local13.anInt464 / 2 - 128);
			System.gc();
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("98966, " + 20060 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method666() {
		try {
			anInt941++;
			if (anInt941 > 122) {
				anInt941 = 0;
				this.aClass2_Sub1_Sub2_7.method68(58);
				this.aClass2_Sub1_Sub2_7.method73(0);
			}
			while (true) {
				@Pc(33) int local33;
				do {
					while (true) {
						local33 = this.method578();
						if (local33 == -1) {
							return;
						}
						if (this.anInt976 != -1 && this.anInt976 == this.anInt937) {
							if (local33 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							}
							break;
						}
						@Pc(213) int local213;
						if (this.aBoolean238) {
							if (local33 >= 32 && local33 <= 122 && this.aString17.length() < 80) {
								this.aString17 = this.aString17 + (char) local33;
								this.aBoolean224 = true;
							}
							if (local33 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean224 = true;
							}
							if (local33 == 13 || local33 == 10) {
								this.aBoolean238 = false;
								this.aBoolean224 = true;
								@Pc(173) long local173;
								if (this.anInt1062 == 1) {
									local173 = Class19.method231(this.aString17);
									this.method599(local173);
								}
								if (this.anInt1062 == 2 && this.anInt979 > 0) {
									local173 = Class19.method231(this.aString17);
									this.method719(local173);
								}
								if (this.anInt1062 == 3 && this.aString17.length() > 0) {
									this.aClass2_Sub1_Sub2_7.method68(21);
									this.aClass2_Sub1_Sub2_7.method69(0);
									local213 = this.aClass2_Sub1_Sub2_7.anInt123;
									this.aClass2_Sub1_Sub2_7.method75(this.anInt1053, this.aLong32);
									Class26.method294(this.aClass2_Sub1_Sub2_7, this.aString17);
									this.aClass2_Sub1_Sub2_7.method78(this.aClass2_Sub1_Sub2_7.anInt123 - local213);
									this.aString17 = Class26.method295(this.aString17);
									this.aString17 = Class1.method11(this.aString17);
									this.method626(Class19.method235(Class19.method232(this.aLong32)), this.aString17, 6, this.anInt916);
									if (this.anInt961 == 2) {
										this.anInt961 = 1;
										this.aBoolean257 = true;
										this.aClass2_Sub1_Sub2_7.method68(83);
										this.aClass2_Sub1_Sub2_7.method69(this.anInt1043);
										this.aClass2_Sub1_Sub2_7.method69(this.anInt961);
										this.aClass2_Sub1_Sub2_7.method69(this.anInt1035);
									}
								}
								if (this.anInt1062 == 4 && this.anInt982 < 100) {
									local173 = Class19.method231(this.aString17);
									this.method638(local173);
								}
								if (this.anInt1062 == 5 && this.anInt982 > 0) {
									local173 = Class19.method231(this.aString17);
									this.method606(local173);
								}
							}
						} else if (this.anInt1054 == 1) {
							if (local33 >= 48 && local33 <= 57 && this.aString28.length() < 10) {
								this.aString28 = this.aString28 + (char) local33;
								this.aBoolean224 = true;
							}
							if (local33 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
								this.aBoolean224 = true;
							}
							if (local33 == 13 || local33 == 10) {
								if (this.aString28.length() > 0) {
									local213 = 0;
									try {
										local213 = Integer.parseInt(this.aString28);
									} catch (@Pc(392) Exception local392) {
									}
									this.aClass2_Sub1_Sub2_7.method68(234);
									this.aClass2_Sub1_Sub2_7.method73(local213);
								}
								this.anInt1054 = 0;
								this.aBoolean224 = true;
							}
						} else if (this.anInt1054 == 2) {
							if (local33 >= 32 && local33 <= 122 && this.aString28.length() < 12) {
								this.aString28 = this.aString28 + (char) local33;
								this.aBoolean224 = true;
							}
							if (local33 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
								this.aBoolean224 = true;
							}
							if (local33 == 13 || local33 == 10) {
								if (this.aString28.length() > 0) {
									this.aClass2_Sub1_Sub2_7.method68(40);
									this.aClass2_Sub1_Sub2_7.method75(this.anInt1053, Class19.method231(this.aString28));
								}
								this.anInt1054 = 0;
								this.aBoolean224 = true;
							}
						} else if (this.anInt1054 == 3) {
							if (local33 >= 32 && local33 <= 122 && this.aString28.length() < 40) {
								this.aString28 = this.aString28 + (char) local33;
								this.aBoolean224 = true;
							}
							if (local33 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
								this.aBoolean224 = true;
							}
						} else if (this.anInt965 == -1 && this.anInt910 == -1) {
							if (local33 >= 32 && local33 <= 122 && this.aString21.length() < 80) {
								this.aString21 = this.aString21 + (char) local33;
								this.aBoolean224 = true;
							}
							if (local33 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
								this.aBoolean224 = true;
							}
							if ((local33 == 13 || local33 == 10) && this.aString21.length() > 0) {
								if (this.anInt874 == 2) {
									if (this.aString21.equals("::clientdrop")) {
										this.method591();
									}
									if (this.aString21.equals("::lag")) {
										this.method702(744);
									}
									if (this.aString21.equals("::prefetchmusic")) {
										for (local213 = 0; local213 < this.aClass5_Sub1_1.method176(2); local213++) {
											this.aClass5_Sub1_1.method190(2, local213, (byte) 1);
										}
									}
									if (this.aString21.equals("::fpson")) {
										aBoolean219 = true;
									}
									if (this.aString21.equals("::fpsoff")) {
										aBoolean219 = false;
									}
									if (this.aString21.equals("::noclip")) {
										for (local213 = 0; local213 < 4; local213++) {
											for (@Pc(678) int local678 = 1; local678 < 103; local678++) {
												for (@Pc(682) int local682 = 1; local682 < 103; local682++) {
													this.aClass30Array1[local213].anIntArrayArray14[local678][local682] = 0;
												}
											}
										}
									}
								}
								if (this.aString21.startsWith("::")) {
									this.aClass2_Sub1_Sub2_7.method68(33);
									this.aClass2_Sub1_Sub2_7.method69(this.aString21.length() - 1);
									this.aClass2_Sub1_Sub2_7.method76(this.aString21.substring(2));
								} else {
									@Pc(737) String local737 = this.aString21.toLowerCase();
									@Pc(739) byte local739 = 0;
									if (local737.startsWith("yellow:")) {
										local739 = 0;
										this.aString21 = this.aString21.substring(7);
									} else if (local737.startsWith("red:")) {
										local739 = 1;
										this.aString21 = this.aString21.substring(4);
									} else if (local737.startsWith("green:")) {
										local739 = 2;
										this.aString21 = this.aString21.substring(6);
									} else if (local737.startsWith("cyan:")) {
										local739 = 3;
										this.aString21 = this.aString21.substring(5);
									} else if (local737.startsWith("purple:")) {
										local739 = 4;
										this.aString21 = this.aString21.substring(7);
									} else if (local737.startsWith("white:")) {
										local739 = 5;
										this.aString21 = this.aString21.substring(6);
									} else if (local737.startsWith("flash1:")) {
										local739 = 6;
										this.aString21 = this.aString21.substring(7);
									} else if (local737.startsWith("flash2:")) {
										local739 = 7;
										this.aString21 = this.aString21.substring(7);
									} else if (local737.startsWith("flash3:")) {
										local739 = 8;
										this.aString21 = this.aString21.substring(7);
									} else if (local737.startsWith("glow1:")) {
										local739 = 9;
										this.aString21 = this.aString21.substring(6);
									} else if (local737.startsWith("glow2:")) {
										local739 = 10;
										this.aString21 = this.aString21.substring(6);
									} else if (local737.startsWith("glow3:")) {
										local739 = 11;
										this.aString21 = this.aString21.substring(6);
									}
									local737 = this.aString21.toLowerCase();
									@Pc(911) byte local911 = 0;
									if (local737.startsWith("wave:")) {
										local911 = 1;
										this.aString21 = this.aString21.substring(5);
									} else if (local737.startsWith("wave2:")) {
										local911 = 2;
										this.aString21 = this.aString21.substring(6);
									} else if (local737.startsWith("shake:")) {
										local911 = 3;
										this.aString21 = this.aString21.substring(6);
									} else if (local737.startsWith("scroll:")) {
										local911 = 4;
										this.aString21 = this.aString21.substring(7);
									} else if (local737.startsWith("slide:")) {
										local911 = 5;
										this.aString21 = this.aString21.substring(6);
									}
									this.aClass2_Sub1_Sub2_7.method68(183);
									this.aClass2_Sub1_Sub2_7.method69(0);
									@Pc(992) int local992 = this.aClass2_Sub1_Sub2_7.anInt123;
									this.aClass2_Sub1_Sub2_7.method95(local739);
									this.aClass2_Sub1_Sub2_9.anInt123 = 0;
									Class26.method294(this.aClass2_Sub1_Sub2_9, this.aString21);
									this.aClass2_Sub1_Sub2_7.method115(this.aClass2_Sub1_Sub2_9.aByteArray1, this.aClass2_Sub1_Sub2_9.anInt123);
									this.aClass2_Sub1_Sub2_7.method95(local911);
									this.aClass2_Sub1_Sub2_7.method78(this.aClass2_Sub1_Sub2_7.anInt123 - local992);
									this.aString21 = Class26.method295(this.aString21);
									this.aString21 = Class1.method11(this.aString21);
									aClass2_Sub1_Sub1_Sub1_Sub2_1.aString10 = this.aString21;
									aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt323 = local739;
									aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt331 = local911;
									aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt349 = 150;
									if (this.anInt874 == 2) {
										this.method626("@cr2@" + aClass2_Sub1_Sub1_Sub1_Sub2_1.aString11, aClass2_Sub1_Sub1_Sub1_Sub2_1.aString10, 2, this.anInt916);
									} else if (this.anInt874 == 1) {
										this.method626("@cr1@" + aClass2_Sub1_Sub1_Sub1_Sub2_1.aString11, aClass2_Sub1_Sub1_Sub1_Sub2_1.aString10, 2, this.anInt916);
									} else {
										this.method626(aClass2_Sub1_Sub1_Sub1_Sub2_1.aString11, aClass2_Sub1_Sub1_Sub1_Sub2_1.aString10, 2, this.anInt916);
									}
									if (this.anInt1043 == 2) {
										this.anInt1043 = 3;
										this.aBoolean257 = true;
										this.aClass2_Sub1_Sub2_7.method68(83);
										this.aClass2_Sub1_Sub2_7.method69(this.anInt1043);
										this.aClass2_Sub1_Sub2_7.method69(this.anInt961);
										this.aClass2_Sub1_Sub2_7.method69(this.anInt1035);
									}
								}
								this.aString21 = "";
								this.aBoolean224 = true;
							}
						}
					}
				} while ((local33 < 97 || local33 > 122) && (local33 < 65 || local33 > 90) && (local33 < 48 || local33 > 57) && local33 != 32);
				if (this.aString30.length() < 12) {
					this.aString30 = this.aString30 + (char) local33;
				}
			}
		} catch (@Pc(1148) RuntimeException local1148) {
			signlink.reporterror("19779, " + -69 + ", " + local1148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)Z")
	private boolean method667(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("17775, " + false + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method668(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean223 = false;
			while (this.aBoolean262) {
				this.aBoolean223 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass2_Sub1_Sub3_Sub4_6 = null;
			this.aClass2_Sub1_Sub3_Sub4_7 = null;
			this.aClass2_Sub1_Sub3_Sub4Array3 = null;
			this.anIntArray236 = null;
			this.anIntArray237 = null;
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.anIntArray253 = null;
			this.anIntArray254 = null;
			@Pc(55) boolean local55 = false;
			this.aClass2_Sub1_Sub3_Sub2_13 = null;
			this.aClass2_Sub1_Sub3_Sub2_14 = null;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("11332, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method669(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass49_18 == null) {
				this.method668((byte) 1);
				super.aClass49_2 = null;
				this.aClass49_3 = null;
				this.aClass49_4 = null;
				this.aClass49_5 = null;
				this.aClass49_6 = null;
				@Pc(25) int local25 = 18 / arg0;
				this.aClass49_7 = null;
				this.aClass49_8 = null;
				this.aClass49_9 = null;
				this.aClass49_10 = null;
				this.aClass49_11 = null;
				this.aClass49_18 = new Class49(anInt871, this.method584(), 479, 96);
				this.aClass49_16 = new Class49(anInt871, this.method584(), 172, 156);
				Class2_Sub1_Sub3.method386();
				this.aClass2_Sub1_Sub3_Sub4_9.method400(0, 0);
				this.aClass49_15 = new Class49(anInt871, this.method584(), 190, 261);
				this.aClass49_17 = new Class49(anInt871, this.method584(), 512, 334);
				Class2_Sub1_Sub3.method386();
				this.aClass49_12 = new Class49(anInt871, this.method584(), 496, 50);
				this.aClass49_13 = new Class49(anInt871, this.method584(), 269, 37);
				this.aClass49_14 = new Class49(anInt871, this.method584(), 249, 45);
				this.aBoolean263 = true;
				this.aClass49_17.method563();
				Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("95694, " + arg0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method670() {
		try {
			@Pc(15) int local15;
			for (@Pc(7) int local7 = -1; local7 < this.anInt913; local7++) {
				if (local7 == -1) {
					local15 = this.anInt912;
				} else {
					local15 = this.anIntArray240[local7];
				}
				@Pc(27) Class2_Sub1_Sub1_Sub1_Sub2 local27 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local15];
				if (local27 != null && local27.anInt349 > 0) {
					local27.anInt349--;
					if (local27.anInt349 == 0) {
						local27.aString10 = null;
					}
				}
			}
			for (local15 = 0; local15 < this.anInt983; local15++) {
				@Pc(58) int local58 = this.anIntArray264[local15];
				@Pc(63) Class2_Sub1_Sub1_Sub1_Sub1 local63 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local58];
				if (local63 != null && local63.anInt349 > 0) {
					local63.anInt349--;
					if (local63.anInt349 == 0) {
						local63.aString10 = null;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("96752, " + 8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method671(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt906 = 0;
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
						this.anInt906 = 0;
						label49: for (local21 = 0; local21 < Class28.anInt598; local21++) {
							@Pc(82) Class28 local82 = Class28.method410(local21);
							if (local82.anInt579 == -1 && local82.aString13 != null) {
								@Pc(93) String local93 = local82.aString13.toLowerCase();
								for (@Pc(95) int local95 = 0; local95 < local17; local95++) {
									if (local93.indexOf(local15[local95]) == -1) {
										continue label49;
									}
								}
								this.aStringArray10[this.anInt906] = local93;
								this.anIntArray235[this.anInt906] = local21;
								this.anInt906++;
								if (this.anInt906 >= this.aStringArray10.length) {
									return;
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
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("7177, " + arg0 + ", " + -187 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private String method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 < 999999999 ? String.valueOf(arg1) : "*";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("65414, " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method673() {
		try {
			if (this.anInt932 == 0) {
				this.aStringArray11[0] = "Cancel";
				this.anIntArray221[0] = 1844;
				this.anInt909 = 1;
				if (this.anInt910 == -1) {
					this.method654();
					this.anInt957 = 0;
					this.anInt899 = 0;
					if (super.anInt818 > 4 && super.anInt819 > 4 && super.anInt818 < 516 && super.anInt819 < 338) {
						if (this.anInt976 == -1) {
							this.method705();
						} else {
							this.method644(super.anInt818, 4, 4, super.anInt819, 0, Class10.method204(this.anInt976), 0);
						}
					}
					if (this.anInt957 != this.anInt1006) {
						this.anInt1006 = this.anInt957;
					}
					if (this.anInt899 != this.anInt878) {
						this.anInt878 = this.anInt899;
					}
					this.anInt957 = 0;
					this.anInt899 = 0;
					if (super.anInt818 > 553 && super.anInt819 > 205 && super.anInt818 < 743 && super.anInt819 < 466) {
						if (this.anInt1048 != -1) {
							this.method644(super.anInt818, 553, 205, super.anInt819, 1, Class10.method204(this.anInt1048), 0);
						} else if (this.anIntArray255[this.anInt946] != -1) {
							this.method644(super.anInt818, 553, 205, super.anInt819, 1, Class10.method204(this.anIntArray255[this.anInt946]), 0);
						}
					}
					if (this.anInt957 != this.anInt875) {
						this.aBoolean255 = true;
						this.anInt875 = this.anInt957;
					}
					if (this.anInt899 != this.anInt853) {
						this.aBoolean255 = true;
						this.anInt853 = this.anInt899;
					}
					this.anInt957 = 0;
					this.anInt899 = 0;
					if (super.anInt818 > 17 && super.anInt819 > 357 && super.anInt818 < 496 && super.anInt819 < 453) {
						if (this.anInt965 != -1) {
							this.method644(super.anInt818, 17, 357, super.anInt819, 2, Class10.method204(this.anInt965), 0);
						} else if (this.anInt1005 != -1) {
							this.method644(super.anInt818, 17, 357, super.anInt819, 3, Class10.method204(this.anInt1005), 0);
						} else if (super.anInt819 < 434 && super.anInt818 < 426 && this.anInt1054 == 0) {
							this.method610(super.anInt819 - 357, super.anInt818 - 17);
						}
					}
					if ((this.anInt965 != -1 || this.anInt1005 != -1) && this.anInt957 != this.anInt936) {
						this.aBoolean224 = true;
						this.anInt936 = this.anInt957;
					}
					if ((this.anInt965 != -1 || this.anInt1005 != -1) && this.anInt899 != this.anInt832) {
						this.aBoolean224 = true;
						this.anInt832 = this.anInt899;
					}
					@Pc(351) boolean local351 = false;
					while (!local351) {
						local351 = true;
						for (@Pc(357) int local357 = 0; local357 < this.anInt909 - 1; local357++) {
							if (this.anIntArray221[local357] < 1000 && this.anIntArray221[local357 + 1] > 1000) {
								@Pc(378) String local378 = this.aStringArray11[local357];
								this.aStringArray11[local357] = this.aStringArray11[local357 + 1];
								this.aStringArray11[local357 + 1] = local378;
								@Pc(400) int local400 = this.anIntArray221[local357];
								this.anIntArray221[local357] = this.anIntArray221[local357 + 1];
								this.anIntArray221[local357 + 1] = local400;
								@Pc(422) int local422 = this.anIntArray219[local357];
								this.anIntArray219[local357] = this.anIntArray219[local357 + 1];
								this.anIntArray219[local357 + 1] = local422;
								@Pc(444) int local444 = this.anIntArray220[local357];
								this.anIntArray220[local357] = this.anIntArray220[local357 + 1];
								this.anIntArray220[local357 + 1] = local444;
								@Pc(466) int local466 = this.anIntArray222[local357];
								this.anIntArray222[local357] = this.anIntArray222[local357 + 1];
								this.anIntArray222[local357 + 1] = local466;
								local351 = false;
							}
						}
					}
				} else {
					this.anInt957 = 0;
					this.anInt899 = 0;
					this.method644(super.anInt818, 0, 0, super.anInt819, 0, Class10.method204(this.anInt910), 0);
					if (this.anInt957 != this.anInt1006) {
						this.anInt1006 = this.anInt957;
					}
					if (this.anInt899 != this.anInt878) {
						this.anInt878 = this.anInt899;
					}
				}
			}
		} catch (@Pc(496) RuntimeException local496) {
			signlink.reporterror("60384, " + 13173 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method674(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt1069 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("12560, " + 364 + ", " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;IILjava/lang/String;I)Lclient!VSQMPWOM;")
	private Class39 method675(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) byte[] local8 = null;
			@Pc(10) int local10 = 5;
			try {
				if (this.aClass41Array1[0] != null) {
					local8 = this.aClass41Array1[0].method492(arg1);
				}
			} catch (@Pc(25) Exception local25) {
			}
			@Pc(39) int local39;
			if (local8 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local8);
				local39 = (int) this.aCRC32_2.getValue();
				if (local39 != arg4) {
					local8 = null;
				}
			}
			if (local8 != null) {
				return new Class39(local8, 156);
			}
			local39 = 0;
			while (local8 == null) {
				@Pc(60) String local60 = "Unknown error";
				this.method586("Requesting " + arg0, arg2);
				@Pc(75) int local75;
				try {
					local75 = 0;
					@Pc(86) DataInputStream local86 = this.method633(arg3 + arg4);
					@Pc(89) byte[] local89 = new byte[6];
					local86.readFully(local89, 0, 6);
					@Pc(100) Class2_Sub1_Sub2 local100 = new Class2_Sub1_Sub2(local89, -990);
					local100.anInt123 = 3;
					@Pc(108) int local108 = local100.method83() + 6;
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
							this.method586("Loading " + arg0 + " - " + local173 + "%", arg2);
						}
						local75 = local173;
					}
					local86.close();
					try {
						if (this.aClass41Array1[0] != null) {
							this.aClass41Array1[0].method493(arg1, local8.length, local8);
						}
					} catch (@Pc(218) Exception local218) {
						this.aClass41Array1[0] = null;
					}
					if (local8 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local8);
						local133 = (int) this.aCRC32_2.getValue();
						if (local133 != arg4) {
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
							this.method586("Game updated - please reload page", arg2);
							local75 = 10;
						} else {
							this.method586(local60 + " - Retrying in " + local75, arg2);
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
					this.aBoolean242 = !this.aBoolean242;
				}
			}
			return new Class39(local8, 156);
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("66235, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method676() {
		try {
			if (this.anInt932 == 0) {
				@Pc(18) int local18 = super.anInt823;
				if (this.anInt838 == 1 && super.anInt824 >= 516 && super.anInt825 >= 160 && super.anInt824 <= 765 && super.anInt825 <= 205) {
					local18 = 0;
				}
				@Pc(49) int local49;
				@Pc(52) int local52;
				@Pc(128) int local128;
				if (this.aBoolean236) {
					if (local18 != 1) {
						local49 = super.anInt818;
						local52 = super.anInt819;
						if (this.anInt901 == 0) {
							local49 -= 4;
							local52 -= 4;
						}
						if (this.anInt901 == 1) {
							local49 -= 553;
							local52 -= 205;
						}
						if (this.anInt901 == 2) {
							local49 -= 17;
							local52 -= 357;
						}
						if (local49 < this.anInt902 - 10 || local49 > this.anInt902 + this.anInt904 + 10 || local52 < this.anInt903 - 10 || local52 > this.anInt903 + this.anInt905 + 10) {
							this.aBoolean236 = false;
							if (this.anInt901 == 1) {
								this.aBoolean255 = true;
							}
							if (this.anInt901 == 2) {
								this.aBoolean224 = true;
							}
						}
					}
					if (local18 == 1) {
						local49 = this.anInt902;
						local52 = this.anInt903;
						local128 = this.anInt904;
						@Pc(131) int local131 = super.anInt824;
						@Pc(134) int local134 = super.anInt825;
						if (this.anInt901 == 0) {
							local131 -= 4;
							local134 -= 4;
						}
						if (this.anInt901 == 1) {
							local131 -= 553;
							local134 -= 205;
						}
						if (this.anInt901 == 2) {
							local131 -= 17;
							local134 -= 357;
						}
						@Pc(153) int local153 = -1;
						for (@Pc(155) int local155 = 0; local155 < this.anInt909; local155++) {
							@Pc(170) int local170 = local52 + (this.anInt909 - 1 - local155) * 15 + 31;
							if (local131 > local49 && local131 < local49 + local128 && local134 > local170 - 13 && local134 < local170 + 3) {
								local153 = local155;
							}
						}
						if (local153 != -1) {
							this.method681(local153);
						}
						this.aBoolean236 = false;
						if (this.anInt901 == 1) {
							this.aBoolean255 = true;
						}
						if (this.anInt901 == 2) {
							this.aBoolean224 = true;
							return;
						}
					}
				} else {
					if (local18 == 1 && this.anInt909 > 0) {
						local49 = this.anIntArray221[this.anInt909 - 1];
						if (local49 == 191 || local49 == 603 || local49 == 972 || local49 == 517 || local49 == 788 || local49 == 500 || local49 == 360 || local49 == 986 || local49 == 508 || local49 == 959 || local49 == 286 || local49 == 1690) {
							local52 = this.anIntArray219[this.anInt909 - 1];
							local128 = this.anIntArray220[this.anInt909 - 1];
							@Pc(289) Class10 local289 = Class10.method204(local128);
							if (local289.aBoolean67 || local289.aBoolean64) {
								this.aBoolean240 = false;
								this.anInt865 = 0;
								this.anInt930 = local128;
								this.anInt931 = local52;
								this.anInt932 = 2;
								this.anInt933 = super.anInt824;
								this.anInt934 = super.anInt825;
								if (Class10.method204(local128).anInt234 == this.anInt976) {
									this.anInt932 = 1;
								}
								if (Class10.method204(local128).anInt234 == this.anInt965) {
									this.anInt932 = 3;
								}
								return;
							}
						}
					}
					if (local18 == 1 && (this.anInt949 == 1 || this.method640(this.anInt909 - 1)) && this.anInt909 > 2) {
						local18 = 2;
					}
					if (local18 == 1 && this.anInt909 > 0) {
						this.method681(this.anInt909 - 1);
					}
					if (local18 != 2 || this.anInt909 <= 0) {
						return;
					}
					this.method611();
				}
			}
		} catch (@Pc(382) RuntimeException local382) {
			signlink.reporterror("60976, " + 0 + ", " + local382.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!FMDWWBSX;I)I")
	private int method677(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) int local5 = 14 / arg0;
			if (arg1.anIntArrayArray6 == null || arg2 >= arg1.anIntArrayArray6.length) {
				return -2;
			}
			try {
				@Pc(20) int[] local20 = arg1.anIntArrayArray6[arg2];
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
						local33 = this.anIntArray257[local20[local24++]];
					}
					if (local31 == 2) {
						local33 = this.anIntArray252[local20[local24++]];
					}
					if (local31 == 3) {
						local33 = this.anIntArray249[local20[local24++]];
					}
					@Pc(81) Class10 local81;
					@Pc(86) int local86;
					@Pc(99) int local99;
					if (local31 == 4) {
						local81 = Class10.method204(local20[local24++]);
						local86 = local20[local24++];
						if (local86 >= 0 && local86 < Class28.anInt598 && (!Class28.method410(local86).aBoolean143 || aBoolean243)) {
							for (local99 = 0; local99 < local81.anIntArray46.length; local99++) {
								if (local81.anIntArray46[local99] == local86 + 1) {
									local33 += local81.anIntArray50[local99];
								}
							}
						}
					}
					if (local31 == 5) {
						local33 = this.anIntArray268[local20[local24++]];
					}
					if (local31 == 6) {
						local33 = anIntArray275[this.anIntArray252[local20[local24++]] - 1];
					}
					if (local31 == 7) {
						local33 = this.anIntArray268[local20[local24++]] * 100 / 46875;
					}
					if (local31 == 8) {
						local33 = aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt376;
					}
					@Pc(174) int local174;
					if (local31 == 9) {
						for (local174 = 0; local174 < Class18.anInt424; local174++) {
							if (Class18.aBooleanArray7[local174]) {
								local33 += this.anIntArray252[local174];
							}
						}
					}
					if (local31 == 10) {
						local81 = Class10.method204(local20[local24++]);
						local86 = local20[local24++] + 1;
						if (local86 >= 0 && local86 < Class28.anInt598 && (!Class28.method410(local86).aBoolean143 || aBoolean243)) {
							for (local99 = 0; local99 < local81.anIntArray46.length; local99++) {
								if (local81.anIntArray46[local99] == local86) {
									local33 = 999999999;
									break;
								}
							}
						}
					}
					if (local31 == 11) {
						local33 = this.anInt898;
					}
					if (local31 == 12) {
						local33 = this.anInt1028;
					}
					if (local31 == 13) {
						local174 = this.anIntArray268[local20[local24++]];
						local86 = local20[local24++];
						local33 = (local174 & 0x1 << local86) == 0 ? 0 : 1;
					}
					if (local31 == 14) {
						local174 = local20[local24++];
						@Pc(288) Class36 local288 = Class36.aClass36Array1[local174];
						local99 = local288.anInt702;
						@Pc(294) int local294 = local288.anInt703;
						@Pc(297) int local297 = local288.anInt704;
						@Pc(303) int local303 = anIntArray232[local297 - local294];
						local33 = this.anIntArray268[local99] >> local294 & local303;
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
						local33 = (aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 >> 7) + this.anInt922;
					}
					if (local31 == 19) {
						local33 = (aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 >> 7) + this.anInt923;
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
			signlink.reporterror("42528, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!FMDWWBSX;)Z")
	private boolean method678(@OriginalArg(1) Class10 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt263;
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
				this.aStringArray11[this.anInt909] = "Remove @whi@" + this.aStringArray9[local4];
				this.anIntArray221[this.anInt909] = 921;
				this.anInt909++;
				this.aStringArray11[this.anInt909] = "Message @whi@" + this.aStringArray9[local4];
				this.anIntArray221[this.anInt909] = 694;
				this.anInt909++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray11[this.anInt909] = "Remove @whi@" + arg0.aString5;
				this.anIntArray221[this.anInt909] = 281;
				this.anInt909++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("90486, " + -6429 + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)Z")
	private boolean method679() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("13928, " + true + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)Z")
	private boolean method680(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt979; local7++) {
				if (arg1.equalsIgnoreCase(this.aStringArray9[local7])) {
					return true;
				}
			}
			@Pc(28) boolean local28 = false;
			return arg1.equalsIgnoreCase(aClass2_Sub1_Sub1_Sub1_Sub2_1.aString11);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("44285, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method681(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray219[arg0];
				@Pc(14) int local14 = this.anIntArray220[arg0];
				@Pc(19) int local19 = this.anIntArray221[arg0];
				@Pc(24) int local24 = this.anIntArray222[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt1054 != 0 && local19 != 1844) {
					this.anInt1054 = 0;
					this.aBoolean224 = true;
				}
				@Pc(51) String local51;
				@Pc(55) int local55;
				@Pc(72) String local72;
				@Pc(76) int local76;
				if (local19 == 416 || local19 == 918) {
					local51 = this.aStringArray11[arg0];
					local55 = local51.indexOf("@whi@");
					if (local55 != -1) {
						local51 = local51.substring(local55 + 5).trim();
						local72 = Class19.method235(Class19.method232(Class19.method231(local51)));
						@Pc(74) boolean local74 = false;
						for (local76 = 0; local76 < this.anInt913; local76++) {
							@Pc(86) Class2_Sub1_Sub1_Sub1_Sub2 local86 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray240[local76]];
							if (local86 != null && local86.aString11 != null && local86.aString11.equalsIgnoreCase(local72)) {
								this.method650(0, 0, local86.anIntArray58[0], false, (byte) 6, 1, local86.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
								if (local19 == 416) {
									this.aClass2_Sub1_Sub2_7.method68(195);
									this.aClass2_Sub1_Sub2_7.method104(this.anIntArray240[local76]);
								}
								if (local19 == 918) {
									if ((local24 & 0x3) == 0) {
										anInt1045++;
									}
									if (anInt1045 >= 112) {
										this.aClass2_Sub1_Sub2_7.method68(13);
										anInt1045 = 0;
									}
									this.aClass2_Sub1_Sub2_7.method68(176);
									this.aClass2_Sub1_Sub2_7.method70(this.anIntArray240[local76]);
								}
								local74 = true;
								break;
							}
						}
						if (!local74) {
							this.method626("", "Unable to find " + local72, 0, this.anInt916);
						}
					}
				}
				@Pc(204) Class2_Sub1_Sub1_Sub1_Sub2 local204;
				if (local19 == 124) {
					local204 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local204 != null) {
						this.method650(0, 0, local204.anIntArray58[0], false, (byte) 6, 1, local204.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						anInt831++;
						if (anInt831 >= 85) {
							this.aClass2_Sub1_Sub2_7.method68(212);
							this.aClass2_Sub1_Sub2_7.method73(0);
							anInt831 = 0;
						}
						this.aClass2_Sub1_Sub2_7.method68(251);
						this.aClass2_Sub1_Sub2_7.method104(local24);
					}
				}
				@Pc(299) boolean local299;
				if (local19 == 5) {
					local299 = this.method650(0, 0, local14, false, (byte) 6, 0, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, 0);
					if (!local299) {
						this.method650(0, 0, local14, false, (byte) 6, 1, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
					}
					this.anInt1000 = super.anInt824;
					this.anInt1001 = super.anInt825;
					this.anInt1003 = 2;
					this.anInt1002 = 0;
					this.aClass2_Sub1_Sub2_7.method68(14);
					this.aClass2_Sub1_Sub2_7.method70(local9 + this.anInt922);
					this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local24);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local14 + this.anInt923);
				}
				if (local19 == 530) {
					this.method649(local9, local24, local14);
					this.aClass2_Sub1_Sub2_7.method68(185);
					this.aClass2_Sub1_Sub2_7.method70(local14 + this.anInt923);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local9 + this.anInt922);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local24 >> 14 & 0x7FFF);
				}
				@Pc(419) Class10 local419;
				if (local19 == 125) {
					this.aClass2_Sub1_Sub2_7.method68(50);
					this.aClass2_Sub1_Sub2_7.method70(local14);
					local419 = Class10.method204(local14);
					if (local419.anIntArrayArray6 != null && local419.anIntArrayArray6[0][0] == 5) {
						local55 = local419.anIntArrayArray6[0][1];
						this.anIntArray268[local55] = 1 - this.anIntArray268[local55];
						this.method592(local55);
						this.aBoolean255 = true;
					}
				}
				if (local19 == 986) {
					this.aClass2_Sub1_Sub2_7.method68(63);
					this.aClass2_Sub1_Sub2_7.method70(local24);
					this.aClass2_Sub1_Sub2_7.method104(local14);
					this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local9);
					this.anInt987 = 0;
					this.anInt988 = local14;
					this.anInt989 = local9;
					this.anInt990 = 2;
					if (Class10.method204(local14).anInt234 == this.anInt976) {
						this.anInt990 = 1;
					}
					if (Class10.method204(local14).anInt234 == this.anInt965) {
						this.anInt990 = 3;
					}
				}
				if (local19 == 191) {
					this.aClass2_Sub1_Sub2_7.method68(201);
					this.aClass2_Sub1_Sub2_7.method104(local9);
					this.aClass2_Sub1_Sub2_7.method104(local14);
					this.aClass2_Sub1_Sub2_7.method104(local24);
					this.anInt987 = 0;
					this.anInt988 = local14;
					this.anInt989 = local9;
					this.anInt990 = 2;
					if (Class10.method204(local14).anInt234 == this.anInt976) {
						this.anInt990 = 1;
					}
					if (Class10.method204(local14).anInt234 == this.anInt965) {
						this.anInt990 = 3;
					}
				}
				if (local19 == 58) {
					this.method649(local9, local24, local14);
					this.aClass2_Sub1_Sub2_7.method68(86);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local14 + this.anInt923);
					this.aClass2_Sub1_Sub2_7.method104(local9 + this.anInt922);
					this.aClass2_Sub1_Sub2_7.method70(local24 >> 14 & 0x7FFF);
				}
				@Pc(606) Class28 local606;
				@Pc(632) String local632;
				if (local19 == 1690) {
					local606 = Class28.method410(local24);
					@Pc(609) Class10 local609 = Class10.method204(local14);
					if (local609 != null && local609.anIntArray50[local9] >= 100000) {
						local632 = local609.anIntArray50[local9] + " x " + local606.aString13;
					} else if (local606.aByteArray15 == null) {
						local632 = "It's a " + local606.aString13 + ".";
					} else {
						local632 = new String(local606.aByteArray15);
					}
					this.method626("", local632, 0, this.anInt916);
				}
				if (local19 == 788) {
					this.aClass2_Sub1_Sub2_7.method68(113);
					this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local14);
					this.aClass2_Sub1_Sub2_7.method70(local9);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local24);
					this.anInt987 = 0;
					this.anInt988 = local14;
					this.anInt989 = local9;
					this.anInt990 = 2;
					if (Class10.method204(local14).anInt234 == this.anInt976) {
						this.anInt990 = 1;
					}
					if (Class10.method204(local14).anInt234 == this.anInt965) {
						this.anInt990 = 3;
					}
				}
				if (local19 == 760 && this.method649(local9, local24, local14)) {
					this.aClass2_Sub1_Sub2_7.method68(213);
					this.aClass2_Sub1_Sub2_7.method70(local24 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub2_7.method70(this.anInt994);
					this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local9 + this.anInt922);
					this.aClass2_Sub1_Sub2_7.method104(this.anInt995);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, this.anInt993);
					this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local14 + this.anInt923);
				}
				if (local19 == 827) {
					this.method639(this.anInt1005);
					this.anInt1005 = -1;
					this.aBoolean224 = true;
				}
				if (local19 == 482) {
					local299 = this.method650(0, 0, local14, false, (byte) 6, 0, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, 0);
					if (!local299) {
						this.method650(0, 0, local14, false, (byte) 6, 1, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
					}
					this.anInt1000 = super.anInt824;
					this.anInt1001 = super.anInt825;
					this.anInt1003 = 2;
					this.anInt1002 = 0;
					this.aClass2_Sub1_Sub2_7.method68(11);
					this.aClass2_Sub1_Sub2_7.method104(local9 + this.anInt922);
					this.aClass2_Sub1_Sub2_7.method70(local24);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local14 + this.anInt923);
					this.aClass2_Sub1_Sub2_7.method70(this.anInt839);
				}
				if (local19 == 329) {
					local204 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local204 != null) {
						this.method650(0, 0, local204.anIntArray58[0], false, (byte) 6, 1, local204.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						this.aClass2_Sub1_Sub2_7.method68(84);
						this.aClass2_Sub1_Sub2_7.method70(local24);
					}
				}
				if (local19 == 903) {
					if (this.aBoolean236) {
						this.aClass27_1.method335(local9 - 4, local14 - 4);
					} else {
						this.aClass27_1.method335(super.anInt824 - 4, super.anInt825 - 4);
					}
				}
				if (local19 == 307) {
					local299 = this.method650(0, 0, local14, false, (byte) 6, 0, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, 0);
					if (!local299) {
						this.method650(0, 0, local14, false, (byte) 6, 1, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
					}
					this.anInt1000 = super.anInt824;
					this.anInt1001 = super.anInt825;
					this.anInt1003 = 2;
					this.anInt1002 = 0;
					this.aClass2_Sub1_Sub2_7.method68(215);
					this.aClass2_Sub1_Sub2_7.method104(local14 + this.anInt923);
					this.aClass2_Sub1_Sub2_7.method104(local24);
					this.aClass2_Sub1_Sub2_7.method104(local9 + this.anInt922);
				}
				if (local19 == 817) {
					this.aClass2_Sub1_Sub2_7.method68(224);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local9);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, this.anInt839);
					this.aClass2_Sub1_Sub2_7.method104(local14);
					this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local24);
					this.anInt987 = 0;
					this.anInt988 = local14;
					this.anInt989 = local9;
					this.anInt990 = 2;
					if (Class10.method204(local14).anInt234 == this.anInt976) {
						this.anInt990 = 1;
					}
					if (Class10.method204(local14).anInt234 == this.anInt965) {
						this.anInt990 = 3;
					}
				}
				if (local19 == 414) {
					local51 = this.aStringArray11[arg0];
					local55 = local51.indexOf("@whi@");
					if (local55 != -1) {
						if (this.anInt976 == -1) {
							this.method693();
							this.aString30 = local51.substring(local55 + 5).trim();
							this.aBoolean237 = false;
							this.anInt937 = this.anInt976 = Class10.anInt247;
						} else {
							this.method626("", "Please close the interface you have open before using 'report abuse'", 0, this.anInt916);
						}
					}
				}
				if (local19 == 995) {
					local299 = this.method650(0, 0, local14, false, (byte) 6, 0, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, 0);
					if (!local299) {
						this.method650(0, 0, local14, false, (byte) 6, 1, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
					}
					this.anInt1000 = super.anInt824;
					this.anInt1001 = super.anInt825;
					this.anInt1003 = 2;
					this.anInt1002 = 0;
					if ((this.anInt922 & 0x3) == 0) {
						anInt920++;
					}
					if (anInt920 >= 130) {
						this.aClass2_Sub1_Sub2_7.method68(150);
						this.aClass2_Sub1_Sub2_7.method69(244);
						anInt920 = 0;
					}
					this.aClass2_Sub1_Sub2_7.method68(30);
					this.aClass2_Sub1_Sub2_7.method104(local14 + this.anInt923);
					this.aClass2_Sub1_Sub2_7.method70(local9 + this.anInt922);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local24);
				}
				if (local19 == 1237) {
					this.method649(local9, local24, local14);
					this.aClass2_Sub1_Sub2_7.method68(236);
					this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local9 + this.anInt922);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local24 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub2_7.method104(local14 + this.anInt923);
				}
				if (local19 == 500) {
					this.aClass2_Sub1_Sub2_7.method68(71);
					this.aClass2_Sub1_Sub2_7.method70(local24);
					this.aClass2_Sub1_Sub2_7.method70(local9);
					this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local14);
					this.anInt987 = 0;
					this.anInt988 = local14;
					this.anInt989 = local9;
					this.anInt990 = 2;
					if (Class10.method204(local14).anInt234 == this.anInt976) {
						this.anInt990 = 1;
					}
					if (Class10.method204(local14).anInt234 == this.anInt965) {
						this.anInt990 = 3;
					}
				}
				@Pc(1381) Class2_Sub1_Sub1_Sub1_Sub1 local1381;
				if (local19 == 977) {
					local1381 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local24];
					if (local1381 != null) {
						this.method650(0, 0, local1381.anIntArray58[0], false, (byte) 6, 1, local1381.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						if ((local24 & 0x3) == 0) {
							anInt975++;
						}
						if (anInt975 >= 126) {
							this.aClass2_Sub1_Sub2_7.method68(235);
							this.aClass2_Sub1_Sub2_7.method72(4893544);
							anInt975 = 0;
						}
						this.aClass2_Sub1_Sub2_7.method68(99);
						this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local24);
					}
				}
				if (local19 == 322) {
					local204 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local204 != null) {
						this.method650(0, 0, local204.anIntArray58[0], false, (byte) 6, 1, local204.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						this.aClass2_Sub1_Sub2_7.method68(96);
						this.aClass2_Sub1_Sub2_7.method70(this.anInt839);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local24);
					}
				}
				if (local19 == 526) {
					local1381 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local24];
					if (local1381 != null) {
						this.method650(0, 0, local1381.anIntArray58[0], false, (byte) 6, 1, local1381.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						anInt1029 += local24;
						if (anInt1029 >= 144) {
							this.aClass2_Sub1_Sub2_7.method68(48);
							anInt1029 = 0;
						}
						this.aClass2_Sub1_Sub2_7.method68(216);
						this.aClass2_Sub1_Sub2_7.method104(local24);
					}
				}
				if (local19 == 112) {
					local1381 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local24];
					if (local1381 != null) {
						this.method650(0, 0, local1381.anIntArray58[0], false, (byte) 6, 1, local1381.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						this.aClass2_Sub1_Sub2_7.method68(117);
						this.aClass2_Sub1_Sub2_7.method70(local24);
					}
				}
				if (local19 == 304) {
					this.method649(local9, local24, local14);
					this.aClass2_Sub1_Sub2_7.method68(119);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local9 + this.anInt922);
					this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local24 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local14 + this.anInt923);
				}
				if (local19 == 246) {
					local204 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local204 != null) {
						this.method650(0, 0, local204.anIntArray58[0], false, (byte) 6, 1, local204.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						this.aClass2_Sub1_Sub2_7.method68(195);
						this.aClass2_Sub1_Sub2_7.method104(local24);
					}
				}
				if (local19 == 360) {
					this.aClass2_Sub1_Sub2_7.method68(61);
					this.aClass2_Sub1_Sub2_7.method70(local14);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local9);
					this.aClass2_Sub1_Sub2_7.method70(local24);
					this.anInt987 = 0;
					this.anInt988 = local14;
					this.anInt989 = local9;
					this.anInt990 = 2;
					if (Class10.method204(local14).anInt234 == this.anInt976) {
						this.anInt990 = 1;
					}
					if (Class10.method204(local14).anInt234 == this.anInt965) {
						this.anInt990 = 3;
					}
				}
				if (local19 == 453) {
					local204 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local204 != null) {
						this.method650(0, 0, local204.anIntArray58[0], false, (byte) 6, 1, local204.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						this.aClass2_Sub1_Sub2_7.method68(103);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, this.anInt994);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, this.anInt995);
						this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local24);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, this.anInt993);
					}
				}
				if (local19 == 517) {
					this.aClass2_Sub1_Sub2_7.method68(98);
					this.aClass2_Sub1_Sub2_7.method104(local9);
					this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local24);
					this.aClass2_Sub1_Sub2_7.method104(local14);
					this.anInt987 = 0;
					this.anInt988 = local14;
					this.anInt989 = local9;
					this.anInt990 = 2;
					if (Class10.method204(local14).anInt234 == this.anInt976) {
						this.anInt990 = 1;
					}
					if (Class10.method204(local14).anInt234 == this.anInt965) {
						this.anInt990 = 3;
					}
				}
				if (local19 == 1260) {
					local606 = Class28.method410(local24);
					if (local606.aByteArray15 == null) {
						local632 = "It's a " + local606.aString13 + ".";
					} else {
						local632 = new String(local606.aByteArray15);
					}
					this.method626("", local632, 0, this.anInt916);
				}
				if (local19 == 764) {
					local204 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local24];
					if (local204 != null) {
						this.method650(0, 0, local204.anIntArray58[0], false, (byte) 6, 1, local204.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						this.aClass2_Sub1_Sub2_7.method68(34);
						this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local24);
					}
				}
				if (local19 == 1170) {
					local1381 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local24];
					if (local1381 != null) {
						@Pc(2062) Class32 local2062 = local1381.aClass32_1;
						if (local2062.anIntArray114 != null) {
							local2062 = local2062.method458();
						}
						if (local2062 != null) {
							if (local2062.aByteArray16 == null) {
								local72 = "It's a " + local2062.aString14 + ".";
							} else {
								local72 = new String(local2062.aByteArray16);
							}
							this.method626("", local72, 0, this.anInt916);
						}
					}
				}
				if (local19 == 565) {
					local419 = Class10.method204(local14);
					this.anInt838 = 1;
					this.anInt839 = local14;
					this.anInt840 = local419.anInt242;
					this.anInt992 = 0;
					this.aBoolean255 = true;
					local632 = local419.aString8;
					if (local632.indexOf(" ") != -1) {
						local632 = local632.substring(0, local632.indexOf(" "));
					}
					local72 = local419.aString8;
					if (local72.indexOf(" ") != -1) {
						local72 = local72.substring(local72.indexOf(" ") + 1);
					}
					this.aString18 = local632 + " " + local419.aString4 + " " + local72;
					if (this.anInt840 == 16) {
						this.aBoolean255 = true;
						this.anInt946 = 3;
						this.aBoolean248 = true;
					}
				} else {
					if (local19 == 947) {
						local1381 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local24];
						if (local1381 != null) {
							this.method650(0, 0, local1381.anIntArray58[0], false, (byte) 6, 1, local1381.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
							this.anInt1000 = super.anInt824;
							this.anInt1001 = super.anInt825;
							this.anInt1003 = 2;
							this.anInt1002 = 0;
							this.aClass2_Sub1_Sub2_7.method68(137);
							this.aClass2_Sub1_Sub2_7.method104(this.anInt839);
							this.aClass2_Sub1_Sub2_7.method104(local24);
						}
					}
					@Pc(2274) long local2274;
					if (local19 == 694) {
						local51 = this.aStringArray11[arg0];
						local55 = local51.indexOf("@whi@");
						if (local55 != -1) {
							local2274 = Class19.method231(local51.substring(local55 + 5).trim());
							local76 = -1;
							for (@Pc(2278) int local2278 = 0; local2278 < this.anInt979; local2278++) {
								if (this.aLongArray3[local2278] == local2274) {
									local76 = local2278;
									break;
								}
							}
							if (local76 != -1 && this.anIntArray227[local76] > 0) {
								this.aBoolean224 = true;
								this.anInt1054 = 0;
								this.aBoolean238 = true;
								this.aString17 = "";
								this.anInt1062 = 3;
								this.aLong32 = this.aLongArray3[local76];
								this.aString19 = "Enter message to send to " + this.aStringArray9[local76];
							}
						}
					}
					if (local19 == 14) {
						this.aClass2_Sub1_Sub2_7.method68(50);
						this.aClass2_Sub1_Sub2_7.method70(local14);
						local419 = Class10.method204(local14);
						if (local419.anIntArrayArray6 != null && local419.anIntArrayArray6[0][0] == 5) {
							local55 = local419.anIntArrayArray6[0][1];
							if (this.anIntArray268[local55] != local419.anIntArray47[0]) {
								this.anIntArray268[local55] = local419.anIntArray47[0];
								this.method592(local55);
								this.aBoolean255 = true;
							}
						}
					}
					if (local19 == 479) {
						this.method649(local9, local24, local14);
						this.aClass2_Sub1_Sub2_7.method68(59);
						this.aClass2_Sub1_Sub2_7.method104(local14 + this.anInt923);
						this.aClass2_Sub1_Sub2_7.method70(local9 + this.anInt922);
						this.aClass2_Sub1_Sub2_7.method70(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 959) {
						this.aClass2_Sub1_Sub2_7.method68(65);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local24);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local9);
						this.aClass2_Sub1_Sub2_7.method104(local14);
						this.anInt987 = 0;
						this.anInt988 = local14;
						this.anInt989 = local9;
						this.anInt990 = 2;
						if (Class10.method204(local14).anInt234 == this.anInt976) {
							this.anInt990 = 1;
						}
						if (Class10.method204(local14).anInt234 == this.anInt965) {
							this.anInt990 = 3;
						}
					}
					if (local19 == 270) {
						local299 = this.method650(0, 0, local14, false, (byte) 6, 0, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, 0);
						if (!local299) {
							this.method650(0, 0, local14, false, (byte) 6, 1, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						}
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						this.aClass2_Sub1_Sub2_7.method68(62);
						this.aClass2_Sub1_Sub2_7.method70(local14 + this.anInt923);
						this.aClass2_Sub1_Sub2_7.method70(local24);
						this.aClass2_Sub1_Sub2_7.method104(local9 + this.anInt922);
					}
					if (local19 == 508) {
						this.aClass2_Sub1_Sub2_7.method68(193);
						this.aClass2_Sub1_Sub2_7.method70(local9);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local14);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local24);
						this.anInt987 = 0;
						this.anInt988 = local14;
						this.anInt989 = local9;
						this.anInt990 = 2;
						if (Class10.method204(local14).anInt234 == this.anInt976) {
							this.anInt990 = 1;
						}
						if (Class10.method204(local14).anInt234 == this.anInt965) {
							this.anInt990 = 3;
						}
					}
					if (local19 == 403) {
						local204 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local24];
						if (local204 != null) {
							this.method650(0, 0, local204.anIntArray58[0], false, (byte) 6, 1, local204.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
							this.anInt1000 = super.anInt824;
							this.anInt1001 = super.anInt825;
							this.anInt1003 = 2;
							this.anInt1002 = 0;
							if ((local24 & 0x3) == 0) {
								anInt1045++;
							}
							if (anInt1045 >= 112) {
								this.aClass2_Sub1_Sub2_7.method68(13);
								anInt1045 = 0;
							}
							this.aClass2_Sub1_Sub2_7.method68(176);
							this.aClass2_Sub1_Sub2_7.method70(local24);
						}
					}
					if (local19 == 106 || local19 == 872 || local19 == 921 || local19 == 281) {
						local51 = this.aStringArray11[arg0];
						local55 = local51.indexOf("@whi@");
						if (local55 != -1) {
							local2274 = Class19.method231(local51.substring(local55 + 5).trim());
							if (local19 == 106) {
								this.method599(local2274);
							}
							if (local19 == 872) {
								this.method638(local2274);
							}
							if (local19 == 921) {
								this.method719(local2274);
							}
							if (local19 == 281) {
								this.method606(local2274);
							}
						}
					}
					if (local19 == 253) {
						local419 = Class10.method204(local14);
						@Pc(2772) boolean local2772 = true;
						if (local419.anInt263 > 0) {
							local2772 = this.method643(local419);
						}
						if (local2772) {
							this.aClass2_Sub1_Sub2_7.method68(50);
							this.aClass2_Sub1_Sub2_7.method70(local14);
						}
					}
					if (local19 == 435) {
						local299 = this.method650(0, 0, local14, false, (byte) 6, 0, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, 0);
						if (!local299) {
							this.method650(0, 0, local14, false, (byte) 6, 1, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
						}
						this.anInt1000 = super.anInt824;
						this.anInt1001 = super.anInt825;
						this.anInt1003 = 2;
						this.anInt1002 = 0;
						anInt1051 += local24;
						if (anInt1051 >= 111) {
							this.aClass2_Sub1_Sub2_7.method68(73);
							this.aClass2_Sub1_Sub2_7.method72(6333090);
							anInt1051 = 0;
						}
						this.aClass2_Sub1_Sub2_7.method68(67);
						this.aClass2_Sub1_Sub2_7.method104(local9 + this.anInt922);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local24);
						this.aClass2_Sub1_Sub2_7.method104(local14 + this.anInt923);
					}
					if (local19 == 151) {
						this.aClass2_Sub1_Sub2_7.method68(169);
						this.aClass2_Sub1_Sub2_7.method104(local9);
						this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, this.anInt995);
						this.aClass2_Sub1_Sub2_7.method104(this.anInt994);
						this.aClass2_Sub1_Sub2_7.method104(local24);
						this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local14);
						this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, this.anInt993);
						this.anInt987 = 0;
						this.anInt988 = local14;
						this.anInt989 = local9;
						this.anInt990 = 2;
						if (Class10.method204(local14).anInt234 == this.anInt976) {
							this.anInt990 = 1;
						}
						if (Class10.method204(local14).anInt234 == this.anInt965) {
							this.anInt990 = 3;
						}
					}
					if (local19 == 709) {
						local1381 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local24];
						if (local1381 != null) {
							this.method650(0, 0, local1381.anIntArray58[0], false, (byte) 6, 1, local1381.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
							this.anInt1000 = super.anInt824;
							this.anInt1001 = super.anInt825;
							this.anInt1003 = 2;
							this.anInt1002 = 0;
							this.aClass2_Sub1_Sub2_7.method68(39);
							this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local24);
						}
					}
					if (local19 == 286) {
						this.anInt992 = 1;
						this.anInt993 = local9;
						this.anInt994 = local14;
						this.anInt995 = local24;
						this.aString29 = String.valueOf(Class28.method410(local24).aString13);
						this.anInt838 = 0;
						this.aBoolean255 = true;
					} else {
						if (local19 == 727) {
							this.method693();
						}
						if (local19 == 1551) {
							@Pc(3076) int local3076 = local24 >> 14 & 0x7FFF;
							@Pc(3079) Class46 local3079 = Class46.method546(local3076);
							if (local3079.aByteArray19 == null) {
								local72 = "It's a " + local3079.aString16 + ".";
							} else {
								local72 = new String(local3079.aByteArray19);
							}
							this.method626("", local72, 0, this.anInt916);
						}
						if (local19 == 963) {
							local1381 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local24];
							if (local1381 != null) {
								this.method650(0, 0, local1381.anIntArray58[0], false, (byte) 6, 1, local1381.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
								this.anInt1000 = super.anInt824;
								this.anInt1001 = super.anInt825;
								this.anInt1003 = 2;
								this.anInt1002 = 0;
								this.aClass2_Sub1_Sub2_7.method68(206);
								this.aClass2_Sub1_Sub2_7.method70(this.anInt995);
								this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, this.anInt994);
								this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, this.anInt993);
								this.aClass2_Sub1_Sub2_7.method104(local24);
							}
						}
						if (local19 == 741) {
							local1381 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local24];
							if (local1381 != null) {
								this.method650(0, 0, local1381.anIntArray58[0], false, (byte) 6, 1, local1381.anIntArray57[0], 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
								this.anInt1000 = super.anInt824;
								this.anInt1001 = super.anInt825;
								this.anInt1003 = 2;
								this.anInt1002 = 0;
								this.aClass2_Sub1_Sub2_7.method68(10);
								this.aClass2_Sub1_Sub2_7.method104(local24);
							}
						}
						if (local19 == 212) {
							local299 = this.method650(0, 0, local14, false, (byte) 6, 0, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, 0);
							if (!local299) {
								this.method650(0, 0, local14, false, (byte) 6, 1, local9, 2, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 1, 0);
							}
							this.anInt1000 = super.anInt824;
							this.anInt1001 = super.anInt825;
							this.anInt1003 = 2;
							this.anInt1002 = 0;
							this.aClass2_Sub1_Sub2_7.method68(226);
							this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, local9 + this.anInt922);
							this.aClass2_Sub1_Sub2_7.method70(local24);
							this.aClass2_Sub1_Sub2_7.method70(this.anInt994);
							this.aClass2_Sub1_Sub2_7.method103(this.anInt1052, this.anInt993);
							this.aClass2_Sub1_Sub2_7.method104(local14 + this.anInt923);
							this.aClass2_Sub1_Sub2_7.method104(this.anInt995);
						}
						if (local19 == 683 && !this.aBoolean233) {
							this.aClass2_Sub1_Sub2_7.method68(105);
							this.aClass2_Sub1_Sub2_7.method70(local14);
							this.aBoolean233 = true;
						}
						if (local19 == 603) {
							this.aClass2_Sub1_Sub2_7.method68(159);
							this.aClass2_Sub1_Sub2_7.method104(local24);
							this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local14);
							this.aClass2_Sub1_Sub2_7.method70(local9);
							this.anInt987 = 0;
							this.anInt988 = local14;
							this.anInt989 = local9;
							this.anInt990 = 2;
							if (Class10.method204(local14).anInt234 == this.anInt976) {
								this.anInt990 = 1;
							}
							if (Class10.method204(local14).anInt234 == this.anInt965) {
								this.anInt990 = 3;
							}
						}
						if (local19 == 972) {
							this.aClass2_Sub1_Sub2_7.method68(244);
							this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local24);
							this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, local14);
							this.aClass2_Sub1_Sub2_7.method104(local9);
							this.anInt987 = 0;
							this.anInt988 = local14;
							this.anInt989 = local9;
							this.anInt990 = 2;
							if (Class10.method204(local14).anInt234 == this.anInt976) {
								this.anInt990 = 1;
							}
							if (Class10.method204(local14).anInt234 == this.anInt965) {
								this.anInt990 = 3;
							}
						}
						if (local19 == 625 && this.method649(local9, local24, local14)) {
							this.aClass2_Sub1_Sub2_7.method68(173);
							this.aClass2_Sub1_Sub2_7.method104(local9 + this.anInt922);
							this.aClass2_Sub1_Sub2_7.method105(this.aBoolean235, this.anInt839);
							this.aClass2_Sub1_Sub2_7.method104(local24 >> 14 & 0x7FFF);
							this.aClass2_Sub1_Sub2_7.method70(local14 + this.anInt923);
						}
						this.anInt992 = 0;
						this.anInt838 = 0;
						this.aBoolean255 = true;
					}
				}
			}
		} catch (@Pc(3544) RuntimeException local3544) {
			signlink.reporterror("59462, " + -47 + ", " + arg0 + ", " + local3544.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method682(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 >> 7 == this.anInt943 && aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 >> 7 == this.anInt944) {
				this.anInt943 = 0;
			}
			@Pc(21) int local21 = this.anInt913;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(34) int local34 = 0; local34 < local21; local34++) {
				@Pc(40) Class2_Sub1_Sub1_Sub1_Sub2 local40;
				@Pc(45) int local45;
				if (arg0) {
					local40 = aClass2_Sub1_Sub1_Sub1_Sub2_1;
					local45 = this.anInt912 << 14;
				} else {
					local40 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray240[local34]];
					local45 = this.anIntArray240[local34] << 14;
				}
				if (local40 != null && local40.method221(122)) {
					local40.aBoolean83 = false;
					if ((aBoolean244 && this.anInt913 > 50 || this.anInt913 > 200) && !arg0 && local40.anInt324 == local40.anInt309) {
						local40.aBoolean83 = true;
					}
					@Pc(96) int local96 = local40.anInt328 >> 7;
					@Pc(101) int local101 = local40.anInt329 >> 7;
					if (local96 >= 0 && local96 < 104 && local101 >= 0 && local101 < 104) {
						if (local40.aClass2_Sub1_Sub1_Sub6_1 == null || anInt1013 < local40.anInt372 || anInt1013 >= local40.anInt373) {
							if ((local40.anInt328 & 0x7F) == 64 && (local40.anInt329 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local96][local101] == this.anInt836) {
									continue;
								}
								this.anIntArrayArray22[local96][local101] = this.anInt836;
							}
							local40.anInt359 = this.method624(local40.anInt329, this.anInt876, local40.anInt328);
							this.aClass27_1.method308(local40.anInt330, this.anInt876, local40.anInt329, 60, local40.anInt359, local40, local45, local40.aBoolean82, local40.anInt328);
						} else {
							local40.aBoolean83 = false;
							local40.anInt359 = this.method624(local40.anInt329, this.anInt876, local40.anInt328);
							this.aClass27_1.method309(local40, (byte) 2, local40.anInt329, this.anInt876, local40.anInt328, local40.anInt367, local45, local40.anInt330, local40.anInt359, local40.anInt370, local40.anInt368, local40.anInt369);
						}
					}
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("22268, " + 1 + ", " + arg0 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!BFQIDHPO;)V")
	private void method683(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		try {
			while (true) {
				if (arg1.anInt124 + 21 < arg0 * 8) {
					@Pc(14) int local14 = arg1.method90(14);
					if (local14 != 16383) {
						if (this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local14] == null) {
							this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local14] = new Class2_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(34) Class2_Sub1_Sub1_Sub1_Sub1 local34 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local14];
						this.anIntArray264[this.anInt983++] = local14;
						local34.anInt327 = anInt1013;
						local34.aClass32_1 = Class32.method455(arg1.method90(13));
						@Pc(60) int local60 = arg1.method90(5);
						if (local60 > 15) {
							local60 -= 32;
						}
						@Pc(69) int local69 = arg1.method90(5);
						if (local69 > 15) {
							local69 -= 32;
						}
						@Pc(78) int local78 = arg1.method90(1);
						@Pc(83) int local83 = arg1.method90(1);
						if (local83 == 1) {
							this.anIntArray241[this.anInt914++] = local14;
						}
						local34.anInt321 = local34.aClass32_1.aByte33;
						local34.anInt338 = local34.aClass32_1.anInt627;
						local34.anInt311 = local34.aClass32_1.anInt635;
						local34.anInt312 = local34.aClass32_1.anInt637;
						local34.anInt313 = local34.aClass32_1.anInt625;
						local34.anInt314 = local34.aClass32_1.anInt640;
						local34.anInt309 = local34.aClass32_1.anInt644;
						local34.method218(aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0] + local69, local78 == 1, (byte) 6, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0] + local60);
						continue;
					}
				}
				arg1.method91();
				return;
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("36277, " + arg0 + ", " + -470 + ", " + arg1 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BFQIDHPO;B)V")
	private void method684(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1, @OriginalArg(2) byte arg2) {
		try {
			while (true) {
				if (arg1.anInt124 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method90(11);
					if (local12 != 2047) {
						if (this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class2_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass2_Sub1_Sub2Array1[local12] != null) {
								this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local12].method224(this.aClass2_Sub1_Sub2Array1[local12]);
							}
						}
						this.anIntArray240[this.anInt913++] = local12;
						@Pc(58) Class2_Sub1_Sub1_Sub1_Sub2 local58 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local12];
						local58.anInt327 = anInt1013;
						@Pc(66) int local66 = arg1.method90(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method90(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method90(1);
						@Pc(89) int local89 = arg1.method90(1);
						if (local89 == 1) {
							this.anIntArray241[this.anInt914++] = local12;
						}
						local58.method218(aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0] + local75, local84 == 1, (byte) 6, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0] + local66);
						continue;
					}
				}
				arg1.method91();
				if (arg2 != -37) {
					this.anInt891 = this.aClass43_2.method501();
					return;
				}
				return;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("96038, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method685() {
		try {
			@Pc(6) Class2_Sub2 local6 = (Class2_Sub2) this.aClass50_10.method569();
			this.aBoolean227 &= true;
			while (local6 != null) {
				if (local6.anInt398 == -1) {
					local6.anInt394 = 0;
					this.method722(local6, (byte) 3);
				} else {
					local6.method504();
				}
				local6 = (Class2_Sub2) this.aClass50_10.method571();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("60381, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method686() {
		try {
			if (this.anInt1023 != 0) {
				@Pc(6) Class2_Sub1_Sub3_Sub1 local6 = this.aClass2_Sub1_Sub3_Sub1_3;
				@Pc(8) int local8 = 0;
				if (this.anInt862 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray14[local15] != null) {
						@Pc(27) int local27 = this.anIntArray273[local15];
						@Pc(32) String local32 = this.aStringArray13[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt961 == 0 || this.anInt961 == 1 && this.method680((byte) 7, local32))) {
							local85 = 329 - local8 * 13;
							local6.method153(local85, "From", 4, 0);
							local6.method153(local85 - 1, "From", 4, 65535);
							@Pc(110) int local110 = local6.method151("From ") + 4;
							if (local34 == 1) {
								this.aClass2_Sub1_Sub3_Sub4Array2[0].method400(local85 - 12, local110);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass2_Sub1_Sub3_Sub4Array2[1].method400(local85 - 12, local110);
								local110 += 14;
							}
							local6.method153(local85, local32 + ": " + this.aStringArray14[local15], local110, 0);
							local6.method153(local85 - 1, local32 + ": " + this.aStringArray14[local15], local110, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt961 < 2) {
							local85 = 329 - local8 * 13;
							local6.method153(local85, this.aStringArray14[local15], 4, 0);
							local6.method153(local85 - 1, this.aStringArray14[local15], 4, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt961 < 2) {
							local85 = 329 - local8 * 13;
							local6.method153(local85, "To " + local32 + ": " + this.aStringArray14[local15], 4, 0);
							local6.method153(local85 - 1, "To " + local32 + ": " + this.aStringArray14[local15], 4, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				this.anInt856 += 0;
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("38788, " + 0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method687() {
		try {
			if (this.aClass49_3 == null) {
				super.aClass49_2 = null;
				this.aClass49_18 = null;
				this.aClass49_16 = null;
				this.aClass49_15 = null;
				this.aClass49_17 = null;
				this.aClass49_12 = null;
				this.aClass49_13 = null;
				this.aClass49_14 = null;
				this.aClass49_6 = new Class49(anInt871, this.method584(), 128, 265);
				Class2_Sub1_Sub3.method386();
				this.aClass49_7 = new Class49(anInt871, this.method584(), 128, 265);
				Class2_Sub1_Sub3.method386();
				this.aClass49_3 = new Class49(anInt871, this.method584(), 509, 171);
				Class2_Sub1_Sub3.method386();
				this.aClass49_4 = new Class49(anInt871, this.method584(), 360, 132);
				Class2_Sub1_Sub3.method386();
				this.aClass49_5 = new Class49(anInt871, this.method584(), 360, 200);
				Class2_Sub1_Sub3.method386();
				this.aClass49_8 = new Class49(anInt871, this.method584(), 202, 238);
				Class2_Sub1_Sub3.method386();
				this.aClass49_9 = new Class49(anInt871, this.method584(), 203, 238);
				Class2_Sub1_Sub3.method386();
				this.aClass49_10 = new Class49(anInt871, this.method584(), 74, 94);
				Class2_Sub1_Sub3.method386();
				this.aClass49_11 = new Class49(anInt871, this.method584(), 75, 94);
				Class2_Sub1_Sub3.method386();
				if (this.aClass39_2 != null) {
					this.method665();
					this.method629(187);
				}
				this.aBoolean263 = true;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("72038, " + false + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method688() {
		try {
			if (this.anInt909 >= 2 || this.anInt992 != 0 || this.anInt838 != 0) {
				if (anInt1034 > 4 || anInt1034 < 4) {
					this.aClass2_Sub1_Sub2_7.method69(34);
				}
				@Pc(41) String local41;
				if (this.anInt992 == 1 && this.anInt909 < 2) {
					local41 = "Use " + this.aString29 + " with...";
				} else if (this.anInt838 == 1 && this.anInt909 < 2) {
					local41 = this.aString18 + "...";
				} else {
					local41 = this.aStringArray11[this.anInt909 - 1];
				}
				if (this.anInt909 > 2) {
					local41 = local41 + "@whi@ / " + (this.anInt909 - 2) + " more options";
				}
				this.aClass2_Sub1_Sub3_Sub1_4.method158(anInt1013 / 1000, 15, 16777215, 4, local41);
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("67898, " + 4 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method689() {
		try {
			try {
				@Pc(17) int local17 = aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 + this.anInt844;
				@Pc(23) int local23 = aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 + this.anInt872;
				if (this.anInt927 - local17 < -500 || this.anInt927 - local17 > 500 || this.anInt928 - local23 < -500 || this.anInt928 - local23 > 500) {
					this.anInt927 = local17;
					this.anInt928 = local23;
				}
				if (this.anInt927 != local17) {
					this.anInt927 += (local17 - this.anInt927) / 16;
				}
				if (this.anInt928 != local23) {
					this.anInt928 += (local23 - this.anInt928) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt970 += (-this.anInt970 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt970 += (24 - this.anInt970) / 2;
				} else {
					this.anInt970 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt971 += (12 - this.anInt971) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt971 += (-this.anInt971 - 12) / 2;
				} else {
					this.anInt971 /= 2;
				}
				this.anInt969 = this.anInt969 + this.anInt970 / 2 & 0x7FF;
				this.anInt968 += this.anInt971 / 2;
				if (this.anInt968 < 128) {
					this.anInt968 = 128;
				}
				if (this.anInt968 > 383) {
					this.anInt968 = 383;
				}
				@Pc(210) int local210 = this.anInt927 >> 7;
				@Pc(215) int local215 = this.anInt928 >> 7;
				@Pc(225) int local225 = this.method624(this.anInt928, this.anInt876, this.anInt927);
				@Pc(227) int local227 = 0;
				@Pc(243) int local243;
				if (local210 > 3 && local215 > 3 && local210 < 100 && local215 < 100) {
					for (local243 = local210 - 4; local243 <= local210 + 4; local243++) {
						for (@Pc(249) int local249 = local215 - 4; local249 <= local215 + 4; local249++) {
							@Pc(254) int local254 = this.anInt876;
							if (local254 < 3 && (this.aByteArrayArrayArray8[1][local243][local249] & 0x2) == 2) {
								local254++;
							}
							@Pc(281) int local281 = local225 - this.anIntArrayArrayArray7[local254][local243][local249];
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
				if (local243 > this.anInt997) {
					this.anInt997 += (local243 - this.anInt997) / 24;
				} else if (local243 < this.anInt997) {
					this.anInt997 += (local243 - this.anInt997) / 80;
				}
			} catch (@Pc(345) Exception local345) {
				signlink.reporterror("glfc_ex " + aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 + "," + aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 + "," + this.anInt927 + "," + this.anInt928 + "," + this.anInt846 + "," + this.anInt847 + "," + this.anInt922 + "," + this.anInt923);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("82885, " + false + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!BFQIDHPO;Z)V")
	private void method690(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			arg1.method89();
			@Pc(17) int local17 = arg1.method90(1);
			if (local17 != 0) {
				@Pc(25) int local25 = arg1.method90(2);
				if (local25 == 0) {
					this.anIntArray241[this.anInt914++] = this.anInt912;
				} else {
					@Pc(48) int local48;
					@Pc(59) int local59;
					if (local25 == 1) {
						local48 = arg1.method90(3);
						aClass2_Sub1_Sub1_Sub1_Sub2_1.method219(local48, this.aByte41, false);
						local59 = arg1.method90(1);
						if (local59 == 1) {
							this.anIntArray241[this.anInt914++] = this.anInt912;
						}
					} else {
						@Pc(105) int local105;
						if (local25 == 2) {
							local48 = arg1.method90(3);
							aClass2_Sub1_Sub1_Sub1_Sub2_1.method219(local48, this.aByte41, true);
							local59 = arg1.method90(3);
							aClass2_Sub1_Sub1_Sub1_Sub2_1.method219(local59, this.aByte41, true);
							local105 = arg1.method90(1);
							if (local105 == 1) {
								this.anIntArray241[this.anInt914++] = this.anInt912;
							}
						} else if (local25 == 3) {
							local48 = arg1.method90(7);
							this.anInt876 = arg1.method90(2);
							local59 = arg1.method90(1);
							local105 = arg1.method90(7);
							@Pc(150) int local150 = arg1.method90(1);
							if (local150 == 1) {
								this.anIntArray241[this.anInt914++] = this.anInt912;
							}
							aClass2_Sub1_Sub1_Sub1_Sub2_1.method218(local48, local59 == 1, (byte) 6, local105);
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("1835, " + arg0 + ", " + arg1 + ", " + false + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!HCCLTVPO;II)V")
	private void method691(@OriginalArg(0) Class2_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method692(arg1, arg0.anInt328, this.anInt981, arg0.anInt329);
			this.anInt856 += 0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("10690, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)V")
	private void method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 >= 128 && arg3 >= 128 && arg1 <= 13056 && arg3 <= 13056) {
				@Pc(28) int local28 = this.method624(arg3, this.anInt876, arg1) - arg0;
				@Pc(33) int local33 = arg1 - this.anInt1007;
				@Pc(38) int local38 = local28 - this.anInt1008;
				@Pc(43) int local43 = arg3 - this.anInt1009;
				@Pc(48) int local48 = Class2_Sub1_Sub1_Sub6.anIntArray179[this.anInt1010];
				@Pc(53) int local53 = Class2_Sub1_Sub1_Sub6.anIntArray180[this.anInt1010];
				@Pc(58) int local58 = Class2_Sub1_Sub1_Sub6.anIntArray179[this.anInt1011];
				@Pc(63) int local63 = Class2_Sub1_Sub1_Sub6.anIntArray180[this.anInt1011];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				if (arg2 >= 0) {
					for (@Pc(99) int local99 = 1; local99 > 0; local99++) {
					}
				}
				local43 = local38 * local48 + local83 * local53 >> 16;
				if (local43 >= 50) {
					this.anInt1018 = Class2_Sub1_Sub3_Sub3.anInt543 + (local73 << 9) / local43;
					this.anInt1019 = Class2_Sub1_Sub3_Sub3.anInt544 + (local95 << 9) / local43;
				} else {
					this.anInt1018 = -1;
					this.anInt1019 = -1;
				}
			} else {
				this.anInt1018 = -1;
				this.anInt1019 = -1;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("96593, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method693() {
		try {
			this.aBoolean227 &= true;
			this.aClass2_Sub1_Sub2_7.method68(51);
			if (this.anInt1048 != -1) {
				this.method639(this.anInt1048);
				this.anInt1048 = -1;
				this.aBoolean255 = true;
				this.aBoolean233 = false;
				this.aBoolean248 = true;
			}
			if (this.anInt965 != -1) {
				this.method639(this.anInt965);
				this.anInt965 = -1;
				this.aBoolean224 = true;
				this.aBoolean233 = false;
			}
			if (this.anInt910 != -1) {
				this.method639(this.anInt910);
				this.anInt910 = -1;
				this.aBoolean263 = true;
			}
			if (this.anInt950 != -1) {
				this.method639(this.anInt950);
				this.anInt950 = -1;
			}
			if (this.anInt976 != -1) {
				this.method639(this.anInt976);
				this.anInt976 = -1;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("89052, " + true + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			this.aBoolean263 = true;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("64027, " + 7831 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method694() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt983; local1++) {
				@Pc(8) int local8 = this.anIntArray264[local1];
				@Pc(13) Class2_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local8];
				if (local13 != null) {
					this.method695(local13.aClass32_1.aByte33, local13);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("1867, " + 15168 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!HCCLTVPO;)V")
	private void method695(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt328 < 128 || arg1.anInt329 < 128 || arg1.anInt328 >= 13184 || arg1.anInt329 >= 13184) {
				arg1.anInt316 = -1;
				arg1.anInt332 = -1;
				arg1.anInt343 = 0;
				arg1.anInt344 = 0;
				arg1.anInt328 = arg1.anIntArray57[0] * 128 + arg1.anInt321 * 64;
				arg1.anInt329 = arg1.anIntArray58[0] * 128 + arg1.anInt321 * 64;
				arg1.method217();
			}
			if (arg1 == aClass2_Sub1_Sub1_Sub1_Sub2_1 && (arg1.anInt328 < 1536 || arg1.anInt329 < 1536 || arg1.anInt328 >= 11776 || arg1.anInt329 >= 11776)) {
				arg1.anInt316 = -1;
				arg1.anInt332 = -1;
				arg1.anInt343 = 0;
				arg1.anInt344 = 0;
				arg1.anInt328 = arg1.anIntArray57[0] * 128 + arg1.anInt321 * 64;
				arg1.anInt329 = arg1.anIntArray58[0] * 128 + arg1.anInt321 * 64;
				arg1.method217();
			}
			if (arg1.anInt343 > anInt1013) {
				this.method696(arg1);
			} else if (arg1.anInt344 >= anInt1013) {
				this.method697(arg1);
			} else {
				this.method698(arg1);
			}
			this.method699(arg1);
			this.method700(arg1);
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("65303, " + arg0 + ", " + 36436 + ", " + arg1 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!HCCLTVPO;)V")
	private void method696(@OriginalArg(1) Class2_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt343 - anInt1013;
			@Pc(14) int local14 = arg0.anInt339 * 128 + arg0.anInt321 * 64;
			@Pc(24) int local24 = arg0.anInt341 * 128 + arg0.anInt321 * 64;
			arg0.anInt328 += (local14 - arg0.anInt328) / local4;
			arg0.anInt329 += (local24 - arg0.anInt329) / local4;
			arg0.anInt337 = 0;
			if (arg0.anInt345 == 0) {
				arg0.anInt346 = 1024;
			}
			if (arg0.anInt345 == 1) {
				arg0.anInt346 = 1536;
			}
			if (arg0.anInt345 == 2) {
				arg0.anInt346 = 0;
			}
			if (arg0.anInt345 == 3) {
				arg0.anInt346 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("87231, " + -622 + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!HCCLTVPO;)V")
	private void method697(@OriginalArg(1) Class2_Sub1_Sub1_Sub1 arg0) {
		try {
			this.aBoolean227 &= true;
			if (arg0.anInt344 == anInt1013 || arg0.anInt316 == -1 || arg0.anInt319 != 0 || arg0.anInt318 + 1 > Class33.aClass33Array1[arg0.anInt316].method461(arg0.anInt317)) {
				@Pc(35) int local35 = arg0.anInt344 - arg0.anInt343;
				@Pc(40) int local40 = anInt1013 - arg0.anInt343;
				@Pc(50) int local50 = arg0.anInt339 * 128 + arg0.anInt321 * 64;
				@Pc(60) int local60 = arg0.anInt341 * 128 + arg0.anInt321 * 64;
				@Pc(70) int local70 = arg0.anInt340 * 128 + arg0.anInt321 * 64;
				@Pc(80) int local80 = arg0.anInt342 * 128 + arg0.anInt321 * 64;
				arg0.anInt328 = (local50 * (local35 - local40) + local70 * local40) / local35;
				arg0.anInt329 = (local60 * (local35 - local40) + local80 * local40) / local35;
			}
			arg0.anInt337 = 0;
			if (arg0.anInt345 == 0) {
				arg0.anInt346 = 1024;
			}
			if (arg0.anInt345 == 1) {
				arg0.anInt346 = 1536;
			}
			if (arg0.anInt345 == 2) {
				arg0.anInt346 = 0;
			}
			if (arg0.anInt345 == 3) {
				arg0.anInt346 = 512;
			}
			arg0.anInt330 = arg0.anInt346;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("3483, " + true + ", " + arg0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!HCCLTVPO;)V")
	private void method698(@OriginalArg(1) Class2_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt324 = arg0.anInt309;
			if (arg0.anInt347 == 0) {
				arg0.anInt337 = 0;
			} else {
				if (arg0.anInt316 != -1 && arg0.anInt319 == 0) {
					@Pc(24) Class33 local24 = Class33.aClass33Array1[arg0.anInt316];
					if (arg0.anInt315 > 0 && local24.anInt654 == 0) {
						arg0.anInt337++;
						return;
					}
					if (arg0.anInt315 <= 0 && local24.anInt655 == 0) {
						arg0.anInt337++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt328;
				@Pc(56) int local56 = arg0.anInt329;
				@Pc(71) int local71 = arg0.anIntArray57[arg0.anInt347 - 1] * 128 + arg0.anInt321 * 64;
				@Pc(86) int local86 = arg0.anIntArray58[arg0.anInt347 - 1] * 128 + arg0.anInt321 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt346 = 1280;
						} else if (local56 > local86) {
							arg0.anInt346 = 1792;
						} else {
							arg0.anInt346 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt346 = 768;
						} else if (local56 > local86) {
							arg0.anInt346 = 256;
						} else {
							arg0.anInt346 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt346 = 1024;
					} else {
						arg0.anInt346 = 0;
					}
					@Pc(180) int local180 = arg0.anInt346 - arg0.anInt330 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt312;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt311;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt314;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt313;
					}
					if (local187 == -1) {
						local187 = arg0.anInt311;
					}
					arg0.anInt324 = local187;
					@Pc(229) int local229 = 4;
					if (arg0.anInt330 != arg0.anInt346 && arg0.anInt322 == -1 && arg0.anInt338 != 0) {
						local229 = 2;
					}
					if (arg0.anInt347 > 2) {
						local229 = 6;
					}
					if (arg0.anInt347 > 3) {
						local229 = 8;
					}
					if (arg0.anInt337 > 0 && arg0.anInt347 > 1) {
						local229 = 8;
						arg0.anInt337--;
					}
					if (arg0.aBooleanArray6[arg0.anInt347 - 1]) {
						local229 <<= 0x1;
					}
					if (local229 >= 8 && arg0.anInt324 == arg0.anInt311 && arg0.anInt348 != -1) {
						arg0.anInt324 = arg0.anInt348;
					}
					if (local53 < local71) {
						arg0.anInt328 += local229;
						if (arg0.anInt328 > local71) {
							arg0.anInt328 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt328 -= local229;
						if (arg0.anInt328 < local71) {
							arg0.anInt328 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt329 += local229;
						if (arg0.anInt329 > local86) {
							arg0.anInt329 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt329 -= local229;
						if (arg0.anInt329 < local86) {
							arg0.anInt329 = local86;
						}
					}
					if (arg0.anInt328 == local71 && arg0.anInt329 == local86) {
						arg0.anInt347--;
						if (arg0.anInt315 > 0) {
							arg0.anInt315--;
							return;
						}
					}
				} else {
					arg0.anInt328 = local71;
					arg0.anInt329 = local86;
				}
			}
		} catch (@Pc(400) RuntimeException local400) {
			signlink.reporterror("29138, " + false + ", " + arg0 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!HCCLTVPO;Z)V")
	private void method699(@OriginalArg(0) Class2_Sub1_Sub1_Sub1 arg0) {
		try {
			this.aBoolean227 &= true;
			if (arg0.anInt338 != 0) {
				@Pc(33) int local33;
				@Pc(39) int local39;
				if (arg0.anInt322 != -1 && arg0.anInt322 < 32768) {
					@Pc(25) Class2_Sub1_Sub1_Sub1_Sub1 local25 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt322];
					if (local25 != null) {
						local33 = arg0.anInt328 - local25.anInt328;
						local39 = arg0.anInt329 - local25.anInt329;
						if (local33 != 0 || local39 != 0) {
							arg0.anInt346 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(64) int local64;
				if (arg0.anInt322 >= 32768) {
					local64 = arg0.anInt322 - 32768;
					if (local64 == this.anInt835) {
						local64 = this.anInt912;
					}
					@Pc(76) Class2_Sub1_Sub1_Sub1_Sub2 local76 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local64];
					if (local76 != null) {
						local39 = arg0.anInt328 - local76.anInt328;
						@Pc(90) int local90 = arg0.anInt329 - local76.anInt329;
						if (local39 != 0 || local90 != 0) {
							arg0.anInt346 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt353 != 0 || arg0.anInt354 != 0) && (arg0.anInt347 == 0 || arg0.anInt337 > 0)) {
					local64 = arg0.anInt328 - (arg0.anInt353 - this.anInt922 - this.anInt922) * 64;
					local33 = arg0.anInt329 - (arg0.anInt354 - this.anInt923 - this.anInt923) * 64;
					if (local64 != 0 || local33 != 0) {
						arg0.anInt346 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
					}
					arg0.anInt353 = 0;
					arg0.anInt354 = 0;
				}
				local64 = arg0.anInt346 - arg0.anInt330 & 0x7FF;
				if (local64 != 0) {
					if (local64 < arg0.anInt338 || local64 > 2048 - arg0.anInt338) {
						arg0.anInt330 = arg0.anInt346;
					} else if (local64 > 1024) {
						arg0.anInt330 -= arg0.anInt338;
					} else {
						arg0.anInt330 += arg0.anInt338;
					}
					arg0.anInt330 &= 0x7FF;
					if (arg0.anInt324 == arg0.anInt309 && arg0.anInt330 != arg0.anInt346) {
						if (arg0.anInt310 != -1) {
							arg0.anInt324 = arg0.anInt310;
							return;
						}
						arg0.anInt324 = arg0.anInt311;
						return;
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("45123, " + arg0 + ", " + true + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!HCCLTVPO;I)V")
	private void method700(@OriginalArg(0) Class2_Sub1_Sub1_Sub1 arg0) {
		try {
			this.anInt856 += 0;
			arg0.aBoolean82 = false;
			@Pc(19) Class33 local19;
			if (arg0.anInt324 != -1) {
				local19 = Class33.aClass33Array1[arg0.anInt324];
				arg0.anInt326++;
				if (arg0.anInt325 < local19.anInt648 && arg0.anInt326 > local19.method461(arg0.anInt325)) {
					arg0.anInt326 = 0;
					arg0.anInt325++;
				}
				if (arg0.anInt325 >= local19.anInt648) {
					arg0.anInt326 = 0;
					arg0.anInt325 = 0;
				}
			}
			if (arg0.anInt332 != -1 && anInt1013 >= arg0.anInt335) {
				if (arg0.anInt333 < 0) {
					arg0.anInt333 = 0;
				}
				local19 = Class6.aClass6Array1[arg0.anInt332].aClass33_1;
				arg0.anInt334++;
				while (arg0.anInt333 < local19.anInt648 && arg0.anInt334 > local19.method461(arg0.anInt333)) {
					arg0.anInt334 -= local19.method461(arg0.anInt333);
					arg0.anInt333++;
				}
				if (arg0.anInt333 >= local19.anInt648 && (arg0.anInt333 < 0 || arg0.anInt333 >= local19.anInt648)) {
					arg0.anInt332 = -1;
				}
			}
			if (arg0.anInt316 != -1 && arg0.anInt319 <= 1) {
				local19 = Class33.aClass33Array1[arg0.anInt316];
				if (local19.anInt654 == 1 && arg0.anInt315 > 0 && arg0.anInt343 <= anInt1013 && arg0.anInt344 < anInt1013) {
					arg0.anInt319 = 1;
					return;
				}
			}
			if (arg0.anInt316 != -1 && arg0.anInt319 == 0) {
				local19 = Class33.aClass33Array1[arg0.anInt316];
				arg0.anInt318++;
				while (arg0.anInt317 < local19.anInt648 && arg0.anInt318 > local19.method461(arg0.anInt317)) {
					arg0.anInt318 -= local19.method461(arg0.anInt317);
					arg0.anInt317++;
				}
				if (arg0.anInt317 >= local19.anInt648) {
					arg0.anInt317 -= local19.anInt649;
					arg0.anInt320++;
					if (arg0.anInt320 >= local19.anInt653) {
						arg0.anInt316 = -1;
					}
					if (arg0.anInt317 < 0 || arg0.anInt317 >= local19.anInt648) {
						arg0.anInt316 = -1;
					}
				}
				arg0.aBoolean82 = local19.aBoolean159;
			}
			if (arg0.anInt319 > 0) {
				arg0.anInt319--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("1149, " + arg0 + ", " + 0 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method701() {
		try {
			this.anInt856 += 0;
			if (this.anInt910 == -1 || this.anInt870 != 2 && super.aClass49_2 == null) {
				if (this.aBoolean263) {
					this.method669(this.anInt942);
					this.aBoolean263 = false;
					this.aClass49_19.method564(super.aGraphics2, 0, 4);
					this.aClass49_20.method564(super.aGraphics2, 0, 357);
					this.aClass49_21.method564(super.aGraphics2, 722, 4);
					this.aClass49_22.method564(super.aGraphics2, 743, 205);
					this.aClass49_23.method564(super.aGraphics2, 0, 0);
					this.aClass49_24.method564(super.aGraphics2, 516, 4);
					this.aClass49_25.method564(super.aGraphics2, 516, 205);
					this.aClass49_26.method564(super.aGraphics2, 496, 357);
					this.aClass49_27.method564(super.aGraphics2, 0, 338);
					this.aBoolean255 = true;
					this.aBoolean224 = true;
					this.aBoolean248 = true;
					this.aBoolean257 = true;
					if (this.anInt870 != 2) {
						this.aClass49_17.method564(super.aGraphics2, 4, 4);
						this.aClass49_16.method564(super.aGraphics2, 550, 4);
					}
				}
				if (this.anInt870 == 2) {
					this.method725();
				}
				if (this.aBoolean236 && this.anInt901 == 1) {
					this.aBoolean255 = true;
				}
				@Pc(286) boolean local286;
				if (this.anInt1048 != -1) {
					local286 = this.method716(this.anInt1048, this.anInt1046);
					if (local286) {
						this.aBoolean255 = true;
					}
				}
				if (this.anInt990 == 2) {
					this.aBoolean255 = true;
				}
				if (this.anInt932 == 2) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean255) {
					this.method645();
					this.aBoolean255 = false;
				}
				@Pc(371) int local371;
				if (this.anInt965 == -1 && this.anInt1054 == 0) {
					this.aClass10_1.anInt268 = this.anInt977 - this.anInt1016 - 77;
					if (super.anInt818 > 448 && super.anInt818 < 560 && super.anInt819 > 332) {
						this.method641(463, this.anInt977, 77, -1, super.anInt819 - 357, this.aClass10_1, 0, super.anInt818 - 17);
					}
					local371 = this.anInt977 - this.aClass10_1.anInt268 - 77;
					if (local371 < 0) {
						local371 = 0;
					}
					if (local371 > this.anInt977 - 77) {
						local371 = this.anInt977 - 77;
					}
					if (this.anInt1016 != local371) {
						this.anInt1016 = local371;
						this.aBoolean224 = true;
					}
				}
				if (this.anInt965 == -1 && this.anInt1054 == 3) {
					local371 = this.anInt906 * 14 + 7;
					this.aClass10_1.anInt268 = this.anInt907;
					if (super.anInt818 > 448 && super.anInt818 < 560 && super.anInt819 > 332) {
						this.method641(463, local371, 77, -1, super.anInt819 - 357, this.aClass10_1, 0, super.anInt818 - 17);
					}
					@Pc(450) int local450 = this.aClass10_1.anInt268;
					if (local450 < 0) {
						local450 = 0;
					}
					if (local450 > local371 - 77) {
						local450 = local371 - 77;
					}
					if (this.anInt907 != local450) {
						this.anInt907 = local450;
						this.aBoolean224 = true;
					}
				}
				if (this.anInt965 != -1) {
					local286 = this.method716(this.anInt965, this.anInt1046);
					if (local286) {
						this.aBoolean224 = true;
					}
				}
				if (this.anInt990 == 3) {
					this.aBoolean224 = true;
				}
				if (this.anInt932 == 3) {
					this.aBoolean224 = true;
				}
				if (this.aString31 != null) {
					this.aBoolean224 = true;
				}
				if (this.aBoolean236 && this.anInt901 == 2) {
					this.aBoolean224 = true;
				}
				if (this.aBoolean224) {
					this.method607();
					this.aBoolean224 = false;
				}
				if (this.anInt870 == 2) {
					this.method653();
					this.aClass49_16.method564(super.aGraphics2, 550, 4);
				}
				if (this.anInt1044 != -1) {
					this.aBoolean248 = true;
				}
				if (this.aBoolean248) {
					if (this.anInt1044 != -1 && this.anInt1044 == this.anInt946) {
						this.anInt1044 = -1;
						this.aClass2_Sub1_Sub2_7.method68(76);
						this.aClass2_Sub1_Sub2_7.method69(this.anInt946);
					}
					this.aBoolean248 = false;
					this.aClass49_14.method563();
					this.aClass2_Sub1_Sub3_Sub4_18.method400(0, 0);
					if (this.anInt1048 == -1) {
						if (this.anIntArray255[this.anInt946] != -1) {
							if (this.anInt946 == 0) {
								this.aClass2_Sub1_Sub3_Sub4_1.method400(10, 22);
							}
							if (this.anInt946 == 1) {
								this.aClass2_Sub1_Sub3_Sub4_2.method400(8, 54);
							}
							if (this.anInt946 == 2) {
								this.aClass2_Sub1_Sub3_Sub4_2.method400(8, 82);
							}
							if (this.anInt946 == 3) {
								this.aClass2_Sub1_Sub3_Sub4_3.method400(8, 110);
							}
							if (this.anInt946 == 4) {
								this.aClass2_Sub1_Sub3_Sub4_5.method400(8, 153);
							}
							if (this.anInt946 == 5) {
								this.aClass2_Sub1_Sub3_Sub4_5.method400(8, 181);
							}
							if (this.anInt946 == 6) {
								this.aClass2_Sub1_Sub3_Sub4_4.method400(9, 209);
							}
						}
						if (this.anIntArray255[0] != -1 && (this.anInt1044 != 0 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[0].method400(13, 29);
						}
						if (this.anIntArray255[1] != -1 && (this.anInt1044 != 1 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[1].method400(11, 53);
						}
						if (this.anIntArray255[2] != -1 && (this.anInt1044 != 2 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[2].method400(11, 82);
						}
						if (this.anIntArray255[3] != -1 && (this.anInt1044 != 3 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[3].method400(12, 115);
						}
						if (this.anIntArray255[4] != -1 && (this.anInt1044 != 4 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[4].method400(13, 153);
						}
						if (this.anIntArray255[5] != -1 && (this.anInt1044 != 5 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[5].method400(11, 180);
						}
						if (this.anIntArray255[6] != -1 && (this.anInt1044 != 6 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[6].method400(13, 208);
						}
					}
					this.aClass49_14.method564(super.aGraphics2, 516, 160);
					this.aClass49_13.method563();
					this.aClass2_Sub1_Sub3_Sub4_17.method400(0, 0);
					if (this.anInt1048 == -1) {
						if (this.anIntArray255[this.anInt946] != -1) {
							if (this.anInt946 == 7) {
								this.aClass2_Sub1_Sub3_Sub4_11.method400(0, 42);
							}
							if (this.anInt946 == 8) {
								this.aClass2_Sub1_Sub3_Sub4_12.method400(0, 74);
							}
							if (this.anInt946 == 9) {
								this.aClass2_Sub1_Sub3_Sub4_12.method400(0, 102);
							}
							if (this.anInt946 == 10) {
								this.aClass2_Sub1_Sub3_Sub4_13.method400(1, 130);
							}
							if (this.anInt946 == 11) {
								this.aClass2_Sub1_Sub3_Sub4_15.method400(0, 173);
							}
							if (this.anInt946 == 12) {
								this.aClass2_Sub1_Sub3_Sub4_15.method400(0, 201);
							}
							if (this.anInt946 == 13) {
								this.aClass2_Sub1_Sub3_Sub4_14.method400(0, 229);
							}
						}
						if (this.anIntArray255[8] != -1 && (this.anInt1044 != 8 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[7].method400(2, 74);
						}
						if (this.anIntArray255[9] != -1 && (this.anInt1044 != 9 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[8].method400(3, 102);
						}
						if (this.anIntArray255[10] != -1 && (this.anInt1044 != 10 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[9].method400(4, 137);
						}
						if (this.anIntArray255[11] != -1 && (this.anInt1044 != 11 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[10].method400(2, 174);
						}
						if (this.anIntArray255[12] != -1 && (this.anInt1044 != 12 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[11].method400(2, 201);
						}
						if (this.anIntArray255[13] != -1 && (this.anInt1044 != 13 || anInt1013 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array4[12].method400(2, 226);
						}
					}
					this.aClass49_13.method564(super.aGraphics2, 496, 466);
					this.aClass49_17.method563();
					Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
				}
				if (this.aBoolean257) {
					this.aBoolean257 = false;
					this.aClass49_12.method563();
					this.aClass2_Sub1_Sub3_Sub4_16.method400(0, 0);
					this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Public chat", 16777215, 28, 55);
					if (this.anInt1043 == 0) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "On", 65280, 41, 55);
					}
					if (this.anInt1043 == 1) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Friends", 16776960, 41, 55);
					}
					if (this.anInt1043 == 2) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Off", 16711680, 41, 55);
					}
					if (this.anInt1043 == 3) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Hide", 65535, 41, 55);
					}
					this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Private chat", 16777215, 28, 184);
					if (this.anInt961 == 0) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "On", 65280, 41, 184);
					}
					if (this.anInt961 == 1) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Friends", 16776960, 41, 184);
					}
					if (this.anInt961 == 2) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Off", 16711680, 41, 184);
					}
					this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Trade/compete", 16777215, 28, 324);
					if (this.anInt1035 == 0) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "On", 65280, 41, 324);
					}
					if (this.anInt1035 == 1) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Friends", 16776960, 41, 324);
					}
					if (this.anInt1035 == 2) {
						this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Off", 16711680, 41, 324);
					}
					this.aClass2_Sub1_Sub3_Sub1_3.method150(true, "Report abuse", 16777215, 33, 458);
					this.aClass49_12.method564(super.aGraphics2, 0, 453);
					this.aClass49_17.method563();
					Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
				}
				this.anInt1046 = 0;
			} else {
				if (this.anInt870 == 2) {
					this.method716(this.anInt910, this.anInt1046);
					if (this.anInt950 != -1) {
						this.method716(this.anInt950, this.anInt1046);
					}
					this.anInt1046 = 0;
					this.method601(aBoolean220);
					super.aClass49_2.method563();
					Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray262;
					Class2_Sub1_Sub3.method386();
					this.aBoolean263 = true;
					@Pc(62) Class10 local62 = Class10.method204(this.anInt910);
					if (local62.anInt250 == 512 && local62.anInt246 == 334 && local62.anInt267 == 0) {
						local62.anInt250 = 765;
						local62.anInt246 = 503;
					}
					this.method642(0, 0, 0, local62, this.aBoolean230);
					if (this.anInt950 != -1) {
						local62 = Class10.method204(this.anInt950);
						if (local62.anInt250 == 512 && local62.anInt246 == 334 && local62.anInt267 == 0) {
							local62.anInt250 = 765;
							local62.anInt246 = 503;
						}
						this.method642(0, 0, 0, local62, this.aBoolean230);
					}
					if (this.aBoolean236) {
						this.method618();
					} else {
						this.method673();
						this.method688();
					}
				}
				super.aClass49_2.method564(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(1280) RuntimeException local1280) {
			signlink.reporterror("22404, " + 0 + ", " + local1280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method702(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt985);
			if (this.aClass5_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass5_Sub1_1.anInt178);
			}
			System.out.println("loop-cycle:" + anInt1013);
			System.out.println("draw-cycle:" + anInt887);
			System.out.println("ptype:" + this.anInt857);
			System.out.println("psize:" + this.anInt856);
			if (this.aClass47_1 != null) {
				this.aClass47_1.method562();
			}
			super.aBoolean215 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("47055, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method584() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("98804, " + -319 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!BFQIDHPO;)V")
	private void method703(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		try {
			@Pc(12) int local12;
			@Pc(16) int local16;
			@Pc(25) int local25;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(44) int local44;
			@Pc(49) int local49;
			if (arg0 == 106) {
				local12 = arg1.method108(this.aByte43);
				local16 = arg1.method98();
				local25 = this.anInt998 + (local16 >> 4 & 0x7);
				local32 = this.anInt999 + (local16 & 0x7);
				local36 = arg1.method99();
				local40 = local36 >> 2;
				local44 = local36 & 0x3;
				local49 = this.anIntArray250[local40];
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					this.method604(local44, local32, local49, 0, local12, -1, local25, this.anInt876, local40);
				}
			} else {
				if (arg0 == 26) {
					local12 = arg1.method79();
					local16 = this.anInt998 + (local12 >> 4 & 0x7);
					local25 = this.anInt999 + (local12 & 0x7);
					local32 = arg1.method81();
					local36 = arg1.method79();
					local40 = local36 >> 4 & 0xF;
					local44 = local36 & 0x7;
					if (aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0] >= local16 - local40 && aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0] <= local16 + local40 && aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0] >= local25 - local40 && aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0] <= local25 + local40 && this.aBoolean251 && !aBoolean244 && this.anInt864 < 50) {
						this.anIntArray242[this.anInt864] = local32;
						this.anIntArray276[this.anInt864] = local44;
						this.anIntArray226[this.anInt864] = Class21.anIntArray61[local32];
						this.anInt864++;
					}
				}
				@Pc(220) int local220;
				@Pc(229) int local229;
				@Pc(236) int local236;
				@Pc(241) int local241;
				@Pc(244) int local244;
				if (arg0 == 27) {
					local12 = arg1.method100();
					local16 = local12 >> 2;
					local25 = local12 & 0x3;
					local32 = this.anIntArray250[local16];
					@Pc(202) byte local202 = arg1.method101();
					@Pc(206) byte local206 = arg1.method102();
					local44 = arg1.method81();
					@Pc(213) byte local213 = arg1.method101();
					@Pc(216) byte local216 = arg1.method80();
					local220 = arg1.method99();
					local229 = this.anInt998 + (local220 >> 4 & 0x7);
					local236 = this.anInt999 + (local220 & 0x7);
					local241 = arg1.method108(this.aByte43);
					local244 = arg1.method81();
					@Pc(247) int local247 = arg1.method81();
					@Pc(253) Class2_Sub1_Sub1_Sub1_Sub2 local253;
					if (local244 == this.anInt835) {
						local253 = aClass2_Sub1_Sub1_Sub1_Sub2_1;
					} else {
						local253 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local244];
					}
					if (local253 != null) {
						@Pc(265) Class46 local265 = Class46.method546(local247);
						@Pc(275) int local275 = this.anIntArrayArrayArray7[this.anInt876][local229][local236];
						@Pc(287) int local287 = this.anIntArrayArrayArray7[this.anInt876][local229 + 1][local236];
						@Pc(301) int local301 = this.anIntArrayArrayArray7[this.anInt876][local229 + 1][local236 + 1];
						@Pc(313) int local313 = this.anIntArrayArrayArray7[this.anInt876][local229][local236 + 1];
						@Pc(323) Class2_Sub1_Sub1_Sub6 local323 = local265.method551(local16, local25, local275, local287, local301, local313, -1);
						if (local323 != null) {
							this.method604(0, local236, local32, local44 + 1, -1, local241 + 1, local229, this.anInt876, 0);
							local253.anInt372 = local44 + anInt1013;
							local253.anInt373 = local241 + anInt1013;
							local253.aClass2_Sub1_Sub1_Sub6_1 = local323;
							@Pc(358) int local358 = local265.anInt783;
							@Pc(361) int local361 = local265.anInt789;
							if (local25 == 1 || local25 == 3) {
								local358 = local265.anInt789;
								local361 = local265.anInt783;
							}
							local253.anInt363 = local229 * 128 + local358 * 64;
							local253.anInt365 = local236 * 128 + local361 * 64;
							local253.anInt364 = this.method624(local253.anInt365, this.anInt876, local253.anInt363);
							@Pc(407) byte local407;
							if (local216 > local213) {
								local407 = local216;
								local216 = local213;
								local213 = local407;
							}
							if (local202 > local206) {
								local407 = local202;
								local202 = local206;
								local206 = local407;
							}
							local253.anInt367 = local229 + local216;
							local253.anInt369 = local229 + local213;
							local253.anInt368 = local236 + local202;
							local253.anInt370 = local236 + local206;
						}
					}
				}
				if (arg0 == 11) {
					local12 = arg1.method98();
					local16 = local12 >> 2;
					local25 = local12 & 0x3;
					local32 = this.anIntArray250[local16];
					local36 = arg1.method100();
					local40 = this.anInt998 + (local36 >> 4 & 0x7);
					local44 = this.anInt999 + (local36 & 0x7);
					if (local40 >= 0 && local44 >= 0 && local40 < 104 && local44 < 104) {
						this.method604(local25, local44, local32, 0, -1, -1, local40, this.anInt876, local16);
					}
				} else if (arg0 == 204) {
					local12 = arg1.method79();
					local16 = this.anInt998 + (local12 >> 4 & 0x7);
					local25 = this.anInt999 + (local12 & 0x7);
					local32 = arg1.method81();
					local36 = arg1.method79();
					local40 = arg1.method81();
					if (local16 >= 0 && local25 >= 0 && local16 < 104 && local25 < 104) {
						local16 = local16 * 128 + 64;
						local25 = local25 * 128 + 64;
						@Pc(578) Class2_Sub1_Sub1_Sub3 local578 = new Class2_Sub1_Sub1_Sub3(local40, this.anInt876, local25, anInt1013, 0, this.method624(local25, this.anInt876, local16) - local36, local16, local32);
						this.aClass50_11.method566(local578);
					}
				} else if (arg0 == 215) {
					local12 = arg1.method79();
					local16 = this.anInt998 + (local12 >> 4 & 0x7);
					local25 = this.anInt999 + (local12 & 0x7);
					local32 = arg1.method81();
					local36 = arg1.method81();
					local40 = arg1.method81();
					if (local16 >= 0 && local25 >= 0 && local16 < 104 && local25 < 104) {
						@Pc(634) Class50 local634 = this.aClass50ArrayArrayArray1[this.anInt876][local16][local25];
						if (local634 != null) {
							for (@Pc(640) Class2_Sub1_Sub1_Sub2 local640 = (Class2_Sub1_Sub1_Sub2) local634.method569(); local640 != null; local640 = (Class2_Sub1_Sub1_Sub2) local634.method571()) {
								if (local640.anInt226 == (local32 & 0x7FFF) && local640.anInt227 == local36) {
									local640.anInt227 = local40;
									break;
								}
							}
							this.method647(local16, local25);
						}
					}
				} else if (arg0 == 192) {
					local12 = arg1.method108(this.aByte43);
					local16 = arg1.method98();
					local25 = this.anInt998 + (local16 >> 4 & 0x7);
					local32 = this.anInt999 + (local16 & 0x7);
					local36 = arg1.method107();
					local40 = arg1.method107();
					if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local40 != this.anInt835) {
						@Pc(723) Class2_Sub1_Sub1_Sub2 local723 = new Class2_Sub1_Sub1_Sub2();
						local723.anInt226 = local36;
						local723.anInt227 = local12;
						if (this.aClass50ArrayArrayArray1[this.anInt876][local25][local32] == null) {
							this.aClass50ArrayArrayArray1[this.anInt876][local25][local32] = new Class50((byte) 8);
						}
						this.aClass50ArrayArrayArray1[this.anInt876][local25][local32].method566(local723);
						this.method647(local25, local32);
					}
				} else {
					@Pc(812) Class2_Sub1_Sub1_Sub2 local812;
					if (arg0 == 33) {
						local12 = arg1.method107();
						local16 = arg1.method79();
						local25 = this.anInt998 + (local16 >> 4 & 0x7);
						local32 = this.anInt999 + (local16 & 0x7);
						local36 = arg1.method107();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local812 = new Class2_Sub1_Sub1_Sub2();
							local812.anInt226 = local12;
							local812.anInt227 = local36;
							if (this.aClass50ArrayArrayArray1[this.anInt876][local25][local32] == null) {
								this.aClass50ArrayArrayArray1[this.anInt876][local25][local32] = new Class50((byte) 8);
							}
							this.aClass50ArrayArrayArray1[this.anInt876][local25][local32].method566(local812);
							this.method647(local25, local32);
						}
					} else {
						@Pc(905) int local905;
						if (arg0 == 12) {
							local12 = arg1.method79();
							local16 = this.anInt998 + (local12 >> 4 & 0x7);
							local25 = this.anInt999 + (local12 & 0x7);
							local32 = local16 + arg1.method80();
							local36 = local25 + arg1.method80();
							local40 = arg1.method82();
							local44 = arg1.method81();
							local49 = arg1.method79() * 4;
							local905 = arg1.method79() * 4;
							local220 = arg1.method81();
							local229 = arg1.method81();
							local236 = arg1.method79();
							local241 = arg1.method79();
							if (local16 >= 0 && local25 >= 0 && local16 < 104 && local25 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local44 != 65535) {
								local16 = local16 * 128 + 64;
								local25 = local25 * 128 + 64;
								local32 = local32 * 128 + 64;
								local36 = local36 * 128 + 64;
								@Pc(993) Class2_Sub1_Sub1_Sub4 local993 = new Class2_Sub1_Sub1_Sub4(this.anInt876, local229 + anInt1013, local241, local40, local905, local236, this.method624(local25, this.anInt876, local16) - local49, local25, local44, local16, false, local220 + anInt1013);
								local993.method247(local220 + anInt1013, local32, local36, this.method624(local36, this.anInt876, local32) - local905);
								this.aClass50_12.method566(local993);
							}
						} else if (arg0 == 62) {
							local12 = arg1.method107();
							local16 = arg1.method98();
							local25 = this.anInt998 + (local16 >> 4 & 0x7);
							local32 = this.anInt999 + (local16 & 0x7);
							if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
								@Pc(1062) Class50 local1062 = this.aClass50ArrayArrayArray1[this.anInt876][local25][local32];
								if (local1062 != null) {
									for (local812 = (Class2_Sub1_Sub1_Sub2) local1062.method569(); local812 != null; local812 = (Class2_Sub1_Sub1_Sub2) local1062.method571()) {
										if (local812.anInt226 == (local12 & 0x7FFF)) {
											local812.method504();
											break;
										}
									}
									if (local1062.method569() == null) {
										this.aClass50ArrayArrayArray1[this.anInt876][local25][local32] = null;
									}
									this.method647(local25, local32);
								}
							}
						} else if (arg0 == 76) {
							local12 = arg1.method106();
							local16 = arg1.method100();
							local25 = this.anInt998 + (local16 >> 4 & 0x7);
							local32 = this.anInt999 + (local16 & 0x7);
							local36 = arg1.method98();
							local40 = local36 >> 2;
							local44 = local36 & 0x3;
							local49 = this.anIntArray250[local40];
							if (local25 >= 0 && local32 >= 0 && local25 < 103 && local32 < 103) {
								local905 = this.anIntArrayArrayArray7[this.anInt876][local25][local32];
								local220 = this.anIntArrayArrayArray7[this.anInt876][local25 + 1][local32];
								local229 = this.anIntArrayArrayArray7[this.anInt876][local25 + 1][local32 + 1];
								local236 = this.anIntArrayArrayArray7[this.anInt876][local25][local32 + 1];
								if (local49 == 0) {
									@Pc(1218) Class16 local1218 = this.aClass27_1.method319(this.anInt876, local25, local32);
									if (local1218 != null) {
										local244 = local1218.anInt382 >> 14 & 0x7FFF;
										if (local40 == 2) {
											local1218.aClass2_Sub1_Sub1_2 = new Class2_Sub1_Sub1_Sub5(local236, local244, this.anInt843, false, local905, local44 + 4, local220, local229, 2, local12);
											local1218.aClass2_Sub1_Sub1_3 = new Class2_Sub1_Sub1_Sub5(local236, local244, this.anInt843, false, local905, local44 + 1 & 0x3, local220, local229, 2, local12);
										} else {
											local1218.aClass2_Sub1_Sub1_2 = new Class2_Sub1_Sub1_Sub5(local236, local244, this.anInt843, false, local905, local44, local220, local229, local40, local12);
										}
									}
								}
								if (local49 == 1) {
									@Pc(1299) Class11 local1299 = this.aClass27_1.method320(local25, this.anInt876, local32, this.anInt972);
									if (local1299 != null) {
										local1299.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub5(local236, local1299.anInt274 >> 14 & 0x7FFF, this.anInt843, false, local905, 0, local220, local229, 4, local12);
									}
								}
								if (local49 == 2) {
									@Pc(1334) Class37 local1334 = this.aClass27_1.method321(local25, local32, 229, this.anInt876);
									if (local40 == 11) {
										local40 = 10;
									}
									if (local1334 != null) {
										local1334.aClass2_Sub1_Sub1_7 = new Class2_Sub1_Sub1_Sub5(local236, local1334.anInt718 >> 14 & 0x7FFF, this.anInt843, false, local905, local44, local220, local229, local40, local12);
									}
								}
								if (local49 == 3) {
									@Pc(1374) Class42 local1374 = this.aClass27_1.method322(this.anInt876, local25, local32);
									if (local1374 != null) {
										local1374.aClass2_Sub1_Sub1_8 = new Class2_Sub1_Sub1_Sub5(local236, local1374.anInt748 >> 14 & 0x7FFF, this.anInt843, false, local905, local44, local220, local229, 22, local12);
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1399) RuntimeException local1399) {
			signlink.reporterror("77166, " + true + ", " + arg0 + ", " + arg1 + ", " + local1399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass27_1.method323(arg2, arg3, arg0);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass27_1.method327(arg2, arg3, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg1;
				if (local8 > 0) {
					local30 = arg4;
				}
				@Pc(38) int[] local38 = this.aClass2_Sub1_Sub3_Sub2_12.anIntArray63;
				local52 = arg3 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class46 local61 = Class46.method546(local58);
				if (local61.anInt784 == -1) {
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
					@Pc(71) Class2_Sub1_Sub3_Sub4 local71 = this.aClass2_Sub1_Sub3_Sub4Array5[local61.anInt784];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt783 * 4 - local71.anInt566) / 2;
						@Pc(93) int local93 = (local61.anInt789 * 4 - local71.anInt567) / 2;
						local71.method400((104 - arg0 - local61.anInt789) * 4 + local93 + 48, arg3 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass27_1.method325(arg2, arg3, arg0);
			this.anInt856 += 0;
			if (local8 != 0) {
				local18 = this.aClass27_1.method327(arg2, arg3, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(453) Class46 local453 = Class46.method546(local30);
				@Pc(485) int local485;
				if (local453.anInt784 != -1) {
					@Pc(463) Class2_Sub1_Sub3_Sub4 local463 = this.aClass2_Sub1_Sub3_Sub4Array5[local453.anInt784];
					if (local463 != null) {
						local58 = (local453.anInt783 * 4 - local463.anInt566) / 2;
						local485 = (local453.anInt789 * 4 - local463.anInt567) / 2;
						local463.method400((104 - arg0 - local453.anInt789) * 4 + local485 + 48, arg3 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(522) int[] local522 = this.aClass2_Sub1_Sub3_Sub2_12.anIntArray63;
					local485 = arg3 * 4 + (103 - arg0) * 512 * 4 + 24624;
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
			local8 = this.aClass27_1.method326(arg2, arg3, arg0);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(617) Class46 local617 = Class46.method546(local18);
				if (local617.anInt784 != -1) {
					@Pc(627) Class2_Sub1_Sub3_Sub4 local627 = this.aClass2_Sub1_Sub3_Sub4Array5[local617.anInt784];
					if (local627 != null) {
						local30 = (local617.anInt783 * 4 - local627.anInt566) / 2;
						@Pc(649) int local649 = (local617.anInt789 * 4 - local627.anInt567) / 2;
						local627.method400((104 - arg0 - local617.anInt789) * 4 + local649 + 48, arg3 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("38654, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method705() {
		try {
			if (this.anInt992 == 0 && this.anInt838 == 0) {
				this.aStringArray11[this.anInt909] = "Walk here";
				this.anIntArray221[this.anInt909] = 903;
				this.anIntArray219[this.anInt909] = super.anInt818;
				this.anIntArray220[this.anInt909] = super.anInt819;
				this.anInt909++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(50) int local50 = 0; local50 < Class2_Sub1_Sub1_Sub6.anInt774; local50++) {
				@Pc(56) int local56 = Class2_Sub1_Sub1_Sub6.anIntArray178[local50];
				@Pc(60) int local60 = local56 & 0x7F;
				@Pc(66) int local66 = local56 >> 7 & 0x7F;
				@Pc(72) int local72 = local56 >> 29 & 0x3;
				@Pc(78) int local78 = local56 >> 14 & 0x7FFF;
				if (local56 != local41) {
					local41 = local56;
					@Pc(225) int local225;
					if (local72 == 2 && this.aClass27_1.method327(this.anInt876, local60, local66, local56) >= 0) {
						@Pc(98) Class46 local98 = Class46.method546(local78);
						if (local98.anIntArray203 != null) {
							local98 = local98.method555();
						}
						if (local98 == null) {
							continue;
						}
						if (this.anInt992 == 1) {
							this.aStringArray11[this.anInt909] = "Use " + this.aString29 + " with @cya@" + local98.aString16;
							this.anIntArray221[this.anInt909] = 760;
							this.anIntArray222[this.anInt909] = local56;
							this.anIntArray219[this.anInt909] = local60;
							this.anIntArray220[this.anInt909] = local66;
							this.anInt909++;
						} else if (this.anInt838 != 1) {
							if (local98.aStringArray7 != null) {
								for (local225 = 4; local225 >= 0; local225--) {
									if (local98.aStringArray7[local225] != null) {
										this.aStringArray11[this.anInt909] = local98.aStringArray7[local225] + " @cya@" + local98.aString16;
										if (local225 == 0) {
											this.anIntArray221[this.anInt909] = 530;
										}
										if (local225 == 1) {
											this.anIntArray221[this.anInt909] = 479;
										}
										if (local225 == 2) {
											this.anIntArray221[this.anInt909] = 304;
										}
										if (local225 == 3) {
											this.anIntArray221[this.anInt909] = 58;
										}
										if (local225 == 4) {
											this.anIntArray221[this.anInt909] = 1237;
										}
										this.anIntArray222[this.anInt909] = local56;
										this.anIntArray219[this.anInt909] = local60;
										this.anIntArray220[this.anInt909] = local66;
										this.anInt909++;
									}
								}
							}
							this.aStringArray11[this.anInt909] = "Examine @cya@" + local98.aString16;
							this.anIntArray221[this.anInt909] = 1551;
							this.anIntArray222[this.anInt909] = local98.anInt782 << 14;
							this.anIntArray219[this.anInt909] = local60;
							this.anIntArray220[this.anInt909] = local66;
							this.anInt909++;
						} else if ((this.anInt840 & 0x4) == 4) {
							this.aStringArray11[this.anInt909] = this.aString18 + " @cya@" + local98.aString16;
							this.anIntArray221[this.anInt909] = 625;
							this.anIntArray222[this.anInt909] = local56;
							this.anIntArray219[this.anInt909] = local60;
							this.anIntArray220[this.anInt909] = local66;
							this.anInt909++;
						}
					}
					@Pc(405) Class2_Sub1_Sub1_Sub1_Sub1 local405;
					@Pc(453) Class2_Sub1_Sub1_Sub1_Sub2 local453;
					@Pc(443) int local443;
					if (local72 == 1) {
						@Pc(376) Class2_Sub1_Sub1_Sub1_Sub1 local376 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local78];
						if (local376.aClass32_1.aByte33 == 1 && (local376.anInt328 & 0x7F) == 64 && (local376.anInt329 & 0x7F) == 64) {
							for (local225 = 0; local225 < this.anInt983; local225++) {
								local405 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray264[local225]];
								if (local405 != null && local405 != local376 && local405.aClass32_1.aByte33 == 1 && local405.anInt328 == local376.anInt328 && local405.anInt329 == local376.anInt329) {
									this.method720(local405.aClass32_1, local60, local66, this.anIntArray264[local225]);
								}
							}
							for (local443 = 0; local443 < this.anInt913; local443++) {
								local453 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray240[local443]];
								if (local453 != null && local453.anInt328 == local376.anInt328 && local453.anInt329 == local376.anInt329) {
									this.method660(this.anIntArray240[local443], local66, local453, local60);
								}
							}
						}
						this.method720(local376.aClass32_1, local60, local66, local78);
					}
					if (local72 == 0) {
						@Pc(495) Class2_Sub1_Sub1_Sub1_Sub2 local495 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local78];
						if ((local495.anInt328 & 0x7F) == 64 && (local495.anInt329 & 0x7F) == 64) {
							for (local225 = 0; local225 < this.anInt983; local225++) {
								local405 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray264[local225]];
								if (local405 != null && local405.aClass32_1.aByte33 == 1 && local405.anInt328 == local495.anInt328 && local405.anInt329 == local495.anInt329) {
									this.method720(local405.aClass32_1, local60, local66, this.anIntArray264[local225]);
								}
							}
							for (local443 = 0; local443 < this.anInt913; local443++) {
								local453 = this.aClass2_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray240[local443]];
								if (local453 != null && local453 != local495 && local453.anInt328 == local495.anInt328 && local453.anInt329 == local495.anInt329) {
									this.method660(this.anIntArray240[local443], local66, local453, local60);
								}
							}
						}
						this.method660(local78, local66, local495, local60);
					}
					if (local72 == 3) {
						@Pc(614) Class50 local614 = this.aClass50ArrayArrayArray1[this.anInt876][local60][local66];
						if (local614 != null) {
							for (@Pc(621) Class2_Sub1_Sub1_Sub2 local621 = (Class2_Sub1_Sub1_Sub2) local614.method570(); local621 != null; local621 = (Class2_Sub1_Sub1_Sub2) local614.method572()) {
								@Pc(627) Class28 local627 = Class28.method410(local621.anInt226);
								if (this.anInt992 == 1) {
									this.aStringArray11[this.anInt909] = "Use " + this.aString29 + " with @lre@" + local627.aString13;
									this.anIntArray221[this.anInt909] = 212;
									this.anIntArray222[this.anInt909] = local621.anInt226;
									this.anIntArray219[this.anInt909] = local60;
									this.anIntArray220[this.anInt909] = local66;
									this.anInt909++;
								} else if (this.anInt838 != 1) {
									for (@Pc(744) int local744 = 4; local744 >= 0; local744--) {
										if (local627.aStringArray4 != null && local627.aStringArray4[local744] != null) {
											this.aStringArray11[this.anInt909] = local627.aStringArray4[local744] + " @lre@" + local627.aString13;
											if (local744 == 0) {
												this.anIntArray221[this.anInt909] = 5;
											}
											if (local744 == 1) {
												this.anIntArray221[this.anInt909] = 270;
											}
											if (local744 == 2) {
												this.anIntArray221[this.anInt909] = 435;
											}
											if (local744 == 3) {
												this.anIntArray221[this.anInt909] = 995;
											}
											if (local744 == 4) {
												this.anIntArray221[this.anInt909] = 307;
											}
											this.anIntArray222[this.anInt909] = local621.anInt226;
											this.anIntArray219[this.anInt909] = local60;
											this.anIntArray220[this.anInt909] = local66;
											this.anInt909++;
										} else if (local744 == 2) {
											this.aStringArray11[this.anInt909] = "Take @lre@" + local627.aString13;
											this.anIntArray221[this.anInt909] = 435;
											this.anIntArray222[this.anInt909] = local621.anInt226;
											this.anIntArray219[this.anInt909] = local60;
											this.anIntArray220[this.anInt909] = local66;
											this.anInt909++;
										}
									}
									this.aStringArray11[this.anInt909] = "Examine @lre@" + local627.aString13;
									this.anIntArray221[this.anInt909] = 1260;
									this.anIntArray222[this.anInt909] = local621.anInt226;
									this.anIntArray219[this.anInt909] = local60;
									this.anIntArray220[this.anInt909] = local66;
									this.anInt909++;
								} else if ((this.anInt840 & 0x1) == 1) {
									this.aStringArray11[this.anInt909] = this.aString18 + " @lre@" + local627.aString13;
									this.anIntArray221[this.anInt909] = 482;
									this.anIntArray222[this.anInt909] = local621.anInt226;
									this.anIntArray219[this.anInt909] = local60;
									this.anIntArray220[this.anInt909] = local66;
									this.anInt909++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(951) RuntimeException local951) {
			signlink.reporterror("84633, " + 106 + ", " + local951.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method706(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			if (this.aBoolean266 || this.aBoolean225 || this.aBoolean252) {
				this.method713();
			} else {
				anInt887++;
				if (this.aBoolean227) {
					this.method701();
				} else {
					this.method623(false);
				}
				this.anInt1021 = 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("84287, " + 6 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!RAOZRSKX;)V")
	private void method707(@OriginalArg(1) Class2_Sub1_Sub3_Sub4 arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray224.length; local12++) {
				this.anIntArray224[local12] = 0;
			}
			@Pc(37) int local37;
			for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
				local37 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray224[local37] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local37 = 0; local37 < 20; local37++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray225[local67] = (this.anIntArray224[local67 - 1] + this.anIntArray224[local67 + 1] + this.anIntArray224[local67 - 128] + this.anIntArray224[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray224;
				this.anIntArray224 = this.anIntArray225;
				this.anIntArray225 = local113;
			}
			if (arg0 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg0.anInt567; local59++) {
					for (local67 = 0; local67 < arg0.anInt566; local67++) {
						if (arg0.aByteArray14[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg0.anInt568 + 16;
							@Pc(156) int local156 = local59 + arg0.anInt569 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray224[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("49926, " + 0 + ", " + arg0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)V")
	private void method708(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(5) int[] local5 = this.aClass2_Sub1_Sub3_Sub2_12.anIntArray63;
			@Pc(8) int local8 = local5.length;
			@Pc(13) boolean local13 = false;
			for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
				local5[local19] = 0;
			}
			@Pc(43) int local43;
			@Pc(45) int local45;
			for (@Pc(31) int local31 = 1; local31 < 103; local31++) {
				local43 = (103 - local31) * 512 * 4 + 24628;
				for (local45 = 1; local45 < 103; local45++) {
					if ((this.aByteArrayArrayArray8[arg0][local45][local31] & 0x18) == 0) {
						this.aClass27_1.method332(local5, local43, arg0, local45, local31);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local45][local31] & 0x8) != 0) {
						this.aClass27_1.method332(local5, local43, arg0 + 1, local45, local31);
					}
					local43 += 4;
				}
			}
			local43 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local45 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass2_Sub1_Sub3_Sub2_12.method272();
			@Pc(155) int local155;
			for (@Pc(151) int local151 = 1; local151 < 103; local151++) {
				for (local155 = 1; local155 < 103; local155++) {
					if ((this.aByteArrayArrayArray8[arg0][local155][local151] & 0x18) == 0) {
						this.method704(local151, local43, arg0, local155, local45);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local155][local151] & 0x8) != 0) {
						this.method704(local151, local43, arg0 + 1, local155, local45);
					}
				}
			}
			if (this.aClass49_17 != null) {
				this.aClass49_17.method563();
				Class2_Sub1_Sub3_Sub3.anIntArray89 = this.anIntArray261;
			}
			this.anInt945 = 0;
			for (local155 = 0; local155 < 104; local155++) {
				for (@Pc(229) int local229 = 0; local229 < 104; local229++) {
					@Pc(239) int local239 = this.aClass27_1.method326(this.anInt876, local155, local229);
					if (local239 != 0) {
						local239 = local239 >> 14 & 0x7FFF;
						@Pc(251) int local251 = Class46.method546(local239).anInt788;
						if (local251 >= 0) {
							@Pc(255) int local255 = local155;
							@Pc(257) int local257 = local229;
							if (local251 != 22 && local251 != 29 && local251 != 34 && local251 != 36 && local251 != 46 && local251 != 47 && local251 != 48) {
								@Pc(289) int[][] local289 = this.aClass30Array1[this.anInt876].anIntArrayArray14;
								for (@Pc(291) int local291 = 0; local291 < 10; local291++) {
									@Pc(298) int local298 = (int) (Math.random() * 4.0D);
									if (local298 == 0 && local255 > 0 && local255 > local155 - 3 && (local289[local255 - 1][local257] & 0x1280108) == 0) {
										local255--;
									}
									if (local298 == 1 && local255 < 103 && local255 < local155 + 3 && (local289[local255 + 1][local257] & 0x1280180) == 0) {
										local255++;
									}
									if (local298 == 2 && local257 > 0 && local257 > local229 - 3 && (local289[local255][local257 - 1] & 0x1280102) == 0) {
										local257--;
									}
									if (local298 == 3 && local257 < 103 && local257 < local229 + 3 && (local289[local255][local257 + 1] & 0x1280120) == 0) {
										local257++;
									}
								}
							}
							this.aClass2_Sub1_Sub3_Sub2Array6[this.anInt945] = this.aClass2_Sub1_Sub3_Sub2Array8[local251];
							this.anIntArray247[this.anInt945] = local255;
							this.anIntArray248[this.anInt945] = local257;
							this.anInt945++;
						}
					}
				}
			}
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("26678, " + arg0 + ", " + arg1 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method580() {
		try {
			if (!this.aBoolean266 && !this.aBoolean225 && !this.aBoolean252) {
				anInt1013++;
				if (this.aBoolean227) {
					this.method603();
				} else {
					this.method715(this.anInt896);
				}
				this.method627();
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("71955, " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method709(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1072 = arg0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("43137, " + -44090 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt918 = Integer.parseInt(this.getParameter("nodeid"));
		anInt919 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method619();
		} else {
			method602();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean243 = false;
		} else {
			aBoolean243 = true;
		}
		this.method575(anInt892);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IOPHRJNF;ZIILclient!BFQIDHPO;)V")
	private void method710(@OriginalArg(0) Class2_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub2 arg3) {
		try {
			this.aBoolean227 &= true;
			if ((arg2 & 0x4) != 0) {
				arg0.anInt322 = arg3.method106();
				if (arg0.anInt322 == 65535) {
					arg0.anInt322 = -1;
				}
			}
			@Pc(30) int local30;
			if ((arg2 & 0x80) != 0) {
				local30 = arg3.method79();
				@Pc(33) byte[] local33 = new byte[local30];
				@Pc(39) Class2_Sub1_Sub2 local39 = new Class2_Sub1_Sub2(local33, -990);
				arg3.method88(local33, local30);
				this.aClass2_Sub1_Sub2Array1[arg1] = local39;
				arg0.method224(local39);
			}
			if ((arg2 & 0x100) != 0) {
				arg0.anInt339 = arg3.method100();
				arg0.anInt341 = arg3.method79();
				arg0.anInt340 = arg3.method79();
				arg0.anInt342 = arg3.method100();
				arg0.anInt343 = arg3.method106() + anInt1013;
				arg0.anInt344 = arg3.method106() + anInt1013;
				arg0.anInt345 = arg3.method99();
				arg0.method217();
			}
			@Pc(114) int local114;
			@Pc(126) int local126;
			if ((arg2 & 0x1) != 0) {
				local30 = arg3.method81();
				if (local30 == 65535) {
					local30 = -1;
				}
				local114 = arg3.method99();
				if (local30 == arg0.anInt316 && local30 != -1) {
					local126 = Class33.aClass33Array1[local30].anInt656;
					if (local126 == 1) {
						arg0.anInt317 = 0;
						arg0.anInt318 = 0;
						arg0.anInt319 = local114;
						arg0.anInt320 = 0;
					}
					if (local126 == 2) {
						arg0.anInt320 = 0;
					}
				} else if (local30 == -1 || arg0.anInt316 == -1 || Class33.aClass33Array1[local30].anInt650 >= Class33.aClass33Array1[arg0.anInt316].anInt650) {
					arg0.anInt316 = local30;
					arg0.anInt317 = 0;
					arg0.anInt318 = 0;
					arg0.anInt319 = local114;
					arg0.anInt320 = 0;
					arg0.anInt315 = arg0.anInt347;
				}
			}
			if ((arg2 & 0x2) != 0) {
				arg0.anInt353 = arg3.method81();
				arg0.anInt354 = arg3.method107();
			}
			if ((arg2 & 0x400) != 0) {
				local30 = arg3.method99();
				local114 = arg3.method79();
				arg0.method220(anInt1013, local114, local30);
				arg0.anInt350 = anInt1013 + 300;
				arg0.anInt351 = arg3.method79();
				arg0.anInt352 = arg3.method98();
			}
			if ((arg2 & 0x200) != 0) {
				arg0.anInt332 = arg3.method107();
				local30 = arg3.method113();
				arg0.anInt336 = local30 >> 16;
				arg0.anInt335 = anInt1013 + (local30 & 0xFFFF);
				arg0.anInt333 = 0;
				arg0.anInt334 = 0;
				if (arg0.anInt335 > anInt1013) {
					arg0.anInt333 = -1;
				}
				if (arg0.anInt332 == 65535) {
					arg0.anInt332 = -1;
				}
			}
			if ((arg2 & 0x8) != 0) {
				arg0.aString10 = arg3.method86();
				if (arg0.aString10.charAt(0) == '~') {
					arg0.aString10 = arg0.aString10.substring(1);
					this.method626(arg0.aString11, arg0.aString10, 2, this.anInt916);
				} else if (arg0 == aClass2_Sub1_Sub1_Sub1_Sub2_1) {
					this.method626(arg0.aString11, arg0.aString10, 2, this.anInt916);
				}
				arg0.anInt323 = 0;
				arg0.anInt331 = 0;
				arg0.anInt349 = 150;
			}
			if ((arg2 & 0x40) != 0) {
				local30 = arg3.method81();
				local114 = arg3.method98();
				local126 = arg3.method98();
				@Pc(344) int local344 = arg3.anInt123;
				if (arg0.aString11 != null && arg0.aBoolean84) {
					@Pc(354) long local354 = Class19.method231(arg0.aString11);
					@Pc(356) boolean local356 = false;
					if (local114 <= 1) {
						for (@Pc(361) int local361 = 0; local361 < this.anInt982; local361++) {
							if (this.aLongArray4[local361] == local354) {
								local356 = true;
								break;
							}
						}
					}
					if (!local356 && this.anInt991 == 0) {
						try {
							this.aClass2_Sub1_Sub2_9.anInt123 = 0;
							arg3.method88(this.aClass2_Sub1_Sub2_9.aByteArray1, local126);
							this.aClass2_Sub1_Sub2_9.anInt123 = 0;
							@Pc(407) String local407 = Class26.method293(this.anInt1038, this.aClass2_Sub1_Sub2_9, local126);
							@Pc(411) String local411 = Class1.method11(local407);
							arg0.aString10 = local411;
							arg0.anInt323 = local30 >> 8;
							arg0.anInt331 = local30 & 0xFF;
							arg0.anInt349 = 150;
							if (local114 == 2 || local114 == 3) {
								this.method626("@cr2@" + arg0.aString11, local411, 1, this.anInt916);
							} else if (local114 == 1) {
								this.method626("@cr1@" + arg0.aString11, local411, 1, this.anInt916);
							} else {
								this.method626(arg0.aString11, local411, 2, this.anInt916);
							}
						} catch (@Pc(478) Exception local478) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt123 = local344 + local126;
			}
			if ((arg2 & 0x10) != 0) {
				local30 = arg3.method79();
				local114 = arg3.method100();
				arg0.method220(anInt1013, local114, local30);
				arg0.anInt350 = anInt1013 + 300;
				arg0.anInt351 = arg3.method99();
				arg0.anInt352 = arg3.method79();
			}
		} catch (@Pc(519) RuntimeException local519) {
			signlink.reporterror("96136, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean249) {
			this.method657();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IIII)I")
	private int method711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(7) int local7 = 256 - arg3;
			return ((arg2 & 0xFF00FF) * local7 + (arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg2 & 0xFF00) * local7 + (arg0 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("34369, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)Ljava/net/Socket;")
	public Socket method712(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method713() {
		try {
			@Pc(4) Graphics local4 = this.method584().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method577();
			@Pc(43) byte local43;
			@Pc(49) int local49;
			if (this.aBoolean225) {
				this.aBoolean223 = false;
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
			if (this.aBoolean252) {
				this.aBoolean223 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean266) {
				this.aBoolean223 = false;
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
			signlink.reporterror("92350, " + 282 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IILclient!BFQIDHPO;)V")
	private void method714(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt914; local3++) {
				@Pc(10) int local10 = this.anIntArray241[local3];
				@Pc(15) Class2_Sub1_Sub1_Sub1_Sub1 local15 = this.aClass2_Sub1_Sub1_Sub1_Sub1Array1[local10];
				@Pc(18) int local18 = arg1.method79();
				if ((local18 & 0x20) != 0) {
					local15.aString10 = arg1.method86();
					local15.anInt349 = 100;
				}
				@Pc(37) int local37;
				@Pc(41) int local41;
				if ((local18 & 0x10) != 0) {
					local37 = arg1.method98();
					local41 = arg1.method99();
					local15.method220(anInt1013, local41, local37);
					local15.anInt350 = anInt1013 + 300;
					local15.anInt351 = arg1.method79();
					local15.anInt352 = arg1.method100();
				}
				if ((local18 & 0x1) != 0) {
					local15.anInt353 = arg1.method106();
					local15.anInt354 = arg1.method81();
				}
				if ((local18 & 0x40) != 0) {
					local15.aClass32_1 = Class32.method455(arg1.method81());
					local15.anInt321 = local15.aClass32_1.aByte33;
					local15.anInt338 = local15.aClass32_1.anInt627;
					local15.anInt311 = local15.aClass32_1.anInt635;
					local15.anInt312 = local15.aClass32_1.anInt637;
					local15.anInt313 = local15.aClass32_1.anInt625;
					local15.anInt314 = local15.aClass32_1.anInt640;
					local15.anInt309 = local15.aClass32_1.anInt644;
				}
				if ((local18 & 0x80) != 0) {
					local15.anInt322 = arg1.method108(this.aByte43);
					if (local15.anInt322 == 65535) {
						local15.anInt322 = -1;
					}
				}
				if ((local18 & 0x4) != 0) {
					local37 = arg1.method100();
					local41 = arg1.method99();
					local15.method220(anInt1013, local41, local37);
					local15.anInt350 = anInt1013 + 300;
					local15.anInt351 = arg1.method79();
					local15.anInt352 = arg1.method79();
				}
				if ((local18 & 0x8) != 0) {
					local37 = arg1.method106();
					if (local37 == 65535) {
						local37 = -1;
					}
					local41 = arg1.method100();
					if (local37 == local15.anInt316 && local37 != -1) {
						@Pc(195) int local195 = Class33.aClass33Array1[local37].anInt656;
						if (local195 == 1) {
							local15.anInt317 = 0;
							local15.anInt318 = 0;
							local15.anInt319 = local41;
							local15.anInt320 = 0;
						}
						if (local195 == 2) {
							local15.anInt320 = 0;
						}
					} else if (local37 == -1 || local15.anInt316 == -1 || Class33.aClass33Array1[local37].anInt650 >= Class33.aClass33Array1[local15.anInt316].anInt650) {
						local15.anInt316 = local37;
						local15.anInt317 = 0;
						local15.anInt318 = 0;
						local15.anInt319 = local41;
						local15.anInt320 = 0;
						local15.anInt315 = local15.anInt347;
					}
				}
				if ((local18 & 0x2) != 0) {
					local15.anInt332 = arg1.method106();
					local37 = arg1.method84();
					local15.anInt336 = local37 >> 16;
					local15.anInt335 = anInt1013 + (local37 & 0xFFFF);
					local15.anInt333 = 0;
					local15.anInt334 = 0;
					if (local15.anInt335 > anInt1013) {
						local15.anInt333 = -1;
					}
					if (local15.anInt332 == 65535) {
						local15.anInt332 = -1;
					}
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("53800, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method715(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 43818) {
				this.aBoolean239 = !this.aBoolean239;
			}
			@Pc(22) int local22;
			@Pc(29) int local29;
			if (this.anInt895 == 0) {
				local22 = super.anInt814 / 2 - 80;
				local29 = super.anInt815 / 2 + 20;
				@Pc(30) int local30 = local29 + 20;
				if (super.anInt823 == 1 && super.anInt824 >= local22 - 75 && super.anInt824 <= local22 + 75 && super.anInt825 >= local30 - 20 && super.anInt825 <= local30 + 20) {
					this.anInt895 = 3;
					this.anInt842 = 0;
				}
				local22 = super.anInt814 / 2 + 80;
				if (super.anInt823 == 1 && super.anInt824 >= local22 - 75 && super.anInt824 <= local22 + 75 && super.anInt825 >= local30 - 20 && super.anInt825 <= local30 + 20) {
					this.aString23 = "";
					this.aString24 = "Enter your username & password.";
					this.anInt895 = 2;
					this.anInt842 = 0;
					return;
				}
			} else {
				if (this.anInt895 == 2) {
					local22 = super.anInt815 / 2 - 40;
					local22 += 30;
					local22 += 25;
					if (super.anInt823 == 1 && super.anInt825 >= local22 - 15 && super.anInt825 < local22) {
						this.anInt842 = 0;
					}
					local22 += 15;
					if (super.anInt823 == 1 && super.anInt825 >= local22 - 15 && super.anInt825 < local22) {
						this.anInt842 = 1;
					}
					local22 += 15;
					local29 = super.anInt814 / 2 - 80;
					@Pc(175) int local175 = super.anInt815 / 2 + 50;
					@Pc(176) int local176 = local175 + 20;
					if (super.anInt823 == 1 && super.anInt824 >= local29 - 75 && super.anInt824 <= local29 + 75 && super.anInt825 >= local176 - 20 && super.anInt825 <= local176 + 20) {
						this.anInt848 = 0;
						this.method588(this.aString26, this.aString27, false);
						if (this.aBoolean227) {
							return;
						}
					}
					local29 = super.anInt814 / 2 + 80;
					if (super.anInt823 == 1 && super.anInt824 >= local29 - 75 && super.anInt824 <= local29 + 75 && super.anInt825 >= local176 - 20 && super.anInt825 <= local176 + 20) {
						this.anInt895 = 0;
						this.aString26 = "";
						this.aString27 = "";
					}
					while (true) {
						while (true) {
							@Pc(266) int local266 = this.method578();
							if (local266 == -1) {
								return;
							}
							@Pc(271) boolean local271 = false;
							for (@Pc(273) int local273 = 0; local273 < aString20.length(); local273++) {
								if (local266 == aString20.charAt(local273)) {
									local271 = true;
									break;
								}
							}
							if (this.anInt842 == 0) {
								if (local266 == 8 && this.aString26.length() > 0) {
									this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
								}
								if (local266 == 9 || local266 == 10 || local266 == 13) {
									this.anInt842 = 1;
								}
								if (local271) {
									this.aString26 = this.aString26 + (char) local266;
								}
								if (this.aString26.length() > 12) {
									this.aString26 = this.aString26.substring(0, 12);
								}
							} else if (this.anInt842 == 1) {
								if (local266 == 8 && this.aString27.length() > 0) {
									this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
								}
								if (local266 == 9 || local266 == 10 || local266 == 13) {
									this.anInt842 = 0;
								}
								if (local271) {
									this.aString27 = this.aString27 + (char) local266;
								}
								if (this.aString27.length() > 20) {
									this.aString27 = this.aString27.substring(0, 20);
								}
							}
						}
					}
				}
				if (this.anInt895 != 3) {
					return;
				}
				local22 = super.anInt814 / 2;
				local29 = super.anInt815 / 2 + 50;
				local29 += 20;
				if (super.anInt823 != 1 || super.anInt824 < local22 - 75 || super.anInt824 > local22 + 75 || super.anInt825 < local29 - 20 || super.anInt825 > local29 + 20) {
					return;
				}
				this.anInt895 = 0;
			}
		} catch (@Pc(463) RuntimeException local463) {
			signlink.reporterror("15832, " + arg0 + ", " + local463.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Z")
	private boolean method716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(11) Class10 local11 = Class10.method204(arg0);
			for (@Pc(13) int local13 = 0; local13 < local11.anIntArray48.length && local11.anIntArray48[local13] != -1; local13++) {
				@Pc(27) Class10 local27 = Class10.method204(local11.anIntArray48[local13]);
				if (local27.anInt267 == 0) {
					local3 |= this.method716(local27.anInt264, arg1);
				}
				@Pc(62) int local62;
				if (local27.anInt267 == 6 && (local27.anInt253 != -1 || local27.anInt254 != -1)) {
					@Pc(57) boolean local57 = this.method628(local27, this.aBoolean241);
					if (local57) {
						local62 = local27.anInt254;
					} else {
						local62 = local27.anInt253;
					}
					if (local62 != -1) {
						@Pc(74) Class33 local74 = Class33.aClass33Array1[local62];
						local27.anInt232 += arg1;
						while (local27.anInt232 > local74.method461(local27.anInt238)) {
							local27.anInt232 -= local74.method461(local27.anInt238) + 1;
							local27.anInt238++;
							if (local27.anInt238 >= local74.anInt648) {
								local27.anInt238 -= local74.anInt649;
								if (local27.anInt238 < 0 || local27.anInt238 >= local74.anInt648) {
									local27.anInt238 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local27.anInt267 == 6 && local27.anInt245 != 0) {
					@Pc(145) int local145 = local27.anInt245 >> 16;
					local62 = local27.anInt245 << 16 >> 16;
					@Pc(156) int local156 = local145 * arg1;
					local62 *= arg1;
					local27.anInt261 = local27.anInt261 + local156 & 0x7FF;
					local27.anInt262 = local27.anInt262 + local62 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("98005, " + arg0 + ", " + false + ", " + arg1 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method717(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean264 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray274[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class25.anInt487; local15++) {
					if (!Class25.aClass25Array1[local15].aBoolean115 && Class25.aClass25Array1[local15].anInt488 == local6 + (this.aBoolean259 ? 0 : 7)) {
						this.anIntArray274[local6] = local15;
						break;
					}
				}
			}
			@Pc(55) boolean local55 = false;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("89916, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method718(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt870 == 2) {
				for (@Pc(14) Class2_Sub2 local14 = (Class2_Sub2) this.aClass50_10.method569(); local14 != null; local14 = (Class2_Sub2) this.aClass50_10.method571()) {
					if (local14.anInt398 > 0) {
						local14.anInt398--;
					}
					if (local14.anInt398 != 0) {
						if (local14.anInt394 > 0) {
							local14.anInt394--;
						}
						if (local14.anInt394 == 0 && local14.anInt401 >= 1 && local14.anInt402 >= 1 && local14.anInt401 <= 102 && local14.anInt402 <= 102 && (local14.anInt403 < 0 || Class29.method423(local14.anInt403, local14.anInt405))) {
							this.method620(local14.anInt405, local14.anInt400, local14.anInt399, local14.anInt401, local14.anInt402, local14.anInt403, local14.anInt404);
							local14.anInt394 = -1;
							if (local14.anInt403 == local14.anInt395 && local14.anInt395 == -1) {
								local14.method504();
							} else if (local14.anInt403 == local14.anInt395 && local14.anInt404 == local14.anInt396 && local14.anInt405 == local14.anInt397) {
								local14.method504();
							}
						}
					} else if (local14.anInt395 < 0 || Class29.method423(local14.anInt395, local14.anInt397)) {
						this.method620(local14.anInt397, local14.anInt400, local14.anInt399, local14.anInt401, local14.anInt402, local14.anInt395, local14.anInt396);
						local14.method504();
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("68866, " + arg0 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
	private void method719(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt979; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt979--;
						this.aBoolean255 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt979; local28++) {
							this.aStringArray9[local28] = this.aStringArray9[local28 + 1];
							this.anIntArray227[local28] = this.anIntArray227[local28 + 1];
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass2_Sub1_Sub2_7.method68(19);
						this.aClass2_Sub1_Sub2_7.method75(this.anInt1053, arg0);
						break;
					}
				}
				this.aBoolean227 &= true;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("10263, " + true + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SHKUIFHF;IIIZ)V")
	private void method720(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.anInt909 < 400) {
				if (arg0.anIntArray114 != null) {
					arg0 = arg0.method458();
				}
				if (arg0 != null && arg0.aBoolean155) {
					@Pc(26) String local26 = arg0.aString14;
					if (arg0.anInt632 != 0) {
						local26 = local26 + method605(aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt376, arg0.anInt632) + " (level-" + arg0.anInt632 + ")";
					}
					if (this.anInt992 == 1) {
						this.aStringArray11[this.anInt909] = "Use " + this.aString29 + " with @yel@" + local26;
						this.anIntArray221[this.anInt909] = 963;
						this.anIntArray222[this.anInt909] = arg3;
						this.anIntArray219[this.anInt909] = arg1;
						this.anIntArray220[this.anInt909] = arg2;
						this.anInt909++;
					} else if (this.anInt838 != 1) {
						@Pc(164) int local164;
						if (arg0.aStringArray6 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg0.aStringArray6[local164] != null && !arg0.aStringArray6[local164].equalsIgnoreCase("attack")) {
									this.aStringArray11[this.anInt909] = arg0.aStringArray6[local164] + " @yel@" + local26;
									if (local164 == 0) {
										this.anIntArray221[this.anInt909] = 977;
									}
									if (local164 == 1) {
										this.anIntArray221[this.anInt909] = 112;
									}
									if (local164 == 2) {
										this.anIntArray221[this.anInt909] = 709;
									}
									if (local164 == 3) {
										this.anIntArray221[this.anInt909] = 526;
									}
									if (local164 == 4) {
										this.anIntArray221[this.anInt909] = 741;
									}
									this.anIntArray222[this.anInt909] = arg3;
									this.anIntArray219[this.anInt909] = arg1;
									this.anIntArray220[this.anInt909] = arg2;
									this.anInt909++;
								}
							}
						}
						if (arg0.aStringArray6 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg0.aStringArray6[local164] != null && arg0.aStringArray6[local164].equalsIgnoreCase("attack")) {
									@Pc(288) short local288 = 0;
									if (arg0.anInt632 > aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt376) {
										local288 = 2000;
									}
									this.aStringArray11[this.anInt909] = arg0.aStringArray6[local164] + " @yel@" + local26;
									if (local164 == 0) {
										this.anIntArray221[this.anInt909] = local288 + 977;
									}
									if (local164 == 1) {
										this.anIntArray221[this.anInt909] = local288 + 112;
									}
									if (local164 == 2) {
										this.anIntArray221[this.anInt909] = local288 + 709;
									}
									if (local164 == 3) {
										this.anIntArray221[this.anInt909] = local288 + 526;
									}
									if (local164 == 4) {
										this.anIntArray221[this.anInt909] = local288 + 741;
									}
									this.anIntArray222[this.anInt909] = arg3;
									this.anIntArray219[this.anInt909] = arg1;
									this.anIntArray220[this.anInt909] = arg2;
									this.anInt909++;
								}
							}
						}
						this.aStringArray11[this.anInt909] = "Examine @yel@" + local26;
						this.anIntArray221[this.anInt909] = 1170;
						this.anIntArray222[this.anInt909] = arg3;
						this.anIntArray219[this.anInt909] = arg1;
						this.anIntArray220[this.anInt909] = arg2;
						this.anInt909++;
					} else if ((this.anInt840 & 0x2) == 2) {
						this.aStringArray11[this.anInt909] = this.aString18 + " @yel@" + local26;
						this.anIntArray221[this.anInt909] = 947;
						this.anIntArray222[this.anInt909] = arg3;
						this.anIntArray219[this.anInt909] = arg1;
						this.anIntArray220[this.anInt909] = arg2;
						this.anInt909++;
						return;
					}
				}
			}
		} catch (@Pc(438) RuntimeException local438) {
			signlink.reporterror("66418, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local438.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIII)V")
	private void method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass2_Sub1_Sub3_Sub4_19.method400(arg1, arg0);
			this.aClass2_Sub1_Sub3_Sub4_20.method400(arg1 + arg5 - 16, arg0);
			Class2_Sub1_Sub3.method388(this.anInt947, arg0, arg1 + 16, 16, arg5 - 32);
			@Pc(35) int local35 = (arg5 - 32) * arg5 / arg4;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg5 - local35 - 32) * arg3 / (arg4 - arg5);
			Class2_Sub1_Sub3.method388(this.anInt1027, arg0, arg1 + local52 + 16, 16, local35);
			Class2_Sub1_Sub3.method393(this.anInt921, local35, arg0, arg1 + local52 + 16);
			Class2_Sub1_Sub3.method393(this.anInt921, local35, arg0 + 1, arg1 + 16 + local52);
			Class2_Sub1_Sub3.method391(16, arg0, this.anInt921, arg1 + local52 + 16);
			Class2_Sub1_Sub3.method391(16, arg0, this.anInt921, arg1 + local52 + 17);
			Class2_Sub1_Sub3.method393(this.anInt833, local35, arg0 + 15, arg1 + 16 + local52);
			Class2_Sub1_Sub3.method393(this.anInt833, local35 - 1, arg0 + 14, arg1 + local52 + 17);
			if (!arg2) {
				Class2_Sub1_Sub3.method391(16, arg0, this.anInt833, arg1 + local52 + local35 + 15);
				Class2_Sub1_Sub3.method391(15, arg0 + 1, this.anInt833, arg1 + local52 + local35 + 14);
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("82579, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IYAQHTAH;B)V")
	private void method722(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(12) boolean local12 = false;
			if (arg0.anInt400 == 0) {
				local1 = this.aClass27_1.method323(arg0.anInt399, arg0.anInt401, arg0.anInt402);
			}
			if (arg0.anInt400 == 1) {
				local1 = this.aClass27_1.method324(arg0.anInt399, arg0.anInt401, arg0.anInt402);
			}
			if (arg0.anInt400 == 2) {
				local1 = this.aClass27_1.method325(arg0.anInt399, arg0.anInt401, arg0.anInt402);
			}
			if (arg0.anInt400 == 3) {
				local1 = this.aClass27_1.method326(arg0.anInt399, arg0.anInt401, arg0.anInt402);
			}
			if (local1 != 0) {
				@Pc(87) int local87 = this.aClass27_1.method327(arg0.anInt399, arg0.anInt401, arg0.anInt402, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local87 & 0x1F;
				local7 = local87 >> 6;
			}
			arg0.anInt395 = local3;
			arg0.anInt397 = local5;
			arg0.anInt396 = local7;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("15889, " + arg0 + ", " + arg1 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method723() {
		try {
			if (this.anInt888 == 0 && super.anInt823 == 1) {
				@Pc(21) int local21 = super.anInt824 - 25 - 550;
				@Pc(28) int local28 = super.anInt825 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt969 + this.anInt966 & 0x7FF;
					@Pc(52) int local52 = Class2_Sub1_Sub3_Sub3.anIntArray87[local48];
					@Pc(56) int local56 = Class2_Sub1_Sub3_Sub3.anIntArray88[local48];
					@Pc(65) int local65 = local52 * (this.anInt1014 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt1014 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328 + local84 >> 7;
					@Pc(108) int local108 = aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329 - local94 >> 7;
					@Pc(129) boolean local129 = this.method650(0, 0, local108, true, (byte) 6, 0, local101, 1, aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray57[0], aClass2_Sub1_Sub1_Sub1_Sub2_1.anIntArray58[0], 0, 0);
					if (local129) {
						this.aClass2_Sub1_Sub2_7.method69(local21);
						this.aClass2_Sub1_Sub2_7.method69(local28);
						this.aClass2_Sub1_Sub2_7.method70(this.anInt969);
						this.aClass2_Sub1_Sub2_7.method69(57);
						this.aClass2_Sub1_Sub2_7.method69(this.anInt966);
						this.aClass2_Sub1_Sub2_7.method69(this.anInt1014);
						this.aClass2_Sub1_Sub2_7.method69(89);
						this.aClass2_Sub1_Sub2_7.method70(aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328);
						this.aClass2_Sub1_Sub2_7.method70(aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329);
						this.aClass2_Sub1_Sub2_7.method69(this.anInt1041);
						this.aClass2_Sub1_Sub2_7.method69(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("78065, " + -9 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method724() {
		try {
			@Pc(6) int local6 = this.anInt1055 * 128 + 64;
			@Pc(13) int local13 = this.anInt1056 * 128 + 64;
			@Pc(24) int local24 = this.method624(local13, this.anInt876, local6) - this.anInt1057;
			if (this.anInt1007 < local6) {
				this.anInt1007 += this.anInt1058 + (local6 - this.anInt1007) * this.anInt1059 / 1000;
				if (this.anInt1007 > local6) {
					this.anInt1007 = local6;
				}
			}
			if (this.anInt1007 > local6) {
				this.anInt1007 -= this.anInt1058 + (this.anInt1007 - local6) * this.anInt1059 / 1000;
				if (this.anInt1007 < local6) {
					this.anInt1007 = local6;
				}
			}
			if (this.anInt1008 < local24) {
				this.anInt1008 += this.anInt1058 + (local24 - this.anInt1008) * this.anInt1059 / 1000;
				if (this.anInt1008 > local24) {
					this.anInt1008 = local24;
				}
			}
			if (this.anInt1008 > local24) {
				this.anInt1008 -= this.anInt1058 + (this.anInt1008 - local24) * this.anInt1059 / 1000;
				if (this.anInt1008 < local24) {
					this.anInt1008 = local24;
				}
			}
			if (this.anInt1009 < local13) {
				this.anInt1009 += this.anInt1058 + (local13 - this.anInt1009) * this.anInt1059 / 1000;
				if (this.anInt1009 > local13) {
					this.anInt1009 = local13;
				}
			}
			if (this.anInt1009 > local13) {
				this.anInt1009 -= this.anInt1058 + (this.anInt1009 - local13) * this.anInt1059 / 1000;
				if (this.anInt1009 < local13) {
					this.anInt1009 = local13;
				}
			}
			local6 = this.anInt951 * 128 + 64;
			local13 = this.anInt952 * 128 + 64;
			local24 = this.method624(local13, this.anInt876, local6) - this.anInt953;
			@Pc(222) int local222 = local6 - this.anInt1007;
			@Pc(227) int local227 = local24 - this.anInt1008;
			@Pc(232) int local232 = local13 - this.anInt1009;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(265) int local265 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (this.aByte44 != -18) {
				this.aClass50ArrayArrayArray1 = null;
			}
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt1010 < local254) {
				this.anInt1010 += this.anInt954 + (local254 - this.anInt1010) * this.anInt955 / 1000;
				if (this.anInt1010 > local254) {
					this.anInt1010 = local254;
				}
			}
			if (this.anInt1010 > local254) {
				this.anInt1010 -= this.anInt954 + (this.anInt1010 - local254) * this.anInt955 / 1000;
				if (this.anInt1010 < local254) {
					this.anInt1010 = local254;
				}
			}
			@Pc(343) int local343 = local265 - this.anInt1011;
			if (local343 > 1024) {
				local343 -= 2048;
			}
			if (local343 < -1024) {
				local343 += 2048;
			}
			if (local343 > 0) {
				this.anInt1011 += this.anInt954 + local343 * this.anInt955 / 1000;
				this.anInt1011 &= 0x7FF;
			}
			if (local343 < 0) {
				this.anInt1011 -= this.anInt954 + -local343 * this.anInt955 / 1000;
				this.anInt1011 &= 0x7FF;
			}
			@Pc(401) int local401 = local265 - this.anInt1011;
			if (local401 > 1024) {
				local401 -= 2048;
			}
			if (local401 < -1024) {
				local401 += 2048;
			}
			if (local401 < 0 && local343 > 0 || local401 > 0 && local343 < 0) {
				this.anInt1011 = local265;
			}
		} catch (@Pc(422) RuntimeException local422) {
			signlink.reporterror("30381, " + -18 + ", " + local422.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
	private void method725() {
		try {
			this.anInt836++;
			this.method682(true);
			this.method632(true, this.aBoolean261);
			this.method682(false);
			this.method632(false, this.aBoolean261);
			this.method587();
			this.method600();
			@Pc(37) int local37;
			@Pc(76) int local76;
			if (!this.aBoolean222) {
				local37 = this.anInt968;
				if (this.anInt997 / 256 > local37) {
					local37 = this.anInt997 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray266[4] + 128 > local37) {
					local37 = this.anIntArray266[4] + 128;
				}
				local76 = this.anInt969 + this.anInt1031 & 0x7FF;
				this.method661(local76, this.anInt1039, this.anInt928, this.method624(aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt329, this.anInt876, aClass2_Sub1_Sub1_Sub1_Sub2_1.anInt328) - 50, this.anInt927, local37 * 3 + 600, local37);
			}
			if (this.aBoolean222) {
				local37 = this.method622();
			} else {
				local37 = this.method621();
			}
			local76 = this.anInt1007;
			@Pc(121) int local121 = this.anInt1008;
			@Pc(124) int local124 = this.anInt1009;
			@Pc(127) int local127 = this.anInt1010;
			@Pc(130) int local130 = this.anInt1011;
			@Pc(179) int local179;
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				if (this.aBooleanArray11[local132]) {
					local179 = (int) (Math.random() * (double) (this.anIntArray258[local132] * 2 + 1) - (double) this.anIntArray258[local132] + Math.sin((double) this.anIntArray256[local132] * ((double) this.anIntArray265[local132] / 100.0D)) * (double) this.anIntArray266[local132]);
					if (local132 == 0) {
						this.anInt1007 += local179;
					}
					if (local132 == 1) {
						this.anInt1008 += local179;
					}
					if (local132 == 2) {
						this.anInt1009 += local179;
					}
					if (local132 == 3) {
						this.anInt1011 = this.anInt1011 + local179 & 0x7FF;
					}
					if (local132 == 4) {
						this.anInt1010 += local179;
						if (this.anInt1010 < 128) {
							this.anInt1010 = 128;
						}
						if (this.anInt1010 > 383) {
							this.anInt1010 = 383;
						}
					}
				}
			}
			local179 = Class2_Sub1_Sub3_Sub3.anInt547;
			Class2_Sub1_Sub1_Sub6.aBoolean190 = true;
			Class2_Sub1_Sub1_Sub6.anInt774 = 0;
			Class2_Sub1_Sub1_Sub6.anInt772 = super.anInt818 - 4;
			Class2_Sub1_Sub1_Sub6.anInt773 = super.anInt819 - 4;
			Class2_Sub1_Sub3.method386();
			this.aClass27_1.method336(local37, this.anInt1009, this.anInt1008, this.anInt1010, this.anInt1007, this.anInt1011);
			this.aClass27_1.method311(191);
			this.method651(842);
			this.method648();
			this.method664(local179);
			this.method637();
			this.aClass49_17.method564(super.aGraphics2, 4, 4);
			this.anInt1007 = local76;
			this.anInt1008 = local121;
			this.anInt1009 = local124;
			this.anInt1010 = local127;
			this.anInt1011 = local130;
		} catch (@Pc(326) RuntimeException local326) {
			signlink.reporterror("10149, " + 7 + ", " + local326.toString());
			throw new RuntimeException();
		}
	}
}
