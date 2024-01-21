import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public static int anInt2872;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_13;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!oc;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!pi;")
	public static final Class67 aClass67_5 = new Class67();

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public static int anInt2866 = 0;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "[I")
	public static final int[] anIntArray329 = new int[100];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method2272() {
		try {
			if (Static21.aClass92_1 == null) {
				Static21.aClass92_1 = new Class92(Static65.aClass81_1, Static193.method3536(new Class60[] { Static127.aClass60_964, Static101.aClass60_813, Static165.aClass60_1120 }).method2688());
			} else {
				@Pc(36) byte[] local36 = Static21.aClass92_1.method3540();
				if (local36 != null) {
					@Pc(43) Class2_Sub3 local43 = new Class2_Sub3(local36);
					Static36.anInt1080 = local43.method234();
					Static43.aClass14Array1 = new Class14[Static36.anInt1080];
					for (@Pc(52) int local52 = 0; local52 < Static36.anInt1080; local52++) {
						@Pc(62) Class14 local62 = Static43.aClass14Array1[local52] = new Class14();
						@Pc(66) int local66 = local43.method234();
						local62.aBoolean27 = (local66 & 0x8000) != 0;
						local62.anInt767 = local66 & 0x7FFF;
						local62.aClass60_184 = local43.method240();
						local62.anInt761 = local43.method219();
						local62.anInt764 = local52;
						local62.anInt765 = Static82.method1917(local62.aClass60_184);
					}
					Static22.method542(Static43.aClass14Array1, Static24.anIntArray79, 0, Static48.anIntArray140, Static43.aClass14Array1.length - 1);
					Static21.aClass92_1 = null;
					Static80.aBoolean96 = true;
				}
			}
		} catch (@Pc(119) Exception local119) {
			local119.printStackTrace();
			Static21.aClass92_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIB)I")
	public static int method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub15 local8 = (Class2_Sub15) Static88.aClass51_7.method2458((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local8.anIntArray393.length; local30++) {
				if (arg1 == local8.anIntArray391[local30]) {
					local28 += local8.anIntArray393[local30];
				}
			}
			return local28;
		}
	}
}
