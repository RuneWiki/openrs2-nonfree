import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
	public static int anInt1891;

	@OriginalMember(owner = "client!eg", name = "jb", descriptor = "I")
	public static int anInt1909;

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
	public static int anInt1893 = 0;

	@OriginalMember(owner = "client!eg", name = "T", descriptor = "Lclient!s;")
	public static final Class217 aClass217_42 = new Class217(77, 4);

	@OriginalMember(owner = "client!eg", name = "db", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_8 = new Class168(5, 5);

	@OriginalMember(owner = "client!eg", name = "hb", descriptor = "F")
	public static float aFloat40 = 0.25F;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLclient!ms;)V")
	public static void method1687(@OriginalArg(1) Class24_Sub3_Sub2 arg0) {
		if (arg0 instanceof Class24_Sub3_Sub2_Sub1) {
			@Pc(13) Class24_Sub3_Sub2_Sub1 local13 = (Class24_Sub3_Sub2_Sub1) arg0;
			if (local13.aClass222_1 != null) {
				Static311.method4314(Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 != local13.aByte98, local13);
				return;
			}
		} else if (arg0 instanceof Class24_Sub3_Sub2_Sub2) {
			@Pc(34) Class24_Sub3_Sub2_Sub2 local34 = (Class24_Sub3_Sub2_Sub2) arg0;
			Static281.method5147(Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 != local34.aByte98, local34);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(III)I")
	public static int method1689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(III)Z")
	public static boolean method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
	public static void method1691() {
		if (Static240.anInt4376 != 3) {
			Static87.aClass21_2 = Static390.aClass21_4;
		}
	}
}
