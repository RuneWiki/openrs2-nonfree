import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static94 {

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public static int anInt2359;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public static int anInt2360;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4 aClass2_Sub4_Sub3_Sub4_4;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
	public static void method1638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static58.anInt1512 == 0 || arg0 == 0 || Static145.anInt3283 >= 50) {
			return;
		}
		Static44.anIntArray103[Static145.anInt3283] = arg2;
		Static21.anIntArray51[Static145.anInt3283] = arg0;
		Static10.anIntArray38[Static145.anInt3283] = arg1;
		Static115.aClass38Array1[Static145.anInt3283] = null;
		Static124.anIntArray269[Static145.anInt3283] = 0;
		Static145.anInt3283++;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
	public static void method1639() {
		aClass2_Sub4_Sub3_Sub4_4 = null;
	}
}
