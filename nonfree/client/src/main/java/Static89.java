import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_23;

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "Lclient!hs;")
	public static final Class138 aClass138_1 = new Class138();

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIII[B)V")
	public static void method1673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		arg2 += arg0;
		@Pc(24) int local24 = arg1 - arg0 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg0 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(29) int local29 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg2 = local39 + 1;
			arg3[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V")
	public static void method1675() {
		for (@Pc(11) int local11 = 0; local11 < Static587.aClass348ArrayArray1.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static587.aClass348ArrayArray1[local11].length; local15++) {
				Static587.aClass348ArrayArray1[local11][local15] = Static162.aClass348_2;
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!oa;IZIII)V")
	public static void method1676(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.ca(arg4, arg1, arg3 + arg4, arg2 + arg1);
		arg0.method6859(arg3, arg1, arg4, -16777216, arg2);
		if (Static585.anInt9508 < 100) {
			return;
		}
		@Pc(43) float local43 = (float) Static217.anInt3839 / (float) Static217.anInt3833;
		@Pc(45) int local45 = arg3;
		@Pc(47) int local47 = arg2;
		if (local43 < 1.0F) {
			local47 = (int) (local43 * (float) arg3);
		} else {
			local45 = (int) ((float) arg2 / local43);
		}
		@Pc(74) int local74 = arg4 + (arg3 - local45) / 2;
		@Pc(83) int local83 = arg1 + (arg2 - local47) / 2;
		if (Static425.aClass58_39 == null || arg3 != Static425.aClass58_39.QA() || arg2 != Static425.aClass58_39.b()) {
			Static217.method3373(Static217.anInt3835, Static217.anInt3839 + Static217.anInt3841, Static217.anInt3833 + Static217.anInt3835, Static217.anInt3841, local74, local83, local45 + local74, local47 + local83);
			Static217.method3356(arg0);
			Static425.aClass58_39 = arg0.method6874(local74, local83, local45, local47, false);
		}
		Static425.aClass58_39.method7666(local74, local83);
		@Pc(134) int local134 = local45 * Static91.anInt1775 / Static217.anInt3833;
		@Pc(140) int local140 = Static66.anInt1326 * local47 / Static217.anInt3839;
		@Pc(148) int local148 = local74 + local45 * Static491.anInt8273 / Static217.anInt3833;
		@Pc(162) int local162 = local83 + local47 - Static350.anInt6235 * local47 / Static217.anInt3839 - local140;
		@Pc(164) int local164 = -1996554240;
		if (Static255.aClass37_2 == Static317.aClass37_3) {
			local164 = -1996488705;
		}
		arg0.C(local148, local162, local134, local140, local164, 1);
		arg0.method6875(local148, local162, local134, local140, local164, 0);
		if (Static186.anInt3869 <= 0) {
			return;
		}
		@Pc(199) int local199;
		if (Static230.anInt4710 > 50) {
			local199 = 500 - Static230.anInt4710 * 5;
		} else {
			local199 = Static230.anInt4710 * 5;
		}
		for (@Pc(210) Class6_Sub17 local210 = (Class6_Sub17) Static217.aClass361_25.method7838(); local210 != null; local210 = (Class6_Sub17) Static217.aClass361_25.method7845()) {
			@Pc(218) Class176 local218 = Static217.aClass213_2.method5127(local210.anInt2970);
			if (Static543.method7354(local218)) {
				@Pc(243) int local243;
				@Pc(255) int local255;
				if (Static29.anInt860 == local210.anInt2970) {
					local243 = local45 * local210.anInt2963 / Static217.anInt3833 + local74;
					local255 = local47 * (Static217.anInt3839 - local210.anInt2968) / Static217.anInt3839 + local83;
					arg0.method6859(4, local255 - 2, local243 + -2, local199 << 24 | 0xFFFF00, 4);
				} else if (Static538.anInt8920 != -1 && Static538.anInt8920 == local218.anInt5064) {
					local243 = local210.anInt2963 * local45 / Static217.anInt3833 + local74;
					local255 = (Static217.anInt3839 - local210.anInt2968) * local47 / Static217.anInt3839 + local83;
					arg0.method6859(4, local255 - 2, local243 - 2, local199 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIII[BI[B)V")
	public static void method1677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(15) int local15 = -(arg4 >> 2);
		@Pc(20) int local20 = -(arg4 & 0x3);
		for (@Pc(23) int local23 = -arg1; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg3++;
				arg7[local31] = (byte) (arg7[local31] - arg5[arg0++]);
				@Pc(44) int local44 = arg3++;
				arg7[local44] = (byte) (arg7[local44] - arg5[arg0++]);
				@Pc(57) int local57 = arg3++;
				arg7[local57] = (byte) (arg7[local57] - arg5[arg0++]);
				@Pc(70) int local70 = arg3++;
				arg7[local70] = (byte) (arg7[local70] - arg5[arg0++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg3++;
				arg7[local31] = (byte) (arg7[local31] - arg5[arg0++]);
			}
			arg3 += arg2;
			arg0 += arg6;
		}
	}
}
