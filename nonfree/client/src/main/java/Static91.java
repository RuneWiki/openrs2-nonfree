import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!daa", name = "C", descriptor = "Lclient!oja;")
	public static Class256 aClass256_3;

	@OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
	public static int anInt1765 = 0;

	@OriginalMember(owner = "client!daa", name = "y", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_34 = new Class180(121, 3);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BCLjava/lang/String;)I")
	public static int method1703(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg1.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg0 == arg1.charAt(local10)) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(B)V")
	public static void method1704() {
		Static460.method6706(false);
		if (Static666.anInt10611 >= 0 && Static666.anInt10611 != 0) {
			Static382.method5480(false, Static666.anInt10611);
			Static666.anInt10611 = -1;
		}
	}
}
