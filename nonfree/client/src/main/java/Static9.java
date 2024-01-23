import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Lclient!mb;")
	public static Class70 aClass70_4;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	public static int anInt179 = -1;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "Lclient!ia;")
	public static Class51 aClass51_58 = Static64.method1101("runes");

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "Lclient!ia;")
	public static Class51 aClass51_59 = Static64.method1101("sl_arrows");

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZZ)I")
	public static int method130() {
		return Static144.anInt3150 + Static227.anInt4783;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(IZ)Lclient!p;")
	public static Class82 method132(@OriginalArg(0) int arg0) {
		@Pc(11) Class82 local11 = (Class82) Static218.aClass53_18.method1501((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29 = Static64.aClass70_17.method3509(Static210.method3490(arg0), Static100.method1673(arg0));
		local11 = new Class82();
		local11.anInt3296 = arg0;
		if (local29 != null) {
			local11.method2573(new Class1_Sub16(local29));
		}
		local11.method2580();
		if (!Static116.aBoolean64 && local11.aBoolean154) {
			local11.aClass51Array24 = null;
		}
		if (local11.aBoolean146) {
			local11.aBoolean155 = false;
			local11.anInt3294 = 0;
		}
		Static218.aClass53_18.method1497(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
	public static void method135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub18 local10 = (Class1_Sub18) Static23.aClass105_3.method3120(); local10 != null; local10 = (Class1_Sub18) Static23.aClass105_3.method3109()) {
			Static157.method2680(arg1, local10, arg3, arg2, arg0);
		}
		for (@Pc(33) Class1_Sub18 local33 = (Class1_Sub18) Static150.aClass105_16.method3120(); local33 != null; local33 = (Class1_Sub18) Static150.aClass105_16.method3109()) {
			@Pc(39) byte local39 = 1;
			if (local33.aClass5_Sub1_Sub2_1.anInt3620 == local33.aClass5_Sub1_Sub2_1.anInt3618) {
				local39 = 0;
			} else if (local33.aClass5_Sub1_Sub2_1.anInt3591 == local33.aClass5_Sub1_Sub2_1.anInt3620) {
				local39 = 2;
			}
			if (local39 != local33.anInt2491) {
				@Pc(80) int local80 = Static202.method3328(local33.aClass5_Sub1_Sub2_1);
				if (local80 != local33.anInt2495) {
					if (local33.aClass1_Sub4_Sub4_2 != null) {
						Static111.aClass1_Sub4_Sub3_2.method2304(local33.aClass1_Sub4_Sub4_2);
						local33.aClass1_Sub4_Sub4_2 = null;
					}
					local33.anInt2495 = local80;
				}
				local33.anInt2491 = local39;
			}
			local33.anInt2487 = local33.aClass5_Sub1_Sub2_1.anInt3624;
			local33.anInt2494 = local33.aClass5_Sub1_Sub2_1.anInt3584 * 64 + local33.aClass5_Sub1_Sub2_1.anInt3624;
			local33.anInt2492 = local33.aClass5_Sub1_Sub2_1.anInt3598 + local33.aClass5_Sub1_Sub2_1.anInt3584 * 64;
			local33.anInt2499 = local33.aClass5_Sub1_Sub2_1.anInt3598;
			Static157.method2680(arg1, local33, arg3, arg2, arg0);
		}
		for (@Pc(153) Class1_Sub18 local153 = (Class1_Sub18) Static92.aClass102_11.method3086(); local153 != null; local153 = (Class1_Sub18) Static92.aClass102_11.method3087()) {
			@Pc(157) byte local157 = 1;
			if (local153.aClass5_Sub1_Sub1_2.anInt3618 == local153.aClass5_Sub1_Sub1_2.anInt3620) {
				local157 = 0;
			} else if (local153.aClass5_Sub1_Sub1_2.anInt3620 == local153.aClass5_Sub1_Sub1_2.anInt3591) {
				local157 = 2;
			}
			if (local153.anInt2491 != local157) {
				@Pc(190) int local190 = Static17.method325(local153.aClass5_Sub1_Sub1_2);
				if (local153.anInt2495 != local190) {
					if (local153.aClass1_Sub4_Sub4_2 != null) {
						Static111.aClass1_Sub4_Sub3_2.method2304(local153.aClass1_Sub4_Sub4_2);
						local153.aClass1_Sub4_Sub4_2 = null;
					}
					local153.anInt2495 = local190;
				}
				local153.anInt2491 = local157;
			}
			local153.anInt2487 = local153.aClass5_Sub1_Sub1_2.anInt3624;
			local153.anInt2494 = local153.aClass5_Sub1_Sub1_2.anInt3624 + local153.aClass5_Sub1_Sub1_2.anInt3584 * 64;
			local153.anInt2492 = local153.aClass5_Sub1_Sub1_2.anInt3598 + local153.aClass5_Sub1_Sub1_2.anInt3584 * 64;
			local153.anInt2499 = local153.aClass5_Sub1_Sub1_2.anInt3598;
			Static157.method2680(arg1, local153, arg3, arg2, arg0);
		}
	}
}
