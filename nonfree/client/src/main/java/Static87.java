import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_10 = null;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1276 = Static106.method1849("Welcome to RuneScape");

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1275 = aClass66_1276;

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "Lclient!rc;")
	public static Class61 aClass61_14 = new Class61();

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "[I")
	public static int[] anIntArray387 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "[Lclient!wa;")
	public static Class80[] aClass80Array1 = new Class80[50];

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
	public static int anInt2308 = -2;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15 = new byte[4][104][104];

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1277 = null;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1278 = Static106.method1849("jlv");

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "[I")
	public static int[] anIntArray388 = new int[50];

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public static void method1624() {
		@Pc(1) Object local1 = Static108.anObject2;
		synchronized (Static108.anObject2) {
			if (Static96.anInt2466 != 0) {
				Static96.anInt2466 = 1;
				try {
					Static108.anObject2.wait();
				} catch (@Pc(18) InterruptedException local18) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
	public static void method1625() {
		aClass66_1278 = null;
		aByteArrayArray8 = null;
		aByteArrayArrayArray15 = null;
		aClass66_1275 = null;
		aClass61_14 = null;
		aClass66_1277 = null;
		anIntArray388 = null;
		aClass80Array1 = null;
		aClass1_Sub10_10 = null;
		aClass66_1276 = null;
		anIntArray387 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IJ)V")
	public static void method1626(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public static void method1627() {
		@Pc(10) Class36 local10 = Static123.aClass36_1;
		synchronized (Static123.aClass36_1) {
			Static122.anInt2828 = Static83.anInt2197;
			Static50.anInt1542 = Static6.anInt322;
			Static13.anInt462 = Static58.anInt1816;
			Static97.anInt2474 = Static134.anInt2956;
			Static35.anInt866 = Static132.anInt2933;
			Static6.anInt308 = Static81.anInt2186;
			Static98.aLong105 = Static83.aLong86;
			Static134.anInt2956 = 0;
		}
	}
}
