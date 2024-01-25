import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "Lclient!pb;")
	public static Class267 aClass267_3;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZLclient!cb;I)Lclient!sja;")
	public static Class5_Sub46 method1645(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method915(arg1);
		return local13 == null ? null : new Class5_Sub46(local13);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIBIZII)V")
	public static void method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 ? Static655.aClass5_Sub36_29.aClass2_Sub6_2.method3364() : Static655.aClass5_Sub36_29.aClass2_Sub6_5.method3364()) != 0 && arg4 != 0 && Static331.anInt6013 < 50 && arg2 != -1) {
			Static515.aClass178Array2[Static331.anInt6013++] = new Class178((byte) (arg3 ? 3 : 2), arg2, arg4, arg1, arg5, 0, arg0, (Class41_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(BZ)V")
	public static void method1647(@OriginalArg(1) boolean arg0) {
		for (@Pc(19) Class5_Sub38 local19 = (Class5_Sub38) Static351.aClass124_58.method2572(); local19 != null; local19 = (Class5_Sub38) Static351.aClass124_58.method2569()) {
			if (local19.aClass5_Sub14_Sub1_3 != null) {
				Static229.aClass5_Sub14_Sub3_1.method2294(local19.aClass5_Sub14_Sub1_3);
				local19.aClass5_Sub14_Sub1_3 = null;
			}
			if (local19.aClass5_Sub14_Sub1_2 != null) {
				Static229.aClass5_Sub14_Sub3_1.method2294(local19.aClass5_Sub14_Sub1_2);
				local19.aClass5_Sub14_Sub1_2 = null;
			}
			local19.method8829();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class5_Sub38 local57 = (Class5_Sub38) Static511.aClass124_97.method2572(); local57 != null; local57 = (Class5_Sub38) Static511.aClass124_97.method2569()) {
			if (local57.aClass5_Sub14_Sub1_3 != null) {
				Static229.aClass5_Sub14_Sub3_1.method2294(local57.aClass5_Sub14_Sub1_3);
				local57.aClass5_Sub14_Sub1_3 = null;
			}
			local57.method8829();
		}
		for (@Pc(83) Class5_Sub38 local83 = (Class5_Sub38) Static337.aClass335_25.method7768(); local83 != null; local83 = (Class5_Sub38) Static337.aClass335_25.method7777()) {
			if (local83.aClass5_Sub14_Sub1_3 != null) {
				Static229.aClass5_Sub14_Sub3_1.method2294(local83.aClass5_Sub14_Sub1_3);
				local83.aClass5_Sub14_Sub1_3 = null;
			}
			local83.method8829();
		}
	}
}
