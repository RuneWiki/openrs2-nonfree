import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public static int anInt1618;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	public static int anInt1619;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
	public static int anInt1629;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public static void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) Class13_Sub3 local10 = new Class13_Sub3();
		local10.anInt2891 = arg1;
		local10.anInt2890 = arg5 + Static368.anInt6250;
		local10.anInt2885 = arg0;
		local10.aString26 = arg2;
		local10.anInt2888 = arg6;
		local10.anInt2887 = arg4;
		local10.anInt2883 = arg3;
		Static78.aClass227_4.method4832(local10);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[Lclient!f;)V")
	public static void method1318(@OriginalArg(1) Class49[] arg0) {
		Static83.anInt1984 = arg0.length;
		Static214.aClass49Array147 = new Class49[Static83.anInt1984 + 10];
		Static419.anIntArray454 = new int[Static83.anInt1984 + 10];
		Static459.method2114(arg0, 0, Static214.aClass49Array147, 0, Static83.anInt1984);
		for (@Pc(31) int local31 = 0; local31 < Static83.anInt1984; local31++) {
			Static419.anIntArray454[local31] = Static214.aClass49Array147[local31].JA();
		}
		for (@Pc(50) int local50 = Static83.anInt1984; local50 < Static214.aClass49Array147.length; local50++) {
			Static419.anIntArray454[local50] = 12;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!oq;IBB)V")
	public static void method1319(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub3_Sub3_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray370[0];
		@Pc(15) int local15 = arg1.anIntArray369[0];
		if (local10 < 0 || Static425.anInt6922 <= local10 || local15 < 0 || Static251.anInt4072 <= local15 || (arg2 < 0 || arg2 >= Static425.anInt6922 || arg0 < 0 || arg0 >= Static251.anInt4072)) {
			return;
		}
		@Pc(71) int local71 = Static358.method4643(-4, local10, arg2, 0, Static356.anIntArray349, local15, arg0, Static383.aClass247Array1[arg1.aByte89], Static224.anIntArray195, true, arg1.method4678(), 0, 0, 0);
		if (local71 >= 1 && local71 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local71 - 1; local85++) {
				arg1.method3878(Static356.anIntArray349[local85], Static224.anIntArray195[local85], (byte) 2);
			}
		}
	}
}
