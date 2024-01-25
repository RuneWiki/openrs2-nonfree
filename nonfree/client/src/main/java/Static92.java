import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
	public static int anInt1719;

	@OriginalMember(owner = "client!fl", name = "mb", descriptor = "Lclient!ci;")
	public static Class36 aClass36_4;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	public static void method1658() {
		for (@Pc(7) int local7 = -1; local7 < Static22.anInt472; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static88.anIntArray137[local7];
			}
			@Pc(24) Class4_Sub5_Sub2_Sub1 local24 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local14];
			if (local24 != null) {
				Static187.method3352(local24, local24.method4807());
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZZ)V")
	public static void method1666(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static290.aClass5_Sub1_Sub6_2 != null) {
			Static280.anInt5512 = Static290.aClass5_Sub1_Sub6_2.anInt1947;
		} else {
			Static280.anInt5512 = -1;
		}
		Static149.anInt2919 = 0;
		Static239.aClass103_116 = null;
		Static188.aClass201_7 = null;
		Static290.aClass5_Sub1_Sub6_2 = null;
		Static290.method2564();
		Static290.aClass103_69.method2751();
		Static133.aClass71_5 = null;
		Static30.aClass71_1 = null;
		Static349.aClass71_10 = null;
		Static331.aClass71_8 = null;
		Static211.anInt4169 = -1;
		Static290.aClass64_2 = null;
		Static319.aClass71_7 = null;
		Static73.aClass95_3 = null;
		Static215.aClass71_6 = null;
		Static335.aClass71_9 = null;
		Static41.aClass71_2 = null;
		Static348.anInt6698 = -1;
		Static284.method4947();
		Static88.method1589(64, 128);
		Static301.method5301(64, 64);
		Static236.method3914(64);
		Static280.method4879(64);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	public static void method1669() {
		if (Static346.aBoolean579) {
			Static354.aClass95_18 = null;
			Static346.aBoolean579 = false;
			Static223.aClass95_10 = null;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!fp;Lclient!ij;ILclient!ij;)V")
	public static void method1676(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(3) Class93 arg2) {
		Static339.aClass93_124 = arg2;
		Static118.aClass93_47 = arg1;
		Static248.anInterface2_1 = arg0;
		if (Static339.aClass93_124 != null) {
			Static236.anInt4218 = Static339.aClass93_124.method2418(1);
		}
		if (Static118.aClass93_47 != null) {
			Static60.anInt1965 = Static118.aClass93_47.method2418(1);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static84.method3936(arg3, arg2, arg0, arg1, arg4, 0);
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(II)Z")
	public static boolean method1683(@OriginalArg(0) int arg0) {
		if (Static98.aBooleanArray8[arg0]) {
			return true;
		} else if (Static248.aClass93_95.method2403(arg0)) {
			@Pc(21) int local21 = Static248.aClass93_95.method2418(arg0);
			if (local21 == 0) {
				Static98.aBooleanArray8[arg0] = true;
				return true;
			}
			if (Static304.aClass201ArrayArray1[arg0] == null) {
				Static304.aClass201ArrayArray1[arg0] = new Class201[local21];
			}
			for (@Pc(45) int local45 = 0; local45 < local21; local45++) {
				if (Static304.aClass201ArrayArray1[arg0][local45] == null) {
					@Pc(60) byte[] local60 = Static248.aClass93_95.method2410(local45, arg0);
					if (local60 != null) {
						@Pc(72) Class201 local72 = Static304.aClass201ArrayArray1[arg0][local45] = new Class201();
						local72.anInt6541 = (arg0 << 16) + local45;
						if (local60[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local72.method5801(new Class5_Sub12(local60));
					}
				}
			}
			Static98.aBooleanArray8[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
