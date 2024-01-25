import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fr", name = "T", descriptor = "Lclient!uc;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!fr", name = "V", descriptor = "Lclient!wo;")
	public static Class216 aClass216_32;

	@OriginalMember(owner = "client!fr", name = "S", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_18 = new Class87(10);

	@OriginalMember(owner = "client!fr", name = "U", descriptor = "I")
	public static int anInt2213 = 0;

	@OriginalMember(owner = "client!fr", name = "W", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIII)V")
	public static void method1916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static49.method1304(true, local35);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IC)C")
	public static char method1917(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIII)V")
	public static void method1919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static107.anInt2549 = arg2;
		Static121.anInt2760 = arg3;
		Static44.anInt1404 = arg1;
		Static219.anInt4615 = arg0;
		Static330.anInt6322 = arg4;
		if (Static330.anInt6322 >= 100) {
			@Pc(27) int local27 = Static107.anInt2549 * 128 + 64;
			@Pc(33) int local33 = Static219.anInt4615 * 128 + 64;
			@Pc(42) int local42 = Static94.method2022(local33, local27, Static242.anInt6745) - Static121.anInt2760;
			@Pc(47) int local47 = local27 - Static320.anInt5326;
			@Pc(52) int local52 = local42 - Static95.anInt2319;
			@Pc(56) int local56 = local33 - Static64.anInt1797;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local56 * local56 + local47 * local47));
			Static179.anInt3884 = (int) (Math.atan2((double) local52, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static18.anInt555 = (int) (Math.atan2((double) local47, (double) local56) * -2607.5945876176133D) & 0x3FFF;
			Static121.anInt2762 = 0;
			if (Static179.anInt3884 < 1024) {
				Static179.anInt3884 = 1024;
			}
			if (Static179.anInt3884 > 3072) {
				Static179.anInt3884 = 3072;
			}
		}
		Static147.anInt3204 = 2;
	}
}
