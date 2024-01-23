import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "J")
	public static long aLong67;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
	public static int anInt2142;

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
	public static int anInt2134 = 0;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
	public static int anInt2135 = -1;

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "[I")
	public static int[] anIntArray252 = new int[100];

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
	public static void method1586() {
		for (@Pc(12) int local12 = 0; local12 < Static192.anInt4121; local12++) {
			@Pc(18) int local18 = Static180.anIntArray502[local12];
			@Pc(22) Class9_Sub4_Sub1 local22 = Static41.aClass9_Sub4_Sub1Array2[local18];
			@Pc(26) int local26 = Static16.aClass1_Sub9_Sub1_1.method895();
			if ((local26 & 0x2) != 0) {
				local26 += Static16.aClass1_Sub9_Sub1_1.method895() << 8;
			}
			Static141.method2419(local26, local22, local18);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ai;Lclient!ai;Lclient!ai;I)V")
	public static void method1588(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class7 arg2) {
		Static168.anInt3648 = arg1.method3222(Static45.aClass60_344);
		Static158.anInt3539 = arg2.method3222(Static50.aClass60_631);
		Static102.anInt2348 = arg2.method3222(Static32.aClass60_267);
		Static42.anInt904 = arg2.method3222(Static44.aClass60_332);
		Static87.anInt2031 = arg2.method3222(Static15.aClass60_128);
		Static88.anInt2051 = arg2.method3222(Static139.aClass60_1090);
		Static74.anInt1831 = arg2.method3222(Static175.aClass60_1287);
		Static55.anInt1477 = arg2.method3222(Static133.aClass60_995);
		Static218.anInt4729 = arg2.method3222(Static145.aClass60_634);
		Static92.anInt2174 = arg2.method3222(Static88.aClass60_670);
		Static92.anInt2176 = arg2.method3222(Static152.aClass60_1175);
		Static69.anInt1711 = arg0.method3222(Static144.aClass60_1128);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BILclient!sf;B)V")
	public static void method1589(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2) {
		@Pc(7) Class1_Sub24 local7 = new Class1_Sub24();
		local7.aLong150 = arg1;
		local7.aByteArray47 = arg0;
		local7.anInt3600 = 0;
		local7.aClass90_2 = arg2;
		@Pc(22) Class19 local22 = Static51.aClass19_8;
		synchronized (Static51.aClass19_8) {
			Static51.aClass19_8.method620(local7);
		}
		Static219.method3520();
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)[Lclient!r;")
	public static Class73[] method1590() {
		@Pc(4) Class73[] local4 = new Class73[Static180.anInt3836];
		for (@Pc(6) int local6 = 0; local6 < Static180.anInt3836; local6++) {
			local4[local6] = new Class73_Sub1(Static97.anInt2261, Static176.anInt777, anIntArray251[local6], Static97.anIntArray263[local6], Static181.anIntArray504[local6], Static10.anIntArray46[local6], Static96.aByteArrayArray4[local6], Static110.anIntArray317);
		}
		Static43.method711();
		return local4;
	}
}
