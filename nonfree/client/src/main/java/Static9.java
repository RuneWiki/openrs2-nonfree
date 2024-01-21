import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "[Lclient!p;")
	public static final Class76[] aClass76Array1 = new Class76[4];

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_100 = Static161.method2452("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public static int anInt209 = -1;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	public static int anInt210 = 0;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_106 = Static161.method2452("green:");

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_101 = aClass20_106;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_102 = Static161.method2452("Abbrechen");

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_104 = Static161.method2452("Please wait)3)3)3");

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "Lclient!dc;")
	public static Class20 aClass20_103 = aClass20_104;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	public static int anInt213 = 2;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Lclient!dc;")
	public static Class20 aClass20_105 = aClass20_106;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V")
	public static void method194(@OriginalArg(1) boolean arg0) {
		Static95.method1546();
		Static204.anInt3990++;
		if (Static204.anInt3990 < 50 && !arg0) {
			return;
		}
		Static204.anInt3990 = 0;
		if (Static38.aBoolean49 || Static157.aClass39_3 == null) {
			return;
		}
		Static43.aClass5_Sub6_Sub1_2.method3087(56);
		try {
			Static157.aClass39_3.method1176(Static43.aClass5_Sub6_Sub1_2.anInt4050, Static43.aClass5_Sub6_Sub1_2.aByteArray56);
			Static43.aClass5_Sub6_Sub1_2.anInt4050 = 0;
		} catch (@Pc(50) IOException local50) {
			Static38.aBoolean49 = true;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public static void method195(@OriginalArg(0) int arg0) {
		if (Static83.anIntArray179 == null || Static83.anIntArray179.length < arg0) {
			Static83.anIntArray179 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public static void method197() {
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			Static185.aBooleanArray43[local13] = true;
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
	public static void method198() {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = -1; local7 < Static66.anInt1444; local7++) {
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static7.anIntArray13[local7];
			}
			@Pc(25) Class1_Sub2_Sub2 local25 = Static6.aClass1_Sub2_Sub2Array1[local15];
			if (local25 != null && local25.anInt2219 > 0) {
				local25.anInt2219--;
				if (local25.anInt2219 == 0) {
					local25.aClass20_835 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static83.anInt1850; local15++) {
			@Pc(61) int local61 = Static80.anIntArray175[local15];
			@Pc(65) Class1_Sub2_Sub1 local65 = Static61.aClass1_Sub2_Sub1Array1[local61];
			if (local65 != null && local65.anInt2219 > 0) {
				local65.anInt2219--;
				if (local65.anInt2219 == 0) {
					local65.aClass20_835 = null;
				}
			}
		}
	}
}
