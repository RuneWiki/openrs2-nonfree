import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public static int anInt2436;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Lclient!a;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public static int anInt2431 = 0;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_1199 = Static9.method266("Fps:");

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[[[Lclient!jd;")
	public static Class38[][][] aClass38ArrayArrayArray1 = new Class38[4][104][104];

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_1200 = Static9.method266(")1p");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)Z")
	public static boolean method1607(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method1608() {
		aClass34_1199 = null;
		aClass34_1200 = null;
		aClass38ArrayArrayArray1 = null;
		aClass1_Sub1_Sub1_Sub1_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static26.method496(arg5)) {
			Static27.method544(arg0, arg6, arg3, Static41.aClass1_Sub9ArrayArray1[arg5], -1, arg1, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method1610() {
		@Pc(5) Object local5 = Static1.anObject1;
		synchronized (Static1.anObject1) {
			if (Static27.anInt890 != 0) {
				Static27.anInt890 = 1;
				try {
					Static1.anObject1.wait();
				} catch (@Pc(18) InterruptedException local18) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method1611() {
		Static92.anInt2405 = 0;
		Static32.anInt1453 = 0;
		Static29.method555();
		Static100.method1668();
		Static46.method868();
		Static41.method700();
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static92.anInt2405; local27++) {
			local33 = Static120.anIntArray354[local27];
			if (Static73.anInt1947 != Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33].anInt1435) {
				Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33] = null;
			}
		}
		if (Static51.aClass1_Sub19_Sub1_4.anInt3111 != Static81.anInt2134) {
			throw new RuntimeException("gpp1 pos:" + Static51.aClass1_Sub19_Sub1_4.anInt3111 + " psize:" + Static81.anInt2134);
		}
		for (local33 = 0; local33 < Static40.anInt1154; local33++) {
			if (Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static102.anIntArray321[local33]] == null) {
				throw new RuntimeException("gpp2 pos:" + local33 + " size:" + Static40.anInt1154);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
	public static int method1612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 + arg0 * 57;
		@Pc(24) int local24 = local18 ^ local18 << 13;
		@Pc(38) int local38 = Integer.MAX_VALUE & (local24 * 15731 * local24 + 789221) * local24 + 1376312589;
		return local38 >> 19 & 0xFF;
	}
}
