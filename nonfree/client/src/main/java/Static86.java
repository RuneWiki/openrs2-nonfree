import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!ct;")
	public static Class30 aClass30_25;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!ct;")
	public static Class30 aClass30_26;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt1917 = 0;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	public static int anInt1918 = 999999;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!kg;Lclient!kg;I)V")
	public static void method1809(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class112 arg1) {
		Static280.method5009(Static352.aClass18_64);
		Static339.aClass1_Sub7_Sub2_4.method2115(arg0.anInt3376);
		Static339.aClass1_Sub7_Sub2_4.method2142(arg0.anInt3451);
		Static339.aClass1_Sub7_Sub2_4.method2158(arg1.anInt3376);
		Static339.aClass1_Sub7_Sub2_4.method2101(arg1.anInt3451);
		Static339.aClass1_Sub7_Sub2_4.method2138(arg1.anInt3398);
		Static339.aClass1_Sub7_Sub2_4.method2101(arg0.anInt3398);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method1811(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static216.anInt4293 >= 100) {
			Static91.method6076(Static101.aClass106_78.method2927(Static254.anInt5172));
			return;
		}
		@Pc(22) String local22 = Static267.method4817(arg1);
		if (local22 == null) {
			return;
		}
		@Pc(70) String local70;
		for (@Pc(27) int local27 = 0; local27 < Static216.anInt4293; local27++) {
			@Pc(40) String local40 = Static267.method4817(Static150.aStringArray32[local27]);
			if (local40 != null && local40.equals(local22)) {
				Static91.method6076(arg1 + Static66.aClass106_52.method2927(Static254.anInt5172));
				return;
			}
			if (Static322.aStringArray39[local27] != null) {
				local70 = Static267.method4817(Static322.aStringArray39[local27]);
				if (local70 != null && local70.equals(local22)) {
					Static91.method6076(arg1 + Static66.aClass106_52.method2927(Static254.anInt5172));
					return;
				}
			}
		}
		for (@Pc(96) int local96 = 0; local96 < Static195.anInt3948; local96++) {
			local70 = Static267.method4817(Static247.aStringArray29[local96]);
			if (local70 != null && local70.equals(local22)) {
				Static91.method6076(Static76.aClass106_62.method2927(Static254.anInt5172) + arg1 + Static219.aClass106_152.method2927(Static254.anInt5172));
				return;
			}
			if (Static160.aStringArray14[local96] != null) {
				@Pc(139) String local139 = Static267.method4817(Static160.aStringArray14[local96]);
				if (local139 != null && local139.equals(local22)) {
					Static91.method6076(Static76.aClass106_62.method2927(Static254.anInt5172) + arg1 + Static219.aClass106_152.method2927(Static254.anInt5172));
					return;
				}
			}
		}
		if (Static267.method4817(Static191.aClass11_Sub2_Sub6_Sub1_4.aString63).equals(local22)) {
			Static91.method6076(Static279.aClass106_188.method2927(Static254.anInt5172));
		} else {
			Static280.method5009(Static261.aClass18_175);
			Static339.aClass1_Sub7_Sub2_4.method2121(Static131.method2688(arg1) + 1);
			Static339.aClass1_Sub7_Sub2_4.method2106(arg1);
			Static339.aClass1_Sub7_Sub2_4.method2121(arg0 ? 1 : 0);
		}
	}
}
