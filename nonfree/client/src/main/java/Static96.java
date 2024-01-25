import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Lclient!bn;")
	public static final Class25 aClass25_7 = new Class25(8);

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString82 = "slide:";

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt2230 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method2207(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static70.method1718(arg0.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
	public static boolean method2208() {
		return Static67.anInt1615 == 0 ? Static266.aBoolean339 : true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!e;Lclient!ne;I)V")
	public static void method2209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) Class146 arg3) {
		if (arg3.anInt4135 == 2) {
			for (@Pc(73) int local73 = arg0; local73 <= arg1; local73++) {
				@Pc(82) int local82 = arg3.anIntArray374[local73] - 1;
				if (local82 != -1) {
					@Pc(118) boolean local118;
					if (Static312.anInt6025 == 1 && Static228.anInt4500 == local73 && Static247.anInt4790 == arg3.anInt4214) {
						local118 = Static280.method5744(null, arg2, local82, arg3.anIntArray361[local73], 2, arg3.anInt4145, 0) == null;
						if (local118) {
							Static228.aClass18_26.method451(new Class14_Sub7(local82, arg3.anIntArray361[local73], 2, 0, arg3.anInt4145, false));
						}
					} else {
						local118 = Static280.method5744(null, arg2, local82, arg3.anIntArray361[local73], 1, arg3.anInt4145, -13623264) == null;
						if (local118) {
							Static228.aClass18_26.method451(new Class14_Sub7(local82, arg3.anIntArray361[local73], 1, -13623264, arg3.anInt4145, false));
						}
					}
				}
			}
		} else if (arg3.anInt4135 == 5) {
			@Pc(48) boolean local48 = Static280.method5744(arg3.aBoolean271 ? Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4 : null, arg2, arg3.anInt4124, arg3.anInt4206, arg3.anInt4210, arg3.anInt4145, arg3.anInt4203 | 0xFF000000) == null;
			if (local48) {
				Static228.aClass18_26.method451(new Class14_Sub7(arg3.anInt4124, arg3.anInt4206, arg3.anInt4210, arg3.anInt4203 | 0xFF000000, arg3.anInt4145, arg3.aBoolean271));
				return;
			}
		}
	}
}
