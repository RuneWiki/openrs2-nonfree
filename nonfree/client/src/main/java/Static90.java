import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "Lclient!ps;")
	public static Class163 aClass163_6;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
	public static int anInt1710;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public static int anInt1705 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBIIII)V")
	public static void method1436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg1;
		@Pc(15) int local15 = arg4 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static124.method1991(arg2, arg1, arg0, arg3);
			}
		} else if (local10 == 0) {
			Static117.method1844(arg2, arg0, arg1, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(67) boolean local67 = local10 > local15;
			@Pc(71) int local71;
			@Pc(73) int local73;
			if (local67) {
				local71 = arg0;
				local73 = arg4;
				arg0 = arg1;
				arg4 = arg3;
				arg1 = local71;
				arg3 = local73;
			}
			if (arg4 < arg0) {
				local71 = arg0;
				local73 = arg1;
				arg0 = arg4;
				arg4 = local71;
				arg1 = arg3;
				arg3 = local73;
			}
			local71 = arg1;
			local73 = arg4 - arg0;
			@Pc(111) int local111 = arg3 - arg1;
			@Pc(122) int local122 = -(local73 >> 1);
			@Pc(129) int local129 = arg1 < arg3 ? 1 : -1;
			if (local111 < 0) {
				local111 = -local111;
			}
			@Pc(138) int local138;
			if (local67) {
				for (local138 = arg0; local138 <= arg4; local138++) {
					Static319.anIntArrayArray31[local138][local71] = arg2;
					local122 += local111;
					if (local122 > 0) {
						local122 -= local73;
						local71 += local129;
					}
				}
			} else {
				for (local138 = arg0; local138 <= arg4; local138++) {
					Static319.anIntArrayArray31[local71][local138] = arg2;
					local122 += local111;
					if (local122 > 0) {
						local71 += local129;
						local122 -= local73;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	public static void method1438() {
		@Pc(5) Class37 local5 = Static50.aClass37_24;
		synchronized (Static50.aClass37_24) {
			Static50.aClass37_24.method920(5);
		}
		local5 = Static203.aClass37_65;
		synchronized (Static203.aClass37_65) {
			Static203.aClass37_65.method920(5);
		}
	}
}
