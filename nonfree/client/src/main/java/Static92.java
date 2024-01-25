import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
	public static int anInt1815 = 0;

	@OriginalMember(owner = "client!dp", name = "x", descriptor = "Lclient!ica;")
	public static final Class127 aClass127_16 = new Class127(16);

	@OriginalMember(owner = "client!dp", name = "z", descriptor = "[I")
	public static int[] anIntArray139 = new int[2];

	@OriginalMember(owner = "client!dp", name = "C", descriptor = "[I")
	public static final int[] anIntArray140 = new int[14];

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "(I)V")
	public static void method1717() {
		for (@Pc(7) int local7 = 0; local7 < Static520.anInt1936; local7++) {
			@Pc(13) int local13 = Static24.anIntArray39[local7];
			@Pc(20) Class2_Sub11 local20 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local13);
			if (local20 != null) {
				@Pc(25) Class1_Sub1_Sub2_Sub2 local25 = local20.aClass1_Sub1_Sub2_Sub2_1;
				Static261.method4057(local25.aClass12_1.anInt313, local25);
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)V")
	public static void method1720() {
		Static456.anInt8316 = -1;
		Static86.anInt1765 = 1;
		if (Static302.aString124 == null) {
			Static468.method7051(35);
		} else {
			@Pc(20) Class2_Sub29 local20 = new Class2_Sub29(Static328.method5240(Static290.method4606(Static302.aString124)));
			@Pc(24) long local24 = local20.method5218();
			Static205.aLong104 = local20.method5218();
			Static430.method6614(true, Static404.method6383(local24), "");
		}
	}
}
