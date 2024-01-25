import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!vj;III)V")
	public static void method1896(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class182 local12;
		if (arg2 < Static10.anInt812) {
			local12 = Static571.aClass182ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass21_Sub1_Sub5_1 != null && local12.aClass21_Sub1_Sub5_1.method8225()) {
				arg0.method8230(local12.aClass21_Sub1_Sub5_1, Static168.anInt3487, true, Static299.aClass7_12, 0, 0);
			}
		}
		if (arg3 < Static10.anInt812) {
			local12 = Static571.aClass182ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass21_Sub1_Sub5_1 != null && local12.aClass21_Sub1_Sub5_1.method8225()) {
				arg0.method8230(local12.aClass21_Sub1_Sub5_1, 0, true, Static299.aClass7_12, 0, Static168.anInt3487);
			}
		}
		if (arg2 < Static10.anInt812 && arg3 < Static255.anInt5209) {
			local12 = Static571.aClass182ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass21_Sub1_Sub5_1 != null && local12.aClass21_Sub1_Sub5_1.method8225()) {
				arg0.method8230(local12.aClass21_Sub1_Sub5_1, Static168.anInt3487, true, Static299.aClass7_12, 0, Static168.anInt3487);
			}
		}
		if (arg2 < Static10.anInt812 && arg3 > 0) {
			local12 = Static571.aClass182ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass21_Sub1_Sub5_1 != null && local12.aClass21_Sub1_Sub5_1.method8225()) {
				arg0.method8230(local12.aClass21_Sub1_Sub5_1, Static168.anInt3487, true, Static299.aClass7_12, 0, -Static168.anInt3487);
			}
		}
	}
}
