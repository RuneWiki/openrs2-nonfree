import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_60 = new Class186(49, -1);

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_49 = new Class36(65, 8);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
	public static void method1548(@OriginalArg(0) int arg0) {
		if (Static312.anIntArray480 == null || arg0 > Static312.anIntArray480.length) {
			Static312.anIntArray480 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)V")
	public static void method1550(@OriginalArg(0) int arg0) {
		Static37.anInt842 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)Lclient!pi;")
	public static Class41_Sub5 method1551() {
		@Pc(8) Class41_Sub5 local8 = (Class41_Sub5) Static299.aClass27_6.method733();
		if (local8 == null) {
			return new Class41_Sub5();
		} else {
			Static239.anInt4390--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBLclient!jb;I)V")
	public static void method1553(@OriginalArg(0) int arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) int arg2) {
		Static107.aClass126_4 = arg1;
		Static220.anInt5566 = arg0;
		Static429.anInt7160 = arg2;
	}
}
