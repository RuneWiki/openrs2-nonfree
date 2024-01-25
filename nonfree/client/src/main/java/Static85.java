import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_4 = new Class336(5, 5);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)Z")
	public static boolean method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static631.method8808(arg1, arg0) || Static639.method8893(arg1, arg0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIJI)V")
	public static void method1623(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) arg1 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg1 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local14 != 10 && local14 != 11 && local14 != 22) {
			Static471.method6829(0, 0, local14, arg2, arg0, 0, local21, true);
			return;
		}
		@Pc(44) Class277 local44 = Static652.aClass267_4.method6682(local28);
		@Pc(55) int local55;
		@Pc(52) int local52;
		if (local21 == 0 || local21 == 2) {
			local52 = local44.anInt7765;
			local55 = local44.anInt7764;
		} else {
			local55 = local44.anInt7765;
			local52 = local44.anInt7764;
		}
		@Pc(66) int local66 = local44.anInt7726;
		if (local21 != 0) {
			local66 = (local66 << local21 & 0xF) + (local66 >> 4 - local21);
		}
		Static471.method6829(local66, local55, 0, arg2, arg0, local52, 0, true);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	public static void method1625() {
		Static41.anInt961 = -1;
		Static46.anInt1071 = 1;
		@Pc(9) String local9 = null;
		if (Static365.aByteArray63 != null) {
			@Pc(16) Class3_Sub25 local16 = new Class3_Sub25(Static365.aByteArray63);
			local9 = Static28.method669(local16.method8600());
			Static276.aLong146 = local16.method8600();
		}
		if (local9 == null) {
			Static425.method6144(35);
		} else {
			Static191.method3505("", false, local9, true);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method1626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 + arg3;
		@Pc(16) int local16 = arg1 + arg0;
		@Pc(20) int local20 = arg4 + arg2;
		if (!Static9.method160(local16, arg5, local16, local7, arg5, arg4, local16, local20, local20)) {
			return false;
		} else if (Static9.method160(local16, local7, local16, local7, arg5, arg4, local16, arg4, local20)) {
			if (Static562.anInt9120 <= arg5) {
				if (!Static9.method160(arg0, local7, local16, local7, local7, local20, local16, arg4, local20)) {
					return false;
				}
				if (!Static9.method160(arg0, local7, local16, local7, local7, local20, arg0, arg4, arg4)) {
					return false;
				}
			} else if (!Static9.method160(arg0, arg5, local16, arg5, arg5, local20, local16, arg4, local20)) {
				return false;
			} else if (!Static9.method160(arg0, arg5, local16, arg5, arg5, local20, arg0, arg4, arg4)) {
				return false;
			}
			if (Static493.anInt8117 <= arg4) {
				if (!Static9.method160(arg0, arg5, local16, local7, arg5, local20, local16, local20, local20)) {
					return false;
				}
				if (!Static9.method160(arg0, local7, local16, local7, arg5, local20, arg0, local20, local20)) {
					return false;
				}
			} else if (!Static9.method160(arg0, arg5, local16, local7, arg5, arg4, local16, arg4, arg4)) {
				return false;
			} else if (!Static9.method160(arg0, local7, local16, local7, arg5, arg4, arg0, arg4, arg4)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
