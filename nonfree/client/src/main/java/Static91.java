import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_44 = new Class151(64, 4);

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public static int anInt1809 = 0;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "[I")
	public static final int[] anIntArray117 = new int[1000];

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[I")
	public static final int[] anIntArray118 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	public static int anInt1810 = 0;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "[S")
	private static final short[] aShortArray17 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!de", name = "l", descriptor = "[S")
	private static final short[] aShortArray18 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!de", name = "m", descriptor = "[S")
	private static final short[] aShortArray19 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!de", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { aShortArray18, aShortArray17, aShortArray19 };

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)I")
	public static int method1802() {
		return Static208.anInt3378;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIIZIZ)V")
	public static void method1803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) Class22_Sub1 local16 = Static382.aClass22_Sub1Array1[local10];
		Static382.aClass22_Sub1Array1[local10] = Static382.aClass22_Sub1Array1[arg1];
		Static382.aClass22_Sub1Array1[arg1] = local16;
		for (@Pc(28) int local28 = arg0; local28 < arg1; local28++) {
			if (Static118.method2163(local16, arg5, arg4, arg3, Static382.aClass22_Sub1Array1[local28], arg2) <= 0) {
				@Pc(48) Class22_Sub1 local48 = Static382.aClass22_Sub1Array1[local28];
				Static382.aClass22_Sub1Array1[local28] = Static382.aClass22_Sub1Array1[local12];
				Static382.aClass22_Sub1Array1[local12++] = local48;
			}
		}
		Static382.aClass22_Sub1Array1[arg1] = Static382.aClass22_Sub1Array1[local12];
		Static382.aClass22_Sub1Array1[local12] = local16;
		method1803(arg0, local12 - 1, arg2, arg3, arg4, arg5);
		method1803(local12 + 1, arg1, arg2, arg3, arg4, arg5);
	}
}
