import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
	public static void method4083(@OriginalArg(0) int arg0) {
		Static28.anInt853 = arg0;
		@Pc(11) Class211 local11 = Static419.aClass211_51;
		synchronized (Static419.aClass211_51) {
			Static419.aClass211_51.method5535();
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III[BI[BBII)V")
	public static void method4084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = -(arg1 >> 2);
		@Pc(19) int local19 = -(arg1 & 0x3);
		for (@Pc(22) int local22 = -arg6; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg2++;
				arg5[local30] += arg3[arg0++];
				@Pc(42) int local42 = arg2++;
				arg5[local42] += arg3[arg0++];
				@Pc(54) int local54 = arg2++;
				arg5[local54] += arg3[arg0++];
				@Pc(66) int local66 = arg2++;
				arg5[local66] += arg3[arg0++];
			}
			for (@Pc(84) int local84 = local19; local84 < 0; local84++) {
				local30 = arg2++;
				arg5[local30] += arg3[arg0++];
			}
			arg0 += arg7;
			arg2 += arg4;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZI)I")
	public static int method4085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = (arg1 * (arg0 & 0xFF00) & 0xFF0000 | arg1 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(31) int local31 = 255 - arg1;
		return (((arg2 & 0xFF00FF) * local31 & 0xFF00FF00 | local31 * (arg2 & 0xFF00) & 0xFF0000) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ICI)I")
	public static int method4086(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(25) char local25 = Character.toLowerCase(arg0);
			local16 = (local25 << 4) + 1;
		}
		return local16;
	}
}
