import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "Lclient!di;")
	public static final Class54 aClass54_28 = new Class54(65, 8);

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
	public static int anInt2110 = -1;

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "F")
	public static float aFloat44 = 1.0F;

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_36 = new Class265(99, 6);

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "[I")
	public static final int[] anIntArray154 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
	public static int method1695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static58.aClass64Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static229.anInt4427 - 1 || Static379.anInt6422 - 1 < local15) {
			return 0;
		}
		@Pc(43) int local43 = arg0;
		if (arg0 < 3 && (Static227.aByteArrayArrayArray8[1][local11][local15] & 0x2) != 0) {
			local43 = arg0 + 1;
		}
		return Static58.aClass64Array1[local43].a(arg2, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
	public static void method1696() {
		if (Static33.aClass49_1.method4455()) {
			Static33.aClass49_1.method4460(Static339.aCanvas7);
			Static217.method3408();
			Static33.aClass49_1.method4438(Static339.aCanvas7);
			Static33.aClass49_1.method4436(Static339.aCanvas7);
		} else {
			Static171.method2780(Static399.anInt6653);
		}
		Static260.method3927();
	}
}
