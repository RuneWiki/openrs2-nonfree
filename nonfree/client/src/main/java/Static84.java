import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "[I")
	public static int[] anIntArray568;

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_278 = new Class194(95, 3);

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "[Lclient!vo;")
	public static final Class359[] aClass359Array5 = new Class359[4];

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "Lclient!st;")
	public static final Class314 aClass314_133 = new Class314(71, 8);

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_61 = new Class136(4);

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_279 = new Class194(100, 7);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIII)V")
	public static void method7776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg3);
		@Pc(17) int local17 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg1);
		@Pc(23) int local23 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg4);
		@Pc(34) int local34 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg2);
		@Pc(42) int local42 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg0 + arg3);
		@Pc(50) int local50 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg1 - arg0);
		for (@Pc(52) int local52 = local11; local52 < local42; local52++) {
			Static82.method1400(arg5, local23, local34, Static71.anIntArrayArray5[local52]);
		}
		for (@Pc(70) int local70 = local17; local70 > local50; local70--) {
			Static82.method1400(arg5, local23, local34, Static71.anIntArrayArray5[local70]);
		}
		@Pc(96) int local96 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg4 + arg0);
		@Pc(105) int local105 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg2 - arg0);
		for (@Pc(107) int local107 = local42; local107 <= local50; local107++) {
			@Pc(113) int[] local113 = Static71.anIntArrayArray5[local107];
			Static82.method1400(arg5, local23, local96, local113);
			Static82.method1400(arg5, local105, local34, local113);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIZBII)V")
	public static void method7777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 ? Static32.aClass3_Sub41_3.aClass7_Sub15_3.method5663() : Static32.aClass3_Sub41_3.aClass7_Sub15_2.method5663()) != 0 && arg5 != 0 && Static154.anInt3152 < 50 && arg1 != -1) {
			Static110.aClass130Array1[Static154.anInt3152++] = new Class130((byte) (arg3 ? 3 : 2), arg1, arg5, arg4, arg0, 0, arg2, (Class9_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	public static void method7778() {
		if (Static41.anInt768 == 1 || Static41.anInt768 == 3 || Static259.anInt5048 != Static41.anInt768 && (Static41.anInt768 == 0 || Static259.anInt5048 == 0)) {
			Static596.anInt9702 = 0;
			Static73.anInt1445 = 0;
			Static545.aClass25_40.method433();
		}
		Static259.anInt5048 = Static41.anInt768;
	}
}
