import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_27 = new Class173(42, 0);

	@OriginalMember(owner = "client!dga", name = "i", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2077(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static572.aCharArray9[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local50.length() - 1;
					local68 = ' ';
					local50.setCharAt(local78, Character.toUpperCase(local50.charAt(local78)));
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!rda;BIII)V")
	public static void method2078(@OriginalArg(0) Class1_Sub4_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray463[0];
		@Pc(15) int local15 = arg0.anIntArray462[0];
		if (local10 < 0 || local10 >= Static428.anInt8046 || local15 < 0 || Static119.anInt2717 <= local15 || (arg1 < 0 || arg1 >= Static428.anInt8046 || arg2 < 0 || Static119.anInt2717 <= arg2)) {
			return;
		}
		@Pc(83) int local83 = Static397.method6278(true, arg1, arg2, arg0.method6925(), Static86.aClass111Array1[arg0.aByte126], Static450.anIntArray464, local15, 0, Static572.anIntArray534, local10, 0, -4, 0, 0);
		if (local83 >= 1 && local83 <= 3) {
			for (@Pc(95) int local95 = 0; local95 < local83 - 1; local95++) {
				arg0.method6940(Static572.anIntArray534[local95], (byte) 2, Static450.anIntArray464[local95]);
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)Lclient!wa;")
	public static Class346 method2079() {
		try {
			return (Class346) Class.forName("Class346_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!un;B)Lclient!kda;")
	public static Class186 method2081(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(12) int local12 = arg0.method4936();
		return new Class186(local12);
	}
}
