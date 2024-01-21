import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt2064;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_725 = Static120.method2057("sch-Utteln:");

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_726 = Static120.method2057("<img=0>");

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_727 = Static120.method2057("<col=80ff00>");

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_728 = Static120.method2057("l");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1577() {
		aClass81_726 = null;
		aClass81_725 = null;
		aClass81_727 = null;
		aClass81_728 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
	public static void method1578() {
		@Pc(3) int local3 = Static19.anIntArray21[Static111.anInt2516];
		@Pc(7) Class85[] local7 = Static19.aClass85ArrayArray1[Static111.anInt2516];
		Static120.anInt2675 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class85 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt3961 == 1) {
				local27 = local16.anInt3950 + Static63.anInt1552 - Static21.anInt535;
				if (local27 >= 0 && local27 <= Static63.anInt1552 + Static63.anInt1552) {
					local42 = local16.anInt3949 + Static63.anInt1552 - Static183.anInt4109;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3959 + Static63.anInt1552 - Static183.anInt4109;
					if (local53 > Static63.anInt1552 + Static63.anInt1552) {
						local53 = Static63.anInt1552 + Static63.anInt1552;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static154.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static122.anInt2747 - local16.anInt3958;
						if (local85 > 32) {
							local16.anInt3948 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3948 = 2;
							local85 = -local85;
						}
						local16.anInt3951 = (local16.anInt3957 - Static184.anInt4119 << 8) / local85;
						local16.anInt3946 = (local16.anInt3942 - Static184.anInt4119 << 8) / local85;
						local16.anInt3944 = (local16.anInt3945 - Static89.anInt4025 << 8) / local85;
						local16.anInt3941 = (local16.anInt3955 - Static89.anInt4025 << 8) / local85;
						Static155.aClass85Array1[Static120.anInt2675++] = local16;
					}
				}
			} else if (local16.anInt3961 == 2) {
				local27 = local16.anInt3949 + Static63.anInt1552 - Static183.anInt4109;
				if (local27 >= 0 && local27 <= Static63.anInt1552 + Static63.anInt1552) {
					local42 = local16.anInt3950 + Static63.anInt1552 - Static21.anInt535;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3954 + Static63.anInt1552 - Static21.anInt535;
					if (local53 > Static63.anInt1552 + Static63.anInt1552) {
						local53 = Static63.anInt1552 + Static63.anInt1552;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static154.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static184.anInt4119 - local16.anInt3957;
						if (local85 > 32) {
							local16.anInt3948 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3948 = 4;
							local85 = -local85;
						}
						local16.anInt3952 = (local16.anInt3958 - Static122.anInt2747 << 8) / local85;
						local16.anInt3943 = (local16.anInt3953 - Static122.anInt2747 << 8) / local85;
						local16.anInt3944 = (local16.anInt3945 - Static89.anInt4025 << 8) / local85;
						local16.anInt3941 = (local16.anInt3955 - Static89.anInt4025 << 8) / local85;
						Static155.aClass85Array1[Static120.anInt2675++] = local16;
					}
				}
			} else if (local16.anInt3961 == 4) {
				local27 = local16.anInt3945 - Static89.anInt4025;
				if (local27 > 128) {
					local42 = local16.anInt3949 + Static63.anInt1552 - Static183.anInt4109;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3959 + Static63.anInt1552 - Static183.anInt4109;
					if (local53 > Static63.anInt1552 + Static63.anInt1552) {
						local53 = Static63.anInt1552 + Static63.anInt1552;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt3950 + Static63.anInt1552 - Static21.anInt535;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt3954 + Static63.anInt1552 - Static21.anInt535;
						if (local85 > Static63.anInt1552 + Static63.anInt1552) {
							local85 = Static63.anInt1552 + Static63.anInt1552;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static154.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt3948 = 5;
							local16.anInt3952 = (local16.anInt3958 - Static122.anInt2747 << 8) / local27;
							local16.anInt3943 = (local16.anInt3953 - Static122.anInt2747 << 8) / local27;
							local16.anInt3951 = (local16.anInt3957 - Static184.anInt4119 << 8) / local27;
							local16.anInt3946 = (local16.anInt3942 - Static184.anInt4119 << 8) / local27;
							Static155.aClass85Array1[Static120.anInt2675++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1579() {
		for (@Pc(14) Class1_Sub23 local14 = (Class1_Sub23) Static70.aClass30_11.method1115(); local14 != null; local14 = (Class1_Sub23) Static70.aClass30_11.method1125()) {
			if (local14.anInt3735 > 0) {
				local14.anInt3735--;
			}
			if (local14.anInt3735 != 0) {
				if (local14.anInt3737 > 0) {
					local14.anInt3737--;
				}
				if (local14.anInt3737 == 0 && local14.anInt3742 >= 1 && local14.anInt3739 >= 1 && local14.anInt3742 <= 102 && local14.anInt3739 <= 102 && (local14.anInt3734 < 0 || Static10.method180(local14.anInt3734, local14.anInt3726))) {
					Static17.method373(local14.anInt3742, local14.anInt3739, local14.anInt3726, local14.anInt3728, local14.anInt3734, local14.anInt3729, local14.anInt3733);
					local14.anInt3737 = -1;
					if (local14.anInt3734 == local14.anInt3730 && local14.anInt3730 == -1) {
						local14.method3134();
					} else if (local14.anInt3730 == local14.anInt3734 && local14.anInt3728 == local14.anInt3727 && local14.anInt3741 == local14.anInt3726) {
						local14.method3134();
					}
				}
			} else if (local14.anInt3730 < 0 || Static10.method180(local14.anInt3730, local14.anInt3741)) {
				Static17.method373(local14.anInt3742, local14.anInt3739, local14.anInt3741, local14.anInt3727, local14.anInt3730, local14.anInt3729, local14.anInt3733);
				local14.method3134();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1580() {
		Static156.aClass59_25.method1967();
	}
}
