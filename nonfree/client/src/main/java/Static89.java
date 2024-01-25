import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
	public static int anInt1657;

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
	public static int anInt1658;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BI)Lclient!rk;")
	public static Class1_Sub1 method1395(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub10();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub18();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub4_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub3();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub7();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub13();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub17();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub8();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub2();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub4();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!tg;Z)Z")
	public static boolean method1396(@OriginalArg(0) Class11_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static310.aClass129Array5 == Static150.aClass129Array4;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6054();
		if (arg0.aShort90 < 0 || arg0.aShort88 < 0 || arg0.aShort91 >= Static327.anInt5993 || arg0.aShort89 >= Static191.anInt3757) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort90; local36 <= arg0.aShort91; local36++) {
			for (local40 = arg0.aShort88; local40 <= arg0.aShort89; local40++) {
				@Pc(47) Class360 local47 = Static570.method7679(arg0.aByte113, local36, local40);
				if (local47 != null) {
					@Pc(53) Class21 local53 = Static92.method1410(arg0);
					@Pc(56) Class21 local56 = local47.aClass21_4;
					if (local56 == null) {
						local47.aClass21_4 = local53;
					} else {
						while (local56.aClass21_1 != null) {
							local56 = local56.aClass21_1;
						}
						local56.aClass21_1 = local53;
					}
					if (local6 && (Static351.anIntArrayArray33[local36][local40] & 0xFF000000) != 0) {
						local8 = Static351.anIntArrayArray33[local36][local40];
						local10 = Static131.aShortArrayArray1[local36][local40];
						local12 = Static411.aByteArrayArray22[local36][local40];
					}
					if (!arg1 && local47.aClass11_Sub1_Sub4_1 != null && local47.aClass11_Sub1_Sub4_1.aShort109 > local33) {
						local33 = local47.aClass11_Sub1_Sub4_1.aShort109;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort90; local40 <= arg0.aShort91; local40++) {
				for (@Pc(136) int local136 = arg0.aShort88; local136 <= arg0.aShort89; local136++) {
					if ((Static351.anIntArrayArray33[local40][local136] & 0xFF000000) == 0) {
						Static351.anIntArrayArray33[local40][local136] = local8;
						Static131.aShortArrayArray1[local40][local136] = local10;
						Static411.aByteArrayArray22[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static299.aClass11_Sub1_Sub1Array1[Static435.anInt7764++] = arg0;
		} else {
			local40 = Static310.aClass129Array5 == Static150.aClass129Array4 ? 1 : 0;
			if (!arg0.method7209()) {
				Static176.aClass11_Sub1ArrayArray1[local40][Static275.anIntArray276[local40]++] = arg0;
			} else if (arg0.method7217()) {
				Static267.aClass11_Sub1ArrayArray2[local40][Static512.anIntArray540[local40]++] = arg0;
			} else {
				Static319.aClass11_Sub1ArrayArray3[local40][Static420.anIntArray440[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt8908 -= local33;
		}
		return true;
	}
}
