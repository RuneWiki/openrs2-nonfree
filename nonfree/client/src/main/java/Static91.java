import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!co", name = "D", descriptor = "I")
	public static int anInt1531 = -1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)I")
	public static int method1248(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(69) char local69;
			if (local17 == '\u0000') {
				local69 = arg2.charAt(local13++);
			} else {
				local69 = local17;
			}
			@Pc(85) char local85;
			if (local19 == '\u0000') {
				local85 = arg1.charAt(local15++);
			} else {
				local85 = local19;
			}
			local17 = Static212.method3231(local69);
			local19 = Static212.method3231(local85);
			local69 = Static197.method2978(arg0, local69);
			local85 = Static197.method2978(arg0, local85);
			if (local85 != local69 && Character.toUpperCase(local69) != Character.toUpperCase(local85)) {
				local69 = Character.toLowerCase(local69);
				local85 = Character.toLowerCase(local85);
				if (local69 != local85) {
					return Static497.method7168(arg0, local69) - Static497.method7168(arg0, local85);
				}
			}
		}
		@Pc(154) int local154 = Math.min(local8, local11);
		for (@Pc(167) int local167 = 0; local167 < local154; local167++) {
			if (arg0 == 2) {
				local15 = local11 - local167 - 1;
				local13 = local8 - local167 - 1;
			} else {
				local15 = local167;
				local13 = local167;
			}
			@Pc(197) char local197 = arg2.charAt(local13);
			@Pc(201) char local201 = arg1.charAt(local15);
			if (local201 != local197 && Character.toUpperCase(local197) != Character.toUpperCase(local201)) {
				local197 = Character.toLowerCase(local197);
				local201 = Character.toLowerCase(local201);
				if (local197 != local201) {
					return Static497.method7168(arg0, local197) - Static497.method7168(arg0, local201);
				}
			}
		}
		@Pc(245) int local245 = local8 - local11;
		if (local245 != 0) {
			return local245;
		}
		for (@Pc(254) int local254 = 0; local254 < local154; local254++) {
			@Pc(262) char local262 = arg2.charAt(local254);
			@Pc(266) char local266 = arg1.charAt(local254);
			if (local266 != local262) {
				return Static497.method7168(arg0, local262) - Static497.method7168(arg0, local266);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILjava/lang/String;JJIIIZZILjava/lang/String;ZI)V")
	public static void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2, @OriginalArg(3) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		if (!Static555.aBoolean678 && Static285.anInt5168 < 500) {
			@Pc(22) int local22 = arg0 == -1 ? Static355.anInt6021 : arg0;
			@Pc(38) Class3_Sub4_Sub5 local38 = new Class3_Sub4_Sub5(arg1, arg9, local22, arg4, arg11, arg2, arg8, arg5, arg10, arg6, arg3, arg7);
			Static78.method1017(local38);
		}
	}
}
