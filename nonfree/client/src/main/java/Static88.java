import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
	public static int anInt2065;

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_17;

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "Lclient!q;")
	public static Class4_Sub17 aClass4_Sub17_10;

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "[I")
	public static int[] anIntArray208 = new int[25];

	@OriginalMember(owner = "client!pc", name = "L", descriptor = "Lclient!qc;")
	private static Class60 aClass60_847 = Static121.method2047("wishes to duel with you)3");

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[50][];

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "Lclient!qc;")
	public static Class60 aClass60_848 = Static121.method2047("<col=40ff00>");

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_849 = Static121.method2047("<col=00ff00>");

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "Lclient!qc;")
	public static Class60 aClass60_850 = aClass60_847;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "Lclient!qc;")
	public static Class60 aClass60_851 = Static121.method2047("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
	public static int anInt2069 = 0;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	public static void method1521() {
		aClass40_Sub1_17 = null;
		aClass60_851 = null;
		aClass60_850 = null;
		aClass60_847 = null;
		anIntArray208 = null;
		aByteArrayArray5 = null;
		aClass60_848 = null;
		aClass4_Sub17_10 = null;
		aClass60_849 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!wa;B)V")
	public static void method1522(@OriginalArg(0) Class4_Sub4_Sub1_Sub2 arg0) {
		if (arg0.anInt2621 == 0) {
			arg0.anInt2634 = 1024;
		}
		arg0.anInt2587 = 0;
		@Pc(21) int local21 = arg0.anInt2597 - Static81.anInt1944;
		if (arg0.anInt2621 == 1) {
			arg0.anInt2634 = 1536;
		}
		if (arg0.anInt2621 == 2) {
			arg0.anInt2634 = 0;
		}
		@Pc(47) int local47 = arg0.anInt2604 * 128 + arg0.anInt2612 * 64;
		arg0.anInt2620 += (local47 - arg0.anInt2620) / local21;
		@Pc(74) int local74 = arg0.anInt2586 * 128 + arg0.anInt2612 * 64;
		arg0.anInt2601 += (local74 - arg0.anInt2601) / local21;
		if (arg0.anInt2621 == 3) {
			arg0.anInt2634 = 512;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)V")
	public static void method1523() {
		try {
			if (Static30.anInt836 == 1) {
				@Pc(16) int local16 = Static59.aClass4_Sub2_Sub2_2.method565();
				if (local16 > 0 && Static59.aClass4_Sub2_Sub2_2.method560()) {
					local16 -= Static34.anInt895;
					if (local16 < 0) {
						local16 = 0;
					}
					Static59.aClass4_Sub2_Sub2_2.method552(local16);
				} else {
					Static59.aClass4_Sub2_Sub2_2.method553();
					Static59.aClass4_Sub2_Sub2_2.method540();
					Static41.aClass4_Sub15_1 = null;
					Static107.aClass63_1 = null;
					if (Static82.aClass40_59 == null) {
						Static30.anInt836 = 0;
					} else {
						Static30.anInt836 = 2;
					}
				}
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static59.aClass4_Sub2_Sub2_2.method553();
			Static30.anInt836 = 0;
			Static41.aClass4_Sub15_1 = null;
			Static107.aClass63_1 = null;
			Static82.aClass40_59 = null;
		}
	}
}
