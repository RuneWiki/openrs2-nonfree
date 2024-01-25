import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
	public static int anInt2184;

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "J")
	public static long aLong62;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Lclient!bd;")
	public static Class18 aClass18_8 = new Class18();

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "Lclient!al;")
	public static final Class11 aClass11_50 = new Class11(260);

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString81 = "rating: ";

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "Lclient!rm;")
	public static final Class178 aClass178_5 = new Class178(64);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILjava/lang/String;Z)I")
	public static int method2166(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(82) int local82;
			if (local46 >= '0' && local46 <= '9') {
				local82 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local82 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local82 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local82) {
				throw new NumberFormatException();
			}
			if (local26) {
				local82 = -local82;
			}
			@Pc(120) int local120 = local82 + local35 * arg0;
			if (local120 / arg0 != local35) {
				throw new NumberFormatException();
			}
			local35 = local120;
			local33 = true;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
	public static void method2170() {
		for (@Pc(10) Class14_Sub6 local10 = (Class14_Sub6) aClass18_8.method459(); local10 != null; local10 = (Class14_Sub6) aClass18_8.method453()) {
			if (local10.anInt877 > 0) {
				local10.anInt877--;
			}
			if (local10.anInt877 != 0) {
				if (local10.anInt878 > 0) {
					local10.anInt878--;
				}
				if (local10.anInt878 == 0 && local10.anInt867 >= 1 && local10.anInt874 >= 1 && Static195.anInt3965 - 2 >= local10.anInt867 && local10.anInt874 <= Static298.anInt5716 - 2 && (local10.anInt873 < 0 || Static4.method124(local10.anInt873, local10.anInt870))) {
					Static99.method2224(local10.anInt869, local10.anInt874, local10.anInt870, -1, local10.anInt873, local10.anInt867, local10.anInt865, local10.anInt868);
					local10.anInt878 = -1;
					if (local10.anInt873 == local10.anInt876 && local10.anInt876 == -1) {
						local10.method5986();
					} else if (local10.anInt876 == local10.anInt873 && local10.anInt868 == local10.anInt866 && local10.anInt871 == local10.anInt870) {
						local10.method5986();
					}
				}
			} else if (local10.anInt876 < 0 || Static4.method124(local10.anInt876, local10.anInt871)) {
				Static99.method2224(local10.anInt869, local10.anInt874, local10.anInt871, -1, local10.anInt876, local10.anInt867, local10.anInt865, local10.anInt866);
				local10.method5986();
			}
		}
	}
}
