import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "[I")
	public static final int[] anIntArray142 = new int[4];

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "J")
	public static long aLong52 = 0L;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	public static void method1758() {
		@Pc(7) int local7 = Static16.anInt362;
		@Pc(9) int[] local9 = Static325.anIntArray473;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class1_Sub1_Sub2_Sub1 local19 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt5054 > 0) {
				local19.anInt5054--;
				if (local19.anInt5054 == 0) {
					local19.aString108 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static520.anInt1936; local49++) {
			@Pc(56) long local56 = (long) Static24.anIntArray39[local49];
			@Pc(62) Class2_Sub11 local62 = (Class2_Sub11) Static71.aClass127_13.method3205(local56);
			if (local62 != null) {
				@Pc(67) Class1_Sub1_Sub2_Sub2 local67 = local62.aClass1_Sub1_Sub2_Sub2_1;
				if (local67.anInt5054 > 0) {
					local67.anInt5054--;
					if (local67.anInt5054 == 0) {
						local67.aString108 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V")
	public static void method1762() {
		Static323.anInt6016 = 0;
		Static448.aClass249_63.method6530();
		Static448.aClass249_63.method6523(Static390.aClass2_Sub44_2);
		Static323.anInt6016++;
	}
}
