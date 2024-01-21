import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!kg", name = "qb", descriptor = "I")
	public static int anInt2314;

	@OriginalMember(owner = "client!kg", name = "sb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!kg", name = "tb", descriptor = "Lclient!md;")
	public static Class2_Sub4_Sub13 aClass2_Sub4_Sub13_1;

	@OriginalMember(owner = "client!kg", name = "ub", descriptor = "I")
	public static int anInt2315;

	@OriginalMember(owner = "client!kg", name = "wb", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!kg", name = "lb", descriptor = "Lclient!le;")
	public static Class2_Sub2_Sub1 aClass2_Sub2_Sub1_1 = new Class2_Sub2_Sub1(5000);

	@OriginalMember(owner = "client!kg", name = "mb", descriptor = "I")
	public static int anInt2311 = 0;

	@OriginalMember(owner = "client!kg", name = "pb", descriptor = "[I")
	public static int[] anIntArray221 = new int[100];

	@OriginalMember(owner = "client!kg", name = "rb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1387 = Static107.method1838("Hidden");

	@OriginalMember(owner = "client!kg", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1388 = aClass28_1387;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)Lclient!ma;")
	public static Class49 method1617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass49_1;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
	public static void method1618() {
		aClass2_Sub4_Sub13_1 = null;
		aClass2_Sub2_Sub1_1 = null;
		anIntArray222 = null;
		aClass28_1388 = null;
		aClass28_1387 = null;
		anIntArrayArrayArray7 = null;
		anIntArray221 = null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method1619(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static119.method1967(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(35) int local35 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(38) int local38;
			do {
				local38 = arg0.nextInt();
			} while (local38 >= local35);
			return Static66.method1217(local38, arg1);
		}
	}
}
