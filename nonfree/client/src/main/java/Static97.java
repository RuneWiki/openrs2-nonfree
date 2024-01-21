import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	public static int anInt2496 = 1;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Lclient!ed;")
	private static Class23 aClass23_961 = Static169.method2903("Service unavailable)3");

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_960 = aClass23_961;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Lclient!td;")
	public static Class79 aClass79_13 = new Class79(30);

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_962 = Static169.method2903("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	public static int anInt2500 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method1669() {
		aClass23_962 = null;
		aClass23_961 = null;
		aClass23_960 = null;
		aClass79_13 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ed;Lclient!ed;Lclient!ga;)[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] method1670(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(9) int local9 = arg2.method1281(arg0);
		@Pc(19) int local19 = arg2.method1296(arg1, local9);
		return Static15.method268(arg2, local9, local19);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method1671() {
		@Pc(9) int local9 = Static119.anInt3099 * 128 + 64;
		@Pc(15) int local15 = Static27.anInt863 * 128 + 64;
		@Pc(25) int local25 = Static99.method1680(local15, local9, Static85.anInt2267) - Static92.anInt2438;
		if (Static166.anInt4090 < local15) {
			Static166.anInt4090 += Static170.anInt815 * (local15 - Static166.anInt4090) / 1000 + Static158.anInt3840;
			if (local15 < Static166.anInt4090) {
				Static166.anInt4090 = local15;
			}
		}
		if (local15 < Static166.anInt4090) {
			Static166.anInt4090 -= Static158.anInt3840 + Static170.anInt815 * (Static166.anInt4090 - local15) / 1000;
			if (local15 > Static166.anInt4090) {
				Static166.anInt4090 = local15;
			}
		}
		if (local9 > Static162.anInt3999) {
			Static162.anInt3999 += Static158.anInt3840 + Static170.anInt815 * (local9 - Static162.anInt3999) / 1000;
			if (local9 < Static162.anInt3999) {
				Static162.anInt3999 = local9;
			}
		}
		if (local25 > Static163.anInt4011) {
			Static163.anInt4011 += Static158.anInt3840 + (local25 - Static163.anInt4011) * Static170.anInt815 / 1000;
			if (local25 < Static163.anInt4011) {
				Static163.anInt4011 = local25;
			}
		}
		if (local25 < Static163.anInt4011) {
			Static163.anInt4011 -= Static170.anInt815 * (Static163.anInt4011 - local25) / 1000 + Static158.anInt3840;
			if (Static163.anInt4011 < local25) {
				Static163.anInt4011 = local25;
			}
		}
		local15 = Static21.anInt684 * 128 + 64;
		if (Static162.anInt3999 > local9) {
			Static162.anInt3999 -= Static158.anInt3840 + (Static162.anInt3999 - local9) * Static170.anInt815 / 1000;
			if (local9 > Static162.anInt3999) {
				Static162.anInt3999 = local9;
			}
		}
		local9 = Static178.anInt4248 * 128 + 64;
		local25 = Static99.method1680(local15, local9, Static85.anInt2267) - Static93.anInt2445;
		@Pc(204) int local204 = local25 - Static163.anInt4011;
		@Pc(209) int local209 = local15 - Static166.anInt4090;
		@Pc(214) int local214 = local9 - Static162.anInt3999;
		@Pc(225) int local225 = (int) Math.sqrt((double) (local209 * local209 + local214 * local214));
		@Pc(236) int local236 = (int) (Math.atan2((double) local204, (double) local225) * 325.949D) & 0x7FF;
		@Pc(247) int local247 = (int) (-325.949D * Math.atan2((double) local214, (double) local209)) & 0x7FF;
		if (local236 < 128) {
			local236 = 128;
		}
		if (local236 > 383) {
			local236 = 383;
		}
		if (local236 > Static46.anInt4326) {
			Static46.anInt4326 += Static135.anInt3417 + (local236 - Static46.anInt4326) * Static10.anInt382 / 1000;
			if (local236 < Static46.anInt4326) {
				Static46.anInt4326 = local236;
			}
		}
		@Pc(290) int local290 = local247 - Static29.anInt886;
		if (local236 < Static46.anInt4326) {
			Static46.anInt4326 -= Static10.anInt382 * (Static46.anInt4326 - local236) / 1000 + Static135.anInt3417;
			if (Static46.anInt4326 < local236) {
				Static46.anInt4326 = local236;
			}
		}
		if (local290 > 1024) {
			local290 -= 2048;
		}
		if (local290 < -1024) {
			local290 += 2048;
		}
		if (local290 > 0) {
			Static29.anInt886 += local290 * Static10.anInt382 / 1000 + Static135.anInt3417;
			Static29.anInt886 &= 0x7FF;
		}
		if (local290 < 0) {
			Static29.anInt886 -= Static10.anInt382 * -local290 / 1000 + Static135.anInt3417;
			Static29.anInt886 &= 0x7FF;
		}
		@Pc(383) int local383 = local247 - Static29.anInt886;
		if (local383 > 1024) {
			local383 -= 2048;
		}
		if (local383 < -1024) {
			local383 += 2048;
		}
		if (local383 < 0 && local290 > 0 || local383 > 0 && local290 < 0) {
			Static29.anInt886 = local247;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lclient!ch;")
	public static Class1_Sub1_Sub5 method1672(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub5 local10 = (Class1_Sub1_Sub5) Static51.aClass79_6.method2657((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static148.aClass30_55.method1301(1, arg0);
		local10 = new Class1_Sub1_Sub5();
		if (local20 != null) {
			local10.method439(new Class1_Sub8(local20), arg0);
		}
		Static51.aClass79_6.method2658((long) arg0, local10);
		return local10;
	}
}
