import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	public static int anInt2008 = 0;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_749 = Static161.method2452("shake:");

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_746 = aClass20_749;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Lclient!dc;")
	public static Class20 aClass20_747 = aClass20_749;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_748 = Static161.method2452("b12_full");

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	public static int anInt2009 = 0;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "I")
	public static int anInt2011 = -1;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "S")
	public static short aShort19 = 256;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BZ)V")
	public static void method1545() {
		@Pc(14) byte[][] local14 = Static104.aByteArrayArray7;
		@Pc(17) int local17 = local14.length;
		@Pc(31) int local31;
		@Pc(41) int local41;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			local31 = (Static125.anIntArray290[local19] >> 8) * 64 - Static86.anInt1895;
			local41 = (Static125.anIntArray290[local19] & 0xFF) * 64 - Static110.anInt2295;
			@Pc(45) byte[] local45 = local14[local19];
			if (local45 != null) {
				method1546();
				Static53.method917(Static9.aClass76Array1, local45, (Static119.anInt2546 - 6) * 8, local41, (Static132.anInt3723 - 6) * 8, local31);
			}
		}
		for (local31 = 0; local31 < local17; local31++) {
			local41 = (Static125.anIntArray290[local31] >> 8) * 64 - Static86.anInt1895;
			@Pc(99) int local99 = (Static125.anIntArray290[local31] & 0xFF) * 64 - Static110.anInt2295;
			@Pc(103) byte[] local103 = local14[local31];
			if (local103 == null && Static119.anInt2546 < 800) {
				method1546();
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					Static72.method1179(64, local112, 64, local41, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method1546() {
		if (Static192.aClass9_2 != null) {
			Static192.aClass9_2.method2941();
		}
		if (Static59.aClass9_1 != null) {
			Static59.aClass9_1.method2941();
		}
	}
}
