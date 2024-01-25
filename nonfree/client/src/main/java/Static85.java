import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "[Lclient!jr;")
	public static Class128[] aClass128Array1;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
	public static int anInt1840 = -1;

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_44 = new Class7("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "[I")
	public static final int[] anIntArray149 = new int[13];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Z")
	public static boolean method1601(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZIII)I")
	public static int method1602(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub14 local8 = Static48.method871(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < local8.anIntArray145.length; local27++) {
				if (local8.anIntArray146[local27] == arg1) {
					local25 += local8.anIntArray145[local27];
				}
			}
			return local25;
		}
	}
}
