import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!db", name = "L", descriptor = "Lclient!sl;")
	public static Class334 aClass334_3;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "J")
	public static long aLong71 = 0L;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_48 = new Class160(67, 2);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)V")
	public static void method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class14_Sub54 local13 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static158.aClass251_83);
		local13.aClass14_Sub21_Sub2_2.method7730(arg0);
		local13.aClass14_Sub21_Sub2_2.method7705(arg1);
		Static277.aClass347_2.method8308(local13);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!s;)V")
	public static void method1601(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1) {
		Static258.aClass159Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!db", name = "i", descriptor = "(I)V")
	public static void method1602() {
		if (!Static101.aBoolean128) {
			Static101.aBoolean128 = true;
			Static173.aFloat21 += (24.0F - Static173.aFloat21) / 2.0F;
			Static5.aBoolean5 = true;
		}
	}
}
