import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "[I")
	public static final int[] anIntArray75 = new int[4];

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1958(@OriginalArg(1) String arg0) {
		if (!Static253.aBoolean325 || (Static182.anInt3987 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static31.anInt499;
		@Pc(18) int[] local18 = Static315.anIntArray279;
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			@Pc(33) Class25_Sub2_Sub2_Sub5_Sub1 local33 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local18[local25]];
			if (local33.aString183 != null && local33.aString183.equalsIgnoreCase(arg0) && (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 == local33 && (Static182.anInt3987 & 0x10) != 0 || local33 != null && (Static182.anInt3987 & 0x8) != 0)) {
				@Pc(69) Class3_Sub10 local69 = Static129.method2403(Static452.aClass353_2, Static143.aClass287_51);
				local69.aClass3_Sub26_Sub1_1.method6780(0);
				local69.aClass3_Sub26_Sub1_1.method6803(Static164.anInt3670);
				local69.aClass3_Sub26_Sub1_1.method6800(Static511.anInt8807);
				local69.aClass3_Sub26_Sub1_1.method6800(Static149.anInt3464);
				local69.aClass3_Sub26_Sub1_1.method6769(local18[local25]);
				Static193.method3398(local69);
				Static546.method7486(local33.anIntArray513[0], local33.method6668(), local33.anIntArray512[0], local33.method6668(), 0, -2, 0, true);
				local14 = true;
				break;
			}
		}
		if (!local14) {
			Static260.method4014(Static573.aClass350_25.method7730(Static201.anInt4321) + arg0);
		}
		if (Static253.aBoolean325) {
			Static213.method3571();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)Z")
	public static boolean method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
