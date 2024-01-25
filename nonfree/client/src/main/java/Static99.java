import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array6;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "[Lclient!hb;")
	public static final Class11_Sub1_Sub1_Sub3_Sub1[] aClass11_Sub1_Sub1_Sub3_Sub1Array1 = new Class11_Sub1_Sub1_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "Lclient!em;")
	public static final Class83 aClass83_49 = new Class83(6, -1);

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
	public static int anInt1760 = 0;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg6 - arg3;
		@Pc(15) int local15 = arg4 + arg3;
		for (@Pc(24) int local24 = arg4; local24 < local15; local24++) {
			Static329.method4871(arg1, arg2, Static280.anIntArrayArray25[local24], arg0);
		}
		for (@Pc(40) int local40 = arg6; local40 > local10; local40--) {
			Static329.method4871(arg1, arg2, Static280.anIntArrayArray25[local40], arg0);
		}
		@Pc(58) int local58 = arg3 + arg1;
		@Pc(63) int local63 = arg2 - arg3;
		for (@Pc(65) int local65 = local15; local65 <= local10; local65++) {
			@Pc(71) int[] local71 = Static280.anIntArrayArray25[local65];
			Static329.method4871(arg1, local58, local71, arg0);
			Static329.method4871(local58, local63, local71, arg5);
			Static329.method4871(local63, arg2, local71, arg0);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BC)C")
	public static char method1468(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public static void method1469() {
		if (Static582.anInt9583 != -1) {
			Static589.method7857(Static582.anInt9583, -1, -1, false);
			Static582.anInt9583 = -1;
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
	public static void method1470() {
		if (Static124.aClass246Array1 == null) {
			Static124.aClass246Array1 = Static361.method5314();
			Static203.aClass246_1 = Static124.aClass246Array1[0];
			Static481.aLong221 = Static480.method6650();
		}
		if (Static520.aClass247_5 == null) {
			Static324.method4818();
		}
		@Pc(27) Class246 local27 = Static203.aClass246_1;
		@Pc(30) int local30 = Static550.method7494();
		if (Static203.aClass246_1 == local27) {
			Static513.aString97 = Static203.aClass246_1.aClass253_2.method5453(Static161.anInt3095);
			if (Static203.aClass246_1.aBoolean508) {
				Static342.anInt6294 = Static203.aClass246_1.anInt6557 + (Static203.aClass246_1.anInt6562 - Static203.aClass246_1.anInt6557) * local30 / 100;
			}
			if (Static203.aClass246_1.aBoolean507) {
				Static513.aString97 = Static513.aString97 + Static342.anInt6294 + "%";
			}
		} else if (Static361.aClass246_23 == Static203.aClass246_1) {
			Static520.aClass247_5 = null;
			Static318.method4726(3);
		} else {
			Static513.aString97 = local27.aClass253_1.method5453(Static161.anInt3095);
			Static342.anInt6294 = local27.anInt6562;
			if (Static203.aClass246_1.aBoolean507) {
				Static513.aString97 = Static513.aString97 + local27.anInt6562 + "%";
			}
			if (Static203.aClass246_1.aBoolean508 || local27.aBoolean508) {
				Static481.aLong221 = Static480.method6650();
			}
		}
		if (Static520.aClass247_5 == null) {
			return;
		}
		Static520.aClass247_5.method5331(Static481.aLong221, Static513.aString97, Static342.anInt6294, Static203.aClass246_1);
		if (Static432.anInterface24Array1 == null) {
			return;
		}
		for (@Pc(131) int local131 = Static277.anInt5050 + 1; local131 < Static432.anInterface24Array1.length; local131++) {
			if (Static432.anInterface24Array1[local131].method2171() >= 100 && Static277.anInt5050 == local131 - 1 && Static55.anInt1068 >= 1 && Static520.aClass247_5.method5320()) {
				try {
					Static432.anInterface24Array1[local131].method2170();
				} catch (@Pc(161) Exception local161) {
					Static432.anInterface24Array1 = null;
					return;
				}
				Static520.aClass247_5.method5328(Static432.anInterface24Array1[local131]);
				Static277.anInt5050++;
				if (Static432.anInterface24Array1.length - 1 <= Static277.anInt5050 && Static432.anInterface24Array1.length > 1) {
					Static277.anInt5050 = Static587.aClass169_6.method3540() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)Z")
	public static boolean method1471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "()V")
	public static void method1472() {
		for (@Pc(1) int local1 = Static584.anInt9623; local1 < Static119.anInt2474; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static327.anInt5993; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static191.anInt3757; local7++) {
					@Pc(16) Class360 local16 = Static568.aClass360ArrayArrayArray22[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class11_Sub1_Sub3 local21 = local16.aClass11_Sub1_Sub3_1;
						@Pc(24) Class11_Sub1_Sub3 local24 = local16.aClass11_Sub1_Sub3_2;
						if (local21 != null && local21.method7214()) {
							Static450.method6303(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7214()) {
								Static450.method6303(local24, local1, local4, local7, 1, 1);
								local24.method7215(local21, 0, 0, false, Static458.aClass78_153, 0);
								local24.method7222();
							}
							local21.method7222();
						}
						for (@Pc(68) Class21 local68 = local16.aClass21_4; local68 != null; local68 = local68.aClass21_1) {
							@Pc(72) Class11_Sub1_Sub1 local72 = local68.aClass11_Sub1_Sub1_1;
							if (local72 != null && local72.method7214()) {
								Static450.method6303(local72, local1, local4, local7, local72.aShort91 + 1 - local72.aShort90, local72.aShort89 - local72.aShort88 + 1);
								local72.method7222();
							}
						}
						@Pc(108) Class11_Sub1_Sub4 local108 = local16.aClass11_Sub1_Sub4_1;
						if (local108 != null && local108.method7214()) {
							Static403.method5809(local108, local1, local4, local7);
							local108.method7222();
						}
					}
				}
			}
		}
	}
}
