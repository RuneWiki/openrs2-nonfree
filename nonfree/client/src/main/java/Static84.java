import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
	public static final int[] anIntArray501 = new int[1000];

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1649 = Static120.method1824("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1650 = Static120.method1824("sl_flags");

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1651 = Static120.method1824(":duelstake:");

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1652 = Static120.method1824("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1653 = Static120.method1824("::autoshadow on");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!rd;Lclient!bc;Lclient!rd;Lclient!bc;)Lclient!qc;")
	public static Class3_Sub1_Sub4_Sub3_Sub1 method3020(@OriginalArg(1) Class80 arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) Class80 arg2, @OriginalArg(4) Class1 arg3) {
		@Pc(16) int local16 = arg3.method53(arg0);
		@Pc(22) int local22 = arg3.method33(arg2, local16);
		return Static149.method2390(local16, arg3, local22, arg1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Lclient!ed;")
	public static Class3_Sub1_Sub7 method3022(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub7 local6 = (Class3_Sub1_Sub7) Static125.aClass5_37.method139((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static42.aClass1_8.method60(Static172.method2767(arg0), Static106.method1573(arg0));
		local6 = new Class3_Sub1_Sub7();
		local6.anInt910 = arg0;
		if (local29 != null) {
			local6.method621(new Class3_Sub17(local29));
		}
		local6.method624();
		Static125.aClass5_37.method145(local6, (long) arg0);
		return local6;
	}
}
