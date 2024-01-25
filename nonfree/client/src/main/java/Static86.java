import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dda", name = "J", descriptor = "I")
	public static int anInt2132;

	@OriginalMember(owner = "client!dda", name = "ab", descriptor = "Lclient!jo;")
	public static Class168 aClass168_24;

	@OriginalMember(owner = "client!dda", name = "Z", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_40 = new Class254(92, 14);

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BI)V")
	public static void method1939(@OriginalArg(1) int arg0) {
		if (Static171.anInt3918 == arg0) {
			return;
		}
		Static228.anInt4746 = Static44.anInt1275 = Static299.anIntArray422[arg0];
		Static456.method7064();
		Static238.anIntArrayArray34 = new int[Static228.anInt4746][Static44.anInt1275];
		Static143.anIntArrayArray20 = new int[Static228.anInt4746][Static44.anInt1275];
		Static154.anIntArrayArrayArray3 = new int[4][Static228.anInt4746 >> 3][Static44.anInt1275 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static55.aClass194Array1[local40] = Static139.method2601(Static44.anInt1275, Static228.anInt4746);
		}
		Static68.aByteArrayArrayArray4 = new byte[4][Static228.anInt4746][Static44.anInt1275];
		Static7.method508(Static44.anInt1275, Static228.anInt4746);
		Static480.method7895(Static44.anInt1275 >> 3, Static228.anInt4746 >> 3, Static323.aClass9_8);
		Static171.anInt3918 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)[Lclient!gs;")
	public static Class123[] method1941() {
		return new Class123[] { Static230.aClass123_8, Static345.aClass123_12, Static88.aClass123_2, Static183.aClass123_5, Static79.aClass123_16, Static364.aClass123_15 };
	}
}
