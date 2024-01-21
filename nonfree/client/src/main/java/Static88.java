import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public static int anInt2498;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Z")
	public static boolean aBoolean115;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "I")
	public static int anInt2503;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1039 = Static63.method1251(":: (X");

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1041 = Static63.method1251("Public chat");

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1040 = aClass45_1041;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "I")
	public static int anInt2499 = 0;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "[I")
	public static int[] anIntArray365 = new int[128];

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	public static int anInt2502 = 0;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1042 = Static63.method1251("titlebutton");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method1687() {
		aClass45_1039 = null;
		aByteArrayArrayArray6 = null;
		anIntArray365 = null;
		aClass45_1042 = null;
		aClass45_1040 = null;
		aClass45_1041 = null;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method1688() {
		Static12.aClass11_136.method2152();
		Static28.anIntArray148 = Static86.method1661(Static28.anIntArray148);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZIZI)Lclient!mb;")
	public static Class45 method1689(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(15) int local15 = 1;
		@Pc(19) int local19 = arg1 / 10;
		while (local19 != 0) {
			local19 /= 10;
			local15++;
		}
		@Pc(29) int local29 = local15;
		if (arg1 < 0 || arg0) {
			local29 = local15 + 1;
		}
		@Pc(40) byte[] local40 = new byte[local29];
		if (arg1 < 0) {
			local40[0] = 45;
		} else if (arg0) {
			local40[0] = 43;
		}
		for (@Pc(55) int local55 = 0; local55 < local15; local55++) {
			@Pc(64) int local64 = arg1 % 10;
			arg1 /= 10;
			if (local64 < 0) {
				local64 = -local64;
			}
			if (local64 > 9) {
				local64 += 39;
			}
			local40[local29 - local55 - 1] = (byte) (local64 + 48);
		}
		@Pc(102) Class45 local102 = new Class45();
		local102.anInt1925 = local29;
		local102.aByteArray27 = local40;
		return local102;
	}
}
