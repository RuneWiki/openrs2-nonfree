import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!s;")
	public static final Class217 aClass217_41 = new Class217(52, 2);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)[Lclient!vg;")
	public static Class256[] method1650() {
		if (Static169.aClass256Array1 == null) {
			@Pc(7) Class256[] local7 = Static115.method2030(Static171.aClass159_1);
			@Pc(11) Class256[] local11 = new Class256[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(61) int local61;
			@Pc(67) Class256 local67;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class256 local21 = local7[local15];
				if ((local21.anInt7175 <= 0 || local21.anInt7175 >= 24) && local21.anInt7177 >= 800 && local21.anInt7176 >= 600 && (Static108.anInt2167 >= 96 || Static423.anInt7114 != 0 || local21.anInt7177 <= 1024 && local21.anInt7176 <= 768)) {
					for (local61 = 0; local61 < local13; local61++) {
						local67 = local11[local61];
						if (local67.anInt7177 == local21.anInt7177 && local67.anInt7176 == local21.anInt7176) {
							if (local21.anInt7175 > local67.anInt7175) {
								local11[local61] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static169.aClass256Array1 = new Class256[local13];
			Static468.method4355(local11, 0, Static169.aClass256Array1, 0, local13);
			@Pc(127) int[] local127 = new int[Static169.aClass256Array1.length];
			for (local61 = 0; local61 < Static169.aClass256Array1.length; local61++) {
				local67 = Static169.aClass256Array1[local61];
				local127[local61] = local67.anInt7177 * local67.anInt7176;
			}
			Static285.method4034(Static169.aClass256Array1, local127);
		}
		return Static169.aClass256Array1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJ)V")
	public static void method1651(@OriginalArg(1) long arg0) {
		Static337.aClass10_Sub8_Sub2_2.anInt2989 = 0;
		Static337.aClass10_Sub8_Sub2_2.method2458(Static53.aClass216_8.anInt6089);
		Static337.aClass10_Sub8_Sub2_2.method2470(arg0);
		Static337.aClass10_Sub8_Sub2_2.method2458(Static191.anInt3842);
		Static284.anInt4990 = 0;
		Static113.anInt2280 = -3;
		Static268.anInt4867 = 1;
		Static241.anInt4381 = 0;
	}
}
