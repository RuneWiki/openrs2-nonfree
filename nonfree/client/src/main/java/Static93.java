import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!gf;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "Lclient!gd;")
	public static Class1_Sub1_Sub4_Sub3 aClass1_Sub1_Sub4_Sub3_3;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1127 = Static108.method1915("Nehmen");

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public static int anInt2195 = -1;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public static int anInt2200 = 0;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1129 = Static108.method1915("Sorry invited players only)3");

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1128 = aClass39_1129;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1130 = Static108.method1915("On");

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "[I")
	public static int[] anIntArray333 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1132 = Static108.method1915("Free world");

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1131 = aClass39_1132;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "[I")
	public static int[] anIntArray334 = new int[5];

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1133 = aClass39_1130;

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1134 = Static108.method1915("swe");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z")
	public static boolean method1565(@OriginalArg(1) int arg0) {
		if (!Static71.method1248(arg0)) {
			return false;
		}
		@Pc(18) boolean local18 = false;
		@Pc(22) Class1_Sub1_Sub1[] local22 = Static102.aClass1_Sub1_Sub1ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class1_Sub1_Sub1 local30 = local22[local24];
			if (local30 != null && local30.anInt91 == 6) {
				@Pc(58) int local58;
				if (local30.anInt76 != -1 || local30.anInt118 != -1) {
					@Pc(53) boolean local53 = Static98.method1719(local30);
					if (local53) {
						local58 = local30.anInt118;
					} else {
						local58 = local30.anInt76;
					}
					if (local58 != -1) {
						@Pc(70) Class1_Sub1_Sub7 local70 = Static82.method1398(local58);
						local30.anInt86 += Static107.anInt2687;
						label52: while (true) {
							do {
								do {
									if (local30.anInt86 <= local70.anIntArray149[local30.anInt98]) {
										break label52;
									}
									local30.anInt86 -= local70.anIntArray149[local30.anInt98];
									local30.anInt98++;
									local18 = true;
								} while (local70.anIntArray151.length > local30.anInt98);
								local30.anInt98 -= local70.anInt1047;
							} while (local30.anInt98 >= 0 && local70.anIntArray151.length > local30.anInt98);
							local30.anInt98 = 0;
						}
					}
				}
				if (local30.anInt58 != 0 && !local30.aBoolean14) {
					local18 = true;
					@Pc(156) int local156 = local30.anInt58 >> 16;
					local58 = local30.anInt58 << 16 >> 16;
					@Pc(167) int local167 = local156 * Static107.anInt2687;
					local30.anInt54 = local167 + local30.anInt54 & 0x7FF;
					local58 *= Static107.anInt2687;
					local30.anInt89 = local58 + local30.anInt89 & 0x7FF;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Z")
	public static boolean method1567(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z")
	public static boolean method1568(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method1570() {
		aClass39_1131 = null;
		aClass39_1129 = null;
		anIntArray334 = null;
		anIntArray333 = null;
		aClass39_1128 = null;
		aClass39_1132 = null;
		aClass39_1134 = null;
		aClass39_1127 = null;
		aClass39_1130 = null;
		aClass24_1 = null;
		aClass1_Sub1_Sub4_Sub3_3 = null;
		aClass39_1133 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
	public static int method1571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(29) int local29 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)Z")
	public static boolean method1573(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
