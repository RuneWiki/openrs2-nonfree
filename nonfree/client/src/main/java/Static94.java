import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
	public static final int anInt1941 = 1407;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I")
	public static int method1719() {
		if ((double) Static143.aFloat49 == 3.0D) {
			return 37;
		} else if ((double) Static143.aFloat49 == 4.0D) {
			return 50;
		} else if ((double) Static143.aFloat49 == 6.0D) {
			return 75;
		} else if ((double) Static143.aFloat49 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lclient!ub;")
	public static Class10_Sub1_Sub17 method1720() {
		@Pc(8) Class10_Sub1_Sub17 local8 = (Class10_Sub1_Sub17) Static280.aClass136_7.method3200();
		if (local8 != null) {
			local8.method6033();
			local8.method5897();
			return local8;
		}
		do {
			local8 = (Class10_Sub1_Sub17) Static13.aClass136_8.method3200();
			if (local8 == null) {
				return null;
			}
			if (local8.method5341() > Static220.method3314()) {
				return null;
			}
			local8.method6033();
			local8.method5897();
		} while ((local8.aLong254 & Long.MIN_VALUE) == 0L);
		return local8;
	}
}
