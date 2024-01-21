import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "Lclient!u;")
	public static Class76 aClass76_75;

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
	public static int anInt2580 = 0;

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
	public static int anInt2581 = 0;

	@OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
	public static int anInt2582 = 0;

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
	public static int anInt2583 = 0;

	@OriginalMember(owner = "client!jg", name = "eb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_854 = Static49.method1293("(U3");

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(II)Lclient!wf;")
	public static Class1_Sub1_Sub18 method1911(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub18 local10 = (Class1_Sub1_Sub18) Static125.aClass25_19.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static163.aClass76_126.method3316(arg0, 13);
		local10 = new Class1_Sub1_Sub18();
		local10.anInt4561 = arg0;
		if (local25 != null) {
			local10.method3507(new Class1_Sub9(local25));
		}
		Static125.aClass25_19.method1299(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
	public static void method1912() {
		aClass76_75 = null;
		aClass70_854 = null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZI)V")
	public static void method1913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		local4[0] = arg0;
		@Pc(15) int[] local15 = new int[4];
		local15[0] = arg1;
		@Pc(26) int local26 = 1;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (arg0 != Static124.anIntArray326[local28]) {
				local4[local26] = Static124.anIntArray326[local28];
				local15[local26] = Static22.anIntArray35[local28];
				local26++;
			}
		}
		Static124.anIntArray326 = local4;
		Static22.anIntArray35 = local15;
		Static183.method3506(Static124.anIntArray326, Static24.aClass12Array1, Static22.anIntArray35, 0, Static24.aClass12Array1.length - 1);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Lclient!hd;")
	public static Class1_Sub1_Sub9 method1914(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) Static147.aClass25_22.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static57.aClass76_49.method3316(arg0, 16);
		local10 = new Class1_Sub1_Sub9();
		if (local25 != null) {
			local10.method1567(new Class1_Sub9(local25));
		}
		Static147.aClass25_22.method1299(local10, (long) arg0);
		return local10;
	}
}
