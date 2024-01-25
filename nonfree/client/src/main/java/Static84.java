import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
	public static int anInt2618;

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "Lclient!bi;")
	public static final Class6_Sub8_Sub1 aClass6_Sub8_Sub1_1 = new Class6_Sub8_Sub1(7500);

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "[I")
	public static int[] anIntArray85 = new int[2];

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_30 = new Class73(21, 3);

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(Z)V")
	public static void method2218() {
		Static66.aClass4_8 = null;
		Static442.aClass4_20 = null;
		Static522.aClass4_28 = null;
		Static396.aClass4_19 = null;
		Static624.aClass4_33 = null;
		Static565.aClass4_30 = null;
		Static91.aClass4_9 = null;
		Static635.aClass4_34 = null;
		Static388.aClass4Array10 = null;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZIILjava/lang/String;)Z")
	public static boolean method2220(@OriginalArg(3) String arg0) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local33 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(71) int local71;
			if (local48 >= '0' && local48 <= '9') {
				local71 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local71 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local71 = local48 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local33) {
				local71 = -local71;
			}
			@Pc(117) int local117 = local37 * 10 + local71;
			if (local37 != local117 / 10) {
				return false;
			}
			local37 = local117;
			local35 = true;
		}
		return local35;
	}
}
