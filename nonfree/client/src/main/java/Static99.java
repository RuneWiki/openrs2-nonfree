import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public static int anInt1969 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public static void method1636() {
		Static375.aClass295_50.method6462(5);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
	public static void method1637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static216.method3187(local7.aClass34_Sub1_Sub3_1);
		Static216.method3187(local7.aClass34_Sub1_Sub3_2);
		if (local7.aClass34_Sub1_Sub3_1 != null) {
			local7.aClass34_Sub1_Sub3_1 = null;
		}
		if (local7.aClass34_Sub1_Sub3_2 != null) {
			local7.aClass34_Sub1_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Lclient!gm;")
	public static Class135 method1638(@OriginalArg(0) int arg0) {
		@Pc(8) Class135[] local8 = Static66.method1169();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class135 local21 = local8[local15];
			if (arg0 == local21.anInt3594) {
				return local21;
			}
		}
		return null;
	}
}
