import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dea", name = "M", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_42 = new Class298(62, 4);

	@OriginalMember(owner = "client!dea", name = "P", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_57 = new Class272(114, 9);

	@OriginalMember(owner = "client!dea", name = "Q", descriptor = "Lclient!lk;")
	public static Class203 aClass203_34 = null;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!qu;Z)Z")
	public static boolean method1966(@OriginalArg(0) Interface22 arg0) {
		@Pc(10) Class23 local10 = Static476.aClass69_5.method2181(arg0.method7088());
		if (local10.anInt735 == -1) {
			return true;
		} else {
			@Pc(29) Class113 local29 = Static453.aClass348_3.method7407(local10.anInt735);
			return local29.anInt3295 == -1 ? true : local29.method2920();
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!di;")
	public static RuntimeException_Sub1 method1967(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString32 = local9.aString32 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(II)Z")
	public static boolean method1968(@OriginalArg(0) int arg0) {
		if (Static457.aBooleanArray29[arg0]) {
			return true;
		} else if (Static552.aClass246_253.method5658(arg0)) {
			@Pc(23) int local23 = Static552.aClass246_253.method5673(arg0);
			if (local23 == 0) {
				Static457.aBooleanArray29[arg0] = true;
				return true;
			}
			if (Static59.aClass203ArrayArray3[arg0] == null) {
				Static59.aClass203ArrayArray3[arg0] = new Class203[local23];
			}
			for (@Pc(52) int local52 = 0; local52 < local23; local52++) {
				if (Static59.aClass203ArrayArray3[arg0][local52] == null) {
					@Pc(66) byte[] local66 = Static552.aClass246_253.method5653(arg0, local52);
					if (local66 != null) {
						@Pc(78) Class203 local78 = Static59.aClass203ArrayArray3[arg0][local52] = new Class203();
						local78.anInt5531 = local52 + (arg0 << 16);
						if (local66[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local78.method4774(new Class3_Sub11(local66));
					}
				}
			}
			Static457.aBooleanArray29[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
