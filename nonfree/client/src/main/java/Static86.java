import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!da", name = "y", descriptor = "I")
	public static int anInt10575;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public static int anInt10555 = 0;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!mu;")
	public static final Class212 aClass212_19 = new Class212("LIVE", "", "", 0);

	@OriginalMember(owner = "client!da", name = "v", descriptor = "[C")
	public static final char[] aCharArray15 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method8585() {
		Static91.method2289((long) Static384.anInt7234, Static467.aClass5_13);
		if (Static30.anInt830 != -1) {
			Static600.method8299(Static30.anInt830);
		}
		for (@Pc(19) int local19 = 0; local19 < Static588.anInt9948; local19++) {
			if (Static366.aBooleanArray16[local19]) {
				Static337.aBooleanArray15[local19] = true;
			}
			Static412.aBooleanArray20[local19] = Static366.aBooleanArray16[local19];
			Static366.aBooleanArray16[local19] = false;
		}
		Static394.anInt7366 = Static384.anInt7234;
		if (Static30.anInt830 != -1) {
			Static588.anInt9948 = 0;
			Static384.method6054();
		}
		Static467.aClass5_13.la();
		Static380.method6021(Static467.aClass5_13);
		@Pc(66) int local66 = Static154.method3057();
		if (local66 == -1) {
			local66 = Static329.anInt6606;
		}
		if (local66 == -1) {
			local66 = Static538.anInt9322;
		}
		method8588(local66);
		Static492.anInt8597 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
	public static void method8588(@OriginalArg(0) int arg0) {
		if (Static87.aClass6_Sub33_6.aClass14_Sub29_1.method8582() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static562.anInt9689) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class247 local26 = Static40.aClass19_1.method644(arg0);
			@Pc(30) Class331 local30 = local26.method6451();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static496.aClass104_4.method3141(local30.method7893(), new Point(local26.anInt7648, local26.anInt7646), local30.method7888(), local30.method7896(), Static428.aCanvas12);
				Static562.anInt9689 = arg0;
			}
		}
		if (arg0 == -1 && Static562.anInt9689 != -1) {
			Static496.aClass104_4.method3141((int[]) null, new Point(), -1, -1, Static428.aCanvas12);
			Static562.anInt9689 = -1;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	public static void method8591() {
		@Pc(5) Class94 local5 = Static378.aClass94_34;
		synchronized (Static378.aClass94_34) {
			Static378.aClass94_34.method2958(5);
		}
		local5 = Static403.aClass94_38;
		synchronized (Static403.aClass94_38) {
			Static403.aClass94_38.method2958(5);
		}
	}
}
