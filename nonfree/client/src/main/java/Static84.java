import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!l", name = "bb", descriptor = "Lclient!dd;")
	public static Class16 aClass16_10;

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_615 = Static8.method128("To create a new account you need to");

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_611 = aClass18_615;

	@OriginalMember(owner = "client!l", name = "ab", descriptor = "Lclient!ea;")
	public static Class18 aClass18_612 = Static8.method128("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!l", name = "eb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_613 = Static8.method128("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!l", name = "fb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_614 = Static8.method128("sch-Utteln:");

	@OriginalMember(owner = "client!l", name = "hb", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array13 = new Class18[500];

	@OriginalMember(owner = "client!l", name = "mb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_616 = Static8.method128("l");

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Z)V")
	public static void method1824() {
		@Pc(5) Class10 local5 = Static136.aClass10_1;
		synchronized (Static136.aClass10_1) {
			Static127.anInt3639 = Static146.anInt4045;
			Static154.anInt4252 = Static94.anInt2915;
			Static9.anInt293 = Static129.anInt3683;
			Static145.anInt4043 = Static148.anInt4093;
			Static74.anInt2247 = Static108.anInt3184;
			Static91.anInt2764 = Static2.anInt103;
			Static179.aLong138 = Static175.aLong135;
			Static148.anInt4093 = 0;
		}
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V")
	public static void method1825() {
		aClass18_612 = null;
		aClass18_614 = null;
		aClass18Array13 = null;
		aClass18_611 = null;
		aClass18_616 = null;
		aClass18_615 = null;
		aClass16_10 = null;
		aClass18_613 = null;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(II)Lclient!ef;")
	public static Class20 method1826(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		if (Static148.aClass20ArrayArray1[local3] == null || Static148.aClass20ArrayArray1[local3][local7] == null) {
			@Pc(31) boolean local31 = Static48.method1038(local3);
			if (!local31) {
				return null;
			}
		}
		return Static148.aClass20ArrayArray1[local3][local7];
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "(I)I")
	public static int method1827() {
		return Static108.anInt3192++;
	}
}
