import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!je", name = "D", descriptor = "I")
	public static int anInt2226;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!i;")
	private static Class41 aClass41_660 = Static184.method2923(" more options");

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!i;")
	public static Class41 aClass41_659 = aClass41_660;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "[I")
	public static int[] anIntArray225 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!je", name = "z", descriptor = "Lclient!i;")
	public static Class41 aClass41_661 = Static184.method2923("Versteckt");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!vb;")
	public static Class2_Sub2_Sub25 method1573(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub25 local12 = (Class2_Sub2_Sub25) Static191.aClass43_22.method1464((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static114.aClass15_22.method387(arg0, 3);
		local12 = new Class2_Sub2_Sub25();
		if (local22 != null) {
			local12.method3169(new Class2_Sub3(local22));
		}
		Static191.aClass43_22.method1462((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public static void method1574() {
		Static93.aClass16_5.method436();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
	public static void method1575(@OriginalArg(1) int arg0) {
		if (Static108.anInt2618 == 0) {
			Static28.aClass2_Sub6_Sub3_1.method2445(arg0);
		} else {
			Static10.anInt373 = arg0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB[Lclient!q;)V")
	public static void method1577(@OriginalArg(0) int arg0, @OriginalArg(2) Class80[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(20) Class80 local20 = arg1[local7];
			if (local20 != null && arg0 == local20.anInt3697 && (!local20.aBoolean215 || !Static63.method1161(local20))) {
				if (local20.anInt3640 == 0) {
					if (!local20.aBoolean215 && Static63.method1161(local20) && local20 != Static58.aClass80_7) {
						continue;
					}
					method1577(local20.anInt3661, arg1);
					if (local20.aClass80Array1 != null) {
						method1577(local20.anInt3661, local20.aClass80Array1);
					}
					@Pc(71) Class2_Sub21 local71 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local20.anInt3661);
					if (local71 != null) {
						Static192.method3029(local71.anInt3435);
					}
				}
				if (local20.anInt3640 == 6) {
					@Pc(102) int local102;
					if (local20.anInt3647 != -1 || local20.anInt3639 != -1) {
						@Pc(97) boolean local97 = Static70.method1290(local20);
						if (local97) {
							local102 = local20.anInt3639;
						} else {
							local102 = local20.anInt3647;
						}
						if (local102 != -1) {
							@Pc(115) Class2_Sub2_Sub9 local115 = Static14.method299(local102);
							if (local115 != null) {
								local20.anInt3687 += Static16.anInt432;
								while (local20.anInt3687 > local115.anIntArray235[local20.anInt3634]) {
									local20.anInt3687 -= local115.anIntArray235[local20.anInt3634];
									local20.anInt3634++;
									if (local20.anInt3634 >= local115.anIntArray233.length) {
										local20.anInt3634 -= local115.anInt2342;
										if (local20.anInt3634 < 0 || local20.anInt3634 >= local115.anIntArray233.length) {
											local20.anInt3634 = 0;
										}
									}
									Static176.method2833(local20);
								}
							}
						}
					}
					if (local20.anInt3638 != 0 && !local20.aBoolean215) {
						local102 = local20.anInt3638 << 16 >> 16;
						@Pc(201) int local201 = local20.anInt3638 >> 16;
						@Pc(205) int local205 = local201 * Static16.anInt432;
						local20.anInt3674 = local205 + local20.anInt3674 & 0x7FF;
						local102 *= Static16.anInt432;
						local20.anInt3700 = local102 + local20.anInt3700 & 0x7FF;
						Static176.method2833(local20);
					}
				}
			}
		}
	}
}
