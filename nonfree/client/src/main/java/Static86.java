import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "[I")
	public static int[] anIntArray149;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
	public static int anInt1676;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	public static int anInt1673 = 0;

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_22 = new Class84("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
	public static void method1449() {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(12) Class100 local12 = Static119.aClass138_7.method3216("2");
			while (local12.anInt2365 == 0) {
				Static67.method1189(1L);
			}
			if (local12.anInt2365 == 1) {
				local7 = (Class133) local12.anObject4;
				@Pc(40) Class1_Sub1 local40 = new Class1_Sub1(Static393.anInt6823 * 6 + 3);
				local40.method4115(1);
				local40.method4101(Static393.anInt6823);
				for (@Pc(50) int local50 = 0; local50 < Static77.anIntArray142.length; local50++) {
					if (Static318.aBooleanArray18[local50]) {
						local40.method4101(local50);
						local40.method4105(Static77.anIntArray142[local50]);
					}
				}
				local7.method3021(0, local40.anInt5056, local40.aByteArray66);
			}
		} catch (@Pc(90) Exception local90) {
		}
		try {
			if (local7 != null) {
				local7.method3023();
			}
		} catch (@Pc(97) Exception local97) {
		}
		Static32.aLong21 = Static101.method1557();
		Static201.aBoolean257 = false;
	}
}
