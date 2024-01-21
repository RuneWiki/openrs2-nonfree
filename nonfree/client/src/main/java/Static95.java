import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	public static int anInt3659;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Lclient!lc;")
	public static final Class54 aClass54_14 = new Class54(4096);

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1413 = Static120.method1824("scroll:");

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1414 = aClass80_1413;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1415 = aClass80_1413;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	public static int anInt3658 = 0;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1416 = Static120.method1824(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "[I")
	public static final int[] anIntArray455 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[BBI)Lclient!rd;")
	public static Class80 method2641(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class80 local9 = new Class80();
		local9.anInt3421 = 0;
		local9.aByteArray43 = new byte[arg2];
		for (@Pc(23) int local23 = arg0; local23 < arg0 + arg2; local23++) {
			if (arg1[local23] != 0) {
				local9.aByteArray43[local9.anInt3421++] = arg1[local23];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!oh;Z)V")
	public static void method2642(@OriginalArg(0) Class3_Sub1_Sub5_Sub4 arg0) {
		if (arg0.anInt4302 == 0) {
			return;
		}
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (arg0.anInt4328 != -1 && arg0.anInt4328 < 32768) {
			@Pc(27) Class3_Sub1_Sub5_Sub4_Sub1 local27 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[arg0.anInt4328];
			if (local27 != null) {
				local36 = arg0.anInt4329 - local27.anInt4329;
				local43 = arg0.anInt4315 - local27.anInt4315;
				if (local36 != 0 || local43 != 0) {
					arg0.anInt4309 = (int) (Math.atan2((double) local36, (double) local43) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(71) int local71;
		if (arg0.anInt4328 >= 32768) {
			local71 = arg0.anInt4328 - 32768;
			if (Static30.anInt4494 == local71) {
				local71 = 2047;
			}
			@Pc(80) Class3_Sub1_Sub5_Sub4_Sub2 local80 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local71];
			if (local80 != null) {
				local43 = arg0.anInt4329 - local80.anInt4329;
				@Pc(95) int local95 = arg0.anInt4315 - local80.anInt4315;
				if (local43 != 0 || local95 != 0) {
					arg0.anInt4309 = (int) (Math.atan2((double) local43, (double) local95) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4279 != 0 || arg0.anInt4290 != 0) && (arg0.anInt4297 == 0 || arg0.anInt4293 > 0)) {
			local71 = arg0.anInt4329 - (arg0.anInt4279 - Static97.anInt2062 - Static97.anInt2062) * 64;
			local36 = arg0.anInt4315 - (arg0.anInt4290 - Static39.anInt875 - Static39.anInt875) * 64;
			if (local71 != 0 || local36 != 0) {
				arg0.anInt4309 = (int) (Math.atan2((double) local71, (double) local36) * 325.949D) & 0x7FF;
			}
			arg0.anInt4279 = 0;
			arg0.anInt4290 = 0;
		}
		local71 = arg0.anInt4309 - arg0.anInt4301 & 0x7FF;
		if (local71 == 0) {
			arg0.anInt4306 = 0;
			return;
		}
		arg0.anInt4306++;
		@Pc(222) boolean local222;
		if (local71 > 1024) {
			arg0.anInt4301 -= arg0.anInt4302;
			local222 = true;
			if (arg0.anInt4302 > local71 || 2048 - arg0.anInt4302 < local71) {
				local222 = false;
				arg0.anInt4301 = arg0.anInt4309;
			}
			if (arg0.anInt4285 == arg0.anInt4326 && (arg0.anInt4306 > 25 || local222)) {
				if (arg0.anInt4318 == -1) {
					arg0.anInt4285 = arg0.anInt4324;
				} else {
					arg0.anInt4285 = arg0.anInt4318;
				}
			}
		} else {
			arg0.anInt4301 += arg0.anInt4302;
			local222 = true;
			if (arg0.anInt4302 > local71 || 2048 - arg0.anInt4302 < local71) {
				local222 = false;
				arg0.anInt4301 = arg0.anInt4309;
			}
			if (arg0.anInt4285 == arg0.anInt4326 && (arg0.anInt4306 > 25 || local222)) {
				if (arg0.anInt4311 == -1) {
					arg0.anInt4285 = arg0.anInt4324;
				} else {
					arg0.anInt4285 = arg0.anInt4311;
				}
			}
		}
		arg0.anInt4301 &= 0x7FF;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z")
	public static boolean method2643() {
		try {
			if (Static49.anInt1089 == 2) {
				if (Static185.aClass3_Sub25_1 == null) {
					Static185.aClass3_Sub25_1 = Static205.method3113(Static10.aClass1_1, Static172.anInt3855, Static121.anInt2648);
					if (Static185.aClass3_Sub25_1 == null) {
						return false;
					}
				}
				if (Static4.aClass72_1 == null) {
					Static4.aClass72_1 = new Class72(Static147.aClass1_26, Static143.aClass1_24);
				}
				if (Static18.aClass3_Sub4_Sub1_1.method211(Static4.aClass72_1, Static185.aClass3_Sub25_1, Static31.aClass1_4)) {
					Static18.aClass3_Sub4_Sub1_1.method205();
					Static18.aClass3_Sub4_Sub1_1.method229(Static25.anInt573);
					Static18.aClass3_Sub4_Sub1_1.method230(Static171.aBoolean153, Static185.aClass3_Sub25_1);
					Static185.aClass3_Sub25_1 = null;
					Static4.aClass72_1 = null;
					Static49.anInt1089 = 0;
					Static10.aClass1_1 = null;
					return true;
				}
			}
		} catch (@Pc(67) Exception local67) {
			local67.printStackTrace();
			Static18.aClass3_Sub4_Sub1_1.method220();
			Static49.anInt1089 = 0;
			Static185.aClass3_Sub25_1 = null;
			Static4.aClass72_1 = null;
			Static10.aClass1_1 = null;
		}
		return false;
	}
}
