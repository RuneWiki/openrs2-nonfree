import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cv", name = "N", descriptor = "Lclient!fc;")
	public static Class98 aClass98_23;

	@OriginalMember(owner = "client!cv", name = "L", descriptor = "Lclient!rg;")
	public static final Class275 aClass275_4 = new Class275(2);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIZI)I")
	public static int method1179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static91.anInt1503 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(25) int local25 = Integer.MAX_VALUE;
		@Pc(30) int local30 = arg0 - Static490.anInt1918;
		@Pc(35) int local35 = arg1 - Static490.anInt1917;
		for (@Pc(40) Class6_Sub22 local40 = (Class6_Sub22) Static490.aClass298_38.method6809(); local40 != null; local40 = (Class6_Sub22) Static490.aClass298_38.method6821()) {
			if (local40.anInt4399 == arg2) {
				@Pc(49) int local49 = local40.anInt4395;
				@Pc(52) int local52 = local40.anInt4398;
				@Pc(63) int local63 = local49 + Static490.anInt1918 << 14 | Static490.anInt1917 + local52;
				@Pc(80) int local80 = (local30 - local49) * (local30 - local49) + (local35 - local52) * (local35 - local52);
				if (local14 < 0 || local25 > local80) {
					local14 = local63;
					local25 = local80;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIILclient!pj;)Lclient!ec;")
	public static Class6_Sub5_Sub2 method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class248 arg2) {
		@Pc(14) Class6_Sub12 local14 = new Class6_Sub12(arg2.method5797(arg0, arg1));
		@Pc(45) Class6_Sub5_Sub2 local45 = new Class6_Sub5_Sub2(arg1, local14.method6040(), local14.method6040(), local14.method6015(), local14.method6015(), local14.method6019() == 1, local14.method6019(), local14.method6019());
		@Pc(49) int local49 = local14.method6019();
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local45.aClass298_41.method6812(new Class6_Sub28(local14.method6019(), local14.method6044(), local14.method6044(), local14.method6044(), local14.method6044(), local14.method6044(), local14.method6044(), local14.method6044(), local14.method6044()));
		}
		local45.method1834();
		return local45;
	}
}
