import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "Lclient!r;")
	public static Class61 aClass61_738 = Static129.method2060("::noclip");

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "Lclient!r;")
	public static Class61 aClass61_739 = Static129.method2060("welle2:");

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "Lclient!r;")
	private static Class61 aClass61_740 = Static129.method2060("FULL");

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "Lclient!r;")
	private static Class61 aClass61_741 = Static129.method2060("shake:");

	@OriginalMember(owner = "client!pf", name = "ub", descriptor = "Lclient!r;")
	public static Class61 aClass61_746 = Static129.method2060("");

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "Lclient!r;")
	public static Class61 aClass61_742 = aClass61_746;

	@OriginalMember(owner = "client!pf", name = "db", descriptor = "Lclient!r;")
	public static Class61 aClass61_743 = Static129.method2060("headicons_pk");

	@OriginalMember(owner = "client!pf", name = "kb", descriptor = "Lclient!r;")
	public static Class61 aClass61_744 = Static129.method2060("sl_arrows");

	@OriginalMember(owner = "client!pf", name = "mb", descriptor = "I")
	public static int anInt2501 = 0;

	@OriginalMember(owner = "client!pf", name = "ob", descriptor = "I")
	public static int anInt2502 = 0;

	@OriginalMember(owner = "client!pf", name = "wb", descriptor = "Lclient!r;")
	public static Class61 aClass61_747 = aClass61_740;

	@OriginalMember(owner = "client!pf", name = "Eb", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!pf", name = "Gb", descriptor = "Lclient!r;")
	public static Class61 aClass61_748 = aClass61_741;

	@OriginalMember(owner = "client!pf", name = "Jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_749 = aClass61_741;

	@OriginalMember(owner = "client!pf", name = "Lb", descriptor = "Lclient!r;")
	public static Class61 aClass61_750 = Static129.method2060("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(B)V")
	public static void method1637() {
		aClass61_749 = null;
		aClass61_739 = null;
		aClass61_742 = null;
		aClass61_738 = null;
		aClass61_740 = null;
		aClass61_744 = null;
		aClass61_743 = null;
		aClass61_747 = null;
		aClass61_741 = null;
		aBooleanArray12 = null;
		aClass61_748 = null;
		aClass61_750 = null;
		aClass61_746 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB[BILclient!wa;[Lclient!sc;)V")
	public static void method1638(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class81 arg3, @OriginalArg(5) Class66[] arg4) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class5_Sub14 local12 = new Class5_Sub14(arg1);
		while (true) {
			@Pc(16) int local16 = local12.method1455();
			if (local16 == 0) {
				return;
			}
			local7 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local12.method1455();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local12.method1471();
				@Pc(57) int local57 = local53 >> 2;
				@Pc(62) int local62 = local43 + arg0;
				@Pc(66) int local66 = local49 + arg2;
				@Pc(70) int local70 = local53 & 0x3;
				@Pc(74) int local74 = local27 >> 12;
				if (local66 > 0 && local62 > 0 && local66 < 103 && local62 < 103) {
					@Pc(88) Class66 local88 = null;
					@Pc(90) int local90 = local74;
					if ((Static30.aByteArrayArrayArray2[1][local66][local62] & 0x2) == 2) {
						local90 = local74 - 1;
					}
					if (local90 >= 0) {
						local88 = arg4[local90];
					}
					Static24.method500(local62, arg3, local74, local88, local70, local7, local66, local57);
				}
			}
		}
	}
}
