import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2 aClass1_Sub2_Sub11_Sub2_1;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	public static int anInt1889;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!in;")
	public static Class71 aClass71_11 = null;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
	public static void method1470(@OriginalArg(0) boolean arg0) {
		Static146.method2567(Static148.anInt3206, arg0, Static3.anInt122, Static116.anInt5593);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBILclient!fj;ILclient!sc;Lclient!wj;)V")
	public static void method1471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class14_Sub2_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class14_Sub2_Sub2 arg5, @OriginalArg(7) Class181 arg6) {
		@Pc(5) Class1_Sub8 local5 = new Class1_Sub8();
		local5.anInt358 = arg1 * 128;
		local5.anInt359 = arg4 * 128;
		local5.anInt361 = arg0;
		if (arg6 != null) {
			local5.anInt350 = arg6.anInt5543;
			local5.aClass181_1 = arg6;
			local5.anInt353 = arg6.anInt5557;
			local5.anInt365 = arg6.anInt5563 * 128;
			local5.anInt364 = arg6.anInt5535;
			local5.anIntArray43 = arg6.anIntArray551;
			@Pc(168) int local168 = arg6.anInt5559;
			@Pc(171) int local171 = arg6.anInt5534;
			local5.anInt362 = arg6.anInt5546;
			if (arg2 == 1 || arg2 == 3) {
				local168 = arg6.anInt5534;
				local171 = arg6.anInt5559;
			}
			local5.anInt356 = (local168 + arg4) * 128;
			local5.anInt363 = (arg1 + local171) * 128;
			if (arg6.anIntArray552 != null) {
				local5.aBoolean29 = true;
				local5.method364();
			}
			if (local5.anIntArray43 != null) {
				local5.anInt349 = (int) (Math.random() * (double) (local5.anInt353 - local5.anInt350)) + local5.anInt350;
			}
			Static185.aClass61_20.method1839(local5);
		} else if (arg5 != null) {
			local5.aClass14_Sub2_Sub2_1 = arg5;
			@Pc(38) Class46 local38 = arg5.aClass46_1;
			if (local38.anIntArray148 != null) {
				local5.aBoolean29 = true;
				local38 = local38.method1283();
			}
			if (local38 != null) {
				local5.anInt356 = (arg4 + local38.anInt1532) * 128;
				local5.anInt363 = (arg1 + local38.anInt1532) * 128;
				local5.anInt364 = Static207.method3769(arg5);
				local5.anInt362 = local38.anInt1556;
				local5.anInt365 = local38.anInt1531 * 128;
			}
			Static264.aClass61_28.method1839(local5);
		} else if (arg3 != null) {
			local5.aClass14_Sub2_Sub1_1 = arg3;
			local5.anInt356 = (arg4 + arg3.method3656()) * 128;
			local5.anInt363 = (arg3.method3656() + arg1) * 128;
			local5.anInt364 = Static202.method3261(arg3);
			local5.anInt362 = arg3.anInt1737;
			local5.anInt365 = arg3.anInt1718 * 128;
			Static179.aClass70_12.method2084(Static93.method1658(arg3.aString99), local5);
		}
	}
}
