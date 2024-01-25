import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Lclient!of;")
	public static final Class174 aClass174_59 = new Class174("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "Lclient!la;")
	public static final Class136 aClass136_49 = new Class136(109, 12);

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "[I")
	public static final int[] anIntArray84 = new int[14];

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Z")
	public static boolean method1673(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
	public static boolean method1674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
