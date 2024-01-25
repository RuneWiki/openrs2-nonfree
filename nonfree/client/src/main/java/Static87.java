import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!db", name = "V", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Lclient!rt;")
	public static final Class111 aClass111_1 = Static105.method1570();

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Z")
	public static final boolean aBoolean126 = false;

	@OriginalMember(owner = "client!db", name = "U", descriptor = "[I")
	public static final int[] anIntArray126 = new int[1000];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
	public static boolean method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static173.method8449(arg1, arg0) || Static279.method3860(arg1, arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(CB)Z")
	public static boolean method1307(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static644.method8649(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static592.aCharArray7;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(42) char[] local42 = Static633.aCharArray8;
			for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
				@Pc(50) char local50 = local42[local44];
				if (local50 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILclient!wu;)Lclient!cw;")
	public static Class61 method1309(@OriginalArg(1) int arg0, @OriginalArg(2) Class380 arg1) {
		@Pc(15) Class61 local15 = (Class61) Static430.aClass32_75.method630((long) arg0);
		if (local15 == null) {
			if (Static405.aBoolean453) {
				local15 = Static192.aClass95_4.method6980(Static655.method7414(arg1, arg0), true);
			} else {
				local15 = Static345.method4632(arg1.method8616(arg0));
			}
			Static430.aClass32_75.method629(local15, (long) arg0);
		}
		return local15;
	}
}
