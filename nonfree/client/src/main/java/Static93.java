import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "Lclient!lba;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "J")
	public static long aLong71;

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "Lclient!ct;")
	public static final Class65 aClass65_1 = new Class65();

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "Lclient!ct;")
	public static final Class65 aClass65_2 = new Class65();

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "Lclient!ct;")
	public static final Class65 aClass65_3 = new Class65();

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "[I")
	public static final int[] anIntArray118 = new int[1];

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
	public static int anInt2108 = 0;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLclient!ika;)Lclient!bla;")
	public static Class41 method1943(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method2036();
		return new Class41(local7);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)I")
	public static int method1944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static29.aClass378_1.anInt10088 == -1) {
			return 1;
		}
		if (arg1 != Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620()) {
			Static678.method9035(Static430.aClass257_13.method5699(Static456.anInt7118), arg1, true);
			if (arg1 != Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620()) {
				return -1;
			}
		}
		try {
			@Pc(48) Dimension local48 = Static508.aCanvas8.getSize();
			Static472.method6430(Static153.aClass22_4, true, Static480.aClass57_9, Static52.aClass169_1, Static430.aClass257_13.method5699(Static456.anInt7118));
			@Pc(65) Class145 local65 = Static716.method9500(Static29.aClass378_1.anInt10088, Static299.aClass182_75);
			@Pc(68) long local68 = Static517.method6965();
			Static153.aClass22_4.la();
			Static158.aClass58_1.method9524(0, Static434.anInt10639, 0);
			Static153.aClass22_4.method9405(Static158.aClass58_1);
			Static153.aClass22_4.DA(local48.width / 2, local48.height / 2, 512, 512);
			Static153.aClass22_4.xa(1.0F);
			Static153.aClass22_4.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(116) Class170 local116 = Static153.aClass22_4.method9382(local65, 2048, 64, 64, 768);
			@Pc(118) int local118 = 0;
			label41: for (@Pc(120) int local120 = 0; local120 < 500; local120++) {
				Static153.aClass22_4.GA(0);
				Static153.aClass22_4.ya();
				for (@Pc(131) int local131 = 15; local131 >= 0; local131--) {
					for (@Pc(135) int local135 = 0; local135 <= local131; local135++) {
						Static598.aClass58_9.method9524((int) ((-((float) local131 / 2.0F) + (float) local135) * (float) Static308.anInt4969), 0, Static308.anInt4969 * (local131 + 1));
						local116.method8360(Static598.aClass58_9, (Class9_Sub9) null, 0);
						local118++;
						if ((long) arg0 <= Static517.method6965() - local68) {
							break label41;
						}
					}
				}
			}
			Static153.aClass22_4.method9345();
			@Pc(222) long local222 = (long) (local118 * 1000) / (Static517.method6965() - local68);
			Static153.aClass22_4.GA(0);
			Static153.aClass22_4.ya();
			return (int) local222;
		} catch (@Pc(233) Throwable local233) {
			local233.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	public static void method1945(@OriginalArg(1) int arg0) {
		Static267.anIntArray326 = new int[arg0];
		Static650.anIntArray724 = new int[arg0];
		Static694.anIntArray777 = new int[arg0];
		Static502.anIntArray581 = new int[arg0];
		Static196.anIntArray284 = new int[arg0];
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V")
	public static void method1946() {
		Static565.anInt8601 = -1;
		Static265.aClass292_3 = Static95.aClass292_1;
		Static11.anInt525 = 1;
		@Pc(11) String local11 = null;
		if (Static633.aByteArray92 != null) {
			@Pc(18) Class3_Sub2 local18 = new Class3_Sub2(Static633.aByteArray92);
			local11 = Static248.method3508(local18.method2063(), -118);
			Static605.aLong302 = local18.method2063();
		}
		if (local11 == null) {
			Static625.method8221(35);
		} else {
			Static45.method1224("", local11, true, false);
		}
	}
}
