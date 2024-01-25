import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!hu;")
	public static Class114 aClass114_7;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "[Lclient!tp;")
	public static Class47_Sub1[] aClass47_Sub1Array6;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_251 = new Class12(94, 6);

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int anInt4881 = 0;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_80 = new Class96("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_103 = new Class254(45, 6);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!qa;Lclient!hh;Lclient!hh;I)V")
	public static void method3986(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class109 arg2) {
		Static396.aClass62_9 = Static224.method3273(arg2, Static151.anInt2730);
		Static209.aClass4_6 = arg0.method4612(Static396.aClass62_9, Static457.method1166(arg1, Static151.anInt2730));
		Static64.aClass62_3 = Static224.method3273(arg2, Static162.anInt2876);
		Static199.aClass4_4 = arg0.method4612(Static64.aClass62_3, Static457.method1166(arg1, Static162.anInt2876));
		Static126.aClass62_6 = Static224.method3273(arg2, Static275.anInt4643);
		Static237.aClass4_5 = arg0.method4612(Static126.aClass62_6, Static457.method1166(arg1, Static275.anInt4643));
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!tn;I)V")
	public static void method3987(@OriginalArg(0) Class229 arg0) {
		@Pc(12) Class229 local12 = Static409.method5548(arg0);
		@Pc(18) int local18;
		@Pc(16) int local16;
		if (local12 == null) {
			local16 = Static324.anInt5725;
			local18 = Static403.anInt7142;
		} else {
			local18 = local12.anInt6905;
			local16 = local12.anInt6895;
		}
		Static99.method1609(local16, false, local18, arg0);
		Static160.method5104(local18, arg0, local16);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	public static void method3988(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 6);
		local8.method28();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	public static void method3989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 1);
		local8.method32();
		local8.anInt35 = arg1;
	}
}
