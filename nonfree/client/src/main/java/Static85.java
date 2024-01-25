import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "Lclient!uu;")
	public static Class250 aClass250_27;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Lclient!of;")
	public static final Class174 aClass174_57 = new Class174("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg2 < 1 || arg4 < 1 || Static373.anInt6324 - 2 < arg2 || arg4 > Static291.anInt5062 - 2) {
			return;
		}
		@Pc(32) int local32 = arg5;
		if (arg5 < 3 && Static24.method2475(arg2, arg4)) {
			local32 = arg5 + 1;
		}
		if (!Static39.aClass79_Sub1_1.method1948(Static402.anInt6656) && !Static58.method1107(arg4, Static436.anInt7298, arg2, local32)) {
			return;
		}
		if (Static389.aClass227ArrayArrayArray3 == null) {
			return;
		}
		Static36.aClass22_Sub1_2.method4797(arg4, Static250.aClass128Array1[arg5], arg0, arg2, Static413.aClass167_11, arg5);
		if (arg3 < 0) {
			return;
		}
		@Pc(78) boolean local78 = Static39.aClass79_Sub1_1.aBoolean152;
		Static39.aClass79_Sub1_1.aBoolean152 = true;
		Static36.aClass22_Sub1_2.method4794(arg1, arg4, arg5, Static413.aClass167_11, arg6, local32, arg3, Static250.aClass128Array1[arg5], arg7, arg2);
		Static39.aClass79_Sub1_1.aBoolean152 = local78;
		return;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!i;IILclient!ga;IBLclient!qa;I)V")
	public static void method1527(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class167 arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class152 local10 = Static212.aClass45_3.method1255(arg2);
		if (local10 == null || !local10.aBoolean315 || !local10.method3608(Static119.aClass47_1)) {
			return;
		}
		@Pc(38) int local38;
		if (local10.anIntArray285 != null) {
			@Pc(36) int[] local36 = new int[local10.anIntArray285.length];
			@Pc(50) int local50;
			for (local38 = 0; local38 < local36.length / 2; local38++) {
				if (Static27.anInt490 == 4) {
					local50 = (int) Static19.aFloat6 & 0x3FFF;
				} else {
					local50 = Static139.anInt2475 + (int) Static19.aFloat6 & 0x3FFF;
				}
				@Pc(61) int local61 = Class65.anIntArray88[local50];
				@Pc(65) int local65 = Class65.anIntArray87[local50];
				if (Static27.anInt490 != 4) {
					local65 = local65 * 256 / (Static197.anInt3551 + 256);
					local61 = local61 * 256 / (Static197.anInt3551 + 256);
				}
				local36[local38 * 2] = arg4.anInt2192 / 2 + arg3 + (local61 * (local10.anIntArray285[local38 * 2 - -1] * 4 + arg5) + local65 * (local10.anIntArray285[local38 * 2] * 4 + arg0) >> 15);
				local36[local38 * 2 + 1] = arg7 + arg4.anInt2216 / 2 - ((local10.anIntArray285[local38 * 2 + 1] * 4 + arg5) * local65 - local61 * (local10.anIntArray285[local38 * 2] * 4 + arg0) >> 15);
			}
			Static449.method6118(arg6, local36, local10.anInt4349, arg4.anIntArray111, arg4.anIntArray107);
			for (local50 = 0; local50 < local36.length / 2 - 1; local50++) {
				arg6.method5954(local36[local50 * 2], local36[local50 * 2 + 1], local36[local50 * 2 + 2], local36[local50 * 2 + 1 + 2], local10.anInt4327, arg1, arg3, arg7);
			}
			arg6.method5954(local36[local36.length - 2], local36[local36.length - 1], local36[0], local36[1], local10.anInt4327, arg1, arg3, arg7);
		}
		@Pc(264) Class2 local264 = null;
		if (local10.anInt4321 != -1) {
			local264 = local10.method3609(false, arg6);
			if (local264 != null) {
				Static358.method5004(arg5, arg4, arg0, local264, arg1, arg3, arg7);
			}
		}
		if (local10.aString49 == null) {
			return;
		}
		local38 = 0;
		if (local264 != null) {
			local38 = local264.V();
		}
		@Pc(298) Class18 local298 = Static275.aClass18_3;
		@Pc(300) Class124 local300 = Static215.aClass124_10;
		if (local10.anInt4332 == 1) {
			local300 = Static298.aClass124_11;
			local298 = Static244.aClass18_1;
		}
		if (local10.anInt4332 == 2) {
			local300 = Static251.aClass124_14;
			local298 = Static266.aClass18_2;
		}
		Static346.method4832(arg7, arg0, local10.aString49, arg1, arg4, local38, local298, local300, arg3, local10.anInt4336, arg5);
		return;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method1530(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!nj;)V")
	public static void method1532(@OriginalArg(1) Class3_Sub25 arg0) {
		if (arg0.aByteArray88.length - arg0.anInt4974 < 1) {
			return;
		}
		@Pc(24) int local24 = arg0.method4096();
		if (local24 < 0 || local24 > 1 || arg0.aByteArray88.length - arg0.anInt4974 < 2) {
			return;
		}
		@Pc(45) int local45 = arg0.method4083();
		if (arg0.aByteArray88.length - arg0.anInt4974 < local45 * 6) {
			return;
		}
		for (@Pc(63) int local63 = 0; local63 < local45; local63++) {
			@Pc(69) int local69 = arg0.method4083();
			@Pc(73) int local73 = arg0.method4108();
			if (local69 < Static59.anIntArray56.length && Static322.aBooleanArray19[local69] && (Static62.aClass242_1.method5517(local69).aChar3 != '1' || local73 >= -1 && local73 <= 1)) {
				Static59.anIntArray56[local69] = local73;
			}
		}
	}
}
