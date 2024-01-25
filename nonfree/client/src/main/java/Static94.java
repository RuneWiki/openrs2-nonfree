import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	public static int anInt1704;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "Lclient!la;")
	public static final Class136 aClass136_45 = new Class136(58, 6);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)I")
	public static int method1597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)Z")
	public static boolean method1600(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}
}
