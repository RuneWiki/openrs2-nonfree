import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fq", name = "I", descriptor = "Lclient!bo;")
	public static final Class30 aClass30_2 = new Class30();

	@OriginalMember(owner = "client!fq", name = "M", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)I")
	public static int method1895() {
		if (Static169.aBoolean260 || Static33.anInt735 <= 0) {
			@Pc(11) int local11 = Static240.anInt6396;
			@Pc(13) int local13 = Static100.anInt2436;
			@Pc(15) int local15 = Static279.anInt6648;
			@Pc(17) int local17 = Static263.anInt5172;
			@Pc(19) int local19 = Static220.anInt4389;
			if (local15 < local11 && local11 < local19 + local15) {
				@Pc(29) int local29 = -1;
				@Pc(47) int local47;
				for (@Pc(31) int local31 = 0; local31 < Static33.anInt735; local31++) {
					if (Static274.aBoolean403) {
						local47 = local17 + (-local31 + -1 + Static33.anInt735) * 16 + 33;
						if (local13 > local47 - 13 && local13 <= local47 + 3) {
							local29 = local31;
						}
					} else {
						local47 = (Static33.anInt735 - local31 - 1) * 16 + local17 + 31;
						if (local47 - 13 < local13 && local47 + 3 >= local13) {
							local29 = local31;
						}
					}
				}
				if (local29 != -1) {
					local47 = 0;
					@Pc(113) Class166 local113 = new Class166(Static76.aClass74_8);
					for (@Pc(118) Class7_Sub32 local118 = (Class7_Sub32) local113.method4263(); local118 != null; local118 = (Class7_Sub32) local113.method4266()) {
						if (local47++ == local29) {
							return local118.anInt5227;
						}
					}
				}
			}
			return -1;
		} else if (Static339.aBoolean467 && Static17.aBooleanArray24[81] && Static33.anInt735 > 2) {
			return ((Class7_Sub32) Static76.aClass74_8.aClass7_72.aClass7_248.aClass7_248).anInt5227;
		} else {
			return ((Class7_Sub32) Static76.aClass74_8.aClass7_72.aClass7_248).anInt5227;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIILclient!ap;IZZIZI)V")
	public static void method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class7_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		if (arg6 == 1) {
			arg3 = 1;
		} else if (arg6 == 2) {
			arg1 = 1;
			arg3 = 1;
		} else if (arg6 == 3) {
			arg1 = 1;
		}
		@Pc(48) int local48;
		if (arg0 < 0 || arg0 >= Static15.anInt287 || arg2 < 0 || Static325.anInt6173 <= arg2) {
			while (true) {
				local48 = arg5.method2772();
				if (local48 == 0) {
					return;
				}
				if (local48 == 1) {
					arg5.method2772();
					return;
				}
				if (local48 <= 49) {
					arg5.method2772();
				}
			}
			return;
		}
		if (!arg7 && !arg9) {
			Static92.aByteArrayArrayArray3[arg10][arg0][arg2] = 0;
		}
		while (true) {
			local48 = arg5.method2772();
			if (local48 == 0) {
				if (arg7) {
					Static23.anIntArrayArrayArray15[0][arg1 + arg0][arg2 + arg3] = Static136.aClass8Array3[0].method4173(arg0 + arg1, arg3 + arg2);
					return;
				} else if (arg10 == 0) {
					Static23.anIntArrayArrayArray15[0][arg0 + arg1][arg3 + arg2] = -Static218.method3850(arg4 + 556238, arg8 + 932731) * 8;
					return;
				} else {
					Static23.anIntArrayArrayArray15[arg10][arg0 + arg1][arg2 + arg3] = Static23.anIntArrayArrayArray15[arg10 - 1][arg0 + arg1][arg2 + arg3] - 240;
					return;
				}
			}
			if (local48 == 1) {
				@Pc(180) int local180 = arg5.method2772();
				if (arg7) {
					Static23.anIntArrayArrayArray15[0][arg1 + arg0][arg3 + arg2] = Static136.aClass8Array3[0].method4173(arg0 + arg1, arg3 + arg2) + local180 * 8;
					return;
				}
				if (local180 == 1) {
					local180 = 0;
				}
				if (arg10 != 0) {
					Static23.anIntArrayArrayArray15[arg10][arg1 + arg0][arg2 + arg3] = Static23.anIntArrayArrayArray15[arg10 - 1][arg0 + arg1][arg3 + arg2] - local180 * 8;
					return;
				}
				Static23.anIntArrayArrayArray15[0][arg1 + arg0][arg3 + arg2] = -local180 * 8;
				return;
			}
			if (local48 <= 49) {
				if (arg9) {
					arg5.method2772();
				} else {
					Static343.aByteArrayArrayArray13[arg10][arg0][arg2] = arg5.method2779();
					Static343.aByteArrayArrayArray14[arg10][arg0][arg2] = (byte) ((local48 - 2) / 4);
					Static353.aByteArrayArrayArray5[arg10][arg0][arg2] = (byte) (arg6 + local48 - 2 & 0x3);
				}
			} else if (local48 <= 81) {
				if (!arg7 && !arg9) {
					Static92.aByteArrayArrayArray3[arg10][arg0][arg2] = (byte) (local48 - 49);
				}
			} else if (!arg9) {
				Static227.aByteArrayArrayArray12[arg10][arg0][arg2] = (byte) (local48 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([II[Ljava/lang/Object;BI)V")
	public static void method1898(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(25) int local25 = (arg3 + arg1) / 2;
		@Pc(27) int local27 = arg3;
		@Pc(31) int local31 = arg0[local25];
		arg0[local25] = arg0[arg1];
		arg0[arg1] = local31;
		@Pc(45) Object local45 = arg2[local25];
		arg2[local25] = arg2[arg1];
		arg2[arg1] = local45;
		for (@Pc(57) int local57 = arg3; local57 < arg1; local57++) {
			if ((local57 & 0x1) + local31 > arg0[local57]) {
				@Pc(71) int local71 = arg0[local57];
				arg0[local57] = arg0[local27];
				arg0[local27] = local71;
				@Pc(85) Object local85 = arg2[local57];
				arg2[local57] = arg2[local27];
				arg2[local27++] = local85;
			}
		}
		arg0[arg1] = arg0[local27];
		arg0[local27] = local31;
		arg2[arg1] = arg2[local27];
		arg2[local27] = local45;
		method1898(arg0, local27 - 1, arg2, arg3);
		method1898(arg0, arg1, arg2, local27 + 1);
	}
}
