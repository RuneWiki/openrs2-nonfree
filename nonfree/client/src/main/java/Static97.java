import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
	public static int anInt2406;

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
	public static int anInt2407;

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "[Lclient!pea;")
	public static final Class3_Sub7_Sub15[] aClass3_Sub7_Sub15Array4 = new Class3_Sub7_Sub15[14];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!pca;ZZII)V")
	public static void method2031(@OriginalArg(0) Class251 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt7285;
		@Pc(11) int local11 = arg0.anInt7215;
		if (arg0.aByte110 == 0) {
			arg0.anInt7285 = arg0.anInt7204;
		} else if (arg0.aByte110 == 1) {
			arg0.anInt7285 = arg3 - arg0.anInt7204;
		} else if (arg0.aByte110 == 2) {
			arg0.anInt7285 = arg3 * arg0.anInt7204 >> 14;
		}
		if (arg0.aByte113 == 0) {
			arg0.anInt7215 = arg0.anInt7241;
		} else if (arg0.aByte113 == 1) {
			arg0.anInt7215 = arg2 - arg0.anInt7241;
		} else if (arg0.aByte113 == 2) {
			arg0.anInt7215 = arg2 * arg0.anInt7241 >> 14;
		}
		if (arg0.aByte110 == 4) {
			arg0.anInt7285 = arg0.anInt7230 * arg0.anInt7215 / arg0.anInt7218;
		}
		if (arg0.aByte113 == 4) {
			arg0.anInt7215 = arg0.anInt7285 * arg0.anInt7218 / arg0.anInt7230;
		}
		if (Static355.aBoolean446 && (Static70.method1716(arg0).anInt3988 != 0 || arg0.anInt7231 == 0)) {
			if (arg0.anInt7215 < 5 && arg0.anInt7285 < 5) {
				arg0.anInt7215 = 5;
				arg0.anInt7285 = 5;
			} else {
				if (arg0.anInt7215 <= 0) {
					arg0.anInt7215 = 5;
				}
				if (arg0.anInt7285 <= 0) {
					arg0.anInt7285 = 5;
				}
			}
		}
		if (arg0.anInt7249 == Static92.anInt2341) {
			Static160.aClass251_4 = arg0;
		}
		if (arg1 && arg0.anObjectArray17 != null && (arg0.anInt7285 != local8 || arg0.anInt7215 != local11)) {
			@Pc(185) Class3_Sub36 local185 = new Class3_Sub36();
			local185.aClass251_8 = arg0;
			local185.anObjectArray1 = arg0.anObjectArray17;
			Static206.aClass244_38.method5570(local185);
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)V")
	public static void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static478.method6527(local7.aClass25_Sub2_Sub3_2);
		Static478.method6527(local7.aClass25_Sub2_Sub3_1);
		if (local7.aClass25_Sub2_Sub3_2 != null) {
			local7.aClass25_Sub2_Sub3_2 = null;
		}
		if (local7.aClass25_Sub2_Sub3_1 != null) {
			local7.aClass25_Sub2_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V")
	public static void method2033() {
		Static161.anInt3613 = 0;
		Static260.aClass244_40.method5581();
		Static260.aClass244_40.method5570(Static165.aClass3_Sub13_1);
		Static161.anInt3613++;
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(B)V")
	public static void method2035() {
		Static94.aBoolean171 = false;
		Static246.method3899();
	}
}
