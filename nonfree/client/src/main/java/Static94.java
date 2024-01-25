import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public static int anInt1936 = 0;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "Lclient!og;")
	public static final Class266 aClass266_5 = new Class266();

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBIIII)V")
	public static void method1606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static300.anInt5091 && Static629.anInt10412 >= arg3 && arg0 >= Static617.anInt6260 && Static229.anInt4089 >= arg4) {
			Static402.method5592(arg4, arg1, arg3, arg2, arg0);
		} else {
			Static259.method3883(arg2, arg0, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)V")
	public static void method1607(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub5_Sub20 local13 = Static447.method6065((long) arg0, 11);
		local13.method8834();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIBLclient!jca;)V")
	public static void method1608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class173 arg4) {
		if (arg1 < 1 || arg3 < 1 || arg1 > Static98.anInt361 - 2 || arg3 > Static438.anInt7120 - 2) {
			return;
		}
		if (Static254.aClass368ArrayArrayArray2 == null) {
			return;
		}
		@Pc(36) Interface17 local36 = Static326.aClass49_Sub1_1.method1217(arg1, arg3, arg2, arg0);
		if (local36 == null) {
			return;
		}
		if (local36 instanceof Class34_Sub1_Sub1_Sub4) {
			((Class34_Sub1_Sub1_Sub4) local36).method3559(arg4);
			return;
		}
		if (local36 instanceof Class34_Sub1_Sub2_Sub2) {
			((Class34_Sub1_Sub2_Sub2) local36).method4596(arg4);
		} else if (local36 instanceof Class34_Sub1_Sub5_Sub1) {
			((Class34_Sub1_Sub5_Sub1) local36).method3250(arg4);
			return;
		} else if (local36 instanceof Class34_Sub1_Sub3_Sub2) {
			((Class34_Sub1_Sub3_Sub2) local36).method6665(arg4);
			return;
		}
		return;
	}
}
