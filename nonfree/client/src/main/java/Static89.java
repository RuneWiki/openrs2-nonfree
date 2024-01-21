import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!sa", name = "Vb", descriptor = "[[I")
	public static int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!sa", name = "Zb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!sa", name = "ac", descriptor = "I")
	public static int anInt2380;

	@OriginalMember(owner = "client!sa", name = "bc", descriptor = "Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_12;

	@OriginalMember(owner = "client!sa", name = "fc", descriptor = "Lclient!ja;")
	public static Class33 aClass33_26;

	@OriginalMember(owner = "client!sa", name = "Nb", descriptor = "I")
	public static int anInt2373 = 0;

	@OriginalMember(owner = "client!sa", name = "Tb", descriptor = "Lclient!kc;")
	public static Class37 aClass37_24 = new Class37(260);

	@OriginalMember(owner = "client!sa", name = "Ub", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1279 = Static23.method501("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!sa", name = "Wb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1280 = Static23.method501("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!sa", name = "Xb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1281 = aClass42_1279;

	@OriginalMember(owner = "client!sa", name = "Yb", descriptor = "I")
	public static int anInt2379 = 0;

	@OriginalMember(owner = "client!sa", name = "cc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1282 = Static23.method501("scape main");

	@OriginalMember(owner = "client!sa", name = "dc", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1283 = Static23.method501("Your account is already logged in)3");

	@OriginalMember(owner = "client!sa", name = "ec", descriptor = "Z")
	public static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!sa", name = "hc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1284 = aClass42_1283;

	@OriginalMember(owner = "client!sa", name = "ic", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1285 = Static23.method501("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!ja;Lclient!ja;)V")
	public static void method1643(@OriginalArg(1) Class33 arg0, @OriginalArg(2) Class33 arg1) {
		Static53.aClass33_32 = arg1;
		Static56.aClass33_16 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
	public static void method1645() {
		Static47.aClass31_35.method996();
		Static11.aClass1_Sub1_Sub1_Sub4_4.method1147(0, 0);
		Static43.anIntArray165 = Static41.method689(Static43.anIntArray165);
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(BI)Lclient!mc;")
	public static Class42 method1646(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static38.method642(arg0);
		} else if (arg0 < 10000000) {
			return Static57.method1822(new Class42[] { Static38.method642(arg0 / 1000), Static15.aClass42_298 });
		} else {
			return Static57.method1822(new Class42[] { Static38.method642(arg0 / 1000000), Static18.aClass42_323 });
		}
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V")
	public static void method1647() {
		aClass42_1283 = null;
		aClass42_1285 = null;
		aClass42_1282 = null;
		aClass42_1281 = null;
		aClass37_24 = null;
		aClass42_1280 = null;
		anIntArrayArray27 = null;
		aClass33_26 = null;
		aClass42_1284 = null;
		aClass1_Sub1_Sub1_Sub1_12 = null;
		aClass42_1279 = null;
		aCanvas1 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIB)I")
	public static int method1649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg1;
		@Pc(9) int local9 = arg2 & arg1 - 1;
		@Pc(13) int local13 = arg2 / arg1;
		@Pc(23) int local23 = arg0 & arg1 - 1;
		@Pc(28) int local28 = Static43.method775(local3, local13);
		@Pc(35) int local35 = Static43.method775(local3 + 1, local13);
		@Pc(42) int local42 = Static43.method775(local3, local13 + 1);
		@Pc(51) int local51 = Static43.method775(local3 + 1, local13 + 1);
		@Pc(63) int local63 = Static69.method1242(local28, local23, arg1, local35);
		@Pc(70) int local70 = Static69.method1242(local42, local23, arg1, local51);
		return Static69.method1242(local63, local9, arg1, local70);
	}
}
