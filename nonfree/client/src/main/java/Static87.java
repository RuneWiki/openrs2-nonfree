import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "[Lclient!td;")
	public static Class1_Sub2_Sub1_Sub6[] aClass1_Sub2_Sub1_Sub6Array1 = new Class1_Sub2_Sub1_Sub6[4];

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "Lclient!tg;")
	private static Class81 aClass81_682 = Static120.method2057(" has logged in)3");

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "Lclient!tg;")
	private static Class81 aClass81_684 = Static120.method2057("The server is being updated)3");

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_683 = aClass81_684;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "Lclient!tg;")
	private static Class81 aClass81_687 = Static120.method2057(" seconds)3");

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "Lclient!tg;")
	public static Class81 aClass81_685 = aClass81_687;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "Lclient!tg;")
	private static Class81 aClass81_688 = Static120.method2057("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "Lclient!tg;")
	public static Class81 aClass81_686 = aClass81_688;

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_689 = aClass81_682;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
	public static void method1494() {
		aClass81_682 = null;
		aClass1_Sub2_Sub1_Sub6Array1 = null;
		aBooleanArray11 = null;
		aClass81_686 = null;
		aClass81_684 = null;
		aClass81_685 = null;
		aClass81_689 = null;
		aClass81_687 = null;
		aClass81_688 = null;
		aClass81_683 = null;
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(III)I")
	public static int method1495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local19;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)V")
	public static void method1496(@OriginalArg(1) int arg0) {
		Static136.method2286();
		Static171.method3010();
		@Pc(12) int local12 = Static52.method933(arg0).anInt2132;
		if (local12 == 0) {
			return;
		}
		@Pc(23) int local23 = Static83.anIntArray178[arg0];
		if (local12 == 1) {
			Static150.anInt3391 = local23;
			if (Static150.anInt3391 == 1) {
				Static22.method497(0.9F);
			}
			if (Static150.anInt3391 == 2) {
				Static22.method497(0.8F);
			}
			if (Static150.anInt3391 == 3) {
				Static22.method497(0.7F);
			}
			if (Static150.anInt3391 == 4) {
				Static22.method497(0.6F);
			}
			Static93.method1580();
		}
		if (local12 == 3) {
			@Pc(67) short local67 = 0;
			if (local23 == 0) {
				local67 = 255;
			}
			if (local23 == 1) {
				local67 = 192;
			}
			if (local23 == 2) {
				local67 = 128;
			}
			if (local23 == 3) {
				local67 = 64;
			}
			if (local23 == 4) {
				local67 = 0;
			}
			if (local67 != Static121.anInt2708) {
				if (Static121.anInt2708 == 0 && Static7.anInt158 != -1) {
					Static173.method3042(Static7.anInt158, Static158.aClass82_Sub1_17, local67);
					Static141.aBoolean23 = false;
				} else if (local67 == 0) {
					Static167.method2979();
					Static141.aBoolean23 = false;
				} else {
					Static54.method967(local67);
				}
				Static121.anInt2708 = local67;
			}
		}
		if (local12 == 5) {
			Static40.anInt1050 = local23;
		}
		if (local12 == 10) {
			if (local23 == 0) {
				Static149.anInt3335 = 127;
			}
			if (local23 == 1) {
				Static149.anInt3335 = 96;
			}
			if (local23 == 2) {
				Static149.anInt3335 = 64;
			}
			if (local23 == 3) {
				Static149.anInt3335 = 32;
			}
			if (local23 == 4) {
				Static149.anInt3335 = 0;
			}
		}
		if (local12 == 9) {
			Static143.anInt3135 = local23;
		}
		if (local12 == 6) {
			Static50.anInt1178 = local23;
		}
		if (local12 != 4) {
			return;
		}
		if (local23 == 0) {
			Static19.anInt487 = 127;
		}
		if (local23 == 1) {
			Static19.anInt487 = 96;
		}
		if (local23 == 2) {
			Static19.anInt487 = 64;
		}
		if (local23 == 3) {
			Static19.anInt487 = 32;
		}
		if (local23 == 4) {
			Static19.anInt487 = 0;
			return;
		}
	}
}
