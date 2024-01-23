import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "J")
	public static long aLong66;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "Lclient!i;")
	public static Class41 aClass41_648 = Static184.method2923("auf der Hautpseite)3");

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "Lclient!i;")
	private static Class41 aClass41_651 = Static184.method2923("red:");

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "Lclient!i;")
	public static Class41 aClass41_649 = aClass41_651;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!i;")
	private static Class41 aClass41_653 = Static184.method2923("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "Lclient!i;")
	public static Class41 aClass41_650 = aClass41_653;

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
	public static int anInt2197 = 0;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "Lclient!i;")
	public static Class41 aClass41_652 = aClass41_651;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!nb;BI)[Lclient!lj;")
	public static Class60[] method1555(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1) {
		return Static188.method2999(arg1, arg0) ? Static168.method2707() : null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!i;B)V")
	public static void method1556(@OriginalArg(0) Class41 arg0) {
		if (Static77.aClass2_Sub10Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method1419();
		if (local14 == 0L) {
			return;
		}
		while (local10 < Static77.aClass2_Sub10Array1.length && local14 != Static77.aClass2_Sub10Array1[local10].aLong150) {
			local10++;
		}
		if (Static77.aClass2_Sub10Array1.length > local10 && Static77.aClass2_Sub10Array1[local10] != null) {
			Static131.aClass2_Sub3_Sub1_2.method221(49);
			Static131.aClass2_Sub3_Sub1_2.method190(Static77.aClass2_Sub10Array1[local10].aLong150);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)I")
	public static int method1557(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IZ)Lclient!af;")
	public static Class2_Sub2_Sub2 method1559(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub2 local10 = (Class2_Sub2_Sub2) Static11.aClass43_2.method1464((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static124.aClass15_23.method387(arg0, 4);
		local10 = new Class2_Sub2_Sub2();
		if (local25 != null) {
			local10.method239(new Class2_Sub3(local25), arg0);
		}
		Static11.aClass43_2.method1462((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIJI)Z")
	public static boolean method1560(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		@Pc(19) int local19 = (int) arg1 >> 14 & 0x1F;
		@Pc(26) int local26 = (int) arg1 >> 20 & 0x3;
		if (local19 == 10 || local19 == 11 || local19 == 22) {
			@Pc(43) Class2_Sub2_Sub14 local43 = Static168.method2705(local12);
			@Pc(57) int local57;
			@Pc(54) int local54;
			if (local26 == 0 || local26 == 2) {
				local54 = local43.anInt3050;
				local57 = local43.anInt3040;
			} else {
				local57 = local43.anInt3050;
				local54 = local43.anInt3040;
			}
			@Pc(68) int local68 = local43.anInt3043;
			if (local26 != 0) {
				local68 = (local68 << local26 & 0xF) + (local68 >> 4 - local26);
			}
			Static183.method925(local54, 0, arg0, arg2, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], local57, 0, 2, true, local68, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
		} else {
			Static183.method925(0, local26, arg0, arg2, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, local19 + 1, 2, true, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
		}
		Static140.anInt3235 = Static154.anInt3614;
		Static142.anInt3253 = 2;
		Static132.anInt3013 = Static200.anInt4491;
		Static41.anInt1265 = 0;
		return true;
	}
}
