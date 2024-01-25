import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "Lclient!pd;")
	public static final Class180 aClass180_1 = new Class180();

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
	public static boolean aBoolean153 = true;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public static int anInt1793 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[Lclient!je;)V")
	public static void method1455(@OriginalArg(1) int arg0, @OriginalArg(2) Class117[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) Class117 local20 = arg1[local14];
			if (local20 != null && arg0 == local20.anInt3066 && !Static50.method804(local20)) {
				if (local20.anInt3108 == 0) {
					method1455(local20.anInt3093, arg1);
					if (local20.aClass117Array1 != null) {
						method1455(local20.anInt3093, local20.aClass117Array1);
					}
					@Pc(58) Class1_Sub38 local58 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local20.anInt3093);
					if (local58 != null) {
						Static173.method2547(local58.anInt5050);
					}
				}
				if (local20.anInt3108 == 6 && local20.anInt3088 != -1) {
					@Pc(82) Class185 local82 = Static25.aClass67_1.method1227(local20.anInt3088);
					if (local82 != null) {
						local20.anInt3044 += Static109.anInt1911;
						while (local20.anInt3044 > local82.anIntArray582[local20.anInt3059]) {
							local20.anInt3044 -= local82.anIntArray582[local20.anInt3059];
							local20.anInt3059++;
							if (local20.anInt3059 >= local82.anIntArray579.length) {
								local20.anInt3059 -= local82.anInt4801;
								if (local20.anInt3059 < 0 || local20.anInt3059 >= local82.anIntArray579.length) {
									local20.anInt3059 = 0;
								}
							}
							local20.anInt3057 = local20.anInt3059 + 1;
							if (local20.anInt3057 >= local82.anIntArray579.length) {
								local20.anInt3057 -= local82.anInt4801;
								if (local20.anInt3057 < 0 || local82.anIntArray579.length <= local20.anInt3057) {
									local20.anInt3057 = -1;
								}
							}
							Static312.method4635(local20);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
	public static Object method1457(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static196.aBoolean344) {
			try {
				@Pc(18) Class71 local18 = (Class71) Class.forName("Class71_Sub1").getDeclaredConstructor().newInstance();
				local18.method1328(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static196.aBoolean344 = true;
			}
		}
		return arg0;
	}
}
