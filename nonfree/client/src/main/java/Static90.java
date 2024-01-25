import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
	public static int anInt2011;

	@OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
	public static int anInt2016;

	@OriginalMember(owner = "client!fk", name = "K", descriptor = "Z")
	public static boolean aBoolean174 = true;

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "Ljava/lang/String;")
	public static final String aString68 = "wave:";

	@OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
	public static int anInt2015 = 0;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(III)I")
	public static int method1610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4_Sub41 local10 = (Class4_Sub41) Static301.aClass198_34.method5261((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray538.length) {
			return local10.anIntArray538[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(II)I")
	public static int method1611(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	public static void method1612() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static92.anInt2048; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static290.anInt5893; local17++) {
				if (Static284.method4847(true, local17, local11, Static18.aClass57ArrayArrayArray1, local13)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}
}
