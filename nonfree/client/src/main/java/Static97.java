import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
	public static int anInt1966;

	@OriginalMember(owner = "client!dga", name = "k", descriptor = "I")
	public static int anInt1972;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IB)V")
	public static void method1654(@OriginalArg(0) int arg0) {
		Static201.anInt3739 = 2;
		Static550.anInt9147 = arg0;
		if (Static111.aString13 == null) {
			Static191.method3070(35);
		} else {
			@Pc(20) Class3_Sub9 local20 = new Class3_Sub9(Static609.method8339(Static38.method703(Static111.aString13)));
			@Pc(24) long local24 = local20.method5603();
			Static248.aLong127 = local20.method5603();
			Static63.method1054(Static23.method325(local24), true, "");
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IZI)Z")
	public static boolean method1657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static546.aByteArrayArrayArray18[1].length && arg0 < Static546.aByteArrayArrayArray18[1][arg1].length) {
			return (Static546.aByteArrayArrayArray18[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "([BB)Ljava/lang/String;")
	public static String method1658(@OriginalArg(0) byte[] arg0) {
		return Static284.method4606(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)I")
	public static int method1659() {
		if (Static429.aClass344_9 == null) {
			if (!Static253.aBoolean362 && Static165.aClass3_Sub7_Sub19_14 != null) {
				return Static165.aClass3_Sub7_Sub19_14.anInt8566;
			}
			@Pc(20) int local20 = Static281.aClass49_1.method2426();
			@Pc(24) int local24 = Static281.aClass49_1.method2429();
			@Pc(63) int local63;
			@Pc(65) int local65;
			@Pc(77) int local77;
			@Pc(138) Class3_Sub7_Sub19 local138;
			if (Static515.aBoolean645) {
				@Pc(133) Class271 local133;
				if (local20 > Static491.anInt8355 && local20 < Static415.anInt7312 + Static491.anInt8355) {
					local63 = -1;
					for (local65 = 0; local65 < Static334.anInt6266; local65++) {
						if (Static53.aBoolean52) {
							local77 = local65 * 16 + Static388.anInt6963 + 33;
							if (local24 > local77 - 13 && local24 <= local77 + 3) {
								local63 = local65;
							}
						} else {
							local77 = local65 * 16 + Static388.anInt6963 + 31;
							if (local24 > local77 - 13 && local24 <= local77 + 3) {
								local63 = local65;
							}
						}
					}
					if (local63 != -1) {
						local77 = 0;
						local133 = new Class271(Static561.aClass363_53);
						for (@Pc(238) Class3_Sub7_Sub13 local238 = (Class3_Sub7_Sub13) local133.method6640(); local238 != null; local238 = (Class3_Sub7_Sub13) local133.method6644()) {
							if (local63 == local77++) {
								return ((Class3_Sub7_Sub19) local238.aClass363_21.aClass3_Sub7_66.aClass3_Sub7_63).anInt8566;
							}
						}
					}
				} else if (Static254.aClass3_Sub7_Sub13_2 != null && local20 > Static641.anInt10142 && Static641.anInt10142 + Static386.anInt8229 > local20) {
					local63 = -1;
					for (local65 = 0; local65 < Static254.aClass3_Sub7_Sub13_2.anInt4660; local65++) {
						if (Static53.aBoolean52) {
							local77 = anInt1966 + local65 * 16 + 33;
							if (local24 > local77 - 13 && local24 <= local77 + 3) {
								local63 = local65;
							}
						} else {
							local77 = anInt1966 + local65 * 16 + 31;
							if (local77 - 13 < local24 && local24 <= local77 + 3) {
								local63 = local65;
							}
						}
					}
					if (local63 != -1) {
						local77 = 0;
						local133 = new Class271(Static254.aClass3_Sub7_Sub13_2.aClass363_21);
						for (local138 = (Class3_Sub7_Sub19) local133.method6640(); local138 != null; local138 = (Class3_Sub7_Sub19) local133.method6644()) {
							if (local63 == local77++) {
								return local138.anInt8566;
							}
						}
					}
				}
			} else if (Static491.anInt8355 < local20 && Static415.anInt7312 + Static491.anInt8355 > local20) {
				local63 = -1;
				for (local65 = 0; local65 < Static285.anInt7798; local65++) {
					if (Static53.aBoolean52) {
						local77 = Static388.anInt6963 + (Static285.anInt7798 - local65 - 1) * 16 + 33;
						if (local24 > local77 - 13 && local24 <= local77 + 3) {
							local63 = local65;
						}
					} else {
						local77 = (Static285.anInt7798 - local65 - 1) * 16 + Static388.anInt6963 + 31;
						if (local77 - 13 < local24 && local24 <= local77 + 3) {
							local63 = local65;
						}
					}
				}
				if (local63 != -1) {
					local77 = 0;
					@Pc(360) Class383 local360 = new Class383(Static544.aClass216_66);
					for (local138 = (Class3_Sub7_Sub19) local360.method8654(); local138 != null; local138 = (Class3_Sub7_Sub19) local360.method8657()) {
						if (local63 == local77++) {
							return local138.anInt8566;
						}
					}
				}
			}
		}
		return -1;
	}
}
