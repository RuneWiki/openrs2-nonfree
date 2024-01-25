import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
	public static int anInt1860;

	@OriginalMember(owner = "client!dha", name = "e", descriptor = "I")
	public static int anInt1862;

	@OriginalMember(owner = "client!dha", name = "f", descriptor = "[I")
	public static int[] anIntArray168;

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
	public static int anInt1859 = 0;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIB)V")
	public static void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(arg2, 11);
		local8.method4393();
		local8.anInt5246 = arg1;
		local8.anInt5255 = arg0;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(II)V")
	public static void method1624(@OriginalArg(1) int arg0) {
		Static288.anInt5415 = arg0;
		Static606.anInt9911 = 2;
		if (Static473.aString74 == null) {
			Static163.method3036(35);
		} else {
			@Pc(20) Class2_Sub34 local20 = new Class2_Sub34(Static607.method8295(Static229.method3862(Static473.aString74)));
			@Pc(24) long local24 = local20.method6877();
			Static163.aLong100 = local20.method6877();
			Static490.method7019(true, Static400.method6053(local24), "");
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(III[IIIII)V")
	public static void method1625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg4 > 0 && !Static504.method7825(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static504.method7825(arg0)) {
			@Pc(35) int local35 = 0;
			@Pc(46) int local46 = arg0 > arg4 ? arg4 : arg0;
			@Pc(50) int local50 = arg4 >> 1;
			@Pc(54) int local54 = arg0 >> 1;
			@Pc(56) int[] local56 = arg2;
			@Pc(69) int[] local69 = new int[local54 * local50];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local35, arg5, arg4, arg0, 0, 32993, arg1, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg4;
				@Pc(96) int[] local96 = local69;
				for (@Pc(98) int local98 = 0; local98 < local54; local98++) {
					for (@Pc(101) int local101 = 0; local101 < local50; local101++) {
						@Pc(107) int local107 = local56[local90++];
						@Pc(112) int local112 = local56[local94++];
						@Pc(117) int local117 = local56[local90++];
						@Pc(122) int local122 = local56[local94++];
						@Pc(128) int local128 = local107 >> 16 & 0xFF;
						@Pc(132) int local132 = local107 & 0xFF;
						@Pc(138) int local138 = local107 >> 8 & 0xFF;
						@Pc(144) int local144 = local107 >> 24 & 0xFF;
						@Pc(152) int local152 = local144 + (local117 >> 24 & 0xFF);
						@Pc(160) int local160 = local128 + (local117 >> 16 & 0xFF);
						@Pc(168) int local168 = local138 + (local117 >> 8 & 0xFF);
						@Pc(174) int local174 = local132 + (local117 & 0xFF);
						@Pc(180) int local180 = local174 + (local112 & 0xFF);
						@Pc(188) int local188 = local168 + (local112 >> 8 & 0xFF);
						@Pc(196) int local196 = local152 + (local112 >> 24 & 0xFF);
						@Pc(204) int local204 = local160 + (local112 >> 16 & 0xFF);
						@Pc(212) int local212 = local188 + (local122 >> 8 & 0xFF);
						@Pc(218) int local218 = local180 + (local122 & 0xFF);
						@Pc(226) int local226 = local204 + (local122 >> 16 & 0xFF);
						@Pc(234) int local234 = local196 + (local122 >> 24 & 0xFF);
						local69[local88++] = (local212 & 0x3FC) << 6 | (local234 & 0x3FC) << 22 | (local226 & 0x3FC) << 14 | local218 >> 2 & 0xFF;
					}
					local90 += arg4;
					local94 += arg4;
				}
				local69 = local56;
				local56 = local96;
				arg0 = local54;
				arg4 = local50;
				local54 >>= 0x1;
				local50 >>= 0x1;
				local35++;
				local46 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I[[I)V")
	public static void method1626(@OriginalArg(1) int[][] arg0) {
		Static618.anIntArrayArray101 = arg0;
	}
}
