import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
	public static int anInt1748;

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!gl", name = "eb", descriptor = "I")
	public static int anInt1754 = 0;

	@OriginalMember(owner = "client!gl", name = "hb", descriptor = "I")
	public static int anInt1756 = 0;

	@OriginalMember(owner = "client!gl", name = "mb", descriptor = "[I")
	public static int[] anIntArray232 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!gl", name = "nb", descriptor = "J")
	public static long aLong57 = 0L;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Lclient!ah;")
	public static Class5 method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class5 local14 = local7.aClass5_1;
			local7.aClass5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(JB)V")
	public static void method1523(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static270.aClass1_Sub18_Sub1_3.method3130(59);
			Static270.aClass1_Sub18_Sub1_3.method3091(arg0);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
	public static void method1524(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static147.anIntArray340[local7] = Static147.anIntArray340[local7 - 1];
			Static288.aStringArray37[local7] = Static288.aStringArray37[local7 - 1];
			Static294.aStringArray38[local7] = Static294.aStringArray38[local7 - 1];
			Static17.aStringArray2[local7] = Static17.aStringArray2[local7 - 1];
			Static90.anIntArray532[local7] = Static90.anIntArray532[local7 - 1];
		}
		Static288.aStringArray37[0] = arg2;
		Static294.aStringArray38[0] = arg0;
		Static147.anIntArray340[0] = arg1;
		Static90.anIntArray532[0] = arg4;
		Static196.anInt3773++;
		Static123.anInt2373 = Static56.anInt1175;
		Static17.aStringArray2[0] = arg3;
	}
}
