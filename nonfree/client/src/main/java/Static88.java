import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	public static int anInt1136;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!qc;")
	public static Class53 aClass53_3;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Z")
	public static boolean aBoolean64;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_481 = Static2.method66("backbase1");

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public static int anInt1137 = -1;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	public static int anInt1139 = 0;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!ke;")
	private static Class39 aClass39_488 = Static2.method66("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!ke;")
	public static Class39 aClass39_482 = aClass39_488;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!ke;")
	private static Class39 aClass39_485 = Static2.method66("Loading config )2 ");

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!ke;")
	public static Class39 aClass39_483 = aClass39_485;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	public static int anInt1141 = 1;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!ke;")
	public static Class39 aClass39_484 = Static2.method66(":0");

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!ke;")
	private static Class39 aClass39_486 = Static2.method66("Click to continue");

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_487 = aClass39_486;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	public static void method806() {
		aClass39_481 = null;
		aClass39_488 = null;
		aClass39_484 = null;
		aClass39_487 = null;
		aClass53_3 = null;
		aClass39_485 = null;
		aClass39_483 = null;
		aClass39_482 = null;
		aClass39_486 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
	public static int method807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[BI)Z")
	public static boolean method808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(16) Class2_Sub5 local16 = new Class2_Sub5(arg2);
		@Pc(18) int local18 = -1;
		label65: while (true) {
			@Pc(22) int local22 = local16.method1258();
			if (local22 == 0) {
				return local7;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			@Pc(35) boolean local35 = false;
			while (true) {
				@Pc(65) int local65;
				@Pc(91) Class2_Sub1_Sub5 local91;
				do {
					@Pc(69) int local69;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(41) int local41;
									while (local35) {
										local41 = local16.method1258();
										if (local41 == 0) {
											continue label65;
										}
										local16.method1281();
									}
									local41 = local16.method1258();
									if (local41 == 0) {
										continue label65;
									}
									local33 += local41 - 1;
									@Pc(53) int local53 = local33 & 0x3F;
									@Pc(59) int local59 = local33 >> 6 & 0x3F;
									local65 = local16.method1281() >> 2;
									local69 = local59 + arg0;
									local74 = local53 + arg1;
								} while (local69 <= 0);
							} while (local74 <= 0);
						} while (local69 >= 103);
					} while (local74 >= 103);
					local91 = Static48.method916(local18);
				} while (local65 == 22 && Static35.aBoolean136 && local91.anInt551 == 0 && !local91.aBoolean32);
				local35 = true;
				if (!local91.method412()) {
					local7 = false;
					Static22.anInt591++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!jd;I)Z")
	public static boolean method809(@OriginalArg(1) Class36 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method1760(arg1);
		if (local16 == null) {
			return false;
		} else {
			Static96.method1852(local16);
			return true;
		}
	}
}
