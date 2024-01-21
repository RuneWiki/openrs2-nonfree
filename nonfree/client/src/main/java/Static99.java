import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ua", name = "yb", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!ua", name = "Bb", descriptor = "J")
	public static long aLong76;

	@OriginalMember(owner = "client!ua", name = "Ib", descriptor = "Z")
	public static boolean aBoolean127;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1255 = Static87.method1648("gleiten:");

	@OriginalMember(owner = "client!ua", name = "qb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1257 = Static87.method1648("Classic");

	@OriginalMember(owner = "client!ua", name = "mb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1256 = aClass27_1257;

	@OriginalMember(owner = "client!ua", name = "vb", descriptor = "Lclient!he;")
	public static Class28 aClass28_12 = new Class28();

	@OriginalMember(owner = "client!ua", name = "wb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!ua", name = "xb", descriptor = "I")
	public static int anInt2622 = 0;

	@OriginalMember(owner = "client!ua", name = "Ab", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1259 = Static87.method1648("white:");

	@OriginalMember(owner = "client!ua", name = "zb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1258 = aClass27_1259;

	@OriginalMember(owner = "client!ua", name = "Cb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1260 = Static87.method1648("backhmid1");

	@OriginalMember(owner = "client!ua", name = "Eb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1262 = Static87.method1648("Loaded gamescreen");

	@OriginalMember(owner = "client!ua", name = "Db", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1261 = aClass27_1262;

	@OriginalMember(owner = "client!ua", name = "Fb", descriptor = "I")
	public static int anInt2623 = 0;

	@OriginalMember(owner = "client!ua", name = "Gb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1263 = Static87.method1648("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ua", name = "Hb", descriptor = "[I")
	public static int[] anIntArray387 = new int[2048];

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
	public static void method1797() {
		aClass27_1255 = null;
		aClass28_12 = null;
		aClass27_1260 = null;
		anIntArray386 = null;
		aCRC32_3 = null;
		aClass27_1256 = null;
		aClass27_1262 = null;
		aClass27_1257 = null;
		aClass27_1263 = null;
		aClass27_1261 = null;
		aClass27_1259 = null;
		anIntArray387 = null;
		aClass27_1258 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Lclient!ha;")
	public static Class3_Sub3_Sub3 method1802(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub3_Sub3 local10 = (Class3_Sub3_Sub3) Static64.aClass21_20.method658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static102.aClass54_32.method1615(9, arg0);
		local10 = new Class3_Sub3_Sub3();
		local10.anInt914 = arg0;
		if (local20 != null) {
			local10.method725(new Class3_Sub11(local20));
		}
		local10.method715();
		Static64.aClass21_20.method660(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!td;Lclient!td;Lclient!td;I)V")
	public static void method1806(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class54 arg2) {
		Static108.aClass54_35 = arg1;
		Static67.aClass54_24 = arg2;
		Static76.aClass54_27 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
	public static void method1807() {
		Static70.anInt1829 = 0;
		Static18.anInt427 = 0;
		Static13.method642();
		Static73.method1341();
		Static67.method1235();
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static18.anInt427; local25++) {
			local31 = Static55.anIntArray240[local25];
			if (Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local31].anInt2382 != Static2.anInt38) {
				Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local31].aClass3_Sub3_Sub3_1 = null;
				Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local31] = null;
			}
		}
		if (Static47.aClass3_Sub11_Sub1_1.anInt2060 != Static11.anInt2733) {
			throw new RuntimeException("gnp1 pos:" + Static47.aClass3_Sub11_Sub1_1.anInt2060 + " psize:" + Static11.anInt2733);
		}
		for (local31 = 0; local31 < Static104.anInt2724; local31++) {
			if (Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[Static85.anIntArray349[local31]] == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static104.anInt2724);
			}
		}
	}
}
