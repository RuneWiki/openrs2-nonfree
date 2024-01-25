import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
	public static int anInt2010;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "[I")
	public static final int[] anIntArray126 = new int[32];

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	public static int anInt1997 = 0;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I")
	public static int method1518(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZB)V")
	public static void method1521(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static404.anInt6892 != -1) {
				Static327.method4455(Static404.anInt6892);
			}
			for (@Pc(19) Class4_Sub4 local19 = (Class4_Sub4) Static391.aClass196_37.method4482(); local19 != null; local19 = (Class4_Sub4) Static391.aClass196_37.method4472()) {
				if (!local19.method5857()) {
					local19 = (Class4_Sub4) Static391.aClass196_37.method4482();
					if (local19 == null) {
						break;
					}
				}
				Static219.method3100(false, local19, true);
			}
			Static404.anInt6892 = -1;
			Static391.aClass196_37 = new Class196(8);
			Static140.method2008();
			Static404.anInt6892 = Static17.anInt532;
			Static21.method451(false);
			Static262.method3574();
			Static172.method2505(Static404.anInt6892);
		}
		Static29.method541();
		Static52.anInt1389 = -1;
		Static239.method3308(Static105.anInt2235);
		Static375.aClass6_Sub2_Sub1_Sub1_3 = new Class6_Sub2_Sub1_Sub1();
		Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 = Static126.anInt2569 * 128 / 2;
		Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 = Static190.anInt3697 * 128 / 2;
		Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray536[0] = Static126.anInt2569 / 2;
		Static30.anInt696 = 0;
		Static254.anInt4614 = 0;
		Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray537[0] = Static190.anInt3697 / 2;
		if (Static134.anInt2621 == 2) {
			Static254.anInt4614 = Static251.anInt4557 << 7;
			Static30.anInt696 = Static253.anInt4570 << 7;
		} else {
			Static393.method5277();
		}
		Static429.method5520();
		if (Static254.anInt4614 == 0 || Static30.anInt696 == 0) {
			Static321.method4406(10);
		} else {
			Static324.method5214();
			Static321.method4406(28);
		}
	}
}
