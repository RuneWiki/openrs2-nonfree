import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
	public static void method1451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class20_Sub2 local7 = new Class20_Sub2();
		local7.anInt2453 = arg1;
		local7.aString13 = arg4;
		local7.anInt2444 = arg0;
		local7.anInt2446 = arg6;
		local7.anInt2449 = arg5;
		local7.anInt2448 = arg2;
		local7.anInt2442 = Static265.anInt4371 + arg3;
		Static436.aClass248_8.method5585(local7);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)[Lclient!be;")
	public static Class21[] method1452() {
		return new Class21[] { Static245.aClass21_3, Static375.aClass21_4, Static166.aClass21_1 };
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!ya;ILclient!dt;BIILclient!rp;Lclient!gp;)V")
	public static void method1453(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class223 arg5, @OriginalArg(7) Class100 arg6) {
		@Pc(15) int local15 = arg2.anInt1563 - arg1 / 2 - 5;
		@Pc(19) int local19 = arg4 + 2;
		if (arg6.anInt2470 != 0) {
			arg0.method5394(arg1 + 10, local15, arg4 + arg5.method4669() * arg3 + 1 - local19, local19, arg6.anInt2470);
		}
		if (arg6.anInt2464 != 0) {
			arg0.method5369(local15, arg1 + 10, arg6.anInt2464, arg3 * arg5.method4669() + arg4 + 1 - local19, local19);
		}
		@Pc(76) int local76 = arg6.anInt2462;
		if (arg2.aBoolean104 && arg6.anInt2456 != -1) {
			local76 = arg6.anInt2456;
		}
		for (@Pc(96) int local96 = 0; local96 < arg3; local96++) {
			@Pc(102) String local102 = Static51.aStringArray6[local96];
			if (arg3 - 1 > local96) {
				local102 = local102.substring(0, local102.length() - 4);
			}
			arg5.method4663(arg0, local102, arg2.anInt1563, arg4, local76);
			arg4 += arg5.method4669();
		}
	}
}
