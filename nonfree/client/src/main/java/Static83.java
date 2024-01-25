import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
	public static int anInt2550;

	@OriginalMember(owner = "client!ct", name = "D", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_21 = new Class99(8);

	@OriginalMember(owner = "client!ct", name = "E", descriptor = "I")
	public static int anInt2549 = 2;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!kda;II)V")
	public static void method2401(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray349 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anIntArray349[arg1 + 1];
		if (arg0.anInt6079 == local13) {
			return;
		}
		arg0.anInt6103 = arg0.anInt6102;
		arg0.anInt6079 = local13;
		arg0.anInt6046 = 1;
		arg0.anInt6037 = 0;
		arg0.anInt6086 = 0;
		arg0.anInt6063 = 0;
		if (arg0.anInt6079 != -1) {
			Static609.method8918(arg0, arg0.anInt6063, Static195.aClass193_1.method5573(arg0.anInt6079));
		}
	}
}
