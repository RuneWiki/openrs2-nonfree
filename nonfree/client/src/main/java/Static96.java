import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
	public static int anInt1667;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_45 = new Class129(15, -2);

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "[I")
	public static final int[] anIntArray76 = new int[1];

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_42 = new Class220(1, 2, 2, 0);

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_46 = new Class129(31, 6);

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "Lclient!vg;")
	public static final Class252 aClass252_11 = new Class252(8);

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_22 = new Class194(78, -1);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIB)V")
	public static void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub2_Sub9 local12 = Static72.method1073(1, arg0);
		local12.method3026();
		local12.anInt3818 = arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1353(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class5_Sub15 local13 = new Class5_Sub15(arg0);
		@Pc(17) int local17 = local13.method5539();
		@Pc(23) int local23 = local13.method5603();
		if (local23 < 0 || Static81.anInt1472 != 0 && local23 > Static81.anInt1472) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(45) byte[] local45 = new byte[local23];
			local13.method5540(local23, local45);
			return local45;
		} else {
			@Pc(57) int local57 = local13.method5603();
			if (local57 < 0 || Static81.anInt1472 != 0 && Static81.anInt1472 < local57) {
				throw new RuntimeException();
			}
			@Pc(74) byte[] local74 = new byte[local57];
			if (local17 == 1) {
				Static389.method5085(local74, local57, arg0, local23);
			} else {
				Static123.aClass173_1.method3472(local74, local13);
			}
			return local74;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1355(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static244.anInt3939; local19++) {
			if (arg0.equalsIgnoreCase(Static225.aStringArray27[local19])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static220.aClass2_Sub1_Sub3_Sub2_1.aString65);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(BII)Z")
	public static boolean method1356(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static423.method5624(arg0, arg1) || Static452.method5943(arg0, arg1);
	}
}
