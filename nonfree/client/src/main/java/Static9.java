import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)Z")
	public static boolean method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != 1) {
			method108(-13, -59, -81, -31);
		}
		return (arg2 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)Z")
	public static boolean method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 108) {
			method107(50, 70, -92);
		}
		if (!Static570.aBoolean734 || !Static119.aBoolean171) {
			return false;
		} else if (Static224.anInt3656 < 100) {
			return false;
		} else {
			@Pc(38) int local38 = Static422.anIntArrayArrayArray17[arg1][arg3][arg0];
			if (-Static674.anInt10789 == local38) {
				return false;
			} else if (local38 == Static674.anInt10789) {
				return true;
			} else if (Static134.aClass22Array1 == Static242.aClass22Array3) {
				return false;
			} else {
				@Pc(69) int local69 = arg3 << Static611.anInt10115;
				@Pc(73) int local73 = arg0 << Static611.anInt10115;
				if (Static33.method558(local73 + Static88.anInt7739 - 1, local73 - -1, Static242.aClass22Array3[arg1].method8038(arg0 + 1, arg3 + 1), Static88.anInt7739 + local69 - 1, local69 + 1, local69 + 1, Static242.aClass22Array3[arg1].method8038(arg0, arg3), Static242.aClass22Array3[arg1].method8038(arg0 + 1, arg3), Static88.anInt7739 + local73 - 1) && Static33.method558(Static88.anInt7739 + local73 - 1, local73 + 1, Static242.aClass22Array3[arg1].method8038(arg0, arg3 + 1), local69 + Static88.anInt7739 - 1, local69 - -Static88.anInt7739 + -1, local69 + 1, Static242.aClass22Array3[arg1].method8038(arg0, arg3), Static242.aClass22Array3[arg1].method8038(arg0 + 1, arg3 + 1), local73 + 1)) {
					Static331.anInt5924++;
					Static422.anIntArrayArrayArray17[arg1][arg3][arg0] = Static674.anInt10789;
					return true;
				} else {
					Static422.anIntArrayArrayArray17[arg1][arg3][arg0] = -Static674.anInt10789;
					return false;
				}
			}
		}
	}
}
