import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Lclient!ic;")
	public static Class113 aClass113_5;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array9;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "Lclient!f;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_11 = new Class151(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public static int anInt192 = 0;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "[I")
	public static final int[] anIntArray5 = new int[13];

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	public static int anInt194 = 0;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	public static int anInt195 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!me;)V")
	public static void method158(@OriginalArg(1) Class20_Sub3_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static368.anInt6250 == arg0.anInt6078 || arg0.anInt6051 == -1 || arg0.anInt6040 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class171 local29 = Static152.aClass213_1.method4410(arg0.anInt6051);
			if (local29.aBoolean334 || local29.anIntArray234[arg0.anInt6044] < arg0.anInt6039 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(53) int local53 = arg0.anInt6078 - arg0.anInt6062;
			@Pc(59) int local59 = Static368.anInt6250 - arg0.anInt6062;
			@Pc(70) int local70 = arg0.anInt6080 * 128 + arg0.method4678() * 64;
			@Pc(82) int local82 = arg0.anInt6034 * 128 + arg0.method4678() * 64;
			@Pc(93) int local93 = arg0.lb * 128 + arg0.method4678() * 64;
			@Pc(104) int local104 = arg0.anInt6009 * 128 + arg0.method4678() * 64;
			arg0.anInt6616 = (local82 * (local53 - local59) + local104 * local59) / local53;
			arg0.anInt6613 = (local70 * (local53 - local59) + local93 * local59) / local53;
		}
		arg0.anInt6086 = 0;
		if (arg0.anInt6084 == 0) {
			arg0.method4686(8192);
		}
		if (arg0.anInt6084 == 1) {
			arg0.method4686(12288);
		}
		if (arg0.anInt6084 == 2) {
			arg0.method4686(0);
		}
		if (arg0.anInt6084 == 3) {
			arg0.method4686(4096);
		}
	}
}
