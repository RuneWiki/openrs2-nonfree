import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!sa", name = "pb", descriptor = "Z")
	public static boolean aBoolean185;

	@OriginalMember(owner = "client!sa", name = "qb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_64;

	@OriginalMember(owner = "client!sa", name = "xb", descriptor = "I")
	public static int anInt2237;

	@OriginalMember(owner = "client!sa", name = "Ab", descriptor = "Lclient!sb;")
	public static Class25 aClass25_118;

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
	public static int anInt2230 = 0;

	@OriginalMember(owner = "client!sa", name = "wb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1258 = Static75.method1216("");

	@OriginalMember(owner = "client!sa", name = "db", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1252 = aClass4_1258;

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1253 = aClass4_1258;

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1254 = Static75.method1216(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1255 = aClass4_1258;

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "[I")
	public static int[] anIntArray283 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1256 = aClass4_1258;

	@OriginalMember(owner = "client!sa", name = "nb", descriptor = "J")
	public static long aLong73 = 0L;

	@OriginalMember(owner = "client!sa", name = "sb", descriptor = "I")
	public static final int anInt2235 = 50;

	@OriginalMember(owner = "client!sa", name = "tb", descriptor = "[I")
	public static int[] anIntArray284 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!sa", name = "vb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1257 = aClass4_1258;

	@OriginalMember(owner = "client!sa", name = "zb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1259 = Static75.method1216("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!sa", name = "Cb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1260 = aClass4_1258;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
	public static void method1499() {
		Static5.aClass8_2.method198();
		Static101.aClass8_30.method198();
		Static35.aClass8_9.method198();
		Static27.aClass8_13.method198();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)I")
	public static int method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public static void method1501() {
		aClass4_1257 = null;
		aClass4_1255 = null;
		anIntArray283 = null;
		aClass4_1256 = null;
		anIntArray284 = null;
		aClass4_1260 = null;
		aClass4_1253 = null;
		aClass64_64 = null;
		aClass4_1258 = null;
		aClass4_1254 = null;
		aClass25_118 = null;
		aClass4_1252 = null;
		aClass4_1259 = null;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)Z")
	public static boolean method1502() {
		@Pc(13) Class68 local13 = Static5.aClass68_1;
		synchronized (Static5.aClass68_1) {
			if (Static25.anInt760 == Static39.anInt1067) {
				return false;
			} else {
				Static109.anInt2752 = Static83.anIntArray245[Static25.anInt760];
				Static47.anInt1180 = Static111.anIntArray336[Static25.anInt760];
				Static25.anInt760 = Static25.anInt760 + 1 & 0x7F;
				return true;
			}
		}
	}
}
