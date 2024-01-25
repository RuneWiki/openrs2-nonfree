import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "[B")
	public static final byte[] aByteArray24 = new byte[2048];

	@OriginalMember(owner = "client!dm", name = "Zb", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIIIBI)Z")
	public static boolean method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static419.method6390(arg4, arg7, arg8)) {
			return false;
		}
		@Pc(15) int local15 = Static164.anIntArray260[0];
		@Pc(19) int local19 = Static164.anIntArray260[2];
		@Pc(23) int local23 = Static164.anIntArray260[1];
		if (!Static419.method6390(arg0, arg2, arg5)) {
			return false;
		}
		@Pc(35) int local35 = Static164.anIntArray260[1];
		@Pc(39) int local39 = Static164.anIntArray260[0];
		@Pc(43) int local43 = Static164.anIntArray260[2];
		if (Static419.method6390(arg1, arg6, arg3)) {
			@Pc(63) int local63 = Static164.anIntArray260[1];
			@Pc(67) int local67 = Static164.anIntArray260[2];
			@Pc(71) int local71 = Static164.anIntArray260[0];
			return Static259.method4237(local43, local63, local39, local35, local23, local19, local71, local15, local67);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void method1703() {
		for (@Pc(12) Class2_Sub29 local12 = (Class2_Sub29) Static581.aClass222_41.method5474(); local12 != null; local12 = (Class2_Sub29) Static581.aClass222_41.method5472()) {
			Static621.method8440(local12.anInt5430);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
	public static int method1704(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(22) boolean local22 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(41) char local41 = arg0.charAt(local36);
			if (local36 == 0) {
				if (local41 == '-') {
					local22 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local41 >= '0' && local41 <= '9') {
				local80 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local80 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local80 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local80) {
				throw new NumberFormatException();
			}
			if (local22) {
				local80 = -local80;
			}
			@Pc(106) int local106 = local80 + local31 * arg1;
			if (local31 != local106 / arg1) {
				throw new NumberFormatException();
			}
			local31 = local106;
			local29 = true;
		}
		if (!local29) {
			throw new NumberFormatException();
		}
		return local31;
	}
}
