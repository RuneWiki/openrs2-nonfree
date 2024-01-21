import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
	public static int anInt2404 = 0;

	@OriginalMember(owner = "client!kh", name = "gb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_903 = Static169.method2903(" from your ignore list first)3");

	@OriginalMember(owner = "client!kh", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_902 = aClass23_903;

	@OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
	public static int anInt2406 = 0;

	@OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
	public static int anInt2407 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BILclient!ob;)Lclient!ed;")
	public static Class23 method1592(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1) {
		if (!Static130.method2309(Static170.method475(arg1), arg0) && arg1.anObjectArray27 == null) {
			return null;
		} else if (arg1.aClass23Array17 == null || arg0 >= arg1.aClass23Array17.length || arg1.aClass23Array17[arg0] == null || arg1.aClass23Array17[arg0].method641().method642() == 0) {
			return Static109.aBoolean136 ? Static149.method2571(new Class23[] { Static29.aClass23_301, Static27.method498(arg0) }) : null;
		} else {
			return arg1.aClass23Array17[arg0];
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
	public static void method1593() {
		Static153.anIntArray508 = new int[33];
		Static75.anIntArray268 = new int[33];
		Static166.anIntArray554 = new int[151];
		Static82.anIntArray283 = new int[151];
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(32) int local32;
		for (@Pc(24) int local24 = 0; local24 < 33; local24++) {
			local28 = 0;
			local30 = 999;
			for (local32 = 0; local32 < 34; local32++) {
				if (Static127.aClass1_Sub1_Sub12_Sub4_5.aByteArray44[Static127.aClass1_Sub1_Sub12_Sub4_5.anInt3905 * local24 + local32] == 0) {
					if (local30 == 999) {
						local30 = local32;
					}
				} else if (local30 != 999) {
					local28 = local32;
					break;
				}
			}
			Static75.anIntArray268[local24] = local30;
			Static153.anIntArray508[local24] = local28 - local30;
		}
		for (local30 = 5; local30 < 156; local30++) {
			local28 = 999;
			local32 = 0;
			for (@Pc(90) int local90 = 25; local90 < 172; local90++) {
				if (Static127.aClass1_Sub1_Sub12_Sub4_5.aByteArray44[local90 + Static127.aClass1_Sub1_Sub12_Sub4_5.anInt3905 * local30] == 0 && (local90 > 34 || local30 > 34)) {
					if (local28 == 999) {
						local28 = local90;
					}
				} else if (local28 != 999) {
					local32 = local90;
					break;
				}
			}
			Static166.anIntArray554[local30 - 5] = local28 - 25;
			Static82.anIntArray283[local30 - 5] = local32 - local28;
		}
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
	public static void method1594() {
		aClass23_902 = null;
		aClass23_903 = null;
	}
}
