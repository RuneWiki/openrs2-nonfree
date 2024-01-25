import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIIIZ)I")
	public static int method1261(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub20 local10 = Static240.method3131(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray149.length; local23++) {
			if (local10.anIntArray149[local23] >= 0 && Static227.aClass65_2.anInt1635 > local10.anIntArray149[local23]) {
				@Pc(52) Class74 local52 = Static227.aClass65_2.method1327(local10.anIntArray149[local23]);
				@Pc(62) int local62 = local52.method1504(arg2, Static85.aClass132_5.method2771(arg2).anInt1998);
				if (arg0) {
					local21 += local10.anIntArray150[local23] * local62;
				} else {
					local21 += local62;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ic;I)I")
	public static int method1262(@OriginalArg(0) Class113 arg0) {
		@Pc(12) int local12 = 0;
		if (arg0.method2253(Static260.anInt5793)) {
			local12++;
		}
		if (arg0.method2253(Static334.anInt5485)) {
			local12++;
		}
		return local12;
	}
}
