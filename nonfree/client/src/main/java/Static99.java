import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!ha;I)Lclient!iea;")
	public static Class31 method1932(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		@Pc(10) Class2_Sub52 local10 = (Class2_Sub52) Static560.aClass323_36.method7484((long) arg0);
		if (local10 != null) {
			@Pc(24) Class2_Sub20_Sub1 local24 = local10.aClass161_Sub1_1.method3852();
			local10.aBoolean761 = true;
			if (local24 != null) {
				return local24.method2721(arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BZ)V")
	public static void method1934() {
		@Pc(12) Class2_Sub31 local12 = Static275.method4480(Static640.aClass314_2, Static329.aClass145_101);
		Static526.method7309(local12);
		for (@Pc(20) Class2_Sub28 local20 = (Class2_Sub28) Static22.aClass323_4.method7480(); local20 != null; local20 = (Class2_Sub28) Static22.aClass323_4.method7482()) {
			if (!local20.method8921()) {
				local20 = (Class2_Sub28) Static22.aClass323_4.method7480();
				if (local20 == null) {
					break;
				}
			}
			if (local20.anInt5452 == 0) {
				Static4.method71(true, local20, true);
			}
		}
		if (Static381.aClass303_23 != null) {
			Static514.method7103(Static381.aClass303_23);
			Static381.aClass303_23 = null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
	public static void method1935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) String local39 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local39);
		Static443.method6362(local39, true, false);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZII)V")
	public static void method1936(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static333.method5065(arg0, arg1, Static573.aClass345_14.method7951(Static496.anInt7407));
	}
}
