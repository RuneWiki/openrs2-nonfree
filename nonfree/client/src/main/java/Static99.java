import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public static int anInt2139;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_645 = Static181.method2795("Fps:");

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!qe;")
	public static Class83 aClass83_646 = null;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_6 = new Class91(260);

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "[Lclient!pd;")
	public static final Class78[] aClass78Array1 = new Class78[100];

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_647 = Static181.method2795(": ");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBII)V")
	public static void method1686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg0) {
			Static22.method438(arg0, arg2, arg1, Static14.anIntArrayArray18[arg3]);
		} else {
			Static22.method438(arg1, arg2, arg0, Static14.anIntArrayArray18[arg3]);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[Lclient!p;I)V")
	public static void method1687(@OriginalArg(0) int arg0, @OriginalArg(2) Class75[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(8) int local8 = arg2 - 1;
		@Pc(12) int local12 = arg0 + 1;
		@Pc(19) int local19 = (arg2 + arg0) / 2;
		@Pc(23) Class75 local23 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local23;
		while (local12 > local8) {
			@Pc(37) boolean local37 = true;
			@Pc(40) int local40;
			@Pc(57) int local57;
			@Pc(52) int local52;
			do {
				local12--;
				for (local40 = 0; local40 < 4; local40++) {
					if (Static201.anIntArray394[local40] == 2) {
						local52 = local23.anInt2985;
						local57 = arg1[local12].anInt2985;
					} else if (Static201.anIntArray394[local40] == 1) {
						local52 = local23.anInt2986;
						local57 = arg1[local12].anInt2986;
						if (local57 == -1 && Static149.anIntArray301[local40] == 1) {
							local57 = 2001;
						}
						if (local52 == -1 && Static149.anIntArray301[local40] == 1) {
							local52 = 2001;
						}
					} else if (Static201.anIntArray394[local40] == 3) {
						local57 = arg1[local12].aBoolean142 ? 1 : 0;
						local52 = local23.aBoolean142 ? 1 : 0;
					} else {
						local57 = arg1[local12].anInt2988;
						local52 = local23.anInt2988;
					}
					if (local52 != local57) {
						if ((Static149.anIntArray301[local40] != 1 || local57 <= local52) && (Static149.anIntArray301[local40] != 0 || local52 <= local57)) {
							local37 = false;
						}
						break;
					}
					if (local40 == 3) {
						local37 = false;
					}
				}
			} while (local37);
			local37 = true;
			do {
				local8++;
				for (local40 = 0; local40 < 4; local40++) {
					if (Static201.anIntArray394[local40] == 2) {
						local52 = local23.anInt2985;
						local57 = arg1[local8].anInt2985;
					} else if (Static201.anIntArray394[local40] == 1) {
						local57 = arg1[local8].anInt2986;
						local52 = local23.anInt2986;
						if (local57 == -1 && Static149.anIntArray301[local40] == 1) {
							local57 = 2001;
						}
						if (local52 == -1 && Static149.anIntArray301[local40] == 1) {
							local52 = 2001;
						}
					} else if (Static201.anIntArray394[local40] == 3) {
						local57 = arg1[local8].aBoolean142 ? 1 : 0;
						local52 = local23.aBoolean142 ? 1 : 0;
					} else {
						local57 = arg1[local8].anInt2988;
						local52 = local23.anInt2988;
					}
					if (local57 != local52) {
						if ((Static149.anIntArray301[local40] != 1 || local57 >= local52) && (Static149.anIntArray301[local40] != 0 || local57 <= local52)) {
							local37 = false;
						}
						break;
					}
					if (local40 == 3) {
						local37 = false;
					}
				}
			} while (local37);
			if (local8 < local12) {
				@Pc(330) Class75 local330 = arg1[local8];
				arg1[local8] = arg1[local12];
				arg1[local12] = local330;
			}
		}
		method1687(local12, arg1, arg2);
		method1687(arg0, arg1, local12 + 1);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Lclient!wc;")
	public static Class105 method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass105_1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)Lclient!md;")
	public static Class2_Sub2_Sub20 method1689(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub20 local10 = (Class2_Sub2_Sub20) Static16.aClass86_31.method2643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static77.aClass28_83.method852(Static18.method1616(arg0), Static191.method2871(arg0));
		local10 = new Class2_Sub2_Sub20();
		local10.anInt2679 = arg0;
		if (local26 != null) {
			local10.method2051(new Class2_Sub3(local26));
		}
		local10.method2052();
		if (!Static82.aBoolean96 && local10.aBoolean129) {
			local10.aClass83Array45 = null;
		}
		if (local10.aBoolean133) {
			local10.anInt2671 = 0;
			local10.aBoolean134 = false;
		}
		Static16.aClass86_31.method2647(local10, (long) arg0);
		return local10;
	}
}
