import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!lm;")
	public static Class134 aClass134_3;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public static int anInt115;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Lclient!cr;")
	public static Class37 aClass37_1 = new Class37(128);

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public static int anInt116 = 0;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_2 = new Class37(4);

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)I")
	public static int method114(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ii;Lclient!nc;IIIII)V")
	public static void method115(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static132.anInt6773) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static97.anInt1852) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static3.anInt38 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class83 local62 = Static347.aClass83ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static263.aClass12Array2[local17].method2704(local23, local32) + Static263.aClass12Array2[local17].method2704(local23 + 1, local32) + Static263.aClass12Array2[local17].method2704(local23, local32 + 1) + Static263.aClass12Array2[local17].method2704(local23 + 1, local32 + 1)) / 4 - (Static263.aClass12Array2[arg2].method2704(arg3, arg4) + Static263.aClass12Array2[arg2].method2704(arg3 + 1, arg4) + Static263.aClass12Array2[arg2].method2704(arg3, arg4 + 1) + Static263.aClass12Array2[arg2].method2704(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class10_Sub2 local143 = local62.aClass10_Sub2_1;
									@Pc(146) Class10_Sub2 local146 = local62.aClass10_Sub2_2;
									if (local143 != null && local143.method5824()) {
										arg1.method5825(arg0, (local32 - arg4) * 128 + (1 - arg6) * 64, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, local143, local1);
									}
									if (local146 != null && local146.method5824()) {
										arg1.method5825(arg0, (local32 - arg4) * 128 + (1 - arg6) * 64, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, local146, local1);
									}
									for (@Pc(219) Class59 local219 = local62.aClass59_2; local219 != null; local219 = local219.aClass59_1) {
										@Pc(223) Class10_Sub1 local223 = local219.aClass10_Sub1_1;
										if (local223 != null && local223.method5824() && (local23 == local223.aShort94 || local23 == local3) && (local32 == local223.aShort91 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort93 + 1 - local223.aShort94;
											@Pc(260) int local260 = local223.aShort92 + 1 - local223.aShort91;
											arg1.method5825(arg0, (local223.aShort91 - arg4) * 128 + (local260 - arg6) * 64, local140, (local223.aShort94 - arg3) * 128 + (local252 - arg5) * 64, local223, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
