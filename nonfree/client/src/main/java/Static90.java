import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "Lclient!cq;")
	public static Class28 aClass28_3;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_72 = new Class18(14, 3);

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	public static int anInt2053 = 1;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Z")
	public static boolean aBoolean145 = true;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_73 = new Class18(59, -1);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!in;III)V")
	public static void method1925(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg0 | arg2 << 14 | arg3 << 28);
		@Pc(24) Class1_Sub3 local24 = (Class1_Sub3) Static46.aClass38_4.method1475(local16);
		if (local24 == null) {
			local24 = new Class1_Sub3();
			Static46.aClass38_4.method1472(local24, local16);
			local24.aClass42_1.method1549(arg1);
			return;
		}
		@Pc(47) Class22 local47 = Static243.aClass220_2.method5972(arg1.anInt2967);
		@Pc(50) int local50 = local47.anInt894;
		if (local47.anInt880 == 1) {
			local50 *= arg1.anInt2968 + 1;
		}
		for (@Pc(69) Class1_Sub23 local69 = (Class1_Sub23) local24.aClass42_1.method1543(); local69 != null; local69 = (Class1_Sub23) local24.aClass42_1.method1551()) {
			local47 = Static243.aClass220_2.method5972(local69.anInt2967);
			@Pc(80) int local80 = local47.anInt894;
			if (local47.anInt880 == 1) {
				local80 *= local69.anInt2968 + 1;
			}
			if (local80 < local50) {
				Static188.method3533(arg1, local69);
				return;
			}
		}
		local24.aClass42_1.method1549(arg1);
	}
}
