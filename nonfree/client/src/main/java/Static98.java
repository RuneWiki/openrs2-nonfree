import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
	public static int anInt1998 = 0;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I")
	public static int method1813() {
		return Static514.anInt8329;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!wp;IB)V")
	public static void method1814(@OriginalArg(0) int arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) int arg2) {
		if (Static283.aClass361_8 != null || Static150.aBoolean254 || (arg1 == null || Static17.method245(arg1) == null)) {
			return;
		}
		Static283.aClass361_8 = arg1;
		Static504.aClass361_14 = Static17.method245(arg1);
		Static202.aBoolean282 = false;
		Static308.anInt5179 = 0;
		Static380.anInt6521 = arg0;
		Static495.anInt8057 = arg2;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!tf;I[ILclient!tf;)V")
	public static void method1815(@OriginalArg(0) Class322 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class322 arg2) {
		Static119.aClass322_43 = arg2;
		Static258.aClass322_128 = arg0;
		if (arg1 != null) {
			Static213.anIntArray500 = arg1;
		}
	}
}
