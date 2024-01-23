import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!hi", name = "U", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array9;

	@OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
	public static int anInt1813 = 7759444;

	@OriginalMember(owner = "client!hi", name = "X", descriptor = "Lclient!sc;")
	public static Class107 aClass107_532 = Static231.method3737("");

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)[Lclient!tg;")
	public static Class1_Sub2_Sub2[] method1416() {
		@Pc(8) Class1_Sub2_Sub2[] local8 = new Class1_Sub2_Sub2[Static40.anInt855];
		for (@Pc(15) int local15 = 0; local15 < Static40.anInt855; local15++) {
			@Pc(21) byte[] local21 = Static158.aByteArrayArray7[local15];
			@Pc(29) int local29 = Static141.anIntArray266[local15] * Static172.anIntArray329[local15];
			if (Static169.aBooleanArray23[local15]) {
				@Pc(36) int[] local36 = new int[local29];
				@Pc(40) byte[] local40 = Static159.aByteArrayArray8[local15];
				for (@Pc(42) int local42 = 0; local42 < local29; local42++) {
					local36[local42] = (local40[local42] & 0xFF) << 24 | Static169.anIntArray324[local21[local42] & 0xFF];
				}
				local8[local15] = new Class1_Sub2_Sub2_Sub1_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[local15], Static223.anIntArray373[local15], Static141.anIntArray266[local15], Static172.anIntArray329[local15], local36);
			} else {
				@Pc(96) int[] local96 = new int[local29];
				for (@Pc(98) int local98 = 0; local98 < local29; local98++) {
					local96[local98] = Static169.anIntArray324[local21[local98] & 0xFF];
				}
				local8[local15] = new Class1_Sub2_Sub2_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[local15], Static223.anIntArray373[local15], Static141.anIntArray266[local15], Static172.anIntArray329[local15], local96);
			}
		}
		Static158.method2564();
		return local8;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static224.method3669(arg4)) {
			Static201.aClass86Array2 = null;
			Static93.method2040(arg0, arg1, -1, arg7, arg3, arg5, arg2, arg6, Static6.aClass86ArrayArray11[arg4]);
			if (Static201.aClass86Array2 != null) {
				Static93.method2040(arg0, arg1, -1412584499, arg7, Static202.anInt4379, arg5, arg2, Static13.anInt321, Static201.aClass86Array2);
				Static201.aClass86Array2 = null;
			}
		} else if (arg0 == -1) {
			for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
				Static39.aBooleanArray5[local18] = true;
			}
		} else {
			Static39.aBooleanArray5[arg0] = true;
		}
	}
}
