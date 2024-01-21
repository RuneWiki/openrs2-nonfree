import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] aClass1_Sub3_Sub1_Sub5Array4;

	@OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lclient!ab;")
	public static Class3 aClass3_16;

	@OriginalMember(owner = "client!ja", name = "rb", descriptor = "I")
	public static int anInt1921;

	@OriginalMember(owner = "client!ja", name = "X", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_829 = Static187.method3089(" ");

	@OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!ja", name = "cb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_830 = Static187.method3089("leuchten1:");

	@OriginalMember(owner = "client!ja", name = "hb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_831 = aClass92_829;

	@OriginalMember(owner = "client!ja", name = "jb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_832 = Static187.method3089("Select");

	@OriginalMember(owner = "client!ja", name = "kb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_833 = Static187.method3089("<col=ffffff>");

	@OriginalMember(owner = "client!ja", name = "lb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_834 = Static187.method3089("Stufe)2");

	@OriginalMember(owner = "client!ja", name = "ob", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_9 = new Class20();

	@OriginalMember(owner = "client!ja", name = "pb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_835 = aClass92_832;

	@OriginalMember(owner = "client!ja", name = "qb", descriptor = "I")
	public static int anInt1920 = 0;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
	public static void method1318() {
		Static107.aClass20_13 = new Class20();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)V")
	public static void method1320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0 != Static107.anInt2321) {
			Static204.anIntArray179 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static204.anIntArray179[local13] = (local13 << 12) / arg0;
			}
			Static107.anInt2321 = arg0;
			anInt1921 = arg0 == 64 ? 2048 : 4096;
			Static144.anInt2893 = arg0 - 1;
		}
		if (Static123.anInt2607 == arg1) {
			return;
		}
		if (Static107.anInt2321 == arg1) {
			Static193.anIntArray277 = Static204.anIntArray179;
		} else {
			Static193.anIntArray277 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static193.anIntArray277[local13] = (local13 << 12) / arg1;
			}
		}
		Static15.anInt388 = arg1 - 1;
		Static123.anInt2607 = arg1;
	}
}
