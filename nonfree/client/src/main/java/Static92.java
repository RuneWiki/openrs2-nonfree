import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!gi", name = "ub", descriptor = "Z")
	public static boolean aBoolean375;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40 = null;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	public static int anInt5525 = 0;

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
	public static int anInt5532 = 0;

	@OriginalMember(owner = "client!gi", name = "db", descriptor = "[I")
	public static int[] anIntArray502 = new int[1000];

	@OriginalMember(owner = "client!gi", name = "nb", descriptor = "I")
	public static int anInt5553 = -2;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)Lclient!fd;")
	public static Class48 method4691(@OriginalArg(0) int arg0) {
		@Pc(10) Class48 local10 = (Class48) Static37.aClass187_23.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static270.aClass121_119.method3115(29, arg0);
		local10 = new Class48();
		if (local21 != null) {
			local10.method1482(new Class1_Sub14(local21), arg0);
		}
		Static37.aClass187_23.method4524((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([SI)[S")
	public static short[] method4694(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) short[] local18 = new short[arg0.length];
			Static319.method1768(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!nk;)V")
	public static void method4695(@OriginalArg(1) Class121 arg0) {
		Static267.aClass121_118 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method4696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static153.anInt3006 * 128) {
			arg0 = Static153.anInt3006 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static285.anInt5122 * 128) {
			arg2 = Static285.anInt5122 * 128 - 1;
		}
		Static163.anInt3252 = Class135.anIntArray335[arg3];
		Static165.anInt3265 = Class135.anIntArray338[arg3];
		Static170.anInt3350 = Class135.anIntArray335[arg4];
		Static83.anInt1651 = Class135.anIntArray338[arg4];
		Static160.anInt3163 = arg0;
		Static193.anInt3671 = arg1;
		Static100.anInt2013 = arg2;
		Static13.anInt184 = arg0 / 128;
		Static84.anInt1660 = arg2 / 128;
		Static47.anInt952 = Static13.anInt184 - Static213.anInt4456;
		if (Static47.anInt952 < 0) {
			Static47.anInt952 = 0;
		}
		Static236.anInt4291 = Static84.anInt1660 - Static213.anInt4456;
		if (Static236.anInt4291 < 0) {
			Static236.anInt4291 = 0;
		}
		Static310.anInt5666 = Static13.anInt184 + Static213.anInt4456;
		if (Static310.anInt5666 > Static153.anInt3006) {
			Static310.anInt5666 = Static153.anInt3006;
		}
		Static124.anInt5504 = Static84.anInt1660 + Static213.anInt4456;
		if (Static124.anInt5504 > Static285.anInt5122) {
			Static124.anInt5504 = Static285.anInt5122;
		}
		@Pc(99) short local99;
		if (Static156.aBoolean211) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static213.anInt4456 + Static213.anInt4456 + 2; local104++) {
			for (local113 = 0; local113 < Static213.anInt4456 + Static213.anInt4456 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static213.anInt4456 << 7) - (Static160.anInt3163 & 0x7F);
				@Pc(140) int local140 = (local113 - Static213.anInt4456 << 7) - (Static100.anInt2013 & 0x7F);
				@Pc(146) int local146 = Static13.anInt184 + local104 - Static213.anInt4456;
				@Pc(152) int local152 = Static84.anInt1660 + local113 - Static213.anInt4456;
				if (local146 >= 0 && local152 >= 0 && local146 < Static153.anInt3006 && local152 < Static285.anInt5122) {
					@Pc(176) int local176;
					if (Static257.anIntArrayArrayArray15 == null) {
						local176 = Static95.anIntArrayArrayArray5[0][local146][local152] + 128 - Static193.anInt3671;
					} else {
						local176 = Static257.anIntArrayArrayArray15[0][local146][local152] + 128 - Static193.anInt3671;
					}
					@Pc(201) int local201 = Static95.anIntArrayArrayArray5[3][local146][local152] - Static193.anInt3671 - 1000;
					Static64.aBooleanArrayArray2[local104][local113] = Static178.method2966(local130, local201, local176, local140, local99);
				} else {
					Static64.aBooleanArrayArray2[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static213.anInt4456 + Static213.anInt4456 + 1; local104++) {
			for (local113 = 0; local113 < Static213.anInt4456 + Static213.anInt4456 + 1; local113++) {
				Static186.aBooleanArrayArray4[local104][local113] = Static64.aBooleanArrayArray2[local104][local113] || Static64.aBooleanArrayArray2[local104 + 1][local113] || Static64.aBooleanArrayArray2[local104][local113 + 1] || Static64.aBooleanArrayArray2[local104 + 1][local113 + 1];
			}
		}
		Static70.anIntArray119 = arg6;
		Static126.anIntArray159 = arg7;
		Static137.anIntArray233 = arg8;
		Static80.anIntArray140 = arg9;
		Static55.anIntArray63 = arg10;
		Static22.method369();
		if (Static229.aClass1_Sub33ArrayArrayArray4 != null) {
			Static76.method1484(true);
			Static301.method4559(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static156.aBoolean211) {
				Static222.aBoolean284 = false;
				Static90.method1648(0, 0);
				Static283.method4360(null);
				Static101.method1824();
			}
			Static76.method1484(false);
		}
		Static301.method4559(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}
}
