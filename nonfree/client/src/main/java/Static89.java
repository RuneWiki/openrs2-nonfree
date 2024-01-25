import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_55 = new Class131(62, -1);

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_25 = new Class237(3, 8);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public static void method1472(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub2_Sub11 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class136 local8 = Static328.aClass136Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static378.anInt6480; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static377.anInt6467; local15++) {
						local1 = local8.O(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static139.anInt2355;
							@Pc(32) int local32 = local12 << Static139.anInt2355;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class136 local41 = Static328.aClass136Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.I(local15, local12) - local41.I(local15, local12);
									@Pc(67) int local67 = local8.I(local15 + 1, local12) - local41.I(local15 + 1, local12);
									@Pc(85) int local85 = local8.I(local15 + 1, local12 + 1) - local41.I(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.I(local15, local12 + 1) - local41.I(local15, local12 + 1);
									local41.SA(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1473(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static193.anInt1026 >= 100 && !Static291.aBoolean333 || Static193.anInt1026 >= 200) {
			Static443.method5893(Static93.aClass84_25.method1678(Static167.anInt3118));
			return;
		}
		@Pc(29) String local29 = Static22.method3265(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static193.anInt1026; local34++) {
			@Pc(42) String local42 = Static22.method3265(Static397.aStringArray53[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static443.method5893(arg0 + Static249.aClass84_59.method1678(Static167.anInt3118));
				return;
			}
			if (Static282.aStringArray41[local34] != null) {
				local72 = Static22.method3265(Static282.aStringArray41[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static443.method5893(arg0 + Static249.aClass84_59.method1678(Static167.anInt3118));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static87.anInt1697; local102++) {
			local72 = Static22.method3265(Static32.aStringArray5[local102]);
			if (local72 != null && local72.equals(local29)) {
				Static443.method5893(Static165.aClass84_43.method1678(Static167.anInt3118) + arg0 + Static280.aClass84_65.method1678(Static167.anInt3118));
				return;
			}
			if (Static113.aStringArray47[local102] != null) {
				@Pc(145) String local145 = Static22.method3265(Static113.aStringArray47[local102]);
				if (local145 != null && local145.equals(local29)) {
					Static443.method5893(Static165.aClass84_43.method1678(Static167.anInt3118) + arg0 + Static280.aClass84_65.method1678(Static167.anInt3118));
					return;
				}
			}
		}
		if (Static22.method3265(Static196.aClass26_Sub2_Sub2_Sub1_1.aString51).equals(local29)) {
			Static443.method5893(Static16.aClass84_5.method1678(Static167.anInt3118));
		} else {
			Static55.method989(Static369.aClass131_160);
			Static232.aClass1_Sub1_Sub1_2.method4115(Static43.method4229(arg0));
			Static232.aClass1_Sub1_Sub1_2.method4104(arg0);
		}
	}
}
