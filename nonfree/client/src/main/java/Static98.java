import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!ff;")
	public static Class24 aClass24_5 = null;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "[J")
	public static long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1423 = Static107.method1838("Create a free account");

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1422 = aClass28_1423;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array34 = new Class28[500];

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1424 = Static107.method1838("headicons_pk");

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public static int anInt2453 = 0;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1425 = null;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	public static int anInt2454 = 0;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1427 = Static107.method1838(" is already on your friend list)3");

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1426 = aClass28_1427;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray22 = new int[5][5000];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public static void method1723() {
		@Pc(1) Class44 local1 = Static173.aClass44_1;
		synchronized (Static173.aClass44_1) {
			Static152.anInt3425 = Static12.anInt553;
			Static93.anInt2353 = Static13.anInt597;
			Static169.anInt3798 = Static139.anInt3171;
			Static142.anInt3248 = Static80.anInt2057;
			Static101.anInt449 = Static179.anInt4036;
			Static130.anInt3042 = Static73.anInt1907;
			Static112.aLong100 = Static62.aLong58;
			Static80.anInt2057 = 0;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	public static void method1724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass49_1 = null;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method1725() {
		aClass28_1422 = null;
		aClass28_1424 = null;
		aClass28_1423 = null;
		anIntArrayArray22 = null;
		aClass28_1426 = null;
		aLongArray9 = null;
		aClass28_1425 = null;
		aClass28_1427 = null;
		aClass28Array34 = null;
		aClass24_5 = null;
	}
}
