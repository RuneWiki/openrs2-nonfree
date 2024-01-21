import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ld", name = "qc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_664 = Static8.method128("Aug");

	@OriginalMember(owner = "client!ld", name = "rc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_665 = Static8.method128("Jun");

	@OriginalMember(owner = "client!ld", name = "sc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_666 = Static8.method128("Oct");

	@OriginalMember(owner = "client!ld", name = "tc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_667 = Static8.method128("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ld", name = "uc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_668 = Static8.method128("May");

	@OriginalMember(owner = "client!ld", name = "vc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_669 = Static8.method128("Mar");

	@OriginalMember(owner = "client!ld", name = "wc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_670 = Static8.method128("Apr");

	@OriginalMember(owner = "client!ld", name = "xc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_671 = Static8.method128("Feb");

	@OriginalMember(owner = "client!ld", name = "zc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_672 = Static8.method128("Jan");

	@OriginalMember(owner = "client!ld", name = "Bc", descriptor = "I")
	public static int anInt2730 = 1;

	@OriginalMember(owner = "client!ld", name = "Cc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_673 = Static8.method128("Dec");

	@OriginalMember(owner = "client!ld", name = "Dc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_674 = Static8.method128("Nov");

	@OriginalMember(owner = "client!ld", name = "Ec", descriptor = "I")
	public static int anInt2731 = 0;

	@OriginalMember(owner = "client!ld", name = "Gc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_675 = Static8.method128("Sep");

	@OriginalMember(owner = "client!ld", name = "Hc", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!ld", name = "Jc", descriptor = "I")
	public static final int anInt2734 = 2301979;

	@OriginalMember(owner = "client!ld", name = "Lc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_676 = Static8.method128("Jul");

	@OriginalMember(owner = "client!ld", name = "Kc", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array14 = new Class18[] { aClass18_672, aClass18_671, aClass18_669, aClass18_670, aClass18_668, aClass18_665, aClass18_676, aClass18_664, aClass18_675, aClass18_666, aClass18_674, aClass18_673 };

	@OriginalMember(owner = "client!ld", name = "Mc", descriptor = "I")
	public static int anInt2735 = 0;

	@OriginalMember(owner = "client!ld", name = "Nc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_677 = Static8.method128("Texturen geladen)3");

	@OriginalMember(owner = "client!ld", name = "Pc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_678 = Static8.method128("Loaded input handler");

	@OriginalMember(owner = "client!ld", name = "Qc", descriptor = "I")
	public static int anInt2736 = 0;

	@OriginalMember(owner = "client!ld", name = "Sc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_679 = aClass18_678;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)I")
	public static int method1920() {
		@Pc(8) int local8 = 3;
		if (Static125.anInt3614 < 310) {
			@Pc(15) int local15 = Static45.anInt1552 >> 7;
			@Pc(19) int local19 = Static38.anInt1189 >> 7;
			@Pc(24) int local24 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 >> 7;
			@Pc(29) int local29 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 >> 7;
			if ((Static2.aByteArrayArrayArray1[Static9.anInt295][local15][local19] & 0x4) != 0) {
				local8 = Static9.anInt295;
			}
			@Pc(49) int local49;
			if (local24 <= local15) {
				local49 = local15 - local24;
			} else {
				local49 = local24 - local15;
			}
			@Pc(63) int local63;
			if (local19 >= local29) {
				local63 = local19 - local29;
			} else {
				local63 = local29 - local19;
			}
			@Pc(80) int local80;
			@Pc(74) int local74;
			if (local63 < local49) {
				local74 = 32768;
				local80 = local63 * 65536 / local49;
				while (local15 != local24) {
					if (local24 > local15) {
						local15++;
					} else if (local24 < local15) {
						local15--;
					}
					local74 += local80;
					if ((Static2.aByteArrayArrayArray1[Static9.anInt295][local15][local19] & 0x4) != 0) {
						local8 = Static9.anInt295;
					}
					if (local74 >= 65536) {
						local74 -= 65536;
						if (local19 < local29) {
							local19++;
						} else if (local29 < local19) {
							local19--;
						}
						if ((Static2.aByteArrayArrayArray1[Static9.anInt295][local15][local19] & 0x4) != 0) {
							local8 = Static9.anInt295;
						}
					}
				}
			} else {
				local74 = 32768;
				local80 = local49 * 65536 / local63;
				while (local19 != local29) {
					local74 += local80;
					if (local19 < local29) {
						local19++;
					} else if (local19 > local29) {
						local19--;
					}
					if ((Static2.aByteArrayArrayArray1[Static9.anInt295][local15][local19] & 0x4) != 0) {
						local8 = Static9.anInt295;
					}
					if (local74 >= 65536) {
						local74 -= 65536;
						if (local24 > local15) {
							local15++;
						} else if (local15 > local24) {
							local15--;
						}
						if ((Static2.aByteArrayArrayArray1[Static9.anInt295][local15][local19] & 0x4) != 0) {
							local8 = Static9.anInt295;
						}
					}
				}
			}
		}
		if ((Static2.aByteArrayArrayArray1[Static9.anInt295][Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 >> 7][Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 >> 7] & 0x4) != 0) {
			local8 = Static9.anInt295;
		}
		return local8;
	}

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "(I)V")
	public static void method1921() {
		aClass18_670 = null;
		aClass18_667 = null;
		aClass18_676 = null;
		aClass18_664 = null;
		aBooleanArray8 = null;
		aClass18_673 = null;
		aClass18_679 = null;
		aClass18_674 = null;
		aClass18_668 = null;
		aClass18_678 = null;
		aClass18_672 = null;
		aClass18_675 = null;
		aClass18_677 = null;
		aClass18_665 = null;
		aClass18_671 = null;
		aClass18_666 = null;
		aClass18Array14 = null;
		aClass18_669 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ea;ILclient!ea;B)V")
	public static void method1922(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2) {
		Static87.method1883(arg0, arg1, arg2, null);
	}
}
