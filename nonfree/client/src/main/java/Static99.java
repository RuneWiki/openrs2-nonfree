import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
	public static int anInt1826;

	@OriginalMember(owner = "client!gm", name = "U", descriptor = "Lclient!ie;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
	public static int anInt1825 = 20;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BB)V")
	public static void method1578(@OriginalArg(0) byte arg0) {
		if (Static126.aByteArrayArrayArray15 == null) {
			Static126.aByteArrayArrayArray15 = new byte[4][104][104];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
				for (@Pc(31) int local31 = 0; local31 < 104; local31++) {
					Static126.aByteArrayArrayArray15[local19][local24][local31] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(III)I")
	public static int method1580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(34) int local34 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local34;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(III)V")
	public static void method1584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub4_Sub7 local17 = Static34.method528(arg0, 13);
		local17.method971();
		local17.anInt1132 = arg1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method1587(@OriginalArg(2) String arg0) {
		return Static45.method682(arg0, 16);
	}
}
