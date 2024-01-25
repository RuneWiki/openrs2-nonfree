import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_21 = new Class208(20, 3);

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_6 = new Class163(2, 7);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I")
	public static int method1396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static182.aByteArrayArray11 == null ? 0 : Static182.aByteArrayArray11[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZB)Lclient!go;")
	public static Class2_Sub12 method1397(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) long local17 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class2_Sub12) Static261.aClass220_23.method5099(local17);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V")
	public static void method1399(@OriginalArg(0) boolean arg0) {
		Static430.method5866(arg0, Static103.anInt5365, Static344.anInt6105, Static49.anInt789);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
	public static void method1400() {
		if (Static307.anInt5537 != 3) {
			Static163.aClass263_3 = Static44.aClass263_2;
		}
	}
}
