import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!er", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "I")
	public static int anInt1779 = -60;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!kp;)V")
	public static void method1542(@OriginalArg(0) Class137 arg0) {
		if (Static358.anInt1533 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub7 local6 = arg0.aClass1_Sub7_2;
		Static45.aClass137Array4[Static358.anInt1533] = arg0;
		Static321.aBooleanArray19[Static358.anInt1533] = false;
		Static358.anInt1533++;
		@Pc(21) int local21 = arg0.anInt3864;
		if (arg0.aBoolean446) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt3864;
		if (arg0.aBoolean447) {
			local29 = Static105.anInt1943 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5117() + Static341.anInt5832 - local6.method5120() >> Static215.anInt4460;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5117() + local6.method5120() - Static341.anInt5832 >> Static215.anInt4460;
			if (local73 >= Static408.anInt6716) {
				local73 = Static408.anInt6716 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray61[local41++];
				@Pc(105) int local105 = (local6.method5113() + Static341.anInt5832 - local6.method5120() >> Static215.anInt4460) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static37.anInt666) {
					local113 = Static37.anInt666 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static261.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static261.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static358.anInt1533;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static261.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static358.anInt1533 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static261.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static358.anInt1533 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static261.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static358.anInt1533 << 48;
					}
				}
			}
		}
	}
}
