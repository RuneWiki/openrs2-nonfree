import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!rc;")
	public static Class2_Sub2_Sub16 aClass2_Sub2_Sub16_2;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
	public static int anInt2367;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	public static int[] anIntArray237 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!i;")
	private static Class41 aClass41_701 = Static184.method2923("You have only just left another world)3");

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_702 = Static184.method2923("k");

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static int anInt2364 = -1;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!i;")
	public static Class41 aClass41_703 = aClass41_701;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
	public static int[] anIntArray238 = new int[50];

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_704 = Static184.method2923("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt2368 = -2;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!q;B)V")
	public static void method1670(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class80 arg1) {
		@Pc(15) int local15 = arg1.anInt3637 == 0 ? arg1.anInt3635 : arg1.anInt3637;
		@Pc(27) int local27 = arg1.anInt3632 == 0 ? arg1.anInt3660 : arg1.anInt3632;
		Static140.method2216(local15, arg0, arg1.anInt3661, local27, Static68.aClass80ArrayArray1[arg1.anInt3661 >> 16]);
		if (arg1.aClass80Array1 != null) {
			Static140.method2216(local15, arg0, arg1.anInt3661, local27, arg1.aClass80Array1);
		}
		@Pc(68) Class2_Sub21 local68 = (Class2_Sub21) Static113.aClass70_8.method2205((long) arg1.anInt3661);
		if (local68 != null) {
			Static188.method2997(local15, local68.anInt3435, local27, arg0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILclient!q;)I")
	public static int method1672(@OriginalArg(1) int arg0, @OriginalArg(2) Class80 arg1) {
		if (arg1.anIntArrayArray32 == null || arg0 >= arg1.anIntArrayArray32.length) {
			return -2;
		}
		try {
			@Pc(29) int[] local29 = arg1.anIntArrayArray32[arg0];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local29[local33++];
				@Pc(42) byte local42 = 0;
				@Pc(44) int local44 = 0;
				if (local40 == 0) {
					return local31;
				}
				if (local40 == 1) {
					local44 = Static92.anIntArray228[local29[local33++]];
				}
				if (local40 == 2) {
					local44 = Static192.anIntArray452[local29[local33++]];
				}
				if (local40 == 3) {
					local44 = Static160.anIntArray398[local29[local33++]];
				}
				@Pc(90) int local90;
				@Pc(101) Class80 local101;
				@Pc(106) int local106;
				@Pc(119) int local119;
				if (local40 == 4) {
					local90 = local29[local33++] << 16;
					@Pc(97) int local97 = local90 + local29[local33++];
					local101 = Static212.method3256(local97);
					local106 = local29[local33++];
					if (local106 != -1 && (!Static63.method1158(local106).aBoolean179 || Static60.aBoolean291)) {
						for (local119 = 0; local119 < local101.anIntArray380.length; local119++) {
							if (local101.anIntArray380[local119] == local106 + 1) {
								local44 += local101.anIntArray390[local119];
							}
						}
					}
				}
				if (local40 == 5) {
					local44 = Static99.anIntArray243[local29[local33++]];
				}
				if (local40 == 6) {
					local44 = Class2_Sub13.anIntArray199[Static192.anIntArray452[local29[local33++]] - 1];
				}
				if (local40 == 7) {
					local44 = Static99.anIntArray243[local29[local33++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local44 = Static213.aClass12_Sub3_Sub1_1.anInt1203;
				}
				if (local40 == 9) {
					for (local90 = 0; local90 < 25; local90++) {
						if (Static16.aBooleanArray1[local90]) {
							local44 += Static192.anIntArray452[local90];
						}
					}
				}
				if (local40 == 10) {
					local90 = local29[local33++] << 16;
					local90 += local29[local33++];
					local101 = Static212.method3256(local90);
					local106 = local29[local33++];
					if (local106 != -1 && (!Static63.method1158(local106).aBoolean179 || Static60.aBoolean291)) {
						for (local119 = 0; local119 < local101.anIntArray380.length; local119++) {
							if (local106 + 1 == local101.anIntArray380[local119]) {
								local44 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local44 = Static213.anInt4716;
				}
				if (local40 == 15) {
					local42 = 1;
				}
				if (local40 == 12) {
					local44 = Static175.anInt4104;
				}
				if (local40 == 13) {
					local90 = Static99.anIntArray243[local29[local33++]];
					@Pc(317) int local317 = local29[local33++];
					local44 = (0x1 << local317 & local90) == 0 ? 0 : 1;
				}
				if (local40 == 16) {
					local42 = 2;
				}
				if (local40 == 14) {
					local90 = local29[local33++];
					local44 = Static127.method2070(local90);
				}
				if (local40 == 17) {
					local42 = 3;
				}
				if (local40 == 18) {
					local44 = (Static213.aClass12_Sub3_Sub1_1.anInt3961 >> 7) + Static198.anInt4451;
				}
				if (local40 == 19) {
					local44 = (Static213.aClass12_Sub3_Sub1_1.anInt3949 >> 7) + Static168.anInt3899;
				}
				if (local40 == 20) {
					local44 = local29[local33++];
				}
				if (local42 == 0) {
					if (local35 == 0) {
						local31 += local44;
					}
					if (local35 == 1) {
						local31 -= local44;
					}
					if (local35 == 2 && local44 != 0) {
						local31 /= local44;
					}
					if (local35 == 3) {
						local31 *= local44;
					}
					local35 = 0;
				} else {
					local35 = local42;
				}
			}
		} catch (@Pc(427) Exception local427) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILclient!nc;Lclient!nc;IIJ)V")
	public static void method1673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class71 local8 = new Class71();
		local8.aLong100 = arg8;
		local8.anInt3260 = arg1 * 128 + 64;
		local8.anInt3256 = arg2 * 128 + 64;
		local8.anInt3262 = arg3;
		local8.aClass12_5 = arg4;
		local8.aClass12_6 = arg5;
		local8.anInt3259 = arg6;
		local8.anInt3257 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static27.aClass2_Sub7ArrayArrayArray4[local42][arg1][arg2] == null) {
				Static27.aClass2_Sub7ArrayArrayArray4[local42][arg1][arg2] = new Class2_Sub7(local42, arg1, arg2);
			}
		}
		Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2].aClass71_1 = local8;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public static void method1674() {
		for (@Pc(1) int local1 = 0; local1 < Static23.anInt594; local1++) {
			@Pc(6) Class51 local6 = Static134.aClass51Array2[local1];
			Static122.method2041(local6);
			Static134.aClass51Array2[local1] = null;
		}
		Static23.anInt594 = 0;
	}
}
