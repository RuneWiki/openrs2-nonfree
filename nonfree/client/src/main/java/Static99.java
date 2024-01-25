import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "Lclient!efa;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
	public static int anInt2048;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Lclient!pk;")
	public static final Class258 aClass258_1 = new Class258("WTQA", 2);

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_59 = new Class363(50, 6);

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
	public static int anInt2049 = -1;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)I")
	public static int method1494() {
		return 16;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)Lclient!oga;")
	public static Class241 method1497() {
		try {
			return (Class241) Class.forName("Class241_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class241_Sub2();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1500(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 <= '\u07ff') {
				local15 += 2;
			} else {
				local15 += 3;
			}
		}
		return local15;
	}
}
