import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "Lclient!qj;")
	public static Class165 aClass165_31;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "Lclient!lf;")
	public static Class90 aClass90_8;

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
	public static int anInt1744;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString70 = "Created gameworld";

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	public static int anInt1740 = 0;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)V")
	public static void method1693() {
		Static253.anInt4863 = 0;
		Static125.anInt2470 = 0;
		Static339.method5611();
		Static175.method3445();
		Static169.method4149();
		Static347.method4028();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static253.anInt4863; local19++) {
			local25 = Static192.anIntArray812[local19];
			if (Static254.aClass5_Sub3_Sub3_Sub1Array1[local25].anInt4932 != Static215.anInt4246) {
				if (Static254.aClass5_Sub3_Sub3_Sub1Array1[local25].anInt3299 > 0) {
					Static299.method5096(Static254.aClass5_Sub3_Sub3_Sub1Array1[local25]);
				}
				Static254.aClass5_Sub3_Sub3_Sub1Array1[local25] = null;
			}
		}
		if (Static230.anInt4529 != Static232.aClass1_Sub7_Sub1_4.anInt3368) {
			throw new RuntimeException("gpp1 pos:" + Static232.aClass1_Sub7_Sub1_4.anInt3368 + " psize:" + Static230.anInt4529);
		}
		for (local25 = 0; local25 < Static334.anInt6370; local25++) {
			if (Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static334.anInt6370);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)V")
	public static void method1694(@OriginalArg(1) boolean arg0) {
		Static29.aBoolean71 = arg0;
		Static233.aBoolean384 = !Static123.method2195();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(CZ)Z")
	public static boolean method1695(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1697(@OriginalArg(1) String arg0) {
		Static9.method288(0, "", "", arg0, 0);
	}
}
