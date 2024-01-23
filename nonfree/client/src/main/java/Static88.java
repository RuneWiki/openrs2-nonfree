import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
	public static int anInt2058;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!ge;")
	public static Class39 aClass39_11 = new Class39(200);

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Lclient!kh;")
	private static Class60 aClass60_669 = Static200.method3116("wishes to trade with you)3");

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public static int anInt2046 = -2;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_670 = Static200.method3116("sl_stars");

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
	public static int anInt2050 = 0;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	public static int anInt2051 = -1;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "Lclient!kh;")
	public static Class60 aClass60_671 = Static200.method3116("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "Lclient!kh;")
	public static Class60 aClass60_672 = aClass60_669;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIZII)V")
	public static void method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) long local10 = Static84.method1047(arg2, arg0, arg4);
		@Pc(49) int local49;
		@Pc(60) int local60;
		@Pc(18) int local18;
		@Pc(35) int local35;
		@Pc(42) int local42;
		if (local10 != 0L) {
			local18 = arg1;
			@Pc(20) int[] local20 = Static76.anIntArray214;
			local35 = (52736 - arg4 * 512) * 4 + arg0 * 4 + 24624;
			local42 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			local49 = (int) local10 >> 20 & 0x3;
			@Pc(53) Class1_Sub1_Sub23 local53 = Static44.method760(local42);
			local60 = (int) local10 >> 14 & 0x1F;
			if (local10 > 0L) {
				local18 = arg3;
			}
			if (local53.anInt4031 == -1) {
				if (local60 == 0 || local60 == 2) {
					if (local49 == 0) {
						local20[local35] = local18;
						local20[local35 + 512] = local18;
						local20[local35 + 1024] = local18;
						local20[local35 + 1536] = local18;
					} else if (local49 == 1) {
						local20[local35] = local18;
						local20[local35 + 1] = local18;
						local20[local35 + 2] = local18;
						local20[local35 + 3] = local18;
					} else if (local49 == 2) {
						local20[local35 + 3] = local18;
						local20[local35 + 512 + 3] = local18;
						local20[local35 + 1024 + 3] = local18;
						local20[local35 + 3 + 1536] = local18;
					} else if (local49 == 3) {
						local20[local35 + 1536] = local18;
						local20[local35 + 1536 + 1] = local18;
						local20[local35 + 1536 + 2] = local18;
						local20[local35 + 1536 + 3] = local18;
					}
				}
				if (local60 == 3) {
					if (local49 == 0) {
						local20[local35] = local18;
					} else if (local49 == 1) {
						local20[local35 + 3] = local18;
					} else if (local49 == 2) {
						local20[local35 + 1536 + 3] = local18;
					} else if (local49 == 3) {
						local20[local35 + 1536] = local18;
					}
				}
				if (local60 == 2) {
					if (local49 == 3) {
						local20[local35] = local18;
						local20[local35 + 512] = local18;
						local20[local35 + 1024] = local18;
						local20[local35 + 1536] = local18;
					} else if (local49 == 0) {
						local20[local35] = local18;
						local20[local35 + 1] = local18;
						local20[local35 + 2] = local18;
						local20[local35 + 3] = local18;
					} else if (local49 == 1) {
						local20[local35 + 3] = local18;
						local20[local35 + 3 + 512] = local18;
						local20[local35 + 1024 + 3] = local18;
						local20[local35 + 1539] = local18;
					} else if (local49 == 2) {
						local20[local35 + 1536] = local18;
						local20[local35 + 1536 + 1] = local18;
						local20[local35 + 2 + 1536] = local18;
						local20[local35 + 3 + 1536] = local18;
					}
				}
			} else {
				@Pc(75) Class73_Sub1 local75 = Static137.aClass73_Sub1Array3[local53.anInt4031];
				if (local75 != null) {
					@Pc(87) int local87 = (local53.anInt4018 * 4 - local75.anInt2956) / 2;
					@Pc(98) int local98 = (local53.anInt4024 * 4 - local75.anInt2959) / 2;
					local75.method2270(arg0 * 4 + local98 + 48, local87 + 48 - -((104 - arg4 - local53.anInt4018) * 4));
				}
			}
		}
		local10 = Static31.method593(arg2, arg0, arg4);
		if (local10 != 0L) {
			local49 = (int) local10 >> 20 & 0x3;
			local60 = (int) local10 >> 14 & 0x1F;
			local18 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			@Pc(476) Class1_Sub1_Sub23 local476 = Static44.method760(local18);
			@Pc(508) int local508;
			if (local476.anInt4031 != -1) {
				@Pc(486) Class73_Sub1 local486 = Static137.aClass73_Sub1Array3[local476.anInt4031];
				if (local486 != null) {
					local42 = (local476.anInt4024 * 4 - local486.anInt2959) / 2;
					local508 = (local476.anInt4018 * 4 - local486.anInt2956) / 2;
					local486.method2270(local42 + arg0 * 4 + 48, (-local476.anInt4018 + 104 + -arg4) * 4 + (48 - -local508));
				}
			} else if (local60 == 9) {
				local35 = 15658734;
				@Pc(544) int[] local544 = Static76.anIntArray214;
				local508 = (52736 - arg4 * 512) * 4 + arg0 * 4 + 24624;
				if (local10 > 0L) {
					local35 = 15597568;
				}
				if (local49 == 0 || local49 == 2) {
					local544[local508 + 1536] = local35;
					local544[local508 + 1024 + 1] = local35;
					local544[local508 + 512 + 2] = local35;
					local544[local508 + 3] = local35;
				} else {
					local544[local508] = local35;
					local544[local508 + 1 + 512] = local35;
					local544[local508 + 2 + 1024] = local35;
					local544[local508 + 3 + 1536] = local35;
				}
			}
		}
		local10 = Static184.method2913(arg2, arg0, arg4);
		if (local10 == 0L) {
			return;
		}
		local49 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
		@Pc(655) Class1_Sub1_Sub23 local655 = Static44.method760(local49);
		if (local655.anInt4031 == -1) {
			return;
		}
		@Pc(665) Class73_Sub1 local665 = Static137.aClass73_Sub1Array3[local655.anInt4031];
		if (local665 != null) {
			@Pc(677) int local677 = (local655.anInt4024 * 4 - local665.anInt2959) / 2;
			local35 = (local655.anInt4018 * 4 - local665.anInt2956) / 2;
			local665.method2270(local677 + arg0 * 4 + 48, local35 + 48 + (-local655.anInt4018 + 104 - arg4) * 4);
			return;
		}
	}
}
