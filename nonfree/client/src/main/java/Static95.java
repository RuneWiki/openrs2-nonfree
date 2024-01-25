import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBI)Z")
	public static boolean method1799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static294.aBoolean407) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static249.aClass365ArrayArray3[local21] == null || Static249.aClass365ArrayArray3[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class365 local43 = Static249.aClass365ArrayArray3[local21][local25];
		@Pc(55) Class1_Sub23 local55;
		if (arg1 == -1 && local43.anInt9595 == 0) {
			for (local55 = (Class1_Sub23) Static3.aClass361_1.method7854(); local55 != null; local55 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
				if (local55.anInt5147 == 2 || local55.anInt5147 == 1001 || local55.anInt5147 == 60 || local55.anInt5147 == 50 || local55.anInt5147 == 48) {
					for (@Pc(84) Class365 local84 = Static374.method5437(local55.anInt5145); local84 != null; local84 = Static498.method6955(local84)) {
						if (local84.anInt9646 == local43.anInt9646) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class1_Sub23) Static3.aClass361_1.method7854(); local55 != null; local55 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
				if (local55.anInt5144 == arg1 && local43.anInt9646 == local55.anInt5145 && (local55.anInt5147 == 2 || local55.anInt5147 == 1001 || local55.anInt5147 == 60 || local55.anInt5147 == 50 || local55.anInt5147 == 48)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Z")
	public static boolean method1800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIBI)V")
	public static void method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg3 - arg0;
		@Pc(18) int local18 = arg1 - arg4;
		if (local18 == 0) {
			if (local14 != 0) {
				Static503.method6992(arg4, arg3, arg0, arg2);
			}
		} else if (local14 == 0) {
			Static58.method1374(arg2, arg1, arg4, arg0);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local18 < 0) {
				local18 = -local18;
			}
			@Pc(70) boolean local70 = local14 > local18;
			@Pc(74) int local74;
			@Pc(76) int local76;
			if (local70) {
				local74 = arg4;
				local76 = arg1;
				arg4 = arg0;
				arg1 = arg3;
				arg0 = local74;
				arg3 = local76;
			}
			if (arg1 < arg4) {
				local74 = arg4;
				arg4 = arg1;
				local76 = arg0;
				arg1 = local74;
				arg0 = arg3;
				arg3 = local76;
			}
			local74 = arg0;
			local76 = arg1 - arg4;
			@Pc(109) int local109 = arg3 - arg0;
			@Pc(114) int local114 = -(local76 >> 1);
			if (local109 < 0) {
				local109 = -local109;
			}
			@Pc(130) int local130 = arg3 <= arg0 ? -1 : 1;
			@Pc(134) int local134;
			if (local70) {
				for (local134 = arg4; local134 <= arg1; local134++) {
					Static478.anIntArrayArray51[local134][local74] = arg2;
					local114 += local109;
					if (local114 > 0) {
						local114 -= local76;
						local74 += local130;
					}
				}
			} else {
				for (local134 = arg4; local134 <= arg1; local134++) {
					Static478.anIntArrayArray51[local74][local134] = arg2;
					local114 += local109;
					if (local114 > 0) {
						local114 -= local76;
						local74 += local130;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)V")
	public static void method1802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class278 local9 = Static176.aClass278ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static376.anInt6628 = local9.anInt7749;
			Static236.anInt4450 = local9.anInt7757;
			Static122.anInt2478 = local9.anInt7756;
		}
		Static318.method4844();
	}
}
